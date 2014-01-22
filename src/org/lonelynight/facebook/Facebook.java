package org.spf.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieSyncManager;

public class Facebook {
    final public static String CANCEL_URI = "fbconnect://cancel";
    final private static int DEFAULT_AUTH_ACTIVITY_CODE = 32665;
    protected static String DIALOG_BASE_URL;
    final public static String EXPIRES = "expires_in";
    final public static String FB_APP_SIGNATURE = "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2";
    final public static int FORCE_DIALOG_AUTH = -1;
    protected static String GRAPH_BASE_URL;
    final private static String LOGIN = "oauth";
    final public static String REDIRECT_URI = "fbconnect://success";
    protected static String RESTSERVER_URL;
    final public static String SINGLE_SIGN_ON_DISABLED = "service_disabled";
    final public static String TOKEN = "access_token";
    private long mAccessExpires;
    private String mAccessToken;
    private String mAppId;
    private Activity mAuthActivity;
    private int mAuthActivityCode;
    private Facebook.DialogListener mAuthDialogListener;
    private String[] mAuthPermissions;
    
    static
    {
        DIALOG_BASE_URL = "https://m.facebook.com/dialog/";
        GRAPH_BASE_URL = "https://graph.facebook.com/";
        RESTSERVER_URL = "https://api.facebook.com/restserver.php";
    }
    
    public Facebook(String s)
    {
        super();
        this.mAccessToken = null;
        this.mAccessExpires = 0L;
        if(s == null)
        {
            IllegalArgumentException a = new IllegalArgumentException("You must specify your application ID when instantiating a Facebook object. See README for details.");
            throw a;
        }
        this.mAppId = s;
    }
    
    private void startDialogAuth(Activity a, String[] a0)
    {
        Bundle a1 = new Bundle();
        int i = a0.length;
        if(i > 0)
        {
            String s = TextUtils.join((CharSequence)",", (Object[])a0);
            a1.putString("scope", s);
        }
        CookieSyncManager.createInstance((Context)a);
        this.dialog((Context)a, "oauth", a1, (Facebook.DialogListener) new Facebook.DialogListener() {
            
            public void onCancel()
            {
                Log.d("Facebook-authorize", "Login canceled");
                mAuthDialogListener.onCancel();
            }
            
            public void onComplete(android.os.Bundle a)
            {
                CookieSyncManager a0 = CookieSyncManager.getInstance();
                a0.sync();
                String s = a.getString("access_token");
                setAccessToken(s);
                String s0 = a.getString("expires_in");
                setAccessExpiresIn(s0);

                if(!isSessionValid())
                {
                    mAuthDialogListener.onFacebookError(new FacebookError("Failed to receive access token."));
                }
                else
                {
                    StringBuilder a7 = new StringBuilder("Login Success! access_token=");

                    String s1 = getAccessToken();
                    StringBuilder a9 = a7.append(s1);
                    StringBuilder a10 = a9.append(" expires=");
                    
                    long j = getAccessExpires();
                    StringBuilder a12 = a10.append(j);

                    Log.d("Facebook-authorize", a12.toString());

                    mAuthDialogListener.onComplete(a);
                }
            }
            
            public void onError(DialogError a)
            {
                StringBuilder a0 = new StringBuilder("Login failed: ");
                StringBuilder a1 = a0.append((Object)a);
                Log.d("Facebook-authorize", a1.toString());
                mAuthDialogListener.onError(a);
            }
            
            public void onFacebookError(FacebookError a)
            {
                StringBuilder a0 = new StringBuilder("Login failed: ");
                StringBuilder a1 = a0.append((Object)a);
                Log.d("Facebook-authorize", a1.toString());
                mAuthDialogListener.onFacebookError(a);
            }
        });
    }
    
    private boolean startSingleSignOn(Activity a, String s, String[] a0, int i)
    {
        int i0 = 0;
        Intent a1 = new Intent();
        a1.setClassName("com.facebook.katana", "com.facebook.katana.ProxyAuth");
        a1.putExtra("client_id", s);
        if(a0.length > 0)
        {
            String s0 = TextUtils.join((CharSequence)",", (Object[])a0);
            a1.putExtra("scope", s0);
        }
        
        if(this.validateAppSignatureForIntent(a, a1))
        {
            int i2 = 0;
            this.mAuthActivity = a;
            this.mAuthPermissions = a0;
            this.mAuthActivityCode = i;
            try
            {
                a.startActivityForResult(a1, i);
                i2 = 1;
            }
            catch(ActivityNotFoundException ignoredException)
            {
                i2 = 0;
            }
            i0 = i2;
        }
        else
        {
            i0 = 0;
        }
        return i0 != 0;
    }
    
    private boolean validateAppSignatureForIntent(Activity a, Intent a0)
    {
    	PackageManager a1 = a.getPackageManager();
        ResolveInfo a2 = a1.resolveActivity(a0, 0);
        
        if(a2 == null)
        {
            return false;
        }
        
        PackageInfo a3 = null;
        
        try
        {
            String s = a2.activityInfo.packageName;
        	android.content.pm.PackageManager a5 = a.getPackageManager();
            a3 = a5.getPackageInfo(s, 64);
            
            Signature[] a6 = a3.signatures;
            
            for(int i = 0; i < a6.length; i++)
            {
            	Signature a7 = a6[i];
                String s0 = a7.toCharsString();
                
                if(s0.equals("30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2"))
                	return true;
            }
        }
        catch(PackageManager.NameNotFoundException ignoredException)
        {
        	
        }
       
        return false;
    }
    
    public void authorize(Activity a, Facebook.DialogListener a0)
    {
        String[] a1 = new String[0];
        this.authorize(a, a1, 32665, a0);
    }
    
    public void authorize(Activity a, String[] a0, int i, Facebook.DialogListener a1)
    {
        boolean b = false;
        this.mAuthDialogListener = a1;
        if(i < 0)
        {
            b = true;
        }
        else
        {
            String s = this.mAppId;
            boolean b0 = this.startSingleSignOn(a, s, a0, i);
            b = b0;
        }
        if(!b)
        {
            this.startDialogAuth(a, a0);
        }
    }
    
    public void authorize(Activity a, String[] a0, Facebook.DialogListener a1)
    {
        this.authorize(a, a0, 32665, a1);
    }
    
    public void authorizeCallback(int i, int i0, android.content.Intent a)
    {
        label6: {
            String s = null;
            int i1 = this.mAuthActivityCode;
            label5: {
                label3: {
                    label2: {
                        label0: {
                            if(i != i1)
                            {
                                break label0;
                            }
                            label1: {
                                if(i0 == -1)
                                {
                                    break label1;
                                }
                                if(i0 != 0)
                                {
                                    break label0;
                                }
                                else
                                {
                                    break label2;
                                }
                            }
                            String s0 = a.getStringExtra("error");
                            if(s0 != null)
                            {
                                s = s0;
                            }
                            else
                            {
                                String s1 = a.getStringExtra("error_type");
                                s = s1;
                            }
                            if(s == null)
                            {
                                break label3;
                            }
                            boolean b = s.equals((Object)"service_disabled");
                            label4: {
                                if(b)
                                {
                                    break label4;
                                }
                                boolean b0 = s.equals((Object)"AndroidAuthKillSwitchException");
                                if(!b0)
                                {
                                    break label5;
                                }
                            }
                            Log.d("Facebook-authorize", "Hosted auth currently disabled. Retrying dialog auth...");
                            Activity a0 = this.mAuthActivity;
                            String[] a1 = this.mAuthPermissions;
                            this.startDialogAuth(a0, a1);
                        }
                        break label6;
                    }
                    if(a == null)
                    {
                        Log.d("Facebook-authorize", "Login canceled by user.");
                        Object a2 = this.mAuthDialogListener;
                        ((Facebook.DialogListener)a2).onCancel();
                        break label6;
                    }
                    else
                    {
                        StringBuilder a3 = new StringBuilder("Login failed: ");
                        String s2 = a.getStringExtra("error");
                        StringBuilder a4 = a3.append(s2);
                        String s3 = a4.toString();
                        Log.d("Facebook-authorize", s3);
                        Object a5 = this.mAuthDialogListener;
                        String s4 = a.getStringExtra("error");
                        int i2 = a.getIntExtra("error_code", -1);
                        String s5 = a.getStringExtra("failing_url");
                        DialogError a6 = new DialogError(s4, i2, s5);
                        ((Facebook.DialogListener)a5).onError(a6);
                        break label6;
                    }
                }
                String s6 = a.getStringExtra("access_token");
                this.setAccessToken(s6);
                String s7 = a.getStringExtra("expires_in");
                this.setAccessExpiresIn(s7);
                boolean b1 = this.isSessionValid();
                if(!b1)
                {
                    Object a7 = this.mAuthDialogListener;
                    FacebookError a8 = new FacebookError("Failed to receive access token.");
                    ((Facebook.DialogListener)a7).onFacebookError(a8);
                    break label6;
                }
                else
                {
                    StringBuilder a9 = new StringBuilder("Login Success! access_token=");
                    String s8 = this.getAccessToken();
                    StringBuilder a10 = a9.append(s8);
                    StringBuilder a11 = a10.append(" expires=");
                    long j = this.getAccessExpires();
                    StringBuilder a12 = a11.append(j);
                    String s9 = a12.toString();
                    Log.d("Facebook-authorize", s9);
                    Object a13 = this.mAuthDialogListener;
                    android.os.Bundle a14 = a.getExtras();
                    ((Facebook.DialogListener)a13).onComplete(a14);
                    break label6;
                }
            }
            boolean b2 = s.equals((Object)"access_denied");
            label8: {
                label7: {
                    if(b2)
                    {
                        break label7;
                    }
                    boolean b3 = s.equals((Object)"OAuthAccessDeniedException");
                    if(!b3)
                    {
                        break label8;
                    }
                }
                Log.d("Facebook-authorize", "Login canceled by user.");
                Object a15 = this.mAuthDialogListener;
                ((Facebook.DialogListener)a15).onCancel();
                break label6;
            }
            StringBuilder a16 = new StringBuilder("Login failed: ");
            StringBuilder a17 = a16.append(s);
            String s10 = a17.toString();
            Log.d("Facebook-authorize", s10);
            Object a18 = this.mAuthDialogListener;
            FacebookError a19 = new FacebookError(s);
            ((Facebook.DialogListener)a18).onFacebookError(a19);
        }
    }
    
    public void dialog(android.content.Context a, String s, android.os.Bundle a0, Facebook.DialogListener a1)
    {
        Object a2 = a1;
        String s0 = DIALOG_BASE_URL;
        String s1 = String.valueOf((Object)s0);
        StringBuilder a3 = new StringBuilder(s1);
        StringBuilder a4 = a3.append(s);
        String s2 = a4.toString();
        a0.putString("display", "touch");
        a0.putString("redirect_uri", "fbconnect://success");
        boolean b = s.equals((Object)"oauth");
        if(!b)
        {
            String s3 = this.mAppId;
            a0.putString("app_id", s3);
        }
        else
        {
            a0.putString("type", "user_agent");
            String s4 = this.mAppId;
            a0.putString("client_id", s4);
        }
        boolean b0 = this.isSessionValid();
        if(b0)
        {
            String s5 = this.getAccessToken();
            a0.putString("access_token", s5);
        }
        String s6 = String.valueOf((Object)s2);
        StringBuilder a5 = new StringBuilder(s6);
        StringBuilder a6 = a5.append("?");
        String s7 = Util.encodeUrl(a0);
        StringBuilder a7 = a6.append(s7);
        String s8 = a7.toString();
        int i = a.checkCallingOrSelfPermission("android.permission.INTERNET");
        if(i == 0)
        {
            FbDialog a8 = new FbDialog(a, s8, (Facebook.DialogListener)a2);
            a8.show();
        }
        else
        {
            Util.showAlert(a, "Error", "Application requires permission to access the Internet");
        }
    }
    
    public void dialog(android.content.Context a, String s, Facebook.DialogListener a0)
    {
        Object a1 = a0;
        android.os.Bundle a2 = new android.os.Bundle();
        this.dialog(a, s, a2, (Facebook.DialogListener)a1);
    }
    
    public long getAccessExpires()
    {
        long j = this.mAccessExpires;
        return j;
    }
    
    public String getAccessToken()
    {
        String s = this.mAccessToken;
        return s;
    }
    
    public String getAppId()
    {
        String s = this.mAppId;
        return s;
    }
    
    public boolean isSessionValid()
    {
        int i = 0;
        label2: {
            String s = this.getAccessToken();
            label1: {
                label0: {
                    if(s == null)
                    {
                        break label0;
                    }
                    long j = this.getAccessExpires();
                    int i0 = j < 0L?-1:j == 0L?0:1;
                    if(i0 == 0)
                    {
                        break label1;
                    }
                    long j0 = System.currentTimeMillis();
                    long j1 = this.getAccessExpires();
                    int i1 = j0 < j1?-1:j0 == j1?0:1;
                    if(i1 < 0)
                    {
                        break label1;
                    }
                }
                i = 0;
                break label2;
            }
            i = 1;
        }
        return i != 0;
    }
    
    public String logout(android.content.Context a)
    {
        Util.clearCookies(a);
        android.os.Bundle a0 = new android.os.Bundle();
        a0.putString("method", "auth.expireSession");
        String s = this.request(a0);
        this.setAccessToken((String)null);
        this.setAccessExpires(0L);
        return s;
    }
    
    public String request(android.os.Bundle a)
    {
        boolean b = a.containsKey("method");
        if(!b)
        {
            IllegalArgumentException a0 = new IllegalArgumentException("API method must be specified. (parameters must contain key \"method\" and value). See http://developers.facebook.com/docs/reference/rest/");
            throw a0;
        }
        String s = this.request((String)null, a, "GET");
        return s;
    }
    
    public String request(String s)
    {
        android.os.Bundle a = new android.os.Bundle();
        String s0 = this.request(s, a, "GET");
        return s0;
    }
    
    public String request(String s, android.os.Bundle a)
    {
        String s0 = this.request(s, a, "GET");
        return s0;
    }
    
    public String request(String s, android.os.Bundle a, String s0)
    {
    	String s7 = null;
    	
    	try {
    	String s1 = null;
        a.putString("format", "json");
        boolean b = this.isSessionValid();
        if(b)
        {
            String s2 = this.getAccessToken();
            a.putString("access_token", s2);
        }
        if(s == null)
        {
            String s3 = RESTSERVER_URL;
            s1 = s3;
        }
        else
        {
            String s4 = GRAPH_BASE_URL;
            String s5 = String.valueOf((Object)s4);
            StringBuilder a0 = new StringBuilder(s5);
            StringBuilder a1 = a0.append(s);
            String s6 = a1.toString();
            s1 = s6;
        }
		
			s7 = Util.openUrl(s1, s0, a);
		} catch (Exception e) {
			s7 = null;
			Log.d("Facebook comm error", "error connecting to facebook");
			mAuthDialogListener.onFacebookError(new FacebookError(e.getMessage()));
		}
        return s7;
    }
    
    public void setAccessExpires(long j)
    {
        this.mAccessExpires = j;
    }
    
    public void setAccessExpiresIn(String s)
    {
        if(s != null)
        {
            if(!s.equals((Object)"0"))
            {
                long j = System.currentTimeMillis();
                int i = Integer.parseInt(s);
                int i0 = 1000 * i;
                long j0 = (long)i0;
                long j1 = j + j0;
                this.setAccessExpires(j1);
            }
        }
    }
    
    public void setAccessToken(String s)
    {
        this.mAccessToken = s;
    }
    
    public void setAppId(String s)
    {
        this.mAppId = s;
    }
    
    abstract public interface DialogListener {
        abstract public void onCancel();
        
        
        abstract public void onComplete(android.os.Bundle arg);
        
        
        abstract public void onError(DialogError arg);
        
        
        abstract public void onFacebookError(FacebookError arg);
    }
}
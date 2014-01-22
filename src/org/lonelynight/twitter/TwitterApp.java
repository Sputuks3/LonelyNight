package org.spf.twitter;

import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import twitter4j.*;
import twitter4j.http.AccessToken;
import android.os.Handler;
import android.os.Message;

public class TwitterApp implements org.spf.utils.Constants {
    final public static String CALLBACK_URL = "twitterapp://connect";
    private android.app.Activity context;
    private AccessToken mAccessToken;
    private String mConsumerKey;
    private Handler mHandler;
    private CommonsHttpOAuthConsumer mHttpOauthConsumer;
    private oauth.signpost.OAuthProvider mHttpOauthprovider;
    private TwDialogListener mListener;
    private android.app.ProgressDialog mProgressDlg;
    private String mSecretKey;
    private TwitterSession mSession;
    private Twitter mTwitter;
    
    public TwitterApp(android.app.Activity a, String s, String s0)
    {
        super();

        this.mHandler = new Handler() {
            @Override
            public void handleMessage(android.os.Message a)
            {
                mProgressDlg.dismiss();
                int i = a.what;
                if(i != 1)
                {
                    int i0 = a.arg1;
                    if(i0 != 1)
                    {
                    	mListener.onComplete("");
                    }
                    else
                    {
                        showLoginDialog((String)a.obj);
                    }
                }
                else
                {
                    int i1 = a.arg1;
                    if(i1 != 1)
                    {
                        mListener.onError("Error getting access token");
                    }
                    else
                    {
                    	mListener.onError("Error getting request token");
                    }
                }
            }
        };
        
        this.context = a;
        TwitterFactory a1 = new TwitterFactory();
        Twitter a2 = a1.getInstance();
        this.mTwitter = a2;
        TwitterSession a3 = new TwitterSession((android.content.Context)a);
        this.mSession = a3;
        android.app.ProgressDialog a4 = new android.app.ProgressDialog((android.content.Context)a);
        this.mProgressDlg = a4;
        android.app.ProgressDialog a5 = this.mProgressDlg;
        a5.requestWindowFeature(1);
        this.mConsumerKey = s;
        this.mSecretKey = s0;
        String s1 = this.mConsumerKey;
        String s2 = this.mSecretKey;
        CommonsHttpOAuthConsumer a6 = new CommonsHttpOAuthConsumer(s1, s2);
        this.mHttpOauthConsumer = a6;
        oauth.signpost.basic.DefaultOAuthProvider a7 = new oauth.signpost.basic.DefaultOAuthProvider("https://api.twitter.com/oauth/request_token", "https://api.twitter.com/oauth/access_token", "https://api.twitter.com/oauth/authorize");
        this.mHttpOauthprovider = (oauth.signpost.OAuthProvider)a7;
        TwitterSession a8 = this.mSession;
        AccessToken a9 = a8.getAccessToken();
        this.mAccessToken = a9;
        this.configureToken();
    }
    
    static android.app.ProgressDialog access$0(TwitterApp a)
    {
        android.app.ProgressDialog a0 = a.mProgressDlg;
        return a0;
    }
    
    
    
    private void configureToken()
    {
        AccessToken a = this.mAccessToken;
        if(a != null)
        {
            Twitter a0 = this.mTwitter;
            String s = this.mConsumerKey;
            String s0 = this.mSecretKey;
            a0.setOAuthConsumer(s, s0);
            Twitter a1 = this.mTwitter;
            AccessToken a2 = this.mAccessToken;
            a1.setOAuthAccessToken(a2);
        }
    }
    
    private String getVerifier(String s)
    {
        String s0 = null;
        try
        {
            String s1 = s.replace((CharSequence)"twitterapp", (CharSequence)"http");
            java.net.URL a = new java.net.URL(s1);
            String s2 = a.getQuery();
            String[] a0 = s2.split("&");
            int i = a0.length;
            int i0 = 0;
            while(true)
            {
                if(i0 < i)
                {
                    String s3 = a0[i0];
                    String[] a1 = s3.split("=");
                    String s4 = a1[0];
                    String s5 = java.net.URLDecoder.decode(s4);
                    boolean b = s5.equals((Object)"oauth_verifier");
                    if(!b)
                    {
                        int i1 = i0 + 1;
                        i0 = i1;
                        continue;
                    }
                    String s6 = a1[1];
                    String s7 = java.net.URLDecoder.decode(s6);
                    s0 = s7;
                    break;
                }
                else
                {
                    s0 = "";
                    break;
                }
            }
        }
        catch(java.net.MalformedURLException a2)
        {
            a2.printStackTrace();
            s0 = "";
        }
        return s0;
    }
    
    private void showLoginDialog(String s)
    {
        TwitterDialog a1 = new TwitterDialog(this.context, s, new TwitterApp.TwDialogListener() {
			
			@Override
			public void onError(String arg) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onComplete(String arg) {
				// TODO Auto-generated method stub
				
			}
		}
        );
        a1.show();
    }
    
    public void authorize()
    {
        android.app.ProgressDialog a = this.mProgressDlg;
        android.app.Activity a0 = this.context;
        android.content.res.Resources a1 = a0.getResources();
        String s = a1.getString(2131034153);
        a.setMessage((CharSequence)s);
        android.app.ProgressDialog a2 = this.mProgressDlg;
        a2.show();
        
        Runnable runner = new Runnable() {
        	
        	public void run()
            {
                String s = null;
                int i = 0;
                try
                {
                    s = mHttpOauthprovider.retrieveRequestToken(mHttpOauthConsumer, "twitterapp://connect");
                    i = 0;
                }
                catch(Exception a3)
                {
                    a3.printStackTrace();
                    s = "";
                    i = 1;
                }
                
                Message a8 = mHandler.obtainMessage(i, 1, 0, (Object)s);
                mHandler.sendMessage(a8);
            }
        };

        new Thread(runner).start();
    }
    
    public String getUsername()
    {
        return mSession.getUsername();
    }
    
    public boolean hasAccessToken()
    {
        AccessToken a = this.mAccessToken;
        int i = a != null?1:0;
        return i != 0;
    }
    
    public void processToken(String s)
    {
        String s0 = context.getResources().getString(2131034202);
        mProgressDlg.setMessage((CharSequence)s0);
        mProgressDlg.show();
        
        Runnable runner = new Runnable()
        {
        	public void run()
            {
                int i = 0;
                try
                {

                    AccessToken a8 = new AccessToken(mHttpOauthConsumer.getToken(), mHttpOauthConsumer.getTokenSecret());
                    TwitterApp.this.mAccessToken = a8;
                    TwitterApp.this.configureToken();
                    mTwitter.verifyCredentials();

                    String s2 = ((User)mTwitter.verifyCredentials()).getName();
                    mSession.storeAccessToken(mAccessToken, s2);
                    i = 0;
                }
                catch(Exception a17)
                {
                    a17.printStackTrace();
                    i = 1;
                }

                Message a22 = mHandler.obtainMessage(i, 2, 0);
                mHandler.sendMessage(a22);
            }
        };
        
        new Thread(runner).start();
    }
    
    public void resetAccessToken()
    {
        AccessToken a = this.mAccessToken;
        if(a != null)
        {
        	TwitterSession a0 = this.mSession;
            a0.resetAccessToken();
            this.mAccessToken = null;
        }
    }
    
    public void setListener(TwDialogListener a)
    {
        this.mListener = a;
    }
    
    public void updateStatus(String s) throws TwitterException
    {
        Twitter a = this.mTwitter;
        a.updateStatus(s);
    }
    
    abstract public interface TwDialogListener {
        abstract public void onComplete(String arg);
        abstract public void onError(String arg);
    }
}
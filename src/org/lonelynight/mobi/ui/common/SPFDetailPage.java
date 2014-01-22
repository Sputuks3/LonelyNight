package org.spf.mobi.ui.common;

public class SPFDetailPage extends org.spf.mobi.ui.SPFActivity implements org.spf.utils.Constants, org.spf.utils.SPFTwitterFacebookInterface {
    private static String headerName;
    private static String locationId;
    private static String shareText;
    private static String shareTitle;
    private static String url;
    private static String zoneName;
    private org.spf.facebook.Facebook facebook;
    private int layoutId;
    private android.app.Activity mContext;
    private android.os.Parcelable mData;
    private android.os.Handler mHandler;
    private org.spf.utils.Constants.SCREENS mScreen;
    private String mUrl;
    private android.view.View mView;
    private Thread runningThread;
    private org.spf.twitter.TwitterApp twitter;
    
    static
    {
        shareTitle = "";
    }
    
    public SPFDetailPage()
    {
        super();
        this.mUrl = null;
        this.layoutId = -1;
    }
    
    static org.spf.utils.Constants.SCREENS access$0(org.spf.mobi.ui.common.SPFDetailPage a)
    {
        org.spf.utils.Constants.SCREENS a0 = a.mScreen;
        return a0;
    }
    
    static String access$1(org.spf.mobi.ui.common.SPFDetailPage a)
    {
        String s = a.mUrl;
        return s;
    }
    
    static void access$10(String s)
    {
        shareTitle = s;
    }
    
    static android.view.View access$11(org.spf.mobi.ui.common.SPFDetailPage a)
    {
        android.view.View a0 = a.mView;
        return a0;
    }
    
    static Thread access$12(org.spf.mobi.ui.common.SPFDetailPage a)
    {
        Thread a0 = a.runningThread;
        return a0;
    }
    
    static void access$2(org.spf.mobi.ui.common.SPFDetailPage a, android.os.Parcelable a0)
    {
        a.mData = a0;
    }
    
    static android.os.Handler access$3(org.spf.mobi.ui.common.SPFDetailPage a)
    {
        android.os.Handler a0 = a.mHandler;
        return a0;
    }
    
    static int access$4(org.spf.mobi.ui.common.SPFDetailPage a)
    {
        int i = a.layoutId;
        return i;
    }
    
    static android.os.Parcelable access$5(org.spf.mobi.ui.common.SPFDetailPage a)
    {
        Object a0 = a.mData;
        return (android.os.Parcelable)a0;
    }
    
    static void access$6(String s)
    {
        locationId = s;
    }
    
    static android.app.Activity access$7(org.spf.mobi.ui.common.SPFDetailPage a)
    {
        android.app.Activity a0 = a.mContext;
        return a0;
    }
    
    static void access$8(String s)
    {
        headerName = s;
    }
    
    static void access$9(String s)
    {
        zoneName = s;
    }
    
    private void initFetchData()
    {
        Object a = this.mData;
        if(a == null)
        {
            org.spf.mobi.ui.common.SPFDetailPage.1 a0 = new org.spf.mobi.ui.common.SPFDetailPage.1(this);
            a0.start();
        }
    }
    
    public android.app.Activity activity()
    {
        return this;
    }
    
    public org.spf.facebook.Facebook facebookInterface()
    {
        org.spf.facebook.Facebook a = this.facebook;
        if(a == null)
        {
            org.spf.facebook.Facebook a0 = new org.spf.facebook.Facebook("514442595f0ef8805a7ed9ad51c94c6c");
            this.facebook = a0;
        }
        org.spf.facebook.Facebook a1 = this.facebook;
        return a1;
    }
    
    public android.os.Handler handler()
    {
        android.os.Handler a = this.mHandler;
        return a;
    }
    
    public void launchImage(android.view.View a)
    {
        android.graphics.Bitmap a0 = null;
        Object a1 = this.mData;
        boolean b = a1 instanceof org.spf.data.SPFCrime;
        if(!b)
        {
            Object a2 = this.mData;
            boolean b0 = a2 instanceof org.spf.data.SPFAppeal;
            if(!b0)
            {
                Object a3 = this.mData;
                boolean b1 = a3 instanceof org.spf.data.SPFMissing;
                android.graphics.Bitmap a4 = null;
                if(!b1)
                {
                    a0 = a4;
                }
                else
                {
                    Object a5 = this.mData;
                    org.spf.data.SPFMissing dummy = (org.spf.data.SPFMissing)a5;
                    org.spf.data.SPFMissing a6 = (org.spf.data.SPFMissing)a5;
                    android.graphics.Bitmap a7 = a6.getFull();
                    a0 = a7;
                }
            }
            else
            {
                Object a8 = this.mData;
                org.spf.data.SPFAppeal dummy0 = (org.spf.data.SPFAppeal)a8;
                org.spf.data.SPFAppeal a9 = (org.spf.data.SPFAppeal)a8;
                android.graphics.Bitmap a10 = a9.getFull();
                a0 = a10;
            }
        }
        else
        {
            Object a11 = this.mData;
            org.spf.data.SPFCrime dummy1 = (org.spf.data.SPFCrime)a11;
            org.spf.data.SPFCrime a12 = (org.spf.data.SPFCrime)a11;
            android.graphics.Bitmap a13 = a12.getFull();
            a0 = a13;
        }
        if(a0 != null)
        {
            java.io.ByteArrayOutputStream a14 = new java.io.ByteArrayOutputStream();
            android.graphics.Bitmap.CompressFormat a15 = android.graphics.Bitmap.CompressFormat.PNG;
            a0.compress(a15, 0, (java.io.OutputStream)a14);
            byte[] a16 = a14.toByteArray();
            android.content.Intent a17 = new android.content.Intent((android.content.Context)this, org.spf.mobi.ui.common.SPFImageView.class);
            a17.putExtra("IMAGE", a16);
            this.startActivity(a17);
            this.overridePendingTransition(2130968576, 17432577);
        }
        else
        {
            android.widget.Toast a18 = android.widget.Toast.makeText((android.content.Context)this, (CharSequence)"Please wait while the image is loaded...", 0);
            a18.show();
        }
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
        this.mContext = this;
        android.content.Intent a0 = this.getIntent();
        String s = a0.getStringExtra("PASSING_URL");
        this.mUrl = s;
        StringBuilder a1 = new StringBuilder("mUrl::");
        String s0 = this.mUrl;
        StringBuilder a2 = a1.append(s0);
        String s1 = a2.toString();
        android.util.Log.d("SPF", s1);
        android.content.Intent a3 = this.getIntent();
        int i = a3.getIntExtra("SCREEN_ID", -1);
        org.spf.utils.Constants.SCREENS a4 = org.spf.utils.Constants.SCREENS.valueAt(i);
        this.mScreen = a4;
        StringBuilder a5 = new StringBuilder("mScreen::");
        org.spf.utils.Constants.SCREENS a6 = this.mScreen;
        String s2 = a6.toString();
        StringBuilder a7 = a5.append(s2);
        String s3 = a7.toString();
        android.util.Log.d("SPF", s3);
        android.content.Intent a8 = this.getIntent();
        int i0 = a8.getIntExtra("LAYOUT_ID", -1);
        this.layoutId = i0;
        android.os.Handler a9 = new android.os.Handler();
        this.mHandler = a9;
        this.showDialog(2, (android.os.Bundle)null);
        int i1 = this.layoutId;
        if(i1 == -1)
        {
            this.setContentView(2130903046);
        }
        else
        {
            android.view.LayoutInflater a10 = android.view.LayoutInflater.from((android.content.Context)this);
            android.view.View a11 = a10.inflate(2130903056, (android.view.ViewGroup)null);
            this.mView = a11;
            android.view.View a12 = this.mView;
            this.setContentView(a12);
        }
        this.initFetchData();
    }
    
    protected android.app.Dialog onCreateDialog(int i, android.os.Bundle a)
    {
        android.app.Dialog a0 = null;
        switch(i){
            case 2: {
                android.app.ProgressDialog a1 = new android.app.ProgressDialog((android.content.Context)this);
                android.content.res.Resources a2 = this.getResources();
                String s = a2.getString(2131034126);
                a1.setMessage((CharSequence)s);
                a1.setCancelable(true);
                a1.setIndeterminate(true);
                org.spf.mobi.ui.common.SPFDetailPage.3 a3 = new org.spf.mobi.ui.common.SPFDetailPage.3(this);
                a1.setOnCancelListener((android.content.DialogInterface.OnCancelListener)a3);
                a0 = a1;
                break;
            }
            default: {
                android.app.Dialog a4 = ((org.spf.mobi.ui.SPFActivity)this).onCreateDialog(i, a);
                a0 = a4;
            }
        }
        return a0;
    }
    
    protected void onDestroy()
    {
        Thread a = this.runningThread;
        if(a != null)
        {
            Thread a0 = this.runningThread;
            boolean b = a0.isAlive();
            if(b)
            {
                Thread a1 = this.runningThread;
                a1.interrupt();
            }
        }
        ((org.spf.mobi.ui.SPFActivity)this).onDestroy();
    }
    
    public void shareButton(android.view.View a)
    {
        android.util.Log.d("SPF", "Shared button called");
        org.spf.utils.Constants.SCREENS a0 = this.mScreen;
        org.spf.utils.Utils.setCurrentScreen(a0);
        org.spf.utils.Utils.setContext((android.content.Context)this);
        int i = a.getId();
        switch(i){
            case 2131165242: {
                org.spf.utils.Constants.SCREENS a1 = this.mScreen;
                org.spf.utils.Utils.setGATrackEventShare(2, a1);
                android.content.Intent a2 = new android.content.Intent((android.content.Context)this, org.spf.mobi.ui.common.SPFSingleElementMapDetail.class);
                String s = locationId;
                a2.putExtra("LOCATION_ID", s);
                String s0 = headerName;
                a2.putExtra("TITLE_NAME", s0);
                String s1 = zoneName;
                a2.putExtra("ZONE_NAME", s1);
                this.startActivity(a2);
                break;
            }
            case 2131165241: {
                url = "http://www.spf.gov.sg/mic";
                String s2 = shareText;
                String s3 = shareTitle;
                String s4 = url;
                org.spf.utils.Utils.shareViaFacebook(s2, s3, s4, (org.spf.utils.SPFTwitterFacebookInterface)this);
                break;
            }
            case 2131165240: {
                String s5 = shareText;
                int i0 = s5.length();
                if(i0 > 140)
                {
                    String s6 = shareText;
                    String s7 = s6.substring(0, 136);
                    String s8 = String.valueOf((Object)s7);
                    StringBuilder a3 = new StringBuilder(s8);
                    StringBuilder a4 = a3.append("...");
                    String s9 = a4.toString();
                    shareText = s9;
                }
                String s10 = shareText;
                org.spf.utils.Utils.shareViaTwitter(s10, (org.spf.utils.SPFTwitterFacebookInterface)this);
                break;
            }
        }
    }
    
    public String shareText(String s)
    {
        if(s != null)
        {
            boolean b = "".equalsIgnoreCase(s);
            if(!b)
            {
                shareText = s;
            }
        }
        String s0 = shareText;
        return s0;
    }
    
    public org.spf.twitter.TwitterApp twitterInterface()
    {
        org.spf.twitter.TwitterApp a = this.twitter;
        if(a == null)
        {
            org.spf.twitter.TwitterApp a0 = new org.spf.twitter.TwitterApp((android.app.Activity)this, "kx2OWGCvacdg0d4RUqrtmw", "EM3GgStqXGCYMarnxx5eP4R05FkFWwq31XQTD85dOSE");
            this.twitter = a0;
        }
        org.spf.twitter.TwitterApp a1 = this.twitter;
        return a1;
    }
    
    protected void update()
    {
        boolean b = this.isFinishing();
        if(!b)
        {
            android.os.Handler a = this.mHandler;
            org.spf.mobi.ui.common.SPFDetailPage.2 a0 = new org.spf.mobi.ui.common.SPFDetailPage.2(this);
            a.post((Runnable)a0);
        }
    }
}
package org.spf.mobi.ui.web;

public class SPFWebsite extends org.spf.mobi.ui.SPFActivity implements org.spf.utils.Constants {
    final public static String INTENT_EXTRAS_ID = "INTENT_EXTRAS_ID";
    final public static int SPF_FB_ID = -2;
    final public static int SPF_HANDPHONE_ID = -4;
    final public static int SPF_TWITTER_ID = -3;
    final public static int SPF_WEBSITE_ID = -1;
    private int currCat;
    android.webkit.WebView mWebView;
    private android.app.Dialog pgd;
    
    public SPFWebsite()
    {
        super();
        this.currCat = -100;
        this.mWebView = null;
    }
    
    static android.app.Dialog access$0(org.spf.mobi.ui.web.SPFWebsite a)
    {
        android.app.Dialog a0 = a.pgd;
        return a0;
    }
    
    static void access$1(org.spf.mobi.ui.web.SPFWebsite a)
    {
        a.dismissDialog();
    }
    
    private void dismissDialog()
    {
        this.dismissDialog(0);
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
        this.setContentView(2130903068);
        android.content.Intent a0 = this.getIntent();
        android.os.Bundle a1 = a0.getExtras();
        int i = a1.getInt("INTENT_EXTRAS_ID");
        this.currCat = i;
        android.view.View a2 = this.findViewById(2131165246);
        android.widget.TextView dummy = (android.widget.TextView)a2;
        android.widget.TextView a3 = (android.widget.TextView)a2;
        this.showDialog(0);
        android.view.View a4 = this.findViewById(2131165371);
        android.webkit.WebView dummy0 = (android.webkit.WebView)a4;
        android.webkit.WebView a5 = (android.webkit.WebView)a4;
        this.mWebView = a5;
        android.webkit.WebView a6 = this.mWebView;
        android.webkit.WebSettings a7 = a6.getSettings();
        a7.setJavaScriptEnabled(true);
        android.webkit.WebView a8 = this.mWebView;
        android.webkit.WebSettings a9 = a8.getSettings();
        a9.setJavaScriptCanOpenWindowsAutomatically(true);
        android.webkit.WebView a10 = this.mWebView;
        android.webkit.WebSettings a11 = a10.getSettings();
        a11.setBuiltInZoomControls(true);
        android.webkit.WebView a12 = this.mWebView;
        android.webkit.WebSettings a13 = a12.getSettings();
        a13.setSupportZoom(true);
        android.webkit.WebView a14 = this.mWebView;
        android.webkit.WebSettings a15 = a14.getSettings();
        a15.setDomStorageEnabled(true);
        android.webkit.WebView a16 = this.mWebView;
        android.webkit.WebSettings a17 = a16.getSettings();
        android.webkit.WebSettings.ZoomDensity a18 = android.webkit.WebSettings.ZoomDensity.MEDIUM;
        a17.setDefaultZoom(a18);
        android.webkit.WebView a19 = this.mWebView;
        org.spf.mobi.ui.web.SPFWebsite.MyWebViewClient a20 = new org.spf.mobi.ui.web.SPFWebsite.MyWebViewClient(this, (org.spf.mobi.ui.web.SPFWebsite.MyWebViewClient)null);
        a19.setWebViewClient((android.webkit.WebViewClient)a20);
        int i0 = this.currCat;
        switch(i0){
            case -1: {
                android.content.res.Resources a21 = this.getResources();
                String s = a21.getString(2131034119);
                a3.setText((CharSequence)s);
                android.webkit.WebView a22 = this.mWebView;
                org.spf.utils.Constants.WEB_LINKS.URL a23 = org.spf.utils.Constants.WEB_LINKS.URL.SPF_WEBSITE;
                String s0 = org.spf.utils.Constants.WEB_LINKS.URL.getUrl(a23);
                a22.loadUrl(s0);
                break;
            }
            case -2: {
                android.content.res.Resources a24 = this.getResources();
                String s1 = a24.getString(2131034119);
                a3.setText((CharSequence)s1);
                android.webkit.WebView a25 = this.mWebView;
                org.spf.utils.Constants.WEB_LINKS.URL a26 = org.spf.utils.Constants.WEB_LINKS.URL.SPF_FB;
                String s2 = org.spf.utils.Constants.WEB_LINKS.URL.getUrl(a26);
                a25.loadUrl(s2);
                break;
            }
            case -3: {
                android.content.res.Resources a27 = this.getResources();
                String s3 = a27.getString(2131034119);
                a3.setText((CharSequence)s3);
                android.webkit.WebView a28 = this.mWebView;
                org.spf.utils.Constants.WEB_LINKS.URL a29 = org.spf.utils.Constants.WEB_LINKS.URL.SPF_TWITTER;
                String s4 = org.spf.utils.Constants.WEB_LINKS.URL.getUrl(a29);
                a28.loadUrl(s4);
                break;
            }
            case -4: {
                android.content.res.Resources a30 = this.getResources();
                String s5 = a30.getString(2131034119);
                a3.setText((CharSequence)s5);
                android.webkit.WebView a31 = this.mWebView;
                org.spf.utils.Constants.WEB_LINKS.URL a32 = org.spf.utils.Constants.WEB_LINKS.URL.SPF_HANDPHONE_ID;
                String s6 = org.spf.utils.Constants.WEB_LINKS.URL.getUrl(a32);
                a31.loadUrl(s6);
                break;
            }
        }
    }
    
    protected android.app.Dialog onCreateDialog(int i)
    {
        android.app.Dialog a = null;
        if(i != 0)
        {
            android.app.Dialog a0 = ((org.spf.mobi.ui.SPFActivity)this).onCreateDialog(i);
            a = a0;
        }
        else
        {
            android.app.ProgressDialog a1 = new android.app.ProgressDialog((android.content.Context)this);
            a1.setCancelable(true);
            org.spf.mobi.ui.web.SPFWebsite.1 a2 = new org.spf.mobi.ui.web.SPFWebsite.1(this);
            a1.setOnCancelListener((android.content.DialogInterface.OnCancelListener)a2);
            a1.setMessage((CharSequence)"Loading...");
            a1.setIndeterminate(true);
            this.pgd = a1;
            a = a1;
        }
        return a;
    }
}
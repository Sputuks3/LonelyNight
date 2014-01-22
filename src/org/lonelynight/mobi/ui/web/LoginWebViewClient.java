package org.spf.mobi.ui.web;

public class LoginWebViewClient extends android.webkit.WebViewClient {
    private android.content.Context mContext;
    private android.app.ProgressDialog pgd;
    
    public LoginWebViewClient(android.content.Context a)
    {
        super();
        this.mContext = a;
        android.app.ProgressDialog a0 = new android.app.ProgressDialog(a);
        this.pgd = a0;
        android.app.ProgressDialog a1 = this.pgd;
        android.content.res.Resources a2 = a.getResources();
        String s = a2.getString(2131034153);
        a1.setMessage((CharSequence)s);
        android.app.ProgressDialog a3 = this.pgd;
        a3.setCancelable(true);
        android.app.ProgressDialog a4 = this.pgd;
        a4.setIndeterminate(true);
    }
    
    public void onPageFinished(android.webkit.WebView a, String s)
    {
        android.app.ProgressDialog a0 = this.pgd;
        if(a0 != null)
        {
            android.app.ProgressDialog a1 = this.pgd;
            boolean b = a1.isShowing();
            if(b)
            {
                android.app.ProgressDialog a2 = this.pgd;
                a2.dismiss();
            }
        }
        ((android.webkit.WebViewClient)this).onPageFinished(a, s);
    }
    
    public void onPageStarted(android.webkit.WebView a, String s, android.graphics.Bitmap a0)
    {
        android.content.Context a1 = this.mContext;
        if(a1 != null)
        {
            android.content.Context a2 = this.mContext;
            boolean b = a2.isRestricted();
            if(!b)
            {
                android.app.ProgressDialog a3 = this.pgd;
                a3.show();
            }
        }
        ((android.webkit.WebViewClient)this).onPageStarted(a, s, a0);
    }
    
    public boolean shouldOverrideUrlLoading(android.webkit.WebView a, String s)
    {
        a.loadUrl(s);
        return true;
    }
}
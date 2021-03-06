package org.spf.ui.aboutus;

import org.spf.mobi.ui.SPFActivity;
import org.spf.utils.Constants;

import android.app.*;
import android.webkit.*;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.View;

public class SPFAboutus extends SPFActivity implements Constants {
    WebView mWebView;
    private Dialog pgd;
    
    public SPFAboutus()
    {
        super();
        this.mWebView = null;
    }
    
    private void dismissDialog()
    {
        this.dismissDialog(0);
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        super.onCreate(a);
        this.setContentView(2130903068);
        View a0 = this.findViewById(2131165246);
        android.widget.TextView a1 = (android.widget.TextView)a0;
        a1.setText((CharSequence)"Join Us");
        View a2 = this.findViewById(2131165371);
        WebView a3 = (WebView)a2;
        this.mWebView = a3;
        android.webkit.WebView a4 = this.mWebView;
        Constants.WEB_LINKS.URL a5 = Constants.WEB_LINKS.URL.JOIN_US;
        String s = Constants.WEB_LINKS.URL.getUrl(a5);
        a4.loadUrl(s);
        WebView a6 = this.mWebView;
        WebSettings a7 = a6.getSettings();
        a7.setBuiltInZoomControls(true);
        WebView a8 = this.mWebView;
        WebSettings a9 = a8.getSettings();
        a9.setSupportZoom(true);
        this.mWebView.setInitialScale(1);
        this.mWebView.setWebViewClient((WebViewClient) new MyWebViewClient() );
        this.showDialog(0);
    }
    
    protected Dialog onCreateDialog(int i)
    {
        Dialog d = null;
        if(i != 0)
        {
            d = super.onCreateDialog(i);
        }
        else
        {
            ProgressDialog pd = new ProgressDialog((android.content.Context)this);
            pd.setCancelable(true);
            pd.setOnCancelListener(new DialogInterface.OnCancelListener() {
                
                
                public void onCancel(android.content.DialogInterface a)
                {
                    finish();
                }
            });
            pd.setMessage((CharSequence)"Loading...");
            pd.setIndeterminate(true);
            this.pgd = pd;
            d = pd;
        }
        return d;
    }
    
    class MyWebViewClient extends WebViewClient {
        
        
        public void onPageFinished(WebView a, String s)
        {
            
            if(pgd != null)
            {
                
                if(pgd.isShowing())
                {
                	dismissDialog();
                }
            }
            super.onPageFinished(a, s);
        }
        
        public void onPageStarted(WebView a, String s, Bitmap a0)
        {
        }
    }
}
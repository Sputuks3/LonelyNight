package org.spf.facebook;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FbDialog extends android.app.Dialog {
    final static float[] DIMENSIONS_DIFF_LANDSCAPE;
    final static float[] DIMENSIONS_DIFF_PORTRAIT;
    final static String DISPLAY_STRING = "touch";
    final static int FB_BLUE = -9599820;
    final static String FB_ICON = "icon.png";
    final static android.widget.FrameLayout.LayoutParams FILL;
    final static int MARGIN = 4;
    final static int PADDING = 2;
    private android.widget.LinearLayout mContent;
    private Facebook.DialogListener mListener;
    private android.app.ProgressDialog mSpinner;
    private android.widget.TextView mTitle;
    private String mUrl;
    private WebView mWebView;
    
    static
    {
        float[] a = new float[2];
        a[0] = 20.0f;
        a[1] = 60.0f;
        DIMENSIONS_DIFF_LANDSCAPE = a;
        float[] a0 = new float[2];
        a0[0] = 40.0f;
        a0[1] = 60.0f;
        DIMENSIONS_DIFF_PORTRAIT = a0;
        android.widget.FrameLayout.LayoutParams a1 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        FILL = a1;
    }
    
    public FbDialog(android.content.Context a, String s, Facebook.DialogListener a0)
    {
        super(a);
        Object a1 = a0;
        this.mUrl = s;
        this.mListener = (Facebook.DialogListener)a1;
    }
    
    static Facebook.DialogListener access$0(FbDialog a)
    {
        Object a0 = a.mListener;
        return (Facebook.DialogListener)a0;
    }
    
    static android.app.ProgressDialog access$1(FbDialog a)
    {
        android.app.ProgressDialog a0 = a.mSpinner;
        return a0;
    }
    
    static WebView access$2(FbDialog a)
    {
        WebView a0 = a.mWebView;
        return a0;
    }
    
    static android.widget.TextView access$3(FbDialog a)
    {
        android.widget.TextView a0 = a.mTitle;
        return a0;
    }
    
    private void setUpTitle()
    {
        this.requestWindowFeature(1);
        android.content.Context a = this.getContext();
        android.content.res.Resources a0 = a.getResources();
        android.graphics.drawable.Drawable a1 = a0.getDrawable(2130837565);
        android.content.Context a2 = this.getContext();
        android.widget.TextView a3 = new android.widget.TextView(a2);
        this.mTitle = a3;
        android.widget.TextView a4 = this.mTitle;
        a4.setText((CharSequence)"Facebook");
        android.widget.TextView a5 = this.mTitle;
        a5.setTextColor(-1);
        android.widget.TextView a6 = this.mTitle;
        android.graphics.Typeface a7 = android.graphics.Typeface.DEFAULT_BOLD;
        a6.setTypeface(a7);
        android.widget.TextView a8 = this.mTitle;
        a8.setBackgroundColor(-9599820);
        android.widget.TextView a9 = this.mTitle;
        a9.setPadding(6, 4, 4, 4);
        android.widget.TextView a10 = this.mTitle;
        a10.setCompoundDrawablePadding(6);
        android.widget.TextView a11 = this.mTitle;
        a11.setCompoundDrawablesWithIntrinsicBounds(a1, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null);
        android.widget.LinearLayout a12 = this.mContent;
        android.widget.TextView a13 = this.mTitle;
        a12.addView((android.view.View)a13);
    }
    
    private void setUpWebView()
    {
        android.content.Context a = this.getContext();
        WebView a0 = new WebView(a);
        this.mWebView = a0;
        WebView a1 = this.mWebView;
        a1.setVerticalScrollBarEnabled(false);
        WebView a2 = this.mWebView;
        a2.setHorizontalScrollBarEnabled(false);
        WebView a3 = this.mWebView;
        FbDialog.FbWebViewClient a4 = new FbDialog.FbWebViewClient();
        a3.setWebViewClient((WebViewClient)a4);
        WebView a5 = this.mWebView;
        WebSettings a6 = a5.getSettings();
        a6.setJavaScriptEnabled(true);
        WebView a7 = this.mWebView;
        String s = this.mUrl;
        a7.loadUrl(s);
        WebView a8 = this.mWebView;
        android.widget.FrameLayout.LayoutParams a9 = FILL;
        a8.setLayoutParams((android.view.ViewGroup.LayoutParams)a9);
        android.widget.LinearLayout a10 = this.mContent;
        WebView a11 = this.mWebView;
        a10.addView((android.view.View)a11);
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        float[] a0 = null;
        super.onCreate(a);
        android.content.Context a1 = this.getContext();
        android.app.ProgressDialog a2 = new android.app.ProgressDialog(a1);
        this.mSpinner = a2;
        android.app.ProgressDialog a3 = this.mSpinner;
        a3.requestWindowFeature(1);
        android.app.ProgressDialog a4 = this.mSpinner;
        a4.setMessage((CharSequence)"Loading...");
        android.content.Context a5 = this.getContext();
        android.widget.LinearLayout a6 = new android.widget.LinearLayout(a5);
        this.mContent = a6;
        android.widget.LinearLayout a7 = this.mContent;
        a7.setOrientation(1);
        this.setUpTitle();
        this.setUpWebView();
        android.view.Window a8 = this.getWindow();
        Object a9 = a8.getWindowManager();
        android.view.Display a10 = ((android.view.WindowManager)a9).getDefaultDisplay();
        android.content.Context a11 = this.getContext();
        android.content.res.Resources a12 = a11.getResources();
        android.util.DisplayMetrics a13 = a12.getDisplayMetrics();
        float f = a13.density;
        android.content.Context a14 = this.getContext();
        android.content.res.Resources a15 = a14.getResources();
        android.content.res.Configuration a16 = a15.getConfiguration();
        int i = a16.orientation;
        if(i != 2)
        {
            float[] a17 = DIMENSIONS_DIFF_PORTRAIT;
            a0 = a17;
        }
        else
        {
            float[] a18 = DIMENSIONS_DIFF_LANDSCAPE;
            a0 = a18;
        }
        android.widget.LinearLayout a19 = this.mContent;
        int i0 = a10.getWidth();
        float f0 = a0[0];
        float f1 = f * f0;
        float f2 = 0.5f + f1;
        int i1 = (int)f2;
        int i2 = i0 - i1;
        int i3 = a10.getHeight();
        float f3 = a0[1];
        float f4 = f * f3;
        float f5 = 0.5f + f4;
        int i4 = (int)f5;
        int i5 = i3 - i4;
        android.widget.LinearLayout.LayoutParams a20 = new android.widget.LinearLayout.LayoutParams(i2, i5);
        this.addContentView((android.view.View)a19, (android.view.ViewGroup.LayoutParams)a20);
    }
    
    class FbWebViewClient extends WebViewClient {
        
        
        public void onPageFinished(android.webkit.WebView a, String s)
        {
            super.onPageFinished(a, s);
            String s0 = mWebView.getTitle();
            if(s0 != null)
            {
                int i = s0.length();
                if(i > 0)
                {
                	mTitle.setText((CharSequence)s0);
                    
                    if(s0.equalsIgnoreCase("Error"))
                    {
                        mListener.onError(new DialogError("Reposting Error", 11, (String)null));
                        FbDialog.this.dismiss();
                    }
                }
            }
            
            mSpinner.dismiss();
        }
        
        public void onPageStarted(android.webkit.WebView a, String s, android.graphics.Bitmap a0)
        {
            StringBuilder a1 = new StringBuilder("Webview loading URL: ");
            StringBuilder a2 = a1.append(s);
            String s0 = a2.toString();
            Log.d("Facebook-WebView", s0);
            super.onPageStarted(a, s, a0);
            mSpinner.show();
        }
        
        public void onReceivedError(android.webkit.WebView a, int i, String s, String s0)
        {
            super.onReceivedError(a, i, s, s0);
            
            mListener.onError(new DialogError(s, i, s0));
            FbDialog.this.dismiss();
        }
        
        public boolean shouldOverrideUrlLoading(android.webkit.WebView a, String s)
        {
            int i = 0;
            StringBuilder a0 = new StringBuilder("Redirect URL: ");
            StringBuilder a1 = a0.append(s);
            String s0 = a1.toString();
            Log.d("Facebook-WebView", s0);
            if(!s.startsWith("fbconnect://success"))
            {
                if(!s.startsWith("fbconnect://cancel"))
                {
                    if(!s.contains((CharSequence)"touch"))
                    {
                        Uri connUri = Uri.parse(s);
                        
                        FbDialog.this.getContext().startActivity(new Intent("android.intent.action.VIEW", connUri));
                        i = 1;
                    }
                    else
                    {
                        i = 0;
                    }
                }
                else
                {
                    
                	mListener.onCancel();
                	FbDialog.this.dismiss();
                    i = 1;
                }
            }
            else
            {
                String s1 = null;
                android.os.Bundle a9 = org.spf.facebook.Util.parseUrl(s);
                String s2 = a9.getString("error");
                if(s2 != null)
                {
                    s1 = s2;
                }
                else
                {
                    String s3 = a9.getString("error_type");
                    s1 = s3;
                }
                label2: if(s1 != null)
                {
                    boolean b2 = s1.equals((Object)"access_denied");
                    label1: {
                        label0: {
                            if(b2)
                            {
                                break label0;
                            }
                            boolean b3 = s1.equals((Object)"OAuthAccessDeniedException");
                            if(!b3)
                            {
                                break label1;
                            }
                        }
                    mListener.onCancel();
                        break label2;
                    }
                    
                    mListener.onFacebookError(new FacebookError(s1));
                }
                else
                {
                	mListener.onComplete(a9);
                }
                FbDialog.this.dismiss();
                i = 1;
            }
            return i != 0;
        }
    }
}
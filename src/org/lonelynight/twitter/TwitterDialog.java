package org.spf.twitter;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TwitterDialog extends android.app.Dialog {
    final static float[] DIMENSIONS_LANDSCAPE;
    final static float[] DIMENSIONS_PORTRAIT;
    final static android.widget.FrameLayout.LayoutParams FILL;
    final static int MARGIN = 4;
    final static int PADDING = 2;
    private android.widget.LinearLayout mContent;
    private android.content.Context mContext;
    private TwitterApp.TwDialogListener mListener;
    private android.app.ProgressDialog mSpinner;
    private android.widget.TextView mTitle;
    private String mUrl;
    private WebView mWebView;
    private boolean progressDialogRunning;
    
    static
    {
        float[] a = new float[2];
        a[0] = 460.0f;
        a[1] = 260.0f;
        DIMENSIONS_LANDSCAPE = a;
        float[] a0 = new float[2];
        a0[0] = 280.0f;
        a0[1] = 420.0f;
        DIMENSIONS_PORTRAIT = a0;
        android.widget.FrameLayout.LayoutParams a1 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        FILL = a1;
    }
    
    public TwitterDialog(android.content.Context a, String s, TwitterApp.TwDialogListener a0)
    {
        super(a);
        Object a1 = a0;
        this.progressDialogRunning = false;
        this.mContext = a;
        this.mUrl = s;
        this.mListener = (TwitterApp.TwDialogListener)a1;
    }
    
    private void setUpTitle()
    {
        this.requestWindowFeature(1);
        android.content.Context a = this.getContext();
        android.content.res.Resources a0 = a.getResources();
        android.graphics.drawable.Drawable a1 = a0.getDrawable(2130837695);
        android.content.Context a2 = this.getContext();
        android.widget.TextView a3 = new android.widget.TextView(a2);
        this.mTitle = a3;
        android.widget.TextView a4 = this.mTitle;
        a4.setText((CharSequence)"Twitter");
        android.widget.TextView a5 = this.mTitle;
        a5.setTextColor(-1);
        android.widget.TextView a6 = this.mTitle;
        android.graphics.Typeface a7 = android.graphics.Typeface.DEFAULT_BOLD;
        a6.setTypeface(a7);
        android.widget.TextView a8 = this.mTitle;
        a8.setBackgroundColor(-4466711);
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
        TwitterDialog.TwitterWebViewClient a4 = new TwitterDialog.TwitterWebViewClient();
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
    
    public void onBackPressed()
    {
        if(!this.progressDialogRunning)
        {
            this.dismiss();
        }
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
        android.content.Context a5 = this.mContext;
        android.content.res.Resources a6 = a5.getResources();
        String s = a6.getString(2131034153);
        a4.setMessage((CharSequence)s);
        android.content.Context a7 = this.getContext();
        android.widget.LinearLayout a8 = new android.widget.LinearLayout(a7);
        this.mContent = a8;
        android.widget.LinearLayout a9 = this.mContent;
        a9.setOrientation(1);
        this.setUpTitle();
        this.setUpWebView();
        android.view.Window a10 = this.getWindow();
        Object a11 = a10.getWindowManager();
        android.view.Display a12 = ((android.view.WindowManager)a11).getDefaultDisplay();
        android.content.Context a13 = this.getContext();
        android.content.res.Resources a14 = a13.getResources();
        android.util.DisplayMetrics a15 = a14.getDisplayMetrics();
        float f = a15.density;
        int i = a12.getWidth();
        int i0 = a12.getHeight();
        if(i >= i0)
        {
            float[] a16 = DIMENSIONS_LANDSCAPE;
            a0 = a16;
        }
        else
        {
            float[] a17 = DIMENSIONS_PORTRAIT;
            a0 = a17;
        }
        android.widget.LinearLayout a18 = this.mContent;
        float f0 = a0[0];
        float f1 = f * f0;
        float f2 = 0.5f + f1;
        int i1 = (int)f2;
        float f3 = a0[1];
        float f4 = f * f3;
        float f5 = 0.5f + f4;
        int i2 = (int)f5;
        android.widget.FrameLayout.LayoutParams a19 = new android.widget.FrameLayout.LayoutParams(i1, i2);
        this.addContentView((android.view.View)a18, (android.view.ViewGroup.LayoutParams)a19);
    }
    
    protected void onStop()
    {
        this.progressDialogRunning = false;
        super.onStop();
    }
    
    class TwitterWebViewClient extends WebViewClient {
    	
    	public void onPageFinished(WebView a, String s)
        {
            super.onPageFinished(a, s);
            String s0 = mWebView.getTitle();
            if(s0 != null)
            {
                int i = s0.length();
                if(i > 0)
                {
                    mTitle.setText((CharSequence)s0);
                }
            }
            progressDialogRunning = false;
            mSpinner.dismiss();
        }
        
        public void onPageStarted(WebView a, String s, android.graphics.Bitmap a0)
        {
            super.onPageStarted(a, s, a0);
            mSpinner.show();
            progressDialogRunning = true;
        }
        
        public void onReceivedError(WebView a, int i, String s, String s0)
        {
            super.onReceivedError(a, i, s, s0);
            mListener.onError(s);
            TwitterDialog.this.dismiss();
        }
        
        public boolean shouldOverrideUrlLoading(WebView a, String s)
        {
        	if(s.startsWith("twitterapp://connect"))
            {
            	mListener.onComplete(s);
                TwitterDialog.this.dismiss();
            }
        	else
        	{
        		if(!s.startsWith("authorize"))
        			return true;
        	}
        	
        	return false;
        }
    }
}
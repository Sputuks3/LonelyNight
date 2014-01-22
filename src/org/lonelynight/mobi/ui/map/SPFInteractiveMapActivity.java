package org.spf.mobi.ui.map;

public class SPFInteractiveMapActivity extends org.spf.mobi.ui.SPFActivity implements org.spf.utils.Constants {
    public static float mPosY;
    private org.spf.mobi.ui.map.custom.SPFCustomImageView imageView;
    
    public SPFInteractiveMapActivity()
    {
        super();
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        label1: {
            Exception a0 = null;
            ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
            this.setContentView(2130903053);
            android.view.View a1 = this.findViewById(2131165246);
            android.widget.TextView dummy = (android.widget.TextView)a1;
            android.widget.TextView a2 = (android.widget.TextView)a1;
            a2.setText(2131034113);
            android.view.View a3 = this.findViewById(2131165308);
            org.spf.mobi.ui.map.custom.SPFCustomImageView dummy0 = (org.spf.mobi.ui.map.custom.SPFCustomImageView)a3;
            org.spf.mobi.ui.map.custom.SPFCustomImageView a4 = (org.spf.mobi.ui.map.custom.SPFCustomImageView)a3;
            this.imageView = a4;
            org.spf.mobi.ui.map.custom.SPFCustomImageView a5 = this.imageView;
            a5.setDrawingCacheEnabled(true);
            org.spf.mobi.ui.map.custom.SPFCustomImageView a6 = this.imageView;
            a6.loadUrl("file:///android_asset/spf_map.png");
            org.spf.mobi.ui.map.custom.SPFCustomImageView a7 = this.imageView;
            android.webkit.WebSettings a8 = a7.getSettings();
            a8.setBuiltInZoomControls(true);
            org.spf.mobi.ui.map.custom.SPFCustomImageView a9 = this.imageView;
            android.webkit.WebSettings a10 = a9.getSettings();
            a10.setSupportZoom(true);
            org.spf.mobi.ui.map.custom.SPFCustomImageView a11 = this.imageView;
            android.webkit.WebSettings a12 = a11.getSettings();
            a12.setLoadWithOverviewMode(true);
            org.spf.mobi.ui.map.custom.SPFCustomImageView a13 = this.imageView;
            android.webkit.WebSettings a14 = a13.getSettings();
            a14.setUseWideViewPort(true);
            label0: {
                try
                {
                    android.content.res.Resources a15 = this.getResources();
                    android.graphics.Bitmap a16 = android.graphics.BitmapFactory.decodeResource(a15, 2130837668);
                    int i = a16.getWidth();
                    int i0 = a16.getHeight();
                    float f = (float)200;
                    float f0 = (float)i;
                    float f1 = f / f0;
                    float f2 = (float)200;
                    float f3 = (float)i0;
                    float f4 = f2 / f3;
                    StringBuilder a17 = new StringBuilder("scaleWidth");
                    StringBuilder a18 = a17.append(f1);
                    String s = a18.toString();
                    android.util.Log.d("SPF ", s);
                    StringBuilder a19 = new StringBuilder("scaleHeight");
                    StringBuilder a20 = a19.append(f4);
                    String s0 = a20.toString();
                    android.util.Log.d("SPF ", s0);
                    android.graphics.Matrix a21 = new android.graphics.Matrix();
                    a21.postScale(f1, f4);
                    android.graphics.Bitmap a22 = android.graphics.Bitmap.createBitmap(a16, 0, 0, i, i0, a21, true);
                    StringBuilder a23 = new StringBuilder("resized");
                    StringBuilder a24 = a23.append((Object)a22);
                    String s1 = a24.toString();
                    android.util.Log.d("SPF ", s1);
                }
                catch(Exception a25)
                {
                    a0 = a25;
                    break label0;
                }
                break label1;
            }
            a0.printStackTrace();
        }
    }
}
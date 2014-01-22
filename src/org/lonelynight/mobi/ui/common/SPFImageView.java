package org.spf.mobi.ui.common;

public class SPFImageView extends org.spf.mobi.ui.SPFActivity {
    android.graphics.Bitmap bmp;
    private org.spf.mobi.ui.common.SimpleZoomListener mZoomListener;
    private org.spf.mobi.ui.common.ZoomState mZoomState;
    private org.spf.mobi.ui.common.ImageZoomView mZoomView;
    
    public SPFImageView()
    {
        super();
        this.bmp = null;
    }
    
    private void resetZoomState()
    {
        org.spf.mobi.ui.common.ZoomState a = this.mZoomState;
        a.setPanX(0.5f);
        org.spf.mobi.ui.common.ZoomState a0 = this.mZoomState;
        a0.setPanY(0.5f);
        org.spf.mobi.ui.common.ZoomState a1 = this.mZoomState;
        a1.setZoom(1.0f);
        org.spf.mobi.ui.common.ZoomState a2 = this.mZoomState;
        a2.notifyObservers();
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        this.setContentView(2130903050);
        ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
        android.content.Intent a0 = this.getIntent();
        byte[] a1 = a0.getByteArrayExtra("IMAGE");
        android.graphics.Bitmap a2 = this.bmp;
        if(a2 == null)
        {
            int i = a1.length;
            android.graphics.Bitmap a3 = android.graphics.BitmapFactory.decodeByteArray(a1, 0, i);
            this.bmp = a3;
        }
        org.spf.mobi.ui.common.ZoomState a4 = new org.spf.mobi.ui.common.ZoomState();
        this.mZoomState = a4;
        org.spf.mobi.ui.common.SimpleZoomListener a5 = new org.spf.mobi.ui.common.SimpleZoomListener();
        this.mZoomListener = a5;
        org.spf.mobi.ui.common.SimpleZoomListener a6 = this.mZoomListener;
        org.spf.mobi.ui.common.ZoomState a7 = this.mZoomState;
        a6.setZoomState(a7);
        android.view.View a8 = this.findViewById(2131165255);
        org.spf.mobi.ui.common.ImageZoomView dummy = (org.spf.mobi.ui.common.ImageZoomView)a8;
        org.spf.mobi.ui.common.ImageZoomView a9 = (org.spf.mobi.ui.common.ImageZoomView)a8;
        this.mZoomView = a9;
        org.spf.mobi.ui.common.ImageZoomView a10 = this.mZoomView;
        android.graphics.Bitmap a11 = this.bmp;
        a10.setImage(a11);
        org.spf.mobi.ui.common.ImageZoomView a12 = this.mZoomView;
        org.spf.mobi.ui.common.ZoomState a13 = this.mZoomState;
        a12.setZoomState(a13);
        org.spf.mobi.ui.common.ImageZoomView a14 = this.mZoomView;
        org.spf.mobi.ui.common.SimpleZoomListener a15 = this.mZoomListener;
        a14.setOnTouchListener((android.view.View.OnTouchListener)a15);
        this.resetZoomState();
        android.graphics.Bitmap a16 = this.bmp;
        if(a16 != null)
        {
            android.view.View a17 = this.findViewById(2131165255);
            org.spf.mobi.ui.common.ImageZoomView dummy0 = (org.spf.mobi.ui.common.ImageZoomView)a17;
            org.spf.mobi.ui.common.ImageZoomView a18 = (org.spf.mobi.ui.common.ImageZoomView)a17;
            android.graphics.Bitmap a19 = this.bmp;
            a18.setImage(a19);
        }
    }
}
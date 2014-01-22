package org.spf.mobi.ui.common;

public class ImageZoomView extends android.view.View implements java.util.Observer {
    private float mAspectQuotient;
    private android.graphics.Bitmap mBitmap;
    final private android.graphics.Paint mPaint;
    final private android.graphics.Rect mRectDst;
    final private android.graphics.Rect mRectSrc;
    private org.spf.mobi.ui.common.ZoomState mState;
    
    public ImageZoomView(android.content.Context a, android.util.AttributeSet a0)
    {
        super(a, a0);
        android.graphics.Paint a1 = new android.graphics.Paint(2);
        this.mPaint = a1;
        android.graphics.Rect a2 = new android.graphics.Rect();
        this.mRectSrc = a2;
        android.graphics.Rect a3 = new android.graphics.Rect();
        this.mRectDst = a3;
    }
    
    private void calculateAspectQuotient()
    {
        android.graphics.Bitmap a = this.mBitmap;
        if(a != null)
        {
            android.graphics.Bitmap a0 = this.mBitmap;
            int i = a0.getWidth();
            float f = (float)i;
            android.graphics.Bitmap a1 = this.mBitmap;
            int i0 = a1.getHeight();
            float f0 = (float)i0;
            float f1 = f / f0;
            int i1 = this.getWidth();
            float f2 = (float)i1;
            int i2 = this.getHeight();
            float f3 = (float)i2;
            float f4 = f2 / f3;
            float f5 = f1 / f4;
            this.mAspectQuotient = f5;
        }
    }
    
    protected void onDraw(android.graphics.Canvas a)
    {
        android.graphics.Bitmap a0 = this.mBitmap;
        if(a0 != null)
        {
            org.spf.mobi.ui.common.ZoomState a1 = this.mState;
            if(a1 != null)
            {
                int i = this.getWidth();
                int i0 = this.getHeight();
                android.graphics.Bitmap a2 = this.mBitmap;
                int i1 = a2.getWidth();
                android.graphics.Bitmap a3 = this.mBitmap;
                int i2 = a3.getHeight();
                org.spf.mobi.ui.common.ZoomState a4 = this.mState;
                float f = a4.getPanX();
                org.spf.mobi.ui.common.ZoomState a5 = this.mState;
                float f0 = a5.getPanY();
                org.spf.mobi.ui.common.ZoomState a6 = this.mState;
                float f1 = this.mAspectQuotient;
                float f2 = a6.getZoomX(f1);
                float f3 = (float)i;
                float f4 = f2 * f3;
                float f5 = (float)i1;
                float f6 = f4 / f5;
                org.spf.mobi.ui.common.ZoomState a7 = this.mState;
                float f7 = this.mAspectQuotient;
                float f8 = a7.getZoomY(f7);
                float f9 = (float)i0;
                float f10 = f8 * f9;
                float f11 = (float)i2;
                float f12 = f10 / f11;
                android.graphics.Rect a8 = this.mRectSrc;
                float f13 = (float)i1;
                float f14 = f * f13;
                float f15 = (float)i;
                float f16 = f6 * 2.0f;
                float f17 = f15 / f16;
                float f18 = f14 - f17;
                int i3 = (int)f18;
                a8.left = i3;
                android.graphics.Rect a9 = this.mRectSrc;
                float f19 = (float)i2;
                float f20 = f0 * f19;
                float f21 = (float)i0;
                float f22 = f12 * 2.0f;
                float f23 = f21 / f22;
                float f24 = f20 - f23;
                int i4 = (int)f24;
                a9.top = i4;
                android.graphics.Rect a10 = this.mRectSrc;
                android.graphics.Rect a11 = this.mRectSrc;
                int i5 = a11.left;
                float f25 = (float)i5;
                float f26 = (float)i;
                float f27 = f26 / f6;
                float f28 = f25 + f27;
                int i6 = (int)f28;
                a10.right = i6;
                android.graphics.Rect a12 = this.mRectSrc;
                android.graphics.Rect a13 = this.mRectSrc;
                int i7 = a13.top;
                float f29 = (float)i7;
                float f30 = (float)i0;
                float f31 = f30 / f12;
                float f32 = f29 + f31;
                int i8 = (int)f32;
                a12.bottom = i8;
                android.graphics.Rect a14 = this.mRectDst;
                int i9 = this.getLeft();
                a14.left = i9;
                android.graphics.Rect a15 = this.mRectDst;
                int i10 = this.getTop();
                a15.top = i10;
                android.graphics.Rect a16 = this.mRectDst;
                int i11 = this.getRight();
                a16.right = i11;
                android.graphics.Rect a17 = this.mRectDst;
                int i12 = this.getBottom();
                a17.bottom = i12;
                android.graphics.Rect a18 = this.mRectSrc;
                int i13 = a18.left;
                if(i13 < 0)
                {
                    android.graphics.Rect a19 = this.mRectDst;
                    int i14 = a19.left;
                    float f33 = (float)i14;
                    android.graphics.Rect a20 = this.mRectSrc;
                    int i15 = a20.left;
                    int i16 = 0 - i15;
                    float f34 = (float)i16;
                    float f35 = f6 * f34;
                    float f36 = f33 + f35;
                    int i17 = (int)f36;
                    a19.left = i17;
                    android.graphics.Rect a21 = this.mRectSrc;
                    a21.left = 0;
                }
                android.graphics.Rect a22 = this.mRectSrc;
                int i18 = a22.right;
                if(i18 > i1)
                {
                    android.graphics.Rect a23 = this.mRectDst;
                    int i19 = a23.right;
                    float f37 = (float)i19;
                    android.graphics.Rect a24 = this.mRectSrc;
                    int i20 = a24.right;
                    int i21 = i20 - i1;
                    float f38 = (float)i21;
                    float f39 = f6 * f38;
                    float f40 = f37 - f39;
                    int i22 = (int)f40;
                    a23.right = i22;
                    android.graphics.Rect a25 = this.mRectSrc;
                    a25.right = i1;
                }
                android.graphics.Rect a26 = this.mRectSrc;
                int i23 = a26.top;
                if(i23 < 0)
                {
                    android.graphics.Rect a27 = this.mRectDst;
                    int i24 = a27.top;
                    float f41 = (float)i24;
                    android.graphics.Rect a28 = this.mRectSrc;
                    int i25 = a28.top;
                    int i26 = 0 - i25;
                    float f42 = (float)i26;
                    float f43 = f12 * f42;
                    float f44 = f41 + f43;
                    int i27 = (int)f44;
                    a27.top = i27;
                    android.graphics.Rect a29 = this.mRectSrc;
                    a29.top = 0;
                }
                android.graphics.Rect a30 = this.mRectSrc;
                int i28 = a30.bottom;
                if(i28 > i2)
                {
                    android.graphics.Rect a31 = this.mRectDst;
                    int i29 = a31.bottom;
                    float f45 = (float)i29;
                    android.graphics.Rect a32 = this.mRectSrc;
                    int i30 = a32.bottom;
                    int i31 = i30 - i2;
                    float f46 = (float)i31;
                    float f47 = f12 * f46;
                    float f48 = f45 - f47;
                    int i32 = (int)f48;
                    a31.bottom = i32;
                    android.graphics.Rect a33 = this.mRectSrc;
                    a33.bottom = i2;
                }
                android.graphics.Bitmap a34 = this.mBitmap;
                android.graphics.Rect a35 = this.mRectSrc;
                android.graphics.Rect a36 = this.mRectDst;
                android.graphics.Paint a37 = this.mPaint;
                a.drawBitmap(a34, a35, a36, a37);
            }
        }
    }
    
    protected void onLayout(boolean b, int i, int i0, int i1, int i2)
    {
        ((android.view.View)this).onLayout(b, i, i0, i1, i2);
        this.calculateAspectQuotient();
    }
    
    public void setImage(android.graphics.Bitmap a)
    {
        this.mBitmap = a;
        this.calculateAspectQuotient();
        this.invalidate();
    }
    
    public void setZoomState(org.spf.mobi.ui.common.ZoomState a)
    {
        org.spf.mobi.ui.common.ZoomState a0 = this.mState;
        if(a0 != null)
        {
            org.spf.mobi.ui.common.ZoomState a1 = this.mState;
            a1.deleteObserver((java.util.Observer)this);
        }
        this.mState = a;
        org.spf.mobi.ui.common.ZoomState a2 = this.mState;
        a2.addObserver((java.util.Observer)this);
        this.invalidate();
    }
    
    public void update(java.util.Observable a, Object a0)
    {
        this.invalidate();
    }
}
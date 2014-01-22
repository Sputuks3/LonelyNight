package org.spf.mobi.ui.common;

public class SimpleZoomListener implements android.view.View.OnTouchListener {
    private org.spf.mobi.ui.common.SimpleZoomListener.ControlType mControlType;
    private org.spf.mobi.ui.common.ZoomState mState;
    private float mX;
    private float mY;
    
    public SimpleZoomListener()
    {
        super();
        org.spf.mobi.ui.common.SimpleZoomListener.ControlType a = org.spf.mobi.ui.common.SimpleZoomListener.ControlType.ZOOM;
        this.mControlType = a;
    }
    
    public boolean onTouch(android.view.View a, android.view.MotionEvent a0)
    {
        int i = a0.getAction();
        float f = a0.getX();
        float f0 = a0.getY();
        switch(i){
            case 2: {
                float f1 = this.mX;
                float f2 = f - f1;
                int i0 = a.getWidth();
                float f3 = (float)i0;
                float f4 = f2 / f3;
                float f5 = this.mY;
                float f6 = f0 - f5;
                int i1 = a.getHeight();
                float f7 = (float)i1;
                float f8 = f6 / f7;
                org.spf.mobi.ui.common.SimpleZoomListener.ControlType a1 = this.mControlType;
                org.spf.mobi.ui.common.SimpleZoomListener.ControlType a2 = org.spf.mobi.ui.common.SimpleZoomListener.ControlType.ZOOM;
                if(a1 != a2)
                {
                    org.spf.mobi.ui.common.ZoomState a3 = this.mState;
                    org.spf.mobi.ui.common.ZoomState a4 = this.mState;
                    float f9 = a4.getPanX();
                    float f10 = f9 - f4;
                    a3.setPanX(f10);
                    org.spf.mobi.ui.common.ZoomState a5 = this.mState;
                    org.spf.mobi.ui.common.ZoomState a6 = this.mState;
                    float f11 = a6.getPanY();
                    float f12 = f11 - f8;
                    a5.setPanY(f12);
                    org.spf.mobi.ui.common.ZoomState a7 = this.mState;
                    a7.notifyObservers();
                }
                else
                {
                    org.spf.mobi.ui.common.ZoomState a8 = this.mState;
                    org.spf.mobi.ui.common.ZoomState a9 = this.mState;
                    float f13 = a9.getZoom();
                    float f14 = -f8;
                    double d = (double)f14;
                    double d0 = Math.pow(20.0, d);
                    float f15 = (float)d0;
                    float f16 = f13 * f15;
                    a8.setZoom(f16);
                    org.spf.mobi.ui.common.ZoomState a10 = this.mState;
                    a10.notifyObservers();
                }
                this.mX = f;
                this.mY = f0;
                break;
            }
            case 0: {
                this.mX = f;
                this.mY = f0;
                break;
            }
        }
        return true;
    }
    
    public void setControlType(org.spf.mobi.ui.common.SimpleZoomListener.ControlType a)
    {
        this.mControlType = a;
    }
    
    public void setZoomState(org.spf.mobi.ui.common.ZoomState a)
    {
        this.mState = a;
    }
}
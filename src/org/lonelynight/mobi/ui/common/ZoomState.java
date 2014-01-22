package org.spf.mobi.ui.common;

public class ZoomState extends java.util.Observable {
    private float mPanX;
    private float mPanY;
    private float mZoom;
    
    public ZoomState()
    {
        super();
    }
    
    public float getPanX()
    {
        float f = this.mPanX;
        return f;
    }
    
    public float getPanY()
    {
        float f = this.mPanY;
        return f;
    }
    
    public float getZoom()
    {
        float f = this.mZoom;
        return f;
    }
    
    public float getZoomX(float f)
    {
        float f0 = this.mZoom;
        float f1 = this.mZoom;
        float f2 = f * f1;
        float f3 = Math.min(f0, f2);
        return f3;
    }
    
    public float getZoomY(float f)
    {
        float f0 = this.mZoom;
        float f1 = this.mZoom;
        float f2 = f1 / f;
        float f3 = Math.min(f0, f2);
        return f3;
    }
    
    public void setPanX(float f)
    {
        float f0 = this.mPanX;
        int i = f > f0?1:f == f0?0:-1;
        if(i != 0)
        {
            this.mPanX = f;
            this.setChanged();
        }
    }
    
    public void setPanY(float f)
    {
        float f0 = this.mPanY;
        int i = f > f0?1:f == f0?0:-1;
        if(i != 0)
        {
            this.mPanY = f;
            this.setChanged();
        }
    }
    
    public void setZoom(float f)
    {
        float f0 = this.mZoom;
        int i = f > f0?1:f == f0?0:-1;
        if(i != 0)
        {
            this.mZoom = f;
            this.setChanged();
        }
    }
}
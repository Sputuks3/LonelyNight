package org.spf.utils.gps;

public class SPFGpsModule {
    private String bestProvider;
    private android.location.Location cachedLocation;
    private org.spf.utils.gps.SPFGpsModule.SPFLocationListener instance;
    private android.content.Context mContext;
    private android.os.Handler mHandler;
    private org.spf.utils.gps.SPFFoundLocation mRequestor;
    private android.location.LocationManager manager;
    private Thread thread;
    
    public SPFGpsModule(android.content.Context a, android.os.Handler a0, org.spf.utils.gps.SPFFoundLocation a1)
    {
        super();
        Object a2 = a1;
        this.cachedLocation = null;
        this.mContext = a;
        this.mHandler = a0;
        this.mRequestor = (org.spf.utils.gps.SPFFoundLocation)a2;
        boolean b = org.spf.utils.Utils.isDebugMode((android.app.Activity)null);
        if(b)
        {
            android.location.Location a3 = new android.location.Location("Custom Location");
            a3.setLatitude(1.3321386);
            a3.setLongitude(103.8976058);
            this.cachedLocation = a3;
            android.util.Log.d("Location from Debug", "Debug Location");
        }
        android.os.Handler a4 = this.mHandler;
        org.spf.utils.gps.SPFGpsModule.1 a5 = new org.spf.utils.gps.SPFGpsModule.1(this);
        a4.post((Runnable)a5);
    }
    
    static org.spf.utils.gps.SPFFoundLocation access$0(org.spf.utils.gps.SPFGpsModule a)
    {
        Object a0 = a.mRequestor;
        return (org.spf.utils.gps.SPFFoundLocation)a0;
    }
    
    static android.location.LocationManager access$1(org.spf.utils.gps.SPFGpsModule a)
    {
        android.location.LocationManager a0 = a.manager;
        return a0;
    }
    
    static void access$10(org.spf.utils.gps.SPFGpsModule a, org.spf.utils.gps.SPFGpsModule.SPFLocationListener a0)
    {
        a.instance = a0;
    }
    
    static org.spf.utils.gps.SPFGpsModule.SPFLocationListener access$11(org.spf.utils.gps.SPFGpsModule a)
    {
        org.spf.utils.gps.SPFGpsModule.SPFLocationListener a0 = a.instance;
        return a0;
    }
    
    static void access$12(org.spf.utils.gps.SPFGpsModule a, Thread a0)
    {
        a.thread = a0;
    }
    
    static Thread access$2(org.spf.utils.gps.SPFGpsModule a)
    {
        Thread a0 = a.thread;
        return a0;
    }
    
    static android.os.Handler access$3(org.spf.utils.gps.SPFGpsModule a)
    {
        android.os.Handler a0 = a.mHandler;
        return a0;
    }
    
    static String access$4(org.spf.utils.gps.SPFGpsModule a)
    {
        String s = a.bestProvider;
        return s;
    }
    
    static void access$5(org.spf.utils.gps.SPFGpsModule a, android.location.Location a0)
    {
        a.cachedLocation = a0;
    }
    
    static android.location.Location access$6(org.spf.utils.gps.SPFGpsModule a)
    {
        android.location.Location a0 = a.cachedLocation;
        return a0;
    }
    
    static android.content.Context access$7(org.spf.utils.gps.SPFGpsModule a)
    {
        android.content.Context a0 = a.mContext;
        return a0;
    }
    
    static void access$8(org.spf.utils.gps.SPFGpsModule a, android.location.LocationManager a0)
    {
        a.manager = a0;
    }
    
    static void access$9(org.spf.utils.gps.SPFGpsModule a, String s)
    {
        a.bestProvider = s;
    }
}
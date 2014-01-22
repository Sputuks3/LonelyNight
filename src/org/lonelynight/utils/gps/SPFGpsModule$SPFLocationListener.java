package org.spf.utils.gps;

class SPFLocationListener implements android.location.LocationListener {
    final org.spf.utils.gps.SPFGpsModule this$0;
    
    private SPFLocationListener(org.spf.utils.gps.SPFGpsModule a)
    {
        this.this$0 = a;
        super();
    }
    
    SPFLocationListener(org.spf.utils.gps.SPFGpsModule a, org.spf.utils.gps.SPFGpsModule.SPFLocationListener a0)
    {
        this(a);
    }
    
    static org.spf.utils.gps.SPFGpsModule access$1(org.spf.utils.gps.SPFGpsModule.SPFLocationListener a)
    {
        org.spf.utils.gps.SPFGpsModule a0 = a.this$0;
        return a0;
    }
    
    public void onLocationChanged(android.location.Location a)
    {
        org.spf.utils.gps.SPFGpsModule a0 = this.this$0;
        Object a1 = org.spf.utils.gps.SPFGpsModule.access$0(a0);
        ((org.spf.utils.gps.SPFFoundLocation)a1).locationFound(a);
        org.spf.utils.gps.SPFGpsModule a2 = this.this$0;
        android.location.LocationManager a3 = org.spf.utils.gps.SPFGpsModule.access$1(a2);
        a3.removeUpdates((android.location.LocationListener)this);
        org.spf.utils.gps.SPFGpsModule a4 = this.this$0;
        Thread a5 = org.spf.utils.gps.SPFGpsModule.access$2(a4);
        a5.interrupt();
    }
    
    public void onProviderDisabled(String s)
    {
        org.spf.utils.gps.SPFGpsModule a = this.this$0;
        Object a0 = org.spf.utils.gps.SPFGpsModule.access$0(a);
        ((org.spf.utils.gps.SPFFoundLocation)a0).locationError("Location provider Disabled");
        org.spf.utils.gps.SPFGpsModule a1 = this.this$0;
        android.location.LocationManager a2 = org.spf.utils.gps.SPFGpsModule.access$1(a1);
        a2.removeUpdates((android.location.LocationListener)this);
        org.spf.utils.gps.SPFGpsModule a3 = this.this$0;
        Thread a4 = org.spf.utils.gps.SPFGpsModule.access$2(a3);
        a4.interrupt();
    }
    
    public void onProviderEnabled(String s)
    {
    }
    
    public void onStatusChanged(String s, int i, android.os.Bundle a)
    {
        label1: {
            label0: {
                if(i == 0)
                {
                    break label0;
                }
                if(i != 1)
                {
                    break label1;
                }
            }
            org.spf.utils.gps.SPFGpsModule a0 = this.this$0;
            Thread a1 = org.spf.utils.gps.SPFGpsModule.access$2(a0);
            a1.interrupt();
            org.spf.utils.gps.SPFGpsModule a2 = this.this$0;
            android.os.Handler a3 = org.spf.utils.gps.SPFGpsModule.access$3(a2);
            org.spf.utils.gps.SPFGpsModule.SPFLocationListener.1 a4 = new org.spf.utils.gps.SPFGpsModule.SPFLocationListener.1(this);
            a3.post((Runnable)a4);
        }
    }
}
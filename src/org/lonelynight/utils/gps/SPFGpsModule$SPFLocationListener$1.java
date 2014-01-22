package org.spf.utils.gps;

class 1 implements Runnable {
    final org.spf.utils.gps.SPFGpsModule.SPFLocationListener this$1;
    
    1(org.spf.utils.gps.SPFGpsModule.SPFLocationListener a)
    {
        this.this$1 = a;
        super();
    }
    
    public void run()
    {
        org.spf.utils.gps.SPFGpsModule.SPFLocationListener a = this.this$1;
        org.spf.utils.gps.SPFGpsModule a0 = org.spf.utils.gps.SPFGpsModule.SPFLocationListener.access$1(a);
        org.spf.utils.gps.SPFGpsModule.SPFLocationListener a1 = this.this$1;
        org.spf.utils.gps.SPFGpsModule a2 = org.spf.utils.gps.SPFGpsModule.SPFLocationListener.access$1(a1);
        android.location.LocationManager a3 = org.spf.utils.gps.SPFGpsModule.access$1(a2);
        org.spf.utils.gps.SPFGpsModule.SPFLocationListener a4 = this.this$1;
        org.spf.utils.gps.SPFGpsModule a5 = org.spf.utils.gps.SPFGpsModule.SPFLocationListener.access$1(a4);
        String s = org.spf.utils.gps.SPFGpsModule.access$4(a5);
        android.location.Location a6 = a3.getLastKnownLocation(s);
        org.spf.utils.gps.SPFGpsModule.access$5(a0, a6);
        org.spf.utils.gps.SPFGpsModule.SPFLocationListener a7 = this.this$1;
        org.spf.utils.gps.SPFGpsModule a8 = org.spf.utils.gps.SPFGpsModule.SPFLocationListener.access$1(a7);
        android.location.Location a9 = org.spf.utils.gps.SPFGpsModule.access$6(a8);
        if(a9 != null)
        {
            org.spf.utils.gps.SPFGpsModule.SPFLocationListener a10 = this.this$1;
            org.spf.utils.gps.SPFGpsModule a11 = org.spf.utils.gps.SPFGpsModule.SPFLocationListener.access$1(a10);
            Object a12 = org.spf.utils.gps.SPFGpsModule.access$0(a11);
            org.spf.utils.gps.SPFGpsModule.SPFLocationListener a13 = this.this$1;
            org.spf.utils.gps.SPFGpsModule a14 = org.spf.utils.gps.SPFGpsModule.SPFLocationListener.access$1(a13);
            android.location.Location a15 = org.spf.utils.gps.SPFGpsModule.access$6(a14);
            ((org.spf.utils.gps.SPFFoundLocation)a12).locationFound(a15);
        }
        else
        {
            org.spf.utils.gps.SPFGpsModule.SPFLocationListener a16 = this.this$1;
            org.spf.utils.gps.SPFGpsModule a17 = org.spf.utils.gps.SPFGpsModule.SPFLocationListener.access$1(a16);
            Object a18 = org.spf.utils.gps.SPFGpsModule.access$0(a17);
            ((org.spf.utils.gps.SPFFoundLocation)a18).locationError("Location not available at the moment");
            org.spf.utils.gps.SPFGpsModule.SPFLocationListener a19 = this.this$1;
            org.spf.utils.gps.SPFGpsModule a20 = org.spf.utils.gps.SPFGpsModule.SPFLocationListener.access$1(a19);
            android.location.LocationManager a21 = org.spf.utils.gps.SPFGpsModule.access$1(a20);
            org.spf.utils.gps.SPFGpsModule.SPFLocationListener a22 = this.this$1;
            a21.removeUpdates((android.location.LocationListener)a22);
        }
    }
}
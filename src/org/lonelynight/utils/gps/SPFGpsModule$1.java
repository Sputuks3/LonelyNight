package org.spf.utils.gps;

class 1 implements Runnable {
    final org.spf.utils.gps.SPFGpsModule this$0;
    
    1(org.spf.utils.gps.SPFGpsModule a)
    {
        this.this$0 = a;
        super();
    }
    
    static org.spf.utils.gps.SPFGpsModule access$0(org.spf.utils.gps.SPFGpsModule.1 a)
    {
        org.spf.utils.gps.SPFGpsModule a0 = a.this$0;
        return a0;
    }
    
    public void run()
    {
        org.spf.utils.gps.SPFGpsModule a = this.this$0;
        org.spf.utils.gps.SPFGpsModule a0 = this.this$0;
        android.content.Context a1 = org.spf.utils.gps.SPFGpsModule.access$7(a0);
        Object a2 = a1.getSystemService("location");
        android.location.LocationManager dummy = (android.location.LocationManager)a2;
        android.location.LocationManager a3 = (android.location.LocationManager)a2;
        org.spf.utils.gps.SPFGpsModule.access$8(a, a3);
        android.location.Criteria a4 = new android.location.Criteria();
        org.spf.utils.gps.SPFGpsModule a5 = this.this$0;
        org.spf.utils.gps.SPFGpsModule a6 = this.this$0;
        android.location.LocationManager a7 = org.spf.utils.gps.SPFGpsModule.access$1(a6);
        String s = a7.getBestProvider(a4, true);
        org.spf.utils.gps.SPFGpsModule.access$9(a5, s);
        StringBuilder a8 = new StringBuilder("bestProvider::::::");
        org.spf.utils.gps.SPFGpsModule a9 = this.this$0;
        String s0 = org.spf.utils.gps.SPFGpsModule.access$4(a9);
        StringBuilder a10 = a8.append(s0);
        String s1 = a10.toString();
        android.util.Log.e("SPF", s1);
        org.spf.utils.gps.SPFGpsModule a11 = this.this$0;
        String s2 = org.spf.utils.gps.SPFGpsModule.access$4(a11);
        if(s2 == null)
        {
            android.util.Log.e("SPF", "Null procedure");
            org.spf.utils.gps.SPFGpsModule a12 = this.this$0;
            Object a13 = org.spf.utils.gps.SPFGpsModule.access$0(a12);
            ((org.spf.utils.gps.SPFFoundLocation)a13).locationError("PROVIDER_NULL");
        }
        else
        {
            org.spf.utils.gps.SPFGpsModule a14 = this.this$0;
            android.location.LocationManager a15 = org.spf.utils.gps.SPFGpsModule.access$1(a14);
            org.spf.utils.gps.SPFGpsModule a16 = this.this$0;
            String s3 = org.spf.utils.gps.SPFGpsModule.access$4(a16);
            org.spf.utils.gps.SPFGpsModule a17 = this.this$0;
            org.spf.utils.gps.SPFGpsModule a18 = this.this$0;
            org.spf.utils.gps.SPFGpsModule.SPFLocationListener a19 = new org.spf.utils.gps.SPFGpsModule.SPFLocationListener(a18, (org.spf.utils.gps.SPFGpsModule.SPFLocationListener)null);
            org.spf.utils.gps.SPFGpsModule.access$10(a17, a19);
            a15.requestLocationUpdates(s3, 0L, 0.0f, (android.location.LocationListener)a19);
            android.util.Log.e("SPF", "Not null procedure");
            org.spf.utils.gps.SPFGpsModule a20 = this.this$0;
            org.spf.utils.gps.SPFGpsModule.1.1 a21 = new org.spf.utils.gps.SPFGpsModule.1.1(this);
            org.spf.utils.gps.SPFGpsModule.access$12(a20, (Thread)a21);
            org.spf.utils.gps.SPFGpsModule a22 = this.this$0;
            Thread a23 = org.spf.utils.gps.SPFGpsModule.access$2(a22);
            a23.start();
        }
    }
}
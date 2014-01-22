package org.spf.utils.gps;

class 1 implements Runnable {
    final org.spf.utils.gps.SPFGpsModule.1.1 this$2;
    
    1(org.spf.utils.gps.SPFGpsModule.1.1 a)
    {
        this.this$2 = a;
        super();
    }
    
    public void run()
    {
        label3: {
            org.spf.utils.gps.SPFGpsModule.1.1 a = this.this$2;
            org.spf.utils.gps.SPFGpsModule.1 a0 = org.spf.utils.gps.SPFGpsModule.1.1.access$1(a);
            org.spf.utils.gps.SPFGpsModule a1 = org.spf.utils.gps.SPFGpsModule.1.access$0(a0);
            android.location.Location a2 = org.spf.utils.gps.SPFGpsModule.access$6(a1);
            if(a2 == null)
            {
                org.spf.utils.gps.SPFGpsModule.1.1 a3 = this.this$2;
                org.spf.utils.gps.SPFGpsModule.1 a4 = org.spf.utils.gps.SPFGpsModule.1.1.access$1(a3);
                org.spf.utils.gps.SPFGpsModule a5 = org.spf.utils.gps.SPFGpsModule.1.access$0(a4);
                org.spf.utils.gps.SPFGpsModule.1.1 a6 = this.this$2;
                org.spf.utils.gps.SPFGpsModule.1 a7 = org.spf.utils.gps.SPFGpsModule.1.1.access$1(a6);
                org.spf.utils.gps.SPFGpsModule a8 = org.spf.utils.gps.SPFGpsModule.1.access$0(a7);
                android.location.LocationManager a9 = org.spf.utils.gps.SPFGpsModule.access$1(a8);
                org.spf.utils.gps.SPFGpsModule.1.1 a10 = this.this$2;
                org.spf.utils.gps.SPFGpsModule.1 a11 = org.spf.utils.gps.SPFGpsModule.1.1.access$1(a10);
                org.spf.utils.gps.SPFGpsModule a12 = org.spf.utils.gps.SPFGpsModule.1.access$0(a11);
                String s = org.spf.utils.gps.SPFGpsModule.access$4(a12);
                android.location.Location a13 = a9.getLastKnownLocation(s);
                org.spf.utils.gps.SPFGpsModule.access$5(a5, a13);
            }
            org.spf.utils.gps.SPFGpsModule.1.1 a14 = this.this$2;
            org.spf.utils.gps.SPFGpsModule.1 a15 = org.spf.utils.gps.SPFGpsModule.1.1.access$1(a14);
            org.spf.utils.gps.SPFGpsModule a16 = org.spf.utils.gps.SPFGpsModule.1.access$0(a15);
            android.location.Location a17 = org.spf.utils.gps.SPFGpsModule.access$6(a16);
            label2: {
                label1: {
                    label0: {
                        if(a17 != null)
                        {
                            break label0;
                        }
                        org.spf.utils.gps.SPFGpsModule.1.1 a18 = this.this$2;
                        org.spf.utils.gps.SPFGpsModule.1 a19 = org.spf.utils.gps.SPFGpsModule.1.1.access$1(a18);
                        org.spf.utils.gps.SPFGpsModule a20 = org.spf.utils.gps.SPFGpsModule.1.access$0(a19);
                        Thread a21 = org.spf.utils.gps.SPFGpsModule.access$2(a20);
                        boolean b = a21.isInterrupted();
                        if(b)
                        {
                            break label0;
                        }
                        org.spf.utils.gps.SPFGpsModule.1.1 a22 = this.this$2;
                        org.spf.utils.gps.SPFGpsModule.1 a23 = org.spf.utils.gps.SPFGpsModule.1.1.access$1(a22);
                        org.spf.utils.gps.SPFGpsModule a24 = org.spf.utils.gps.SPFGpsModule.1.access$0(a23);
                        Object a25 = org.spf.utils.gps.SPFGpsModule.access$0(a24);
                        ((org.spf.utils.gps.SPFFoundLocation)a25).locationError("Location not available at the moment");
                        org.spf.utils.gps.SPFGpsModule.1.1 a26 = this.this$2;
                        org.spf.utils.gps.SPFGpsModule.1 a27 = org.spf.utils.gps.SPFGpsModule.1.1.access$1(a26);
                        org.spf.utils.gps.SPFGpsModule a28 = org.spf.utils.gps.SPFGpsModule.1.access$0(a27);
                        android.location.LocationManager a29 = org.spf.utils.gps.SPFGpsModule.access$1(a28);
                        org.spf.utils.gps.SPFGpsModule.1.1 a30 = this.this$2;
                        org.spf.utils.gps.SPFGpsModule.SPFLocationListener a31 = org.spf.utils.gps.SPFGpsModule.1.1.access$0(a30);
                        a29.removeUpdates((android.location.LocationListener)a31);
                        break label1;
                    }
                    org.spf.utils.gps.SPFGpsModule.1.1 a32 = this.this$2;
                    org.spf.utils.gps.SPFGpsModule.1 a33 = org.spf.utils.gps.SPFGpsModule.1.1.access$1(a32);
                    org.spf.utils.gps.SPFGpsModule a34 = org.spf.utils.gps.SPFGpsModule.1.access$0(a33);
                    android.location.Location a35 = org.spf.utils.gps.SPFGpsModule.access$6(a34);
                    if(a35 == null)
                    {
                        break label1;
                    }
                    org.spf.utils.gps.SPFGpsModule.1.1 a36 = this.this$2;
                    org.spf.utils.gps.SPFGpsModule.1 a37 = org.spf.utils.gps.SPFGpsModule.1.1.access$1(a36);
                    org.spf.utils.gps.SPFGpsModule a38 = org.spf.utils.gps.SPFGpsModule.1.access$0(a37);
                    Thread a39 = org.spf.utils.gps.SPFGpsModule.access$2(a38);
                    boolean b0 = a39.isInterrupted();
                    if(!b0)
                    {
                        break label2;
                    }
                }
                break label3;
            }
            org.spf.utils.gps.SPFGpsModule.1.1 a40 = this.this$2;
            org.spf.utils.gps.SPFGpsModule.1 a41 = org.spf.utils.gps.SPFGpsModule.1.1.access$1(a40);
            org.spf.utils.gps.SPFGpsModule a42 = org.spf.utils.gps.SPFGpsModule.1.access$0(a41);
            Object a43 = org.spf.utils.gps.SPFGpsModule.access$0(a42);
            org.spf.utils.gps.SPFGpsModule.1.1 a44 = this.this$2;
            org.spf.utils.gps.SPFGpsModule.1 a45 = org.spf.utils.gps.SPFGpsModule.1.1.access$1(a44);
            org.spf.utils.gps.SPFGpsModule a46 = org.spf.utils.gps.SPFGpsModule.1.access$0(a45);
            android.location.Location a47 = org.spf.utils.gps.SPFGpsModule.access$6(a46);
            ((org.spf.utils.gps.SPFFoundLocation)a43).locationFound(a47);
        }
    }
}
package org.spf.utils.gps;

class 1 extends Thread {
    private org.spf.utils.gps.SPFGpsModule.SPFLocationListener listenerLocation;
    final org.spf.utils.gps.SPFGpsModule.1 this$1;
    
    1(org.spf.utils.gps.SPFGpsModule.1 a)
    {
        this.this$1 = a;
        super();
        org.spf.utils.gps.SPFGpsModule a0 = org.spf.utils.gps.SPFGpsModule.1.access$0(a);
        org.spf.utils.gps.SPFGpsModule.SPFLocationListener a1 = org.spf.utils.gps.SPFGpsModule.access$11(a0);
        this.listenerLocation = a1;
    }
    
    static org.spf.utils.gps.SPFGpsModule.SPFLocationListener access$0(org.spf.utils.gps.SPFGpsModule.1.1 a)
    {
        org.spf.utils.gps.SPFGpsModule.SPFLocationListener a0 = a.listenerLocation;
        return a0;
    }
    
    static org.spf.utils.gps.SPFGpsModule.1 access$1(org.spf.utils.gps.SPFGpsModule.1.1 a)
    {
        org.spf.utils.gps.SPFGpsModule.1 a0 = a.this$1;
        return a0;
    }
    
    public void run()
    {
        label1: {
            label0: {
                InterruptedException a = null;
                try
                {
                    Thread.sleep(10000L);
                    break label0;
                }
                catch(InterruptedException a0)
                {
                    a = a0;
                }
                a.printStackTrace();
                break label1;
            }
            org.spf.utils.gps.SPFGpsModule.1 a1 = this.this$1;
            org.spf.utils.gps.SPFGpsModule a2 = org.spf.utils.gps.SPFGpsModule.1.access$0(a1);
            android.os.Handler a3 = org.spf.utils.gps.SPFGpsModule.access$3(a2);
            org.spf.utils.gps.SPFGpsModule.1.1.1 a4 = new org.spf.utils.gps.SPFGpsModule.1.1.1(this);
            a3.post((Runnable)a4);
        }
    }
}
package org.spf.mobi.ui;

class 1 extends Thread {
    final org.spf.mobi.ui.SPFSplashActivity this$0;
    
    1(org.spf.mobi.ui.SPFSplashActivity a)
    {
        this.this$0 = a;
        super();
    }
    
    public void run()
    {
        label1: {
            label0: {
                try
                {
                    Thread.sleep(2000L);
                    break label0;
                }
                catch(InterruptedException ignoredException)
                {
                }
                org.spf.mobi.ui.SPFSplashActivity a = this.this$0;
                String s = org.spf.mobi.ui.SPFSplashActivity.access$0(a);
                android.util.Log.i(s, "Exit on interrupt");
                break label1;
            }
            org.spf.mobi.ui.SPFSplashActivity a0 = this.this$0;
            boolean b = a0.isFinishing();
            if(!b)
            {
                boolean b0 = this.isInterrupted();
                if(!b0)
                {
                    org.spf.mobi.ui.SPFSplashActivity a1 = this.this$0;
                    a1.finish();
                    org.spf.mobi.ui.SPFSplashActivity a2 = this.this$0;
                    org.spf.mobi.ui.SPFSplashActivity a3 = this.this$0;
                    android.content.Intent a4 = new android.content.Intent((android.content.Context)a3, org.spf.mobi.ui.SPFHomeActivity.class);
                    a2.startActivity(a4);
                }
            }
        }
    }
}
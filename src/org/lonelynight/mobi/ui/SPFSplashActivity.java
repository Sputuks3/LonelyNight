package org.spf.mobi.ui;

public class SPFSplashActivity extends org.spf.mobi.ui.SPFActivity {
    private String TAG;
    private Thread startThread;
    
    public SPFSplashActivity()
    {
        super();
    }
    
    static String access$0(org.spf.mobi.ui.SPFSplashActivity a)
    {
        String s = a.TAG;
        return s;
    }
    
    private void launchHome()
    {
        label1: {
            Thread a = this.startThread;
            label0: {
                if(a == null)
                {
                    break label0;
                }
                Thread a0 = this.startThread;
                boolean b = a0.isAlive();
                if(!b)
                {
                    break label0;
                }
                break label1;
            }
            org.spf.mobi.ui.SPFSplashActivity.1 a1 = new org.spf.mobi.ui.SPFSplashActivity.1(this);
            this.startThread = a1;
            Thread a2 = this.startThread;
            a2.start();
        }
    }
    
    public void onCreate(android.os.Bundle a)
    {
        ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
        this.setContentView(2130903066);
        org.spf.mobi.ui.SPFHomeActivity.isFinishing = false;
        org.spf.utils.GATracker a0 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
        String s = this.getString(2131034208);
        a0.gaTrackPageView(s);
        this.launchHome();
        org.spf.utils.Utils.init((android.app.Activity)this);
    }
    
    protected void onDestroy()
    {
        Thread a = this.startThread;
        a.interrupt();
        ((org.spf.mobi.ui.SPFActivity)this).onDestroy();
    }
}
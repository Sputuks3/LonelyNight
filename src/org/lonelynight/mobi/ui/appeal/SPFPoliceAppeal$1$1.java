package org.spf.mobi.ui.appeal;

class 1 implements Runnable {
    final org.spf.mobi.ui.appeal.SPFPoliceAppeal.1 this$1;
    
    1(org.spf.mobi.ui.appeal.SPFPoliceAppeal.1 a)
    {
        this.this$1 = a;
        super();
    }
    
    public void run()
    {
        org.spf.mobi.ui.appeal.SPFPoliceAppeal.1 a = this.this$1;
        Thread a0 = a.instance;
        boolean b = a0.isInterrupted();
        if(!b)
        {
            org.spf.mobi.ui.appeal.SPFPoliceAppeal.1 a1 = this.this$1;
            org.spf.mobi.ui.appeal.SPFPoliceAppeal a2 = org.spf.mobi.ui.appeal.SPFPoliceAppeal.1.access$0(a1);
            boolean b0 = a2.isFinishing();
            if(!b0)
            {
                org.spf.mobi.ui.appeal.SPFPoliceAppeal.1 a3 = this.this$1;
                org.spf.mobi.ui.appeal.SPFPoliceAppeal a4 = org.spf.mobi.ui.appeal.SPFPoliceAppeal.1.access$0(a3);
                a4.removeDialog(0);
                org.spf.mobi.ui.appeal.SPFPoliceAppeal.1 a5 = this.this$1;
                org.spf.mobi.ui.appeal.SPFPoliceAppeal a6 = org.spf.mobi.ui.appeal.SPFPoliceAppeal.1.access$0(a5);
                org.spf.data.SPFArrayList a7 = org.spf.mobi.ui.appeal.SPFPoliceAppeal.access$2(a6);
                if(a7 != null)
                {
                    org.spf.mobi.ui.appeal.SPFPoliceAppeal.1 a8 = this.this$1;
                    org.spf.mobi.ui.appeal.SPFPoliceAppeal a9 = org.spf.mobi.ui.appeal.SPFPoliceAppeal.1.access$0(a8);
                    org.spf.data.SPFArrayList a10 = org.spf.mobi.ui.appeal.SPFPoliceAppeal.access$2(a9);
                    int i = a10.size();
                    if(i > 0)
                    {
                        org.spf.mobi.ui.appeal.SPFPoliceAppeal.1 a11 = this.this$1;
                        org.spf.mobi.ui.appeal.SPFPoliceAppeal a12 = org.spf.mobi.ui.appeal.SPFPoliceAppeal.1.access$0(a11);
                        a12.showDialog(2, (android.os.Bundle)null);
                    }
                }
            }
        }
    }
}
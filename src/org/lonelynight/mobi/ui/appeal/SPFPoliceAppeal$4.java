package org.spf.mobi.ui.appeal;

class 4 implements android.content.DialogInterface.OnCancelListener {
    final org.spf.mobi.ui.appeal.SPFPoliceAppeal this$0;
    
    4(org.spf.mobi.ui.appeal.SPFPoliceAppeal a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onCancel(android.content.DialogInterface a)
    {
        org.spf.mobi.ui.appeal.SPFPoliceAppeal a0 = this.this$0;
        Thread a1 = org.spf.mobi.ui.appeal.SPFPoliceAppeal.access$3(a0);
        if(a1 != null)
        {
            org.spf.mobi.ui.appeal.SPFPoliceAppeal a2 = this.this$0;
            Thread a3 = org.spf.mobi.ui.appeal.SPFPoliceAppeal.access$3(a2);
            boolean b = a3.isAlive();
            if(b)
            {
                org.spf.mobi.ui.appeal.SPFPoliceAppeal a4 = this.this$0;
                Thread a5 = org.spf.mobi.ui.appeal.SPFPoliceAppeal.access$3(a4);
                a5.interrupt();
            }
        }
        org.spf.mobi.ui.appeal.SPFPoliceAppeal a6 = this.this$0;
        a6.removeDialog(2);
    }
}
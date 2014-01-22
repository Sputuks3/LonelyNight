package org.spf.mobi.ui.appeal;

class 2 implements android.content.DialogInterface.OnCancelListener {
    final org.spf.mobi.ui.appeal.SPFPoliceAppeal this$0;
    
    2(org.spf.mobi.ui.appeal.SPFPoliceAppeal a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onCancel(android.content.DialogInterface a)
    {
        org.spf.mobi.ui.appeal.SPFPoliceAppeal a0 = this.this$0;
        a0.removeDialog(2);
        org.spf.mobi.ui.appeal.SPFPoliceAppeal a1 = this.this$0;
        Thread a2 = org.spf.mobi.ui.appeal.SPFPoliceAppeal.access$3(a1);
        a2.interrupt();
    }
}
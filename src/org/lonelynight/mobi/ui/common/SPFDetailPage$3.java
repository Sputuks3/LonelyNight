package org.spf.mobi.ui.common;

class 3 implements android.content.DialogInterface.OnCancelListener {
    final org.spf.mobi.ui.common.SPFDetailPage this$0;
    
    3(org.spf.mobi.ui.common.SPFDetailPage a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onCancel(android.content.DialogInterface a)
    {
        org.spf.mobi.ui.common.SPFDetailPage a0 = this.this$0;
        Thread a1 = org.spf.mobi.ui.common.SPFDetailPage.access$12(a0);
        if(a1 != null)
        {
            org.spf.mobi.ui.common.SPFDetailPage a2 = this.this$0;
            Thread a3 = org.spf.mobi.ui.common.SPFDetailPage.access$12(a2);
            boolean b = a3.isAlive();
            if(b)
            {
                org.spf.mobi.ui.common.SPFDetailPage a4 = this.this$0;
                Thread a5 = org.spf.mobi.ui.common.SPFDetailPage.access$12(a4);
                a5.interrupt();
            }
        }
        org.spf.mobi.ui.common.SPFDetailPage a6 = this.this$0;
        a6.finish();
        org.spf.mobi.ui.common.SPFDetailPage a7 = this.this$0;
        a7.removeDialog(2);
    }
}
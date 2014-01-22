package org.spf.mobi.ui.common;

class 1 implements android.content.DialogInterface.OnClickListener {
    final org.spf.mobi.ui.common.SPFLocationSearch this$0;
    
    1(org.spf.mobi.ui.common.SPFLocationSearch a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onClick(android.content.DialogInterface a, int i)
    {
        org.spf.mobi.ui.common.SPFLocationSearch a0 = this.this$0;
        a0.removeDialog(3);
    }
}
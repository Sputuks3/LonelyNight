package org.spf.mobi.ui.locator.custom;

class 1 implements android.content.DialogInterface.OnClickListener {
    final org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter.1 this$1;
    final private android.view.View val$v;
    
    1(org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter.1 a, android.view.View a0)
    {
        this.this$1 = a;
        this.val$v = a0;
        super();
    }
    
    public void onClick(android.content.DialogInterface a, int i)
    {
        org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter.1 a0 = this.this$1;
        org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter a1 = org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter.1.access$0(a0);
        android.view.View a2 = this.val$v;
        a1.call(a2);
    }
}
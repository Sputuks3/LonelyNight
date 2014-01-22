package org.spf.mobi.ui.common;

class 2 implements android.content.DialogInterface.OnCancelListener {
    final org.spf.mobi.ui.common.SPFCommonListing this$0;
    
    2(org.spf.mobi.ui.common.SPFCommonListing a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onCancel(android.content.DialogInterface a)
    {
        org.spf.mobi.ui.common.SPFCommonListing a0 = this.this$0;
        a0.finish();
        org.spf.mobi.ui.common.SPFCommonListing a1 = this.this$0;
        a1.removeDialog(2);
    }
}
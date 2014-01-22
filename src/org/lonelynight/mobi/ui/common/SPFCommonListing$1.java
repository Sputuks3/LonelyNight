package org.spf.mobi.ui.common;

class 1 implements Runnable {
    final org.spf.mobi.ui.common.SPFCommonListing this$0;
    
    1(org.spf.mobi.ui.common.SPFCommonListing a)
    {
        this.this$0 = a;
        super();
    }
    
    public void run()
    {
        org.spf.mobi.ui.common.SPFCommonListing a = this.this$0;
        a.removeDialog(2);
        org.spf.mobi.ui.common.SPFCommonListing a0 = this.this$0;
        a0.finish();
    }
}
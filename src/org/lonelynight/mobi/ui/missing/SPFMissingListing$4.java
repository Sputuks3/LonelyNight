package org.spf.mobi.ui.missing;

class 4 implements Runnable {
    final org.spf.mobi.ui.missing.SPFMissingListing this$0;
    
    4(org.spf.mobi.ui.missing.SPFMissingListing a)
    {
        this.this$0 = a;
        super();
    }
    
    public void run()
    {
        org.spf.mobi.ui.missing.SPFMissingListing a = this.this$0;
        a.removeDialog(0);
        org.spf.mobi.ui.missing.SPFMissingListing a0 = this.this$0;
        a0.finish();
    }
}
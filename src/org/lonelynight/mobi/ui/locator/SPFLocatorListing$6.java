package org.spf.mobi.ui.locator;

class 6 implements Runnable {
    final org.spf.mobi.ui.locator.SPFLocatorListing this$0;
    
    6(org.spf.mobi.ui.locator.SPFLocatorListing a)
    {
        this.this$0 = a;
        super();
    }
    
    public void run()
    {
        org.spf.mobi.ui.locator.SPFLocatorListing a = this.this$0;
        a.removeDialog(0);
        org.spf.mobi.ui.locator.SPFLocatorListing a0 = this.this$0;
        a0.finish();
    }
}
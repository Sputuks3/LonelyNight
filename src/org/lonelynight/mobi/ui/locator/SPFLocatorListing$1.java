package org.spf.mobi.ui.locator;

class 1 implements android.content.DialogInterface.OnCancelListener {
    final org.spf.mobi.ui.locator.SPFLocatorListing this$0;
    
    1(org.spf.mobi.ui.locator.SPFLocatorListing a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onCancel(android.content.DialogInterface a)
    {
        org.spf.mobi.ui.locator.SPFLocatorListing a0 = this.this$0;
        a0.removeDialog(2);
        org.spf.mobi.ui.locator.SPFLocatorListing a1 = this.this$0;
        Thread a2 = org.spf.mobi.ui.locator.SPFLocatorListing.access$6(a1);
        if(a2 == null)
        {
            org.spf.mobi.ui.locator.SPFLocatorListing a3 = this.this$0;
            a3.finish();
        }
        else
        {
            org.spf.mobi.ui.locator.SPFLocatorListing a4 = this.this$0;
            Thread a5 = org.spf.mobi.ui.locator.SPFLocatorListing.access$6(a4);
            a5.interrupt();
        }
    }
}
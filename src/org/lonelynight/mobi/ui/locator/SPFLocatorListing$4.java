package org.spf.mobi.ui.locator;

class 4 implements android.content.DialogInterface.OnClickListener {
    final org.spf.mobi.ui.locator.SPFLocatorListing this$0;
    
    4(org.spf.mobi.ui.locator.SPFLocatorListing a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onClick(android.content.DialogInterface a, int i)
    {
        org.spf.mobi.ui.locator.SPFLocatorListing a0 = this.this$0;
        android.content.Intent a1 = new android.content.Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        a0.startActivityForResult(a1, 2131034154);
    }
}
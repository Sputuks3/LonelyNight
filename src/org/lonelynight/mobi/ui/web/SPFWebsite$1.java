package org.spf.mobi.ui.web;

class 1 implements android.content.DialogInterface.OnCancelListener {
    final org.spf.mobi.ui.web.SPFWebsite this$0;
    
    1(org.spf.mobi.ui.web.SPFWebsite a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onCancel(android.content.DialogInterface a)
    {
        org.spf.mobi.ui.web.SPFWebsite a0 = this.this$0;
        a0.finish();
    }
}
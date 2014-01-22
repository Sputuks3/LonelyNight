package org.spf.mobi.ui.missing;

class 3 implements android.content.DialogInterface.OnCancelListener {
    final org.spf.mobi.ui.missing.SPFMissingListing this$0;
    
    3(org.spf.mobi.ui.missing.SPFMissingListing a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onCancel(android.content.DialogInterface a)
    {
        org.spf.mobi.ui.missing.SPFMissingListing a0 = this.this$0;
        Thread a1 = org.spf.mobi.ui.missing.SPFMissingListing.access$6(a0);
        if(a1 != null)
        {
            org.spf.mobi.ui.missing.SPFMissingListing a2 = this.this$0;
            Thread a3 = org.spf.mobi.ui.missing.SPFMissingListing.access$6(a2);
            boolean b = a3.isAlive();
            if(b)
            {
                org.spf.mobi.ui.missing.SPFMissingListing a4 = this.this$0;
                Thread a5 = org.spf.mobi.ui.missing.SPFMissingListing.access$6(a4);
                a5.interrupt();
            }
        }
        org.spf.mobi.ui.missing.SPFMissingListing a6 = this.this$0;
        a6.removeDialog(2);
    }
}
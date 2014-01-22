package org.spf.mobi.ui.news;

class 2 implements android.content.DialogInterface.OnCancelListener {
    final org.spf.mobi.ui.news.SPFNewsListing this$0;
    
    2(org.spf.mobi.ui.news.SPFNewsListing a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onCancel(android.content.DialogInterface a)
    {
        org.spf.mobi.ui.news.SPFNewsListing a0 = this.this$0;
        a0.removeDialog(2);
        org.spf.mobi.ui.news.SPFNewsListing a1 = this.this$0;
        Thread a2 = org.spf.mobi.ui.news.SPFNewsListing.access$8(a1);
        if(a2 == null)
        {
            org.spf.mobi.ui.news.SPFNewsListing a3 = this.this$0;
            a3.finish();
        }
        else
        {
            org.spf.mobi.ui.news.SPFNewsListing a4 = this.this$0;
            Thread a5 = org.spf.mobi.ui.news.SPFNewsListing.access$8(a4);
            a5.interrupt();
        }
    }
}
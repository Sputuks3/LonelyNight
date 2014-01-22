package org.spf.mobi.ui.news;

class 4 implements android.content.DialogInterface.OnCancelListener {
    final org.spf.mobi.ui.news.SPFNewsListing this$0;
    
    4(org.spf.mobi.ui.news.SPFNewsListing a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onCancel(android.content.DialogInterface a)
    {
        org.spf.mobi.ui.news.SPFNewsListing a0 = this.this$0;
        Thread a1 = org.spf.mobi.ui.news.SPFNewsListing.access$8(a0);
        if(a1 != null)
        {
            org.spf.mobi.ui.news.SPFNewsListing a2 = this.this$0;
            Thread a3 = org.spf.mobi.ui.news.SPFNewsListing.access$8(a2);
            boolean b = a3.isAlive();
            if(b)
            {
                org.spf.mobi.ui.news.SPFNewsListing a4 = this.this$0;
                Thread a5 = org.spf.mobi.ui.news.SPFNewsListing.access$8(a4);
                a5.interrupt();
            }
        }
        org.spf.mobi.ui.news.SPFNewsListing a6 = this.this$0;
        a6.removeDialog(2);
    }
}
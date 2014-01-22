package org.spf.mobi.ui.news;

class 5 implements Runnable {
    final org.spf.mobi.ui.news.SPFNewsListing this$0;
    
    5(org.spf.mobi.ui.news.SPFNewsListing a)
    {
        this.this$0 = a;
        super();
    }
    
    public void run()
    {
        org.spf.mobi.ui.news.SPFNewsListing a = this.this$0;
        a.removeDialog(0);
        org.spf.mobi.ui.news.SPFNewsListing a0 = this.this$0;
        a0.finish();
    }
}
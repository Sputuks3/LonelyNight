package org.spf.mobi.ui.common;

class 2 implements Runnable {
    final org.spf.mobi.ui.common.SPFDetailPage.1 this$1;
    
    2(org.spf.mobi.ui.common.SPFDetailPage.1 a)
    {
        this.this$1 = a;
        super();
    }
    
    public void run()
    {
        org.spf.mobi.ui.common.SPFDetailPage.1 a = this.this$1;
        org.spf.mobi.ui.common.SPFDetailPage a0 = org.spf.mobi.ui.common.SPFDetailPage.1.access$1(a);
        a0.removeDialog(2);
        org.spf.utils.Constants.ERROR a1 = org.spf.utils.Constants.ERROR.NO_CONNECTION;
        org.spf.mobi.ui.common.SPFDetailPage.1 a2 = this.this$1;
        org.spf.mobi.ui.common.SPFDetailPage a3 = org.spf.mobi.ui.common.SPFDetailPage.1.access$1(a2);
        org.spf.mobi.ui.common.SPFDetailPage.1 a4 = this.this$1;
        org.spf.mobi.ui.common.SPFDetailPage a5 = org.spf.mobi.ui.common.SPFDetailPage.1.access$1(a4);
        android.os.Handler a6 = org.spf.mobi.ui.common.SPFDetailPage.access$3(a5);
        org.spf.utils.Utils.toastError(a1, (android.content.Context)a3, a6);
        org.spf.mobi.ui.common.SPFDetailPage.1 a7 = this.this$1;
        org.spf.mobi.ui.common.SPFDetailPage a8 = org.spf.mobi.ui.common.SPFDetailPage.1.access$1(a7);
        a8.finish();
    }
}
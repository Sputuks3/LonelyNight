package org.spf.mobi.ui.map;

class 1 implements android.content.DialogInterface.OnCancelListener {
    final org.spf.mobi.ui.map.SPFMapPointDetails this$0;
    
    1(org.spf.mobi.ui.map.SPFMapPointDetails a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onCancel(android.content.DialogInterface a)
    {
        org.spf.mobi.ui.map.SPFMapPointDetails a0 = this.this$0;
        a0.removeDialog(2);
        org.spf.mobi.ui.map.SPFMapPointDetails a1 = this.this$0;
        Thread a2 = org.spf.mobi.ui.map.SPFMapPointDetails.access$0(a1);
        if(a2 != null)
        {
            org.spf.mobi.ui.map.SPFMapPointDetails a3 = this.this$0;
            Thread a4 = org.spf.mobi.ui.map.SPFMapPointDetails.access$0(a3);
            a4.interrupt();
        }
    }
}
package org.spf.mobi.ui.map;

class 2 implements android.content.DialogInterface.OnClickListener {
    final org.spf.mobi.ui.map.SPFSingleMapElementActivity this$0;
    
    2(org.spf.mobi.ui.map.SPFSingleMapElementActivity a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onClick(android.content.DialogInterface a, int i)
    {
        org.spf.mobi.ui.map.SPFSingleMapElementActivity a0 = this.this$0;
        a0.removeDialog(1);
    }
}
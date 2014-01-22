package org.spf.mobi.ui.map;

class 1 implements android.content.DialogInterface.OnClickListener {
    final org.spf.mobi.ui.map.SPFSingleMapElementActivity this$0;
    
    1(org.spf.mobi.ui.map.SPFSingleMapElementActivity a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onClick(android.content.DialogInterface a, int i)
    {
        org.spf.mobi.ui.map.SPFSingleMapElementActivity a0 = this.this$0;
        android.content.Intent a1 = new android.content.Intent((android.content.Context)a0, org.spf.mobi.ui.map.SPFMapPointDetails.class);
        org.spf.mobi.ui.map.SPFSingleMapElementActivity a2 = this.this$0;
        String s = org.spf.mobi.ui.map.SPFSingleMapElementActivity.access$1(a2);
        a1.putExtra("DETAIL_ID", s);
        org.spf.mobi.ui.map.SPFSingleMapElementActivity a3 = this.this$0;
        a3.startActivity(a1);
        org.spf.mobi.ui.map.SPFSingleMapElementActivity a4 = this.this$0;
        a4.removeDialog(1);
    }
}
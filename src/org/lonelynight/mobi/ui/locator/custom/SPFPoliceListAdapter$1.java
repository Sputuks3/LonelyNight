package org.spf.mobi.ui.locator.custom;

class 1 implements android.view.View.OnClickListener {
    final org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter this$0;
    final private String val$phoneNo;
    
    1(org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter a, String s)
    {
        this.this$0 = a;
        this.val$phoneNo = s;
        super();
    }
    
    static org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter access$0(org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter.1 a)
    {
        org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter a0 = a.this$0;
        return a0;
    }
    
    public void onClick(android.view.View a)
    {
        org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter a0 = this.this$0;
        android.content.Context a1 = org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter.access$0(a0);
        android.app.AlertDialog.Builder a2 = new android.app.AlertDialog.Builder(a1);
        a2.setTitle((CharSequence)"Police");
        String s = this.val$phoneNo;
        a2.setMessage((CharSequence)s);
        org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter.1.1 a3 = new org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter.1.1(this, a);
        a2.setPositiveButton((CharSequence)"Call", (android.content.DialogInterface.OnClickListener)a3);
        org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter.1.2 a4 = new org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter.1.2(this);
        a2.setNegativeButton((CharSequence)"Cancel", (android.content.DialogInterface.OnClickListener)a4);
        android.app.AlertDialog a5 = a2.create();
        a5.show();
    }
}
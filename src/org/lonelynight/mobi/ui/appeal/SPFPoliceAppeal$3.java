package org.spf.mobi.ui.appeal;

class 3 implements android.content.DialogInterface.OnClickListener {
    final org.spf.mobi.ui.appeal.SPFPoliceAppeal this$0;
    
    3(org.spf.mobi.ui.appeal.SPFPoliceAppeal a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onClick(android.content.DialogInterface a, int i)
    {
        org.spf.mobi.ui.appeal.SPFPoliceAppeal a0 = this.this$0;
        a0.removeDialog(2);
        org.spf.mobi.ui.appeal.SPFPoliceAppeal a1 = this.this$0;
        android.content.Intent a2 = new android.content.Intent((android.content.Context)a1, org.spf.mobi.ui.common.SPFCommonListing.class);
        org.spf.utils.Constants.POLICE_APPEAL.URL a3 = org.spf.utils.Constants.POLICE_APPEAL.URL.DISPLAY_BY_TYPE;
        String s = org.spf.utils.Constants.POLICE_APPEAL.URL.getUrl(a3);
        String s0 = String.valueOf((Object)s);
        StringBuilder a4 = new StringBuilder(s0);
        org.spf.mobi.ui.appeal.SPFPoliceAppeal a5 = this.this$0;
        org.spf.data.SPFArrayList a6 = org.spf.mobi.ui.appeal.SPFPoliceAppeal.access$2(a5);
        Object a7 = a6.get(i);
        org.spf.data.SPFCategory dummy = (org.spf.data.SPFCategory)a7;
        org.spf.data.SPFCategory a8 = (org.spf.data.SPFCategory)a7;
        String s1 = a8.getId();
        StringBuilder a9 = a4.append(s1);
        String s2 = a9.toString();
        a2.putExtra("PASSING_URL", s2);
        org.spf.utils.Constants.SCREENS a10 = org.spf.utils.Constants.SCREENS.APPEAL;
        int i0 = a10.ordinal();
        a2.putExtra("SCREEN_ID", i0);
        org.spf.mobi.ui.appeal.SPFPoliceAppeal a11 = this.this$0;
        a11.startActivity(a2);
    }
}
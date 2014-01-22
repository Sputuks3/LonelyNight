package org.spf.mobi.ui.missing;

class 2 implements android.content.DialogInterface.OnClickListener {
    final org.spf.mobi.ui.missing.SPFMissingListing this$0;
    
    2(org.spf.mobi.ui.missing.SPFMissingListing a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onClick(android.content.DialogInterface a, int i)
    {
        org.spf.mobi.ui.missing.SPFMissingListing a0 = this.this$0;
        a0.removeDialog(2);
        org.spf.mobi.ui.missing.SPFMissingListing a1 = this.this$0;
        android.content.Intent a2 = a1.getIntent();
        org.spf.utils.Constants.NEWS_CRIME_INFO.URL a3 = org.spf.utils.Constants.NEWS_CRIME_INFO.URL.DISPLAY_BY_TYPE;
        String s = org.spf.utils.Constants.NEWS_CRIME_INFO.URL.getUrl(a3);
        String s0 = String.valueOf((Object)s);
        StringBuilder a4 = new StringBuilder(s0);
        org.spf.mobi.ui.missing.SPFMissingListing a5 = this.this$0;
        org.spf.data.SPFArrayList a6 = org.spf.mobi.ui.missing.SPFMissingListing.access$7(a5);
        Object a7 = a6.get(i);
        org.spf.data.SPFCategory dummy = (org.spf.data.SPFCategory)a7;
        org.spf.data.SPFCategory a8 = (org.spf.data.SPFCategory)a7;
        String s1 = a8.getId();
        StringBuilder a9 = a4.append(s1);
        String s2 = a9.toString();
        a2.putExtra("PASSING_URL", s2);
        org.spf.mobi.ui.missing.SPFMissingListing a10 = this.this$0;
        org.spf.mobi.ui.missing.SPFMissingListing.access$1(a10, (org.spf.data.SPFArrayList)null);
        org.spf.mobi.ui.missing.SPFMissingListing a11 = this.this$0;
        org.spf.mobi.ui.missing.SPFMissingListing.access$8(a11, (org.spf.utils.parser.SPFXmlPullParser)null);
        org.spf.mobi.ui.missing.SPFMissingListing a12 = this.this$0;
        org.spf.mobi.ui.missing.SPFMissingListing a13 = this.this$0;
        org.spf.utils.Constants.SCREENS a14 = org.spf.mobi.ui.missing.SPFMissingListing.access$9(a13);
        org.spf.mobi.ui.missing.SPFMissingListing.access$10(a12, a14);
    }
}
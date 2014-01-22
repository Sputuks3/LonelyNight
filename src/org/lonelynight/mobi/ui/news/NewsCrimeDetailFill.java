package org.spf.mobi.ui.news;

public class NewsCrimeDetailFill implements org.spf.mobi.ui.common.SPFIGetFillView {
    android.app.Activity activty;
    
    public NewsCrimeDetailFill(android.app.Activity a)
    {
        super();
        this.activty = a;
    }
    
    public void getViewFor(android.os.Parcelable a, android.os.Handler a0, android.view.View a1)
    {
    }
    
    public void onListItemClick(android.widget.AdapterView a, android.view.View a0, int i, long j, android.content.Context a1)
    {
        String s = null;
        Object a2 = a0.getTag();
        if(a2 == null)
        {
            s = "";
        }
        else
        {
            Object a3 = a0.getTag();
            String dummy = (String)a3;
            String s0 = (String)a3;
            StringBuilder a4 = new StringBuilder("ID VALUE ");
            StringBuilder a5 = a4.append(s0);
            String s1 = a5.toString();
            android.util.Log.i("START WITH ID", s1);
            s = s0;
        }
        org.spf.utils.Constants.NEWS_CRIME_INFO.URL a6 = org.spf.utils.Constants.NEWS_CRIME_INFO.URL.CRIME_ID;
        String s2 = org.spf.utils.Constants.NEWS_CRIME_INFO.URL.getUrl(a6);
        StringBuilder a7 = new StringBuilder(s2);
        a7.append(s);
        android.app.Activity a8 = this.activty;
        android.content.Intent a9 = new android.content.Intent((android.content.Context)a8, org.spf.mobi.ui.common.SPFDetailPage.class);
        String s3 = a7.toString();
        a9.putExtra("PASSING_URL", s3);
        org.spf.utils.Constants.SCREENS a10 = org.spf.utils.Constants.SCREENS.NEWS;
        int i0 = a10.ordinal();
        a9.putExtra("SCREEN_ID", i0);
        android.app.Activity a11 = this.activty;
        a11.startActivity(a9);
    }
}
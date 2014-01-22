package org.spf.mobi.ui.map;

public class MissingDetailFill implements org.spf.mobi.ui.common.SPFIGetFillView, org.spf.utils.Constants {
    android.app.Activity context;
    android.os.Handler mHandler;
    
    public MissingDetailFill(android.app.Activity a)
    {
        super();
        this.context = a;
    }
    
    public void getViewFor(android.os.Parcelable a, android.os.Handler a0, android.view.View a1)
    {
        this.mHandler = a0;
        Object a2 = a;
        org.spf.mobi.ui.map.MissingDetailFill.1 a3 = new org.spf.mobi.ui.map.MissingDetailFill.1(this, (android.os.Parcelable)a2, a1);
        a0.post((Runnable)a3);
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
        org.spf.utils.Constants.MISSING_PERSON_INFO.URL a6 = org.spf.utils.Constants.MISSING_PERSON_INFO.URL.MISSING_ID;
        String s2 = org.spf.utils.Constants.MISSING_PERSON_INFO.URL.getUrl(a6);
        StringBuilder a7 = new StringBuilder(s2);
        a7.append(s);
        android.content.Intent a8 = new android.content.Intent(a1, org.spf.mobi.ui.common.SPFDetailPage.class);
        String s3 = a7.toString();
        a8.putExtra("PASSING_URL", s3);
        org.spf.utils.Constants.SCREENS a9 = org.spf.utils.Constants.SCREENS.MISSING;
        int i0 = a9.ordinal();
        a8.putExtra("SCREEN_ID", i0);
        a8.putExtra("LAYOUT_ID", 2130903056);
        StringBuilder a10 = new StringBuilder("context::");
        String s4 = a1.getPackageName();
        StringBuilder a11 = a10.append(s4);
        String s5 = a11.toString();
        android.util.Log.d("SPF", s5);
        a1.startActivity(a8);
    }
}
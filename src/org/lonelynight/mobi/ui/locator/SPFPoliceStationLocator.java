package org.spf.mobi.ui.locator;

public class SPFPoliceStationLocator implements org.spf.utils.Constants, org.spf.mobi.ui.common.SPFIGetFillView {
    public SPFPoliceStationLocator()
    {
        super();
    }
    
    public void getViewFor(android.os.Parcelable a, android.os.Handler a0, android.view.View a1)
    {
    }
    
    public void onListItemClick(android.widget.AdapterView a, android.view.View a0, int i, long j, android.content.Context a1)
    {
        Object a2 = a0.getTag();
        if(a2 != null)
        {
            Object a3 = a0.getTag();
            org.spf.data.SPFNppnpc dummy = (org.spf.data.SPFNppnpc)a3;
            org.spf.data.SPFNppnpc a4 = (org.spf.data.SPFNppnpc)a3;
            StringBuilder a5 = new StringBuilder("ID VALUE ");
            StringBuilder a6 = a5.append((Object)a4);
            String s = a6.toString();
            android.util.Log.i("START WITH ID", s);
            android.content.Intent a7 = new android.content.Intent(a1, org.spf.mobi.ui.locator.SPFLocatorMap.class);
            String s0 = a4.getLatitude();
            a7.putExtra("FORWARD_LATITUDE", s0);
            String s1 = a4.getLongitude();
            a7.putExtra("FORWARD_LONGITUDE", s1);
            String s2 = a4.getName();
            a7.putExtra("TITLE", s2);
            String s3 = a4.getAddress();
            a7.putExtra("ADDRESS", s3);
            String s4 = a4.getOpenHour();
            a7.putExtra("OPENING_HOURS", s4);
            String s5 = a4.getCloseHours();
            a7.putExtra("CLOSING_HOURS", s5);
            String s6 = a4.getContactNumber();
            a7.putExtra("CONTACT_NUMBER", s6);
            a1.startActivity(a7);
        }
    }
}
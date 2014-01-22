package org.spf.mobi.ui.locator.custom;

import org.spf.data.SPFArrayList;

public class SPFPoliceListAdapter extends android.widget.BaseAdapter {
    private android.content.Context mContext;
    private java.util.ArrayList<SPFArrayList> mListItems;
    
    public SPFPoliceListAdapter(android.content.Context a, java.util.ArrayList<SPFArrayList> a0)
    {
        super();
        this.mListItems = null;
        this.mContext = null;
        this.mContext = a;
        this.mListItems = a0;
    }
    
    static android.content.Context access$0(org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter a)
    {
        android.content.Context a0 = a.mContext;
        return a0;
    }
    
    public void call(android.view.View a)
    {
        android.view.View a0 = a.findViewById(2131165352);
        Object a1 = a0.getTag();
        String s = (String)a1;
        try
        {
            StringBuilder a2 = new StringBuilder("Phone Number ");
            StringBuilder a3 = a2.append(s);
            String s0 = a3.toString();
            android.util.Log.i("PARSE", s0);
            android.content.Intent a4 = new android.content.Intent("android.intent.action.CALL");
            StringBuilder a5 = new StringBuilder("tel:");
            StringBuilder a6 = a5.append(s);
            String s1 = a6.toString();
            android.net.Uri a7 = android.net.Uri.parse(s1);
            a4.setData(a7);
            android.content.Context a8 = this.mContext;
            a8.startActivity(a4);
        }
        catch(android.content.ActivityNotFoundException a9)
        {
            android.util.Log.e("SPFPoliceStationResult", "Call failed", (Throwable)a9);
        }
    }
    
    public int getCount()
    {
        java.util.ArrayList a = this.mListItems;
        int i = a.size();
        return i;
    }
    
    public Object getItem(int i)
    {
        java.util.ArrayList a = this.mListItems;
        Object a0 = a.get(i);
        return a0;
    }
    
    public long getItemId(int i)
    {
        long j = (long)i;
        return j;
    }
    
    public android.view.View getView(int i, android.view.View a, android.view.ViewGroup a0)
    {
        android.view.View a1 = null;
        if(a != null)
        {
            a1 = a;
        }
        else
        {
            android.content.Context a2 = this.mContext;
            android.view.View a3 = android.view.View.inflate(a2, 2130903061, (android.view.ViewGroup)null);
            a1 = a3;
        }
        java.util.ArrayList a4 = this.mListItems;
        Object a5 = a4.get(i);
        org.spf.data.SPFNppnpc dummy = (org.spf.data.SPFNppnpc)a5;
        org.spf.data.SPFNppnpc a6 = (org.spf.data.SPFNppnpc)a5;
        android.view.View a7 = a1.findViewById(2131165324);
        android.widget.TextView dummy0 = (android.widget.TextView)a7;
        android.widget.TextView a8 = (android.widget.TextView)a7;
        String s = a6.getName();
        a8.setText((CharSequence)s);
        android.view.View a9 = a1.findViewById(2131165348);
        android.widget.TextView dummy1 = (android.widget.TextView)a9;
        android.widget.TextView a10 = (android.widget.TextView)a9;
        StringBuilder a11 = new StringBuilder();
        String s0 = a6.getDistance();
        Object a12 = s0.subSequence(0, 4);
        StringBuilder a13 = a11.append(a12);
        StringBuilder a14 = a13.append(" km");
        String s1 = a14.toString();
        a10.setText((CharSequence)s1);
        android.view.View a15 = a1.findViewById(2131165350);
        android.widget.TextView dummy2 = (android.widget.TextView)a15;
        android.widget.TextView a16 = (android.widget.TextView)a15;
        String s2 = a6.getAddress();
        a16.setText((CharSequence)s2);
        String s3 = a6.getContactNumber();
        String s4 = s3.substring(0, 4);
        String s5 = String.valueOf((Object)s4);
        StringBuilder a17 = new StringBuilder(s5);
        StringBuilder a18 = a17.append("-");
        int i0 = s3.length();
        String s6 = s3.substring(4, i0);
        StringBuilder a19 = a18.append(s6);
        String s7 = a19.toString();
        android.view.View a20 = a1.findViewById(2131165352);
        android.widget.TextView dummy3 = (android.widget.TextView)a20;
        android.widget.TextView a21 = (android.widget.TextView)a20;
        a21.setText((CharSequence)s7);
        a21.setTag((Object)s7);
        android.view.View a22 = a1.findViewById(2131165351);
        android.widget.LinearLayout dummy4 = (android.widget.LinearLayout)a22;
        android.widget.LinearLayout a23 = (android.widget.LinearLayout)a22;
        org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter.1 a24 = new org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter.1(this, s7);
        a23.setOnClickListener((android.view.View.OnClickListener)a24);
        android.view.View a25 = a1.findViewById(2131165349);
        android.widget.ImageView dummy5 = (android.widget.ImageView)a25;
        android.widget.ImageView a26 = (android.widget.ImageView)a25;
        String s8 = a6.getName();
        boolean b = s8.contains((CharSequence)"NPC");
        if(!b)
        {
            String s9 = a6.getName();
            boolean b0 = s9.contains((CharSequence)"NPP");
            if(b0)
            {
                a26.setImageResource(2130837557);
            }
        }
        else
        {
            a26.setImageResource(2130837556);
        }
        a1.setTag((Object)a6);
        return a1;
    }
}
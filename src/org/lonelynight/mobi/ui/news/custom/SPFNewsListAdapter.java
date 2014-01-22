package org.spf.mobi.ui.news.custom;

public class SPFNewsListAdapter extends android.widget.BaseAdapter {
    private android.app.Activity mContext;
    private android.os.Handler mHandler;
    private org.spf.data.SPFArrayList mListItems;
    
    public SPFNewsListAdapter(android.app.Activity a, org.spf.data.SPFArrayList a0, android.os.Handler a1)
    {
        super();
        this.mContext = a;
        this.mListItems = a0;
        this.mHandler = a1;
    }
    
    public int getCount()
    {
        org.spf.data.SPFArrayList a = this.mListItems;
        int i = a.size();
        return i;
    }
    
    public Object getItem(int i)
    {
        org.spf.data.SPFArrayList a = this.mListItems;
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
        String s = null;
        android.app.Activity a1 = this.mContext;
        android.view.View a2 = android.view.View.inflate((android.content.Context)a1, 2130903060, (android.view.ViewGroup)null);
        org.spf.data.SPFArrayList a3 = this.mListItems;
        Object a4 = a3.get(i);
        org.spf.data.SPFCrime dummy = (org.spf.data.SPFCrime)a4;
        org.spf.data.SPFCrime a5 = (org.spf.data.SPFCrime)a4;
        String s0 = a5.getTitle();
        String s1 = s0.replace((CharSequence)"\u00d4\u00f8\u03a9", (CharSequence)"'");
        int i0 = s1.length();
        if(i0 <= 50)
        {
            s = s1;
        }
        else
        {
            String s2 = s1.substring(0, 50);
            String s3 = String.valueOf((Object)s2);
            StringBuilder a6 = new StringBuilder(s3);
            StringBuilder a7 = a6.append("...");
            String s4 = a7.toString();
            s = s4;
        }
        android.view.View a8 = a2.findViewById(2131165347);
        android.widget.TextView dummy0 = (android.widget.TextView)a8;
        android.widget.TextView a9 = (android.widget.TextView)a8;
        a9.setText((CharSequence)s);
        String s5 = a5.getLongDesc();
        int i1 = s5.length();
        if(i1 <= 115)
        {
            android.view.View a10 = a2.findViewById(2131165197);
            android.widget.TextView dummy1 = (android.widget.TextView)a10;
            android.widget.TextView a11 = (android.widget.TextView)a10;
            String s6 = a5.getLongDesc();
            a11.setText((CharSequence)s6);
        }
        else
        {
            android.view.View a12 = a2.findViewById(2131165197);
            android.widget.TextView dummy2 = (android.widget.TextView)a12;
            android.widget.TextView a13 = (android.widget.TextView)a12;
            String s7 = a5.getLongDesc();
            String s8 = s7.substring(0, 115);
            String s9 = String.valueOf((Object)s8);
            StringBuilder a14 = new StringBuilder(s9);
            StringBuilder a15 = a14.append("...");
            String s10 = a15.toString();
            a13.setText((CharSequence)s10);
        }
        org.spf.data.SPFArrayList a16 = this.mListItems;
        org.spf.data.SPFImagePath a17 = a16.getPath();
        String s11 = a17.getThumb();
        StringBuilder a18 = new StringBuilder(s11);
        String s12 = a5.getThumburl();
        a18.append(s12);
        android.view.View a19 = a2.findViewById(2131165195);
        android.widget.ImageView dummy3 = (android.widget.ImageView)a19;
        android.widget.ImageView a20 = (android.widget.ImageView)a19;
        android.graphics.Bitmap a21 = a5.getThumb();
        if(a21 != null)
        {
            android.graphics.Bitmap a22 = a5.getThumb();
            a20.setImageBitmap(a22);
        }
        else
        {
            android.app.Activity a23 = this.mContext;
            android.os.Handler a24 = this.mHandler;
            String s13 = a18.toString();
            org.spf.utils.Constants.IMAGE_TYPE a25 = org.spf.utils.Constants.IMAGE_TYPE.THUMB;
            org.spf.utils.SPFGetImageFromHttp a26 = new org.spf.utils.SPFGetImageFromHttp(a23, a20, a24, s13, (android.os.Parcelable)a5, a25);
            a26.start();
        }
        String s14 = a5.getId();
        a2.setTag((Object)s14);
        return a2;
    }
}
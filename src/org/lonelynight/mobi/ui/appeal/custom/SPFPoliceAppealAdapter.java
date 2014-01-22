package org.spf.mobi.ui.appeal.custom;

public class SPFPoliceAppealAdapter extends android.widget.BaseAdapter {
    private android.app.Activity mContext;
    private android.os.Handler mHandler;
    private org.spf.data.SPFArrayList mListItems;
    
    public SPFPoliceAppealAdapter(android.app.Activity a, org.spf.data.SPFArrayList a0, android.os.Handler a1)
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
        return 0L;
    }
    
    public android.view.View getView(int i, android.view.View a, android.view.ViewGroup a0)
    {
        String s = null;
        android.app.Activity a1 = this.mContext;
        android.view.View a2 = android.view.View.inflate((android.content.Context)a1, 2130903041, (android.view.ViewGroup)null);
        org.spf.data.SPFArrayList a3 = this.mListItems;
        Object a4 = a3.get(i);
        org.spf.data.SPFAppeal dummy = (org.spf.data.SPFAppeal)a4;
        org.spf.data.SPFAppeal a5 = (org.spf.data.SPFAppeal)a4;
        StringBuilder a6 = new StringBuilder("Poilce");
        String s0 = a5.getTitle();
        StringBuilder a7 = a6.append(s0);
        String s1 = a7.toString();
        android.util.Log.e("SPF Police::::::::", s1);
        String s2 = a5.getTitle();
        String s3 = s2.replace((CharSequence)"\u00d4\u00f8\u03a9", (CharSequence)"-");
        int i0 = s3.length();
        if(i0 <= 50)
        {
            s = s3;
        }
        else
        {
            String s4 = s3.substring(0, 50);
            String s5 = String.valueOf((Object)s4);
            StringBuilder a8 = new StringBuilder(s5);
            StringBuilder a9 = a8.append("...");
            String s6 = a9.toString();
            s = s6;
        }
        StringBuilder a10 = new StringBuilder("Poilce");
        String s7 = a5.getTitle();
        int i1 = s7.length();
        StringBuilder a11 = a10.append(i1);
        String s8 = a11.toString();
        android.util.Log.e("SPF Police::::::::", s8);
        android.view.View a12 = a2.findViewById(2131165193);
        android.widget.TextView dummy0 = (android.widget.TextView)a12;
        android.widget.TextView a13 = (android.widget.TextView)a12;
        a13.setText((CharSequence)s);
        String s9 = a5.getLongDesc();
        int i2 = s9.length();
        if(i2 <= 115)
        {
            android.view.View a14 = a2.findViewById(2131165197);
            android.widget.TextView dummy1 = (android.widget.TextView)a14;
            android.widget.TextView a15 = (android.widget.TextView)a14;
            String s10 = a5.getLongDesc();
            a15.setText((CharSequence)s10);
        }
        else
        {
            android.view.View a16 = a2.findViewById(2131165197);
            android.widget.TextView dummy2 = (android.widget.TextView)a16;
            android.widget.TextView a17 = (android.widget.TextView)a16;
            String s11 = a5.getLongDesc();
            String s12 = s11.substring(0, 115);
            String s13 = String.valueOf((Object)s12);
            StringBuilder a18 = new StringBuilder(s13);
            StringBuilder a19 = a18.append("...");
            String s14 = a19.toString();
            a17.setText((CharSequence)s14);
        }
        org.spf.data.SPFArrayList a20 = this.mListItems;
        org.spf.data.SPFImagePath a21 = a20.getPath();
        String s15 = a21.getThumb();
        StringBuilder a22 = new StringBuilder(s15);
        String s16 = a5.getThumburl();
        a22.append(s16);
        android.view.View a23 = a2.findViewById(2131165195);
        android.widget.ImageView dummy3 = (android.widget.ImageView)a23;
        android.widget.ImageView a24 = (android.widget.ImageView)a23;
        android.graphics.Bitmap a25 = a5.getThumb();
        if(a25 != null)
        {
            android.graphics.Bitmap a26 = a5.getThumb();
            a24.setImageBitmap(a26);
        }
        else
        {
            android.app.Activity a27 = this.mContext;
            android.os.Handler a28 = this.mHandler;
            String s17 = a22.toString();
            org.spf.utils.Constants.IMAGE_TYPE a29 = org.spf.utils.Constants.IMAGE_TYPE.THUMB;
            org.spf.utils.SPFGetImageFromHttp a30 = new org.spf.utils.SPFGetImageFromHttp(a27, a24, a28, s17, (android.os.Parcelable)a5, a29);
            a30.start();
        }
        String s18 = a5.getId();
        a2.setTag((Object)s18);
        return a2;
    }
}
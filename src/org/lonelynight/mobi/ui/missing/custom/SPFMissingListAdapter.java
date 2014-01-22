package org.spf.mobi.ui.missing.custom;

public class SPFMissingListAdapter extends android.widget.BaseAdapter {
    private android.app.Activity mContext;
    private android.os.Handler mHandler;
    private org.spf.data.SPFArrayList mListItems;
    
    public SPFMissingListAdapter(android.app.Activity a, org.spf.data.SPFArrayList a0, android.os.Handler a1)
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
        android.app.Activity a1 = this.mContext;
        android.view.View a2 = android.view.View.inflate((android.content.Context)a1, 2130903057, (android.view.ViewGroup)null);
        org.spf.data.SPFArrayList a3 = this.mListItems;
        Object a4 = a3.get(i);
        org.spf.data.SPFMissing dummy = (org.spf.data.SPFMissing)a4;
        org.spf.data.SPFMissing a5 = (org.spf.data.SPFMissing)a4;
        android.view.View a6 = a2.findViewById(2131165321);
        android.widget.TextView dummy0 = (android.widget.TextView)a6;
        android.widget.TextView a7 = (android.widget.TextView)a6;
        String s = a5.getTitle();
        a7.setText((CharSequence)s);
        android.view.View a8 = a2.findViewById(2131165324);
        android.widget.TextView dummy1 = (android.widget.TextView)a8;
        android.widget.TextView a9 = (android.widget.TextView)a8;
        String s0 = a5.getName();
        a9.setText((CharSequence)s0);
        android.view.View a10 = a2.findViewById(2131165214);
        android.widget.TextView dummy2 = (android.widget.TextView)a10;
        android.widget.TextView a11 = (android.widget.TextView)a10;
        String s1 = a5.getLocation();
        a11.setText((CharSequence)s1);
        android.view.View a12 = a2.findViewById(2131165346);
        android.widget.TextView dummy3 = (android.widget.TextView)a12;
        android.widget.TextView a13 = (android.widget.TextView)a12;
        String s2 = a5.getMissingDateStr();
        a13.setText((CharSequence)s2);
        org.spf.data.SPFArrayList a14 = this.mListItems;
        org.spf.data.SPFImagePath a15 = a14.getPath();
        String s3 = a15.getThumb();
        StringBuilder a16 = new StringBuilder(s3);
        String s4 = a5.getThumbUrl();
        a16.append(s4);
        android.view.View a17 = a2.findViewById(2131165195);
        android.widget.ImageView dummy4 = (android.widget.ImageView)a17;
        android.widget.ImageView a18 = (android.widget.ImageView)a17;
        android.graphics.Bitmap a19 = a5.getThumb();
        if(a19 != null)
        {
            android.graphics.Bitmap a20 = a5.getThumb();
            a18.setImageBitmap(a20);
        }
        else
        {
            android.app.Activity a21 = this.mContext;
            android.os.Handler a22 = this.mHandler;
            String s5 = a16.toString();
            org.spf.utils.Constants.IMAGE_TYPE a23 = org.spf.utils.Constants.IMAGE_TYPE.THUMB;
            org.spf.utils.SPFGetImageFromHttp a24 = new org.spf.utils.SPFGetImageFromHttp(a21, a18, a22, s5, (android.os.Parcelable)a5, a23);
            a24.start();
        }
        String s6 = a5.getId();
        a2.setTag((Object)s6);
        return a2;
    }
}
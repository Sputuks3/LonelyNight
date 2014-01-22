package org.spf.mobi.ui;

public class SPFHomeScreenIcons extends android.widget.BaseAdapter implements org.spf.utils.Constants {
    int countStart;
    private android.content.Context mContext;
    int[] mRid;
    
    public SPFHomeScreenIcons(android.content.Context a, int[] a0, int i)
    {
        super();
        int[] a1 = null;
        this.mRid = null;
        this.countStart = 0;
        this.mContext = a;
        if(a0 != null)
        {
            a1 = a0;
        }
        else
        {
            int[] a2 = new int[0];
            a1 = a2;
        }
        this.mRid = a1;
        this.countStart = i;
    }
    
    public int getCount()
    {
        int[] a = this.mRid;
        int i = a.length;
        return i;
    }
    
    public Object getItem(int i)
    {
        int[] a = this.mRid;
        int i0 = a[i];
        Integer a0 = Integer.valueOf(i0);
        return a0;
    }
    
    public long getItemId(int i)
    {
        int i0 = this.countStart;
        int i1 = i + i0;
        long j = (long)i1;
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
            android.widget.ImageView a3 = new android.widget.ImageView(a2);
            a1 = a3;
        }
        android.widget.ImageView a4 = (android.widget.ImageView)a1;
        int[] a5 = this.mRid;
        int i0 = a5[i];
        a4.setImageResource(i0);
        android.widget.ImageView a6 = (android.widget.ImageView)a1;
        int i1 = org.spf.mobi.ui.SPFHomeActivity.Width;
        int i2 = org.spf.mobi.ui.SPFHomeActivity.Height;
        android.widget.AbsListView.LayoutParams a7 = new android.widget.AbsListView.LayoutParams(i1, i2);
        a6.setLayoutParams((android.view.ViewGroup.LayoutParams)a7);
        android.widget.ImageView a8 = (android.widget.ImageView)a1;
        a8.setAdjustViewBounds(true);
        return a1;
    }
}
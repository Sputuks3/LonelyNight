package org.spf.mobi.ui.map.custom;

public class SPFStatisticAdapter extends android.widget.BaseAdapter {
    private static android.view.LayoutInflater inflater;
    private android.app.Activity activity;
    org.spf.data.SPFArrayList listStatistic;
    
    static
    {
        inflater = null;
    }
    
    public SPFStatisticAdapter(android.app.Activity a, org.spf.data.SPFArrayList a0)
    {
        super();
        this.activity = a;
        this.listStatistic = a0;
        android.app.Activity a1 = this.activity;
        Object a2 = a1.getSystemService("layout_inflater");
        android.view.LayoutInflater dummy = (android.view.LayoutInflater)a2;
        android.view.LayoutInflater a3 = (android.view.LayoutInflater)a2;
        inflater = a3;
    }
    
    public void addToAdapterData(Object a)
    {
        org.spf.data.SPFArrayList a0 = this.listStatistic;
        a0.add(a);
        this.notifyDataSetChanged();
    }
    
    public int getCount()
    {
        org.spf.data.SPFArrayList a = this.listStatistic;
        int i = a.size();
        return i;
    }
    
    public Object getItem(int i)
    {
        org.spf.data.SPFArrayList a = this.listStatistic;
        Object a0 = a.get(i);
        return a0;
    }
    
    public long getItemId(int i)
    {
        return 0L;
    }
    
    public android.view.View getView(int i, android.view.View a, android.view.ViewGroup a0)
    {
        android.view.View a1 = null;
        org.spf.mobi.ui.map.custom.SPFStatisticAdapter.ViewHolder a2 = null;
        if(a != null)
        {
            Object a3 = a.getTag();
            org.spf.mobi.ui.map.custom.SPFStatisticAdapter.ViewHolder dummy = (org.spf.mobi.ui.map.custom.SPFStatisticAdapter.ViewHolder)a3;
            org.spf.mobi.ui.map.custom.SPFStatisticAdapter.ViewHolder a4 = (org.spf.mobi.ui.map.custom.SPFStatisticAdapter.ViewHolder)a3;
            a1 = a;
            a2 = a4;
        }
        else
        {
            android.view.LayoutInflater a5 = inflater;
            android.view.View a6 = a5.inflate(2130903055, (android.view.ViewGroup)null);
            org.spf.mobi.ui.map.custom.SPFStatisticAdapter.ViewHolder a7 = new org.spf.mobi.ui.map.custom.SPFStatisticAdapter.ViewHolder();
            android.view.View a8 = a6.findViewById(2131165319);
            android.widget.TextView dummy0 = (android.widget.TextView)a8;
            android.widget.TextView a9 = (android.widget.TextView)a8;
            a7.txtCrimeName = a9;
            android.view.View a10 = a6.findViewById(2131165320);
            android.widget.TextView dummy1 = (android.widget.TextView)a10;
            android.widget.TextView a11 = (android.widget.TextView)a10;
            a7.txtCrimeCount = a11;
            a6.setTag((Object)a7);
            a1 = a6;
            a2 = a7;
        }
        org.spf.data.SPFArrayList a12 = this.listStatistic;
        Object a13 = a12.get(i);
        org.spf.data.SPFStatistics dummy2 = (org.spf.data.SPFStatistics)a13;
        org.spf.data.SPFStatistics a14 = (org.spf.data.SPFStatistics)a13;
        android.widget.TextView a15 = a2.txtCrimeName;
        String s = a14.getCatName();
        a15.setText((CharSequence)s);
        android.widget.TextView a16 = a2.txtCrimeCount;
        String s0 = a14.getCount();
        a16.setText((CharSequence)s0);
        return a1;
    }
}
package org.spf.mobi.ui.map.custom;

public class SPFCustomListView extends android.widget.ListView {
    int averageHeightSize;
    private int old_count;
    private android.view.ViewGroup.LayoutParams params;
    
    public SPFCustomListView(android.content.Context a, android.util.AttributeSet a0)
    {
        super(a, a0);
        this.old_count = 0;
        this.averageHeightSize = 0;
    }
    
    protected void onDraw(android.graphics.Canvas a)
    {
        int i = this.getCount();
        int i0 = this.old_count;
        if(i != i0)
        {
            int i1 = 0;
            int i2 = this.getCount();
            this.old_count = i2;
            android.view.ViewGroup.LayoutParams a0 = this.getLayoutParams();
            this.params = a0;
            int i3 = this.getCount();
            if(i3 <= 0)
            {
                i1 = 0;
            }
            else
            {
                int i4 = 0;
                try
                {
                    android.view.View a1 = this.getChildAt(0);
                    int i5 = a1.getHeight();
                    this.averageHeightSize = i5;
                    i4 = i5;
                }
                catch(Exception a2)
                {
                    a2.printStackTrace();
                    int i6 = this.averageHeightSize;
                    i4 = i6;
                }
                StringBuilder a3 = new StringBuilder("Child Height:: ");
                String s = Integer.toString(i4);
                StringBuilder a4 = a3.append(s);
                String s0 = a4.toString();
                android.util.Log.i("STCARS", s0);
                i1 = i4;
            }
            android.view.ViewGroup.LayoutParams a5 = this.params;
            int i7 = this.getCount();
            int i8 = i1 * i7;
            a5.height = i8;
            android.view.ViewGroup.LayoutParams a6 = this.params;
            this.setLayoutParams(a6);
        }
        ((android.widget.ListView)this).onDraw(a);
    }
}
package org.spf.mobi.ui.map.custom;

class 1 implements android.view.View.OnClickListener {
    final org.spf.mobi.ui.map.custom.SPFCustomImageView this$0;
    
    1(org.spf.mobi.ui.map.custom.SPFCustomImageView a)
    {
        this.this$0 = a;
        super();
    }
    
    public void onClick(android.view.View a)
    {
        StringBuilder a0 = new StringBuilder("YEPP WE ARE TRYING");
        org.spf.mobi.ui.map.custom.SPFCustomImageView a1 = this.this$0;
        android.view.MotionEvent a2 = org.spf.mobi.ui.map.custom.SPFCustomImageView.access$0(a1);
        StringBuilder a3 = a0.append((Object)a2);
        String s = a3.toString();
        android.util.Log.i("ZOOMING", s);
        org.spf.mobi.ui.map.custom.SPFCustomImageView a4 = this.this$0;
        android.view.MotionEvent a5 = org.spf.mobi.ui.map.custom.SPFCustomImageView.access$0(a4);
        if(a5 != null)
        {
            org.spf.mobi.ui.map.custom.SPFCustomImageView a6 = this.this$0;
            org.spf.mobi.ui.map.custom.SPFCustomImageView a7 = this.this$0;
            android.view.MotionEvent a8 = org.spf.mobi.ui.map.custom.SPFCustomImageView.access$0(a7);
            org.spf.mobi.ui.map.custom.SPFCustomImageView.access$1(a6, a8);
        }
    }
}
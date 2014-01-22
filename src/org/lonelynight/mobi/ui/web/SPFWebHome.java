package org.spf.mobi.ui.web;

public class SPFWebHome extends org.spf.mobi.ui.SPFActivity {
    public SPFWebHome()
    {
        super();
    }
    
    public void onClick(android.view.View a)
    {
        android.content.Intent a0 = new android.content.Intent((android.content.Context)this, org.spf.mobi.ui.web.SPFWebsite.class);
        int i = a.getId();
        switch(i){
            case 2131165370: {
                org.spf.utils.GATracker a1 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s = this.getString(2131034255);
                a1.gaTrackEvent(s);
                a0.putExtra("INTENT_EXTRAS_ID", -4);
                this.startActivity(a0);
                break;
            }
            case 2131165369: {
                org.spf.utils.GATracker a2 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s0 = this.getString(2131034254);
                a2.gaTrackEvent(s0);
                a0.putExtra("INTENT_EXTRAS_ID", -3);
                this.startActivity(a0);
                break;
            }
            case 2131165368: {
                org.spf.utils.GATracker a3 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s1 = this.getString(2131034253);
                a3.gaTrackEvent(s1);
                a0.putExtra("INTENT_EXTRAS_ID", -2);
                this.startActivity(a0);
                break;
            }
            case 2131165367: {
                org.spf.utils.GATracker a4 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s2 = this.getString(2131034252);
                a4.gaTrackEvent(s2);
                a0.putExtra("INTENT_EXTRAS_ID", -1);
                this.startActivity(a0);
                break;
            }
        }
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
        this.setContentView(2130903067);
        android.view.View a0 = this.findViewById(2131165246);
        android.widget.TextView dummy = (android.widget.TextView)a0;
        android.widget.TextView a1 = (android.widget.TextView)a0;
        a1.setText(2131034119);
        android.util.Log.d("SPF", "Webhome..");
    }
}
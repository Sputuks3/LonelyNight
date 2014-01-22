package org.spf.ui.web;

import org.spf.mobi.ui.SPFActivity;
import org.spf.utils.GATracker;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SPFWebHome extends SPFActivity {
    public SPFWebHome()
    {
        super();
    }
    
    public void onClick(android.view.View a)
    {
        Intent a0 = new Intent((Context)this, SPFWebsite.class);
        switch(a.getId()){
            case 2131165370: {
                GATracker a1 = GATracker.getTracker((Context)this);
                String s = this.getString(2131034255);
                a1.gaTrackEvent(s);
                a0.putExtra("INTENT_EXTRAS_ID", -4);
                this.startActivity(a0);
                break;
            }
            case 2131165369: {
                GATracker a2 = GATracker.getTracker((Context)this);
                String s0 = this.getString(2131034254);
                a2.gaTrackEvent(s0);
                a0.putExtra("INTENT_EXTRAS_ID", -3);
                this.startActivity(a0);
                break;
            }
            case 2131165368: {
                GATracker a3 = GATracker.getTracker((Context)this);
                String s1 = this.getString(2131034253);
                a3.gaTrackEvent(s1);
                a0.putExtra("INTENT_EXTRAS_ID", -2);
                this.startActivity(a0);
                break;
            }
            case 2131165367: {
                GATracker a4 = GATracker.getTracker((Context)this);
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
        super.onCreate(a);
        this.setContentView(2130903067);
        View a0 = this.findViewById(2131165246);
        TextView a1 = (TextView)a0;
        a1.setText(2131034119);
        Log.d("SPF", "Webhome..");
    }
}
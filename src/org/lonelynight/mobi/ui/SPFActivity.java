package org.spf.mobi.ui;

import com.google.android.apps.analytics.GoogleAnalyticsTracker;
import com.google.android.maps.MapActivity;

import android.content.*;
import android.os.Bundle;
import android.view.View;

public class SPFActivity extends MapActivity {
    private static Context context;
    GoogleAnalyticsTracker tracker;
    
    public SPFActivity()
    {
        super();
    }
    
    public static void doHome(View a)
    {
        Intent a0 = new Intent();
        Context a1 = context;
        String s = a1.getPackageName();
        String s0 = SPFHomeActivity.class.getCanonicalName();
        ComponentName a2 = new ComponentName(s, s0);
        a0.setComponent(a2);
        a0.setFlags(131072);
        Context a3 = context;
        a3.startActivity(a0);
    }
    
    protected boolean isRouteDisplayed()
    {
        return false;
    }
    
    protected void onCreate(Bundle a)
    {
        context = this;
        super.onCreate(a);
    }
    
    protected void onResume()
    {
        boolean b = SPFHomeActivity.isFinishing;
        if(b)
        {
            this.finish();
        }
        super.onResume();
    }
}
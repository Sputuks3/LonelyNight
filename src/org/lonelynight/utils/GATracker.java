package org.spf.utils;

public class GATracker {
    private static org.spf.utils.GATracker instance;
    private static com.google.android.apps.analytics.GoogleAnalyticsTracker tracker;
    
    public GATracker()
    {
        super();
    }
    
    public static org.spf.utils.GATracker getTracker(android.content.Context a)
    {
        org.spf.utils.GATracker a0 = instance;
        if(a0 == null)
        {
            org.spf.utils.GATracker a1 = new org.spf.utils.GATracker();
            instance = a1;
            com.google.android.apps.analytics.GoogleAnalyticsTracker a2 = com.google.android.apps.analytics.GoogleAnalyticsTracker.getInstance();
            tracker = a2;
            com.google.android.apps.analytics.GoogleAnalyticsTracker a3 = tracker;
            a3.setDebug(true);
            android.util.Log.e("SPF", "GA-:New Session");
            com.google.android.apps.analytics.GoogleAnalyticsTracker a4 = tracker;
            a4.startNewSession("UA-317s81208-1", a);
        }
        org.spf.utils.GATracker a5 = instance;
        return a5;
    }
    
    public void gaTrackEvent(String s)
    {
        android.util.Log.e("SPF", "GA-:PageEvent Called");
        com.google.android.apps.analytics.GoogleAnalyticsTracker a = tracker;
        a.trackEvent(s, "Open", s, -1);
        com.google.android.apps.analytics.GoogleAnalyticsTracker a0 = tracker;
        a0.dispatch();
    }
    
    public void gaTrackPageView(String s)
    {
        android.util.Log.e("SPF", "GA-:PageView Called");
        com.google.android.apps.analytics.GoogleAnalyticsTracker a = tracker;
        a.trackPageView(s);
        com.google.android.apps.analytics.GoogleAnalyticsTracker a0 = tracker;
        a0.dispatch();
    }
    
    public void stopGATracker()
    {
        com.google.android.apps.analytics.GoogleAnalyticsTracker a = tracker;
        a.stopSession();
    }
}
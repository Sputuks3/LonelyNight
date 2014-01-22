package org.spf.mobi.ui.videos;

public class SPFVideoOptions extends org.spf.mobi.ui.SPFActivity implements org.spf.utils.Constants {
    private android.content.Intent intent;
    private String videoId;
    
    public SPFVideoOptions()
    {
        super();
        this.intent = null;
    }
    
    public void onBackPressed()
    {
        android.view.View a = this.getCurrentFocus();
        org.spf.mobi.ui.videos.SPFVideoOptions.doHome(a);
        this.finish();
    }
    
    public void onClick(android.view.View a)
    {
        int i = a.getId();
        switch(i){
            case 2131165366: {
                org.spf.utils.GATracker a0 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s = this.getString(2131034251);
                a0.gaTrackEvent(s);
                org.spf.utils.Constants.WEB_LINKS.URL a1 = org.spf.utils.Constants.WEB_LINKS.URL.HOME_YOUTUBE;
                String s0 = org.spf.utils.Constants.WEB_LINKS.URL.getUrl(a1);
                android.net.Uri a2 = android.net.Uri.parse(s0);
                android.content.Intent a3 = new android.content.Intent("android.intent.action.VIEW", a2);
                this.startActivityForResult(a3, 0);
                break;
            }
            case 2131165365: {
                org.spf.utils.GATracker a4 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s1 = this.getString(2131034248);
                a4.gaTrackEvent(s1);
                org.spf.utils.Constants.WEB_LINKS.URL a5 = org.spf.utils.Constants.WEB_LINKS.URL.FAIRNESS_YOUTUBE;
                String s2 = org.spf.utils.Constants.WEB_LINKS.URL.getUrl(a5);
                android.net.Uri a6 = android.net.Uri.parse(s2);
                android.content.Intent a7 = new android.content.Intent("android.intent.action.VIEW", a6);
                this.startActivityForResult(a7, 0);
                break;
            }
            case 2131165364: {
                org.spf.utils.GATracker a8 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s3 = this.getString(2131034249);
                a8.gaTrackEvent(s3);
                org.spf.utils.Constants.WEB_LINKS.URL a9 = org.spf.utils.Constants.WEB_LINKS.URL.INTEGRITY_YOUTUBE;
                String s4 = org.spf.utils.Constants.WEB_LINKS.URL.getUrl(a9);
                android.net.Uri a10 = android.net.Uri.parse(s4);
                android.content.Intent a11 = new android.content.Intent("android.intent.action.VIEW", a10);
                this.startActivityForResult(a11, 0);
                break;
            }
            case 2131165363: {
                org.spf.utils.GATracker a12 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s5 = this.getString(2131034250);
                a12.gaTrackEvent(s5);
                org.spf.utils.Constants.WEB_LINKS.URL a13 = org.spf.utils.Constants.WEB_LINKS.URL.LOYALTY_YOUTUBE;
                String s6 = org.spf.utils.Constants.WEB_LINKS.URL.getUrl(a13);
                android.net.Uri a14 = android.net.Uri.parse(s6);
                android.content.Intent a15 = new android.content.Intent("android.intent.action.VIEW", a14);
                this.startActivityForResult(a15, 0);
                break;
            }
            case 2131165362: {
                org.spf.utils.GATracker a16 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s7 = this.getString(2131034247);
                a16.gaTrackEvent(s7);
                org.spf.utils.Constants.WEB_LINKS.URL a17 = org.spf.utils.Constants.WEB_LINKS.URL.COURAGE_YOUTUBE;
                String s8 = org.spf.utils.Constants.WEB_LINKS.URL.getUrl(a17);
                android.net.Uri a18 = android.net.Uri.parse(s8);
                android.content.Intent a19 = new android.content.Intent("android.intent.action.VIEW", a18);
                this.startActivityForResult(a19, 0);
                break;
            }
        }
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
        this.setContentView(2130903064);
        android.view.View a0 = this.findViewById(2131165246);
        android.widget.TextView dummy = (android.widget.TextView)a0;
        android.widget.TextView a1 = (android.widget.TextView)a0;
        a1.setText((CharSequence)"Police Videos");
    }
}
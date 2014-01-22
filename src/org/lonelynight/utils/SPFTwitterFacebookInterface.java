package org.spf.utils;

abstract public interface SPFTwitterFacebookInterface {
    abstract public android.app.Activity activity();
    
    
    abstract public org.spf.facebook.Facebook facebookInterface();
    
    
    abstract public android.os.Handler handler();
    
    
    abstract public String shareText(String arg);
    
    
    abstract public org.spf.twitter.TwitterApp twitterInterface();
}
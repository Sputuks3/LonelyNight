package org.spf.twitter;

public class TwitterSession {
    final private static String SHARED = "Twitter_Preferences";
    final private static String TWEET_AUTH_KEY = "auth_key";
    final private static String TWEET_AUTH_SECRET_KEY = "auth_secret_key";
    final private static String TWEET_USER_NAME = "user_name";
    private android.content.SharedPreferences.Editor editor;
    private android.content.SharedPreferences sharedPref;
    
    public TwitterSession(android.content.Context a)
    {
        super();
        Object a0 = a.getSharedPreferences("Twitter_Preferences", 0);
        this.sharedPref = (android.content.SharedPreferences)a0;
        Object a1 = this.sharedPref;
        Object a2 = ((android.content.SharedPreferences)a1).edit();
        this.editor = (android.content.SharedPreferences.Editor)a2;
    }
    
    public twitter4j.http.AccessToken getAccessToken()
    {
        twitter4j.http.AccessToken a = null;
        Object a0 = this.sharedPref;
        String s = ((android.content.SharedPreferences)a0).getString("auth_key", (String)null);
        Object a1 = this.sharedPref;
        String s0 = ((android.content.SharedPreferences)a1).getString("auth_secret_key", (String)null);
        twitter4j.http.AccessToken a2 = null;
        if(s == null)
        {
            a = a2;
        }
        else
        {
            twitter4j.http.AccessToken a3 = null;
            if(s0 == null)
            {
                a = a3;
            }
            else
            {
                twitter4j.http.AccessToken a4 = new twitter4j.http.AccessToken(s, s0);
                a = a4;
            }
        }
        return a;
    }
    
    public String getUsername()
    {
        Object a = this.sharedPref;
        String s = ((android.content.SharedPreferences)a).getString("user_name", "");
        return s;
    }
    
    public void resetAccessToken()
    {
        Object a = this.editor;
        ((android.content.SharedPreferences.Editor)a).putString("auth_key", (String)null);
        Object a0 = this.editor;
        ((android.content.SharedPreferences.Editor)a0).putString("auth_secret_key", (String)null);
        Object a1 = this.editor;
        ((android.content.SharedPreferences.Editor)a1).putString("user_name", (String)null);
        Object a2 = this.editor;
        ((android.content.SharedPreferences.Editor)a2).commit();
    }
    
    public void storeAccessToken(twitter4j.http.AccessToken a, String s)
    {
        Object a0 = this.editor;
        String s0 = a.getToken();
        ((android.content.SharedPreferences.Editor)a0).putString("auth_key", s0);
        Object a1 = this.editor;
        String s1 = a.getTokenSecret();
        ((android.content.SharedPreferences.Editor)a1).putString("auth_secret_key", s1);
        Object a2 = this.editor;
        ((android.content.SharedPreferences.Editor)a2).putString("user_name", s);
        Object a3 = this.editor;
        ((android.content.SharedPreferences.Editor)a3).commit();
    }
}
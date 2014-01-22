package org.spf.utils;

import java.io.IOException;
import java.net.*;

import org.spf.facebook.DialogError;
import org.spf.facebook.FacebookError;
import org.spf.twitter.TwitterApp;
import org.spf.utils.parser.TrustManagerManipulator;

import android.content.Context;
import android.content.pm.*;
import android.os.Bundle;
import android.util.*;
import android.view.MotionEvent;
import android.widget.Toast;

public class Utils implements Constants {
    static Context context;
    private static Constants.SCREENS currentScreen;
    private static org.spf.mobi.ui.common.SPFIGetFillView detailRef;
    private static org.spf.facebook.Facebook.DialogListener faceboolLoginListener;
    private static boolean inDebugMode;
    private static Boolean isMapNavigation;
    private static android.location.Location lastLocation;
    private static org.spf.twitter.TwitterApp.TwDialogListener mTwLoginDialogListener;
    private static boolean postCalled;
    private static org.spf.facebook.Facebook.DialogListener postListener;
    private static String shareTitle;
    private static String shareUrl;
    private static String text;
    private static SPFTwitterFacebookInterface twitFbInterface;
    
   
    
    static
    {
        shareTitle = null;
        Boolean a = Boolean.valueOf(false);
        isMapNavigation = a;
        postListener = (org.spf.facebook.Facebook.DialogListener) new org.spf.facebook.Facebook.DialogListener() {

            
            public void onCancel()
            {
                Constants.FROM a = Constants.FROM.FACEBOOK_POST;
                Constants.MESSAGE a0 = Constants.MESSAGE.CANCELLED;
                Utils.postAsToast(a, a0);
            }
            
            public void onComplete(Bundle a)
            {
                String s = a.getString("post_id");
                if(s == null)
                {
                    Constants.FROM a0 = Constants.FROM.FACEBOOK_POST;
                    Constants.MESSAGE a1 = Constants.MESSAGE.CANCELLED;
                    Utils.postAsToast(a0, a1);
                }
                else
                {
                    Constants.FROM a2 = Constants.FROM.FACEBOOK_POST;
                    Constants.MESSAGE a3 = Constants.MESSAGE.SUCCESS;
                    Utils.postAsToast(a2, a3);
                    Constants.SCREENS a4 = Utils.getCurrentScreen();
                    Utils.setGATrackEventShare(1, a4);
                }
            }
            
            public void onError(DialogError a)
            {
                Constants.FROM a0 = Constants.FROM.FACEBOOK_POST;
                Constants.MESSAGE a1 = Constants.MESSAGE.FAILED;
                Utils.postAsToast(a0, a1);
            }
            
            public void onFacebookError(FacebookError a)
            {
                Constants.FROM a0 = Constants.FROM.FACEBOOK_POST;
                Constants.MESSAGE a1 = Constants.MESSAGE.FAILED;
                Utils.postAsToast(a0, a1);
            }

			
        };
        faceboolLoginListener = new org.spf.facebook.Facebook.DialogListener() {
            
            public void onCancel()
            {
                Constants.FROM a = Constants.FROM.FACEBOOK_LOGIN;
                Constants.MESSAGE a0 = Constants.MESSAGE.CANCELLED;
                Utils.postAsToast(a, a0);
            }
            
            public void onComplete(Bundle a)
            {
                Constants.FROM a0 = Constants.FROM.FACEBOOK_LOGIN;
                Constants.MESSAGE a1 = Constants.MESSAGE.SUCCESS;
                Utils.postAsToast(a0, a1);
                Utils.postToWallFB();
            }
            
            public void onError(DialogError a)
            {
                Constants.FROM a0 = Constants.FROM.FACEBOOK_LOGIN;
                Constants.MESSAGE a1 = Constants.MESSAGE.FAILED;
                Utils.postAsToast(a0, a1);
                a.printStackTrace();
            }
            
            public void onFacebookError(FacebookError a)
            {
                Constants.FROM a0 = Constants.FROM.FACEBOOK_LOGIN;
                Constants.MESSAGE a1 = Constants.MESSAGE.FAILED;
                Utils.postAsToast(a0, a1);
                a.printStackTrace();
            }
        };
        
       mTwLoginDialogListener = (org.spf.twitter.TwitterApp.TwDialogListener) new org.spf.twitter.TwitterApp.TwDialogListener() {
            
            public void onComplete(String s)
            {
                TwitterApp a0 = twitFbInterface.twitterInterface();
                try
                {
                    String s1 = twitFbInterface.shareText(text);
                    a0.updateStatus(s1);
                    Constants.FROM a2 = Constants.FROM.TWITTER_POST;
                    Constants.MESSAGE a3 = Constants.MESSAGE.SUCCESS;
                    Utils.postAsToast(a2, a3);
                    Constants.SCREENS a4 = Utils.getCurrentScreen();
                    Utils.setGATrackEventShare(0, a4);
                }
                catch(Exception a5)
                {
                    String s2 = a5.getMessage();
                    String s3 = s2.toString();
                    if(s3.contains((CharSequence)"duplicate"))
                    {
                        Constants.FROM a6 = Constants.FROM.TWITTER_POST;
                        Constants.MESSAGE a7 = Constants.MESSAGE.DUPLICATE;
                        Utils.postAsToast(a6, a7);
                    }
                    a5.printStackTrace();
                }
                a0.resetAccessToken();
            }
            
            public void onError(String s)
            {
                Constants.FROM a = Constants.FROM.TWITTER_LOGIN;
                Constants.MESSAGE a0 = Constants.MESSAGE.FAILED;
                Utils.postAsToast(a, a0);
                Log.e("TWITTER", s);
                TwitterApp a2 = twitFbInterface.twitterInterface();
                a2.resetAccessToken();
            }
        };
        
        postCalled = false;
    }
    
    public Utils()
    {
        super();
    }
    
    static void access$0(Constants.FROM a, Constants.MESSAGE a0)
    {
        Utils.postAsToast(a, a0);
    }
    
    static void access$1()
    {
        Utils.postToWallFB();
    }
    
    static SPFTwitterFacebookInterface access$2()
    {
        Object a = twitFbInterface;
        return (SPFTwitterFacebookInterface)a;
    }
    
    static String access$3()
    {
        String s = text;
        return s;
    }
    
    public static Context getContext()
    {
        Context a = context;
        return a;
    }
    
    public static Constants.SCREENS getCurrentScreen()
    {
        Constants.SCREENS a = currentScreen;
        return a;
    }
    
    public static org.spf.mobi.ui.common.SPFIGetFillView getDetailRef()
    {
        Object a = detailRef;
        return (org.spf.mobi.ui.common.SPFIGetFillView)a;
    }
    
    public static java.io.InputStream getInputStream(HttpURLConnection a, String s) throws IOException
    {
        TrustManagerManipulator.allowAllSSL();
        URL a0 = new URL(s);
        URLConnection a1 = a0.openConnection();
        HttpURLConnection a2 = (HttpURLConnection)a1;
        a2.connect();
        java.io.InputStream a3 = a2.getInputStream();
        return a3;
    }
    
    public static Boolean getIsMapNavigation()
    {
        Boolean a = isMapNavigation;
        return a;
    }
    
    public static android.location.Location getLastLocation()
    {
        android.location.Location a = lastLocation;
        return a;
    }
    
    public static void init(android.app.Activity a)
    {
        Utils.isDebugMode(a);
    }
    
    public static boolean isDebugMode(android.app.Activity a)
    {
        boolean b = false;
        if(a != null)
        {
            PackageInfo a0 = null;
            try
            {
                PackageManager a1 = a.getPackageManager();
                android.app.Application a2 = a.getApplication();
                String s = a2.getPackageName();
                PackageInfo a3 = a1.getPackageInfo(s, 16384);
                a0 = a3;
            }
            catch(PackageManager.NameNotFoundException a4)
            {
                a4.printStackTrace();
                a0 = null;
            }
            if(a0 != null)
            {
                ApplicationInfo a5 = a0.applicationInfo;
                int i = a5.flags;
                int i0 = 2 & i;
                if(i0 == 0)
                {
                    inDebugMode = false;
                }
                else
                {
                    inDebugMode = true;
                }
            }
            boolean b0 = inDebugMode;
            b = b0;
        }
        else
        {
            boolean b1 = inDebugMode;
            b = b1;
        }
        return b;
    }
    
    private static void postAsToast(final Constants.FROM a, final Constants.MESSAGE a0)
    {
        Object a1 = twitFbInterface;
        android.os.Handler a2 = ((SPFTwitterFacebookInterface)a1).handler();
        a2.post((Runnable) new Runnable() {
        	public void run()
            {
                
                label0: switch(a){
                    case FACEBOOK_POST: case TWITTER_POST: {
                        
                        switch(a0){
                            case DUPLICATE: {
                                android.widget.Toast a5 = android.widget.Toast.makeText(twitFbInterface.activity(), (CharSequence)"Post cancelled... You have recently posted this message...", 0);
                                a5.show();
                                break label0;
                            }
                            case SUCCESS: {
                                android.widget.Toast a8 = android.widget.Toast.makeText(twitFbInterface.activity(), (CharSequence)"Posted sucessfully", 0);
                                a8.show();
                                org.spf.twitter.TwitterApp a10 = twitFbInterface.twitterInterface();
                                a10.resetAccessToken();
                                break label0;
                            }
                            case CANCELLED: {
                                android.widget.Toast a13 = android.widget.Toast.makeText(twitFbInterface.activity(), (CharSequence)"Post cancelled...", 0);
                                a13.show();
                                break label0;
                            }
                            case FAILED: {
                                android.widget.Toast a16 = android.widget.Toast.makeText(twitFbInterface.activity(), (CharSequence)"Post unsucessfull...", 0);
                                a16.show();
                                break label0;
                            }
                        }
                    }
                    case FACEBOOK_LOGIN: case TWITTER_LOGIN: {
                        
                        switch(a0){
                            case CANCELLED: {
                                android.widget.Toast a21 = android.widget.Toast.makeText((Context)twitFbInterface.activity(), (CharSequence)"Login cancelled...", 0);
                                a21.show();
                                break label0;
                            }
                            case FAILED: {
                                android.widget.Toast a24 = android.widget.Toast.makeText((Context)twitFbInterface, (CharSequence)"Already Post.Please Try Again Later...", 0);
                                a24.show();
                                break label0;
                            }
                        }
                    }
                }
            }
        });
    }
    
    private static void postToWallFB()
    {
        boolean b = postCalled;
        if(!b)
        {
            postCalled = true;
            android.os.Bundle a = new android.os.Bundle();
            String s = shareTitle;
            a.putString("name", s);
            String s0 = shareUrl;
            a.putString("link", s0);
            Object a0 = twitFbInterface;
            String s1 = text;
            String s2 = ((SPFTwitterFacebookInterface)a0).shareText(s1);
            a.putString("description", s2);
            Object a1 = twitFbInterface;
            String s3 = text;
            String s4 = ((SPFTwitterFacebookInterface)a1).shareText(s3);
            a.putString("message", s4);
            Object a2 = twitFbInterface;
            org.spf.facebook.Facebook a3 = ((SPFTwitterFacebookInterface)a2).facebookInterface();
            Object a4 = twitFbInterface;
            android.app.Activity a5 = ((SPFTwitterFacebookInterface)a4).activity();
            Object a6 = postListener;
            a3.dialog((Context)a5, "stream.publish", a, (org.spf.facebook.Facebook.DialogListener)a6);
        }
        else
        {
            postCalled = false;
        }
    }
    
    public static void setContext(Context a)
    {
        context = a;
    }
    
    public static void setCurrentScreen(Constants.SCREENS a)
    {
        currentScreen = a;
    }
    
    public static void setDetailRef(org.spf.mobi.ui.common.SPFIGetFillView a)
    {
        detailRef = a;
    }
    
    public static void setGATrackEventShare(int i, Constants.SCREENS a)
    {
        label0: switch(i){
            case 2: {
                
                switch(a){
                    case MISSING: {
                        Boolean a1 = Utils.getIsMapNavigation();
                        boolean b = a1.booleanValue();
                        if(!b)
                        {
                            Context a2 = Utils.getContext();
                            GATracker a3 = GATracker.getTracker(a2);
                            Context a4 = Utils.getContext();
                            String s = a4.getString(2131034243);
                            a3.gaTrackEvent(s);
                            break label0;
                        }
                        else
                        {
                            Context a5 = Utils.getContext();
                            GATracker a6 = GATracker.getTracker(a5);
                            Context a7 = Utils.getContext();
                            String s0 = a7.getString(2131034229);
                            a6.gaTrackEvent(s0);
                            break label0;
                        }
                    }
                    case APPEAL: {
                        Boolean a8 = Utils.getIsMapNavigation();
                        boolean b0 = a8.booleanValue();
                        if(!b0)
                        {
                            Context a9 = Utils.getContext();
                            GATracker a10 = GATracker.getTracker(a9);
                            Context a11 = Utils.getContext();
                            String s1 = a11.getString(2131034239);
                            a10.gaTrackEvent(s1);
                            break label0;
                        }
                        else
                        {
                            Context a12 = Utils.getContext();
                            GATracker a13 = GATracker.getTracker(a12);
                            Context a14 = Utils.getContext();
                            String s2 = a14.getString(2131034225);
                            a13.gaTrackEvent(s2);
                            break label0;
                        }
                    }
                    case NEWS: {
                        Boolean a15 = Utils.getIsMapNavigation();
                        boolean b1 = a15.booleanValue();
                        if(!b1)
                        {
                            Context a16 = Utils.getContext();
                            GATracker a17 = GATracker.getTracker(a16);
                            Context a18 = Utils.getContext();
                            String s3 = a18.getString(2131034234);
                            a17.gaTrackEvent(s3);
                            break label0;
                        }
                        else
                        {
                            Context a19 = Utils.getContext();
                            GATracker a20 = GATracker.getTracker(a19);
                            Context a21 = Utils.getContext();
                            String s4 = a21.getString(2131034221);
                            a20.gaTrackEvent(s4);
                            break label0;
                        }
                    }
                }
            }
            case 1: {
                Log.d("SPF", "NEWS FB: ....");

                switch(a){
                    case MISSING: {
                        Boolean a23 = Utils.getIsMapNavigation();
                        boolean b2 = a23.booleanValue();
                        if(!b2)
                        {
                            Context a24 = Utils.getContext();
                            GATracker a25 = GATracker.getTracker(a24);
                            Context a26 = Utils.getContext();
                            String s5 = a26.getString(2131034241);
                            a25.gaTrackEvent(s5);
                            break label0;
                        }
                        else
                        {
                            Context a27 = Utils.getContext();
                            GATracker a28 = GATracker.getTracker(a27);
                            Context a29 = Utils.getContext();
                            String s6 = a29.getString(2131034227);
                            a28.gaTrackEvent(s6);
                            break label0;
                        }
                    }
                    case APPEAL: {
                        Boolean a30 = Utils.getIsMapNavigation();
                        boolean b3 = a30.booleanValue();
                        if(!b3)
                        {
                            Context a31 = Utils.getContext();
                            GATracker a32 = GATracker.getTracker(a31);
                            Context a33 = Utils.getContext();
                            String s7 = a33.getString(2131034237);
                            a32.gaTrackEvent(s7);
                            break label0;
                        }
                        else
                        {
                            Context a34 = Utils.getContext();
                            GATracker a35 = GATracker.getTracker(a34);
                            Context a36 = Utils.getContext();
                            String s8 = a36.getString(2131034223);
                            a35.gaTrackEvent(s8);
                            break label0;
                        }
                    }
                    case NEWS: {
                        Boolean a37 = Utils.getIsMapNavigation();
                        boolean b4 = a37.booleanValue();
                        if(!b4)
                        {
                            Context a38 = Utils.getContext();
                            GATracker a39 = GATracker.getTracker(a38);
                            Context a40 = Utils.getContext();
                            String s9 = a40.getString(2131034232);
                            a39.gaTrackEvent(s9);
                            break label0;
                        }
                        else
                        {
                            Context a41 = Utils.getContext();
                            GATracker a42 = GATracker.getTracker(a41);
                            Context a43 = Utils.getContext();
                            String s10 = a43.getString(2131034219);
                            a42.gaTrackEvent(s10);
                            break label0;
                        }
                    }
                }
            }
            case 0: {
                
                switch(a){
                    case MISSING: {
                        Boolean a45 = Utils.getIsMapNavigation();
                        boolean b5 = a45.booleanValue();
                        if(!b5)
                        {
                            Context a46 = Utils.getContext();
                            GATracker a47 = GATracker.getTracker(a46);
                            Context a48 = Utils.getContext();
                            String s11 = a48.getString(2131034242);
                            a47.gaTrackEvent(s11);
                            break label0;
                        }
                        else
                        {
                            Context a49 = Utils.getContext();
                            GATracker a50 = GATracker.getTracker(a49);
                            Context a51 = Utils.getContext();
                            String s12 = a51.getString(2131034228);
                            a50.gaTrackEvent(s12);
                            break label0;
                        }
                    }
                    case APPEAL: {
                        Boolean a52 = Utils.getIsMapNavigation();
                        boolean b6 = a52.booleanValue();
                        if(!b6)
                        {
                            Context a53 = Utils.getContext();
                            GATracker a54 = GATracker.getTracker(a53);
                            Context a55 = Utils.getContext();
                            String s13 = a55.getString(2131034238);
                            a54.gaTrackEvent(s13);
                            break label0;
                        }
                        else
                        {
                            Context a56 = Utils.getContext();
                            GATracker a57 = GATracker.getTracker(a56);
                            Context a58 = Utils.getContext();
                            String s14 = a58.getString(2131034224);
                            a57.gaTrackEvent(s14);
                            break label0;
                        }
                    }
                    case NEWS: {
                        Boolean a59 = Utils.getIsMapNavigation();
                        boolean b7 = a59.booleanValue();
                        if(!b7)
                        {
                            Context a60 = Utils.getContext();
                            GATracker a61 = GATracker.getTracker(a60);
                            Context a62 = Utils.getContext();
                            String s15 = a62.getString(2131034233);
                            a61.gaTrackEvent(s15);
                            break label0;
                        }
                        else
                        {
                            Context a63 = Utils.getContext();
                            GATracker a64 = GATracker.getTracker(a63);
                            Context a65 = Utils.getContext();
                            String s16 = a65.getString(2131034220);
                            a64.gaTrackEvent(s16);
                            break label0;
                        }
                    }
                }
            }
        }
    }
    
    public static void setIsMapNavigation(Boolean a)
    {
        isMapNavigation = a;
    }
    
    public static void setLastLocation(android.location.Location a)
    {
        lastLocation = a;
    }
    
    public static void shareViaFacebook(String s, String s0, String s1, SPFTwitterFacebookInterface a)
    {
        twitFbInterface = a;
        shareTitle = s0;
        shareUrl = s1;
        Object a0 = twitFbInterface;
        ((SPFTwitterFacebookInterface)a0).shareText(s);
        postCalled = false;
        Utils.postToWallFB();
    }
    
    public static void shareViaTwitter(String s, SPFTwitterFacebookInterface a)
    {
        twitFbInterface = a;
        twitFbInterface.shareText(s);
        StringBuilder a1 = new StringBuilder("Text Size is: ");
        a1.append(s.length());
        Log.i("Text Size", a1.toString());
        TwitterApp a4 = twitFbInterface.twitterInterface();
        StringBuilder a5 = new StringBuilder("mTwitter ");
        StringBuilder a6 = a5.append((Object)a4);
        Log.i("mTwitter", a6.toString());
        a4.setListener(mTwLoginDialogListener);
        a4.resetAccessToken();
        if(!a4.hasAccessToken())
        {
            a4.authorize();
        }
        else
        {
            try
            {
                a4.updateStatus(s);
                Constants.FROM a8 = Constants.FROM.TWITTER_POST;
                Constants.MESSAGE a9 = Constants.MESSAGE.SUCCESS;
                Utils.postAsToast(a8, a9);
            }
            catch(Exception a10)
            {
                String s2 = a10.getMessage();
                String s3 = s2.toString();
                boolean b0 = s3.contains((CharSequence)"duplicate");
                if(b0)
                {
                    Constants.FROM a11 = Constants.FROM.TWITTER_POST;
                    Constants.MESSAGE a12 = Constants.MESSAGE.DUPLICATE;
                    Utils.postAsToast(a11, a12);
                }
                a10.printStackTrace();
            }
            a4.resetAccessToken();
        }
    }
    
    public static float spacing(MotionEvent a, MotionEvent a0)
    {
        float f = a.getX();
        float f0 = a0.getX();
        float f1 = f - f0;
        float f2 = a.getY();
        float f3 = a0.getY();
        float f4 = f2 - f3;
        float f5 = f1 * f1;
        float f6 = f4 * f4;
        float f7 = f5 + f6;
        float f8 = FloatMath.sqrt(f7);
        return f8;
    }
    
    public static void toastError(Constants.ERROR a, final Context a0, android.os.Handler a1)
    {
        
        switch(a){
            case NO_CONNECTION: {
                a1.post((Runnable) new Runnable() {
             
                    
                    public void run()
                    {
                        android.widget.Toast.makeText(a0, 2131034127, Toast.LENGTH_SHORT).show();
                        
                    }
                });
                break;
            }
        }
    }
}
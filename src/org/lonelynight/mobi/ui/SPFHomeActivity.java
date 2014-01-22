package org.spf.mobi.ui;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.util.ArrayList;
import android.content.*;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.*;
import android.view.*;
import android.widget.*;

import org.spf.utils.*;
import org.spf.utils.parser.SPFXmlPullParser;

import org.spf.ui.web.SPFWebHome;
import org.spf.data.SPFBanner;
import org.spf.mobi.ui.videos.SPFVideoOptions;
import org.spf.mobi.ui.aboutus.SPFAboutus;
import org.spf.mobi.ui.locator.SPFLocatorListing;
import org.spf.mobi.ui.missing.SPFMissingListing;
import org.spf.mobi.ui.appeal.SPFAppealListing;
import org.spf.mobi.ui.async.SPFImageDownloadTask;
import org.spf.mobi.ui.contact.SPFContactNumber;
import org.spf.mobi.ui.news.SPFNewsListing;
import org.spf.mobi.ui.map.SPFInteractiveMapActivity;
import org.xmlpull.v1.XmlPullParserException;


public class SPFHomeActivity extends SPFActivity implements Constants, SPFResponseHandler {
    public static int Height;
    protected static int Width;
    public static boolean isFinishing;
    private org.spf.data.SPFArrayList arrayListBanners;
    private ArrayList<SPFBanner> bannersToDownload;
    int countBannerResopnse;
    int countTimerRunnable;
    String defaultFileName;
    org.spf.mobi.ui.async.SPFImageDownloadTask downloadBannerImageTasks;
    private ViewFlipper flip;
    private android.view.GestureDetector gestureDetector;
    ArrayList imageFilesToDelete;
    ImageView imgBanner;
    boolean isCommingBack;
    boolean isDefaultCashed;
    boolean isDownloadComplete;
    private ArrayList<SPFBanner> lastShownBanners;
    private android.view.View.OnTouchListener listener;
    private ArrayList<SPFBanner> loadableBanners;
    private android.os.Handler mHandler;
    private AdapterView.OnItemClickListener mItemClickListner;
    boolean showNext;
    private Thread thread;
    Runnable timerRunnable;
    
    static
    {
        isFinishing = false;
        Width = 0;
        Height = 0;
    }
    
    public SPFHomeActivity()
    {
        super();
        this.thread = null;
        this.countBannerResopnse = 0;
        this.isDownloadComplete = false;
        this.isCommingBack = true;
        this.countTimerRunnable = 0;
        this.defaultFileName = "";
        this.isDefaultCashed = false;
        this.mItemClickListner = new AdapterView.OnItemClickListener() {
            
            public void onItemClick(AdapterView a, android.view.View a0, int i, long j)
            {
                int i0 = (int)j;
                Constants.SCREENS a1 = Constants.SCREENS.valueAt(i0);
                StringBuilder a2 = new StringBuilder();
                StringBuilder a3 = a2.append((Object)a1);
                Log.i("PRINT IT", a3.toString());
                
                switch(a1){
                    case WEB: {
                        GATracker a6 = GATracker.getTracker(SPFHomeActivity.this);
                        String s0 = getString(2131034217);
                        a6.gaTrackEvent(s0);
                        Intent a10 = new Intent((Context)SPFHomeActivity.this, SPFWebHome.class);
                        startActivity(a10);
                        break;
                    }
                    case VIDEOS: {
                        GATracker a12 = GATracker.getTracker(SPFHomeActivity.this);

                        String s1 = getString(2131034216);
                        a12.gaTrackEvent(s1);
                        Intent a16 = new Intent((Context)SPFHomeActivity.this, SPFVideoOptions.class);
                        startActivity(a16);
                        break;
                    }
                    case CONTACT: {
                        GATracker a18 = GATracker.getTracker((Context)SPFHomeActivity.this);
                        String s2 = getString(2131034215);
                        a18.gaTrackEvent(s2);
                        Intent a22 = new Intent((Context)SPFHomeActivity.this, SPFContactNumber.class);
                        startActivity(a22);
                        break;
                    }
                    case JOINUS: {
                        GATracker a24 = GATracker.getTracker((Context)SPFHomeActivity.this);
                        String s3 = getString(2131034214);
                        a24.gaTrackEvent(s3);

                        Intent a28 = new Intent((Context)SPFHomeActivity.this, SPFAboutus.class);
                        startActivity(a28);
                        break;
                    }
                    case LOCATOR: {
                        GATracker a30 = GATracker.getTracker((Context)SPFHomeActivity.this);
                        String s4 = getString(2131034213);
                        a30.gaTrackEvent(s4);
                        Intent a33 = new Intent((Context)SPFHomeActivity.this, SPFLocatorListing.class);
                        Constants.SCREENS a34 = Constants.SCREENS.LOCATOR;
                        a33.putExtra("SCREEN_ID", a34.ordinal());
                        startActivity(a33);
                        break;
                    }
                    case MISSING: {
                        GATracker a37 = GATracker.getTracker((Context)SPFHomeActivity.this);
                        String s5 = getString(2131034212);
                        a37.gaTrackEvent(s5);
                        Boolean a39 = Boolean.valueOf(false);
                        Utils.setIsMapNavigation(a39);
                        Intent a41 = new Intent((Context)SPFHomeActivity.this, SPFMissingListing.class);
                        Constants.SCREENS a42 = Constants.SCREENS.MISSING;
                        a41.putExtra("SCREEN_ID", a42.ordinal());
                        Constants.MISSING_PERSON_INFO.URL a43 = Constants.MISSING_PERSON_INFO.URL.DISPLAY_BY_DATE;
                        String s6 = Constants.MISSING_PERSON_INFO.URL.getUrl(a43);
                        a41.putExtra("PASSING_URL", s6);
                        startActivity(a41);
                        break;
                    }
                    case APPEAL: {
                        GATracker a46 = GATracker.getTracker((Context)SPFHomeActivity.this);
                        String s7 = getString(2131034211);
                        a46.gaTrackEvent(s7);
                        Boolean a48 = Boolean.valueOf(false);
                        Utils.setIsMapNavigation(a48);
                        Intent a50 = new Intent((Context)SPFHomeActivity.this, SPFAppealListing.class);
                        Constants.SCREENS a51 = Constants.SCREENS.APPEAL;
                        a50.putExtra("SCREEN_ID", a51.ordinal());
                        Constants.POLICE_APPEAL.URL a52 = Constants.POLICE_APPEAL.URL.DISPLAY_BY_DATE;
                        String s8 = Constants.POLICE_APPEAL.URL.getUrl(a52);
                        a50.putExtra("PASSING_URL", s8);
                        startActivity(a50);
                        break;
                    }
                    case NEWS: {
                        GATracker a55 = GATracker.getTracker((Context)SPFHomeActivity.this);
                        String s9 = getString(2131034210);
                        a55.gaTrackEvent(s9);
                        Boolean a57 = Boolean.valueOf(false);
                        Utils.setIsMapNavigation(a57);
                        Intent a59 = new Intent((Context)SPFHomeActivity.this, SPFNewsListing.class);
                        Constants.SCREENS a60 = Constants.SCREENS.NEWS;
                        int i6 = a60.ordinal();
                        a59.putExtra("SCREEN_ID", i6);
                        Constants.NEWS_CRIME_INFO.URL a61 = Constants.NEWS_CRIME_INFO.URL.DISPLAY_BY_DATE;
                        String s10 = Constants.NEWS_CRIME_INFO.URL.getUrl(a61);
                        a59.putExtra("PASSING_URL", s10);
                        startActivity(a59);
                        break;
                    }
                    case MAP: {
                        GATracker a64 = GATracker.getTracker((Context)SPFHomeActivity.this);
                        String s11 = getString(2131034209);
                        a64.gaTrackEvent(s11);
                        Boolean a66 = Boolean.valueOf(true);
                        Utils.setIsMapNavigation(a66);
                        Intent a69 = new Intent((Context)SPFHomeActivity.this, SPFInteractiveMapActivity.class);
                        startActivity(a69);
                        break;
                    }
                }
            }
        };

        this.listener = (android.view.View.OnTouchListener) new View.OnTouchListener() {
            
            public boolean onTouch(View a, MotionEvent a0)
            {
            	gestureDetector.onTouchEvent(a0);
                return false;
            }
        };
        
        
        this.showNext = true;

        final int i = 0;
        
        this.timerRunnable = new Runnable() {
            
            
            public void run()
            {
                int i0 = i;

                int i1 = loadableBanners.size();
                if(i0 >= i1)
                {
                    i = 0;
                }
                StringBuilder a1 = new StringBuilder("ROLL COUNT:");
                int i2 = i;
                String s = Integer.toString(i2);
                StringBuilder a2 = a1.append(s);
                String s0 = a2.toString();
                Log.d("SPF", s0);
                mHandler.postDelayed((Runnable)this, 3000L);
                if(loadableBanners.size() > 0)
                {
                    System.gc();

                    imgBanner.setImageBitmap(null);
                    SPFBanner a14 = (SPFBanner)loadableBanners.get(i);
                    Bitmap a15 = a14.getBitmapThumb();
                    imgBanner.setImageBitmap(a15);
                    imgBanner.setTag((Object)Integer.valueOf(i));
                    int i6 = i;
                    int i7 = 1 + i6;
                    i = i7;
                }
            }
        };
    }
    
    static android.view.GestureDetector access$0(org.spf.mobi.ui.SPFHomeActivity a)
    {
        android.view.GestureDetector a0 = a.gestureDetector;
        return a0;
    }
    
    static ArrayList access$1(org.spf.mobi.ui.SPFHomeActivity a)
    {
        java.util.ArrayList a0 = a.loadableBanners;
        return a0;
    }
    
    static android.os.Handler access$2(org.spf.mobi.ui.SPFHomeActivity a)
    {
        android.os.Handler a0 = a.mHandler;
        return a0;
    }
    
    static ViewFlipper access$3(org.spf.mobi.ui.SPFHomeActivity a)
    {
        ViewFlipper a0 = a.flip;
        return a0;
    }
    
    static void access$4(org.spf.mobi.ui.SPFHomeActivity a, org.spf.data.SPFArrayList a0)
    {
        a.arrayListBanners = a0;
    }
    
    static org.spf.data.SPFArrayList access$5(org.spf.mobi.ui.SPFHomeActivity a)
    {
        org.spf.data.SPFArrayList a0 = a.arrayListBanners;
        return a0;
    }
    
    static void access$6(org.spf.mobi.ui.SPFHomeActivity a, java.util.ArrayList a0)
    {
        a.bannersToDownload = a0;
    }
    
    static java.util.ArrayList access$7(org.spf.mobi.ui.SPFHomeActivity a)
    {
        java.util.ArrayList a0 = a.bannersToDownload;
        return a0;
    }
    
    private void loadBanners()
    {
        java.util.ArrayList<SPFBanner> a = new java.util.ArrayList<SPFBanner>();
        this.loadableBanners = a;
        final String s = "https://www.spfiphone.gov.sg/SPFService/list_banner.spf".replace((CharSequence)" ", (CharSequence)"%20");
        StringBuilder a0 = new StringBuilder("mUrl::");
        StringBuilder a1 = a0.append(s);
        String s0 = a1.toString();
        Log.d("SPF", s0);
        this.thread = new Thread() {

            public void run()
            {
                		SPFHomeActivity.this.arrayListBanners = new SPFXmlPullParser(s).parseDataForBanners();
						mHandler.post(new Runnable() {
						    
						    public void run()
						    {
						                    if(isInterrupted())
						                    {
						                        return;
						                    }
						                    
						                    if(SPFHomeActivity.this.isFinishing())
						                    {
						                    	return;
						                    }
						                    SPFHomeActivity.this.removeDialog(0);
						                    if(SPFHomeActivity.this.arrayListBanners == null)
						                    {
						                    	return;
						                    }

						                    if(SPFHomeActivity.this.arrayListBanners.size() <= 0)
						                    {
						                    	
						                    	return;
						                    }
						                    ArrayList<SPFBanner> a13 = new ArrayList<SPFBanner>();
						                    SPFHomeActivity.this.bannersToDownload = a13;
						                    SPFHomeActivity.this.doFilterToDownload();
						                    StringBuilder a16 = new StringBuilder("BANNER Array List::");
						                    StringBuilder a20 = a16.append(SPFHomeActivity.this.arrayListBanners.size());
						                    Log.d("SPF", a20.toString());
						                    
						                    if(SPFHomeActivity.this.bannersToDownload.size() <= 0)
						                    {
						                    	SPFHomeActivity.this.startTimer();
						                    	return;
						                    }
						                    
						                    for(int i2 = 0; i2 < SPFHomeActivity.this.bannersToDownload.size(); i2++)
						                    {
						                    	SPFHomeActivity.this.downloadBannerImageTasks = new SPFImageDownloadTask((SPFResponseHandler)SPFHomeActivity.this);
						                        SPFImageDownloadTask a39 = SPFHomeActivity.this.downloadBannerImageTasks;
						                        SPFBanner[] a40 = new SPFBanner[1];
						                        a40[0] = (SPFBanner) SPFHomeActivity.this.bannersToDownload.get(i2);
						                        a39.execute((Object[])a40);
						                    }
						               
						    }
						});
                      
                    
                
            }
        };
        Thread a3 = this.thread;
        a3.start();
    }
    
    public void bannerReceived(org.spf.data.SPFBanner a)
    {
        int i = this.countBannerResopnse;
        int i0 = 1 + i;
        this.countBannerResopnse = i0;
        StringBuilder a0 = new StringBuilder("BANNER DATA countBannerResopnse:");
        int i1 = this.countBannerResopnse;
        String s = Integer.toString(i1);
        StringBuilder a1 = a0.append(s);
        String s0 = a1.toString();
        Log.d("SPF", s0);
        if(a == null)
        {
            Log.d("SPF", "BANNER NULL");
        }
        else
        {
            android.graphics.Bitmap a2 = a.getBitmapThumb();
            label2: {
                label1: {
                    label0: {
                        if(a2 == null)
                        {
                            break label0;
                        }
                        android.graphics.Bitmap a3 = a.getBitmapFull();
                        if(a3 != null)
                        {
                            break label1;
                        }
                    }
                    Log.d("SPF", "BANNER DATA NULL");
                    break label2;
                }
                java.util.ArrayList a4 = this.loadableBanners;
                a4.add((Object)a);
            }
            StringBuilder a5 = new StringBuilder("loadableBanners Size::");
            java.util.ArrayList a6 = this.loadableBanners;
            int i2 = a6.size();
            String s1 = Integer.toString(i2);
            StringBuilder a7 = a5.append(s1);
            String s2 = a7.toString();
            Log.d("SPF", s2);
        }
        StringBuilder a8 = new StringBuilder("countBannerResopnse:");
        int i3 = this.countBannerResopnse;
        String s3 = Integer.toString(i3);
        StringBuilder a9 = a8.append(s3);
        String s4 = a9.toString();
        Log.d("SPF", s4);
        StringBuilder a10 = new StringBuilder("bannersToDownload.size:");
        java.util.ArrayList a11 = this.bannersToDownload;
        int i4 = a11.size();
        String s5 = Integer.toString(i4);
        StringBuilder a12 = a10.append(s5);
        String s6 = a12.toString();
        Log.d("SPF", s6);
        int i5 = this.countBannerResopnse;
        java.util.ArrayList a13 = this.bannersToDownload;
        int i6 = a13.size();
        if(i5 == i6)
        {
            this.saveBannersInternal();
            this.startTimer();
        }
    }
    
    public void deleteUnUsedImages()
    {
        android.content.Context a = this.getApplicationContext();
        java.io.File a0 = a.getFilesDir();
        java.io.File[] a1 = a0.listFiles();
        int i = a1.length;
        int i0 = 0;
        int i1 = 0;
        while(true)
        {
            int i2 = i0;
            if(i1 < i)
            {
                int i3 = i2;
                java.io.File a2 = a1[i1];
                int i4 = i3;
                java.util.ArrayList a3 = this.loadableBanners;
                int i5 = i4;
                Object a4 = a3.iterator();
                int i6 = i5;
                int i7 = i6;
                while(true)
                {
                    boolean b = ((java.util.Iterator)a4).hasNext();
                    int i8 = i7;
                    int i9 = i8;
                    int i10 = i8;
                    if(b)
                    {
                        int i11 = i10;
                        Object a5 = ((java.util.Iterator)a4).next();
                        int i12 = i11;
                        org.spf.data.SPFBanner dummy = (org.spf.data.SPFBanner)a5;
                        org.spf.data.SPFBanner a6 = (org.spf.data.SPFBanner)a5;
                        int i13 = i12;
                        String s = a2.getName();
                        int i14 = i13;
                        String s0 = s.trim();
                        int i15 = i14;
                        int i16 = i15;
                        StringBuilder a7 = new StringBuilder("F");
                        int i17 = i16;
                        String s1 = a6.getImageUrl();
                        int i18 = i17;
                        StringBuilder a8 = a7.append(s1);
                        int i19 = i18;
                        String s2 = a8.toString();
                        int i20 = i19;
                        boolean b0 = s0.equalsIgnoreCase(s2);
                        int i21 = i20;
                        int i22 = i21;
                        if(!b0)
                        {
                            int i23 = i22;
                            String s3 = a2.getName();
                            int i24 = i23;
                            String s4 = s3.trim();
                            int i25 = i24;
                            int i26 = i25;
                            StringBuilder a9 = new StringBuilder("T");
                            int i27 = i26;
                            String s5 = a6.getThumbUrl();
                            int i28 = i27;
                            StringBuilder a10 = a9.append(s5);
                            int i29 = i28;
                            String s6 = a10.toString();
                            int i30 = i29;
                            boolean b1 = s4.equalsIgnoreCase(s6);
                            int i31 = i30;
                            int i32 = i31;
                            if(!b1)
                            {
                                i7 = i32;
                                continue;
                            }
                        }
                        i7 = 1;
                    }
                    else
                    {
                        int i33 = 0;
                        int i34 = i9;
                        int i35 = i34;
                        if(i34 != 0)
                        {
                            i33 = i35;
                        }
                        else
                        {
                            a2.delete();
                            i33 = 0;
                        }
                        int i36 = i1 + 1;
                        i0 = i33;
                        i1 = i36;
                        break;
                    }
                }
            }
            else
            {
                break;
            }
        }
    }
    
    public void doFilterToDownload()
    {
        android.content.Context a = this.getApplicationContext();
        java.io.File a0 = a.getFilesDir();
        java.io.File[] a1 = a0.listFiles();
        java.util.ArrayList a2 = new java.util.ArrayList();
        this.imageFilesToDelete = a2;
        int i = 0;
        while(true)
        {
            org.spf.data.SPFArrayList a3 = this.arrayListBanners;
            int i0 = a3.size();
            if(i < i0)
            {
                org.spf.data.SPFArrayList a4 = this.arrayListBanners;
                Object a5 = a4.get(i);
                org.spf.data.SPFBanner dummy = (org.spf.data.SPFBanner)a5;
                org.spf.data.SPFBanner a6 = (org.spf.data.SPFBanner)a5;
                int i1 = a1.length;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while(true)
                {
                    int i5 = i2;
                    int i6 = i3;
                    if(i4 < i1)
                    {
                        int i7 = 0;
                        int i8 = 0;
                        int i9 = 0;
                        int i10 = 0;
                        int i11 = i5;
                        int i12 = i6;
                        java.io.File a7 = a1[i4];
                        int i13 = i11;
                        int i14 = i12;
                        Log.d("SPF", "*******************s");
                        int i15 = i13;
                        int i16 = i14;
                        int i17 = i15;
                        int i18 = i16;
                        StringBuilder a8 = new StringBuilder("file.getName():");
                        int i19 = i17;
                        int i20 = i18;
                        String s = a7.getName();
                        int i21 = i19;
                        int i22 = i20;
                        String s0 = s.trim();
                        int i23 = i21;
                        int i24 = i22;
                        StringBuilder a9 = a8.append(s0);
                        int i25 = i23;
                        int i26 = i24;
                        String s1 = a9.toString();
                        int i27 = i25;
                        int i28 = i26;
                        Log.d("SPF", s1);
                        int i29 = i27;
                        int i30 = i28;
                        int i31 = i29;
                        int i32 = i30;
                        StringBuilder a10 = new StringBuilder("getImageUrl():");
                        int i33 = i31;
                        int i34 = i32;
                        String s2 = a6.getImageUrl();
                        int i35 = i33;
                        int i36 = i34;
                        String s3 = s2.trim();
                        int i37 = i35;
                        int i38 = i36;
                        StringBuilder a11 = a10.append(s3);
                        int i39 = i37;
                        int i40 = i38;
                        String s4 = a11.toString();
                        int i41 = i39;
                        int i42 = i40;
                        Log.d("SPF", s4);
                        int i43 = i41;
                        int i44 = i42;
                        int i45 = i43;
                        int i46 = i44;
                        StringBuilder a12 = new StringBuilder("getThumbUrl()");
                        int i47 = i45;
                        int i48 = i46;
                        String s5 = a6.getThumbUrl();
                        int i49 = i47;
                        int i50 = i48;
                        String s6 = s5.trim();
                        int i51 = i49;
                        int i52 = i50;
                        StringBuilder a13 = a12.append(s6);
                        int i53 = i51;
                        int i54 = i52;
                        String s7 = a13.toString();
                        int i55 = i53;
                        int i56 = i54;
                        Log.d("SPF", s7);
                        int i57 = i55;
                        int i58 = i56;
                        String s8 = a7.getName();
                        int i59 = i57;
                        int i60 = i58;
                        String s9 = s8.trim();
                        int i61 = i59;
                        int i62 = i60;
                        int i63 = i61;
                        int i64 = i62;
                        StringBuilder a14 = new StringBuilder("F");
                        int i65 = i63;
                        int i66 = i64;
                        String s10 = a6.getImageUrl();
                        int i67 = i65;
                        int i68 = i66;
                        String s11 = s10.trim();
                        int i69 = i67;
                        int i70 = i68;
                        StringBuilder a15 = a14.append(s11);
                        int i71 = i69;
                        int i72 = i70;
                        String s12 = a15.toString();
                        int i73 = i71;
                        int i74 = i72;
                        boolean b = s9.equalsIgnoreCase(s12);
                        int i75 = i73;
                        int i76 = i74;
                        int i77 = i75;
                        int i78 = i75;
                        int i79 = i76;
                        if(!b)
                        {
                            i7 = i78;
                            i8 = i79;
                        }
                        else
                        {
                            int i80 = i77;
                            i7 = i80;
                            i8 = 1;
                        }
                        String s13 = a7.getName();
                        int i81 = i7;
                        int i82 = i8;
                        String s14 = s13.trim();
                        int i83 = i81;
                        int i84 = i82;
                        int i85 = i83;
                        int i86 = i84;
                        StringBuilder a16 = new StringBuilder("T");
                        int i87 = i85;
                        int i88 = i86;
                        String s15 = a6.getThumbUrl();
                        int i89 = i87;
                        int i90 = i88;
                        String s16 = s15.trim();
                        int i91 = i89;
                        int i92 = i90;
                        StringBuilder a17 = a16.append(s16);
                        int i93 = i91;
                        int i94 = i92;
                        String s17 = a17.toString();
                        int i95 = i93;
                        int i96 = i94;
                        boolean b0 = s14.equalsIgnoreCase(s17);
                        int i97 = i95;
                        int i98 = i96;
                        int i99 = i98;
                        int i100 = i97;
                        int i101 = i98;
                        if(!b0)
                        {
                            i9 = i100;
                            i10 = i101;
                        }
                        else
                        {
                            int i102 = i99;
                            i9 = 1;
                            i10 = i102;
                        }
                        int i103 = i4 + 1;
                        i2 = i9;
                        i3 = i10;
                        i4 = i103;
                    }
                    else
                    {
                        label2: {
                            label1: {
                                label0: {
                                    if(i3 == 0)
                                    {
                                        break label0;
                                    }
                                    if(i2 != 0)
                                    {
                                        break label1;
                                    }
                                }
                                java.util.ArrayList a18 = this.bannersToDownload;
                                a18.add((Object)a6);
                                break label2;
                            }
                            StringBuilder a19 = new StringBuilder("F");
                            String s18 = a6.getImageUrl();
                            StringBuilder a20 = a19.append(s18);
                            String s19 = a20.toString();
                            android.graphics.Bitmap a21 = this.getInternalImage(s19);
                            StringBuilder a22 = new StringBuilder("T");
                            String s20 = a6.getThumbUrl();
                            StringBuilder a23 = a22.append(s20);
                            String s21 = a23.toString();
                            android.graphics.Bitmap a24 = this.getInternalImage(s21);
                            if(a24 != null)
                            {
                                if(a21 != null)
                                {
                                    a6.setBitmapThumb(a24);
                                    System.gc();
                                    ArrayList<SPFBanner> a25 = this.loadableBanners;
                                    a25.add(a6);
                                }
                            }
                        }
                        System.gc();
                        int i104 = i + 1;
                        i = i104;
                        break;
                    }
                }
            }
            else
            {
                break;
            }
        }
        StringBuilder a26 = new StringBuilder("arrayListBanners Size::");
        org.spf.data.SPFArrayList a27 = this.arrayListBanners;
        int i105 = a27.size();
        String s22 = Integer.toString(i105);
        StringBuilder a28 = a26.append(s22);
        String s23 = a28.toString();
        Log.d("SPF", s23);
        StringBuilder a29 = new StringBuilder("loadableBanners Size::");
        java.util.ArrayList a30 = this.loadableBanners;
        int i106 = a30.size();
        String s24 = Integer.toString(i106);
        StringBuilder a31 = a29.append(s24);
        String s25 = a31.toString();
        Log.d("SPF", s25);
        StringBuilder a32 = new StringBuilder("bannersToDownload Size::");
        java.util.ArrayList a33 = this.bannersToDownload;
        int i107 = a33.size();
        String s26 = Integer.toString(i107);
        StringBuilder a34 = a32.append(s26);
        String s27 = a34.toString();
        Log.d("SPF", s27);
        this.deleteUnUsedImages();
    }
    
    public void findFullImageNameForThump()
    {
        StringBuilder a = new StringBuilder("defaultTHUMPName::::::");
        String s = this.defaultFileName;
        StringBuilder a0 = a.append(s);
        String s0 = a0.toString();
        Log.d("SPF", s0);
        String s1 = this.defaultFileName;
        String[] a1 = s1.split("_");
        String s2 = a1[1];
        this.defaultFileName = s2;
        android.content.Context a2 = this.getApplicationContext();
        java.io.File a3 = a2.getFilesDir();
        java.io.File[] a4 = a3.listFiles();
        int i = a4.length;
        int i0 = 0;
        while(true)
        {
            if(i0 < i)
            {
                java.io.File a5 = a4[i0];
                String s3 = a5.getName();
                String s4 = s3.trim();
                StringBuilder a6 = new StringBuilder("F_");
                String s5 = this.defaultFileName;
                StringBuilder a7 = a6.append(s5);
                String s6 = a7.toString();
                boolean b = s4.startsWith(s6);
                if(!b)
                {
                    int i1 = i0 + 1;
                    i0 = i1;
                    continue;
                }
                String s7 = a5.getName();
                String s8 = s7.trim();
                this.defaultFileName = s8;
                break;
            }
            else
            {
                break;
            }
        }
        StringBuilder a8 = new StringBuilder("defaultFUllName::::::");
        String s9 = this.defaultFileName;
        StringBuilder a9 = a8.append(s9);
        String s10 = a9.toString();
        Log.d("SPF", s10);
    }
    
    public android.graphics.Bitmap getDefaultThumpImage()
    {
        android.graphics.Bitmap a = null;
        android.content.Context a0 = this.getApplicationContext();
        java.io.File a1 = a0.getFilesDir();
        java.io.File[] a2 = a1.listFiles();
        int i = a2.length;
        int i0 = 0;
        while(true)
        {
            if(i0 < i)
            {
                java.io.File a3 = a2[i0];
                String s = a3.getName();
                String s0 = s.trim();
                boolean b = s0.startsWith("T");
                if(!b)
                {
                    int i1 = i0 + 1;
                    i0 = i1;
                    continue;
                }
                String s1 = a3.getName();
                String s2 = s1.trim();
                android.graphics.Bitmap a4 = this.getInternalImage(s2);
                String s3 = a3.getName();
                String s4 = s3.trim();
                this.defaultFileName = s4;
                this.findFullImageNameForThump();
                this.isDefaultCashed = true;
                a = a4;
                break;
            }
            else
            {
                a = null;
                break;
            }
        }
        return a;
    }
    
    public android.graphics.Bitmap getInternalImage(String s)
    {
        android.graphics.Bitmap a = null;
        label1: {
            Exception a0 = null;
            label0: {
                android.graphics.Bitmap a1 = null;
                try
                {
                    Log.d("SPF", s);
                    android.content.Context a2 = this.getApplicationContext();
                    java.io.File a3 = a2.getFilesDir();
                    String s0 = a3.getAbsolutePath();
                    String s1 = String.valueOf((Object)s0);
                    StringBuilder a4 = new StringBuilder(s1);
                    StringBuilder a5 = a4.append("/");
                    StringBuilder a6 = a5.append(s);
                    String s2 = a6.toString();
                    java.io.File a7 = new java.io.File(s2);
                    Log.d("SPF", "Get Internal called");
                    a1 = org.spf.utils.SPFImageProcess.decodeSampledBitmapFromFile(s2, 320, 80);
                }
                catch(Exception a8)
                {
                    a0 = a8;
                    break label0;
                }
                a = a1;
                break label1;
            }
            a0.printStackTrace();
            a = null;
        }
        return a;
    }
    
    public void onBackPressed()
    {
        isFinishing = true;
        super.onBackPressed();
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
        this.setContentView(2130903048);
        Object a0 = this.getWindowManager();
        android.view.Display a1 = ((android.view.WindowManager)a0).getDefaultDisplay();
        int i = a1.getWidth();
        int i0 = i / 3;
        Width = i0;
        android.content.res.Resources a2 = this.getResources();
        DisplayMetrics a3 = a2.getDisplayMetrics();
        float f = a3.density;
        float f0 = 100.0f * f;
        int i1 = (int)f0;
        Height = i1;
        android.view.View a4 = this.findViewById(2131165250);
        GridView dummy = (GridView)a4;
        GridView a5 = (GridView)a4;
        int[] a6 = org.spf.utils.Constants.HOME.RIDS;
        org.spf.mobi.ui.SPFHomeScreenIcons a7 = new org.spf.mobi.ui.SPFHomeScreenIcons((android.content.Context)this, a6, 0);
        a5.setAdapter((ListAdapter)a7);
        android.view.View a8 = this.findViewById(2131165250);
        GridView dummy0 = (GridView)a8;
        GridView a9 = (GridView)a8;
        Object a10 = this.mItemClickListner;
        a9.setOnItemClickListener((AdapterView.OnItemClickListener)a10);
        android.view.View a11 = this.findViewById(2131165253);
        GridView dummy1 = (GridView)a11;
        GridView a12 = (GridView)a11;
        int[] a13 = org.spf.utils.Constants.HOME.RIDS1;
        org.spf.mobi.ui.SPFHomeScreenIcons a14 = new org.spf.mobi.ui.SPFHomeScreenIcons((android.content.Context)this, a13, 6);
        a12.setAdapter((ListAdapter)a14);
        android.view.View a15 = this.findViewById(2131165253);
        GridView dummy2 = (GridView)a15;
        GridView a16 = (GridView)a15;
        Object a17 = this.mItemClickListner;
        a16.setOnItemClickListener((AdapterView.OnItemClickListener)a17);
        android.view.View a18 = this.findViewById(2131165250);
        GridView dummy3 = (GridView)a18;
        GridView a19 = (GridView)a18;
        int i2 = Width;
        a19.setColumnWidth(i2);
        android.view.View a20 = this.findViewById(2131165253);
        GridView dummy4 = (GridView)a20;
        GridView a21 = (GridView)a20;
        int i3 = Width;
        a21.setColumnWidth(i3);
        android.view.View a22 = this.findViewById(2131165248);
        ViewFlipper dummy5 = (ViewFlipper)a22;
        ViewFlipper a23 = (ViewFlipper)a22;
        this.flip = a23;
        org.spf.mobi.ui.SPFHomeActivity.MyGuesture a24 = new org.spf.mobi.ui.SPFHomeActivity.MyGuesture(this, (org.spf.mobi.ui.SPFHomeActivity.MyGuesture)null);
        android.view.GestureDetector a25 = new android.view.GestureDetector((android.view.GestureDetector.OnGestureListener)a24);
        this.gestureDetector = a25;
        ViewFlipper a26 = this.flip;
        Object a27 = this.listener;
        a26.setOnTouchListener((android.view.View.OnTouchListener)a27);
        android.view.View a28 = this.findViewById(2131165250);
        GridView dummy6 = (GridView)a28;
        GridView a29 = (GridView)a28;
        Object a30 = this.listener;
        a29.setOnTouchListener((android.view.View.OnTouchListener)a30);
        android.view.View a31 = this.findViewById(2131165253);
        GridView dummy7 = (GridView)a31;
        GridView a32 = (GridView)a31;
        Object a33 = this.listener;
        a32.setOnTouchListener((android.view.View.OnTouchListener)a33);
        ViewFlipper a34 = this.flip;
        a34.setFlipInterval(2000);
        ViewFlipper a35 = this.flip;
        a35.setInAnimation((android.content.Context)this, 17432576);
        ViewFlipper a36 = this.flip;
        a36.setOutAnimation((android.content.Context)this, 17432577);
        android.view.View a37 = this.findViewById(2131165249);
        ImageView dummy8 = (ImageView)a37;
        ImageView a38 = (ImageView)a37;
        this.imgBanner = a38;
        android.os.Handler a39 = new android.os.Handler();
        this.mHandler = a39;
        this.isCommingBack = false;
        java.util.ArrayList a40 = new java.util.ArrayList();
        this.lastShownBanners = a40;
        ImageView a41 = this.imgBanner;
        org.spf.mobi.ui.SPFHomeActivity.BitmapWorkerTask a42 = new org.spf.mobi.ui.SPFHomeActivity.BitmapWorkerTask((ImageView)this.imgBanner);
        Void[] a43 = new Void[0];
        a42.execute((Bitmap[])a43);
        Log.d("SPF", "Home On Create Called");
    }
    
    protected void onResume()
    {
        ((org.spf.mobi.ui.SPFActivity)this).onResume();
        System.gc();
        this.isDownloadComplete = false;
        this.countBannerResopnse = 0;
        boolean b = this.isCommingBack;
        if(b)
        {
            StringBuilder a = new StringBuilder("isCommingBack:::");
            boolean b0 = this.isCommingBack;
            StringBuilder a0 = a.append(b0);
            String s = a0.toString();
            Log.e("SPF", s);
            java.util.ArrayList<SPFBanner> a1 = this.loadableBanners;
            if(a1 != null)
            {
                java.util.ArrayList a2 = this.loadableBanners;
                int i = a2.size();
                if(i > 0)
                {
                    java.util.ArrayList a3 = this.loadableBanners;
                    this.lastShownBanners = a3;
                    StringBuilder a4 = new StringBuilder("lastShownBanners:::");
                    java.util.ArrayList a5 = this.lastShownBanners;
                    int i0 = a5.size();
                    String s0 = Integer.toString(i0);
                    StringBuilder a6 = a4.append(s0);
                    String s1 = a6.toString();
                    Log.e("SPF", s1);
                }
            }
        }
        this.loadBanners();
    }
    
    protected void onStop()
    {
        android.os.Handler a = this.mHandler;
        a.removeCallbacksAndMessages((Object)null);
        super.onStop();
    }
    
    public void onWindowFocusChanged(boolean b)
    {
        ViewFlipper a = this.flip;
        int i = b?1:0;
        int i0 = a.getMeasuredHeight();
        int i1 = i0 / 7;
        ViewFlipper a0 = this.flip;
        a0.setPadding(0, i1, 0, 0);
        ((org.spf.mobi.ui.SPFActivity)this).onWindowFocusChanged(i != 0);
    }
    
    public void saveBannersInternal()
    {
        android.content.Context a = this.getApplicationContext();
        java.io.File a0 = a.getFilesDir();
        java.util.ArrayList a1 = this.loadableBanners;
        Object a2 = a1.iterator();
        while(true)
        {
            boolean b = ((java.util.Iterator)a2).hasNext();
            if(b)
            {
                Object a3 = ((java.util.Iterator)a2).next();
                org.spf.data.SPFBanner dummy = (org.spf.data.SPFBanner)a3;
                org.spf.data.SPFBanner a4 = (org.spf.data.SPFBanner)a3;
                String s = a0.getAbsolutePath();
                String s0 = String.valueOf((Object)s);
                StringBuilder a5 = new StringBuilder(s0);
                StringBuilder a6 = a5.append("/");
                StringBuilder a7 = a6.append("T");
                String s1 = a4.getThumbUrl();
                StringBuilder a8 = a7.append(s1);
                String s2 = a8.toString();
                String s3 = a0.getAbsolutePath();
                String s4 = String.valueOf((Object)s3);
                StringBuilder a9 = new StringBuilder(s4);
                StringBuilder a10 = a9.append("/");
                StringBuilder a11 = a10.append("F");
                String s5 = a4.getImageUrl();
                StringBuilder a12 = a11.append(s5);
                String s6 = a12.toString();
                StringBuilder a13 = new StringBuilder("thumbPath::");
                StringBuilder a14 = a13.append(s2);
                String s7 = a14.toString();
                Log.d("SPF", s7);
                StringBuilder a15 = new StringBuilder("fullPath::");
                StringBuilder a16 = a15.append(s6);
                String s8 = a16.toString();
                Log.d("SPF", s8);
                android.graphics.Bitmap a17 = a4.getBitmapThumb();
                this.saveImage(s2, a17);
                android.graphics.Bitmap a18 = a4.getBitmapFull();
                this.saveImage(s6, a18);
            }
            else
            {
                break;
            }
        }
    }
    
    public void saveImage(String s, android.graphics.Bitmap a)
    {
        label1: {
            Exception a0 = null;
            label0: {
                try
                {
                    java.io.ByteArrayOutputStream a1 = new java.io.ByteArrayOutputStream();
                    android.graphics.Bitmap.CompressFormat a2 = android.graphics.Bitmap.CompressFormat.PNG;
                    a.compress(a2, 100, (java.io.OutputStream)a1);
                    java.io.File a3 = new java.io.File(s);
                    java.io.FileOutputStream a4 = new java.io.FileOutputStream(a3);
                    byte[] a5 = a1.toByteArray();
                    a4.write(a5);
                    a4.flush();
                    a4.close();
                    Log.d("SPF", "SAVED");
                }
                catch(Exception a6)
                {
                    a0 = a6;
                    break label0;
                }
                break label1;
            }
            a0.printStackTrace();
        }
    }
    
    public void startTimer()
    {
        this.isDownloadComplete = true;
        int i = this.countTimerRunnable;
        if(i > 0)
        {
            android.os.Handler a = this.mHandler;
            Object a0 = this.timerRunnable;
            a.removeCallbacks((Runnable)a0);
            this.countTimerRunnable = 0;
        }
        android.os.Handler a1 = this.mHandler;
        Object a2 = this.timerRunnable;
        a1.post((Runnable)a2);
        int i0 = this.countTimerRunnable;
        int i1 = 1 + i0;
        this.countTimerRunnable = i1;
    }
    
    public void stopTimer()
    {
        int i = this.countTimerRunnable;
        if(i > 0)
        {
            android.os.Handler a = this.mHandler;
            Object a0 = this.timerRunnable;
            a.removeCallbacks((Runnable)a0);
            this.countTimerRunnable = 0;
        }
    }
    
    public void webPage(android.view.View a)
    {
        this.stopTimer();
        android.content.Intent a0 = new android.content.Intent((android.content.Context)this, org.spf.mobi.ui.SPFImageActivity.class);
        boolean b = this.isDownloadComplete;
        label1: {
            label0: {
                if(!b)
                {
                    break label0;
                }
                java.util.ArrayList a1 = this.loadableBanners;
                int i = a1.size();
                if(i <= 0)
                {
                    break label0;
                }
                StringBuilder a2 = new StringBuilder("F");
                java.util.ArrayList a3 = this.loadableBanners;
                Object a4 = a.getTag();
                String s = a4.toString();
                int i0 = Integer.parseInt(s);
                Object a5 = a3.get(i0);
                org.spf.data.SPFBanner dummy = (org.spf.data.SPFBanner)a5;
                org.spf.data.SPFBanner a6 = (org.spf.data.SPFBanner)a5;
                String s0 = a6.getImageUrl();
                StringBuilder a7 = a2.append(s0);
                String s1 = a7.toString();
                a0.putExtra("IMAGE_URL", s1);
                Log.d("SPF", "isDownloadComplete TRUE");
                break label1;
            }
            java.util.ArrayList a8 = this.lastShownBanners;
            int i1 = a8.size();
            label2: {
                if(i1 <= 0)
                {
                    break label2;
                }
                if(a == null)
                {
                    break label2;
                }
                StringBuilder a9 = new StringBuilder("F");
                java.util.ArrayList a10 = this.lastShownBanners;
                Object a11 = a.getTag();
                String s2 = a11.toString();
                int i2 = Integer.parseInt(s2);
                Object a12 = a10.get(i2);
                org.spf.data.SPFBanner dummy0 = (org.spf.data.SPFBanner)a12;
                org.spf.data.SPFBanner a13 = (org.spf.data.SPFBanner)a12;
                String s3 = a13.getImageUrl();
                StringBuilder a14 = a9.append(s3);
                String s4 = a14.toString();
                a0.putExtra("IMAGE_URL", s4);
                Log.d("SPF", "isDownloadComplete TRUE");
                break label1;
            }
            boolean b0 = this.isDefaultCashed;
            if(b0)
            {
                String s5 = this.defaultFileName;
                String s6 = s5.replace((CharSequence)"T", (CharSequence)"F");
                StringBuilder a15 = new StringBuilder("defaultFullName::");
                StringBuilder a16 = a15.append(s6);
                String s7 = a16.toString();
                Log.d("SPF", s7);
                a0.putExtra("IMAGE_URL", s6);
            }
        }
        StringBuilder a17 = new StringBuilder("isDownloadComplete::");
        boolean b1 = this.isDownloadComplete;
        StringBuilder a18 = a17.append(b1);
        String s8 = a18.toString();
        Log.e("SPF", s8);
        this.isCommingBack = true;
        this.startActivity(a0);
        this.overridePendingTransition(2130968576, 17432577);
    }
    
    class MyGuesture extends android.view.GestureDetector.SimpleOnGestureListener {
        final private static float SWIPE_MIN_DISTANCE = 10.0f;
        final private static float SWIPE_THRESHOLD_VELOCITY = 10.0f;
        
        private MyGuesture(org.spf.mobi.ui.SPFHomeActivity a)
        {
            super();
        }
        
        MyGuesture(org.spf.mobi.ui.SPFHomeActivity a, org.spf.mobi.ui.SPFHomeActivity.MyGuesture a0)
        {
            this(a);
        }
        
        public boolean onFling(android.view.MotionEvent a, android.view.MotionEvent a0, float f, float f0)
        {
            float f1 = a.getX();
            float f2 = a0.getX();
            label2: {
                label1: {
                    label0: {
                        float f3 = f1 - f2;
                        int i = f3 > 10.0f?1:f3 == 10.0f?0:-1;
                        if(i <= 0)
                        {
                            break label0;
                        }
                        float f4 = Math.abs(f);
                        int i0 = f4 > 10.0f?1:f4 == 10.0f?0:-1;
                        if(i0 > 0)
                        {
                            break label1;
                        }
                    }
                    float f5 = a0.getX();
                    float f6 = a.getX();
                    float f7 = f5 - f6;
                    int i1 = f7 > 10.0f?1:f7 == 10.0f?0:-1;
                    if(i1 <= 0)
                    {
                        break label2;
                    }
                    else
                    {
                        float f8 = Math.abs(f);
                        int i2 = f8 > 10.0f?1:f8 == 10.0f?0:-1;
                        if(i2 <= 0)
                        {
                            break label2;
                        }
                        else
                        {
                            boolean b = showNext;
                            if(b)
                            {
                                break label2;
                            }
                            else
                            {
                                showNext = true;
                                flip.showPrevious();
                                break label2;
                            }
                        }
                    }
                }

                if(showNext)
                {
                    showNext = false;
                    flip.showNext();
                }
            }
            boolean b1 = ((android.view.GestureDetector.SimpleOnGestureListener)this).onFling(a, a0, f, f0);
            return b1;
        }
    }
    
    class BitmapWorkerTask extends AsyncTask<Bitmap, Object, Object> {
        final private WeakReference<ImageView> imageViewReference;
        
        public BitmapWorkerTask(ImageView imgBanner)
        {
            super();

            this.imageViewReference = new WeakReference<ImageView>(imgBanner);
        }
        
        /*protected android.graphics.Bitmap doInBackground(String... a)
        {
            return getDefaultThumpImage();
        }*/
        
        
        protected void onPostExecute(android.graphics.Bitmap a)
        {
            label4: {
                WeakReference<ImageView> a0 = this.imageViewReference;
                label3: {
                    label2: {
                        label1: {
                            label0: {
                                if(a0 == null)
                                {
                                    break label0;
                                }
                                if(a != null)
                                {
                                    break label1;
                                }
                            }
                            if(this.imageViewReference == null)
                            {
                                break label2;
                            }
                            if(a != null)
                            {
                                break label2;
                            }
                            else
                            {
                                break label3;
                            }
                        }
                        ImageView a4 = (ImageView)this.imageViewReference.get();
                        if(a4 != null)
                        {
                            a4.setImageBitmap(a);
                            a4.setTag((Object)"-1");
                        }
                    }
                    break label4;
                }
                ImageView a7 = (ImageView)this.imageViewReference.get();
                android.util.Log.e("SPF", "NO Cashed Image found");
                a7.setImageResource(2130837595);
            }
        }
        
        protected void onPostExecute(Object a)
        {
            android.graphics.Bitmap a0 = (android.graphics.Bitmap)a;
            this.onPostExecute(a0);
        }

		@Override
		protected Bitmap doInBackground(Bitmap... arg0) {
			// TODO Auto-generated method stub
			return getDefaultThumpImage();
		}

		
    }
}
package org.spf.mobi.ui.async;

import java.net.*;

import org.spf.data.SPFBanner;
import org.spf.utils.Constants;
import org.spf.utils.SPFResponseHandler;
import org.spf.utils.Utils;
import org.spf.utils.parser.TrustManagerManipulator;

import android.graphics.*;
import android.os.AsyncTask;
import android.util.Log;

public class SPFImageDownloadTask extends AsyncTask<SPFBanner, Void, Object> implements Constants {
    private HttpURLConnection connection;
    private SPFResponseHandler dataReciver;
    private SPFBanner spfBanner;
    
    public SPFImageDownloadTask(SPFResponseHandler a)
    {
        super();
        Object a0 = a;
        this.dataReciver = (SPFResponseHandler)a0;
    }
    
    public static int calculateInSampleSize(BitmapFactory.Options a, int i, int i0)
    {
        int i1 = 0;
        label3: {
            int i2 = a.outHeight;
            int i3 = a.outWidth;
            label2: {
                int i4 = 0;
                label1: {
                    label0: {
                        if(i2 > i0)
                        {
                            break label0;
                        }
                        if(i3 <= i)
                        {
                            i4 = 1;
                            break label1;
                        }
                    }
                    if(i3 <= i2)
                    {
                        break label2;
                    }
                    float f = (float)i2;
                    float f0 = (float)i0;
                    float f1 = f / f0;
                    int i5 = Math.round(f1);
                    i4 = i5;
                }
                i1 = i4;
                break label3;
            }
            float f2 = (float)i3;
            float f3 = (float)i;
            float f4 = f2 / f3;
            int i6 = Math.round(f4);
            i1 = i6;
        }
        return i1;
    }
    
    private Bitmap downloadFromUrl(String s, int i)
    {
        Bitmap a = null;
        StringBuilder a0 = new StringBuilder("urlStr");
        StringBuilder a1 = a0.append(s);
        String s0 = a1.toString();
        Log.d("SPF", s0);
        System.gc();
        try
        {
            int i0 = 0;
            int i1 = 0;
            boolean b = Utils.isDebugMode((android.app.Activity)null);
            if(b)
            {
                TrustManagerManipulator.allowAllSSL();
            }
            URL a2 = new URL(s);
            URLConnection a3 = a2.openConnection();
            HttpURLConnection a4 = (HttpURLConnection)a3;
            this.connection = a4;
            HttpURLConnection a5 = this.connection;
            a5.connect();
            HttpURLConnection a6 = this.connection;
            java.io.InputStream a7 = a6.getInputStream();
            switch(i){
                case 2: {
                    i0 = 480;
                    i1 = 320;
                    break;
                }
                case 1: {
                    i0 = 80;
                    i1 = 320;
                    break;
                }
                default: {
                    i0 = 0;
                    i1 = 0;
                }
            }
            BitmapFactory.Options a8 = new BitmapFactory.Options();
            a8.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(a7, (Rect)null, a8);
            int i2 = org.spf.mobi.ui.async.SPFImageDownloadTask.calculateInSampleSize(a8, i1, i0);
            a8.inSampleSize = i2;
            a8.inJustDecodeBounds = false;
            a7.close();
            HttpURLConnection a9 = this.connection;
            a9.disconnect();
            URL a10 = new URL(s);
            URLConnection a11 = a10.openConnection();
            HttpURLConnection a12 = (HttpURLConnection)a11;
            this.connection = a12;
            HttpURLConnection a13 = this.connection;
            a13.connect();
            HttpURLConnection a14 = this.connection;
            java.io.InputStream a15 = a14.getInputStream();
            Bitmap a16 = BitmapFactory.decodeStream(a15, (Rect)null, a8);
            a = a16;
        }
        catch(java.io.IOException a17)
        {
            String s1 = a17.getMessage();
            Log.e("SPF", s1);
            a = null;
        }
        return a;
    }
    
    
    
    protected String doInBackground(SPFBanner... a)
    {
        
            SPFBanner a0 = a[0];
            this.spfBanner = a0;

                try
                {
                    Log.d("SPF", "*************************");
                    StringBuilder a2 = new StringBuilder("Image URL::");
              
                    StringBuilder a4 = a2.append(this.spfBanner.getId());
                    StringBuilder a5 = a4.append(":");
                    StringBuilder a7 = a5.append(this.spfBanner.getImageBaseUrl());
                    StringBuilder a9 = a7.append(this.spfBanner.getImageUrl());
                    Log.d("SPF", a9.toString());
                    StringBuilder a10 = new StringBuilder("Thumb URL::");
                    StringBuilder a12 = a10.append(this.spfBanner.getId());
                    StringBuilder a13 = a12.append(":");
                    StringBuilder a15 = a13.append(this.spfBanner.getThumbBaseUrl());
                    StringBuilder a17 = a15.append(this.spfBanner.getThumbUrl());
                    Log.d("SPF", a17.toString());
                    StringBuilder a20 = new StringBuilder(String.valueOf((Object)this.spfBanner.getThumbBaseUrl()));
                    StringBuilder a22 = a20.append(this.spfBanner.getThumbUrl());
                    Bitmap a23 = this.downloadFromUrl(a22.toString(), 1);
                    spfBanner.setBitmapThumb(a23);
                    StringBuilder a26 = new StringBuilder(this.spfBanner.getImageBaseUrl());
                    StringBuilder a28 = a26.append(this.spfBanner.getImageUrl());
                    this.spfBanner.setBitmapFull(this.downloadFromUrl(a28.toString(), 2));
                    this.dataReciver.bannerReceived(this.spfBanner);
                    this.spfBanner = null;
                    System.gc();
                }
                catch(Exception ignoredException)
                {
                }
        
 
        return null;
    }
    
    protected void onPostExecute(Object a)
    {
    	super.onPostExecute(a);
    }
    
}
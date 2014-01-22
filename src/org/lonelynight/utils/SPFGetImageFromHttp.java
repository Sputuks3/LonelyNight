package org.spf.utils;

import java.io.*;
import java.net.*;

import javax.net.ssl.HttpsURLConnection;


import org.spf.data.*;
import org.spf.utils.parser.TrustManagerManipulator;

import android.app.Activity;
import android.graphics.*;
import android.os.*;
import android.util.Log;
import android.widget.ImageView;

public class SPFGetImageFromHttp extends Thread implements org.spf.utils.Constants {
    private HttpsURLConnection connection;
    public int iTemp;
    private Bitmap imageContent;
    private Activity mActivity;
    private Parcelable mData;
    private Handler mHandler;
    private Constants.IMAGE_TYPE mType;
    private String mUrl;
    private ImageView mView;

    
    public SPFGetImageFromHttp(Activity a, ImageView a0, Handler a1, String s, Parcelable a2, Constants.IMAGE_TYPE a3)
    {
        super();
        Object a4 = a2;
        this.iTemp = -1;
        this.mActivity = a;
        this.mView = a0;
        this.mHandler = a1;
        this.mUrl = s;
        this.mData = (Parcelable)a4;
        this.mType = a3;
    }
    
    private InputStream getInputStream(HttpURLConnection a, String s)
    {
    	InputStream a3 = null;
    	
    	boolean b = Utils.isDebugMode(null);
        if(b)
        {
            TrustManagerManipulator.allowAllSSL();
        }
        try
        {
        URL a0 = new URL(s);
        HttpURLConnection a2 = (HttpURLConnection) a0.openConnection();
        a2.connect();
        this.iTemp = a2.getContentLength();
        a3 = a2.getInputStream();
        }
        catch(MalformedURLException ex)
        {
        	a3 = null;
        }
        catch(IOException ex)
        {
        	a3 = null;
        }
		return a3;
    }
    
    public void run()
    {
        label7: {
                label5: {
                    label4: {
                        label0: {
                                label2: try
                                {

                                        InputStream a2 = this.getInputStream((HttpURLConnection)this.connection, this.mUrl);
										this.imageContent = BitmapFactory.decodeStream(a2);
										if(Utils.isDebugMode(this.mActivity))
										    Log.e("Image Content Size", new StringBuilder("SIZE ").append(this.iTemp).toString());
										
										Object a7 = this.mData;
										if(!(a7 instanceof SPFCrime))
										{
										    Object a8 = a7;
										    if(a8 instanceof SPFMissing)
										    {
										        if(a8 instanceof SPFAppeal)
										        {
										            
										            switch(mType){
										                case FOOTER: {
										                    SPFAppeal a13 = (SPFAppeal)a8;
										                    a13.setFooter(this.imageContent);
										                    a13.setFooterSize(this.iTemp);
										                }
										                case FULL: {
										                    SPFAppeal a18 = (SPFAppeal)a8;
										                    a18.setFull(this.imageContent);
										                    a18.setFullSize(this.iTemp);
										                }
										                case THUMB: {
										                    SPFAppeal a23 = (SPFAppeal)a8;
										                    a23.setThumb(this.imageContent);
										                    a23.setThumbSize(this.iTemp);
										                }
										            }
										        }
										    }
										    else
										    {
										        
										        switch(mType){
										            case FOOTER: {
										                SPFMissing a30 = (SPFMissing)a8;
										                a30.setFooter(this.imageContent);
										                a30.setFooterSize(this.iTemp);
										            }
										            case FULL: {
										                SPFMissing a35 = (SPFMissing)a8;
										                a35.setFull(this.imageContent);
										                a35.setFullSize(this.iTemp);
										            }
										            case THUMB: {
										                SPFMissing a40 = (SPFMissing)a8;
										                a40.setThumb(this.imageContent);
										                a40.setThumbSize(this.iTemp);
										            }
										        }
										    }
										}
										else
										{
										    Object a9 = a7;
										    switch(mType){
										        case FOOTER: {
										            SPFCrime a47 = (SPFCrime)a9;
										            a47.setFooter(this.imageContent);
										            a47.setFooterSize(this.iTemp);
										            break;
										        }
										        case FULL: {
										            SPFCrime a52 = (SPFCrime)a9;
										            a52.setFull(this.imageContent);
										            a52.setFullSize(this.iTemp);
										            break;
										        }
										        case THUMB: {
										            SPFCrime a57 = (SPFCrime)a9;
										            a57.setThumb(this.imageContent);
										            a57.setThumbSize(this.iTemp);
										            break;
										        }
										    }
										}
										if(this.mHandler == null)
										{
										    break label0;
										}
										else
										{
										    Bitmap a62 = this.imageContent;
										    if(a62 == null)
										    {
										        break label0;
										    }
										    else
										    {
										        Handler a63 = this.mHandler;
										        a63.post((Runnable)new Runnable() {
										            
                    
										            public void run()
										            {
										            	
										                if(!mActivity.isFinishing())
										                {
										                    mView.setImageBitmap(imageContent);
										                }
										            }
										        });
										    }
										}
                                        break label2;
                    
                                }
                                catch(Exception a67)
                                {
                                    HttpsURLConnection a68 = this.connection;
                                    if(a68 != null)
                                    {
                                        HttpsURLConnection a69 = this.connection;
                                        a69.disconnect();
                                    }
                                    
                                }
                                HttpsURLConnection a70 = this.connection;
                                if(a70 == null)
                                {
                                    break label4;
                                }
                                else
                                {
                                    break label5;
                                }
                  
                        }
                        HttpsURLConnection a72 = this.connection;
                        if(a72 != null)
                        {
                            HttpsURLConnection a73 = this.connection;
                            a73.disconnect();
                        }
                    }
                    break label7;
                }
                HttpsURLConnection a74 = this.connection;
                a74.disconnect();
                break label7;
        
        }
    }
}
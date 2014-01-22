package org.spf.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.graphics.Bitmap;

public class SPFBanner implements Parcelable {
    private String Id;
    private Bitmap bitmapFull;
    private Bitmap bitmapThumb;
    private String imageBaseUrl;
    private String imageUrl;
    private String status;
    private String thumbBaseUrl;
    private String thumbUrl;
    private String title;
    
    public SPFBanner()
    {
        super();
    }
    
    public int describeContents()
    {
        return 0;
    }
    
    public Bitmap getBitmapFull()
    {
        Bitmap a = this.bitmapFull;
        return a;
    }
    
    public Bitmap getBitmapThumb()
    {
        Bitmap a = this.bitmapThumb;
        return a;
    }
    
    public String getId()
    {
        String s = this.Id;
        return s;
    }
    
    public String getImageBaseUrl()
    {
        String s = this.imageBaseUrl;
        return s;
    }
    
    public String getImageUrl()
    {
        String s = this.imageUrl;
        return s;
    }
    
    public String getStatus()
    {
        String s = this.status;
        return s;
    }
    
    public String getThumbBaseUrl()
    {
        String s = this.thumbBaseUrl;
        return s;
    }
    
    public String getThumbUrl()
    {
        String s = this.thumbUrl;
        return s;
    }
    
    public String getTitle()
    {
        String s = this.title;
        return s;
    }
    
    public void setBitmapFull(Bitmap a)
    {
        this.bitmapFull = a;
    }
    
    public void setBitmapThumb(Bitmap a)
    {
        this.bitmapThumb = a;
    }
    
    public void setId(String s)
    {
        this.Id = s;
    }
    
    public void setImageBaseUrl(String s)
    {
        this.imageBaseUrl = s;
    }
    
    public void setImageUrl(String s)
    {
        this.imageUrl = s;
    }
    
    public void setStatus(String s)
    {
        this.status = s;
    }
    
    public void setThumbBaseUrl(String s)
    {
        this.thumbBaseUrl = s;
    }
    
    public void setThumbUrl(String s)
    {
        this.thumbUrl = s;
    }
    
    public void setTitle(String s)
    {
        this.title = s;
    }
    
    public void writeToParcel(Parcel a, int i)
    {
    }
}
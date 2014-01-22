package org.spf.data;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class SPFBannerPath implements Parcelable {
    private String fullPath;
    private String thumbPath;
    
    public SPFBannerPath()
    {
        super();
    }
    
    public int describeContents()
    {
        return 0;
    }
    
    public String getFullPath()
    {
        String s = this.fullPath;
        return s;
    }
    
    public String getThumbPath()
    {
        String s = this.thumbPath;
        return s;
    }
    
    public void setFullPath(String s)
    {
        this.fullPath = s;
    }
    
    public void setThumbPath(String s)
    {
        this.thumbPath = s;
    }
    
    public void writeToParcel(Parcel a, int i)
    {
    }
}
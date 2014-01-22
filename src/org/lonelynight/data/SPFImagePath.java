package org.spf.data;

import android.os.Parcel;
import android.os.Parcelable;

public class SPFImagePath implements Parcelable {
    private String footer;
    private String full;
    private String thumb;
    
    public SPFImagePath()
    {
        super();
    }
    
    public int describeContents()
    {
        return 0;
    }
    
    public String getFooter()
    {
        String s = this.footer;
        return s;
    }
    
    public String getFull()
    {
        String s = this.full;
        return s;
    }
    
    public String getThumb()
    {
        String s = this.thumb;
        return s;
    }
    
    public void setFooter(String s)
    {
        this.footer = s;
    }
    
    public void setFull(String s)
    {
        this.full = s;
    }
    
    public void setThumb(String s)
    {
        this.thumb = s;
    }
    
    public void writeToParcel(Parcel a, int i)
    {
    }
}
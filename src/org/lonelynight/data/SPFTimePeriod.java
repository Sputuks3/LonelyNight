package org.spf.data;

import android.os.Parcel;
import android.os.Parcelable;

public class SPFTimePeriod implements Parcelable {
    private String month;
    private String year;
    
    public SPFTimePeriod()
    {
        super();
    }
    
    public int describeContents()
    {
        return 0;
    }
    
    public String getMonth()
    {
        String s = this.month;
        return s;
    }
    
    public String getYear()
    {
        String s = this.year;
        return s;
    }
    
    public void setMonth(String s)
    {
        this.month = s;
    }
    
    public void setYear(String s)
    {
        this.year = s;
    }
    
    public void writeToParcel(Parcel a, int i)
    {
    }
}
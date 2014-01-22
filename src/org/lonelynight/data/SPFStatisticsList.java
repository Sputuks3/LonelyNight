package org.spf.data;

import android.os.Parcel;
import android.os.Parcelable;

public class SPFStatisticsList implements Parcelable {
    private SPFArrayList arrayStatistics;
    private SPFTimePeriod endDate;
    private SPFTimePeriod startDate;
    
    public SPFStatisticsList()
    {
        super();
    }
    
    public int describeContents()
    {
        return 0;
    }
    
    public SPFArrayList getArrayStatistics()
    {
        SPFArrayList a = this.arrayStatistics;
        return a;
    }
    
    public SPFTimePeriod getEndDate()
    {
        SPFTimePeriod a = this.endDate;
        return a;
    }
    
    public SPFTimePeriod getStartDate()
    {
        SPFTimePeriod a = this.startDate;
        return a;
    }
    
    public void setArrayStatistics(SPFArrayList a)
    {
        this.arrayStatistics = a;
    }
    
    public void setEndDate(SPFTimePeriod a)
    {
        this.endDate = a;
    }
    
    public void setStartDate(SPFTimePeriod a)
    {
        this.startDate = a;
    }
    
    public void writeToParcel(Parcel a, int i)
    {
    }
}
package org.spf.data;

import android.os.Parcel;
import android.os.Parcelable;

public class SPFStatistics implements Parcelable {
	final public static Parcelable.Creator<SPFStatistics> CREATOR;
	private String catDescription;
    private String catId;
    private String catName;
    private String catType;
    private String count;
    private String id;
    private String status;
    
    static
    {
        CREATOR = new Parcelable.Creator<SPFStatistics>() {
    
        	public SPFStatistics createFromParcel(Parcel a)
        	{
        		return new SPFStatistics(a);
        	}
    
        	public SPFStatistics[] newArray(int i)
        	{
        		return new SPFStatistics[i];
        	}

    };
    }
    
    public SPFStatistics()
    {
        super();
    }
    
    public SPFStatistics(Parcel a) {
		// TODO Auto-generated constructor stub
    	// Akan-Dantang
	}

	public int describeContents()
    {
        return 0;
    }
    
    public String getCatDescription()
    {
        String s = this.catDescription;
        return s;
    }
    
    public String getCatId()
    {
        String s = this.catId;
        return s;
    }
    
    public String getCatName()
    {
        String s = this.catName;
        return s;
    }
    
    public String getCatType()
    {
        String s = this.catType;
        return s;
    }
    
    public String getCount()
    {
        String s = this.count;
        return s;
    }
    
    public String getId()
    {
        String s = this.id;
        return s;
    }
    
    public String getStatus()
    {
        String s = this.status;
        return s;
    }
    
    public void setCatDescription(String s)
    {
        this.catDescription = s;
    }
    
    public void setCatId(String s)
    {
        this.catId = s;
    }
    
    public void setCatName(String s)
    {
        this.catName = s;
    }
    
    public void setCatType(String s)
    {
        this.catType = s;
    }
    
    public void setCount(String s)
    {
        this.count = s;
    }
    
    public void setId(String s)
    {
        this.id = s;
    }
    
    public void setStatus(String s)
    {
        this.status = s;
    }
    
    public void writeToParcel(Parcel a, int i)
    {
    	
    }
}
package org.spf.data;

import android.os.Parcel;
import android.os.Parcelable;

public class SPFCategory implements Parcelable {
    final public static Parcelable.Creator<SPFCategory> CREATOR;
    private String categoryDescription;
    private String categoryName;
    private String categoryType;
    private String id;
    private String status;
    
    static
    {
        
        CREATOR = new Parcelable.Creator<SPFCategory>() {
    
    
    		public SPFCategory createFromParcel(Parcel a)
    		{
        		return new SPFCategory(a, null);
    		}
    
    		public SPFCategory[] newArray(int i)
    		{
        		return new SPFCategory[i];
    		}
		};

    }
    
    public SPFCategory()
    {
        super();
    }
    
    private SPFCategory(Parcel a)
    {
        super();
        String s = a.readString();
        this.setId(s);
        String s0 = a.readString();
        this.setCategoryType(s0);
        String s1 = a.readString();
        this.setCategoryName(s1);
        String s2 = a.readString();
        this.setCategoryDescription(s2);
        String s3 = a.readString();
        this.setStatus(s3);
    }
    
    SPFCategory(Parcel a, SPFCategory a0)
    {
        this(a);
    }
    
    public static Parcelable.Creator<SPFCategory> getCreator()
    {
        return CREATOR;
        
    }
    
    public int describeContents()
    {
        return 0;
    }
    
    public String getCategoryDescription()
    {
        String s = this.categoryDescription;
        return s;
    }
    
    public String getCategoryName()
    {
        String s = this.categoryName;
        return s;
    }
    
    public String getCategoryType()
    {
        String s = this.categoryType;
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
    
    public void setCategoryDescription(String s)
    {
        this.categoryDescription = s;
    }
    
    public void setCategoryName(String s)
    {
        this.categoryName = s;
    }
    
    public void setCategoryType(String s)
    {
        this.categoryType = s;
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
        String s = this.id;
        a.writeString(s);
        String s0 = this.categoryType;
        a.writeString(s0);
        String s1 = this.categoryName;
        a.writeString(s1);
        String s2 = this.categoryDescription;
        a.writeString(s2);
        String s3 = this.status;
        a.writeString(s3);
    }
}
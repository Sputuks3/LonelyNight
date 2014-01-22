package org.spf.data;

import android.os.Parcel;
import android.os.Parcelable;

public class SPFFooter implements Parcelable {
    final private static Parcelable.Creator<SPFFooter> CREATOR;
    private String description;
    private String id;
    private String name;
    private String status;
    private String url;
    
    static
    {
        CREATOR = new Parcelable.Creator<SPFFooter>() {
    
    
    		public SPFFooter createFromParcel(Parcel a)
    		{
        		return new SPFFooter(a);
    		}
    
    		public SPFFooter[] newArray(int i)
    		{
    			return new SPFFooter[i];
    		}
        };
    }
    
    public SPFFooter()
    {
        super();
    }
    
    public SPFFooter(Parcel a)
    {
        super();
        String s = a.readString();
        this.setId(s);
        String s0 = a.readString();
        this.setName(s0);
        String s1 = a.readString();
        this.setDescription(s1);
        String s2 = a.readString();
        this.setStatus(s2);
        String s3 = a.readString();
        this.setUrl(s3);
    }
    
    public static Parcelable.Creator<SPFFooter> getCreator()
    {
        return CREATOR;
    }
    
    public int describeContents()
    {
        return 0;
    }
    
    public String getDescription()
    {
        String s = this.description;
        return s;
    }
    
    public String getId()
    {
        String s = this.id;
        return s;
    }
    
    public String getName()
    {
        String s = this.name;
        return s;
    }
    
    public String getStatus()
    {
        String s = this.status;
        return s;
    }
    
    public String getUrl()
    {
        String s = this.url;
        return s;
    }
    
    public void setDescription(String s)
    {
        this.description = s;
    }
    
    public void setId(String s)
    {
        this.id = s;
    }
    
    public void setName(String s)
    {
        this.name = s;
    }
    
    public void setStatus(String s)
    {
        this.status = s;
    }
    
    public void setUrl(String s)
    {
        this.url = s;
    }
    
    public void writeToParcel(Parcel a, int i)
    {
        String s = this.id;
        a.writeString(s);
        String s0 = this.name;
        a.writeString(s0);
        String s1 = this.description;
        a.writeString(s1);
        String s2 = this.status;
        a.writeString(s2);
        String s3 = this.url;
        a.writeString(s3);
    }
}
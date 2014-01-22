package org.spf.data;

import android.os.Parcel;
import android.os.Parcelable;

public class SPFZone implements Parcelable {
    final public static Parcelable.Creator<SPFZone> CREATOR;
    private String id;
    private String status;
    private String zoneId;
    private String zoneName;
    
    static
    {
        CREATOR = new Parcelable.Creator<SPFZone>() {
    
    
    public SPFZone createFromParcel(Parcel a)
    {
        return new SPFZone(a, (SPFZone)null);
    }
   
    
    public SPFZone[] newArray(int i)
    {
        return new SPFZone[i];
    }
        };
    }
    
    public SPFZone()
    {
        super();
    }
    
    private SPFZone(Parcel a)
    {
        super();
        String s = a.readString();
        this.setId(s);
        String s0 = a.readString();
        this.setZoneId(s0);
        String s1 = a.readString();
        this.setZoneName(s1);
        String s2 = a.readString();
        this.setStatus(s2);
    }
    
    SPFZone(Parcel a, SPFZone a0)
    {
        this(a);
    }
    
    public int describeContents()
    {
        return 0;
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
    
    public String getZoneId()
    {
        String s = this.zoneId;
        return s;
    }
    
    public String getZoneName()
    {
        String s = this.zoneName;
        return s;
    }
    
    public void setId(String s)
    {
        this.id = s;
    }
    
    public void setStatus(String s)
    {
        this.status = s;
    }
    
    public void setZoneId(String s)
    {
        this.zoneId = s;
    }
    
    public void setZoneName(String s)
    {
        this.zoneName = s;
    }
    
    public void writeToParcel(Parcel a, int i)
    {
        String s = this.id;
        a.writeString(s);
        String s0 = this.zoneId;
        a.writeString(s0);
        String s1 = this.zoneName;
        a.writeString(s1);
        String s2 = this.status;
        a.writeString(s2);
    }
}
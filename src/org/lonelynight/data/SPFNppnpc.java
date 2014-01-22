package org.spf.data;

import android.graphics.*;

import android.os.Parcel;
import android.os.Parcelable;

public class SPFNppnpc implements Parcelable {
    final public static Parcelable.Creator<SPFNppnpc> CREATOR;
    private String address;
    private String closeHours;
    private String closeMin;
    private SPFCluster cluster;
    private String contactNumber;
    private String description;
    private String distance;
    private Bitmap footer;
    private SPFFooter footerData;
    private int footerSize;
    private Bitmap full;
    private int fullSize;
    private String id;
    private SPFImagePath imagePath;
    private String latitude;
    private String longitude;
    private String name;
    private String openHour;
    private String openMin;
    private String status;
    private Bitmap thumb;
    private int thumbSize;
    private String zip;
    private SPFZone zone;
    
    static
    {
        CREATOR = new Parcelable.Creator<SPFNppnpc>() {
    
        	public SPFNppnpc createFromParcel(Parcel a)
        	{
        		return new SPFNppnpc(a);
        	}
    
        	public SPFNppnpc[] newArray(int i)
        	{
        		SPFNppnpc[] a = new SPFNppnpc[i];
        		return a;
        	}

    };
    }
    
    public SPFNppnpc()
    {
        super();
    }
    
    public SPFNppnpc(Parcel a)
    {
        super();
        String s = a.readString();
        this.setId(s);
        String s0 = a.readString();
        this.setName(s0);
        String s1 = a.readString();
        this.setDescription(s1);
        String s2 = a.readString();
        this.setCloseHours(s2);
        String s3 = a.readString();
        this.setAddress(s3);
        String s4 = a.readString();
        this.setCloseMin(s4);
        String s5 = a.readString();
        this.setStatus(s5);
        String s6 = a.readString();
        this.setOpenMin(s6);
        String s7 = a.readString();
        this.setZip(s7);
        String s8 = a.readString();
        this.setLatitude(s8);
        String s9 = a.readString();
        this.setOpenHour(s9);
        String s10 = a.readString();
        this.setLongitude(s10);
        String s11 = a.readString();
        this.setContactNumber(s11);
        Object a0 = a.readParcelable((ClassLoader)null);
        SPFCluster a1 = (SPFCluster)a0;
        this.setCluster(a1);
        Object a2 = a.readParcelable((ClassLoader)null);
        SPFZone a3 = (SPFZone)a2;
        this.setZone(a3);
        String s12 = a.readString();
        this.setDistance(s12);
        int i = a.readInt();
        this.setFullSize(i);
        int i0 = a.readInt();
        this.setFooterSize(i0);
        int i1 = this.thumbSize;
        byte[] a4 = new byte[i1];
        a.readByteArray(a4);
        Bitmap a5 = BitmapFactory.decodeByteArray(a4, 0, 0);
        this.setThumb(a5);
        Object a6 = a.readParcelable((ClassLoader)null);
        SPFImagePath a7 = (SPFImagePath)a6;
        this.setImagePath(a7);
    }
    
    public int describeContents()
    {
        return 0;
    }
    
    public String getAddress()
    {
        String s = this.address;
        return s;
    }
    
    public String getCloseHours()
    {
        String s = this.closeHours;
        return s;
    }
    
    public String getCloseMin()
    {
        String s = this.closeMin;
        return s;
    }
    
    public SPFCluster getCluster()
    {
        SPFCluster a = this.cluster;
        return a;
    }
    
    public String getContactNumber()
    {
        String s = this.contactNumber;
        return s;
    }
    
    public String getDescription()
    {
        String s = this.description;
        return s;
    }
    
    public String getDistance()
    {
        String s = this.distance;
        return s;
    }
    
    public Bitmap getFooter()
    {
        Bitmap a = this.footer;
        return a;
    }
    
    public SPFFooter getFooterData()
    {
        SPFFooter a = this.footerData;
        return a;
    }
    
    public int getFooterSize()
    {
        int i = this.footerSize;
        return i;
    }
    
    public Bitmap getFull()
    {
        Bitmap a = this.full;
        return a;
    }
    
    public int getFullSize()
    {
        int i = this.fullSize;
        return i;
    }
    
    public String getId()
    {
        String s = this.id;
        return s;
    }
    
    public SPFImagePath getImagePath()
    {
        SPFImagePath a = this.imagePath;
        return a;
    }
    
    public String getLatitude()
    {
        String s = this.latitude;
        return s;
    }
    
    public String getLongitude()
    {
        String s = this.longitude;
        return s;
    }
    
    public String getName()
    {
        String s = this.name;
        return s;
    }
    
    public String getOpenHour()
    {
        String s = this.openHour;
        return s;
    }
    
    public String getOpenMin()
    {
        String s = this.openMin;
        return s;
    }
    
    public String getStatus()
    {
        String s = this.status;
        return s;
    }
    
    public Bitmap getThumb()
    {
        Bitmap a = this.thumb;
        return a;
    }
    
    public int getThumbSize()
    {
        int i = this.thumbSize;
        return i;
    }
    
    public String getZip()
    {
        String s = this.zip;
        return s;
    }
    
    public SPFZone getZone()
    {
        SPFZone a = this.zone;
        return a;
    }
    
    public void setAddress(String s)
    {
        this.address = s;
    }
    
    public void setCloseHours(String s)
    {
        this.closeHours = s;
    }
    
    public void setCloseMin(String s)
    {
        this.closeMin = s;
    }
    
    public void setCluster(SPFCluster a)
    {
        this.cluster = a;
    }
    
    public void setContactNumber(String s)
    {
        this.contactNumber = s;
    }
    
    public void setDescription(String s)
    {
        this.description = s;
    }
    
    public void setDistance(String s)
    {
        this.distance = s;
    }
    
    public void setFooter(Bitmap a)
    {
        this.footer = a;
    }
    
    public void setFooterData(SPFFooter a)
    {
        this.footerData = a;
    }
    
    public void setFooterSize(int i)
    {
        this.footerSize = i;
    }
    
    public void setFull(Bitmap a)
    {
        this.full = a;
    }
    
    public void setFullSize(int i)
    {
        this.fullSize = i;
    }
    
    public void setId(String s)
    {
        this.id = s;
    }
    
    public void setImagePath(SPFImagePath a)
    {
        this.imagePath = a;
    }
    
    public void setLatitude(String s)
    {
        this.latitude = s;
    }
    
    public void setLongitude(String s)
    {
        this.longitude = s;
    }
    
    public void setName(String s)
    {
        this.name = s;
    }
    
    public void setOpenHour(String s)
    {
        this.openHour = s;
    }
    
    public void setOpenMin(String s)
    {
        this.openMin = s;
    }
    
    public void setStatus(String s)
    {
        this.status = s;
    }
    
    public void setThumb(Bitmap a)
    {
        this.thumb = a;
    }
    
    public void setThumbSize(int i)
    {
        this.thumbSize = i;
    }
    
    public void setZip(String s)
    {
        this.zip = s;
    }
    
    public void setZone(SPFZone a)
    {
        this.zone = a;
    }
    
    public void writeToParcel(Parcel a, int i)
    {
        String s = this.id;
        a.writeString(s);
        String s0 = this.name;
        a.writeString(s0);
        String s1 = this.description;
        a.writeString(s1);
        String s2 = this.closeHours;
        a.writeString(s2);
        String s3 = this.address;
        a.writeString(s3);
        String s4 = this.closeMin;
        a.writeString(s4);
        String s5 = this.status;
        a.writeString(s5);
        String s6 = this.openMin;
        a.writeString(s6);
        String s7 = this.zip;
        a.writeString(s7);
        String s8 = this.latitude;
        a.writeString(s8);
        String s9 = this.openHour;
        a.writeString(s9);
        String s10 = this.longitude;
        a.writeString(s10);
        String s11 = this.contactNumber;
        a.writeString(s11);
        SPFCluster a0 = this.cluster;
        a.writeParcelable((Parcelable)a0, 0);
        SPFZone a1 = this.zone;
        a.writeParcelable((Parcelable)a1, 0);
        String s12 = this.distance;
        a.writeString(s12);
        SPFFooter a2 = this.footerData;
        a.writeParcelable((Parcelable)a2, 0);
        SPFImagePath a3 = this.imagePath;
        a.writeParcelable((Parcelable)a3, 0);
        int i0 = this.thumbSize;
        a.writeInt(i0);
        int i1 = this.fullSize;
        a.writeInt(i1);
        int i2 = this.footerSize;
        a.writeInt(i2);
    }
}
package org.spf.data;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;


public class SPFCrime implements Parcelable {
    final private static Parcelable.Creator<SPFCrime> CREATOR;
    private SPFCategory category;
    private SPFCluster cluster;
    private String crimeDateStr;
    private String detailedDesc;
    private Bitmap footer;
    private SPFFooter footerData;
    private int footerSize;
    private Bitmap full;
    private int fullSize;
    private String id;
    private SPFImagePath imagePath;
    private String imageUrl;
    private String location;
    private String longDesc;
    private String shortDesc;
    private String status;
    private Bitmap thumb;
    private int thumbSize;
    private String thumburl;
    private String title;
    private SPFZone zone;
    
    static
    {
        CREATOR = new Parcelable.Creator<SPFCrime>() {
 
    
    		public SPFCrime createFromParcel(Parcel a)
    		{
        		return new SPFCrime(a); 
    		}
    
    		public SPFCrime[] newArray(int i)
    		{
         		return new SPFCrime[i];
        
    		}
		};
    }
    
    public SPFCrime()
    {
        super();
    }
    
    public SPFCrime(Parcel a)
    {
        super();
        String s = a.readString();
        this.setId(s);
        String s0 = a.readString();
        this.setLocation(s0);
        String s1 = a.readString();
        this.setDetailedDesc(s1);
        String s2 = a.readString();
        this.setLongDesc(s2);
        String s3 = a.readString();
        this.setShortDesc(s3);
        String s4 = a.readString();
        this.setImageUrl(s4);
        String s5 = a.readString();
        this.setStatus(s5);
        String s6 = a.readString();
        this.setCrimeDateStr(s6);
        String s7 = a.readString();
        this.setThumburl(s7);
        String s8 = a.readString();
        this.setTitle(s8);
        Object a0 = a.readParcelable((ClassLoader)null);
        SPFCluster a1 = (SPFCluster)a0;
        this.setCluster(a1);
        Object a2 = a.readParcelable((ClassLoader)null);
        SPFCategory a3 = (SPFCategory)a2;
        this.setCategory(a3);
        Object a4 = a.readParcelable((ClassLoader)null);
        SPFZone a5 = (SPFZone)a4;
        this.setZone(a5);
        int i = a.readInt();
        this.setThumbSize(i);
        int i0 = a.readInt();
        this.setFullSize(i0);
        int i1 = a.readInt();
        this.setFooterSize(i1);
        int i2 = this.thumbSize;
        byte[] a6 = new byte[i2];
        a.readByteArray(a6);
        Bitmap a7 = BitmapFactory.decodeByteArray(a6, 0, 0);
        this.setThumb(a7);
        Object a8 = a.readParcelable((ClassLoader)null);
        SPFImagePath a9 = (SPFImagePath)a8;
        this.setImagePath(a9);
    }
    
    public static Parcelable.Creator<SPFCrime> getCreator()
    {
        return CREATOR;

    }
    
    public int describeContents()
    {
        return 0;
    }
    
    public SPFCategory getCategory()
    {
        SPFCategory a = this.category;
        return a;
    }
    
    public SPFCluster getCluster()
    {
        SPFCluster a = this.cluster;
        return a;
    }
    
    public String getCrimeDateStr()
    {
        String s = this.crimeDateStr;
        return s;
    }
    
    public String getDetailedDesc()
    {
        String s = this.detailedDesc;
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
    
    public String getImageUrl()
    {
        String s = this.imageUrl;
        return s;
    }
    
    public String getLocation()
    {
        String s = this.location;
        return s;
    }
    
    public String getLongDesc()
    {
        String s = this.longDesc;
        return s;
    }
    
    public String getShortDesc()
    {
        String s = this.shortDesc;
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
    
    public String getThumburl()
    {
        String s = this.thumburl;
        return s;
    }
    
    public String getTitle()
    {
        String s = this.title;
        return s;
    }
    
    public SPFZone getZone()
    {
        SPFZone a = this.zone;
        return a;
    }
    
    public void setCategory(SPFCategory a)
    {
        this.category = a;
    }
    
    public void setCluster(SPFCluster a)
    {
        this.cluster = a;
    }
    
    public void setCrimeDateStr(String s)
    {
        this.crimeDateStr = s;
    }
    
    public void setDetailedDesc(String s)
    {
        this.detailedDesc = s;
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
    
    public void setImageUrl(String s)
    {
        this.imageUrl = s;
    }
    
    public void setLocation(String s)
    {
        this.location = s;
    }
    
    public void setLongDesc(String s)
    {
        this.longDesc = s;
    }
    
    public void setShortDesc(String s)
    {
        this.shortDesc = s;
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
    
    public void setThumburl(String s)
    {
        this.thumburl = s;
    }
    
    public void setTitle(String s)
    {
        this.title = s;
    }
    
    public void setZone(SPFZone a)
    {
        this.zone = a;
    }
    
    public void writeToParcel(Parcel a, int i)
    {
        String s = this.id;
        a.writeString(s);
        String s0 = this.location;
        a.writeString(s0);
        String s1 = this.detailedDesc;
        a.writeString(s1);
        String s2 = this.longDesc;
        a.writeString(s2);
        String s3 = this.shortDesc;
        a.writeString(s3);
        String s4 = this.imageUrl;
        a.writeString(s4);
        String s5 = this.status;
        a.writeString(s5);
        String s6 = this.crimeDateStr;
        a.writeString(s6);
        String s7 = this.thumburl;
        a.writeString(s7);
        String s8 = this.title;
        a.writeString(s8);
        SPFCluster a0 = this.cluster;
        a.writeParcelable((Parcelable)a0, 0);
        SPFCategory a1 = this.category;
        a.writeParcelable((Parcelable)a1, 0);
        SPFFooter a2 = this.footerData;
        a.writeParcelable((Parcelable)a2, 0);
        SPFZone a3 = this.zone;
        a.writeParcelable((Parcelable)a3, 0);
        int i0 = this.thumbSize;
        a.writeInt(i0);
        int i1 = this.fullSize;
        a.writeInt(i1);
        int i2 = this.footerSize;
        a.writeInt(i2);
        SPFImagePath a4 = this.imagePath;
        a.writeParcelable((Parcelable)a4, 0);
    }
}
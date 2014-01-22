package org.spf.data;

import android.graphics.*;

import android.os.Parcel;
import android.os.Parcelable;

public class SPFMissing implements Parcelable {
    final private static Parcelable.Creator<SPFMissing> CREATOR;
    private String age;
    private SPFCluster cluster;
    private String complexion;
    private String country;
    private String description;
    private String dobStr;
    private Bitmap footer;
    private SPFCluster footerData;
    private int footerSize;
    private Bitmap full;
    private int fullSize;
    private String gender;
    private String hairType;
    private String height;
    private String id;
    private SPFImagePath imagePath;
    private String imageUrl;
    private String location;
    private String missingDateStr;
    private String name;
    private String race;
    private String status;
    private Bitmap thumb;
    private int thumbSize;
    private String thumbUrl;
    private String title;
    private SPFZone zone;
    
    static
    {
        CREATOR = new Parcelable.Creator<SPFMissing>() {
    
    
    		public SPFMissing createFromParcel(Parcel a)
    		{
        		return new SPFMissing(a);
    		}
    
    		public SPFMissing[] newArray(int i)
    		{
        		return new SPFMissing[i];
    		}
	};
    }
    
    public SPFMissing()
    {
        super();
    }
    
    public SPFMissing(Parcel a)
    {
        super();
        String s = a.readString();
        this.setId(s);
        String s0 = a.readString();
        this.setLocation(s0);
        String s1 = a.readString();
        this.setName(s1);
        String s2 = a.readString();
        this.setMissingDateStr(s2);
        String s3 = a.readString();
        this.setThumbUrl(s3);
        String s4 = a.readString();
        this.setTitle(s4);
        int i = a.readInt();
        this.setThumbSize(i);
        int i0 = a.readInt();
        this.setFullSize(i0);
        int i1 = a.readInt();
        this.setFooterSize(i1);
        int i2 = this.thumbSize;
        byte[] a0 = new byte[i2];
        a.readByteArray(a0);
        Bitmap a1 = BitmapFactory.decodeByteArray(a0, 0, 0);
        this.setThumb(a1);
        Object a2 = a.readParcelable((ClassLoader)null);
        SPFImagePath a3 = (SPFImagePath)a2;
        this.setImagePath(a3);
        String s5 = a.readString();
        this.setComplexion(s5);
        String s6 = a.readString();
        this.setAge(s6);
        String s7 = a.readString();
        this.setDescription(s7);
        String s8 = a.readString();
        this.setCountry(s8);
        String s9 = a.readString();
        this.setHeight(s9);
        String s10 = a.readString();
        this.setImageUrl(s10);
        String s11 = a.readString();
        this.setStatus(s11);
        String s12 = a.readString();
        this.setHairType(s12);
        String s13 = a.readString();
        this.setGender(s13);
        String s14 = a.readString();
        this.setRace(s14);
        String s15 = a.readString();
        this.setDobStr(s15);
    }
    
    public static Parcelable.Creator<SPFMissing> getCreator()
    {
        return CREATOR;
    }
    
    public int describeContents()
    {
        return 0;
    }
    
    public String getAge()
    {
        String s = this.age;
        return s;
    }
    
    public SPFCluster getCluster()
    {
        SPFCluster a = this.cluster;
        return a;
    }
    
    public String getComplexion()
    {
        String s = this.complexion;
        return s;
    }
    
    public String getCountry()
    {
        String s = this.country;
        return s;
    }
    
    public String getDescription()
    {
        String s = this.description;
        return s;
    }
    
    public String getDobStr()
    {
        String s = this.dobStr;
        return s;
    }
    
    public Bitmap getFooter()
    {
        Bitmap a = this.footer;
        return a;
    }
    
    public SPFCluster getFooterData()
    {
        SPFCluster a = this.footerData;
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
    
    public String getGender()
    {
        String s = this.gender;
        return s;
    }
    
    public String getHairType()
    {
        String s = this.hairType;
        return s;
    }
    
    public String getHeight()
    {
        String s = this.height;
        return s;
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
    
    public String getMissingDateStr()
    {
        String s = this.missingDateStr;
        return s;
    }
    
    public String getName()
    {
        String s = this.name;
        return s;
    }
    
    public String getRace()
    {
        String s = this.race;
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
    
    public String getThumbUrl()
    {
        String s = this.thumbUrl;
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
    
    public void setAge(String s)
    {
        this.age = s;
    }
    
    public void setCluster(SPFCluster a)
    {
        this.cluster = a;
    }
    
    public void setComplexion(String s)
    {
        this.complexion = s;
    }
    
    public void setCountry(String s)
    {
        this.country = s;
    }
    
    public void setDescription(String s)
    {
        this.description = s;
    }
    
    public void setDobStr(String s)
    {
        this.dobStr = s;
    }
    
    public void setFooter(Bitmap a)
    {
        this.footer = a;
    }
    
    public void setFooterData(SPFCluster a)
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
    
    public void setGender(String s)
    {
        this.gender = s;
    }
    
    public void setHairType(String s)
    {
        this.hairType = s;
    }
    
    public void setHeight(String s)
    {
        this.height = s;
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
    
    public void setMissingDateStr(String s)
    {
        this.missingDateStr = s;
    }
    
    public void setName(String s)
    {
        this.name = s;
    }
    
    public void setRace(String s)
    {
        this.race = s;
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
    
    public void setThumbUrl(String s)
    {
        this.thumbUrl = s;
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
        String s1 = this.name;
        a.writeString(s1);
        String s2 = this.missingDateStr;
        a.writeString(s2);
        String s3 = this.thumbUrl;
        a.writeString(s3);
        String s4 = this.title;
        a.writeString(s4);
        int i0 = this.thumbSize;
        a.writeInt(i0);
        int i1 = this.fullSize;
        a.writeInt(i1);
        int i2 = this.footerSize;
        a.writeInt(i2);
        SPFImagePath a0 = this.imagePath;
        a.writeParcelable((Parcelable)a0, 0);
        String s5 = this.complexion;
        a.writeString(s5);
        String s6 = this.age;
        a.writeString(s6);
        String s7 = this.description;
        a.writeString(s7);
        String s8 = this.country;
        a.writeString(s8);
        String s9 = this.height;
        a.writeString(s9);
        String s10 = this.imageUrl;
        a.writeString(s10);
        String s11 = this.status;
        a.writeString(s11);
        String s12 = this.hairType;
        a.writeString(s12);
        String s13 = this.gender;
        a.writeString(s13);
        String s14 = this.race;
        a.writeString(s14);
        String s15 = this.dobStr;
        a.writeString(s15);
        SPFCluster a1 = this.cluster;
        a.writeParcelable((Parcelable)a1, 0);
        SPFCluster a2 = this.footerData;
        a.writeParcelable((Parcelable)a2, 0);
        SPFZone a3 = this.zone;
        a.writeParcelable((Parcelable)a3, 0);
    }
}
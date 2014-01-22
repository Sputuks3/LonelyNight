package org.spf.data;

import android.os.Parcel;
import android.os.Parcelable;

public class SPFCluster implements Parcelable {
    final public static Parcelable.Creator<SPFCluster> CREATOR;
    private String clusterId;
    private String clusterName;
    private String id;
    private String status;
    
    static
    {
        CREATOR = new Parcelable.Creator<SPFCluster>() {

    
    		public SPFCluster createFromParcel(Parcel a)
    		{
        		return new SPFCluster(a, null);
    		}
    
    		public SPFCluster[] newArray(int i)
    		{
        		return new SPFCluster[i];
    		}
		};

    }
    
    public SPFCluster()
    {
        super();
    }
    
    private SPFCluster(Parcel a)
    {
        super();
        String s = a.readString();
        this.setId(s);
        String s0 = a.readString();
        this.setClusterName(s0);
        String s1 = a.readString();
        this.setClusterId(s1);
        String s2 = a.readString();
        this.setStatus(s2);
    }
    
    SPFCluster(Parcel a, SPFCluster a0)
    {
        this(a);
    }
    
    public static Parcelable.Creator<SPFCluster> getCreator()
    {
        return CREATOR;
    }
    
    public int describeContents()
    {
        return 0;
    }
    
    public String getClusterId()
    {
        String s = this.clusterId;
        return s;
    }
    
    public String getClusterName()
    {
        String s = this.clusterName;
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
    
    public void setClusterId(String s)
    {
        this.clusterId = s;
    }
    
    public void setClusterName(String s)
    {
        this.clusterName = s;
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
        String s0 = this.clusterName;
        a.writeString(s0);
        String s1 = this.clusterId;
        a.writeString(s1);
        String s2 = this.status;
        a.writeString(s2);
    }
}
package org.spf.data;

import java.util.ArrayList;
import android.os.Parcel;
import android.os.Parcelable;
import org.spf.data.SPFImagePath;


public class SPFArrayList extends ArrayList<SPFArrayList> implements Parcelable {
    final public static Parcelable.Creator<SPFArrayList> CREATOR;
    final private static long serialVersionUID = -1583577505429654182L;
    private SPFImagePath path;
    
    static
    {
        CREATOR = new Parcelable.Creator<SPFArrayList>() {
    
    		public SPFArrayList createFromParcel(Parcel a)
    		{
        		return new SPFArrayList(a);
    		}
    
    		public SPFArrayList[] newArray(int i)
    		{
        		return new SPFArrayList[i];
    		}
	};

    }
    
    public SPFArrayList()
    {
        super();
        SPFImagePath a = new SPFImagePath();
        this.path = a;
    }
    
    public SPFArrayList(Parcel a)
    {
        super();
        Object a0 = a.readParcelable((ClassLoader)null);
        SPFImagePath a1 = (SPFImagePath)a0;
        this.setPath(a1);
    }
    
    public static Parcelable.Creator<SPFArrayList> getCreator()
    {
        return CREATOR;
    }
    
    public int describeContents()
    {
        return 0;
    }
    
    public SPFImagePath getPath()
    {
        SPFImagePath a = this.path;
        return a;
    }
    
    public void setPath(SPFImagePath a)
    {
        this.path = a;
    }
    
    public void writeToParcel(Parcel a, int i)
    {
        SPFImagePath a0 = this.path;
        a.writeParcelable((Parcelable)a0, 0);
    }
}
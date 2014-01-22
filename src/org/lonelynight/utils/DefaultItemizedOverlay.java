package org.spf.utils;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

public class DefaultItemizedOverlay extends ItemizedOverlay<OverlayItem> {
    private Context mContext;
    private ArrayList<OverlayItem> mOverlays;
    
    public DefaultItemizedOverlay(Drawable a, Context a0)
    {
        super(DefaultItemizedOverlay.boundCenterBottom(a)); 
        this.mOverlays = new ArrayList<OverlayItem>();
        this.mContext = a0;
    }
    
    public void addOverlay(OverlayItem a)
    {
        this.mOverlays.add(a);
        this.populate();
    }
    
    protected OverlayItem createItem(int i)
    {
        ArrayList<OverlayItem> a = this.mOverlays;
        OverlayItem a0 = a.get(i);
        return a0;
    }
    
    protected boolean onTap(int i)
    {
        OverlayItem a1 = (OverlayItem) this.mOverlays.get(i);
        AlertDialog.Builder a3 = new AlertDialog.Builder(this.mContext);
        a3.setTitle((CharSequence)a1.getTitle());
        a3.setMessage((CharSequence)a1.getSnippet());
        a3.show();
        return true;
    }
    
    public int size()
    {
        return this.mOverlays.size();
    }
}
package org.spf.mobi.ui.locator;

public class SPFLocatorMap extends org.spf.mobi.ui.SPFActivity implements org.spf.utils.Constants {
    private android.graphics.drawable.Drawable mDrawable;
    private android.graphics.drawable.Drawable mDrawable_home;
    private com.google.android.maps.MapController mMapController;
    private java.util.List mMapOverlays;
    private com.google.android.maps.MapView mMapView;
    private org.spf.utils.DefaultItemizedOverlay mOverlay;
    private org.spf.mobi.ui.SPFOverlay mOverlay_home;
    
    public SPFLocatorMap()
    {
        super();
        this.mMapView = null;
        this.mMapOverlays = null;
        this.mDrawable_home = null;
        this.mOverlay = null;
        this.mOverlay_home = null;
        this.mMapController = null;
    }
    
    public void init()
    {
        String s = null;
        android.content.Intent a = this.getIntent();
        String s0 = a.getStringExtra("FORWARD_LATITUDE");
        String s1 = a.getStringExtra("FORWARD_LONGITUDE");
        String s2 = a.getStringExtra("TITLE");
        String s3 = a.getStringExtra("ADDRESS");
        String s4 = a.getStringExtra("OPENING_HOURS");
        String s5 = a.getStringExtra("CLOSING_HOURS");
        String s6 = a.getStringExtra("CONTACT_NUMBER");
        String s7 = s6.substring(0, 4);
        int i = s6.length();
        String s8 = s6.substring(4, i);
        android.view.View a0 = this.findViewById(2131165355);
        android.widget.TextView dummy = (android.widget.TextView)a0;
        android.widget.TextView a1 = (android.widget.TextView)a0;
        a1.setText((CharSequence)s2);
        android.view.View a2 = this.findViewById(2131165356);
        android.widget.TextView dummy0 = (android.widget.TextView)a2;
        android.widget.TextView a3 = (android.widget.TextView)a2;
        a3.setText((CharSequence)s3);
        boolean b = s4.equalsIgnoreCase("0");
        label1: {
            label0: {
                if(!b)
                {
                    break label0;
                }
                boolean b0 = s5.equalsIgnoreCase("23");
                if(!b0)
                {
                    break label0;
                }
                s = "24 hours";
                break label1;
            }
            boolean b1 = s4.equalsIgnoreCase("12");
            if(!b1)
            {
                s = s4;
            }
            else
            {
                boolean b2 = s5.equalsIgnoreCase("22");
                s = b2?"12 pm to 10 pm":s4;
            }
        }
        android.view.View a4 = this.findViewById(2131165357);
        android.widget.TextView dummy1 = (android.widget.TextView)a4;
        android.widget.TextView a5 = (android.widget.TextView)a4;
        StringBuilder a6 = new StringBuilder("Opening Hours :");
        StringBuilder a7 = a6.append(s);
        String s9 = a7.toString();
        a5.setText((CharSequence)s9);
        android.view.View a8 = this.findViewById(2131165358);
        android.widget.TextView dummy2 = (android.widget.TextView)a8;
        android.widget.TextView a9 = (android.widget.TextView)a8;
        StringBuilder a10 = new StringBuilder("Contact No :");
        StringBuilder a11 = a10.append(s7);
        StringBuilder a12 = a11.append("-");
        StringBuilder a13 = a12.append(s8);
        String s10 = a13.toString();
        a9.setText((CharSequence)s10);
        android.view.View a14 = this.findViewById(2131165359);
        com.google.android.maps.MapView dummy3 = (com.google.android.maps.MapView)a14;
        com.google.android.maps.MapView a15 = (com.google.android.maps.MapView)a14;
        this.mMapView = a15;
        com.google.android.maps.MapView a16 = this.mMapView;
        a16.setBuiltInZoomControls(true);
        com.google.android.maps.MapView a17 = this.mMapView;
        Object a18 = a17.getOverlays();
        this.mMapOverlays = (java.util.List)a18;
        android.content.res.Resources a19 = this.getResources();
        android.graphics.drawable.Drawable a20 = a19.getDrawable(2130837680);
        this.mDrawable = a20;
        android.graphics.drawable.Drawable a21 = this.mDrawable;
        android.graphics.drawable.Drawable a22 = this.mDrawable;
        int i0 = a22.getIntrinsicWidth();
        android.graphics.drawable.Drawable a23 = this.mDrawable;
        int i1 = a23.getIntrinsicHeight();
        a21.setBounds(0, 0, i0, i1);
        android.graphics.drawable.Drawable a24 = this.mDrawable;
        org.spf.utils.DefaultItemizedOverlay a25 = new org.spf.utils.DefaultItemizedOverlay(a24, (android.content.Context)this);
        this.mOverlay = a25;
        android.content.res.Resources a26 = this.getResources();
        android.graphics.drawable.Drawable a27 = a26.getDrawable(2130837681);
        this.mDrawable_home = a27;
        android.graphics.drawable.Drawable a28 = this.mDrawable_home;
        android.graphics.drawable.Drawable a29 = this.mDrawable_home;
        int i2 = a29.getIntrinsicWidth();
        android.graphics.drawable.Drawable a30 = this.mDrawable_home;
        int i3 = a30.getIntrinsicHeight();
        a28.setBounds(0, 0, i2, i3);
        com.google.android.maps.MapView a31 = this.mMapView;
        com.google.android.maps.MapController a32 = a31.getController();
        this.mMapController = a32;
        com.google.android.maps.MapController a33 = this.mMapController;
        a33.setZoom(14);
        double d = Double.parseDouble(s0);
        double d0 = 1000000.0 * d;
        int i4 = (int)d0;
        double d1 = Double.parseDouble(s1);
        double d2 = 1000000.0 * d1;
        int i5 = (int)d2;
        com.google.android.maps.GeoPoint a34 = new com.google.android.maps.GeoPoint(i4, i5);
        com.google.android.maps.OverlayItem a35 = new com.google.android.maps.OverlayItem(a34, "", s3);
        org.spf.utils.DefaultItemizedOverlay a36 = this.mOverlay;
        a36.addOverlay(a35);
        com.google.android.maps.MapController a37 = this.mMapController;
        a37.animateTo(a34);
        com.google.android.maps.MapController a38 = this.mMapController;
        a38.setCenter(a34);
        android.location.Location a39 = org.spf.utils.Utils.getLastLocation();
        if(a39 != null)
        {
            android.location.Location a40 = org.spf.utils.Utils.getLastLocation();
            double d3 = a40.getLatitude();
            double d4 = 1000000.0 * d3;
            int i6 = (int)d4;
            android.location.Location a41 = org.spf.utils.Utils.getLastLocation();
            double d5 = a41.getLongitude();
            double d6 = 1000000.0 * d5;
            int i7 = (int)d6;
            com.google.android.maps.GeoPoint a42 = new com.google.android.maps.GeoPoint(i6, i7);
            com.google.android.maps.OverlayItem a43 = new com.google.android.maps.OverlayItem(a42, "", "Current Location");
            android.graphics.drawable.Drawable a44 = this.mDrawable_home;
            org.spf.mobi.ui.SPFOverlay a45 = new org.spf.mobi.ui.SPFOverlay(a44, (android.content.Context)this, a42, a34);
            this.mOverlay_home = a45;
            org.spf.mobi.ui.SPFOverlay a46 = this.mOverlay_home;
            a46.addOverlay(a43);
            Object a47 = this.mMapOverlays;
            org.spf.mobi.ui.SPFOverlay a48 = this.mOverlay_home;
            ((java.util.List)a47).add((Object)a48);
        }
        Object a49 = this.mMapOverlays;
        org.spf.utils.DefaultItemizedOverlay a50 = this.mOverlay;
        ((java.util.List)a49).add((Object)a50);
    }
    
    protected boolean isRouteDisplayed()
    {
        return false;
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
        this.setContentView(2130903062);
        android.view.View a0 = this.findViewById(2131165246);
        android.widget.TextView dummy = (android.widget.TextView)a0;
        android.widget.TextView a1 = (android.widget.TextView)a0;
        a1.setText(2131034117);
        this.init();
    }
}
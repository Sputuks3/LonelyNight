package org.spf.mobi.ui;

public class SPFOverlay extends org.spf.utils.DefaultItemizedOverlay {
    private com.google.android.maps.GeoPoint globalGeoPoint;
    private android.content.Context mContext;
    private com.google.android.maps.GeoPoint maxSizeAreaGP;
    
    public SPFOverlay(android.graphics.drawable.Drawable a, android.content.Context a0, com.google.android.maps.GeoPoint a1, com.google.android.maps.GeoPoint a2)
    {
        super(a, a0);
        this.mContext = a0;
        int i = a1.getLatitudeE6();
        int i0 = a1.getLongitudeE6();
        com.google.android.maps.GeoPoint a3 = new com.google.android.maps.GeoPoint(i, i0);
        this.globalGeoPoint = a3;
        int i1 = a1.getLatitudeE6();
        int i2 = 10000 + i1;
        int i3 = a1.getLongitudeE6();
        com.google.android.maps.GeoPoint a4 = new com.google.android.maps.GeoPoint(i2, i3);
        this.maxSizeAreaGP = a4;
    }
    
    private android.content.Context getApplicationContext()
    {
        android.content.Context a = this.mContext;
        return a;
    }
    
    public void draw(android.graphics.Canvas a, com.google.android.maps.MapView a0, boolean b)
    {
        Object a1 = a0.getProjection();
        int i = b?1:0;
        if(i != 0)
        {
            if(a1 != null)
            {
                android.graphics.Point a2 = new android.graphics.Point();
                com.google.android.maps.GeoPoint a3 = this.globalGeoPoint;
                ((com.google.android.maps.Projection)a1).toPixels(a3, a2);
                android.graphics.Point a4 = new android.graphics.Point();
                com.google.android.maps.GeoPoint a5 = this.maxSizeAreaGP;
                ((com.google.android.maps.Projection)a1).toPixels(a5, a4);
                int i0 = a4.x;
                int i1 = a2.x;
                int i2 = i0 - i1;
                double d = (double)i2;
                double d0 = Math.pow(d, 2.0);
                int i3 = a4.y;
                int i4 = a2.y;
                int i5 = i3 - i4;
                double d1 = (double)i5;
                double d2 = Math.pow(d1, 2.0);
                double d3 = d0 + d2;
                double d4 = Math.sqrt(d3);
                float f = (float)d4;
                String s = String.valueOf(f);
                StringBuilder a6 = new StringBuilder(s);
                String s0 = a6.toString();
                android.util.Log.i("RADIUS", s0);
                android.graphics.Paint a7 = new android.graphics.Paint(1);
                a7.setColor(409364223);
                android.graphics.Paint.Style a8 = android.graphics.Paint.Style.FILL_AND_STROKE;
                a7.setStyle(a8);
                int i6 = a2.x;
                float f0 = (float)i6;
                int i7 = a2.y;
                float f1 = (float)i7;
                a.drawCircle(f0, f1, f, a7);
                a7.setColor(-10066177);
                android.graphics.Paint.Style a9 = android.graphics.Paint.Style.STROKE;
                a7.setStyle(a9);
                int i8 = a2.x;
                float f2 = (float)i8;
                int i9 = a2.y;
                float f3 = (float)i9;
                a.drawCircle(f2, f3, f, a7);
                android.content.Context a10 = this.getApplicationContext();
                android.content.res.Resources a11 = a10.getResources();
                android.graphics.Bitmap a12 = android.graphics.BitmapFactory.decodeResource(a11, 2130837639);
                int i10 = a2.x;
                float f4 = (float)i10;
                int i11 = a2.y;
                int i12 = a12.getHeight();
                int i13 = i11 - i12;
                float f5 = (float)i13;
                a.drawBitmap(a12, f4, f5, (android.graphics.Paint)null);
                ((org.spf.utils.DefaultItemizedOverlay)this).draw(a, a0, i != 0);
            }
        }
    }
}
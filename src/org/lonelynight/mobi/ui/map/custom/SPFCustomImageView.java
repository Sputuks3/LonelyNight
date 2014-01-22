package org.spf.mobi.ui.map.custom;

public class SPFCustomImageView extends android.webkit.WebView {
    private android.graphics.Bitmap mBitmap;
    private android.content.Context mContext;
    private android.view.MotionEvent mEvent;
    
    public SPFCustomImageView(android.content.Context a, android.util.AttributeSet a0)
    {
        super(a, a0);
        this.mContext = a;
        org.spf.mobi.ui.map.custom.SPFCustomImageView.1 a1 = new org.spf.mobi.ui.map.custom.SPFCustomImageView.1(this);
        this.setOnClickListener((android.view.View.OnClickListener)a1);
    }
    
    public SPFCustomImageView(android.content.Context a, android.util.AttributeSet a0, int i)
    {
        super(a, a0, i);
        this.mContext = a;
        android.content.res.Resources a1 = a.getResources();
        android.graphics.Bitmap a2 = android.graphics.BitmapFactory.decodeResource(a1, 2130837668);
        this.mBitmap = a2;
    }
    
    static android.view.MotionEvent access$0(org.spf.mobi.ui.map.custom.SPFCustomImageView a)
    {
        android.view.MotionEvent a0 = a.mEvent;
        return a0;
    }
    
    static void access$1(org.spf.mobi.ui.map.custom.SPFCustomImageView a, android.view.MotionEvent a0)
    {
        a.selectColorAndLaunch(a0);
    }
    
    private void launchActivity(org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a)
    {
        org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a0 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.UNKNOWN;
        if(a != a0)
        {
            android.content.Context a1 = this.mContext;
            android.content.Intent a2 = new android.content.Intent(a1, org.spf.mobi.ui.map.SPFSingleMapElementActivity.class);
            int i = a.ordinal();
            a2.putExtra("FORWARD_LOCATION", i);
            StringBuilder a3 = new StringBuilder();
            StringBuilder a4 = a3.append((Object)a);
            String s = a4.toString();
            android.util.Log.i("PRINT", s);
            android.content.Context a5 = this.mContext;
            a5.startActivity(a2);
        }
    }
    
    private void selectColorAndLaunch(android.view.MotionEvent a)
    {
        org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a0 = null;
        org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a1 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.UNKNOWN;
        label1: try
        {
            android.graphics.Bitmap a2 = this.getDrawingCache(true);
            float f = a.getX();
            int i = (int)f;
            float f0 = a.getY();
            int i0 = (int)f0;
            int i1 = a2.getPixel(i, i0);
            int i2 = android.graphics.Color.red(i1);
            int i3 = android.graphics.Color.green(i1);
            int i4 = android.graphics.Color.blue(i1);
            boolean b = org.spf.utils.Utils.isDebugMode((android.app.Activity)null);
            if(b)
            {
                String s = String.valueOf(i2);
                StringBuilder a3 = new StringBuilder(s);
                String s0 = a3.toString();
                android.util.Log.i("RED", s0);
                String s1 = String.valueOf(i3);
                StringBuilder a4 = new StringBuilder(s1);
                String s2 = a4.toString();
                android.util.Log.i("GREEN", s2);
                String s3 = String.valueOf(i4);
                StringBuilder a5 = new StringBuilder(s3);
                String s4 = a5.toString();
                android.util.Log.i("BLUE", s4);
            }
            label0: {
                if(i2 <= 230)
                {
                    break label0;
                }
                if(i2 >= 255)
                {
                    break label0;
                }
                if(i3 <= 160)
                {
                    break label0;
                }
                if(i3 >= 185)
                {
                    break label0;
                }
                if(i4 <= 200)
                {
                    break label0;
                }
                if(i4 >= 230)
                {
                    break label0;
                }
                android.util.Log.i("COLOR", "LIGHT PINK");
                org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a6 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.LIGHT_PINK;
                a0 = a6;
                break label1;
            }
            label2: {
                if(i2 <= 220)
                {
                    break label2;
                }
                if(i2 >= 235)
                {
                    break label2;
                }
                if(i3 <= 135)
                {
                    break label2;
                }
                if(i3 >= 150)
                {
                    break label2;
                }
                if(i4 <= 60)
                {
                    break label2;
                }
                if(i4 >= 70)
                {
                    break label2;
                }
                android.util.Log.i("COLOR", "ORANGE");
                org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a7 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.ORANGE;
                a0 = a7;
                break label1;
            }
            label3: {
                if(i2 <= 195)
                {
                    break label3;
                }
                if(i2 >= 210)
                {
                    break label3;
                }
                if(i3 <= 130)
                {
                    break label3;
                }
                if(i3 >= 145)
                {
                    break label3;
                }
                if(i4 <= 180)
                {
                    break label3;
                }
                if(i4 >= 200)
                {
                    break label3;
                }
                android.util.Log.i("COLOR", "PINK");
                org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a8 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.PINK;
                a0 = a8;
                break label1;
            }
            label4: {
                if(i2 <= 150)
                {
                    break label4;
                }
                if(i2 >= 175)
                {
                    break label4;
                }
                if(i3 <= 30)
                {
                    break label4;
                }
                if(i3 >= 60)
                {
                    break label4;
                }
                if(i4 <= 100)
                {
                    break label4;
                }
                if(i4 >= 125)
                {
                    break label4;
                }
                android.util.Log.i("COLOR", "DARK PINK");
                org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a9 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.DARK_PINK;
                a0 = a9;
                break label1;
            }
            label5: {
                if(i2 <= 90)
                {
                    break label5;
                }
                if(i2 >= 105)
                {
                    break label5;
                }
                if(i3 <= 65)
                {
                    break label5;
                }
                if(i3 >= 80)
                {
                    break label5;
                }
                if(i4 <= 170)
                {
                    break label5;
                }
                if(i4 >= 195)
                {
                    break label5;
                }
                android.util.Log.i("COLOR", "BLUE");
                org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a10 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.BLUE;
                a0 = a10;
                break label1;
            }
            label6: {
                if(i2 <= 25)
                {
                    break label6;
                }
                if(i2 >= 40)
                {
                    break label6;
                }
                if(i3 <= 185)
                {
                    break label6;
                }
                if(i3 >= 200)
                {
                    break label6;
                }
                if(i4 <= 155)
                {
                    break label6;
                }
                if(i4 >= 170)
                {
                    break label6;
                }
                android.util.Log.i("COLOR", "TINT");
                org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a11 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.TINT;
                a0 = a11;
                break label1;
            }
            label7: {
                if(i2 <= 130)
                {
                    break label7;
                }
                if(i2 >= 145)
                {
                    break label7;
                }
                if(i3 <= 205)
                {
                    break label7;
                }
                if(i3 >= 220)
                {
                    break label7;
                }
                if(i4 <= 20)
                {
                    break label7;
                }
                if(i4 >= 30)
                {
                    break label7;
                }
                android.util.Log.i("COLOR", "GREEN");
                org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a12 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.GREEN;
                a0 = a12;
                break label1;
            }
            android.content.Context a13 = this.mContext;
            android.app.AlertDialog.Builder a14 = new android.app.AlertDialog.Builder(a13);
            a14.setTitle((CharSequence)"Police");
            android.app.AlertDialog.Builder a15 = a14.setMessage((CharSequence)"Please Select Any Zone");
            android.app.AlertDialog.Builder a16 = a15.setCancelable(false);
            org.spf.mobi.ui.map.custom.SPFCustomImageView.2 a17 = new org.spf.mobi.ui.map.custom.SPFCustomImageView.2(this);
            a16.setPositiveButton((CharSequence)"OK", (android.content.DialogInterface.OnClickListener)a17);
            android.app.AlertDialog a18 = a14.create();
            a18.show();
            a0 = a1;
        }
        catch(IllegalArgumentException ignoredException)
        {
            android.util.Log.i("NO COLOR CODE HERE", "HMM LOST");
            org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a19 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.UNKNOWN;
            a0 = a19;
        }
        this.launchActivity(a0);
    }
    
    protected void onDraw(android.graphics.Canvas a)
    {
        ((android.webkit.WebView)this).onDraw(a);
    }
    
    public boolean onTouchEvent(android.view.MotionEvent a)
    {
        android.graphics.Bitmap a0 = this.mBitmap;
        if(a0 == null)
        {
            android.graphics.Bitmap a1 = this.getDrawingCache();
            this.mBitmap = a1;
        }
        this.mEvent = a;
        int i = a.getAction();
        if(i == 1)
        {
            StringBuilder a2 = new StringBuilder();
            long j = a.getDownTime();
            StringBuilder a3 = a2.append(j);
            String s = a3.toString();
            android.util.Log.i("DOWN TIME", s);
            StringBuilder a4 = new StringBuilder();
            long j0 = a.getEventTime();
            StringBuilder a5 = a4.append(j0);
            String s0 = a5.toString();
            android.util.Log.i("DOWN TIME", s0);
            StringBuilder a6 = new StringBuilder();
            int i0 = a.getHistorySize();
            StringBuilder a7 = a6.append(i0);
            String s1 = a7.toString();
            android.util.Log.i("History Size", s1);
            long j1 = a.getDownTime();
            long j2 = a.getEventTime();
            long j3 = j1 - j2;
            long j4 = Math.abs(j3);
            int i1 = j4 < 250L?-1:j4 == 250L?0:1;
            if(i1 < 0)
            {
                int i2 = a.getHistorySize();
                if(i2 < 1)
                {
                    StringBuilder a8 = new StringBuilder("YEPP WE ARE TRYING");
                    android.view.MotionEvent a9 = this.mEvent;
                    StringBuilder a10 = a8.append((Object)a9);
                    String s2 = a10.toString();
                    android.util.Log.i("ZOOMING", s2);
                    android.view.MotionEvent a11 = this.mEvent;
                    if(a11 != null)
                    {
                        android.view.MotionEvent a12 = this.mEvent;
                        this.selectColorAndLaunch(a12);
                    }
                }
            }
        }
        boolean b = ((android.webkit.WebView)this).onTouchEvent(a);
        return b;
    }
}
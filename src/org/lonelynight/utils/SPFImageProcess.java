package org.spf.utils;

import android.graphics.*;

public class SPFImageProcess {
    public SPFImageProcess()
    {
        super();
    }
    
    public static int calculateInSampleSize(BitmapFactory.Options a, int i, int i0)
    {
        int i1 = 0;
        label3: {
            int i2 = a.outHeight;
            int i3 = a.outWidth;
            label2: {
                int i4 = 0;
                label1: {
                    label0: {
                        if(i2 > i0)
                        {
                            break label0;
                        }
                        if(i3 <= i)
                        {
                            i4 = 1;
                            break label1;
                        }
                    }
                    if(i3 <= i2)
                    {
                        break label2;
                    }
                    float f = (float)i2;
                    float f0 = (float)i0;
                    float f1 = f / f0;
                    int i5 = Math.round(f1);
                    i4 = i5;
                }
                i1 = i4;
                break label3;
            }
            float f2 = (float)i3;
            float f3 = (float)i;
            float f4 = f2 / f3;
            int i6 = Math.round(f4);
            i1 = i6;
        }
        return i1;
    }
    
    public static Bitmap decodeSampledBitmapFromFile(String s, int i, int i0) throws Exception
    {
        Bitmap a = null;
        synchronized(SPFImageProcess.class)
        {
        	try
        	{
        		BitmapFactory.Options a0 = new BitmapFactory.Options();
        		a0.inJustDecodeBounds = true;
        		BitmapFactory.decodeFile(s, a0);
        		int i1 = SPFImageProcess.calculateInSampleSize(a0, i, i0);
        		a0.inSampleSize = i1;
        		a0.inJustDecodeBounds = false;
        		a = BitmapFactory.decodeFile(s, a0);
        	}
        	catch(Exception a1)
        	{
        		throw a1;
        	}
        }
        return a;
    }
    
    public static Bitmap decodeSampledBitmapFromInputStream(java.io.InputStream a, int i, int i0)
    {
        BitmapFactory.Options a0 = new BitmapFactory.Options();
        a0.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(a, (Rect)null, a0);
        int i1 = SPFImageProcess.calculateInSampleSize(a0, i, i0);
        a0.inSampleSize = i1;
        a0.inJustDecodeBounds = false;
        Bitmap a1 = BitmapFactory.decodeStream(a, (Rect)null, a0);
        return a1;
    }
    
    public static Bitmap decodeSampledBitmapFromResource(android.content.res.Resources a, int i, int i0, int i1)
    {
        BitmapFactory.Options a0 = new BitmapFactory.Options();
        a0.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(a, i, a0);
        int i2 = SPFImageProcess.calculateInSampleSize(a0, i0, i1);
        a0.inSampleSize = i2;
        a0.inJustDecodeBounds = false;
        Bitmap a1 = BitmapFactory.decodeResource(a, i, a0);
        return a1;
    }
}
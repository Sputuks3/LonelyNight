package org.spf.mobi.ui;

import java.lang.ref.WeakReference;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;

class BitmapWorkerTask extends AsyncTask {
    final private WeakReference<ImageView> imageViewReference;
    
    public BitmapWorkerTask(org.spf.mobi.ui.SPFHomeActivity a, WeakReference<ImageView> a0)
    {
        super();

        this.imageViewReference = a0;
    }
    
    protected android.graphics.Bitmap doInBackground(Void[] a)
    {
        return getDefaultThumpImage();
    }
    
    protected Object doInBackground(Object[] a)
    {
        android.graphics.Bitmap a1 = (Bitmap) this.doInBackground((Void[])a);
        return a1;
    }
    
    protected void onPostExecute(android.graphics.Bitmap a)
    {
        label4: {
            WeakReference<ImageView> a0 = this.imageViewReference;
            label3: {
                label2: {
                    label1: {
                        label0: {
                            if(a0 == null)
                            {
                                break label0;
                            }
                            if(a != null)
                            {
                                break label1;
                            }
                        }
                        if(this.imageViewReference == null)
                        {
                            break label2;
                        }
                        if(a != null)
                        {
                            break label2;
                        }
                        else
                        {
                            break label3;
                        }
                    }
                    ImageView a4 = (ImageView)this.imageViewReference.get();
                    if(a4 != null)
                    {
                        a4.setImageBitmap(a);
                        a4.setTag((Object)"-1");
                    }
                }
                break label4;
            }
            ImageView a7 = (ImageView)this.imageViewReference.get();
            android.util.Log.e("SPF", "NO Cashed Image found");
            a7.setImageResource(2130837595);
        }
    }
    
    protected void onPostExecute(Object a)
    {
        android.graphics.Bitmap a0 = (android.graphics.Bitmap)a;
        this.onPostExecute(a0);
    }
}
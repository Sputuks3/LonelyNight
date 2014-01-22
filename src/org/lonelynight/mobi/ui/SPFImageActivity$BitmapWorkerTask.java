package org.spf.mobi.ui;

class BitmapWorkerTask extends android.os.AsyncTask {
    private String file_path;
    final private java.lang.ref.WeakReference imageViewReference;
    final org.spf.mobi.ui.SPFImageActivity this$0;
    
    public BitmapWorkerTask(org.spf.mobi.ui.SPFImageActivity a, android.widget.ImageView a0)
    {
        this.this$0 = a;
        super();
        this.file_path = "";
        java.lang.ref.WeakReference a1 = new java.lang.ref.WeakReference((Object)a0);
        this.imageViewReference = a1;
    }
    
    protected android.graphics.Bitmap doInBackground(String[] a)
    {
        android.graphics.Bitmap a0 = null;
        label1: {
            String s = a[0];
            this.file_path = s;
            String s0 = this.file_path;
            label0: {
                if(s0 == null)
                {
                    break label0;
                }
                String s1 = this.file_path;
                boolean b = s1.equalsIgnoreCase("");
                if(b)
                {
                    break label0;
                }
                String s2 = this.file_path;
                android.graphics.Bitmap a1 = org.spf.utils.SPFImageProcess.decodeSampledBitmapFromFile(s2, 320, 470);
                a0 = a1;
                break label1;
            }
            org.spf.mobi.ui.SPFImageActivity a2 = this.this$0;
            android.content.res.Resources a3 = a2.getResources();
            android.graphics.Bitmap a4 = org.spf.utils.SPFImageProcess.decodeSampledBitmapFromResource(a3, 2130837510, 320, 470);
            a0 = a4;
        }
        return a0;
    }
    
    protected Object doInBackground(Object[] a)
    {
        String[] dummy = (String[])a;
        String[] a0 = (String[])a;
        android.graphics.Bitmap a1 = this.doInBackground(a0);
        return a1;
    }
    
    protected void onPostExecute(android.graphics.Bitmap a)
    {
        java.lang.ref.WeakReference a0 = this.imageViewReference;
        if(a0 != null)
        {
            if(a != null)
            {
                java.lang.ref.WeakReference a1 = this.imageViewReference;
                Object a2 = a1.get();
                android.widget.ImageView dummy = (android.widget.ImageView)a2;
                android.widget.ImageView a3 = (android.widget.ImageView)a2;
                if(a3 != null)
                {
                    a3.setImageBitmap(a);
                }
            }
        }
    }
    
    protected void onPostExecute(Object a)
    {
        android.graphics.Bitmap dummy = (android.graphics.Bitmap)a;
        android.graphics.Bitmap a0 = (android.graphics.Bitmap)a;
        this.onPostExecute(a0);
    }
}
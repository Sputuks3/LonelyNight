package org.spf.mobi.ui;

public class SPFImageActivity extends org.spf.mobi.ui.SPFActivity implements org.spf.utils.Constants {
    android.widget.ImageView imgHolder;
    String strFileName;
    String strPath;
    
    public SPFImageActivity()
    {
        super();
    }
    
    public void onBackPressed()
    {
        this.finish();
        System.gc();
        this.overridePendingTransition(2130968576, 2130968577);
        ((org.spf.mobi.ui.SPFActivity)this).onBackPressed();
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        label1: {
            Exception a0 = null;
            this.setContentView(2130903049);
            ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
            android.view.View a1 = this.findViewById(2131165254);
            android.widget.ImageView dummy = (android.widget.ImageView)a1;
            android.widget.ImageView a2 = (android.widget.ImageView)a1;
            this.imgHolder = a2;
            label0: {
                try
                {
                    android.content.Intent a3 = this.getIntent();
                    boolean b = a3.hasExtra("IMAGE_URL");
                    if(b)
                    {
                        android.content.Intent a4 = this.getIntent();
                        String s = a4.getStringExtra("IMAGE_URL");
                        this.strFileName = s;
                        String s0 = this.strFileName;
                        android.util.Log.d("SPF", s0);
                        android.content.Context a5 = this.getApplicationContext();
                        java.io.File a6 = a5.getFilesDir();
                        String s1 = a6.getAbsolutePath();
                        String s2 = String.valueOf((Object)s1);
                        StringBuilder a7 = new StringBuilder(s2);
                        StringBuilder a8 = a7.append("/");
                        String s3 = this.strFileName;
                        StringBuilder a9 = a8.append(s3);
                        String s4 = a9.toString();
                        this.strPath = s4;
                        String s5 = this.strPath;
                        java.io.File a10 = new java.io.File(s5);
                    }
                    android.widget.ImageView a11 = this.imgHolder;
                    org.spf.mobi.ui.SPFImageActivity.BitmapWorkerTask a12 = new org.spf.mobi.ui.SPFImageActivity.BitmapWorkerTask(this, a11);
                    String[] a13 = new String[1];
                    String s6 = this.strPath;
                    a13[0] = s6;
                    a12.execute((Object[])a13);
                }
                catch(Exception a14)
                {
                    a0 = a14;
                    break label0;
                }
                break label1;
            }
            a0.printStackTrace();
        }
    }
}
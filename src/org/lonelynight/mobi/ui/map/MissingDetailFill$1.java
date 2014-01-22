package org.spf.mobi.ui.map;

class 1 implements Runnable {
    final org.spf.mobi.ui.map.MissingDetailFill this$0;
    final private android.os.Parcelable val$data;
    final private android.view.View val$view;
    
    1(org.spf.mobi.ui.map.MissingDetailFill a, android.os.Parcelable a0, android.view.View a1)
    {
        this.this$0 = a;
        Object a2 = a0;
        this.val$data = (android.os.Parcelable)a2;
        this.val$view = a1;
        super();
    }
    
    public void run()
    {
        label2: {
            org.spf.data.SPFMissing a = null;
            android.widget.ImageView a0 = null;
            Object a1 = this.val$data;
            label1: {
                label0: {
                    boolean b = a1 instanceof org.spf.data.SPFMissing;
                    if(!b)
                    {
                        break label0;
                    }
                    Object a2 = this.val$data;
                    org.spf.data.SPFMissing dummy = (org.spf.data.SPFMissing)a2;
                    a = (org.spf.data.SPFMissing)a2;
                    android.view.View a3 = this.val$view;
                    android.view.View a4 = a3.findViewById(2131165246);
                    android.widget.TextView dummy0 = (android.widget.TextView)a4;
                    android.widget.TextView a5 = (android.widget.TextView)a4;
                    org.spf.mobi.ui.map.MissingDetailFill a6 = this.this$0;
                    android.app.Activity a7 = a6.context;
                    android.content.res.Resources a8 = a7.getResources();
                    String s = a8.getString(2131034116);
                    a5.setText((CharSequence)s);
                    android.view.View a9 = this.val$view;
                    android.view.View a10 = a9.findViewById(2131165321);
                    android.widget.TextView dummy1 = (android.widget.TextView)a10;
                    android.widget.TextView a11 = (android.widget.TextView)a10;
                    String s0 = a.getTitle();
                    a11.setText((CharSequence)s0);
                    android.view.View a12 = this.val$view;
                    android.view.View a13 = a12.findViewById(2131165324);
                    android.widget.TextView dummy2 = (android.widget.TextView)a13;
                    android.widget.TextView a14 = (android.widget.TextView)a13;
                    String s1 = a.getName();
                    a14.setText((CharSequence)s1);
                    android.view.View a15 = this.val$view;
                    android.view.View a16 = a15.findViewById(2131165326);
                    android.widget.TextView dummy3 = (android.widget.TextView)a16;
                    android.widget.TextView a17 = (android.widget.TextView)a16;
                    String s2 = a.getAge();
                    a17.setText((CharSequence)s2);
                    String s3 = a.getGender();
                    boolean b0 = s3.equalsIgnoreCase("1");
                    if(!b0)
                    {
                        String s4 = a.getGender();
                        boolean b1 = s4.equalsIgnoreCase("-1");
                        if(b1)
                        {
                            android.view.View a18 = this.val$view;
                            android.view.View a19 = a18.findViewById(2131165328);
                            android.widget.TextView dummy4 = (android.widget.TextView)a19;
                            android.widget.TextView a20 = (android.widget.TextView)a19;
                            org.spf.mobi.ui.map.MissingDetailFill a21 = this.this$0;
                            android.app.Activity a22 = a21.context;
                            android.content.res.Resources a23 = a22.getResources();
                            String s5 = a23.getString(2131034143);
                            a20.setText((CharSequence)s5);
                        }
                    }
                    else
                    {
                        android.view.View a24 = this.val$view;
                        android.view.View a25 = a24.findViewById(2131165328);
                        android.widget.TextView dummy5 = (android.widget.TextView)a25;
                        android.widget.TextView a26 = (android.widget.TextView)a25;
                        org.spf.mobi.ui.map.MissingDetailFill a27 = this.this$0;
                        android.app.Activity a28 = a27.context;
                        android.content.res.Resources a29 = a28.getResources();
                        String s6 = a29.getString(2131034142);
                        a26.setText((CharSequence)s6);
                    }
                    String s7 = a.getHairType();
                    boolean b2 = s7.equalsIgnoreCase("null");
                    if(!b2)
                    {
                        android.view.View a30 = this.val$view;
                        android.view.View a31 = a30.findViewById(2131165330);
                        android.widget.TextView dummy6 = (android.widget.TextView)a31;
                        android.widget.TextView a32 = (android.widget.TextView)a31;
                        String s8 = a.getHairType();
                        a32.setText((CharSequence)s8);
                    }
                    else
                    {
                        android.view.View a33 = this.val$view;
                        android.view.View a34 = a33.findViewById(2131165330);
                        android.widget.TextView dummy7 = (android.widget.TextView)a34;
                        android.widget.TextView a35 = (android.widget.TextView)a34;
                        org.spf.mobi.ui.map.MissingDetailFill a36 = this.this$0;
                        android.app.Activity a37 = a36.context;
                        android.content.res.Resources a38 = a37.getResources();
                        String s9 = a38.getString(2131034151);
                        a35.setText((CharSequence)s9);
                    }
                    String s10 = a.getHeight();
                    boolean b3 = s10.equalsIgnoreCase("null");
                    if(!b3)
                    {
                        android.view.View a39 = this.val$view;
                        android.view.View a40 = a39.findViewById(2131165332);
                        android.widget.TextView dummy8 = (android.widget.TextView)a40;
                        android.widget.TextView a41 = (android.widget.TextView)a40;
                        String s11 = a.getHeight();
                        a41.setText((CharSequence)s11);
                    }
                    else
                    {
                        android.view.View a42 = this.val$view;
                        android.view.View a43 = a42.findViewById(2131165332);
                        android.widget.TextView dummy9 = (android.widget.TextView)a43;
                        android.widget.TextView a44 = (android.widget.TextView)a43;
                        org.spf.mobi.ui.map.MissingDetailFill a45 = this.this$0;
                        android.app.Activity a46 = a45.context;
                        android.content.res.Resources a47 = a46.getResources();
                        String s12 = a47.getString(2131034151);
                        a44.setText((CharSequence)s12);
                    }
                    String s13 = a.getComplexion();
                    boolean b4 = s13.equalsIgnoreCase("null");
                    if(!b4)
                    {
                        android.view.View a48 = this.val$view;
                        android.view.View a49 = a48.findViewById(2131165334);
                        android.widget.TextView dummy10 = (android.widget.TextView)a49;
                        android.widget.TextView a50 = (android.widget.TextView)a49;
                        String s14 = a.getComplexion();
                        a50.setText((CharSequence)s14);
                    }
                    else
                    {
                        android.view.View a51 = this.val$view;
                        android.view.View a52 = a51.findViewById(2131165334);
                        android.widget.TextView dummy11 = (android.widget.TextView)a52;
                        android.widget.TextView a53 = (android.widget.TextView)a52;
                        org.spf.mobi.ui.map.MissingDetailFill a54 = this.this$0;
                        android.app.Activity a55 = a54.context;
                        android.content.res.Resources a56 = a55.getResources();
                        String s15 = a56.getString(2131034151);
                        a53.setText((CharSequence)s15);
                    }
                    android.view.View a57 = this.val$view;
                    android.view.View a58 = a57.findViewById(2131165336);
                    android.widget.TextView dummy12 = (android.widget.TextView)a58;
                    android.widget.TextView a59 = (android.widget.TextView)a58;
                    String s16 = a.getMissingDateStr();
                    a59.setText((CharSequence)s16);
                    android.view.View a60 = this.val$view;
                    android.view.View a61 = a60.findViewById(2131165339);
                    android.widget.TextView dummy13 = (android.widget.TextView)a61;
                    android.widget.TextView a62 = (android.widget.TextView)a61;
                    String s17 = a.getLocation();
                    a62.setText((CharSequence)s17);
                    String s18 = a.getDescription();
                    StringBuilder a63 = new StringBuilder("DescCheck1::");
                    StringBuilder a64 = a63.append(s18);
                    String s19 = a64.toString();
                    android.util.Log.d("SPF", s19);
                    String s20 = s18.replace((CharSequence)"\u00d4\u00f8\u03a9", (CharSequence)" ");
                    StringBuilder a65 = new StringBuilder("DescCheck2::");
                    StringBuilder a66 = a65.append(s20);
                    String s21 = a66.toString();
                    android.util.Log.d("SPF", s21);
                    android.view.View a67 = this.val$view;
                    android.view.View a68 = a67.findViewById(2131165342);
                    android.widget.TextView dummy14 = (android.widget.TextView)a68;
                    android.widget.TextView a69 = (android.widget.TextView)a68;
                    a69.setText((CharSequence)s20);
                    org.spf.data.SPFImagePath a70 = a.getImagePath();
                    String s22 = a70.getFull();
                    StringBuilder a71 = new StringBuilder(s22);
                    String s23 = a.getImageUrl();
                    a71.append(s23);
                    android.view.View a72 = this.val$view;
                    android.view.View a73 = a72.findViewById(2131165238);
                    android.widget.ImageView dummy15 = (android.widget.ImageView)a73;
                    a0 = (android.widget.ImageView)a73;
                    android.graphics.Bitmap a74 = a.getFull();
                    if(a74 != null)
                    {
                        android.graphics.Bitmap a75 = a.getFull();
                        a0.setImageBitmap(a75);
                    }
                    else
                    {
                        org.spf.mobi.ui.map.MissingDetailFill a76 = this.this$0;
                        android.app.Activity a77 = a76.context;
                        org.spf.mobi.ui.map.MissingDetailFill a78 = this.this$0;
                        android.os.Handler a79 = a78.mHandler;
                        String s24 = a71.toString();
                        org.spf.utils.Constants.IMAGE_TYPE a80 = org.spf.utils.Constants.IMAGE_TYPE.FULL;
                        org.spf.utils.SPFGetImageFromHttp a81 = new org.spf.utils.SPFGetImageFromHttp(a77, a0, a79, s24, (android.os.Parcelable)a, a80);
                        a81.start();
                    }
                    org.spf.data.SPFImagePath a82 = a.getImagePath();
                    String s25 = a82.getFooter();
                    StringBuilder a83 = new StringBuilder(s25);
                    org.spf.data.SPFFooter a84 = a.getFooterData();
                    String s26 = a84.getUrl();
                    a83.append(s26);
                    android.view.View a85 = this.val$view;
                    android.view.View a86 = a85.findViewById(2131165191);
                    android.widget.ImageView dummy16 = (android.widget.ImageView)a86;
                    android.widget.ImageView a87 = (android.widget.ImageView)a86;
                    android.graphics.Bitmap a88 = a.getFooter();
                    if(a88 != null)
                    {
                        break label1;
                    }
                    org.spf.mobi.ui.map.MissingDetailFill a89 = this.this$0;
                    android.app.Activity a90 = a89.context;
                    org.spf.mobi.ui.map.MissingDetailFill a91 = this.this$0;
                    android.os.Handler a92 = a91.mHandler;
                    String s27 = a83.toString();
                    org.spf.utils.Constants.IMAGE_TYPE a93 = org.spf.utils.Constants.IMAGE_TYPE.FOOTER;
                    org.spf.utils.SPFGetImageFromHttp a94 = new org.spf.utils.SPFGetImageFromHttp(a90, a87, a92, s27, (android.os.Parcelable)a, a93);
                    a94.start();
                }
                break label2;
            }
            android.graphics.Bitmap a95 = a.getFooter();
            a0.setImageBitmap(a95);
        }
    }
}
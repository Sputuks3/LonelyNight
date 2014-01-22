package org.spf.mobi.ui.common;

class 1 implements Runnable {
    private static int[] $SWITCH_TABLE$org$spf$utils$Constants$SCREENS;
    final org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread this$1;
    private String value;
    
    static int[] $SWITCH_TABLE$org$spf$utils$Constants$SCREENS()
    {
        int[] a = null;
        int[] a0 = $SWITCH_TABLE$org$spf$utils$Constants$SCREENS;
        if(a0 == null)
        {
            org.spf.utils.Constants.SCREENS[] a1 = org.spf.utils.Constants.SCREENS.values();
            int i = a1.length;
            int[] a2 = new int[i];
            try
            {
                org.spf.utils.Constants.SCREENS a3 = org.spf.utils.Constants.SCREENS.APPEAL;
                int i0 = a3.ordinal();
                a2[i0] = 3;
            }
            catch(NoSuchFieldError ignoredException)
            {
            }
            try
            {
                org.spf.utils.Constants.SCREENS a4 = org.spf.utils.Constants.SCREENS.CONTACT;
                int i1 = a4.ordinal();
                a2[i1] = 7;
            }
            catch(NoSuchFieldError ignoredException0)
            {
            }
            try
            {
                org.spf.utils.Constants.SCREENS a5 = org.spf.utils.Constants.SCREENS.HOME;
                int i2 = a5.ordinal();
                a2[i2] = 10;
            }
            catch(NoSuchFieldError ignoredException1)
            {
            }
            try
            {
                org.spf.utils.Constants.SCREENS a6 = org.spf.utils.Constants.SCREENS.JOINUS;
                int i3 = a6.ordinal();
                a2[i3] = 6;
            }
            catch(NoSuchFieldError ignoredException2)
            {
            }
            try
            {
                org.spf.utils.Constants.SCREENS a7 = org.spf.utils.Constants.SCREENS.LOCATOR;
                int i4 = a7.ordinal();
                a2[i4] = 5;
            }
            catch(NoSuchFieldError ignoredException3)
            {
            }
            try
            {
                org.spf.utils.Constants.SCREENS a8 = org.spf.utils.Constants.SCREENS.MAP;
                int i5 = a8.ordinal();
                a2[i5] = 1;
            }
            catch(NoSuchFieldError ignoredException4)
            {
            }
            try
            {
                org.spf.utils.Constants.SCREENS a9 = org.spf.utils.Constants.SCREENS.MISSING;
                int i6 = a9.ordinal();
                a2[i6] = 4;
            }
            catch(NoSuchFieldError ignoredException5)
            {
            }
            try
            {
                org.spf.utils.Constants.SCREENS a10 = org.spf.utils.Constants.SCREENS.NEWS;
                int i7 = a10.ordinal();
                a2[i7] = 2;
            }
            catch(NoSuchFieldError ignoredException6)
            {
            }
            try
            {
                org.spf.utils.Constants.SCREENS a11 = org.spf.utils.Constants.SCREENS.NO_SCREEN;
                int i8 = a11.ordinal();
                a2[i8] = 11;
            }
            catch(NoSuchFieldError ignoredException7)
            {
            }
            try
            {
                org.spf.utils.Constants.SCREENS a12 = org.spf.utils.Constants.SCREENS.VIDEOS;
                int i9 = a12.ordinal();
                a2[i9] = 8;
            }
            catch(NoSuchFieldError ignoredException8)
            {
            }
            try
            {
                org.spf.utils.Constants.SCREENS a13 = org.spf.utils.Constants.SCREENS.WEB;
                int i10 = a13.ordinal();
                a2[i10] = 9;
            }
            catch(NoSuchFieldError ignoredException9)
            {
            }
            $SWITCH_TABLE$org$spf$utils$Constants$SCREENS = a2;
            a = a2;
        }
        else
        {
            a = a0;
        }
        return a;
    }
    
    1(org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a)
    {
        this.this$1 = a;
        super();
    }
    
    public void run()
    {
        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a = this.this$1;
        org.spf.mobi.ui.common.SPFCommonListing a0 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a);
        boolean b = a0.isFinishing();
        if(!b)
        {
            org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a1 = this.this$1;
            org.spf.mobi.ui.common.SPFCommonListing a2 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a1);
            org.spf.data.SPFArrayList a3 = org.spf.mobi.ui.common.SPFCommonListing.access$3(a2);
            if(a3 != null)
            {
                StringBuilder a4 = new StringBuilder();
                org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a5 = this.this$1;
                org.spf.mobi.ui.common.SPFCommonListing a6 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a5);
                org.spf.data.SPFArrayList a7 = org.spf.mobi.ui.common.SPFCommonListing.access$3(a6);
                int i = a7.size();
                StringBuilder a8 = a4.append(i);
                String s = a8.toString();
                android.util.Log.i("Array List Size", s);
                org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a9 = this.this$1;
                org.spf.mobi.ui.common.SPFCommonListing a10 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a9);
                android.view.View a11 = a10.findViewById(2131165201);
                android.widget.TextView dummy = (android.widget.TextView)a11;
                android.widget.TextView a12 = (android.widget.TextView)a11;
                org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a13 = this.this$1;
                org.spf.mobi.ui.common.SPFCommonListing a14 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a13);
                android.view.View a15 = a14.findViewById(2131165198);
                android.widget.RelativeLayout dummy0 = (android.widget.RelativeLayout)a15;
                android.widget.RelativeLayout a16 = (android.widget.RelativeLayout)a15;
                org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a17 = this.this$1;
                org.spf.mobi.ui.common.SPFCommonListing a18 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a17);
                org.spf.data.SPFArrayList a19 = org.spf.mobi.ui.common.SPFCommonListing.access$3(a18);
                int i0 = a19.size();
                if(i0 != 0)
                {
                    org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a20 = this.this$1;
                    org.spf.mobi.ui.common.SPFCommonListing a21 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a20);
                    android.view.View a22 = a21.findViewById(2131165199);
                    android.widget.TextView dummy1 = (android.widget.TextView)a22;
                    android.widget.TextView a23 = (android.widget.TextView)a22;
                    org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a24 = this.this$1;
                    org.spf.mobi.ui.common.SPFCommonListing a25 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a24);
                    android.content.Intent a26 = a25.getIntent();
                    String s0 = a26.getStringExtra("TITLE_NAME");
                    a23.setText((CharSequence)s0);
                    a12.setVisibility(8);
                    org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a27 = this.this$1;
                    org.spf.mobi.ui.common.SPFCommonListing a28 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a27);
                    android.widget.ListView a29 = org.spf.mobi.ui.common.SPFCommonListing.access$4(a28);
                    a29.setVisibility(0);
                }
                else
                {
                    org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a30 = this.this$1;
                    org.spf.mobi.ui.common.SPFCommonListing a31 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a30);
                    android.content.Intent a32 = a31.getIntent();
                    String s1 = a32.getStringExtra("TITLE_NAME");
                    org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a33 = this.this$1;
                    org.spf.mobi.ui.common.SPFCommonListing a34 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a33);
                    android.content.Intent a35 = a34.getIntent();
                    String s2 = a35.getStringExtra("TITLE_NAME");
                    int i1 = s2.length();
                    String s3 = s1.substring(17, i1);
                    this.value = s3;
                    String s4 = this.value;
                    boolean b0 = s4.contains((CharSequence)"News Feed");
                    if(!b0)
                    {
                        String s5 = this.value;
                        boolean b1 = s5.contains((CharSequence)"Police Appeals");
                        if(!b1)
                        {
                            String s6 = this.value;
                            boolean b2 = s6.contains((CharSequence)"Missing Persons");
                            if(b2)
                            {
                                this.value = " missing persons";
                            }
                        }
                        else
                        {
                            this.value = " Appeals";
                        }
                    }
                    else
                    {
                        this.value = " crime news";
                    }
                    org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a36 = this.this$1;
                    org.spf.mobi.ui.common.SPFCommonListing a37 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a36);
                    android.content.res.Resources a38 = a37.getResources();
                    String s7 = a38.getString(2131034205);
                    String s8 = String.valueOf((Object)s7);
                    StringBuilder a39 = new StringBuilder(s8);
                    StringBuilder a40 = a39.append(" for");
                    String s9 = this.value;
                    StringBuilder a41 = a40.append(s9);
                    String s10 = a41.toString();
                    a12.setText((CharSequence)s10);
                    a12.setVisibility(0);
                    org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a42 = this.this$1;
                    org.spf.mobi.ui.common.SPFCommonListing a43 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a42);
                    android.widget.ListView a44 = org.spf.mobi.ui.common.SPFCommonListing.access$4(a43);
                    a44.setVisibility(8);
                    a16.setVisibility(8);
                }
                int[] a45 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.1.$SWITCH_TABLE$org$spf$utils$Constants$SCREENS();
                org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a46 = this.this$1;
                org.spf.utils.Constants.SCREENS a47 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$1(a46);
                int i2 = a47.ordinal();
                int i3 = a45[i2];
                switch(i3){
                    case 5: {
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a48 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a49 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a48);
                        android.view.View a50 = a49.findViewById(2131165246);
                        android.widget.TextView dummy2 = (android.widget.TextView)a50;
                        android.widget.TextView a51 = (android.widget.TextView)a50;
                        a51.setText(2131034117);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a52 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a53 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a52);
                        android.widget.ListView a54 = org.spf.mobi.ui.common.SPFCommonListing.access$4(a53);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a55 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a56 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a55);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a57 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a58 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a57);
                        org.spf.data.SPFArrayList a59 = org.spf.mobi.ui.common.SPFCommonListing.access$3(a58);
                        org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter a60 = new org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter((android.content.Context)a56, (java.util.ArrayList)a59);
                        a54.setAdapter((android.widget.ListAdapter)a60);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a61 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a62 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a61);
                        android.widget.ListView a63 = org.spf.mobi.ui.common.SPFCommonListing.access$4(a62);
                        a63.setFastScrollEnabled(true);
                        break;
                    }
                    case 4: {
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a64 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a65 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a64);
                        android.view.View a66 = a65.findViewById(2131165246);
                        android.widget.TextView dummy3 = (android.widget.TextView)a66;
                        android.widget.TextView a67 = (android.widget.TextView)a66;
                        a67.setText(2131034113);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a68 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a69 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a68);
                        android.widget.ListView a70 = org.spf.mobi.ui.common.SPFCommonListing.access$4(a69);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a71 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a72 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a71);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a73 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a74 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a73);
                        org.spf.data.SPFArrayList a75 = org.spf.mobi.ui.common.SPFCommonListing.access$3(a74);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a76 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a77 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a76);
                        android.os.Handler a78 = org.spf.mobi.ui.common.SPFCommonListing.access$2(a77);
                        org.spf.mobi.ui.missing.custom.SPFMissingListAdapter a79 = new org.spf.mobi.ui.missing.custom.SPFMissingListAdapter((android.app.Activity)a72, a75, a78);
                        a70.setAdapter((android.widget.ListAdapter)a79);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a80 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a81 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a80);
                        android.widget.ListView a82 = org.spf.mobi.ui.common.SPFCommonListing.access$4(a81);
                        a82.setFastScrollEnabled(true);
                        break;
                    }
                    case 3: {
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a83 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a84 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a83);
                        android.view.View a85 = a84.findViewById(2131165246);
                        android.widget.TextView dummy4 = (android.widget.TextView)a85;
                        android.widget.TextView a86 = (android.widget.TextView)a85;
                        a86.setText(2131034113);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a87 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a88 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a87);
                        android.widget.ListView a89 = org.spf.mobi.ui.common.SPFCommonListing.access$4(a88);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a90 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a91 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a90);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a92 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a93 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a92);
                        org.spf.data.SPFArrayList a94 = org.spf.mobi.ui.common.SPFCommonListing.access$3(a93);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a95 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a96 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a95);
                        android.os.Handler a97 = org.spf.mobi.ui.common.SPFCommonListing.access$2(a96);
                        org.spf.mobi.ui.appeal.custom.SPFPoliceAppealAdapter a98 = new org.spf.mobi.ui.appeal.custom.SPFPoliceAppealAdapter((android.app.Activity)a91, a94, a97);
                        a89.setAdapter((android.widget.ListAdapter)a98);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a99 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a100 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a99);
                        android.widget.ListView a101 = org.spf.mobi.ui.common.SPFCommonListing.access$4(a100);
                        a101.setFastScrollEnabled(true);
                        break;
                    }
                    case 2: {
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a102 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a103 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a102);
                        android.view.View a104 = a103.findViewById(2131165246);
                        android.widget.TextView dummy5 = (android.widget.TextView)a104;
                        android.widget.TextView a105 = (android.widget.TextView)a104;
                        a105.setText(2131034113);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a106 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a107 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a106);
                        android.widget.ListView a108 = org.spf.mobi.ui.common.SPFCommonListing.access$4(a107);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a109 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a110 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a109);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a111 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a112 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a111);
                        org.spf.data.SPFArrayList a113 = org.spf.mobi.ui.common.SPFCommonListing.access$3(a112);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a114 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a115 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a114);
                        android.os.Handler a116 = org.spf.mobi.ui.common.SPFCommonListing.access$2(a115);
                        org.spf.mobi.ui.news.custom.SPFNewsListAdapter a117 = new org.spf.mobi.ui.news.custom.SPFNewsListAdapter((android.app.Activity)a110, a113, a116);
                        a108.setAdapter((android.widget.ListAdapter)a117);
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a118 = this.this$1;
                        org.spf.mobi.ui.common.SPFCommonListing a119 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a118);
                        android.widget.ListView a120 = org.spf.mobi.ui.common.SPFCommonListing.access$4(a119);
                        a120.setFastScrollEnabled(true);
                        break;
                    }
                }
            }
            org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a121 = this.this$1;
            org.spf.mobi.ui.common.SPFCommonListing a122 = org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread.access$2(a121);
            a122.removeDialog(2);
        }
    }
}
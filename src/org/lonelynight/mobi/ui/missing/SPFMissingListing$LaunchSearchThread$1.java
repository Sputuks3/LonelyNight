package org.spf.mobi.ui.missing;

class 1 implements Runnable {
    private static int[] $SWITCH_TABLE$org$spf$utils$Constants$SCREENS;
    final org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread this$1;
    
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
    
    1(org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a)
    {
        this.this$1 = a;
        super();
    }
    
    public void run()
    {
        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a = this.this$1;
        org.spf.mobi.ui.missing.SPFMissingListing a0 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a);
        boolean b = a0.isFinishing();
        if(!b)
        {
            org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a1 = this.this$1;
            org.spf.mobi.ui.missing.SPFMissingListing a2 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a1);
            org.spf.data.SPFArrayList a3 = org.spf.mobi.ui.missing.SPFMissingListing.access$3(a2);
            if(a3 != null)
            {
                StringBuilder a4 = new StringBuilder();
                org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a5 = this.this$1;
                org.spf.mobi.ui.missing.SPFMissingListing a6 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a5);
                org.spf.data.SPFArrayList a7 = org.spf.mobi.ui.missing.SPFMissingListing.access$3(a6);
                int i = a7.size();
                StringBuilder a8 = a4.append(i);
                String s = a8.toString();
                android.util.Log.i("Array List Size", s);
                org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a9 = this.this$1;
                org.spf.mobi.ui.missing.SPFMissingListing a10 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a9);
                android.view.View a11 = a10.findViewById(2131165212);
                android.widget.TextView dummy = (android.widget.TextView)a11;
                android.widget.TextView a12 = (android.widget.TextView)a11;
                org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a13 = this.this$1;
                org.spf.mobi.ui.missing.SPFMissingListing a14 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a13);
                android.view.View a15 = a14.findViewById(2131165201);
                android.widget.TextView dummy0 = (android.widget.TextView)a15;
                android.widget.TextView a16 = (android.widget.TextView)a15;
                org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a17 = this.this$1;
                org.spf.mobi.ui.missing.SPFMissingListing a18 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a17);
                org.spf.data.SPFArrayList a19 = org.spf.mobi.ui.missing.SPFMissingListing.access$3(a18);
                int i0 = a19.size();
                if(i0 != 0)
                {
                    a12.setText(2131034206);
                    a12.setBackgroundColor(-7829368);
                    a16.setVisibility(8);
                    a12.setVisibility(0);
                    org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a20 = this.this$1;
                    org.spf.mobi.ui.missing.SPFMissingListing a21 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a20);
                    android.widget.ListView a22 = org.spf.mobi.ui.missing.SPFMissingListing.access$4(a21);
                    a22.setVisibility(0);
                }
                else
                {
                    a16.setVisibility(0);
                    a12.setVisibility(8);
                    a16.setText(2131034205);
                    org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a23 = this.this$1;
                    org.spf.mobi.ui.missing.SPFMissingListing a24 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a23);
                    android.widget.ListView a25 = org.spf.mobi.ui.missing.SPFMissingListing.access$4(a24);
                    a25.setVisibility(8);
                }
                int[] a26 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.1.$SWITCH_TABLE$org$spf$utils$Constants$SCREENS();
                org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a27 = this.this$1;
                org.spf.utils.Constants.SCREENS a28 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$1(a27);
                int i1 = a28.ordinal();
                int i2 = a26[i1];
                switch(i2){
                    case 5: {
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a29 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a30 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a29);
                        android.view.View a31 = a30.findViewById(2131165246);
                        android.widget.TextView dummy1 = (android.widget.TextView)a31;
                        android.widget.TextView a32 = (android.widget.TextView)a31;
                        a32.setText(2131034117);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a33 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a34 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a33);
                        android.widget.ListView a35 = org.spf.mobi.ui.missing.SPFMissingListing.access$4(a34);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a36 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a37 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a36);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a38 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a39 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a38);
                        org.spf.data.SPFArrayList a40 = org.spf.mobi.ui.missing.SPFMissingListing.access$3(a39);
                        org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter a41 = new org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter((android.content.Context)a37, (java.util.ArrayList)a40);
                        a35.setAdapter((android.widget.ListAdapter)a41);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a42 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a43 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a42);
                        android.widget.ListView a44 = org.spf.mobi.ui.missing.SPFMissingListing.access$4(a43);
                        a44.setFastScrollEnabled(true);
                        break;
                    }
                    case 4: {
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a45 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a46 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a45);
                        android.view.View a47 = a46.findViewById(2131165246);
                        android.widget.TextView dummy2 = (android.widget.TextView)a47;
                        android.widget.TextView a48 = (android.widget.TextView)a47;
                        a48.setText(2131034116);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a49 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a50 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a49);
                        android.widget.ListView a51 = org.spf.mobi.ui.missing.SPFMissingListing.access$4(a50);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a52 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a53 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a52);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a54 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a55 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a54);
                        org.spf.data.SPFArrayList a56 = org.spf.mobi.ui.missing.SPFMissingListing.access$3(a55);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a57 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a58 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a57);
                        android.os.Handler a59 = org.spf.mobi.ui.missing.SPFMissingListing.access$2(a58);
                        org.spf.mobi.ui.missing.custom.SPFMissingListAdapter a60 = new org.spf.mobi.ui.missing.custom.SPFMissingListAdapter((android.app.Activity)a53, a56, a59);
                        a51.setAdapter((android.widget.ListAdapter)a60);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a61 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a62 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a61);
                        android.widget.ListView a63 = org.spf.mobi.ui.missing.SPFMissingListing.access$4(a62);
                        a63.setFastScrollEnabled(true);
                        break;
                    }
                    case 3: {
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a64 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a65 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a64);
                        android.view.View a66 = a65.findViewById(2131165246);
                        android.widget.TextView dummy3 = (android.widget.TextView)a66;
                        android.widget.TextView a67 = (android.widget.TextView)a66;
                        a67.setText(2131034115);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a68 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a69 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a68);
                        android.widget.ListView a70 = org.spf.mobi.ui.missing.SPFMissingListing.access$4(a69);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a71 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a72 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a71);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a73 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a74 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a73);
                        org.spf.data.SPFArrayList a75 = org.spf.mobi.ui.missing.SPFMissingListing.access$3(a74);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a76 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a77 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a76);
                        android.os.Handler a78 = org.spf.mobi.ui.missing.SPFMissingListing.access$2(a77);
                        org.spf.mobi.ui.appeal.custom.SPFPoliceAppealAdapter a79 = new org.spf.mobi.ui.appeal.custom.SPFPoliceAppealAdapter((android.app.Activity)a72, a75, a78);
                        a70.setAdapter((android.widget.ListAdapter)a79);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a80 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a81 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a80);
                        android.widget.ListView a82 = org.spf.mobi.ui.missing.SPFMissingListing.access$4(a81);
                        a82.setFastScrollEnabled(true);
                        break;
                    }
                    case 2: {
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a83 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a84 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a83);
                        android.view.View a85 = a84.findViewById(2131165246);
                        android.widget.TextView dummy4 = (android.widget.TextView)a85;
                        android.widget.TextView a86 = (android.widget.TextView)a85;
                        a86.setText(2131034114);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a87 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a88 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a87);
                        android.widget.ListView a89 = org.spf.mobi.ui.missing.SPFMissingListing.access$4(a88);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a90 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a91 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a90);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a92 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a93 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a92);
                        org.spf.data.SPFArrayList a94 = org.spf.mobi.ui.missing.SPFMissingListing.access$3(a93);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a95 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a96 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a95);
                        android.os.Handler a97 = org.spf.mobi.ui.missing.SPFMissingListing.access$2(a96);
                        org.spf.mobi.ui.news.custom.SPFNewsListAdapter a98 = new org.spf.mobi.ui.news.custom.SPFNewsListAdapter((android.app.Activity)a91, a94, a97);
                        a89.setAdapter((android.widget.ListAdapter)a98);
                        org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a99 = this.this$1;
                        org.spf.mobi.ui.missing.SPFMissingListing a100 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a99);
                        android.widget.ListView a101 = org.spf.mobi.ui.missing.SPFMissingListing.access$4(a100);
                        a101.setFastScrollEnabled(true);
                        break;
                    }
                }
            }
            org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread a102 = this.this$1;
            org.spf.mobi.ui.missing.SPFMissingListing a103 = org.spf.mobi.ui.missing.SPFMissingListing.LaunchSearchThread.access$2(a102);
            a103.removeDialog(0);
        }
    }
}
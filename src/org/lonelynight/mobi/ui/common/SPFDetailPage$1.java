package org.spf.mobi.ui.common;

class 1 extends Thread {
    private static int[] $SWITCH_TABLE$org$spf$utils$Constants$SCREENS;
    final org.spf.mobi.ui.common.SPFDetailPage this$0;
    
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
    
    1(org.spf.mobi.ui.common.SPFDetailPage a)
    {
        this.this$0 = a;
        super();
    }
    
    static org.spf.mobi.ui.common.SPFDetailPage access$1(org.spf.mobi.ui.common.SPFDetailPage.1 a)
    {
        org.spf.mobi.ui.common.SPFDetailPage a0 = a.this$0;
        return a0;
    }
    
    public void run()
    {
        label5: {
            org.xmlpull.v1.XmlPullParserException a = null;
            label4: {
                java.net.MalformedURLException a0 = null;
                label0: {
                    label3: {
                        java.io.IOException a1 = null;
                        label2: {
                            label1: {
                                try
                                {
                                    try
                                    {
                                        try
                                        {
                                            int[] a2 = org.spf.mobi.ui.common.SPFDetailPage.1.$SWITCH_TABLE$org$spf$utils$Constants$SCREENS();
                                            org.spf.mobi.ui.common.SPFDetailPage a3 = this.this$0;
                                            org.spf.utils.Constants.SCREENS a4 = org.spf.mobi.ui.common.SPFDetailPage.access$0(a3);
                                            int i = a4.ordinal();
                                            int i0 = a2[i];
                                            switch(i0){
                                                case 4: {
                                                    org.spf.mobi.ui.common.SPFDetailPage a5 = this.this$0;
                                                    org.spf.mobi.ui.common.SPFDetailPage a6 = this.this$0;
                                                    String s = org.spf.mobi.ui.common.SPFDetailPage.access$1(a6);
                                                    org.spf.utils.parser.SPFXmlPullParser a7 = new org.spf.utils.parser.SPFXmlPullParser(s);
                                                    org.spf.data.SPFArrayList a8 = a7.parseDataForMissing();
                                                    Object a9 = a8.get(0);
                                                    android.os.Parcelable dummy = (android.os.Parcelable)a9;
                                                    org.spf.mobi.ui.common.SPFDetailPage.access$2(a5, (android.os.Parcelable)a9);
                                                    break;
                                                }
                                                case 3: {
                                                    org.spf.mobi.ui.common.SPFDetailPage a10 = this.this$0;
                                                    android.view.View a11 = a10.findViewById(2131165246);
                                                    android.widget.TextView dummy0 = (android.widget.TextView)a11;
                                                    android.widget.TextView a12 = (android.widget.TextView)a11;
                                                    a12.setText(2131034115);
                                                    org.spf.mobi.ui.common.SPFDetailPage a13 = this.this$0;
                                                    org.spf.mobi.ui.common.SPFDetailPage a14 = this.this$0;
                                                    String s0 = org.spf.mobi.ui.common.SPFDetailPage.access$1(a14);
                                                    org.spf.utils.parser.SPFXmlPullParser a15 = new org.spf.utils.parser.SPFXmlPullParser(s0);
                                                    org.spf.data.SPFArrayList a16 = a15.parseDataForPoliceAppeal();
                                                    Object a17 = a16.get(0);
                                                    android.os.Parcelable dummy1 = (android.os.Parcelable)a17;
                                                    org.spf.mobi.ui.common.SPFDetailPage.access$2(a13, (android.os.Parcelable)a17);
                                                    break;
                                                }
                                                case 2: {
                                                    org.spf.mobi.ui.common.SPFDetailPage a18 = this.this$0;
                                                    android.view.View a19 = a18.findViewById(2131165246);
                                                    android.widget.TextView dummy2 = (android.widget.TextView)a19;
                                                    android.widget.TextView a20 = (android.widget.TextView)a19;
                                                    a20.setText(2131034114);
                                                    org.spf.mobi.ui.common.SPFDetailPage a21 = this.this$0;
                                                    org.spf.mobi.ui.common.SPFDetailPage a22 = this.this$0;
                                                    String s1 = org.spf.mobi.ui.common.SPFDetailPage.access$1(a22);
                                                    org.spf.utils.parser.SPFXmlPullParser a23 = new org.spf.utils.parser.SPFXmlPullParser(s1);
                                                    org.spf.data.SPFArrayList a24 = a23.parseDataForNewsCrime();
                                                    Object a25 = a24.get(0);
                                                    android.os.Parcelable dummy3 = (android.os.Parcelable)a25;
                                                    org.spf.mobi.ui.common.SPFDetailPage.access$2(a21, (android.os.Parcelable)a25);
                                                    break;
                                                }
                                            }
                                            org.spf.mobi.ui.common.SPFDetailPage a26 = this.this$0;
                                            a26.update();
                                            break label0;
                                        }
                                        catch(java.net.MalformedURLException a27)
                                        {
                                            a0 = a27;
                                        }
                                    }
                                    catch(org.xmlpull.v1.XmlPullParserException a28)
                                    {
                                        a = a28;
                                        break label1;
                                    }
                                }
                                catch(java.io.IOException a29)
                                {
                                    a1 = a29;
                                    break label2;
                                }
                                boolean b = this.isInterrupted();
                                if(b)
                                {
                                    break label3;
                                }
                                else
                                {
                                    break label0;
                                }
                            }
                            boolean b0 = this.isInterrupted();
                            if(b0)
                            {
                                break label3;
                            }
                            else
                            {
                                break label4;
                            }
                        }
                        boolean b1 = this.isInterrupted();
                        if(!b1)
                        {
                            org.spf.mobi.ui.common.SPFDetailPage a30 = this.this$0;
                            android.os.Handler a31 = org.spf.mobi.ui.common.SPFDetailPage.access$3(a30);
                            org.spf.mobi.ui.common.SPFDetailPage.1.3 a32 = new org.spf.mobi.ui.common.SPFDetailPage.1.3(this);
                            a31.post((Runnable)a32);
                            a1.printStackTrace();
                        }
                    }
                    break label5;
                }
                org.spf.mobi.ui.common.SPFDetailPage a33 = this.this$0;
                android.os.Handler a34 = org.spf.mobi.ui.common.SPFDetailPage.access$3(a33);
                org.spf.mobi.ui.common.SPFDetailPage.1.1 a35 = new org.spf.mobi.ui.common.SPFDetailPage.1.1(this);
                a34.post((Runnable)a35);
                a0.printStackTrace();
                break label5;
            }
            org.spf.mobi.ui.common.SPFDetailPage a36 = this.this$0;
            android.os.Handler a37 = org.spf.mobi.ui.common.SPFDetailPage.access$3(a36);
            org.spf.mobi.ui.common.SPFDetailPage.1.2 a38 = new org.spf.mobi.ui.common.SPFDetailPage.1.2(this);
            a37.post((Runnable)a38);
            a.printStackTrace();
        }
    }
}
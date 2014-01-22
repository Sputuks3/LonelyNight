package org.spf.mobi.ui.news;

class LaunchSearchThread extends Thread {
    private static int[] $SWITCH_TABLE$org$spf$utils$Constants$SCREENS;
    private org.spf.utils.Constants.SCREENS mScreenId;
    final org.spf.mobi.ui.news.SPFNewsListing this$0;
    
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
    
    public LaunchSearchThread(org.spf.mobi.ui.news.SPFNewsListing a, org.spf.utils.Constants.SCREENS a0)
    {
        this.this$0 = a;
        super();
        this.mScreenId = null;
        this.mScreenId = a0;
    }
    
    static org.spf.utils.Constants.SCREENS access$1(org.spf.mobi.ui.news.SPFNewsListing.LaunchSearchThread a)
    {
        org.spf.utils.Constants.SCREENS a0 = a.mScreenId;
        return a0;
    }
    
    static org.spf.mobi.ui.news.SPFNewsListing access$2(org.spf.mobi.ui.news.SPFNewsListing.LaunchSearchThread a)
    {
        org.spf.mobi.ui.news.SPFNewsListing a0 = a.this$0;
        return a0;
    }
    
    public void run()
    {
        label2: {
            org.xmlpull.v1.XmlPullParserException a = null;
            label1: {
                java.net.MalformedURLException a0 = null;
                label0: try
                {
                    try
                    {
                        try
                        {
                            int[] a1 = org.spf.mobi.ui.news.SPFNewsListing.LaunchSearchThread.$SWITCH_TABLE$org$spf$utils$Constants$SCREENS();
                            org.spf.utils.Constants.SCREENS a2 = this.mScreenId;
                            int i = a2.ordinal();
                            int i0 = a1[i];
                            switch(i0){
                                case 5: {
                                    org.spf.mobi.ui.news.SPFNewsListing a3 = this.this$0;
                                    org.spf.mobi.ui.news.SPFNewsListing a4 = this.this$0;
                                    org.spf.utils.parser.SPFXmlPullParser a5 = org.spf.mobi.ui.news.SPFNewsListing.access$0(a4);
                                    org.spf.data.SPFArrayList a6 = a5.parseDataForNppnpc();
                                    org.spf.mobi.ui.news.SPFNewsListing.access$1(a3, a6);
                                    break;
                                }
                                case 4: {
                                    org.spf.mobi.ui.news.SPFNewsListing a7 = this.this$0;
                                    org.spf.mobi.ui.news.SPFNewsListing a8 = this.this$0;
                                    org.spf.utils.parser.SPFXmlPullParser a9 = org.spf.mobi.ui.news.SPFNewsListing.access$0(a8);
                                    org.spf.data.SPFArrayList a10 = a9.parseDataForMissing();
                                    org.spf.mobi.ui.news.SPFNewsListing.access$1(a7, a10);
                                    break;
                                }
                                case 3: {
                                    org.spf.mobi.ui.news.SPFNewsListing a11 = this.this$0;
                                    org.spf.mobi.ui.news.SPFNewsListing a12 = this.this$0;
                                    org.spf.utils.parser.SPFXmlPullParser a13 = org.spf.mobi.ui.news.SPFNewsListing.access$0(a12);
                                    org.spf.data.SPFArrayList a14 = a13.parseDataForPoliceAppeal();
                                    org.spf.mobi.ui.news.SPFNewsListing.access$1(a11, a14);
                                    break;
                                }
                                case 2: {
                                    org.spf.mobi.ui.news.SPFNewsListing a15 = this.this$0;
                                    org.spf.mobi.ui.news.SPFNewsListing a16 = this.this$0;
                                    org.spf.utils.parser.SPFXmlPullParser a17 = org.spf.mobi.ui.news.SPFNewsListing.access$0(a16);
                                    org.spf.data.SPFArrayList a18 = a17.parseDataForNewsCrime();
                                    org.spf.mobi.ui.news.SPFNewsListing.access$1(a15, a18);
                                    android.util.Log.d("SPF", "LaunchSearchThread News:");
                                    StringBuilder a19 = new StringBuilder("arrayList News:");
                                    org.spf.mobi.ui.news.SPFNewsListing a20 = this.this$0;
                                    org.spf.data.SPFArrayList a21 = org.spf.mobi.ui.news.SPFNewsListing.access$2(a20);
                                    int i1 = a21.size();
                                    StringBuilder a22 = a19.append(i1);
                                    String s = a22.toString();
                                    android.util.Log.d("SPF", s);
                                    break;
                                }
                            }
                            org.spf.mobi.ui.news.SPFNewsListing a23 = this.this$0;
                            android.os.Handler a24 = org.spf.mobi.ui.news.SPFNewsListing.access$3(a23);
                            org.spf.mobi.ui.news.SPFNewsListing.LaunchSearchThread.1 a25 = new org.spf.mobi.ui.news.SPFNewsListing.LaunchSearchThread.1(this);
                            a24.post((Runnable)a25);
                        }
                        catch(java.net.MalformedURLException a26)
                        {
                            a0 = a26;
                            break label0;
                        }
                    }
                    catch(org.xmlpull.v1.XmlPullParserException a27)
                    {
                        a = a27;
                        break label1;
                    }
                    break label2;
                }
                catch(java.io.IOException a28)
                {
                    org.spf.utils.Constants.ERROR a29 = org.spf.utils.Constants.ERROR.NO_CONNECTION;
                    org.spf.mobi.ui.news.SPFNewsListing a30 = this.this$0;
                    org.spf.mobi.ui.news.SPFNewsListing a31 = this.this$0;
                    android.os.Handler a32 = org.spf.mobi.ui.news.SPFNewsListing.access$3(a31);
                    org.spf.utils.Utils.toastError(a29, (android.content.Context)a30, a32);
                    a28.printStackTrace();
                    org.spf.mobi.ui.news.SPFNewsListing a33 = this.this$0;
                    org.spf.mobi.ui.news.SPFNewsListing.access$5(a33);
                    break label2;
                }
                org.spf.utils.Constants.ERROR a34 = org.spf.utils.Constants.ERROR.NO_CONNECTION;
                org.spf.mobi.ui.news.SPFNewsListing a35 = this.this$0;
                org.spf.mobi.ui.news.SPFNewsListing a36 = this.this$0;
                android.os.Handler a37 = org.spf.mobi.ui.news.SPFNewsListing.access$3(a36);
                org.spf.utils.Utils.toastError(a34, (android.content.Context)a35, a37);
                a0.printStackTrace();
                org.spf.mobi.ui.news.SPFNewsListing a38 = this.this$0;
                org.spf.mobi.ui.news.SPFNewsListing.access$5(a38);
                break label2;
            }
            org.spf.utils.Constants.ERROR a39 = org.spf.utils.Constants.ERROR.NO_CONNECTION;
            org.spf.mobi.ui.news.SPFNewsListing a40 = this.this$0;
            org.spf.mobi.ui.news.SPFNewsListing a41 = this.this$0;
            android.os.Handler a42 = org.spf.mobi.ui.news.SPFNewsListing.access$3(a41);
            org.spf.utils.Utils.toastError(a39, (android.content.Context)a40, a42);
            a.printStackTrace();
            org.spf.mobi.ui.news.SPFNewsListing a43 = this.this$0;
            org.spf.mobi.ui.news.SPFNewsListing.access$5(a43);
        }
    }
}
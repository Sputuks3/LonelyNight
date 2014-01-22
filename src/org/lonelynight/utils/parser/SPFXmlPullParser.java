package org.spf.utils.parser;

public class SPFXmlPullParser implements org.spf.utils.Constants {
    private java.net.HttpURLConnection connection;
    private String mUrl;
    
    public SPFXmlPullParser(String s)
    {
        super();
        this.mUrl = s;
        boolean b = org.spf.utils.Utils.isDebugMode((android.app.Activity)null);
        if(b)
        {
            String s0 = String.valueOf((Object)s);
            StringBuilder a = new StringBuilder(s0);
            StringBuilder a0 = a.append(" #$%#$%^$URL#@$%#$%^");
            String s1 = a0.toString();
            android.util.Log.i("LOG XML URL", s1);
        }
    }
    
    private org.spf.data.SPFBanner getBanner(org.xmlpull.v1.XmlPullParser a)
    {
        org.spf.data.SPFBanner a0 = null;
        int i = a.getEventType();
        Object a1 = a;
        org.spf.data.SPFBanner a2 = null;
        int i0 = i;
        while(true)
        {
            org.spf.data.SPFBanner a3 = a2;
            if(i0 != 1)
            {
                org.spf.data.SPFBanner a4 = null;
                int i1 = 0;
                org.spf.data.SPFBanner a5 = null;
                org.spf.data.SPFBanner a6 = a3;
                org.spf.data.SPFBanner a7 = a6;
                org.spf.data.SPFBanner a8 = a6;
                if(i0 != 2)
                {
                    a4 = a8;
                    i1 = i0;
                }
                else
                {
                    org.spf.data.SPFBanner a9 = a7;
                    String s = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFBanner a10 = a9;
                    boolean b = "BANNER".equalsIgnoreCase(s);
                    org.spf.data.SPFBanner a11 = a10;
                    org.spf.data.SPFBanner a12 = a11;
                    if(!b)
                    {
                        org.spf.data.SPFBanner a13 = a12;
                        boolean b0 = "IMAGEURL".equalsIgnoreCase(s);
                        org.spf.data.SPFBanner a14 = a13;
                        org.spf.data.SPFBanner a15 = a14;
                        org.spf.data.SPFBanner a16 = a14;
                        if(!b0)
                        {
                            org.spf.data.SPFBanner a17 = a16;
                            boolean b1 = "THUMBURL".equalsIgnoreCase(s);
                            org.spf.data.SPFBanner a18 = a17;
                            org.spf.data.SPFBanner a19 = a18;
                            org.spf.data.SPFBanner a20 = a18;
                            if(!b1)
                            {
                                org.spf.data.SPFBanner a21 = a20;
                                boolean b2 = "STATUS".equalsIgnoreCase(s);
                                org.spf.data.SPFBanner a22 = a21;
                                org.spf.data.SPFBanner a23 = a22;
                                org.spf.data.SPFBanner a24 = a22;
                                if(!b2)
                                {
                                    org.spf.data.SPFBanner a25 = a24;
                                    boolean b3 = "TITLE".equalsIgnoreCase(s);
                                    org.spf.data.SPFBanner a26 = a25;
                                    org.spf.data.SPFBanner a27 = a26;
                                    org.spf.data.SPFBanner a28 = a26;
                                    if(!b3)
                                    {
                                        a4 = a28;
                                        i1 = 2;
                                    }
                                    else
                                    {
                                        org.spf.data.SPFBanner a29 = a27;
                                        org.spf.data.SPFBanner a30 = a29;
                                        org.spf.data.SPFBanner a31 = a29;
                                        if(a29 == null)
                                        {
                                            a4 = a31;
                                            i1 = 2;
                                        }
                                        else
                                        {
                                            org.spf.data.SPFBanner a32 = a30;
                                            String s0 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                            org.spf.data.SPFBanner a33 = a32;
                                            a32.setTitle(s0);
                                            org.spf.data.SPFBanner a34 = a33;
                                            a4 = a34;
                                            i1 = 2;
                                        }
                                    }
                                }
                                else
                                {
                                    org.spf.data.SPFBanner a35 = a23;
                                    org.spf.data.SPFBanner a36 = a35;
                                    org.spf.data.SPFBanner a37 = a35;
                                    if(a35 == null)
                                    {
                                        a4 = a37;
                                        i1 = 2;
                                    }
                                    else
                                    {
                                        org.spf.data.SPFBanner a38 = a36;
                                        String s1 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                        org.spf.data.SPFBanner a39 = a38;
                                        a38.setStatus(s1);
                                        org.spf.data.SPFBanner a40 = a39;
                                        a4 = a40;
                                        i1 = 2;
                                    }
                                }
                            }
                            else
                            {
                                org.spf.data.SPFBanner a41 = a19;
                                org.spf.data.SPFBanner a42 = a41;
                                org.spf.data.SPFBanner a43 = a41;
                                if(a41 == null)
                                {
                                    a4 = a43;
                                    i1 = 2;
                                }
                                else
                                {
                                    org.spf.data.SPFBanner a44 = a42;
                                    String s2 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                    org.spf.data.SPFBanner a45 = a44;
                                    a44.setThumbUrl(s2);
                                    org.spf.data.SPFBanner a46 = a45;
                                    a4 = a46;
                                    i1 = 2;
                                }
                            }
                        }
                        else
                        {
                            org.spf.data.SPFBanner a47 = a15;
                            org.spf.data.SPFBanner a48 = a47;
                            org.spf.data.SPFBanner a49 = a47;
                            if(a47 == null)
                            {
                                a4 = a49;
                                i1 = 2;
                            }
                            else
                            {
                                org.spf.data.SPFBanner a50 = a48;
                                String s3 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                org.spf.data.SPFBanner a51 = a50;
                                a50.setImageUrl(s3);
                                org.spf.data.SPFBanner a52 = a51;
                                a4 = a52;
                                i1 = 2;
                            }
                        }
                    }
                    else
                    {
                        org.spf.data.SPFBanner a53 = new org.spf.data.SPFBanner();
                        String s4 = ((org.xmlpull.v1.XmlPullParser)a1).getAttributeValue(0);
                        a53.setId(s4);
                        a4 = a53;
                        i1 = 2;
                    }
                }
                label0: {
                    org.spf.data.SPFBanner a54 = null;
                    org.spf.data.SPFBanner a55 = a4;
                    org.spf.data.SPFBanner a56 = a4;
                    if(i1 != 3)
                    {
                        a5 = a56;
                        break label0;
                    }
                    else
                    {
                        a54 = a55;
                    }
                    String s5 = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFBanner a57 = a54;
                    boolean b4 = "BANNER".equalsIgnoreCase(s5);
                    org.spf.data.SPFBanner a58 = a57;
                    org.spf.data.SPFBanner a59 = a58;
                    if(b4)
                    {
                        a0 = a58;
                        break;
                    }
                    else
                    {
                        a5 = a59;
                    }
                }
                int i2 = ((org.xmlpull.v1.XmlPullParser)a1).next();
                org.spf.data.SPFBanner a60 = a5;
                a2 = a60;
                i0 = i2;
            }
            else
            {
                a0 = a2;
                break;
            }
        }
        return a0;
    }
    
    private org.spf.data.SPFBannerPath getBannerPath(org.xmlpull.v1.XmlPullParser a)
    {
        org.spf.data.SPFBannerPath a0 = null;
        int i = a.getEventType();
        Object a1 = a;
        org.spf.data.SPFBannerPath a2 = null;
        int i0 = i;
        while(true)
        {
            org.spf.data.SPFBannerPath a3 = a2;
            if(i0 != 1)
            {
                org.spf.data.SPFBannerPath a4 = null;
                int i1 = 0;
                org.spf.data.SPFBannerPath a5 = null;
                org.spf.data.SPFBannerPath a6 = a3;
                org.spf.data.SPFBannerPath a7 = a6;
                org.spf.data.SPFBannerPath a8 = a6;
                if(i0 != 2)
                {
                    a4 = a8;
                    i1 = i0;
                }
                else
                {
                    org.spf.data.SPFBannerPath a9 = a7;
                    String s = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFBannerPath a10 = a9;
                    boolean b = "BANNER_IMAGE_PATH".equalsIgnoreCase(s);
                    org.spf.data.SPFBannerPath a11 = a10;
                    org.spf.data.SPFBannerPath a12 = a11;
                    if(!b)
                    {
                        org.spf.data.SPFBannerPath a13 = a12;
                        boolean b0 = "FULL".equalsIgnoreCase(s);
                        org.spf.data.SPFBannerPath a14 = a13;
                        org.spf.data.SPFBannerPath a15 = a14;
                        org.spf.data.SPFBannerPath a16 = a14;
                        if(!b0)
                        {
                            org.spf.data.SPFBannerPath a17 = a16;
                            boolean b1 = "THUMB".equalsIgnoreCase(s);
                            org.spf.data.SPFBannerPath a18 = a17;
                            org.spf.data.SPFBannerPath a19 = a18;
                            org.spf.data.SPFBannerPath a20 = a18;
                            if(!b1)
                            {
                                a4 = a20;
                                i1 = 2;
                            }
                            else
                            {
                                org.spf.data.SPFBannerPath a21 = a19;
                                org.spf.data.SPFBannerPath a22 = a21;
                                org.spf.data.SPFBannerPath a23 = a21;
                                if(a21 == null)
                                {
                                    a4 = a23;
                                    i1 = 2;
                                }
                                else
                                {
                                    org.spf.data.SPFBannerPath a24 = a22;
                                    String s0 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                    org.spf.data.SPFBannerPath a25 = a24;
                                    a24.setThumbPath(s0);
                                    org.spf.data.SPFBannerPath a26 = a25;
                                    a4 = a26;
                                    i1 = 2;
                                }
                            }
                        }
                        else
                        {
                            org.spf.data.SPFBannerPath a27 = a15;
                            org.spf.data.SPFBannerPath a28 = a27;
                            org.spf.data.SPFBannerPath a29 = a27;
                            if(a27 == null)
                            {
                                a4 = a29;
                                i1 = 2;
                            }
                            else
                            {
                                org.spf.data.SPFBannerPath a30 = a28;
                                String s1 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                org.spf.data.SPFBannerPath a31 = a30;
                                a30.setFullPath(s1);
                                org.spf.data.SPFBannerPath a32 = a31;
                                a4 = a32;
                                i1 = 2;
                            }
                        }
                    }
                    else
                    {
                        org.spf.data.SPFBannerPath a33 = new org.spf.data.SPFBannerPath();
                        a4 = a33;
                        i1 = 2;
                    }
                }
                label0: {
                    org.spf.data.SPFBannerPath a34 = null;
                    org.spf.data.SPFBannerPath a35 = a4;
                    org.spf.data.SPFBannerPath a36 = a4;
                    if(i1 != 3)
                    {
                        a5 = a36;
                        break label0;
                    }
                    else
                    {
                        a34 = a35;
                    }
                    String s2 = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFBannerPath a37 = a34;
                    boolean b2 = "BANNER_IMAGE_PATH".equalsIgnoreCase(s2);
                    org.spf.data.SPFBannerPath a38 = a37;
                    org.spf.data.SPFBannerPath a39 = a38;
                    if(b2)
                    {
                        a0 = a38;
                        break;
                    }
                    else
                    {
                        a5 = a39;
                    }
                }
                int i2 = ((org.xmlpull.v1.XmlPullParser)a1).next();
                org.spf.data.SPFBannerPath a40 = a5;
                a2 = a40;
                i0 = i2;
            }
            else
            {
                a0 = a2;
                break;
            }
        }
        return a0;
    }
    
    private org.spf.data.SPFCategory getCategory(org.xmlpull.v1.XmlPullParser a)
    {
        org.spf.data.SPFCategory a0 = null;
        int i = a.getEventType();
        Object a1 = a;
        org.spf.data.SPFCategory a2 = null;
        int i0 = i;
        while(true)
        {
            org.spf.data.SPFCategory a3 = a2;
            if(i0 != 1)
            {
                org.spf.data.SPFCategory a4 = null;
                int i1 = 0;
                org.spf.data.SPFCategory a5 = null;
                org.spf.data.SPFCategory a6 = a3;
                org.spf.data.SPFCategory a7 = a6;
                org.spf.data.SPFCategory a8 = a6;
                if(i0 != 2)
                {
                    a4 = a8;
                    i1 = i0;
                }
                else
                {
                    org.spf.data.SPFCategory a9 = a7;
                    String s = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFCategory a10 = a9;
                    boolean b = "CATEGORY".equalsIgnoreCase(s);
                    org.spf.data.SPFCategory a11 = a10;
                    org.spf.data.SPFCategory a12 = a11;
                    if(!b)
                    {
                        org.spf.data.SPFCategory a13 = a12;
                        boolean b0 = "NAME".equalsIgnoreCase(s);
                        org.spf.data.SPFCategory a14 = a13;
                        org.spf.data.SPFCategory a15 = a14;
                        org.spf.data.SPFCategory a16 = a14;
                        if(!b0)
                        {
                            org.spf.data.SPFCategory a17 = a16;
                            boolean b1 = "CATEGEORY_TYPE".equalsIgnoreCase(s);
                            org.spf.data.SPFCategory a18 = a17;
                            org.spf.data.SPFCategory a19 = a18;
                            org.spf.data.SPFCategory a20 = a18;
                            if(!b1)
                            {
                                org.spf.data.SPFCategory a21 = a20;
                                boolean b2 = "DESCRIPTION".equalsIgnoreCase(s);
                                org.spf.data.SPFCategory a22 = a21;
                                org.spf.data.SPFCategory a23 = a22;
                                org.spf.data.SPFCategory a24 = a22;
                                if(!b2)
                                {
                                    org.spf.data.SPFCategory a25 = a24;
                                    boolean b3 = "STATUS".equalsIgnoreCase(s);
                                    org.spf.data.SPFCategory a26 = a25;
                                    org.spf.data.SPFCategory a27 = a26;
                                    org.spf.data.SPFCategory a28 = a26;
                                    if(!b3)
                                    {
                                        a4 = a28;
                                        i1 = 2;
                                    }
                                    else
                                    {
                                        org.spf.data.SPFCategory a29 = a27;
                                        org.spf.data.SPFCategory a30 = a29;
                                        org.spf.data.SPFCategory a31 = a29;
                                        if(a29 == null)
                                        {
                                            a4 = a31;
                                            i1 = 2;
                                        }
                                        else
                                        {
                                            org.spf.data.SPFCategory a32 = a30;
                                            String s0 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                            org.spf.data.SPFCategory a33 = a32;
                                            a32.setStatus(s0);
                                            org.spf.data.SPFCategory a34 = a33;
                                            a4 = a34;
                                            i1 = 2;
                                        }
                                    }
                                }
                                else
                                {
                                    org.spf.data.SPFCategory a35 = a23;
                                    org.spf.data.SPFCategory a36 = a35;
                                    org.spf.data.SPFCategory a37 = a35;
                                    if(a35 == null)
                                    {
                                        a4 = a37;
                                        i1 = 2;
                                    }
                                    else
                                    {
                                        org.spf.data.SPFCategory a38 = a36;
                                        String s1 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                        org.spf.data.SPFCategory a39 = a38;
                                        a38.setCategoryDescription(s1);
                                        org.spf.data.SPFCategory a40 = a39;
                                        a4 = a40;
                                        i1 = 2;
                                    }
                                }
                            }
                            else
                            {
                                org.spf.data.SPFCategory a41 = a19;
                                org.spf.data.SPFCategory a42 = a41;
                                org.spf.data.SPFCategory a43 = a41;
                                if(a41 == null)
                                {
                                    a4 = a43;
                                    i1 = 2;
                                }
                                else
                                {
                                    org.spf.data.SPFCategory a44 = a42;
                                    String s2 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                    org.spf.data.SPFCategory a45 = a44;
                                    a44.setCategoryType(s2);
                                    org.spf.data.SPFCategory a46 = a45;
                                    a4 = a46;
                                    i1 = 2;
                                }
                            }
                        }
                        else
                        {
                            org.spf.data.SPFCategory a47 = a15;
                            org.spf.data.SPFCategory a48 = a47;
                            org.spf.data.SPFCategory a49 = a47;
                            if(a47 == null)
                            {
                                a4 = a49;
                                i1 = 2;
                            }
                            else
                            {
                                org.spf.data.SPFCategory a50 = a48;
                                String s3 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                org.spf.data.SPFCategory a51 = a50;
                                a50.setCategoryName(s3);
                                org.spf.data.SPFCategory a52 = a51;
                                a4 = a52;
                                i1 = 2;
                            }
                        }
                    }
                    else
                    {
                        org.spf.data.SPFCategory a53 = new org.spf.data.SPFCategory();
                        String s4 = ((org.xmlpull.v1.XmlPullParser)a1).getAttributeValue(0);
                        a53.setId(s4);
                        a4 = a53;
                        i1 = 2;
                    }
                }
                label0: {
                    org.spf.data.SPFCategory a54 = null;
                    org.spf.data.SPFCategory a55 = a4;
                    org.spf.data.SPFCategory a56 = a4;
                    if(i1 != 3)
                    {
                        a5 = a56;
                        break label0;
                    }
                    else
                    {
                        a54 = a55;
                    }
                    String s5 = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFCategory a57 = a54;
                    boolean b4 = "CATEGORY".equalsIgnoreCase(s5);
                    org.spf.data.SPFCategory a58 = a57;
                    org.spf.data.SPFCategory a59 = a58;
                    if(b4)
                    {
                        a0 = a58;
                        break;
                    }
                    else
                    {
                        a5 = a59;
                    }
                }
                int i2 = ((org.xmlpull.v1.XmlPullParser)a1).next();
                org.spf.data.SPFCategory a60 = a5;
                a2 = a60;
                i0 = i2;
            }
            else
            {
                a0 = a2;
                break;
            }
        }
        return a0;
    }
    
    private org.spf.data.SPFCluster getCluster(org.xmlpull.v1.XmlPullParser a)
    {
        org.spf.data.SPFCluster a0 = null;
        int i = a.getEventType();
        Object a1 = a;
        org.spf.data.SPFCluster a2 = null;
        int i0 = i;
        while(true)
        {
            org.spf.data.SPFCluster a3 = a2;
            if(i0 != 1)
            {
                org.spf.data.SPFCluster a4 = null;
                int i1 = 0;
                org.spf.data.SPFCluster a5 = null;
                org.spf.data.SPFCluster a6 = a3;
                org.spf.data.SPFCluster a7 = a6;
                org.spf.data.SPFCluster a8 = a6;
                if(i0 != 2)
                {
                    a4 = a8;
                    i1 = i0;
                }
                else
                {
                    org.spf.data.SPFCluster a9 = a7;
                    String s = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFCluster a10 = a9;
                    boolean b = "CLUSTER".equalsIgnoreCase(s);
                    org.spf.data.SPFCluster a11 = a10;
                    org.spf.data.SPFCluster a12 = a11;
                    if(!b)
                    {
                        org.spf.data.SPFCluster a13 = a12;
                        boolean b0 = "CLUSTER_NAME".equalsIgnoreCase(s);
                        org.spf.data.SPFCluster a14 = a13;
                        org.spf.data.SPFCluster a15 = a14;
                        org.spf.data.SPFCluster a16 = a14;
                        if(!b0)
                        {
                            org.spf.data.SPFCluster a17 = a16;
                            boolean b1 = "CLUSTERID".equalsIgnoreCase(s);
                            org.spf.data.SPFCluster a18 = a17;
                            org.spf.data.SPFCluster a19 = a18;
                            org.spf.data.SPFCluster a20 = a18;
                            if(!b1)
                            {
                                org.spf.data.SPFCluster a21 = a20;
                                boolean b2 = "STATUS".equalsIgnoreCase(s);
                                org.spf.data.SPFCluster a22 = a21;
                                org.spf.data.SPFCluster a23 = a22;
                                org.spf.data.SPFCluster a24 = a22;
                                if(!b2)
                                {
                                    a4 = a24;
                                    i1 = 2;
                                }
                                else
                                {
                                    org.spf.data.SPFCluster a25 = a23;
                                    org.spf.data.SPFCluster a26 = a25;
                                    org.spf.data.SPFCluster a27 = a25;
                                    if(a25 == null)
                                    {
                                        a4 = a27;
                                        i1 = 2;
                                    }
                                    else
                                    {
                                        org.spf.data.SPFCluster a28 = a26;
                                        String s0 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                        org.spf.data.SPFCluster a29 = a28;
                                        a28.setStatus(s0);
                                        org.spf.data.SPFCluster a30 = a29;
                                        a4 = a30;
                                        i1 = 2;
                                    }
                                }
                            }
                            else
                            {
                                org.spf.data.SPFCluster a31 = a19;
                                org.spf.data.SPFCluster a32 = a31;
                                org.spf.data.SPFCluster a33 = a31;
                                if(a31 == null)
                                {
                                    a4 = a33;
                                    i1 = 2;
                                }
                                else
                                {
                                    org.spf.data.SPFCluster a34 = a32;
                                    String s1 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                    org.spf.data.SPFCluster a35 = a34;
                                    a34.setClusterId(s1);
                                    org.spf.data.SPFCluster a36 = a35;
                                    a4 = a36;
                                    i1 = 2;
                                }
                            }
                        }
                        else
                        {
                            org.spf.data.SPFCluster a37 = a15;
                            org.spf.data.SPFCluster a38 = a37;
                            org.spf.data.SPFCluster a39 = a37;
                            if(a37 == null)
                            {
                                a4 = a39;
                                i1 = 2;
                            }
                            else
                            {
                                org.spf.data.SPFCluster a40 = a38;
                                String s2 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                org.spf.data.SPFCluster a41 = a40;
                                a40.setClusterName(s2);
                                org.spf.data.SPFCluster a42 = a41;
                                a4 = a42;
                                i1 = 2;
                            }
                        }
                    }
                    else
                    {
                        org.spf.data.SPFCluster a43 = new org.spf.data.SPFCluster();
                        String s3 = ((org.xmlpull.v1.XmlPullParser)a1).getAttributeValue(0);
                        a43.setId(s3);
                        a4 = a43;
                        i1 = 2;
                    }
                }
                label0: {
                    org.spf.data.SPFCluster a44 = null;
                    org.spf.data.SPFCluster a45 = a4;
                    org.spf.data.SPFCluster a46 = a4;
                    if(i1 != 3)
                    {
                        a5 = a46;
                        break label0;
                    }
                    else
                    {
                        a44 = a45;
                    }
                    String s4 = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFCluster a47 = a44;
                    boolean b3 = "CLUSTER".equalsIgnoreCase(s4);
                    org.spf.data.SPFCluster a48 = a47;
                    org.spf.data.SPFCluster a49 = a48;
                    if(b3)
                    {
                        a0 = a48;
                        break;
                    }
                    else
                    {
                        a5 = a49;
                    }
                }
                int i2 = ((org.xmlpull.v1.XmlPullParser)a1).next();
                org.spf.data.SPFCluster a50 = a5;
                a2 = a50;
                i0 = i2;
            }
            else
            {
                a0 = a2;
                break;
            }
        }
        return a0;
    }
    
    private org.spf.data.SPFFooter getFooter(org.xmlpull.v1.XmlPullParser a)
    {
        org.spf.data.SPFFooter a0 = null;
        int i = a.getEventType();
        Object a1 = a;
        int i0 = i;
        org.spf.data.SPFFooter a2 = null;
        while(true)
        {
            org.spf.data.SPFFooter a3 = a2;
            if(i0 != 1)
            {
                int i1 = 0;
                org.spf.data.SPFFooter a4 = null;
                org.spf.data.SPFFooter a5 = null;
                org.spf.data.SPFFooter a6 = a3;
                org.spf.data.SPFFooter a7 = a6;
                org.spf.data.SPFFooter a8 = a6;
                if(i0 != 2)
                {
                    i1 = i0;
                    a4 = a8;
                }
                else
                {
                    org.spf.data.SPFFooter a9 = a7;
                    String s = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFFooter a10 = a9;
                    boolean b = "FOOTER_IMAGE".equalsIgnoreCase(s);
                    org.spf.data.SPFFooter a11 = a10;
                    org.spf.data.SPFFooter a12 = a11;
                    if(!b)
                    {
                        org.spf.data.SPFFooter a13 = a12;
                        boolean b0 = "FOOTER_DESCRIPTION".equalsIgnoreCase(s);
                        org.spf.data.SPFFooter a14 = a13;
                        org.spf.data.SPFFooter a15 = a14;
                        org.spf.data.SPFFooter a16 = a14;
                        if(!b0)
                        {
                            org.spf.data.SPFFooter a17 = a16;
                            boolean b1 = "ORIGINAL_NAME".equalsIgnoreCase(s);
                            org.spf.data.SPFFooter a18 = a17;
                            org.spf.data.SPFFooter a19 = a18;
                            org.spf.data.SPFFooter a20 = a18;
                            if(!b1)
                            {
                                org.spf.data.SPFFooter a21 = a20;
                                boolean b2 = "STATUS".equalsIgnoreCase(s);
                                org.spf.data.SPFFooter a22 = a21;
                                org.spf.data.SPFFooter a23 = a22;
                                org.spf.data.SPFFooter a24 = a22;
                                if(!b2)
                                {
                                    org.spf.data.SPFFooter a25 = a24;
                                    boolean b3 = "URL".equalsIgnoreCase(s);
                                    org.spf.data.SPFFooter a26 = a25;
                                    org.spf.data.SPFFooter a27 = a26;
                                    org.spf.data.SPFFooter a28 = a26;
                                    if(!b3)
                                    {
                                        i1 = 2;
                                        a4 = a28;
                                    }
                                    else
                                    {
                                        org.spf.data.SPFFooter a29 = a27;
                                        org.spf.data.SPFFooter a30 = a29;
                                        org.spf.data.SPFFooter a31 = a29;
                                        if(a29 == null)
                                        {
                                            i1 = 2;
                                            a4 = a31;
                                        }
                                        else
                                        {
                                            org.spf.data.SPFFooter a32 = a30;
                                            String s0 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                            org.spf.data.SPFFooter a33 = a32;
                                            a32.setUrl(s0);
                                            org.spf.data.SPFFooter a34 = a33;
                                            i1 = 2;
                                            a4 = a34;
                                        }
                                    }
                                }
                                else
                                {
                                    org.spf.data.SPFFooter a35 = a23;
                                    org.spf.data.SPFFooter a36 = a35;
                                    org.spf.data.SPFFooter a37 = a35;
                                    if(a35 == null)
                                    {
                                        i1 = 2;
                                        a4 = a37;
                                    }
                                    else
                                    {
                                        org.spf.data.SPFFooter a38 = a36;
                                        String s1 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                        org.spf.data.SPFFooter a39 = a38;
                                        a38.setStatus(s1);
                                        org.spf.data.SPFFooter a40 = a39;
                                        i1 = 2;
                                        a4 = a40;
                                    }
                                }
                            }
                            else
                            {
                                org.spf.data.SPFFooter a41 = a19;
                                org.spf.data.SPFFooter a42 = a41;
                                org.spf.data.SPFFooter a43 = a41;
                                if(a41 == null)
                                {
                                    i1 = 2;
                                    a4 = a43;
                                }
                                else
                                {
                                    org.spf.data.SPFFooter a44 = a42;
                                    String s2 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                    org.spf.data.SPFFooter a45 = a44;
                                    a44.setName(s2);
                                    org.spf.data.SPFFooter a46 = a45;
                                    i1 = 2;
                                    a4 = a46;
                                }
                            }
                        }
                        else
                        {
                            org.spf.data.SPFFooter a47 = a15;
                            org.spf.data.SPFFooter a48 = a47;
                            org.spf.data.SPFFooter a49 = a47;
                            if(a47 == null)
                            {
                                i1 = 2;
                                a4 = a49;
                            }
                            else
                            {
                                org.spf.data.SPFFooter a50 = a48;
                                String s3 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                org.spf.data.SPFFooter a51 = a50;
                                a50.setDescription(s3);
                                org.spf.data.SPFFooter a52 = a51;
                                i1 = 2;
                                a4 = a52;
                            }
                        }
                    }
                    else
                    {
                        org.spf.data.SPFFooter a53 = new org.spf.data.SPFFooter();
                        String s4 = ((org.xmlpull.v1.XmlPullParser)a1).getAttributeValue(0);
                        a53.setId(s4);
                        i1 = 2;
                        a4 = a53;
                    }
                }
                label0: {
                    org.spf.data.SPFFooter a54 = null;
                    org.spf.data.SPFFooter a55 = a4;
                    org.spf.data.SPFFooter a56 = a4;
                    if(i1 != 3)
                    {
                        a5 = a56;
                        break label0;
                    }
                    else
                    {
                        a54 = a55;
                    }
                    String s5 = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFFooter a57 = a54;
                    boolean b4 = "FOOTER_IMAGE".equalsIgnoreCase(s5);
                    org.spf.data.SPFFooter a58 = a57;
                    org.spf.data.SPFFooter a59 = a58;
                    if(b4)
                    {
                        a0 = a58;
                        break;
                    }
                    else
                    {
                        a5 = a59;
                    }
                }
                int i2 = ((org.xmlpull.v1.XmlPullParser)a1).next();
                org.spf.data.SPFFooter a60 = a5;
                i0 = i2;
                a2 = a60;
            }
            else
            {
                a0 = a2;
                break;
            }
        }
        return a0;
    }
    
    private org.spf.data.SPFImagePath getImagePath(org.xmlpull.v1.XmlPullParser a)
    {
        org.spf.data.SPFImagePath a0 = null;
        int i = a.getEventType();
        Object a1 = a;
        org.spf.data.SPFImagePath a2 = null;
        int i0 = i;
        while(true)
        {
            org.spf.data.SPFImagePath a3 = a2;
            if(i0 != 1)
            {
                org.spf.data.SPFImagePath a4 = null;
                int i1 = 0;
                org.spf.data.SPFImagePath a5 = null;
                org.spf.data.SPFImagePath a6 = a3;
                org.spf.data.SPFImagePath a7 = a6;
                org.spf.data.SPFImagePath a8 = a6;
                if(i0 != 2)
                {
                    a4 = a8;
                    i1 = i0;
                }
                else
                {
                    org.spf.data.SPFImagePath a9 = a7;
                    String s = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFImagePath a10 = a9;
                    boolean b = "IMAGE_PATH".equalsIgnoreCase(s);
                    org.spf.data.SPFImagePath a11 = a10;
                    org.spf.data.SPFImagePath a12 = a11;
                    if(!b)
                    {
                        org.spf.data.SPFImagePath a13 = a12;
                        boolean b0 = "THUMB".equalsIgnoreCase(s);
                        org.spf.data.SPFImagePath a14 = a13;
                        org.spf.data.SPFImagePath a15 = a14;
                        org.spf.data.SPFImagePath a16 = a14;
                        if(!b0)
                        {
                            org.spf.data.SPFImagePath a17 = a16;
                            boolean b1 = "FULL".equalsIgnoreCase(s);
                            org.spf.data.SPFImagePath a18 = a17;
                            org.spf.data.SPFImagePath a19 = a18;
                            org.spf.data.SPFImagePath a20 = a18;
                            if(!b1)
                            {
                                org.spf.data.SPFImagePath a21 = a20;
                                boolean b2 = "FOOTER".equalsIgnoreCase(s);
                                org.spf.data.SPFImagePath a22 = a21;
                                org.spf.data.SPFImagePath a23 = a22;
                                org.spf.data.SPFImagePath a24 = a22;
                                if(!b2)
                                {
                                    a4 = a24;
                                    i1 = 2;
                                }
                                else
                                {
                                    org.spf.data.SPFImagePath a25 = a23;
                                    org.spf.data.SPFImagePath a26 = a25;
                                    org.spf.data.SPFImagePath a27 = a25;
                                    if(a25 == null)
                                    {
                                        a4 = a27;
                                        i1 = 2;
                                    }
                                    else
                                    {
                                        org.spf.data.SPFImagePath a28 = a26;
                                        String s0 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                        org.spf.data.SPFImagePath a29 = a28;
                                        a28.setFooter(s0);
                                        org.spf.data.SPFImagePath a30 = a29;
                                        a4 = a30;
                                        i1 = 2;
                                    }
                                }
                            }
                            else
                            {
                                org.spf.data.SPFImagePath a31 = a19;
                                org.spf.data.SPFImagePath a32 = a31;
                                org.spf.data.SPFImagePath a33 = a31;
                                if(a31 == null)
                                {
                                    a4 = a33;
                                    i1 = 2;
                                }
                                else
                                {
                                    org.spf.data.SPFImagePath a34 = a32;
                                    String s1 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                    org.spf.data.SPFImagePath a35 = a34;
                                    a34.setFull(s1);
                                    org.spf.data.SPFImagePath a36 = a35;
                                    a4 = a36;
                                    i1 = 2;
                                }
                            }
                        }
                        else
                        {
                            org.spf.data.SPFImagePath a37 = a15;
                            org.spf.data.SPFImagePath a38 = a37;
                            org.spf.data.SPFImagePath a39 = a37;
                            if(a37 == null)
                            {
                                a4 = a39;
                                i1 = 2;
                            }
                            else
                            {
                                org.spf.data.SPFImagePath a40 = a38;
                                String s2 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                org.spf.data.SPFImagePath a41 = a40;
                                a40.setThumb(s2);
                                org.spf.data.SPFImagePath a42 = a41;
                                a4 = a42;
                                i1 = 2;
                            }
                        }
                    }
                    else
                    {
                        org.spf.data.SPFImagePath a43 = new org.spf.data.SPFImagePath();
                        a4 = a43;
                        i1 = 2;
                    }
                }
                label0: {
                    org.spf.data.SPFImagePath a44 = null;
                    org.spf.data.SPFImagePath a45 = a4;
                    org.spf.data.SPFImagePath a46 = a4;
                    if(i1 != 3)
                    {
                        a5 = a46;
                        break label0;
                    }
                    else
                    {
                        a44 = a45;
                    }
                    String s3 = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFImagePath a47 = a44;
                    boolean b3 = "IMAGE_PATH".equalsIgnoreCase(s3);
                    org.spf.data.SPFImagePath a48 = a47;
                    org.spf.data.SPFImagePath a49 = a48;
                    if(b3)
                    {
                        a0 = a48;
                        break;
                    }
                    else
                    {
                        a5 = a49;
                    }
                }
                int i2 = ((org.xmlpull.v1.XmlPullParser)a1).next();
                org.spf.data.SPFImagePath a50 = a5;
                a2 = a50;
                i0 = i2;
            }
            else
            {
                a0 = a2;
                break;
            }
        }
        return a0;
    }
    
    private org.spf.data.SPFStatistics getStatistics(org.xmlpull.v1.XmlPullParser a)
    {
        org.spf.data.SPFStatistics a0 = null;
        int i = a.getEventType();
        Object a1 = a;
        org.spf.data.SPFStatistics a2 = null;
        int i0 = i;
        while(true)
        {
            org.spf.data.SPFStatistics a3 = a2;
            if(i0 != 1)
            {
                org.spf.data.SPFStatistics a4 = null;
                int i1 = 0;
                org.spf.data.SPFStatistics a5 = null;
                org.spf.data.SPFStatistics a6 = a3;
                org.spf.data.SPFStatistics a7 = a6;
                org.spf.data.SPFStatistics a8 = a6;
                if(i0 != 2)
                {
                    a4 = a8;
                    i1 = i0;
                }
                else
                {
                    org.spf.data.SPFStatistics a9 = a7;
                    String s = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFStatistics a10 = a9;
                    boolean b = "STATISTICS".equalsIgnoreCase(s);
                    org.spf.data.SPFStatistics a11 = a10;
                    org.spf.data.SPFStatistics a12 = a11;
                    if(!b)
                    {
                        org.spf.data.SPFStatistics a13 = a12;
                        boolean b0 = "COUNT".equalsIgnoreCase(s);
                        org.spf.data.SPFStatistics a14 = a13;
                        org.spf.data.SPFStatistics a15 = a14;
                        org.spf.data.SPFStatistics a16 = a14;
                        if(!b0)
                        {
                            org.spf.data.SPFStatistics a17 = a16;
                            boolean b1 = "CATEGORY".equalsIgnoreCase(s);
                            org.spf.data.SPFStatistics a18 = a17;
                            org.spf.data.SPFStatistics a19 = a18;
                            org.spf.data.SPFStatistics a20 = a18;
                            if(!b1)
                            {
                                org.spf.data.SPFStatistics a21 = a20;
                                boolean b2 = "NAME".equalsIgnoreCase(s);
                                org.spf.data.SPFStatistics a22 = a21;
                                org.spf.data.SPFStatistics a23 = a22;
                                org.spf.data.SPFStatistics a24 = a22;
                                if(!b2)
                                {
                                    org.spf.data.SPFStatistics a25 = a24;
                                    boolean b3 = "CATEGEORY_TYPE".equalsIgnoreCase(s);
                                    org.spf.data.SPFStatistics a26 = a25;
                                    org.spf.data.SPFStatistics a27 = a26;
                                    org.spf.data.SPFStatistics a28 = a26;
                                    if(!b3)
                                    {
                                        org.spf.data.SPFStatistics a29 = a28;
                                        boolean b4 = "DESCRIPTION".equalsIgnoreCase(s);
                                        org.spf.data.SPFStatistics a30 = a29;
                                        org.spf.data.SPFStatistics a31 = a30;
                                        org.spf.data.SPFStatistics a32 = a30;
                                        if(!b4)
                                        {
                                            org.spf.data.SPFStatistics a33 = a32;
                                            boolean b5 = "STATUS".equalsIgnoreCase(s);
                                            org.spf.data.SPFStatistics a34 = a33;
                                            org.spf.data.SPFStatistics a35 = a34;
                                            org.spf.data.SPFStatistics a36 = a34;
                                            if(!b5)
                                            {
                                                a4 = a36;
                                                i1 = 2;
                                            }
                                            else
                                            {
                                                org.spf.data.SPFStatistics a37 = a35;
                                                org.spf.data.SPFStatistics a38 = a37;
                                                org.spf.data.SPFStatistics a39 = a37;
                                                if(a37 == null)
                                                {
                                                    a4 = a39;
                                                    i1 = 2;
                                                }
                                                else
                                                {
                                                    org.spf.data.SPFStatistics a40 = a38;
                                                    String s0 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                                    org.spf.data.SPFStatistics a41 = a40;
                                                    a40.setStatus(s0);
                                                    org.spf.data.SPFStatistics a42 = a41;
                                                    a4 = a42;
                                                    i1 = 2;
                                                }
                                            }
                                        }
                                        else
                                        {
                                            org.spf.data.SPFStatistics a43 = a31;
                                            org.spf.data.SPFStatistics a44 = a43;
                                            org.spf.data.SPFStatistics a45 = a43;
                                            if(a43 == null)
                                            {
                                                a4 = a45;
                                                i1 = 2;
                                            }
                                            else
                                            {
                                                org.spf.data.SPFStatistics a46 = a44;
                                                String s1 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                                org.spf.data.SPFStatistics a47 = a46;
                                                a46.setCatDescription(s1);
                                                org.spf.data.SPFStatistics a48 = a47;
                                                a4 = a48;
                                                i1 = 2;
                                            }
                                        }
                                    }
                                    else
                                    {
                                        org.spf.data.SPFStatistics a49 = a27;
                                        org.spf.data.SPFStatistics a50 = a49;
                                        org.spf.data.SPFStatistics a51 = a49;
                                        if(a49 == null)
                                        {
                                            a4 = a51;
                                            i1 = 2;
                                        }
                                        else
                                        {
                                            org.spf.data.SPFStatistics a52 = a50;
                                            String s2 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                            org.spf.data.SPFStatistics a53 = a52;
                                            a52.setCatType(s2);
                                            org.spf.data.SPFStatistics a54 = a53;
                                            a4 = a54;
                                            i1 = 2;
                                        }
                                    }
                                }
                                else
                                {
                                    org.spf.data.SPFStatistics a55 = a23;
                                    org.spf.data.SPFStatistics a56 = a55;
                                    org.spf.data.SPFStatistics a57 = a55;
                                    if(a55 == null)
                                    {
                                        a4 = a57;
                                        i1 = 2;
                                    }
                                    else
                                    {
                                        org.spf.data.SPFStatistics a58 = a56;
                                        String s3 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                        org.spf.data.SPFStatistics a59 = a58;
                                        a58.setCatName(s3);
                                        org.spf.data.SPFStatistics a60 = a59;
                                        a4 = a60;
                                        i1 = 2;
                                    }
                                }
                            }
                            else
                            {
                                org.spf.data.SPFStatistics a61 = a19;
                                org.spf.data.SPFStatistics a62 = a61;
                                org.spf.data.SPFStatistics a63 = a61;
                                if(a61 == null)
                                {
                                    a4 = a63;
                                    i1 = 2;
                                }
                                else
                                {
                                    org.spf.data.SPFStatistics a64 = a62;
                                    String s4 = ((org.xmlpull.v1.XmlPullParser)a1).getAttributeValue(0);
                                    org.spf.data.SPFStatistics a65 = a64;
                                    a64.setCatId(s4);
                                    org.spf.data.SPFStatistics a66 = a65;
                                    a4 = a66;
                                    i1 = 2;
                                }
                            }
                        }
                        else
                        {
                            org.spf.data.SPFStatistics a67 = a15;
                            org.spf.data.SPFStatistics a68 = a67;
                            org.spf.data.SPFStatistics a69 = a67;
                            if(a67 == null)
                            {
                                a4 = a69;
                                i1 = 2;
                            }
                            else
                            {
                                org.spf.data.SPFStatistics a70 = a68;
                                String s5 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                org.spf.data.SPFStatistics a71 = a70;
                                a70.setCount(s5);
                                org.spf.data.SPFStatistics a72 = a71;
                                a4 = a72;
                                i1 = 2;
                            }
                        }
                    }
                    else
                    {
                        org.spf.data.SPFStatistics a73 = new org.spf.data.SPFStatistics();
                        String s6 = ((org.xmlpull.v1.XmlPullParser)a1).getAttributeValue(0);
                        a73.setId(s6);
                        a4 = a73;
                        i1 = 2;
                    }
                }
                label0: {
                    org.spf.data.SPFStatistics a74 = null;
                    org.spf.data.SPFStatistics a75 = a4;
                    org.spf.data.SPFStatistics a76 = a4;
                    if(i1 != 3)
                    {
                        a5 = a76;
                        break label0;
                    }
                    else
                    {
                        a74 = a75;
                    }
                    String s7 = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFStatistics a77 = a74;
                    boolean b6 = "CATEGORY".equalsIgnoreCase(s7);
                    org.spf.data.SPFStatistics a78 = a77;
                    org.spf.data.SPFStatistics a79 = a78;
                    if(b6)
                    {
                        a0 = a78;
                        break;
                    }
                    else
                    {
                        a5 = a79;
                    }
                }
                int i2 = ((org.xmlpull.v1.XmlPullParser)a1).next();
                org.spf.data.SPFStatistics a80 = a5;
                a2 = a80;
                i0 = i2;
            }
            else
            {
                a0 = a2;
                break;
            }
        }
        return a0;
    }
    
    private org.spf.data.SPFTimePeriod getTimeFrom(org.xmlpull.v1.XmlPullParser a)
    {
        org.spf.data.SPFTimePeriod a0 = null;
        int i = a.getEventType();
        Object a1 = a;
        org.spf.data.SPFTimePeriod a2 = null;
        int i0 = i;
        while(true)
        {
            org.spf.data.SPFTimePeriod a3 = a2;
            if(i0 != 1)
            {
                org.spf.data.SPFTimePeriod a4 = null;
                int i1 = 0;
                org.spf.data.SPFTimePeriod a5 = null;
                org.spf.data.SPFTimePeriod a6 = a3;
                org.spf.data.SPFTimePeriod a7 = a6;
                org.spf.data.SPFTimePeriod a8 = a6;
                if(i0 != 2)
                {
                    a4 = a8;
                    i1 = i0;
                }
                else
                {
                    org.spf.data.SPFTimePeriod a9 = a7;
                    String s = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFTimePeriod a10 = a9;
                    android.util.Log.d("SPF", "FROM:from called");
                    org.spf.data.SPFTimePeriod a11 = a10;
                    boolean b = "FROM".equalsIgnoreCase(s);
                    org.spf.data.SPFTimePeriod a12 = a11;
                    org.spf.data.SPFTimePeriod a13 = a12;
                    if(!b)
                    {
                        org.spf.data.SPFTimePeriod a14 = a13;
                        boolean b0 = "MONTH".equalsIgnoreCase(s);
                        org.spf.data.SPFTimePeriod a15 = a14;
                        org.spf.data.SPFTimePeriod a16 = a15;
                        org.spf.data.SPFTimePeriod a17 = a15;
                        if(!b0)
                        {
                            org.spf.data.SPFTimePeriod a18 = a17;
                            boolean b1 = "YEAR".equalsIgnoreCase(s);
                            org.spf.data.SPFTimePeriod a19 = a18;
                            org.spf.data.SPFTimePeriod a20 = a19;
                            org.spf.data.SPFTimePeriod a21 = a19;
                            if(!b1)
                            {
                                a4 = a21;
                                i1 = 2;
                            }
                            else
                            {
                                org.spf.data.SPFTimePeriod a22 = null;
                                org.spf.data.SPFTimePeriod a23 = a20;
                                org.spf.data.SPFTimePeriod a24 = a23;
                                org.spf.data.SPFTimePeriod a25 = a23;
                                if(a23 == null)
                                {
                                    a22 = a25;
                                }
                                else
                                {
                                    org.spf.data.SPFTimePeriod a26 = a24;
                                    String s0 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                    org.spf.data.SPFTimePeriod a27 = a26;
                                    a26.setYear(s0);
                                    a22 = a27;
                                }
                                org.spf.data.SPFTimePeriod a28 = a22;
                                StringBuilder a29 = new StringBuilder("getYear:");
                                org.spf.data.SPFTimePeriod a30 = a28;
                                String s1 = a30.getYear();
                                org.spf.data.SPFTimePeriod a31 = a30;
                                StringBuilder a32 = a29.append(s1);
                                org.spf.data.SPFTimePeriod a33 = a31;
                                String s2 = a32.toString();
                                org.spf.data.SPFTimePeriod a34 = a33;
                                android.util.Log.d("SPF", s2);
                                org.spf.data.SPFTimePeriod a35 = a34;
                                a4 = a35;
                                i1 = 2;
                            }
                        }
                        else
                        {
                            org.spf.data.SPFTimePeriod a36 = null;
                            org.spf.data.SPFTimePeriod a37 = a16;
                            org.spf.data.SPFTimePeriod a38 = a37;
                            org.spf.data.SPFTimePeriod a39 = a37;
                            if(a37 == null)
                            {
                                a36 = a39;
                            }
                            else
                            {
                                org.spf.data.SPFTimePeriod a40 = a38;
                                String s3 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                org.spf.data.SPFTimePeriod a41 = a40;
                                a40.setMonth(s3);
                                a36 = a41;
                            }
                            org.spf.data.SPFTimePeriod a42 = a36;
                            StringBuilder a43 = new StringBuilder("getMonth:");
                            org.spf.data.SPFTimePeriod a44 = a42;
                            String s4 = a44.getMonth();
                            org.spf.data.SPFTimePeriod a45 = a44;
                            StringBuilder a46 = a43.append(s4);
                            org.spf.data.SPFTimePeriod a47 = a45;
                            String s5 = a46.toString();
                            org.spf.data.SPFTimePeriod a48 = a47;
                            android.util.Log.d("SPF", s5);
                            org.spf.data.SPFTimePeriod a49 = a48;
                            a4 = a49;
                            i1 = 2;
                        }
                    }
                    else
                    {
                        android.util.Log.d("SPF", "FROM:from OBJ called");
                        org.spf.data.SPFTimePeriod a50 = new org.spf.data.SPFTimePeriod();
                        a4 = a50;
                        i1 = 2;
                    }
                }
                label0: {
                    org.spf.data.SPFTimePeriod a51 = null;
                    org.spf.data.SPFTimePeriod a52 = a4;
                    org.spf.data.SPFTimePeriod a53 = a4;
                    if(i1 != 3)
                    {
                        a5 = a53;
                        break label0;
                    }
                    else
                    {
                        a51 = a52;
                    }
                    String s6 = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFTimePeriod a54 = a51;
                    boolean b2 = "FROM".equalsIgnoreCase(s6);
                    org.spf.data.SPFTimePeriod a55 = a54;
                    org.spf.data.SPFTimePeriod a56 = a55;
                    if(b2)
                    {
                        a0 = a55;
                        break;
                    }
                    else
                    {
                        a5 = a56;
                    }
                }
                int i2 = ((org.xmlpull.v1.XmlPullParser)a1).next();
                org.spf.data.SPFTimePeriod a57 = a5;
                a2 = a57;
                i0 = i2;
            }
            else
            {
                a0 = a2;
                break;
            }
        }
        return a0;
    }
    
    private org.spf.data.SPFTimePeriod getTimeTo(org.xmlpull.v1.XmlPullParser a)
    {
        org.spf.data.SPFTimePeriod a0 = null;
        int i = a.getEventType();
        Object a1 = a;
        org.spf.data.SPFTimePeriod a2 = null;
        int i0 = i;
        while(true)
        {
            org.spf.data.SPFTimePeriod a3 = a2;
            if(i0 != 1)
            {
                org.spf.data.SPFTimePeriod a4 = null;
                int i1 = 0;
                org.spf.data.SPFTimePeriod a5 = null;
                org.spf.data.SPFTimePeriod a6 = a3;
                org.spf.data.SPFTimePeriod a7 = a6;
                org.spf.data.SPFTimePeriod a8 = a6;
                if(i0 != 2)
                {
                    a4 = a8;
                    i1 = i0;
                }
                else
                {
                    org.spf.data.SPFTimePeriod a9 = a7;
                    String s = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFTimePeriod a10 = a9;
                    android.util.Log.d("SPF", "FROM:from called");
                    org.spf.data.SPFTimePeriod a11 = a10;
                    boolean b = "TO".equalsIgnoreCase(s);
                    org.spf.data.SPFTimePeriod a12 = a11;
                    org.spf.data.SPFTimePeriod a13 = a12;
                    if(!b)
                    {
                        org.spf.data.SPFTimePeriod a14 = a13;
                        boolean b0 = "MONTH".equalsIgnoreCase(s);
                        org.spf.data.SPFTimePeriod a15 = a14;
                        org.spf.data.SPFTimePeriod a16 = a15;
                        org.spf.data.SPFTimePeriod a17 = a15;
                        if(!b0)
                        {
                            org.spf.data.SPFTimePeriod a18 = a17;
                            boolean b1 = "YEAR".equalsIgnoreCase(s);
                            org.spf.data.SPFTimePeriod a19 = a18;
                            org.spf.data.SPFTimePeriod a20 = a19;
                            org.spf.data.SPFTimePeriod a21 = a19;
                            if(!b1)
                            {
                                a4 = a21;
                                i1 = 2;
                            }
                            else
                            {
                                org.spf.data.SPFTimePeriod a22 = null;
                                org.spf.data.SPFTimePeriod a23 = a20;
                                org.spf.data.SPFTimePeriod a24 = a23;
                                org.spf.data.SPFTimePeriod a25 = a23;
                                if(a23 == null)
                                {
                                    a22 = a25;
                                }
                                else
                                {
                                    org.spf.data.SPFTimePeriod a26 = a24;
                                    String s0 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                    org.spf.data.SPFTimePeriod a27 = a26;
                                    a26.setYear(s0);
                                    a22 = a27;
                                }
                                org.spf.data.SPFTimePeriod a28 = a22;
                                StringBuilder a29 = new StringBuilder("getYear:");
                                org.spf.data.SPFTimePeriod a30 = a28;
                                String s1 = a30.getYear();
                                org.spf.data.SPFTimePeriod a31 = a30;
                                StringBuilder a32 = a29.append(s1);
                                org.spf.data.SPFTimePeriod a33 = a31;
                                String s2 = a32.toString();
                                org.spf.data.SPFTimePeriod a34 = a33;
                                android.util.Log.d("SPF", s2);
                                org.spf.data.SPFTimePeriod a35 = a34;
                                a4 = a35;
                                i1 = 2;
                            }
                        }
                        else
                        {
                            org.spf.data.SPFTimePeriod a36 = null;
                            org.spf.data.SPFTimePeriod a37 = a16;
                            org.spf.data.SPFTimePeriod a38 = a37;
                            org.spf.data.SPFTimePeriod a39 = a37;
                            if(a37 == null)
                            {
                                a36 = a39;
                            }
                            else
                            {
                                org.spf.data.SPFTimePeriod a40 = a38;
                                String s3 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                org.spf.data.SPFTimePeriod a41 = a40;
                                a40.setMonth(s3);
                                a36 = a41;
                            }
                            org.spf.data.SPFTimePeriod a42 = a36;
                            StringBuilder a43 = new StringBuilder("getMonth:");
                            org.spf.data.SPFTimePeriod a44 = a42;
                            String s4 = a44.getMonth();
                            org.spf.data.SPFTimePeriod a45 = a44;
                            StringBuilder a46 = a43.append(s4);
                            org.spf.data.SPFTimePeriod a47 = a45;
                            String s5 = a46.toString();
                            org.spf.data.SPFTimePeriod a48 = a47;
                            android.util.Log.d("SPF", s5);
                            org.spf.data.SPFTimePeriod a49 = a48;
                            a4 = a49;
                            i1 = 2;
                        }
                    }
                    else
                    {
                        android.util.Log.d("SPF", "FROM:from OBJ called");
                        org.spf.data.SPFTimePeriod a50 = new org.spf.data.SPFTimePeriod();
                        a4 = a50;
                        i1 = 2;
                    }
                }
                label0: {
                    org.spf.data.SPFTimePeriod a51 = null;
                    org.spf.data.SPFTimePeriod a52 = a4;
                    org.spf.data.SPFTimePeriod a53 = a4;
                    if(i1 != 3)
                    {
                        a5 = a53;
                        break label0;
                    }
                    else
                    {
                        a51 = a52;
                    }
                    String s6 = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFTimePeriod a54 = a51;
                    boolean b2 = "TO".equalsIgnoreCase(s6);
                    org.spf.data.SPFTimePeriod a55 = a54;
                    org.spf.data.SPFTimePeriod a56 = a55;
                    if(b2)
                    {
                        a0 = a55;
                        break;
                    }
                    else
                    {
                        a5 = a56;
                    }
                }
                int i2 = ((org.xmlpull.v1.XmlPullParser)a1).next();
                org.spf.data.SPFTimePeriod a57 = a5;
                a2 = a57;
                i0 = i2;
            }
            else
            {
                a0 = a2;
                break;
            }
        }
        return a0;
    }
    
    private org.spf.data.SPFZone getZone(org.xmlpull.v1.XmlPullParser a)
    {
        org.spf.data.SPFZone a0 = null;
        int i = a.getEventType();
        Object a1 = a;
        int i0 = i;
        org.spf.data.SPFZone a2 = null;
        while(true)
        {
            org.spf.data.SPFZone a3 = a2;
            if(i0 != 1)
            {
                int i1 = 0;
                org.spf.data.SPFZone a4 = null;
                org.spf.data.SPFZone a5 = null;
                org.spf.data.SPFZone a6 = a3;
                org.spf.data.SPFZone a7 = a6;
                org.spf.data.SPFZone a8 = a6;
                if(i0 != 2)
                {
                    i1 = i0;
                    a4 = a8;
                }
                else
                {
                    org.spf.data.SPFZone a9 = a7;
                    String s = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFZone a10 = a9;
                    boolean b = "ZONE".equalsIgnoreCase(s);
                    org.spf.data.SPFZone a11 = a10;
                    org.spf.data.SPFZone a12 = a11;
                    if(!b)
                    {
                        org.spf.data.SPFZone a13 = a12;
                        boolean b0 = "ZONE_NAME".equalsIgnoreCase(s);
                        org.spf.data.SPFZone a14 = a13;
                        org.spf.data.SPFZone a15 = a14;
                        org.spf.data.SPFZone a16 = a14;
                        if(!b0)
                        {
                            org.spf.data.SPFZone a17 = a16;
                            boolean b1 = "ZONEID".equalsIgnoreCase(s);
                            org.spf.data.SPFZone a18 = a17;
                            org.spf.data.SPFZone a19 = a18;
                            org.spf.data.SPFZone a20 = a18;
                            if(!b1)
                            {
                                org.spf.data.SPFZone a21 = a20;
                                boolean b2 = "STATUS".equalsIgnoreCase(s);
                                org.spf.data.SPFZone a22 = a21;
                                org.spf.data.SPFZone a23 = a22;
                                org.spf.data.SPFZone a24 = a22;
                                if(!b2)
                                {
                                    i1 = 2;
                                    a4 = a24;
                                }
                                else
                                {
                                    org.spf.data.SPFZone a25 = a23;
                                    org.spf.data.SPFZone a26 = a25;
                                    org.spf.data.SPFZone a27 = a25;
                                    if(a25 == null)
                                    {
                                        i1 = 2;
                                        a4 = a27;
                                    }
                                    else
                                    {
                                        org.spf.data.SPFZone a28 = a26;
                                        String s0 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                        org.spf.data.SPFZone a29 = a28;
                                        a28.setStatus(s0);
                                        org.spf.data.SPFZone a30 = a29;
                                        i1 = 2;
                                        a4 = a30;
                                    }
                                }
                            }
                            else
                            {
                                org.spf.data.SPFZone a31 = a19;
                                org.spf.data.SPFZone a32 = a31;
                                org.spf.data.SPFZone a33 = a31;
                                if(a31 == null)
                                {
                                    i1 = 2;
                                    a4 = a33;
                                }
                                else
                                {
                                    org.spf.data.SPFZone a34 = a32;
                                    String s1 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                    org.spf.data.SPFZone a35 = a34;
                                    a34.setZoneId(s1);
                                    org.spf.data.SPFZone a36 = a35;
                                    i1 = 2;
                                    a4 = a36;
                                }
                            }
                        }
                        else
                        {
                            org.spf.data.SPFZone a37 = a15;
                            org.spf.data.SPFZone a38 = a37;
                            org.spf.data.SPFZone a39 = a37;
                            if(a37 == null)
                            {
                                i1 = 2;
                                a4 = a39;
                            }
                            else
                            {
                                org.spf.data.SPFZone a40 = a38;
                                String s2 = ((org.xmlpull.v1.XmlPullParser)a1).nextText();
                                org.spf.data.SPFZone a41 = a40;
                                a40.setZoneName(s2);
                                org.spf.data.SPFZone a42 = a41;
                                i1 = 2;
                                a4 = a42;
                            }
                        }
                    }
                    else
                    {
                        org.spf.data.SPFZone a43 = new org.spf.data.SPFZone();
                        String s3 = ((org.xmlpull.v1.XmlPullParser)a1).getAttributeValue(0);
                        a43.setId(s3);
                        i1 = 2;
                        a4 = a43;
                    }
                }
                label0: {
                    org.spf.data.SPFZone a44 = null;
                    org.spf.data.SPFZone a45 = a4;
                    org.spf.data.SPFZone a46 = a4;
                    if(i1 != 3)
                    {
                        a5 = a46;
                        break label0;
                    }
                    else
                    {
                        a44 = a45;
                    }
                    String s4 = ((org.xmlpull.v1.XmlPullParser)a1).getName();
                    org.spf.data.SPFZone a47 = a44;
                    boolean b3 = "ZONE".equalsIgnoreCase(s4);
                    org.spf.data.SPFZone a48 = a47;
                    org.spf.data.SPFZone a49 = a48;
                    if(b3)
                    {
                        a0 = a48;
                        break;
                    }
                    else
                    {
                        a5 = a49;
                    }
                }
                int i2 = ((org.xmlpull.v1.XmlPullParser)a1).next();
                org.spf.data.SPFZone a50 = a5;
                i0 = i2;
                a2 = a50;
            }
            else
            {
                a0 = a2;
                break;
            }
        }
        return a0;
    }
    
    public org.spf.data.SPFArrayList parseDataForBanners()
    {
        org.xmlpull.v1.XmlPullParserFactory a = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        Object a0 = a.newPullParser();
        java.net.HttpURLConnection a1 = this.connection;
        String s = this.mUrl;
        java.io.InputStream a2 = org.spf.utils.Utils.getInputStream(a1, s);
        android.util.Xml.Encoding a3 = android.util.Xml.Encoding.UTF_8;
        String s0 = a3.name();
        ((org.xmlpull.v1.XmlPullParser)a0).setInput(a2, s0);
        int i = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
        org.spf.data.SPFArrayList a4 = new org.spf.data.SPFArrayList();
        int i0 = i;
        org.spf.data.SPFBanner a5 = null;
        org.spf.data.SPFBannerPath a6 = null;
        while(true)
        {
            org.spf.data.SPFBanner a7 = a5;
            org.spf.data.SPFBannerPath a8 = a6;
            if(i0 != 1)
            {
                int i1 = 0;
                org.spf.data.SPFBanner a9 = null;
                org.spf.data.SPFBannerPath a10 = null;
                org.spf.data.SPFBanner a11 = null;
                org.spf.data.SPFBannerPath a12 = null;
                org.spf.data.SPFBanner a13 = a7;
                org.spf.data.SPFBannerPath a14 = a8;
                org.spf.data.SPFBanner a15 = a13;
                org.spf.data.SPFBannerPath a16 = a14;
                org.spf.data.SPFBanner a17 = a13;
                org.spf.data.SPFBannerPath a18 = a14;
                if(i0 != 2)
                {
                    i1 = i0;
                    a9 = a17;
                    a10 = a18;
                }
                else
                {
                    org.spf.data.SPFBanner a19 = a15;
                    org.spf.data.SPFBannerPath a20 = a16;
                    String s1 = ((org.xmlpull.v1.XmlPullParser)a0).getName();
                    org.spf.data.SPFBanner a21 = a19;
                    org.spf.data.SPFBannerPath a22 = a20;
                    boolean b = "BANNER".equalsIgnoreCase(s1);
                    org.spf.data.SPFBanner a23 = a21;
                    org.spf.data.SPFBannerPath a24 = a22;
                    org.spf.data.SPFBannerPath a25 = a24;
                    org.spf.data.SPFBanner a26 = a23;
                    org.spf.data.SPFBannerPath a27 = a24;
                    if(!b)
                    {
                        org.spf.data.SPFBanner a28 = a26;
                        org.spf.data.SPFBannerPath a29 = a27;
                        boolean b0 = "BANNER_IMAGE_PATH".equalsIgnoreCase(s1);
                        org.spf.data.SPFBanner a30 = a28;
                        org.spf.data.SPFBannerPath a31 = a29;
                        org.spf.data.SPFBanner a32 = a30;
                        org.spf.data.SPFBanner a33 = a30;
                        org.spf.data.SPFBannerPath a34 = a31;
                        if(!b0)
                        {
                            i1 = 2;
                            a9 = a33;
                            a10 = a34;
                        }
                        else
                        {
                            org.spf.data.SPFBanner a35 = a32;
                            android.util.Log.d("SPF", "BANNER_IMAGE_PATH parent detected");
                            org.spf.data.SPFBanner a36 = a35;
                            org.spf.data.SPFBannerPath a37 = this.getBannerPath((org.xmlpull.v1.XmlPullParser)a0);
                            org.spf.data.SPFBanner a38 = a36;
                            int i2 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                            org.spf.data.SPFBanner a39 = a38;
                            i1 = i2;
                            a9 = a39;
                            a10 = a37;
                        }
                    }
                    else
                    {
                        org.spf.data.SPFBannerPath a40 = a25;
                        org.spf.data.SPFBanner a41 = this.getBanner((org.xmlpull.v1.XmlPullParser)a0);
                        org.spf.data.SPFBannerPath a42 = a40;
                        int i3 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                        org.spf.data.SPFBannerPath a43 = a42;
                        i1 = i3;
                        a9 = a41;
                        a10 = a43;
                    }
                }
                org.spf.data.SPFBanner a44 = a9;
                org.spf.data.SPFBannerPath a45 = a10;
                org.spf.data.SPFBanner a46 = a9;
                org.spf.data.SPFBannerPath a47 = a10;
                if(i1 != 3)
                {
                    a11 = a46;
                    a12 = a47;
                }
                else
                {
                    org.spf.data.SPFBanner a48 = a44;
                    org.spf.data.SPFBannerPath a49 = a45;
                    String s2 = ((org.xmlpull.v1.XmlPullParser)a0).getName();
                    org.spf.data.SPFBanner a50 = a48;
                    org.spf.data.SPFBannerPath a51 = a49;
                    boolean b1 = "BANNER".equalsIgnoreCase(s2);
                    org.spf.data.SPFBanner a52 = a50;
                    org.spf.data.SPFBannerPath a53 = a51;
                    org.spf.data.SPFBanner a54 = a52;
                    org.spf.data.SPFBannerPath a55 = a53;
                    org.spf.data.SPFBanner a56 = a52;
                    org.spf.data.SPFBannerPath a57 = a53;
                    if(!b1)
                    {
                        org.spf.data.SPFBanner a58 = a56;
                        org.spf.data.SPFBannerPath a59 = a57;
                        "BANNER_IMAGE_PATH".equalsIgnoreCase(s2);
                        org.spf.data.SPFBanner a60 = a58;
                        org.spf.data.SPFBannerPath a61 = a59;
                        a11 = a60;
                        a12 = a61;
                    }
                    else
                    {
                        org.spf.data.SPFBanner a62 = a54;
                        org.spf.data.SPFBannerPath a63 = a55;
                        org.spf.data.SPFBanner a64 = a62;
                        org.spf.data.SPFBannerPath a65 = a63;
                        org.spf.data.SPFBanner a66 = a62;
                        org.spf.data.SPFBannerPath a67 = a63;
                        if(a62 == null)
                        {
                            a11 = a66;
                            a12 = a67;
                        }
                        else
                        {
                            org.spf.data.SPFBanner a68 = a64;
                            org.spf.data.SPFBannerPath a69 = a65;
                            a4.add((Object)a68);
                            org.spf.data.SPFBanner a70 = a68;
                            org.spf.data.SPFBannerPath a71 = a69;
                            a11 = a70;
                            a12 = a71;
                        }
                    }
                }
                int i4 = ((org.xmlpull.v1.XmlPullParser)a0).next();
                org.spf.data.SPFBanner a72 = a11;
                org.spf.data.SPFBannerPath a73 = a12;
                i0 = i4;
                a5 = a72;
                a6 = a73;
            }
            else
            {
                break;
            }
        }
        java.net.HttpURLConnection a74 = this.connection;
        if(a74 != null)
        {
            java.net.HttpURLConnection a75 = this.connection;
            a75.disconnect();
        }
        int i5 = 0;
        while(true)
        {
            int i6 = a4.size();
            if(i5 < i6)
            {
                Object a76 = a4.get(i5);
                org.spf.data.SPFBanner dummy = (org.spf.data.SPFBanner)a76;
                org.spf.data.SPFBanner a77 = (org.spf.data.SPFBanner)a76;
                String s3 = a6.getThumbPath();
                a77.setThumbBaseUrl(s3);
                Object a78 = a4.get(i5);
                org.spf.data.SPFBanner dummy0 = (org.spf.data.SPFBanner)a78;
                org.spf.data.SPFBanner a79 = (org.spf.data.SPFBanner)a78;
                String s4 = a6.getFullPath();
                a79.setImageBaseUrl(s4);
                int i7 = i5 + 1;
                i5 = i7;
            }
            else
            {
                break;
            }
        }
        return a4;
    }
    
    public org.spf.data.SPFArrayList parseDataForCategory()
    {
        org.xmlpull.v1.XmlPullParserFactory a = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        Object a0 = a.newPullParser();
        java.net.HttpURLConnection a1 = this.connection;
        String s = this.mUrl;
        java.io.InputStream a2 = org.spf.utils.Utils.getInputStream(a1, s);
        android.util.Xml.Encoding a3 = android.util.Xml.Encoding.UTF_8;
        String s0 = a3.name();
        ((org.xmlpull.v1.XmlPullParser)a0).setInput(a2, s0);
        int i = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
        org.spf.data.SPFArrayList a4 = new org.spf.data.SPFArrayList();
        int i0 = i;
        org.spf.data.SPFCategory a5 = null;
        while(true)
        {
            org.spf.data.SPFCategory a6 = a5;
            if(i0 != 1)
            {
                int i1 = 0;
                org.spf.data.SPFCategory a7 = null;
                org.spf.data.SPFCategory a8 = null;
                org.spf.data.SPFCategory a9 = a6;
                org.spf.data.SPFCategory a10 = a9;
                if(i0 != 2)
                {
                    i1 = i0;
                    a7 = a10;
                }
                else
                {
                    org.spf.data.SPFCategory a11 = this.getCategory((org.xmlpull.v1.XmlPullParser)a0);
                    int i2 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                    i1 = i2;
                    a7 = a11;
                }
                org.spf.data.SPFCategory a12 = a7;
                org.spf.data.SPFCategory a13 = a7;
                if(i1 != 3)
                {
                    a8 = a13;
                }
                else
                {
                    org.spf.data.SPFCategory a14 = a12;
                    String s1 = ((org.xmlpull.v1.XmlPullParser)a0).getName();
                    org.spf.data.SPFCategory a15 = a14;
                    boolean b = "CATEGORY".equalsIgnoreCase(s1);
                    org.spf.data.SPFCategory a16 = a15;
                    org.spf.data.SPFCategory a17 = a16;
                    org.spf.data.SPFCategory a18 = a16;
                    if(!b)
                    {
                        a8 = a18;
                    }
                    else
                    {
                        org.spf.data.SPFCategory a19 = a17;
                        org.spf.data.SPFCategory a20 = a19;
                        org.spf.data.SPFCategory a21 = a19;
                        if(a19 == null)
                        {
                            a8 = a21;
                        }
                        else
                        {
                            org.spf.data.SPFCategory a22 = a20;
                            a4.add((Object)a22);
                            org.spf.data.SPFCategory a23 = a22;
                            a8 = a23;
                        }
                    }
                }
                int i3 = ((org.xmlpull.v1.XmlPullParser)a0).next();
                org.spf.data.SPFCategory a24 = a8;
                i0 = i3;
                a5 = a24;
            }
            else
            {
                break;
            }
        }
        java.net.HttpURLConnection a25 = this.connection;
        if(a25 != null)
        {
            java.net.HttpURLConnection a26 = this.connection;
            a26.disconnect();
        }
        return a4;
    }
    
    public java.util.ArrayList parseDataForCluster()
    {
        org.xmlpull.v1.XmlPullParserFactory a = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        Object a0 = a.newPullParser();
        java.net.HttpURLConnection a1 = this.connection;
        String s = this.mUrl;
        java.io.InputStream a2 = org.spf.utils.Utils.getInputStream(a1, s);
        android.util.Xml.Encoding a3 = android.util.Xml.Encoding.UTF_8;
        String s0 = a3.name();
        ((org.xmlpull.v1.XmlPullParser)a0).setInput(a2, s0);
        int i = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
        java.util.ArrayList a4 = new java.util.ArrayList();
        int i0 = i;
        org.spf.data.SPFCluster a5 = null;
        while(true)
        {
            org.spf.data.SPFCluster a6 = a5;
            if(i0 != 1)
            {
                int i1 = 0;
                org.spf.data.SPFCluster a7 = null;
                org.spf.data.SPFCluster a8 = null;
                org.spf.data.SPFCluster a9 = a6;
                org.spf.data.SPFCluster a10 = a9;
                if(i0 != 2)
                {
                    i1 = i0;
                    a7 = a10;
                }
                else
                {
                    org.spf.data.SPFCluster a11 = this.getCluster((org.xmlpull.v1.XmlPullParser)a0);
                    int i2 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                    i1 = i2;
                    a7 = a11;
                }
                org.spf.data.SPFCluster a12 = a7;
                org.spf.data.SPFCluster a13 = a7;
                if(i1 != 3)
                {
                    a8 = a13;
                }
                else
                {
                    org.spf.data.SPFCluster a14 = a12;
                    String s1 = ((org.xmlpull.v1.XmlPullParser)a0).getName();
                    org.spf.data.SPFCluster a15 = a14;
                    boolean b = "CLUSTER".equalsIgnoreCase(s1);
                    org.spf.data.SPFCluster a16 = a15;
                    org.spf.data.SPFCluster a17 = a16;
                    org.spf.data.SPFCluster a18 = a16;
                    if(!b)
                    {
                        a8 = a18;
                    }
                    else
                    {
                        org.spf.data.SPFCluster a19 = a17;
                        org.spf.data.SPFCluster a20 = a19;
                        org.spf.data.SPFCluster a21 = a19;
                        if(a19 == null)
                        {
                            a8 = a21;
                        }
                        else
                        {
                            org.spf.data.SPFCluster a22 = a20;
                            a4.add((Object)a22);
                            org.spf.data.SPFCluster a23 = a22;
                            a8 = a23;
                        }
                    }
                }
                int i3 = ((org.xmlpull.v1.XmlPullParser)a0).next();
                org.spf.data.SPFCluster a24 = a8;
                i0 = i3;
                a5 = a24;
            }
            else
            {
                break;
            }
        }
        java.net.HttpURLConnection a25 = this.connection;
        if(a25 != null)
        {
            java.net.HttpURLConnection a26 = this.connection;
            a26.disconnect();
        }
        return a4;
    }
    
    public org.spf.data.SPFArrayList parseDataForMissing()
    {
        org.xmlpull.v1.XmlPullParserFactory a = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        Object a0 = a.newPullParser();
        java.net.HttpURLConnection a1 = this.connection;
        String s = this.mUrl;
        java.io.InputStream a2 = org.spf.utils.Utils.getInputStream(a1, s);
        android.util.Xml.Encoding a3 = android.util.Xml.Encoding.UTF_8;
        String s0 = a3.name();
        ((org.xmlpull.v1.XmlPullParser)a0).setInput(a2, s0);
        int i = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
        org.spf.data.SPFArrayList a4 = new org.spf.data.SPFArrayList();
        int i0 = i;
        org.spf.data.SPFMissing a5 = null;
        while(true)
        {
            org.spf.data.SPFMissing a6 = a5;
            if(i0 != 1)
            {
                int i1 = 0;
                org.spf.data.SPFMissing a7 = null;
                org.spf.data.SPFMissing a8 = null;
                org.spf.data.SPFMissing a9 = a6;
                org.spf.data.SPFMissing a10 = a9;
                org.spf.data.SPFMissing a11 = a9;
                if(i0 != 2)
                {
                    i1 = i0;
                    a7 = a11;
                }
                else
                {
                    org.spf.data.SPFMissing a12 = a10;
                    String s1 = ((org.xmlpull.v1.XmlPullParser)a0).getName();
                    org.spf.data.SPFMissing a13 = a12;
                    boolean b = "MISSING_DETAILS".equalsIgnoreCase(s1);
                    org.spf.data.SPFMissing a14 = a13;
                    org.spf.data.SPFMissing a15 = a14;
                    if(!b)
                    {
                        org.spf.data.SPFMissing a16 = a15;
                        boolean b0 = "COMPLEXION".equalsIgnoreCase(s1);
                        org.spf.data.SPFMissing a17 = a16;
                        org.spf.data.SPFMissing a18 = a17;
                        org.spf.data.SPFMissing a19 = a17;
                        if(!b0)
                        {
                            org.spf.data.SPFMissing a20 = a19;
                            boolean b1 = "NAME".equalsIgnoreCase(s1);
                            org.spf.data.SPFMissing a21 = a20;
                            org.spf.data.SPFMissing a22 = a21;
                            org.spf.data.SPFMissing a23 = a21;
                            if(!b1)
                            {
                                org.spf.data.SPFMissing a24 = a23;
                                boolean b2 = "AGE".equalsIgnoreCase(s1);
                                org.spf.data.SPFMissing a25 = a24;
                                org.spf.data.SPFMissing a26 = a25;
                                org.spf.data.SPFMissing a27 = a25;
                                if(!b2)
                                {
                                    org.spf.data.SPFMissing a28 = a27;
                                    boolean b3 = "DESCRIPTION".equalsIgnoreCase(s1);
                                    org.spf.data.SPFMissing a29 = a28;
                                    org.spf.data.SPFMissing a30 = a29;
                                    org.spf.data.SPFMissing a31 = a29;
                                    if(!b3)
                                    {
                                        org.spf.data.SPFMissing a32 = a31;
                                        boolean b4 = "COUNTRY".equalsIgnoreCase(s1);
                                        org.spf.data.SPFMissing a33 = a32;
                                        org.spf.data.SPFMissing a34 = a33;
                                        org.spf.data.SPFMissing a35 = a33;
                                        if(!b4)
                                        {
                                            org.spf.data.SPFMissing a36 = a35;
                                            boolean b5 = "HEIGHT".equalsIgnoreCase(s1);
                                            org.spf.data.SPFMissing a37 = a36;
                                            org.spf.data.SPFMissing a38 = a37;
                                            org.spf.data.SPFMissing a39 = a37;
                                            if(!b5)
                                            {
                                                org.spf.data.SPFMissing a40 = a39;
                                                boolean b6 = "IMAGEURL".equalsIgnoreCase(s1);
                                                org.spf.data.SPFMissing a41 = a40;
                                                org.spf.data.SPFMissing a42 = a41;
                                                org.spf.data.SPFMissing a43 = a41;
                                                if(!b6)
                                                {
                                                    org.spf.data.SPFMissing a44 = a43;
                                                    boolean b7 = "STATUS".equalsIgnoreCase(s1);
                                                    org.spf.data.SPFMissing a45 = a44;
                                                    org.spf.data.SPFMissing a46 = a45;
                                                    org.spf.data.SPFMissing a47 = a45;
                                                    if(!b7)
                                                    {
                                                        org.spf.data.SPFMissing a48 = a47;
                                                        boolean b8 = "HAIR_TYPE".equalsIgnoreCase(s1);
                                                        org.spf.data.SPFMissing a49 = a48;
                                                        org.spf.data.SPFMissing a50 = a49;
                                                        org.spf.data.SPFMissing a51 = a49;
                                                        if(!b8)
                                                        {
                                                            org.spf.data.SPFMissing a52 = a51;
                                                            boolean b9 = "LOCATION".equalsIgnoreCase(s1);
                                                            org.spf.data.SPFMissing a53 = a52;
                                                            org.spf.data.SPFMissing a54 = a53;
                                                            org.spf.data.SPFMissing a55 = a53;
                                                            if(!b9)
                                                            {
                                                                org.spf.data.SPFMissing a56 = a55;
                                                                boolean b10 = "GENDER".equalsIgnoreCase(s1);
                                                                org.spf.data.SPFMissing a57 = a56;
                                                                org.spf.data.SPFMissing a58 = a57;
                                                                org.spf.data.SPFMissing a59 = a57;
                                                                if(!b10)
                                                                {
                                                                    org.spf.data.SPFMissing a60 = a59;
                                                                    boolean b11 = "MISSING_DATE_STR".equalsIgnoreCase(s1);
                                                                    org.spf.data.SPFMissing a61 = a60;
                                                                    org.spf.data.SPFMissing a62 = a61;
                                                                    org.spf.data.SPFMissing a63 = a61;
                                                                    if(!b11)
                                                                    {
                                                                        org.spf.data.SPFMissing a64 = a63;
                                                                        boolean b12 = "RACE".equalsIgnoreCase(s1);
                                                                        org.spf.data.SPFMissing a65 = a64;
                                                                        org.spf.data.SPFMissing a66 = a65;
                                                                        org.spf.data.SPFMissing a67 = a65;
                                                                        if(!b12)
                                                                        {
                                                                            org.spf.data.SPFMissing a68 = a67;
                                                                            boolean b13 = "THUMBURL".equalsIgnoreCase(s1);
                                                                            org.spf.data.SPFMissing a69 = a68;
                                                                            org.spf.data.SPFMissing a70 = a69;
                                                                            org.spf.data.SPFMissing a71 = a69;
                                                                            if(!b13)
                                                                            {
                                                                                org.spf.data.SPFMissing a72 = a71;
                                                                                boolean b14 = "TITLE".equalsIgnoreCase(s1);
                                                                                org.spf.data.SPFMissing a73 = a72;
                                                                                org.spf.data.SPFMissing a74 = a73;
                                                                                org.spf.data.SPFMissing a75 = a73;
                                                                                if(!b14)
                                                                                {
                                                                                    org.spf.data.SPFMissing a76 = a75;
                                                                                    boolean b15 = "DOB_STR".equalsIgnoreCase(s1);
                                                                                    org.spf.data.SPFMissing a77 = a76;
                                                                                    org.spf.data.SPFMissing a78 = a77;
                                                                                    org.spf.data.SPFMissing a79 = a77;
                                                                                    if(!b15)
                                                                                    {
                                                                                        org.spf.data.SPFMissing a80 = a79;
                                                                                        boolean b16 = "CLUSTER".equalsIgnoreCase(s1);
                                                                                        org.spf.data.SPFMissing a81 = a80;
                                                                                        org.spf.data.SPFMissing a82 = a81;
                                                                                        org.spf.data.SPFMissing a83 = a81;
                                                                                        if(!b16)
                                                                                        {
                                                                                            org.spf.data.SPFMissing a84 = a83;
                                                                                            boolean b17 = "FOOTER_IMAGE".equalsIgnoreCase(s1);
                                                                                            org.spf.data.SPFMissing a85 = a84;
                                                                                            org.spf.data.SPFMissing a86 = a85;
                                                                                            org.spf.data.SPFMissing a87 = a85;
                                                                                            if(!b17)
                                                                                            {
                                                                                                org.spf.data.SPFMissing a88 = a87;
                                                                                                boolean b18 = "ZONE".equalsIgnoreCase(s1);
                                                                                                org.spf.data.SPFMissing a89 = a88;
                                                                                                org.spf.data.SPFMissing a90 = a89;
                                                                                                org.spf.data.SPFMissing a91 = a89;
                                                                                                if(!b18)
                                                                                                {
                                                                                                    org.spf.data.SPFMissing a92 = a91;
                                                                                                    boolean b19 = "IMAGE_PATH".equalsIgnoreCase(s1);
                                                                                                    org.spf.data.SPFMissing a93 = a92;
                                                                                                    org.spf.data.SPFMissing a94 = a93;
                                                                                                    org.spf.data.SPFMissing a95 = a93;
                                                                                                    if(!b19)
                                                                                                    {
                                                                                                        i1 = 2;
                                                                                                        a7 = a95;
                                                                                                    }
                                                                                                    else
                                                                                                    {
                                                                                                        org.spf.data.SPFMissing a96 = a94;
                                                                                                        org.spf.data.SPFMissing a97 = a96;
                                                                                                        if(a96 == null)
                                                                                                        {
                                                                                                            org.spf.data.SPFImagePath a98 = this.getImagePath((org.xmlpull.v1.XmlPullParser)a0);
                                                                                                            a4.setPath(a98);
                                                                                                            int i2 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                                                            i1 = i2;
                                                                                                            a7 = null;
                                                                                                        }
                                                                                                        else
                                                                                                        {
                                                                                                            org.spf.data.SPFMissing a99 = a97;
                                                                                                            org.spf.data.SPFImagePath a100 = this.getImagePath((org.xmlpull.v1.XmlPullParser)a0);
                                                                                                            org.spf.data.SPFMissing a101 = a99;
                                                                                                            a99.setImagePath(a100);
                                                                                                            org.spf.data.SPFMissing a102 = a101;
                                                                                                            int i3 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                                                            org.spf.data.SPFMissing a103 = a102;
                                                                                                            i1 = i3;
                                                                                                            a7 = a103;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else
                                                                                                {
                                                                                                    org.spf.data.SPFMissing a104 = a90;
                                                                                                    org.spf.data.SPFMissing a105 = a104;
                                                                                                    org.spf.data.SPFMissing a106 = a104;
                                                                                                    if(a104 == null)
                                                                                                    {
                                                                                                        i1 = 2;
                                                                                                        a7 = a106;
                                                                                                    }
                                                                                                    else
                                                                                                    {
                                                                                                        org.spf.data.SPFMissing a107 = a105;
                                                                                                        org.spf.data.SPFZone a108 = this.getZone((org.xmlpull.v1.XmlPullParser)a0);
                                                                                                        org.spf.data.SPFMissing a109 = a107;
                                                                                                        a107.setZone(a108);
                                                                                                        org.spf.data.SPFMissing a110 = a109;
                                                                                                        int i4 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                                                        org.spf.data.SPFMissing a111 = a110;
                                                                                                        i1 = i4;
                                                                                                        a7 = a111;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                                org.spf.data.SPFMissing a112 = a86;
                                                                                                org.spf.data.SPFMissing a113 = a112;
                                                                                                org.spf.data.SPFMissing a114 = a112;
                                                                                                if(a112 == null)
                                                                                                {
                                                                                                    i1 = 2;
                                                                                                    a7 = a114;
                                                                                                }
                                                                                                else
                                                                                                {
                                                                                                    org.spf.data.SPFMissing a115 = a113;
                                                                                                    org.spf.data.SPFFooter a116 = this.getFooter((org.xmlpull.v1.XmlPullParser)a0);
                                                                                                    org.spf.data.SPFMissing a117 = a115;
                                                                                                    a115.setFooterData(a116);
                                                                                                    org.spf.data.SPFMissing a118 = a117;
                                                                                                    int i5 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                                                    org.spf.data.SPFMissing a119 = a118;
                                                                                                    i1 = i5;
                                                                                                    a7 = a119;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else
                                                                                        {
                                                                                            org.spf.data.SPFMissing a120 = a82;
                                                                                            org.spf.data.SPFMissing a121 = a120;
                                                                                            org.spf.data.SPFMissing a122 = a120;
                                                                                            if(a120 == null)
                                                                                            {
                                                                                                i1 = 2;
                                                                                                a7 = a122;
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                                org.spf.data.SPFMissing a123 = a121;
                                                                                                org.spf.data.SPFCluster a124 = this.getCluster((org.xmlpull.v1.XmlPullParser)a0);
                                                                                                org.spf.data.SPFMissing a125 = a123;
                                                                                                a123.setCluster(a124);
                                                                                                org.spf.data.SPFMissing a126 = a125;
                                                                                                int i6 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                                                org.spf.data.SPFMissing a127 = a126;
                                                                                                i1 = i6;
                                                                                                a7 = a127;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        org.spf.data.SPFMissing a128 = a78;
                                                                                        org.spf.data.SPFMissing a129 = a128;
                                                                                        org.spf.data.SPFMissing a130 = a128;
                                                                                        if(a128 == null)
                                                                                        {
                                                                                            i1 = 2;
                                                                                            a7 = a130;
                                                                                        }
                                                                                        else
                                                                                        {
                                                                                            org.spf.data.SPFMissing a131 = a129;
                                                                                            String s2 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                                                            org.spf.data.SPFMissing a132 = a131;
                                                                                            a131.setDobStr(s2);
                                                                                            org.spf.data.SPFMissing a133 = a132;
                                                                                            i1 = 2;
                                                                                            a7 = a133;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else
                                                                                {
                                                                                    org.spf.data.SPFMissing a134 = a74;
                                                                                    org.spf.data.SPFMissing a135 = a134;
                                                                                    org.spf.data.SPFMissing a136 = a134;
                                                                                    if(a134 == null)
                                                                                    {
                                                                                        i1 = 2;
                                                                                        a7 = a136;
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        org.spf.data.SPFMissing a137 = a135;
                                                                                        String s3 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                                                        org.spf.data.SPFMissing a138 = a137;
                                                                                        a137.setTitle(s3);
                                                                                        org.spf.data.SPFMissing a139 = a138;
                                                                                        i1 = 2;
                                                                                        a7 = a139;
                                                                                    }
                                                                                }
                                                                            }
                                                                            else
                                                                            {
                                                                                org.spf.data.SPFMissing a140 = a70;
                                                                                org.spf.data.SPFMissing a141 = a140;
                                                                                org.spf.data.SPFMissing a142 = a140;
                                                                                if(a140 == null)
                                                                                {
                                                                                    i1 = 2;
                                                                                    a7 = a142;
                                                                                }
                                                                                else
                                                                                {
                                                                                    org.spf.data.SPFMissing a143 = a141;
                                                                                    String s4 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                                                    org.spf.data.SPFMissing a144 = a143;
                                                                                    a143.setThumbUrl(s4);
                                                                                    org.spf.data.SPFMissing a145 = a144;
                                                                                    i1 = 2;
                                                                                    a7 = a145;
                                                                                }
                                                                            }
                                                                        }
                                                                        else
                                                                        {
                                                                            org.spf.data.SPFMissing a146 = a66;
                                                                            org.spf.data.SPFMissing a147 = a146;
                                                                            org.spf.data.SPFMissing a148 = a146;
                                                                            if(a146 == null)
                                                                            {
                                                                                i1 = 2;
                                                                                a7 = a148;
                                                                            }
                                                                            else
                                                                            {
                                                                                org.spf.data.SPFMissing a149 = a147;
                                                                                String s5 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                                                org.spf.data.SPFMissing a150 = a149;
                                                                                a149.setRace(s5);
                                                                                org.spf.data.SPFMissing a151 = a150;
                                                                                i1 = 2;
                                                                                a7 = a151;
                                                                            }
                                                                        }
                                                                    }
                                                                    else
                                                                    {
                                                                        org.spf.data.SPFMissing a152 = a62;
                                                                        org.spf.data.SPFMissing a153 = a152;
                                                                        org.spf.data.SPFMissing a154 = a152;
                                                                        if(a152 == null)
                                                                        {
                                                                            i1 = 2;
                                                                            a7 = a154;
                                                                        }
                                                                        else
                                                                        {
                                                                            org.spf.data.SPFMissing a155 = a153;
                                                                            String s6 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                                            org.spf.data.SPFMissing a156 = a155;
                                                                            a155.setMissingDateStr(s6);
                                                                            org.spf.data.SPFMissing a157 = a156;
                                                                            i1 = 2;
                                                                            a7 = a157;
                                                                        }
                                                                    }
                                                                }
                                                                else
                                                                {
                                                                    org.spf.data.SPFMissing a158 = a58;
                                                                    org.spf.data.SPFMissing a159 = a158;
                                                                    org.spf.data.SPFMissing a160 = a158;
                                                                    if(a158 == null)
                                                                    {
                                                                        i1 = 2;
                                                                        a7 = a160;
                                                                    }
                                                                    else
                                                                    {
                                                                        org.spf.data.SPFMissing a161 = a159;
                                                                        String s7 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                                        org.spf.data.SPFMissing a162 = a161;
                                                                        a161.setGender(s7);
                                                                        org.spf.data.SPFMissing a163 = a162;
                                                                        i1 = 2;
                                                                        a7 = a163;
                                                                    }
                                                                }
                                                            }
                                                            else
                                                            {
                                                                org.spf.data.SPFMissing a164 = a54;
                                                                org.spf.data.SPFMissing a165 = a164;
                                                                org.spf.data.SPFMissing a166 = a164;
                                                                if(a164 == null)
                                                                {
                                                                    i1 = 2;
                                                                    a7 = a166;
                                                                }
                                                                else
                                                                {
                                                                    org.spf.data.SPFMissing a167 = a165;
                                                                    String s8 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                                    org.spf.data.SPFMissing a168 = a167;
                                                                    a167.setLocation(s8);
                                                                    org.spf.data.SPFMissing a169 = a168;
                                                                    i1 = 2;
                                                                    a7 = a169;
                                                                }
                                                            }
                                                        }
                                                        else
                                                        {
                                                            org.spf.data.SPFMissing a170 = a50;
                                                            org.spf.data.SPFMissing a171 = a170;
                                                            org.spf.data.SPFMissing a172 = a170;
                                                            if(a170 == null)
                                                            {
                                                                i1 = 2;
                                                                a7 = a172;
                                                            }
                                                            else
                                                            {
                                                                org.spf.data.SPFMissing a173 = a171;
                                                                String s9 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                                org.spf.data.SPFMissing a174 = a173;
                                                                a173.setHairType(s9);
                                                                org.spf.data.SPFMissing a175 = a174;
                                                                i1 = 2;
                                                                a7 = a175;
                                                            }
                                                        }
                                                    }
                                                    else
                                                    {
                                                        org.spf.data.SPFMissing a176 = a46;
                                                        org.spf.data.SPFMissing a177 = a176;
                                                        org.spf.data.SPFMissing a178 = a176;
                                                        if(a176 == null)
                                                        {
                                                            i1 = 2;
                                                            a7 = a178;
                                                        }
                                                        else
                                                        {
                                                            org.spf.data.SPFMissing a179 = a177;
                                                            String s10 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                            org.spf.data.SPFMissing a180 = a179;
                                                            a179.setStatus(s10);
                                                            org.spf.data.SPFMissing a181 = a180;
                                                            i1 = 2;
                                                            a7 = a181;
                                                        }
                                                    }
                                                }
                                                else
                                                {
                                                    org.spf.data.SPFMissing a182 = a42;
                                                    org.spf.data.SPFMissing a183 = a182;
                                                    org.spf.data.SPFMissing a184 = a182;
                                                    if(a182 == null)
                                                    {
                                                        i1 = 2;
                                                        a7 = a184;
                                                    }
                                                    else
                                                    {
                                                        org.spf.data.SPFMissing a185 = a183;
                                                        String s11 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                        org.spf.data.SPFMissing a186 = a185;
                                                        a185.setImageUrl(s11);
                                                        org.spf.data.SPFMissing a187 = a186;
                                                        i1 = 2;
                                                        a7 = a187;
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                org.spf.data.SPFMissing a188 = a38;
                                                org.spf.data.SPFMissing a189 = a188;
                                                org.spf.data.SPFMissing a190 = a188;
                                                if(a188 == null)
                                                {
                                                    i1 = 2;
                                                    a7 = a190;
                                                }
                                                else
                                                {
                                                    org.spf.data.SPFMissing a191 = a189;
                                                    String s12 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                    org.spf.data.SPFMissing a192 = a191;
                                                    a191.setHeight(s12);
                                                    org.spf.data.SPFMissing a193 = a192;
                                                    i1 = 2;
                                                    a7 = a193;
                                                }
                                            }
                                        }
                                        else
                                        {
                                            org.spf.data.SPFMissing a194 = a34;
                                            org.spf.data.SPFMissing a195 = a194;
                                            org.spf.data.SPFMissing a196 = a194;
                                            if(a194 == null)
                                            {
                                                i1 = 2;
                                                a7 = a196;
                                            }
                                            else
                                            {
                                                org.spf.data.SPFMissing a197 = a195;
                                                String s13 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                org.spf.data.SPFMissing a198 = a197;
                                                a197.setCountry(s13);
                                                org.spf.data.SPFMissing a199 = a198;
                                                i1 = 2;
                                                a7 = a199;
                                            }
                                        }
                                    }
                                    else
                                    {
                                        org.spf.data.SPFMissing a200 = a30;
                                        org.spf.data.SPFMissing a201 = a200;
                                        org.spf.data.SPFMissing a202 = a200;
                                        if(a200 == null)
                                        {
                                            i1 = 2;
                                            a7 = a202;
                                        }
                                        else
                                        {
                                            org.spf.data.SPFMissing a203 = a201;
                                            String s14 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                            org.spf.data.SPFMissing a204 = a203;
                                            a203.setDescription(s14);
                                            org.spf.data.SPFMissing a205 = a204;
                                            i1 = 2;
                                            a7 = a205;
                                        }
                                    }
                                }
                                else
                                {
                                    org.spf.data.SPFMissing a206 = a26;
                                    org.spf.data.SPFMissing a207 = a206;
                                    org.spf.data.SPFMissing a208 = a206;
                                    if(a206 == null)
                                    {
                                        i1 = 2;
                                        a7 = a208;
                                    }
                                    else
                                    {
                                        org.spf.data.SPFMissing a209 = a207;
                                        String s15 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                        org.spf.data.SPFMissing a210 = a209;
                                        a209.setAge(s15);
                                        org.spf.data.SPFMissing a211 = a210;
                                        i1 = 2;
                                        a7 = a211;
                                    }
                                }
                            }
                            else
                            {
                                org.spf.data.SPFMissing a212 = a22;
                                org.spf.data.SPFMissing a213 = a212;
                                org.spf.data.SPFMissing a214 = a212;
                                if(a212 == null)
                                {
                                    i1 = 2;
                                    a7 = a214;
                                }
                                else
                                {
                                    org.spf.data.SPFMissing a215 = a213;
                                    String s16 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                    org.spf.data.SPFMissing a216 = a215;
                                    a215.setName(s16);
                                    org.spf.data.SPFMissing a217 = a216;
                                    i1 = 2;
                                    a7 = a217;
                                }
                            }
                        }
                        else
                        {
                            org.spf.data.SPFMissing a218 = a18;
                            org.spf.data.SPFMissing a219 = a218;
                            org.spf.data.SPFMissing a220 = a218;
                            if(a218 == null)
                            {
                                i1 = 2;
                                a7 = a220;
                            }
                            else
                            {
                                org.spf.data.SPFMissing a221 = a219;
                                String s17 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                org.spf.data.SPFMissing a222 = a221;
                                a221.setComplexion(s17);
                                org.spf.data.SPFMissing a223 = a222;
                                i1 = 2;
                                a7 = a223;
                            }
                        }
                    }
                    else
                    {
                        org.spf.data.SPFMissing a224 = new org.spf.data.SPFMissing();
                        String s18 = ((org.xmlpull.v1.XmlPullParser)a0).getAttributeValue(0);
                        a224.setId(s18);
                        i1 = 2;
                        a7 = a224;
                    }
                }
                org.spf.data.SPFMissing a225 = a7;
                org.spf.data.SPFMissing a226 = a7;
                if(i1 != 3)
                {
                    a8 = a226;
                }
                else
                {
                    org.spf.data.SPFMissing a227 = a225;
                    String s19 = ((org.xmlpull.v1.XmlPullParser)a0).getName();
                    org.spf.data.SPFMissing a228 = a227;
                    boolean b20 = "MISSING_DETAILS".equalsIgnoreCase(s19);
                    org.spf.data.SPFMissing a229 = a228;
                    org.spf.data.SPFMissing a230 = a229;
                    org.spf.data.SPFMissing a231 = a229;
                    if(!b20)
                    {
                        a8 = a231;
                    }
                    else
                    {
                        org.spf.data.SPFMissing a232 = a230;
                        org.spf.data.SPFMissing a233 = a232;
                        if(a232 == null)
                        {
                            a8 = a233;
                        }
                        else
                        {
                            a4.add((Object)a232);
                            a8 = null;
                        }
                    }
                }
                int i7 = ((org.xmlpull.v1.XmlPullParser)a0).next();
                org.spf.data.SPFMissing a234 = a8;
                i0 = i7;
                a5 = a234;
            }
            else
            {
                break;
            }
        }
        java.net.HttpURLConnection a235 = this.connection;
        if(a235 != null)
        {
            java.net.HttpURLConnection a236 = this.connection;
            a236.disconnect();
        }
        return a4;
    }
    
    public org.spf.data.SPFArrayList parseDataForNewsCrime()
    {
        org.xmlpull.v1.XmlPullParserFactory a = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        Object a0 = a.newPullParser();
        java.net.HttpURLConnection a1 = this.connection;
        String s = this.mUrl;
        java.io.InputStream a2 = org.spf.utils.Utils.getInputStream(a1, s);
        android.util.Xml.Encoding a3 = android.util.Xml.Encoding.UTF_8;
        String s0 = a3.name();
        ((org.xmlpull.v1.XmlPullParser)a0).setInput(a2, s0);
        StringBuilder a4 = new StringBuilder("mUrl::");
        String s1 = this.mUrl;
        StringBuilder a5 = a4.append(s1);
        String s2 = a5.toString();
        android.util.Log.d("SPF", s2);
        int i = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
        org.spf.data.SPFArrayList a6 = new org.spf.data.SPFArrayList();
        int i0 = i;
        org.spf.data.SPFCrime a7 = null;
        while(true)
        {
            org.spf.data.SPFCrime a8 = a7;
            if(i0 != 1)
            {
                int i1 = 0;
                org.spf.data.SPFCrime a9 = null;
                org.spf.data.SPFCrime a10 = null;
                org.spf.data.SPFCrime a11 = a8;
                org.spf.data.SPFCrime a12 = a11;
                org.spf.data.SPFCrime a13 = a11;
                if(i0 != 2)
                {
                    i1 = i0;
                    a9 = a13;
                }
                else
                {
                    org.spf.data.SPFCrime a14 = a12;
                    String s3 = ((org.xmlpull.v1.XmlPullParser)a0).getName();
                    org.spf.data.SPFCrime a15 = a14;
                    boolean b = "CRIME".equalsIgnoreCase(s3);
                    org.spf.data.SPFCrime a16 = a15;
                    org.spf.data.SPFCrime a17 = a16;
                    if(!b)
                    {
                        org.spf.data.SPFCrime a18 = a17;
                        boolean b0 = "LOCATION".equalsIgnoreCase(s3);
                        org.spf.data.SPFCrime a19 = a18;
                        org.spf.data.SPFCrime a20 = a19;
                        org.spf.data.SPFCrime a21 = a19;
                        if(!b0)
                        {
                            org.spf.data.SPFCrime a22 = a21;
                            boolean b1 = "DETAILED_DESCRIPTION".equalsIgnoreCase(s3);
                            org.spf.data.SPFCrime a23 = a22;
                            org.spf.data.SPFCrime a24 = a23;
                            org.spf.data.SPFCrime a25 = a23;
                            if(!b1)
                            {
                                org.spf.data.SPFCrime a26 = a25;
                                boolean b2 = "LONG_DESCRIPTION".equalsIgnoreCase(s3);
                                org.spf.data.SPFCrime a27 = a26;
                                org.spf.data.SPFCrime a28 = a27;
                                org.spf.data.SPFCrime a29 = a27;
                                if(!b2)
                                {
                                    org.spf.data.SPFCrime a30 = a29;
                                    boolean b3 = "SHORT_DESCRIPTION".equalsIgnoreCase(s3);
                                    org.spf.data.SPFCrime a31 = a30;
                                    org.spf.data.SPFCrime a32 = a31;
                                    org.spf.data.SPFCrime a33 = a31;
                                    if(!b3)
                                    {
                                        org.spf.data.SPFCrime a34 = a33;
                                        boolean b4 = "IMAGEURL".equalsIgnoreCase(s3);
                                        org.spf.data.SPFCrime a35 = a34;
                                        org.spf.data.SPFCrime a36 = a35;
                                        org.spf.data.SPFCrime a37 = a35;
                                        if(!b4)
                                        {
                                            org.spf.data.SPFCrime a38 = a37;
                                            boolean b5 = "STATUS".equalsIgnoreCase(s3);
                                            org.spf.data.SPFCrime a39 = a38;
                                            org.spf.data.SPFCrime a40 = a39;
                                            org.spf.data.SPFCrime a41 = a39;
                                            if(!b5)
                                            {
                                                org.spf.data.SPFCrime a42 = a41;
                                                boolean b6 = "CRIME_DATE_STR".equalsIgnoreCase(s3);
                                                org.spf.data.SPFCrime a43 = a42;
                                                org.spf.data.SPFCrime a44 = a43;
                                                org.spf.data.SPFCrime a45 = a43;
                                                if(!b6)
                                                {
                                                    org.spf.data.SPFCrime a46 = a45;
                                                    boolean b7 = "THUMBURL".equalsIgnoreCase(s3);
                                                    org.spf.data.SPFCrime a47 = a46;
                                                    org.spf.data.SPFCrime a48 = a47;
                                                    org.spf.data.SPFCrime a49 = a47;
                                                    if(!b7)
                                                    {
                                                        org.spf.data.SPFCrime a50 = a49;
                                                        boolean b8 = "TITLE".equalsIgnoreCase(s3);
                                                        org.spf.data.SPFCrime a51 = a50;
                                                        org.spf.data.SPFCrime a52 = a51;
                                                        org.spf.data.SPFCrime a53 = a51;
                                                        if(!b8)
                                                        {
                                                            org.spf.data.SPFCrime a54 = a53;
                                                            boolean b9 = "CLUSTER".equalsIgnoreCase(s3);
                                                            org.spf.data.SPFCrime a55 = a54;
                                                            org.spf.data.SPFCrime a56 = a55;
                                                            org.spf.data.SPFCrime a57 = a55;
                                                            if(!b9)
                                                            {
                                                                org.spf.data.SPFCrime a58 = a57;
                                                                boolean b10 = "CATEGORY".equalsIgnoreCase(s3);
                                                                org.spf.data.SPFCrime a59 = a58;
                                                                org.spf.data.SPFCrime a60 = a59;
                                                                org.spf.data.SPFCrime a61 = a59;
                                                                if(!b10)
                                                                {
                                                                    org.spf.data.SPFCrime a62 = a61;
                                                                    boolean b11 = "FOOTER_IMAGE".equalsIgnoreCase(s3);
                                                                    org.spf.data.SPFCrime a63 = a62;
                                                                    org.spf.data.SPFCrime a64 = a63;
                                                                    org.spf.data.SPFCrime a65 = a63;
                                                                    if(!b11)
                                                                    {
                                                                        org.spf.data.SPFCrime a66 = a65;
                                                                        boolean b12 = "ZONE".equalsIgnoreCase(s3);
                                                                        org.spf.data.SPFCrime a67 = a66;
                                                                        org.spf.data.SPFCrime a68 = a67;
                                                                        org.spf.data.SPFCrime a69 = a67;
                                                                        if(!b12)
                                                                        {
                                                                            org.spf.data.SPFCrime a70 = a69;
                                                                            boolean b13 = "IMAGE_PATH".equalsIgnoreCase(s3);
                                                                            org.spf.data.SPFCrime a71 = a70;
                                                                            org.spf.data.SPFCrime a72 = a71;
                                                                            org.spf.data.SPFCrime a73 = a71;
                                                                            if(!b13)
                                                                            {
                                                                                i1 = 2;
                                                                                a9 = a73;
                                                                            }
                                                                            else
                                                                            {
                                                                                org.spf.data.SPFCrime a74 = a72;
                                                                                org.spf.data.SPFCrime a75 = a74;
                                                                                if(a74 == null)
                                                                                {
                                                                                    org.spf.data.SPFImagePath a76 = this.getImagePath((org.xmlpull.v1.XmlPullParser)a0);
                                                                                    a6.setPath(a76);
                                                                                    int i2 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                                    i1 = i2;
                                                                                    a9 = null;
                                                                                }
                                                                                else
                                                                                {
                                                                                    org.spf.data.SPFCrime a77 = a75;
                                                                                    org.spf.data.SPFImagePath a78 = this.getImagePath((org.xmlpull.v1.XmlPullParser)a0);
                                                                                    org.spf.data.SPFCrime a79 = a77;
                                                                                    a77.setImagePath(a78);
                                                                                    org.spf.data.SPFCrime a80 = a79;
                                                                                    int i3 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                                    org.spf.data.SPFCrime a81 = a80;
                                                                                    i1 = i3;
                                                                                    a9 = a81;
                                                                                }
                                                                            }
                                                                        }
                                                                        else
                                                                        {
                                                                            org.spf.data.SPFCrime a82 = a68;
                                                                            org.spf.data.SPFCrime a83 = a82;
                                                                            org.spf.data.SPFCrime a84 = a82;
                                                                            if(a82 == null)
                                                                            {
                                                                                i1 = 2;
                                                                                a9 = a84;
                                                                            }
                                                                            else
                                                                            {
                                                                                org.spf.data.SPFCrime a85 = a83;
                                                                                org.spf.data.SPFZone a86 = this.getZone((org.xmlpull.v1.XmlPullParser)a0);
                                                                                org.spf.data.SPFCrime a87 = a85;
                                                                                a85.setZone(a86);
                                                                                org.spf.data.SPFCrime a88 = a87;
                                                                                int i4 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                                org.spf.data.SPFCrime a89 = a88;
                                                                                i1 = i4;
                                                                                a9 = a89;
                                                                            }
                                                                        }
                                                                    }
                                                                    else
                                                                    {
                                                                        org.spf.data.SPFCrime a90 = a64;
                                                                        org.spf.data.SPFCrime a91 = a90;
                                                                        org.spf.data.SPFCrime a92 = a90;
                                                                        if(a90 == null)
                                                                        {
                                                                            i1 = 2;
                                                                            a9 = a92;
                                                                        }
                                                                        else
                                                                        {
                                                                            org.spf.data.SPFCrime a93 = a91;
                                                                            org.spf.data.SPFFooter a94 = this.getFooter((org.xmlpull.v1.XmlPullParser)a0);
                                                                            org.spf.data.SPFCrime a95 = a93;
                                                                            a93.setFooterData(a94);
                                                                            org.spf.data.SPFCrime a96 = a95;
                                                                            int i5 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                            org.spf.data.SPFCrime a97 = a96;
                                                                            i1 = i5;
                                                                            a9 = a97;
                                                                        }
                                                                    }
                                                                }
                                                                else
                                                                {
                                                                    org.spf.data.SPFCrime a98 = a60;
                                                                    org.spf.data.SPFCrime a99 = a98;
                                                                    org.spf.data.SPFCrime a100 = a98;
                                                                    if(a98 == null)
                                                                    {
                                                                        i1 = 2;
                                                                        a9 = a100;
                                                                    }
                                                                    else
                                                                    {
                                                                        org.spf.data.SPFCrime a101 = a99;
                                                                        org.spf.data.SPFCategory a102 = this.getCategory((org.xmlpull.v1.XmlPullParser)a0);
                                                                        org.spf.data.SPFCrime a103 = a101;
                                                                        a101.setCategory(a102);
                                                                        org.spf.data.SPFCrime a104 = a103;
                                                                        int i6 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                        org.spf.data.SPFCrime a105 = a104;
                                                                        i1 = i6;
                                                                        a9 = a105;
                                                                    }
                                                                }
                                                            }
                                                            else
                                                            {
                                                                org.spf.data.SPFCrime a106 = a56;
                                                                org.spf.data.SPFCrime a107 = a106;
                                                                org.spf.data.SPFCrime a108 = a106;
                                                                if(a106 == null)
                                                                {
                                                                    i1 = 2;
                                                                    a9 = a108;
                                                                }
                                                                else
                                                                {
                                                                    org.spf.data.SPFCrime a109 = a107;
                                                                    org.spf.data.SPFCluster a110 = this.getCluster((org.xmlpull.v1.XmlPullParser)a0);
                                                                    org.spf.data.SPFCrime a111 = a109;
                                                                    a109.setCluster(a110);
                                                                    org.spf.data.SPFCrime a112 = a111;
                                                                    int i7 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                    org.spf.data.SPFCrime a113 = a112;
                                                                    i1 = i7;
                                                                    a9 = a113;
                                                                }
                                                            }
                                                        }
                                                        else
                                                        {
                                                            org.spf.data.SPFCrime a114 = a52;
                                                            org.spf.data.SPFCrime a115 = a114;
                                                            org.spf.data.SPFCrime a116 = a114;
                                                            if(a114 == null)
                                                            {
                                                                i1 = 2;
                                                                a9 = a116;
                                                            }
                                                            else
                                                            {
                                                                org.spf.data.SPFCrime a117 = a115;
                                                                String s4 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                                org.spf.data.SPFCrime a118 = a117;
                                                                a117.setTitle(s4);
                                                                org.spf.data.SPFCrime a119 = a118;
                                                                i1 = 2;
                                                                a9 = a119;
                                                            }
                                                        }
                                                    }
                                                    else
                                                    {
                                                        org.spf.data.SPFCrime a120 = a48;
                                                        org.spf.data.SPFCrime a121 = a120;
                                                        org.spf.data.SPFCrime a122 = a120;
                                                        if(a120 == null)
                                                        {
                                                            i1 = 2;
                                                            a9 = a122;
                                                        }
                                                        else
                                                        {
                                                            org.spf.data.SPFCrime a123 = a121;
                                                            String s5 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                            org.spf.data.SPFCrime a124 = a123;
                                                            a123.setThumburl(s5);
                                                            org.spf.data.SPFCrime a125 = a124;
                                                            i1 = 2;
                                                            a9 = a125;
                                                        }
                                                    }
                                                }
                                                else
                                                {
                                                    org.spf.data.SPFCrime a126 = a44;
                                                    org.spf.data.SPFCrime a127 = a126;
                                                    org.spf.data.SPFCrime a128 = a126;
                                                    if(a126 == null)
                                                    {
                                                        i1 = 2;
                                                        a9 = a128;
                                                    }
                                                    else
                                                    {
                                                        org.spf.data.SPFCrime a129 = a127;
                                                        String s6 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                        org.spf.data.SPFCrime a130 = a129;
                                                        a129.setCrimeDateStr(s6);
                                                        org.spf.data.SPFCrime a131 = a130;
                                                        i1 = 2;
                                                        a9 = a131;
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                org.spf.data.SPFCrime a132 = a40;
                                                org.spf.data.SPFCrime a133 = a132;
                                                org.spf.data.SPFCrime a134 = a132;
                                                if(a132 == null)
                                                {
                                                    i1 = 2;
                                                    a9 = a134;
                                                }
                                                else
                                                {
                                                    org.spf.data.SPFCrime a135 = a133;
                                                    String s7 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                    org.spf.data.SPFCrime a136 = a135;
                                                    a135.setStatus(s7);
                                                    org.spf.data.SPFCrime a137 = a136;
                                                    i1 = 2;
                                                    a9 = a137;
                                                }
                                            }
                                        }
                                        else
                                        {
                                            org.spf.data.SPFCrime a138 = a36;
                                            org.spf.data.SPFCrime a139 = a138;
                                            org.spf.data.SPFCrime a140 = a138;
                                            if(a138 == null)
                                            {
                                                i1 = 2;
                                                a9 = a140;
                                            }
                                            else
                                            {
                                                org.spf.data.SPFCrime a141 = a139;
                                                String s8 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                org.spf.data.SPFCrime a142 = a141;
                                                a141.setImageUrl(s8);
                                                org.spf.data.SPFCrime a143 = a142;
                                                i1 = 2;
                                                a9 = a143;
                                            }
                                        }
                                    }
                                    else
                                    {
                                        org.spf.data.SPFCrime a144 = a32;
                                        org.spf.data.SPFCrime a145 = a144;
                                        org.spf.data.SPFCrime a146 = a144;
                                        if(a144 == null)
                                        {
                                            i1 = 2;
                                            a9 = a146;
                                        }
                                        else
                                        {
                                            org.spf.data.SPFCrime a147 = a145;
                                            String s9 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                            org.spf.data.SPFCrime a148 = a147;
                                            a147.setShortDesc(s9);
                                            org.spf.data.SPFCrime a149 = a148;
                                            i1 = 2;
                                            a9 = a149;
                                        }
                                    }
                                }
                                else
                                {
                                    org.spf.data.SPFCrime a150 = a28;
                                    org.spf.data.SPFCrime a151 = a150;
                                    org.spf.data.SPFCrime a152 = a150;
                                    if(a150 == null)
                                    {
                                        i1 = 2;
                                        a9 = a152;
                                    }
                                    else
                                    {
                                        org.spf.data.SPFCrime a153 = a151;
                                        String s10 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                        org.spf.data.SPFCrime a154 = a153;
                                        a153.setLongDesc(s10);
                                        org.spf.data.SPFCrime a155 = a154;
                                        i1 = 2;
                                        a9 = a155;
                                    }
                                }
                            }
                            else
                            {
                                org.spf.data.SPFCrime a156 = a24;
                                org.spf.data.SPFCrime a157 = a156;
                                org.spf.data.SPFCrime a158 = a156;
                                if(a156 == null)
                                {
                                    i1 = 2;
                                    a9 = a158;
                                }
                                else
                                {
                                    org.spf.data.SPFCrime a159 = a157;
                                    String s11 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                    org.spf.data.SPFCrime a160 = a159;
                                    a159.setDetailedDesc(s11);
                                    org.spf.data.SPFCrime a161 = a160;
                                    i1 = 2;
                                    a9 = a161;
                                }
                            }
                        }
                        else
                        {
                            org.spf.data.SPFCrime a162 = a20;
                            org.spf.data.SPFCrime a163 = a162;
                            org.spf.data.SPFCrime a164 = a162;
                            if(a162 == null)
                            {
                                i1 = 2;
                                a9 = a164;
                            }
                            else
                            {
                                org.spf.data.SPFCrime a165 = a163;
                                String s12 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                org.spf.data.SPFCrime a166 = a165;
                                a165.setLocation(s12);
                                org.spf.data.SPFCrime a167 = a166;
                                i1 = 2;
                                a9 = a167;
                            }
                        }
                    }
                    else
                    {
                        org.spf.data.SPFCrime a168 = new org.spf.data.SPFCrime();
                        String s13 = ((org.xmlpull.v1.XmlPullParser)a0).getAttributeValue(0);
                        a168.setId(s13);
                        i1 = 2;
                        a9 = a168;
                    }
                }
                org.spf.data.SPFCrime a169 = a9;
                org.spf.data.SPFCrime a170 = a9;
                if(i1 != 3)
                {
                    a10 = a170;
                }
                else
                {
                    org.spf.data.SPFCrime a171 = a169;
                    String s14 = ((org.xmlpull.v1.XmlPullParser)a0).getName();
                    org.spf.data.SPFCrime a172 = a171;
                    boolean b14 = "CRIME".equalsIgnoreCase(s14);
                    org.spf.data.SPFCrime a173 = a172;
                    org.spf.data.SPFCrime a174 = a173;
                    org.spf.data.SPFCrime a175 = a173;
                    if(!b14)
                    {
                        a10 = a175;
                    }
                    else
                    {
                        org.spf.data.SPFCrime a176 = a174;
                        org.spf.data.SPFCrime a177 = a176;
                        if(a176 == null)
                        {
                            a10 = a177;
                        }
                        else
                        {
                            a6.add((Object)a176);
                            a10 = null;
                        }
                    }
                }
                int i8 = ((org.xmlpull.v1.XmlPullParser)a0).next();
                org.spf.data.SPFCrime a178 = a10;
                i0 = i8;
                a7 = a178;
            }
            else
            {
                break;
            }
        }
        java.net.HttpURLConnection a179 = this.connection;
        if(a179 != null)
        {
            java.net.HttpURLConnection a180 = this.connection;
            a180.disconnect();
        }
        return a6;
    }
    
    public org.spf.data.SPFArrayList parseDataForNppnpc()
    {
        org.xmlpull.v1.XmlPullParserFactory a = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        Object a0 = a.newPullParser();
        java.net.HttpURLConnection a1 = this.connection;
        String s = this.mUrl;
        java.io.InputStream a2 = org.spf.utils.Utils.getInputStream(a1, s);
        android.util.Xml.Encoding a3 = android.util.Xml.Encoding.UTF_8;
        String s0 = a3.name();
        ((org.xmlpull.v1.XmlPullParser)a0).setInput(a2, s0);
        int i = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
        StringBuilder a4 = new StringBuilder("event:::::::");
        StringBuilder a5 = a4.append(i);
        String s1 = a5.toString();
        android.util.Log.e("SPFXmlPullParser", s1);
        org.spf.data.SPFArrayList a6 = new org.spf.data.SPFArrayList();
        int i0 = i;
        org.spf.data.SPFNppnpc a7 = null;
        while(true)
        {
            org.spf.data.SPFNppnpc a8 = a7;
            if(i0 != 1)
            {
                int i1 = 0;
                org.spf.data.SPFNppnpc a9 = null;
                org.spf.data.SPFNppnpc a10 = null;
                org.spf.data.SPFNppnpc a11 = a8;
                org.spf.data.SPFNppnpc a12 = a11;
                org.spf.data.SPFNppnpc a13 = a11;
                if(i0 != 2)
                {
                    i1 = i0;
                    a9 = a13;
                }
                else
                {
                    org.spf.data.SPFNppnpc a14 = a12;
                    String s2 = ((org.xmlpull.v1.XmlPullParser)a0).getName();
                    org.spf.data.SPFNppnpc a15 = a14;
                    boolean b = "NPPNPC".equalsIgnoreCase(s2);
                    org.spf.data.SPFNppnpc a16 = a15;
                    org.spf.data.SPFNppnpc a17 = a16;
                    if(!b)
                    {
                        org.spf.data.SPFNppnpc a18 = a17;
                        boolean b0 = "NAME".equalsIgnoreCase(s2);
                        org.spf.data.SPFNppnpc a19 = a18;
                        org.spf.data.SPFNppnpc a20 = a19;
                        org.spf.data.SPFNppnpc a21 = a19;
                        if(!b0)
                        {
                            org.spf.data.SPFNppnpc a22 = a21;
                            boolean b1 = "DESCRIPTION".equalsIgnoreCase(s2);
                            org.spf.data.SPFNppnpc a23 = a22;
                            org.spf.data.SPFNppnpc a24 = a23;
                            org.spf.data.SPFNppnpc a25 = a23;
                            if(!b1)
                            {
                                org.spf.data.SPFNppnpc a26 = a25;
                                boolean b2 = "CLOSE_HOUR".equalsIgnoreCase(s2);
                                org.spf.data.SPFNppnpc a27 = a26;
                                org.spf.data.SPFNppnpc a28 = a27;
                                org.spf.data.SPFNppnpc a29 = a27;
                                if(!b2)
                                {
                                    org.spf.data.SPFNppnpc a30 = a29;
                                    boolean b3 = "ADDRESS".equalsIgnoreCase(s2);
                                    org.spf.data.SPFNppnpc a31 = a30;
                                    org.spf.data.SPFNppnpc a32 = a31;
                                    org.spf.data.SPFNppnpc a33 = a31;
                                    if(!b3)
                                    {
                                        org.spf.data.SPFNppnpc a34 = a33;
                                        boolean b4 = "CLOSE_MIN".equalsIgnoreCase(s2);
                                        org.spf.data.SPFNppnpc a35 = a34;
                                        org.spf.data.SPFNppnpc a36 = a35;
                                        org.spf.data.SPFNppnpc a37 = a35;
                                        if(!b4)
                                        {
                                            org.spf.data.SPFNppnpc a38 = a37;
                                            boolean b5 = "STATUS".equalsIgnoreCase(s2);
                                            org.spf.data.SPFNppnpc a39 = a38;
                                            org.spf.data.SPFNppnpc a40 = a39;
                                            org.spf.data.SPFNppnpc a41 = a39;
                                            if(!b5)
                                            {
                                                org.spf.data.SPFNppnpc a42 = a41;
                                                boolean b6 = "OPEN_MIN".equalsIgnoreCase(s2);
                                                org.spf.data.SPFNppnpc a43 = a42;
                                                org.spf.data.SPFNppnpc a44 = a43;
                                                org.spf.data.SPFNppnpc a45 = a43;
                                                if(!b6)
                                                {
                                                    org.spf.data.SPFNppnpc a46 = a45;
                                                    boolean b7 = "ZIP".equalsIgnoreCase(s2);
                                                    org.spf.data.SPFNppnpc a47 = a46;
                                                    org.spf.data.SPFNppnpc a48 = a47;
                                                    org.spf.data.SPFNppnpc a49 = a47;
                                                    if(!b7)
                                                    {
                                                        org.spf.data.SPFNppnpc a50 = a49;
                                                        boolean b8 = "LATTITUDE".equalsIgnoreCase(s2);
                                                        org.spf.data.SPFNppnpc a51 = a50;
                                                        org.spf.data.SPFNppnpc a52 = a51;
                                                        org.spf.data.SPFNppnpc a53 = a51;
                                                        if(!b8)
                                                        {
                                                            org.spf.data.SPFNppnpc a54 = a53;
                                                            boolean b9 = "OPEN_HOUR".equalsIgnoreCase(s2);
                                                            org.spf.data.SPFNppnpc a55 = a54;
                                                            org.spf.data.SPFNppnpc a56 = a55;
                                                            org.spf.data.SPFNppnpc a57 = a55;
                                                            if(!b9)
                                                            {
                                                                org.spf.data.SPFNppnpc a58 = a57;
                                                                boolean b10 = "LONGITUDE".equalsIgnoreCase(s2);
                                                                org.spf.data.SPFNppnpc a59 = a58;
                                                                org.spf.data.SPFNppnpc a60 = a59;
                                                                org.spf.data.SPFNppnpc a61 = a59;
                                                                if(!b10)
                                                                {
                                                                    org.spf.data.SPFNppnpc a62 = a61;
                                                                    boolean b11 = "CONTACT_NUMBER".equalsIgnoreCase(s2);
                                                                    org.spf.data.SPFNppnpc a63 = a62;
                                                                    org.spf.data.SPFNppnpc a64 = a63;
                                                                    org.spf.data.SPFNppnpc a65 = a63;
                                                                    if(!b11)
                                                                    {
                                                                        org.spf.data.SPFNppnpc a66 = a65;
                                                                        boolean b12 = "CLUSTER".equalsIgnoreCase(s2);
                                                                        org.spf.data.SPFNppnpc a67 = a66;
                                                                        org.spf.data.SPFNppnpc a68 = a67;
                                                                        org.spf.data.SPFNppnpc a69 = a67;
                                                                        if(!b12)
                                                                        {
                                                                            org.spf.data.SPFNppnpc a70 = a69;
                                                                            boolean b13 = "ZONE".equalsIgnoreCase(s2);
                                                                            org.spf.data.SPFNppnpc a71 = a70;
                                                                            org.spf.data.SPFNppnpc a72 = a71;
                                                                            org.spf.data.SPFNppnpc a73 = a71;
                                                                            if(!b13)
                                                                            {
                                                                                org.spf.data.SPFNppnpc a74 = a73;
                                                                                boolean b14 = "DISTANCE".equalsIgnoreCase(s2);
                                                                                org.spf.data.SPFNppnpc a75 = a74;
                                                                                org.spf.data.SPFNppnpc a76 = a75;
                                                                                org.spf.data.SPFNppnpc a77 = a75;
                                                                                if(!b14)
                                                                                {
                                                                                    i1 = 2;
                                                                                    a9 = a77;
                                                                                }
                                                                                else
                                                                                {
                                                                                    org.spf.data.SPFNppnpc a78 = a76;
                                                                                    org.spf.data.SPFNppnpc a79 = a78;
                                                                                    org.spf.data.SPFNppnpc a80 = a78;
                                                                                    if(a78 == null)
                                                                                    {
                                                                                        i1 = 2;
                                                                                        a9 = a80;
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        org.spf.data.SPFNppnpc a81 = a79;
                                                                                        String s3 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                                                        org.spf.data.SPFNppnpc a82 = a81;
                                                                                        a81.setDistance(s3);
                                                                                        org.spf.data.SPFNppnpc a83 = a82;
                                                                                        i1 = 2;
                                                                                        a9 = a83;
                                                                                    }
                                                                                }
                                                                            }
                                                                            else
                                                                            {
                                                                                org.spf.data.SPFNppnpc a84 = a72;
                                                                                org.spf.data.SPFNppnpc a85 = a84;
                                                                                org.spf.data.SPFNppnpc a86 = a84;
                                                                                if(a84 == null)
                                                                                {
                                                                                    i1 = 2;
                                                                                    a9 = a86;
                                                                                }
                                                                                else
                                                                                {
                                                                                    org.spf.data.SPFNppnpc a87 = a85;
                                                                                    org.spf.data.SPFZone a88 = this.getZone((org.xmlpull.v1.XmlPullParser)a0);
                                                                                    org.spf.data.SPFNppnpc a89 = a87;
                                                                                    a87.setZone(a88);
                                                                                    org.spf.data.SPFNppnpc a90 = a89;
                                                                                    int i2 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                                    org.spf.data.SPFNppnpc a91 = a90;
                                                                                    i1 = i2;
                                                                                    a9 = a91;
                                                                                }
                                                                            }
                                                                        }
                                                                        else
                                                                        {
                                                                            org.spf.data.SPFNppnpc a92 = a68;
                                                                            org.spf.data.SPFNppnpc a93 = a92;
                                                                            org.spf.data.SPFNppnpc a94 = a92;
                                                                            if(a92 == null)
                                                                            {
                                                                                i1 = 2;
                                                                                a9 = a94;
                                                                            }
                                                                            else
                                                                            {
                                                                                org.spf.data.SPFNppnpc a95 = a93;
                                                                                org.spf.data.SPFCluster a96 = this.getCluster((org.xmlpull.v1.XmlPullParser)a0);
                                                                                org.spf.data.SPFNppnpc a97 = a95;
                                                                                a95.setCluster(a96);
                                                                                org.spf.data.SPFNppnpc a98 = a97;
                                                                                int i3 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                                org.spf.data.SPFNppnpc a99 = a98;
                                                                                i1 = i3;
                                                                                a9 = a99;
                                                                            }
                                                                        }
                                                                    }
                                                                    else
                                                                    {
                                                                        org.spf.data.SPFNppnpc a100 = a64;
                                                                        org.spf.data.SPFNppnpc a101 = a100;
                                                                        org.spf.data.SPFNppnpc a102 = a100;
                                                                        if(a100 == null)
                                                                        {
                                                                            i1 = 2;
                                                                            a9 = a102;
                                                                        }
                                                                        else
                                                                        {
                                                                            org.spf.data.SPFNppnpc a103 = a101;
                                                                            String s4 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                                            org.spf.data.SPFNppnpc a104 = a103;
                                                                            a103.setContactNumber(s4);
                                                                            org.spf.data.SPFNppnpc a105 = a104;
                                                                            i1 = 2;
                                                                            a9 = a105;
                                                                        }
                                                                    }
                                                                }
                                                                else
                                                                {
                                                                    org.spf.data.SPFNppnpc a106 = a60;
                                                                    org.spf.data.SPFNppnpc a107 = a106;
                                                                    org.spf.data.SPFNppnpc a108 = a106;
                                                                    if(a106 == null)
                                                                    {
                                                                        i1 = 2;
                                                                        a9 = a108;
                                                                    }
                                                                    else
                                                                    {
                                                                        org.spf.data.SPFNppnpc a109 = a107;
                                                                        String s5 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                                        org.spf.data.SPFNppnpc a110 = a109;
                                                                        a109.setLongitude(s5);
                                                                        org.spf.data.SPFNppnpc a111 = a110;
                                                                        i1 = 2;
                                                                        a9 = a111;
                                                                    }
                                                                }
                                                            }
                                                            else
                                                            {
                                                                org.spf.data.SPFNppnpc a112 = a56;
                                                                org.spf.data.SPFNppnpc a113 = a112;
                                                                org.spf.data.SPFNppnpc a114 = a112;
                                                                if(a112 == null)
                                                                {
                                                                    i1 = 2;
                                                                    a9 = a114;
                                                                }
                                                                else
                                                                {
                                                                    org.spf.data.SPFNppnpc a115 = a113;
                                                                    String s6 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                                    org.spf.data.SPFNppnpc a116 = a115;
                                                                    a115.setOpenHour(s6);
                                                                    org.spf.data.SPFNppnpc a117 = a116;
                                                                    i1 = 2;
                                                                    a9 = a117;
                                                                }
                                                            }
                                                        }
                                                        else
                                                        {
                                                            org.spf.data.SPFNppnpc a118 = a52;
                                                            org.spf.data.SPFNppnpc a119 = a118;
                                                            org.spf.data.SPFNppnpc a120 = a118;
                                                            if(a118 == null)
                                                            {
                                                                i1 = 2;
                                                                a9 = a120;
                                                            }
                                                            else
                                                            {
                                                                org.spf.data.SPFNppnpc a121 = a119;
                                                                String s7 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                                org.spf.data.SPFNppnpc a122 = a121;
                                                                a121.setLatitude(s7);
                                                                org.spf.data.SPFNppnpc a123 = a122;
                                                                i1 = 2;
                                                                a9 = a123;
                                                            }
                                                        }
                                                    }
                                                    else
                                                    {
                                                        org.spf.data.SPFNppnpc a124 = a48;
                                                        org.spf.data.SPFNppnpc a125 = a124;
                                                        org.spf.data.SPFNppnpc a126 = a124;
                                                        if(a124 == null)
                                                        {
                                                            i1 = 2;
                                                            a9 = a126;
                                                        }
                                                        else
                                                        {
                                                            org.spf.data.SPFNppnpc a127 = a125;
                                                            String s8 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                            org.spf.data.SPFNppnpc a128 = a127;
                                                            a127.setZip(s8);
                                                            org.spf.data.SPFNppnpc a129 = a128;
                                                            i1 = 2;
                                                            a9 = a129;
                                                        }
                                                    }
                                                }
                                                else
                                                {
                                                    org.spf.data.SPFNppnpc a130 = a44;
                                                    org.spf.data.SPFNppnpc a131 = a130;
                                                    org.spf.data.SPFNppnpc a132 = a130;
                                                    if(a130 == null)
                                                    {
                                                        i1 = 2;
                                                        a9 = a132;
                                                    }
                                                    else
                                                    {
                                                        org.spf.data.SPFNppnpc a133 = a131;
                                                        String s9 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                        org.spf.data.SPFNppnpc a134 = a133;
                                                        a133.setOpenMin(s9);
                                                        org.spf.data.SPFNppnpc a135 = a134;
                                                        i1 = 2;
                                                        a9 = a135;
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                org.spf.data.SPFNppnpc a136 = a40;
                                                org.spf.data.SPFNppnpc a137 = a136;
                                                org.spf.data.SPFNppnpc a138 = a136;
                                                if(a136 == null)
                                                {
                                                    i1 = 2;
                                                    a9 = a138;
                                                }
                                                else
                                                {
                                                    org.spf.data.SPFNppnpc a139 = a137;
                                                    String s10 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                    org.spf.data.SPFNppnpc a140 = a139;
                                                    a139.setStatus(s10);
                                                    org.spf.data.SPFNppnpc a141 = a140;
                                                    i1 = 2;
                                                    a9 = a141;
                                                }
                                            }
                                        }
                                        else
                                        {
                                            org.spf.data.SPFNppnpc a142 = a36;
                                            org.spf.data.SPFNppnpc a143 = a142;
                                            org.spf.data.SPFNppnpc a144 = a142;
                                            if(a142 == null)
                                            {
                                                i1 = 2;
                                                a9 = a144;
                                            }
                                            else
                                            {
                                                org.spf.data.SPFNppnpc a145 = a143;
                                                String s11 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                org.spf.data.SPFNppnpc a146 = a145;
                                                a145.setCloseMin(s11);
                                                org.spf.data.SPFNppnpc a147 = a146;
                                                i1 = 2;
                                                a9 = a147;
                                            }
                                        }
                                    }
                                    else
                                    {
                                        org.spf.data.SPFNppnpc a148 = a32;
                                        org.spf.data.SPFNppnpc a149 = a148;
                                        org.spf.data.SPFNppnpc a150 = a148;
                                        if(a148 == null)
                                        {
                                            i1 = 2;
                                            a9 = a150;
                                        }
                                        else
                                        {
                                            org.spf.data.SPFNppnpc a151 = a149;
                                            String s12 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                            org.spf.data.SPFNppnpc a152 = a151;
                                            a151.setAddress(s12);
                                            org.spf.data.SPFNppnpc a153 = a152;
                                            i1 = 2;
                                            a9 = a153;
                                        }
                                    }
                                }
                                else
                                {
                                    org.spf.data.SPFNppnpc a154 = a28;
                                    org.spf.data.SPFNppnpc a155 = a154;
                                    org.spf.data.SPFNppnpc a156 = a154;
                                    if(a154 == null)
                                    {
                                        i1 = 2;
                                        a9 = a156;
                                    }
                                    else
                                    {
                                        org.spf.data.SPFNppnpc a157 = a155;
                                        String s13 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                        org.spf.data.SPFNppnpc a158 = a157;
                                        a157.setCloseHours(s13);
                                        org.spf.data.SPFNppnpc a159 = a158;
                                        i1 = 2;
                                        a9 = a159;
                                    }
                                }
                            }
                            else
                            {
                                org.spf.data.SPFNppnpc a160 = a24;
                                org.spf.data.SPFNppnpc a161 = a160;
                                org.spf.data.SPFNppnpc a162 = a160;
                                if(a160 == null)
                                {
                                    i1 = 2;
                                    a9 = a162;
                                }
                                else
                                {
                                    org.spf.data.SPFNppnpc a163 = a161;
                                    String s14 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                    org.spf.data.SPFNppnpc a164 = a163;
                                    a163.setDescription(s14);
                                    org.spf.data.SPFNppnpc a165 = a164;
                                    i1 = 2;
                                    a9 = a165;
                                }
                            }
                        }
                        else
                        {
                            org.spf.data.SPFNppnpc a166 = null;
                            org.spf.data.SPFNppnpc a167 = a20;
                            org.spf.data.SPFNppnpc a168 = a167;
                            org.spf.data.SPFNppnpc a169 = a167;
                            if(a167 == null)
                            {
                                a166 = a169;
                            }
                            else
                            {
                                org.spf.data.SPFNppnpc a170 = a168;
                                String s15 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                org.spf.data.SPFNppnpc a171 = a170;
                                a170.setName(s15);
                                a166 = a171;
                            }
                            org.spf.data.SPFNppnpc a172 = a166;
                            StringBuilder a173 = new StringBuilder("Area:::::");
                            org.spf.data.SPFNppnpc a174 = a172;
                            String s16 = a174.getName();
                            org.spf.data.SPFNppnpc a175 = a174;
                            StringBuilder a176 = a173.append(s16);
                            org.spf.data.SPFNppnpc a177 = a175;
                            String s17 = a176.toString();
                            org.spf.data.SPFNppnpc a178 = a177;
                            android.util.Log.e("data", s17);
                            org.spf.data.SPFNppnpc a179 = a178;
                            i1 = 2;
                            a9 = a179;
                        }
                    }
                    else
                    {
                        org.spf.data.SPFNppnpc a180 = new org.spf.data.SPFNppnpc();
                        String s18 = ((org.xmlpull.v1.XmlPullParser)a0).getAttributeValue(0);
                        a180.setId(s18);
                        i1 = 2;
                        a9 = a180;
                    }
                }
                org.spf.data.SPFNppnpc a181 = a9;
                org.spf.data.SPFNppnpc a182 = a9;
                if(i1 != 3)
                {
                    a10 = a182;
                }
                else
                {
                    org.spf.data.SPFNppnpc a183 = a181;
                    String s19 = ((org.xmlpull.v1.XmlPullParser)a0).getName();
                    org.spf.data.SPFNppnpc a184 = a183;
                    boolean b15 = "NPPNPC".equalsIgnoreCase(s19);
                    org.spf.data.SPFNppnpc a185 = a184;
                    org.spf.data.SPFNppnpc a186 = a185;
                    org.spf.data.SPFNppnpc a187 = a185;
                    if(!b15)
                    {
                        a10 = a187;
                    }
                    else
                    {
                        org.spf.data.SPFNppnpc a188 = a186;
                        org.spf.data.SPFNppnpc a189 = a188;
                        org.spf.data.SPFNppnpc a190 = a188;
                        if(a188 == null)
                        {
                            a10 = a190;
                        }
                        else
                        {
                            org.spf.data.SPFNppnpc a191 = a189;
                            a6.add((Object)a191);
                            org.spf.data.SPFNppnpc a192 = a191;
                            a10 = a192;
                        }
                    }
                }
                int i4 = ((org.xmlpull.v1.XmlPullParser)a0).next();
                org.spf.data.SPFNppnpc a193 = a10;
                i0 = i4;
                a7 = a193;
            }
            else
            {
                break;
            }
        }
        java.net.HttpURLConnection a194 = this.connection;
        if(a194 != null)
        {
            java.net.HttpURLConnection a195 = this.connection;
            a195.disconnect();
        }
        return a6;
    }
    
    public org.spf.data.SPFArrayList parseDataForPoliceAppeal()
    {
        org.xmlpull.v1.XmlPullParserFactory a = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        Object a0 = a.newPullParser();
        java.net.HttpURLConnection a1 = this.connection;
        String s = this.mUrl;
        java.io.InputStream a2 = org.spf.utils.Utils.getInputStream(a1, s);
        android.util.Xml.Encoding a3 = android.util.Xml.Encoding.UTF_8;
        String s0 = a3.name();
        ((org.xmlpull.v1.XmlPullParser)a0).setInput(a2, s0);
        int i = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
        org.spf.data.SPFArrayList a4 = new org.spf.data.SPFArrayList();
        int i0 = i;
        org.spf.data.SPFAppeal a5 = null;
        while(true)
        {
            org.spf.data.SPFAppeal a6 = a5;
            if(i0 != 1)
            {
                int i1 = 0;
                org.spf.data.SPFAppeal a7 = null;
                org.spf.data.SPFAppeal a8 = null;
                org.spf.data.SPFAppeal a9 = a6;
                org.spf.data.SPFAppeal a10 = a9;
                org.spf.data.SPFAppeal a11 = a9;
                if(i0 != 2)
                {
                    i1 = i0;
                    a7 = a11;
                }
                else
                {
                    org.spf.data.SPFAppeal a12 = a10;
                    String s1 = ((org.xmlpull.v1.XmlPullParser)a0).getName();
                    org.spf.data.SPFAppeal a13 = a12;
                    boolean b = "APPEAL".equalsIgnoreCase(s1);
                    org.spf.data.SPFAppeal a14 = a13;
                    org.spf.data.SPFAppeal a15 = a14;
                    if(!b)
                    {
                        org.spf.data.SPFAppeal a16 = a15;
                        boolean b0 = "LOCATION".equalsIgnoreCase(s1);
                        org.spf.data.SPFAppeal a17 = a16;
                        org.spf.data.SPFAppeal a18 = a17;
                        org.spf.data.SPFAppeal a19 = a17;
                        if(!b0)
                        {
                            org.spf.data.SPFAppeal a20 = a19;
                            boolean b1 = "DETAILED_DESCRIPTION".equalsIgnoreCase(s1);
                            org.spf.data.SPFAppeal a21 = a20;
                            org.spf.data.SPFAppeal a22 = a21;
                            org.spf.data.SPFAppeal a23 = a21;
                            if(!b1)
                            {
                                org.spf.data.SPFAppeal a24 = a23;
                                boolean b2 = "LONG_DESCRIPTION".equalsIgnoreCase(s1);
                                org.spf.data.SPFAppeal a25 = a24;
                                org.spf.data.SPFAppeal a26 = a25;
                                org.spf.data.SPFAppeal a27 = a25;
                                if(!b2)
                                {
                                    org.spf.data.SPFAppeal a28 = a27;
                                    boolean b3 = "SHORT_DESCRIPTION".equalsIgnoreCase(s1);
                                    org.spf.data.SPFAppeal a29 = a28;
                                    org.spf.data.SPFAppeal a30 = a29;
                                    org.spf.data.SPFAppeal a31 = a29;
                                    if(!b3)
                                    {
                                        org.spf.data.SPFAppeal a32 = a31;
                                        boolean b4 = "IMAGEURL".equalsIgnoreCase(s1);
                                        org.spf.data.SPFAppeal a33 = a32;
                                        org.spf.data.SPFAppeal a34 = a33;
                                        org.spf.data.SPFAppeal a35 = a33;
                                        if(!b4)
                                        {
                                            org.spf.data.SPFAppeal a36 = a35;
                                            boolean b5 = "STATUS".equalsIgnoreCase(s1);
                                            org.spf.data.SPFAppeal a37 = a36;
                                            org.spf.data.SPFAppeal a38 = a37;
                                            org.spf.data.SPFAppeal a39 = a37;
                                            if(!b5)
                                            {
                                                org.spf.data.SPFAppeal a40 = a39;
                                                boolean b6 = "CRIME_DATE_STR".equalsIgnoreCase(s1);
                                                org.spf.data.SPFAppeal a41 = a40;
                                                org.spf.data.SPFAppeal a42 = a41;
                                                org.spf.data.SPFAppeal a43 = a41;
                                                if(!b6)
                                                {
                                                    org.spf.data.SPFAppeal a44 = a43;
                                                    boolean b7 = "THUMBURL".equalsIgnoreCase(s1);
                                                    org.spf.data.SPFAppeal a45 = a44;
                                                    org.spf.data.SPFAppeal a46 = a45;
                                                    org.spf.data.SPFAppeal a47 = a45;
                                                    if(!b7)
                                                    {
                                                        org.spf.data.SPFAppeal a48 = a47;
                                                        boolean b8 = "TITLE".equalsIgnoreCase(s1);
                                                        org.spf.data.SPFAppeal a49 = a48;
                                                        org.spf.data.SPFAppeal a50 = a49;
                                                        org.spf.data.SPFAppeal a51 = a49;
                                                        if(!b8)
                                                        {
                                                            org.spf.data.SPFAppeal a52 = a51;
                                                            boolean b9 = "CLUSTER".equalsIgnoreCase(s1);
                                                            org.spf.data.SPFAppeal a53 = a52;
                                                            org.spf.data.SPFAppeal a54 = a53;
                                                            org.spf.data.SPFAppeal a55 = a53;
                                                            if(!b9)
                                                            {
                                                                org.spf.data.SPFAppeal a56 = a55;
                                                                boolean b10 = "CATEGORY".equalsIgnoreCase(s1);
                                                                org.spf.data.SPFAppeal a57 = a56;
                                                                org.spf.data.SPFAppeal a58 = a57;
                                                                org.spf.data.SPFAppeal a59 = a57;
                                                                if(!b10)
                                                                {
                                                                    org.spf.data.SPFAppeal a60 = a59;
                                                                    boolean b11 = "FOOTER_IMAGE".equalsIgnoreCase(s1);
                                                                    org.spf.data.SPFAppeal a61 = a60;
                                                                    org.spf.data.SPFAppeal a62 = a61;
                                                                    org.spf.data.SPFAppeal a63 = a61;
                                                                    if(!b11)
                                                                    {
                                                                        org.spf.data.SPFAppeal a64 = a63;
                                                                        boolean b12 = "ZONE".equalsIgnoreCase(s1);
                                                                        org.spf.data.SPFAppeal a65 = a64;
                                                                        org.spf.data.SPFAppeal a66 = a65;
                                                                        org.spf.data.SPFAppeal a67 = a65;
                                                                        if(!b12)
                                                                        {
                                                                            org.spf.data.SPFAppeal a68 = a67;
                                                                            boolean b13 = "IMAGE_PATH".equalsIgnoreCase(s1);
                                                                            org.spf.data.SPFAppeal a69 = a68;
                                                                            org.spf.data.SPFAppeal a70 = a69;
                                                                            org.spf.data.SPFAppeal a71 = a69;
                                                                            if(!b13)
                                                                            {
                                                                                i1 = 2;
                                                                                a7 = a71;
                                                                            }
                                                                            else
                                                                            {
                                                                                org.spf.data.SPFAppeal a72 = a70;
                                                                                org.spf.data.SPFAppeal a73 = a72;
                                                                                if(a72 == null)
                                                                                {
                                                                                    org.spf.data.SPFImagePath a74 = this.getImagePath((org.xmlpull.v1.XmlPullParser)a0);
                                                                                    a4.setPath(a74);
                                                                                    int i2 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                                    i1 = i2;
                                                                                    a7 = null;
                                                                                }
                                                                                else
                                                                                {
                                                                                    org.spf.data.SPFAppeal a75 = a73;
                                                                                    org.spf.data.SPFImagePath a76 = this.getImagePath((org.xmlpull.v1.XmlPullParser)a0);
                                                                                    org.spf.data.SPFAppeal a77 = a75;
                                                                                    a75.setImagePath(a76);
                                                                                    org.spf.data.SPFAppeal a78 = a77;
                                                                                    int i3 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                                    org.spf.data.SPFAppeal a79 = a78;
                                                                                    i1 = i3;
                                                                                    a7 = a79;
                                                                                }
                                                                            }
                                                                        }
                                                                        else
                                                                        {
                                                                            org.spf.data.SPFAppeal a80 = a66;
                                                                            org.spf.data.SPFAppeal a81 = a80;
                                                                            org.spf.data.SPFAppeal a82 = a80;
                                                                            if(a80 == null)
                                                                            {
                                                                                i1 = 2;
                                                                                a7 = a82;
                                                                            }
                                                                            else
                                                                            {
                                                                                org.spf.data.SPFAppeal a83 = a81;
                                                                                org.spf.data.SPFZone a84 = this.getZone((org.xmlpull.v1.XmlPullParser)a0);
                                                                                org.spf.data.SPFAppeal a85 = a83;
                                                                                a83.setZone(a84);
                                                                                org.spf.data.SPFAppeal a86 = a85;
                                                                                int i4 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                                org.spf.data.SPFAppeal a87 = a86;
                                                                                i1 = i4;
                                                                                a7 = a87;
                                                                            }
                                                                        }
                                                                    }
                                                                    else
                                                                    {
                                                                        org.spf.data.SPFAppeal a88 = a62;
                                                                        org.spf.data.SPFAppeal a89 = a88;
                                                                        org.spf.data.SPFAppeal a90 = a88;
                                                                        if(a88 == null)
                                                                        {
                                                                            i1 = 2;
                                                                            a7 = a90;
                                                                        }
                                                                        else
                                                                        {
                                                                            org.spf.data.SPFAppeal a91 = a89;
                                                                            org.spf.data.SPFFooter a92 = this.getFooter((org.xmlpull.v1.XmlPullParser)a0);
                                                                            org.spf.data.SPFAppeal a93 = a91;
                                                                            a91.setFooterData(a92);
                                                                            org.spf.data.SPFAppeal a94 = a93;
                                                                            int i5 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                            org.spf.data.SPFAppeal a95 = a94;
                                                                            i1 = i5;
                                                                            a7 = a95;
                                                                        }
                                                                    }
                                                                }
                                                                else
                                                                {
                                                                    org.spf.data.SPFAppeal a96 = a58;
                                                                    org.spf.data.SPFAppeal a97 = a96;
                                                                    org.spf.data.SPFAppeal a98 = a96;
                                                                    if(a96 == null)
                                                                    {
                                                                        i1 = 2;
                                                                        a7 = a98;
                                                                    }
                                                                    else
                                                                    {
                                                                        org.spf.data.SPFAppeal a99 = a97;
                                                                        org.spf.data.SPFCategory a100 = this.getCategory((org.xmlpull.v1.XmlPullParser)a0);
                                                                        org.spf.data.SPFAppeal a101 = a99;
                                                                        a99.setCategory(a100);
                                                                        org.spf.data.SPFAppeal a102 = a101;
                                                                        int i6 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                        org.spf.data.SPFAppeal a103 = a102;
                                                                        i1 = i6;
                                                                        a7 = a103;
                                                                    }
                                                                }
                                                            }
                                                            else
                                                            {
                                                                org.spf.data.SPFAppeal a104 = a54;
                                                                org.spf.data.SPFAppeal a105 = a104;
                                                                org.spf.data.SPFAppeal a106 = a104;
                                                                if(a104 == null)
                                                                {
                                                                    i1 = 2;
                                                                    a7 = a106;
                                                                }
                                                                else
                                                                {
                                                                    org.spf.data.SPFAppeal a107 = a105;
                                                                    org.spf.data.SPFCluster a108 = this.getCluster((org.xmlpull.v1.XmlPullParser)a0);
                                                                    org.spf.data.SPFAppeal a109 = a107;
                                                                    a107.setCluster(a108);
                                                                    org.spf.data.SPFAppeal a110 = a109;
                                                                    int i7 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                                                    org.spf.data.SPFAppeal a111 = a110;
                                                                    i1 = i7;
                                                                    a7 = a111;
                                                                }
                                                            }
                                                        }
                                                        else
                                                        {
                                                            org.spf.data.SPFAppeal a112 = a50;
                                                            org.spf.data.SPFAppeal a113 = a112;
                                                            org.spf.data.SPFAppeal a114 = a112;
                                                            if(a112 == null)
                                                            {
                                                                i1 = 2;
                                                                a7 = a114;
                                                            }
                                                            else
                                                            {
                                                                org.spf.data.SPFAppeal a115 = a113;
                                                                String s2 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                                org.spf.data.SPFAppeal a116 = a115;
                                                                a115.setTitle(s2);
                                                                org.spf.data.SPFAppeal a117 = a116;
                                                                i1 = 2;
                                                                a7 = a117;
                                                            }
                                                        }
                                                    }
                                                    else
                                                    {
                                                        org.spf.data.SPFAppeal a118 = a46;
                                                        org.spf.data.SPFAppeal a119 = a118;
                                                        org.spf.data.SPFAppeal a120 = a118;
                                                        if(a118 == null)
                                                        {
                                                            i1 = 2;
                                                            a7 = a120;
                                                        }
                                                        else
                                                        {
                                                            org.spf.data.SPFAppeal a121 = a119;
                                                            String s3 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                            org.spf.data.SPFAppeal a122 = a121;
                                                            a121.setThumburl(s3);
                                                            org.spf.data.SPFAppeal a123 = a122;
                                                            i1 = 2;
                                                            a7 = a123;
                                                        }
                                                    }
                                                }
                                                else
                                                {
                                                    org.spf.data.SPFAppeal a124 = a42;
                                                    org.spf.data.SPFAppeal a125 = a124;
                                                    org.spf.data.SPFAppeal a126 = a124;
                                                    if(a124 == null)
                                                    {
                                                        i1 = 2;
                                                        a7 = a126;
                                                    }
                                                    else
                                                    {
                                                        org.spf.data.SPFAppeal a127 = a125;
                                                        String s4 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                        org.spf.data.SPFAppeal a128 = a127;
                                                        a127.setCrimeDateStr(s4);
                                                        org.spf.data.SPFAppeal a129 = a128;
                                                        i1 = 2;
                                                        a7 = a129;
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                org.spf.data.SPFAppeal a130 = a38;
                                                org.spf.data.SPFAppeal a131 = a130;
                                                org.spf.data.SPFAppeal a132 = a130;
                                                if(a130 == null)
                                                {
                                                    i1 = 2;
                                                    a7 = a132;
                                                }
                                                else
                                                {
                                                    org.spf.data.SPFAppeal a133 = a131;
                                                    String s5 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                    org.spf.data.SPFAppeal a134 = a133;
                                                    a133.setStatus(s5);
                                                    org.spf.data.SPFAppeal a135 = a134;
                                                    i1 = 2;
                                                    a7 = a135;
                                                }
                                            }
                                        }
                                        else
                                        {
                                            org.spf.data.SPFAppeal a136 = a34;
                                            org.spf.data.SPFAppeal a137 = a136;
                                            org.spf.data.SPFAppeal a138 = a136;
                                            if(a136 == null)
                                            {
                                                i1 = 2;
                                                a7 = a138;
                                            }
                                            else
                                            {
                                                org.spf.data.SPFAppeal a139 = a137;
                                                String s6 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                                org.spf.data.SPFAppeal a140 = a139;
                                                a139.setImageUrl(s6);
                                                org.spf.data.SPFAppeal a141 = a140;
                                                i1 = 2;
                                                a7 = a141;
                                            }
                                        }
                                    }
                                    else
                                    {
                                        org.spf.data.SPFAppeal a142 = a30;
                                        org.spf.data.SPFAppeal a143 = a142;
                                        org.spf.data.SPFAppeal a144 = a142;
                                        if(a142 == null)
                                        {
                                            i1 = 2;
                                            a7 = a144;
                                        }
                                        else
                                        {
                                            org.spf.data.SPFAppeal a145 = a143;
                                            String s7 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                            org.spf.data.SPFAppeal a146 = a145;
                                            a145.setShortDesc(s7);
                                            org.spf.data.SPFAppeal a147 = a146;
                                            i1 = 2;
                                            a7 = a147;
                                        }
                                    }
                                }
                                else
                                {
                                    org.spf.data.SPFAppeal a148 = a26;
                                    org.spf.data.SPFAppeal a149 = a148;
                                    org.spf.data.SPFAppeal a150 = a148;
                                    if(a148 == null)
                                    {
                                        i1 = 2;
                                        a7 = a150;
                                    }
                                    else
                                    {
                                        org.spf.data.SPFAppeal a151 = a149;
                                        String s8 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                        org.spf.data.SPFAppeal a152 = a151;
                                        a151.setLongDesc(s8);
                                        org.spf.data.SPFAppeal a153 = a152;
                                        i1 = 2;
                                        a7 = a153;
                                    }
                                }
                            }
                            else
                            {
                                org.spf.data.SPFAppeal a154 = a22;
                                org.spf.data.SPFAppeal a155 = a154;
                                org.spf.data.SPFAppeal a156 = a154;
                                if(a154 == null)
                                {
                                    i1 = 2;
                                    a7 = a156;
                                }
                                else
                                {
                                    org.spf.data.SPFAppeal a157 = a155;
                                    String s9 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                    org.spf.data.SPFAppeal a158 = a157;
                                    a157.setDetailedDesc(s9);
                                    org.spf.data.SPFAppeal a159 = a158;
                                    i1 = 2;
                                    a7 = a159;
                                }
                            }
                        }
                        else
                        {
                            org.spf.data.SPFAppeal a160 = a18;
                            org.spf.data.SPFAppeal a161 = a160;
                            org.spf.data.SPFAppeal a162 = a160;
                            if(a160 == null)
                            {
                                i1 = 2;
                                a7 = a162;
                            }
                            else
                            {
                                org.spf.data.SPFAppeal a163 = a161;
                                String s10 = ((org.xmlpull.v1.XmlPullParser)a0).nextText();
                                org.spf.data.SPFAppeal a164 = a163;
                                a163.setLocation(s10);
                                org.spf.data.SPFAppeal a165 = a164;
                                i1 = 2;
                                a7 = a165;
                            }
                        }
                    }
                    else
                    {
                        org.spf.data.SPFAppeal a166 = new org.spf.data.SPFAppeal();
                        String s11 = ((org.xmlpull.v1.XmlPullParser)a0).getAttributeValue(0);
                        a166.setId(s11);
                        i1 = 2;
                        a7 = a166;
                    }
                }
                org.spf.data.SPFAppeal a167 = a7;
                org.spf.data.SPFAppeal a168 = a7;
                if(i1 != 3)
                {
                    a8 = a168;
                }
                else
                {
                    org.spf.data.SPFAppeal a169 = a167;
                    String s12 = ((org.xmlpull.v1.XmlPullParser)a0).getName();
                    org.spf.data.SPFAppeal a170 = a169;
                    boolean b14 = "APPEAL".equalsIgnoreCase(s12);
                    org.spf.data.SPFAppeal a171 = a170;
                    org.spf.data.SPFAppeal a172 = a171;
                    org.spf.data.SPFAppeal a173 = a171;
                    if(!b14)
                    {
                        a8 = a173;
                    }
                    else
                    {
                        org.spf.data.SPFAppeal a174 = a172;
                        org.spf.data.SPFAppeal a175 = a174;
                        if(a174 == null)
                        {
                            a8 = a175;
                        }
                        else
                        {
                            a4.add((Object)a174);
                            a8 = null;
                        }
                    }
                }
                int i8 = ((org.xmlpull.v1.XmlPullParser)a0).next();
                org.spf.data.SPFAppeal a176 = a8;
                i0 = i8;
                a5 = a176;
            }
            else
            {
                break;
            }
        }
        java.net.HttpURLConnection a177 = this.connection;
        if(a177 != null)
        {
            java.net.HttpURLConnection a178 = this.connection;
            a178.disconnect();
        }
        return a4;
    }
    
    public org.spf.data.SPFStatisticsList parseDataForStatistics()
    {
        org.xmlpull.v1.XmlPullParserFactory a = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        Object a0 = a.newPullParser();
        java.net.HttpURLConnection a1 = this.connection;
        String s = this.mUrl;
        java.io.InputStream a2 = org.spf.utils.Utils.getInputStream(a1, s);
        android.util.Xml.Encoding a3 = android.util.Xml.Encoding.UTF_8;
        String s0 = a3.name();
        ((org.xmlpull.v1.XmlPullParser)a0).setInput(a2, s0);
        int i = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
        org.spf.data.SPFStatisticsList a4 = new org.spf.data.SPFStatisticsList();
        org.spf.data.SPFArrayList a5 = new org.spf.data.SPFArrayList();
        int i0 = i;
        org.spf.data.SPFStatistics a6 = null;
        org.spf.data.SPFTimePeriod a7 = null;
        org.spf.data.SPFTimePeriod a8 = null;
        while(true)
        {
            org.spf.data.SPFStatistics a9 = a6;
            org.spf.data.SPFTimePeriod a10 = a7;
            org.spf.data.SPFTimePeriod a11 = a8;
            if(i0 != 1)
            {
                int i1 = 0;
                org.spf.data.SPFStatistics a12 = null;
                org.spf.data.SPFTimePeriod a13 = null;
                org.spf.data.SPFTimePeriod a14 = null;
                org.spf.data.SPFStatistics a15 = null;
                org.spf.data.SPFTimePeriod a16 = null;
                org.spf.data.SPFTimePeriod a17 = null;
                org.spf.data.SPFStatistics a18 = a9;
                org.spf.data.SPFTimePeriod a19 = a10;
                org.spf.data.SPFTimePeriod a20 = a11;
                org.spf.data.SPFStatistics a21 = a18;
                org.spf.data.SPFTimePeriod a22 = a19;
                org.spf.data.SPFTimePeriod a23 = a20;
                org.spf.data.SPFStatistics a24 = a18;
                org.spf.data.SPFTimePeriod a25 = a19;
                org.spf.data.SPFTimePeriod a26 = a20;
                if(i0 != 2)
                {
                    i1 = i0;
                    a12 = a24;
                    a13 = a25;
                    a14 = a26;
                }
                else
                {
                    org.spf.data.SPFStatistics a27 = a21;
                    org.spf.data.SPFTimePeriod a28 = a22;
                    org.spf.data.SPFTimePeriod a29 = a23;
                    String s1 = ((org.xmlpull.v1.XmlPullParser)a0).getName();
                    org.spf.data.SPFStatistics a30 = a27;
                    org.spf.data.SPFTimePeriod a31 = a28;
                    org.spf.data.SPFTimePeriod a32 = a29;
                    boolean b = "STATISTICS".equalsIgnoreCase(s1);
                    org.spf.data.SPFStatistics a33 = a30;
                    org.spf.data.SPFTimePeriod a34 = a31;
                    org.spf.data.SPFTimePeriod a35 = a32;
                    org.spf.data.SPFTimePeriod a36 = a34;
                    org.spf.data.SPFTimePeriod a37 = a35;
                    org.spf.data.SPFStatistics a38 = a33;
                    org.spf.data.SPFTimePeriod a39 = a34;
                    org.spf.data.SPFTimePeriod a40 = a35;
                    if(!b)
                    {
                        org.spf.data.SPFStatistics a41 = a38;
                        org.spf.data.SPFTimePeriod a42 = a39;
                        org.spf.data.SPFTimePeriod a43 = a40;
                        boolean b0 = "FROM".equalsIgnoreCase(s1);
                        org.spf.data.SPFStatistics a44 = a41;
                        org.spf.data.SPFTimePeriod a45 = a42;
                        org.spf.data.SPFTimePeriod a46 = a43;
                        org.spf.data.SPFStatistics a47 = a44;
                        org.spf.data.SPFTimePeriod a48 = a46;
                        org.spf.data.SPFStatistics a49 = a44;
                        org.spf.data.SPFTimePeriod a50 = a45;
                        org.spf.data.SPFTimePeriod a51 = a46;
                        if(!b0)
                        {
                            org.spf.data.SPFStatistics a52 = a49;
                            org.spf.data.SPFTimePeriod a53 = a50;
                            org.spf.data.SPFTimePeriod a54 = a51;
                            boolean b1 = "TO".equalsIgnoreCase(s1);
                            org.spf.data.SPFStatistics a55 = a52;
                            org.spf.data.SPFTimePeriod a56 = a53;
                            org.spf.data.SPFTimePeriod a57 = a54;
                            org.spf.data.SPFStatistics a58 = a55;
                            org.spf.data.SPFTimePeriod a59 = a56;
                            org.spf.data.SPFStatistics a60 = a55;
                            org.spf.data.SPFTimePeriod a61 = a56;
                            org.spf.data.SPFTimePeriod a62 = a57;
                            if(!b1)
                            {
                                i1 = 2;
                                a12 = a60;
                                a13 = a61;
                                a14 = a62;
                            }
                            else
                            {
                                org.spf.data.SPFStatistics a63 = a58;
                                org.spf.data.SPFTimePeriod a64 = a59;
                                org.spf.data.SPFTimePeriod a65 = this.getTimeTo((org.xmlpull.v1.XmlPullParser)a0);
                                org.spf.data.SPFStatistics a66 = a63;
                                org.spf.data.SPFTimePeriod a67 = a64;
                                int i2 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                                org.spf.data.SPFStatistics a68 = a66;
                                org.spf.data.SPFTimePeriod a69 = a67;
                                i1 = i2;
                                a12 = a68;
                                a13 = a69;
                                a14 = a65;
                            }
                        }
                        else
                        {
                            org.spf.data.SPFStatistics a70 = a47;
                            org.spf.data.SPFTimePeriod a71 = a48;
                            org.spf.data.SPFTimePeriod a72 = this.getTimeFrom((org.xmlpull.v1.XmlPullParser)a0);
                            org.spf.data.SPFStatistics a73 = a70;
                            org.spf.data.SPFTimePeriod a74 = a71;
                            int i3 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                            org.spf.data.SPFStatistics a75 = a73;
                            org.spf.data.SPFTimePeriod a76 = a74;
                            i1 = i3;
                            a12 = a75;
                            a13 = a72;
                            a14 = a76;
                        }
                    }
                    else
                    {
                        org.spf.data.SPFTimePeriod a77 = a36;
                        org.spf.data.SPFTimePeriod a78 = a37;
                        org.spf.data.SPFStatistics a79 = this.getStatistics((org.xmlpull.v1.XmlPullParser)a0);
                        org.spf.data.SPFTimePeriod a80 = a77;
                        org.spf.data.SPFTimePeriod a81 = a78;
                        int i4 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                        org.spf.data.SPFTimePeriod a82 = a80;
                        org.spf.data.SPFTimePeriod a83 = a81;
                        i1 = i4;
                        a12 = a79;
                        a13 = a82;
                        a14 = a83;
                    }
                }
                org.spf.data.SPFStatistics a84 = a12;
                org.spf.data.SPFTimePeriod a85 = a13;
                org.spf.data.SPFTimePeriod a86 = a14;
                org.spf.data.SPFStatistics a87 = a12;
                org.spf.data.SPFTimePeriod a88 = a13;
                org.spf.data.SPFTimePeriod a89 = a14;
                if(i1 != 3)
                {
                    a15 = a87;
                    a16 = a88;
                    a17 = a89;
                }
                else
                {
                    org.spf.data.SPFStatistics a90 = a84;
                    org.spf.data.SPFTimePeriod a91 = a85;
                    org.spf.data.SPFTimePeriod a92 = a86;
                    String s2 = ((org.xmlpull.v1.XmlPullParser)a0).getName();
                    org.spf.data.SPFStatistics a93 = a90;
                    org.spf.data.SPFTimePeriod a94 = a91;
                    org.spf.data.SPFTimePeriod a95 = a92;
                    boolean b2 = "STATISTICS".equalsIgnoreCase(s2);
                    org.spf.data.SPFStatistics a96 = a93;
                    org.spf.data.SPFTimePeriod a97 = a94;
                    org.spf.data.SPFTimePeriod a98 = a95;
                    org.spf.data.SPFStatistics a99 = a96;
                    org.spf.data.SPFTimePeriod a100 = a97;
                    org.spf.data.SPFTimePeriod a101 = a98;
                    org.spf.data.SPFStatistics a102 = a96;
                    org.spf.data.SPFTimePeriod a103 = a97;
                    org.spf.data.SPFTimePeriod a104 = a98;
                    if(!b2)
                    {
                        org.spf.data.SPFStatistics a105 = a102;
                        org.spf.data.SPFTimePeriod a106 = a103;
                        org.spf.data.SPFTimePeriod a107 = a104;
                        boolean b3 = "FROM".equalsIgnoreCase(s2);
                        org.spf.data.SPFStatistics a108 = a105;
                        org.spf.data.SPFTimePeriod a109 = a106;
                        org.spf.data.SPFTimePeriod a110 = a107;
                        org.spf.data.SPFStatistics a111 = a108;
                        org.spf.data.SPFTimePeriod a112 = a109;
                        org.spf.data.SPFTimePeriod a113 = a110;
                        org.spf.data.SPFStatistics a114 = a108;
                        org.spf.data.SPFTimePeriod a115 = a109;
                        org.spf.data.SPFTimePeriod a116 = a110;
                        if(!b3)
                        {
                            org.spf.data.SPFStatistics a117 = a114;
                            org.spf.data.SPFTimePeriod a118 = a115;
                            org.spf.data.SPFTimePeriod a119 = a116;
                            boolean b4 = "TO".equalsIgnoreCase(s2);
                            org.spf.data.SPFStatistics a120 = a117;
                            org.spf.data.SPFTimePeriod a121 = a118;
                            org.spf.data.SPFTimePeriod a122 = a119;
                            org.spf.data.SPFStatistics a123 = a120;
                            org.spf.data.SPFTimePeriod a124 = a121;
                            org.spf.data.SPFTimePeriod a125 = a122;
                            org.spf.data.SPFStatistics a126 = a120;
                            org.spf.data.SPFTimePeriod a127 = a121;
                            org.spf.data.SPFTimePeriod a128 = a122;
                            if(!b4)
                            {
                                a15 = a126;
                                a16 = a127;
                                a17 = a128;
                            }
                            else
                            {
                                org.spf.data.SPFStatistics a129 = a123;
                                org.spf.data.SPFTimePeriod a130 = a124;
                                org.spf.data.SPFTimePeriod a131 = a125;
                                org.spf.data.SPFStatistics a132 = a129;
                                org.spf.data.SPFTimePeriod a133 = a130;
                                org.spf.data.SPFTimePeriod a134 = a131;
                                org.spf.data.SPFStatistics a135 = a129;
                                org.spf.data.SPFTimePeriod a136 = a130;
                                org.spf.data.SPFTimePeriod a137 = a131;
                                if(a131 == null)
                                {
                                    a15 = a135;
                                    a16 = a136;
                                    a17 = a137;
                                }
                                else
                                {
                                    org.spf.data.SPFStatistics a138 = a132;
                                    org.spf.data.SPFTimePeriod a139 = a133;
                                    org.spf.data.SPFTimePeriod a140 = a134;
                                    org.spf.data.SPFStatistics a141 = a138;
                                    org.spf.data.SPFTimePeriod a142 = a139;
                                    org.spf.data.SPFTimePeriod a143 = a140;
                                    StringBuilder a144 = new StringBuilder("E Month::");
                                    org.spf.data.SPFStatistics a145 = a141;
                                    org.spf.data.SPFTimePeriod a146 = a142;
                                    org.spf.data.SPFTimePeriod a147 = a143;
                                    String s3 = a147.getMonth();
                                    org.spf.data.SPFStatistics a148 = a145;
                                    org.spf.data.SPFTimePeriod a149 = a146;
                                    org.spf.data.SPFTimePeriod a150 = a147;
                                    StringBuilder a151 = a144.append(s3);
                                    org.spf.data.SPFStatistics a152 = a148;
                                    org.spf.data.SPFTimePeriod a153 = a149;
                                    org.spf.data.SPFTimePeriod a154 = a150;
                                    String s4 = a151.toString();
                                    org.spf.data.SPFStatistics a155 = a152;
                                    org.spf.data.SPFTimePeriod a156 = a153;
                                    org.spf.data.SPFTimePeriod a157 = a154;
                                    android.util.Log.d("SPF", s4);
                                    org.spf.data.SPFStatistics a158 = a155;
                                    org.spf.data.SPFTimePeriod a159 = a156;
                                    org.spf.data.SPFTimePeriod a160 = a157;
                                    org.spf.data.SPFStatistics a161 = a158;
                                    org.spf.data.SPFTimePeriod a162 = a159;
                                    org.spf.data.SPFTimePeriod a163 = a160;
                                    StringBuilder a164 = new StringBuilder("E Year::");
                                    org.spf.data.SPFStatistics a165 = a161;
                                    org.spf.data.SPFTimePeriod a166 = a162;
                                    org.spf.data.SPFTimePeriod a167 = a163;
                                    String s5 = a167.getYear();
                                    org.spf.data.SPFStatistics a168 = a165;
                                    org.spf.data.SPFTimePeriod a169 = a166;
                                    org.spf.data.SPFTimePeriod a170 = a167;
                                    StringBuilder a171 = a164.append(s5);
                                    org.spf.data.SPFStatistics a172 = a168;
                                    org.spf.data.SPFTimePeriod a173 = a169;
                                    org.spf.data.SPFTimePeriod a174 = a170;
                                    String s6 = a171.toString();
                                    org.spf.data.SPFStatistics a175 = a172;
                                    org.spf.data.SPFTimePeriod a176 = a173;
                                    org.spf.data.SPFTimePeriod a177 = a174;
                                    android.util.Log.d("SPF", s6);
                                    org.spf.data.SPFStatistics a178 = a175;
                                    org.spf.data.SPFTimePeriod a179 = a176;
                                    org.spf.data.SPFTimePeriod a180 = a177;
                                    a15 = a178;
                                    a16 = a179;
                                    a17 = a180;
                                }
                            }
                        }
                        else
                        {
                            org.spf.data.SPFStatistics a181 = a111;
                            org.spf.data.SPFTimePeriod a182 = a112;
                            org.spf.data.SPFTimePeriod a183 = a113;
                            org.spf.data.SPFStatistics a184 = a181;
                            org.spf.data.SPFTimePeriod a185 = a182;
                            org.spf.data.SPFTimePeriod a186 = a183;
                            org.spf.data.SPFStatistics a187 = a181;
                            org.spf.data.SPFTimePeriod a188 = a182;
                            org.spf.data.SPFTimePeriod a189 = a183;
                            if(a182 == null)
                            {
                                a15 = a187;
                                a16 = a188;
                                a17 = a189;
                            }
                            else
                            {
                                org.spf.data.SPFStatistics a190 = a184;
                                org.spf.data.SPFTimePeriod a191 = a185;
                                org.spf.data.SPFTimePeriod a192 = a186;
                                org.spf.data.SPFStatistics a193 = a190;
                                org.spf.data.SPFTimePeriod a194 = a191;
                                org.spf.data.SPFTimePeriod a195 = a192;
                                StringBuilder a196 = new StringBuilder("S Month::");
                                org.spf.data.SPFStatistics a197 = a193;
                                org.spf.data.SPFTimePeriod a198 = a194;
                                org.spf.data.SPFTimePeriod a199 = a195;
                                String s7 = a198.getMonth();
                                org.spf.data.SPFStatistics a200 = a197;
                                org.spf.data.SPFTimePeriod a201 = a198;
                                org.spf.data.SPFTimePeriod a202 = a199;
                                StringBuilder a203 = a196.append(s7);
                                org.spf.data.SPFStatistics a204 = a200;
                                org.spf.data.SPFTimePeriod a205 = a201;
                                org.spf.data.SPFTimePeriod a206 = a202;
                                String s8 = a203.toString();
                                org.spf.data.SPFStatistics a207 = a204;
                                org.spf.data.SPFTimePeriod a208 = a205;
                                org.spf.data.SPFTimePeriod a209 = a206;
                                android.util.Log.d("SPF", s8);
                                org.spf.data.SPFStatistics a210 = a207;
                                org.spf.data.SPFTimePeriod a211 = a208;
                                org.spf.data.SPFTimePeriod a212 = a209;
                                org.spf.data.SPFStatistics a213 = a210;
                                org.spf.data.SPFTimePeriod a214 = a211;
                                org.spf.data.SPFTimePeriod a215 = a212;
                                StringBuilder a216 = new StringBuilder("S Year::");
                                org.spf.data.SPFStatistics a217 = a213;
                                org.spf.data.SPFTimePeriod a218 = a214;
                                org.spf.data.SPFTimePeriod a219 = a215;
                                String s9 = a218.getYear();
                                org.spf.data.SPFStatistics a220 = a217;
                                org.spf.data.SPFTimePeriod a221 = a218;
                                org.spf.data.SPFTimePeriod a222 = a219;
                                StringBuilder a223 = a216.append(s9);
                                org.spf.data.SPFStatistics a224 = a220;
                                org.spf.data.SPFTimePeriod a225 = a221;
                                org.spf.data.SPFTimePeriod a226 = a222;
                                String s10 = a223.toString();
                                org.spf.data.SPFStatistics a227 = a224;
                                org.spf.data.SPFTimePeriod a228 = a225;
                                org.spf.data.SPFTimePeriod a229 = a226;
                                android.util.Log.d("SPF", s10);
                                org.spf.data.SPFStatistics a230 = a227;
                                org.spf.data.SPFTimePeriod a231 = a228;
                                org.spf.data.SPFTimePeriod a232 = a229;
                                a15 = a230;
                                a16 = a231;
                                a17 = a232;
                            }
                        }
                    }
                    else
                    {
                        org.spf.data.SPFStatistics a233 = a99;
                        org.spf.data.SPFTimePeriod a234 = a100;
                        org.spf.data.SPFTimePeriod a235 = a101;
                        org.spf.data.SPFStatistics a236 = a233;
                        org.spf.data.SPFTimePeriod a237 = a234;
                        org.spf.data.SPFTimePeriod a238 = a235;
                        org.spf.data.SPFStatistics a239 = a233;
                        org.spf.data.SPFTimePeriod a240 = a234;
                        org.spf.data.SPFTimePeriod a241 = a235;
                        if(a233 == null)
                        {
                            a15 = a239;
                            a16 = a240;
                            a17 = a241;
                        }
                        else
                        {
                            org.spf.data.SPFStatistics a242 = a236;
                            org.spf.data.SPFTimePeriod a243 = a237;
                            org.spf.data.SPFTimePeriod a244 = a238;
                            a5.add((Object)a242);
                            org.spf.data.SPFStatistics a245 = a242;
                            org.spf.data.SPFTimePeriod a246 = a243;
                            org.spf.data.SPFTimePeriod a247 = a244;
                            a15 = a245;
                            a16 = a246;
                            a17 = a247;
                        }
                    }
                }
                int i5 = ((org.xmlpull.v1.XmlPullParser)a0).next();
                org.spf.data.SPFStatistics a248 = a15;
                org.spf.data.SPFTimePeriod a249 = a16;
                org.spf.data.SPFTimePeriod a250 = a17;
                i0 = i5;
                a6 = a248;
                a7 = a249;
                a8 = a250;
            }
            else
            {
                break;
            }
        }
        java.net.HttpURLConnection a251 = this.connection;
        if(a251 != null)
        {
            java.net.HttpURLConnection a252 = this.connection;
            a252.disconnect();
        }
        a4.setArrayStatistics(a5);
        a4.setStartDate(a7);
        a4.setEndDate(a8);
        return a4;
    }
    
    public java.util.ArrayList parseDataForZone()
    {
        org.xmlpull.v1.XmlPullParserFactory a = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        Object a0 = a.newPullParser();
        java.net.HttpURLConnection a1 = this.connection;
        String s = this.mUrl;
        java.io.InputStream a2 = org.spf.utils.Utils.getInputStream(a1, s);
        android.util.Xml.Encoding a3 = android.util.Xml.Encoding.UTF_8;
        String s0 = a3.name();
        ((org.xmlpull.v1.XmlPullParser)a0).setInput(a2, s0);
        int i = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
        java.util.ArrayList a4 = new java.util.ArrayList();
        int i0 = i;
        org.spf.data.SPFZone a5 = null;
        while(true)
        {
            org.spf.data.SPFZone a6 = a5;
            if(i0 != 1)
            {
                int i1 = 0;
                org.spf.data.SPFZone a7 = null;
                org.spf.data.SPFZone a8 = null;
                org.spf.data.SPFZone a9 = a6;
                org.spf.data.SPFZone a10 = a9;
                if(i0 != 2)
                {
                    i1 = i0;
                    a7 = a10;
                }
                else
                {
                    org.spf.data.SPFZone a11 = this.getZone((org.xmlpull.v1.XmlPullParser)a0);
                    int i2 = ((org.xmlpull.v1.XmlPullParser)a0).getEventType();
                    i1 = i2;
                    a7 = a11;
                }
                org.spf.data.SPFZone a12 = a7;
                org.spf.data.SPFZone a13 = a7;
                if(i1 != 3)
                {
                    a8 = a13;
                }
                else
                {
                    org.spf.data.SPFZone a14 = a12;
                    String s1 = ((org.xmlpull.v1.XmlPullParser)a0).getName();
                    org.spf.data.SPFZone a15 = a14;
                    boolean b = "ZONE".equalsIgnoreCase(s1);
                    org.spf.data.SPFZone a16 = a15;
                    org.spf.data.SPFZone a17 = a16;
                    org.spf.data.SPFZone a18 = a16;
                    if(!b)
                    {
                        a8 = a18;
                    }
                    else
                    {
                        org.spf.data.SPFZone a19 = a17;
                        org.spf.data.SPFZone a20 = a19;
                        org.spf.data.SPFZone a21 = a19;
                        if(a19 == null)
                        {
                            a8 = a21;
                        }
                        else
                        {
                            org.spf.data.SPFZone a22 = a20;
                            a4.add((Object)a22);
                            org.spf.data.SPFZone a23 = a22;
                            a8 = a23;
                        }
                    }
                }
                int i3 = ((org.xmlpull.v1.XmlPullParser)a0).next();
                org.spf.data.SPFZone a24 = a8;
                i0 = i3;
                a5 = a24;
            }
            else
            {
                break;
            }
        }
        java.net.HttpURLConnection a25 = this.connection;
        if(a25 != null)
        {
            java.net.HttpURLConnection a26 = this.connection;
            a26.disconnect();
        }
        return a4;
    }
}
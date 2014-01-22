package org.spf.mobi.ui.news;

class 1 extends Thread {
    Thread instance;
    final org.spf.mobi.ui.news.SPFNewsListing this$0;
    
    1(org.spf.mobi.ui.news.SPFNewsListing a)
    {
        this.this$0 = a;
        super();
    }
    
    static org.spf.mobi.ui.news.SPFNewsListing access$0(org.spf.mobi.ui.news.SPFNewsListing.1 a)
    {
        org.spf.mobi.ui.news.SPFNewsListing a0 = a.this$0;
        return a0;
    }
    
    public void run()
    {
        this.instance = this;
        label0: {
            org.xmlpull.v1.XmlPullParserException a = null;
            label1: {
                java.net.MalformedURLException a0 = null;
                try
                {
                    try
                    {
                        try
                        {
                            org.spf.mobi.ui.news.SPFNewsListing a1 = this.this$0;
                            org.spf.utils.Constants.NEWS_CRIME_INFO.URL a2 = org.spf.utils.Constants.NEWS_CRIME_INFO.URL.CRIME_TYPE_LIST;
                            String s = org.spf.utils.Constants.NEWS_CRIME_INFO.URL.getUrl(a2);
                            org.spf.utils.parser.SPFXmlPullParser a3 = new org.spf.utils.parser.SPFXmlPullParser(s);
                            org.spf.data.SPFArrayList a4 = a3.parseDataForCategory();
                            org.spf.mobi.ui.news.SPFNewsListing.access$6(a1, a4);
                            break label0;
                        }
                        catch(java.net.MalformedURLException a5)
                        {
                            a0 = a5;
                        }
                    }
                    catch(org.xmlpull.v1.XmlPullParserException a6)
                    {
                        a = a6;
                        break label1;
                    }
                }
                catch(java.io.IOException a7)
                {
                    org.spf.utils.Constants.ERROR a8 = org.spf.utils.Constants.ERROR.NO_CONNECTION;
                    org.spf.mobi.ui.news.SPFNewsListing a9 = this.this$0;
                    org.spf.mobi.ui.news.SPFNewsListing a10 = this.this$0;
                    android.os.Handler a11 = org.spf.mobi.ui.news.SPFNewsListing.access$3(a10);
                    org.spf.utils.Utils.toastError(a8, (android.content.Context)a9, a11);
                    a7.printStackTrace();
                    break label0;
                }
                org.spf.utils.Constants.ERROR a12 = org.spf.utils.Constants.ERROR.NO_CONNECTION;
                org.spf.mobi.ui.news.SPFNewsListing a13 = this.this$0;
                org.spf.mobi.ui.news.SPFNewsListing a14 = this.this$0;
                android.os.Handler a15 = org.spf.mobi.ui.news.SPFNewsListing.access$3(a14);
                org.spf.utils.Utils.toastError(a12, (android.content.Context)a13, a15);
                a0.printStackTrace();
                break label0;
            }
            org.spf.utils.Constants.ERROR a16 = org.spf.utils.Constants.ERROR.NO_CONNECTION;
            org.spf.mobi.ui.news.SPFNewsListing a17 = this.this$0;
            org.spf.mobi.ui.news.SPFNewsListing a18 = this.this$0;
            android.os.Handler a19 = org.spf.mobi.ui.news.SPFNewsListing.access$3(a18);
            org.spf.utils.Utils.toastError(a16, (android.content.Context)a17, a19);
            a.printStackTrace();
        }
        org.spf.mobi.ui.news.SPFNewsListing a20 = this.this$0;
        android.os.Handler a21 = org.spf.mobi.ui.news.SPFNewsListing.access$3(a20);
        org.spf.mobi.ui.news.SPFNewsListing.1.1 a22 = new org.spf.mobi.ui.news.SPFNewsListing.1.1(this);
        a21.post((Runnable)a22);
    }
}
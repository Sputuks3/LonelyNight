package org.spf.mobi.ui.map;

class 2 extends Thread {
    Thread instance;
    final org.spf.mobi.ui.map.SPFMapPointDetails this$0;
    final private String val$urlStatistics;
    
    2(org.spf.mobi.ui.map.SPFMapPointDetails a, String s)
    {
        this.this$0 = a;
        this.val$urlStatistics = s;
        super();
    }
    
    static org.spf.mobi.ui.map.SPFMapPointDetails access$0(org.spf.mobi.ui.map.SPFMapPointDetails.2 a)
    {
        org.spf.mobi.ui.map.SPFMapPointDetails a0 = a.this$0;
        return a0;
    }
    
    public void run()
    {
        label2: {
            org.xmlpull.v1.XmlPullParserException a = null;
            this.instance = this;
            label1: {
                java.net.MalformedURLException a0 = null;
                label0: try
                {
                    try
                    {
                        try
                        {
                            org.spf.mobi.ui.map.SPFMapPointDetails a1 = this.this$0;
                            String s = this.val$urlStatistics;
                            org.spf.utils.parser.SPFXmlPullParser a2 = new org.spf.utils.parser.SPFXmlPullParser(s);
                            org.spf.data.SPFStatisticsList a3 = a2.parseDataForStatistics();
                            org.spf.mobi.ui.map.SPFMapPointDetails.access$1(a1, a3);
                            org.spf.mobi.ui.map.SPFMapPointDetails a4 = this.this$0;
                            org.spf.mobi.ui.map.SPFMapPointDetails a5 = this.this$0;
                            org.spf.data.SPFStatisticsList a6 = org.spf.mobi.ui.map.SPFMapPointDetails.access$2(a5);
                            org.spf.data.SPFArrayList a7 = a6.getArrayStatistics();
                            org.spf.mobi.ui.map.SPFMapPointDetails.access$3(a4, a7);
                            org.spf.mobi.ui.map.SPFMapPointDetails a8 = this.this$0;
                            android.os.Handler a9 = org.spf.mobi.ui.map.SPFMapPointDetails.access$4(a8);
                            org.spf.mobi.ui.map.SPFMapPointDetails.2.1 a10 = new org.spf.mobi.ui.map.SPFMapPointDetails.2.1(this);
                            a9.post((Runnable)a10);
                        }
                        catch(java.net.MalformedURLException a11)
                        {
                            a0 = a11;
                            break label0;
                        }
                    }
                    catch(org.xmlpull.v1.XmlPullParserException a12)
                    {
                        a = a12;
                        break label1;
                    }
                    break label2;
                }
                catch(java.io.IOException a13)
                {
                    org.spf.utils.Constants.ERROR a14 = org.spf.utils.Constants.ERROR.NO_CONNECTION;
                    org.spf.mobi.ui.map.SPFMapPointDetails a15 = this.this$0;
                    org.spf.mobi.ui.map.SPFMapPointDetails a16 = this.this$0;
                    android.os.Handler a17 = org.spf.mobi.ui.map.SPFMapPointDetails.access$4(a16);
                    org.spf.utils.Utils.toastError(a14, (android.content.Context)a15, a17);
                    a13.printStackTrace();
                    org.spf.mobi.ui.map.SPFMapPointDetails a18 = this.this$0;
                    a18.removeDialog(0);
                    break label2;
                }
                org.spf.utils.Constants.ERROR a19 = org.spf.utils.Constants.ERROR.NO_CONNECTION;
                org.spf.mobi.ui.map.SPFMapPointDetails a20 = this.this$0;
                org.spf.mobi.ui.map.SPFMapPointDetails a21 = this.this$0;
                android.os.Handler a22 = org.spf.mobi.ui.map.SPFMapPointDetails.access$4(a21);
                org.spf.utils.Utils.toastError(a19, (android.content.Context)a20, a22);
                a0.printStackTrace();
                org.spf.mobi.ui.map.SPFMapPointDetails a23 = this.this$0;
                a23.removeDialog(0);
                break label2;
            }
            org.spf.utils.Constants.ERROR a24 = org.spf.utils.Constants.ERROR.NO_CONNECTION;
            org.spf.mobi.ui.map.SPFMapPointDetails a25 = this.this$0;
            org.spf.mobi.ui.map.SPFMapPointDetails a26 = this.this$0;
            android.os.Handler a27 = org.spf.mobi.ui.map.SPFMapPointDetails.access$4(a26);
            org.spf.utils.Utils.toastError(a24, (android.content.Context)a25, a27);
            a.printStackTrace();
            org.spf.mobi.ui.map.SPFMapPointDetails a28 = this.this$0;
            a28.removeDialog(0);
        }
    }
}
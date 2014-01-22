package org.spf.mobi.ui.news;

public class SPFNewsListing extends org.spf.mobi.ui.SPFActivity implements org.spf.utils.Constants, org.spf.mobi.ui.common.SPFIGetFillView, android.widget.AdapterView.OnItemClickListener {
    private static int[] $SWITCH_TABLE$org$spf$utils$Constants$SCREENS;
    private org.spf.data.SPFArrayList arrayList;
    private org.spf.data.SPFArrayList arrayListCrimeType;
    private org.spf.mobi.ui.news.NewsCrimeDetailFill fillCrime;
    private android.widget.ListView listView;
    private android.os.Handler mHandler;
    private org.spf.utils.Constants.SCREENS mScreen;
    private org.spf.utils.parser.SPFXmlPullParser pullParser;
    private Thread thread;
    
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
    
    public SPFNewsListing()
    {
        super();
        this.arrayList = null;
        this.pullParser = null;
        this.fillCrime = null;
        this.thread = null;
    }
    
    static org.spf.utils.parser.SPFXmlPullParser access$0(org.spf.mobi.ui.news.SPFNewsListing a)
    {
        org.spf.utils.parser.SPFXmlPullParser a0 = a.pullParser;
        return a0;
    }
    
    static void access$1(org.spf.mobi.ui.news.SPFNewsListing a, org.spf.data.SPFArrayList a0)
    {
        a.arrayList = a0;
    }
    
    static org.spf.utils.Constants.SCREENS access$10(org.spf.mobi.ui.news.SPFNewsListing a)
    {
        org.spf.utils.Constants.SCREENS a0 = a.mScreen;
        return a0;
    }
    
    static void access$11(org.spf.mobi.ui.news.SPFNewsListing a, org.spf.utils.Constants.SCREENS a0)
    {
        a.doInitialize(a0);
    }
    
    static org.spf.data.SPFArrayList access$2(org.spf.mobi.ui.news.SPFNewsListing a)
    {
        org.spf.data.SPFArrayList a0 = a.arrayList;
        return a0;
    }
    
    static android.os.Handler access$3(org.spf.mobi.ui.news.SPFNewsListing a)
    {
        android.os.Handler a0 = a.mHandler;
        return a0;
    }
    
    static android.widget.ListView access$4(org.spf.mobi.ui.news.SPFNewsListing a)
    {
        android.widget.ListView a0 = a.listView;
        return a0;
    }
    
    static void access$5(org.spf.mobi.ui.news.SPFNewsListing a)
    {
        a.removeLoadDialogError();
    }
    
    static void access$6(org.spf.mobi.ui.news.SPFNewsListing a, org.spf.data.SPFArrayList a0)
    {
        a.arrayListCrimeType = a0;
    }
    
    static org.spf.data.SPFArrayList access$7(org.spf.mobi.ui.news.SPFNewsListing a)
    {
        org.spf.data.SPFArrayList a0 = a.arrayListCrimeType;
        return a0;
    }
    
    static Thread access$8(org.spf.mobi.ui.news.SPFNewsListing a)
    {
        Thread a0 = a.thread;
        return a0;
    }
    
    static void access$9(org.spf.mobi.ui.news.SPFNewsListing a, org.spf.utils.parser.SPFXmlPullParser a0)
    {
        a.pullParser = a0;
    }
    
    private void doInitialize(org.spf.utils.Constants.SCREENS a)
    {
        label3: {
            org.spf.utils.parser.SPFXmlPullParser a0 = this.pullParser;
            label2: {
                label1: {
                    label0: {
                        if(a0 != null)
                        {
                            break label0;
                        }
                        org.spf.data.SPFArrayList a1 = this.arrayList;
                        if(a1 != null)
                        {
                            break label0;
                        }
                        android.content.Intent a2 = this.getIntent();
                        String s = a2.getStringExtra("PASSING_URL");
                        org.spf.utils.parser.SPFXmlPullParser a3 = new org.spf.utils.parser.SPFXmlPullParser(s);
                        this.pullParser = a3;
                        org.spf.mobi.ui.news.SPFNewsListing.LaunchSearchThread a4 = new org.spf.mobi.ui.news.SPFNewsListing.LaunchSearchThread(this, a);
                        a4.start();
                        this.showDialog(0);
                        break label1;
                    }
                    org.spf.utils.parser.SPFXmlPullParser a5 = this.pullParser;
                    if(a5 == null)
                    {
                        break label1;
                    }
                    org.spf.data.SPFArrayList a6 = this.arrayList;
                    if(a6 != null)
                    {
                        break label2;
                    }
                }
                break label3;
            }
            int[] a7 = org.spf.mobi.ui.news.SPFNewsListing.$SWITCH_TABLE$org$spf$utils$Constants$SCREENS();
            int i = a.ordinal();
            int i0 = a7[i];
            switch(i0){
                case 5: {
                    android.view.View a8 = this.findViewById(2131165246);
                    android.widget.TextView dummy = (android.widget.TextView)a8;
                    android.widget.TextView a9 = (android.widget.TextView)a8;
                    a9.setText(2131034117);
                    android.widget.ListView a10 = this.listView;
                    org.spf.data.SPFArrayList a11 = this.arrayList;
                    org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter a12 = new org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter((android.content.Context)this, (java.util.ArrayList)a11);
                    a10.setAdapter((android.widget.ListAdapter)a12);
                    android.widget.ListView a13 = this.listView;
                    a13.setFastScrollEnabled(true);
                }
                case 4: {
                    android.view.View a14 = this.findViewById(2131165246);
                    android.widget.TextView dummy0 = (android.widget.TextView)a14;
                    android.widget.TextView a15 = (android.widget.TextView)a14;
                    a15.setText(2131034116);
                    android.widget.ListView a16 = this.listView;
                    org.spf.data.SPFArrayList a17 = this.arrayList;
                    android.os.Handler a18 = this.mHandler;
                    org.spf.mobi.ui.missing.custom.SPFMissingListAdapter a19 = new org.spf.mobi.ui.missing.custom.SPFMissingListAdapter((android.app.Activity)this, a17, a18);
                    a16.setAdapter((android.widget.ListAdapter)a19);
                    android.widget.ListView a20 = this.listView;
                    a20.setFastScrollEnabled(true);
                }
                case 3: {
                    android.view.View a21 = this.findViewById(2131165246);
                    android.widget.TextView dummy1 = (android.widget.TextView)a21;
                    android.widget.TextView a22 = (android.widget.TextView)a21;
                    a22.setText(2131034115);
                    android.widget.ListView a23 = this.listView;
                    org.spf.data.SPFArrayList a24 = this.arrayList;
                    android.os.Handler a25 = this.mHandler;
                    org.spf.mobi.ui.appeal.custom.SPFPoliceAppealAdapter a26 = new org.spf.mobi.ui.appeal.custom.SPFPoliceAppealAdapter((android.app.Activity)this, a24, a25);
                    a23.setAdapter((android.widget.ListAdapter)a26);
                    android.widget.ListView a27 = this.listView;
                    a27.setFastScrollEnabled(true);
                }
                case 2: {
                    android.util.Log.d("SPF", "News case selected");
                    StringBuilder a28 = new StringBuilder("News arrayList::");
                    org.spf.data.SPFArrayList a29 = this.arrayList;
                    int i1 = a29.size();
                    String s0 = Integer.toString(i1);
                    StringBuilder a30 = a28.append(s0);
                    String s1 = a30.toString();
                    android.util.Log.d("SPF", s1);
                    android.view.View a31 = this.findViewById(2131165246);
                    android.widget.TextView dummy2 = (android.widget.TextView)a31;
                    android.widget.TextView a32 = (android.widget.TextView)a31;
                    a32.setText(2131034114);
                    android.widget.ListView a33 = this.listView;
                    org.spf.data.SPFArrayList a34 = this.arrayList;
                    android.os.Handler a35 = this.mHandler;
                    org.spf.mobi.ui.news.custom.SPFNewsListAdapter a36 = new org.spf.mobi.ui.news.custom.SPFNewsListAdapter((android.app.Activity)this, a34, a35);
                    a33.setAdapter((android.widget.ListAdapter)a36);
                    android.widget.ListView a37 = this.listView;
                    a37.setFastScrollEnabled(true);
                }
            }
        }
    }
    
    private void getNewsTypeList()
    {
        label1: {
            this.showDialog(0, (android.os.Bundle)null);
            Thread a = this.thread;
            label0: {
                if(a == null)
                {
                    break label0;
                }
                Thread a0 = this.thread;
                boolean b = a0.isAlive();
                if(!b)
                {
                    break label0;
                }
                break label1;
            }
            org.spf.mobi.ui.news.SPFNewsListing.1 a1 = new org.spf.mobi.ui.news.SPFNewsListing.1(this);
            this.thread = a1;
            Thread a2 = this.thread;
            a2.start();
        }
    }
    
    private String[] itemsToArray()
    {
        String[] a = null;
        org.spf.data.SPFArrayList a0 = this.arrayListCrimeType;
        String[] a1 = null;
        if(a0 == null)
        {
            a = a1;
        }
        else
        {
            org.spf.data.SPFArrayList a2 = this.arrayListCrimeType;
            int i = a2.size();
            String[] a3 = new String[i];
            int i0 = 0;
            while(true)
            {
                org.spf.data.SPFArrayList a4 = this.arrayListCrimeType;
                int i1 = a4.size();
                if(i0 < i1)
                {
                    org.spf.data.SPFArrayList a5 = this.arrayListCrimeType;
                    Object a6 = a5.get(i0);
                    org.spf.data.SPFCategory dummy = (org.spf.data.SPFCategory)a6;
                    org.spf.data.SPFCategory a7 = (org.spf.data.SPFCategory)a6;
                    String s = a7.getCategoryName();
                    a3[i0] = s;
                    int i2 = i0 + 1;
                    i0 = i2;
                }
                else
                {
                    a = a3;
                    break;
                }
            }
        }
        return a;
    }
    
    private void removeLoadDialogError()
    {
        android.os.Handler a = this.mHandler;
        org.spf.mobi.ui.news.SPFNewsListing.5 a0 = new org.spf.mobi.ui.news.SPFNewsListing.5(this);
        a.post((Runnable)a0);
    }
    
    public void call(android.view.View a)
    {
        android.view.View a0 = a.findViewById(2131165352);
        Object a1 = a0.getTag();
        String dummy = (String)a1;
        String s = (String)a1;
        try
        {
            StringBuilder a2 = new StringBuilder("Phone Number ");
            StringBuilder a3 = a2.append(s);
            String s0 = a3.toString();
            android.util.Log.i("PARSE", s0);
            android.content.Intent a4 = new android.content.Intent("android.intent.action.CALL");
            StringBuilder a5 = new StringBuilder("tel:");
            StringBuilder a6 = a5.append(s);
            String s1 = a6.toString();
            android.net.Uri a7 = android.net.Uri.parse(s1);
            a4.setData(a7);
            this.startActivity(a4);
        }
        catch(android.content.ActivityNotFoundException a8)
        {
            android.util.Log.e("SPFPoliceStationResult", "Call failed", (Throwable)a8);
        }
    }
    
    public void getViewFor(android.os.Parcelable a, android.os.Handler a0, android.view.View a1)
    {
    }
    
    public void headerClicked(android.view.View a)
    {
        android.content.Intent a0 = this.getIntent();
        a0.putExtra("SET", true);
        int i = a.getId();
        switch(i){
            case 2131165206: {
                org.spf.utils.GATracker a1 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s = this.getString(2131034230);
                a1.gaTrackEvent(s);
                String s0 = this.getString(2131034230);
                android.util.Log.d("SPF", s0);
                android.view.View a2 = this.findViewById(2131165200);
                android.widget.ListView dummy = (android.widget.ListView)a2;
                android.widget.ListView a3 = (android.widget.ListView)a2;
                a3.setVisibility(8);
                android.view.View a4 = this.findViewById(2131165207);
                android.widget.RelativeLayout dummy0 = (android.widget.RelativeLayout)a4;
                android.widget.RelativeLayout a5 = (android.widget.RelativeLayout)a4;
                a5.setVisibility(0);
                android.view.View a6 = this.findViewById(2131165204);
                android.widget.Button dummy1 = (android.widget.Button)a6;
                android.widget.Button a7 = (android.widget.Button)a6;
                a7.setBackgroundResource(2130837533);
                android.view.View a8 = this.findViewById(2131165205);
                android.widget.Button dummy2 = (android.widget.Button)a8;
                android.widget.Button a9 = (android.widget.Button)a8;
                a9.setBackgroundResource(2130837535);
                android.view.View a10 = this.findViewById(2131165206);
                android.widget.Button dummy3 = (android.widget.Button)a10;
                android.widget.Button a11 = (android.widget.Button)a10;
                a11.setBackgroundResource(2130837538);
                android.view.View a12 = this.findViewById(2131165204);
                android.widget.Button dummy4 = (android.widget.Button)a12;
                android.widget.Button a13 = (android.widget.Button)a12;
                a13.setTextColor(-1);
                android.view.View a14 = this.findViewById(2131165205);
                android.widget.Button dummy5 = (android.widget.Button)a14;
                android.widget.Button a15 = (android.widget.Button)a14;
                a15.setTextColor(-1);
                android.view.View a16 = this.findViewById(2131165206);
                android.widget.Button dummy6 = (android.widget.Button)a16;
                android.widget.Button a17 = (android.widget.Button)a16;
                a17.setTextColor(-16776961);
                android.view.View a18 = this.findViewById(2131165212);
                android.widget.TextView dummy7 = (android.widget.TextView)a18;
                android.widget.TextView a19 = (android.widget.TextView)a18;
                a19.setVisibility(8);
                android.view.View a20 = this.findViewById(2131165201);
                android.widget.TextView dummy8 = (android.widget.TextView)a20;
                android.widget.TextView a21 = (android.widget.TextView)a20;
                a21.setVisibility(8);
                android.view.View a22 = this.findViewById(2131165211);
                android.widget.TextView dummy9 = (android.widget.TextView)a22;
                android.widget.TextView a23 = (android.widget.TextView)a22;
                a23.setVisibility(8);
                break;
            }
            case 2131165205: {
                org.spf.utils.GATracker a24 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s1 = this.getString(2131034231);
                a24.gaTrackEvent(s1);
                String s2 = this.getString(2131034231);
                android.util.Log.d("SPF", s2);
                android.view.View a25 = this.findViewById(2131165200);
                android.widget.ListView dummy10 = (android.widget.ListView)a25;
                android.widget.ListView a26 = (android.widget.ListView)a25;
                a26.setVisibility(8);
                android.view.View a27 = this.findViewById(2131165207);
                android.widget.RelativeLayout dummy11 = (android.widget.RelativeLayout)a27;
                android.widget.RelativeLayout a28 = (android.widget.RelativeLayout)a27;
                a28.setVisibility(8);
                org.spf.utils.Constants.SCREENS a29 = this.mScreen;
                org.spf.utils.Constants.SCREENS a30 = org.spf.utils.Constants.SCREENS.NEWS;
                if(a29 == a30)
                {
                    this.getNewsTypeList();
                }
                android.view.View a31 = this.findViewById(2131165204);
                android.widget.Button dummy12 = (android.widget.Button)a31;
                android.widget.Button a32 = (android.widget.Button)a31;
                a32.setBackgroundResource(2130837533);
                android.view.View a33 = this.findViewById(2131165205);
                android.widget.Button dummy13 = (android.widget.Button)a33;
                android.widget.Button a34 = (android.widget.Button)a33;
                a34.setBackgroundResource(2130837536);
                android.view.View a35 = this.findViewById(2131165206);
                android.widget.Button dummy14 = (android.widget.Button)a35;
                android.widget.Button a36 = (android.widget.Button)a35;
                a36.setBackgroundResource(2130837537);
                android.view.View a37 = this.findViewById(2131165212);
                android.widget.TextView dummy15 = (android.widget.TextView)a37;
                android.widget.TextView a38 = (android.widget.TextView)a37;
                a38.setVisibility(8);
                android.view.View a39 = this.findViewById(2131165201);
                android.widget.TextView dummy16 = (android.widget.TextView)a39;
                android.widget.TextView a40 = (android.widget.TextView)a39;
                a40.setVisibility(8);
                android.view.View a41 = this.findViewById(2131165204);
                android.widget.Button dummy17 = (android.widget.Button)a41;
                android.widget.Button a42 = (android.widget.Button)a41;
                a42.setTextColor(-1);
                android.view.View a43 = this.findViewById(2131165205);
                android.widget.Button dummy18 = (android.widget.Button)a43;
                android.widget.Button a44 = (android.widget.Button)a43;
                a44.setTextColor(-16776961);
                android.view.View a45 = this.findViewById(2131165206);
                android.widget.Button dummy19 = (android.widget.Button)a45;
                android.widget.Button a46 = (android.widget.Button)a45;
                a46.setTextColor(-1);
                android.view.View a47 = this.findViewById(2131165211);
                android.widget.TextView dummy20 = (android.widget.TextView)a47;
                android.widget.TextView a48 = (android.widget.TextView)a47;
                a48.setVisibility(8);
                break;
            }
            case 2131165204: {
                org.spf.utils.GATracker a49 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s3 = this.getString(2131034210);
                a49.gaTrackEvent(s3);
                String s4 = this.getString(2131034210);
                android.util.Log.d("SPF", s4);
                android.content.Intent a50 = this.getIntent();
                org.spf.utils.Constants.NEWS_CRIME_INFO.URL a51 = org.spf.utils.Constants.NEWS_CRIME_INFO.URL.DISPLAY_BY_DATE;
                String s5 = org.spf.utils.Constants.NEWS_CRIME_INFO.URL.getUrl(a51);
                a50.putExtra("PASSING_URL", s5);
                android.view.View a52 = this.findViewById(2131165200);
                android.widget.ListView dummy21 = (android.widget.ListView)a52;
                android.widget.ListView a53 = (android.widget.ListView)a52;
                a53.setVisibility(0);
                android.view.View a54 = this.findViewById(2131165207);
                android.widget.RelativeLayout dummy22 = (android.widget.RelativeLayout)a54;
                android.widget.RelativeLayout a55 = (android.widget.RelativeLayout)a54;
                a55.setVisibility(8);
                this.pullParser = null;
                this.arrayList = null;
                org.spf.utils.Constants.SCREENS a56 = this.mScreen;
                this.doInitialize(a56);
                android.view.View a57 = this.findViewById(2131165212);
                android.widget.TextView dummy23 = (android.widget.TextView)a57;
                android.widget.TextView a58 = (android.widget.TextView)a57;
                a58.setVisibility(8);
                android.view.View a59 = this.findViewById(2131165201);
                android.widget.TextView dummy24 = (android.widget.TextView)a59;
                android.widget.TextView a60 = (android.widget.TextView)a59;
                a60.setVisibility(8);
                android.view.View a61 = this.findViewById(2131165204);
                android.widget.Button dummy25 = (android.widget.Button)a61;
                android.widget.Button a62 = (android.widget.Button)a61;
                a62.setBackgroundResource(2130837534);
                android.view.View a63 = this.findViewById(2131165205);
                android.widget.Button dummy26 = (android.widget.Button)a63;
                android.widget.Button a64 = (android.widget.Button)a63;
                a64.setBackgroundResource(2130837535);
                android.view.View a65 = this.findViewById(2131165206);
                android.widget.Button dummy27 = (android.widget.Button)a65;
                android.widget.Button a66 = (android.widget.Button)a65;
                a66.setBackgroundResource(2130837537);
                android.view.View a67 = this.findViewById(2131165204);
                android.widget.Button dummy28 = (android.widget.Button)a67;
                android.widget.Button a68 = (android.widget.Button)a67;
                a68.setTextColor(-16776961);
                android.view.View a69 = this.findViewById(2131165205);
                android.widget.Button dummy29 = (android.widget.Button)a69;
                android.widget.Button a70 = (android.widget.Button)a69;
                a70.setTextColor(-1);
                android.view.View a71 = this.findViewById(2131165206);
                android.widget.Button dummy30 = (android.widget.Button)a71;
                android.widget.Button a72 = (android.widget.Button)a71;
                a72.setTextColor(-1);
                android.view.View a73 = this.findViewById(2131165211);
                android.widget.TextView dummy31 = (android.widget.TextView)a73;
                android.widget.TextView a74 = (android.widget.TextView)a73;
                a74.setVisibility(8);
                break;
            }
        }
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
        this.setContentView(2130903043);
        org.spf.mobi.ui.news.NewsCrimeDetailFill a0 = new org.spf.mobi.ui.news.NewsCrimeDetailFill((android.app.Activity)this);
        this.fillCrime = a0;
        org.spf.mobi.ui.news.NewsCrimeDetailFill a1 = this.fillCrime;
        org.spf.utils.Utils.setDetailRef((org.spf.mobi.ui.common.SPFIGetFillView)a1);
        android.view.View a2 = this.findViewById(2131165246);
        android.widget.TextView dummy = (android.widget.TextView)a2;
        android.widget.TextView a3 = (android.widget.TextView)a2;
        a3.setText(2131034114);
        android.view.View a4 = this.findViewById(2131165200);
        android.widget.ListView dummy0 = (android.widget.ListView)a4;
        android.widget.ListView a5 = (android.widget.ListView)a4;
        this.listView = a5;
        android.widget.ListView a6 = this.listView;
        a6.setOnItemClickListener((android.widget.AdapterView.OnItemClickListener)this);
        android.os.Handler a7 = new android.os.Handler();
        this.mHandler = a7;
        android.content.Intent a8 = this.getIntent();
        org.spf.utils.Constants.SCREENS a9 = org.spf.utils.Constants.SCREENS.NO_SCREEN;
        int i = a9.ordinal();
        int i0 = a8.getIntExtra("SCREEN_ID", i);
        org.spf.utils.Constants.SCREENS a10 = org.spf.utils.Constants.SCREENS.valueAt(i0);
        this.mScreen = a10;
        org.spf.utils.Constants.SCREENS a11 = this.mScreen;
        org.spf.utils.Constants.SCREENS a12 = org.spf.utils.Constants.SCREENS.NO_SCREEN;
        if(a11 != a12)
        {
            org.spf.utils.Constants.SCREENS a13 = this.mScreen;
            this.doInitialize(a13);
            android.content.Intent a14 = this.getIntent();
            boolean b = a14.getBooleanExtra("SET", false);
            if(!b)
            {
                android.view.View a15 = this.findViewById(2131165204);
                android.widget.Button dummy1 = (android.widget.Button)a15;
                android.widget.Button a16 = (android.widget.Button)a15;
                a16.setBackgroundResource(2130837534);
                android.view.View a17 = this.findViewById(2131165204);
                android.widget.Button dummy2 = (android.widget.Button)a17;
                android.widget.Button a18 = (android.widget.Button)a17;
                a18.setTextColor(-16776961);
            }
            android.util.Log.d("SPF", "News feed");
        }
        else
        {
            this.finish();
        }
    }
    
    protected android.app.Dialog onCreateDialog(int i, android.os.Bundle a)
    {
        android.app.AlertDialog a0 = null;
        android.app.Dialog a1 = null;
        android.app.AlertDialog a2 = null;
        switch(i){
            case 2: {
                String[] a3 = this.itemsToArray();
                android.app.AlertDialog.Builder a4 = new android.app.AlertDialog.Builder((android.content.Context)this);
                a4.setTitle((CharSequence)"Select a crime type");
                org.spf.mobi.ui.news.SPFNewsListing.3 a5 = new org.spf.mobi.ui.news.SPFNewsListing.3(this);
                a4.setItems((CharSequence[])a3, (android.content.DialogInterface.OnClickListener)a5);
                org.spf.mobi.ui.news.SPFNewsListing.4 a6 = new org.spf.mobi.ui.news.SPFNewsListing.4(this);
                a4.setOnCancelListener((android.content.DialogInterface.OnCancelListener)a6);
                android.app.AlertDialog a7 = a4.create();
                a0 = a7;
                break;
            }
            case 0: {
                android.app.ProgressDialog a8 = new android.app.ProgressDialog((android.content.Context)this);
                android.content.res.Resources a9 = this.getResources();
                String s = a9.getString(2131034126);
                a8.setMessage((CharSequence)s);
                a8.setCancelable(true);
                a8.setIndeterminate(true);
                org.spf.mobi.ui.news.SPFNewsListing.2 a10 = new org.spf.mobi.ui.news.SPFNewsListing.2(this);
                a8.setOnCancelListener((android.content.DialogInterface.OnCancelListener)a10);
                a0 = a8;
                break;
            }
            default: {
                a0 = a2;
            }
        }
        if(a0 == null)
        {
            android.app.Dialog a11 = ((org.spf.mobi.ui.SPFActivity)this).onCreateDialog(i, a);
            a1 = a11;
        }
        else
        {
            a1 = a0;
        }
        return a1;
    }
    
    public void onItemClick(android.widget.AdapterView a, android.view.View a0, int i, long j)
    {
        Object a1 = org.spf.utils.Utils.getDetailRef();
        ((org.spf.mobi.ui.common.SPFIGetFillView)a1).onListItemClick(a, a0, i, j, (android.content.Context)this);
    }
    
    public void onListItemClick(android.widget.AdapterView a, android.view.View a0, int i, long j, android.content.Context a1)
    {
    }
    
    public void search(android.view.View a)
    {
        android.view.View a0 = this.findViewById(2131165200);
        android.widget.ListView dummy = (android.widget.ListView)a0;
        android.widget.ListView a1 = (android.widget.ListView)a0;
        a1.setVisibility(8);
        android.view.View a2 = this.findViewById(2131165208);
        android.widget.EditText dummy0 = (android.widget.EditText)a2;
        android.widget.EditText a3 = (android.widget.EditText)a2;
        Object a4 = a3.getText();
        String s = ((android.text.Editable)a4).toString();
        String s0 = s.trim();
        int i = s0.length();
        if(i != 0)
        {
            int i0 = s0.length();
            if(i0 > 3)
            {
                String s1 = s0.replace((CharSequence)" ", (CharSequence)"%20");
                this.pullParser = null;
                this.arrayList = null;
                android.content.Intent a5 = this.getIntent();
                org.spf.utils.Constants.NEWS_CRIME_INFO.URL a6 = org.spf.utils.Constants.NEWS_CRIME_INFO.URL.LOCATION;
                String s2 = org.spf.utils.Constants.NEWS_CRIME_INFO.URL.getUrl(a6);
                String s3 = String.valueOf((Object)s2);
                StringBuilder a7 = new StringBuilder(s3);
                StringBuilder a8 = a7.append(s1);
                String s4 = a8.toString();
                a5.putExtra("PASSING_URL", s4);
                org.spf.utils.Constants.SCREENS a9 = this.mScreen;
                this.doInitialize(a9);
            }
            else
            {
                android.content.Context a10 = a.getContext();
                android.app.AlertDialog.Builder a11 = new android.app.AlertDialog.Builder(a10);
                android.app.AlertDialog.Builder a12 = a11.setTitle((CharSequence)"Police");
                android.app.AlertDialog.Builder a13 = a12.setMessage((CharSequence)"Search term should be at least 4 characters long.");
                android.app.AlertDialog.Builder a14 = a13.setPositiveButton(17039370, (android.content.DialogInterface.OnClickListener)null);
                a14.show();
            }
        }
        else
        {
            android.content.Context a15 = a.getContext();
            android.app.AlertDialog.Builder a16 = new android.app.AlertDialog.Builder(a15);
            android.app.AlertDialog.Builder a17 = a16.setTitle((CharSequence)"Police");
            android.app.AlertDialog.Builder a18 = a17.setMessage((CharSequence)"Please enter location.");
            android.app.AlertDialog.Builder a19 = a18.setPositiveButton(17039370, (android.content.DialogInterface.OnClickListener)null);
            a19.show();
        }
        android.view.View a20 = this.findViewById(2131165207);
        android.widget.RelativeLayout dummy1 = (android.widget.RelativeLayout)a20;
        android.widget.RelativeLayout a21 = (android.widget.RelativeLayout)a20;
        a21.setVisibility(0);
        android.view.View a22 = this.findViewById(2131165212);
        android.widget.TextView dummy2 = (android.widget.TextView)a22;
        android.widget.TextView a23 = (android.widget.TextView)a22;
        a23.setVisibility(8);
        android.view.View a24 = this.findViewById(2131165211);
        android.widget.TextView dummy3 = (android.widget.TextView)a24;
        android.widget.TextView a25 = (android.widget.TextView)a24;
        a25.setVisibility(8);
        Object a26 = this.getSystemService("input_method");
        android.view.inputmethod.InputMethodManager dummy4 = (android.view.inputmethod.InputMethodManager)a26;
        android.view.inputmethod.InputMethodManager a27 = (android.view.inputmethod.InputMethodManager)a26;
        android.view.View a28 = this.findViewById(2131165208);
        android.widget.EditText dummy5 = (android.widget.EditText)a28;
        android.widget.EditText a29 = (android.widget.EditText)a28;
        Object a30 = a29.getWindowToken();
        a27.hideSoftInputFromWindow((android.os.IBinder)a30, 2);
    }
}
package org.spf.mobi.ui.locator;

public class SPFLocatorListing extends org.spf.mobi.ui.SPFActivity implements org.spf.utils.Constants, android.widget.AdapterView.OnItemClickListener, org.spf.utils.gps.SPFFoundLocation {
    private static int[] $SWITCH_TABLE$org$spf$utils$Constants$SCREENS;
    private org.spf.data.SPFArrayList arrayList;
    private org.spf.data.SPFArrayList arrayListCrimeType;
    private org.spf.mobi.ui.locator.SPFPoliceStationLocator fillMissing;
    private org.spf.utils.gps.SPFGpsModule gpsModule;
    private android.widget.ListView listView;
    private android.os.Handler mHandler;
    private org.spf.utils.Constants.SCREENS mScreen;
    private org.spf.utils.parser.SPFXmlPullParser pullParser;
    private boolean searchCancelled;
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
    
    public SPFLocatorListing()
    {
        super();
        this.arrayList = null;
        this.pullParser = null;
        this.fillMissing = null;
        this.thread = null;
    }
    
    private void ShowDisabledLocationMessage()
    {
        android.app.AlertDialog.Builder a = new android.app.AlertDialog.Builder((android.content.Context)this);
        a.setCancelable(false);
        a.setTitle((CharSequence)"Location Not Found");
        a.setMessage((CharSequence)"Location access disabled on your phone. Do you want to enable?");
        org.spf.mobi.ui.locator.SPFLocatorListing.4 a0 = new org.spf.mobi.ui.locator.SPFLocatorListing.4(this);
        a.setPositiveButton((CharSequence)"Yes", (android.content.DialogInterface.OnClickListener)a0);
        org.spf.mobi.ui.locator.SPFLocatorListing.5 a1 = new org.spf.mobi.ui.locator.SPFLocatorListing.5(this);
        a.setNegativeButton((CharSequence)"No", (android.content.DialogInterface.OnClickListener)a1);
        a.show();
    }
    
    static org.spf.utils.parser.SPFXmlPullParser access$0(org.spf.mobi.ui.locator.SPFLocatorListing a)
    {
        org.spf.utils.parser.SPFXmlPullParser a0 = a.pullParser;
        return a0;
    }
    
    static void access$1(org.spf.mobi.ui.locator.SPFLocatorListing a, org.spf.data.SPFArrayList a0)
    {
        a.arrayList = a0;
    }
    
    static void access$10(org.spf.mobi.ui.locator.SPFLocatorListing a, org.spf.utils.Constants.SCREENS a0)
    {
        a.doInitialize(a0);
    }
    
    static android.os.Handler access$2(org.spf.mobi.ui.locator.SPFLocatorListing a)
    {
        android.os.Handler a0 = a.mHandler;
        return a0;
    }
    
    static org.spf.data.SPFArrayList access$3(org.spf.mobi.ui.locator.SPFLocatorListing a)
    {
        org.spf.data.SPFArrayList a0 = a.arrayList;
        return a0;
    }
    
    static android.widget.ListView access$4(org.spf.mobi.ui.locator.SPFLocatorListing a)
    {
        android.widget.ListView a0 = a.listView;
        return a0;
    }
    
    static void access$5(org.spf.mobi.ui.locator.SPFLocatorListing a)
    {
        a.removeLoadDialogError();
    }
    
    static Thread access$6(org.spf.mobi.ui.locator.SPFLocatorListing a)
    {
        Thread a0 = a.thread;
        return a0;
    }
    
    static org.spf.data.SPFArrayList access$7(org.spf.mobi.ui.locator.SPFLocatorListing a)
    {
        org.spf.data.SPFArrayList a0 = a.arrayListCrimeType;
        return a0;
    }
    
    static void access$8(org.spf.mobi.ui.locator.SPFLocatorListing a, org.spf.utils.parser.SPFXmlPullParser a0)
    {
        a.pullParser = a0;
    }
    
    static org.spf.utils.Constants.SCREENS access$9(org.spf.mobi.ui.locator.SPFLocatorListing a)
    {
        org.spf.utils.Constants.SCREENS a0 = a.mScreen;
        return a0;
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
                        org.spf.mobi.ui.locator.SPFLocatorListing.LaunchSearchThread a4 = new org.spf.mobi.ui.locator.SPFLocatorListing.LaunchSearchThread(this, a);
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
            int[] a7 = org.spf.mobi.ui.locator.SPFLocatorListing.$SWITCH_TABLE$org$spf$utils$Constants$SCREENS();
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
                    android.view.View a28 = this.findViewById(2131165246);
                    android.widget.TextView dummy2 = (android.widget.TextView)a28;
                    android.widget.TextView a29 = (android.widget.TextView)a28;
                    a29.setText(2131034114);
                    android.widget.ListView a30 = this.listView;
                    org.spf.data.SPFArrayList a31 = this.arrayList;
                    android.os.Handler a32 = this.mHandler;
                    org.spf.mobi.ui.news.custom.SPFNewsListAdapter a33 = new org.spf.mobi.ui.news.custom.SPFNewsListAdapter((android.app.Activity)this, a31, a32);
                    a30.setAdapter((android.widget.ListAdapter)a33);
                    android.widget.ListView a34 = this.listView;
                    a34.setFastScrollEnabled(true);
                }
            }
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
        org.spf.mobi.ui.locator.SPFLocatorListing.6 a0 = new org.spf.mobi.ui.locator.SPFLocatorListing.6(this);
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
    
    public void headerClicked(android.view.View a)
    {
        int i = a.getId();
        switch(i){
            case 2131165206: {
                org.spf.utils.GATracker a0 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s = this.getString(2131034245);
                a0.gaTrackEvent(s);
                String s0 = this.getString(2131034245);
                android.util.Log.d("SPF", s0);
                android.view.View a1 = this.findViewById(2131165200);
                android.widget.ListView dummy = (android.widget.ListView)a1;
                android.widget.ListView a2 = (android.widget.ListView)a1;
                a2.setVisibility(8);
                android.view.View a3 = this.findViewById(2131165207);
                android.widget.RelativeLayout dummy0 = (android.widget.RelativeLayout)a3;
                android.widget.RelativeLayout a4 = (android.widget.RelativeLayout)a3;
                a4.setVisibility(0);
                android.view.View a5 = this.findViewById(2131165204);
                android.widget.Button dummy1 = (android.widget.Button)a5;
                android.widget.Button a6 = (android.widget.Button)a5;
                a6.setBackgroundResource(2130837533);
                android.view.View a7 = this.findViewById(2131165206);
                android.widget.Button dummy2 = (android.widget.Button)a7;
                android.widget.Button a8 = (android.widget.Button)a7;
                a8.setBackgroundResource(2130837538);
                android.view.View a9 = this.findViewById(2131165204);
                android.widget.Button dummy3 = (android.widget.Button)a9;
                android.widget.Button a10 = (android.widget.Button)a9;
                a10.setTextColor(-1);
                android.view.View a11 = this.findViewById(2131165206);
                android.widget.Button dummy4 = (android.widget.Button)a11;
                android.widget.Button a12 = (android.widget.Button)a11;
                a12.setTextColor(-16776961);
                android.view.View a13 = this.findViewById(2131165212);
                android.widget.TextView dummy5 = (android.widget.TextView)a13;
                android.widget.TextView a14 = (android.widget.TextView)a13;
                a14.setVisibility(8);
                android.view.View a15 = this.findViewById(2131165201);
                android.widget.TextView dummy6 = (android.widget.TextView)a15;
                android.widget.TextView a16 = (android.widget.TextView)a15;
                a16.setVisibility(8);
                break;
            }
            case 2131165204: {
                org.spf.utils.GATracker a17 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s1 = this.getString(2131034213);
                a17.gaTrackEvent(s1);
                String s2 = this.getString(2131034213);
                android.util.Log.d("SPF", s2);
                android.os.Handler a18 = this.mHandler;
                org.spf.utils.gps.SPFGpsModule a19 = new org.spf.utils.gps.SPFGpsModule((android.content.Context)this, a18, (org.spf.utils.gps.SPFFoundLocation)this);
                this.gpsModule = a19;
                this.searchCancelled = false;
                this.showDialog(0, (android.os.Bundle)null);
                android.view.View a20 = this.findViewById(2131165204);
                android.widget.Button dummy7 = (android.widget.Button)a20;
                android.widget.Button a21 = (android.widget.Button)a20;
                a21.setBackgroundResource(2130837534);
                android.view.View a22 = this.findViewById(2131165206);
                android.widget.Button dummy8 = (android.widget.Button)a22;
                android.widget.Button a23 = (android.widget.Button)a22;
                a23.setBackgroundResource(2130837537);
                android.view.View a24 = this.findViewById(2131165212);
                android.widget.TextView dummy9 = (android.widget.TextView)a24;
                android.widget.TextView a25 = (android.widget.TextView)a24;
                a25.setVisibility(8);
                android.view.View a26 = this.findViewById(2131165201);
                android.widget.TextView dummy10 = (android.widget.TextView)a26;
                android.widget.TextView a27 = (android.widget.TextView)a26;
                a27.setVisibility(8);
                android.view.View a28 = this.findViewById(2131165204);
                android.widget.Button dummy11 = (android.widget.Button)a28;
                android.widget.Button a29 = (android.widget.Button)a28;
                a29.setTextColor(-16776961);
                android.view.View a30 = this.findViewById(2131165206);
                android.widget.Button dummy12 = (android.widget.Button)a30;
                android.widget.Button a31 = (android.widget.Button)a30;
                a31.setTextColor(-1);
                break;
            }
        }
    }
    
    public void locationError(String s)
    {
        label2: {
            org.spf.utils.Utils.setLastLocation((android.location.Location)null);
            boolean b = this.searchCancelled;
            label1: {
                label0: {
                    if(b)
                    {
                        break label0;
                    }
                    boolean b0 = this.isFinishing();
                    if(b0)
                    {
                        break label0;
                    }
                    boolean b1 = s.equalsIgnoreCase("PROVIDER_NULL");
                    if(!b1)
                    {
                        break label1;
                    }
                    this.ShowDisabledLocationMessage();
                }
                break label2;
            }
            this.removeDialog(0);
            android.os.Bundle a = new android.os.Bundle();
            a.putString("ERROR", s);
            this.showDialog(1, a);
        }
    }
    
    public void locationFound(android.location.Location a)
    {
        org.spf.utils.Utils.setLastLocation(a);
        boolean b = this.searchCancelled;
        if(!b)
        {
            boolean b0 = this.isFinishing();
            if(!b0)
            {
                this.removeDialog(0);
                org.spf.utils.Constants.POLICE_STATION_LOCATOR.URL a0 = org.spf.utils.Constants.POLICE_STATION_LOCATOR.URL.NEARBY;
                String s = org.spf.utils.Constants.POLICE_STATION_LOCATOR.URL.getUrl(a0);
                Object[] a1 = new Object[2];
                double d = a.getLongitude();
                Double a2 = Double.valueOf(d);
                a1[0] = a2;
                double d0 = a.getLatitude();
                Double a3 = Double.valueOf(d0);
                a1[1] = a3;
                String s0 = String.format(s, a1);
                StringBuilder a4 = new StringBuilder("url");
                StringBuilder a5 = a4.append(s0);
                String s1 = a5.toString();
                android.util.Log.d("Location from Debug", s1);
                android.content.Intent a6 = this.getIntent();
                a6.putExtra("PASSING_URL", s0);
                android.view.View a7 = this.findViewById(2131165200);
                android.widget.ListView dummy = (android.widget.ListView)a7;
                android.widget.ListView a8 = (android.widget.ListView)a7;
                a8.setVisibility(0);
                android.view.View a9 = this.findViewById(2131165207);
                android.widget.RelativeLayout dummy0 = (android.widget.RelativeLayout)a9;
                android.widget.RelativeLayout a10 = (android.widget.RelativeLayout)a9;
                a10.setVisibility(8);
                this.pullParser = null;
                this.arrayList = null;
                org.spf.utils.Constants.SCREENS a11 = this.mScreen;
                this.doInitialize(a11);
            }
        }
    }
    
    protected void onActivityResult(int i, int i0, android.content.Intent a)
    {
        switch(i){
            case 2131034154: {
                this.finish();
                break;
            }
        }
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        label3: {
            ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
            this.setContentView(2130903043);
            org.spf.mobi.ui.locator.SPFPoliceStationLocator a0 = new org.spf.mobi.ui.locator.SPFPoliceStationLocator();
            this.fillMissing = a0;
            org.spf.mobi.ui.locator.SPFPoliceStationLocator a1 = this.fillMissing;
            org.spf.utils.Utils.setDetailRef((org.spf.mobi.ui.common.SPFIGetFillView)a1);
            android.view.View a2 = this.findViewById(2131165246);
            android.widget.TextView dummy = (android.widget.TextView)a2;
            android.widget.TextView a3 = (android.widget.TextView)a2;
            a3.setText(2131034117);
            android.view.View a4 = this.findViewById(2131165204);
            android.widget.Button dummy0 = (android.widget.Button)a4;
            android.widget.Button a5 = (android.widget.Button)a4;
            a5.setText((CharSequence)"Near By");
            android.view.View a6 = this.findViewById(2131165200);
            android.widget.ListView dummy1 = (android.widget.ListView)a6;
            android.widget.ListView a7 = (android.widget.ListView)a6;
            this.listView = a7;
            android.widget.ListView a8 = this.listView;
            a8.setOnItemClickListener((android.widget.AdapterView.OnItemClickListener)this);
            android.os.Handler a9 = new android.os.Handler();
            this.mHandler = a9;
            android.content.Intent a10 = this.getIntent();
            org.spf.utils.Constants.SCREENS a11 = org.spf.utils.Constants.SCREENS.NO_SCREEN;
            int i = a11.ordinal();
            int i0 = a10.getIntExtra("SCREEN_ID", i);
            org.spf.utils.Constants.SCREENS a12 = org.spf.utils.Constants.SCREENS.valueAt(i0);
            this.mScreen = a12;
            org.spf.utils.Constants.SCREENS a13 = this.mScreen;
            org.spf.utils.Constants.SCREENS a14 = org.spf.utils.Constants.SCREENS.NO_SCREEN;
            label2: {
                label1: {
                    label0: {
                        if(a13 != a14)
                        {
                            break label0;
                        }
                        this.finish();
                        break label1;
                    }
                    android.view.View a15 = this.findViewById(2131165205);
                    android.widget.Button dummy2 = (android.widget.Button)a15;
                    android.widget.Button a16 = (android.widget.Button)a15;
                    a16.setVisibility(8);
                    android.os.Handler a17 = this.mHandler;
                    org.spf.utils.gps.SPFGpsModule a18 = new org.spf.utils.gps.SPFGpsModule((android.content.Context)this, a17, (org.spf.utils.gps.SPFFoundLocation)this);
                    this.gpsModule = a18;
                    this.searchCancelled = false;
                    this.showDialog(0, (android.os.Bundle)null);
                    android.content.Intent a19 = this.getIntent();
                    boolean b = a19.getBooleanExtra("SET", false);
                    if(!b)
                    {
                        break label2;
                    }
                }
                break label3;
            }
            android.view.View a20 = this.findViewById(2131165204);
            android.widget.Button dummy3 = (android.widget.Button)a20;
            android.widget.Button a21 = (android.widget.Button)a20;
            a21.setBackgroundResource(2130837534);
            android.view.View a22 = this.findViewById(2131165206);
            android.widget.Button dummy4 = (android.widget.Button)a22;
            android.widget.Button a23 = (android.widget.Button)a22;
            a23.setBackgroundResource(2130837537);
            android.view.View a24 = this.findViewById(2131165204);
            android.widget.Button dummy5 = (android.widget.Button)a24;
            android.widget.Button a25 = (android.widget.Button)a24;
            a25.setTextColor(-16776961);
            android.view.View a26 = this.findViewById(2131165206);
            android.widget.Button dummy6 = (android.widget.Button)a26;
            android.widget.Button a27 = (android.widget.Button)a26;
            a27.setTextColor(-1);
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
                org.spf.mobi.ui.locator.SPFLocatorListing.2 a5 = new org.spf.mobi.ui.locator.SPFLocatorListing.2(this);
                a4.setItems((CharSequence[])a3, (android.content.DialogInterface.OnClickListener)a5);
                org.spf.mobi.ui.locator.SPFLocatorListing.3 a6 = new org.spf.mobi.ui.locator.SPFLocatorListing.3(this);
                a4.setOnCancelListener((android.content.DialogInterface.OnCancelListener)a6);
                android.app.AlertDialog a7 = a4.create();
                a0 = a7;
                break;
            }
            case 1: {
                android.app.AlertDialog.Builder a8 = new android.app.AlertDialog.Builder((android.content.Context)this);
                String s = a.getString("ERROR");
                a8.setMessage((CharSequence)s);
                android.app.AlertDialog a9 = a8.create();
                a0 = a9;
                break;
            }
            case 0: {
                android.app.ProgressDialog a10 = new android.app.ProgressDialog((android.content.Context)this);
                android.content.res.Resources a11 = this.getResources();
                String s0 = a11.getString(2131034126);
                a10.setMessage((CharSequence)s0);
                a10.setCancelable(true);
                a10.setIndeterminate(true);
                org.spf.mobi.ui.locator.SPFLocatorListing.1 a12 = new org.spf.mobi.ui.locator.SPFLocatorListing.1(this);
                a10.setOnCancelListener((android.content.DialogInterface.OnCancelListener)a12);
                a0 = a10;
                break;
            }
            default: {
                a0 = a2;
            }
        }
        if(a0 == null)
        {
            android.app.Dialog a13 = ((org.spf.mobi.ui.SPFActivity)this).onCreateDialog(i, a);
            a1 = a13;
        }
        else
        {
            a1 = a0;
        }
        return a1;
    }
    
    public void onItemClick(android.widget.AdapterView a, android.view.View a0, int i, long j)
    {
        org.spf.utils.GATracker a1 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
        String s = this.getString(2131034246);
        a1.gaTrackEvent(s);
        String s0 = this.getString(2131034246);
        android.util.Log.d("SPF", s0);
        Object a2 = org.spf.utils.Utils.getDetailRef();
        ((org.spf.mobi.ui.common.SPFIGetFillView)a2).onListItemClick(a, a0, i, j, (android.content.Context)this);
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
                org.spf.utils.Constants.POLICE_STATION_LOCATOR.URL a6 = org.spf.utils.Constants.POLICE_STATION_LOCATOR.URL.LOCATION;
                String s2 = org.spf.utils.Constants.POLICE_STATION_LOCATOR.URL.getUrl(a6);
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
        Object a24 = this.getSystemService("input_method");
        android.view.inputmethod.InputMethodManager dummy3 = (android.view.inputmethod.InputMethodManager)a24;
        android.view.inputmethod.InputMethodManager a25 = (android.view.inputmethod.InputMethodManager)a24;
        android.view.View a26 = this.findViewById(2131165208);
        android.widget.EditText dummy4 = (android.widget.EditText)a26;
        android.widget.EditText a27 = (android.widget.EditText)a26;
        Object a28 = a27.getWindowToken();
        a25.hideSoftInputFromWindow((android.os.IBinder)a28, 2);
    }
}
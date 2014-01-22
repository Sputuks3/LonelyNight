package org.spf.mobi.ui.common;

public class SPFCommonListing extends org.spf.mobi.ui.SPFActivity implements org.spf.utils.Constants, org.spf.mobi.ui.common.SPFIGetFillView, android.widget.AdapterView.OnItemClickListener {
    private static int[] $SWITCH_TABLE$org$spf$utils$Constants$SCREENS;
    private org.spf.data.SPFArrayList arrayList;
    private android.widget.ListView listView;
    private android.os.Handler mHandler;
    private org.spf.utils.Constants.SCREENS mScreen;
    private org.spf.utils.parser.SPFXmlPullParser pullParser;
    
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
    
    public SPFCommonListing()
    {
        super();
        this.arrayList = null;
        this.pullParser = null;
    }
    
    static org.spf.utils.parser.SPFXmlPullParser access$0(org.spf.mobi.ui.common.SPFCommonListing a)
    {
        org.spf.utils.parser.SPFXmlPullParser a0 = a.pullParser;
        return a0;
    }
    
    static void access$1(org.spf.mobi.ui.common.SPFCommonListing a, org.spf.data.SPFArrayList a0)
    {
        a.arrayList = a0;
    }
    
    static android.os.Handler access$2(org.spf.mobi.ui.common.SPFCommonListing a)
    {
        android.os.Handler a0 = a.mHandler;
        return a0;
    }
    
    static org.spf.data.SPFArrayList access$3(org.spf.mobi.ui.common.SPFCommonListing a)
    {
        org.spf.data.SPFArrayList a0 = a.arrayList;
        return a0;
    }
    
    static android.widget.ListView access$4(org.spf.mobi.ui.common.SPFCommonListing a)
    {
        android.widget.ListView a0 = a.listView;
        return a0;
    }
    
    static void access$5(org.spf.mobi.ui.common.SPFCommonListing a)
    {
        a.removeLoadDialogError();
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
                        org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread a4 = new org.spf.mobi.ui.common.SPFCommonListing.LaunchSearchThread(this, a);
                        a4.start();
                        this.showDialog(2);
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
            int[] a7 = org.spf.mobi.ui.common.SPFCommonListing.$SWITCH_TABLE$org$spf$utils$Constants$SCREENS();
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
                    a15.setText(2131034113);
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
                    a22.setText(2131034113);
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
                    a29.setText(2131034113);
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
    
    private void removeLoadDialogError()
    {
        android.os.Handler a = this.mHandler;
        org.spf.mobi.ui.common.SPFCommonListing.1 a0 = new org.spf.mobi.ui.common.SPFCommonListing.1(this);
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
    
    protected void onCreate(android.os.Bundle a)
    {
        ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
        this.setContentView(2130903042);
        android.view.View a0 = this.findViewById(2131165200);
        android.widget.ListView dummy = (android.widget.ListView)a0;
        android.widget.ListView a1 = (android.widget.ListView)a0;
        this.listView = a1;
        android.widget.ListView a2 = this.listView;
        a2.setOnItemClickListener((android.widget.AdapterView.OnItemClickListener)this);
        android.os.Handler a3 = new android.os.Handler();
        this.mHandler = a3;
        android.content.Intent a4 = this.getIntent();
        org.spf.utils.Constants.SCREENS a5 = org.spf.utils.Constants.SCREENS.NO_SCREEN;
        int i = a5.ordinal();
        int i0 = a4.getIntExtra("SCREEN_ID", i);
        org.spf.utils.Constants.SCREENS a6 = org.spf.utils.Constants.SCREENS.valueAt(i0);
        this.mScreen = a6;
        org.spf.utils.Constants.SCREENS a7 = this.mScreen;
        org.spf.utils.Constants.SCREENS a8 = org.spf.utils.Constants.SCREENS.NO_SCREEN;
        if(a7 != a8)
        {
            org.spf.utils.Constants.SCREENS a9 = this.mScreen;
            this.doInitialize(a9);
        }
        else
        {
            this.finish();
        }
    }
    
    protected android.app.Dialog onCreateDialog(int i)
    {
        android.app.Dialog a = null;
        switch(i){
            case 2: {
                android.app.ProgressDialog a0 = new android.app.ProgressDialog((android.content.Context)this);
                android.content.res.Resources a1 = this.getResources();
                String s = a1.getString(2131034126);
                a0.setMessage((CharSequence)s);
                a0.setCancelable(true);
                a0.setIndeterminate(true);
                org.spf.mobi.ui.common.SPFCommonListing.2 a2 = new org.spf.mobi.ui.common.SPFCommonListing.2(this);
                a0.setOnCancelListener((android.content.DialogInterface.OnCancelListener)a2);
                a = a0;
                break;
            }
            default: {
                android.app.Dialog a3 = ((org.spf.mobi.ui.SPFActivity)this).onCreateDialog(i);
                a = a3;
            }
        }
        return a;
    }
    
    public void onItemClick(android.widget.AdapterView a, android.view.View a0, int i, long j)
    {
        Object a1 = org.spf.utils.Utils.getDetailRef();
        ((org.spf.mobi.ui.common.SPFIGetFillView)a1).onListItemClick(a, a0, i, j, (android.content.Context)this);
    }
    
    public void onListItemClick(android.widget.AdapterView a, android.view.View a0, int i, long j, android.content.Context a1)
    {
    }
}
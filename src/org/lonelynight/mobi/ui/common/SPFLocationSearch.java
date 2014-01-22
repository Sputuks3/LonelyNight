package org.spf.mobi.ui.common;

public class SPFLocationSearch extends org.spf.mobi.ui.SPFActivity implements org.spf.utils.Constants {
    private static int[] $SWITCH_TABLE$org$spf$utils$Constants$SCREENS;
    private org.spf.utils.Constants.SCREENS mScreen;
    private StringBuilder mUrl;
    
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
    
    public SPFLocationSearch()
    {
        super();
    }
    
    private void initLayout()
    {
        int[] a = org.spf.mobi.ui.common.SPFLocationSearch.$SWITCH_TABLE$org$spf$utils$Constants$SCREENS();
        org.spf.utils.Constants.SCREENS a0 = this.mScreen;
        int i = a0.ordinal();
        int i0 = a[i];
        switch(i0){
            case 5: {
                android.view.View a1 = this.findViewById(2131165246);
                android.widget.TextView dummy = (android.widget.TextView)a1;
                android.widget.TextView a2 = (android.widget.TextView)a1;
                a2.setText(2131034117);
                StringBuilder a3 = this.mUrl;
                org.spf.utils.Constants.POLICE_STATION_LOCATOR.URL a4 = org.spf.utils.Constants.POLICE_STATION_LOCATOR.URL.LOCATION;
                String s = org.spf.utils.Constants.POLICE_STATION_LOCATOR.URL.getUrl(a4);
                a3.append(s);
                break;
            }
            case 4: {
                android.view.View a5 = this.findViewById(2131165246);
                android.widget.TextView dummy0 = (android.widget.TextView)a5;
                android.widget.TextView a6 = (android.widget.TextView)a5;
                a6.setText(2131034116);
                StringBuilder a7 = this.mUrl;
                org.spf.utils.Constants.MISSING_PERSON_INFO.URL a8 = org.spf.utils.Constants.MISSING_PERSON_INFO.URL.LOCATION;
                String s0 = org.spf.utils.Constants.MISSING_PERSON_INFO.URL.getUrl(a8);
                a7.append(s0);
                break;
            }
            case 3: {
                android.view.View a9 = this.findViewById(2131165246);
                android.widget.TextView dummy1 = (android.widget.TextView)a9;
                android.widget.TextView a10 = (android.widget.TextView)a9;
                a10.setText(2131034115);
                StringBuilder a11 = this.mUrl;
                org.spf.utils.Constants.POLICE_APPEAL.URL a12 = org.spf.utils.Constants.POLICE_APPEAL.URL.LOCATION;
                String s1 = org.spf.utils.Constants.POLICE_APPEAL.URL.getUrl(a12);
                a11.append(s1);
                break;
            }
            case 2: {
                android.view.View a13 = this.findViewById(2131165246);
                android.widget.TextView dummy2 = (android.widget.TextView)a13;
                android.widget.TextView a14 = (android.widget.TextView)a13;
                a14.setText(2131034114);
                StringBuilder a15 = this.mUrl;
                org.spf.utils.Constants.NEWS_CRIME_INFO.URL a16 = org.spf.utils.Constants.NEWS_CRIME_INFO.URL.LOCATION;
                String s2 = org.spf.utils.Constants.NEWS_CRIME_INFO.URL.getUrl(a16);
                a15.append(s2);
                break;
            }
        }
    }
    
    public void onClick(android.view.View a)
    {
        label1: {
            android.view.View a0 = this.findViewById(2131165214);
            android.widget.EditText dummy = (android.widget.EditText)a0;
            android.widget.EditText a1 = (android.widget.EditText)a0;
            Object a2 = a1.getText();
            String s = ((android.text.Editable)a2).toString();
            label0: {
                if(s == null)
                {
                    break label0;
                }
                int i = s.length();
                if(i <= 3)
                {
                    break label0;
                }
                String s0 = s.replace((CharSequence)" ", (CharSequence)"%20");
                StringBuilder a3 = this.mUrl;
                a3.append(s0);
                android.content.Intent a4 = new android.content.Intent((android.content.Context)this, org.spf.mobi.ui.common.SPFCommonListing.class);
                org.spf.utils.Constants.SCREENS a5 = this.mScreen;
                int i0 = a5.ordinal();
                a4.putExtra("SCREEN_ID", i0);
                StringBuilder a6 = this.mUrl;
                String s1 = a6.toString();
                a4.putExtra("PASSING_URL", s1);
                this.startActivity(a4);
                break label1;
            }
            label3: {
                label2: {
                    if(s == null)
                    {
                        break label2;
                    }
                    String s2 = s.trim();
                    boolean b = "".equalsIgnoreCase(s2);
                    if(!b)
                    {
                        break label3;
                    }
                }
                this.showDialog(3);
                break label1;
            }
            android.content.Context a7 = a.getContext();
            android.app.AlertDialog.Builder a8 = new android.app.AlertDialog.Builder(a7);
            android.app.AlertDialog.Builder a9 = a8.setTitle(2131034131);
            android.app.AlertDialog.Builder a10 = a9.setMessage(2131034133);
            android.app.AlertDialog.Builder a11 = a10.setPositiveButton(17039370, (android.content.DialogInterface.OnClickListener)null);
            a11.show();
        }
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
        this.setContentView(2130903044);
        android.content.Intent a0 = this.getIntent();
        org.spf.utils.Constants.SCREENS a1 = org.spf.utils.Constants.SCREENS.NO_SCREEN;
        int i = a1.ordinal();
        int i0 = a0.getIntExtra("SCREEN_ID", i);
        org.spf.utils.Constants.SCREENS a2 = org.spf.utils.Constants.SCREENS.valueAt(i0);
        this.mScreen = a2;
        org.spf.utils.Constants.SCREENS a3 = this.mScreen;
        org.spf.utils.Constants.SCREENS a4 = org.spf.utils.Constants.SCREENS.NO_SCREEN;
        if(a3 == a4)
        {
            this.finish();
        }
    }
    
    protected android.app.Dialog onCreateDialog(int i)
    {
        android.app.Dialog a = null;
        if(i != 3)
        {
            android.app.Dialog a0 = ((org.spf.mobi.ui.SPFActivity)this).onCreateDialog(i);
            a = a0;
        }
        else
        {
            android.app.AlertDialog.Builder a1 = new android.app.AlertDialog.Builder((android.content.Context)this);
            a1.setTitle(2131034131);
            a1.setMessage(2131034132);
            org.spf.mobi.ui.common.SPFLocationSearch.1 a2 = new org.spf.mobi.ui.common.SPFLocationSearch.1(this);
            a1.setNeutralButton(2131034134, (android.content.DialogInterface.OnClickListener)a2);
            android.app.AlertDialog a3 = a1.create();
            a = a3;
        }
        return a;
    }
    
    protected void onStart()
    {
        StringBuilder a = new StringBuilder();
        this.mUrl = a;
        this.initLayout();
        ((org.spf.mobi.ui.SPFActivity)this).onStart();
    }
}
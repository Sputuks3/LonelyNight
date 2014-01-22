package org.spf.mobi.ui.appeal;

import org.spf.data.*;
import org.spf.mobi.ui.appeal.custom.SPFPoliceAppealAdapter;
import org.spf.mobi.ui.locator.custom.*;
import org.spf.mobi.ui.missing.custom.SPFMissingListAdapter;
import org.spf.mobi.ui.news.custom.SPFNewsListAdapter;
import org.spf.utils.Constants;
import org.spf.utils.parser.SPFXmlPullParser;

import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.*;

public abstract class SPFAppealListing extends org.spf.mobi.ui.SPFActivity implements Constants, org.spf.mobi.ui.common.SPFIGetFillView, android.widget.AdapterView.OnItemClickListener {
    private SPFArrayList arrayList;
    private SPFArrayList arrayListCrimeType;
    private org.spf.mobi.ui.appeal.PoliceAppealFillData fillAppeal;
    private android.widget.ListView listView;
    private android.os.Handler mHandler;
    private Constants.SCREENS mScreen;
    private org.spf.utils.parser.SPFXmlPullParser pullParser;
    private Thread thread;
    
    public SPFAppealListing()
    {
        super();
        this.arrayList = null;
        this.pullParser = null;
        this.thread = null;
    }
    
    
    private void closeKey()
    {
        Object a = this.getSystemService("input_method");
        android.view.inputmethod.InputMethodManager a0 = (android.view.inputmethod.InputMethodManager)a;
        android.view.View a1 = this.getCurrentFocus();
        Object a2 = a1.getWindowToken();
        a0.hideSoftInputFromWindow((android.os.IBinder)a2, 2);
    }
    
    private void doInitialize(Constants.SCREENS a)
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
                        SPFArrayList a1 = this.arrayList;
                        if(a1 != null)
                        {
                            break label0;
                        }
                        android.content.Intent a2 = this.getIntent();
                        String s = a2.getStringExtra("PASSING_URL");
                        org.spf.utils.parser.SPFXmlPullParser a3 = new org.spf.utils.parser.SPFXmlPullParser(s);
                        this.pullParser = a3;
                        LaunchSearchThread a4 = new LaunchSearchThread(a);
                        a4.start();
                        this.showDialog(0);
                        break label1;
                    }
                    org.spf.utils.parser.SPFXmlPullParser a5 = this.pullParser;
                    if(a5 == null)
                    {
                        break label1;
                    }
                    SPFArrayList a6 = this.arrayList;
                    if(a6 != null)
                    {
                        break label2;
                    }
                }
                break label3;
            }
            
            switch(mScreen){
                case LOCATOR: {
                    android.view.View a8 = this.findViewById(2131165246);
                    android.widget.TextView a9 = (android.widget.TextView)a8;
                    a9.setText(2131034117);
                    android.widget.ListView a10 = this.listView;
                    SPFArrayList a11 = this.arrayList;
                    org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter a12 = new org.spf.mobi.ui.locator.custom.SPFPoliceListAdapter((android.content.Context)this, a11);
                    a10.setAdapter((android.widget.ListAdapter)a12);
                    android.widget.ListView a13 = this.listView;
                    a13.setFastScrollEnabled(true);
                }
                case MISSING: {
                    android.view.View a14 = this.findViewById(2131165246);
                    android.widget.TextView a15 = (android.widget.TextView)a14;
                    a15.setText(2131034116);
                    android.widget.ListView a16 = this.listView;
                    SPFArrayList a17 = this.arrayList;
                    android.os.Handler a18 = this.mHandler;
                    org.spf.mobi.ui.missing.custom.SPFMissingListAdapter a19 = new org.spf.mobi.ui.missing.custom.SPFMissingListAdapter((android.app.Activity)this, a17, a18);
                    a16.setAdapter((android.widget.ListAdapter)a19);
                    android.widget.ListView a20 = this.listView;
                    a20.setFastScrollEnabled(true);
                }
                case APPEAL: {
                    android.view.View a21 = this.findViewById(2131165246);
                    android.widget.TextView a22 = (android.widget.TextView)a21;
                    a22.setText(2131034115);
                    android.widget.ListView a23 = this.listView;
                    SPFArrayList a24 = this.arrayList;
                    android.os.Handler a25 = this.mHandler;
                    org.spf.mobi.ui.appeal.custom.SPFPoliceAppealAdapter a26 = new org.spf.mobi.ui.appeal.custom.SPFPoliceAppealAdapter((android.app.Activity)this, a24, a25);
                    a23.setAdapter((android.widget.ListAdapter)a26);
                    android.widget.ListView a27 = this.listView;
                    a27.setFastScrollEnabled(true);
                }
                case NEWS: {
                    android.view.View a28 = this.findViewById(2131165246);
                    android.widget.TextView a29 = (android.widget.TextView)a28;
                    a29.setText(2131034114);
                    android.widget.ListView a30 = this.listView;
                    SPFArrayList a31 = this.arrayList;
                    android.os.Handler a32 = this.mHandler;
                    org.spf.mobi.ui.news.custom.SPFNewsListAdapter a33 = new org.spf.mobi.ui.news.custom.SPFNewsListAdapter((android.app.Activity)this, a31, a32);
                    a30.setAdapter((android.widget.ListAdapter)a33);
                    android.widget.ListView a34 = this.listView;
                    a34.setFastScrollEnabled(true);
                }
            }
        }
    }
    
    private void getNewsTypeList()
    {
        showDialog(0, null);
        
        if(this.thread != null)
        {
        	Thread a0 = this.thread;
        	
        	if(!a0.isAlive())
        	{
        		this.thread = new Thread() {
                    public void run()
                    {
        				String s = Constants.POLICE_APPEAL.URL.getUrl(Constants.POLICE_APPEAL.URL.APPEAL_TYPE_LIST);
                        		SPFAppealListing.this.arrayListCrimeType = new SPFXmlPullParser(s).parseDataForCategory();
        						mHandler.post(new Runnable() {
        						    
        						    public void run()
        						    {
        						          if(!isInterrupted())
        						          {
        						              if(!isFinishing())
        						              {
        						                    SPFAppealListing.this.removeDialog(0);
        						                    if(SPFAppealListing.this.arrayListCrimeType != null)
        						                    	if(SPFAppealListing.this.arrayListCrimeType.size() > 0)
        						                    		showDialog(2, (android.os.Bundle)null);
        						                    
        						              }
        						          }
        						    }
        						});
                    
                    }
                
                
       
        	
        	};
        	
        	Thread a2 = this.thread;
            a2.start();
        }
    }
    }
    
    private String[] itemsToArray()
    {
        String[] a = null;
        SPFArrayList a0 = this.arrayListCrimeType;
        String[] a1 = null;
        if(a0 == null)
        {
            a = a1;
        }
        else
        {
            SPFArrayList a2 = this.arrayListCrimeType;
            int i = a2.size();
            String[] a3 = new String[i];
            int i0 = 0;
            while(true)
            {
                SPFArrayList a4 = this.arrayListCrimeType;
                int i1 = a4.size();
                if(i0 < i1)
                {
                    SPFArrayList a5 = this.arrayListCrimeType;
                    Object a6 = a5.get(i0);
                    SPFCategory a7 = (SPFCategory)a6;
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
        a.post((Runnable)new Runnable() {
            
            public void run()
            {
                removeDialog(0);
                finish();
            }
        });
    }
    
    public void call(android.view.View a)
    {
        android.view.View a0 = a.findViewById(2131165352);
        Object a1 = a0.getTag();
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
                String s = this.getString(2131034235);
                a1.gaTrackEvent(s);
                String s0 = this.getString(2131034235);
                android.util.Log.d("SPF", s0);
                android.view.View a2 = this.findViewById(2131165200);
                android.widget.ListView a3 = (android.widget.ListView)a2;
                a3.setVisibility(8);
                android.view.View a4 = this.findViewById(2131165207);
                android.widget.RelativeLayout a5 = (android.widget.RelativeLayout)a4;
                a5.setVisibility(0);
                android.view.View a6 = this.findViewById(2131165204);
                android.widget.Button a7 = (android.widget.Button)a6;
                a7.setBackgroundResource(2130837533);
                android.view.View a8 = this.findViewById(2131165205);
                android.widget.Button a9 = (android.widget.Button)a8;
                a9.setBackgroundResource(2130837535);
                android.view.View a10 = this.findViewById(2131165206);
                android.widget.Button a11 = (android.widget.Button)a10;
                a11.setBackgroundResource(2130837538);
                android.view.View a12 = this.findViewById(2131165204);
                android.widget.Button a13 = (android.widget.Button)a12;
                a13.setTextColor(-1);
                android.view.View a14 = this.findViewById(2131165205);
                android.widget.Button a15 = (android.widget.Button)a14;
                a15.setTextColor(-1);
                android.view.View a16 = this.findViewById(2131165206);
                android.widget.Button a17 = (android.widget.Button)a16;
                a17.setTextColor(-16776961);
                android.view.View a18 = this.findViewById(2131165212);
                android.widget.TextView a19 = (android.widget.TextView)a18;
                a19.setVisibility(8);
                android.view.View a20 = this.findViewById(2131165201);
                android.widget.TextView a21 = (android.widget.TextView)a20;
                a21.setVisibility(8);
                android.view.View a22 = this.findViewById(2131165211);
                android.widget.TextView a23 = (android.widget.TextView)a22;
                a23.setVisibility(8);
                break;
            }
            case 2131165205: {
                org.spf.utils.GATracker a24 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s1 = this.getString(2131034236);
                a24.gaTrackEvent(s1);
                String s2 = this.getString(2131034236);
                android.util.Log.d("SPF", s2);
                android.view.View a25 = this.findViewById(2131165200);
                android.widget.ListView a26 = (android.widget.ListView)a25;
                a26.setVisibility(0);
                android.view.View a27 = this.findViewById(2131165207);
                android.widget.RelativeLayout a28 = (android.widget.RelativeLayout)a27;
                a28.setVisibility(8);
                this.getNewsTypeList();
                android.view.View a29 = this.findViewById(2131165212);
                android.widget.TextView a30 = (android.widget.TextView)a29;
                a30.setVisibility(8);
                android.view.View a31 = this.findViewById(2131165201);
                android.widget.TextView a32 = (android.widget.TextView)a31;
                a32.setVisibility(8);
                android.view.View a33 = this.findViewById(2131165204);
                android.widget.Button a34 = (android.widget.Button)a33;
                a34.setBackgroundResource(2130837533);
                android.view.View a35 = this.findViewById(2131165205);
                android.widget.Button a36 = (android.widget.Button)a35;
                a36.setBackgroundResource(2130837536);
                android.view.View a37 = this.findViewById(2131165206);
                android.widget.Button a38 = (android.widget.Button)a37;
                a38.setBackgroundResource(2130837537);
                android.view.View a39 = this.findViewById(2131165204);
                android.widget.Button a40 = (android.widget.Button)a39;
                a40.setTextColor(-1);
                android.view.View a41 = this.findViewById(2131165205);
                android.widget.Button a42 = (android.widget.Button)a41;
                a42.setTextColor(-16776961);
                android.view.View a43 = this.findViewById(2131165206);
                android.widget.Button a44 = (android.widget.Button)a43;
                a44.setTextColor(-1);
                android.view.View a45 = this.findViewById(2131165211);
                android.widget.TextView a46 = (android.widget.TextView)a45;
                a46.setVisibility(8);
                break;
            }
            case 2131165204: {
                org.spf.utils.GATracker a47 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s3 = this.getString(2131034211);
                a47.gaTrackEvent(s3);
                String s4 = this.getString(2131034211);
                android.util.Log.d("SPF", s4);
                android.content.Intent a48 = this.getIntent();
                Constants.POLICE_APPEAL.URL a49 = Constants.POLICE_APPEAL.URL.DISPLAY_BY_DATE;
                String s5 = Constants.POLICE_APPEAL.URL.getUrl(a49);
                a48.putExtra("PASSING_URL", s5);
                android.view.View a50 = this.findViewById(2131165200);
                android.widget.ListView a51 = (android.widget.ListView)a50;
                a51.setVisibility(0);
                android.view.View a52 = this.findViewById(2131165207);
                android.widget.RelativeLayout a53 = (android.widget.RelativeLayout)a52;
                a53.setVisibility(8);
                this.pullParser = null;
                this.arrayList = null;
                Constants.SCREENS a54 = this.mScreen;
                this.doInitialize(a54);
                android.view.View a55 = this.findViewById(2131165212);
                android.widget.TextView a56 = (android.widget.TextView)a55;
                a56.setVisibility(8);
                android.view.View a57 = this.findViewById(2131165201);
                android.widget.TextView a58 = (android.widget.TextView)a57;
                a58.setVisibility(8);
                android.view.View a59 = this.findViewById(2131165204);
                android.widget.Button a60 = (android.widget.Button)a59;
                a60.setBackgroundResource(2130837534);
                android.view.View a61 = this.findViewById(2131165205);
                android.widget.Button a62 = (android.widget.Button)a61;
                a62.setBackgroundResource(2130837535);
                android.view.View a63 = this.findViewById(2131165206);
                android.widget.Button a64 = (android.widget.Button)a63;
                a64.setBackgroundResource(2130837537);
                android.view.View a65 = this.findViewById(2131165204);
                android.widget.Button a66 = (android.widget.Button)a65;
                a66.setTextColor(-16776961);
                android.view.View a67 = this.findViewById(2131165205);
                android.widget.Button a68 = (android.widget.Button)a67;
                a68.setTextColor(-1);
                android.view.View a69 = this.findViewById(2131165206);
                android.widget.Button a70 = (android.widget.Button)a69;
                a70.setTextColor(-1);
                android.view.View a71 = this.findViewById(2131165211);
                android.widget.TextView a72 = (android.widget.TextView)a71;
                a72.setVisibility(8);
                break;
            }
        }
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        label3: {
            super.onCreate(a);
            this.setContentView(2130903043);
            org.spf.mobi.ui.appeal.PoliceAppealFillData a0 = new org.spf.mobi.ui.appeal.PoliceAppealFillData((android.app.Activity)this);
            this.fillAppeal = a0;
            org.spf.mobi.ui.appeal.PoliceAppealFillData a1 = this.fillAppeal;
            org.spf.utils.Utils.setDetailRef((org.spf.mobi.ui.common.SPFIGetFillView)a1);
            android.view.View a2 = this.findViewById(2131165200);
            android.widget.ListView a3 = (android.widget.ListView)a2;
            this.listView = a3;
            android.view.View a4 = this.findViewById(2131165246);
            android.widget.TextView a5 = (android.widget.TextView)a4;
            a5.setText(2131034115);
            android.widget.ListView a6 = this.listView;
            a6.setOnItemClickListener((android.widget.AdapterView.OnItemClickListener)this);
            android.os.Handler a7 = new android.os.Handler();
            this.mHandler = a7;
            android.content.Intent a8 = this.getIntent();
            Constants.SCREENS a9 = Constants.SCREENS.NO_SCREEN;
            int i = a9.ordinal();
            int i0 = a8.getIntExtra("SCREEN_ID", i);
            Constants.SCREENS a10 = Constants.SCREENS.valueAt(i0);
            this.mScreen = a10;
            Constants.SCREENS a11 = this.mScreen;
            Constants.SCREENS a12 = Constants.SCREENS.NO_SCREEN;
            label2: {
                label1: {
                    label0: {
                        if(a11 != a12)
                        {
                            break label0;
                        }
                        this.finish();
                        break label1;
                    }
                    Constants.SCREENS a13 = this.mScreen;
                    this.doInitialize(a13);
                    android.content.Intent a14 = this.getIntent();
                    boolean b = a14.getBooleanExtra("SET", false);
                    if(!b)
                    {
                        break label2;
                    }
                }
                break label3;
            }
            android.view.View a15 = this.findViewById(2131165204);
            android.widget.Button a16 = (android.widget.Button)a15;
            a16.setBackgroundResource(2130837534);
            android.view.View a17 = this.findViewById(2131165205);
            android.widget.Button a18 = (android.widget.Button)a17;
            a18.setBackgroundResource(2130837535);
            android.view.View a19 = this.findViewById(2131165206);
            android.widget.Button a20 = (android.widget.Button)a19;
            a20.setBackgroundResource(2130837537);
            android.view.View a21 = this.findViewById(2131165204);
            android.widget.Button a22 = (android.widget.Button)a21;
            a22.setTextColor(-16776961);
            android.view.View a23 = this.findViewById(2131165205);
            android.widget.Button a24 = (android.widget.Button)a23;
            a24.setTextColor(-1);
            android.view.View a25 = this.findViewById(2131165206);
            android.widget.Button a26 = (android.widget.Button)a25;
            a26.setTextColor(-1);
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
                a4.setItems((CharSequence[])a3, (android.content.DialogInterface.OnClickListener)new DialogInterface.OnClickListener() {
                    
                	public void onClick(DialogInterface a, int i)
                    {
                        removeDialog(2);
                        Intent a2 = getIntent();
                        StringBuilder a4 = new StringBuilder(Constants.POLICE_APPEAL.URL.getUrl(Constants.POLICE_APPEAL.URL.DISPLAY_BY_TYPE));
                        Object a7 = arrayListCrimeType.get(i);
                        SPFCategory a8 = (SPFCategory)a7;
                        a4.append(a8.getId());
                        a2.putExtra("PASSING_URL", a4.toString());
                        arrayList = null;
                        pullParser = null;
                        doInitialize(mScreen);
                    }
                });
                a4.setOnCancelListener((android.content.DialogInterface.OnCancelListener)new DialogInterface.OnCancelListener() {
                    
                    public void onCancel(DialogInterface a)
                    {

                        if(thread != null)
                        {

                            if(thread.isAlive())
                            {
                                thread.interrupt();
                            }
                        }
                        removeDialog(2);
                    }
                });
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
                a8.setOnCancelListener((android.content.DialogInterface.OnCancelListener) new DialogInterface.OnCancelListener() {
                    
                    
                    public void onCancel(DialogInterface a)
                    {
                        removeDialog(2);

                        if(thread != null)
                        {
                            thread.interrupt();
                        }
                    }
                });
                a0 = a8;
                break;
            }
            default: {
                a0 = a2;
            }
        }
        if(a0 == null)
        {
            android.app.Dialog a11 = super.onCreateDialog(i, a);
            a1 = a11;
        }
        else
        {
            a1 = a0;
        }
        return a1;
    }
    
    public void onItemClick(ListView a, android.view.View a0, int i, long j)
    {
        Object a1 = org.spf.utils.Utils.getDetailRef();
        ((org.spf.mobi.ui.common.SPFIGetFillView)a1).onListItemClick(a, a0, i, j, (android.content.Context)this);
    }
    
    public void onListItemClick(android.widget.ListView a, android.view.View a0, int i, long j, android.content.Context a1)
    {
    }
    
    public void search(android.view.View a)
    {
        android.view.View a0 = this.findViewById(2131165200);
        android.widget.ListView a1 = (android.widget.ListView)a0;
        a1.setVisibility(8);
        android.view.View a2 = this.findViewById(2131165208);
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
                Constants.POLICE_APPEAL.URL a6 = Constants.POLICE_APPEAL.URL.LOCATION;
                String s2 = Constants.POLICE_APPEAL.URL.getUrl(a6);
                String s3 = String.valueOf((Object)s2);
                StringBuilder a7 = new StringBuilder(s3);
                StringBuilder a8 = a7.append(s1);
                String s4 = a8.toString();
                a5.putExtra("PASSING_URL", s4);
                Constants.SCREENS a9 = this.mScreen;
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
        android.widget.RelativeLayout a21 = (android.widget.RelativeLayout)a20;
        a21.setVisibility(0);
        android.view.View a22 = this.findViewById(2131165212);
        android.widget.TextView a23 = (android.widget.TextView)a22;
        a23.setVisibility(8);
        android.view.View a24 = this.findViewById(2131165211);
        android.widget.TextView a25 = (android.widget.TextView)a24;
        a25.setVisibility(8);
        Object a26 = this.getSystemService("input_method");
        android.view.inputmethod.InputMethodManager a27 = (android.view.inputmethod.InputMethodManager)a26;
        android.view.View a28 = this.findViewById(2131165208);
        android.widget.EditText a29 = (android.widget.EditText)a28;
        Object a30 = a29.getWindowToken();
        a27.hideSoftInputFromWindow((android.os.IBinder)a30, 2);
    }
    
    class LaunchSearchThread extends Thread {
        private Constants.SCREENS mScreenId;
           
        public LaunchSearchThread(Constants.SCREENS a0)
        {
            super();
            this.mScreenId = a0;
        }
        
        public void run()
        {
                switch(mScreenId){
					    case LOCATOR: {
					        arrayList = pullParser.parseDataForNppnpc();

					        break;
					    }
					    case MISSING: {
					    	arrayList = pullParser.parseDataForMissing();

					        break;
					    }
					    case APPEAL: {
					    	arrayList = pullParser.parseDataForPoliceAppeal();

					        break;
					    }
					    case NEWS: {
					    	arrayList = pullParser.parseDataForNewsCrime();

					        break;
					    }
					}

					mHandler.post((Runnable) new Runnable() {

					    public void run()
					    {
					        
					        if(!SPFAppealListing.this.isFinishing())
					        {

					            if(arrayList != null)
					            {
					                StringBuilder a4 = new StringBuilder();
					                StringBuilder a8 = a4.append(arrayList.size());
					                Log.i("Array List Size", a8.toString());
					                View a11 = findViewById(2131165212);
					                TextView a12 = (TextView)a11;
					                View a15 = findViewById(2131165201);
					                TextView a16 = (TextView)a15;
					                int i0 = arrayList.size();
					                if(i0 != 0)
					                {
					                    a12.setText(2131034206);
					                    a12.setBackgroundColor(-7829368);
					                    a16.setVisibility(8);
					                    a12.setVisibility(0);
					                    listView.setVisibility(0);
					                }
					                else
					                {
					                    a16.setVisibility(0);
					                    a12.setVisibility(8);
					                    a16.setText(2131034205);
					                    listView.setVisibility(8);
					                }
					                
					                switch(mScreenId){
					                    case LOCATOR: {
					                        View a31 = findViewById(2131165246);
					                        TextView a32 = (TextView)a31;
					                        a32.setText(2131034117);
					                        listView.setAdapter((ListAdapter) new SPFPoliceListAdapter((android.app.Activity)SPFAppealListing.this, arrayList));
					                        listView.setFastScrollEnabled(true);
					                        break;
					                    }
					                    case MISSING: {
					                        View a47 = findViewById(2131165246);
					                        TextView a48 = (TextView)a47;
					                        a48.setText(2131034116);
					                        listView.setAdapter((ListAdapter)new SPFMissingListAdapter((android.app.Activity)SPFAppealListing.this, arrayList, mHandler));
					                        listView.setFastScrollEnabled(true);
					                        break;
					                    }
					                    case APPEAL: {
					                        View a66 = findViewById(2131165246);
					                        TextView a67 = (TextView)a66;
					                        a67.setText(2131034115);
					                        listView.setAdapter((ListAdapter)new SPFPoliceAppealAdapter((android.app.Activity)SPFAppealListing.this, arrayList, mHandler));
					                        listView.setFastScrollEnabled(true);
					                        break;
					                    }
					                    case NEWS: {
					                        View a85 = findViewById(2131165246);
					                        TextView a86 = (TextView)a85;
					                        a86.setText(2131034114);
					                        listView.setAdapter((ListAdapter)new SPFNewsListAdapter((android.app.Activity)SPFAppealListing.this, arrayList, mHandler));
					                        listView.setFastScrollEnabled(true);
					                        break;
					                    }
					                }
					            }
					            removeDialog(0);
					        }
					    }
					});

        
        }
    }
}
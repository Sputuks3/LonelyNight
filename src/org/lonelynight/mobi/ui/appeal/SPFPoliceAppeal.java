package org.spf.mobi.ui.appeal;

public class SPFPoliceAppeal extends org.spf.mobi.ui.SPFActivity implements org.spf.utils.Constants {
    private org.spf.data.SPFArrayList arrayListCrimeType;
    private android.os.Handler mHandler;
    private Thread thread;
    
    public SPFPoliceAppeal()
    {
        super();
    }
    
    static void access$0(org.spf.mobi.ui.appeal.SPFPoliceAppeal a, org.spf.data.SPFArrayList a0)
    {
        a.arrayListCrimeType = a0;
    }
    
    static android.os.Handler access$1(org.spf.mobi.ui.appeal.SPFPoliceAppeal a)
    {
        android.os.Handler a0 = a.mHandler;
        return a0;
    }
    
    static org.spf.data.SPFArrayList access$2(org.spf.mobi.ui.appeal.SPFPoliceAppeal a)
    {
        org.spf.data.SPFArrayList a0 = a.arrayListCrimeType;
        return a0;
    }
    
    static Thread access$3(org.spf.mobi.ui.appeal.SPFPoliceAppeal a)
    {
        Thread a0 = a.thread;
        return a0;
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
    
    public void onClick(android.view.View a)
    {
        android.content.Intent a0 = new android.content.Intent((android.content.Context)this, org.spf.mobi.ui.common.SPFCommonListing.class);
        org.spf.utils.Constants.SCREENS a1 = org.spf.utils.Constants.SCREENS.APPEAL;
        int i = a1.ordinal();
        a0.putExtra("SCREEN_ID", i);
        int i0 = a.getId();
        switch(i0){
            case 2131165190: {
                android.content.Intent a2 = new android.content.Intent((android.content.Context)this, org.spf.mobi.ui.common.SPFLocationSearch.class);
                org.spf.utils.Constants.SCREENS a3 = org.spf.utils.Constants.SCREENS.APPEAL;
                int i1 = a3.ordinal();
                a2.putExtra("SCREEN_ID", i1);
                this.startActivity(a2);
                break;
            }
            case 2131165188: {
                org.spf.utils.Constants.POLICE_APPEAL.URL a4 = org.spf.utils.Constants.POLICE_APPEAL.URL.DISPLAY_BY_DATE;
                String s = org.spf.utils.Constants.POLICE_APPEAL.URL.getUrl(a4);
                a0.putExtra("PASSING_URL", s);
                this.startActivity(a0);
                break;
            }
            case 2131165189: {
                label1: {
                    this.showDialog(0, (android.os.Bundle)null);
                    Thread a5 = this.thread;
                    label0: {
                        if(a5 == null)
                        {
                            break label0;
                        }
                        Thread a6 = this.thread;
                        boolean b = a6.isAlive();
                        if(b)
                        {
                            break label1;
                        }
                    }
                    org.spf.mobi.ui.appeal.SPFPoliceAppeal.1 a7 = new org.spf.mobi.ui.appeal.SPFPoliceAppeal.1(this);
                    this.thread = a7;
                    Thread a8 = this.thread;
                    a8.start();
                    break;
                }
            }
        }
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
        this.setContentView(2130903040);
        android.os.Handler a0 = new android.os.Handler();
        this.mHandler = a0;
        org.spf.mobi.ui.appeal.PoliceAppealFillData a1 = new org.spf.mobi.ui.appeal.PoliceAppealFillData((android.app.Activity)this);
        org.spf.utils.Utils.setDetailRef((org.spf.mobi.ui.common.SPFIGetFillView)a1);
        android.view.View a2 = this.findViewById(2131165246);
        android.widget.TextView dummy = (android.widget.TextView)a2;
        android.widget.TextView a3 = (android.widget.TextView)a2;
        a3.setText(2131034115);
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
                org.spf.mobi.ui.appeal.SPFPoliceAppeal.3 a5 = new org.spf.mobi.ui.appeal.SPFPoliceAppeal.3(this);
                a4.setItems((CharSequence[])a3, (android.content.DialogInterface.OnClickListener)a5);
                org.spf.mobi.ui.appeal.SPFPoliceAppeal.4 a6 = new org.spf.mobi.ui.appeal.SPFPoliceAppeal.4(this);
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
                org.spf.mobi.ui.appeal.SPFPoliceAppeal.2 a10 = new org.spf.mobi.ui.appeal.SPFPoliceAppeal.2(this);
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
}
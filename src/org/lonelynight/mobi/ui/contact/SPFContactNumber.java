package org.spf.mobi.ui.contact;

public class SPFContactNumber extends org.spf.mobi.ui.SPFActivity implements org.spf.utils.Constants {
    private android.content.Context mContext;
    private android.widget.LinearLayout mLinearLayout1;
    private android.widget.RelativeLayout mLinearLayout10;
    private android.widget.RelativeLayout mLinearLayout11;
    private android.widget.RelativeLayout mLinearLayout13;
    private android.widget.LinearLayout mLinearLayout2;
    private android.widget.LinearLayout mLinearLayout3;
    private android.widget.LinearLayout mLinearLayout4;
    private android.widget.LinearLayout mLinearLayout5;
    private android.widget.LinearLayout mLinearLayout6;
    private android.widget.LinearLayout mLinearLayout7;
    private android.widget.LinearLayout mLinearLayout8;
    private android.widget.LinearLayout mLinearLayout9;
    
    public SPFContactNumber()
    {
        super();
        this.mLinearLayout13 = null;
    }
    
    public void call(android.view.View a)
    {
        String s = null;
        int i = a.getId();
        String s0 = null;
        switch(i){
            case 2131165234: {
                android.view.View a0 = a.findViewById(2131165234);
                Object a1 = a0.getTag();
                String s1 = (String)a1;
                s = s1;
                break;
            }
            case 2131165232: {
                android.view.View a2 = a.findViewById(2131165232);
                Object a3 = a2.getTag();
                String s2 = (String)a3;
                s = s2;
                break;
            }
            case 2131165229: {
                android.view.View a4 = a.findViewById(2131165229);
                Object a5 = a4.getTag();
                String s3 = (String)a5;
                s = s3;
                break;
            }
            case 2131165228: {
                android.view.View a6 = a.findViewById(2131165228);
                Object a7 = a6.getTag();
                String s4 = (String)a7;
                s = s4;
                break;
            }
            case 2131165227: {
                android.view.View a8 = a.findViewById(2131165227);
                Object a9 = a8.getTag();
                String s5 = (String)a9;
                s = s5;
                break;
            }
            case 2131165226: {
                android.view.View a10 = a.findViewById(2131165226);
                Object a11 = a10.getTag();
                String s6 = (String)a11;
                s = s6;
                break;
            }
            case 2131165225: {
                android.view.View a12 = a.findViewById(2131165225);
                Object a13 = a12.getTag();
                String s7 = (String)a13;
                s = s7;
                break;
            }
            case 2131165224: {
                android.view.View a14 = a.findViewById(2131165224);
                Object a15 = a14.getTag();
                String s8 = (String)a15;
                s = s8;
                break;
            }
            case 2131165223: {
                android.view.View a16 = a.findViewById(2131165223);
                Object a17 = a16.getTag();
                String s9 = (String)a17;
                s = s9;
                break;
            }
            case 2131165222: {
                android.view.View a18 = a.findViewById(2131165222);
                Object a19 = a18.getTag();
                String s10 = (String)a19;
                s = s10;
                break;
            }
            case 2131165221: {
                android.view.View a20 = a.findViewById(2131165221);
                Object a21 = a20.getTag();
                String s11 = (String)a21;
                s = s11;
                break;
            }
            case 2131165219: {
                android.view.View a22 = a.findViewById(2131165219);
                Object a23 = a22.getTag();
                String s12 = (String)a23;
                s = s12;
                break;
            }
            default: {
                s = s0;
            }
        }
        try
        {
            StringBuilder a24 = new StringBuilder("Phone Number ");
            StringBuilder a25 = a24.append(s);
            String s13 = a25.toString();
            android.util.Log.i("PARSE", s13);
            android.content.Intent a26 = new android.content.Intent("android.intent.action.CALL");
            StringBuilder a27 = new StringBuilder("tel:");
            StringBuilder a28 = a27.append(s);
            String s14 = a28.toString();
            android.net.Uri a29 = android.net.Uri.parse(s14);
            a26.setData(a29);
            android.content.Context a30 = this.mContext;
            a30.startActivity(a26);
        }
        catch(android.content.ActivityNotFoundException a31)
        {
            android.util.Log.e("SPFPoliceStationResult", "Call failed", (Throwable)a31);
        }
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        super.onCreate(a);
        this.mContext = this;
        this.setContentView(2130903045);
        android.view.View a0 = this.findViewById(2131165246);
        android.widget.TextView a1 = (android.widget.TextView)a0;
        a1.setText(2131034120);
        android.view.View a2 = this.findViewById(2131165221);
        android.widget.LinearLayout a3 = (android.widget.LinearLayout)a2;
        this.mLinearLayout1 = a3;
        android.widget.LinearLayout a4 = this.mLinearLayout1;
        android.content.Context a5 = this.mContext;
        android.content.res.Resources a6 = a5.getResources();
        String s = a6.getString(2131034158);
        a4.setTag((Object)s);
        android.widget.LinearLayout a7 = this.mLinearLayout1;
        a7.setOnClickListener((android.view.View.OnClickListener)new android.view.View.OnClickListener() {
            
            public void onClick(android.view.View a)
            {
                onPhone(a);
            }
        });
        android.view.View a9 = this.findViewById(2131165222);
        android.widget.LinearLayout a10 = (android.widget.LinearLayout)a9;
        this.mLinearLayout2 = a10;
        android.widget.LinearLayout a11 = this.mLinearLayout2;
        android.content.Context a12 = this.mContext;
        android.content.res.Resources a13 = a12.getResources();
        String s0 = a13.getString(2131034161);
        a11.setTag((Object)s0);
        android.widget.LinearLayout a14 = this.mLinearLayout2;
        a14.setOnClickListener((android.view.View.OnClickListener)new android.view.View.OnClickListener() {  
            public void onClick(android.view.View a)
            {
                onPhone(a);
            }
        });
        android.view.View a16 = this.findViewById(2131165219);
        android.widget.LinearLayout a17 = (android.widget.LinearLayout)a16;
        this.mLinearLayout3 = a17;
        android.widget.LinearLayout a18 = this.mLinearLayout3;
        android.content.Context a19 = this.mContext;
        android.content.res.Resources a20 = a19.getResources();
        String s1 = a20.getString(2131034164);
        a18.setTag((Object)s1);
        android.widget.LinearLayout a21 = this.mLinearLayout3;
        a21.setOnClickListener((android.view.View.OnClickListener)new android.view.View.OnClickListener() {
            
            public void onClick(android.view.View a)
            {
                onPhone(a);
            }
        });
        android.view.View a23 = this.findViewById(2131165223);
        android.widget.LinearLayout a24 = (android.widget.LinearLayout)a23;
        this.mLinearLayout4 = a24;
        android.widget.LinearLayout a25 = this.mLinearLayout4;
        android.content.Context a26 = this.mContext;
        android.content.res.Resources a27 = a26.getResources();
        String s2 = a27.getString(2131034168);
        a25.setTag((Object)s2);
        android.widget.LinearLayout a28 = this.mLinearLayout4;
        a28.setOnClickListener((android.view.View.OnClickListener)new android.view.View.OnClickListener() {
            
            public void onClick(android.view.View a)
            {
                onPhone(a);
            }
        });
        android.view.View a30 = this.findViewById(2131165224);
        android.widget.LinearLayout a31 = (android.widget.LinearLayout)a30;
        this.mLinearLayout5 = a31;
        android.widget.LinearLayout a32 = this.mLinearLayout5;
        android.content.Context a33 = this.mContext;
        android.content.res.Resources a34 = a33.getResources();
        String s3 = a34.getString(2131034171);
        a32.setTag((Object)s3);
        android.widget.LinearLayout a35 = this.mLinearLayout5;
        a35.setOnClickListener((android.view.View.OnClickListener)new android.view.View.OnClickListener() {
            
            public void onClick(android.view.View a)
            {
                onPhone(a);
            }
        });
        android.view.View a37 = this.findViewById(2131165225);
        android.widget.LinearLayout a38 = (android.widget.LinearLayout)a37;
        this.mLinearLayout6 = a38;
        android.widget.LinearLayout a39 = this.mLinearLayout6;
        android.content.Context a40 = this.mContext;
        android.content.res.Resources a41 = a40.getResources();
        String s4 = a41.getString(2131034174);
        a39.setTag((Object)s4);
        android.widget.LinearLayout a42 = this.mLinearLayout6;
        a42.setOnClickListener((android.view.View.OnClickListener)new android.view.View.OnClickListener() {
            
            public void onClick(android.view.View a)
            {
                onPhone(a);
            }
        });
        android.view.View a44 = this.findViewById(2131165226);
        android.widget.LinearLayout a45 = (android.widget.LinearLayout)a44;
        this.mLinearLayout7 = a45;
        android.widget.LinearLayout a46 = this.mLinearLayout7;
        android.content.Context a47 = this.mContext;
        android.content.res.Resources a48 = a47.getResources();
        String s5 = a48.getString(2131034180);
        a46.setTag((Object)s5);
        android.widget.LinearLayout a49 = this.mLinearLayout7;
        a49.setOnClickListener((android.view.View.OnClickListener)new android.view.View.OnClickListener() {
            
            public void onClick(android.view.View a)
            {
                onPhone(a);
            }
        });
        android.view.View a51 = this.findViewById(2131165227);
        android.widget.LinearLayout a52 = (android.widget.LinearLayout)a51;
        this.mLinearLayout8 = a52;
        android.widget.LinearLayout a53 = this.mLinearLayout8;
        android.content.Context a54 = this.mContext;
        android.content.res.Resources a55 = a54.getResources();
        String s6 = a55.getString(2131034183);
        a53.setTag((Object)s6);
        android.widget.LinearLayout a56 = this.mLinearLayout8;
        a56.setOnClickListener((android.view.View.OnClickListener)new android.view.View.OnClickListener() {
            
            public void onClick(android.view.View a)
            {
                onPhone(a);
            }
        });
        android.view.View a58 = this.findViewById(2131165228);
        android.widget.LinearLayout a59 = (android.widget.LinearLayout)a58;
        this.mLinearLayout9 = a59;
        android.widget.LinearLayout a60 = this.mLinearLayout9;
        android.content.Context a61 = this.mContext;
        android.content.res.Resources a62 = a61.getResources();
        String s7 = a62.getString(2131034189);
        a60.setTag((Object)s7);
        android.widget.LinearLayout a63 = this.mLinearLayout9;
        a63.setOnClickListener((android.view.View.OnClickListener)new android.view.View.OnClickListener() {
            
            public void onClick(android.view.View a)
            {
                onPhone(a);
            }
        });
        android.view.View a65 = this.findViewById(2131165229);
        android.widget.RelativeLayout a66 = (android.widget.RelativeLayout)a65;
        this.mLinearLayout10 = a66;
        android.widget.RelativeLayout a67 = this.mLinearLayout10;
        android.content.Context a68 = this.mContext;
        android.content.res.Resources a69 = a68.getResources();
        String s8 = a69.getString(2131034195);
        a67.setTag((Object)s8);
        android.widget.RelativeLayout a70 = this.mLinearLayout10;
        a70.setOnClickListener((android.view.View.OnClickListener)new android.view.View.OnClickListener() {
            
            public void onClick(android.view.View a)
            {
                onPhone(a);
            }
        });
        android.view.View a72 = this.findViewById(2131165232);
        android.widget.RelativeLayout a73 = (android.widget.RelativeLayout)a72;
        this.mLinearLayout11 = a73;
        android.widget.RelativeLayout a74 = this.mLinearLayout11;
        android.content.Context a75 = this.mContext;
        android.content.res.Resources a76 = a75.getResources();
        String s9 = a76.getString(2131034196);
        a74.setTag((Object)s9);
        android.widget.RelativeLayout a77 = this.mLinearLayout11;
        a77.setOnClickListener((android.view.View.OnClickListener)new android.view.View.OnClickListener() {
            
            public void onClick(android.view.View a)
            {
                onPhone(a);
            }
        });
        android.view.View a79 = this.findViewById(2131165234);
        android.widget.RelativeLayout a80 = (android.widget.RelativeLayout)a79;
        this.mLinearLayout13 = a80;
        android.widget.RelativeLayout a81 = this.mLinearLayout13;
        android.content.Context a82 = this.mContext;
        android.content.res.Resources a83 = a82.getResources();
        String s10 = a83.getString(2131034197);
        a81.setTag((Object)s10);
        android.widget.RelativeLayout a84 = this.mLinearLayout13;
        a84.setOnClickListener((android.view.View.OnClickListener)new android.view.View.OnClickListener() {
            
            public void onClick(android.view.View a)
            {
                onPhone(a);
            }
        });
    }
    
    public void onPhone(final android.view.View a)
    {
        String s = null;
        android.content.Context a0 = this.mContext;
        android.app.AlertDialog.Builder a1 = new android.app.AlertDialog.Builder(a0);
        a1.setTitle((CharSequence)"Police@SG");
        int i = a.getId();
        String s0 = null;
        switch(i){
            case 2131165234: {
                android.content.Context a2 = this.mContext;
                android.content.res.Resources a3 = a2.getResources();
                String s1 = a3.getString(2131034197);
                s = s1;
                break;
            }
            case 2131165232: {
                android.content.Context a4 = this.mContext;
                android.content.res.Resources a5 = a4.getResources();
                String s2 = a5.getString(2131034196);
                s = s2;
                break;
            }
            case 2131165229: {
                android.content.Context a6 = this.mContext;
                android.content.res.Resources a7 = a6.getResources();
                String s3 = a7.getString(2131034195);
                s = s3;
                break;
            }
            case 2131165228: {
                android.content.Context a8 = this.mContext;
                android.content.res.Resources a9 = a8.getResources();
                String s4 = a9.getString(2131034189);
                s = s4;
                break;
            }
            case 2131165227: {
                android.content.Context a10 = this.mContext;
                android.content.res.Resources a11 = a10.getResources();
                String s5 = a11.getString(2131034183);
                s = s5;
                break;
            }
            case 2131165226: {
                android.content.Context a12 = this.mContext;
                android.content.res.Resources a13 = a12.getResources();
                String s6 = a13.getString(2131034180);
                s = s6;
                break;
            }
            case 2131165225: {
                android.content.Context a14 = this.mContext;
                android.content.res.Resources a15 = a14.getResources();
                String s7 = a15.getString(2131034174);
                s = s7;
                break;
            }
            case 2131165224: {
                android.content.Context a16 = this.mContext;
                android.content.res.Resources a17 = a16.getResources();
                String s8 = a17.getString(2131034171);
                s = s8;
                break;
            }
            case 2131165223: {
                android.content.Context a18 = this.mContext;
                android.content.res.Resources a19 = a18.getResources();
                String s9 = a19.getString(2131034168);
                s = s9;
                break;
            }
            case 2131165222: {
                android.content.Context a20 = this.mContext;
                android.content.res.Resources a21 = a20.getResources();
                String s10 = a21.getString(2131034161);
                s = s10;
                break;
            }
            case 2131165221: {
                android.content.Context a22 = this.mContext;
                android.content.res.Resources a23 = a22.getResources();
                String s11 = a23.getString(2131034158);
                s = s11;
                break;
            }
            case 2131165219: {
                android.content.Context a24 = this.mContext;
                android.content.res.Resources a25 = a24.getResources();
                String s12 = a25.getString(2131034164);
                s = s12;
                break;
            }
            default: {
                s = s0;
            }
        }
        a1.setMessage((CharSequence)s);
        a1.setNegativeButton((CharSequence)"Cancel", (android.content.DialogInterface.OnClickListener)new android.content.DialogInterface.OnClickListener() {
            
            public void onClick(android.content.DialogInterface a, int i)
            {
            }
        });
        a1.setPositiveButton((CharSequence)"Call", (android.content.DialogInterface.OnClickListener)new android.content.DialogInterface.OnClickListener() {
            
            public void onClick(android.content.DialogInterface dialog, int i)
            {
                ((SPFContactNumber) dialog).call(a);
            }
        });
        android.app.AlertDialog a28 = a1.create();
        a28.show();
    }
}
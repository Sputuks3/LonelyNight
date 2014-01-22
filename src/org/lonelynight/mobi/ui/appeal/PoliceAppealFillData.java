package org.spf.mobi.ui.appeal;

import org.spf.mobi.ui.common.SPFDetailPage;
import org.spf.utils.Constants;

import android.app.Activity;
import android.content.*;
import android.os.*;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

public class PoliceAppealFillData implements org.spf.mobi.ui.common.SPFIGetFillView {
    Activity mContext;
    
    public PoliceAppealFillData(Activity a)
    {
        super();
        this.mContext = a;
    }
    
    public void getViewFor(Parcelable a, Handler a0, View a1)
    {
    }
    
    public void onListItemClick(ListView arg, View a0, int i, long j, Context a1)
    {
        String s = null;
        Object a2 = a0.getTag();
        if(a2 == null)
        {
            s = "";
        }
        else
        {
            Object a3 = a0.getTag();
            String s0 = (String)a3;
            StringBuilder a4 = new StringBuilder("ID VALUE ");
            StringBuilder a5 = a4.append(s0);
            String s1 = a5.toString();
            Log.i("START WITH ID", s1);
            s = s0;
        }
        Constants.POLICE_APPEAL.URL a6 = Constants.POLICE_APPEAL.URL.APPEAL_ID;
        String s2 = Constants.POLICE_APPEAL.URL.getUrl(a6);
        StringBuilder a7 = new StringBuilder(s2);
        a7.append(s);
        Activity a8 = this.mContext;
        Intent a9 = new Intent((Context)a8, SPFDetailPage.class);
        String s3 = a7.toString();
        a9.putExtra("PASSING_URL", s3);
        Constants.SCREENS a10 = Constants.SCREENS.APPEAL;
        int i0 = a10.ordinal();
        a9.putExtra("SCREEN_ID", i0);
        Activity a11 = this.mContext;
        a11.startActivity(a9);
    }

	
}
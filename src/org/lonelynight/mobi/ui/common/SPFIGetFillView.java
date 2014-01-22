package org.spf.mobi.ui.common;

abstract public interface SPFIGetFillView {
    abstract public void getViewFor(android.os.Parcelable arg, android.os.Handler arg0, android.view.View arg1);
    
    
    abstract public void onListItemClick(android.widget.ListView arg, android.view.View arg0, int arg1, long arg2, android.content.Context arg3);
}
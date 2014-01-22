package org.spf.facebook;

public class DialogError extends Throwable {
    final private static long serialVersionUID = 1L;
    private int mErrorCode;
    private String mFailingUrl;
    
    public DialogError(String s, int i, String s0)
    {
        super(s);
        this.mErrorCode = i;
        this.mFailingUrl = s0;
    }
    
    int getErrorCode()
    {
        int i = this.mErrorCode;
        return i;
    }
    
    String getFailingUrl()
    {
        String s = this.mFailingUrl;
        return s;
    }
}
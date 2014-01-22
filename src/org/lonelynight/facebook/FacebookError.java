package org.spf.facebook;

public class FacebookError extends Throwable {
    final private static long serialVersionUID = 1L;
    private int mErrorCode;
    private String mErrorType;
    
    public FacebookError(String s)
    {
        super(s);
        this.mErrorCode = 0;
    }
    
    public FacebookError(String s, String s0, int i)
    {
        super(s);
        this.mErrorCode = 0;
        this.mErrorType = s0;
        this.mErrorCode = i;
    }
    
    public int getErrorCode()
    {
        int i = this.mErrorCode;
        return i;
    }
    
    public String getErrorType()
    {
        String s = this.mErrorType;
        return s;
    }
}
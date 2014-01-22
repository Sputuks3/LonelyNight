package org.spf.facebook;

import android.content.Context;
import android.os.Bundle;

public class AsyncFacebookRunner {
    Facebook fb;
    
    public AsyncFacebookRunner(Facebook a)
    {
        super();
        this.fb = a;
    }
    
    public void logout(Context a, RequestListener a0)
    {
        this.logout(a, a0, (Object)null);
    }
    
    public void logout(final Context a, final RequestListener a0, final Object a1)
    {
		Runnable runner = new Runnable(){
			@Override
			public void run()
		    {
		        String s = fb.logout(a);

				    if(s.length() != 0)
				    {
				    	if(!s.equals("false"))
				    	{
				    		a0.onComplete(s, a1);
				    		return;
				    	}
				    }

				a0.onFacebookError(new FacebookError("auth.expireSession failed"), a1);
		                
		    }      
		        
		    
		};
		new Thread(runner).start();
        //1 a3 = new 1(this, a, (RequestListener)a2, a1);
        //a3.start();
    }
    
    public void request(Bundle a, RequestListener a0)
    {
        this.request((String)null, a, "GET", a0, (Object)null);
    }
    
    public void request(Bundle a, RequestListener a0, Object a1)
    {
        this.request((String)null, a, "GET", a0, a1);
    }
    
    public void request(final String s, final Bundle a, final String s0, final RequestListener a0, final Object a1)
    {
        Runnable runner = new Runnable() {
        	public void run()
            {
                		String s1 = fb.request(s, a, s0);
						a0.onComplete(s1, a1);
                        
                        
            }
        };
        
        new Thread(runner).start();
    }
    
    public void request(String s, Bundle a, RequestListener a0)
    {
        this.request(s, a, "GET", a0, (Object)null);
    }
    
    public void request(String s, Bundle a, RequestListener a0, Object a1)
    {
        this.request(s, a, "GET", a0, a1);
    }
    
    public void request(String s, RequestListener a)
    {
        Object a0 = a;
        Bundle a1 = new Bundle();
        this.request(s, a1, "GET", (RequestListener)a0, (Object)null);
    }
    
    public void request(String s, RequestListener a, Object a0)
    {
        Object a1 = a;
        Bundle a2 = new Bundle();
        this.request(s, a2, "GET", (RequestListener)a1, a0);
    }
    
    abstract public interface RequestListener {
        abstract public void onComplete(String arg, Object arg0);
        
        
        abstract public void onFacebookError(org.spf.facebook.FacebookError arg, Object arg0);
        
        
        abstract public void onFileNotFoundException(java.io.FileNotFoundException arg, Object arg0);
        
        
        abstract public void onIOException(java.io.IOException arg, Object arg0);
        
        
        abstract public void onMalformedURLException(java.net.MalformedURLException arg, Object arg0);
    }
    
}
package org.spf.utils.parser;

public class TrustManagerManipulator implements javax.net.ssl.X509TrustManager {
    final private static java.security.cert.X509Certificate[] acceptedIssuers;
    private static javax.net.ssl.TrustManager[] trustManagers;
    
    static
    {
        java.security.cert.X509Certificate[] a = new java.security.cert.X509Certificate[0];
        acceptedIssuers = a;
    }
    
    public TrustManagerManipulator()
    {
        super();
    }
    
    public static void allowAllSSL()
    {
        javax.net.ssl.SSLContext a = null;
        org.spf.utils.parser.TrustManagerManipulator.1 a0 = new org.spf.utils.parser.TrustManagerManipulator.1();
        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier((javax.net.ssl.HostnameVerifier)a0);
        Object[] a1 = trustManagers;
        if(a1 == null)
        {
            javax.net.ssl.TrustManager[] a2 = new javax.net.ssl.TrustManager[1];
            org.spf.utils.parser.TrustManagerManipulator a3 = new org.spf.utils.parser.TrustManagerManipulator();
            a2[0] = (javax.net.ssl.TrustManager)a3;
            trustManagers = a2;
        }
        label0: {
            javax.net.ssl.SSLContext a4 = null;
            javax.net.ssl.SSLContext a5 = null;
            java.security.NoSuchAlgorithmException a6 = null;
            try
            {
                try
                {
                    a4 = null;
                    a5 = null;
                    javax.net.ssl.SSLContext a7 = javax.net.ssl.SSLContext.getInstance("TLS");
                    a4 = a7;
                    a5 = a7;
                    Object[] a8 = trustManagers;
                    a4 = a7;
                    a5 = a7;
                    java.security.SecureRandom a9 = new java.security.SecureRandom();
                    a4 = a7;
                    a5 = a7;
                    a7.init((javax.net.ssl.KeyManager[])null, (javax.net.ssl.TrustManager[])a8, a9);
                    a = a7;
                    break label0;
                }
                catch(java.security.NoSuchAlgorithmException a10)
                {
                    a6 = a10;
                }
            }
            catch(java.security.KeyManagementException a11)
            {
                a11.printStackTrace();
                a = a4;
                break label0;
            }
            a6.printStackTrace();
            a = a5;
        }
        javax.net.ssl.SSLSocketFactory a12 = a.getSocketFactory();
        javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(a12);
    }
    
    public void checkClientTrusted(java.security.cert.X509Certificate[] a, String s)
    {
    }
    
    public void checkServerTrusted(java.security.cert.X509Certificate[] a, String s)
    {
    }
    
    public java.security.cert.X509Certificate[] getAcceptedIssuers()
    {
        java.security.cert.X509Certificate[] a = acceptedIssuers;
        return a;
    }
    
    public boolean isClientTrusted(java.security.cert.X509Certificate[] a)
    {
        return true;
    }
    
    public boolean isServerTrusted(java.security.cert.X509Certificate[] a)
    {
        return true;
    }
}
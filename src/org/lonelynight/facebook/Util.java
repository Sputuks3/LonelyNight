package org.spf.facebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;

final public class Util {
    public Util()
    {
        super();
    }
    
    public static void clearCookies(Context a)
    {
        CookieSyncManager.createInstance(a);
        CookieManager a0 = CookieManager.getInstance();
        a0.removeAllCookie();
    }
    
    public static Bundle decodeUrl(String s)
    {
        Bundle a = new Bundle();
        if(s != null)
        {
            String[] a0 = s.split("&");
            int i = a0.length;
            int i0 = 0;
            while(true)
            {
                if(i0 < i)
                {
                    String s0 = null;
                    String s1 = a0[i0];
                    String[] a1 = s1.split("=");
                    int i1 = a1.length;
                    if(i1 <= 1)
                    {
                        s0 = "";
                    }
                    else
                    {
                        String s2 = a1[1];
                        s0 = s2;
                    }
                    String s3 = a1[0];
                    String s4 = URLDecoder.decode(s3);
                    String s5 = URLDecoder.decode(s0);
                    a.putString(s4, s5);
                    int i2 = i0 + 1;
                    i0 = i2;
                }
                else
                {
                    break;
                }
            }
        }
        return a;
    }
    
    public static String encodePostBody(Bundle a, String s)
    {
        String s0 = null;
        if(a != null)
        {
            StringBuilder a0 = new StringBuilder();
            Set<String> a1 = a.keySet();
            Iterator<String> a2 = a1.iterator();
            while(true)
            {
                boolean b = a2.hasNext();
                if(b)
                {
                    String a3 = (String) a2.next();
                    byte[] a4 = a.getByteArray(a3);
                    if(a4 == null)
                    {
                        StringBuilder a5 = new StringBuilder("Content-Disposition: form-data; name=\"");
                        StringBuilder a6 = a5.append(a3);
                        StringBuilder a7 = a6.append("\"\r\n\r\n");
                        String s2 = a.getString(a3);
                        StringBuilder a8 = a7.append(s2);
                        a0.append(a8.toString());
                        StringBuilder a9 = new StringBuilder("\r\n--");
                        StringBuilder a10 = a9.append(s);
                        StringBuilder a11 = a10.append("\r\n");
                        a0.append(a11.toString());
                    }
                }
                else
                {
                    break;
                }
            }
            String s5 = a0.toString();
            s0 = s5;
        }
        else
        {
            s0 = "";
        }
        return s0;
    }
    
    public static String encodeUrl(Bundle a)
    {
        String s = null;
        if(a != null)
        {
            StringBuilder a0 = new StringBuilder();
            Set<String> a1 = a.keySet();
            Iterator<String> a2 = a1.iterator();
            int i = 1;
            while(true)
            {
                boolean b = a2.hasNext();
                if(b)
                {
                	String s0 = (String) a2.next();

                    if(i == 0)
                    {
                        a0.append("&");
                    }
                    String s1 = URLEncoder.encode(s0);
                    String s2 = String.valueOf((Object)s1);
                    StringBuilder a4 = new StringBuilder(s2);
                    StringBuilder a5 = a4.append("=");
                    String s4 = URLEncoder.encode(s0);
                    StringBuilder a6 = a5.append(s4);
                    String s5 = a6.toString();
                    a0.append(s5);
                    i = 0;
                }
                else
                {
                    break;
                }
            }
            StringBuilder a7 = new StringBuilder("URL:::::::");
            String s6 = a0.toString();
            StringBuilder a8 = a7.append(s6);
            String s7 = a8.toString();
            Log.i("FB ULR", s7);
            String s8 = a0.toString();
            s = s8;
        }
        else
        {
            s = "";
        }
        return s;
    }
    
    public static String openUrl(String s, String s0, Bundle a) throws Exception
    {
        String s1 = null;
        String s2 = null;
        boolean b = s0.equals((Object)"GET");
        if(!b)
        {
            s1 = s;
        }
        else
        {
            String s3 = String.valueOf((Object)s);
            StringBuilder a0 = new StringBuilder(s3);
            StringBuilder a1 = a0.append("?");
            String s4 = Util.encodeUrl(a);
            StringBuilder a2 = a1.append(s4);
            String s5 = a2.toString();
            s1 = s5;
        }
        String s6 = String.valueOf((Object)s0);
        StringBuilder a3 = new StringBuilder(s6);
        StringBuilder a4 = a3.append(" URL: ");
        StringBuilder a5 = a4.append(s1);
        String s7 = a5.toString();
        Log.i("Facebook-Util", s7);
        URL a6 = new URL(s1);
        URLConnection a7 = a6.openConnection();
        HttpURLConnection a8 = (HttpURLConnection)a7;
        Properties a9 = System.getProperties();
        String s8 = a9.getProperty("http.agent");
        String s9 = String.valueOf((Object)s8);
        StringBuilder a10 = new StringBuilder(s9);
        StringBuilder a11 = a10.append(" FacebookAndroidSDK");
        String s10 = a11.toString();
        a8.setRequestProperty("User-Agent", s10);
        boolean b0 = s0.equals((Object)"GET");
        if(!b0)
        {
            Bundle a12 = new Bundle();
            Set<String> a13 = a.keySet();
            Iterator<String> a14 = a13.iterator();
            while(true)
            {
                boolean b1 = a14.hasNext();
                if(b1)
                {
                	String s11 = (String) a14.next();
                    byte[] a16 = a.getByteArray(s11);
                    if(a16 != null)
                    {
                        byte[] a17 = a.getByteArray(s11);
                        a12.putByteArray(s11, a17);
                    }
                }
                else
                {
                    break;
                }
            }
            boolean b2 = a.containsKey("method");
            if(!b2)
            {
                a.putString("method", s0);
            }
            boolean b3 = a.containsKey("access_token");
            if(b3)
            {
                String s12 = a.getString("access_token");
                String s13 = URLDecoder.decode(s12);
                a.putString("access_token", s13);
            }
            a8.setRequestMethod("POST");
            StringBuilder a18 = new StringBuilder("multipart/form-data;boundary=");
            StringBuilder a19 = a18.append("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
            String s14 = a19.toString();
            a8.setRequestProperty("Content-Type", s14);
            a8.setDoOutput(true);
            a8.setDoInput(true);
            a8.setRequestProperty("Connection", "Keep-Alive");
            a8.connect();
            OutputStream a20 = a8.getOutputStream();
            java.io.BufferedOutputStream a21 = new java.io.BufferedOutputStream(a20);
            StringBuilder a22 = new StringBuilder("--");
            StringBuilder a23 = a22.append("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
            StringBuilder a24 = a23.append("\r\n");
            String s15 = a24.toString();
            byte[] a25 = s15.getBytes();
            ((OutputStream)a21).write(a25);
            String s16 = Util.encodePostBody(a, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
            byte[] a26 = s16.getBytes();
            ((OutputStream)a21).write(a26);
            String s17 = String.valueOf((Object)"\r\n");
            StringBuilder a27 = new StringBuilder(s17);
            StringBuilder a28 = a27.append("--");
            StringBuilder a29 = a28.append("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
            StringBuilder a30 = a29.append("\r\n");
            String s18 = a30.toString();
            byte[] a31 = s18.getBytes();
            ((OutputStream)a21).write(a31);
            boolean b4 = a12.isEmpty();
            if(!b4)
            {
                Set<String> a32 = a12.keySet();
                Iterator<String> a33 = a32.iterator();
                while(true)
                {
                    boolean b5 = a33.hasNext();
                    if(b5)
                    {
                        Object a34 = a33.next();
                        String s19 = (String)a34;
                        StringBuilder a35 = new StringBuilder("Content-Disposition: form-data; filename=\"");
                        StringBuilder a36 = a35.append(s19);
                        StringBuilder a37 = a36.append("\"");
                        StringBuilder a38 = a37.append("\r\n");
                        String s20 = a38.toString();
                        byte[] a39 = s20.getBytes();
                        ((OutputStream)a21).write(a39);
                        StringBuilder a40 = new StringBuilder("Content-Type: content/unknown");
                        StringBuilder a41 = a40.append("\r\n");
                        StringBuilder a42 = a41.append("\r\n");
                        String s21 = a42.toString();
                        byte[] a43 = s21.getBytes();
                        ((OutputStream)a21).write(a43);
                        byte[] a44 = a12.getByteArray(s19);
                        ((OutputStream)a21).write(a44);
                        String s22 = String.valueOf((Object)"\r\n");
                        StringBuilder a45 = new StringBuilder(s22);
                        StringBuilder a46 = a45.append("--");
                        StringBuilder a47 = a46.append("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
                        StringBuilder a48 = a47.append("\r\n");
                        String s23 = a48.toString();
                        byte[] a49 = s23.getBytes();
                        ((OutputStream)a21).write(a49);
                    }
                    else
                    {
                        break;
                    }
                }
            }
            ((OutputStream)a21).flush();
        }
        try
        {
            java.io.InputStream a50 = a8.getInputStream();
            String s24 = Util.read(a50);
            s2 = s24;
        }
        catch(java.io.FileNotFoundException ignoredException)
        {
            java.io.InputStream a51 = a8.getErrorStream();
            String s25 = Util.read(a51);
            s2 = s25;
        }
        return s2;
    }
    
    public static JSONObject parseJson(String s) throws JSONException, FacebookError
    {
        boolean b = s.equals((Object)"false");
        if(b)
        {
            FacebookError a = new FacebookError("request failed");
            throw a;
        }
        boolean b0 = s.equals((Object)"true");
        String s0 = b0?"{value : true}":s;
        org.json.JSONObject a0 = new JSONObject(s0);
        boolean b1 = a0.has("error");
        if(b1)
        {
            JSONObject a1 = a0.getJSONObject("error");
            String s1 = a1.getString("message");
            String s2 = a1.getString("type");
            org.spf.facebook.FacebookError a2 = new org.spf.facebook.FacebookError(s1, s2, 0);
            throw a2;
        }
        boolean b2 = a0.has("error_code");
        if(b2)
        {
            boolean b3 = a0.has("error_msg");
            if(b3)
            {
                String s3 = a0.getString("error_msg");
                String s4 = a0.getString("error_code");
                int i = Integer.parseInt(s4);
                FacebookError a3 = new FacebookError(s3, "", i);
                throw a3;
            }
        }
        boolean b4 = a0.has("error_code");
        if(b4)
        {
            String s5 = a0.getString("error_code");
            int i0 = Integer.parseInt(s5);
            FacebookError a4 = new FacebookError("request failed", "", i0);
            throw a4;
        }
        boolean b5 = a0.has("error_msg");
        if(b5)
        {
            String s6 = a0.getString("error_msg");
            FacebookError a5 = new FacebookError(s6);
            throw a5;
        }
        boolean b6 = a0.has("error_reason");
        if(b6)
        {
            String s7 = a0.getString("error_reason");
            FacebookError a6 = new FacebookError(s7);
            throw a6;
        }
        return a0;
    }
    
    public static Bundle parseUrl(String s)
    {
        Bundle a = null;
        String s0 = s.replace((CharSequence)"fbconnect", (CharSequence)"http");
        try
        {
            URL a0 = new URL(s0);
            String s1 = a0.getQuery();
            Bundle a1 = Util.decodeUrl(s1);
            String s2 = a0.getRef();
            Bundle a2 = Util.decodeUrl(s2);
            a1.putAll(a2);
            a = a1;
        }
        catch(MalformedURLException ignoredException)
        {
            Bundle a3 = new Bundle();
            a = a3;
        }
        return a;
    }
    
    private static String read(InputStream a) throws IOException
    {
        StringBuilder a0 = new StringBuilder();
        InputStreamReader a1 = new InputStreamReader(a);
        BufferedReader a2 = new BufferedReader((java.io.Reader)a1, 1000);
        String s = a2.readLine();
        String s0 = s;
        while(true)
        {
            if(s0 != null)
            {
                a0.append(s0);
                String s1 = a2.readLine();
                s0 = s1;
            }
            else
            {
                break;
            }
        }
        a.close();
        String s2 = a0.toString();
        return s2;
    }
    
    public static void showAlert(Context a, String s, String s0)
    {
        AlertDialog.Builder a0 = new AlertDialog.Builder(a);
        a0.setTitle((CharSequence)s);
        a0.setMessage((CharSequence)s0);
        AlertDialog a1 = a0.create();
        a1.show();
    }
}
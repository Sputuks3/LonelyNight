package org.spf.mobi.ui.common;

final public class ControlType extends Enum {
    final private static org.spf.mobi.ui.common.SimpleZoomListener.ControlType[] ENUM$VALUES;
    final public static org.spf.mobi.ui.common.SimpleZoomListener.ControlType ZOOM;
    
    static
    {
        org.spf.mobi.ui.common.SimpleZoomListener.ControlType a = new org.spf.mobi.ui.common.SimpleZoomListener.ControlType("ZOOM", 0);
        ZOOM = a;
        org.spf.mobi.ui.common.SimpleZoomListener.ControlType[] a0 = new org.spf.mobi.ui.common.SimpleZoomListener.ControlType[1];
        org.spf.mobi.ui.common.SimpleZoomListener.ControlType a1 = ZOOM;
        a0[0] = a1;
        ENUM$VALUES = a0;
    }
    
    private ControlType(String s, int i)
    {
        super(s, i);
    }
    
    public static org.spf.mobi.ui.common.SimpleZoomListener.ControlType valueOf(String s)
    {
        Enum a = Enum.valueOf(org.spf.mobi.ui.common.SimpleZoomListener.ControlType.class, s);
        org.spf.mobi.ui.common.SimpleZoomListener.ControlType dummy = (org.spf.mobi.ui.common.SimpleZoomListener.ControlType)a;
        org.spf.mobi.ui.common.SimpleZoomListener.ControlType a0 = (org.spf.mobi.ui.common.SimpleZoomListener.ControlType)a;
        return a0;
    }
    
    public static org.spf.mobi.ui.common.SimpleZoomListener.ControlType[] values()
    {
        org.spf.mobi.ui.common.SimpleZoomListener.ControlType[] a = ENUM$VALUES;
        int i = a.length;
        org.spf.mobi.ui.common.SimpleZoomListener.ControlType[] a0 = new org.spf.mobi.ui.common.SimpleZoomListener.ControlType[i];
        System.arraycopy((Object)a, 0, (Object)a0, 0, i);
        return a0;
    }
}
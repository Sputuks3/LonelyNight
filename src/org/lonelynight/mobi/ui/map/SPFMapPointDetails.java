package org.spf.mobi.ui.map;

public class SPFMapPointDetails extends org.spf.mobi.ui.SPFActivity implements org.spf.utils.Constants {
    org.spf.mobi.ui.map.custom.SPFStatisticAdapter adapter;
    private String appealID;
    private org.spf.data.SPFArrayList arrayListStatistics;
    private String clusterID;
    private String crimeID;
    android.widget.ImageView imageView;
    private android.widget.LinearLayout llStatisticTable;
    private android.widget.ListView lvStatistic;
    private android.os.Handler mHandler;
    private String missingPersonID;
    private String passedString;
    private org.spf.data.SPFStatisticsList statisticsData;
    private Thread thread;
    private android.widget.TextView txtRecordsInfo;
    private android.widget.TextView txtTblTitle;
    private String url;
    private String zoneId;
    
    public SPFMapPointDetails()
    {
        super();
        this.thread = null;
    }
    
    static Thread access$0(org.spf.mobi.ui.map.SPFMapPointDetails a)
    {
        Thread a0 = a.thread;
        return a0;
    }
    
    static void access$1(org.spf.mobi.ui.map.SPFMapPointDetails a, org.spf.data.SPFStatisticsList a0)
    {
        a.statisticsData = a0;
    }
    
    static org.spf.data.SPFStatisticsList access$2(org.spf.mobi.ui.map.SPFMapPointDetails a)
    {
        org.spf.data.SPFStatisticsList a0 = a.statisticsData;
        return a0;
    }
    
    static void access$3(org.spf.mobi.ui.map.SPFMapPointDetails a, org.spf.data.SPFArrayList a0)
    {
        a.arrayListStatistics = a0;
    }
    
    static android.os.Handler access$4(org.spf.mobi.ui.map.SPFMapPointDetails a)
    {
        android.os.Handler a0 = a.mHandler;
        return a0;
    }
    
    static org.spf.data.SPFArrayList access$5(org.spf.mobi.ui.map.SPFMapPointDetails a)
    {
        org.spf.data.SPFArrayList a0 = a.arrayListStatistics;
        return a0;
    }
    
    static android.widget.TextView access$6(org.spf.mobi.ui.map.SPFMapPointDetails a)
    {
        android.widget.TextView a0 = a.txtTblTitle;
        return a0;
    }
    
    static android.widget.ListView access$7(org.spf.mobi.ui.map.SPFMapPointDetails a)
    {
        android.widget.ListView a0 = a.lvStatistic;
        return a0;
    }
    
    static android.widget.TextView access$8(org.spf.mobi.ui.map.SPFMapPointDetails a)
    {
        android.widget.TextView a0 = a.txtRecordsInfo;
        return a0;
    }
    
    private int getHeadImg(String s)
    {
        int i = 0;
        label37: {
            boolean b = s.equalsIgnoreCase("blue_pin1");
            label2: {
                label3: {
                    label4: {
                        label5: {
                            label6: {
                                label7: {
                                    label8: {
                                        label9: {
                                            label10: {
                                                label11: {
                                                    label12: {
                                                        label13: {
                                                            label14: {
                                                                label15: {
                                                                    label16: {
                                                                        label17: {
                                                                            label18: {
                                                                                label19: {
                                                                                    label20: {
                                                                                        label21: {
                                                                                            label22: {
                                                                                                label23: {
                                                                                                    label24: {
                                                                                                        label25: {
                                                                                                            label26: {
                                                                                                                label27: {
                                                                                                                    label28: {
                                                                                                                        label29: {
                                                                                                                            label30: {
                                                                                                                                label31: {
                                                                                                                                    label32: {
                                                                                                                                        label33: {
                                                                                                                                            label34: {
                                                                                                                                                label35: {
                                                                                                                                                    label36: {
                                                                                                                                                        int i0 = 0;
                                                                                                                                                        label1: {
                                                                                                                                                            label0: {
                                                                                                                                                                if(!b)
                                                                                                                                                                {
                                                                                                                                                                    break label0;
                                                                                                                                                                }
                                                                                                                                                                i0 = 2130837523;
                                                                                                                                                                break label1;
                                                                                                                                                            }
                                                                                                                                                            boolean b0 = s.equalsIgnoreCase("blue_pin2");
                                                                                                                                                            if(b0)
                                                                                                                                                            {
                                                                                                                                                                break label2;
                                                                                                                                                            }
                                                                                                                                                            boolean b1 = s.equalsIgnoreCase("blue_pin3");
                                                                                                                                                            if(b1)
                                                                                                                                                            {
                                                                                                                                                                break label3;
                                                                                                                                                            }
                                                                                                                                                            boolean b2 = s.equalsIgnoreCase("blue_pin4");
                                                                                                                                                            if(b2)
                                                                                                                                                            {
                                                                                                                                                                break label4;
                                                                                                                                                            }
                                                                                                                                                            boolean b3 = s.equalsIgnoreCase("blue_pin5");
                                                                                                                                                            if(b3)
                                                                                                                                                            {
                                                                                                                                                                break label5;
                                                                                                                                                            }
                                                                                                                                                            boolean b4 = s.equalsIgnoreCase("blue_pin6");
                                                                                                                                                            if(b4)
                                                                                                                                                            {
                                                                                                                                                                break label6;
                                                                                                                                                            }
                                                                                                                                                            boolean b5 = s.equalsIgnoreCase("blue_pin7");
                                                                                                                                                            if(b5)
                                                                                                                                                            {
                                                                                                                                                                break label7;
                                                                                                                                                            }
                                                                                                                                                            boolean b6 = s.equalsIgnoreCase("darkPink_pin1");
                                                                                                                                                            if(b6)
                                                                                                                                                            {
                                                                                                                                                                break label8;
                                                                                                                                                            }
                                                                                                                                                            boolean b7 = s.equalsIgnoreCase("darkPink_pin2");
                                                                                                                                                            if(b7)
                                                                                                                                                            {
                                                                                                                                                                break label9;
                                                                                                                                                            }
                                                                                                                                                            boolean b8 = s.equalsIgnoreCase("darkPink_pin3");
                                                                                                                                                            if(b8)
                                                                                                                                                            {
                                                                                                                                                                break label10;
                                                                                                                                                            }
                                                                                                                                                            boolean b9 = s.equalsIgnoreCase("green_pin1");
                                                                                                                                                            if(b9)
                                                                                                                                                            {
                                                                                                                                                                break label11;
                                                                                                                                                            }
                                                                                                                                                            boolean b10 = s.equalsIgnoreCase("green_pin2");
                                                                                                                                                            if(b10)
                                                                                                                                                            {
                                                                                                                                                                break label12;
                                                                                                                                                            }
                                                                                                                                                            boolean b11 = s.equalsIgnoreCase("green_pin3");
                                                                                                                                                            if(b11)
                                                                                                                                                            {
                                                                                                                                                                break label13;
                                                                                                                                                            }
                                                                                                                                                            boolean b12 = s.equalsIgnoreCase("green_pin4");
                                                                                                                                                            if(b12)
                                                                                                                                                            {
                                                                                                                                                                break label14;
                                                                                                                                                            }
                                                                                                                                                            boolean b13 = s.equalsIgnoreCase("orange_pin1");
                                                                                                                                                            if(b13)
                                                                                                                                                            {
                                                                                                                                                                break label15;
                                                                                                                                                            }
                                                                                                                                                            boolean b14 = s.equalsIgnoreCase("orange_pin2");
                                                                                                                                                            if(b14)
                                                                                                                                                            {
                                                                                                                                                                break label16;
                                                                                                                                                            }
                                                                                                                                                            boolean b15 = s.equalsIgnoreCase("orange_pin3");
                                                                                                                                                            if(b15)
                                                                                                                                                            {
                                                                                                                                                                break label17;
                                                                                                                                                            }
                                                                                                                                                            boolean b16 = s.equalsIgnoreCase("orange_pin4");
                                                                                                                                                            if(b16)
                                                                                                                                                            {
                                                                                                                                                                break label18;
                                                                                                                                                            }
                                                                                                                                                            boolean b17 = s.equalsIgnoreCase("orange_pin5");
                                                                                                                                                            if(b17)
                                                                                                                                                            {
                                                                                                                                                                break label19;
                                                                                                                                                            }
                                                                                                                                                            boolean b18 = s.equalsIgnoreCase("orange_pin6");
                                                                                                                                                            if(b18)
                                                                                                                                                            {
                                                                                                                                                                break label20;
                                                                                                                                                            }
                                                                                                                                                            boolean b19 = s.equalsIgnoreCase("orange_pin7");
                                                                                                                                                            if(b19)
                                                                                                                                                            {
                                                                                                                                                                break label21;
                                                                                                                                                            }
                                                                                                                                                            boolean b20 = s.equalsIgnoreCase("orange_pin8");
                                                                                                                                                            if(b20)
                                                                                                                                                            {
                                                                                                                                                                break label22;
                                                                                                                                                            }
                                                                                                                                                            boolean b21 = s.equalsIgnoreCase("orange_pin9");
                                                                                                                                                            if(b21)
                                                                                                                                                            {
                                                                                                                                                                break label23;
                                                                                                                                                            }
                                                                                                                                                            boolean b22 = s.equalsIgnoreCase("pink_pin1");
                                                                                                                                                            if(b22)
                                                                                                                                                            {
                                                                                                                                                                break label24;
                                                                                                                                                            }
                                                                                                                                                            boolean b23 = s.equalsIgnoreCase("pink_pin2");
                                                                                                                                                            if(b23)
                                                                                                                                                            {
                                                                                                                                                                break label25;
                                                                                                                                                            }
                                                                                                                                                            boolean b24 = s.equalsIgnoreCase("pink_pin3");
                                                                                                                                                            if(b24)
                                                                                                                                                            {
                                                                                                                                                                break label26;
                                                                                                                                                            }
                                                                                                                                                            boolean b25 = s.equalsIgnoreCase("pink_pin4");
                                                                                                                                                            if(b25)
                                                                                                                                                            {
                                                                                                                                                                break label27;
                                                                                                                                                            }
                                                                                                                                                            boolean b26 = s.equalsIgnoreCase("pink_pin5");
                                                                                                                                                            if(b26)
                                                                                                                                                            {
                                                                                                                                                                break label28;
                                                                                                                                                            }
                                                                                                                                                            boolean b27 = s.equalsIgnoreCase("pink_pin6");
                                                                                                                                                            if(b27)
                                                                                                                                                            {
                                                                                                                                                                break label29;
                                                                                                                                                            }
                                                                                                                                                            boolean b28 = s.equalsIgnoreCase("pink_pin7");
                                                                                                                                                            if(b28)
                                                                                                                                                            {
                                                                                                                                                                break label30;
                                                                                                                                                            }
                                                                                                                                                            boolean b29 = s.equalsIgnoreCase("tint_pin1");
                                                                                                                                                            if(b29)
                                                                                                                                                            {
                                                                                                                                                                break label31;
                                                                                                                                                            }
                                                                                                                                                            boolean b30 = s.equalsIgnoreCase("tint_pin2");
                                                                                                                                                            if(b30)
                                                                                                                                                            {
                                                                                                                                                                break label32;
                                                                                                                                                            }
                                                                                                                                                            boolean b31 = s.equalsIgnoreCase("tint_pin3");
                                                                                                                                                            if(b31)
                                                                                                                                                            {
                                                                                                                                                                break label33;
                                                                                                                                                            }
                                                                                                                                                            boolean b32 = s.equalsIgnoreCase("tint_pin4");
                                                                                                                                                            if(b32)
                                                                                                                                                            {
                                                                                                                                                                break label34;
                                                                                                                                                            }
                                                                                                                                                            boolean b33 = s.equalsIgnoreCase("tint_pin5");
                                                                                                                                                            if(b33)
                                                                                                                                                            {
                                                                                                                                                                break label35;
                                                                                                                                                            }
                                                                                                                                                            boolean b34 = s.equalsIgnoreCase("lightPink_pin1");
                                                                                                                                                            if(!b34)
                                                                                                                                                            {
                                                                                                                                                                i0 = 2130837514;
                                                                                                                                                            }
                                                                                                                                                            else
                                                                                                                                                            {
                                                                                                                                                                break label36;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        i = i0;
                                                                                                                                                        break label37;
                                                                                                                                                    }
                                                                                                                                                    i = 2130837606;
                                                                                                                                                    break label37;
                                                                                                                                                }
                                                                                                                                                i = 2130837691;
                                                                                                                                                break label37;
                                                                                                                                            }
                                                                                                                                            i = 2130837690;
                                                                                                                                            break label37;
                                                                                                                                        }
                                                                                                                                        i = 2130837689;
                                                                                                                                        break label37;
                                                                                                                                    }
                                                                                                                                    i = 2130837688;
                                                                                                                                    break label37;
                                                                                                                                }
                                                                                                                                i = 2130837687;
                                                                                                                                break label37;
                                                                                                                            }
                                                                                                                            i = 2130837651;
                                                                                                                            break label37;
                                                                                                                        }
                                                                                                                        i = 2130837650;
                                                                                                                        break label37;
                                                                                                                    }
                                                                                                                    i = 2130837649;
                                                                                                                    break label37;
                                                                                                                }
                                                                                                                i = 2130837648;
                                                                                                                break label37;
                                                                                                            }
                                                                                                            i = 2130837647;
                                                                                                            break label37;
                                                                                                        }
                                                                                                        i = 2130837646;
                                                                                                        break label37;
                                                                                                    }
                                                                                                    i = 2130837644;
                                                                                                    break label37;
                                                                                                }
                                                                                                i = 2130837636;
                                                                                                break label37;
                                                                                            }
                                                                                            i = 2130837635;
                                                                                            break label37;
                                                                                        }
                                                                                        i = 2130837634;
                                                                                        break label37;
                                                                                    }
                                                                                    i = 2130837633;
                                                                                    break label37;
                                                                                }
                                                                                i = 2130837631;
                                                                                break label37;
                                                                            }
                                                                            i = 2130837630;
                                                                            break label37;
                                                                        }
                                                                        i = 2130837629;
                                                                        break label37;
                                                                    }
                                                                    i = 2130837628;
                                                                    break label37;
                                                                }
                                                                i = 2130837627;
                                                                break label37;
                                                            }
                                                            i = 2130837574;
                                                            break label37;
                                                        }
                                                        i = 2130837573;
                                                        break label37;
                                                    }
                                                    i = 2130837572;
                                                    break label37;
                                                }
                                                i = 2130837571;
                                                break label37;
                                            }
                                            i = 2130837554;
                                            break label37;
                                        }
                                        i = 2130837553;
                                        break label37;
                                    }
                                    i = 2130837552;
                                    break label37;
                                }
                                i = 2130837529;
                                break label37;
                            }
                            i = 2130837528;
                            break label37;
                        }
                        i = 2130837527;
                        break label37;
                    }
                    i = 2130837526;
                    break label37;
                }
                i = 2130837525;
                break label37;
            }
            i = 2130837524;
        }
        return i;
    }
    
    private int getResIdTable(String s)
    {
        int i = 0;
        label36: {
            boolean b = s.equalsIgnoreCase("blue_pin1");
            label2: {
                label3: {
                    label4: {
                        label5: {
                            label6: {
                                label7: {
                                    label8: {
                                        label9: {
                                            label10: {
                                                label11: {
                                                    label12: {
                                                        label13: {
                                                            label14: {
                                                                label15: {
                                                                    label16: {
                                                                        label17: {
                                                                            label18: {
                                                                                label19: {
                                                                                    label20: {
                                                                                        label21: {
                                                                                            label22: {
                                                                                                label23: {
                                                                                                    label24: {
                                                                                                        label25: {
                                                                                                            label26: {
                                                                                                                label27: {
                                                                                                                    label28: {
                                                                                                                        label29: {
                                                                                                                            label30: {
                                                                                                                                label31: {
                                                                                                                                    label32: {
                                                                                                                                        label33: {
                                                                                                                                            label34: {
                                                                                                                                                label35: {
                                                                                                                                                    int i0 = 0;
                                                                                                                                                    label1: {
                                                                                                                                                        label0: {
                                                                                                                                                            if(!b)
                                                                                                                                                            {
                                                                                                                                                                break label0;
                                                                                                                                                            }
                                                                                                                                                            i0 = 2130837638;
                                                                                                                                                            break label1;
                                                                                                                                                        }
                                                                                                                                                        boolean b0 = s.equalsIgnoreCase("blue_pin2");
                                                                                                                                                        if(b0)
                                                                                                                                                        {
                                                                                                                                                            break label2;
                                                                                                                                                        }
                                                                                                                                                        boolean b1 = s.equalsIgnoreCase("blue_pin3");
                                                                                                                                                        if(b1)
                                                                                                                                                        {
                                                                                                                                                            break label3;
                                                                                                                                                        }
                                                                                                                                                        boolean b2 = s.equalsIgnoreCase("blue_pin4");
                                                                                                                                                        if(b2)
                                                                                                                                                        {
                                                                                                                                                            break label4;
                                                                                                                                                        }
                                                                                                                                                        boolean b3 = s.equalsIgnoreCase("blue_pin5");
                                                                                                                                                        if(b3)
                                                                                                                                                        {
                                                                                                                                                            break label5;
                                                                                                                                                        }
                                                                                                                                                        boolean b4 = s.equalsIgnoreCase("blue_pin6");
                                                                                                                                                        if(b4)
                                                                                                                                                        {
                                                                                                                                                            break label6;
                                                                                                                                                        }
                                                                                                                                                        boolean b5 = s.equalsIgnoreCase("blue_pin7");
                                                                                                                                                        if(b5)
                                                                                                                                                        {
                                                                                                                                                            break label7;
                                                                                                                                                        }
                                                                                                                                                        boolean b6 = s.equalsIgnoreCase("darkPink_pin1");
                                                                                                                                                        if(b6)
                                                                                                                                                        {
                                                                                                                                                            break label8;
                                                                                                                                                        }
                                                                                                                                                        boolean b7 = s.equalsIgnoreCase("darkPink_pin2");
                                                                                                                                                        if(b7)
                                                                                                                                                        {
                                                                                                                                                            break label9;
                                                                                                                                                        }
                                                                                                                                                        boolean b8 = s.equalsIgnoreCase("darkPink_pin3");
                                                                                                                                                        if(b8)
                                                                                                                                                        {
                                                                                                                                                            break label10;
                                                                                                                                                        }
                                                                                                                                                        boolean b9 = s.equalsIgnoreCase("green_pin1");
                                                                                                                                                        if(b9)
                                                                                                                                                        {
                                                                                                                                                            break label11;
                                                                                                                                                        }
                                                                                                                                                        boolean b10 = s.equalsIgnoreCase("green_pin2");
                                                                                                                                                        if(b10)
                                                                                                                                                        {
                                                                                                                                                            break label12;
                                                                                                                                                        }
                                                                                                                                                        boolean b11 = s.equalsIgnoreCase("green_pin3");
                                                                                                                                                        if(b11)
                                                                                                                                                        {
                                                                                                                                                            break label13;
                                                                                                                                                        }
                                                                                                                                                        boolean b12 = s.equalsIgnoreCase("green_pin4");
                                                                                                                                                        if(b12)
                                                                                                                                                        {
                                                                                                                                                            break label14;
                                                                                                                                                        }
                                                                                                                                                        boolean b13 = s.equalsIgnoreCase("orange_pin1");
                                                                                                                                                        if(b13)
                                                                                                                                                        {
                                                                                                                                                            break label15;
                                                                                                                                                        }
                                                                                                                                                        boolean b14 = s.equalsIgnoreCase("orange_pin2");
                                                                                                                                                        if(b14)
                                                                                                                                                        {
                                                                                                                                                            break label16;
                                                                                                                                                        }
                                                                                                                                                        boolean b15 = s.equalsIgnoreCase("orange_pin3");
                                                                                                                                                        if(b15)
                                                                                                                                                        {
                                                                                                                                                            break label17;
                                                                                                                                                        }
                                                                                                                                                        boolean b16 = s.equalsIgnoreCase("orange_pin4");
                                                                                                                                                        if(b16)
                                                                                                                                                        {
                                                                                                                                                            break label18;
                                                                                                                                                        }
                                                                                                                                                        boolean b17 = s.equalsIgnoreCase("orange_pin5");
                                                                                                                                                        if(b17)
                                                                                                                                                        {
                                                                                                                                                            break label19;
                                                                                                                                                        }
                                                                                                                                                        boolean b18 = s.equalsIgnoreCase("orange_pin6");
                                                                                                                                                        if(b18)
                                                                                                                                                        {
                                                                                                                                                            break label20;
                                                                                                                                                        }
                                                                                                                                                        boolean b19 = s.equalsIgnoreCase("orange_pin7");
                                                                                                                                                        if(b19)
                                                                                                                                                        {
                                                                                                                                                            break label21;
                                                                                                                                                        }
                                                                                                                                                        boolean b20 = s.equalsIgnoreCase("orange_pin8");
                                                                                                                                                        if(b20)
                                                                                                                                                        {
                                                                                                                                                            break label22;
                                                                                                                                                        }
                                                                                                                                                        boolean b21 = s.equalsIgnoreCase("orange_pin9");
                                                                                                                                                        if(b21)
                                                                                                                                                        {
                                                                                                                                                            break label23;
                                                                                                                                                        }
                                                                                                                                                        boolean b22 = s.equalsIgnoreCase("pink_pin1");
                                                                                                                                                        if(b22)
                                                                                                                                                        {
                                                                                                                                                            break label24;
                                                                                                                                                        }
                                                                                                                                                        boolean b23 = s.equalsIgnoreCase("pink_pin2");
                                                                                                                                                        if(b23)
                                                                                                                                                        {
                                                                                                                                                            break label25;
                                                                                                                                                        }
                                                                                                                                                        boolean b24 = s.equalsIgnoreCase("pink_pin3");
                                                                                                                                                        if(b24)
                                                                                                                                                        {
                                                                                                                                                            break label26;
                                                                                                                                                        }
                                                                                                                                                        boolean b25 = s.equalsIgnoreCase("pink_pin4");
                                                                                                                                                        if(b25)
                                                                                                                                                        {
                                                                                                                                                            break label27;
                                                                                                                                                        }
                                                                                                                                                        boolean b26 = s.equalsIgnoreCase("pink_pin5");
                                                                                                                                                        if(b26)
                                                                                                                                                        {
                                                                                                                                                            break label28;
                                                                                                                                                        }
                                                                                                                                                        boolean b27 = s.equalsIgnoreCase("pink_pin6");
                                                                                                                                                        if(b27)
                                                                                                                                                        {
                                                                                                                                                            break label29;
                                                                                                                                                        }
                                                                                                                                                        boolean b28 = s.equalsIgnoreCase("pink_pin7");
                                                                                                                                                        if(b28)
                                                                                                                                                        {
                                                                                                                                                            break label30;
                                                                                                                                                        }
                                                                                                                                                        boolean b29 = s.equalsIgnoreCase("tint_pin1");
                                                                                                                                                        if(b29)
                                                                                                                                                        {
                                                                                                                                                            break label31;
                                                                                                                                                        }
                                                                                                                                                        boolean b30 = s.equalsIgnoreCase("tint_pin2");
                                                                                                                                                        if(b30)
                                                                                                                                                        {
                                                                                                                                                            break label32;
                                                                                                                                                        }
                                                                                                                                                        boolean b31 = s.equalsIgnoreCase("tint_pin3");
                                                                                                                                                        if(b31)
                                                                                                                                                        {
                                                                                                                                                            break label33;
                                                                                                                                                        }
                                                                                                                                                        boolean b32 = s.equalsIgnoreCase("tint_pin4");
                                                                                                                                                        if(b32)
                                                                                                                                                        {
                                                                                                                                                            break label34;
                                                                                                                                                        }
                                                                                                                                                        boolean b33 = s.equalsIgnoreCase("tint_pin5");
                                                                                                                                                        if(!b33)
                                                                                                                                                        {
                                                                                                                                                            i0 = 2130837514;
                                                                                                                                                        }
                                                                                                                                                        else
                                                                                                                                                        {
                                                                                                                                                            break label35;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    i = i0;
                                                                                                                                                    break label36;
                                                                                                                                                }
                                                                                                                                                i = 2130837637;
                                                                                                                                                break label36;
                                                                                                                                            }
                                                                                                                                            i = 2130837692;
                                                                                                                                            break label36;
                                                                                                                                        }
                                                                                                                                        i = 2130837600;
                                                                                                                                        break label36;
                                                                                                                                    }
                                                                                                                                    i = 2130837543;
                                                                                                                                    break label36;
                                                                                                                                }
                                                                                                                                i = 2130837513;
                                                                                                                                break label36;
                                                                                                                            }
                                                                                                                            i = 2130837698;
                                                                                                                            break label36;
                                                                                                                        }
                                                                                                                        i = 2130837542;
                                                                                                                        break label36;
                                                                                                                    }
                                                                                                                    i = 2130837539;
                                                                                                                    break label36;
                                                                                                                }
                                                                                                                i = 2130837599;
                                                                                                                break label36;
                                                                                                            }
                                                                                                            i = 2130837613;
                                                                                                            break label36;
                                                                                                        }
                                                                                                        i = 2130837546;
                                                                                                        break label36;
                                                                                                    }
                                                                                                    i = 2130837698;
                                                                                                    break label36;
                                                                                                }
                                                                                                i = 2130837593;
                                                                                                break label36;
                                                                                            }
                                                                                            i = 2130837593;
                                                                                            break label36;
                                                                                        }
                                                                                        i = 2130837505;
                                                                                        break label36;
                                                                                    }
                                                                                    i = 2130837667;
                                                                                    break label36;
                                                                                }
                                                                                i = 2130837666;
                                                                                break label36;
                                                                            }
                                                                            i = 2130837699;
                                                                            break label36;
                                                                        }
                                                                        i = 2130837700;
                                                                        break label36;
                                                                    }
                                                                    i = 2130837504;
                                                                    break label36;
                                                                }
                                                                i = 2130837665;
                                                                break label36;
                                                            }
                                                            i = 2130837547;
                                                            break label36;
                                                        }
                                                        i = 2130837598;
                                                        break label36;
                                                    }
                                                    i = 2130837541;
                                                    break label36;
                                                }
                                                i = 2130837652;
                                                break label36;
                                            }
                                            i = 2130837610;
                                            break label36;
                                        }
                                        i = 2130837540;
                                        break label36;
                                    }
                                    i = 2130837655;
                                    break label36;
                                }
                                i = 2130837611;
                                break label36;
                            }
                            i = 2130837512;
                            break label36;
                        }
                        i = 2130837682;
                        break label36;
                    }
                    i = 2130837511;
                    break label36;
                }
                i = 2130837567;
                break label36;
            }
            i = 2130837545;
        }
        return i;
    }
    
    private void loadStatisticsData()
    {
        label1: {
            org.spf.utils.Constants.CRIME_INFO.URL a = org.spf.utils.Constants.CRIME_INFO.URL.CRIME_STATISTICS;
            String s = org.spf.utils.Constants.CRIME_INFO.URL.getUrl(a);
            Object[] a0 = new Object[2];
            String s0 = this.zoneId;
            a0[0] = s0;
            String s1 = this.clusterID;
            a0[1] = s1;
            String s2 = String.format(s, a0);
            String s3 = s2.replace((CharSequence)" ", (CharSequence)"%20");
            StringBuilder a1 = new StringBuilder("StatisticsUrl:: ");
            StringBuilder a2 = a1.append(s3);
            String s4 = a2.toString();
            android.util.Log.d("SPF", s4);
            this.showDialog(0, (android.os.Bundle)null);
            Thread a3 = this.thread;
            label0: {
                if(a3 == null)
                {
                    break label0;
                }
                Thread a4 = this.thread;
                boolean b = a4.isAlive();
                if(!b)
                {
                    break label0;
                }
                break label1;
            }
            org.spf.mobi.ui.map.SPFMapPointDetails.2 a5 = new org.spf.mobi.ui.map.SPFMapPointDetails.2(this, s3);
            this.thread = a5;
            Thread a6 = this.thread;
            a6.start();
        }
    }
    
    public void onClick(android.view.View a)
    {
        StringBuilder a0 = new StringBuilder();
        android.content.Intent a1 = new android.content.Intent((android.content.Context)this, org.spf.mobi.ui.common.SPFCommonListing.class);
        int i = a.getId();
        switch(i){
            case 2131165318: {
                org.spf.utils.GATracker a2 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s = this.getString(2131034226);
                a2.gaTrackEvent(s);
                this.crimeID = "0";
                this.appealID = "0";
                this.missingPersonID = "1";
                org.spf.mobi.ui.map.MissingDetailFill a3 = new org.spf.mobi.ui.map.MissingDetailFill((android.app.Activity)this);
                org.spf.utils.Utils.setDetailRef((org.spf.mobi.ui.common.SPFIGetFillView)a3);
                org.spf.utils.Constants.CRIME_INFO.URL a4 = org.spf.utils.Constants.CRIME_INFO.URL.CRIME_MISSING;
                String s0 = org.spf.utils.Constants.CRIME_INFO.URL.getUrl(a4);
                Object[] a5 = new Object[5];
                String s1 = this.zoneId;
                a5[0] = s1;
                String s2 = this.clusterID;
                a5[1] = s2;
                String s3 = this.crimeID;
                a5[2] = s3;
                String s4 = this.appealID;
                a5[3] = s4;
                String s5 = this.missingPersonID;
                a5[4] = s5;
                String s6 = String.format(s0, a5);
                this.url = s6;
                String s7 = this.url;
                String s8 = s7.replace((CharSequence)" ", (CharSequence)"%20");
                this.url = s8;
                String s9 = this.url;
                a0.append(s9);
                org.spf.utils.Constants.SCREENS a6 = org.spf.utils.Constants.SCREENS.MISSING;
                int i0 = a6.ordinal();
                a1.putExtra("SCREEN_ID", i0);
                a1.putExtra("TITLE_NAME", "Results found for Missing Persons");
                break;
            }
            case 2131165317: {
                org.spf.utils.GATracker a7 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s10 = this.getString(2131034222);
                a7.gaTrackEvent(s10);
                this.crimeID = "0";
                this.appealID = "1";
                this.missingPersonID = "0";
                org.spf.mobi.ui.appeal.PoliceAppealFillData a8 = new org.spf.mobi.ui.appeal.PoliceAppealFillData((android.app.Activity)this);
                org.spf.utils.Utils.setDetailRef((org.spf.mobi.ui.common.SPFIGetFillView)a8);
                org.spf.utils.Constants.CRIME_INFO.URL a9 = org.spf.utils.Constants.CRIME_INFO.URL.CRIME_APPEAL;
                String s11 = org.spf.utils.Constants.CRIME_INFO.URL.getUrl(a9);
                Object[] a10 = new Object[5];
                String s12 = this.zoneId;
                a10[0] = s12;
                String s13 = this.clusterID;
                a10[1] = s13;
                String s14 = this.crimeID;
                a10[2] = s14;
                String s15 = this.appealID;
                a10[3] = s15;
                String s16 = this.missingPersonID;
                a10[4] = s16;
                String s17 = String.format(s11, a10);
                this.url = s17;
                String s18 = this.url;
                String s19 = s18.replace((CharSequence)" ", (CharSequence)"%20");
                this.url = s19;
                String s20 = this.url;
                a0.append(s20);
                org.spf.utils.Constants.SCREENS a11 = org.spf.utils.Constants.SCREENS.APPEAL;
                int i1 = a11.ordinal();
                a1.putExtra("SCREEN_ID", i1);
                a1.putExtra("TITLE_NAME", "Results found for Police Appeals");
                break;
            }
            case 2131165316: {
                org.spf.utils.GATracker a12 = org.spf.utils.GATracker.getTracker((android.content.Context)this);
                String s21 = this.getString(2131034218);
                a12.gaTrackEvent(s21);
                this.crimeID = "1";
                this.appealID = "0";
                this.missingPersonID = "0";
                org.spf.mobi.ui.news.NewsCrimeDetailFill a13 = new org.spf.mobi.ui.news.NewsCrimeDetailFill((android.app.Activity)this);
                org.spf.utils.Utils.setDetailRef((org.spf.mobi.ui.common.SPFIGetFillView)a13);
                org.spf.utils.Constants.CRIME_INFO.URL a14 = org.spf.utils.Constants.CRIME_INFO.URL.CRIME_NEWS;
                String s22 = org.spf.utils.Constants.CRIME_INFO.URL.getUrl(a14);
                Object[] a15 = new Object[5];
                String s23 = this.zoneId;
                a15[0] = s23;
                String s24 = this.clusterID;
                a15[1] = s24;
                String s25 = this.crimeID;
                a15[2] = s25;
                String s26 = this.appealID;
                a15[3] = s26;
                String s27 = this.missingPersonID;
                a15[4] = s27;
                String s28 = String.format(s22, a15);
                this.url = s28;
                String s29 = this.url;
                String s30 = s29.replace((CharSequence)" ", (CharSequence)"%20");
                this.url = s30;
                String s31 = this.url;
                a0.append(s31);
                org.spf.utils.Constants.SCREENS a16 = org.spf.utils.Constants.SCREENS.NEWS;
                int i2 = a16.ordinal();
                a1.putExtra("SCREEN_ID", i2);
                a1.putExtra("TITLE_NAME", "Results found for News Feed");
                break;
            }
        }
        StringBuilder a17 = new StringBuilder("url::::::::");
        StringBuilder a18 = a17.append((Object)a0);
        String s32 = a18.toString();
        android.util.Log.e("SPF", s32);
        String s33 = a0.toString();
        a1.putExtra("PASSING_URL", s33);
        this.startActivity(a1);
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
        this.setContentView(2130903054);
        android.view.View a0 = this.findViewById(2131165246);
        android.widget.TextView dummy = (android.widget.TextView)a0;
        android.widget.TextView a1 = (android.widget.TextView)a0;
        a1.setText(2131034113);
        android.content.Intent a2 = this.getIntent();
        String s = a2.getStringExtra("DETAIL_ID");
        this.passedString = s;
        android.view.View a3 = this.findViewById(2131165310);
        android.widget.LinearLayout dummy0 = (android.widget.LinearLayout)a3;
        android.widget.LinearLayout a4 = (android.widget.LinearLayout)a3;
        this.llStatisticTable = a4;
        android.view.View a5 = this.findViewById(2131165313);
        android.widget.ListView dummy1 = (android.widget.ListView)a5;
        android.widget.ListView a6 = (android.widget.ListView)a5;
        this.lvStatistic = a6;
        android.view.View a7 = this.findViewById(2131165314);
        android.widget.TextView dummy2 = (android.widget.TextView)a7;
        android.widget.TextView a8 = (android.widget.TextView)a7;
        this.txtRecordsInfo = a8;
        android.view.View a9 = this.findViewById(2131165311);
        android.widget.TextView dummy3 = (android.widget.TextView)a9;
        android.widget.TextView a10 = (android.widget.TextView)a9;
        this.txtTblTitle = a10;
        android.view.View a11 = this.findViewById(2131165309);
        android.widget.ImageView dummy4 = (android.widget.ImageView)a11;
        android.widget.ImageView a12 = (android.widget.ImageView)a11;
        String s0 = this.passedString;
        int i = this.getHeadImg(s0);
        a12.setImageResource(i);
        android.content.Intent a13 = this.getIntent();
        String s1 = a13.getStringExtra("ZONE_ID");
        this.zoneId = s1;
        android.content.Intent a14 = this.getIntent();
        String s2 = a14.getStringExtra("CLUSTER_ID");
        this.clusterID = s2;
        String s3 = this.passedString;
        if(s3 != null)
        {
            android.view.View a15 = this.findViewById(2131165312);
            android.widget.ImageView dummy5 = (android.widget.ImageView)a15;
            android.widget.ImageView a16 = (android.widget.ImageView)a15;
            this.imageView = a16;
            StringBuilder a17 = new StringBuilder("passedString");
            String s4 = this.passedString;
            StringBuilder a18 = a17.append(s4);
            String s5 = a18.toString();
            android.util.Log.d("SPF MAP", s5);
        }
        android.os.Handler a19 = new android.os.Handler();
        this.mHandler = a19;
        this.loadStatisticsData();
    }
    
    protected android.app.Dialog onCreateDialog(int i)
    {
        android.app.Dialog a = null;
        android.app.ProgressDialog a0 = null;
        switch(i){
            case 0: {
                android.app.ProgressDialog a1 = new android.app.ProgressDialog((android.content.Context)this);
                android.content.res.Resources a2 = this.getResources();
                String s = a2.getString(2131034126);
                a1.setMessage((CharSequence)s);
                a1.setCancelable(true);
                a1.setIndeterminate(true);
                org.spf.mobi.ui.map.SPFMapPointDetails.1 a3 = new org.spf.mobi.ui.map.SPFMapPointDetails.1(this);
                a1.setOnCancelListener((android.content.DialogInterface.OnCancelListener)a3);
                a0 = a1;
            }
            default: {
                if(a0 == null)
                {
                    android.app.Dialog a4 = ((org.spf.mobi.ui.SPFActivity)this).onCreateDialog(i);
                    a = a4;
                }
                else
                {
                    a = a0;
                }
            }
        }
        return a;
    }
}
package org.spf.mobi.ui.map;

public class SPFSingleMapElementActivity extends org.spf.mobi.ui.SPFActivity implements org.spf.utils.Constants {
    private static int[] $SWITCH_TABLE$org$spf$utils$Constants$MAP_CONSTANTS$MAP_COLOR;
    private String clusterID;
    private org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR color;
    private String extraString;
    private int selectionId;
    private String zoneID;
    
    static int[] $SWITCH_TABLE$org$spf$utils$Constants$MAP_CONSTANTS$MAP_COLOR()
    {
        int[] a = null;
        int[] a0 = $SWITCH_TABLE$org$spf$utils$Constants$MAP_CONSTANTS$MAP_COLOR;
        if(a0 == null)
        {
            org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR[] a1 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.values();
            int i = a1.length;
            int[] a2 = new int[i];
            try
            {
                org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a3 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.BLUE;
                int i0 = a3.ordinal();
                a2[i0] = 6;
            }
            catch(NoSuchFieldError ignoredException)
            {
            }
            try
            {
                org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a4 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.DARK_PINK;
                int i1 = a4.ordinal();
                a2[i1] = 2;
            }
            catch(NoSuchFieldError ignoredException0)
            {
            }
            try
            {
                org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a5 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.GREEN;
                int i2 = a5.ordinal();
                a2[i2] = 4;
            }
            catch(NoSuchFieldError ignoredException1)
            {
            }
            try
            {
                org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a6 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.LIGHT_PINK;
                int i3 = a6.ordinal();
                a2[i3] = 3;
            }
            catch(NoSuchFieldError ignoredException2)
            {
            }
            try
            {
                org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a7 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.ORANGE;
                int i4 = a7.ordinal();
                a2[i4] = 7;
            }
            catch(NoSuchFieldError ignoredException3)
            {
            }
            try
            {
                org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a8 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.PINK;
                int i5 = a8.ordinal();
                a2[i5] = 1;
            }
            catch(NoSuchFieldError ignoredException4)
            {
            }
            try
            {
                org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a9 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.TINT;
                int i6 = a9.ordinal();
                a2[i6] = 5;
            }
            catch(NoSuchFieldError ignoredException5)
            {
            }
            try
            {
                org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a10 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.UNKNOWN;
                int i7 = a10.ordinal();
                a2[i7] = 8;
            }
            catch(NoSuchFieldError ignoredException6)
            {
            }
            $SWITCH_TABLE$org$spf$utils$Constants$MAP_CONSTANTS$MAP_COLOR = a2;
            a = a2;
        }
        else
        {
            a = a0;
        }
        return a;
    }
    
    public SPFSingleMapElementActivity()
    {
        super();
        this.selectionId = -1;
        this.extraString = null;
    }
    
    static String access$1(org.spf.mobi.ui.map.SPFSingleMapElementActivity a)
    {
        String s = a.extraString;
        return s;
    }
    
    public static String getLocationName(String s)
    {
        String s0 = null;
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
                                                                                                                                                        String s1 = null;
                                                                                                                                                        label1: {
                                                                                                                                                            label0: {
                                                                                                                                                                if(!b)
                                                                                                                                                                {
                                                                                                                                                                    break label0;
                                                                                                                                                                }
                                                                                                                                                                s1 = "PASIR RIS";
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
                                                                                                                                                            boolean b23 = s.equalsIgnoreCase("pink_pin7");
                                                                                                                                                            if(b23)
                                                                                                                                                            {
                                                                                                                                                                break label25;
                                                                                                                                                            }
                                                                                                                                                            boolean b24 = s.equalsIgnoreCase("pink_pin2");
                                                                                                                                                            if(b24)
                                                                                                                                                            {
                                                                                                                                                                break label26;
                                                                                                                                                            }
                                                                                                                                                            boolean b25 = s.equalsIgnoreCase("pink_pin3");
                                                                                                                                                            if(b25)
                                                                                                                                                            {
                                                                                                                                                                break label27;
                                                                                                                                                            }
                                                                                                                                                            boolean b26 = s.equalsIgnoreCase("pink_pin4");
                                                                                                                                                            if(b26)
                                                                                                                                                            {
                                                                                                                                                                break label28;
                                                                                                                                                            }
                                                                                                                                                            boolean b27 = s.equalsIgnoreCase("pink_pin5");
                                                                                                                                                            if(b27)
                                                                                                                                                            {
                                                                                                                                                                break label29;
                                                                                                                                                            }
                                                                                                                                                            boolean b28 = s.equalsIgnoreCase("pink_pin6");
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
                                                                                                                                                                s1 = "Unknown";
                                                                                                                                                            }
                                                                                                                                                            else
                                                                                                                                                            {
                                                                                                                                                                break label36;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        s0 = s1;
                                                                                                                                                        break label37;
                                                                                                                                                    }
                                                                                                                                                    s0 = "AIRPORT PATROL SECTORS";
                                                                                                                                                    break label37;
                                                                                                                                                }
                                                                                                                                                s0 = "ORCHARD";
                                                                                                                                                break label37;
                                                                                                                                            }
                                                                                                                                            s0 = "TOA PAYOH";
                                                                                                                                            break label37;
                                                                                                                                        }
                                                                                                                                        s0 = "KAMPONG JAVA";
                                                                                                                                        break label37;
                                                                                                                                    }
                                                                                                                                    s0 = "BUKIT TIMAH";
                                                                                                                                    break label37;
                                                                                                                                }
                                                                                                                                s0 = "BISHAN";
                                                                                                                                break label37;
                                                                                                                            }
                                                                                                                            s0 = "BUKIT PANJANG";
                                                                                                                            break label37;
                                                                                                                        }
                                                                                                                        s0 = "BUKIT BATOK";
                                                                                                                        break label37;
                                                                                                                    }
                                                                                                                    s0 = "JURONG WEST";
                                                                                                                    break label37;
                                                                                                                }
                                                                                                                s0 = "NANYANG";
                                                                                                                break label37;
                                                                                                            }
                                                                                                            s0 = "CHOA CHU KANG";
                                                                                                            break label37;
                                                                                                        }
                                                                                                        s0 = "WOODLANDS EAST";
                                                                                                        break label37;
                                                                                                    }
                                                                                                    s0 = "WOODLANDS WEST";
                                                                                                    break label37;
                                                                                                }
                                                                                                s0 = "PUNGGOL";
                                                                                                break label37;
                                                                                            }
                                                                                            s0 = "HOUGANG";
                                                                                            break label37;
                                                                                        }
                                                                                        s0 = "ANG MO KIO SOUTH";
                                                                                        break label37;
                                                                                    }
                                                                                    s0 = "SERANGOON";
                                                                                    break label37;
                                                                                }
                                                                                s0 = "SENGKANG";
                                                                                break label37;
                                                                            }
                                                                            s0 = "YISHUN NORTH";
                                                                            break label37;
                                                                        }
                                                                        s0 = "YISHUN SOUTH";
                                                                        break label37;
                                                                    }
                                                                    s0 = "ANG MO KIO NORTH";
                                                                    break label37;
                                                                }
                                                                s0 = "SEMBAWANG";
                                                                break label37;
                                                            }
                                                            s0 = "CLEMENTI";
                                                            break label37;
                                                        }
                                                        s0 = "JURONG EAST";
                                                        break label37;
                                                    }
                                                    s0 = "BUKIT MERAH WEST";
                                                    break label37;
                                                }
                                                s0 = "JEENSTOWN";
                                                break label37;
                                            }
                                            s0 = "MARINA BAY";
                                            break label37;
                                        }
                                        s0 = "BUKIT MERAH EAST";
                                        break label37;
                                    }
                                    s0 = "ROCHOR";
                                    break label37;
                                }
                                s0 = "MARINE PARADE";
                                break label37;
                            }
                            s0 = "BEDOK SOUTH";
                            break label37;
                        }
                        s0 = "TAMPINES";
                        break label37;
                    }
                    s0 = "BEDOK NORTH";
                    break label37;
                }
                s0 = "GEYLAND";
                break label37;
            }
            s0 = "CHANGI";
        }
        return s0;
    }
    
    public void onClick(android.view.View a)
    {
        int i = a.getId();
        switch(i){
            case 2131165305: {
                this.extraString = "tint_pin5";
                this.clusterID = "1034";
                break;
            }
            case 2131165304: {
                this.extraString = "tint_pin4";
                this.clusterID = "1032";
                break;
            }
            case 2131165303: {
                this.extraString = "tint_pin3";
                this.clusterID = "1021";
                break;
            }
            case 2131165302: {
                this.extraString = "tint_pin2";
                this.clusterID = "1028";
                break;
            }
            case 2131165301: {
                this.extraString = "tint_pin1";
                this.clusterID = "1035";
                break;
            }
            case 2131165298: {
                this.extraString = "pink_pin6";
                this.clusterID = "1029";
                break;
            }
            case 2131165297: {
                this.extraString = "pink_pin5";
                this.clusterID = "1031";
                break;
            }
            case 2131165296: {
                this.extraString = "pink_pin4";
                this.clusterID = "1008";
                break;
            }
            case 2131165295: {
                this.extraString = "pink_pin3";
                this.clusterID = "1018";
                break;
            }
            case 2131165294: {
                this.extraString = "pink_pin2";
                this.clusterID = "1013";
                break;
            }
            case 2131165293: {
                this.extraString = "pink_pin7";
                this.clusterID = "1101";
                break;
            }
            case 2131165292: {
                this.extraString = "pink_pin1";
                this.clusterID = "1019";
                break;
            }
            case 2131165289: {
                this.extraString = "orange_pin8";
                this.clusterID = "1003";
                break;
            }
            case 2131165288: {
                this.extraString = "orange_pin7";
                this.clusterID = "1012";
                break;
            }
            case 2131165287: {
                this.extraString = "orange_pin6";
                this.clusterID = "1002";
                break;
            }
            case 2131165286: {
                this.extraString = "orange_pin9";
                this.clusterID = "1102";
                break;
            }
            case 2131165285: {
                this.extraString = "orange_pin5";
                this.clusterID = "1009";
                break;
            }
            case 2131165284: {
                this.extraString = "orange_pin4";
                this.clusterID = "1023";
                break;
            }
            case 2131165283: {
                this.extraString = "orange_pin3";
                this.clusterID = "1020";
                break;
            }
            case 2131165282: {
                this.extraString = "orange_pin2";
                this.clusterID = "1022";
                break;
            }
            case 2131165281: {
                this.extraString = "orange_pin1";
                this.clusterID = "1006";
                break;
            }
            case 2131165278: {
                this.extraString = "lightPink_pin1";
                this.clusterID = "1001";
                break;
            }
            case 2131165275: {
                this.extraString = "green_pin4";
                this.clusterID = "1030";
                break;
            }
            case 2131165274: {
                this.extraString = "green_pin1";
                this.clusterID = "1010";
                break;
            }
            case 2131165273: {
                this.extraString = "green_pin3";
                this.clusterID = "1024";
                break;
            }
            case 2131165272: {
                this.extraString = "green_pin2";
                this.clusterID = "1011";
                break;
            }
            case 2131165269: {
                this.extraString = "darkPink_pin3";
                this.clusterID = "1025";
                break;
            }
            case 2131165268: {
                this.extraString = "darkPink_pin2";
                this.clusterID = "1007";
                break;
            }
            case 2131165267: {
                this.extraString = "darkPink_pin1";
                this.clusterID = "1014";
                break;
            }
            case 2131165265: {
                this.extraString = "blue_pin7";
                this.clusterID = "1004";
                break;
            }
            case 2131165264: {
                this.extraString = "blue_pin6";
                this.clusterID = "1016";
                break;
            }
            case 2131165263: {
                this.extraString = "blue_pin4";
                this.clusterID = "1026";
                break;
            }
            case 2131165262: {
                this.extraString = "blue_pin5";
                this.clusterID = "1005";
                break;
            }
            case 2131165261: {
                this.extraString = "blue_pin3";
                this.clusterID = "1033";
                break;
            }
            case 2131165260: {
                this.extraString = "blue_pin2";
                this.clusterID = "1015";
                break;
            }
            case 2131165259: {
                this.extraString = "blue_pin1";
                this.clusterID = "1027";
                break;
            }
        }
        android.content.Intent a0 = new android.content.Intent((android.content.Context)this, org.spf.mobi.ui.map.SPFMapPointDetails.class);
        String s = this.extraString;
        a0.putExtra("DETAIL_ID", s);
        String s0 = this.zoneID;
        a0.putExtra("ZONE_ID", s0);
        String s1 = this.clusterID;
        a0.putExtra("CLUSTER_ID", s1);
        StringBuilder a1 = new StringBuilder("zoneID::");
        String s2 = this.zoneID;
        StringBuilder a2 = a1.append(s2);
        String s3 = a2.toString();
        android.util.Log.d("SPF", s3);
        StringBuilder a3 = new StringBuilder("clusterID::");
        String s4 = this.clusterID;
        StringBuilder a4 = a3.append(s4);
        String s5 = a4.toString();
        android.util.Log.d("SPF", s5);
        this.startActivity(a0);
    }
    
    protected void onCreate(android.os.Bundle a)
    {
        String s = null;
        ((org.spf.mobi.ui.SPFActivity)this).onCreate(a);
        this.setContentView(2130903051);
        android.view.View a0 = this.findViewById(2131165246);
        android.widget.TextView dummy = (android.widget.TextView)a0;
        android.widget.TextView a1 = (android.widget.TextView)a0;
        a1.setText(2131034113);
        org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR[] a2 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.values();
        android.content.Intent a3 = this.getIntent();
        org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a4 = org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR.UNKNOWN;
        int i = a4.ordinal();
        int i0 = a3.getIntExtra("FORWARD_LOCATION", i);
        org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a5 = a2[i0];
        this.color = a5;
        int[] a6 = org.spf.mobi.ui.map.SPFSingleMapElementActivity.$SWITCH_TABLE$org$spf$utils$Constants$MAP_CONSTANTS$MAP_COLOR();
        org.spf.utils.Constants.MAP_CONSTANTS.MAP_COLOR a7 = this.color;
        int i1 = a7.ordinal();
        int i2 = a6[i1];
        switch(i2){
            case 8: {
                this.selectionId = 2131165299;
                this.zoneID = "103";
                s = "Tanglin Police Division";
                break;
            }
            case 7: {
                this.selectionId = 2131165279;
                this.zoneID = "107";
                s = "Ang Mo Kio Police Division";
                break;
            }
            case 6: {
                this.selectionId = 2131165256;
                this.zoneID = "105";
                s = "Bedok Police Division";
                break;
            }
            case 5: {
                this.selectionId = 2131165299;
                this.zoneID = "103";
                s = "Tanglin Police Division";
                break;
            }
            case 4: {
                this.selectionId = 2131165270;
                this.zoneID = "102";
                s = "Clementi Police Division";
                break;
            }
            case 3: {
                this.selectionId = 2131165276;
                this.zoneID = "104";
                s = "Airport Police Division";
                break;
            }
            case 2: {
                this.selectionId = 2131165266;
                this.zoneID = "101";
                s = "Central Police Division";
                break;
            }
            case 1: {
                this.selectionId = 2131165290;
                this.zoneID = "106";
                s = "Jurong Police Division";
                break;
            }
            default: {
                s = "";
            }
        }
        android.view.View a8 = this.findViewById(2131165208);
        android.widget.TextView dummy0 = (android.widget.TextView)a8;
        android.widget.TextView a9 = (android.widget.TextView)a8;
        a9.setText((CharSequence)s);
        int i3 = this.selectionId;
        android.view.View a10 = this.findViewById(i3);
        android.widget.RelativeLayout dummy1 = (android.widget.RelativeLayout)a10;
        android.widget.RelativeLayout a11 = (android.widget.RelativeLayout)a10;
        a11.setVisibility(0);
    }
    
    protected android.app.Dialog onCreateDialog(int i)
    {
        android.app.Dialog a = null;
        switch(i){
            case 1: {
                android.app.AlertDialog.Builder a0 = new android.app.AlertDialog.Builder((android.content.Context)this);
                StringBuilder a1 = new StringBuilder("EXTRA LOCATION: ");
                String s = this.extraString;
                StringBuilder a2 = a1.append(s);
                String s0 = a2.toString();
                android.util.Log.i("Location", s0);
                String s1 = this.extraString;
                String s2 = org.spf.mobi.ui.map.SPFSingleMapElementActivity.getLocationName(s1);
                a0.setTitle((CharSequence)s2);
                a0.setMessage(2131034122);
                org.spf.mobi.ui.map.SPFSingleMapElementActivity.1 a3 = new org.spf.mobi.ui.map.SPFSingleMapElementActivity.1(this);
                a0.setPositiveButton(2131034123, (android.content.DialogInterface.OnClickListener)a3);
                org.spf.mobi.ui.map.SPFSingleMapElementActivity.2 a4 = new org.spf.mobi.ui.map.SPFSingleMapElementActivity.2(this);
                a0.setNegativeButton(2131034124, (android.content.DialogInterface.OnClickListener)a4);
                android.app.AlertDialog a5 = a0.create();
                a = a5;
                break;
            }
            default: {
                android.app.Dialog a6 = ((org.spf.mobi.ui.SPFActivity)this).onCreateDialog(i);
                a = a6;
            }
        }
        return a;
    }
}
package org.spf.mobi.ui.common;

class 2 implements Runnable {
    private String desc;
    final org.spf.mobi.ui.common.SPFDetailPage this$0;
    
    2(org.spf.mobi.ui.common.SPFDetailPage a)
    {
        this.this$0 = a;
        super();
        this.desc = "";
    }
    
    public void run()
    {
        label6: {
            StringBuilder a = null;
            StringBuilder a0 = null;
            org.spf.mobi.ui.common.SPFDetailPage a1 = this.this$0;
            a1.removeDialog(2);
            org.spf.mobi.ui.common.SPFDetailPage a2 = this.this$0;
            int i = org.spf.mobi.ui.common.SPFDetailPage.access$4(a2);
            label4: {
                label5: {
                    label2: {
                        label1: {
                            label0: {
                                if(i == -1)
                                {
                                    break label0;
                                }
                                org.spf.mobi.ui.common.SPFDetailPage a3 = this.this$0;
                                Object a4 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a3);
                                boolean b = a4 instanceof org.spf.data.SPFMissing;
                                if(b)
                                {
                                    org.spf.mobi.ui.common.SPFDetailPage a5 = this.this$0;
                                    Object a6 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a5);
                                    org.spf.data.SPFMissing dummy = (org.spf.data.SPFMissing)a6;
                                    org.spf.data.SPFMissing a7 = (org.spf.data.SPFMissing)a6;
                                    org.spf.data.SPFCluster a8 = a7.getCluster();
                                    String s = a8.getClusterId();
                                    org.spf.mobi.ui.common.SPFDetailPage.access$6(s);
                                    org.spf.mobi.ui.common.SPFDetailPage a9 = this.this$0;
                                    android.app.Activity a10 = org.spf.mobi.ui.common.SPFDetailPage.access$7(a9);
                                    android.content.res.Resources a11 = a10.getResources();
                                    String s0 = a11.getString(2131034116);
                                    org.spf.mobi.ui.common.SPFDetailPage.access$8(s0);
                                    org.spf.mobi.ui.common.SPFDetailPage a12 = this.this$0;
                                    Object a13 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a12);
                                    org.spf.data.SPFMissing dummy0 = (org.spf.data.SPFMissing)a13;
                                    org.spf.data.SPFMissing a14 = (org.spf.data.SPFMissing)a13;
                                    org.spf.data.SPFZone a15 = a14.getZone();
                                    String s1 = a15.getZoneName();
                                    org.spf.mobi.ui.common.SPFDetailPage.access$9(s1);
                                    org.spf.mobi.ui.common.SPFDetailPage a16 = this.this$0;
                                    Object a17 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a16);
                                    org.spf.data.SPFMissing dummy1 = (org.spf.data.SPFMissing)a17;
                                    org.spf.data.SPFMissing a18 = (org.spf.data.SPFMissing)a17;
                                    org.spf.data.SPFZone a19 = a18.getZone();
                                    String s2 = a19.getZoneId();
                                    StringBuilder a20 = new StringBuilder("zoneID :: ");
                                    StringBuilder a21 = a20.append(s2);
                                    String s3 = a21.toString();
                                    android.util.Log.d("SPF", s3);
                                    org.spf.mobi.ui.common.SPFDetailPage a22 = this.this$0;
                                    Object a23 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a22);
                                    org.spf.data.SPFMissing dummy2 = (org.spf.data.SPFMissing)a23;
                                    org.spf.data.SPFMissing a24 = (org.spf.data.SPFMissing)a23;
                                    org.spf.data.SPFCluster a25 = a24.getCluster();
                                    String s4 = a25.getClusterId();
                                    boolean b0 = s2.equalsIgnoreCase("999");
                                    if(b0)
                                    {
                                        boolean b1 = s4.equalsIgnoreCase("9999");
                                        if(b1)
                                        {
                                            org.spf.mobi.ui.common.SPFDetailPage a26 = this.this$0;
                                            android.view.View a27 = a26.findViewById(2131165243);
                                            android.widget.ImageView dummy3 = (android.widget.ImageView)a27;
                                            android.widget.ImageView a28 = (android.widget.ImageView)a27;
                                            a28.setVisibility(0);
                                            org.spf.mobi.ui.common.SPFDetailPage a29 = this.this$0;
                                            android.view.View a30 = a29.findViewById(2131165242);
                                            android.widget.ImageView dummy4 = (android.widget.ImageView)a30;
                                            android.widget.ImageView a31 = (android.widget.ImageView)a30;
                                            a31.setVisibility(8);
                                        }
                                    }
                                    org.spf.mobi.ui.common.SPFDetailPage a32 = this.this$0;
                                    Object a33 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a32);
                                    org.spf.data.SPFMissing dummy5 = (org.spf.data.SPFMissing)a33;
                                    org.spf.data.SPFMissing a34 = (org.spf.data.SPFMissing)a33;
                                    String s5 = a34.getTitle();
                                    org.spf.mobi.ui.common.SPFDetailPage.access$10(s5);
                                    org.spf.mobi.ui.common.SPFDetailPage a35 = this.this$0;
                                    org.spf.mobi.ui.common.SPFDetailPage a36 = this.this$0;
                                    Object a37 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a36);
                                    org.spf.data.SPFMissing dummy6 = (org.spf.data.SPFMissing)a37;
                                    org.spf.data.SPFMissing a38 = (org.spf.data.SPFMissing)a37;
                                    String s6 = a38.getDescription();
                                    a35.shareText(s6);
                                }
                                Object a39 = org.spf.utils.Utils.getDetailRef();
                                if(a39 == null)
                                {
                                    break label1;
                                }
                                org.spf.mobi.ui.common.SPFDetailPage a40 = this.this$0;
                                boolean b2 = a40.isFinishing();
                                if(b2)
                                {
                                    break label1;
                                }
                                else
                                {
                                    break label2;
                                }
                            }
                            a = new StringBuilder();
                            a0 = new StringBuilder();
                            org.spf.mobi.ui.common.SPFDetailPage a41 = this.this$0;
                            Object a42 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a41);
                            label3: {
                                boolean b3 = a42 instanceof org.spf.data.SPFCrime;
                                if(b3)
                                {
                                    break label3;
                                }
                                org.spf.mobi.ui.common.SPFDetailPage a43 = this.this$0;
                                Object a44 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a43);
                                boolean b4 = a44 instanceof org.spf.data.SPFAppeal;
                                if(b4)
                                {
                                    break label4;
                                }
                                org.spf.mobi.ui.common.SPFDetailPage a45 = this.this$0;
                                Object a46 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a45);
                                boolean b5 = a46 instanceof org.spf.data.SPFMissing;
                                if(!b5)
                                {
                                    break label1;
                                }
                                else
                                {
                                    break label5;
                                }
                            }
                            org.spf.mobi.ui.common.SPFDetailPage a47 = this.this$0;
                            android.view.View a48 = a47.findViewById(2131165237);
                            android.widget.TextView dummy7 = (android.widget.TextView)a48;
                            android.widget.TextView a49 = (android.widget.TextView)a48;
                            org.spf.mobi.ui.common.SPFDetailPage a50 = this.this$0;
                            Object a51 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a50);
                            org.spf.data.SPFCrime dummy8 = (org.spf.data.SPFCrime)a51;
                            org.spf.data.SPFCrime a52 = (org.spf.data.SPFCrime)a51;
                            String s7 = a52.getTitle();
                            a49.setText((CharSequence)s7);
                            org.spf.mobi.ui.common.SPFDetailPage a53 = this.this$0;
                            Object a54 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a53);
                            org.spf.data.SPFCrime dummy9 = (org.spf.data.SPFCrime)a54;
                            org.spf.data.SPFCrime a55 = (org.spf.data.SPFCrime)a54;
                            String s8 = a55.getDetailedDesc();
                            this.desc = s8;
                            String s9 = this.desc;
                            String s10 = s9.replace((CharSequence)"\u00d4\u00f8\u03a9", (CharSequence)" ");
                            this.desc = s10;
                            org.spf.mobi.ui.common.SPFDetailPage a56 = this.this$0;
                            android.view.View a57 = a56.findViewById(2131165197);
                            android.widget.TextView dummy10 = (android.widget.TextView)a57;
                            android.widget.TextView a58 = (android.widget.TextView)a57;
                            String s11 = this.desc;
                            a58.setText((CharSequence)s11);
                            org.spf.mobi.ui.common.SPFDetailPage a59 = this.this$0;
                            Object a60 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a59);
                            org.spf.data.SPFCrime dummy11 = (org.spf.data.SPFCrime)a60;
                            org.spf.data.SPFCrime a61 = (org.spf.data.SPFCrime)a60;
                            org.spf.data.SPFCluster a62 = a61.getCluster();
                            String s12 = a62.getClusterId();
                            org.spf.mobi.ui.common.SPFDetailPage.access$6(s12);
                            org.spf.mobi.ui.common.SPFDetailPage a63 = this.this$0;
                            android.app.Activity a64 = org.spf.mobi.ui.common.SPFDetailPage.access$7(a63);
                            android.content.res.Resources a65 = a64.getResources();
                            String s13 = a65.getString(2131034114);
                            org.spf.mobi.ui.common.SPFDetailPage.access$8(s13);
                            org.spf.mobi.ui.common.SPFDetailPage a66 = this.this$0;
                            Object a67 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a66);
                            org.spf.data.SPFCrime dummy12 = (org.spf.data.SPFCrime)a67;
                            org.spf.data.SPFCrime a68 = (org.spf.data.SPFCrime)a67;
                            org.spf.data.SPFZone a69 = a68.getZone();
                            String s14 = a69.getZoneName();
                            org.spf.mobi.ui.common.SPFDetailPage.access$9(s14);
                            org.spf.mobi.ui.common.SPFDetailPage a70 = this.this$0;
                            Object a71 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a70);
                            org.spf.data.SPFCrime dummy13 = (org.spf.data.SPFCrime)a71;
                            org.spf.data.SPFCrime a72 = (org.spf.data.SPFCrime)a71;
                            org.spf.data.SPFZone a73 = a72.getZone();
                            String s15 = a73.getZoneId();
                            org.spf.mobi.ui.common.SPFDetailPage a74 = this.this$0;
                            Object a75 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a74);
                            org.spf.data.SPFCrime dummy14 = (org.spf.data.SPFCrime)a75;
                            org.spf.data.SPFCrime a76 = (org.spf.data.SPFCrime)a75;
                            org.spf.data.SPFCluster a77 = a76.getCluster();
                            String s16 = a77.getClusterId();
                            boolean b6 = s15.equalsIgnoreCase("999");
                            if(b6)
                            {
                                boolean b7 = s16.equalsIgnoreCase("9999");
                                if(b7)
                                {
                                    org.spf.mobi.ui.common.SPFDetailPage a78 = this.this$0;
                                    android.view.View a79 = a78.findViewById(2131165243);
                                    android.widget.ImageView dummy15 = (android.widget.ImageView)a79;
                                    android.widget.ImageView a80 = (android.widget.ImageView)a79;
                                    a80.setVisibility(0);
                                    org.spf.mobi.ui.common.SPFDetailPage a81 = this.this$0;
                                    android.view.View a82 = a81.findViewById(2131165242);
                                    android.widget.ImageView dummy16 = (android.widget.ImageView)a82;
                                    android.widget.ImageView a83 = (android.widget.ImageView)a82;
                                    a83.setVisibility(8);
                                }
                            }
                            org.spf.mobi.ui.common.SPFDetailPage a84 = this.this$0;
                            Object a85 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a84);
                            org.spf.data.SPFCrime dummy17 = (org.spf.data.SPFCrime)a85;
                            org.spf.data.SPFCrime a86 = (org.spf.data.SPFCrime)a85;
                            org.spf.data.SPFImagePath a87 = a86.getImagePath();
                            String s17 = a87.getFull();
                            a.append(s17);
                            org.spf.mobi.ui.common.SPFDetailPage a88 = this.this$0;
                            Object a89 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a88);
                            org.spf.data.SPFCrime dummy18 = (org.spf.data.SPFCrime)a89;
                            org.spf.data.SPFCrime a90 = (org.spf.data.SPFCrime)a89;
                            String s18 = a90.getImageUrl();
                            a.append(s18);
                            org.spf.mobi.ui.common.SPFDetailPage a91 = this.this$0;
                            android.view.View a92 = a91.findViewById(2131165238);
                            android.widget.ImageView dummy19 = (android.widget.ImageView)a92;
                            android.widget.ImageView a93 = (android.widget.ImageView)a92;
                            org.spf.mobi.ui.common.SPFDetailPage a94 = this.this$0;
                            Object a95 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a94);
                            org.spf.data.SPFCrime dummy20 = (org.spf.data.SPFCrime)a95;
                            org.spf.data.SPFCrime a96 = (org.spf.data.SPFCrime)a95;
                            android.graphics.Bitmap a97 = a96.getFull();
                            if(a97 != null)
                            {
                                org.spf.mobi.ui.common.SPFDetailPage a98 = this.this$0;
                                Object a99 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a98);
                                org.spf.data.SPFCrime dummy21 = (org.spf.data.SPFCrime)a99;
                                org.spf.data.SPFCrime a100 = (org.spf.data.SPFCrime)a99;
                                android.graphics.Bitmap a101 = a100.getFull();
                                a93.setImageBitmap(a101);
                            }
                            else
                            {
                                org.spf.mobi.ui.common.SPFDetailPage a102 = this.this$0;
                                android.app.Activity a103 = org.spf.mobi.ui.common.SPFDetailPage.access$7(a102);
                                org.spf.mobi.ui.common.SPFDetailPage a104 = this.this$0;
                                android.os.Handler a105 = org.spf.mobi.ui.common.SPFDetailPage.access$3(a104);
                                String s19 = a.toString();
                                org.spf.mobi.ui.common.SPFDetailPage a106 = this.this$0;
                                Object a107 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a106);
                                org.spf.data.SPFCrime dummy22 = (org.spf.data.SPFCrime)a107;
                                org.spf.data.SPFCrime a108 = (org.spf.data.SPFCrime)a107;
                                org.spf.utils.Constants.IMAGE_TYPE a109 = org.spf.utils.Constants.IMAGE_TYPE.FULL;
                                org.spf.utils.SPFGetImageFromHttp a110 = new org.spf.utils.SPFGetImageFromHttp(a103, a93, a105, s19, (android.os.Parcelable)a108, a109);
                                a110.start();
                            }
                            org.spf.mobi.ui.common.SPFDetailPage a111 = this.this$0;
                            Object a112 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a111);
                            org.spf.data.SPFCrime dummy23 = (org.spf.data.SPFCrime)a112;
                            org.spf.data.SPFCrime a113 = (org.spf.data.SPFCrime)a112;
                            org.spf.data.SPFImagePath a114 = a113.getImagePath();
                            String s20 = a114.getFooter();
                            a0.append(s20);
                            org.spf.mobi.ui.common.SPFDetailPage a115 = this.this$0;
                            Object a116 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a115);
                            org.spf.data.SPFCrime dummy24 = (org.spf.data.SPFCrime)a116;
                            org.spf.data.SPFCrime a117 = (org.spf.data.SPFCrime)a116;
                            org.spf.data.SPFFooter a118 = a117.getFooterData();
                            String s21 = a118.getUrl();
                            a0.append(s21);
                            org.spf.mobi.ui.common.SPFDetailPage a119 = this.this$0;
                            android.view.View a120 = a119.findViewById(2131165191);
                            android.widget.ImageView dummy25 = (android.widget.ImageView)a120;
                            android.widget.ImageView a121 = (android.widget.ImageView)a120;
                            org.spf.mobi.ui.common.SPFDetailPage a122 = this.this$0;
                            Object a123 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a122);
                            org.spf.data.SPFCrime dummy26 = (org.spf.data.SPFCrime)a123;
                            org.spf.data.SPFCrime a124 = (org.spf.data.SPFCrime)a123;
                            android.graphics.Bitmap a125 = a124.getFooter();
                            if(a125 != null)
                            {
                                org.spf.mobi.ui.common.SPFDetailPage a126 = this.this$0;
                                Object a127 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a126);
                                org.spf.data.SPFCrime dummy27 = (org.spf.data.SPFCrime)a127;
                                org.spf.data.SPFCrime a128 = (org.spf.data.SPFCrime)a127;
                                android.graphics.Bitmap a129 = a128.getFooter();
                                a121.setImageBitmap(a129);
                            }
                            else
                            {
                                org.spf.mobi.ui.common.SPFDetailPage a130 = this.this$0;
                                android.app.Activity a131 = org.spf.mobi.ui.common.SPFDetailPage.access$7(a130);
                                org.spf.mobi.ui.common.SPFDetailPage a132 = this.this$0;
                                android.os.Handler a133 = org.spf.mobi.ui.common.SPFDetailPage.access$3(a132);
                                String s22 = a0.toString();
                                org.spf.mobi.ui.common.SPFDetailPage a134 = this.this$0;
                                Object a135 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a134);
                                org.spf.data.SPFCrime dummy28 = (org.spf.data.SPFCrime)a135;
                                org.spf.data.SPFCrime a136 = (org.spf.data.SPFCrime)a135;
                                org.spf.utils.Constants.IMAGE_TYPE a137 = org.spf.utils.Constants.IMAGE_TYPE.FOOTER;
                                org.spf.utils.SPFGetImageFromHttp a138 = new org.spf.utils.SPFGetImageFromHttp(a131, a121, a133, s22, (android.os.Parcelable)a136, a137);
                                a138.start();
                            }
                            org.spf.mobi.ui.common.SPFDetailPage a139 = this.this$0;
                            Object a140 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a139);
                            org.spf.data.SPFCrime dummy29 = (org.spf.data.SPFCrime)a140;
                            org.spf.data.SPFCrime a141 = (org.spf.data.SPFCrime)a140;
                            String s23 = a141.getTitle();
                            org.spf.mobi.ui.common.SPFDetailPage.access$10(s23);
                            org.spf.mobi.ui.common.SPFDetailPage a142 = this.this$0;
                            org.spf.mobi.ui.common.SPFDetailPage a143 = this.this$0;
                            Object a144 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a143);
                            org.spf.data.SPFCrime dummy30 = (org.spf.data.SPFCrime)a144;
                            org.spf.data.SPFCrime a145 = (org.spf.data.SPFCrime)a144;
                            String s24 = a145.getLongDesc();
                            a142.shareText(s24);
                        }
                        break label6;
                    }
                    Object a146 = org.spf.utils.Utils.getDetailRef();
                    org.spf.mobi.ui.common.SPFDetailPage a147 = this.this$0;
                    Object a148 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a147);
                    org.spf.mobi.ui.common.SPFDetailPage a149 = this.this$0;
                    android.os.Handler a150 = org.spf.mobi.ui.common.SPFDetailPage.access$3(a149);
                    org.spf.mobi.ui.common.SPFDetailPage a151 = this.this$0;
                    android.view.View a152 = org.spf.mobi.ui.common.SPFDetailPage.access$11(a151);
                    ((org.spf.mobi.ui.common.SPFIGetFillView)a146).getViewFor((android.os.Parcelable)a148, a150, a152);
                    break label6;
                }
                org.spf.mobi.ui.common.SPFDetailPage a153 = this.this$0;
                Object a154 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a153);
                org.spf.data.SPFMissing dummy31 = (org.spf.data.SPFMissing)a154;
                org.spf.data.SPFMissing a155 = (org.spf.data.SPFMissing)a154;
                org.spf.data.SPFCluster a156 = a155.getCluster();
                String s25 = a156.getClusterId();
                org.spf.mobi.ui.common.SPFDetailPage.access$6(s25);
                org.spf.mobi.ui.common.SPFDetailPage a157 = this.this$0;
                android.app.Activity a158 = org.spf.mobi.ui.common.SPFDetailPage.access$7(a157);
                android.content.res.Resources a159 = a158.getResources();
                String s26 = a159.getString(2131034116);
                org.spf.mobi.ui.common.SPFDetailPage.access$8(s26);
                org.spf.mobi.ui.common.SPFDetailPage a160 = this.this$0;
                Object a161 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a160);
                org.spf.data.SPFMissing dummy32 = (org.spf.data.SPFMissing)a161;
                org.spf.data.SPFMissing a162 = (org.spf.data.SPFMissing)a161;
                org.spf.data.SPFZone a163 = a162.getZone();
                String s27 = a163.getZoneId();
                org.spf.mobi.ui.common.SPFDetailPage a164 = this.this$0;
                Object a165 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a164);
                org.spf.data.SPFMissing dummy33 = (org.spf.data.SPFMissing)a165;
                org.spf.data.SPFMissing a166 = (org.spf.data.SPFMissing)a165;
                org.spf.data.SPFCluster a167 = a166.getCluster();
                String s28 = a167.getClusterId();
                boolean b8 = s27.equalsIgnoreCase("999");
                if(b8)
                {
                    boolean b9 = s28.equalsIgnoreCase("9999");
                    if(b9)
                    {
                        org.spf.mobi.ui.common.SPFDetailPage a168 = this.this$0;
                        android.view.View a169 = a168.findViewById(2131165243);
                        android.widget.ImageView dummy34 = (android.widget.ImageView)a169;
                        android.widget.ImageView a170 = (android.widget.ImageView)a169;
                        a170.setVisibility(0);
                        org.spf.mobi.ui.common.SPFDetailPage a171 = this.this$0;
                        android.view.View a172 = a171.findViewById(2131165242);
                        android.widget.ImageView dummy35 = (android.widget.ImageView)a172;
                        android.widget.ImageView a173 = (android.widget.ImageView)a172;
                        a173.setVisibility(8);
                    }
                }
                org.spf.mobi.ui.common.SPFDetailPage a174 = this.this$0;
                Object a175 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a174);
                org.spf.data.SPFMissing dummy36 = (org.spf.data.SPFMissing)a175;
                org.spf.data.SPFMissing a176 = (org.spf.data.SPFMissing)a175;
                String s29 = a176.getTitle();
                org.spf.mobi.ui.common.SPFDetailPage.access$10(s29);
                org.spf.mobi.ui.common.SPFDetailPage a177 = this.this$0;
                org.spf.mobi.ui.common.SPFDetailPage a178 = this.this$0;
                Object a179 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a178);
                org.spf.data.SPFMissing dummy37 = (org.spf.data.SPFMissing)a179;
                org.spf.data.SPFMissing a180 = (org.spf.data.SPFMissing)a179;
                String s30 = a180.getDescription();
                a177.shareText(s30);
                break label6;
            }
            org.spf.mobi.ui.common.SPFDetailPage a181 = this.this$0;
            android.view.View a182 = a181.findViewById(2131165237);
            android.widget.TextView dummy38 = (android.widget.TextView)a182;
            android.widget.TextView a183 = (android.widget.TextView)a182;
            org.spf.mobi.ui.common.SPFDetailPage a184 = this.this$0;
            Object a185 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a184);
            org.spf.data.SPFAppeal dummy39 = (org.spf.data.SPFAppeal)a185;
            org.spf.data.SPFAppeal a186 = (org.spf.data.SPFAppeal)a185;
            String s31 = a186.getTitle();
            a183.setText((CharSequence)s31);
            org.spf.mobi.ui.common.SPFDetailPage a187 = this.this$0;
            Object a188 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a187);
            org.spf.data.SPFAppeal dummy40 = (org.spf.data.SPFAppeal)a188;
            org.spf.data.SPFAppeal a189 = (org.spf.data.SPFAppeal)a188;
            String s32 = a189.getDetailedDesc();
            this.desc = s32;
            String s33 = this.desc;
            String s34 = s33.replace((CharSequence)"\u00d4\u00f8\u03a9", (CharSequence)" ");
            this.desc = s34;
            org.spf.mobi.ui.common.SPFDetailPage a190 = this.this$0;
            android.view.View a191 = a190.findViewById(2131165197);
            android.widget.TextView dummy41 = (android.widget.TextView)a191;
            android.widget.TextView a192 = (android.widget.TextView)a191;
            String s35 = this.desc;
            a192.setText((CharSequence)s35);
            org.spf.mobi.ui.common.SPFDetailPage a193 = this.this$0;
            Object a194 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a193);
            org.spf.data.SPFAppeal dummy42 = (org.spf.data.SPFAppeal)a194;
            org.spf.data.SPFAppeal a195 = (org.spf.data.SPFAppeal)a194;
            org.spf.data.SPFImagePath a196 = a195.getImagePath();
            String s36 = a196.getFull();
            a.append(s36);
            org.spf.mobi.ui.common.SPFDetailPage a197 = this.this$0;
            Object a198 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a197);
            org.spf.data.SPFAppeal dummy43 = (org.spf.data.SPFAppeal)a198;
            org.spf.data.SPFAppeal a199 = (org.spf.data.SPFAppeal)a198;
            String s37 = a199.getImageUrl();
            a.append(s37);
            org.spf.mobi.ui.common.SPFDetailPage a200 = this.this$0;
            Object a201 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a200);
            org.spf.data.SPFAppeal dummy44 = (org.spf.data.SPFAppeal)a201;
            org.spf.data.SPFAppeal a202 = (org.spf.data.SPFAppeal)a201;
            org.spf.data.SPFCluster a203 = a202.getCluster();
            String s38 = a203.getClusterId();
            org.spf.mobi.ui.common.SPFDetailPage.access$6(s38);
            org.spf.mobi.ui.common.SPFDetailPage a204 = this.this$0;
            android.app.Activity a205 = org.spf.mobi.ui.common.SPFDetailPage.access$7(a204);
            android.content.res.Resources a206 = a205.getResources();
            String s39 = a206.getString(2131034115);
            org.spf.mobi.ui.common.SPFDetailPage.access$8(s39);
            org.spf.mobi.ui.common.SPFDetailPage a207 = this.this$0;
            Object a208 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a207);
            org.spf.data.SPFAppeal dummy45 = (org.spf.data.SPFAppeal)a208;
            org.spf.data.SPFAppeal a209 = (org.spf.data.SPFAppeal)a208;
            org.spf.data.SPFZone a210 = a209.getZone();
            String s40 = a210.getZoneName();
            org.spf.mobi.ui.common.SPFDetailPage.access$9(s40);
            org.spf.mobi.ui.common.SPFDetailPage a211 = this.this$0;
            Object a212 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a211);
            org.spf.data.SPFAppeal dummy46 = (org.spf.data.SPFAppeal)a212;
            org.spf.data.SPFAppeal a213 = (org.spf.data.SPFAppeal)a212;
            org.spf.data.SPFZone a214 = a213.getZone();
            String s41 = a214.getZoneId();
            org.spf.mobi.ui.common.SPFDetailPage a215 = this.this$0;
            Object a216 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a215);
            org.spf.data.SPFAppeal dummy47 = (org.spf.data.SPFAppeal)a216;
            org.spf.data.SPFAppeal a217 = (org.spf.data.SPFAppeal)a216;
            org.spf.data.SPFCluster a218 = a217.getCluster();
            String s42 = a218.getClusterId();
            boolean b10 = s41.equalsIgnoreCase("999");
            if(b10)
            {
                boolean b11 = s42.equalsIgnoreCase("9999");
                if(b11)
                {
                    org.spf.mobi.ui.common.SPFDetailPage a219 = this.this$0;
                    android.view.View a220 = a219.findViewById(2131165243);
                    android.widget.ImageView dummy48 = (android.widget.ImageView)a220;
                    android.widget.ImageView a221 = (android.widget.ImageView)a220;
                    a221.setVisibility(0);
                    org.spf.mobi.ui.common.SPFDetailPage a222 = this.this$0;
                    android.view.View a223 = a222.findViewById(2131165242);
                    android.widget.ImageView dummy49 = (android.widget.ImageView)a223;
                    android.widget.ImageView a224 = (android.widget.ImageView)a223;
                    a224.setVisibility(8);
                }
            }
            org.spf.mobi.ui.common.SPFDetailPage a225 = this.this$0;
            android.view.View a226 = a225.findViewById(2131165238);
            android.widget.ImageView dummy50 = (android.widget.ImageView)a226;
            android.widget.ImageView a227 = (android.widget.ImageView)a226;
            org.spf.mobi.ui.common.SPFDetailPage a228 = this.this$0;
            Object a229 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a228);
            org.spf.data.SPFAppeal dummy51 = (org.spf.data.SPFAppeal)a229;
            org.spf.data.SPFAppeal a230 = (org.spf.data.SPFAppeal)a229;
            android.graphics.Bitmap a231 = a230.getFull();
            if(a231 != null)
            {
                org.spf.mobi.ui.common.SPFDetailPage a232 = this.this$0;
                Object a233 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a232);
                org.spf.data.SPFAppeal dummy52 = (org.spf.data.SPFAppeal)a233;
                org.spf.data.SPFAppeal a234 = (org.spf.data.SPFAppeal)a233;
                android.graphics.Bitmap a235 = a234.getFull();
                a227.setImageBitmap(a235);
            }
            else
            {
                org.spf.mobi.ui.common.SPFDetailPage a236 = this.this$0;
                android.app.Activity a237 = org.spf.mobi.ui.common.SPFDetailPage.access$7(a236);
                org.spf.mobi.ui.common.SPFDetailPage a238 = this.this$0;
                android.os.Handler a239 = org.spf.mobi.ui.common.SPFDetailPage.access$3(a238);
                String s43 = a.toString();
                org.spf.mobi.ui.common.SPFDetailPage a240 = this.this$0;
                Object a241 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a240);
                org.spf.data.SPFAppeal dummy53 = (org.spf.data.SPFAppeal)a241;
                org.spf.data.SPFAppeal a242 = (org.spf.data.SPFAppeal)a241;
                org.spf.utils.Constants.IMAGE_TYPE a243 = org.spf.utils.Constants.IMAGE_TYPE.FULL;
                org.spf.utils.SPFGetImageFromHttp a244 = new org.spf.utils.SPFGetImageFromHttp(a237, a227, a239, s43, (android.os.Parcelable)a242, a243);
                a244.start();
            }
            org.spf.mobi.ui.common.SPFDetailPage a245 = this.this$0;
            Object a246 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a245);
            org.spf.data.SPFAppeal dummy54 = (org.spf.data.SPFAppeal)a246;
            org.spf.data.SPFAppeal a247 = (org.spf.data.SPFAppeal)a246;
            org.spf.data.SPFImagePath a248 = a247.getImagePath();
            String s44 = a248.getFooter();
            a0.append(s44);
            org.spf.mobi.ui.common.SPFDetailPage a249 = this.this$0;
            Object a250 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a249);
            org.spf.data.SPFAppeal dummy55 = (org.spf.data.SPFAppeal)a250;
            org.spf.data.SPFAppeal a251 = (org.spf.data.SPFAppeal)a250;
            org.spf.data.SPFFooter a252 = a251.getFooterData();
            String s45 = a252.getUrl();
            a0.append(s45);
            org.spf.mobi.ui.common.SPFDetailPage a253 = this.this$0;
            android.view.View a254 = a253.findViewById(2131165191);
            android.widget.ImageView dummy56 = (android.widget.ImageView)a254;
            android.widget.ImageView a255 = (android.widget.ImageView)a254;
            org.spf.mobi.ui.common.SPFDetailPage a256 = this.this$0;
            Object a257 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a256);
            org.spf.data.SPFAppeal dummy57 = (org.spf.data.SPFAppeal)a257;
            org.spf.data.SPFAppeal a258 = (org.spf.data.SPFAppeal)a257;
            android.graphics.Bitmap a259 = a258.getFooter();
            if(a259 != null)
            {
                org.spf.mobi.ui.common.SPFDetailPage a260 = this.this$0;
                Object a261 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a260);
                org.spf.data.SPFAppeal dummy58 = (org.spf.data.SPFAppeal)a261;
                org.spf.data.SPFAppeal a262 = (org.spf.data.SPFAppeal)a261;
                android.graphics.Bitmap a263 = a262.getFooter();
                a255.setImageBitmap(a263);
            }
            else
            {
                org.spf.mobi.ui.common.SPFDetailPage a264 = this.this$0;
                android.app.Activity a265 = org.spf.mobi.ui.common.SPFDetailPage.access$7(a264);
                org.spf.mobi.ui.common.SPFDetailPage a266 = this.this$0;
                android.os.Handler a267 = org.spf.mobi.ui.common.SPFDetailPage.access$3(a266);
                String s46 = a0.toString();
                org.spf.mobi.ui.common.SPFDetailPage a268 = this.this$0;
                Object a269 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a268);
                org.spf.data.SPFAppeal dummy59 = (org.spf.data.SPFAppeal)a269;
                org.spf.data.SPFAppeal a270 = (org.spf.data.SPFAppeal)a269;
                org.spf.utils.Constants.IMAGE_TYPE a271 = org.spf.utils.Constants.IMAGE_TYPE.FOOTER;
                org.spf.utils.SPFGetImageFromHttp a272 = new org.spf.utils.SPFGetImageFromHttp(a265, a255, a267, s46, (android.os.Parcelable)a270, a271);
                a272.start();
            }
            org.spf.mobi.ui.common.SPFDetailPage a273 = this.this$0;
            Object a274 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a273);
            org.spf.data.SPFAppeal dummy60 = (org.spf.data.SPFAppeal)a274;
            org.spf.data.SPFAppeal a275 = (org.spf.data.SPFAppeal)a274;
            String s47 = a275.getTitle();
            org.spf.mobi.ui.common.SPFDetailPage.access$10(s47);
            org.spf.mobi.ui.common.SPFDetailPage a276 = this.this$0;
            org.spf.mobi.ui.common.SPFDetailPage a277 = this.this$0;
            Object a278 = org.spf.mobi.ui.common.SPFDetailPage.access$5(a277);
            org.spf.data.SPFAppeal dummy61 = (org.spf.data.SPFAppeal)a278;
            org.spf.data.SPFAppeal a279 = (org.spf.data.SPFAppeal)a278;
            String s48 = a279.getLongDesc();
            a276.shareText(s48);
        }
    }
}
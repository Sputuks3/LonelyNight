package org.spf.mobi.ui.map;

class 1 implements Runnable {
    final org.spf.mobi.ui.map.SPFMapPointDetails.2 this$1;
    
    1(org.spf.mobi.ui.map.SPFMapPointDetails.2 a)
    {
        this.this$1 = a;
        super();
    }
    
    public void run()
    {
        label2: {
            org.spf.mobi.ui.map.SPFMapPointDetails.2 a = this.this$1;
            Thread a0 = a.instance;
            boolean b = a0.isInterrupted();
            label1: {
                label0: {
                    String s = null;
                    if(b)
                    {
                        break label0;
                    }
                    org.spf.mobi.ui.map.SPFMapPointDetails.2 a1 = this.this$1;
                    org.spf.mobi.ui.map.SPFMapPointDetails a2 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a1);
                    boolean b0 = a2.isFinishing();
                    if(b0)
                    {
                        break label0;
                    }
                    org.spf.mobi.ui.map.SPFMapPointDetails.2 a3 = this.this$1;
                    org.spf.mobi.ui.map.SPFMapPointDetails a4 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a3);
                    a4.removeDialog(0);
                    StringBuilder a5 = new StringBuilder("Statistics Array List::");
                    org.spf.mobi.ui.map.SPFMapPointDetails.2 a6 = this.this$1;
                    org.spf.mobi.ui.map.SPFMapPointDetails a7 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a6);
                    org.spf.data.SPFArrayList a8 = org.spf.mobi.ui.map.SPFMapPointDetails.access$5(a7);
                    int i = a8.size();
                    StringBuilder a9 = a5.append(i);
                    String s0 = a9.toString();
                    android.util.Log.d("SPF", s0);
                    org.spf.mobi.ui.map.SPFMapPointDetails.2 a10 = this.this$1;
                    org.spf.mobi.ui.map.SPFMapPointDetails a11 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a10);
                    org.spf.data.SPFArrayList a12 = org.spf.mobi.ui.map.SPFMapPointDetails.access$5(a11);
                    int i0 = a12.size();
                    if(i0 <= 0)
                    {
                        break label1;
                    }
                    org.spf.mobi.ui.map.SPFMapPointDetails.2 a13 = this.this$1;
                    org.spf.mobi.ui.map.SPFMapPointDetails a14 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a13);
                    org.spf.mobi.ui.map.SPFMapPointDetails.2 a15 = this.this$1;
                    org.spf.mobi.ui.map.SPFMapPointDetails a16 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a15);
                    org.spf.mobi.ui.map.SPFMapPointDetails.2 a17 = this.this$1;
                    org.spf.mobi.ui.map.SPFMapPointDetails a18 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a17);
                    org.spf.data.SPFArrayList a19 = org.spf.mobi.ui.map.SPFMapPointDetails.access$5(a18);
                    org.spf.mobi.ui.map.custom.SPFStatisticAdapter a20 = new org.spf.mobi.ui.map.custom.SPFStatisticAdapter((android.app.Activity)a16, a19);
                    a14.adapter = a20;
                    org.spf.mobi.ui.map.SPFMapPointDetails.2 a21 = this.this$1;
                    org.spf.mobi.ui.map.SPFMapPointDetails a22 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a21);
                    org.spf.data.SPFStatisticsList a23 = org.spf.mobi.ui.map.SPFMapPointDetails.access$2(a22);
                    org.spf.data.SPFTimePeriod a24 = a23.getStartDate();
                    String s1 = a24.getMonth();
                    org.spf.mobi.ui.map.SPFMapPointDetails.2 a25 = this.this$1;
                    org.spf.mobi.ui.map.SPFMapPointDetails a26 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a25);
                    org.spf.data.SPFStatisticsList a27 = org.spf.mobi.ui.map.SPFMapPointDetails.access$2(a26);
                    org.spf.data.SPFTimePeriod a28 = a27.getEndDate();
                    String s2 = a28.getMonth();
                    boolean b1 = s1.equals((Object)s2);
                    if(!b1)
                    {
                        StringBuilder a29 = new StringBuilder("Crime Statistics (");
                        org.spf.mobi.ui.map.SPFMapPointDetails.2 a30 = this.this$1;
                        org.spf.mobi.ui.map.SPFMapPointDetails a31 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a30);
                        org.spf.data.SPFStatisticsList a32 = org.spf.mobi.ui.map.SPFMapPointDetails.access$2(a31);
                        org.spf.data.SPFTimePeriod a33 = a32.getStartDate();
                        String s3 = a33.getMonth();
                        StringBuilder a34 = a29.append(s3);
                        StringBuilder a35 = a34.append(" - ");
                        org.spf.mobi.ui.map.SPFMapPointDetails.2 a36 = this.this$1;
                        org.spf.mobi.ui.map.SPFMapPointDetails a37 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a36);
                        org.spf.data.SPFStatisticsList a38 = org.spf.mobi.ui.map.SPFMapPointDetails.access$2(a37);
                        org.spf.data.SPFTimePeriod a39 = a38.getEndDate();
                        String s4 = a39.getMonth();
                        StringBuilder a40 = a35.append(s4);
                        StringBuilder a41 = a40.append(" ");
                        org.spf.mobi.ui.map.SPFMapPointDetails.2 a42 = this.this$1;
                        org.spf.mobi.ui.map.SPFMapPointDetails a43 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a42);
                        org.spf.data.SPFStatisticsList a44 = org.spf.mobi.ui.map.SPFMapPointDetails.access$2(a43);
                        org.spf.data.SPFTimePeriod a45 = a44.getEndDate();
                        String s5 = a45.getYear();
                        StringBuilder a46 = a41.append(s5);
                        StringBuilder a47 = a46.append(")");
                        String s6 = a47.toString();
                        s = s6;
                    }
                    else
                    {
                        StringBuilder a48 = new StringBuilder("Crime Statistics ");
                        org.spf.mobi.ui.map.SPFMapPointDetails.2 a49 = this.this$1;
                        org.spf.mobi.ui.map.SPFMapPointDetails a50 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a49);
                        org.spf.data.SPFStatisticsList a51 = org.spf.mobi.ui.map.SPFMapPointDetails.access$2(a50);
                        org.spf.data.SPFTimePeriod a52 = a51.getStartDate();
                        String s7 = a52.getMonth();
                        StringBuilder a53 = a48.append(s7);
                        StringBuilder a54 = a53.append(" ");
                        org.spf.mobi.ui.map.SPFMapPointDetails.2 a55 = this.this$1;
                        org.spf.mobi.ui.map.SPFMapPointDetails a56 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a55);
                        org.spf.data.SPFStatisticsList a57 = org.spf.mobi.ui.map.SPFMapPointDetails.access$2(a56);
                        org.spf.data.SPFTimePeriod a58 = a57.getEndDate();
                        String s8 = a58.getYear();
                        StringBuilder a59 = a54.append(s8);
                        String s9 = a59.toString();
                        s = s9;
                    }
                    org.spf.mobi.ui.map.SPFMapPointDetails.2 a60 = this.this$1;
                    org.spf.mobi.ui.map.SPFMapPointDetails a61 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a60);
                    android.widget.TextView a62 = org.spf.mobi.ui.map.SPFMapPointDetails.access$6(a61);
                    a62.setText((CharSequence)s);
                    org.spf.mobi.ui.map.SPFMapPointDetails.2 a63 = this.this$1;
                    org.spf.mobi.ui.map.SPFMapPointDetails a64 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a63);
                    android.widget.ListView a65 = org.spf.mobi.ui.map.SPFMapPointDetails.access$7(a64);
                    a65.setTextFilterEnabled(true);
                    org.spf.mobi.ui.map.SPFMapPointDetails.2 a66 = this.this$1;
                    org.spf.mobi.ui.map.SPFMapPointDetails a67 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a66);
                    android.widget.ListView a68 = org.spf.mobi.ui.map.SPFMapPointDetails.access$7(a67);
                    org.spf.mobi.ui.map.SPFMapPointDetails.2 a69 = this.this$1;
                    org.spf.mobi.ui.map.SPFMapPointDetails a70 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a69);
                    org.spf.mobi.ui.map.custom.SPFStatisticAdapter a71 = a70.adapter;
                    a68.setAdapter((android.widget.ListAdapter)a71);
                }
                break label2;
            }
            org.spf.mobi.ui.map.SPFMapPointDetails.2 a72 = this.this$1;
            org.spf.mobi.ui.map.SPFMapPointDetails a73 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a72);
            android.widget.ListView a74 = org.spf.mobi.ui.map.SPFMapPointDetails.access$7(a73);
            a74.setVisibility(8);
            org.spf.mobi.ui.map.SPFMapPointDetails.2 a75 = this.this$1;
            org.spf.mobi.ui.map.SPFMapPointDetails a76 = org.spf.mobi.ui.map.SPFMapPointDetails.2.access$0(a75);
            android.widget.TextView a77 = org.spf.mobi.ui.map.SPFMapPointDetails.access$8(a76);
            a77.setVisibility(0);
        }
    }
}
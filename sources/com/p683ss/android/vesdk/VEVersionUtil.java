package com.p683ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.VEVersionUtil */
public class VEVersionUtil {
    public static String getVESDKVersion() {
        String str;
        String str2 = "mt";
        if (str2.contentEquals("common")) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder("-");
            sb.append(str2);
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("6.7.0.110");
        sb2.append(str);
        return sb2.toString();
    }
}

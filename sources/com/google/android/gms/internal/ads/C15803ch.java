package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.ch */
final class C15803ch extends C15800ce {
    C15803ch() {
    }

    /* renamed from: a */
    public final String mo30895a(String str, String str2) {
        String a = m37140a(str);
        String a2 = m37140a(str2);
        if (TextUtils.isEmpty(a)) {
            return a2;
        }
        if (TextUtils.isEmpty(a2)) {
            return a;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(a2).length());
        sb.append(a);
        sb.append(",");
        sb.append(a2);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m37140a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        int length = str.length();
        while (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        if (length < i) {
            return null;
        }
        if (i == 0 && length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }
}

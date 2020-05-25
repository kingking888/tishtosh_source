package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: com.google.android.gms.common.util.q */
public final class C15526q {

    /* renamed from: a */
    private static String f39998a;

    /* renamed from: b */
    private static int f39999b;

    /* renamed from: a */
    public static String m32305a() {
        if (f39998a == null) {
            if (f39999b == 0) {
                f39999b = Process.myPid();
            }
            f39998a = m32306a(f39999b);
        }
        return f39998a;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m32306a(int r4) {
        /*
            r0 = 0
            if (r4 > 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0037, all -> 0x0032 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0037, all -> 0x0032 }
            java.lang.String r1 = "/proc/"
            r2.append(r1)     // Catch:{ IOException -> 0x0037, all -> 0x0032 }
            r2.append(r4)     // Catch:{ IOException -> 0x0037, all -> 0x0032 }
            java.lang.String r4 = "/cmdline"
            r2.append(r4)     // Catch:{ IOException -> 0x0037, all -> 0x0032 }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x0037, all -> 0x0032 }
            java.io.BufferedReader r4 = m32304a(r4)     // Catch:{ IOException -> 0x0037, all -> 0x0032 }
            java.lang.String r1 = r4.readLine()     // Catch:{ IOException -> 0x0038, all -> 0x002d }
            java.lang.String r1 = r1.trim()     // Catch:{ IOException -> 0x0038, all -> 0x002d }
            com.google.android.gms.common.util.C15521l.m32290a(r4)
            r0 = r1
            goto L_0x003b
        L_0x002d:
            r0 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x0033
        L_0x0032:
            r4 = move-exception
        L_0x0033:
            com.google.android.gms.common.util.C15521l.m32290a(r0)
            throw r4
        L_0x0037:
            r4 = r0
        L_0x0038:
            com.google.android.gms.common.util.C15521l.m32290a(r4)
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.C15526q.m32306a(int):java.lang.String");
    }

    /* renamed from: a */
    private static BufferedReader m32304a(String str) throws IOException {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}

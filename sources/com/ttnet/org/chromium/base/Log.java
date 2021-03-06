package com.ttnet.org.chromium.base;

import com.C2240a;
import java.util.Locale;

public class Log {
    private Log() {
    }

    private static String getCallOrigin() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Log.class.getName();
        int i = 0;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            } else if (stackTrace[i].getClassName().equals(name)) {
                i += 4;
                break;
            } else {
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(stackTrace[i].getFileName());
        sb.append(":");
        sb.append(stackTrace[i].getLineNumber());
        return sb.toString();
    }

    public static String getStackTraceString(Throwable th) {
        return android.util.Log.getStackTraceString(th);
    }

    private static Throwable getThrowableToLog(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Throwable th = objArr[objArr.length - 1];
        if (!(th instanceof Throwable)) {
            return null;
        }
        return th;
    }

    public static String normalizeTag(String str) {
        if (str.startsWith("cr_")) {
            return str;
        }
        int i = 0;
        if (str.startsWith("cr.")) {
            i = 3;
        }
        StringBuilder sb = new StringBuilder("cr_");
        sb.append(str.substring(i, str.length()));
        return sb.toString();
    }

    /* renamed from: d */
    public static void m111326d(String str, String str2) {
        debug(str, str2, new Object[0]);
    }

    public static boolean isLoggable(String str, int i) {
        return android.util.Log.isLoggable(str, i);
    }

    /* renamed from: v */
    public static void m111336v(String str, String str2) {
        verbose(str, str2, new Object[0]);
    }

    private static String formatLog(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        return C2240a.m6773a(Locale.US, str, objArr);
    }

    private static String formatLogWithStack(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(getCallOrigin());
        sb.append("] ");
        sb.append(formatLog(str, objArr));
        return sb.toString();
    }

    private static void debug(String str, String str2, Object... objArr) {
        formatLogWithStack(str2, objArr);
        getThrowableToLog(objArr);
    }

    /* renamed from: e */
    public static void m111334e(String str, String str2, Object... objArr) {
        formatLog(str2, objArr);
        getThrowableToLog(objArr);
    }

    /* renamed from: i */
    public static void m111335i(String str, String str2, Object... objArr) {
        formatLog(str2, objArr);
        getThrowableToLog(objArr);
    }

    private static void verbose(String str, String str2, Object... objArr) {
        formatLogWithStack(str2, objArr);
        getThrowableToLog(objArr);
    }

    /* renamed from: w */
    public static void m111344w(String str, String str2, Object... objArr) {
        formatLog(str2, objArr);
        getThrowableToLog(objArr);
    }

    /* renamed from: d */
    public static void m111327d(String str, String str2, Object obj) {
        debug(str, str2, obj);
    }

    /* renamed from: v */
    public static void m111337v(String str, String str2, Object obj) {
        verbose(str, str2, obj);
    }

    public static void wtf(String str, String str2, Object... objArr) {
        String formatLog = formatLog(str2, objArr);
        Throwable throwableToLog = getThrowableToLog(objArr);
        if (throwableToLog != null) {
            android.util.Log.wtf(normalizeTag(str), formatLog, throwableToLog);
        } else {
            android.util.Log.wtf(normalizeTag(str), formatLog);
        }
    }

    /* renamed from: d */
    public static void m111328d(String str, String str2, Object obj, Object obj2) {
        debug(str, str2, obj, obj2);
    }

    /* renamed from: v */
    public static void m111338v(String str, String str2, Object obj, Object obj2) {
        verbose(str, str2, obj, obj2);
    }

    /* renamed from: d */
    public static void m111329d(String str, String str2, Object obj, Object obj2, Object obj3) {
        debug(str, str2, obj, obj2, obj3);
    }

    /* renamed from: v */
    public static void m111339v(String str, String str2, Object obj, Object obj2, Object obj3) {
        verbose(str, str2, obj, obj2, obj3);
    }

    /* renamed from: d */
    public static void m111330d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        debug(str, str2, obj, obj2, obj3, obj4);
    }

    /* renamed from: v */
    public static void m111340v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        verbose(str, str2, obj, obj2, obj3, obj4);
    }

    /* renamed from: d */
    public static void m111331d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        debug(str, str2, obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: v */
    public static void m111341v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        verbose(str, str2, obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: d */
    public static void m111332d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        debug(str, str2, obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* renamed from: v */
    public static void m111342v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        verbose(str, str2, obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* renamed from: d */
    public static void m111333d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        debug(str, str2, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    /* renamed from: v */
    public static void m111343v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        verbose(str, str2, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }
}

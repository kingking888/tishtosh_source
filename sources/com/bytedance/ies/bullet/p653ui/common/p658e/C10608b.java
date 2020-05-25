package com.bytedance.ies.bullet.p653ui.common.p658e;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.gyf.barlibrary.FlymeOSStatusBarFontUtils;
import com.gyf.barlibrary.OSUtils;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.lang.reflect.Method;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.ui.common.e.b */
public final class C10608b {

    /* renamed from: a */
    public static final C10608b f28131a = new C10608b();

    /* renamed from: b */
    private static final int f28132b = 256;

    /* renamed from: c */
    private static final int f28133c = 512;

    private C10608b() {
    }

    /* renamed from: a */
    public static int m21381a(Context context) {
        C52711k.m112240b(context, "context");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m21382a(android.app.Activity r7) {
        /*
            java.lang.String r0 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            android.view.Window r0 = r7.getWindow()
            r1 = 1024(0x400, float:1.435E-42)
            r0.setFlags(r1, r1)
            r0 = 1
            r1 = 0
            android.content.Context r2 = r7.getApplicationContext()     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = "activity.applicationContext"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x005e }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = "android.os.SystemProperties"
            java.lang.Class r2 = r2.loadClass(r3)     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = "getInt"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x005e }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r1] = r6     // Catch:{ Exception -> 0x005e }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x005e }
            r5[r0] = r6     // Catch:{ Exception -> 0x005e }
            java.lang.reflect.Method r3 = r2.getMethod(r3, r5)     // Catch:{ Exception -> 0x005e }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x005e }
            java.lang.String r5 = "ro.miui.notch"
            r4[r1] = r5     // Catch:{ Exception -> 0x005e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x005e }
            r4[r0] = r5     // Catch:{ Exception -> 0x005e }
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch:{ Exception -> 0x005e }
            if (r2 == 0) goto L_0x0056
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x005e }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x005e }
            if (r2 != r0) goto L_0x005e
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x005e }
            r3 = 28
            if (r2 >= r3) goto L_0x005e
            r2 = 1
            goto L_0x005f
        L_0x0056:
            d.u r2 = new d.u     // Catch:{ Exception -> 0x005e }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Int"
            r2.<init>(r3)     // Catch:{ Exception -> 0x005e }
            throw r2     // Catch:{ Exception -> 0x005e }
        L_0x005e:
            r2 = 0
        L_0x005f:
            if (r2 == 0) goto L_0x0089
            int r2 = f28132b
            int r3 = f28133c
            r2 = r2 | r3
            java.lang.Class<android.view.Window> r3 = android.view.Window.class
            java.lang.String r4 = "addExtraFlags"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0089 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0089 }
            if (r6 != 0) goto L_0x0073
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x0089 }
        L_0x0073:
            r5[r1] = r6     // Catch:{ Exception -> 0x0089 }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ Exception -> 0x0089 }
            android.view.Window r7 = r7.getWindow()     // Catch:{ Exception -> 0x0089 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0089 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0089 }
            r0[r1] = r2     // Catch:{ Exception -> 0x0089 }
            r3.invoke(r7, r0)     // Catch:{ Exception -> 0x0089 }
            return
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.p653ui.common.p658e.C10608b.m21382a(android.app.Activity):void");
    }

    /* renamed from: a */
    public static void m21383a(Activity activity, int i) {
        C52711k.m112240b(activity, "activity");
        if (VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            C52711k.m112236a((Object) window, "activity.window");
            window.setStatusBarColor(i);
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            C11065a.m22392a(activity, i);
        }
    }

    /* renamed from: a */
    private static void m21384a(boolean z, Window window) {
        int i;
        try {
            Class cls = window.getClass();
            Class cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", new Class[]{Integer.TYPE, Integer.TYPE});
            Object[] objArr = new Object[2];
            if (z) {
                i = i2;
            } else {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            method.invoke(window, objArr);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo18783a(Activity activity, Window window, boolean z) {
        if (window != null) {
            try {
                if (VERSION.SDK_INT >= 23) {
                    View decorView = window.getDecorView();
                    C52711k.m112236a((Object) decorView, "decorView");
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    if (!z) {
                        decorView.setSystemUiVisibility(systemUiVisibility & -8193);
                    } else {
                        decorView.setSystemUiVisibility(systemUiVisibility | VideoCacheReadBuffersizeExperiment.DEFAULT);
                    }
                    window.clearFlags(67108864);
                    window.addFlags(DynamicTabYellowPointVersion.DEFAULT);
                }
                if (OSUtils.isMIUI6Later()) {
                    m21384a(z, window);
                }
                if (OSUtils.isFlymeOS4Later()) {
                    FlymeOSStatusBarFontUtils.setStatusBarDarkIcon(activity, z);
                }
            } catch (Throwable unused) {
            }
        }
    }
}

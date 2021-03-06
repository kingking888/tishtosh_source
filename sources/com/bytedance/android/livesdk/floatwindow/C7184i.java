package com.bytedance.android.livesdk.floatwindow;

import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build.VERSION;
import android.provider.Settings;
import com.bytedance.android.live.core.p230g.C3866ad;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.floatwindow.i */
public class C7184i {

    /* renamed from: a */
    private static final String f19530a = C7184i.class.getCanonicalName();

    private C7184i() {
    }

    /* renamed from: b */
    private static String m14911b() {
        return C3866ad.m9801a("ro.miui.ui.version.name");
    }

    /* renamed from: a */
    private static String m14907a() {
        return ((IHostContext) C4116c.m10249a(IHostContext.class)).getPackageName();
    }

    /* renamed from: i */
    private static void m14919i(Context context) {
        m14920j(context);
    }

    /* renamed from: k */
    private static void m14921k(Context context) {
        m14908a("com.coloros.safecenter", context);
    }

    /* renamed from: l */
    private static void m14922l(Context context) {
        m14908a("com.yulong.android.security:remote", context);
    }

    /* renamed from: m */
    private static void m14923m(Context context) {
        m14908a("com.bairenkeji.icaller", context);
    }

    /* renamed from: a */
    public static boolean m14909a(Context context) {
        if (VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(context);
        }
        return m14913c(context);
    }

    /* renamed from: j */
    private static void m14920j(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        try {
            if (m14910a(context, intent)) {
                context.startActivity(intent);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private static void m14914d(Context context) {
        try {
            Intent intent = new Intent(m14907a());
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$AccessLockSummaryActivity"));
            if (m14910a(context, intent)) {
                context.startActivity(intent);
            } else {
                m14920j(context);
            }
        } catch (Exception unused) {
            m14920j(context);
        }
    }

    /* renamed from: e */
    private static void m14915e(Context context) {
        try {
            Intent intent = new Intent(m14907a());
            intent.setComponent(new ComponentName("com.sonymobile.cta", "com.sonymobile.cta.SomcCTAMainActivity"));
            if (m14910a(context, intent)) {
                context.startActivity(intent);
            } else {
                m14920j(context);
            }
        } catch (Exception unused) {
            m14920j(context);
        }
    }

    /* renamed from: f */
    private static void m14916f(Context context) {
        try {
            Intent intent = new Intent(m14907a());
            intent.setFlags(268435456);
            intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
            if (m14910a(context, intent)) {
                context.startActivity(intent);
            } else {
                m14920j(context);
            }
        } catch (Exception unused) {
            m14920j(context);
        }
    }

    /* renamed from: h */
    private static void m14918h(Context context) {
        try {
            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.putExtra("packageName", m14907a());
            if (m14910a(context, intent)) {
                context.startActivity(intent);
            } else {
                m14920j(context);
            }
        } catch (ActivityNotFoundException unused) {
            m14920j(context);
        }
    }

    /* renamed from: c */
    private static boolean m14913c(Context context) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            if (((Integer) AppOpsManager.class.getMethod("checkOp", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(24), Integer.valueOf(Binder.getCallingUid()), context.getApplicationContext().getPackageName()})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: g */
    private static void m14917g(Context context) {
        String b = m14911b();
        Intent intent = new Intent();
        if ("V6".equals(b) || "V7".equals(b)) {
            intent.setAction("miui.intent.action.APP_PERM_EDITOR");
            intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
            intent.putExtra("extra_pkgname", m14907a());
        } else if ("V8".equals(b) || "V9".equals(b) || "V10".equals(b)) {
            intent.setAction("miui.intent.action.APP_PERM_EDITOR");
            intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
            intent.putExtra("extra_pkgname", m14907a());
        } else {
            m14920j(context);
            return;
        }
        if (m14910a(context, intent)) {
            context.startActivity(intent);
        }
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m14912b(android.content.Context r2) {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER
            int r1 = r0.hashCode()
            switch(r1) {
                case -1678088054: goto L_0x005b;
                case -1675632421: goto L_0x0051;
                case 2427: goto L_0x0046;
                case 2432928: goto L_0x003c;
                case 2582855: goto L_0x0032;
                case 3620012: goto L_0x0028;
                case 74224812: goto L_0x001e;
                case 1864941562: goto L_0x0014;
                case 2141820391: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0065
        L_0x000a:
            java.lang.String r1 = "HUAWEI"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0065
            r0 = 0
            goto L_0x0066
        L_0x0014:
            java.lang.String r1 = "samsung"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0065
            r0 = 6
            goto L_0x0066
        L_0x001e:
            java.lang.String r1 = "Meizu"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0065
            r0 = 4
            goto L_0x0066
        L_0x0028:
            java.lang.String r1 = "vivo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0065
            r0 = 1
            goto L_0x0066
        L_0x0032:
            java.lang.String r1 = "Sony"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0065
            r0 = 7
            goto L_0x0066
        L_0x003c:
            java.lang.String r1 = "OPPO"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0065
            r0 = 2
            goto L_0x0066
        L_0x0046:
            java.lang.String r1 = "LG"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0065
            r0 = 8
            goto L_0x0066
        L_0x0051:
            java.lang.String r1 = "Xiaomi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0065
            r0 = 5
            goto L_0x0066
        L_0x005b:
            java.lang.String r1 = "Coolpad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0065
            r0 = 3
            goto L_0x0066
        L_0x0065:
            r0 = -1
        L_0x0066:
            switch(r0) {
                case 0: goto L_0x008d;
                case 1: goto L_0x0089;
                case 2: goto L_0x0085;
                case 3: goto L_0x0081;
                case 4: goto L_0x007d;
                case 5: goto L_0x0079;
                case 6: goto L_0x0075;
                case 7: goto L_0x0071;
                case 8: goto L_0x006d;
                default: goto L_0x0069;
            }
        L_0x0069:
            m14920j(r2)
            return
        L_0x006d:
            m14914d(r2)
            return
        L_0x0071:
            m14915e(r2)
            return
        L_0x0075:
            m14919i(r2)
            return
        L_0x0079:
            m14917g(r2)
            return
        L_0x007d:
            m14918h(r2)
            return
        L_0x0081:
            m14922l(r2)
            return
        L_0x0085:
            m14921k(r2)
            return
        L_0x0089:
            m14923m(r2)
            return
        L_0x008d:
            m14916f(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.floatwindow.C7184i.m14912b(android.content.Context):void");
    }

    /* renamed from: a */
    private static boolean m14910a(Context context, Intent intent) {
        if (context != null) {
            try {
                if (context.getPackageManager().resolveActivity(intent, 0) != null) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m14908a(String str, Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            m14920j(context);
            return;
        }
        Intent intent = new Intent("android.intent.action.MAIN", null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(packageInfo.packageName);
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        for (int i = 0; i < queryIntentActivities.size(); i++) {
        }
        try {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivities.iterator().next();
            if (resolveInfo != null) {
                String str2 = resolveInfo.activityInfo.packageName;
                String str3 = resolveInfo.activityInfo.name;
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.LAUNCHER");
                intent2.setComponent(new ComponentName(str2, str3));
                context.startActivity(intent2);
            }
        } catch (Exception unused2) {
            m14920j(context);
        }
    }
}

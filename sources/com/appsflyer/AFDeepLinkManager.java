package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;

public class AFDeepLinkManager {

    /* renamed from: ˋ */
    private static Uri f7688;

    /* renamed from: ˏ */
    private static AFDeepLinkManager f7689;

    /* renamed from: ॱ */
    private static Uri f7690;
    protected int currentActivityHash = -1;

    private AFDeepLinkManager() {
    }

    public static AFDeepLinkManager getInstance() {
        if (f7689 == null) {
            f7689 = new AFDeepLinkManager();
        }
        return f7689;
    }

    /* access modifiers changed from: protected */
    public void collectIntentsFromActivities(Intent intent) {
        Uri uri;
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            uri = null;
        } else {
            uri = intent.getData();
        }
        if (uri != null && intent.getData() != f7690) {
            f7690 = intent.getData();
        }
    }

    /* access modifiers changed from: protected */
    public void processIntentForDeepLink(Intent intent, Context context, Map<String, Object> map) {
        Uri uri;
        boolean z;
        String str;
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            uri = null;
        } else {
            uri = intent.getData();
        }
        if (uri != null) {
            boolean z2 = AppsFlyerProperties.getInstance().getBoolean("consumeAfDeepLink", false);
            if ((intent.getFlags() & 4194304) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (intent.hasExtra("appsflyer_click_ts") && !z2) {
                long longExtra = intent.getLongExtra("appsflyer_click_ts", 0);
                long j = AppsFlyerProperties.getInstance().getLong("appsflyer_click_consumed_ts", 0);
                if (longExtra == 0 || longExtra == j) {
                    StringBuilder sb = new StringBuilder("skipping re-use of previously consumed deep link: ");
                    sb.append(uri.toString());
                    sb.append(" w/Ex: ");
                    sb.append(String.valueOf(longExtra));
                    AFLogger.afInfoLog(sb.toString());
                    return;
                }
                AppsFlyerLib.getInstance().handleDeepLinkCallback(context, map, uri);
                AppsFlyerProperties.getInstance().set("appsflyer_click_consumed_ts", longExtra);
            } else if (z2 || z) {
                Boolean valueOf = Boolean.valueOf(z);
                if (f7688 == null || !uri.equals(f7688)) {
                    AppsFlyerLib.getInstance().handleDeepLinkCallback(context, map, uri);
                    f7688 = uri;
                    return;
                }
                StringBuilder sb2 = new StringBuilder("skipping re-use of previously consumed deep link: ");
                sb2.append(uri.toString());
                if (valueOf.booleanValue()) {
                    str = " w/sT";
                } else {
                    str = " w/cAPI";
                }
                sb2.append(str);
                AFLogger.afInfoLog(sb2.toString());
            } else {
                if (this.currentActivityHash != AppsFlyerProperties.getInstance().getInt("lastActivityHash", 0)) {
                    AppsFlyerLib.getInstance().handleDeepLinkCallback(context, map, uri);
                    AppsFlyerProperties.getInstance().set("lastActivityHash", this.currentActivityHash);
                    return;
                }
                StringBuilder sb3 = new StringBuilder("skipping re-use of previously consumed deep link: ");
                sb3.append(uri.toString());
                sb3.append(" w/hC: ");
                sb3.append(String.valueOf(this.currentActivityHash));
                AFLogger.afInfoLog(sb3.toString());
            }
        } else if (f7690 != null) {
            AppsFlyerLib.getInstance().handleDeepLinkCallback(context, map, f7690);
            StringBuilder sb4 = new StringBuilder("using trampoline Intent fallback with URI : ");
            sb4.append(f7690.toString());
            AFLogger.afInfoLog(sb4.toString());
            f7690 = null;
        } else {
            if (AppsFlyerLib.getInstance().latestDeepLink != null) {
                AppsFlyerLib.getInstance().handleDeepLinkCallback(context, map, AppsFlyerLib.getInstance().latestDeepLink);
            }
        }
    }
}

package com.facebook;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b;

/* renamed from: com.facebook.ae */
final class C13603ae {
    /* renamed from: a */
    static ApplicationInfo m27457a(PackageManager packageManager, String str, int i) throws NameNotFoundException {
        if (!TextUtils.equals(str, C11010c.m22280a().getPackageName())) {
            return packageManager.getApplicationInfo(str, 128);
        }
        if (C18970b.f52271a == null) {
            C18970b.f52271a = packageManager.getApplicationInfo(str, 128);
        }
        return C18970b.f52271a;
    }
}

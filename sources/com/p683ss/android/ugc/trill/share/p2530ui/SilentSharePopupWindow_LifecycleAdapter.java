package com.p683ss.android.ugc.trill.share.p2530ui;

import android.arch.lifecycle.C0167d;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0197q;

/* renamed from: com.ss.android.ugc.trill.share.ui.SilentSharePopupWindow_LifecycleAdapter */
public class SilentSharePopupWindow_LifecycleAdapter implements C0167d {

    /* renamed from: a */
    final SilentSharePopupWindow f126594a;

    SilentSharePopupWindow_LifecycleAdapter(SilentSharePopupWindow silentSharePopupWindow) {
        this.f126594a = silentSharePopupWindow;
    }

    /* renamed from: a */
    public final void mo313a(C0184k kVar, C0177a aVar, boolean z, C0197q qVar) {
        boolean z2;
        if (qVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && aVar == C0177a.ON_DESTROY) {
            if (!z2 || qVar.mo344a("onHostDestroy", 1)) {
                this.f126594a.onHostDestroy();
            }
        }
    }
}

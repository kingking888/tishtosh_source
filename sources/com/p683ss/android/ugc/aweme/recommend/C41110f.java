package com.p683ss.android.ugc.aweme.recommend;

import com.p683ss.android.ugc.aweme.user.repository.UserState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.recommend.f */
final /* synthetic */ class C41110f extends C52720t {

    /* renamed from: a */
    public static final C52771j f104476a = new C41110f();

    C41110f() {
    }

    public final String getName() {
        return "user";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(UserState.class);
    }

    public final String getSignature() {
        return "getUser()Lcom/ss/android/ugc/aweme/profile/model/User;";
    }

    public final Object get(Object obj) {
        return ((UserState) obj).getUser();
    }
}

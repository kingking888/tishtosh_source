package com.p683ss.android.ugc.aweme.following.p1770ui;

import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.following.ui.g */
final /* synthetic */ class C32192g extends C52720t {

    /* renamed from: a */
    public static final C52771j f83939a = new C32192g();

    C32192g() {
    }

    public final String getName() {
        return "recommendList";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(FollowerRelationState.class);
    }

    public final String getSignature() {
        return "getRecommendList()Ljava/util/List;";
    }

    public final Object get(Object obj) {
        return ((FollowerRelationState) obj).getRecommendList();
    }
}

package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.PostNotice */
public final class PostNotice {
    @C17952c(mo34828a = "aweme")
    private final Aweme aweme;

    public PostNotice() {
        this(null, 1, null);
    }

    public static /* synthetic */ PostNotice copy$default(PostNotice postNotice, Aweme aweme2, int i, Object obj) {
        if ((i & 1) != 0) {
            aweme2 = postNotice.aweme;
        }
        return postNotice.copy(aweme2);
    }

    public final Aweme component1() {
        return this.aweme;
    }

    public final PostNotice copy(Aweme aweme2) {
        return new PostNotice(aweme2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.aweme, (java.lang.Object) ((com.p683ss.android.ugc.aweme.notice.repo.list.bean.PostNotice) r2).aweme) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.notice.repo.list.bean.PostNotice
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.notice.repo.list.bean.PostNotice r2 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.PostNotice) r2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.aweme
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.aweme
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notice.repo.list.bean.PostNotice.equals(java.lang.Object):boolean");
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final int hashCode() {
        Aweme aweme2 = this.aweme;
        if (aweme2 != null) {
            return aweme2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostNotice(aweme=");
        sb.append(this.aweme);
        sb.append(")");
        return sb.toString();
    }

    public PostNotice(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public /* synthetic */ PostNotice(Aweme aweme2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            aweme2 = null;
        }
        this(aweme2);
    }
}

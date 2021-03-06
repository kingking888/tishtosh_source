package com.p683ss.android.ugc.aweme.user.repository;

import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11790ac;
import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.user.repository.UserState */
public final class UserState implements C11932s {
    private final C11787a<FollowStatus> followStatus;
    private final boolean followerIsRemoved;
    private final C11787a<String> remarkName;
    private final User user;

    public UserState() {
        this(null, false, null, null, 15, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.a, code=com.bytedance.jedi.arch.a<com.ss.android.ugc.aweme.profile.model.FollowStatus>, for r3v0, types: [com.bytedance.jedi.arch.a] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.a, code=com.bytedance.jedi.arch.a<java.lang.String>, for r4v0, types: [com.bytedance.jedi.arch.a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.user.repository.UserState copy$default(com.p683ss.android.ugc.aweme.user.repository.UserState r0, com.p683ss.android.ugc.aweme.profile.model.User r1, boolean r2, com.bytedance.jedi.arch.C11787a<com.p683ss.android.ugc.aweme.profile.model.FollowStatus> r3, com.bytedance.jedi.arch.C11787a<java.lang.String> r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.user
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            boolean r2 = r0.followerIsRemoved
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            com.bytedance.jedi.arch.a<com.ss.android.ugc.aweme.profile.model.FollowStatus> r3 = r0.followStatus
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            com.bytedance.jedi.arch.a<java.lang.String> r4 = r0.remarkName
        L_0x0018:
            com.ss.android.ugc.aweme.user.repository.UserState r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.user.repository.UserState.copy$default(com.ss.android.ugc.aweme.user.repository.UserState, com.ss.android.ugc.aweme.profile.model.User, boolean, com.bytedance.jedi.arch.a, com.bytedance.jedi.arch.a, int, java.lang.Object):com.ss.android.ugc.aweme.user.repository.UserState");
    }

    public final User component1() {
        return this.user;
    }

    public final boolean component2() {
        return this.followerIsRemoved;
    }

    public final C11787a<FollowStatus> component3() {
        return this.followStatus;
    }

    public final C11787a<String> component4() {
        return this.remarkName;
    }

    public final UserState copy(User user2, boolean z, C11787a<? extends FollowStatus> aVar, C11787a<String> aVar2) {
        C52711k.m112240b(user2, "user");
        C52711k.m112240b(aVar, "followStatus");
        C52711k.m112240b(aVar2, "remarkName");
        return new UserState(user2, z, aVar, aVar2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserState) {
                UserState userState = (UserState) obj;
                if (C52711k.m112239a((Object) this.user, (Object) userState.user)) {
                    if (!(this.followerIsRemoved == userState.followerIsRemoved) || !C52711k.m112239a((Object) this.followStatus, (Object) userState.followStatus) || !C52711k.m112239a((Object) this.remarkName, (Object) userState.remarkName)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C11787a<FollowStatus> getFollowStatus() {
        return this.followStatus;
    }

    public final boolean getFollowerIsRemoved() {
        return this.followerIsRemoved;
    }

    public final C11787a<String> getRemarkName() {
        return this.remarkName;
    }

    public final User getUser() {
        return this.user;
    }

    public final int hashCode() {
        User user2 = this.user;
        int i = 0;
        int hashCode = (user2 != null ? user2.hashCode() : 0) * 31;
        boolean z = this.followerIsRemoved;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        C11787a<FollowStatus> aVar = this.followStatus;
        int hashCode2 = (i2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C11787a<String> aVar2 = this.remarkName;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserState(user=");
        sb.append(this.user);
        sb.append(", followerIsRemoved=");
        sb.append(this.followerIsRemoved);
        sb.append(", followStatus=");
        sb.append(this.followStatus);
        sb.append(", remarkName=");
        sb.append(this.remarkName);
        sb.append(")");
        return sb.toString();
    }

    public UserState(User user2, boolean z, C11787a<? extends FollowStatus> aVar, C11787a<String> aVar2) {
        C52711k.m112240b(user2, "user");
        C52711k.m112240b(aVar, "followStatus");
        C52711k.m112240b(aVar2, "remarkName");
        this.user = user2;
        this.followerIsRemoved = z;
        this.followStatus = aVar;
        this.remarkName = aVar2;
    }

    public /* synthetic */ UserState(User user2, boolean z, C11787a aVar, C11787a aVar2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            user2 = new User();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            aVar = C11790ac.f31299a;
        }
        if ((i & 8) != 0) {
            aVar2 = C11790ac.f31299a;
        }
        this(user2, z, aVar, aVar2);
    }
}

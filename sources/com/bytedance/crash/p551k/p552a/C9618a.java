package com.bytedance.crash.p551k.p552a;

import android.content.Context;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p546f.C9584a;
import com.bytedance.crash.p546f.C9586c;
import com.bytedance.crash.p555n.C9685a;
import com.bytedance.crash.p555n.C9710q;

/* renamed from: com.bytedance.crash.k.a.a */
final class C9618a extends C9622c {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo17453a() {
        return true;
    }

    /* renamed from: a */
    public final C9584a mo17452a(C9584a aVar) {
        C9584a a = super.mo17452a(aVar);
        C9586c a2 = C9586c.m19047a(this.f26271b);
        C9586c.m19049a(a2);
        C9586c.m19052b(a2);
        a2.mo17410a(C9616k.m19147a().mo17446a());
        a2.mo17409a(C9616k.m19151c().mo17507a());
        a2.mo17408a(C9616k.m19147a().mo17451f());
        a.mo17387a(a2);
        a.mo17395a("process_name", (Object) C9685a.m19318c(this.f26271b));
        C9710q.m19416a(a, a2, this.f26270a);
        return a;
    }

    C9618a(Context context, C9619b bVar, C9624d dVar) {
        super(C9571d.ANR, context, bVar, dVar);
    }
}

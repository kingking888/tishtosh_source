package com.p683ss.android.ugc.aweme.effect.p1671b;

import com.p683ss.android.ugc.aweme.effectplatform.C29258l;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effect.b.b */
public final class C29139b implements C48705j {

    /* renamed from: a */
    public static final C29140a f76382a = new C29140a(null);

    /* renamed from: b */
    private long f76383b;

    /* renamed from: c */
    private final String f76384c;

    /* renamed from: d */
    private final C48705j f76385d;

    /* renamed from: com.ss.android.ugc.aweme.effect.b.b$a */
    public static final class C29140a {
        private C29140a() {
        }

        public /* synthetic */ C29140a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C48705j m68645a(String str, String str2, C48705j jVar) {
            C52711k.m112240b(str, "serviceName");
            C52711k.m112240b(jVar, "listener");
            return new C29139b(str, new C29258l(str2, jVar), null);
        }
    }

    /* renamed from: a */
    public final void mo8643a(Effect effect) {
        this.f76383b = System.currentTimeMillis();
        C48705j jVar = this.f76385d;
        if (jVar != null) {
            jVar.mo8643a(effect);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        if (r4 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r4 == null) goto L_0x005a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo8638a(java.lang.Object r10) {
        /*
            r9 = this;
            com.ss.android.ugc.effectmanager.effect.model.Effect r10 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r10
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r9.f76383b
            long r0 = r0 - r2
            com.ss.android.ugc.aweme.port.in.u r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.port.in.as r2 = r2.mo58567E()
            java.lang.String r3 = r9.f76384c
            com.ss.android.ugc.aweme.shortvideo.ay r4 = com.p683ss.android.ugc.aweme.shortvideo.C42437ay.m93202a()
            java.lang.String r5 = "url"
            com.ss.android.ugc.aweme.port.in.u r6 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.google.gson.f r6 = r6.mo58566D()
            r7 = 0
            if (r10 == 0) goto L_0x0029
            com.ss.android.ugc.effectmanager.common.model.UrlModel r8 = r10.getFileUrl()
            goto L_0x002a
        L_0x0029:
            r8 = r7
        L_0x002a:
            java.lang.String r6 = r6.mo34889b(r8)
            if (r6 != 0) goto L_0x0032
            java.lang.String r6 = ""
        L_0x0032:
            com.ss.android.ugc.aweme.shortvideo.ay r4 = r4.mo86521a(r5, r6)
            java.lang.String r5 = "duration"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.shortvideo.ay r0 = r4.mo86521a(r5, r0)
            java.lang.String r1 = "effect_id"
            if (r10 == 0) goto L_0x004a
            java.lang.String r4 = r10.getEffectId()
            if (r4 != 0) goto L_0x004c
        L_0x004a:
            java.lang.String r4 = ""
        L_0x004c:
            com.ss.android.ugc.aweme.shortvideo.ay r0 = r0.mo86521a(r1, r4)
            java.lang.String r1 = "effect_name"
            if (r10 == 0) goto L_0x005a
            java.lang.String r4 = r10.getName()
            if (r4 != 0) goto L_0x005c
        L_0x005a:
            java.lang.String r4 = ""
        L_0x005c:
            com.ss.android.ugc.aweme.shortvideo.ay r0 = r0.mo86521a(r1, r4)
            java.lang.String r1 = "effect_type"
            if (r10 == 0) goto L_0x006c
            int r4 = r10.getEffectType()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x006c:
            com.ss.android.ugc.aweme.shortvideo.ay r0 = r0.mo86519a(r1, r7)
            org.json.JSONObject r0 = r0.mo86522b()
            r1 = 0
            r2.mo49426a(r3, r1, r0)
            com.ss.android.ugc.effectmanager.effect.c.j r0 = r9.f76385d
            if (r0 == 0) goto L_0x0080
            r0.mo8638a(r10)
            return
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.effect.p1671b.C29139b.mo8638a(java.lang.Object):void");
    }

    private C29139b(String str, C48705j jVar) {
        this.f76384c = str;
        this.f76385d = jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r4 == null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r4 == null) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8644a(com.p683ss.android.ugc.effectmanager.effect.model.Effect r7, com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d r8) {
        /*
            r6 = this;
            java.lang.String r0 = "e"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            com.ss.android.ugc.aweme.port.in.u r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.port.in.as r0 = r0.mo58567E()
            java.lang.String r1 = r6.f76384c
            com.ss.android.ugc.aweme.shortvideo.ay r2 = com.p683ss.android.ugc.aweme.shortvideo.C42437ay.m93202a()
            java.lang.String r3 = "effect_id"
            if (r7 == 0) goto L_0x001d
            java.lang.String r4 = r7.getEffectId()
            if (r4 != 0) goto L_0x001f
        L_0x001d:
            java.lang.String r4 = ""
        L_0x001f:
            com.ss.android.ugc.aweme.shortvideo.ay r2 = r2.mo86521a(r3, r4)
            java.lang.String r3 = "effect_name"
            if (r7 == 0) goto L_0x002d
            java.lang.String r4 = r7.getName()
            if (r4 != 0) goto L_0x002f
        L_0x002d:
            java.lang.String r4 = ""
        L_0x002f:
            com.ss.android.ugc.aweme.shortvideo.ay r2 = r2.mo86521a(r3, r4)
            java.lang.String r3 = "effect_type"
            if (r7 == 0) goto L_0x0040
            int r4 = r7.getEffectType()
        L_0x003b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0042
        L_0x0040:
            r4 = -1
            goto L_0x003b
        L_0x0042:
            com.ss.android.ugc.aweme.shortvideo.ay r2 = r2.mo86519a(r3, r4)
            java.lang.String r3 = "url"
            com.ss.android.ugc.aweme.port.in.u r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.google.gson.f r4 = r4.mo58566D()
            if (r7 == 0) goto L_0x0057
            com.ss.android.ugc.effectmanager.common.model.UrlModel r5 = r7.getFileUrl()
            goto L_0x0058
        L_0x0057:
            r5 = 0
        L_0x0058:
            java.lang.String r4 = r4.mo34889b(r5)
            if (r4 != 0) goto L_0x0060
            java.lang.String r4 = ""
        L_0x0060:
            com.ss.android.ugc.aweme.shortvideo.ay r2 = r2.mo86521a(r3, r4)
            java.lang.String r3 = "exception"
            java.lang.Exception r4 = r8.f122281c
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.String r4 = android.util.Log.getStackTraceString(r4)
            com.ss.android.ugc.aweme.shortvideo.ay r2 = r2.mo86521a(r3, r4)
            java.lang.String r3 = "errorCode"
            int r4 = r8.f122279a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.ss.android.ugc.aweme.shortvideo.ay r2 = r2.mo86519a(r3, r4)
            java.lang.String r3 = "errorMsg"
            java.lang.String r4 = r8.f122280b
            com.ss.android.ugc.aweme.shortvideo.ay r2 = r2.mo86521a(r3, r4)
            org.json.JSONObject r2 = r2.mo86522b()
            r3 = 1
            r0.mo49426a(r1, r3, r2)
            com.ss.android.ugc.effectmanager.effect.c.j r0 = r6.f76385d
            if (r0 == 0) goto L_0x0096
            r0.mo8644a(r7, r8)
            return
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.effect.p1671b.C29139b.mo8644a(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.common.g.d):void");
    }

    public /* synthetic */ C29139b(String str, C48705j jVar, C52707g gVar) {
        this(str, jVar);
    }
}

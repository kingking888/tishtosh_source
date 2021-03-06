package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.crossplatform.C27198d;
import com.p683ss.android.ugc.aweme.p1706fe.utils.C29972c;
import java.util.Map.Entry;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.BulletGetAppInfoMethod */
public final class BulletGetAppInfoMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24180a f64153b = new C24180a(null);

    /* renamed from: c */
    private final String f64154c = "uniAppInfo";

    /* renamed from: d */
    private C10269a f64155d = C10269a.PUBLIC;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.BulletGetAppInfoMethod$a */
    public static final class C24180a {
        private C24180a() {
        }

        public /* synthetic */ C24180a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64155d;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64154c;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64155d = aVar;
    }

    public BulletGetAppInfoMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        JSONObject jSONObject2 = new JSONObject();
        for (Entry entry : C29972c.m70117a((C10757a) this.f27647a.mo18401c(C10757a.class)).entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        jSONObject2.put("app_skin", C27198d.m65619b());
        aVar.mo49911a((Object) jSONObject2);
    }
}

package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.feed.model.Anchor;
import com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.m */
public final class C23669m extends C23649b {

    /* renamed from: a */
    public final Activity f63102a;

    /* renamed from: b */
    public final String f63103b;

    /* renamed from: s */
    private JSONObject f63104s;

    /* renamed from: b */
    public final void mo49077b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 == null) goto L_0x000c;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m58069f() {
        /*
            r2 = this;
            org.json.JSONObject r0 = r2.f63104s
            if (r0 == 0) goto L_0x000c
            java.lang.String r1 = "request_id"
            java.lang.String r0 = r0.optString(r1)
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            java.lang.String r0 = ""
        L_0x000e:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r1 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r1.<init>()
            r1.setImprId(r0)
            com.ss.android.ugc.aweme.feed.aa r0 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r0 = r0.mo60160a(r1)
            java.lang.String r1 = "LogPbManager.getInstance().formatLogPb(logPb)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23669m.m58069f():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        if (r3 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r3 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r3 == null) goto L_0x0036;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49074a() {
        /*
            r4 = this;
            java.lang.String r0 = "anchor_entrance_show"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r4.f63103b
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "log_pb"
            java.lang.String r3 = r4.m58069f()
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r4.f63071q
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = r3.getAid()
            if (r3 != 0) goto L_0x0026
        L_0x0024:
            java.lang.String r3 = ""
        L_0x0026:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r4.f63071q
            if (r3 == 0) goto L_0x0036
            java.lang.String r3 = r3.getAuthorUid()
            if (r3 != 0) goto L_0x0038
        L_0x0036:
            java.lang.String r3 = ""
        L_0x0038:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "anchor_type"
            java.lang.String r3 = "entertainment"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "entertainment_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r4.f63071q
            if (r3 == 0) goto L_0x0056
            com.ss.android.ugc.aweme.feed.model.Anchor r3 = r3.getAnchor()
            if (r3 == 0) goto L_0x0056
            java.lang.String r3 = r3.getAnchorId()
            if (r3 != 0) goto L_0x0058
        L_0x0056:
            java.lang.String r3 = ""
        L_0x0058:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23669m.mo49074a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r2 == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r2 == null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        if (r2 == null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        if (r2 == null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        if (r2 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ef, code lost:
        if (r2 == null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1 == null) goto L_0x0019;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49075a(android.view.View r4) {
        /*
            r3 = this;
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r0 = "movie_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.f63071q
            if (r1 == 0) goto L_0x0019
            com.ss.android.ugc.aweme.feed.model.Anchor r1 = r1.getAnchor()
            if (r1 == 0) goto L_0x0019
            java.lang.String r1 = r1.getAnchorId()
            if (r1 != 0) goto L_0x001b
        L_0x0019:
            java.lang.String r1 = ""
        L_0x001b:
            r4.put(r0, r1)
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = r3.f63103b
            if (r1 != 0) goto L_0x0026
            java.lang.String r1 = ""
        L_0x0026:
            r4.put(r0, r1)
            java.lang.String r0 = com.p683ss.android.ugc.aweme.shortvideo.util.C45379ae.m98928a()
            java.lang.String r4 = com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b.m82840a(r0, r4)
            if (r4 == 0) goto L_0x003a
            com.ss.android.ugc.aweme.router.w r0 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            r0.mo83861a(r4)
        L_0x003a:
            java.lang.String r4 = "enter_entertainment_detail"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r3.f63103b
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "log_pb"
            java.lang.String r2 = r3.m58069f()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            if (r2 == 0) goto L_0x005e
            java.lang.String r2 = r2.getAid()
            if (r2 != 0) goto L_0x0060
        L_0x005e:
            java.lang.String r2 = ""
        L_0x0060:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            if (r2 == 0) goto L_0x0070
            java.lang.String r2 = r2.getAuthorUid()
            if (r2 != 0) goto L_0x0072
        L_0x0070:
            java.lang.String r2 = ""
        L_0x0072:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "anchor_type"
            java.lang.String r2 = "entertainment"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "entertainment_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            if (r2 == 0) goto L_0x0090
            com.ss.android.ugc.aweme.feed.model.Anchor r2 = r2.getAnchor()
            if (r2 == 0) goto L_0x0090
            java.lang.String r2 = r2.getAnchorId()
            if (r2 != 0) goto L_0x0092
        L_0x0090:
            java.lang.String r2 = ""
        L_0x0092:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
            java.lang.String r4 = "anchor_entrance_click"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r3.f63103b
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "log_pb"
            java.lang.String r2 = r3.m58069f()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            if (r2 == 0) goto L_0x00bf
            java.lang.String r2 = r2.getAid()
            if (r2 != 0) goto L_0x00c1
        L_0x00bf:
            java.lang.String r2 = ""
        L_0x00c1:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            if (r2 == 0) goto L_0x00d1
            java.lang.String r2 = r2.getAuthorUid()
            if (r2 != 0) goto L_0x00d3
        L_0x00d1:
            java.lang.String r2 = ""
        L_0x00d3:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "anchor_type"
            java.lang.String r2 = "entertainment"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "entertainment_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            if (r2 == 0) goto L_0x00f1
            com.ss.android.ugc.aweme.feed.model.Anchor r2 = r2.getAnchor()
            if (r2 == 0) goto L_0x00f1
            java.lang.String r2 = r2.getAnchorId()
            if (r2 != 0) goto L_0x00f3
        L_0x00f1:
            java.lang.String r2 = ""
        L_0x00f3:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23669m.mo49075a(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo49076a(Aweme aweme, JSONObject jSONObject) {
        String str;
        super.mo49076a(aweme, jSONObject);
        this.f63104s = jSONObject;
        this.f63057c.setImageResource(R.drawable.der);
        this.f63062h.setVisibility(0);
        this.f63061g.setVisibility(0);
        DmtTextView dmtTextView = this.f63062h;
        Context context = this.f63101t.getContext();
        C52711k.m112236a((Object) context, "parent.context");
        dmtTextView.setTextColor(context.getResources().getColor(R.color.iu));
        this.f63062h.setTextSize(13.0f);
        DmtTextView dmtTextView2 = this.f63062h;
        if (aweme != null) {
            Anchor anchor = aweme.getAnchor();
            if (anchor != null) {
                AnchorCommonStruct anchorInfo = anchor.getAnchorInfo();
                if (anchorInfo != null) {
                    str = anchorInfo.getKeyword();
                    dmtTextView2.setText(str);
                    DmtTextView dmtTextView3 = this.f63058d;
                    Context context2 = this.f63101t.getContext();
                    C52711k.m112236a((Object) context2, "parent.context");
                    dmtTextView3.setText(context2.getResources().getString(R.string.hm0));
                }
            }
        }
        str = null;
        dmtTextView2.setText(str);
        DmtTextView dmtTextView32 = this.f63058d;
        Context context22 = this.f63101t.getContext();
        C52711k.m112236a((Object) context22, "parent.context");
        dmtTextView32.setText(context22.getResources().getString(R.string.hm0));
    }

    public C23669m(ViewGroup viewGroup, Activity activity, String str) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(str, "eventType");
        super(viewGroup);
        this.f63102a = activity;
        this.f63103b = str;
    }
}

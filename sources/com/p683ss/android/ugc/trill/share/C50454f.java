package com.p683ss.android.ugc.trill.share;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.share.f */
final /* synthetic */ class C50454f implements OnClickListener {

    /* renamed from: a */
    private final SyncShareView f126510a;

    C50454f(SyncShareView syncShareView) {
        this.f126510a = syncShareView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        SyncShareView syncShareView = this.f126510a;
        if (((Boolean) SharePrefCache.inst().getIsAwemePrivate().mo47782d()).booleanValue()) {
            C10691a.m21551c(syncShareView.getContext(), syncShareView.getContext().getString(R.string.cxx)).mo19066a();
        } else {
            syncShareView.mo98319a(syncShareView.mRadioGroup.getCheckedRadioButtonId() == R.id.o3, "ins_story");
        }
    }
}

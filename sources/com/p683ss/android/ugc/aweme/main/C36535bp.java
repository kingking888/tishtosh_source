package com.p683ss.android.ugc.aweme.main;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.experiment.SpecialTopicEntry;

/* renamed from: com.ss.android.ugc.aweme.main.bp */
final /* synthetic */ class C36535bp implements OnClickListener {

    /* renamed from: a */
    private final MainFragment f93612a;

    /* renamed from: b */
    private final SpecialTopicEntry f93613b;

    C36535bp(MainFragment mainFragment, SpecialTopicEntry specialTopicEntry) {
        this.f93612a = mainFragment;
        this.f93613b = specialTopicEntry;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        MainFragment mainFragment = this.f93612a;
        SpecialTopicEntry specialTopicEntry = this.f93613b;
        SmartRouter.buildRoute(mainFragment.getContext(), specialTopicEntry.getLandingRoute()).open();
        C26890h.m65011a("topic_entrance_click", C23089d.m56640a().mo47829a("enter_from", (mainFragment.mViewPager == null || mainFragment.mViewPager.getCurrentItemCompat() != 0) ? "homepage_hot" : "homepage_follow").mo47829a("type", specialTopicEntry.getEventName()).mo47829a("url", specialTopicEntry.getLandingRoute()).f61491a);
    }
}

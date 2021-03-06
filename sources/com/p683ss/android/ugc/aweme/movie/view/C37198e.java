package com.p683ss.android.ugc.aweme.movie.view;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.adapter.C24540e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p683ss.android.ugc.aweme.movie.presenter.MovieDetailShowLikeNum;

/* renamed from: com.ss.android.ugc.aweme.movie.view.e */
public final class C37198e extends C24540e {
    public C37198e(View view, String str, C24579d dVar) {
        super(view, str, dVar);
    }

    /* renamed from: b */
    public final void mo50306b(Aweme aweme, int i, boolean z) {
        super.mo50306b(aweme, i, z);
        if (C10181b.m20511a().mo18168a(MovieDetailShowLikeNum.class, true, "movie_show_like_num", 31744, 0) == 1) {
            mo50305a(aweme);
        }
        if (aweme.isPgcShow()) {
            if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                this.f64973d.setVisibility(0);
                this.f64972c.setVisibility(8);
                m59955a(this.f64973d, (AwemeTextLabelModel) aweme.getTextTopLabels().get(0));
            }
        } else if (aweme.getOriginAuthor() != null) {
            this.f64974e.setVisibility(0);
            if (!TextUtils.isEmpty(aweme.getLabelOriginAuthorText())) {
                this.f64974e.setText(aweme.getLabelOriginAuthorText());
            }
            this.f64972c.setVisibility(4);
        } else if (aweme.getMusicStarter() == null && aweme.getOriginAuthor() == null && TextUtils.equals(this.f64971b, "challenge") && aweme.getIsTop() == 1) {
            if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                this.f64973d.setVisibility(8);
                this.f64972c.setVisibility(0);
                C23515d.m57670a(this.f64972c, aweme.getLabelTop(), (int) C9432q.m18687b(this.f64970a, 6.0f), (int) C9432q.m18687b(this.f64970a, 6.0f));
            } else {
                this.f64973d.setVisibility(0);
                this.f64972c.setVisibility(8);
                m59955a(this.f64973d, (AwemeTextLabelModel) aweme.getTextTopLabels().get(0));
            }
        }
    }
}

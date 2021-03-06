package com.bytedance.ies.uikit.recyclerview;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

public abstract class RecyclerViewWithFooterAdapter extends C1322a {
    protected boolean mShowFooter = true;

    public abstract int getBasicItemCount();

    public int getBasicItemViewType(int i) {
        return 0;
    }

    public abstract void onBindBasicViewHolder(C1352v vVar, int i);

    public abstract void onBindFooterViewHolder(C1352v vVar);

    public abstract C1352v onCreateBasicViewHolder(ViewGroup viewGroup, int i);

    public abstract C1352v onCreateFooterViewHolder(ViewGroup viewGroup);

    public int getItemCount() {
        if (this.mShowFooter) {
            return getBasicItemCount() + 1;
        }
        return getBasicItemCount();
    }

    public void setShowFooter(boolean z) {
        this.mShowFooter = z;
    }

    public final int getItemViewType(int i) {
        if (!this.mShowFooter || i != getBasicItemCount()) {
            return getBasicItemViewType(i);
        }
        return DynamicTabYellowPointVersion.DEFAULT;
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            onBindFooterViewHolder(vVar);
        } else {
            onBindBasicViewHolder(vVar, i);
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (Integer.MIN_VALUE == i) {
            return onCreateFooterViewHolder(viewGroup);
        }
        return onCreateBasicViewHolder(viewGroup, i);
    }
}

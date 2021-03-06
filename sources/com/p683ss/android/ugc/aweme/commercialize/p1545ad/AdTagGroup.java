package com.p683ss.android.ugc.aweme.commercialize.p1545ad;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.ad.AdTagGroup */
public final class AdTagGroup extends ViewGroup {

    /* renamed from: a */
    private final int f67743a;

    public AdTagGroup(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdTagGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setTagList(String[] strArr) {
        C52711k.m112240b(strArr, "list");
        removeAllViews();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new LayoutParams(-2, -2));
            frameLayout.setPadding(C23728o.m58241a(4.0d), C23728o.m58241a(2.0d), C23728o.m58241a(4.0d), C23728o.m58241a(2.0d));
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            frameLayout.setBackground(context.getResources().getDrawable(R.drawable.cvg));
            TextView textView = new TextView(getContext());
            textView.setText(strArr[i]);
            textView.setLines(1);
            textView.setTextColor(Color.parseColor("#57ffffff"));
            textView.setTextSize(12.0f);
            frameLayout.addView(textView);
            addView(frameLayout);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        measureChildren(i, i2);
        int mode = MeasureSpec.getMode(i);
        int i5 = 0;
        if (mode == Integer.MIN_VALUE) {
            int size = MeasureSpec.getSize(i);
            int childCount = getChildCount();
            int i6 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (i7 != 0) {
                    C52711k.m112236a((Object) childAt, "view");
                    if (childAt.getMeasuredWidth() + i6 + this.f67743a >= size) {
                        break;
                    }
                    childAt.layout(this.f67743a + i6, 0, childAt.getMeasuredWidth() + i6 + this.f67743a, childAt.getMeasuredHeight());
                    i6 += this.f67743a;
                    i4 = childAt.getMeasuredWidth();
                } else {
                    C52711k.m112236a((Object) childAt, "view");
                    if (childAt.getMeasuredWidth() >= size) {
                        break;
                    }
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                    i4 = childAt.getMeasuredWidth();
                }
                i6 += i4;
            }
            i3 = i6;
        } else if (mode == 0) {
            i3 = MeasureSpec.getSize(i);
        } else if (mode != 1073741824) {
            i3 = 0;
        } else {
            i3 = MeasureSpec.getSize(i);
        }
        int mode2 = MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            int childCount2 = getChildCount();
            int i8 = 0;
            for (int i9 = 0; i9 < childCount2; i9++) {
                View childAt2 = getChildAt(0);
                C52711k.m112236a((Object) childAt2, "getChildAt(0)");
                i8 = Math.max(i8, childAt2.getMeasuredHeight());
            }
            i5 = i8;
        } else if (mode2 == 0) {
            i5 = MeasureSpec.getSize(i2);
        } else if (mode2 == 1073741824) {
            i5 = MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(i3, i5);
    }

    public AdTagGroup(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f67743a = C23728o.m58241a(4.0d);
    }

    public /* synthetic */ AdTagGroup(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= childCount) {
                i5 = getChildCount() - 1;
                break;
            }
            View childAt = getChildAt(i5);
            if (i5 != 0) {
                C52711k.m112236a((Object) childAt, "view");
                if (childAt.getMeasuredWidth() + i6 + this.f67743a >= i3) {
                    break;
                }
                childAt.layout(this.f67743a + i6, 0, childAt.getMeasuredWidth() + i6 + this.f67743a, childAt.getMeasuredHeight());
                i6 += this.f67743a;
            } else {
                C52711k.m112236a((Object) childAt, "view");
                if (childAt.getMeasuredWidth() >= i3) {
                    break;
                }
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
            i6 += childAt.getMeasuredWidth();
            i5++;
        }
        removeViewsInLayout(i5 + 1, (getChildCount() - i5) - 1);
    }
}

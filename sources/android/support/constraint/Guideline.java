package android.support.constraint;

import android.content.Context;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.util.AttributeSet;
import android.view.View;

public class Guideline extends View {
    public void draw(Canvas canvas) {
    }

    public void setVisibility(int i) {
    }

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void setGuidelineBegin(int i) {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        layoutParams.f844a = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        layoutParams.f858b = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        layoutParams.f859c = f;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}

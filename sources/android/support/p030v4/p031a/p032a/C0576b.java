package android.support.p030v4.p031a.p032a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.support.p030v4.view.C1019b;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.a.a.b */
public interface C0576b extends MenuItem {
    /* renamed from: a */
    C0576b mo1776a(C1019b bVar);

    /* renamed from: a */
    C0576b mo1777a(CharSequence charSequence);

    /* renamed from: a */
    C1019b mo1778a();

    /* renamed from: b */
    C0576b mo1779b(CharSequence charSequence);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}

package com.p683ss.android.ugc.aweme.tools.beauty;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra */
public final class BeautyCategoryExtra {
    @C17952c(mo34828a = "ab_group")
    private final String abGroup;
    @C17952c(mo34828a = "default")

    /* renamed from: default reason: not valid java name */
    private final boolean f133591default;
    @C17952c(mo34828a = "exclusive")
    private final boolean exclusive;
    @C17952c(mo34828a = "gender")
    private final String gender;
    @C17952c(mo34828a = "region_1")
    private final boolean regionD;
    @C17952c(mo34828a = "region_3")
    private final boolean regionM;
    @C17952c(mo34828a = "region_2")
    private final boolean regionT;

    public BeautyCategoryExtra() {
        this(null, false, false, false, false, null, false, 127, null);
    }

    public static /* synthetic */ BeautyCategoryExtra copy$default(BeautyCategoryExtra beautyCategoryExtra, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beautyCategoryExtra.abGroup;
        }
        if ((i & 2) != 0) {
            z = beautyCategoryExtra.regionD;
        }
        boolean z6 = z;
        if ((i & 4) != 0) {
            z2 = beautyCategoryExtra.regionT;
        }
        boolean z7 = z2;
        if ((i & 8) != 0) {
            z3 = beautyCategoryExtra.regionM;
        }
        boolean z8 = z3;
        if ((i & 16) != 0) {
            z4 = beautyCategoryExtra.f133591default;
        }
        boolean z9 = z4;
        if ((i & 32) != 0) {
            str2 = beautyCategoryExtra.gender;
        }
        String str3 = str2;
        if ((i & 64) != 0) {
            z5 = beautyCategoryExtra.exclusive;
        }
        return beautyCategoryExtra.copy(str, z6, z7, z8, z9, str3, z5);
    }

    public final String component1() {
        return this.abGroup;
    }

    public final boolean component2() {
        return this.regionD;
    }

    public final boolean component3() {
        return this.regionT;
    }

    public final boolean component4() {
        return this.regionM;
    }

    public final boolean component5() {
        return this.f133591default;
    }

    public final String component6() {
        return this.gender;
    }

    public final boolean component7() {
        return this.exclusive;
    }

    public final BeautyCategoryExtra copy(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5) {
        String str3 = str;
        C52711k.m112240b(str, "abGroup");
        String str4 = str2;
        C52711k.m112240b(str2, "gender");
        BeautyCategoryExtra beautyCategoryExtra = new BeautyCategoryExtra(str3, z, z2, z3, z4, str4, z5);
        return beautyCategoryExtra;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BeautyCategoryExtra) {
                BeautyCategoryExtra beautyCategoryExtra = (BeautyCategoryExtra) obj;
                if (C52711k.m112239a((Object) this.abGroup, (Object) beautyCategoryExtra.abGroup)) {
                    if (this.regionD == beautyCategoryExtra.regionD) {
                        if (this.regionT == beautyCategoryExtra.regionT) {
                            if (this.regionM == beautyCategoryExtra.regionM) {
                                if ((this.f133591default == beautyCategoryExtra.f133591default) && C52711k.m112239a((Object) this.gender, (Object) beautyCategoryExtra.gender)) {
                                    if (this.exclusive == beautyCategoryExtra.exclusive) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getAbGroup() {
        return this.abGroup;
    }

    public final boolean getDefault() {
        return this.f133591default;
    }

    public final boolean getExclusive() {
        return this.exclusive;
    }

    public final String getGender() {
        return this.gender;
    }

    public final boolean getRegionD() {
        return this.regionD;
    }

    public final boolean getRegionM() {
        return this.regionM;
    }

    public final boolean getRegionT() {
        return this.regionT;
    }

    public final int hashCode() {
        String str = this.abGroup;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.regionD;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z2 = this.regionT;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.regionM;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f133591default;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        String str2 = this.gender;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i6 = (i5 + i) * 31;
        boolean z5 = this.exclusive;
        if (z5) {
            z5 = true;
        }
        return i6 + (z5 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BeautyCategoryExtra(abGroup=");
        sb.append(this.abGroup);
        sb.append(", regionD=");
        sb.append(this.regionD);
        sb.append(", regionT=");
        sb.append(this.regionT);
        sb.append(", regionM=");
        sb.append(this.regionM);
        sb.append(", default=");
        sb.append(this.f133591default);
        sb.append(", gender=");
        sb.append(this.gender);
        sb.append(", exclusive=");
        sb.append(this.exclusive);
        sb.append(")");
        return sb.toString();
    }

    public BeautyCategoryExtra(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5) {
        C52711k.m112240b(str, "abGroup");
        C52711k.m112240b(str2, "gender");
        this.abGroup = str;
        this.regionD = z;
        this.regionT = z2;
        this.regionM = z3;
        this.f133591default = z4;
        this.gender = str2;
        this.exclusive = z5;
    }

    public /* synthetic */ BeautyCategoryExtra(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, int i, C52707g gVar) {
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        if ((i & 1) != 0) {
            str = "1";
        }
        boolean z10 = false;
        if ((i & 2) != 0) {
            z6 = false;
        } else {
            z6 = z;
        }
        if ((i & 4) != 0) {
            z7 = false;
        } else {
            z7 = z2;
        }
        if ((i & 8) != 0) {
            z8 = false;
        } else {
            z8 = z3;
        }
        if ((i & 16) != 0) {
            z9 = false;
        } else {
            z9 = z4;
        }
        if ((i & 32) != 0) {
            str2 = C46814a.MALE.getFlag();
        }
        String str3 = str2;
        if ((i & 64) == 0) {
            z10 = z5;
        }
        this(str, z6, z7, z8, z9, str3, z10);
    }
}

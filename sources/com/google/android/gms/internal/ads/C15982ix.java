package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.internal.ads.ix */
public final class C15982ix implements Creator<zzaki> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaki[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    str = C15467a.m32163n(parcel, a);
                    break;
                case 2:
                    z = C15467a.m32152c(parcel, a);
                    break;
                case 3:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 4:
                    str2 = C15467a.m32163n(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzaki(str, z, i, str2);
    }
}

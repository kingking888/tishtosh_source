package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bod implements Creator<zznd> {
    bod() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zznd[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zznd(parcel);
    }
}

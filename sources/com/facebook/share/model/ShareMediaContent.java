package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

public final class ShareMediaContent extends ShareContent<ShareMediaContent, Object> {
    public static final Creator<ShareMediaContent> CREATOR = new Creator<ShareMediaContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareMediaContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareMediaContent(parcel);
        }
    };

    /* renamed from: a */
    public final List<ShareMedia> f37972a;

    public final int describeContents() {
        return 0;
    }

    ShareMediaContent(Parcel parcel) {
        super(parcel);
        this.f37972a = Arrays.asList((ShareMedia[]) parcel.readParcelableArray(ShareMedia.class.getClassLoader()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((ShareMedia[]) this.f37972a.toArray(), i);
    }
}

package com.p683ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.socialbase.downloader.depend.f */
public interface C19837f extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.f$a */
    public static abstract class C19838a extends Binder implements C19837f {

        /* renamed from: com.ss.android.socialbase.downloader.depend.f$a$a */
        public static class C19839a implements C19837f {

            /* renamed from: a */
            private IBinder f54563a;

            public final IBinder asBinder() {
                return this.f54563a;
            }

            /* renamed from: a */
            public final boolean mo41331a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                    boolean z = false;
                    this.f54563a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C19839a(IBinder iBinder) {
                this.f54563a = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C19838a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                boolean a = mo41331a();
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                return true;
            }
        }
    }

    /* renamed from: a */
    boolean mo41331a() throws RemoteException;
}

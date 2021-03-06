package com.p683ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.downloader.depend.g */
public interface C19840g extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.g$a */
    public static abstract class C19841a extends Binder implements C19840g {

        /* renamed from: com.ss.android.socialbase.downloader.depend.g$a$a */
        static class C19842a implements C19840g {

            /* renamed from: a */
            private IBinder f54564a;

            public final IBinder asBinder() {
                return this.f54564a;
            }

            /* renamed from: a */
            public final int mo41335a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    this.f54564a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C19842a(IBinder iBinder) {
                this.f54564a = iBinder;
            }

            /* renamed from: b */
            public final void mo41338b(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54564a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo41340c(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54564a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo41342d(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54564a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo41343e(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54564a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo41344f(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54564a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final void mo41345g(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54564a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final void mo41346h(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54564a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41336a(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54564a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo41339b(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (baseException != null) {
                        obtain.writeInt(1);
                        baseException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54564a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo41341c(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (baseException != null) {
                        obtain.writeInt(1);
                        baseException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54564a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41337a(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (baseException != null) {
                        obtain.writeInt(1);
                        baseException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54564a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C19841a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
        }

        /* renamed from: a */
        public static C19840g m48517a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C19840g)) {
                return new C19842a(iBinder);
            }
            return (C19840g) queryLocalInterface;
        }

        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v4, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v5, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v7, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v8, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v10, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v11, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v13, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v14, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v16, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v17, types: [com.ss.android.socialbase.downloader.exception.BaseException] */
        /* JADX WARNING: type inference failed for: r0v19, types: [com.ss.android.socialbase.downloader.exception.BaseException] */
        /* JADX WARNING: type inference failed for: r0v20, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v22, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v23, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v25, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v26, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v28, types: [com.ss.android.socialbase.downloader.model.DownloadInfo] */
        /* JADX WARNING: type inference failed for: r0v29, types: [com.ss.android.socialbase.downloader.exception.BaseException] */
        /* JADX WARNING: type inference failed for: r0v31, types: [com.ss.android.socialbase.downloader.exception.BaseException] */
        /* JADX WARNING: type inference failed for: r0v32, types: [com.ss.android.socialbase.downloader.exception.BaseException] */
        /* JADX WARNING: type inference failed for: r0v34, types: [com.ss.android.socialbase.downloader.exception.BaseException] */
        /* JADX WARNING: type inference failed for: r0v35 */
        /* JADX WARNING: type inference failed for: r0v36 */
        /* JADX WARNING: type inference failed for: r0v37 */
        /* JADX WARNING: type inference failed for: r0v38 */
        /* JADX WARNING: type inference failed for: r0v39 */
        /* JADX WARNING: type inference failed for: r0v40 */
        /* JADX WARNING: type inference failed for: r0v41 */
        /* JADX WARNING: type inference failed for: r0v42 */
        /* JADX WARNING: type inference failed for: r0v43 */
        /* JADX WARNING: type inference failed for: r0v44 */
        /* JADX WARNING: type inference failed for: r0v45 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.exception.BaseException]
          uses: [com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.exception.BaseException]
          mth insns count: 164
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 12 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
            /*
                r2 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r3 == r0) goto L_0x0178
                r0 = 0
                switch(r3) {
                    case 1: goto L_0x0168;
                    case 2: goto L_0x014d;
                    case 3: goto L_0x0132;
                    case 4: goto L_0x0117;
                    case 5: goto L_0x00fc;
                    case 6: goto L_0x00e1;
                    case 7: goto L_0x00b6;
                    case 8: goto L_0x009b;
                    case 9: goto L_0x0080;
                    case 10: goto L_0x0065;
                    case 11: goto L_0x003a;
                    case 12: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r3 = super.onTransact(r3, r4, r5, r6)
                return r3
            L_0x000f:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x0023
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.p683ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                com.ss.android.socialbase.downloader.model.DownloadInfo r3 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r3
                goto L_0x0024
            L_0x0023:
                r3 = r0
            L_0x0024:
                int r6 = r4.readInt()
                if (r6 == 0) goto L_0x0033
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.exception.BaseException> r6 = com.p683ss.android.socialbase.downloader.exception.BaseException.CREATOR
                java.lang.Object r4 = r6.createFromParcel(r4)
                r0 = r4
                com.ss.android.socialbase.downloader.exception.BaseException r0 = (com.p683ss.android.socialbase.downloader.exception.BaseException) r0
            L_0x0033:
                r2.mo41341c(r3, r0)
                r5.writeNoException()
                return r1
            L_0x003a:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x004e
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.p683ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                com.ss.android.socialbase.downloader.model.DownloadInfo r3 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r3
                goto L_0x004f
            L_0x004e:
                r3 = r0
            L_0x004f:
                int r6 = r4.readInt()
                if (r6 == 0) goto L_0x005e
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.exception.BaseException> r6 = com.p683ss.android.socialbase.downloader.exception.BaseException.CREATOR
                java.lang.Object r4 = r6.createFromParcel(r4)
                r0 = r4
                com.ss.android.socialbase.downloader.exception.BaseException r0 = (com.p683ss.android.socialbase.downloader.exception.BaseException) r0
            L_0x005e:
                r2.mo41339b(r3, r0)
                r5.writeNoException()
                return r1
            L_0x0065:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x0079
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.p683ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                r0 = r3
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x0079:
                r2.mo41346h(r0)
                r5.writeNoException()
                return r1
            L_0x0080:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x0094
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.p683ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                r0 = r3
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x0094:
                r2.mo41345g(r0)
                r5.writeNoException()
                return r1
            L_0x009b:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x00af
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.p683ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                r0 = r3
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x00af:
                r2.mo41344f(r0)
                r5.writeNoException()
                return r1
            L_0x00b6:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x00ca
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.p683ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                com.ss.android.socialbase.downloader.model.DownloadInfo r3 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r3
                goto L_0x00cb
            L_0x00ca:
                r3 = r0
            L_0x00cb:
                int r6 = r4.readInt()
                if (r6 == 0) goto L_0x00da
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.exception.BaseException> r6 = com.p683ss.android.socialbase.downloader.exception.BaseException.CREATOR
                java.lang.Object r4 = r6.createFromParcel(r4)
                r0 = r4
                com.ss.android.socialbase.downloader.exception.BaseException r0 = (com.p683ss.android.socialbase.downloader.exception.BaseException) r0
            L_0x00da:
                r2.mo41337a(r3, r0)
                r5.writeNoException()
                return r1
            L_0x00e1:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x00f5
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.p683ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                r0 = r3
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x00f5:
                r2.mo41343e(r0)
                r5.writeNoException()
                return r1
            L_0x00fc:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x0110
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.p683ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                r0 = r3
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x0110:
                r2.mo41342d(r0)
                r5.writeNoException()
                return r1
            L_0x0117:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x012b
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.p683ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                r0 = r3
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x012b:
                r2.mo41340c(r0)
                r5.writeNoException()
                return r1
            L_0x0132:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x0146
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.p683ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                r0 = r3
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x0146:
                r2.mo41338b(r0)
                r5.writeNoException()
                return r1
            L_0x014d:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r4.readInt()
                if (r3 == 0) goto L_0x0161
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.model.DownloadInfo> r3 = com.p683ss.android.socialbase.downloader.model.DownloadInfo.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r4)
                r0 = r3
                com.ss.android.socialbase.downloader.model.DownloadInfo r0 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r0
            L_0x0161:
                r2.mo41336a(r0)
                r5.writeNoException()
                return r1
            L_0x0168:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r4.enforceInterface(r3)
                int r3 = r2.mo41335a()
                r5.writeNoException()
                r5.writeInt(r3)
                return r1
            L_0x0178:
                java.lang.String r3 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r5.writeString(r3)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.depend.C19840g.C19841a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    int mo41335a() throws RemoteException;

    /* renamed from: a */
    void mo41336a(DownloadInfo downloadInfo) throws RemoteException;

    /* renamed from: a */
    void mo41337a(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException;

    /* renamed from: b */
    void mo41338b(DownloadInfo downloadInfo) throws RemoteException;

    /* renamed from: b */
    void mo41339b(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException;

    /* renamed from: c */
    void mo41340c(DownloadInfo downloadInfo) throws RemoteException;

    /* renamed from: c */
    void mo41341c(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException;

    /* renamed from: d */
    void mo41342d(DownloadInfo downloadInfo) throws RemoteException;

    /* renamed from: e */
    void mo41343e(DownloadInfo downloadInfo) throws RemoteException;

    /* renamed from: f */
    void mo41344f(DownloadInfo downloadInfo) throws RemoteException;

    /* renamed from: g */
    void mo41345g(DownloadInfo downloadInfo) throws RemoteException;

    /* renamed from: h */
    void mo41346h(DownloadInfo downloadInfo) throws RemoteException;
}

package p2699pl.droidsonroids.p2700a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p2699pl.droidsonroids.p2700a.C53862c.C53863a;

/* renamed from: pl.droidsonroids.a.a */
public final class C53845a implements C53863a {

    /* renamed from: pl.droidsonroids.a.a$a */
    static class C53846a {

        /* renamed from: a */
        public ZipFile f133448a;

        /* renamed from: b */
        public ZipEntry f133449b;

        public C53846a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f133448a = zipFile;
            this.f133449b = zipEntry;
        }
    }

    /* renamed from: a */
    private static void m114477a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private static long m114475a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j += (long) read;
            } else {
                outputStream.flush();
                return j;
            }
        }
    }

    /* renamed from: a */
    private C53846a m114476a(Context context, String[] strArr, String str, C53866d dVar) {
        String[] strArr2;
        int i;
        String[] strArr3 = strArr;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        char c = 0;
        if (VERSION.SDK_INT < 21 || applicationInfo.splitSourceDirs == null || applicationInfo.splitSourceDirs.length == 0) {
            strArr2 = new String[]{applicationInfo.sourceDir};
        } else {
            strArr2 = new String[(applicationInfo.splitSourceDirs.length + 1)];
            strArr2[0] = applicationInfo.sourceDir;
            System.arraycopy(applicationInfo.splitSourceDirs, 0, strArr2, 1, applicationInfo.splitSourceDirs.length);
        }
        int length = strArr2.length;
        ZipFile zipFile = null;
        int i2 = 0;
        while (i2 < length) {
            String str2 = strArr2[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                i = 5;
                if (i3 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i3 = i4;
                }
            }
            if (zipFile != null) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 < i) {
                        int length2 = strArr3.length;
                        int i7 = 0;
                        while (i7 < length2) {
                            String str3 = strArr3[i7];
                            StringBuilder sb = new StringBuilder("lib");
                            sb.append(File.separatorChar);
                            sb.append(str3);
                            sb.append(File.separatorChar);
                            sb.append(str);
                            String sb2 = sb.toString();
                            Object[] objArr = new Object[2];
                            objArr[c] = sb2;
                            objArr[1] = str2;
                            dVar.mo113865a("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                return new C53846a(zipFile, entry);
                            }
                            i7++;
                            c = 0;
                            i = 5;
                        }
                        String str4 = str;
                        C53866d dVar2 = dVar;
                        i5 = i6;
                        c = 0;
                    } else {
                        String str5 = str;
                        C53866d dVar3 = dVar;
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            } else {
                String str6 = str;
                C53866d dVar4 = dVar;
            }
            i2++;
            c = 0;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x00a5 A[SYNTHETIC, Splitter:B:72:0x00a5] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113849a(android.content.Context r11, java.lang.String[] r12, java.lang.String r13, java.io.File r14, p2699pl.droidsonroids.p2700a.C53866d r15) {
        /*
            r10 = this;
            r0 = 0
            pl.droidsonroids.a.a$a r11 = r10.m114476a(r11, r12, r13, r15)     // Catch:{ all -> 0x00a1 }
            if (r11 == 0) goto L_0x0099
            r12 = 0
            r1 = 0
        L_0x0009:
            int r2 = r1 + 1
            r3 = 5
            if (r1 >= r3) goto L_0x008b
            java.lang.String r1 = "Found %s! Extracting..."
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x009f }
            r4[r12] = r13     // Catch:{ all -> 0x009f }
            r15.mo113865a(r1, r4)     // Catch:{ all -> 0x009f }
            boolean r1 = r14.exists()     // Catch:{ IOException -> 0x0088 }
            if (r1 != 0) goto L_0x0026
            boolean r1 = r14.createNewFile()     // Catch:{ IOException -> 0x0088 }
            if (r1 != 0) goto L_0x0026
            goto L_0x0088
        L_0x0026:
            java.util.zip.ZipFile r1 = r11.f133448a     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007c, all -> 0x0073 }
            java.util.zip.ZipEntry r4 = r11.f133449b     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007c, all -> 0x0073 }
            java.io.InputStream r1 = r1.getInputStream(r4)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007c, all -> 0x0073 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0071, IOException -> 0x006f, all -> 0x006d }
            r4.<init>(r14)     // Catch:{ FileNotFoundException -> 0x0071, IOException -> 0x006f, all -> 0x006d }
            long r5 = m114475a(r1, r4)     // Catch:{ FileNotFoundException -> 0x0084, IOException -> 0x007e, all -> 0x006a }
            java.io.FileDescriptor r7 = r4.getFD()     // Catch:{ FileNotFoundException -> 0x0084, IOException -> 0x007e, all -> 0x006a }
            r7.sync()     // Catch:{ FileNotFoundException -> 0x0084, IOException -> 0x007e, all -> 0x006a }
            long r7 = r14.length()     // Catch:{ FileNotFoundException -> 0x0084, IOException -> 0x007e, all -> 0x006a }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x004d
            m114477a(r1)     // Catch:{ all -> 0x009f }
        L_0x0049:
            m114477a(r4)     // Catch:{ all -> 0x009f }
            goto L_0x0088
        L_0x004d:
            m114477a(r1)     // Catch:{ all -> 0x009f }
            m114477a(r4)     // Catch:{ all -> 0x009f }
            r14.setReadable(r3, r12)     // Catch:{ all -> 0x009f }
            r14.setExecutable(r3, r12)     // Catch:{ all -> 0x009f }
            r14.setWritable(r3)     // Catch:{ all -> 0x009f }
            if (r11 == 0) goto L_0x0069
            java.util.zip.ZipFile r12 = r11.f133448a     // Catch:{ IOException -> 0x0068 }
            if (r12 == 0) goto L_0x0069
            java.util.zip.ZipFile r11 = r11.f133448a     // Catch:{ IOException -> 0x0068 }
            r11.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x0069
        L_0x0068:
            return
        L_0x0069:
            return
        L_0x006a:
            r12 = move-exception
            r0 = r4
            goto L_0x0075
        L_0x006d:
            r12 = move-exception
            goto L_0x0075
        L_0x006f:
            r4 = r0
            goto L_0x007e
        L_0x0071:
            r4 = r0
            goto L_0x0084
        L_0x0073:
            r12 = move-exception
            r1 = r0
        L_0x0075:
            m114477a(r1)     // Catch:{ all -> 0x009f }
            m114477a(r0)     // Catch:{ all -> 0x009f }
            throw r12     // Catch:{ all -> 0x009f }
        L_0x007c:
            r1 = r0
            r4 = r1
        L_0x007e:
            m114477a(r1)     // Catch:{ all -> 0x009f }
            goto L_0x0049
        L_0x0082:
            r1 = r0
            r4 = r1
        L_0x0084:
            m114477a(r1)     // Catch:{ all -> 0x009f }
            goto L_0x0049
        L_0x0088:
            r1 = r2
            goto L_0x0009
        L_0x008b:
            if (r11 == 0) goto L_0x0098
            java.util.zip.ZipFile r12 = r11.f133448a     // Catch:{ IOException -> 0x0097 }
            if (r12 == 0) goto L_0x0098
            java.util.zip.ZipFile r11 = r11.f133448a     // Catch:{ IOException -> 0x0097 }
            r11.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x0098
        L_0x0097:
            return
        L_0x0098:
            return
        L_0x0099:
            pl.droidsonroids.a.b r12 = new pl.droidsonroids.a.b     // Catch:{ all -> 0x009f }
            r12.<init>(r13)     // Catch:{ all -> 0x009f }
            throw r12     // Catch:{ all -> 0x009f }
        L_0x009f:
            r12 = move-exception
            goto L_0x00a3
        L_0x00a1:
            r12 = move-exception
            r11 = r0
        L_0x00a3:
            if (r11 == 0) goto L_0x00ae
            java.util.zip.ZipFile r13 = r11.f133448a     // Catch:{ IOException -> 0x00ae }
            if (r13 == 0) goto L_0x00ae
            java.util.zip.ZipFile r11 = r11.f133448a     // Catch:{ IOException -> 0x00ae }
            r11.close()     // Catch:{ IOException -> 0x00ae }
        L_0x00ae:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p2699pl.droidsonroids.p2700a.C53845a.mo113849a(android.content.Context, java.lang.String[], java.lang.String, java.io.File, pl.droidsonroids.a.d):void");
    }
}

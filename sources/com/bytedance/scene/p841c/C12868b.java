package com.bytedance.scene.p841c;

/* renamed from: com.bytedance.scene.c.b */
public class C12868b {

    /* renamed from: a */
    private boolean f33698a;

    /* renamed from: b */
    private C12869a f33699b;

    /* renamed from: c */
    private Object f33700c;

    /* renamed from: d */
    private boolean f33701d;

    /* renamed from: com.bytedance.scene.c.b$a */
    public interface C12869a {
        /* renamed from: a */
        void mo24307a();
    }

    /* renamed from: a */
    public final boolean mo24331a() {
        boolean z;
        synchronized (this) {
            z = this.f33698a;
        }
        return z;
    }

    /* renamed from: c */
    private void mo24333c() {
        while (this.f33701d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.mo24307a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (android.os.Build.VERSION.SDK_INT < 16) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        ((android.os.CancellationSignal) r1).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.f33701d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0033, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4.f33701d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0039, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24332b() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f33698a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            return
        L_0x0007:
            r0 = 1
            r4.f33698a = r0     // Catch:{ all -> 0x003e }
            r4.f33701d = r0     // Catch:{ all -> 0x003e }
            com.bytedance.scene.c.b$a r0 = r4.f33699b     // Catch:{ all -> 0x003e }
            java.lang.Object r1 = r4.f33700c     // Catch:{ all -> 0x003e }
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0.mo24307a()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            goto L_0x0028
        L_0x001a:
            if (r1 == 0) goto L_0x0033
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0018 }
            r3 = 16
            if (r0 < r3) goto L_0x0033
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1     // Catch:{ all -> 0x0018 }
            r1.cancel()     // Catch:{ all -> 0x0018 }
            goto L_0x0033
        L_0x0028:
            monitor-enter(r4)
            r4.f33701d = r2     // Catch:{ all -> 0x0030 }
            r4.notifyAll()     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0033:
            monitor-enter(r4)
            r4.f33701d = r2     // Catch:{ all -> 0x003b }
            r4.notifyAll()     // Catch:{ all -> 0x003b }
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            throw r0
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.p841c.C12868b.mo24332b():void");
    }

    /* renamed from: a */
    public final void mo24330a(C12869a aVar) {
        synchronized (this) {
            mo24333c();
            if (this.f33699b != aVar) {
                this.f33699b = aVar;
                if (this.f33698a) {
                    aVar.mo24307a();
                }
            }
        }
    }
}

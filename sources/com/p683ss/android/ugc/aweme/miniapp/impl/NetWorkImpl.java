package com.p683ss.android.ugc.aweme.miniapp.impl;

import android.content.Context;
import android.util.Pair;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.C9831a;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9872a;
import com.bytedance.frameworks.baselib.network.http.p568a.C9836c;
import com.bytedance.frameworks.baselib.network.http.p574e.C9909d;
import com.bytedance.frameworks.baselib.network.http.p574e.C9917l;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12713o;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.p885c.C13302e;
import com.bytedance.ttnet.p887e.C13333g;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.miniapp.net.IAppbrandNetworkApi;
import com.p683ss.android.ugc.aweme.miniapp_api.model.net.C36976a;
import com.p683ss.android.ugc.aweme.miniapp_api.model.net.C36977b;
import com.p683ss.android.ugc.aweme.miniapp_api.model.net.C36978c;
import com.p683ss.android.ugc.aweme.miniapp_api.model.net.C36978c.C36980b;
import com.p683ss.android.ugc.aweme.miniapp_api.model.net.C36981d;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36924f;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.C36941c;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl */
public class NetWorkImpl implements C36924f {

    /* renamed from: a */
    public static final String f94234a = "NetWorkImpl";

    /* renamed from: b */
    private static final IRetrofit f94235b = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: c */
    private static IRetrofitService f94236c = RetrofitService.createIRetrofitServicebyMonsterPlugin();

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl$NetApi */
    public interface NetApi {
        @C12706h
        C17832m<String> doGet(@C12713o int i, @C12699af String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl$a */
    public enum C36871a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        

        /* renamed from: a */
        final int f94245a;

        private C36871a(int i) {
            this.f94245a = i;
        }
    }

    /* renamed from: a */
    public final String mo76066a(Context context) {
        return NetworkUtils.getNetworkAccessType(context);
    }

    /* renamed from: e */
    private static C13302e m82939e(C36978c cVar) {
        if (cVar == null) {
            return null;
        }
        C13302e eVar = new C13302e();
        eVar.f26780c = cVar.f94428k;
        eVar.f26781d = cVar.f94430m;
        eVar.f26782e = cVar.f94429l;
        return eVar;
    }

    /* renamed from: c */
    public final C36981d mo76069c(C36978c cVar) throws Exception {
        C36981d dVar = new C36981d();
        if (C9431p.m18664a(cVar.f94420c)) {
            dVar.f94437c = "url is null";
            return dVar;
        }
        ArrayList arrayList = new ArrayList();
        if (cVar.f94425h != null && !cVar.f94425h.isEmpty()) {
            for (Entry entry : cVar.f94425h.entrySet()) {
                arrayList.add(new C12685b((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        HashMap hashMap = new HashMap();
        for (Entry entry2 : cVar.f94426i.entrySet()) {
            hashMap.put(entry2.getKey(), new TypedString(entry2.getValue().toString()));
        }
        for (Entry entry3 : cVar.f94427j.entrySet()) {
            String str = (String) entry3.getKey();
            C36980b bVar = (C36980b) entry3.getValue();
            hashMap.put(str, new TypedFile(bVar.f94435b, bVar.f94434a));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair a = C9917l.m19876a(cVar.f94420c, (Map<String, String>) linkedHashMap);
        String str2 = (String) a.second;
        INetworkApi iNetworkApi = (INetworkApi) C13333g.m26861a((String) a.first, INetworkApi.class);
        if (iNetworkApi != null) {
            C12799u execute = iNetworkApi.postMultiPart(-1, str2, linkedHashMap, hashMap, arrayList).execute();
            dVar.f94436b = execute.mo23958a();
            dVar.f94437c = execute.f33551a.f33348c;
            dVar.f94438d = (String) execute.f33552b;
        }
        return dVar;
    }

    /* renamed from: b */
    public final C36981d mo76068b(C36978c cVar) throws Exception {
        byte[] bArr;
        String str;
        C36981d dVar = new C36981d();
        if (C9431p.m18664a(cVar.f94420c)) {
            dVar.f94437c = "url is null";
            return dVar;
        }
        C13302e e = m82939e(cVar);
        if (cVar.f94431n) {
            Pair a = m82936a(cVar.mo76273a().getBytes(), C36871a.GZIP);
            bArr = (byte[]) a.first;
            str = (String) a.second;
        } else {
            bArr = cVar.mo76273a().getBytes();
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(new C12685b("Content-Encoding", str));
        }
        arrayList.add(new C12685b("Content-Type", "application/json"));
        if (cVar.f94425h != null && !cVar.f94425h.isEmpty()) {
            for (Entry entry : cVar.f94425h.entrySet()) {
                arrayList.add(new C12685b((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair a2 = C9917l.m19876a(cVar.f94420c, (Map<String, String>) linkedHashMap);
        String str2 = (String) a2.first;
        String str3 = (String) a2.second;
        IAppbrandNetworkApi iAppbrandNetworkApi = (IAppbrandNetworkApi) C13333g.m26861a(str2, IAppbrandNetworkApi.class);
        if (iAppbrandNetworkApi != null) {
            try {
                C12799u execute = iAppbrandNetworkApi.postBody(-1, str3, linkedHashMap, new TypedByteArray(null, bArr, new String[0]), arrayList, e).execute();
                dVar.f94436b = execute.mo23958a();
                dVar.f94437c = execute.f33551a.f33348c;
                dVar.f94438d = (String) execute.f33552b;
            } catch (C9836c e2) {
                StringBuilder sb = new StringBuilder();
                sb.append(e2.getClass());
                sb.append(":");
                sb.append(e2.getMessage());
                dVar.f94437c = sb.toString();
                dVar.f94436b = e2.getStatusCode();
                dVar.f94441g = e2;
            } catch (C9872a e3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e3.getClass());
                sb2.append(":");
                sb2.append(e3.getMessage());
                dVar.f94437c = sb2.toString();
                dVar.f94441g = e3;
            }
        }
        return dVar;
    }

    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.miniapp_api.model.net.C36981d mo76070d(com.p683ss.android.ugc.aweme.miniapp_api.model.net.C36978c r15) throws java.lang.Exception {
        /*
            r14 = this;
            com.ss.android.ugc.aweme.miniapp_api.model.net.d r0 = new com.ss.android.ugc.aweme.miniapp_api.model.net.d
            r0.<init>()
            java.lang.String r1 = r15.f94420c
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r1)
            if (r1 == 0) goto L_0x0012
            java.lang.String r15 = "url is null"
            r0.f94437c = r15
            return r0
        L_0x0012:
            byte[] r1 = r15.f94421d
            r2 = 0
            if (r1 != 0) goto L_0x0019
            byte[] r1 = new byte[r2]
        L_0x0019:
            java.lang.String r3 = r15.f94423f
            com.bytedance.ttnet.c.e r10 = m82939e(r15)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            if (r3 == 0) goto L_0x0030
            com.bytedance.retrofit2.a.b r4 = new com.bytedance.retrofit2.a.b
            java.lang.String r5 = "Content-Encoding"
            r4.<init>(r5, r3)
            r9.add(r4)
        L_0x0030:
            com.bytedance.retrofit2.a.b r3 = new com.bytedance.retrofit2.a.b
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = r15.f94424g
            if (r5 != 0) goto L_0x003b
            java.lang.String r5 = ""
            goto L_0x003d
        L_0x003b:
            java.lang.String r5 = r15.f94424g
        L_0x003d:
            r3.<init>(r4, r5)
            r9.add(r3)
            java.util.Map<java.lang.String, java.lang.String> r3 = r15.f94425h
            if (r3 == 0) goto L_0x007a
            java.util.Map<java.lang.String, java.lang.String> r3 = r15.f94425h
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x007a
            java.util.Map<java.lang.String, java.lang.String> r3 = r15.f94425h
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0059:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x007a
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            com.bytedance.retrofit2.a.b r5 = new com.bytedance.retrofit2.a.b
            java.lang.Object r6 = r4.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r5.<init>(r6, r4)
            r9.add(r5)
            goto L_0x0059
        L_0x007a:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.lang.String r3 = r15.f94420c
            android.util.Pair r3 = com.bytedance.frameworks.baselib.network.http.p574e.C9917l.m19876a(r3, r8)
            java.lang.Object r4 = r3.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.second
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Class<com.ss.android.ugc.aweme.miniapp.net.IAppbrandNetworkApi> r3 = com.p683ss.android.ugc.aweme.miniapp.net.IAppbrandNetworkApi.class
            java.lang.Object r3 = com.bytedance.ttnet.p887e.C13333g.m26861a(r4, r3)
            r4 = r3
            com.ss.android.ugc.aweme.miniapp.net.IAppbrandNetworkApi r4 = (com.p683ss.android.ugc.aweme.miniapp.net.IAppbrandNetworkApi) r4
            if (r4 == 0) goto L_0x0207
            java.lang.String r3 = r15.f94422e
            boolean r11 = r15.f94432o
            int r5 = r3.hashCode()
            r12 = -1
            switch(r5) {
                case -531492226: goto L_0x00ce;
                case 70454: goto L_0x00c4;
                case 79599: goto L_0x00ba;
                case 2213344: goto L_0x00b0;
                case 2012838315: goto L_0x00a6;
                default: goto L_0x00a5;
            }
        L_0x00a5:
            goto L_0x00d8
        L_0x00a6:
            java.lang.String r5 = "DELETE"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00d8
            r3 = 2
            goto L_0x00d9
        L_0x00b0:
            java.lang.String r5 = "HEAD"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00d8
            r3 = 4
            goto L_0x00d9
        L_0x00ba:
            java.lang.String r5 = "PUT"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00d8
            r3 = 1
            goto L_0x00d9
        L_0x00c4:
            java.lang.String r5 = "GET"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00d8
            r3 = 0
            goto L_0x00d9
        L_0x00ce:
            java.lang.String r5 = "OPTIONS"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00d8
            r3 = 3
            goto L_0x00d9
        L_0x00d8:
            r3 = -1
        L_0x00d9:
            r5 = 0
            switch(r3) {
                case 0: goto L_0x0132;
                case 1: goto L_0x0121;
                case 2: goto L_0x0110;
                case 3: goto L_0x00ff;
                case 4: goto L_0x00ee;
                default: goto L_0x00dd;
            }
        L_0x00dd:
            r3 = -1
            com.bytedance.retrofit2.mime.TypedByteArray r13 = new com.bytedance.retrofit2.mime.TypedByteArray
            java.lang.String[] r6 = new java.lang.String[r2]
            r13.<init>(r5, r1, r6)
            r5 = r3
            r6 = r7
            r7 = r8
            r8 = r13
            com.bytedance.retrofit2.b r1 = r4.post(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0138
        L_0x00ee:
            r3 = -1
            com.bytedance.retrofit2.mime.TypedByteArray r13 = new com.bytedance.retrofit2.mime.TypedByteArray
            java.lang.String[] r6 = new java.lang.String[r2]
            r13.<init>(r5, r1, r6)
            r5 = r3
            r6 = r7
            r7 = r8
            r8 = r13
            com.bytedance.retrofit2.b r1 = r4.head(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0138
        L_0x00ff:
            r3 = -1
            com.bytedance.retrofit2.mime.TypedByteArray r13 = new com.bytedance.retrofit2.mime.TypedByteArray
            java.lang.String[] r6 = new java.lang.String[r2]
            r13.<init>(r5, r1, r6)
            r5 = r3
            r6 = r7
            r7 = r8
            r8 = r13
            com.bytedance.retrofit2.b r1 = r4.options(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0138
        L_0x0110:
            r3 = -1
            com.bytedance.retrofit2.mime.TypedByteArray r13 = new com.bytedance.retrofit2.mime.TypedByteArray
            java.lang.String[] r6 = new java.lang.String[r2]
            r13.<init>(r5, r1, r6)
            r5 = r3
            r6 = r7
            r7 = r8
            r8 = r13
            com.bytedance.retrofit2.b r1 = r4.delete(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0138
        L_0x0121:
            r3 = -1
            com.bytedance.retrofit2.mime.TypedByteArray r13 = new com.bytedance.retrofit2.mime.TypedByteArray
            java.lang.String[] r6 = new java.lang.String[r2]
            r13.<init>(r5, r1, r6)
            r5 = r3
            r6 = r7
            r7 = r8
            r8 = r13
            com.bytedance.retrofit2.b r1 = r4.put(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0138
        L_0x0132:
            r5 = 0
            r6 = -1
            com.bytedance.retrofit2.b r1 = r4.getRaw(r5, r6, r7, r8, r9, r10, r11)
        L_0x0138:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            r3.<init>(r1)     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl$3 r4 = new com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl$3     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            r4.<init>(r3)     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            r15.f94433p = r4     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            com.bytedance.retrofit2.u r15 = r1.execute()     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            com.bytedance.retrofit2.a.d r1 = r15.f33551a     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            java.util.List<com.bytedance.retrofit2.a.b> r1 = r1.f33349d     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            if (r1 == 0) goto L_0x0178
            java.util.Iterator r1 = r1.iterator()     // Catch:{ c -> 0x01d4, a -> 0x01ab }
        L_0x0152:
            boolean r3 = r1.hasNext()     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            if (r3 == 0) goto L_0x0178
            java.lang.Object r3 = r1.next()     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            com.bytedance.retrofit2.a.b r3 = (com.bytedance.retrofit2.p830a.C12685b) r3     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            java.util.ArrayList<com.ss.android.ugc.aweme.miniapp_api.model.net.MicroAppHttpHeader> r4 = r0.f94440f     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            if (r4 != 0) goto L_0x0169
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            r4.<init>()     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            r0.f94440f = r4     // Catch:{ c -> 0x01d4, a -> 0x01ab }
        L_0x0169:
            java.util.ArrayList<com.ss.android.ugc.aweme.miniapp_api.model.net.MicroAppHttpHeader> r4 = r0.f94440f     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            com.ss.android.ugc.aweme.miniapp_api.model.net.MicroAppHttpHeader r5 = new com.ss.android.ugc.aweme.miniapp_api.model.net.MicroAppHttpHeader     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            java.lang.String r6 = r3.f33318a     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            java.lang.String r3 = r3.f33319b     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            r5.<init>(r6, r3)     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            r4.add(r5)     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            goto L_0x0152
        L_0x0178:
            int r1 = r15.mo23958a()     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            r0.f94436b = r1     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            com.bytedance.retrofit2.a.d r1 = r15.f33551a     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            java.lang.String r1 = r1.f33348c     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            r0.f94437c = r1     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            T r1 = r15.f33552b     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            if (r1 != 0) goto L_0x018e
            byte[] r15 = new byte[r2]     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            r0.f94439e = r15     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            goto L_0x0207
        L_0x018e:
            T r15 = r15.f33552b     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            com.bytedance.retrofit2.mime.TypedInput r15 = (com.bytedance.retrofit2.mime.TypedInput) r15     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            java.io.InputStream r15 = r15.mo9554in()     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            r1.<init>()     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            long r2 = m82935a(r15, r1)     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r15 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            byte[] r15 = r1.toByteArray()     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            r0.f94439e = r15     // Catch:{ c -> 0x01d4, a -> 0x01ab }
            goto L_0x0207
        L_0x01ab:
            r15 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r15.getClass()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            java.lang.String r2 = r15.getMessage()
            r1.append(r2)
            java.lang.String r2 = ",-1"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.f94437c = r1
            r0.f94436b = r12
            r0.f94441g = r15
            goto L_0x0207
        L_0x01d4:
            r15 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r15.getClass()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            java.lang.String r2 = r15.getMessage()
            r1.append(r2)
            java.lang.String r2 = ","
            r1.append(r2)
            int r2 = r15.getStatusCode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.f94437c = r1
            int r1 = r15.getStatusCode()
            r0.f94436b = r1
            r0.f94441g = r15
        L_0x0207:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.miniapp.impl.NetWorkImpl.mo76070d(com.ss.android.ugc.aweme.miniapp_api.model.net.c):com.ss.android.ugc.aweme.miniapp_api.model.net.d");
    }

    /* renamed from: a */
    public final C36981d mo76065a(C36978c cVar) throws Exception {
        C13302e e = m82939e(cVar);
        C36981d dVar = new C36981d();
        if (C9431p.m18664a(cVar.f94420c)) {
            dVar.f94437c = "url is null";
            return dVar;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair a = C9917l.m19876a(cVar.f94420c, (Map<String, String>) linkedHashMap);
        String str = (String) a.second;
        INetworkApi iNetworkApi = (INetworkApi) C13333g.m26861a((String) a.first, INetworkApi.class);
        LinkedList linkedList = new LinkedList();
        if (cVar.f94425h != null && !cVar.f94425h.isEmpty()) {
            for (Entry entry : cVar.f94425h.entrySet()) {
                linkedList.add(new C12685b((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        if (iNetworkApi != null) {
            try {
                C12799u execute = iNetworkApi.doGet(true, -1, str, linkedHashMap, linkedList, e).execute();
                dVar.f94436b = execute.mo23958a();
                dVar.f94437c = execute.f33551a.f33348c;
                dVar.f94438d = (String) execute.f33552b;
            } catch (C9836c e2) {
                StringBuilder sb = new StringBuilder();
                sb.append(e2.getClass());
                sb.append(":");
                sb.append(e2.getMessage());
                dVar.f94437c = sb.toString();
                dVar.f94436b = e2.getStatusCode();
                dVar.f94441g = e2;
            } catch (C9872a e3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e3.getClass());
                sb2.append(":");
                sb2.append(e3.getMessage());
                dVar.f94437c = sb2.toString();
                dVar.f94441g = e3;
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo76067a(Map<String, String> map, boolean z) {
        NetUtil.putCommonParams(map, true);
    }

    /* renamed from: a */
    private static long m82935a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r6 = new android.util.Pair<>(r5, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        return r6;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<byte[], java.lang.String> m82936a(byte[] r5, com.p683ss.android.ugc.aweme.miniapp.impl.NetWorkImpl.C36871a r6) throws java.io.IOException {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0008
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r5, r0)
        L_0x0008:
            int r1 = r5.length     // Catch:{ Throwable -> 0x006b }
            com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl$a r2 = com.p683ss.android.ugc.aweme.miniapp.impl.NetWorkImpl.C36871a.GZIP     // Catch:{ Throwable -> 0x006b }
            r3 = 128(0x80, float:1.794E-43)
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 != r6) goto L_0x003a
            if (r1 <= r3) goto L_0x003a
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x006b }
            r6.<init>(r4)     // Catch:{ Throwable -> 0x006b }
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch:{ Throwable -> 0x006b }
            r1.<init>(r6)     // Catch:{ Throwable -> 0x006b }
            r1.write(r5)     // Catch:{ Throwable -> 0x002d }
            r1.close()     // Catch:{ Throwable -> 0x006b }
            byte[] r6 = r6.toByteArray()     // Catch:{ Throwable -> 0x006b }
            java.lang.String r5 = "gzip"
        L_0x0029:
            r0 = r5
            goto L_0x006c
        L_0x002b:
            r6 = move-exception
            goto L_0x0036
        L_0x002d:
            android.util.Pair r6 = new android.util.Pair     // Catch:{ all -> 0x002b }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x002b }
            r1.close()     // Catch:{ Throwable -> 0x006b }
            return r6
        L_0x0036:
            r1.close()     // Catch:{ Throwable -> 0x006b }
            throw r6     // Catch:{ Throwable -> 0x006b }
        L_0x003a:
            com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl$a r2 = com.p683ss.android.ugc.aweme.miniapp.impl.NetWorkImpl.C36871a.DEFLATER     // Catch:{ Throwable -> 0x006b }
            if (r2 != r6) goto L_0x006b
            if (r1 <= r3) goto L_0x006b
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x006b }
            r6.<init>(r4)     // Catch:{ Throwable -> 0x006b }
            java.util.zip.Deflater r1 = new java.util.zip.Deflater     // Catch:{ Throwable -> 0x006b }
            r1.<init>()     // Catch:{ Throwable -> 0x006b }
            r1.setInput(r5)     // Catch:{ Throwable -> 0x006b }
            r1.finish()     // Catch:{ Throwable -> 0x006b }
            byte[] r2 = new byte[r4]     // Catch:{ Throwable -> 0x006b }
        L_0x0052:
            boolean r3 = r1.finished()     // Catch:{ Throwable -> 0x006b }
            if (r3 != 0) goto L_0x0061
            int r3 = r1.deflate(r2)     // Catch:{ Throwable -> 0x006b }
            r4 = 0
            r6.write(r2, r4, r3)     // Catch:{ Throwable -> 0x006b }
            goto L_0x0052
        L_0x0061:
            r1.end()     // Catch:{ Throwable -> 0x006b }
            byte[] r6 = r6.toByteArray()     // Catch:{ Throwable -> 0x006b }
            java.lang.String r5 = "deflate"
            goto L_0x0029
        L_0x006b:
            r6 = r5
        L_0x006c:
            android.util.Pair r5 = new android.util.Pair
            r5.<init>(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.miniapp.impl.NetWorkImpl.m82936a(byte[], com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl$a):android.util.Pair");
    }

    /* renamed from: a */
    public final C36977b mo76064a(C36976a aVar, C36941c cVar) {
        C36976a aVar2 = aVar;
        File file = new File(aVar2.f94417a, aVar2.f94418b);
        if (file.exists()) {
            file.delete();
        }
        C36977b bVar = new C36977b();
        try {
            final C36941c cVar2 = cVar;
            C368681 r9 = new C9909d<String>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo17848a(int i, Object obj) {
                    String str = (String) obj;
                    if (cVar2 != null) {
                        cVar2.mo76189a(i, -1, -1);
                    }
                }
            };
            ArrayList arrayList = null;
            if (aVar2.f94425h != null && !aVar2.f94425h.isEmpty()) {
                arrayList = new ArrayList();
                for (Entry entry : aVar2.f94425h.entrySet()) {
                    arrayList.add(new C12685b((String) entry.getKey(), (String) entry.getValue()));
                }
            }
            ArrayList arrayList2 = arrayList;
            boolean a = m82938a(-1, aVar2.f94420c, aVar2.f94417a, null, aVar2.f94418b, r9, "download", null, arrayList2, null, null, bVar);
            if (file.exists() && a) {
                bVar.f94419a = file;
            }
        } catch (Exception e) {
            bVar.f94437c = e.getMessage();
            bVar.f94441g = e;
        }
        return bVar;
    }

    /* renamed from: a */
    private static void m82937a(C9831a<?> aVar, String[] strArr, List<C12685b> list, C13302e eVar, Exception exc) {
        String str = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (C12685b bVar : list) {
                        if ("x-net-info.remoteaddr".equalsIgnoreCase(bVar.f33318a)) {
                            str = bVar.f33319b;
                        }
                    }
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (C9431p.m18664a(str)) {
            str = eVar.f26778a;
        }
        if (C9431p.m18664a(str)) {
            str = C13333g.m26862a(exc);
        }
        if (!C9431p.m18664a(str)) {
            if (strArr != null && strArr.length > 0) {
                strArr[0] = str;
            }
            if (aVar != null) {
                aVar.f26751a = str;
                if (aVar.f26752b != null) {
                    aVar.f26752b.f26778a = str;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r26v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r26v1 */
    /* JADX WARNING: type inference failed for: r35v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v23, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r26v2 */
    /* JADX WARNING: type inference failed for: r13v1 */
    /* JADX WARNING: type inference failed for: r26v3 */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r26v4, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r35v2, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r13v6 */
    /* JADX WARNING: type inference failed for: r26v5 */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: type inference failed for: r26v6 */
    /* JADX WARNING: type inference failed for: r13v9 */
    /* JADX WARNING: type inference failed for: r13v10 */
    /* JADX WARNING: type inference failed for: r13v11 */
    /* JADX WARNING: type inference failed for: r13v12 */
    /* JADX WARNING: type inference failed for: r26v7 */
    /* JADX WARNING: type inference failed for: r13v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0178, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x017b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x017c, code lost:
        r14 = r12;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x017e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0181, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0188, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x018c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x018d, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0190, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0191, code lost:
        r14 = r4;
        r3 = r7;
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0196, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0197, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01a1, code lost:
        r2.f94436b = ((com.bytedance.frameworks.baselib.network.http.p568a.C9836c) r0).getStatusCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01d0, code lost:
        r26 = com.bytedance.ttnet.p887e.C13333g.m26863a((java.util.List<com.bytedance.retrofit2.p830a.C12685b>) r13, "X-TT-LOGID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x01e9, code lost:
        r3 = (com.bytedance.frameworks.baselib.network.http.C9831a) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01f0, code lost:
        ((com.bytedance.retrofit2.C12758l) r4).doCollect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0206, code lost:
        if (r3.f26757g <= 0) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0208, code lost:
        r3.f26757g = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x020a, code lost:
        r3.f26758h = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x020e, code lost:
        if (r3.f26775y != null) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0210, code lost:
        r3.f26775y.put("ex", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x024d, code lost:
        r0 = (java.lang.Exception) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0250, code lost:
        r0 = new java.lang.Exception(r0.getMessage(), r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0265, code lost:
        com.bytedance.frameworks.baselib.network.p566a.C9809b.m19637a().mo17655d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0271, code lost:
        r4.cancel();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r13v1
      assigns: []
      uses: []
      mth insns count: 283
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x017e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:74:0x00cd] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0181 A[ExcHandler: Throwable (th java.lang.Throwable), Splitter:B:74:0x00cd] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x018c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:52:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0190 A[ExcHandler: Throwable (th java.lang.Throwable), Splitter:B:52:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01a1 A[Catch:{ Throwable -> 0x009f, all -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01d0 A[Catch:{ Throwable -> 0x009f, all -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01e9 A[Catch:{ Throwable -> 0x009f, all -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01f0 A[Catch:{ Throwable -> 0x009f, all -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0200 A[Catch:{ Throwable -> 0x009f, all -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x024d A[Catch:{ all -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0250 A[Catch:{ all -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0271 A[Catch:{ Throwable -> 0x0274 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a2 A[SYNTHETIC, Splitter:B:52:0x00a2] */
    /* JADX WARNING: Unknown variable types count: 13 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m82938a(int r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, com.bytedance.frameworks.baselib.network.http.p574e.C9909d<java.lang.String> r33, java.lang.String r34, com.bytedance.frameworks.baselib.network.http.p574e.C9914i r35, java.util.List<com.bytedance.retrofit2.p830a.C12685b> r36, java.lang.String[] r37, int[] r38, com.p683ss.android.ugc.aweme.miniapp_api.model.net.C36981d r39) throws java.lang.Exception {
        /*
            r27 = this;
            r1 = r29
            r2 = r39
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r29)
            r3 = 0
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "url is empty"
            r2.f94437c = r0
            return r3
        L_0x0010:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            android.util.Pair r0 = com.bytedance.frameworks.baselib.network.http.p574e.C9917l.m19876a(r1, r8)
            java.lang.Object r4 = r0.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r0.second
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Class<com.bytedance.ttnet.INetworkApi> r0 = com.bytedance.ttnet.INetworkApi.class
            java.lang.Object r0 = com.bytedance.ttnet.p887e.C13333g.m26861a(r4, r0)
            r4 = r0
            com.bytedance.ttnet.INetworkApi r4 = (com.bytedance.ttnet.INetworkApi) r4
            com.bytedance.ttnet.c.e r11 = new com.bytedance.ttnet.c.e
            r11.<init>()
            r12 = -1
            if (r4 != 0) goto L_0x0039
            java.lang.String r0 = "createSsService fail"
            r2.f94437c = r0
            return r3
        L_0x0039:
            r5 = 0
            r6 = -1
            r14 = 0
            r9 = r36
            r10 = r11
            com.bytedance.retrofit2.b r4 = r4.downloadFile(r5, r6, r7, r8, r9, r10)     // Catch:{ Throwable -> 0x0245, all -> 0x023f }
            com.bytedance.ttnet.c r0 = com.bytedance.ttnet.C13303d.m26799b()     // Catch:{ Throwable -> 0x023a, all -> 0x0237 }
            android.content.Context r0 = r0.mo24896a()     // Catch:{ Throwable -> 0x023a, all -> 0x0237 }
            boolean r0 = com.p683ss.android.ugc.aweme.miniapp.impl.C36897h.m83008a(r0)     // Catch:{ Throwable -> 0x023a, all -> 0x0237 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "network is not available"
            r2.f94437c = r0     // Catch:{ Throwable -> 0x0061, all -> 0x005e }
            com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r14)     // Catch:{ Throwable -> 0x005d }
            if (r4 == 0) goto L_0x005d
            r4.cancel()     // Catch:{ Throwable -> 0x005d }
        L_0x005d:
            return r3
        L_0x005e:
            r0 = move-exception
            goto L_0x0243
        L_0x0061:
            r0 = move-exception
        L_0x0062:
            r12 = r14
            goto L_0x023d
        L_0x0065:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x023a, all -> 0x0237 }
            com.bytedance.frameworks.baselib.network.http.e$e r0 = com.bytedance.frameworks.baselib.network.http.C9894e.m19829c()     // Catch:{ Throwable -> 0x023a, all -> 0x0237 }
            if (r0 == 0) goto L_0x007f
            boolean r0 = r0.mo17826b(r1)     // Catch:{ Throwable -> 0x0061, all -> 0x005e }
            if (r0 == 0) goto L_0x007f
            com.bytedance.frameworks.baselib.network.a.b r0 = com.bytedance.frameworks.baselib.network.p566a.C9809b.m19637a()     // Catch:{ Throwable -> 0x0061, all -> 0x005e }
            r0.mo17654c()     // Catch:{ Throwable -> 0x0061, all -> 0x005e }
            r0 = 1
            r7 = 1
            goto L_0x0080
        L_0x007f:
            r7 = 0
        L_0x0080:
            com.bytedance.retrofit2.u r0 = r4.execute()     // Catch:{ Throwable -> 0x0231, all -> 0x022e }
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = "ssResponse is null"
            r2.f94437c = r0     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            if (r7 == 0) goto L_0x0093
            com.bytedance.frameworks.baselib.network.a.b r0 = com.bytedance.frameworks.baselib.network.p566a.C9809b.m19637a()
            r0.mo17655d()
        L_0x0093:
            com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r14)     // Catch:{ Throwable -> 0x009b }
            if (r4 == 0) goto L_0x009b
            r4.cancel()     // Catch:{ Throwable -> 0x009b }
        L_0x009b:
            return r3
        L_0x009c:
            r0 = move-exception
            goto L_0x0263
        L_0x009f:
            r0 = move-exception
            r3 = r7
            goto L_0x0062
        L_0x00a2:
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0196, Throwable -> 0x0190, all -> 0x018c }
            com.bytedance.retrofit2.a.d r3 = r0.f33551a     // Catch:{ Exception -> 0x018a, Throwable -> 0x0190, all -> 0x018c }
            java.lang.Object r3 = r3.f33351f     // Catch:{ Exception -> 0x018a, Throwable -> 0x0190, all -> 0x018c }
            boolean r10 = r3 instanceof com.bytedance.frameworks.baselib.network.http.C9831a     // Catch:{ Exception -> 0x018a, Throwable -> 0x0190, all -> 0x018c }
            if (r10 == 0) goto L_0x00b8
            com.bytedance.frameworks.baselib.network.http.a r3 = (com.bytedance.frameworks.baselib.network.http.C9831a) r3     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b9
        L_0x00b1:
            r0 = move-exception
            r3 = r14
            r13 = r3
        L_0x00b4:
            r26 = r13
            goto L_0x019d
        L_0x00b8:
            r3 = r14
        L_0x00b9:
            if (r3 == 0) goto L_0x00c1
            r3.f26757g = r8     // Catch:{ Exception -> 0x00be }
            goto L_0x00c1
        L_0x00be:
            r0 = move-exception
            r13 = r14
            goto L_0x00b4
        L_0x00c1:
            T r10 = r0.f33552b     // Catch:{ Exception -> 0x0188, Throwable -> 0x0190, all -> 0x018c }
            com.bytedance.retrofit2.mime.TypedInput r10 = (com.bytedance.retrofit2.mime.TypedInput) r10     // Catch:{ Exception -> 0x0188, Throwable -> 0x0190, all -> 0x018c }
            if (r10 == 0) goto L_0x00cc
            java.io.InputStream r12 = r10.mo9554in()     // Catch:{ Exception -> 0x00be }
            goto L_0x00cd
        L_0x00cc:
            r12 = r14
        L_0x00cd:
            java.util.List r13 = r0.mo23959b()     // Catch:{ Exception -> 0x0184, Throwable -> 0x0181, all -> 0x017e }
            java.lang.String r15 = "X-TT-LOGID"
            java.lang.String r26 = com.bytedance.ttnet.p887e.C13333g.m26863a(r13, r15)     // Catch:{ Exception -> 0x017b, Throwable -> 0x0181, all -> 0x017e }
            m82937a(r3, r14, r13, r11, r14)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            int r15 = r0.mo23958a()     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            r2.f94436b = r15     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            com.bytedance.retrofit2.a.d r0 = r0.f33551a     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            java.lang.String r0 = r0.f33348c     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            r2.f94437c = r0     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            r0 = 200(0xc8, float:2.8E-43)
            if (r15 != r0) goto L_0x0153
            if (r10 == 0) goto L_0x0153
            r10.length()     // Catch:{ Exception -> 0x014f, Throwable -> 0x014a, all -> 0x0145 }
            long r16 = r10.length()     // Catch:{ Exception -> 0x014f, Throwable -> 0x014a, all -> 0x0145 }
            com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl$2 r0 = new com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl$2     // Catch:{ Exception -> 0x014f, Throwable -> 0x014a, all -> 0x0145 }
            r10 = r27
            r0.<init>(r1, r4)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            r19 = -1
            r21 = 0
            r25 = 0
            r15 = r12
            r18 = r0
            r20 = r30
            r22 = r32
            r23 = r33
            r24 = r34
            boolean r0 = com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19808a(r15, r16, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            if (r0 == 0) goto L_0x0133
            boolean r15 = r4 instanceof com.bytedance.retrofit2.C12758l     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            if (r15 == 0) goto L_0x011b
            r15 = r4
            com.bytedance.retrofit2.l r15 = (com.bytedance.retrofit2.C12758l) r15     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            r15.doCollect()     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
        L_0x011b:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            if (r3 == 0) goto L_0x0123
            r3.f26758h = r14     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
        L_0x0123:
            r16 = 0
            long r14 = r14 - r5
            r30 = r14
            r32 = r5
            r34 = r29
            r35 = r26
            r36 = r3
            com.bytedance.frameworks.baselib.network.http.C9894e.m19818a(r30, r32, r34, r35, r36)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
        L_0x0133:
            if (r7 == 0) goto L_0x013c
            com.bytedance.frameworks.baselib.network.a.b r1 = com.bytedance.frameworks.baselib.network.p566a.C9809b.m19637a()
            r1.mo17655d()
        L_0x013c:
            com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r12)     // Catch:{ Throwable -> 0x0144 }
            if (r4 == 0) goto L_0x0144
            r4.cancel()     // Catch:{ Throwable -> 0x0144 }
        L_0x0144:
            return r0
        L_0x0145:
            r0 = move-exception
            r10 = r27
            goto L_0x0262
        L_0x014a:
            r0 = move-exception
            r10 = r27
            goto L_0x0234
        L_0x014f:
            r0 = move-exception
            r10 = r27
            goto L_0x0179
        L_0x0153:
            if (r15 != r0) goto L_0x015f
            if (r10 != 0) goto L_0x015f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            java.lang.String r10 = "HTTP TypedInput may not be null"
            r0.<init>(r10)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            throw r0     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
        L_0x015f:
            com.bytedance.frameworks.baselib.network.http.a.c r0 = new com.bytedance.frameworks.baselib.network.http.a.c     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            java.lang.String r14 = "get url = "
            r10.<init>(r14)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            r10.append(r1)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            java.lang.String r14 = " exception"
            r10.append(r14)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            r0.<init>(r15, r10)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            throw r0     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
        L_0x0178:
            r0 = move-exception
        L_0x0179:
            r14 = r12
            goto L_0x019d
        L_0x017b:
            r0 = move-exception
            r14 = r12
            goto L_0x019b
        L_0x017e:
            r0 = move-exception
            goto L_0x0262
        L_0x0181:
            r0 = move-exception
            goto L_0x0234
        L_0x0184:
            r0 = move-exception
            r14 = r12
            r13 = 0
            goto L_0x019b
        L_0x0188:
            r0 = move-exception
            goto L_0x0199
        L_0x018a:
            r0 = move-exception
            goto L_0x0198
        L_0x018c:
            r0 = move-exception
            r14 = 0
            goto L_0x0263
        L_0x0190:
            r0 = move-exception
            r14 = r4
            r3 = r7
            r12 = 0
            goto L_0x0249
        L_0x0196:
            r0 = move-exception
            r8 = r12
        L_0x0198:
            r3 = 0
        L_0x0199:
            r13 = 0
            r14 = 0
        L_0x019b:
            r26 = 0
        L_0x019d:
            boolean r10 = r0 instanceof com.bytedance.frameworks.baselib.network.http.p568a.C9836c     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            if (r10 == 0) goto L_0x01aa
            r10 = r0
            com.bytedance.frameworks.baselib.network.http.a.c r10 = (com.bytedance.frameworks.baselib.network.http.p568a.C9836c) r10     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            int r10 = r10.getStatusCode()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r2.f94436b = r10     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
        L_0x01aa:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r10.<init>()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            java.lang.Class r12 = r0.getClass()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r10.append(r12)     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            java.lang.String r12 = ":"
            r10.append(r12)     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            java.lang.String r12 = r0.getMessage()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r10.append(r12)     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            java.lang.String r10 = r10.toString()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r2.f94437c = r10     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r2.f94441g = r0     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r26)     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            if (r2 == 0) goto L_0x01d8
            java.lang.String r2 = "X-TT-LOGID"
            java.lang.String r2 = com.bytedance.ttnet.p887e.C13333g.m26863a(r13, r2)     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r26 = r2
        L_0x01d8:
            if (r3 != 0) goto L_0x01ec
            boolean r2 = r4 instanceof com.bytedance.retrofit2.C12759m     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            if (r2 == 0) goto L_0x01ec
            r2 = r4
            com.bytedance.retrofit2.m r2 = (com.bytedance.retrofit2.C12759m) r2     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            java.lang.Object r2 = r2.getRequestInfo()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            boolean r10 = r2 instanceof com.bytedance.frameworks.baselib.network.http.C9831a     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            if (r10 == 0) goto L_0x01ec
            com.bytedance.frameworks.baselib.network.http.a r2 = (com.bytedance.frameworks.baselib.network.http.C9831a) r2     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r3 = r2
        L_0x01ec:
            boolean r2 = r4 instanceof com.bytedance.retrofit2.C12758l     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            if (r2 == 0) goto L_0x01f6
            r2 = r4
            com.bytedance.retrofit2.l r2 = (com.bytedance.retrofit2.C12758l) r2     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r2.doCollect()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
        L_0x01f6:
            r2 = 0
            m82937a(r3, r2, r13, r11, r0)     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            if (r3 == 0) goto L_0x021b
            long r12 = r3.f26757g     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r15 = 0
            int r2 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r2 > 0) goto L_0x020a
            r3.f26757g = r8     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
        L_0x020a:
            r3.f26758h = r10     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            org.json.JSONObject r2 = r3.f26775y     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            if (r2 == 0) goto L_0x021b
            org.json.JSONObject r2 = r3.f26775y     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            java.lang.String r8 = "ex"
            java.lang.String r9 = r0.getMessage()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r2.put(r8, r9)     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
        L_0x021b:
            r2 = 0
            long r8 = r10 - r5
            r30 = r8
            r32 = r5
            r34 = r29
            r35 = r26
            r36 = r3
            r37 = r0
            com.bytedance.frameworks.baselib.network.http.C9894e.m19819a(r30, r32, r34, r35, r36, r37)     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            throw r0     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
        L_0x022e:
            r0 = move-exception
            r2 = r14
            goto L_0x0263
        L_0x0231:
            r0 = move-exception
            r2 = r14
            r12 = r2
        L_0x0234:
            r14 = r4
            r3 = r7
            goto L_0x0249
        L_0x0237:
            r0 = move-exception
            r2 = r14
            goto L_0x0243
        L_0x023a:
            r0 = move-exception
            r2 = r14
            r12 = r2
        L_0x023d:
            r14 = r4
            goto L_0x0249
        L_0x023f:
            r0 = move-exception
            r2 = r14
            r4 = r2
            r14 = r4
        L_0x0243:
            r7 = 0
            goto L_0x0263
        L_0x0245:
            r0 = move-exception
            r2 = r14
            r12 = r2
            r14 = r12
        L_0x0249:
            boolean r1 = r0 instanceof java.lang.Exception     // Catch:{ all -> 0x025f }
            if (r1 == 0) goto L_0x0250
            java.lang.Exception r0 = (java.lang.Exception) r0     // Catch:{ all -> 0x025f }
            goto L_0x025e
        L_0x0250:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x025f }
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x025f }
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x025f }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x025f }
            r0 = r1
        L_0x025e:
            throw r0     // Catch:{ all -> 0x025f }
        L_0x025f:
            r0 = move-exception
            r7 = r3
            r4 = r14
        L_0x0262:
            r14 = r12
        L_0x0263:
            if (r7 == 0) goto L_0x026c
            com.bytedance.frameworks.baselib.network.a.b r1 = com.bytedance.frameworks.baselib.network.p566a.C9809b.m19637a()
            r1.mo17655d()
        L_0x026c:
            com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r14)     // Catch:{ Throwable -> 0x0274 }
            if (r4 == 0) goto L_0x0274
            r4.cancel()     // Catch:{ Throwable -> 0x0274 }
        L_0x0274:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.miniapp.impl.NetWorkImpl.m82938a(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.bytedance.frameworks.baselib.network.http.e.d, java.lang.String, com.bytedance.frameworks.baselib.network.http.e.i, java.util.List, java.lang.String[], int[], com.ss.android.ugc.aweme.miniapp_api.model.net.d):boolean");
    }
}

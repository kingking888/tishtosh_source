package com.p683ss.android.ugc.aweme.commercialize.dao;

import android.arch.p011c.p012a.C0118b;
import android.arch.p011c.p012a.C0119c;
import android.arch.p011c.p012a.C0119c.C0120a;
import android.arch.p011c.p012a.C0119c.C0121b;
import android.arch.p011c.p014b.C0127a;
import android.arch.p011c.p014b.C0137d;
import android.arch.p011c.p014b.C0142f.C0144b;
import android.arch.p011c.p014b.C0148h;
import android.arch.p011c.p014b.C0148h.C0149a;
import android.arch.p011c.p014b.p016b.C0131b;
import android.arch.p011c.p014b.p016b.C0131b.C0132a;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase_Impl */
public class ShowAdDataBase_Impl extends ShowAdDataBase {

    /* renamed from: g */
    private volatile C25727b f68040g;

    /* renamed from: a */
    public final C0137d mo240a() {
        return new C0137d(this, "showAd");
    }

    /* renamed from: g */
    public final C25727b mo52916g() {
        C25727b bVar;
        if (this.f68040g != null) {
            return this.f68040g;
        }
        synchronized (this) {
            if (this.f68040g == null) {
                this.f68040g = new C25728c(this);
            }
            bVar = this.f68040g;
        }
        return bVar;
    }

    /* renamed from: b */
    public final C0119c mo244b(C0127a aVar) {
        return aVar.f294a.mo197a(C0121b.m264a(aVar.f295b).mo211a(aVar.f296c).mo210a((C0120a) new C0148h(aVar, new C0149a(1) {
            /* renamed from: a */
            public final void mo256a(C0118b bVar) {
                bVar.mo180c("DROP TABLE IF EXISTS `showAd`");
            }

            /* renamed from: b */
            public final void mo257b(C0118b bVar) {
                bVar.mo180c("CREATE TABLE IF NOT EXISTS `showAd` (`awemeId` TEXT NOT NULL, PRIMARY KEY(`awemeId`))");
                bVar.mo180c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo180c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"b390b3c8ccd346d851c56d8fb78f29df\")");
            }

            /* renamed from: d */
            public final void mo259d(C0118b bVar) {
                if (ShowAdDataBase_Impl.this.f354e != null) {
                    int size = ShowAdDataBase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        ShowAdDataBase_Impl.this.f354e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo258c(C0118b bVar) {
                ShowAdDataBase_Impl.this.f350a = bVar;
                ShowAdDataBase_Impl.this.mo242a(bVar);
                if (ShowAdDataBase_Impl.this.f354e != null) {
                    int size = ShowAdDataBase_Impl.this.f354e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) ShowAdDataBase_Impl.this.f354e.get(i)).mo253a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo260e(C0118b bVar) {
                HashMap hashMap = new HashMap(1);
                hashMap.put("awemeId", new C0132a("awemeId", "TEXT", true, 1));
                C0131b bVar2 = new C0131b("showAd", hashMap, new HashSet(0), new HashSet(0));
                C0131b a = C0131b.m285a(bVar, "showAd");
                if (!bVar2.equals(a)) {
                    StringBuilder sb = new StringBuilder("Migration didn't properly handle showAd(com.ss.android.ugc.aweme.commercialize.dao.ShowAd).\n Expected:\n");
                    sb.append(bVar2);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "b390b3c8ccd346d851c56d8fb78f29df", "ad22cd0c0878f7d44a84485b85a127f7")).mo212a());
    }
}

package com.p683ss.android.ugc.aweme.choosemusic.p1505d;

import com.p683ss.android.ugc.aweme.arch.C23268b;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d;
import com.p683ss.android.ugc.aweme.music.model.MusicList;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.d.l */
public final /* synthetic */ class C24856l implements C0011g {

    /* renamed from: a */
    private final C24842a f65775a;

    public C24856l(C24842a aVar) {
        this.f65775a = aVar;
    }

    public final Object then(C0013i iVar) {
        C24842a aVar = this.f65775a;
        aVar.f65745h = false;
        if (iVar.mo33d()) {
            aVar.f65739b.mo48228a("loadmore_status_hot_music_list", (Object) Integer.valueOf(1));
        } else if (iVar.mo26b()) {
            MusicList musicList = (MusicList) iVar.mo34e();
            List list = (List) ((C23268b) aVar.f65739b.mo48229a("hot_music_list_data")).mo48213a("list_data");
            list.addAll(C24964d.m60738a(musicList.items));
            C23268b bVar = new C23268b();
            bVar.mo48212a("loadmore_status_hot_music_list", Integer.valueOf(0)).mo48212a("list_cursor", Integer.valueOf(musicList.getCursor())).mo48212a("list_hasmore", Integer.valueOf(musicList.hasMore)).mo48212a("action_type", Integer.valueOf(2)).mo48212a("list_data", list);
            aVar.f65739b.mo48228a("hot_music_list_data", (Object) bVar);
        }
        return null;
    }
}

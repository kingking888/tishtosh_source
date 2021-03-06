package com.toutiao.proxyserver.net;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12697ad;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12702d;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12707i;
import com.bytedance.retrofit2.p831b.C12710l;
import java.util.List;
import java.util.Map;

public interface INetApi {
    @C12706h
    @C12697ad
    C12690b<TypedInput> get(@C12699af String str, @C12694aa Map<String, String> map, @C12710l List<C12685b> list, @C12702d Object obj);

    @C12707i
    C12690b<Void> head(@C12699af String str, @C12694aa Map<String, String> map, @C12710l List<C12685b> list, @C12702d Object obj);
}

package com.bytedance.frameworks.baselib.network.http.p574e;

import android.net.Uri;
import android.util.Pair;
import com.bytedance.common.utility.C9431p;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.frameworks.baselib.network.http.e.l */
public final class C9917l {
    /* renamed from: a */
    static String m19877a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static Pair<String, String> m19876a(String str, Map<String, String> map) throws IOException {
        String[] split;
        if (!C9431p.m18664a(str)) {
            try {
                Uri parse = Uri.parse(str);
                StringBuilder sb = new StringBuilder();
                String scheme = parse.getScheme();
                String host = parse.getHost();
                int port = parse.getPort();
                if (host != null) {
                    if (scheme != null) {
                        sb.append(scheme);
                        sb.append("://");
                    }
                    sb.append(host);
                    if (port > 0) {
                        sb.append(':');
                        sb.append(port);
                    }
                }
                String sb2 = sb.toString();
                String encodedPath = parse.getEncodedPath();
                if (map != null) {
                    String encodedQuery = parse.getEncodedQuery();
                    if (encodedQuery != null) {
                        for (String str2 : encodedQuery.split("&")) {
                            int indexOf = str2.indexOf("=");
                            if (indexOf >= 0) {
                                map.put(URLDecoder.decode(str2.substring(0, indexOf), "UTF-8"), URLDecoder.decode(str2.substring(indexOf + 1), "UTF-8"));
                            } else {
                                map.put(URLDecoder.decode(str2, "UTF-8"), "");
                            }
                        }
                    }
                }
                return new Pair<>(sb2, encodedPath);
            } catch (Throwable unused) {
                throw new IOException("parseUrl url is fail !!!");
            }
        } else {
            throw new IOException("parseUrl url is null !!!");
        }
    }

    /* renamed from: b */
    public static Pair<String, String> m19878b(String str, Map<String, List<String>> map) throws IOException {
        String[] split;
        if (!C9431p.m18664a(str)) {
            try {
                Uri parse = Uri.parse(str);
                StringBuilder sb = new StringBuilder();
                String scheme = parse.getScheme();
                String host = parse.getHost();
                int port = parse.getPort();
                if (host != null) {
                    if (scheme != null) {
                        sb.append(scheme);
                        sb.append("://");
                    }
                    sb.append(host);
                    if (port > 0) {
                        sb.append(':');
                        sb.append(port);
                    }
                }
                String sb2 = sb.toString();
                String encodedPath = parse.getEncodedPath();
                String encodedQuery = parse.getEncodedQuery();
                if (encodedQuery != null) {
                    for (String str2 : encodedQuery.split("&")) {
                        int indexOf = str2.indexOf("=");
                        if (indexOf >= 0) {
                            String decode = URLDecoder.decode(str2.substring(0, indexOf), "UTF-8");
                            List list = (List) map.get(decode);
                            if (list == null) {
                                list = new LinkedList();
                            }
                            list.add(URLDecoder.decode(str2.substring(indexOf + 1), "UTF-8"));
                            map.put(decode, list);
                        } else {
                            String decode2 = URLDecoder.decode(str2, "UTF-8");
                            List list2 = (List) map.get(decode2);
                            if (list2 == null) {
                                list2 = new LinkedList();
                            }
                            list2.add("");
                            map.put(decode2, list2);
                        }
                    }
                }
                return new Pair<>(sb2, encodedPath);
            } catch (Throwable unused) {
                throw new IOException("parseUrl url is fail !!!");
            }
        } else {
            throw new IOException("parseUrl url is null !!!");
        }
    }
}

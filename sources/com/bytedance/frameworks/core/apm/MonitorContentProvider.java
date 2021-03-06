package com.bytedance.frameworks.core.apm;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.core.SpPair;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.frameworks.core.apm.p581b.C9940a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MonitorContentProvider extends ContentProvider {

    /* renamed from: a */
    public static String f26998a;

    /* renamed from: b */
    private final Map<String, SQLiteOpenHelper> f26999b = new HashMap();

    public String getType(Uri uri) {
        return null;
    }

    public boolean onCreate() {
        StringBuilder sb = new StringBuilder();
        sb.append(getContext().getPackageName());
        sb.append(".apm");
        f26998a = sb.toString();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.util.Pair<android.content.SharedPreferences, java.lang.String> m19911b(android.net.Uri r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.List r7 = r7.getPathSegments()     // Catch:{ all -> 0x0041 }
            r0 = 0
            if (r7 == 0) goto L_0x003f
            int r1 = r7.size()     // Catch:{ all -> 0x0041 }
            r2 = 2
            if (r1 < r2) goto L_0x003f
            java.lang.String r1 = "sp"
            r3 = 0
            java.lang.Object r4 = r7.get(r3)     // Catch:{ all -> 0x0041 }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x003f
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0041 }
            android.content.Context r4 = r6.getContext()     // Catch:{ all -> 0x0041 }
            r5 = 1
            java.lang.Object r5 = r7.get(r5)     // Catch:{ all -> 0x0041 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0041 }
            android.content.SharedPreferences r3 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r4, r5, r3)     // Catch:{ all -> 0x0041 }
            int r4 = r7.size()     // Catch:{ all -> 0x0041 }
            if (r4 <= r2) goto L_0x003a
            java.lang.Object r7 = r7.get(r2)     // Catch:{ all -> 0x0041 }
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0041 }
        L_0x003a:
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0041 }
            monitor-exit(r6)
            return r1
        L_0x003f:
            monitor-exit(r6)
            return r0
        L_0x0041:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.apm.MonitorContentProvider.m19911b(android.net.Uri):android.util.Pair");
    }

    /* renamed from: a */
    private synchronized Pair<SQLiteDatabase, String> m19909a(Uri uri) {
        try {
            List pathSegments = uri.getPathSegments();
            if (pathSegments != null && pathSegments.size() >= 2) {
                String str = (String) pathSegments.get(0);
                String str2 = (String) pathSegments.get(1);
                if (str == null) {
                    return null;
                }
                SQLiteOpenHelper sQLiteOpenHelper = (SQLiteOpenHelper) this.f26999b.get(str);
                if (sQLiteOpenHelper == null) {
                    if (!str.contains("apm_monitor_t1.db")) {
                        return null;
                    }
                    sQLiteOpenHelper = new C9940a(getContext(), str);
                    this.f26999b.put(str, sQLiteOpenHelper);
                }
                return new Pair<>(sQLiteOpenHelper.getWritableDatabase(), str2);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Pair a = m19909a(uri);
        if (a == null) {
            return null;
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) a.first;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            long insert = sQLiteDatabase.insert((String) a.second, null, contentValues);
            if (insert >= 0) {
                return ContentUris.withAppendedId(uri, insert);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static void m19910a(SharedPreferences sharedPreferences, Bundle bundle) {
        Editor edit = sharedPreferences.edit();
        if (bundle.getBoolean("clear")) {
            edit.clear();
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("edit");
        if (parcelableArrayList != null) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                SpPair spPair = (SpPair) it.next();
                if (spPair.f24469b == null) {
                    edit.remove(spPair.f24468a);
                } else {
                    String str = spPair.f24468a;
                    Object obj = spPair.f24469b;
                    if (obj instanceof String) {
                        edit.putString(str, (String) obj);
                    } else if (obj instanceof Integer) {
                        edit.putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        edit.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Float) {
                        edit.putFloat(str, ((Float) obj).floatValue());
                    } else if (obj instanceof Boolean) {
                        edit.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof String[]) {
                        edit.putStringSet(str, new HashSet(Arrays.asList((String[]) obj)));
                    }
                }
            }
            edit.apply();
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        Pair a = m19909a(uri);
        if (a == null) {
            return -1;
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) a.first;
        if (sQLiteDatabase == null) {
            return -1;
        }
        try {
            return sQLiteDatabase.delete((String) a.second, str, strArr);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static Bundle m19908a(SharedPreferences sharedPreferences, String str, Object obj) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            for (Entry entry : sharedPreferences.getAll().entrySet()) {
                arrayList.add(new SpPair((String) entry.getKey(), entry.getValue()));
            }
            bundle.putParcelableArrayList("sp", arrayList);
        } else {
            Object obj2 = sharedPreferences.getAll().get(str);
            if (obj2 == null) {
                obj2 = obj;
            }
            if (obj2 instanceof Set) {
                obj2 = C9190h.m18254a((Set) obj2);
            }
            arrayList.add(new SpPair(str, obj2));
            bundle.putParcelableArrayList("sp", arrayList);
        }
        return bundle;
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        if ("getPid".equals(str)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("Pid", Process.myPid());
            return bundle2;
        }
        Uri.parse(str);
        Pair b = m19911b(Uri.parse(str));
        Object obj = null;
        if (b == null) {
            return null;
        }
        if ("query".equals(str2)) {
            if (bundle != null) {
                SpPair spPair = (SpPair) bundle.getParcelable("sp");
                if (spPair != null) {
                    obj = spPair.f24469b;
                }
            }
            return m19908a((SharedPreferences) b.first, (String) b.second, obj);
        } else if ("contains".equals(str2)) {
            SharedPreferences sharedPreferences = (SharedPreferences) b.first;
            String str3 = (String) b.second;
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("contains", sharedPreferences.contains(str3));
            return bundle3;
        } else {
            if ("edit".equals(str2) && bundle != null) {
                m19910a((SharedPreferences) b.first, bundle);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static Cursor m19907a(Context context, Uri uri, String str, String[] strArr) {
        try {
            return context.getContentResolver().query(uri, null, str, strArr, "rawQuery");
        } catch (Exception unused) {
            return null;
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Pair a = m19909a(uri);
        if (a == null) {
            return -1;
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) a.first;
        if (sQLiteDatabase == null) {
            return -1;
        }
        try {
            return sQLiteDatabase.update((String) a.second, contentValues, str, strArr);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String[] split;
        Pair a = m19909a(uri);
        if (a == null) {
            return null;
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) a.first;
        if (sQLiteDatabase == null) {
            return null;
        }
        if (TextUtils.equals(str2, "rawQuery")) {
            return sQLiteDatabase.rawQuery(str, strArr2);
        }
        if (TextUtils.equals(str2, "execSQL")) {
            for (String str3 : str.split(";")) {
                if (!TextUtils.isEmpty(str3)) {
                    sQLiteDatabase.execSQL(str3);
                }
            }
            return null;
        }
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables((String) a.second);
        return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str, strArr2, null, null, str2);
    }
}

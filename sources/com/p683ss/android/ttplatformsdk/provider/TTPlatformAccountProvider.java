package com.p683ss.android.ttplatformsdk.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.ttplatformsdk.p1222a.C20056b;

/* renamed from: com.ss.android.ttplatformsdk.provider.TTPlatformAccountProvider */
public class TTPlatformAccountProvider extends ContentProvider {

    /* renamed from: a */
    private static final UriMatcher f55138a = new UriMatcher(-1);

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        UriMatcher uriMatcher = f55138a;
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(".ttplatformapi.AccountProvider");
        uriMatcher.addURI(sb.toString(), "account", 1);
        return true;
    }

    public String getType(Uri uri) {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName) || f55138a.match(uri) != 1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(".ttplatformapi.AccountProvider");
        return sb.toString();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        boolean z = true;
        if (f55138a.match(uri) == 1) {
            String asString = contentValues.getAsString("user_name");
            String asString2 = contentValues.getAsString("user_avatar");
            Boolean asBoolean = contentValues.getAsBoolean("is_login");
            Context context = getContext();
            if (context != null) {
                if (TextUtils.isEmpty(asString)) {
                    asString = "";
                }
                C20056b.m49541a(context, "platform_user_name", asString);
                if (TextUtils.isEmpty(asString2)) {
                    asString2 = "";
                }
                C20056b.m49541a(context, "platform_user_avatar", asString2);
                if (asBoolean == null || !asBoolean.booleanValue()) {
                    z = false;
                }
                C20056b.m49540a(context);
                Editor edit = C20056b.f55122a.f55120a.edit();
                edit.putBoolean("platform_is_login", z);
                edit.commit();
            }
        }
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"user_name", "user_avatar", "is_login", "support_open_sdk_api"}, 1);
        if (f55138a.match(uri) == 1) {
            Context context = getContext();
            if (context != null) {
                matrixCursor.addRow(new Object[]{C20056b.m49543b(context, "platform_user_name", ""), C20056b.m49543b(context, "platform_user_avatar", ""), Integer.valueOf(C20056b.m49542a(context, "platform_is_login", Boolean.valueOf(false)) ? 1 : 0), Integer.valueOf(6430000)});
            }
        }
        return matrixCursor;
    }
}

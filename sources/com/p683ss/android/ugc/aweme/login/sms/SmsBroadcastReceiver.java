package com.p683ss.android.ugc.aweme.login.sms;

import android.arch.lifecycle.C0198r;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.login.sms.SmsBroadcastReceiver */
public class SmsBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private C0198r<String> f92922a;

    public void onReceive(Context context, Intent intent) {
        if (TextUtils.equals("com.google.android.gms.auth.api.phone.SMS_RETRIEVED", intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).f39272g == 0) {
                Matcher matcher = Pattern.compile("[0-9]{4,}").matcher((String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"));
                if (matcher.find()) {
                    String group = matcher.group(0);
                    if (!TextUtils.isEmpty(group)) {
                        this.f92922a.setValue(group);
                    }
                }
            }
        }
    }
}

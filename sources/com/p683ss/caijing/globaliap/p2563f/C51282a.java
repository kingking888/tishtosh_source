package com.p683ss.caijing.globaliap.p2563f;

import java.util.HashMap;

/* renamed from: com.ss.caijing.globaliap.f.a */
public final class C51282a {
    /* renamed from: a */
    public static void m110243a(String str, String str2, String str3, boolean z) {
        String str4;
        HashMap hashMap = new HashMap();
        hashMap.put("params_for_special", "caijing_pay_casher");
        hashMap.put("app_id", str);
        hashMap.put("merchant_id", str2);
        hashMap.put("amount", str3);
        String str5 = "result";
        if (z) {
            str4 = "success";
        } else {
            str4 = "fail";
        }
        hashMap.put(str5, str4);
        hashMap.put("platform", "googlepay");
        C51284c.m110260a("caijing_iap_order_create_to_caijing", hashMap);
    }

    /* renamed from: a */
    public static void m110242a(String str, String str2, long j, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("params_for_special", "caijing_pay_casher");
        hashMap.put("app_id", str);
        hashMap.put("merchant_id", str2);
        hashMap.put("amount", Long.valueOf(j).toString());
        if (z) {
            hashMap.put("result", "success");
        } else if (z2) {
            hashMap.put("result", "cancel");
        } else {
            hashMap.put("result", "fail");
        }
        hashMap.put("platform", "googlepay");
        C51284c.m110260a("caijing_iap_charge_request_result", hashMap);
    }
}

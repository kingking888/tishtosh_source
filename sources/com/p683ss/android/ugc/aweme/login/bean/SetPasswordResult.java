package com.p683ss.android.ugc.aweme.login.bean;

/* renamed from: com.ss.android.ugc.aweme.login.bean.SetPasswordResult */
public class SetPasswordResult {
    private DataBean data;
    private String message;

    /* renamed from: com.ss.android.ugc.aweme.login.bean.SetPasswordResult$DataBean */
    public static class DataBean {
    }

    public DataBean getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}

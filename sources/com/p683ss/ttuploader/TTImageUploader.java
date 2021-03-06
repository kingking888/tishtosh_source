package com.p683ss.ttuploader;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.p683ss.ttuploader.net.TTUploadDNSParser;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.TTImageUploader */
public class TTImageUploader implements Callback {
    private static boolean IsErrored = true;
    int currentType;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private int mImageNum;
    private TTImageUploaderListener mListener = null;
    private final ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private long mSartTime;
    private int mState = -1;
    private final WriteLock mWriteLock;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.ss.ttuploader.TTImageUploader$Type */
    public @interface Type {
    }

    private static native long _getLongValue(long j, int i);

    private static native void _imageUploaderClose(long j);

    private final native long _imageUploaderCreate(int i);

    private static native String _imageUploaderGetImageMetaInfo(long j, int i);

    private static native String _imageUploaderGetImageUri(long j, int i);

    private static native String _imageUploaderGetStringValue(long j, int i);

    private static native void _imageUploaderSetFileName(long j, int i, String[] strArr);

    private static native void _imageUploaderSetFilePath(long j, int i, String[] strArr);

    private static native void _imageUploaderSetIntValue(long j, int i, int i2);

    private static native void _imageUploaderSetStringValue(long j, int i, String str);

    private static native void _imageUploaderStart(long j);

    private static native String _imageUploaderStop(long j);

    private static native void _setInt64Value(long j, int i, long j2);

    private static native void _setObject(long j, int i, Object obj);

    public static boolean isError() {
        return IsErrored;
    }

    public String getDNSIP() {
        return TTUploadUtil.getDNSServerIP();
    }

    static {
        if (!TTUploadUtil.initInternal()) {
        }
    }

    public void close() {
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                _imageUploaderClose(this.mHandle);
                this.mHandle = 0;
                this.mState = 5;
                this.mHandler.removeCallbacksAndMessages(null);
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void start() {
        this.mReadLock.lock();
        try {
            if (this.mHandle != 0) {
                this.mState = 1;
                this.mSartTime = System.currentTimeMillis();
                _imageUploaderStart(this.mHandle);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void stop() {
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                addLogToManager(_imageUploaderStop(this.mHandle));
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public TTImageUploader() throws Exception {
        if (IsErrored) {
            TTUploadUtil.initInternal();
        }
        try {
            this.mHandle = _imageUploaderCreate(0);
        } catch (Throwable unused) {
            this.mHandle = 0;
        }
        if (this.mHandle != 0) {
            if (Looper.myLooper() != null) {
                this.mHandler = new Handler(this);
            } else {
                this.mHandler = new Handler(Looper.getMainLooper(), this);
            }
            this.mReadLock = this.mReadWritedLock.readLock();
            this.mWriteLock = this.mReadWritedLock.writeLock();
            this.mState = 0;
            getDNSIP();
            return;
        }
        throw new Exception("create native uploader fail");
    }

    public void setCurrentType(int i) {
        this.currentType = i;
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(TTImageUploaderListener tTImageUploaderListener) {
        this.mListener = tTImageUploaderListener;
    }

    public void setFileUploadDomain(String str) {
        setStringValue(2, str);
    }

    public void setImageUploadDomain(String str) {
        setStringValue(3, str);
    }

    public void setObjectType(String str) {
        setStringValue(54, str);
    }

    public void setProcessAction(String str) {
        setStringValue(65, str);
    }

    public void setUploadCookie(String str) {
        setStringValue(4, str);
    }

    public void setUserKey(String str) {
        setStringValue(1, str);
    }

    private void setDeviceID(long j) {
        if (this.mHandle != 0 && j > 0) {
            _setInt64Value(this.mHandle, 66, j);
        }
    }

    private void setTraceId(String str) {
        if (this.mHandle != 0 && str != null && !str.isEmpty()) {
            _imageUploaderSetStringValue(this.mHandle, 69, str);
        }
    }

    public void extraParams(JSONObject jSONObject) {
        if (this.mHandle != 0 && jSONObject != null) {
            String jSONObject2 = jSONObject.toString();
            if (jSONObject2 != null) {
                setStringValue(61, jSONObject2);
            }
        }
    }

    public boolean handleMessage(Message message) {
        long j;
        int i = message.what;
        if (this.mListener == null) {
            return true;
        }
        TTImageInfo tTImageInfo = (TTImageInfo) message.obj;
        if (tTImageInfo != null) {
            j = tTImageInfo.mProgress;
        } else {
            j = 0;
        }
        this.mListener.onNotify(i, j, tTImageInfo);
        return true;
    }

    public void setAuthorization(String str) {
        if (this.mHandle != 0 && str != null) {
            _imageUploaderSetStringValue(this.mHandle, 15, str);
        }
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        if (this.mHandle != 0 && treeMap != null) {
            String mapToString = TTUploadUtil.mapToString(treeMap);
            if (mapToString != null) {
                setStringValue(56, mapToString);
            }
        }
    }

    public void setEnableHttps(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _imageUploaderSetIntValue(this.mHandle, 19, i);
        }
    }

    public void setFileRetryCount(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _imageUploaderSetIntValue(this.mHandle, 6, i);
        }
    }

    public void setMaxFailTime(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _imageUploaderSetIntValue(this.mHandle, 13, i);
        }
    }

    public void setOpenBoe(boolean z) {
        if (this.mHandle != 0) {
            if (z) {
                _imageUploaderSetIntValue(this.mHandle, 67, 1);
            } else {
                _imageUploaderSetIntValue(this.mHandle, 67, 0);
            }
        }
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        if (this.mHandle != 0 && treeMap != null) {
            String mapToString = TTUploadUtil.mapToString(treeMap);
            if (mapToString != null) {
                setStringValue(55, mapToString);
            }
        }
    }

    public void setPreUpload(boolean z) {
        if (this.mHandle != 0) {
            _imageUploaderSetIntValue(this.mHandle, 80, z ? 1 : 0);
        }
    }

    public void setServerParameter(String str) {
        if (this.mHandle != 0 && str != null) {
            _imageUploaderSetStringValue(this.mHandle, 16, str);
        }
    }

    public void setSliceReTryCount(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _imageUploaderSetIntValue(this.mHandle, 5, i);
        }
    }

    public void setSliceSize(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _imageUploaderSetIntValue(this.mHandle, 8, i);
        }
    }

    public void setSliceTimeout(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _imageUploaderSetIntValue(this.mHandle, 7, i);
        }
    }

    public void setSocketNum(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _imageUploaderSetIntValue(this.mHandle, 9, i);
        }
    }

    public void setTranTimeOutUnit(int i) {
        if (this.mHandle != 0 && i > 0) {
            _imageUploaderSetIntValue(this.mHandle, 64, i);
        }
    }

    public void addLogToManager(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("dns_version", TTUploadResolver.mDNSVersion);
            jSONObject.put("main_dns_type", TTUploadDNSParser.mGlobalMainType);
            jSONObject.put("main_back_type", TTUploadDNSParser.mGlobalBackType);
            jSONObject.put("back_delayed_time", TTUploadDNSParser.mGlobalBackUpDelayedTime);
            jSONObject.put("expired_time", TTUploadDNSParser.mGlobalDefaultExpiredTime);
        } catch (Exception unused) {
            jSONObject = null;
        }
        UploadEventManager.instance.addImageEvent(jSONObject);
    }

    public void setCustomConfig(TreeMap<String, Object> treeMap) {
        if (this.mHandle != 0 && treeMap != null) {
            JSONObject mapToJSON = TTUploadUtil.mapToJSON(treeMap);
            if (mapToJSON != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("custom_config", mapToJSON);
                    String jSONObject2 = jSONObject.toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        setStringValue(63, jSONObject2);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void setTraceIDConfig(Map<Object, Object> map) {
        if (map.get(Integer.valueOf(69)) == null || !(map.get(Integer.valueOf(69)) instanceof String)) {
            if (map.get(Integer.valueOf(66)) != null && (map.get(Integer.valueOf(66)) instanceof Long)) {
                long longValue = ((Long) map.get(Integer.valueOf(66))).longValue();
                if (longValue > 0) {
                    setDeviceID(longValue);
                }
            }
            return;
        }
        String str = (String) map.get(Integer.valueOf(69));
        if (str != null && !str.isEmpty()) {
            setTraceId(str);
        }
    }

    public void setUploadToken(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(str.getBytes(), 2)));
                String string = jSONObject.getString("ApplyUploadToken");
                String string2 = jSONObject.getString("CommitUploadToken");
                if (string != null && !string.isEmpty()) {
                    setStringValue(83, string);
                }
                if (string2 != null && !string2.isEmpty()) {
                    setStringValue(84, string2);
                }
            } catch (JSONException unused) {
            }
        }
    }

    public TTImageUploader(int i) throws Exception {
        setCurrentType(i);
        try {
            this.mHandle = _imageUploaderCreate(i);
        } catch (Throwable unused) {
            this.mHandle = 0;
        }
        if (this.mHandle != 0) {
            if (Looper.myLooper() != null) {
                this.mHandler = new Handler(this);
            } else {
                this.mHandler = new Handler(Looper.getMainLooper(), this);
            }
            this.mReadLock = this.mReadWritedLock.readLock();
            this.mWriteLock = this.mReadWritedLock.writeLock();
            this.mState = 0;
            getDNSIP();
            return;
        }
        throw new Exception("create native uploader fail");
    }

    public int checkNet(int i, int i2) {
        return this.mListener == null ? 1 : 1;
    }

    public void setFileName(int i, String[] strArr) {
        if (this.mHandle != 0 && strArr != null && i > 0) {
            _imageUploaderSetFileName(this.mHandle, i, strArr);
        }
    }

    public void setFilePath(int i, String[] strArr) {
        if (this.mHandle != 0 && strArr != null && i > 0) {
            this.mImageNum = i;
            _imageUploaderSetFilePath(this.mHandle, i, strArr);
            _imageUploaderSetIntValue(this.mHandle, 81, 0);
        }
    }

    public void setStringValue(int i, String str) {
        if (this.mHandle != 0 && str != null) {
            _imageUploaderSetStringValue(this.mHandle, i, str);
        }
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader, int i) {
        if (this.mHandle != 0 && tTMediaDataReader != null && i > 0) {
            _imageUploaderSetIntValue(this.mHandle, 71, i);
            _setObject(this.mHandle, 201, tTMediaDataReader);
            _imageUploaderSetIntValue(this.mHandle, 81, 2);
        }
    }

    public void onLogInfo(int i, int i2, String str) {
        if (this.mListener != null) {
        }
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader, int i, int i2) {
        if (this.mHandle != 0 && tTMediaDataReader != null && i > 0) {
            setMediaDataReader(tTMediaDataReader, i);
            _imageUploaderSetIntValue(this.mHandle, 81, i2);
        }
    }

    public void onNotify(int i, long j, int i2) {
        int i3 = i;
        int i4 = i2;
        if (this.mState == 1) {
            TTImageInfo tTImageInfo = null;
            int i5 = (int) j;
            switch (i3) {
                case 0:
                    String dnsip = getDNSIP();
                    if (dnsip != null && !dnsip.isEmpty()) {
                        setStringValue(75, dnsip);
                    }
                    addLogToManager(_imageUploaderGetStringValue(this.mHandle, 100));
                    this.mState = 3;
                    break;
                case 1:
                    tTImageInfo = new TTImageInfo(null, (long) i4, i5, null);
                    break;
                case 2:
                    String dnsip2 = getDNSIP();
                    if (dnsip2 != null && !dnsip2.isEmpty()) {
                        setStringValue(75, dnsip2);
                    }
                    addLogToManager(_imageUploaderGetStringValue(this.mHandle, 100));
                    this.mState = 2;
                    break;
                case 3:
                    this.mEndTime = System.currentTimeMillis();
                    String _imageUploaderGetStringValue = _imageUploaderGetStringValue(this.mHandle, 51);
                    String _imageUploaderGetStringValue2 = _imageUploaderGetStringValue(this.mHandle, 50);
                    String _imageUploaderGetStringValue3 = _imageUploaderGetStringValue(this.mHandle, 52);
                    String _imageUploaderGetStringValue4 = _imageUploaderGetStringValue(this.mHandle, 53);
                    String _imageUploaderGetStringValue5 = _imageUploaderGetStringValue(this.mHandle, 57);
                    String _imageUploaderGetStringValue6 = _imageUploaderGetStringValue(this.mHandle, 58);
                    String _imageUploaderGetImageUri = _imageUploaderGetImageUri(this.mHandle, i5);
                    String _imageUploaderGetImageMetaInfo = _imageUploaderGetImageMetaInfo(this.mHandle, i5);
                    String _imageUploaderGetStringValue7 = _imageUploaderGetStringValue(this.mHandle, 59);
                    if (this.currentType != 1) {
                        tTImageInfo = new TTImageInfo(_imageUploaderGetImageUri, 0, i5, _imageUploaderGetImageMetaInfo);
                        break;
                    } else {
                        tTImageInfo = new TTImageInfo(_imageUploaderGetStringValue, _imageUploaderGetStringValue2, _imageUploaderGetStringValue3, _imageUploaderGetStringValue4, _imageUploaderGetImageUri, _imageUploaderGetStringValue5, _imageUploaderGetStringValue6, _imageUploaderGetStringValue7, 0, i5);
                        break;
                    }
                case 4:
                    tTImageInfo = new TTImageInfo(null, (long) i4, i5, null);
                    break;
            }
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.what = i3;
            obtainMessage.obj = tTImageInfo;
            obtainMessage.sendToTarget();
        }
    }
}

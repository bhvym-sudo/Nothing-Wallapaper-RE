package com.nothing.wallpaper.picker.creative.network;

import androidx.annotation.Keep;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class ResponseData<T> {
    private final int code;
    private final T data;
    private final String msg;

    public ResponseData(int i10, String msg, T t9) {
        n.h(msg, "msg");
        this.code = i10;
        this.msg = msg;
        this.data = t9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResponseData copy$default(ResponseData responseData, int i10, String str, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            i10 = responseData.code;
        }
        if ((i11 & 2) != 0) {
            str = responseData.msg;
        }
        if ((i11 & 4) != 0) {
            obj = responseData.data;
        }
        return responseData.copy(i10, str, obj);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.msg;
    }

    public final T component3() {
        return this.data;
    }

    public final ResponseData<T> copy(int i10, String msg, T t9) {
        n.h(msg, "msg");
        return new ResponseData<>(i10, msg, t9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseData)) {
            return false;
        }
        ResponseData responseData = (ResponseData) obj;
        return this.code == responseData.code && n.d(this.msg, responseData.msg) && n.d(this.data, responseData.data);
    }

    public final int getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.code) * 31) + this.msg.hashCode()) * 31;
        T t9 = this.data;
        return iHashCode + (t9 == null ? 0 : t9.hashCode());
    }

    public String toString() {
        return "ResponseData(code=" + this.code + ", msg=" + this.msg + ", data=" + this.data + ")";
    }
}

package com.nothing.cardservice;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.q;
import p079h8.r;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class ShareStickerInfo implements Parcelable {

    @SerializedName("extend")
    private String extend;

    @SerializedName("id")
    private final String id;

    @SerializedName("paddingGap")
    private float paddingGap;

    @SerializedName("percentX")
    private final float percentX;

    @SerializedName("percentY")
    private final float percentY;

    @SerializedName("stickName")
    private final String stickName;
    public static final a Companion = new a(null);
    public static final Parcelable.Creator<ShareStickerInfo> CREATOR = new b();

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final ShareStickerInfo a(String jsonStr) {
            Object objB;
            n.h(jsonStr, "jsonStr");
            try {
                q.a aVar = q.f21862r;
                objB = q.b((ShareStickerInfo) new Gson().fromJson(jsonStr, ShareStickerInfo.class));
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                objB = q.b(r.a(th));
            }
            Throwable thD = q.d(objB);
            if (thD != null) {
                Log.d("StickImageInfoBean", "createStickImageBeanFromJson error:" + thD);
            }
            if (q.f(objB)) {
                objB = null;
            }
            return (ShareStickerInfo) objB;
        }

        private a() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShareStickerInfo createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            return new ShareStickerInfo(parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ShareStickerInfo[] newArray(int i10) {
            return new ShareStickerInfo[i10];
        }
    }

    public ShareStickerInfo(String id, String stickName, float f10, float f11, float f12, String extend) {
        n.h(id, "id");
        n.h(stickName, "stickName");
        n.h(extend, "extend");
        this.id = id;
        this.stickName = stickName;
        this.percentX = f10;
        this.percentY = f11;
        this.paddingGap = f12;
        this.extend = extend;
    }

    public static /* synthetic */ ShareStickerInfo copy$default(ShareStickerInfo shareStickerInfo, String str, String str2, float f10, float f11, float f12, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = shareStickerInfo.id;
        }
        if ((i10 & 2) != 0) {
            str2 = shareStickerInfo.stickName;
        }
        if ((i10 & 4) != 0) {
            f10 = shareStickerInfo.percentX;
        }
        if ((i10 & 8) != 0) {
            f11 = shareStickerInfo.percentY;
        }
        if ((i10 & 16) != 0) {
            f12 = shareStickerInfo.paddingGap;
        }
        if ((i10 & 32) != 0) {
            str3 = shareStickerInfo.extend;
        }
        float f13 = f12;
        String str4 = str3;
        return shareStickerInfo.copy(str, str2, f10, f11, f13, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.stickName;
    }

    public final float component3() {
        return this.percentX;
    }

    public final float component4() {
        return this.percentY;
    }

    public final float component5() {
        return this.paddingGap;
    }

    public final String component6() {
        return this.extend;
    }

    public final ShareStickerInfo copy(String id, String stickName, float f10, float f11, float f12, String extend) {
        n.h(id, "id");
        n.h(stickName, "stickName");
        n.h(extend, "extend");
        return new ShareStickerInfo(id, stickName, f10, f11, f12, extend);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareStickerInfo)) {
            return false;
        }
        ShareStickerInfo shareStickerInfo = (ShareStickerInfo) obj;
        return n.d(this.id, shareStickerInfo.id) && n.d(this.stickName, shareStickerInfo.stickName) && Float.compare(this.percentX, shareStickerInfo.percentX) == 0 && Float.compare(this.percentY, shareStickerInfo.percentY) == 0 && Float.compare(this.paddingGap, shareStickerInfo.paddingGap) == 0 && n.d(this.extend, shareStickerInfo.extend);
    }

    public final String getExtend() {
        return this.extend;
    }

    public final String getId() {
        return this.id;
    }

    public final String getJsonStr() {
        String json = new Gson().toJson(this);
        n.g(json, "toJson(...)");
        return json;
    }

    public final float getPaddingGap() {
        return this.paddingGap;
    }

    public final float getPercentX() {
        return this.percentX;
    }

    public final float getPercentY() {
        return this.percentY;
    }

    public final String getStickName() {
        return this.stickName;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.stickName.hashCode()) * 31) + Float.hashCode(this.percentX)) * 31) + Float.hashCode(this.percentY)) * 31) + Float.hashCode(this.paddingGap)) * 31) + this.extend.hashCode();
    }

    public final void setExtend(String str) {
        n.h(str, "<set-?>");
        this.extend = str;
    }

    public final void setPaddingGap(float f10) {
        this.paddingGap = f10;
    }

    public String toString() {
        return "ShareStickerInfo(id=" + this.id + ", stickName=" + this.stickName + ", percentX=" + this.percentX + ", percentY=" + this.percentY + ", paddingGap=" + this.paddingGap + ", extend=" + this.extend + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.stickName);
        dest.writeFloat(this.percentX);
        dest.writeFloat(this.percentY);
        dest.writeFloat(this.paddingGap);
        dest.writeString(this.extend);
    }

    public /* synthetic */ ShareStickerInfo(String str, String str2, float f10, float f11, float f12, String str3, int i10, AbstractC1457h abstractC1457h) {
        this(str, str2, f10, f11, (i10 & 16) != 0 ? 0.0f : f12, (i10 & 32) != 0 ? "" : str3);
    }
}

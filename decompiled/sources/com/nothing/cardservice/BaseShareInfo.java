package com.nothing.cardservice;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class BaseShareInfo implements Parcelable {
    public static final Parcelable.Creator<BaseShareInfo> CREATOR = new a();
    private String accountId;
    private int cardId;
    private String creator;
    private boolean isAdded;
    private int loginState;
    private String receiver;
    private String shareId;
    private String shareLocation;
    private int shareState;
    private int shareType;
    private String timeStamp;
    private String widgetConfig;
    private int widgetId;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseShareInfo createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            return new BaseShareInfo(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BaseShareInfo[] newArray(int i10) {
            return new BaseShareInfo[i10];
        }
    }

    public BaseShareInfo() {
        this(null, 0, 0, 0, 0, null, null, false, null, null, null, null, 0, 8191, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final int getCardId() {
        return this.cardId;
    }

    public final int getCombineLoginState() {
        int i10 = this.loginState;
        if ((i10 & 8) != 0) {
            return 8;
        }
        return i10;
    }

    public final String getCreator() {
        return this.creator;
    }

    public final int getLoginState() {
        return this.loginState;
    }

    public final String getReceiver() {
        return this.receiver;
    }

    public final String getShareId() {
        return this.shareId;
    }

    public final String getShareLocation() {
        return this.shareLocation;
    }

    public final int getShareState() {
        return this.shareState;
    }

    public final int getShareType() {
        return this.shareType;
    }

    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public final String getWidgetConfig() {
        return this.widgetConfig;
    }

    public final int getWidgetId() {
        return this.widgetId;
    }

    public final boolean isAdded() {
        return this.isAdded;
    }

    public final void setAccountId(String str) {
        this.accountId = str;
    }

    public final void setAdded(boolean z9) {
        this.isAdded = z9;
    }

    public final void setCardId(int i10) {
        this.cardId = i10;
    }

    public final void setCreator(String str) {
        this.creator = str;
    }

    public final void setLoginState(int i10) {
        this.loginState = i10;
    }

    public final void setReceiver(String str) {
        this.receiver = str;
    }

    public final void setShareId(String str) {
        n.h(str, "<set-?>");
        this.shareId = str;
    }

    public final void setShareLocation(String str) {
        this.shareLocation = str;
    }

    public final void setShareState(int i10) {
        this.shareState = i10;
    }

    public final void setShareType(int i10) {
        this.shareType = i10;
    }

    public final void setTimeStamp(String str) {
        n.h(str, "<set-?>");
        this.timeStamp = str;
    }

    public final void setWidgetConfig(String str) {
        this.widgetConfig = str;
    }

    public final void setWidgetId(int i10) {
        this.widgetId = i10;
    }

    public String toString() {
        return "{shareId = " + this.shareId + ", widgetId = " + this.widgetId + ", cardId = " + this.cardId + ", shareType = " + this.shareType + ", shareState = " + this.shareState + ", creator = " + this.creator + ", receiver = " + this.receiver + ", isAdded = " + this.isAdded + ", shareLocation = " + this.shareLocation + ", accountId = " + this.accountId + "}, loginState:" + this.loginState;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeString(this.shareId);
        dest.writeInt(this.widgetId);
        dest.writeInt(this.cardId);
        dest.writeInt(this.shareType);
        dest.writeInt(this.shareState);
        dest.writeString(this.creator);
        dest.writeString(this.receiver);
        dest.writeInt(this.isAdded ? 1 : 0);
        dest.writeString(this.shareLocation);
        dest.writeString(this.timeStamp);
        dest.writeString(this.widgetConfig);
        dest.writeString(this.accountId);
        dest.writeInt(this.loginState);
    }

    public BaseShareInfo(String shareId, int i10, int i11, int i12, int i13, String str, String str2, boolean z9, String str3, String timeStamp, String str4, String str5, int i14) {
        n.h(shareId, "shareId");
        n.h(timeStamp, "timeStamp");
        this.shareId = shareId;
        this.widgetId = i10;
        this.cardId = i11;
        this.shareType = i12;
        this.shareState = i13;
        this.creator = str;
        this.receiver = str2;
        this.isAdded = z9;
        this.shareLocation = str3;
        this.timeStamp = timeStamp;
        this.widgetConfig = str4;
        this.accountId = str5;
        this.loginState = i14;
    }

    public /* synthetic */ BaseShareInfo(String str, int i10, int i11, int i12, int i13, String str2, String str3, boolean z9, String str4, String str5, String str6, String str7, int i14, int i15, AbstractC1457h abstractC1457h) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? 0 : i10, (i15 & 4) != 0 ? 0 : i11, (i15 & 8) != 0 ? 2 : i12, (i15 & 16) != 0 ? 0 : i13, (i15 & 32) != 0 ? null : str2, (i15 & 64) != 0 ? null : str3, (i15 & Optimizer.OPTIMIZATION_GRAPH_WRAP) == 0 ? z9 : false, (i15 & 256) != 0 ? null : str4, (i15 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? String.valueOf(System.currentTimeMillis()) : str5, (i15 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? null : str6, (i15 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0 ? str7 : null, (i15 & 4096) != 0 ? 1 : i14);
    }
}

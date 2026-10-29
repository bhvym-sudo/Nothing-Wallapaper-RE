package com.nothing.cardservice.bean;

import F5.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class AccountInfo implements Parcelable {
    public static final Parcelable.Creator<AccountInfo> CREATOR = new Creator();

    @SerializedName("accountId")
    private String accountId;

    @SerializedName("avatar")
    private s avatar;

    @SerializedName("email")
    private String email;

    @SerializedName("isLogin")
    private boolean isLogin;

    @SerializedName("name")
    private String name;

    @SerializedName("nothingToken")
    private String nothingToken;

    @SerializedName("region")
    private String region;

    public static final class Creator implements Parcelable.Creator<AccountInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountInfo createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            return new AccountInfo(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : s.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountInfo[] newArray(int i10) {
            return new AccountInfo[i10];
        }
    }

    public AccountInfo(String accountId, boolean z9, s sVar, String str, String str2, String str3, String str4) {
        n.h(accountId, "accountId");
        this.accountId = accountId;
        this.isLogin = z9;
        this.avatar = sVar;
        this.name = str;
        this.email = str2;
        this.region = str3;
        this.nothingToken = str4;
    }

    public static /* synthetic */ AccountInfo copy$default(AccountInfo accountInfo, String str, boolean z9, s sVar, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = accountInfo.accountId;
        }
        if ((i10 & 2) != 0) {
            z9 = accountInfo.isLogin;
        }
        if ((i10 & 4) != 0) {
            sVar = accountInfo.avatar;
        }
        if ((i10 & 8) != 0) {
            str2 = accountInfo.name;
        }
        if ((i10 & 16) != 0) {
            str3 = accountInfo.email;
        }
        if ((i10 & 32) != 0) {
            str4 = accountInfo.region;
        }
        if ((i10 & 64) != 0) {
            str5 = accountInfo.nothingToken;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        s sVar2 = sVar;
        return accountInfo.copy(str, z9, sVar2, str2, str8, str6, str7);
    }

    public final String component1() {
        return this.accountId;
    }

    public final boolean component2() {
        return this.isLogin;
    }

    public final s component3() {
        return this.avatar;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.email;
    }

    public final String component6() {
        return this.region;
    }

    public final String component7() {
        return this.nothingToken;
    }

    public final AccountInfo copy(String accountId, boolean z9, s sVar, String str, String str2, String str3, String str4) {
        n.h(accountId, "accountId");
        return new AccountInfo(accountId, z9, sVar, str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfo)) {
            return false;
        }
        AccountInfo accountInfo = (AccountInfo) obj;
        return n.d(this.accountId, accountInfo.accountId) && this.isLogin == accountInfo.isLogin && n.d(this.avatar, accountInfo.avatar) && n.d(this.name, accountInfo.name) && n.d(this.email, accountInfo.email) && n.d(this.region, accountInfo.region) && n.d(this.nothingToken, accountInfo.nothingToken);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final s getAvatar() {
        return this.avatar;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNothingToken() {
        return this.nothingToken;
    }

    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        int iHashCode = ((this.accountId.hashCode() * 31) + Boolean.hashCode(this.isLogin)) * 31;
        s sVar = this.avatar;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.region;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nothingToken;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isLogin() {
        return this.isLogin;
    }

    public final void setAccountId(String str) {
        n.h(str, "<set-?>");
        this.accountId = str;
    }

    public final void setAvatar(s sVar) {
        this.avatar = sVar;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setLogin(boolean z9) {
        this.isLogin = z9;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNothingToken(String str) {
        this.nothingToken = str;
    }

    public final void setRegion(String str) {
        this.region = str;
    }

    public String toString() {
        return "AccountInfo(accountId=" + this.accountId + ", isLogin=" + this.isLogin + ", avatar=" + this.avatar + ", name=" + this.name + ", email=" + this.email + ", region=" + this.region + ", nothingToken=" + this.nothingToken + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeString(this.accountId);
        dest.writeInt(this.isLogin ? 1 : 0);
        s sVar = this.avatar;
        if (sVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            sVar.writeToParcel(dest, i10);
        }
        dest.writeString(this.name);
        dest.writeString(this.email);
        dest.writeString(this.region);
        dest.writeString(this.nothingToken);
    }
}

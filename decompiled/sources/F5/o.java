package F5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.nothing.cardservice.BaseShareInfo;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1698q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1699r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1700s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f1701t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f1702u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f1703v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f1704w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f1705x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final p079h8.h f1706y = p079h8.i.b(new p219v8.a() { // from class: F5.n
        @Override // p219v8.a
        public final Object invoke() {
            return o.k();
        }
    });

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.n.h(parcel, "parcel");
            return new o(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o[] newArray(int i10) {
            return new o[i10];
        }
    }

    public o(int i10, int i11, int i12, String str, int i13, String str2, String str3, String str4) {
        this.f1698q = i10;
        this.f1699r = i11;
        this.f1700s = i12;
        this.f1701t = str;
        this.f1702u = i13;
        this.f1703v = str2;
        this.f1704w = str3;
        this.f1705x = str4;
    }

    private final Gson e() {
        return (Gson) this.f1706y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson k() {
        return new Gson();
    }

    public final int b() {
        return this.f1699r;
    }

    public final String c() {
        return this.f1703v;
    }

    public final String d() {
        return this.f1704w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f1698q == oVar.f1698q && this.f1699r == oVar.f1699r && this.f1700s == oVar.f1700s && kotlin.jvm.internal.n.d(this.f1701t, oVar.f1701t) && this.f1702u == oVar.f1702u && kotlin.jvm.internal.n.d(this.f1703v, oVar.f1703v) && kotlin.jvm.internal.n.d(this.f1704w, oVar.f1704w) && kotlin.jvm.internal.n.d(this.f1705x, oVar.f1705x);
    }

    public final BaseShareInfo f() {
        String str = this.f1704w;
        if (str != null) {
            return (BaseShareInfo) e().fromJson(str, BaseShareInfo.class);
        }
        return null;
    }

    public final String g() {
        return this.f1701t;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f1698q) * 31) + Integer.hashCode(this.f1699r)) * 31) + Integer.hashCode(this.f1700s)) * 31;
        String str = this.f1701t;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f1702u)) * 31;
        String str2 = this.f1703v;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1704w;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1705x;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final int j() {
        return this.f1698q;
    }

    public final boolean l() {
        return this.f1704w != null;
    }

    public final void m(String str) {
        this.f1704w = str;
    }

    public final void n(String str) {
        this.f1701t = str;
    }

    public final String o(r shareWidgetInfo) {
        kotlin.jvm.internal.n.h(shareWidgetInfo, "shareWidgetInfo");
        String json = e().toJson(shareWidgetInfo.a());
        kotlin.jvm.internal.n.g(json, "toJson(...)");
        return json;
    }

    public String toString() {
        return "CardWidgetViewInfo(widgetId=" + this.f1698q + ", cardId=" + this.f1699r + ", hostId=" + this.f1700s + ", viewJson=" + this.f1701t + ", userId=" + this.f1702u + ", ext1=" + this.f1703v + ", ext2=" + this.f1704w + ", ext3=" + this.f1705x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.h(dest, "dest");
        dest.writeInt(this.f1698q);
        dest.writeInt(this.f1699r);
        dest.writeInt(this.f1700s);
        dest.writeString(this.f1701t);
        dest.writeInt(this.f1702u);
        dest.writeString(this.f1703v);
        dest.writeString(this.f1704w);
        dest.writeString(this.f1705x);
    }
}

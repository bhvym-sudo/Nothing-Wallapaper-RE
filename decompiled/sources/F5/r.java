package F5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.nothing.cardservice.BaseShareInfo;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private String f1709A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private String f1710B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private m f1711C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f1712D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f1713E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f1714F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Bundle f1715G;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f1716q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1717r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1718s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1719t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f1720u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f1721v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f1722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f1723x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f1724y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f1725z;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f1708H = new a(null);
    public static final Parcelable.Creator<r> CREATOR = new b();

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r createFromParcel(Parcel parcel) {
            boolean z9;
            kotlin.jvm.internal.n.h(parcel, "parcel");
            String string = parcel.readString();
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z10 = false;
            if (parcel.readInt() != 0) {
                z10 = true;
                z9 = true;
            } else {
                z9 = true;
            }
            String string4 = parcel.readString();
            boolean z11 = z9;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z12 = z11;
            String string7 = parcel.readString();
            m mVar = (m) parcel.readParcelable(r.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0 ? z12 : false;
            if (parcel.readInt() == 0) {
                z12 = false;
            }
            return new r(string, i10, i11, i12, i13, string2, string3, z10, string4, string5, string6, string7, mVar, z13, z12, parcel.readInt(), parcel.readBundle(r.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final r[] newArray(int i10) {
            return new r[i10];
        }
    }

    public r(String shareId, int i10, int i11, int i12, int i13, String str, String str2, boolean z9, String str3, String timeStamp, String str4, String str5, m metaInfo, boolean z10, boolean z11, int i14, Bundle bundle) {
        kotlin.jvm.internal.n.h(shareId, "shareId");
        kotlin.jvm.internal.n.h(timeStamp, "timeStamp");
        kotlin.jvm.internal.n.h(metaInfo, "metaInfo");
        this.f1716q = shareId;
        this.f1717r = i10;
        this.f1718s = i11;
        this.f1719t = i12;
        this.f1720u = i13;
        this.f1721v = str;
        this.f1722w = str2;
        this.f1723x = z9;
        this.f1724y = str3;
        this.f1725z = timeStamp;
        this.f1709A = str4;
        this.f1710B = str5;
        this.f1711C = metaInfo;
        this.f1712D = z10;
        this.f1713E = z11;
        this.f1714F = i14;
        this.f1715G = bundle;
    }

    public final BaseShareInfo a() {
        return new BaseShareInfo(this.f1716q, this.f1717r, this.f1718s, this.f1719t, this.f1720u, this.f1721v, this.f1722w, this.f1723x, this.f1724y, this.f1725z, this.f1710B, this.f1709A, this.f1714F);
    }

    public final int b() {
        return this.f1717r;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.n.d(this.f1716q, rVar.f1716q) && this.f1717r == rVar.f1717r && this.f1718s == rVar.f1718s && this.f1719t == rVar.f1719t && this.f1720u == rVar.f1720u && kotlin.jvm.internal.n.d(this.f1721v, rVar.f1721v) && kotlin.jvm.internal.n.d(this.f1722w, rVar.f1722w) && this.f1723x == rVar.f1723x && kotlin.jvm.internal.n.d(this.f1724y, rVar.f1724y) && kotlin.jvm.internal.n.d(this.f1725z, rVar.f1725z) && kotlin.jvm.internal.n.d(this.f1709A, rVar.f1709A) && kotlin.jvm.internal.n.d(this.f1710B, rVar.f1710B) && kotlin.jvm.internal.n.d(this.f1711C, rVar.f1711C) && this.f1712D == rVar.f1712D && this.f1713E == rVar.f1713E && this.f1714F == rVar.f1714F && kotlin.jvm.internal.n.d(this.f1715G, rVar.f1715G);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f1716q.hashCode() * 31) + Integer.hashCode(this.f1717r)) * 31) + Integer.hashCode(this.f1718s)) * 31) + Integer.hashCode(this.f1719t)) * 31) + Integer.hashCode(this.f1720u)) * 31;
        String str = this.f1721v;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1722w;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.f1723x)) * 31;
        String str3 = this.f1724y;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f1725z.hashCode()) * 31;
        String str4 = this.f1709A;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f1710B;
        int iHashCode6 = (((((((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f1711C.hashCode()) * 31) + Boolean.hashCode(this.f1712D)) * 31) + Boolean.hashCode(this.f1713E)) * 31) + Integer.hashCode(this.f1714F)) * 31;
        Bundle bundle = this.f1715G;
        return iHashCode6 + (bundle != null ? bundle.hashCode() : 0);
    }

    public String toString() {
        return "ShareWidgetInfo(shareId=" + this.f1716q + ", widgetId=" + this.f1717r + ", cardId=" + this.f1718s + ", shareType=" + this.f1719t + ", shareState=" + this.f1720u + ", creator=" + this.f1721v + ", receiver=" + this.f1722w + ", isAdded=" + this.f1723x + ", shareLocation=" + this.f1724y + ", timeStamp=" + this.f1725z + ", accountId=" + this.f1709A + ", widgetConfig=" + this.f1710B + ", metaInfo=" + this.f1711C + ", isCreatedByMe=" + this.f1712D + ", isCurrentAccount=" + this.f1713E + ", loginState=" + this.f1714F + ", options=" + this.f1715G + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.h(dest, "dest");
        dest.writeString(this.f1716q);
        dest.writeInt(this.f1717r);
        dest.writeInt(this.f1718s);
        dest.writeInt(this.f1719t);
        dest.writeInt(this.f1720u);
        dest.writeString(this.f1721v);
        dest.writeString(this.f1722w);
        dest.writeInt(this.f1723x ? 1 : 0);
        dest.writeString(this.f1724y);
        dest.writeString(this.f1725z);
        dest.writeString(this.f1709A);
        dest.writeString(this.f1710B);
        dest.writeParcelable(this.f1711C, i10);
        dest.writeInt(this.f1712D ? 1 : 0);
        dest.writeInt(this.f1713E ? 1 : 0);
        dest.writeInt(this.f1714F);
        dest.writeBundle(this.f1715G);
    }
}

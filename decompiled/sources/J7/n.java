package J7;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n implements Parcelable {

    public static final class a extends n {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f3871q = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0134a();

        /* JADX INFO: renamed from: J7.n$a$a, reason: collision with other inner class name */
        public static final class C0134a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.n.h(parcel, "parcel");
                parcel.readInt();
                return a.f3871q;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        private a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 311800272;
        }

        public String toString() {
            return "ClockPicker";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.n.h(dest, "dest");
            dest.writeInt(1);
        }
    }

    public static final class b extends n {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f3872q = new b();
        public static final Parcelable.Creator<b> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.n.h(parcel, "parcel");
                parcel.readInt();
                return b.f3872q;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        private b() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1633324708;
        }

        public String toString() {
            return "Preview";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.n.h(dest, "dest");
            dest.writeInt(1);
        }
    }

    public static final class c extends n {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final c f3873q = new c();
        public static final Parcelable.Creator<c> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.n.h(parcel, "parcel");
                parcel.readInt();
                return c.f3873q;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        private c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 443148352;
        }

        public String toString() {
            return "ShortCutPicker";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.n.h(dest, "dest");
            dest.writeInt(1);
        }
    }

    public static final class d extends n {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final d f3874q = new d();
        public static final Parcelable.Creator<d> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.n.h(parcel, "parcel");
                parcel.readInt();
                return d.f3874q;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        private d() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -1006740770;
        }

        public String toString() {
            return "WidgetPicker";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.n.h(dest, "dest");
            dest.writeInt(1);
        }
    }

    public /* synthetic */ n(AbstractC1457h abstractC1457h) {
        this();
    }

    private n() {
    }
}

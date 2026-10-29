package J7;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m implements Parcelable {

    public static final class a extends m {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f3868q = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0133a();

        /* JADX INFO: renamed from: J7.m$a$a, reason: collision with other inner class name */
        public static final class C0133a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.n.h(parcel, "parcel");
                parcel.readInt();
                return a.f3868q;
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
            return 1261656694;
        }

        public String toString() {
            return "ClockTips";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.n.h(dest, "dest");
            dest.writeInt(1);
        }
    }

    public static final class b extends m {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f3869q = new b();
        public static final Parcelable.Creator<b> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.n.h(parcel, "parcel");
                parcel.readInt();
                return b.f3869q;
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
            return -704653175;
        }

        public String toString() {
            return "NoTips";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.n.h(dest, "dest");
            dest.writeInt(1);
        }
    }

    public static final class c extends m {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final c f3870q = new c();
        public static final Parcelable.Creator<c> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.n.h(parcel, "parcel");
                parcel.readInt();
                return c.f3870q;
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
            return -930106484;
        }

        public String toString() {
            return "WidgetTips";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.n.h(dest, "dest");
            dest.writeInt(1);
        }
    }

    public /* synthetic */ m(AbstractC1457h abstractC1457h) {
        this();
    }

    private m() {
    }
}

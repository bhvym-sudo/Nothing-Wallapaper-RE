package p158p7;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements Parcelable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f23777s = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f23778q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f23779r;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final c a(boolean z9, boolean z10, boolean z11, boolean z12) {
            if (z9 && z10) {
                return new b(false, 5, false, false, 13, null);
            }
            if (z9) {
                return new b(false, 1, false, false, 13, null);
            }
            if (!z10) {
                return new d(z11, z12);
            }
            return new b(false, 4, z11, z12, 1, null);
        }

        private a() {
        }
    }

    public static final class b extends c {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f23781t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final int f23782u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f23783v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final boolean f23784w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f23780x = new a(null);
        public static final Parcelable.Creator<b> CREATOR = new C0631b();

        public static final class a {
            public /* synthetic */ a(AbstractC1457h abstractC1457h) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: p7.c$b$b, reason: collision with other inner class name */
        public static final class C0631b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                n.h(parcel, "parcel");
                return new b(parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public /* synthetic */ b(boolean z9, int i10, boolean z10, boolean z11, int i11, AbstractC1457h abstractC1457h) {
            this((i11 & 1) != 0 ? true : z9, i10, (i11 & 4) != 0 ? true : z10, (i11 & 8) != 0 ? true : z11);
        }

        public static /* synthetic */ b l(b bVar, boolean z9, int i10, boolean z10, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z9 = bVar.f23781t;
            }
            if ((i11 & 2) != 0) {
                i10 = bVar.f23782u;
            }
            if ((i11 & 4) != 0) {
                z10 = bVar.f23783v;
            }
            if ((i11 & 8) != 0) {
                z11 = bVar.f23784w;
            }
            return bVar.k(z9, i10, z10, z11);
        }

        @Override // p158p7.c
        public c a() {
            boolean zF = f();
            int i10 = this.f23782u;
            int i11 = zF ? i10 & (-2) : (i10 & (-3)) | 1;
            if (i11 != 0) {
                return new b(false, i11, false, false, 13, null);
            }
            boolean z9 = false;
            return new d(z9, z9, 3, null);
        }

        @Override // p158p7.c
        public c b() {
            int i10 = g() ? this.f23782u & (-5) : this.f23782u | 4;
            return i10 == 0 ? new d(e(), d()) : l(this, !f(), i10, false, false, 12, null);
        }

        @Override // p158p7.c
        public c c(boolean z9, boolean z10) {
            if (!z9 && !z10) {
                return C0632c.f23785t;
            }
            int i10 = this.f23782u;
            if (i10 != 1) {
                if (i10 == 4) {
                    return l(this, false, 0, z10, z9, 3, null);
                }
                if (i10 != 5) {
                    return new b(false, (i10 & (-3)) | 1, z10, z9, 1, null);
                }
            }
            return new b(false, (i10 & (-2)) | 2, z10, z9, 1, null);
        }

        @Override // p158p7.c
        public boolean d() {
            return this.f23784w;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // p158p7.c
        public boolean e() {
            return this.f23783v;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f23781t == bVar.f23781t && this.f23782u == bVar.f23782u && this.f23783v == bVar.f23783v && this.f23784w == bVar.f23784w;
        }

        @Override // p158p7.c
        public boolean f() {
            return (this.f23782u & 1) != 0;
        }

        @Override // p158p7.c
        public boolean g() {
            return (this.f23782u & 4) != 0;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.f23781t) * 31) + Integer.hashCode(this.f23782u)) * 31) + Boolean.hashCode(this.f23783v)) * 31) + Boolean.hashCode(this.f23784w);
        }

        public final b k(boolean z9, int i10, boolean z10, boolean z11) {
            return new b(z9, i10, z10, z11);
        }

        public final boolean m() {
            return this.f23781t;
        }

        public String toString() {
            return "Effect(blurChange=" + this.f23781t + ", effectType=" + this.f23782u + ", selectedLock=" + this.f23783v + ", selectedHome=" + this.f23784w + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            n.h(dest, "dest");
            dest.writeInt(this.f23781t ? 1 : 0);
            dest.writeInt(this.f23782u);
            dest.writeInt(this.f23783v ? 1 : 0);
            dest.writeInt(this.f23784w ? 1 : 0);
        }

        public b(boolean z9, int i10, boolean z10, boolean z11) {
            super(null);
            this.f23781t = z9;
            this.f23782u = i10;
            this.f23783v = z10;
            this.f23784w = z11;
        }
    }

    /* JADX INFO: renamed from: p7.c$c, reason: collision with other inner class name */
    public static final class C0632c extends c {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final C0632c f23785t = new C0632c();
        public static final Parcelable.Creator<C0632c> CREATOR = new a();

        /* JADX INFO: renamed from: p7.c$c$a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0632c createFromParcel(Parcel parcel) {
                n.h(parcel, "parcel");
                parcel.readInt();
                return C0632c.f23785t;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0632c[] newArray(int i10) {
                return new C0632c[i10];
            }
        }

        private C0632c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            n.h(dest, "dest");
            dest.writeInt(1);
        }
    }

    public static final class d extends c {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f23786t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f23787u;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                n.h(parcel, "parcel");
                return new d(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(boolean z9, boolean z10) {
            super(null);
            this.f23786t = z9;
            this.f23787u = z10;
        }

        @Override // p158p7.c
        public c b() {
            return new b(false, 4, e(), d(), 1, null);
        }

        @Override // p158p7.c
        public boolean d() {
            return this.f23787u;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // p158p7.c
        public boolean e() {
            return this.f23786t;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f23786t == dVar.f23786t && this.f23787u == dVar.f23787u;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f23786t) * 31) + Boolean.hashCode(this.f23787u);
        }

        public String toString() {
            return "Selected(selectedLock=" + this.f23786t + ", selectedHome=" + this.f23787u + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            n.h(dest, "dest");
            dest.writeInt(this.f23786t ? 1 : 0);
            dest.writeInt(this.f23787u ? 1 : 0);
        }

        public /* synthetic */ d(boolean z9, boolean z10, int i10, AbstractC1457h abstractC1457h) {
            this((i10 & 1) != 0 ? true : z9, (i10 & 2) != 0 ? true : z10);
        }
    }

    public /* synthetic */ c(AbstractC1457h abstractC1457h) {
        this();
    }

    public c a() {
        return new b(false, 1, false, false, 13, null);
    }

    public c b() {
        return new b(false, 4, false, false, 13, null);
    }

    public c c(boolean z9, boolean z10) {
        return (z9 || z10) ? new d(z10, z9) : C0632c.f23785t;
    }

    public boolean d() {
        return this.f23779r;
    }

    public boolean e() {
        return this.f23778q;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public final int j() {
        if (e() && d()) {
            return 2;
        }
        return e() ? 1 : 0;
    }

    private c() {
    }
}

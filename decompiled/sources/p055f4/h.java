package p055f4;

import android.os.Parcel;
import android.os.Parcelable;
import p025c4.AbstractC1202p;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public class h extends p035d4.a {
    public static final Parcelable.Creator<h> CREATOR = new m();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f20836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f20837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Long f20838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Long f20839t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f20840u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final a f20841v;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f20842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f20843b;

        a(long j9, long j10) {
            AbstractC1202p.k(j10);
            this.f20842a = j9;
            this.f20843b = j10;
        }

        public long a() {
            return this.f20842a;
        }

        public long b() {
            return this.f20843b;
        }
    }

    public h(int i10, int i11, Long l9, Long l10, int i12) {
        this.f20836q = i10;
        this.f20837r = i11;
        this.f20838s = l9;
        this.f20839t = l10;
        this.f20840u = i12;
        this.f20841v = (l9 == null || l10 == null || l10.longValue() == 0) ? null : new a(l9.longValue(), l10.longValue());
    }

    public int a() {
        return this.f20840u;
    }

    public int b() {
        return this.f20837r;
    }

    public a c() {
        return this.f20841v;
    }

    public int d() {
        return this.f20836q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.h(parcel, 1, d());
        c.h(parcel, 2, b());
        c.k(parcel, 3, this.f20838s, false);
        c.k(parcel, 4, this.f20839t, false);
        c.h(parcel, 5, a());
        c.b(parcel, iA);
    }
}

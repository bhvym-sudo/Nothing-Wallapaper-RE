package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0459a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final m f16844q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final m f16845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c f16846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private m f16847t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f16848u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f16849v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f16850w;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    class C0459a implements Parcelable.Creator {
        C0459a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((m) parcel.readParcelable(m.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f16851f = t.a(m.e(1900, 0).f16959v);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final long f16852g = t.a(m.e(2100, 11).f16959v);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f16853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f16854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f16855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f16856d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f16857e;

        b(a aVar) {
            this.f16853a = f16851f;
            this.f16854b = f16852g;
            this.f16857e = f.a(Long.MIN_VALUE);
            this.f16853a = aVar.f16844q.f16959v;
            this.f16854b = aVar.f16845r.f16959v;
            this.f16855c = Long.valueOf(aVar.f16847t.f16959v);
            this.f16856d = aVar.f16848u;
            this.f16857e = aVar.f16846s;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f16857e);
            m mVarF = m.f(this.f16853a);
            m mVarF2 = m.f(this.f16854b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l9 = this.f16855c;
            return new a(mVarF, mVarF2, cVar, l9 == null ? null : m.f(l9.longValue()), this.f16856d, null);
        }

        public b b(long j9) {
            this.f16855c = Long.valueOf(j9);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean h(long j9);
    }

    /* synthetic */ a(m mVar, m mVar2, c cVar, m mVar3, int i10, C0459a c0459a) {
        this(mVar, mVar2, cVar, mVar3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16844q.equals(aVar.f16844q) && this.f16845r.equals(aVar.f16845r) && B0.d.a(this.f16847t, aVar.f16847t) && this.f16848u == aVar.f16848u && this.f16846s.equals(aVar.f16846s);
    }

    public c f() {
        return this.f16846s;
    }

    m g() {
        return this.f16845r;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16844q, this.f16845r, this.f16847t, Integer.valueOf(this.f16848u), this.f16846s});
    }

    int j() {
        return this.f16848u;
    }

    int k() {
        return this.f16850w;
    }

    m l() {
        return this.f16847t;
    }

    m m() {
        return this.f16844q;
    }

    int n() {
        return this.f16849v;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f16844q, 0);
        parcel.writeParcelable(this.f16845r, 0);
        parcel.writeParcelable(this.f16847t, 0);
        parcel.writeParcelable(this.f16846s, 0);
        parcel.writeInt(this.f16848u);
    }

    private a(m mVar, m mVar2, c cVar, m mVar3, int i10) {
        Objects.requireNonNull(mVar, "start cannot be null");
        Objects.requireNonNull(mVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f16844q = mVar;
        this.f16845r = mVar2;
        this.f16847t = mVar3;
        this.f16848u = i10;
        this.f16846s = cVar;
        if (mVar3 != null && mVar.compareTo(mVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (mVar3 != null && mVar3.compareTo(mVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > t.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f16850w = mVar.q(mVar2) + 1;
        this.f16849v = (mVar2.f16956s - mVar.f16956s) + 1;
    }
}

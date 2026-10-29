package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Calendar f16954q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final int f16955r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final int f16956s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final int f16957t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final int f16958u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final long f16959v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f16960w;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return m.e(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    private m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = t.c(calendar);
        this.f16954q = calendarC;
        this.f16955r = calendarC.get(2);
        this.f16956s = calendarC.get(1);
        this.f16957t = calendarC.getMaximum(7);
        this.f16958u = calendarC.getActualMaximum(5);
        this.f16959v = calendarC.getTimeInMillis();
    }

    static m e(int i10, int i11) {
        Calendar calendarI = t.i();
        calendarI.set(1, i10);
        calendarI.set(2, i11);
        return new m(calendarI);
    }

    static m f(long j9) {
        Calendar calendarI = t.i();
        calendarI.setTimeInMillis(j9);
        return new m(calendarI);
    }

    static m g() {
        return new m(t.g());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(m mVar) {
        return this.f16954q.compareTo(mVar.f16954q);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f16955r == mVar.f16955r && this.f16956s == mVar.f16956s;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16955r), Integer.valueOf(this.f16956s)});
    }

    int k(int i10) {
        int i11 = this.f16954q.get(7);
        if (i10 <= 0) {
            i10 = this.f16954q.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f16957t : i12;
    }

    long l(int i10) {
        Calendar calendarC = t.c(this.f16954q);
        calendarC.set(5, i10);
        return calendarC.getTimeInMillis();
    }

    int m(long j9) {
        Calendar calendarC = t.c(this.f16954q);
        calendarC.setTimeInMillis(j9);
        return calendarC.get(5);
    }

    String n() {
        if (this.f16960w == null) {
            this.f16960w = e.f(this.f16954q.getTimeInMillis());
        }
        return this.f16960w;
    }

    long o() {
        return this.f16954q.getTimeInMillis();
    }

    m p(int i10) {
        Calendar calendarC = t.c(this.f16954q);
        calendarC.add(2, i10);
        return new m(calendarC);
    }

    int q(m mVar) {
        if (this.f16954q instanceof GregorianCalendar) {
            return ((mVar.f16956s - this.f16956s) * 12) + (mVar.f16955r - this.f16955r);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16956s);
        parcel.writeInt(this.f16955r);
    }
}

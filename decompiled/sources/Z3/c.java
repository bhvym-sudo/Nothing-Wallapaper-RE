package Z3;

import android.os.Parcel;
import android.os.Parcelable;
import p025c4.AbstractC1201o;

/* JADX INFO: loaded from: classes.dex */
public class c extends p035d4.a {
    public static final Parcelable.Creator<c> CREATOR = new m();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f9449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f9450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f9451s;

    public c(String str, int i10, long j9) {
        this.f9449q = str;
        this.f9450r = i10;
        this.f9451s = j9;
    }

    public String a() {
        return this.f9449q;
    }

    public long b() {
        long j9 = this.f9451s;
        return j9 == -1 ? this.f9450r : j9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (((a() != null && a().equals(cVar.a())) || (a() == null && cVar.a() == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1201o.b(a(), Long.valueOf(b()));
    }

    public final String toString() {
        AbstractC1201o.a aVarC = AbstractC1201o.c(this);
        aVarC.a("name", a());
        aVarC.a("version", Long.valueOf(b()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p035d4.c.a(parcel);
        p035d4.c.m(parcel, 1, a(), false);
        p035d4.c.h(parcel, 2, this.f9450r);
        p035d4.c.j(parcel, 3, b());
        p035d4.c.b(parcel, iA);
    }

    public c(String str, long j9) {
        this.f9449q = str;
        this.f9451s = j9;
        this.f9450r = -1;
    }
}

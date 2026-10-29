package p175r4;

import p025c4.AbstractC1201o;

/* JADX INFO: renamed from: r4.r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1907r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f27326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Boolean f27327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f27328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f27329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Boolean f27330e;

    /* synthetic */ C1907r8(C1888p8 c1888p8, AbstractC1898q8 abstractC1898q8) {
        this.f27326a = c1888p8.f26974a;
        this.f27327b = c1888p8.f26975b;
        this.f27328c = c1888p8.f26976c;
        this.f27329d = c1888p8.f26977d;
        this.f27330e = c1888p8.f26978e;
    }

    public final Boolean a() {
        return this.f27327b;
    }

    public final Boolean b() {
        return this.f27326a;
    }

    public final Boolean c() {
        return this.f27328c;
    }

    public final Boolean d() {
        return this.f27330e;
    }

    public final Boolean e() {
        return this.f27329d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1907r8)) {
            return false;
        }
        C1907r8 c1907r8 = (C1907r8) obj;
        return AbstractC1201o.a(this.f27326a, c1907r8.f27326a) && AbstractC1201o.a(this.f27327b, c1907r8.f27327b) && AbstractC1201o.a(this.f27328c, c1907r8.f27328c) && AbstractC1201o.a(this.f27329d, c1907r8.f27329d) && AbstractC1201o.a(this.f27330e, c1907r8.f27330e);
    }

    public final int hashCode() {
        return AbstractC1201o.b(this.f27326a, this.f27327b, this.f27328c, this.f27329d, this.f27330e);
    }
}

package p175r4;

import p025c4.AbstractC1201o;

/* JADX INFO: renamed from: r4.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1721a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC1886p6 f26408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Boolean f26409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X5 f26410c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1907r8 f26411d;

    /* synthetic */ C1721a1(Y0 y9, Z0 z9) {
        this.f26408a = y9.f26350a;
        this.f26409b = y9.f26351b;
        this.f26411d = y9.f26352c;
    }

    public final EnumC1886p6 a() {
        return this.f26408a;
    }

    public final C1907r8 b() {
        return this.f26411d;
    }

    public final Boolean c() {
        return this.f26409b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1721a1)) {
            return false;
        }
        C1721a1 c1721a1 = (C1721a1) obj;
        return AbstractC1201o.a(this.f26408a, c1721a1.f26408a) && AbstractC1201o.a(this.f26409b, c1721a1.f26409b) && AbstractC1201o.a(null, null) && AbstractC1201o.a(this.f26411d, c1721a1.f26411d);
    }

    public final int hashCode() {
        return AbstractC1201o.b(this.f26408a, this.f26409b, null, this.f26411d);
    }
}

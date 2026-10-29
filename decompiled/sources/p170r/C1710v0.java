package p170r;

import p079h8.f;
import p219v8.l;

/* JADX INFO: renamed from: r.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1710v0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f25588i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1707u f25589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f25590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final R0 f25591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1683h0 f25592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f25593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f25594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f25595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f25596h = true;

    public C1710v0(AbstractC1707u abstractC1707u, Object obj, boolean z9, R0 r9, InterfaceC1683h0 interfaceC1683h0, l lVar, boolean z10) {
        this.f25589a = abstractC1707u;
        this.f25590b = z9;
        this.f25591c = r9;
        this.f25592d = interfaceC1683h0;
        this.f25593e = lVar;
        this.f25594f = z10;
        this.f25595g = obj;
    }

    public final boolean a() {
        return this.f25596h;
    }

    public final AbstractC1707u b() {
        return this.f25589a;
    }

    public final l c() {
        return this.f25593e;
    }

    public final Object d() {
        if (this.f25590b) {
            return null;
        }
        InterfaceC1683h0 interfaceC1683h0 = this.f25592d;
        if (interfaceC1683h0 != null) {
            return interfaceC1683h0.getValue();
        }
        Object obj = this.f25595g;
        if (obj != null) {
            return obj;
        }
        AbstractC1696o.s("Unexpected form of a provided value");
        throw new f();
    }

    public final R0 e() {
        return this.f25591c;
    }

    public final InterfaceC1683h0 f() {
        return this.f25592d;
    }

    public final Object g() {
        return this.f25595g;
    }

    public final C1710v0 h() {
        this.f25596h = false;
        return this;
    }

    public final boolean i() {
        return this.f25594f;
    }

    public final boolean j() {
        return (this.f25590b || g() != null) && !this.f25594f;
    }
}

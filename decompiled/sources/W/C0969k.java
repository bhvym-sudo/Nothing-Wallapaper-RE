package W;

/* JADX INFO: renamed from: W.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0969k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0968j f8598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0968j f8599b;

    public C0969k(boolean z9) {
        this.f8598a = new C0968j(z9);
        this.f8599b = new C0968j(z9);
    }

    public final void c(B b10, boolean z9) {
        if (z9) {
            this.f8598a.a(b10);
            this.f8599b.a(b10);
        } else {
            if (this.f8598a.b(b10)) {
                return;
            }
            this.f8599b.a(b10);
        }
    }

    public final boolean d(B b10) {
        return this.f8598a.b(b10) || this.f8599b.b(b10);
    }

    public final boolean e(B b10, boolean z9) {
        boolean zB = this.f8598a.b(b10);
        if (z9) {
            return zB;
        }
        return zB || this.f8599b.b(b10);
    }

    public final boolean f() {
        return this.f8599b.d() && this.f8598a.d();
    }

    public final boolean g(boolean z9) {
        return (z9 ? this.f8598a : this.f8599b).d();
    }

    public final boolean h() {
        return !f();
    }

    public final boolean i(B b10) {
        return this.f8599b.f(b10) || this.f8598a.f(b10);
    }
}

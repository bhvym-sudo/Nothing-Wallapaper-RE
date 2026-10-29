package p170r;

import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
final class G implements F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f25301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H f25302b;

    public G(l lVar) {
        this.f25301a = lVar;
    }

    @Override // p170r.F0
    public void a() {
    }

    @Override // p170r.F0
    public void b() {
        H h10 = this.f25302b;
        if (h10 != null) {
            h10.dispose();
        }
        this.f25302b = null;
    }

    @Override // p170r.F0
    public void c() {
        this.f25302b = (H) this.f25301a.f(L.f25326a);
    }
}

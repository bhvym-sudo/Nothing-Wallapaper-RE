package M8;

import F8.AbstractC0829o0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f extends AbstractC0829o0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f5156t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f5157u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f5158v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f5159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private a f5160x = l1();

    public f(int i10, int i11, long j9, String str) {
        this.f5156t = i10;
        this.f5157u = i11;
        this.f5158v = j9;
        this.f5159w = str;
    }

    private final a l1() {
        return new a(this.f5156t, this.f5157u, this.f5158v, this.f5159w);
    }

    @Override // F8.I
    public void g1(p129m8.i iVar, Runnable runnable) {
        a.B(this.f5160x, runnable, false, false, 6, null);
    }

    @Override // F8.I
    public void h1(p129m8.i iVar, Runnable runnable) {
        a.B(this.f5160x, runnable, false, true, 2, null);
    }

    public final void m1(Runnable runnable, boolean z9, boolean z10) {
        this.f5160x.z(runnable, z9, z10);
    }
}

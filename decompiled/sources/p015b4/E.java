package p015b4;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes.dex */
final class E implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f14892q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f14893r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final /* synthetic */ F f14894s;

    E(F f10, LifecycleCallback lifecycleCallback, String str) {
        this.f14894s = f10;
        this.f14892q = lifecycleCallback;
        this.f14893r = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F f10 = this.f14894s;
        if (f10.f14897r > 0) {
            this.f14892q.f(f10.f14898s != null ? f10.f14898s.getBundle(this.f14893r) : null);
        }
        if (this.f14894s.f14897r >= 2) {
            this.f14892q.j();
        }
        if (this.f14894s.f14897r >= 3) {
            this.f14892q.h();
        }
        if (this.f14894s.f14897r >= 4) {
            this.f14892q.k();
        }
        if (this.f14894s.f14897r >= 5) {
            this.f14892q.g();
        }
    }
}

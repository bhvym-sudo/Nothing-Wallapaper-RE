package p015b4;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes.dex */
final class C implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f14885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f14886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final /* synthetic */ D f14887s;

    C(D d10, LifecycleCallback lifecycleCallback, String str) {
        this.f14887s = d10;
        this.f14885q = lifecycleCallback;
        this.f14886r = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D d10 = this.f14887s;
        if (d10.f14890r > 0) {
            this.f14885q.f(d10.f14891s != null ? d10.f14891s.getBundle(this.f14886r) : null);
        }
        if (this.f14887s.f14890r >= 2) {
            this.f14885q.j();
        }
        if (this.f14887s.f14890r >= 3) {
            this.f14885q.h();
        }
        if (this.f14887s.f14890r >= 4) {
            this.f14885q.k();
        }
        if (this.f14887s.f14890r >= 5) {
            this.f14885q.g();
        }
    }
}

package A;

import p170r.C1680g;

/* JADX INFO: loaded from: classes.dex */
public abstract class v implements u {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C1680g f100q = new C1680g(0);

    public final boolean l(int i10) {
        return (g.a(this.f100q.get()) & i10) != 0;
    }

    public final void m(int i10) {
        int iA;
        do {
            iA = g.a(this.f100q.get());
            if ((iA & i10) != 0) {
                return;
            }
        } while (!this.f100q.compareAndSet(iA, g.a(iA | i10)));
    }
}

package H8;

import F8.c1;
import K8.A;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends A {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final e f2627u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f2628v;

    public l(long j9, l lVar, e eVar, int i10) {
        super(j9, lVar, i10);
        this.f2627u = eVar;
        this.f2628v = new AtomicReferenceArray(f.f2600b * 2);
    }

    private final void E(int i10, Object obj) {
        z().set(i10 * 2, obj);
    }

    private final /* synthetic */ AtomicReferenceArray z() {
        return this.f2628v;
    }

    public final Object A(int i10) {
        return z().get(i10 * 2);
    }

    public final Object B(int i10) {
        return z().get((i10 * 2) + 1);
    }

    public final void C(int i10, boolean z9) {
        if (z9) {
            y().s1((this.f4140s * ((long) f.f2600b)) + ((long) i10));
        }
        t();
    }

    public final Object D(int i10) {
        Object objA = A(i10);
        w(i10);
        return objA;
    }

    public final void F(int i10, Object obj) {
        z().set((i10 * 2) + 1, obj);
    }

    public final void G(int i10, Object obj) {
        E(i10, obj);
    }

    @Override // K8.A
    public int r() {
        return f.f2600b;
    }

    @Override // K8.A
    public void s(int i10, Throwable th, p129m8.i iVar) {
        p219v8.l lVar;
        p219v8.l lVar2;
        int i11 = f.f2600b;
        boolean z9 = i10 >= i11;
        if (z9) {
            i10 -= i11;
        }
        Object objA = A(i10);
        while (true) {
            Object objB = B(i10);
            if ((objB instanceof c1) || (objB instanceof x)) {
                if (v(i10, objB, z9 ? f.f2608j : f.f2609k)) {
                    w(i10);
                    C(i10, !z9);
                    if (!z9 || (lVar = y().f2582r) == null) {
                        return;
                    }
                    K8.w.a(lVar, objA, iVar);
                    return;
                }
            } else {
                if (objB == f.f2608j || objB == f.f2609k) {
                    break;
                }
                if (objB != f.f2605g && objB != f.f2604f) {
                    if (objB == f.f2607i || objB == f.f2602d || objB == f.z()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objB).toString());
                }
            }
        }
        w(i10);
        if (!z9 || (lVar2 = y().f2582r) == null) {
            return;
        }
        K8.w.a(lVar2, objA, iVar);
    }

    public final boolean v(int i10, Object obj, Object obj2) {
        return z().compareAndSet((i10 * 2) + 1, obj, obj2);
    }

    public final void w(int i10) {
        E(i10, null);
    }

    public final Object x(int i10, Object obj) {
        return z().getAndSet((i10 * 2) + 1, obj);
    }

    public final e y() {
        e eVar = this.f2627u;
        kotlin.jvm.internal.n.e(eVar);
        return eVar;
    }
}

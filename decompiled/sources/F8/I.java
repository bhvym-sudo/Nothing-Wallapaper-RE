package F8;

import K8.AbstractC0916i;
import K8.AbstractC0919l;
import K8.C0915h;
import K8.C0918k;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I extends p129m8.a implements p129m8.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f1816r = new a(null);

    public static final class a extends p129m8.b {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final I d(m8.i.b bVar) {
            if (bVar instanceof I) {
                return (I) bVar;
            }
            return null;
        }

        private a() {
            super(p129m8.f.f23250l, new p219v8.l() { // from class: F8.H
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return I.a.d((m8.i.b) obj);
                }
            });
        }
    }

    public I() {
        super(p129m8.f.f23250l);
    }

    public static /* synthetic */ I k1(I i10, int i11, String str, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i12 & 2) != 0) {
            str = null;
        }
        return i10.j1(i11, str);
    }

    @Override // p129m8.f
    public final p129m8.e U(p129m8.e eVar) {
        return new C0915h(this, eVar);
    }

    @Override // p129m8.f
    public final void Y(p129m8.e eVar) {
        kotlin.jvm.internal.n.f(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C0915h) eVar).w();
    }

    @Override // p129m8.a, m8.i.b, p129m8.i
    public m8.i.b b(m8.i.c cVar) {
        return m8.f.a.a(this, cVar);
    }

    public abstract void g1(p129m8.i iVar, Runnable runnable);

    public void h1(p129m8.i iVar, Runnable runnable) {
        AbstractC0916i.c(this, iVar, runnable);
    }

    public boolean i1(p129m8.i iVar) {
        return true;
    }

    public I j1(int i10, String str) {
        AbstractC0919l.a(i10);
        return new C0918k(this, i10, str);
    }

    @Override // p129m8.a, p129m8.i
    public p129m8.i t0(m8.i.c cVar) {
        return m8.f.a.b(this, cVar);
    }

    public String toString() {
        return P.a(this) + '@' + P.b(this);
    }
}

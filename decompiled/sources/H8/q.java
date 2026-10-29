package H8;

import K8.P;
import kotlin.jvm.internal.F;
import p079h8.A;
import p079h8.AbstractC1388c;

/* JADX INFO: loaded from: classes2.dex */
public class q extends e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f2629C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final a f2630D;

    public q(int i10, a aVar, p219v8.l lVar) {
        super(i10, lVar);
        this.f2629C = i10;
        this.f2630D = aVar;
        if (aVar == a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + F.b(e.class).b() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    static /* synthetic */ Object t1(q qVar, Object obj, p129m8.e eVar) throws Throwable {
        P pC;
        Object objV1 = qVar.v1(obj, true);
        if (!(objV1 instanceof k.a)) {
            return A.f21846a;
        }
        k.e(objV1);
        p219v8.l lVar = qVar.f2582r;
        if (lVar == null || (pC = K8.w.c(lVar, obj, null, 2, null)) == null) {
            throw qVar.l0();
        }
        AbstractC1388c.a(pC, qVar.l0());
        throw pC;
    }

    private final Object u1(Object obj, boolean z9) {
        p219v8.l lVar;
        P pC;
        Object objP = super.p(obj);
        if (k.i(objP) || k.h(objP)) {
            return objP;
        }
        if (!z9 || (lVar = this.f2582r) == null || (pC = K8.w.c(lVar, obj, null, 2, null)) == null) {
            return k.f2623b.c(A.f21846a);
        }
        throw pC;
    }

    private final Object v1(Object obj, boolean z9) {
        return this.f2630D == a.DROP_LATEST ? u1(obj, z9) : j1(obj);
    }

    @Override // H8.e, H8.w
    public Object n(Object obj, p129m8.e eVar) {
        return t1(this, obj, eVar);
    }

    @Override // H8.e, H8.w
    public Object p(Object obj) {
        return v1(obj, false);
    }

    @Override // H8.e
    protected boolean z0() {
        return this.f2630D == a.DROP_OLDEST;
    }
}

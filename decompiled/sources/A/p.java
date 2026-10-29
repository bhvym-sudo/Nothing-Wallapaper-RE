package A;

import androidx.collection.F;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p079h8.A;
import p089i8.AbstractC1444s;
import p170r.C1680g;
import p170r.W0;
import p170r.h1;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p219v8.l f50a = b.f63r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final W0 f51b = new W0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f52c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static n f53d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f54e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final m f55f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final t f56g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static List f57h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static List f58i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicReference f59j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final k f60k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static C1680g f61l;

    static final class a extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f62r = new a();

        a() {
            super(1);
        }

        public final void a(n nVar) {
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((n) obj);
            return A.f21846a;
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f63r = new b();

        b() {
            super(1);
        }

        public final void a(n nVar) {
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((n) obj);
            return A.f21846a;
        }
    }

    static final class c extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.l f64r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p219v8.l f65s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p219v8.l lVar, p219v8.l lVar2) {
            super(1);
            this.f64r = lVar;
            this.f65s = lVar2;
        }

        public final void a(Object obj) {
            this.f64r.f(obj);
            this.f65s.f(obj);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a(obj);
            return A.f21846a;
        }
    }

    static final class d extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.l f66r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p219v8.l f67s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p219v8.l lVar, p219v8.l lVar2) {
            super(1);
            this.f66r = lVar;
            this.f67s = lVar2;
        }

        public final void a(Object obj) {
            this.f66r.f(obj);
            this.f67s.f(obj);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a(obj);
            return A.f21846a;
        }
    }

    static final class e extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.l f68r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p219v8.l lVar) {
            super(1);
            this.f68r = lVar;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k f(n nVar) {
            k kVar = (k) this.f68r.f(nVar);
            synchronized (p.I()) {
                p.f53d = p.f53d.s(kVar.f());
                A a10 = A.f21846a;
            }
            return kVar;
        }
    }

    static {
        n.a aVar = n.f38u;
        f53d = aVar.a();
        f54e = 2;
        f55f = new m();
        f56g = new t();
        f57h = AbstractC1444s.l();
        f58i = AbstractC1444s.l();
        int i10 = f54e;
        f54e = i10 + 1;
        A.a aVar2 = new A.a(i10, aVar.a());
        f53d = f53d.s(aVar2.f());
        AtomicReference atomicReference = new AtomicReference(aVar2);
        f59j = atomicReference;
        f60k = (k) atomicReference.get();
        f61l = new C1680g(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[Catch: all -> 0x009f, LOOP:1: B:30:0x006f->B:42:0x00a8, LOOP_END, TryCatch #2 {all -> 0x009f, blocks: (B:25:0x0060, B:27:0x0065, B:30:0x006f, B:32:0x007f, B:34:0x008b, B:36:0x0094, B:39:0x00a1, B:42:0x00a8, B:43:0x00aa), top: B:54:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa A[EDGE_INSN: B:58:0x00aa->B:43:0x00aa BREAK  A[LOOP:1: B:30:0x006f->B:42:0x00a8], SYNTHETIC] */
    public static final Object A(p219v8.l lVar) {
        Object obj;
        F fE;
        Object objA0;
        k kVar = f60k;
        kotlin.jvm.internal.n.f(kVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (I()) {
            try {
                obj = f59j.get();
                fE = ((A.a) obj).E();
                if (fE != null) {
                    f61l.a(1);
                }
                objA0 = a0((k) obj, lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (fE != null) {
            try {
                List list = f57h;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p219v8.p) list.get(i10)).invoke(p190t.e.a(fE), obj);
                }
                f61l.a(-1);
            } catch (Throwable th2) {
                f61l.a(-1);
                throw th2;
            }
        }
        synchronized (I()) {
            try {
                C();
                if (fE != null) {
                    Object[] objArr = fE.f11289b;
                    long[] jArr = fE.f11288a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j9 = jArr[i11];
                            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i11 != length) {
                                    break;
                                    break;
                                }
                                i11++;
                            } else {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((255 & j9) < 128) {
                                        U((u) objArr[(i11 << 3) + i13]);
                                    }
                                    j9 >>= 8;
                                }
                                if (i12 != 8) {
                                    break;
                                }
                                if (i11 != length) {
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    A a10 = A.f21846a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return objA0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B() {
        A(a.f62r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C() {
        t tVar = f56g;
        int iE = tVar.e();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iE) {
                break;
            }
            h1 h1Var = tVar.f()[i10];
            Object obj = h1Var != null ? h1Var.get() : null;
            if (obj != null && T((u) obj)) {
                if (i11 != i10) {
                    tVar.f()[i11] = h1Var;
                    tVar.d()[i11] = tVar.d()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < iE; i12++) {
            tVar.f()[i12] = null;
            tVar.d()[i12] = 0;
        }
        if (i11 != iE) {
            tVar.g(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k D(k kVar, p219v8.l lVar, boolean z9) {
        boolean z10 = kVar instanceof A.c;
        if (z10 || kVar == null) {
            return new x(z10 ? (A.c) kVar : null, lVar, null, false, z9);
        }
        return new y(kVar, lVar, false, z9);
    }

    static /* synthetic */ k E(k kVar, p219v8.l lVar, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        return D(kVar, lVar, z9);
    }

    public static final w F(w wVar) {
        w wVarW;
        k.a aVar = k.f25e;
        k kVarC = aVar.c();
        w wVarW2 = W(wVar, kVarC.f(), kVarC.g());
        if (wVarW2 != null) {
            return wVarW2;
        }
        synchronized (I()) {
            k kVarC2 = aVar.c();
            wVarW = W(wVar, kVarC2.f(), kVarC2.g());
        }
        if (wVarW != null) {
            return wVarW;
        }
        V();
        throw new p079h8.f();
    }

    public static final w G(w wVar, k kVar) {
        w wVarW = W(wVar, kVar.f(), kVar.g());
        if (wVarW != null) {
            return wVarW;
        }
        V();
        throw new p079h8.f();
    }

    public static final k H() {
        k kVar = (k) f51b.a();
        return kVar == null ? (k) f59j.get() : kVar;
    }

    public static final Object I() {
        return f52c;
    }

    public static final k J() {
        return f60k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p219v8.l K(p219v8.l lVar, p219v8.l lVar2, boolean z9) {
        if (!z9) {
            lVar2 = null;
        }
        if (lVar == null || lVar2 == null || lVar == lVar2) {
            return lVar == null ? lVar2 : lVar;
        }
        return new c(lVar, lVar2);
    }

    static /* synthetic */ p219v8.l L(p219v8.l lVar, p219v8.l lVar2, boolean z9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z9 = true;
        }
        return K(lVar, lVar2, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p219v8.l M(p219v8.l lVar, p219v8.l lVar2) {
        if (lVar == null || lVar2 == null || lVar == lVar2) {
            return lVar == null ? lVar2 : lVar;
        }
        return new d(lVar, lVar2);
    }

    public static final w N(w wVar, u uVar) {
        w wVarD0 = d0(uVar);
        if (wVarD0 != null) {
            wVarD0.h(SubsamplingScaleImageView.TILE_SIZE_AUTO);
            return wVarD0;
        }
        w wVarD = wVar.d();
        wVarD.h(SubsamplingScaleImageView.TILE_SIZE_AUTO);
        wVarD.g(uVar.b());
        kotlin.jvm.internal.n.f(wVarD, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$16");
        uVar.k(wVarD);
        kotlin.jvm.internal.n.f(wVarD, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return wVarD;
    }

    public static final w O(w wVar, u uVar, k kVar) {
        w wVarP;
        synchronized (I()) {
            wVarP = P(wVar, uVar, kVar);
        }
        return wVarP;
    }

    private static final w P(w wVar, u uVar, k kVar) {
        w wVarN = N(wVar, uVar);
        wVarN.c(wVar);
        wVarN.h(kVar.f());
        return wVarN;
    }

    public static final void Q(k kVar, u uVar) {
        kVar.w(kVar.j() + 1);
        p219v8.l lVarK = kVar.k();
        if (lVarK != null) {
            lVarK.f(uVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map R(A.c cVar, A.c cVar2, n nVar) {
        long[] jArr;
        int i10;
        Map map;
        Map map2;
        int i11;
        F fE = cVar2.E();
        int iF = cVar.f();
        Map map3 = null;
        if (fE == null) {
            return null;
        }
        n nVarR = cVar2.g().s(cVar2.f()).r(cVar2.F());
        Object[] objArr = fE.f11289b;
        long[] jArr2 = fE.f11288a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map4 = null;
        int i12 = 0;
        while (true) {
            long j9 = jArr2[i12];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((255 & j9) < 128) {
                        u uVar = (u) objArr[(i12 << 3) + i15];
                        w wVarB = uVar.b();
                        map2 = map3;
                        w wVarW = W(wVarB, iF, nVar);
                        if (wVarW == null) {
                            i11 = i13;
                        } else {
                            i11 = i13;
                            w wVarW2 = W(wVarB, iF, nVarR);
                            if (wVarW2 != null && !kotlin.jvm.internal.n.d(wVarW, wVarW2)) {
                                w wVarW3 = W(wVarB, cVar2.f(), cVar2.g());
                                if (wVarW3 == null) {
                                    V();
                                    throw new p079h8.f();
                                }
                                w wVarF = uVar.f(wVarW2, wVarW, wVarW3);
                                if (wVarF == null) {
                                    return map2;
                                }
                                if (map4 == null) {
                                    map4 = new HashMap();
                                }
                                map4.put(wVarW, wVarF);
                                map4 = map4;
                            }
                        }
                    } else {
                        map2 = map3;
                        i11 = i13;
                    }
                    j9 >>= i11;
                    i15++;
                    map3 = map2;
                    i13 = i11;
                    jArr2 = jArr2;
                    iF = iF;
                }
                jArr = jArr2;
                i10 = iF;
                map = map3;
                if (i14 != i13) {
                    return map4;
                }
            } else {
                jArr = jArr2;
                i10 = iF;
                map = map3;
            }
            if (i12 == length) {
                return map4;
            }
            i12++;
            map3 = map;
            jArr2 = jArr;
            iF = i10;
        }
    }

    public static final w S(w wVar, u uVar, k kVar, w wVar2) {
        w wVarN;
        if (kVar.i()) {
            kVar.p(uVar);
        }
        int iF = kVar.f();
        if (wVar2.f() == iF) {
            return wVar2;
        }
        synchronized (I()) {
            wVarN = N(wVar, uVar);
        }
        wVarN.h(iF);
        if (wVar2.f() != 1) {
            kVar.p(uVar);
        }
        return wVarN;
    }

    private static final boolean T(u uVar) {
        w wVar;
        int iE = f55f.e(f54e);
        w wVar2 = null;
        w wVarB = null;
        int i10 = 0;
        for (w wVarB2 = uVar.b(); wVarB2 != null; wVarB2 = wVarB2.e()) {
            int iF = wVarB2.f();
            if (iF != 0) {
                if (iF >= iE) {
                    i10++;
                } else if (wVar2 == null) {
                    i10++;
                    wVar2 = wVarB2;
                } else {
                    if (wVarB2.f() < wVar2.f()) {
                        wVar = wVar2;
                        wVar2 = wVarB2;
                    } else {
                        wVar = wVarB2;
                    }
                    if (wVarB == null) {
                        wVarB = uVar.b();
                        w wVar3 = wVarB;
                        while (true) {
                            if (wVarB == null) {
                                wVarB = wVar3;
                                break;
                            }
                            if (wVarB.f() >= iE) {
                                break;
                            }
                            if (wVar3.f() < wVarB.f()) {
                                wVar3 = wVarB;
                            }
                            wVarB = wVarB.e();
                        }
                    }
                    wVar2.h(0);
                    wVar2.c(wVarB);
                    wVar2 = wVar;
                }
            }
        }
        return i10 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(u uVar) {
        if (T(uVar)) {
            f56g.a(uVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void V() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w W(w wVar, int i10, n nVar) {
        w wVar2 = null;
        while (wVar != null) {
            if (f0(wVar, i10, nVar) && (wVar2 == null || wVar2.f() < wVar.f())) {
                wVar2 = wVar;
            }
            wVar = wVar.e();
        }
        if (wVar2 != null) {
            return wVar2;
        }
        return null;
    }

    public static final w X(w wVar, u uVar) {
        w wVarW;
        k.a aVar = k.f25e;
        k kVarC = aVar.c();
        p219v8.l lVarH = kVarC.h();
        if (lVarH != null) {
            lVarH.f(uVar);
        }
        w wVarW2 = W(wVar, kVarC.f(), kVarC.g());
        if (wVarW2 != null) {
            return wVarW2;
        }
        synchronized (I()) {
            k kVarC2 = aVar.c();
            w wVarB = uVar.b();
            kotlin.jvm.internal.n.f(wVarB, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            wVarW = W(wVarB, kVarC2.f(), kVarC2.g());
            if (wVarW == null) {
                V();
                throw new p079h8.f();
            }
        }
        return wVarW;
    }

    public static final void Y(int i10) {
        f55f.f(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void Z() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object a0(k kVar, p219v8.l lVar) {
        Object objF = lVar.f(f53d.o(kVar.f()));
        synchronized (I()) {
            int i10 = f54e;
            f54e = i10 + 1;
            f53d = f53d.o(kVar.f());
            f59j.set(new A.a(i10, f53d));
            kVar.d();
            f53d = f53d.s(i10);
            A a10 = A.f21846a;
        }
        return objF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k b0(p219v8.l lVar) {
        return (k) A(new e(lVar));
    }

    public static final int c0(int i10, n nVar) {
        int iA;
        int iQ = nVar.q(i10);
        synchronized (I()) {
            iA = f55f.a(iQ);
        }
        return iA;
    }

    private static final w d0(u uVar) {
        int iE = f55f.e(f54e) - 1;
        n nVarA = n.f38u.a();
        w wVar = null;
        for (w wVarB = uVar.b(); wVarB != null; wVarB = wVarB.e()) {
            if (wVarB.f() != 0) {
                if (f0(wVarB, iE, nVarA)) {
                    if (wVar == null) {
                        wVar = wVarB;
                    } else if (wVarB.f() >= wVar.f()) {
                        return wVar;
                    }
                }
            }
            return wVarB;
        }
        return null;
    }

    private static final boolean e0(int i10, int i11, n nVar) {
        return (i11 == 0 || i11 > i10 || nVar.p(i11)) ? false : true;
    }

    private static final boolean f0(w wVar, int i10, n nVar) {
        return e0(i10, wVar.f(), nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(k kVar) {
        int iE;
        if (f53d.p(kVar.f())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot is not open: id=");
        sb.append(kVar.f());
        sb.append(", disposed=");
        sb.append(kVar.e());
        sb.append(", applied=");
        A.c cVar = kVar instanceof A.c ? (A.c) kVar : null;
        sb.append(cVar != null ? Boolean.valueOf(cVar.D()) : "read-only");
        sb.append(", lowestPin=");
        synchronized (I()) {
            iE = f55f.e(-1);
        }
        sb.append(iE);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final n z(n nVar, int i10, int i11) {
        while (i10 < i11) {
            nVar = nVar.s(i10);
            i10++;
        }
        return nVar;
    }
}

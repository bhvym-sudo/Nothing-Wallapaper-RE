package A;

import androidx.collection.F;
import androidx.collection.O;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.A;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;
import p170r.AbstractC1701q0;

/* JADX INFO: loaded from: classes.dex */
public class c extends k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f4p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f5q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f6r = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p219v8.l f7g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p219v8.l f8h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f9i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private F f10j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f11k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private n f12l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f13m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f14n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f15o;

    private static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public c(int i10, n nVar, p219v8.l lVar, p219v8.l lVar2) {
        super(i10, nVar, null);
        this.f7g = lVar;
        this.f8h = lVar2;
        this.f12l = n.f38u.a();
        this.f13m = f6r;
        this.f14n = 1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0074 A[LOOP:0: B:7:0x001c->B:24:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0077 A[EDGE_INSN: B:28:0x0077->B:25:0x0077 BREAK  A[LOOP:0: B:7:0x001c->B:24:0x0074], SYNTHETIC] */
    private final void A() {
        F fE = E();
        if (fE != null) {
            R();
            P(null);
            int iF = f();
            Object[] objArr = fE.f11289b;
            long[] jArr = fE.f11288a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j9 = jArr[i10];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j9) < 128) {
                                for (w wVarB = ((u) objArr[(i10 << 3) + i12]).b(); wVarB != null; wVarB = wVarB.e()) {
                                    if (wVarB.f() == iF || AbstractC1444s.L(this.f12l, Integer.valueOf(wVarB.f()))) {
                                        wVarB.h(0);
                                    }
                                }
                            }
                            j9 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
        b();
    }

    private final void N() {
        int length = this.f13m.length;
        for (int i10 = 0; i10 < length; i10++) {
            p.Y(this.f13m[i10]);
        }
    }

    private final void R() {
        if (this.f15o) {
            AbstractC1701q0.b("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void S() {
        if (!this.f15o || ((k) this).f30d >= 0) {
            return;
        }
        AbstractC1701q0.b("Unsupported operation on a disposed or applied snapshot");
    }

    public final void B() {
        J(f());
        A a10 = A.f21846a;
        if (D() || e()) {
            return;
        }
        int iF = f();
        synchronized (p.I()) {
            int i10 = p.f54e;
            p.f54e = i10 + 1;
            u(i10);
            p.f53d = p.f53d.s(f());
        }
        v(p.z(g(), iF + 1, f()));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x018d A[EDGE_INSN: B:102:0x018d->B:78:0x018d BREAK  A[LOOP:4: B:67:0x015e->B:77:0x018a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x018d A[EDGE_INSN: B:103:0x018d->B:78:0x018d BREAK  A[LOOP:4: B:67:0x015e->B:77:0x018a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0149 A[Catch: all -> 0x013e, LOOP:2: B:48:0x0116->B:60:0x0149, LOOP_END, TryCatch #1 {all -> 0x013e, blocks: (B:43:0x00f8, B:45:0x0108, B:48:0x0116, B:50:0x0122, B:52:0x012c, B:54:0x0132, B:57:0x0141, B:64:0x0154, B:67:0x015e, B:69:0x0168, B:71:0x0172, B:73:0x0178, B:74:0x0182, B:77:0x018a, B:78:0x018d, B:80:0x0191, B:82:0x0198, B:83:0x01a4, B:60:0x0149), top: B:93:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0154 A[Catch: all -> 0x013e, TryCatch #1 {all -> 0x013e, blocks: (B:43:0x00f8, B:45:0x0108, B:48:0x0116, B:50:0x0122, B:52:0x012c, B:54:0x0132, B:57:0x0141, B:64:0x0154, B:67:0x015e, B:69:0x0168, B:71:0x0172, B:73:0x0178, B:74:0x0182, B:77:0x018a, B:78:0x018d, B:80:0x0191, B:82:0x0198, B:83:0x01a4, B:60:0x0149), top: B:93:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x015d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0168 A[Catch: all -> 0x013e, TryCatch #1 {all -> 0x013e, blocks: (B:43:0x00f8, B:45:0x0108, B:48:0x0116, B:50:0x0122, B:52:0x012c, B:54:0x0132, B:57:0x0141, B:64:0x0154, B:67:0x015e, B:69:0x0168, B:71:0x0172, B:73:0x0178, B:74:0x0182, B:77:0x018a, B:78:0x018d, B:80:0x0191, B:82:0x0198, B:83:0x01a4, B:60:0x0149), top: B:93:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0172 A[Catch: all -> 0x013e, TryCatch #1 {all -> 0x013e, blocks: (B:43:0x00f8, B:45:0x0108, B:48:0x0116, B:50:0x0122, B:52:0x012c, B:54:0x0132, B:57:0x0141, B:64:0x0154, B:67:0x015e, B:69:0x0168, B:71:0x0172, B:73:0x0178, B:74:0x0182, B:77:0x018a, B:78:0x018d, B:80:0x0191, B:82:0x0198, B:83:0x01a4, B:60:0x0149), top: B:93:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0178 A[Catch: all -> 0x013e, TryCatch #1 {all -> 0x013e, blocks: (B:43:0x00f8, B:45:0x0108, B:48:0x0116, B:50:0x0122, B:52:0x012c, B:54:0x0132, B:57:0x0141, B:64:0x0154, B:67:0x015e, B:69:0x0168, B:71:0x0172, B:73:0x0178, B:74:0x0182, B:77:0x018a, B:78:0x018d, B:80:0x0191, B:82:0x0198, B:83:0x01a4, B:60:0x0149), top: B:93:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x018a A[Catch: all -> 0x013e, LOOP:4: B:67:0x015e->B:77:0x018a, LOOP_END, TryCatch #1 {all -> 0x013e, blocks: (B:43:0x00f8, B:45:0x0108, B:48:0x0116, B:50:0x0122, B:52:0x012c, B:54:0x0132, B:57:0x0141, B:64:0x0154, B:67:0x015e, B:69:0x0168, B:71:0x0172, B:73:0x0178, B:74:0x0182, B:77:0x018a, B:78:0x018d, B:80:0x0191, B:82:0x0198, B:83:0x01a4, B:60:0x0149), top: B:93:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0191 A[Catch: all -> 0x013e, TryCatch #1 {all -> 0x013e, blocks: (B:43:0x00f8, B:45:0x0108, B:48:0x0116, B:50:0x0122, B:52:0x012c, B:54:0x0132, B:57:0x0141, B:64:0x0154, B:67:0x015e, B:69:0x0168, B:71:0x0172, B:73:0x0178, B:74:0x0182, B:77:0x018a, B:78:0x018d, B:80:0x0191, B:82:0x0198, B:83:0x01a4, B:60:0x0149), top: B:93:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0198 A[Catch: all -> 0x013e, LOOP:6: B:81:0x0196->B:82:0x0198, LOOP_END, TryCatch #1 {all -> 0x013e, blocks: (B:43:0x00f8, B:45:0x0108, B:48:0x0116, B:50:0x0122, B:52:0x012c, B:54:0x0132, B:57:0x0141, B:64:0x0154, B:67:0x015e, B:69:0x0168, B:71:0x0172, B:73:0x0178, B:74:0x0182, B:77:0x018a, B:78:0x018d, B:80:0x0191, B:82:0x0198, B:83:0x01a4, B:60:0x0149), top: B:93:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0152 A[EDGE_INSN: B:98:0x0152->B:63:0x0152 BREAK  A[LOOP:2: B:48:0x0116->B:60:0x0149], SYNTHETIC] */
    public l C() {
        F fE;
        long j9;
        long j10;
        List list;
        int size;
        int i10;
        Object[] objArr;
        long[] jArr;
        int length;
        int i11;
        long j11;
        int i12;
        int i13;
        F fE2 = E();
        Map mapR = fE2 != null ? p.R((c) p.f59j.get(), this, p.f53d.o(((A.a) p.f59j.get()).f())) : null;
        List listL = AbstractC1444s.l();
        synchronized (p.I()) {
            try {
                p.g0(this);
                if (fE2 == null || fE2.c() == 0) {
                    c();
                    A.a aVar = (A.a) p.f59j.get();
                    p.a0(aVar, p.f50a);
                    fE = aVar.E();
                    if (fE == null || !fE.e()) {
                        fE = null;
                    } else {
                        listL = p.f57h;
                    }
                } else {
                    A.a aVar2 = (A.a) p.f59j.get();
                    l lVarI = I(p.f54e, mapR, p.f53d.o(aVar2.f()));
                    if (!kotlin.jvm.internal.n.d(lVarI, l.b.f32a)) {
                        return lVarI;
                    }
                    c();
                    p.a0(aVar2, p.f50a);
                    fE = aVar2.E();
                    P(null);
                    aVar2.P(null);
                    listL = p.f57h;
                }
                A a10 = A.f21846a;
                this.f15o = true;
                if (fE != null) {
                    Set setA = p190t.e.a(fE);
                    if (!setA.isEmpty()) {
                        int size2 = listL.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            ((p219v8.p) listL.get(i14)).invoke(setA, this);
                        }
                    }
                }
                if (fE2 != null && fE2.e()) {
                    Set setA2 = p190t.e.a(fE2);
                    int size3 = listL.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        ((p219v8.p) listL.get(i15)).invoke(setA2, this);
                    }
                }
                synchronized (p.I()) {
                    try {
                        r();
                        p.C();
                        if (fE != null) {
                            Object[] objArr2 = fE.f11289b;
                            long[] jArr2 = fE.f11288a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i16 = 0;
                                j9 = 128;
                                while (true) {
                                    long j12 = jArr2[i16];
                                    j10 = 255;
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i16 != length2) {
                                            break;
                                            break;
                                        }
                                        i16++;
                                    } else {
                                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((j12 & 255) < 128) {
                                                p.U((u) objArr2[(i16 << 3) + i18]);
                                            }
                                            j12 >>= 8;
                                        }
                                        if (i17 != 8) {
                                            break;
                                        }
                                        if (i16 != length2) {
                                            break;
                                        }
                                        i16++;
                                    }
                                }
                            }
                            if (fE2 != null) {
                                objArr = fE2.f11289b;
                                jArr = fE2.f11288a;
                                length = jArr.length - 2;
                                if (length >= 0) {
                                    i11 = 0;
                                    while (true) {
                                        j11 = jArr[i11];
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            if (i11 != length) {
                                                break;
                                                break;
                                            }
                                            i11++;
                                        } else {
                                            i12 = 8 - ((~(i11 - length)) >>> 31);
                                            for (i13 = 0; i13 < i12; i13++) {
                                                if ((j11 & j10) < j9) {
                                                    p.U((u) objArr[(i11 << 3) + i13]);
                                                }
                                                j11 >>= 8;
                                            }
                                            if (i12 == 8) {
                                                break;
                                            }
                                            if (i11 != length) {
                                                break;
                                            }
                                            i11++;
                                        }
                                    }
                                }
                            }
                            list = this.f11k;
                            if (list != null) {
                                size = list.size();
                                for (i10 = 0; i10 < size; i10++) {
                                    p.U((u) list.get(i10));
                                }
                            }
                            this.f11k = null;
                            A a11 = A.f21846a;
                        }
                        j9 = 128;
                        j10 = 255;
                        if (fE2 != null) {
                            objArr = fE2.f11289b;
                            jArr = fE2.f11288a;
                            length = jArr.length - 2;
                            if (length >= 0) {
                                i11 = 0;
                                while (true) {
                                    j11 = jArr[i11];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        if (i11 != length) {
                                            break;
                                            break;
                                        }
                                        i11++;
                                    } else {
                                        i12 = 8 - ((~(i11 - length)) >>> 31);
                                        while (i13 < i12) {
                                            if ((j11 & j10) < j9) {
                                                p.U((u) objArr[(i11 << 3) + i13]);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i12 == 8) {
                                            break;
                                            break;
                                        }
                                        if (i11 != length) {
                                            break;
                                            break;
                                        }
                                        i11++;
                                    }
                                }
                            }
                        }
                        list = this.f11k;
                        if (list != null) {
                            size = list.size();
                            while (i10 < size) {
                                p.U((u) list.get(i10));
                            }
                        }
                        this.f11k = null;
                        A a12 = A.f21846a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return l.b.f32a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean D() {
        return this.f15o;
    }

    public F E() {
        return this.f10j;
    }

    public final n F() {
        return this.f12l;
    }

    public final int[] G() {
        return this.f13m;
    }

    @Override // A.k
    /* JADX INFO: renamed from: H */
    public p219v8.l h() {
        return this.f7g;
    }

    public final l I(int i10, Map map, n nVar) {
        n nVar2;
        Object[] objArr;
        long[] jArr;
        n nVar3;
        Object[] objArr2;
        long[] jArr2;
        int i11;
        w wVarW;
        w wVarF;
        n nVarR = g().s(f()).r(this.f12l);
        F fE = E();
        kotlin.jvm.internal.n.e(fE);
        Object[] objArr3 = fE.f11289b;
        long[] jArr3 = fE.f11288a;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        List listG0 = null;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j9 = jArr3[i12];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j9 & 255) < 128) {
                            i11 = i13;
                            u uVar = (u) objArr3[(i12 << 3) + i15];
                            w wVarB = uVar.b();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            ArrayList arrayList2 = arrayList;
                            w wVarW2 = p.W(wVarB, i10, nVar);
                            if (wVarW2 == null || (wVarW = p.W(wVarB, f(), nVarR)) == null) {
                                nVar3 = nVarR;
                            } else {
                                nVar3 = nVarR;
                                if (wVarW.f() != 1 && !kotlin.jvm.internal.n.d(wVarW2, wVarW)) {
                                    w wVarW3 = p.W(wVarB, f(), g());
                                    if (wVarW3 == null) {
                                        p.V();
                                        throw new p079h8.f();
                                    }
                                    if (map == null || (wVarF = (w) map.get(wVarW2)) == null) {
                                        wVarF = uVar.f(wVarW, wVarW2, wVarW3);
                                    }
                                    if (wVarF == null) {
                                        return new l.a(this);
                                    }
                                    if (!kotlin.jvm.internal.n.d(wVarF, wVarW3)) {
                                        if (kotlin.jvm.internal.n.d(wVarF, wVarW2)) {
                                            ArrayList arrayList3 = arrayList2 == null ? new ArrayList() : arrayList2;
                                            arrayList3.add(p079h8.v.a(uVar, wVarW2.d()));
                                            if (listG0 == null) {
                                                listG0 = new ArrayList();
                                            }
                                            listG0.add(uVar);
                                            arrayList = arrayList3;
                                        } else {
                                            arrayList = arrayList2 == null ? new ArrayList() : arrayList2;
                                            arrayList.add(!kotlin.jvm.internal.n.d(wVarF, wVarW) ? p079h8.v.a(uVar, wVarF) : p079h8.v.a(uVar, wVarW.d()));
                                        }
                                    }
                                }
                            }
                            arrayList = arrayList2;
                        } else {
                            nVar3 = nVarR;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i11 = i13;
                        }
                        j9 >>= i11;
                        i15++;
                        i13 = i11;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        nVarR = nVar3;
                    }
                    nVar2 = nVarR;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i14 != i13) {
                        break;
                    }
                } else {
                    nVar2 = nVarR;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                objArr3 = objArr;
                jArr3 = jArr;
                nVarR = nVar2;
            }
        }
        if (arrayList != null) {
            B();
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                p079h8.o oVar = (p079h8.o) arrayList.get(i16);
                u uVar2 = (u) oVar.a();
                w wVar = (w) oVar.b();
                wVar.h(f());
                synchronized (p.I()) {
                    wVar.g(uVar2.b());
                    uVar2.k(wVar);
                    A a10 = A.f21846a;
                }
            }
        }
        if (listG0 != null) {
            int size2 = listG0.size();
            for (int i17 = 0; i17 < size2; i17++) {
                fE.x((u) listG0.get(i17));
            }
            List list = this.f11k;
            if (list != null) {
                listG0 = AbstractC1444s.g0(list, listG0);
            }
            this.f11k = listG0;
        }
        return l.b.f32a;
    }

    public final void J(int i10) {
        synchronized (p.I()) {
            this.f12l = this.f12l.s(i10);
            A a10 = A.f21846a;
        }
    }

    public final void K(n nVar) {
        synchronized (p.I()) {
            this.f12l = this.f12l.r(nVar);
            A a10 = A.f21846a;
        }
    }

    public final void L(int i10) {
        if (i10 >= 0) {
            this.f13m = AbstractC1439m.u(this.f13m, i10);
        }
    }

    public final void M(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.f13m;
        if (iArr2.length != 0) {
            iArr = AbstractC1439m.v(iArr2, iArr);
        }
        this.f13m = iArr;
    }

    public final void O(boolean z9) {
        this.f15o = z9;
    }

    public void P(F f10) {
        this.f10j = f10;
    }

    public c Q(p219v8.l lVar, p219v8.l lVar2) {
        d dVar;
        z();
        S();
        J(f());
        synchronized (p.I()) {
            int i10 = p.f54e;
            p.f54e = i10 + 1;
            p.f53d = p.f53d.s(i10);
            n nVarG = g();
            v(nVarG.s(i10));
            dVar = new d(i10, p.z(nVarG, f() + 1, i10), p.L(lVar, h(), false, 4, null), p.M(lVar2, k()), this);
        }
        if (D() || e()) {
            return dVar;
        }
        int iF = f();
        synchronized (p.I()) {
            int i11 = p.f54e;
            p.f54e = i11 + 1;
            u(i11);
            p.f53d = p.f53d.s(f());
            A a10 = A.f21846a;
        }
        v(p.z(g(), iF + 1, f()));
        return dVar;
    }

    @Override // A.k
    public void c() {
        p.f53d = p.f53d.o(f()).n(this.f12l);
    }

    @Override // A.k
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        n(this);
    }

    @Override // A.k
    public boolean i() {
        return false;
    }

    @Override // A.k
    public int j() {
        return this.f9i;
    }

    @Override // A.k
    public p219v8.l k() {
        return this.f8h;
    }

    @Override // A.k
    public void m(k kVar) {
        this.f14n++;
    }

    @Override // A.k
    public void n(k kVar) {
        if (!(this.f14n > 0)) {
            AbstractC1701q0.a("no pending nested snapshots");
        }
        int i10 = this.f14n - 1;
        this.f14n = i10;
        if (i10 != 0 || this.f15o) {
            return;
        }
        A();
    }

    @Override // A.k
    public void o() {
        if (this.f15o || e()) {
            return;
        }
        B();
    }

    @Override // A.k
    public void p(u uVar) {
        F fE = E();
        if (fE == null) {
            fE = O.a();
            P(fE);
        }
        fE.h(uVar);
    }

    @Override // A.k
    public void r() {
        N();
        super.r();
    }

    @Override // A.k
    public void w(int i10) {
        this.f9i = i10;
    }

    @Override // A.k
    public k x(p219v8.l lVar) {
        e eVar;
        z();
        S();
        int iF = f();
        J(f());
        synchronized (p.I()) {
            int i10 = p.f54e;
            p.f54e = i10 + 1;
            p.f53d = p.f53d.s(i10);
            eVar = new e(i10, p.z(g(), iF + 1, i10), p.L(lVar, h(), false, 4, null), this);
        }
        if (D() || e()) {
            return eVar;
        }
        int iF2 = f();
        synchronized (p.I()) {
            int i11 = p.f54e;
            p.f54e = i11 + 1;
            u(i11);
            p.f53d = p.f53d.s(f());
            A a10 = A.f21846a;
        }
        v(p.z(g(), iF2 + 1, f()));
        return eVar;
    }
}

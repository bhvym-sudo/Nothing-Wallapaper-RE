package p170r;

import androidx.collection.E;
import androidx.collection.v;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p079h8.A;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;
import p129m8.i;
import p219v8.l;
import p219v8.p;
import p240y.f;

/* JADX INFO: renamed from: r.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1692m implements InterfaceC1690l {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f25473B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f25474C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f25475D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final a f25476E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final a1 f25477F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f25478G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f25479H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private K0 f25480I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private L0 f25481J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private O0 f25482K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f25483L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private InterfaceC1699p0 f25484M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private p180s.a f25485N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final p180s.b f25486O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private C1674d f25487P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private p180s.c f25488Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f25489R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f25490S;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1678f f25491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1700q f25492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L0 f25493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f25494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p180s.a f25495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p180s.a f25496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final B f25497h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C1697o0 f25499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f25500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f25501l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25502m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f25504o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private v f25505p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f25506q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f25507r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f25508s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private p190t.a f25512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f25513x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f25515z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a1 f25498i = new a1();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Q f25503n = new Q();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f25509t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Q f25510u = new Q();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private InterfaceC1699p0 f25511v = f.a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Q f25514y = new Q();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f25472A = -1;

    /* JADX INFO: renamed from: r.m$a */
    public static final class a implements F {
        a() {
        }

        @Override // p170r.F
        public void a(E e10) {
            C1692m.this.f25473B--;
        }

        @Override // p170r.F
        public void b(E e10) {
            C1692m.this.f25473B++;
        }
    }

    /* JADX INFO: renamed from: r.m$b */
    static final class b extends o implements p219v8.a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p180s.a f25518s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ K0 f25519t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ C1677e0 f25520u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p180s.a aVar, K0 k9, C1677e0 c1677e0) {
            super(0);
            this.f25518s = aVar;
            this.f25519t = k9;
            this.f25520u = c1677e0;
        }

        public final void a() {
            p180s.b bVar = C1692m.this.f25486O;
            p180s.a aVar = this.f25518s;
            C1692m c1692m = C1692m.this;
            K0 k9 = this.f25519t;
            C1677e0 c1677e0 = this.f25520u;
            p180s.a aVarM = bVar.m();
            try {
                bVar.P(aVar);
                K0 k0G0 = c1692m.g0();
                int[] iArr = c1692m.f25504o;
                p190t.a aVar2 = c1692m.f25512w;
                c1692m.f25504o = null;
                c1692m.f25512w = null;
                try {
                    c1692m.E0(k9);
                    p180s.b bVar2 = c1692m.f25486O;
                    boolean zN = bVar2.n();
                    try {
                        bVar2.Q(false);
                        c1677e0.c();
                        c1692m.l0(null, c1677e0.e(), c1677e0.f(), true);
                        bVar2.Q(zN);
                        A a10 = A.f21846a;
                        c1692m.E0(k0G0);
                        c1692m.f25504o = iArr;
                        c1692m.f25512w = aVar2;
                        bVar.P(aVarM);
                    } catch (Throwable th) {
                        bVar2.Q(zN);
                        throw th;
                    }
                } catch (Throwable th2) {
                    c1692m.E0(k0G0);
                    c1692m.f25504o = iArr;
                    c1692m.f25512w = aVar2;
                    throw th2;
                }
            } catch (Throwable th3) {
                bVar.P(aVarM);
                throw th3;
            }
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return A.f21846a;
        }
    }

    /* JADX INFO: renamed from: r.m$c */
    static final class c extends o implements p219v8.a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ C1677e0 f25522s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C1677e0 c1677e0) {
            super(0);
            this.f25522s = c1677e0;
        }

        public final void a() {
            C1692m c1692m = C1692m.this;
            this.f25522s.c();
            c1692m.l0(null, this.f25522s.e(), this.f25522s.f(), true);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return A.f21846a;
        }
    }

    /* JADX INFO: renamed from: r.m$d */
    static final class d extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Object f25523r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC1673c0 abstractC1673c0, Object obj) {
            super(2);
            this.f25523r = obj;
        }

        public final void a(InterfaceC1690l interfaceC1690l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1690l.h()) {
                interfaceC1690l.m();
            } else {
                if (AbstractC1696o.G()) {
                    AbstractC1696o.O(316014703, i10, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3293)");
                }
                throw null;
            }
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC1690l) obj, ((Number) obj2).intValue());
            return A.f21846a;
        }
    }

    public C1692m(InterfaceC1678f interfaceC1678f, AbstractC1700q abstractC1700q, L0 l9, Set set, p180s.a aVar, p180s.a aVar2, B b10) {
        this.f25491b = interfaceC1678f;
        this.f25492c = abstractC1700q;
        this.f25493d = l9;
        this.f25494e = set;
        this.f25495f = aVar;
        this.f25496g = aVar2;
        this.f25497h = b10;
        this.f25475D = abstractC1700q.e() || abstractC1700q.c();
        this.f25476E = new a();
        this.f25477F = new a1();
        K0 k0Y = l9.y();
        k0Y.d();
        this.f25480I = k0Y;
        L0 l10 = new L0();
        if (abstractC1700q.e()) {
            l10.n();
        }
        if (abstractC1700q.c()) {
            l10.m();
        }
        this.f25481J = l10;
        O0 o0Z = l10.z();
        o0Z.K(true);
        this.f25482K = o0Z;
        this.f25486O = new p180s.b(this, this.f25495f);
        K0 k0Y2 = this.f25481J.y();
        try {
            C1674d c1674dA = k0Y2.a(0);
            k0Y2.d();
            this.f25487P = c1674dA;
            this.f25488Q = new p180s.c();
        } catch (Throwable th) {
            k0Y2.d();
            throw th;
        }
    }

    private final void A0(int i10, int i11, int i12) {
        K0 k9 = this.f25480I;
        int I9 = AbstractC1696o.I(k9, i10, i11, i12);
        while (i10 > 0 && i10 != I9) {
            if (k9.I(i10)) {
                this.f25486O.y();
            }
            i10 = k9.O(i10);
        }
        P(i11, I9);
    }

    private final C1674d B0() {
        int i10;
        int i11;
        if (f0()) {
            if (!AbstractC1696o.F(this.f25482K)) {
                return null;
            }
            int iZ = this.f25482K.Z() - 1;
            int iB0 = this.f25482K.B0(iZ);
            while (true) {
                int i12 = iB0;
                i11 = iZ;
                iZ = i12;
                if (iZ == this.f25482K.a0() || iZ < 0) {
                    break;
                }
                iB0 = this.f25482K.B0(iZ);
            }
            return this.f25482K.D(i11);
        }
        if (!AbstractC1696o.E(this.f25480I)) {
            return null;
        }
        int iJ = this.f25480I.j() - 1;
        int iO = this.f25480I.O(iJ);
        while (true) {
            int i13 = iO;
            i10 = iJ;
            iJ = i13;
            if (iJ == this.f25480I.t() || iJ < 0) {
                break;
            }
            iO = this.f25480I.O(iJ);
        }
        return this.f25480I.a(i10);
    }

    private final void C0(int i10) {
        D0(this, i10, false, 0);
        this.f25486O.h();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0069  */
    private final void D() {
        C1714x0 c1714x0;
        boolean z9;
        if (f0()) {
            B bB0 = b0();
            n.f(bB0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            C1714x0 c1714x1 = new C1714x0((C1703s) bB0);
            this.f25477F.h(c1714x1);
            U0(c1714x1);
            c1714x1.G(this.f25474C);
            return;
        }
        S sK = AbstractC1696o.K(this.f25509t, this.f25480I.t());
        Object objJ = this.f25480I.J();
        if (n.d(objJ, InterfaceC1690l.f25468a.a())) {
            B bB1 = b0();
            n.f(bB1, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            c1714x0 = new C1714x0((C1703s) bB1);
            U0(c1714x0);
        } else {
            n.f(objJ, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            c1714x0 = (C1714x0) objJ;
        }
        if (sK == null) {
            boolean zL = c1714x0.l();
            if (zL) {
                c1714x0.B(false);
            }
            z9 = zL;
        }
        c1714x0.C(z9);
        this.f25477F.h(c1714x0);
        c1714x0.G(this.f25474C);
    }

    private static final int D0(C1692m c1692m, int i10, boolean z9, int i11) {
        K0 k9 = c1692m.f25480I;
        if (k9.E(i10)) {
            int iB = k9.B(i10);
            Object objC = k9.C(i10);
            if (iB == 206 && n.d(objC, AbstractC1696o.C())) {
                k9.A(i10, 0);
                return k9.M(i10);
            }
            if (k9.I(i10)) {
                return 1;
            }
            return k9.M(i10);
        }
        if (!k9.e(i10)) {
            if (k9.I(i10)) {
                return 1;
            }
            return k9.M(i10);
        }
        int iD = k9.D(i10) + i10;
        int iD0 = 0;
        for (int iD2 = i10 + 1; iD2 < iD; iD2 += k9.D(iD2)) {
            boolean zI = k9.I(iD2);
            if (zI) {
                c1692m.f25486O.h();
                c1692m.f25486O.u(k9.K(iD2));
            }
            iD0 += D0(c1692m, iD2, zI || z9, zI ? 0 : i11 + iD0);
            if (zI) {
                c1692m.f25486O.h();
                c1692m.f25486O.y();
            }
        }
        if (k9.I(i10)) {
            return 1;
        }
        return iD0;
    }

    private final void F() {
        this.f25499j = null;
        this.f25500k = 0;
        this.f25501l = 0;
        this.f25490S = 0;
        this.f25508s = false;
        this.f25486O.O();
        this.f25477F.a();
        G();
    }

    private final void G() {
        this.f25504o = null;
        this.f25505p = null;
    }

    private final void G0() {
        this.f25501l += this.f25480I.R();
    }

    private final void H0() {
        this.f25501l = this.f25480I.u();
        this.f25480I.S();
    }

    private final int I(int i10, int i11, int i12, int i13) {
        if (i10 == i12) {
            return i13;
        }
        int iH0 = h0(this.f25480I, i10);
        if (iH0 == 126665345) {
            return iH0;
        }
        int iO = this.f25480I.O(i10);
        if (iO != i12) {
            i13 = I(iO, s0(iO), i12, i13);
        }
        if (this.f25480I.F(i10)) {
            i11 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i13, 3) ^ iH0, 3) ^ i11;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x0108  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:68:0x015c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0175  */
    /* JADX WARN: Code duplicated, block: B:71:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0183  */
    /* JADX WARN: Code duplicated, block: B:74:0x0187  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:78:0x0195  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d0  */
    private final void I0(int i10, Object obj, int i11, Object obj2) {
        int iRotateLeft;
        O.a aVar;
        boolean z9;
        C1697o0 c1697o0;
        boolean z10;
        C1697o0 c1697o1;
        int iZ;
        C1697o0 c1697o2;
        Object objA = obj;
        W0();
        int i12 = this.f25502m;
        if (objA == null) {
            if (obj2 == null || i10 != 207 || n.d(obj2, InterfaceC1690l.f25468a.a())) {
                iRotateLeft = i12 ^ Integer.rotateLeft(Integer.rotateLeft(c0(), 3) ^ i10, 3);
            } else {
                this.f25490S = i12 ^ Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(c0(), 3), 3);
            }
            if (objA == null) {
                this.f25502m++;
            }
            aVar = O.f25347a;
            if (i11 != aVar.a()) {
                z9 = true;
            } else {
                z9 = false;
            }
            c1697o0 = null;
            if (f0()) {
                this.f25480I.c();
                iZ = this.f25482K.Z();
                if (z9) {
                    this.f25482K.g1(i10, InterfaceC1690l.f25468a.a());
                } else if (obj2 != null) {
                    O0 o9 = this.f25482K;
                    if (objA == null) {
                        objA = InterfaceC1690l.f25468a.a();
                    }
                    o9.c1(i10, objA, obj2);
                } else {
                    O0 o10 = this.f25482K;
                    if (objA == null) {
                        objA = InterfaceC1690l.f25468a.a();
                    }
                    o10.e1(i10, objA);
                }
                c1697o2 = this.f25499j;
                if (c1697o2 != null) {
                    V v9 = new V(i10, -1, k0(iZ), -1, 0);
                    c1697o2.i(v9, this.f25500k - c1697o2.e());
                    c1697o2.h(v9);
                }
                V(z9, null);
                return;
            }
            if (i11 != aVar.b() && this.f25515z) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f25499j == null) {
                int iM = this.f25480I.m();
                if (z10 && iM == i10 && n.d(obj, this.f25480I.n())) {
                    M0(z9, obj2);
                } else {
                    this.f25499j = new C1697o0(this.f25480I.h(), this.f25500k);
                }
            }
            c1697o1 = this.f25499j;
            if (c1697o1 != null) {
                V vD = c1697o1.d(i10, obj);
                if (!z10 || vD == null) {
                    this.f25480I.c();
                    this.f25489R = true;
                    this.f25484M = null;
                    U();
                    this.f25482K.H();
                    int iZ2 = this.f25482K.Z();
                    if (z9) {
                        this.f25482K.g1(i10, InterfaceC1690l.f25468a.a());
                    } else if (obj2 != null) {
                        O0 o11 = this.f25482K;
                        if (objA == null) {
                            objA = InterfaceC1690l.f25468a.a();
                        }
                        o11.c1(i10, objA, obj2);
                    } else {
                        O0 o12 = this.f25482K;
                        if (objA == null) {
                            objA = InterfaceC1690l.f25468a.a();
                        }
                        o12.e1(i10, objA);
                    }
                    this.f25487P = this.f25482K.D(iZ2);
                    V v10 = new V(i10, -1, k0(iZ2), -1, 0);
                    c1697o1.i(v10, this.f25500k - c1697o1.e());
                    c1697o1.h(v10);
                    c1697o0 = new C1697o0(new ArrayList(), z9 ? 0 : this.f25500k);
                } else {
                    c1697o1.h(vD);
                    int iB = vD.b();
                    this.f25500k = c1697o1.g(vD) + c1697o1.e();
                    int iM2 = c1697o1.m(vD);
                    int iA = iM2 - c1697o1.a();
                    c1697o1.k(iM2, c1697o1.a());
                    this.f25486O.w(iB);
                    this.f25480I.P(iB);
                    if (iA > 0) {
                        this.f25486O.t(iA);
                    }
                    M0(z9, obj2);
                }
            }
            V(z9, c1697o0);
        }
        iRotateLeft = Integer.rotateLeft((objA instanceof Enum ? ((Enum) objA).ordinal() : obj.hashCode()) ^ Integer.rotateLeft(c0(), 3), 3);
        this.f25490S = iRotateLeft;
        if (objA == null) {
            this.f25502m++;
        }
        aVar = O.f25347a;
        if (i11 != aVar.a()) {
            z9 = true;
        } else {
            z9 = false;
        }
        c1697o0 = null;
        if (f0()) {
            this.f25480I.c();
            iZ = this.f25482K.Z();
            if (z9) {
                this.f25482K.g1(i10, InterfaceC1690l.f25468a.a());
            } else if (obj2 != null) {
                O0 o13 = this.f25482K;
                if (objA == null) {
                    objA = InterfaceC1690l.f25468a.a();
                }
                o13.c1(i10, objA, obj2);
            } else {
                O0 o14 = this.f25482K;
                if (objA == null) {
                    objA = InterfaceC1690l.f25468a.a();
                }
                o14.e1(i10, objA);
            }
            c1697o2 = this.f25499j;
            if (c1697o2 != null) {
                V v11 = new V(i10, -1, k0(iZ), -1, 0);
                c1697o2.i(v11, this.f25500k - c1697o2.e());
                c1697o2.h(v11);
            }
            V(z9, null);
            return;
        }
        if (i11 != aVar.b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f25499j == null) {
            int iM3 = this.f25480I.m();
            if (z10) {
                this.f25499j = new C1697o0(this.f25480I.h(), this.f25500k);
            } else {
                this.f25499j = new C1697o0(this.f25480I.h(), this.f25500k);
            }
        }
        c1697o1 = this.f25499j;
        if (c1697o1 != null) {
            V vD2 = c1697o1.d(i10, obj);
            if (z10) {
                this.f25480I.c();
                this.f25489R = true;
                this.f25484M = null;
                U();
                this.f25482K.H();
                int iZ3 = this.f25482K.Z();
                if (z9) {
                    this.f25482K.g1(i10, InterfaceC1690l.f25468a.a());
                } else if (obj2 != null) {
                    O0 o15 = this.f25482K;
                    if (objA == null) {
                        objA = InterfaceC1690l.f25468a.a();
                    }
                    o15.c1(i10, objA, obj2);
                } else {
                    O0 o16 = this.f25482K;
                    if (objA == null) {
                        objA = InterfaceC1690l.f25468a.a();
                    }
                    o16.e1(i10, objA);
                }
                this.f25487P = this.f25482K.D(iZ3);
                V v12 = new V(i10, -1, k0(iZ3), -1, 0);
                c1697o1.i(v12, this.f25500k - c1697o1.e());
                c1697o1.h(v12);
                c1697o0 = new C1697o0(new ArrayList(), z9 ? 0 : this.f25500k);
            } else {
                this.f25480I.c();
                this.f25489R = true;
                this.f25484M = null;
                U();
                this.f25482K.H();
                int iZ4 = this.f25482K.Z();
                if (z9) {
                    this.f25482K.g1(i10, InterfaceC1690l.f25468a.a());
                } else if (obj2 != null) {
                    O0 o17 = this.f25482K;
                    if (objA == null) {
                        objA = InterfaceC1690l.f25468a.a();
                    }
                    o17.c1(i10, objA, obj2);
                } else {
                    O0 o18 = this.f25482K;
                    if (objA == null) {
                        objA = InterfaceC1690l.f25468a.a();
                    }
                    o18.e1(i10, objA);
                }
                this.f25487P = this.f25482K.D(iZ4);
                V v13 = new V(i10, -1, k0(iZ4), -1, 0);
                c1697o1.i(v13, this.f25500k - c1697o1.e());
                c1697o1.h(v13);
                c1697o0 = new C1697o0(new ArrayList(), z9 ? 0 : this.f25500k);
            }
        }
        V(z9, c1697o0);
    }

    private final void J() {
        AbstractC1696o.M(this.f25482K.Y());
        Y();
    }

    private final void J0(int i10) {
        I0(i10, null, O.f25347a.a(), null);
    }

    private final InterfaceC1699p0 K() {
        InterfaceC1699p0 interfaceC1699p0 = this.f25484M;
        return interfaceC1699p0 != null ? interfaceC1699p0 : L(this.f25480I.t());
    }

    private final void K0(int i10, Object obj) {
        I0(i10, obj, O.f25347a.a(), null);
    }

    private final InterfaceC1699p0 L(int i10) {
        InterfaceC1699p0 interfaceC1699p0;
        if (f0() && this.f25483L) {
            int iA0 = this.f25482K.a0();
            while (iA0 > 0) {
                if (this.f25482K.g0(iA0) == 202 && n.d(this.f25482K.h0(iA0), AbstractC1696o.x())) {
                    Object objE0 = this.f25482K.e0(iA0);
                    n.f(objE0, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    InterfaceC1699p0 interfaceC1699p1 = (InterfaceC1699p0) objE0;
                    this.f25484M = interfaceC1699p1;
                    return interfaceC1699p1;
                }
                iA0 = this.f25482K.B0(iA0);
            }
        }
        if (this.f25480I.w() > 0) {
            while (i10 > 0) {
                if (this.f25480I.B(i10) == 202 && n.d(this.f25480I.C(i10), AbstractC1696o.x())) {
                    p190t.a aVar = this.f25512w;
                    if (aVar == null || (interfaceC1699p0 = (InterfaceC1699p0) aVar.a(i10)) == null) {
                        Object objY = this.f25480I.y(i10);
                        n.f(objY, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        interfaceC1699p0 = (InterfaceC1699p0) objY;
                    }
                    this.f25484M = interfaceC1699p0;
                    return interfaceC1699p0;
                }
                i10 = this.f25480I.O(i10);
            }
        }
        InterfaceC1699p0 interfaceC1699p2 = this.f25511v;
        this.f25484M = interfaceC1699p2;
        return interfaceC1699p2;
    }

    private final void M0(boolean z9, Object obj) {
        if (z9) {
            this.f25480I.U();
            return;
        }
        if (obj != null && this.f25480I.k() != obj) {
            this.f25486O.U(obj);
        }
        this.f25480I.T();
    }

    private final void N0() {
        this.f25502m = 0;
        this.f25480I = this.f25493d.y();
        J0(100);
        this.f25492c.o();
        this.f25511v = this.f25492c.f();
        this.f25514y.j(AbstractC1696o.o(this.f25513x));
        this.f25513x = s(this.f25511v);
        this.f25484M = null;
        if (!this.f25506q) {
            this.f25506q = this.f25492c.d();
        }
        if (!this.f25475D) {
            this.f25475D = this.f25492c.e();
        }
        Set set = (Set) AbstractC1713x.b(this.f25511v, B.d.a());
        if (set != null) {
            set.add(this.f25493d);
            this.f25492c.m(set);
        }
        J0(this.f25492c.g());
    }

    private final void O(p190t.f fVar, p pVar) {
        boolean z9;
        if (this.f25478G) {
            AbstractC1696o.r("Reentrant composition is not supported");
        }
        Object objA = f1.f25445a.a("Compose:recompose");
        try {
            this.f25474C = A.p.H().f();
            this.f25512w = null;
            E eD = fVar.d();
            Object[] objArr = eD.f11282b;
            Object[] objArr2 = eD.f11283c;
            long[] jArr = eD.f11281a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j9 = jArr[i10];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8;
                        int i12 = 8 - ((~(i10 - length)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j9 & 255) < 128) {
                                int i14 = (i10 << 3) + i13;
                                Object obj = objArr[i14];
                                Object obj2 = objArr2[i14];
                                n.f(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                C1674d c1674dI = ((C1714x0) obj).i();
                                if (c1674dI != null) {
                                    int iA = c1674dI.a();
                                    List list = this.f25509t;
                                    C1714x0 c1714x0 = (C1714x0) obj;
                                    if (obj2 == H0.f25305a) {
                                        obj2 = null;
                                    }
                                    list.add(new S(c1714x0, iA, obj2));
                                }
                            }
                            j9 >>= i11;
                            i13++;
                            i11 = i11;
                        }
                        z9 = true;
                        if (i12 != i11) {
                            break;
                        }
                    } else {
                        z9 = true;
                    }
                    if (i10 == length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                z9 = true;
            }
            AbstractC1444s.y(this.f25509t, AbstractC1696o.f25538g);
            this.f25500k = 0;
            this.f25478G = z9;
            try {
                N0();
                Object objN0 = n0();
                if (objN0 != pVar && pVar != null) {
                    U0(pVar);
                }
                a aVar = this.f25476E;
                p190t.b bVarA = S0.a();
                try {
                    bVarA.b(aVar);
                    if (pVar != null) {
                        K0(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, AbstractC1696o.y());
                        AbstractC1672c.d(this, pVar);
                        R();
                    } else if ((!this.f25507r && !this.f25513x) || objN0 == null || n.d(objN0, InterfaceC1690l.f25468a.a())) {
                        F0();
                    } else {
                        K0(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, AbstractC1696o.y());
                        AbstractC1672c.d(this, (p) I.d(objN0, 2));
                        R();
                    }
                    bVarA.w(bVarA.p() - 1);
                    T();
                    this.f25478G = false;
                    this.f25509t.clear();
                    J();
                    A a10 = A.f21846a;
                    f1.f25445a.b(objA);
                } catch (Throwable th) {
                    bVarA.w(bVarA.p() - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.f25478G = false;
                this.f25509t.clear();
                u();
                J();
                throw th2;
            }
        } catch (Throwable th3) {
            f1.f25445a.b(objA);
            throw th3;
        }
    }

    private final void P(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        P(this.f25480I.O(i10), i11);
        if (this.f25480I.I(i10)) {
            this.f25486O.u(p0(this.f25480I, i10));
        }
    }

    private final void Q(boolean z9) {
        int iHashCode;
        List list;
        int iHashCode2;
        int iG = this.f25503n.g() - 1;
        if (f0()) {
            int iA0 = this.f25482K.a0();
            int iG0 = this.f25482K.g0(iA0);
            Object objH0 = this.f25482K.h0(iA0);
            Object objE0 = this.f25482K.e0(iA0);
            if (objH0 != null) {
                iHashCode2 = Integer.hashCode(objH0 instanceof Enum ? ((Enum) objH0).ordinal() : objH0.hashCode()) ^ Integer.rotateRight(c0(), 3);
            } else if (objE0 == null || iG0 != 207 || n.d(objE0, InterfaceC1690l.f25468a.a())) {
                iHashCode2 = Integer.rotateRight(iG ^ c0(), 3) ^ Integer.hashCode(iG0);
            } else {
                this.f25490S = Integer.rotateRight(Integer.rotateRight(iG ^ c0(), 3) ^ Integer.hashCode(objE0.hashCode()), 3);
            }
            this.f25490S = Integer.rotateRight(iHashCode2, 3);
        } else {
            int iT = this.f25480I.t();
            int iB = this.f25480I.B(iT);
            Object objC = this.f25480I.C(iT);
            Object objY = this.f25480I.y(iT);
            if (objC != null) {
                iHashCode = Integer.hashCode(objC instanceof Enum ? ((Enum) objC).ordinal() : objC.hashCode()) ^ Integer.rotateRight(c0(), 3);
            } else if (objY == null || iB != 207 || n.d(objY, InterfaceC1690l.f25468a.a())) {
                iHashCode = Integer.rotateRight(iG ^ c0(), 3) ^ Integer.hashCode(iB);
            } else {
                this.f25490S = Integer.rotateRight(Integer.rotateRight(iG ^ c0(), 3) ^ Integer.hashCode(objY.hashCode()), 3);
            }
            this.f25490S = Integer.rotateRight(iHashCode, 3);
        }
        int i10 = this.f25501l;
        C1697o0 c1697o0 = this.f25499j;
        if (c1697o0 != null && c1697o0.b().size() > 0) {
            List listB = c1697o0.b();
            List listF = c1697o0.f();
            Set setE = A.b.e(listF);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = listF.size();
            int size2 = listB.size();
            int i11 = 0;
            int i12 = 0;
            int iO = 0;
            while (i11 < size2) {
                V v9 = (V) listB.get(i11);
                if (setE.contains(v9)) {
                    list = listB;
                    if (!linkedHashSet.contains(v9)) {
                        if (i12 < size) {
                            V v10 = (V) listF.get(i12);
                            if (v10 != v9) {
                                int iG2 = c1697o0.g(v10);
                                linkedHashSet.add(v10);
                                if (iG2 != iO) {
                                    int iO2 = c1697o0.o(v10);
                                    this.f25486O.v(c1697o0.e() + iG2, iO + c1697o0.e(), iO2);
                                    c1697o0.j(iG2, iO, iO2);
                                }
                            } else {
                                i11++;
                            }
                            i12++;
                            iO += c1697o0.o(v10);
                            listB = list;
                            listF = listF;
                        }
                    }
                    listB = list;
                } else {
                    this.f25486O.M(c1697o0.g(v9) + c1697o0.e(), v9.c());
                    c1697o0.n(v9.b(), 0);
                    this.f25486O.w(v9.b());
                    this.f25480I.P(v9.b());
                    x0();
                    this.f25480I.R();
                    list = listB;
                    AbstractC1696o.L(this.f25509t, v9.b(), v9.b() + this.f25480I.D(v9.b()));
                }
                i11++;
                listB = list;
            }
            this.f25486O.h();
            if (listB.size() > 0) {
                this.f25486O.w(this.f25480I.l());
                this.f25480I.S();
            }
        }
        int i13 = this.f25500k;
        while (!this.f25480I.G()) {
            int iJ = this.f25480I.j();
            x0();
            this.f25486O.M(i13, this.f25480I.R());
            AbstractC1696o.L(this.f25509t, iJ, this.f25480I.j());
        }
        boolean zF0 = f0();
        if (zF0) {
            if (z9) {
                this.f25488Q.b();
                i10 = 1;
            }
            this.f25480I.f();
            int iA1 = this.f25482K.a0();
            this.f25482K.S();
            if (!this.f25480I.s()) {
                int iK0 = k0(iA1);
                this.f25482K.T();
                this.f25482K.K(true);
                y0(this.f25487P);
                this.f25489R = false;
                if (!this.f25493d.isEmpty()) {
                    Q0(iK0, 0);
                    R0(iK0, i10);
                }
            }
        } else {
            if (z9) {
                this.f25486O.y();
            }
            int iV = this.f25480I.v();
            if (iV > 0) {
                this.f25486O.S(iV);
            }
            this.f25486O.f();
            int iT2 = this.f25480I.t();
            if (i10 != V0(iT2)) {
                R0(iT2, i10);
            }
            if (z9) {
                i10 = 1;
            }
            this.f25480I.g();
            this.f25486O.h();
        }
        W(i10, zF0);
    }

    private final void Q0(int i10, int i11) {
        if (V0(i10) != i11) {
            if (i10 < 0) {
                v vVar = this.f25505p;
                if (vVar == null) {
                    vVar = new v(0, 1, null);
                    this.f25505p = vVar;
                }
                vVar.q(i10, i11);
                return;
            }
            int[] iArr = this.f25504o;
            if (iArr == null) {
                int[] iArr2 = new int[this.f25480I.w()];
                AbstractC1439m.r(iArr2, -1, 0, 0, 6, null);
                this.f25504o = iArr2;
                iArr = iArr2;
            }
            iArr[i10] = i11;
        }
    }

    private final void R() {
        Q(false);
    }

    private final void R0(int i10, int i11) {
        int iV0 = V0(i10);
        if (iV0 != i11) {
            int i12 = i11 - iV0;
            int iB = this.f25498i.b() - 1;
            while (i10 != -1) {
                int iV1 = V0(i10) + i12;
                Q0(i10, iV1);
                for (int i13 = iB; -1 < i13; i13--) {
                    C1697o0 c1697o0 = (C1697o0) this.f25498i.f(i13);
                    if (c1697o0 != null && c1697o0.n(i10, iV1)) {
                        iB = i13 - 1;
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.f25480I.t();
                } else if (this.f25480I.I(i10)) {
                    return;
                } else {
                    i10 = this.f25480I.O(i10);
                }
            }
        }
    }

    private final InterfaceC1699p0 S0(InterfaceC1699p0 interfaceC1699p0, InterfaceC1699p0 interfaceC1699p1) {
        InterfaceC1699p0.a aVarJ = interfaceC1699p0.j();
        aVarJ.putAll(interfaceC1699p1);
        InterfaceC1699p0 interfaceC1699p0F = aVarJ.f();
        K0(204, AbstractC1696o.B());
        T0(interfaceC1699p0F);
        T0(interfaceC1699p1);
        R();
        return interfaceC1699p0F;
    }

    private final void T() {
        R();
        this.f25492c.b();
        R();
        this.f25486O.i();
        X();
        this.f25480I.d();
        this.f25507r = false;
        this.f25513x = AbstractC1696o.n(this.f25514y.i());
    }

    private final void T0(Object obj) {
        n0();
        U0(obj);
    }

    private final void U() {
        if (this.f25482K.Y()) {
            O0 o0Z = this.f25481J.z();
            this.f25482K = o0Z;
            o0Z.T0();
            this.f25483L = false;
            this.f25484M = null;
        }
    }

    private final void V(boolean z9, C1697o0 c1697o0) {
        this.f25498i.h(this.f25499j);
        this.f25499j = c1697o0;
        this.f25503n.j(this.f25501l);
        this.f25503n.j(this.f25502m);
        this.f25503n.j(this.f25500k);
        if (z9) {
            this.f25500k = 0;
        }
        this.f25501l = 0;
        this.f25502m = 0;
    }

    private final int V0(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f25504o;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.f25480I.M(i10) : i11;
        }
        v vVar = this.f25505p;
        if (vVar == null || !vVar.a(i10)) {
            return 0;
        }
        return vVar.c(i10);
    }

    private final void W(int i10, boolean z9) {
        C1697o0 c1697o0 = (C1697o0) this.f25498i.g();
        if (c1697o0 != null && !z9) {
            c1697o0.l(c1697o0.a() + 1);
        }
        this.f25499j = c1697o0;
        this.f25500k = this.f25503n.i() + i10;
        this.f25502m = this.f25503n.i();
        this.f25501l = this.f25503n.i() + i10;
    }

    private final void W0() {
        if (this.f25508s) {
            AbstractC1696o.r("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final void X() {
        this.f25486O.l();
        if (!this.f25498i.c()) {
            AbstractC1696o.r("Start/end imbalance");
        }
        F();
    }

    private final void Y() {
        L0 l9 = new L0();
        if (this.f25475D) {
            l9.n();
        }
        if (this.f25492c.c()) {
            l9.m();
        }
        this.f25481J = l9;
        O0 o0Z = l9.z();
        o0Z.K(true);
        this.f25482K = o0Z;
    }

    private final int h0(K0 k9, int i10) {
        Object objY;
        if (!k9.F(i10)) {
            int iB = k9.B(i10);
            return (iB != 207 || (objY = k9.y(i10)) == null || n.d(objY, InterfaceC1690l.f25468a.a())) ? iB : objY.hashCode();
        }
        Object objC = k9.C(i10);
        if (objC != null) {
            return objC instanceof Enum ? ((Enum) objC).ordinal() : objC.hashCode();
        }
        return 0;
    }

    private final void i0(List list) throws Throwable {
        p180s.b bVar;
        p180s.b bVar2;
        K0 k9;
        p180s.a aVar;
        K0 k10;
        int i10 = 1;
        p180s.b bVar3 = this.f25486O;
        p180s.a aVar2 = this.f25496g;
        p180s.a aVarM = bVar3.m();
        try {
            bVar3.P(aVar2);
            this.f25486O.N();
            int size = list.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                try {
                    p079h8.o oVar = (p079h8.o) list.get(i12);
                    C1677e0 c1677e0 = (C1677e0) oVar.a();
                    C1677e0 c1677e1 = (C1677e0) oVar.b();
                    C1674d c1674dA = c1677e0.a();
                    int iB = c1677e0.g().b(c1674dA);
                    p240y.d dVar = new p240y.d(i11, i10, null);
                    this.f25486O.d(dVar, c1674dA);
                    if (c1677e1 == null) {
                        if (n.d(c1677e0.g(), this.f25481J)) {
                            J();
                        }
                        K0 k0Y = c1677e0.g().y();
                        try {
                            k0Y.P(iB);
                            this.f25486O.x(iB);
                            p180s.a aVar3 = new p180s.a();
                            k10 = k0Y;
                            try {
                                v0(this, null, null, null, null, new b(aVar3, k0Y, c1677e0), 15, null);
                                this.f25486O.q(aVar3, dVar);
                                A a10 = A.f21846a;
                                k10.d();
                                bVar2 = bVar3;
                            } catch (Throwable th) {
                                th = th;
                                k10.d();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            k10 = k0Y;
                        }
                    } else {
                        AbstractC1675d0 abstractC1675d0L = this.f25492c.l(c1677e1);
                        L0 l0G = c1677e1.g();
                        C1674d c1674dA2 = c1677e1.a();
                        List listP = AbstractC1696o.p(l0G, c1674dA2);
                        if (!listP.isEmpty()) {
                            this.f25486O.b(listP, dVar);
                            if (n.d(c1677e0.g(), this.f25493d)) {
                                int iB2 = this.f25493d.b(c1674dA);
                                Q0(iB2, V0(iB2) + listP.size());
                            }
                        }
                        this.f25486O.c(abstractC1675d0L, this.f25492c, c1677e1, c1677e0);
                        K0 k0Y2 = l0G.y();
                        try {
                            K0 k0G0 = g0();
                            int[] iArr = this.f25504o;
                            p190t.a aVar4 = this.f25512w;
                            this.f25504o = null;
                            this.f25512w = null;
                            try {
                                E0(k0Y2);
                                int iB3 = l0G.b(c1674dA2);
                                k0Y2.P(iB3);
                                this.f25486O.x(iB3);
                                p180s.a aVar5 = new p180s.a();
                                p180s.b bVar4 = this.f25486O;
                                p180s.a aVarM2 = bVar4.m();
                                try {
                                    bVar4.P(aVar5);
                                    k9 = k0Y2;
                                    try {
                                        p180s.b bVar5 = this.f25486O;
                                        boolean zN = bVar5.n();
                                        try {
                                            bVar5.Q(false);
                                            B b10 = c1677e1.b();
                                            B b11 = c1677e0.b();
                                            Integer numValueOf = Integer.valueOf(k9.j());
                                            List listD = c1677e1.d();
                                            try {
                                                c cVar = new c(c1677e0);
                                                p180s.b bVar6 = bVar3;
                                                aVar = aVarM2;
                                                bVar2 = bVar6;
                                                aVar4 = aVar4;
                                                iArr = iArr;
                                                try {
                                                    u0(b10, b11, numValueOf, listD, cVar);
                                                    try {
                                                        bVar5.Q(zN);
                                                        try {
                                                            bVar4.P(aVar);
                                                            this.f25486O.q(aVar5, dVar);
                                                            A a11 = A.f21846a;
                                                            try {
                                                                E0(k0G0);
                                                                this.f25504o = iArr;
                                                                this.f25512w = aVar4;
                                                                k9.d();
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                k9.d();
                                                                throw th;
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            E0(k0G0);
                                                            this.f25504o = iArr;
                                                            this.f25512w = aVar4;
                                                            throw th;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        bVar4.P(aVar);
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    bVar5.Q(zN);
                                                    throw th;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                aVar4 = aVar4;
                                                aVar = aVarM2;
                                                bVar5.Q(zN);
                                                throw th;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            aVar4 = aVar4;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        aVar = aVarM2;
                                        bVar4.P(aVar);
                                        throw th;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    k9 = k0Y2;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                iArr = iArr;
                                aVar4 = aVar4;
                                k9 = k0Y2;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            k9 = k0Y2;
                        }
                    }
                    try {
                        this.f25486O.R();
                        i12++;
                        i10 = i10;
                        size = size;
                        bVar3 = bVar2;
                        i11 = 0;
                    } catch (Throwable th13) {
                        th = th13;
                        bVar = bVar2;
                        bVar.P(aVarM);
                        throw th;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    bVar2 = bVar3;
                }
            }
            p180s.b bVar7 = bVar3;
            this.f25486O.g();
            this.f25486O.x(0);
            bVar7.P(aVarM);
        } catch (Throwable th15) {
            th = th15;
            bVar = bVar3;
        }
    }

    private final int k0(int i10) {
        return (-2) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(AbstractC1673c0 abstractC1673c0, InterfaceC1699p0 interfaceC1699p0, Object obj, boolean z9) {
        L0(126665345, abstractC1673c0);
        T0(obj);
        int iC0 = c0();
        try {
            this.f25490S = 126665345;
            boolean z10 = false;
            if (f0()) {
                O0.r0(this.f25482K, 0, 1, null);
            }
            if (!f0() && !n.d(this.f25480I.k(), interfaceC1699p0)) {
                z10 = true;
            }
            if (z10) {
                z0(interfaceC1699p0);
            }
            I0(202, AbstractC1696o.x(), O.f25347a.a(), interfaceC1699p0);
            this.f25484M = null;
            if (!f0() || z9) {
                boolean z11 = this.f25513x;
                this.f25513x = z10;
                AbstractC1672c.d(this, p240y.c.b(316014703, true, new d(abstractC1673c0, obj)));
                this.f25513x = z11;
            } else {
                this.f25483L = true;
                O0 o9 = this.f25482K;
                this.f25492c.j(new C1677e0(abstractC1673c0, obj, b0(), this.f25481J, o9.D(o9.B0(o9.a0())), AbstractC1444s.l(), K()));
            }
        } finally {
            R();
            this.f25484M = null;
            this.f25490S = iC0;
            S();
        }
    }

    private final Object p0(K0 k9, int i10) {
        return k9.K(i10);
    }

    private final int q0(int i10, int i11, int i12, int i13) {
        int iO = this.f25480I.O(i11);
        while (iO != i12 && !this.f25480I.I(iO)) {
            iO = this.f25480I.O(iO);
        }
        if (this.f25480I.I(iO)) {
            i13 = 0;
        }
        if (iO == i11) {
            return i13;
        }
        int iV0 = (V0(iO) - this.f25480I.M(i11)) + i13;
        loop1: while (i13 < iV0 && iO != i10) {
            iO++;
            while (iO < i10) {
                int iD = this.f25480I.D(iO) + iO;
                if (i10 >= iD) {
                    i13 += this.f25480I.I(iO) ? 1 : V0(iO);
                    iO = iD;
                }
            }
            break loop1;
        }
        return i13;
    }

    private final int s0(int i10) {
        int iO = this.f25480I.O(i10) + 1;
        int i11 = 0;
        while (iO < i10) {
            if (!this.f25480I.F(iO)) {
                i11++;
            }
            iO += this.f25480I.D(iO);
        }
        return i11;
    }

    private final void u() {
        F();
        this.f25498i.a();
        this.f25503n.a();
        this.f25510u.a();
        this.f25514y.a();
        this.f25512w = null;
        this.f25488Q.a();
        this.f25490S = 0;
        this.f25473B = 0;
        this.f25508s = false;
        this.f25489R = false;
        this.f25515z = false;
        this.f25478G = false;
        this.f25507r = false;
        this.f25472A = -1;
        if (!this.f25480I.i()) {
            this.f25480I.d();
        }
        if (this.f25482K.Y()) {
            return;
        }
        Y();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0022, B:11:0x002c, B:10:0x0028, B:14:0x0033, B:16:0x0039, B:18:0x003f), top: B:23:0x0005 }] */
    private final Object u0(B b10, B b11, Integer num, List list, p219v8.a aVar) {
        Object objInvoke;
        boolean z9 = this.f25478G;
        int i10 = this.f25500k;
        try {
            this.f25478G = true;
            this.f25500k = 0;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                p079h8.o oVar = (p079h8.o) list.get(i11);
                C1714x0 c1714x0 = (C1714x0) oVar.a();
                Object objB = oVar.b();
                if (objB != null) {
                    O0(c1714x0, objB);
                } else {
                    O0(c1714x0, null);
                }
            }
            if (b10 == null) {
                objInvoke = aVar.invoke();
            } else {
                objInvoke = b10.e(b11, num != null ? num.intValue() : -1, aVar);
                if (objInvoke == null) {
                    objInvoke = aVar.invoke();
                }
            }
            return objInvoke;
        } finally {
            this.f25478G = z9;
            this.f25500k = i10;
        }
    }

    static /* synthetic */ Object v0(C1692m c1692m, B b10, B b11, Integer num, List list, p219v8.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            b10 = null;
        }
        if ((i10 & 2) != 0) {
            b11 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            list = AbstractC1444s.l();
        }
        return c1692m.u0(b10, b11, num, list, aVar);
    }

    private final void w0() {
        boolean z9 = this.f25478G;
        this.f25478G = true;
        int iT = this.f25480I.t();
        int iD = this.f25480I.D(iT) + iT;
        int i10 = this.f25500k;
        int iC0 = c0();
        int i11 = this.f25501l;
        int i12 = this.f25502m;
        S sW = AbstractC1696o.w(this.f25509t, this.f25480I.j(), iD);
        boolean z10 = false;
        int i13 = iT;
        while (sW != null) {
            int iB = sW.b();
            AbstractC1696o.K(this.f25509t, iB);
            if (sW.d()) {
                this.f25480I.P(iB);
                int iJ = this.f25480I.j();
                A0(i13, iJ, iT);
                this.f25500k = q0(iB, iJ, iT, i10);
                this.f25502m = s0(iJ);
                int iO = this.f25480I.O(iJ);
                this.f25490S = I(iO, s0(iO), iT, iC0);
                this.f25484M = null;
                sW.c().g(this);
                this.f25484M = null;
                this.f25480I.Q(iT);
                i13 = iJ;
                z10 = true;
            } else {
                this.f25477F.h(sW.c());
                sW.c().x();
                this.f25477F.g();
            }
            sW = AbstractC1696o.w(this.f25509t, this.f25480I.j(), iD);
        }
        if (z10) {
            A0(i13, iT, iT);
            this.f25480I.S();
            int iV0 = V0(iT);
            this.f25500k = i10 + iV0;
            this.f25501l = i11 + iV0;
            this.f25502m = i12;
        } else {
            H0();
        }
        this.f25490S = iC0;
        this.f25478G = z9;
    }

    private final void x0() {
        C0(this.f25480I.j());
        this.f25486O.L();
    }

    private final void y0(C1674d c1674d) {
        if (this.f25488Q.d()) {
            this.f25486O.r(c1674d, this.f25481J);
        } else {
            this.f25486O.s(c1674d, this.f25481J, this.f25488Q);
            this.f25488Q = new p180s.c();
        }
    }

    private final void z0(InterfaceC1699p0 interfaceC1699p0) {
        p190t.a aVar = this.f25512w;
        if (aVar == null) {
            aVar = new p190t.a(0, 1, null);
            this.f25512w = aVar;
        }
        aVar.b(this.f25480I.j(), interfaceC1699p0);
    }

    public final void E() {
        this.f25512w = null;
    }

    public final void E0(K0 k9) {
        this.f25480I = k9;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
    public void F0() {
        int iRotateLeft;
        if (this.f25509t.isEmpty()) {
            G0();
            return;
        }
        K0 k9 = this.f25480I;
        int iM = k9.m();
        Object objN = k9.n();
        Object objK = k9.k();
        int i10 = this.f25502m;
        if (objN == null) {
            if (objK == null || iM != 207 || n.d(objK, InterfaceC1690l.f25468a.a())) {
                iRotateLeft = Integer.rotateLeft(Integer.rotateLeft(c0(), 3) ^ iM, 3) ^ i10;
            } else {
                this.f25490S = Integer.rotateLeft(objK.hashCode() ^ Integer.rotateLeft(c0(), 3), 3) ^ i10;
            }
            M0(k9.H(), null);
            w0();
            k9.g();
            if (objN != null) {
                if (objN instanceof Enum) {
                    this.f25490S = Integer.rotateRight(Integer.hashCode(((Enum) objN).ordinal()) ^ Integer.rotateRight(c0(), 3), 3);
                } else {
                    this.f25490S = Integer.rotateRight(Integer.hashCode(objN.hashCode()) ^ Integer.rotateRight(c0(), 3), 3);
                }
            }
            if (objK != null || iM != 207 || n.d(objK, InterfaceC1690l.f25468a.a())) {
                this.f25490S = Integer.rotateRight(Integer.rotateRight(c0() ^ i10, 3) ^ Integer.hashCode(iM), 3);
            } else {
                this.f25490S = Integer.rotateRight(Integer.hashCode(objK.hashCode()) ^ Integer.rotateRight(c0() ^ i10, 3), 3);
                return;
            }
        }
        iRotateLeft = Integer.rotateLeft((objN instanceof Enum ? ((Enum) objN).ordinal() : objN.hashCode()) ^ Integer.rotateLeft(c0(), 3), 3);
        this.f25490S = iRotateLeft;
        M0(k9.H(), null);
        w0();
        k9.g();
        if (objN != null) {
            if (objK != null) {
            }
            this.f25490S = Integer.rotateRight(Integer.rotateRight(c0() ^ i10, 3) ^ Integer.hashCode(iM), 3);
        } else if (objN instanceof Enum) {
            this.f25490S = Integer.rotateRight(Integer.hashCode(((Enum) objN).ordinal()) ^ Integer.rotateRight(c0(), 3), 3);
        } else {
            this.f25490S = Integer.rotateRight(Integer.hashCode(objN.hashCode()) ^ Integer.rotateRight(c0(), 3), 3);
        }
    }

    public final void H(p190t.f fVar, p pVar) {
        if (!this.f25495f.c()) {
            AbstractC1696o.r("Expected applyChanges() to have been called");
        }
        O(fVar, pVar);
    }

    public void L0(int i10, Object obj) {
        I0(i10, obj, O.f25347a.a(), null);
    }

    public final void M() {
        this.f25477F.a();
        this.f25509t.clear();
        this.f25495f.a();
        this.f25512w = null;
    }

    public final void N() {
        Object objA = f1.f25445a.a("Compose:Composer.dispose");
        try {
            this.f25492c.p(this);
            M();
            Z().clear();
            this.f25479H = true;
            A a10 = A.f21846a;
        } finally {
            f1.f25445a.b(objA);
        }
    }

    public final boolean O0(C1714x0 c1714x0, Object obj) {
        C1674d c1674dI = c1714x0.i();
        if (c1674dI == null) {
            return false;
        }
        int iD = c1674dI.d(this.f25480I.x());
        if (!this.f25478G || iD < this.f25480I.j()) {
            return false;
        }
        AbstractC1696o.D(this.f25509t, iD, c1714x0, obj);
        return true;
    }

    public final void P0(Object obj) {
        if (obj instanceof F0) {
            if (f0()) {
                this.f25486O.K((F0) obj);
            }
            this.f25494e.add(obj);
            obj = new G0((F0) obj, B0());
        }
        U0(obj);
    }

    public void S() {
        R();
    }

    public final void U0(Object obj) {
        if (f0()) {
            this.f25482K.j1(obj);
            return;
        }
        if (!this.f25480I.q()) {
            p180s.b bVar = this.f25486O;
            K0 k9 = this.f25480I;
            bVar.a(k9.a(k9.t()), obj);
            return;
        }
        int iP = this.f25480I.p() - 1;
        if (!this.f25486O.o()) {
            this.f25486O.V(obj, iP);
            return;
        }
        p180s.b bVar2 = this.f25486O;
        K0 k10 = this.f25480I;
        bVar2.T(obj, k10.a(k10.t()), iP);
    }

    public InterfaceC1678f Z() {
        return this.f25491b;
    }

    @Override // p170r.InterfaceC1690l
    public void a() {
        this.f25506q = true;
        this.f25475D = true;
        this.f25493d.n();
        this.f25481J.n();
        this.f25482K.r1();
    }

    public final boolean a0() {
        return this.f25473B > 0;
    }

    @Override // p170r.InterfaceC1690l
    public InterfaceC1712w0 b() {
        return d0();
    }

    public B b0() {
        return this.f25497h;
    }

    @Override // p170r.InterfaceC1690l
    public void c(C1710v0[] c1710v0Arr) {
        InterfaceC1699p0 interfaceC1699p0S0;
        InterfaceC1699p0 interfaceC1699p0K = K();
        K0(201, AbstractC1696o.A());
        boolean z9 = true;
        boolean z10 = false;
        if (f0()) {
            interfaceC1699p0S0 = S0(interfaceC1699p0K, AbstractC1713x.d(c1710v0Arr, interfaceC1699p0K, null, 4, null));
            this.f25483L = true;
        } else {
            Object objZ = this.f25480I.z(0);
            n.f(objZ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC1699p0 interfaceC1699p0 = (InterfaceC1699p0) objZ;
            Object objZ2 = this.f25480I.z(1);
            n.f(objZ2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC1699p0 interfaceC1699p1 = (InterfaceC1699p0) objZ2;
            InterfaceC1699p0 interfaceC1699p0C = AbstractC1713x.c(c1710v0Arr, interfaceC1699p0K, interfaceC1699p1);
            if (h() && !this.f25515z && n.d(interfaceC1699p1, interfaceC1699p0C)) {
                G0();
                interfaceC1699p0S0 = interfaceC1699p0;
            } else {
                interfaceC1699p0S0 = S0(interfaceC1699p0K, interfaceC1699p0C);
                if (!this.f25515z && n.d(interfaceC1699p0S0, interfaceC1699p0)) {
                    z9 = false;
                }
                z10 = z9;
            }
        }
        if (z10 && !f0()) {
            z0(interfaceC1699p0S0);
        }
        this.f25514y.j(AbstractC1696o.o(this.f25513x));
        this.f25513x = z10;
        this.f25484M = interfaceC1699p0S0;
        I0(202, AbstractC1696o.x(), O.f25347a.a(), interfaceC1699p0S0);
    }

    public int c0() {
        return this.f25490S;
    }

    @Override // p170r.InterfaceC1690l
    public Object d() {
        return o0();
    }

    public final C1714x0 d0() {
        a1 a1Var = this.f25477F;
        if (this.f25473B == 0 && a1Var.d()) {
            return (C1714x0) a1Var.e();
        }
        return null;
    }

    @Override // p170r.InterfaceC1690l
    public B.a e() {
        return this.f25493d;
    }

    public final p180s.a e0() {
        return this.f25485N;
    }

    @Override // p170r.InterfaceC1690l
    public boolean f(Object obj) {
        if (n0() == obj) {
            return false;
        }
        U0(obj);
        return true;
    }

    public boolean f0() {
        return this.f25489R;
    }

    @Override // p170r.InterfaceC1690l
    public InterfaceC1690l g(int i10) {
        t(i10);
        D();
        return this;
    }

    public final K0 g0() {
        return this.f25480I;
    }

    @Override // p170r.InterfaceC1690l
    public boolean h() {
        C1714x0 c1714x0D0;
        return (f0() || this.f25515z || this.f25513x || (c1714x0D0 = d0()) == null || c1714x0D0.m() || this.f25507r) ? false : true;
    }

    @Override // p170r.InterfaceC1690l
    public void i(C1710v0 c1710v0) {
        g1 g1Var;
        InterfaceC1699p0 interfaceC1699p0K = K();
        K0(201, AbstractC1696o.A());
        Object objD = d();
        if (n.d(objD, InterfaceC1690l.f25468a.a())) {
            g1Var = null;
        } else {
            n.f(objD, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            g1Var = (g1) objD;
        }
        AbstractC1707u abstractC1707uB = c1710v0.b();
        n.f(abstractC1707uB, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        n.f(c1710v0, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        g1 g1VarB = abstractC1707uB.b(c1710v0, g1Var);
        boolean zD = n.d(g1VarB, g1Var);
        if (!zD) {
            q(g1VarB);
        }
        boolean z9 = true;
        boolean z10 = false;
        if (f0()) {
            if (c1710v0.a() || !AbstractC1713x.a(interfaceC1699p0K, abstractC1707uB)) {
                interfaceC1699p0K = interfaceC1699p0K.e(abstractC1707uB, g1VarB);
            }
            this.f25483L = true;
        } else {
            K0 k9 = this.f25480I;
            Object objY = k9.y(k9.j());
            n.f(objY, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC1699p0 interfaceC1699p0 = (InterfaceC1699p0) objY;
            interfaceC1699p0K = (!(h() && zD) && (c1710v0.a() || !AbstractC1713x.a(interfaceC1699p0K, abstractC1707uB))) ? interfaceC1699p0K.e(abstractC1707uB, g1VarB) : interfaceC1699p0;
            if (!this.f25515z && interfaceC1699p0 == interfaceC1699p0K) {
                z9 = false;
            }
            z10 = z9;
        }
        if (z10 && !f0()) {
            z0(interfaceC1699p0K);
        }
        this.f25514y.j(AbstractC1696o.o(this.f25513x));
        this.f25513x = z10;
        this.f25484M = interfaceC1699p0K;
        I0(202, AbstractC1696o.x(), O.f25347a.a(), interfaceC1699p0K);
    }

    @Override // p170r.InterfaceC1690l
    public void j(InterfaceC1712w0 interfaceC1712w0) {
        C1714x0 c1714x0 = interfaceC1712w0 instanceof C1714x0 ? (C1714x0) interfaceC1712w0 : null;
        if (c1714x0 == null) {
            return;
        }
        c1714x0.F(true);
    }

    public void j0(List list) {
        try {
            i0(list);
            F();
        } catch (Throwable th) {
            u();
            throw th;
        }
    }

    @Override // p170r.InterfaceC1690l
    public I0 k() {
        C1674d c1674dA;
        l lVarH;
        C1714x0 c1714x0 = null;
        C1714x0 c1714x1 = this.f25477F.d() ? (C1714x0) this.f25477F.g() : null;
        if (c1714x1 != null) {
            c1714x1.C(false);
        }
        if (c1714x1 != null && (lVarH = c1714x1.h(this.f25474C)) != null) {
            this.f25486O.e(lVarH, b0());
        }
        if (c1714x1 != null && !c1714x1.o() && (c1714x1.p() || this.f25506q)) {
            if (c1714x1.i() == null) {
                if (f0()) {
                    O0 o9 = this.f25482K;
                    c1674dA = o9.D(o9.a0());
                } else {
                    K0 k9 = this.f25480I;
                    c1674dA = k9.a(k9.t());
                }
                c1714x1.z(c1674dA);
            }
            c1714x1.A(false);
            c1714x0 = c1714x1;
        }
        Q(false);
        return c1714x0;
    }

    @Override // p170r.InterfaceC1690l
    public Object l(AbstractC1707u abstractC1707u) {
        return AbstractC1713x.b(K(), abstractC1707u);
    }

    @Override // p170r.InterfaceC1690l
    public void m() {
        if (!(this.f25501l == 0)) {
            AbstractC1696o.r("No nodes can be emitted before calling skipAndEndGroup");
        }
        C1714x0 c1714x0D0 = d0();
        if (c1714x0D0 != null) {
            c1714x0D0.y();
        }
        if (this.f25509t.isEmpty()) {
            H0();
        } else {
            w0();
        }
    }

    public final boolean m0() {
        return this.f25478G;
    }

    @Override // p170r.InterfaceC1690l
    public i n() {
        return this.f25492c.h();
    }

    public final Object n0() {
        if (!f0()) {
            return this.f25515z ? InterfaceC1690l.f25468a.a() : this.f25480I.J();
        }
        W0();
        return InterfaceC1690l.f25468a.a();
    }

    @Override // p170r.InterfaceC1690l
    public void o() {
        R();
        R();
        this.f25513x = AbstractC1696o.n(this.f25514y.i());
        this.f25484M = null;
    }

    public final Object o0() {
        if (f0()) {
            W0();
            return InterfaceC1690l.f25468a.a();
        }
        Object objJ = this.f25480I.J();
        if (this.f25515z) {
            return InterfaceC1690l.f25468a.a();
        }
        return objJ instanceof G0 ? ((G0) objJ).b() : objJ;
    }

    @Override // p170r.InterfaceC1690l
    public void p() {
        R();
    }

    @Override // p170r.InterfaceC1690l
    public void q(Object obj) {
        P0(obj);
    }

    @Override // p170r.InterfaceC1690l
    public void r() {
        R();
        R();
        this.f25513x = AbstractC1696o.n(this.f25514y.i());
        this.f25484M = null;
    }

    public final void r0(p219v8.a aVar) {
        if (this.f25478G) {
            AbstractC1696o.r("Preparing a composition while composing is not supported");
        }
        this.f25478G = true;
        try {
            aVar.invoke();
        } finally {
            this.f25478G = false;
        }
    }

    @Override // p170r.InterfaceC1690l
    public boolean s(Object obj) {
        if (n.d(n0(), obj)) {
            return false;
        }
        U0(obj);
        return true;
    }

    @Override // p170r.InterfaceC1690l
    public void t(int i10) {
        if (this.f25499j != null) {
            I0(i10, null, O.f25347a.a(), null);
            return;
        }
        W0();
        this.f25490S = this.f25502m ^ Integer.rotateLeft(Integer.rotateLeft(c0(), 3) ^ i10, 3);
        this.f25502m++;
        K0 k9 = this.f25480I;
        if (f0()) {
            k9.c();
            this.f25482K.e1(i10, InterfaceC1690l.f25468a.a());
            V(false, null);
            return;
        }
        if (k9.m() == i10 && !k9.r()) {
            k9.T();
            V(false, null);
            return;
        }
        if (!k9.G()) {
            int i11 = this.f25500k;
            int iJ = k9.j();
            x0();
            this.f25486O.M(i11, k9.R());
            AbstractC1696o.L(this.f25509t, iJ, k9.j());
        }
        k9.c();
        this.f25489R = true;
        this.f25484M = null;
        U();
        O0 o9 = this.f25482K;
        o9.H();
        int iZ = o9.Z();
        o9.e1(i10, InterfaceC1690l.f25468a.a());
        this.f25487P = o9.D(iZ);
        V(false, null);
    }

    public final boolean t0(p190t.f fVar) {
        if (!this.f25495f.c()) {
            AbstractC1696o.r("Expected applyChanges() to have been called");
        }
        if (fVar.e() <= 0 && this.f25509t.isEmpty() && !this.f25507r) {
            return false;
        }
        O(fVar, null);
        return this.f25495f.d();
    }
}

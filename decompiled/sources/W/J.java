package W;

import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class J extends U.t implements U.r, N {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final b f8414D = new b(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final p219v8.l f8415E = a.f8424r;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private androidx.collection.B f8416A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private androidx.collection.B f8417B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private androidx.collection.E f8418C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private U.x f8419v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f8420w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f8421x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f8422y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final U.t.a f8423z = U.u.a(this);

    static final class a extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f8424r = new a();

        a() {
            super(1);
        }

        public final void a(i0 i0Var) {
            if (i0Var.g()) {
                i0Var.a().h0(i0Var);
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((i0) obj);
            return p079h8.A.f21846a;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ i0 f8425r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ J f8426s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i0 i0Var, J j9) {
            super(0);
            this.f8425r = i0Var;
            this.f8426s = j9;
        }

        public final void a() {
            p219v8.l lVarC = this.f8425r.b().c();
            if (lVarC != null) {
                lVarC.f(this.f8426s.t0());
            }
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    public static final class d implements U.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f8429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p219v8.l f8430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p219v8.l f8431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ J f8432f;

        d(int i10, int i11, Map map, p219v8.l lVar, p219v8.l lVar2, J j9) {
            this.f8427a = i10;
            this.f8428b = i11;
            this.f8429c = map;
            this.f8430d = lVar;
            this.f8431e = lVar2;
            this.f8432f = j9;
        }

        @Override // U.q
        public Map a() {
            return this.f8429c;
        }

        @Override // U.q
        public void b() {
            this.f8431e.f(this.f8432f.r0());
        }

        @Override // U.q
        public p219v8.l c() {
            return this.f8430d;
        }

        @Override // U.q
        public int getHeight() {
            return this.f8428b;
        }

        @Override // U.q
        public int getWidth() {
            return this.f8427a;
        }
    }

    public static final class e implements U.x {
        e() {
        }

        @Override // p111l0.k
        public float A() {
            return J.this.A();
        }

        @Override // p111l0.d
        public float getDensity() {
            return J.this.getDensity();
        }
    }

    private final void A0(androidx.collection.F f10) {
        B b10;
        Object[] objArr = f10.f11289b;
        long[] jArr = f10.f11288a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128 && (b10 = (B) ((WeakReference) objArr[(i10 << 3) + i12]).get()) != null) {
                        if (w0()) {
                            b10.Q0(false);
                        } else {
                            b10.U0(false);
                        }
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:58:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x010b A[LOOP:2: B:43:0x00c1->B:59:0x010b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0111  */
    /* JADX WARN: Code duplicated, block: B:90:0x0113 A[EDGE_INSN: B:90:0x0113->B:61:0x0113 BREAK  A[LOOP:2: B:43:0x00c1->B:59:0x010b], SYNTHETIC] */
    public final void h0(i0 i0Var) {
        long j9;
        J jQ0;
        androidx.collection.F f10;
        f0 snapshotObserver;
        char c10;
        if (this.f8422y) {
            return;
        }
        p219v8.l lVarC = i0Var.b().c();
        androidx.collection.E e10 = this.f8418C;
        char c11 = 7;
        int i10 = 8;
        if (lVarC == null) {
            if (e10 != null) {
                Object[] objArr = e10.f11283c;
                long[] jArr = e10.f11281a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j10 = jArr[i11];
                        if ((((~j10) << c11) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j10 & 255) < 128) {
                                    A0((androidx.collection.F) objArr[(i11 << 3) + i13]);
                                }
                                j10 >>= 8;
                                i13++;
                                c11 = c11;
                            }
                            c10 = c11;
                            if (i12 != 8) {
                                break;
                            }
                        } else {
                            c10 = c11;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                        c11 = c10;
                    }
                }
                e10.h();
                return;
            }
            return;
        }
        androidx.collection.B b10 = this.f8417B;
        if (b10 == null) {
            b10 = new androidx.collection.B(0, 1, null);
            this.f8417B = b10;
        }
        androidx.collection.B b11 = this.f8416A;
        if (b11 == null) {
            b11 = new androidx.collection.B(0, 1, null);
            this.f8416A = b11;
        }
        b10.p(b11);
        b11.i();
        d0 d0VarX = o0().X();
        if (d0VarX != null && (snapshotObserver = d0VarX.getSnapshotObserver()) != null) {
            snapshotObserver.i(i0Var, f8415E, new c(i0Var, this));
        }
        if (e10 != null) {
            Object[] objArr2 = b10.f11266b;
            float[] fArr = b10.f11267c;
            long[] jArr2 = b10.f11265a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                j9 = -9187201950435737472L;
                int i14 = 0;
                while (true) {
                    long j11 = jArr2[i14];
                    int i15 = i10;
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i14 - length2)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & 255) < 128) {
                                int i18 = (i14 << 3) + i17;
                                Object obj = objArr2[i18];
                                float f11 = fArr[i18];
                                androidx.appcompat.app.o.a(obj);
                                if (b11.e(null, Float.NaN) != f11 && (f10 = (androidx.collection.F) e10.o(null)) != null) {
                                    A0(f10);
                                }
                            }
                            j11 >>= i15;
                        }
                        if (i16 != i15) {
                            break;
                        }
                        if (i14 != length2) {
                            break;
                        }
                        i14++;
                        i10 = 8;
                    } else if (i14 != length2) {
                        break;
                        break;
                    } else {
                        i14++;
                        i10 = 8;
                    }
                }
            } else {
                j9 = -9187201950435737472L;
            }
        } else {
            j9 = -9187201950435737472L;
        }
        Object[] objArr3 = b11.f11266b;
        long[] jArr3 = b11.f11265a;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i19 = 0;
            while (true) {
                long j12 = jArr3[i19];
                if ((((~j12) << 7) & j12 & j9) != j9) {
                    int i20 = 8 - ((~(i19 - length3)) >>> 31);
                    for (int i21 = 0; i21 < i20; i21++) {
                        if ((j12 & 255) < 128) {
                            androidx.appcompat.app.o.a(objArr3[(i19 << 3) + i21]);
                            if (!b10.a(null) && (jQ0 = q0()) != null) {
                                jQ0.v0(null);
                            }
                        }
                        j12 >>= 8;
                    }
                    if (i20 != 8) {
                        break;
                    }
                }
                if (i19 == length3) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        b10.i();
    }

    private final J j0(U.w wVar) {
        J jQ0;
        while (true) {
            androidx.collection.B b10 = this.f8416A;
            if ((b10 != null && b10.a(wVar)) || (jQ0 = this.q0()) == null) {
                return this;
            }
            this = jQ0;
        }
    }

    private final void v0(U.w wVar) {
        androidx.collection.E e10 = j0(wVar).f8418C;
        androidx.collection.F f10 = e10 != null ? (androidx.collection.F) e10.o(wVar) : null;
        if (f10 != null) {
            A0(f10);
        }
    }

    public abstract void B0();

    public final void C0(boolean z9) {
        this.f8422y = z9;
    }

    public final void D0(boolean z9) {
        this.f8421x = z9;
    }

    @Override // W.N
    public void M(boolean z9) {
        this.f8420w = z9;
    }

    public abstract int g0(U.a aVar);

    /* JADX WARN: Code duplicated, block: B:19:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[LOOP:0: B:10:0x001a->B:20:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0054 A[EDGE_INSN: B:29:0x0054->B:21:0x0054 BREAK  A[LOOP:0: B:10:0x001a->B:20:0x0051], SYNTHETIC] */
    public final void i0(U.q qVar) {
        if (qVar != null) {
            h0(new i0(qVar, this));
            return;
        }
        androidx.collection.E e10 = this.f8418C;
        if (e10 != null) {
            Object[] objArr = e10.f11283c;
            long[] jArr = e10.f11281a;
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
                                A0((androidx.collection.F) objArr[(i10 << 3) + i12]);
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
        androidx.collection.E e11 = this.f8418C;
        if (e11 != null) {
            e11.h();
        }
        androidx.collection.B b10 = this.f8416A;
        if (b10 != null) {
            b10.i();
        }
    }

    public final int k0(U.a aVar) {
        int iG0;
        if (n0() && (iG0 = g0(aVar)) != Integer.MIN_VALUE) {
            return iG0 + p111l0.m.e(T());
        }
        return Integer.MIN_VALUE;
    }

    public abstract J l0();

    public abstract U.i m0();

    public abstract boolean n0();

    @Override // U.r
    public U.q o(int i10, int i11, Map map, p219v8.l lVar, p219v8.l lVar2) {
        if (!((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0)) {
            T.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new d(i10, i11, map, lVar, lVar2, this);
    }

    public abstract B o0();

    public abstract U.q p0();

    public abstract J q0();

    public final U.t.a r0() {
        return this.f8423z;
    }

    public abstract long s0();

    public final U.x t0() {
        U.x xVar = this.f8419v;
        return xVar == null ? new e() : xVar;
    }

    protected final void u0(U u9) {
        AbstractC0959a abstractC0959aA;
        U uP1 = u9.p1();
        if (!kotlin.jvm.internal.n.d(uP1 != null ? uP1.o0() : null, u9.o0())) {
            u9.e1().a().m();
            return;
        }
        InterfaceC0960b interfaceC0960bS = u9.e1().s();
        if (interfaceC0960bS == null || (abstractC0959aA = interfaceC0960bS.a()) == null) {
            return;
        }
        abstractC0959aA.m();
    }

    public boolean w0() {
        return false;
    }

    public boolean x0() {
        return this.f8420w;
    }

    public final boolean y0() {
        return this.f8422y;
    }

    public final boolean z0() {
        return this.f8421x;
    }
}

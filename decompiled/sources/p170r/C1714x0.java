package p170r;

import androidx.collection.C;
import androidx.collection.E;
import androidx.collection.N;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p079h8.A;
import p219v8.l;
import p219v8.p;

/* JADX INFO: renamed from: r.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1714x0 implements I0, InterfaceC1712w0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f25600h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f25601i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC1718z0 f25603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1674d f25604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p f25605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C f25607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private E f25608g;

    /* JADX INFO: renamed from: r.x0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final void a(O0 o9, List list, InterfaceC1718z0 interfaceC1718z0) {
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object objV0 = o9.V0((C1674d) list.get(i10), 0);
                C1714x0 c1714x0 = objV0 instanceof C1714x0 ? (C1714x0) objV0 : null;
                if (c1714x0 != null) {
                    c1714x0.e(interfaceC1718z0);
                }
            }
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: r.x0$b */
    static final class b extends o implements l {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f25610s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ C f25611t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, C c10) {
            super(1);
            this.f25610s = i10;
            this.f25611t = c10;
        }

        public final void a(InterfaceC1698p interfaceC1698p) {
            int i10;
            if (C1714x0.this.f25606e != this.f25610s || !n.d(this.f25611t, C1714x0.this.f25607f) || !(interfaceC1698p instanceof C1703s)) {
                return;
            }
            C c10 = this.f25611t;
            int i11 = this.f25610s;
            C1714x0 c1714x0 = C1714x0.this;
            long[] jArr = c10.f11270a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                long j9 = jArr[i12];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j9) < 128) {
                            int i16 = (i12 << 3) + i15;
                            Object obj = c10.f11271b[i16];
                            boolean z9 = c10.f11272c[i16] != i11;
                            if (z9) {
                                C1703s c1703s = (C1703s) interfaceC1698p;
                                c1703s.H(obj, c1714x0);
                                i10 = i13;
                                if (obj instanceof E) {
                                    c1703s.G((E) obj);
                                    E e10 = c1714x0.f25608g;
                                    if (e10 != null) {
                                        e10.o(obj);
                                    }
                                }
                            } else {
                                i10 = i13;
                            }
                            if (z9) {
                                c10.p(i16);
                            }
                        } else {
                            i10 = i13;
                        }
                        j9 >>= i10;
                        i15++;
                        i13 = i10;
                    }
                    if (i14 != i13) {
                        return;
                    }
                }
                if (i12 == length) {
                    return;
                } else {
                    i12++;
                }
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((InterfaceC1698p) obj);
            return A.f21846a;
        }
    }

    public C1714x0(InterfaceC1718z0 interfaceC1718z0) {
        this.f25603b = interfaceC1718z0;
    }

    private final void D(boolean z9) {
        if (z9) {
            this.f25602a |= 32;
        } else {
            this.f25602a &= -33;
        }
    }

    private final void E(boolean z9) {
        if (z9) {
            this.f25602a |= 16;
        } else {
            this.f25602a &= -17;
        }
    }

    private final boolean f(E e10, E e11) {
        n.f(e10, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        R0 r0A = e10.a();
        if (r0A == null) {
            r0A = S0.g();
        }
        return !r0A.a(e10.j().a(), e11.b(e10));
    }

    private final boolean n() {
        return (this.f25602a & 32) != 0;
    }

    public final void A(boolean z9) {
        if (z9) {
            this.f25602a |= 4;
        } else {
            this.f25602a &= -5;
        }
    }

    public final void B(boolean z9) {
        if (z9) {
            this.f25602a |= 64;
        } else {
            this.f25602a &= -65;
        }
    }

    public final void C(boolean z9) {
        if (z9) {
            this.f25602a |= 8;
        } else {
            this.f25602a &= -9;
        }
    }

    public final void F(boolean z9) {
        if (z9) {
            this.f25602a |= 1;
        } else {
            this.f25602a &= -2;
        }
    }

    public final void G(int i10) {
        this.f25606e = i10;
        E(false);
    }

    @Override // p170r.I0
    public void a(p pVar) {
        this.f25605d = pVar;
    }

    public final void e(InterfaceC1718z0 interfaceC1718z0) {
        this.f25603b = interfaceC1718z0;
    }

    public final void g(InterfaceC1690l interfaceC1690l) {
        A a10;
        p pVar = this.f25605d;
        if (pVar != null) {
            pVar.invoke(interfaceC1690l, 1);
            a10 = A.f21846a;
        } else {
            a10 = null;
        }
        if (a10 == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0058 A[LOOP:0: B:9:0x001c->B:22:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[SYNTHETIC] */
    public final l h(int i10) {
        C c10 = this.f25607f;
        if (c10 != null && !o()) {
            Object[] objArr = c10.f11271b;
            int[] iArr = c10.f11272c;
            long[] jArr = c10.f11270a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j9 = jArr[i11];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j9) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj = objArr[i14];
                                if (iArr[i14] != i10) {
                                    return new b(i10, c10);
                                }
                            }
                            j9 >>= 8;
                        }
                        if (i12 == 8) {
                            if (i11 != length) {
                                i11++;
                            }
                        }
                    } else if (i11 != length) {
                        i11++;
                    }
                }
            }
        }
        return null;
    }

    public final C1674d i() {
        return this.f25604c;
    }

    @Override // p170r.InterfaceC1712w0
    public void invalidate() {
        InterfaceC1718z0 interfaceC1718z0 = this.f25603b;
        if (interfaceC1718z0 != null) {
            interfaceC1718z0.g(this, null);
        }
    }

    public final boolean j() {
        return this.f25605d != null;
    }

    public final boolean k() {
        return (this.f25602a & 2) != 0;
    }

    public final boolean l() {
        return (this.f25602a & 64) != 0;
    }

    public final boolean m() {
        return (this.f25602a & 8) != 0;
    }

    public final boolean o() {
        return (this.f25602a & 16) != 0;
    }

    public final boolean p() {
        return (this.f25602a & 1) != 0;
    }

    public final boolean q() {
        if (this.f25603b != null) {
            C1674d c1674d = this.f25604c;
            if (c1674d != null ? c1674d.b() : false) {
                return true;
            }
        }
        return false;
    }

    public final T r(Object obj) {
        T tG;
        InterfaceC1718z0 interfaceC1718z0 = this.f25603b;
        return (interfaceC1718z0 == null || (tG = interfaceC1718z0.g(this, obj)) == null) ? T.IGNORED : tG;
    }

    public final boolean s() {
        return this.f25608g != null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x006e A[LOOP:0: B:19:0x002f->B:33:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[EDGE_INSN: B:36:0x0071->B:34:0x0071 BREAK  A[LOOP:0: B:19:0x002f->B:33:0x006e], SYNTHETIC] */
    public final boolean t(Object obj) {
        E e10;
        if (obj == null || (e10 = this.f25608g) == null) {
            return true;
        }
        if (obj instanceof E) {
            return f((E) obj, e10);
        }
        if (!(obj instanceof N)) {
            return true;
        }
        N n9 = (N) obj;
        if (n9.e()) {
            Object[] objArr = n9.f11289b;
            long[] jArr = n9.f11288a;
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
                                Object obj2 = objArr[(i10 << 3) + i12];
                                if (!(obj2 instanceof E) || f((E) obj2, e10)) {
                                    return true;
                                }
                            }
                            j9 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                        if (i10 != length) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return false;
    }

    public final void u(E e10, Object obj) {
        E e11 = this.f25608g;
        if (e11 == null) {
            e11 = new E(0, 1, null);
            this.f25608g = e11;
        }
        e11.r(e10, obj);
    }

    public final boolean v(Object obj) {
        if (n()) {
            return false;
        }
        C c10 = this.f25607f;
        if (c10 == null) {
            c10 = new C(0, 1, null);
            this.f25607f = c10;
        }
        return c10.o(obj, this.f25606e, -1) == this.f25606e;
    }

    public final void w() {
        InterfaceC1718z0 interfaceC1718z0 = this.f25603b;
        if (interfaceC1718z0 != null) {
            interfaceC1718z0.b(this);
        }
        this.f25603b = null;
        this.f25607f = null;
        this.f25608g = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[LOOP:0: B:10:0x001b->B:23:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[EDGE_INSN: B:32:0x0058->B:24:0x0058 BREAK  A[LOOP:0: B:10:0x001b->B:23:0x0055], SYNTHETIC] */
    public final void x() {
        C c10;
        InterfaceC1718z0 interfaceC1718z0 = this.f25603b;
        if (interfaceC1718z0 == null || (c10 = this.f25607f) == null) {
            return;
        }
        D(true);
        try {
            Object[] objArr = c10.f11271b;
            int[] iArr = c10.f11272c;
            long[] jArr = c10.f11270a;
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
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr[i13];
                                int i14 = iArr[i13];
                                interfaceC1718z0.a(obj);
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
        } finally {
            D(false);
        }
    }

    public final void y() {
        E(true);
    }

    public final void z(C1674d c1674d) {
        this.f25604c = c1674d;
    }
}

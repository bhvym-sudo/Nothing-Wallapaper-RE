package p170r;

import A.k;
import A.p;
import A.u;
import A.v;
import A.w;
import androidx.collection.C;
import androidx.collection.H;
import androidx.collection.I;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p079h8.A;
import p219v8.l;
import p240y.d;

/* JADX INFO: loaded from: classes.dex */
final class D extends v implements E {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p219v8.a f25284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final R0 f25285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a f25286t = new a();

    public static final class a extends w implements E.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0647a f25287h = new C0647a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f25288i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final Object f25289j = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f25290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f25291d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private H f25292e = I.a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f25293f = f25289j;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f25294g;

        /* JADX INFO: renamed from: r.D$a$a, reason: collision with other inner class name */
        public static final class C0647a {
            public /* synthetic */ C0647a(AbstractC1457h abstractC1457h) {
                this();
            }

            public final Object a() {
                return a.f25289j;
            }

            private C0647a() {
            }
        }

        @Override // r.E.a
        public Object a() {
            return this.f25293f;
        }

        @Override // r.E.a
        public H b() {
            return this.f25292e;
        }

        @Override // A.w
        public void c(w wVar) {
            n.f(wVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) wVar;
            m(aVar.b());
            this.f25293f = aVar.f25293f;
            this.f25294g = aVar.f25294g;
        }

        @Override // A.w
        public w d() {
            return new a();
        }

        public final Object j() {
            return this.f25293f;
        }

        public final boolean k(E e10, k kVar) {
            boolean z9;
            boolean z10;
            synchronized (p.I()) {
                z9 = true;
                z10 = (this.f25290c == kVar.f() && this.f25291d == kVar.j()) ? false : true;
            }
            if (this.f25293f == f25289j || (z10 && this.f25294g != l(e10, kVar))) {
                z9 = false;
            }
            if (!z9 || !z10) {
                return z9;
            }
            synchronized (p.I()) {
                this.f25290c = kVar.f();
                this.f25291d = kVar.j();
                A a10 = A.f21846a;
            }
            return z9;
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
        public final int l(E e10, k kVar) {
            H hB;
            int iC;
            int iP;
            Object[] objArrO;
            int i10;
            int i11;
            synchronized (p.I()) {
                hB = b();
            }
            int i12 = 7;
            if (!hB.g()) {
                return 7;
            }
            p190t.b bVarA = S0.a();
            int iP2 = bVarA.p();
            if (iP2 > 0) {
                Object[] objArrO2 = bVarA.o();
                int i13 = 0;
                do {
                    ((F) objArrO2[i13]).b(e10);
                    i13++;
                } while (i13 < iP2);
            }
            try {
                Object[] objArr = hB.f11271b;
                int[] iArr = hB.f11272c;
                long[] jArr = hB.f11270a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    iC = 7;
                    int i14 = 0;
                    while (true) {
                        long j9 = jArr[i14];
                        if ((((~j9) << i12) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8;
                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j9 & 255) < 128) {
                                    int i18 = (i14 << 3) + i17;
                                    Object obj = objArr[i18];
                                    int i19 = iArr[i18];
                                    i11 = i15;
                                    u uVar = (u) obj;
                                    if (i19 == 1) {
                                        w wVarN = uVar instanceof D ? ((D) uVar).n(kVar) : p.G(uVar.b(), kVar);
                                        iC = (((iC * 31) + AbstractC1672c.c(wVarN)) * 31) + wVarN.f();
                                    }
                                } else {
                                    i11 = i15;
                                }
                                j9 >>= i11;
                                i17++;
                                i15 = i11;
                            }
                            if (i16 != i15) {
                                break;
                            }
                        }
                        if (i14 != length) {
                            i14++;
                            i12 = i12;
                        } else {
                            i12 = iC;
                        }
                    }
                    A a10 = A.f21846a;
                    iP = bVarA.p();
                    if (iP > 0) {
                        objArrO = bVarA.o();
                        i10 = 0;
                        do {
                            ((F) objArrO[i10]).a(e10);
                            i10++;
                        } while (i10 < iP);
                    }
                    return iC;
                }
                iC = i12;
                A a11 = A.f21846a;
                iP = bVarA.p();
                if (iP > 0) {
                    objArrO = bVarA.o();
                    i10 = 0;
                    do {
                        ((F) objArrO[i10]).a(e10);
                        i10++;
                    } while (i10 < iP);
                }
                return iC;
            } catch (Throwable th) {
                int iP3 = bVarA.p();
                if (iP3 > 0) {
                    Object[] objArrO3 = bVarA.o();
                    int i20 = 0;
                    do {
                        ((F) objArrO3[i20]).a(e10);
                        i20++;
                    } while (i20 < iP3);
                }
                throw th;
            }
        }

        public void m(H h10) {
            this.f25292e = h10;
        }

        public final void n(Object obj) {
            this.f25293f = obj;
        }

        public final void o(int i10) {
            this.f25294g = i10;
        }

        public final void p(int i10) {
            this.f25290c = i10;
        }

        public final void q(int i10) {
            this.f25291d = i10;
        }
    }

    static final class b extends o implements l {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ d f25296s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ C f25297t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f25298u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d dVar, C c10, int i10) {
            super(1);
            this.f25296s = dVar;
            this.f25297t = c10;
            this.f25298u = i10;
        }

        public final void a(Object obj) {
            if (obj == D.this) {
                throw new IllegalStateException("A derived state calculation cannot read itself");
            }
            if (obj instanceof u) {
                int iA = this.f25296s.a();
                C c10 = this.f25297t;
                c10.r(obj, Math.min(iA - this.f25298u, c10.d(obj, SubsamplingScaleImageView.TILE_SIZE_AUTO)));
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a(obj);
            return A.f21846a;
        }
    }

    public D(p219v8.a aVar, R0 r9) {
        this.f25284r = aVar;
        this.f25285s = r9;
    }

    private final a o(a aVar, k kVar, boolean z9, p219v8.a aVar2) throws Throwable {
        k.a aVar3;
        R0 r0A;
        int i10;
        a aVar4 = aVar;
        boolean z10 = true;
        if (!aVar4.k(this, kVar)) {
            int i11 = 0;
            C c10 = new C(0, 1, null);
            d dVar = (d) T0.f25392a.a();
            if (dVar == null) {
                dVar = new d(0);
                T0.f25392a.b(dVar);
            }
            int iA = dVar.a();
            p190t.b bVarA = S0.a();
            int iP = bVarA.p();
            if (iP > 0) {
                Object[] objArrO = bVarA.o();
                int i12 = 0;
                do {
                    ((F) objArrO[i12]).b(this);
                    i12++;
                } while (i12 < iP);
            }
            try {
                dVar.b(iA + 1);
                Object objH = k.f25e.h(new b(dVar, c10, iA), null, aVar2);
                dVar.b(iA);
                int iP2 = bVarA.p();
                if (iP2 > 0) {
                    Object[] objArrO2 = bVarA.o();
                    do {
                        ((F) objArrO2[i11]).a(this);
                        i11++;
                    } while (i11 < iP2);
                }
                synchronized (p.I()) {
                    try {
                        aVar3 = k.f25e;
                        k kVarC = aVar3.c();
                        if (aVar4.j() == a.f25287h.a() || (r0A = a()) == null || !r0A.a(objH, aVar4.j())) {
                            aVar4 = (a) p.O(this.f25286t, this, kVarC);
                            aVar4.m(c10);
                            aVar4.o(aVar4.l(this, kVarC));
                            aVar4.n(objH);
                        } else {
                            aVar4.m(c10);
                            aVar4.o(aVar4.l(this, kVarC));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                d dVar2 = (d) T0.f25392a.a();
                if (dVar2 == null || dVar2.a() != 0) {
                    return aVar4;
                }
                aVar3.g();
                synchronized (p.I()) {
                    k kVarC2 = aVar3.c();
                    aVar4.p(kVarC2.f());
                    aVar4.q(kVarC2.j());
                    A a10 = A.f21846a;
                }
                return aVar4;
            } catch (Throwable th2) {
                int iP3 = bVarA.p();
                if (iP3 > 0) {
                    Object[] objArrO3 = bVarA.o();
                    int i13 = 0;
                    do {
                        ((F) objArrO3[i13]).a(this);
                        i13++;
                    } while (i13 < iP3);
                }
                throw th2;
            }
        }
        if (z9) {
            p190t.b bVarA2 = S0.a();
            int iP4 = bVarA2.p();
            if (iP4 > 0) {
                Object[] objArrO4 = bVarA2.o();
                int i14 = 0;
                do {
                    ((F) objArrO4[i14]).b(this);
                    i14++;
                } while (i14 < iP4);
            }
            try {
                H hB = aVar4.b();
                d dVar3 = (d) T0.f25392a.a();
                if (dVar3 == null) {
                    dVar3 = new d(0);
                    T0.f25392a.b(dVar3);
                }
                int iA2 = dVar3.a();
                Object[] objArr = hB.f11271b;
                int[] iArr = hB.f11272c;
                long[] jArr = hB.f11270a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j9 = jArr[i15];
                        boolean z11 = z10;
                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8;
                            int i17 = 8 - ((~(i15 - length)) >>> 31);
                            int i18 = 0;
                            while (i18 < i17) {
                                if ((j9 & 255) < 128) {
                                    int i19 = (i15 << 3) + i18;
                                    try {
                                        i10 = i16;
                                        u uVar = (u) objArr[i19];
                                        dVar3.b(iA2 + iArr[i19]);
                                        l lVarH = kVar.h();
                                        if (lVarH != null) {
                                            lVarH.f(uVar);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        int iP5 = bVarA2.p();
                                        if (iP5 > 0) {
                                            Object[] objArrO5 = bVarA2.o();
                                            int i20 = 0;
                                            do {
                                                ((F) objArrO5[i20]).a(this);
                                                i20++;
                                            } while (i20 < iP5);
                                        }
                                        throw th;
                                    }
                                } else {
                                    i10 = i16;
                                }
                                j9 >>= i10;
                                i18++;
                                i16 = i10;
                            }
                            if (i17 != i16) {
                                break;
                            }
                        }
                        if (i15 == length) {
                            break;
                        }
                        i15++;
                        z10 = z11;
                    }
                }
                dVar3.b(iA2);
                A a11 = A.f21846a;
                int iP6 = bVarA2.p();
                if (iP6 > 0) {
                    Object[] objArrO6 = bVarA2.o();
                    int i21 = 0;
                    do {
                        ((F) objArrO6[i21]).a(this);
                        i21++;
                    } while (i21 < iP6);
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return aVar4;
    }

    private final String p() {
        a aVar = (a) p.F(this.f25286t);
        return aVar.k(this, k.f25e.c()) ? String.valueOf(aVar.j()) : "<Not calculated>";
    }

    @Override // p170r.E
    public R0 a() {
        return this.f25285s;
    }

    @Override // A.u
    public w b() {
        return this.f25286t;
    }

    @Override // p170r.b1
    public Object getValue() {
        k.a aVar = k.f25e;
        l lVarH = aVar.c().h();
        if (lVarH != null) {
            lVarH.f(this);
        }
        k kVarC = aVar.c();
        return o((a) p.G(this.f25286t, kVarC), kVarC, true, this.f25284r).j();
    }

    @Override // p170r.E
    public E.a j() {
        k kVarC = k.f25e.c();
        return o((a) p.G(this.f25286t, kVarC), kVarC, false, this.f25284r);
    }

    @Override // A.u
    public void k(w wVar) {
        n.f(wVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f25286t = (a) wVar;
    }

    public final w n(k kVar) {
        return o((a) p.G(this.f25286t, kVar), kVar, false, this.f25284r);
    }

    public String toString() {
        return "DerivedState(value=" + p() + ")@" + hashCode();
    }
}

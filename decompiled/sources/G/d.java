package G;

import W.AbstractC0967i;
import W.W;
import androidx.collection.F;
import androidx.collection.O;
import androidx.constraintlayout.core.widgets.Optimizer;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p219v8.l f1916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v8.a f1917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F f1918c = O.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F f1919d = O.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F f1920e = O.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final F f1921f = O.a();

    /* synthetic */ class a extends kotlin.jvm.internal.l implements p219v8.a {
        a(Object obj) {
            super(0, obj, d.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3invoke();
            return A.f21846a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3invoke() {
            ((d) this.receiver).c();
        }
    }

    public d(p219v8.l lVar, p219v8.a aVar) {
        this.f1916a = lVar;
        this.f1917b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:119:0x023d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x023f A[LOOP:6: B:55:0x0123->B:120:0x023f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x0247 A[EDGE_INSN: B:175:0x0247->B:121:0x0247 BREAK  A[LOOP:6: B:55:0x0123->B:120:0x023f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v15 */
    /* JADX WARN: Type inference failed for: r23v2, types: [androidx.compose.ui.focus.k] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    public final void c() {
        long j9;
        long j10;
        long j11;
        p190t.b bVar;
        char c10;
        int i10;
        l lVarO0;
        long j12;
        F f10 = this.f1920e;
        Object[] objArr = f10.f11289b;
        long[] jArr = f10.f11288a;
        int length = jArr.length - 2;
        int i11 = 16;
        long j13 = -9187201950435737472L;
        int i12 = 8;
        if (length >= 0) {
            int i13 = 0;
            j10 = 128;
            j11 = 255;
            while (true) {
                long j14 = jArr[i13];
                char c11 = 7;
                bVar = null;
                if ((((~j14) << 7) & j14 & j13) != j13) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j14 & 255) < 128) {
                            h hVar = (h) objArr[(i13 << 3) + i15];
                            if (hVar.z().Q()) {
                                int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
                                C.c.AbstractC0022c abstractC0022cZ = hVar.z();
                                while (abstractC0022cZ != null) {
                                    long j15 = j13;
                                    if (abstractC0022cZ instanceof androidx.compose.ui.focus.k) {
                                        this.f1918c.h((androidx.compose.ui.focus.k) abstractC0022cZ);
                                    } else {
                                        abstractC0022cZ.L();
                                    }
                                    abstractC0022cZ = AbstractC0967i.f(null);
                                    j13 = j15;
                                }
                                j12 = j13;
                                if (!hVar.z().Q()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                p190t.b bVar2 = new p190t.b(new C.c.AbstractC0022c[16], 0);
                                C.c.AbstractC0022c abstractC0022cI = hVar.z().I();
                                if (abstractC0022cI == null) {
                                    AbstractC0967i.c(bVar2, hVar.z());
                                } else {
                                    bVar2.b(abstractC0022cI);
                                }
                                while (bVar2.s()) {
                                    C.c.AbstractC0022c abstractC0022cF = (C.c.AbstractC0022c) bVar2.w(bVar2.p() - 1);
                                    if ((abstractC0022cF.H() & iA) == 0) {
                                        AbstractC0967i.c(bVar2, abstractC0022cF);
                                    } else {
                                        while (abstractC0022cF != null) {
                                            if ((abstractC0022cF.L() & iA) != 0) {
                                                while (abstractC0022cF != null) {
                                                    if (abstractC0022cF instanceof androidx.compose.ui.focus.k) {
                                                        this.f1918c.h((androidx.compose.ui.focus.k) abstractC0022cF);
                                                    } else {
                                                        abstractC0022cF.L();
                                                    }
                                                    abstractC0022cF = AbstractC0967i.f(null);
                                                }
                                                break;
                                            }
                                            abstractC0022cF = abstractC0022cF.I();
                                        }
                                    }
                                }
                            } else {
                                j12 = j13;
                            }
                        } else {
                            j12 = j13;
                        }
                        j14 >>= 8;
                        i15++;
                        c11 = c11;
                        j13 = j12;
                    }
                    c10 = c11;
                    j9 = j13;
                    if (i14 != 8) {
                        break;
                    }
                } else {
                    c10 = 7;
                    j9 = j13;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                j13 = j9;
            }
        } else {
            j9 = -9187201950435737472L;
            j10 = 128;
            j11 = 255;
            bVar = null;
            c10 = 7;
        }
        this.f1920e.m();
        F f11 = this.f1919d;
        Object[] objArr2 = f11.f11289b;
        long[] jArr2 = f11.f11288a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i16 = 0;
            while (true) {
                long j16 = jArr2[i16];
                if ((((~j16) << c10) & j16 & j9) != j9) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j16 & j11) < j10) {
                            b bVar3 = (b) objArr2[(i16 << 3) + i18];
                            if (bVar3.z().Q()) {
                                int iA2 = W.a(Optimizer.OPTIMIZATION_GROUPING);
                                C.c.AbstractC0022c abstractC0022cZ2 = bVar3.z();
                                boolean z9 = false;
                                boolean z10 = true;
                                ?? r23 = bVar;
                                while (abstractC0022cZ2 != null) {
                                    int i19 = i12;
                                    if (abstractC0022cZ2 instanceof androidx.compose.ui.focus.k) {
                                        androidx.compose.ui.focus.k kVar = (androidx.compose.ui.focus.k) abstractC0022cZ2;
                                        if (r23 != 0) {
                                            z9 = true;
                                        }
                                        if (this.f1918c.a(kVar)) {
                                            this.f1921f.h(kVar);
                                            z10 = false;
                                        }
                                        r23 = kVar;
                                    } else {
                                        abstractC0022cZ2.L();
                                    }
                                    abstractC0022cZ2 = AbstractC0967i.f(bVar);
                                    i12 = i19;
                                    r23 = r23;
                                }
                                i10 = i12;
                                if (!bVar3.z().Q()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                p190t.b bVar4 = new p190t.b(new C.c.AbstractC0022c[i11], 0);
                                C.c.AbstractC0022c abstractC0022cI2 = bVar3.z().I();
                                if (abstractC0022cI2 == null) {
                                    AbstractC0967i.c(bVar4, bVar3.z());
                                } else {
                                    bVar4.b(abstractC0022cI2);
                                }
                                while (bVar4.s()) {
                                    C.c.AbstractC0022c abstractC0022cF2 = (C.c.AbstractC0022c) bVar4.w(bVar4.p() - 1);
                                    if ((abstractC0022cF2.H() & iA2) == 0) {
                                        AbstractC0967i.c(bVar4, abstractC0022cF2);
                                    } else {
                                        while (true) {
                                            if (abstractC0022cF2 != null) {
                                                if ((abstractC0022cF2.L() & iA2) != 0) {
                                                    while (abstractC0022cF2 != null) {
                                                        if (abstractC0022cF2 instanceof androidx.compose.ui.focus.k) {
                                                            androidx.compose.ui.focus.k kVar2 = (androidx.compose.ui.focus.k) abstractC0022cF2;
                                                            if (r23 != 0) {
                                                                z9 = true;
                                                            }
                                                            if (this.f1918c.a(kVar2)) {
                                                                this.f1921f.h(kVar2);
                                                                z10 = false;
                                                            }
                                                            r23 = kVar2;
                                                        } else {
                                                            abstractC0022cF2.L();
                                                        }
                                                        abstractC0022cF2 = AbstractC0967i.f(bVar);
                                                    }
                                                    break;
                                                }
                                                abstractC0022cF2 = abstractC0022cF2.I();
                                            }
                                        }
                                    }
                                }
                                if (z10) {
                                    if (z9) {
                                        lVarO0 = c.a(bVar3);
                                    } else if (r23 == 0 || (lVarO0 = r23.o0()) == null) {
                                        lVarO0 = m.Inactive;
                                    }
                                    bVar3.G(lVarO0);
                                }
                            } else {
                                bVar3.G(m.Inactive);
                                i10 = i12;
                            }
                        } else {
                            i10 = i12;
                        }
                        j16 >>= i10;
                        i18++;
                        i12 = i10;
                        i11 = 16;
                    }
                    if (i17 != i12) {
                        break;
                    }
                    if (i16 != length2) {
                        break;
                    }
                    i16++;
                    i11 = 16;
                    i12 = 8;
                } else if (i16 != length2) {
                    break;
                    break;
                } else {
                    i16++;
                    i11 = 16;
                    i12 = 8;
                }
            }
        }
        this.f1919d.m();
        F f12 = this.f1918c;
        Object[] objArr3 = f12.f11289b;
        long[] jArr3 = f12.f11288a;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i20 = 0;
            while (true) {
                long j17 = jArr3[i20];
                if ((((~j17) << c10) & j17 & j9) != j9) {
                    int i21 = 8 - ((~(i20 - length3)) >>> 31);
                    for (int i22 = 0; i22 < i21; i22++) {
                        if ((j17 & j11) < j10) {
                            androidx.compose.ui.focus.k kVar3 = (androidx.compose.ui.focus.k) objArr3[(i20 << 3) + i22];
                            if (kVar3.Q()) {
                                m mVarO0 = kVar3.o0();
                                kVar3.t0();
                                if (mVarO0 != kVar3.o0() || this.f1921f.a(kVar3)) {
                                    c.c(kVar3);
                                }
                            }
                        }
                        j17 >>= 8;
                    }
                    if (i21 != 8) {
                        break;
                    }
                }
                if (i20 == length3) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        this.f1918c.m();
        this.f1921f.m();
        this.f1917b.invoke();
        if (!this.f1920e.d()) {
            T.a.b("Unprocessed FocusProperties nodes");
        }
        if (!this.f1919d.d()) {
            T.a.b("Unprocessed FocusEvent nodes");
        }
        if (this.f1918c.d()) {
            return;
        }
        T.a.b("Unprocessed FocusTarget nodes");
    }

    private final void f(F f10, Object obj) {
        if (f10.h(obj) && this.f1918c.c() + this.f1919d.c() + this.f1920e.c() == 1) {
            this.f1916a.f(new a(this));
        }
    }

    public final boolean b() {
        return this.f1918c.e() || this.f1920e.e() || this.f1919d.e();
    }

    public final void d(b bVar) {
        f(this.f1919d, bVar);
    }

    public final void e(h hVar) {
        f(this.f1920e, hVar);
    }

    public final void g(androidx.compose.ui.focus.k kVar) {
        f(this.f1918c, kVar);
    }
}

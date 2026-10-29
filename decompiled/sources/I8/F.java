package I8;

import F8.AbstractC0830p;
import F8.C0826n;
import F8.InterfaceC0807d0;
import J8.AbstractC0906b;
import J8.AbstractC0907c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public class F extends AbstractC0906b implements z, InterfaceC0880f, J8.q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f3142A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f3143B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f3144u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f3145v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final H8.a f3146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Object[] f3147x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f3148y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f3149z;

    private static final class a implements InterfaceC0807d0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final F f3150q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f3151r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Object f3152s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final p129m8.e f3153t;

        public a(F f10, long j9, Object obj, p129m8.e eVar) {
            this.f3150q = f10;
            this.f3151r = j9;
            this.f3152s = obj;
            this.f3153t = eVar;
        }

        @Override // F8.InterfaceC0807d0
        public void dispose() {
            this.f3150q.B(this);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3154a;

        static {
            int[] iArr = new int[H8.a.values().length];
            try {
                iArr[H8.a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H8.a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H8.a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3154a = iArr;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3155q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3156r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f3157s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3158t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f3159u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f3161w;

        c(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3159u = obj;
            this.f3161w |= Integer.MIN_VALUE;
            return F.D(F.this, null, this);
        }
    }

    public F(int i10, int i11, H8.a aVar) {
        this.f3144u = i10;
        this.f3145v = i11;
        this.f3146w = aVar;
    }

    private final Object A(H h10, p129m8.e eVar) {
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        synchronized (this) {
            try {
                if (W(h10) < 0) {
                    h10.f3164b = c0826n;
                } else {
                    h8.q.a aVar = p079h8.q.f21862r;
                    c0826n.resumeWith(p079h8.q.b(p079h8.A.f21846a));
                }
                p079h8.A a10 = p079h8.A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(a aVar) {
        synchronized (this) {
            if (aVar.f3151r < N()) {
                return;
            }
            Object[] objArr = this.f3147x;
            kotlin.jvm.internal.n.e(objArr);
            if (G.f(objArr, aVar.f3151r) != aVar) {
                return;
            }
            G.g(objArr, aVar.f3151r, G.f3162a);
            C();
            p079h8.A a10 = p079h8.A.f21846a;
        }
    }

    private final void C() {
        if (this.f3145v != 0 || this.f3143B > 1) {
            Object[] objArr = this.f3147x;
            kotlin.jvm.internal.n.e(objArr);
            while (this.f3143B > 0 && G.f(objArr, (N() + ((long) S())) - 1) == G.f3162a) {
                this.f3143B--;
                G.g(objArr, N() + ((long) S()), null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:15:0x003b, B:32:0x0092, B:34:0x009a, B:38:0x00ad, B:39:0x00b0, B:22:0x005d), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:15:0x003b, B:32:0x0092, B:34:0x009a, B:38:0x00ad, B:39:0x00b0, B:22:0x005d), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r10 == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4, types: [I8.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [J8.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [I8.F, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [I8.g] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [J8.d] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [I8.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [I8.H] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00be -> B:16:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object D(I8.F r8, I8.InterfaceC0881g r9, p129m8.e r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof I8.F.c
            if (r0 == 0) goto L13
            r0 = r10
            I8.F$c r0 = (I8.F.c) r0
            int r1 = r0.f3161w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3161w = r1
            goto L18
        L13:
            I8.F$c r0 = new I8.F$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f3159u
            java.lang.Object r1 = p139n8.b.e()
            int r2 = r0.f3161w
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L77
            r8 = 1
            if (r2 == r8) goto L61
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.f3158t
            F8.x0 r8 = (F8.InterfaceC0846x0) r8
            java.lang.Object r9 = r0.f3157s
            I8.H r9 = (I8.H) r9
            java.lang.Object r2 = r0.f3156r
            I8.g r2 = (I8.InterfaceC0881g) r2
            java.lang.Object r5 = r0.f3155q
            I8.F r5 = (I8.F) r5
            p079h8.r.b(r10)     // Catch: java.lang.Throwable -> L42
        L3e:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L8f
        L42:
            r8 = move-exception
            goto Lc4
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.Object r8 = r0.f3158t
            F8.x0 r8 = (F8.InterfaceC0846x0) r8
            java.lang.Object r9 = r0.f3157s
            I8.H r9 = (I8.H) r9
            java.lang.Object r2 = r0.f3156r
            I8.g r2 = (I8.InterfaceC0881g) r2
            java.lang.Object r5 = r0.f3155q
            I8.F r5 = (I8.F) r5
            p079h8.r.b(r10)     // Catch: java.lang.Throwable -> L42
            goto L92
        L61:
            java.lang.Object r8 = r0.f3157s
            r9 = r8
            I8.H r9 = (I8.H) r9
            java.lang.Object r8 = r0.f3156r
            I8.g r8 = (I8.InterfaceC0881g) r8
            java.lang.Object r2 = r0.f3155q
            I8.F r2 = (I8.F) r2
            p079h8.r.b(r10)     // Catch: java.lang.Throwable -> L74
            r10 = r8
            r8 = r2
            goto L83
        L74:
            r8 = move-exception
            r5 = r2
            goto Lc4
        L77:
            p079h8.r.b(r10)
            J8.d r10 = r8.j()
            I8.H r10 = (I8.H) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L83:
            m8.i r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lc1
            F8.x0$b r5 = F8.InterfaceC0846x0.f1901e     // Catch: java.lang.Throwable -> Lc1
            m8.i$b r2 = r2.b(r5)     // Catch: java.lang.Throwable -> Lc1
            F8.x0 r2 = (F8.InterfaceC0846x0) r2     // Catch: java.lang.Throwable -> Lc1
        L8f:
            r5 = r8
            r8 = r2
            r2 = r10
        L92:
            java.lang.Object r10 = r5.X(r9)     // Catch: java.lang.Throwable -> L42
            K8.D r6 = I8.G.f3162a     // Catch: java.lang.Throwable -> L42
            if (r10 != r6) goto Lab
            r0.f3155q = r5     // Catch: java.lang.Throwable -> L42
            r0.f3156r = r2     // Catch: java.lang.Throwable -> L42
            r0.f3157s = r9     // Catch: java.lang.Throwable -> L42
            r0.f3158t = r8     // Catch: java.lang.Throwable -> L42
            r0.f3161w = r4     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = r5.A(r9, r0)     // Catch: java.lang.Throwable -> L42
            if (r10 != r1) goto L92
            goto Lc0
        Lab:
            if (r8 == 0) goto Lb0
            F8.A0.i(r8)     // Catch: java.lang.Throwable -> L42
        Lb0:
            r0.f3155q = r5     // Catch: java.lang.Throwable -> L42
            r0.f3156r = r2     // Catch: java.lang.Throwable -> L42
            r0.f3157s = r9     // Catch: java.lang.Throwable -> L42
            r0.f3158t = r8     // Catch: java.lang.Throwable -> L42
            r0.f3161w = r3     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = r2.b(r10, r0)     // Catch: java.lang.Throwable -> L42
            if (r10 != r1) goto L3e
        Lc0:
            return r1
        Lc1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lc4:
            r5.n(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I8.F.D(I8.F, I8.g, m8.e):java.lang.Object");
    }

    private final void E(long j9) {
        J8.d[] dVarArr;
        if (((AbstractC0906b) this).f3885r != 0 && (dVarArr = ((AbstractC0906b) this).f3884q) != null) {
            for (J8.d dVar : dVarArr) {
                if (dVar != null) {
                    H h10 = (H) dVar;
                    long j10 = h10.f3163a;
                    if (j10 >= 0 && j10 < j9) {
                        h10.f3163a = j9;
                    }
                }
            }
        }
        this.f3149z = j9;
    }

    private final void H() {
        Object[] objArr = this.f3147x;
        kotlin.jvm.internal.n.e(objArr);
        G.g(objArr, N(), null);
        this.f3142A--;
        long jN = N() + 1;
        if (this.f3148y < jN) {
            this.f3148y = jN;
        }
        if (this.f3149z < jN) {
            E(jN);
        }
    }

    static /* synthetic */ Object I(F f10, Object obj, p129m8.e eVar) {
        Object objJ;
        return (!f10.h(obj) && (objJ = f10.J(obj, eVar)) == p139n8.b.e()) ? objJ : p079h8.A.f21846a;
    }

    private final Object J(Object obj, p129m8.e eVar) throws Throwable {
        F f10;
        Throwable th;
        p129m8.e[] eVarArrL;
        a aVar;
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        p129m8.e[] eVarArrL2 = AbstractC0907c.f3888a;
        synchronized (this) {
            try {
                if (U(obj)) {
                    try {
                        h8.q.a aVar2 = p079h8.q.f21862r;
                        c0826n.resumeWith(p079h8.q.b(p079h8.A.f21846a));
                        eVarArrL = L(eVarArrL2);
                        aVar = null;
                        f10 = this;
                    } catch (Throwable th2) {
                        th = th2;
                        f10 = this;
                        throw th;
                    }
                } else {
                    f10 = this;
                    try {
                        aVar = new a(f10, N() + ((long) S()), obj, c0826n);
                        f10.K(aVar);
                        f10.f3143B++;
                        if (f10.f3145v == 0) {
                            eVarArrL2 = f10.L(eVarArrL2);
                        }
                        eVarArrL = eVarArrL2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (aVar != null) {
                    AbstractC0830p.a(c0826n, aVar);
                }
                for (p129m8.e eVar2 : eVarArrL) {
                    if (eVar2 != null) {
                        h8.q.a aVar3 = p079h8.q.f21862r;
                        eVar2.resumeWith(p079h8.q.b(p079h8.A.f21846a));
                    }
                }
                Object objA = c0826n.A();
                if (objA == p139n8.b.e()) {
                    kotlin.coroutines.jvm.internal.h.c(eVar);
                }
                return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
            } catch (Throwable th4) {
                th = th4;
                f10 = this;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(Object obj) {
        int iS = S();
        Object[] objArrT = this.f3147x;
        if (objArrT == null) {
            objArrT = T(null, 0, 2);
        } else if (iS >= objArrT.length) {
            objArrT = T(objArrT, iS, objArrT.length * 2);
        }
        G.g(objArrT, N() + ((long) iS), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [m8.e[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final p129m8.e[] L(p129m8.e[] eVarArr) {
        J8.d[] dVarArr;
        H h10;
        p129m8.e eVar;
        int length = eVarArr.length;
        if (((AbstractC0906b) this).f3885r != 0 && (dVarArr = ((AbstractC0906b) this).f3884q) != null) {
            int length2 = dVarArr.length;
            int i10 = 0;
            while (i10 < length2) {
                J8.d dVar = dVarArr[i10];
                if (dVar == null || (eVar = (h10 = (H) dVar).f3164b) == null || W(h10) < 0) {
                    eVarArr = eVarArr;
                } else {
                    if (length >= eVarArr.length) {
                        eVarArr = eVarArr;
                        eVarArr = eVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) eVarArr, Math.max(2, eVarArr.length * 2));
                        kotlin.jvm.internal.n.g(objArrCopyOf, "copyOf(...)");
                        eVarArr = objArrCopyOf;
                    }
                    eVarArr = eVarArr;
                    eVarArr = eVarArr;
                    ((p129m8.e[]) eVarArr)[length] = eVar;
                    h10.f3164b = null;
                    length++;
                }
                i10++;
                eVarArr = eVarArr;
            }
            eVarArr = eVarArr;
        }
        return (p129m8.e[]) eVarArr;
    }

    private final long M() {
        return N() + ((long) this.f3142A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long N() {
        return Math.min(this.f3149z, this.f3148y);
    }

    private final Object P(long j9) {
        Object[] objArr = this.f3147x;
        kotlin.jvm.internal.n.e(objArr);
        Object objF = G.f(objArr, j9);
        return objF instanceof a ? ((a) objF).f3152s : objF;
    }

    private final long Q() {
        return N() + ((long) this.f3142A) + ((long) this.f3143B);
    }

    private final int R() {
        return (int) ((N() + ((long) this.f3142A)) - this.f3148y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S() {
        return this.f3142A + this.f3143B;
    }

    private final Object[] T(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f3147x = objArr2;
        if (objArr != null) {
            long jN = N();
            for (int i12 = 0; i12 < i10; i12++) {
                long j9 = ((long) i12) + jN;
                G.g(objArr2, j9, G.f(objArr, j9));
            }
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean U(Object obj) {
        if (o() == 0) {
            return V(obj);
        }
        if (this.f3142A >= this.f3145v && this.f3149z <= this.f3148y) {
            int i10 = b.f3154a[this.f3146w.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new p079h8.m();
            }
        }
        K(obj);
        int i11 = this.f3142A + 1;
        this.f3142A = i11;
        if (i11 > this.f3145v) {
            H();
        }
        if (R() > this.f3144u) {
            Y(this.f3148y + 1, this.f3149z, M(), Q());
        }
        return true;
    }

    private final boolean V(Object obj) {
        if (this.f3144u == 0) {
            return true;
        }
        K(obj);
        int i10 = this.f3142A + 1;
        this.f3142A = i10;
        if (i10 > this.f3144u) {
            H();
        }
        this.f3149z = N() + ((long) this.f3142A);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long W(H h10) {
        long j9 = h10.f3163a;
        if (j9 >= M() && (this.f3145v > 0 || j9 > N() || this.f3143B == 0)) {
            return -1L;
        }
        return j9;
    }

    private final Object X(H h10) {
        Object obj;
        p129m8.e[] eVarArrZ = AbstractC0907c.f3888a;
        synchronized (this) {
            try {
                long jW = W(h10);
                if (jW < 0) {
                    obj = G.f3162a;
                } else {
                    long j9 = h10.f3163a;
                    Object objP = P(jW);
                    h10.f3163a = jW + 1;
                    eVarArrZ = Z(j9);
                    obj = objP;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (p129m8.e eVar : eVarArrZ) {
            if (eVar != null) {
                h8.q.a aVar = p079h8.q.f21862r;
                eVar.resumeWith(p079h8.q.b(p079h8.A.f21846a));
            }
        }
        return obj;
    }

    private final void Y(long j9, long j10, long j11, long j12) {
        long jMin = Math.min(j10, j9);
        for (long jN = N(); jN < jMin; jN++) {
            Object[] objArr = this.f3147x;
            kotlin.jvm.internal.n.e(objArr);
            G.g(objArr, jN, null);
        }
        this.f3148y = j9;
        this.f3149z = j10;
        this.f3142A = (int) (j11 - jMin);
        this.f3143B = (int) (j12 - j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // J8.AbstractC0906b
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public H k() {
        return new H();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // J8.AbstractC0906b
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public H[] m(int i10) {
        return new H[i10];
    }

    protected final Object O() {
        Object[] objArr = this.f3147x;
        kotlin.jvm.internal.n.e(objArr);
        return G.f(objArr, (this.f3148y + ((long) R())) - 1);
    }

    public final p129m8.e[] Z(long j9) {
        long j10;
        long j11;
        long j12;
        J8.d[] dVarArr;
        if (j9 > this.f3149z) {
            return AbstractC0907c.f3888a;
        }
        long jN = N();
        long j13 = ((long) this.f3142A) + jN;
        if (this.f3145v == 0 && this.f3143B > 0) {
            j13++;
        }
        if (((AbstractC0906b) this).f3885r != 0 && (dVarArr = ((AbstractC0906b) this).f3884q) != null) {
            for (J8.d dVar : dVarArr) {
                if (dVar != null) {
                    long j14 = ((H) dVar).f3163a;
                    if (j14 >= 0 && j14 < j13) {
                        j13 = j14;
                    }
                }
            }
        }
        if (j13 <= this.f3149z) {
            return AbstractC0907c.f3888a;
        }
        long jM = M();
        int iMin = o() > 0 ? Math.min(this.f3143B, this.f3145v - ((int) (jM - j13))) : this.f3143B;
        p129m8.e[] eVarArr = AbstractC0907c.f3888a;
        long j15 = ((long) this.f3143B) + jM;
        if (iMin > 0) {
            eVarArr = new p129m8.e[iMin];
            Object[] objArr = this.f3147x;
            kotlin.jvm.internal.n.e(objArr);
            j12 = 1;
            long j16 = jM;
            int i10 = 0;
            while (true) {
                if (jM >= j15) {
                    j10 = jN;
                    j11 = j13;
                    jM = j16;
                    break;
                }
                Object objF = G.f(objArr, jM);
                j10 = jN;
                K8.D d10 = G.f3162a;
                if (objF != d10) {
                    kotlin.jvm.internal.n.f(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    j11 = j13;
                    eVarArr[i10] = aVar.f3153t;
                    G.g(objArr, jM, d10);
                    G.g(objArr, j16, aVar.f3152s);
                    long j17 = j16 + 1;
                    if (i11 >= iMin) {
                        jM = j17;
                        break;
                    }
                    i10 = i11;
                    j16 = j17;
                } else {
                    j11 = j13;
                }
                jM++;
                jN = j10;
                j13 = j11;
            }
        } else {
            j10 = jN;
            j11 = j13;
            j12 = 1;
        }
        p129m8.e[] eVarArr2 = eVarArr;
        int i12 = (int) (jM - j10);
        long j18 = o() == 0 ? jM : j11;
        long jMax = Math.max(this.f3148y, jM - ((long) Math.min(this.f3144u, i12)));
        if (this.f3145v == 0 && jMax < j15) {
            Object[] objArr2 = this.f3147x;
            kotlin.jvm.internal.n.e(objArr2);
            if (kotlin.jvm.internal.n.d(G.f(objArr2, jMax), G.f3162a)) {
                jM += j12;
                jMax += j12;
            }
        }
        Y(jMax, j18, jM, j15);
        C();
        return !(eVarArr2.length == 0) ? L(eVarArr2) : eVarArr2;
    }

    @Override // I8.E, I8.InterfaceC0880f
    public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
        return D(this, interfaceC0881g, eVar);
    }

    public final long a0() {
        long j9 = this.f3148y;
        if (j9 < this.f3149z) {
            this.f3149z = j9;
        }
        return j9;
    }

    @Override // I8.z, I8.InterfaceC0881g
    public Object b(Object obj, p129m8.e eVar) {
        return I(this, obj, eVar);
    }

    @Override // I8.E
    public List c() {
        synchronized (this) {
            int iR = R();
            if (iR == 0) {
                return AbstractC1444s.l();
            }
            ArrayList arrayList = new ArrayList(iR);
            Object[] objArr = this.f3147x;
            kotlin.jvm.internal.n.e(objArr);
            for (int i10 = 0; i10 < iR; i10++) {
                arrayList.add(G.f(objArr, this.f3148y + ((long) i10)));
            }
            return arrayList;
        }
    }

    @Override // J8.q
    public InterfaceC0880f e(p129m8.i iVar, int i10, H8.a aVar) {
        return G.e(this, iVar, i10, aVar);
    }

    @Override // I8.z
    public void g() throws Throwable {
        F f10;
        synchronized (this) {
            try {
                f10 = this;
                try {
                    f10.Y(M(), this.f3149z, M(), Q());
                    p079h8.A a10 = p079h8.A.f21846a;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                f10 = this;
            }
        }
    }

    @Override // I8.z
    public boolean h(Object obj) {
        int i10;
        boolean z9;
        p129m8.e[] eVarArrL = AbstractC0907c.f3888a;
        synchronized (this) {
            if (U(obj)) {
                eVarArrL = L(eVarArrL);
                z9 = true;
            } else {
                z9 = false;
            }
        }
        for (p129m8.e eVar : eVarArrL) {
            if (eVar != null) {
                h8.q.a aVar = p079h8.q.f21862r;
                eVar.resumeWith(p079h8.q.b(p079h8.A.f21846a));
            }
        }
        return z9;
    }
}

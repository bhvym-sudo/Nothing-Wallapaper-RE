package p180s;

import B8.h;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1439m;
import p170r.AbstractC1701q0;
import p170r.E0;
import p170r.InterfaceC1678f;
import p170r.O0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f27620i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f27621j = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27623b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27625d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27629h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d[] f27622a = new d[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f27624c = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object[] f27626e = new Object[16];

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f27632c;

        public b() {
        }

        @Override // p180s.e
        public Object a(int i10) {
            return g.this.f27626e[this.f27632c + i10];
        }

        @Override // p180s.e
        public int b(int i10) {
            return g.this.f27624c[this.f27631b + i10];
        }

        public final d c() {
            d dVar = g.this.f27622a[this.f27630a];
            n.e(dVar);
            return dVar;
        }

        public final boolean d() {
            if (this.f27630a >= g.this.f27623b) {
                return false;
            }
            d dVarC = c();
            this.f27631b += dVarC.b();
            this.f27632c += dVarC.d();
            int i10 = this.f27630a + 1;
            this.f27630a = i10;
            return i10 < g.this.f27623b;
        }
    }

    public static final class c {
        public static g a(g gVar) {
            return gVar;
        }

        public static final d b(g gVar) {
            return gVar.v();
        }

        public static final void c(g gVar, int i10, int i11) {
            int i12 = 1 << i10;
            if (!((gVar.f27628g & i12) == 0)) {
                AbstractC1701q0.b("Already pushed argument " + b(gVar).e(i10));
            }
            gVar.f27628g |= i12;
            gVar.f27624c[gVar.z(i10)] = i11;
        }

        public static final void d(g gVar, int i10, Object obj) {
            int i11 = 1 << i10;
            if (!((gVar.f27629h & i11) == 0)) {
                AbstractC1701q0.b("Already pushed argument " + b(gVar).f(i10));
            }
            gVar.f27629h |= i11;
            gVar.f27626e[gVar.A(i10)] = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A(int i10) {
        return (this.f27627f - v().d()) + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i10);
    }

    private final int o(int i10, int i11) {
        return h.f(i10 + h.i(i10, Optimizer.OPTIMIZATION_GROUPING), i11);
    }

    private final void p(int i10) {
        int[] iArr = this.f27624c;
        int length = iArr.length;
        if (i10 > length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, o(length, i10));
            n.g(iArrCopyOf, "copyOf(this, newSize)");
            this.f27624c = iArrCopyOf;
        }
    }

    private final void q(int i10) {
        Object[] objArr = this.f27626e;
        int length = objArr.length;
        if (i10 > length) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, o(length, i10));
            n.g(objArrCopyOf, "copyOf(this, newSize)");
            this.f27626e = objArrCopyOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d v() {
        d dVar = this.f27622a[this.f27623b - 1];
        n.e(dVar);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z(int i10) {
        return (this.f27625d - v().b()) + i10;
    }

    public final void m() {
        this.f27623b = 0;
        this.f27625d = 0;
        AbstractC1439m.q(this.f27626e, null, 0, this.f27627f);
        this.f27627f = 0;
    }

    public final void r(InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
        if (u()) {
            b bVar = new b();
            do {
                bVar.c().a(bVar, interfaceC1678f, o9, e10);
            } while (bVar.d());
        }
        m();
    }

    public final int s() {
        return this.f27623b;
    }

    public final boolean t() {
        return s() == 0;
    }

    public String toString() {
        return super.toString();
    }

    public final boolean u() {
        return s() != 0;
    }

    public final void w(g gVar) {
        if (t()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        d[] dVarArr = this.f27622a;
        int i10 = this.f27623b - 1;
        this.f27623b = i10;
        d dVar = dVarArr[i10];
        n.e(dVar);
        this.f27622a[this.f27623b] = null;
        gVar.y(dVar);
        int i11 = this.f27627f;
        int i12 = gVar.f27627f;
        int iD = dVar.d();
        for (int i13 = 0; i13 < iD; i13++) {
            i12--;
            i11--;
            Object[] objArr = gVar.f27626e;
            Object[] objArr2 = this.f27626e;
            objArr[i12] = objArr2[i11];
            objArr2[i11] = null;
        }
        int i14 = this.f27625d;
        int i15 = gVar.f27625d;
        int iB = dVar.b();
        for (int i16 = 0; i16 < iB; i16++) {
            i15--;
            i14--;
            int[] iArr = gVar.f27624c;
            int[] iArr2 = this.f27624c;
            iArr[i15] = iArr2[i14];
            iArr2[i14] = 0;
        }
        this.f27627f -= dVar.d();
        this.f27625d -= dVar.b();
    }

    public final void x(d dVar) {
        if (!(dVar.b() == 0 && dVar.d() == 0)) {
            AbstractC1701q0.a("Cannot push " + dVar + " without arguments because it expects " + dVar.b() + " ints and " + dVar.d() + " objects.");
        }
        y(dVar);
    }

    public final void y(d dVar) {
        this.f27628g = 0;
        this.f27629h = 0;
        int i10 = this.f27623b;
        if (i10 == this.f27622a.length) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f27622a, this.f27623b + h.i(i10, Optimizer.OPTIMIZATION_GROUPING));
            n.g(objArrCopyOf, "copyOf(this, newSize)");
            this.f27622a = (d[]) objArrCopyOf;
        }
        p(this.f27625d + dVar.b());
        q(this.f27627f + dVar.d());
        d[] dVarArr = this.f27622a;
        int i11 = this.f27623b;
        this.f27623b = i11 + 1;
        dVarArr[i11] = dVar;
        this.f27625d += dVar.b();
        this.f27627f += dVar.d();
    }
}

package p170r;

import B.a;
import androidx.collection.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class L0 implements a, Iterable, p229w8.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f25328r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f25330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f25331u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f25332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f25333w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private HashMap f25335y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private x f25336z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f25327q = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Object[] f25329s = new Object[0];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ArrayList f25334x = new ArrayList();

    private final C1674d D(int i10) {
        int i11;
        if (this.f25332v) {
            AbstractC1696o.r("use active SlotWriter to crate an anchor for location instead");
        }
        if (i10 < 0 || i10 >= (i11 = this.f25328r)) {
            return null;
        }
        return N0.G(this.f25334x, i10, i11);
    }

    public final boolean A(C1674d c1674d) {
        int iU;
        return c1674d.b() && (iU = N0.U(this.f25334x, c1674d.a(), this.f25328r)) >= 0 && n.d(this.f25334x.get(iU), c1674d);
    }

    public final void B(int[] iArr, int i10, Object[] objArr, int i11, ArrayList arrayList, HashMap map, x xVar) {
        this.f25327q = iArr;
        this.f25328r = i10;
        this.f25329s = objArr;
        this.f25330t = i11;
        this.f25334x = arrayList;
        this.f25335y = map;
        this.f25336z = xVar;
    }

    public final P C(int i10) {
        C1674d c1674dD;
        HashMap map = this.f25335y;
        if (map == null || (c1674dD = D(i10)) == null) {
            return null;
        }
        return (P) map.get(c1674dD);
    }

    public final C1674d a(int i10) {
        if (this.f25332v) {
            AbstractC1696o.r("use active SlotWriter to create an anchor location instead");
        }
        boolean z9 = false;
        if (i10 >= 0 && i10 < this.f25328r) {
            z9 = true;
        }
        if (!z9) {
            AbstractC1701q0.a("Parameter index is out of range");
        }
        ArrayList arrayList = this.f25334x;
        int iU = N0.U(arrayList, i10, this.f25328r);
        if (iU >= 0) {
            return (C1674d) arrayList.get(iU);
        }
        C1674d c1674d = new C1674d(i10);
        arrayList.add(-(iU + 1), c1674d);
        return c1674d;
    }

    public final int b(C1674d c1674d) {
        if (this.f25332v) {
            AbstractC1696o.r("Use active SlotWriter to determine anchor location instead");
        }
        if (!c1674d.b()) {
            AbstractC1701q0.a("Anchor refers to a group that was removed");
        }
        return c1674d.a();
    }

    public final void f(K0 k9, HashMap map) {
        if (!(k9.x() == this && this.f25331u > 0)) {
            AbstractC1696o.r("Unexpected reader close()");
        }
        this.f25331u--;
        if (map != null) {
            synchronized (this) {
                try {
                    HashMap map2 = this.f25335y;
                    if (map2 != null) {
                        map2.putAll(map);
                    } else {
                        this.f25335y = map;
                    }
                    A a10 = A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g(O0 o9, int[] iArr, int i10, Object[] objArr, int i11, ArrayList arrayList, HashMap map, x xVar) {
        if (!(o9.d0() == this && this.f25332v)) {
            AbstractC1701q0.a("Unexpected writer close()");
        }
        this.f25332v = false;
        B(iArr, i10, objArr, i11, arrayList, map, xVar);
    }

    public boolean isEmpty() {
        return this.f25328r == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new N(this, 0, this.f25328r);
    }

    public final void m() {
        this.f25336z = new x(0, 1, null);
    }

    public final void n() {
        this.f25335y = new HashMap();
    }

    public final ArrayList o() {
        return this.f25334x;
    }

    public final x p() {
        return this.f25336z;
    }

    public final int[] q() {
        return this.f25327q;
    }

    public final int r() {
        return this.f25328r;
    }

    public final Object[] s() {
        return this.f25329s;
    }

    public final int t() {
        return this.f25330t;
    }

    public final HashMap u() {
        return this.f25335y;
    }

    public final int v() {
        return this.f25333w;
    }

    public final boolean w() {
        return this.f25332v;
    }

    public final boolean x(int i10, C1674d c1674d) {
        if (this.f25332v) {
            AbstractC1696o.r("Writer is active");
        }
        if (!(i10 >= 0 && i10 < this.f25328r)) {
            AbstractC1696o.r("Invalid group index");
        }
        if (A(c1674d)) {
            int I9 = N0.I(this.f25327q, i10) + i10;
            int iA = c1674d.a();
            if (i10 <= iA && iA < I9) {
                return true;
            }
        }
        return false;
    }

    public final K0 y() {
        if (this.f25332v) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f25331u++;
        return new K0(this);
    }

    public final O0 z() {
        if (this.f25332v) {
            AbstractC1696o.r("Cannot start a writer when another writer is pending");
        }
        if (!(this.f25331u <= 0)) {
            AbstractC1696o.r("Cannot start a writer when a reader is pending");
        }
        this.f25332v = true;
        this.f25333w++;
        return new O0(this);
    }
}

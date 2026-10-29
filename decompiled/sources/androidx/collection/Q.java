package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes.dex */
public class Q implements Cloneable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ boolean f11295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ int[] f11296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object[] f11297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ int f11298t;

    public Q() {
        this(0, 1, null);
    }

    public void c(int i10, Object obj) {
        int i11 = this.f11298t;
        if (i11 != 0 && i10 <= this.f11296r[i11 - 1]) {
            m(i10, obj);
            return;
        }
        if (this.f11295q && i11 >= this.f11296r.length) {
            S.d(this);
        }
        int i12 = this.f11298t;
        if (i12 >= this.f11296r.length) {
            int iE = p150p.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f11296r, iE);
            kotlin.jvm.internal.n.g(iArrCopyOf, "copyOf(this, newSize)");
            this.f11296r = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f11297s, iE);
            kotlin.jvm.internal.n.g(objArrCopyOf, "copyOf(this, newSize)");
            this.f11297s = objArrCopyOf;
        }
        this.f11296r[i12] = i10;
        this.f11297s[i12] = obj;
        this.f11298t = i12 + 1;
    }

    public void d() {
        int i10 = this.f11298t;
        Object[] objArr = this.f11297s;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f11298t = 0;
        this.f11295q = false;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Q clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.n.f(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        Q q9 = (Q) objClone;
        q9.f11296r = (int[]) this.f11296r.clone();
        q9.f11297s = (Object[]) this.f11297s.clone();
        return q9;
    }

    public boolean h(int i10) {
        return j(i10) >= 0;
    }

    public Object i(int i10) {
        return S.c(this, i10);
    }

    public int j(int i10) {
        if (this.f11295q) {
            S.d(this);
        }
        return p150p.a.a(this.f11296r, this.f11298t, i10);
    }

    public int k(Object obj) {
        if (this.f11295q) {
            S.d(this);
        }
        int i10 = this.f11298t;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f11297s[i11] == obj) {
                return i11;
            }
        }
        return -1;
    }

    public int l(int i10) {
        if (this.f11295q) {
            S.d(this);
        }
        return this.f11296r[i10];
    }

    public void m(int i10, Object obj) {
        int iA = p150p.a.a(this.f11296r, this.f11298t, i10);
        if (iA >= 0) {
            this.f11297s[iA] = obj;
            return;
        }
        int i11 = ~iA;
        if (i11 < this.f11298t && this.f11297s[i11] == S.f11299a) {
            this.f11296r[i11] = i10;
            this.f11297s[i11] = obj;
            return;
        }
        if (this.f11295q && this.f11298t >= this.f11296r.length) {
            S.d(this);
            i11 = ~p150p.a.a(this.f11296r, this.f11298t, i10);
        }
        int i12 = this.f11298t;
        if (i12 >= this.f11296r.length) {
            int iE = p150p.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f11296r, iE);
            kotlin.jvm.internal.n.g(iArrCopyOf, "copyOf(this, newSize)");
            this.f11296r = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f11297s, iE);
            kotlin.jvm.internal.n.g(objArrCopyOf, "copyOf(this, newSize)");
            this.f11297s = objArrCopyOf;
        }
        int i13 = this.f11298t;
        if (i13 - i11 != 0) {
            int[] iArr = this.f11296r;
            int i14 = i11 + 1;
            AbstractC1439m.f(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f11297s;
            AbstractC1439m.h(objArr, objArr, i14, i11, this.f11298t);
        }
        this.f11296r[i11] = i10;
        this.f11297s[i11] = obj;
        this.f11298t++;
    }

    public int n() {
        if (this.f11295q) {
            S.d(this);
        }
        return this.f11298t;
    }

    public Object o(int i10) {
        if (this.f11295q) {
            S.d(this);
        }
        return this.f11297s[i10];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11298t * 28);
        sb.append('{');
        int i10 = this.f11298t;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(l(i11));
            sb.append('=');
            Object objO = o(i11);
            if (objO != this) {
                sb.append(objO);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.n.g(string, "buffer.toString()");
        return string;
    }

    public Q(int i10) {
        if (i10 == 0) {
            this.f11296r = p150p.a.f23563a;
            this.f11297s = p150p.a.f23565c;
        } else {
            int iE = p150p.a.e(i10);
            this.f11296r = new int[iE];
            this.f11297s = new Object[iE];
        }
    }

    public /* synthetic */ Q(int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}

package androidx.collection;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;

/* JADX INFO: renamed from: androidx.collection.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1022b implements Collection, Set, p229w8.b, p229w8.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f11309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Object[] f11310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f11311s;

    /* JADX INFO: renamed from: androidx.collection.b$a */
    private final class a extends AbstractC1027g {
        public a() {
            super(C1022b.this.m());
        }

        @Override // androidx.collection.AbstractC1027g
        protected Object a(int i10) {
            return C1022b.this.r(i10);
        }

        @Override // androidx.collection.AbstractC1027g
        protected void c(int i10) {
            C1022b.this.n(i10);
        }
    }

    public C1022b() {
        this(0, 1, null);
    }

    public final void a(int i10) {
        int iM = m();
        if (f().length < i10) {
            int[] iArrF = f();
            Object[] objArrB = b();
            AbstractC1024d.a(this, i10);
            if (m() > 0) {
                AbstractC1439m.k(iArrF, f(), 0, 0, m(), 6, null);
                AbstractC1439m.l(objArrB, b(), 0, 0, m(), 6, null);
            }
        }
        if (m() != iM) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i10;
        int iC;
        int iM = m();
        if (obj == null) {
            iC = AbstractC1024d.d(this);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iC = AbstractC1024d.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i11 = ~iC;
        if (iM >= f().length) {
            int i12 = 8;
            if (iM >= 8) {
                i12 = (iM >> 1) + iM;
            } else if (iM < 4) {
                i12 = 4;
            }
            int[] iArrF = f();
            Object[] objArrB = b();
            AbstractC1024d.a(this, i12);
            if (iM != m()) {
                throw new ConcurrentModificationException();
            }
            if (!(f().length == 0)) {
                AbstractC1439m.k(iArrF, f(), 0, 0, iArrF.length, 6, null);
                AbstractC1439m.l(objArrB, b(), 0, 0, objArrB.length, 6, null);
            }
        }
        if (i11 < iM) {
            int i13 = i11 + 1;
            AbstractC1439m.f(f(), f(), i13, i11, iM);
            AbstractC1439m.h(b(), b(), i13, i11, iM);
        }
        if (iM != m() || i11 >= f().length) {
            throw new ConcurrentModificationException();
        }
        f()[i11] = i10;
        b()[i11] = obj;
        q(m() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        kotlin.jvm.internal.n.h(elements, "elements");
        a(m() + elements.size());
        Iterator it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object[] b() {
        return this.f11310r;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (m() != 0) {
            p(p150p.a.f23563a);
            o(p150p.a.f23565c);
            q(0);
        }
        if (m() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.n.h(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int iM = m();
            for (int i10 = 0; i10 < iM; i10++) {
                if (!((Set) obj).contains(r(i10))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final int[] f() {
        return this.f11309q;
    }

    public int g() {
        return this.f11311s;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrF = f();
        int iM = m();
        int i10 = 0;
        for (int i11 = 0; i11 < iM; i11++) {
            i10 += iArrF[i11];
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        return obj == null ? AbstractC1024d.d(this) : AbstractC1024d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return m() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public final int m() {
        return this.f11311s;
    }

    public final Object n(int i10) {
        int i11;
        Object[] objArr;
        int iM = m();
        Object obj = b()[i10];
        if (iM <= 1) {
            clear();
            return obj;
        }
        int i12 = iM - 1;
        if (f().length <= 8 || m() >= f().length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                AbstractC1439m.f(f(), f(), i10, i13, iM);
                AbstractC1439m.h(b(), b(), i10, i13, iM);
            }
            b()[i12] = null;
        } else {
            int iM2 = m() > 8 ? m() + (m() >> 1) : 8;
            int[] iArrF = f();
            Object[] objArrB = b();
            AbstractC1024d.a(this, iM2);
            if (i10 > 0) {
                AbstractC1439m.k(iArrF, f(), 0, 0, i10, 6, null);
                objArr = objArrB;
                AbstractC1439m.l(objArr, b(), 0, 0, i10, 6, null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = objArrB;
            }
            if (i11 < i12) {
                int i14 = i11 + 1;
                AbstractC1439m.f(iArrF, f(), i11, i14, iM);
                AbstractC1439m.h(objArr, b(), i11, i14, iM);
            }
        }
        if (iM != m()) {
            throw new ConcurrentModificationException();
        }
        q(i12);
        return obj;
    }

    public final void o(Object[] objArr) {
        kotlin.jvm.internal.n.h(objArr, "<set-?>");
        this.f11310r = objArr;
    }

    public final void p(int[] iArr) {
        kotlin.jvm.internal.n.h(iArr, "<set-?>");
        this.f11309q = iArr;
    }

    public final void q(int i10) {
        this.f11311s = i10;
    }

    public final Object r(int i10) {
        return b()[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        n(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        kotlin.jvm.internal.n.h(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        kotlin.jvm.internal.n.h(elements, "elements");
        boolean z9 = false;
        for (int iM = m() - 1; -1 < iM; iM--) {
            if (!AbstractC1444s.L(elements, b()[iM])) {
                n(iM);
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC1439m.n(this.f11310r, 0, this.f11311s);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(m() * 14);
        sb.append('{');
        int iM = m();
        for (int i10 = 0; i10 < iM; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object objR = r(i10);
            if (objR != this) {
                sb.append(objR);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.n.g(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public C1022b(int i10) {
        this.f11309q = p150p.a.f23563a;
        this.f11310r = p150p.a.f23565c;
        if (i10 > 0) {
            AbstractC1024d.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.n.h(array, "array");
        Object[] result = AbstractC1023c.a(array, this.f11311s);
        AbstractC1439m.h(this.f11310r, result, 0, 0, this.f11311s);
        kotlin.jvm.internal.n.g(result, "result");
        return result;
    }

    public /* synthetic */ C1022b(int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public C1022b(Collection collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }
}

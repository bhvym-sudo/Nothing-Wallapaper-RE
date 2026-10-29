package W;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.AbstractC1456g;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;

/* JADX INFO: renamed from: W.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0975q implements List, p229w8.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f8604t;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Object[] f8601q = new Object[16];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long[] f8602r = new long[16];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f8603s = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f8605u = true;

    /* JADX INFO: renamed from: W.q$b */
    private final class b implements List, p229w8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f8610q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f8611r;

        public b(int i10, int i11) {
            this.f8610q = i10;
            this.f8611r = i11;
        }

        public boolean a(C.c.AbstractC0022c abstractC0022c) {
            return indexOf(abstractC0022c) != -1;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C.c.AbstractC0022c get(int i10) {
            Object obj = C0975q.this.f8601q[i10 + this.f8610q];
            kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (C.c.AbstractC0022c) obj;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof C.c.AbstractC0022c) {
                return a((C.c.AbstractC0022c) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((C.c.AbstractC0022c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int f() {
            return this.f8611r - this.f8610q;
        }

        public int g(C.c.AbstractC0022c abstractC0022c) {
            int i10 = this.f8610q;
            int i11 = this.f8611r;
            if (i10 > i11) {
                return -1;
            }
            while (!kotlin.jvm.internal.n.d(C0975q.this.f8601q[i10], abstractC0022c)) {
                if (i10 == i11) {
                    return -1;
                }
                i10++;
            }
            return i10 - this.f8610q;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof C.c.AbstractC0022c) {
                return g((C.c.AbstractC0022c) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            C0975q c0975q = C0975q.this;
            int i10 = this.f8610q;
            return c0975q.new a(i10, i10, this.f8611r);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof C.c.AbstractC0022c) {
                return m((C.c.AbstractC0022c) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            C0975q c0975q = C0975q.this;
            int i10 = this.f8610q;
            return c0975q.new a(i10, i10, this.f8611r);
        }

        public int m(C.c.AbstractC0022c abstractC0022c) {
            int i10 = this.f8611r;
            int i11 = this.f8610q;
            if (i11 > i10) {
                return -1;
            }
            while (!kotlin.jvm.internal.n.d(C0975q.this.f8601q[i10], abstractC0022c)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f8610q;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return f();
        }

        @Override // java.util.List
        public void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            C0975q c0975q = C0975q.this;
            int i12 = this.f8610q;
            return c0975q.new b(i10 + i12, i12 + i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC1456g.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            C0975q c0975q = C0975q.this;
            int i11 = this.f8610q;
            return c0975q.new a(i10 + i11, i11, this.f8611r);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC1456g.b(this, objArr);
        }
    }

    private final void n() {
        int i10 = this.f8603s;
        Object[] objArr = this.f8601q;
        if (i10 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            kotlin.jvm.internal.n.g(objArrCopyOf, "copyOf(this, newSize)");
            this.f8601q = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.f8602r, length);
            kotlin.jvm.internal.n.g(jArrCopyOf, "copyOf(this, newSize)");
            this.f8602r = jArrCopyOf;
        }
    }

    private final long o() {
        long jA = r.a(Float.POSITIVE_INFINITY, false);
        int i10 = this.f8603s + 1;
        int iM = AbstractC1444s.m(this);
        if (i10 <= iM) {
            while (true) {
                long jB = AbstractC0971m.b(this.f8602r[i10]);
                if (AbstractC0971m.a(jB, jA) < 0) {
                    jA = jB;
                }
                if ((AbstractC0971m.c(jA) < 0.0f && AbstractC0971m.d(jA)) || i10 == iM) {
                    break;
                }
                i10++;
            }
        }
        return jA;
    }

    private final void y() {
        int i10 = this.f8603s + 1;
        int iM = AbstractC1444s.m(this);
        if (i10 <= iM) {
            while (true) {
                this.f8601q[i10] = null;
                if (i10 == iM) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f8604t = this.f8603s + 1;
    }

    public final void a() {
        this.f8603s = size() - 1;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f8603s = -1;
        y();
        this.f8605u = true;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C.c.AbstractC0022c) {
            return m((C.c.AbstractC0022c) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((C.c.AbstractC0022c) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C.c.AbstractC0022c) {
            return v((C.c.AbstractC0022c) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C.c.AbstractC0022c) {
            return x((C.c.AbstractC0022c) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    public boolean m(C.c.AbstractC0022c abstractC0022c) {
        return indexOf(abstractC0022c) != -1;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C.c.AbstractC0022c get(int i10) {
        Object obj = this.f8601q[i10];
        kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (C.c.AbstractC0022c) obj;
    }

    public final boolean q() {
        return this.f8605u;
    }

    public int r() {
        return this.f8604t;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean s() {
        long jO = o();
        return AbstractC0971m.c(jO) < 0.0f && AbstractC0971m.d(jO);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return r();
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        return new b(i10, i11);
    }

    public final void t(C.c.AbstractC0022c abstractC0022c, boolean z9, p219v8.a aVar) {
        u(abstractC0022c, -1.0f, z9, aVar);
        U uJ = abstractC0022c.J();
        if (uJ == null || uJ.V1()) {
            return;
        }
        this.f8605u = false;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC1456g.a(this);
    }

    public final void u(C.c.AbstractC0022c abstractC0022c, float f10, boolean z9, p219v8.a aVar) {
        int i10 = this.f8603s;
        this.f8603s = i10 + 1;
        n();
        Object[] objArr = this.f8601q;
        int i11 = this.f8603s;
        objArr[i11] = abstractC0022c;
        this.f8602r[i11] = r.a(f10, z9);
        y();
        aVar.invoke();
        this.f8603s = i10;
    }

    public int v(C.c.AbstractC0022c abstractC0022c) {
        int iM = AbstractC1444s.m(this);
        if (iM < 0) {
            return -1;
        }
        int i10 = 0;
        while (!kotlin.jvm.internal.n.d(this.f8601q[i10], abstractC0022c)) {
            if (i10 == iM) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    public final boolean w(float f10, boolean z9) {
        if (this.f8603s == AbstractC1444s.m(this)) {
            return true;
        }
        return AbstractC0971m.a(o(), r.a(f10, z9)) > 0;
    }

    public int x(C.c.AbstractC0022c abstractC0022c) {
        for (int iM = AbstractC1444s.m(this); -1 < iM; iM--) {
            if (kotlin.jvm.internal.n.d(this.f8601q[iM], abstractC0022c)) {
                return iM;
            }
        }
        return -1;
    }

    public final void z(C.c.AbstractC0022c abstractC0022c, float f10, boolean z9, p219v8.a aVar) {
        if (this.f8603s == AbstractC1444s.m(this)) {
            u(abstractC0022c, f10, z9, aVar);
            if (this.f8603s + 1 == AbstractC1444s.m(this)) {
                y();
                return;
            }
            return;
        }
        long jO = o();
        int i10 = this.f8603s;
        this.f8603s = AbstractC1444s.m(this);
        u(abstractC0022c, f10, z9, aVar);
        if (this.f8603s + 1 < AbstractC1444s.m(this) && AbstractC0971m.a(jO, o()) > 0) {
            int i11 = this.f8603s + 1;
            int i12 = i10 + 1;
            Object[] objArr = this.f8601q;
            AbstractC1439m.h(objArr, objArr, i12, i11, size());
            long[] jArr = this.f8602r;
            AbstractC1439m.g(jArr, jArr, i12, i11, size());
            this.f8603s = ((size() + i10) - this.f8603s) - 1;
        }
        y();
        this.f8603s = i10;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        return new a(this, i10, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC1456g.b(this, objArr);
    }

    /* JADX INFO: renamed from: W.q$a */
    private final class a implements ListIterator, p229w8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f8606q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f8607r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f8608s;

        public a(int i10, int i11, int i12) {
            this.f8606q = i10;
            this.f8607r = i11;
            this.f8608s = i12;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C.c.AbstractC0022c next() {
            Object[] objArr = C0975q.this.f8601q;
            int i10 = this.f8606q;
            this.f8606q = i10 + 1;
            Object obj = objArr[i10];
            kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (C.c.AbstractC0022c) obj;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C.c.AbstractC0022c previous() {
            Object[] objArr = C0975q.this.f8601q;
            int i10 = this.f8606q - 1;
            this.f8606q = i10;
            Object obj = objArr[i10];
            kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (C.c.AbstractC0022c) obj;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f8606q < this.f8608s;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f8606q > this.f8607r;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f8606q - this.f8607r;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f8606q - this.f8607r) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(C0975q c0975q, int i10, int i11, int i12, int i13, AbstractC1457h abstractC1457h) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? c0975q.size() : i12);
        }
    }
}

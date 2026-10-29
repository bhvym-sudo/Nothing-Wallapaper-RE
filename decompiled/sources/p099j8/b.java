package p099j8;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1429c;
import p089i8.AbstractC1433g;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractC1433g implements List, RandomAccess, Serializable, p229w8.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final C0564b f22538t = new C0564b(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final b f22539u;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Object[] f22540q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f22541r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f22542s;

    public static final class a extends AbstractC1433g implements List, RandomAccess, Serializable, p229w8.c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Object[] f22543q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f22544r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f22545s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final a f22546t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final b f22547u;

        /* JADX INFO: renamed from: j8.b$a$a, reason: collision with other inner class name */
        private static final class C0563a implements ListIterator, p229w8.a {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private final a f22548q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private int f22549r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private int f22550s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private int f22551t;

            public C0563a(a list, int i10) {
                n.h(list, "list");
                this.f22548q = list;
                this.f22549r = i10;
                this.f22550s = -1;
                this.f22551t = ((AbstractList) list).modCount;
            }

            private final void a() {
                if (((AbstractList) this.f22548q.f22547u).modCount != this.f22551t) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                a();
                a aVar = this.f22548q;
                int i10 = this.f22549r;
                this.f22549r = i10 + 1;
                aVar.add(i10, obj);
                this.f22550s = -1;
                this.f22551t = ((AbstractList) this.f22548q).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f22549r < this.f22548q.f22545s;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f22549r > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                a();
                if (this.f22549r >= this.f22548q.f22545s) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f22549r;
                this.f22549r = i10 + 1;
                this.f22550s = i10;
                return this.f22548q.f22543q[this.f22548q.f22544r + this.f22550s];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f22549r;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                a();
                int i10 = this.f22549r;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f22549r = i11;
                this.f22550s = i11;
                return this.f22548q.f22543q[this.f22548q.f22544r + this.f22550s];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f22549r - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a();
                int i10 = this.f22550s;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f22548q.remove(i10);
                this.f22549r = this.f22550s;
                this.f22550s = -1;
                this.f22551t = ((AbstractList) this.f22548q).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                a();
                int i10 = this.f22550s;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f22548q.set(i10, obj);
            }
        }

        public a(Object[] backing, int i10, int i11, a aVar, b root) {
            n.h(backing, "backing");
            n.h(root, "root");
            this.f22543q = backing;
            this.f22544r = i10;
            this.f22545s = i11;
            this.f22546t = aVar;
            this.f22547u = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void p(int i10, Collection collection, int i11) {
            v();
            a aVar = this.f22546t;
            if (aVar != null) {
                aVar.p(i10, collection, i11);
            } else {
                this.f22547u.t(i10, collection, i11);
            }
            this.f22543q = this.f22547u.f22540q;
            this.f22545s += i11;
        }

        private final void q(int i10, Object obj) {
            v();
            a aVar = this.f22546t;
            if (aVar != null) {
                aVar.q(i10, obj);
            } else {
                this.f22547u.u(i10, obj);
            }
            this.f22543q = this.f22547u.f22540q;
            this.f22545s++;
        }

        private final void r() {
            if (((AbstractList) this.f22547u).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void s() {
            if (u()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean t(List list) {
            return p099j8.c.h(this.f22543q, this.f22544r, this.f22545s, list);
        }

        private final boolean u() {
            return this.f22547u.f22542s;
        }

        private final void v() {
            ((AbstractList) this).modCount++;
        }

        private final Object w(int i10) {
            v();
            a aVar = this.f22546t;
            Object objW = aVar != null ? aVar.w(i10) : this.f22547u.C(i10);
            this.f22545s--;
            return objW;
        }

        private final void x(int i10, int i11) {
            if (i11 > 0) {
                v();
            }
            a aVar = this.f22546t;
            if (aVar != null) {
                aVar.x(i10, i11);
            } else {
                this.f22547u.D(i10, i11);
            }
            this.f22545s -= i11;
        }

        private final int y(int i10, int i11, Collection collection, boolean z9) {
            a aVar = this.f22546t;
            int iY = aVar != null ? aVar.y(i10, i11, collection, z9) : this.f22547u.E(i10, i11, collection, z9);
            if (iY > 0) {
                v();
            }
            this.f22545s -= iY;
            return iY;
        }

        @Override // p089i8.AbstractC1433g
        public int a() {
            r();
            return this.f22545s;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            s();
            r();
            q(this.f22544r + this.f22545s, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            n.h(elements, "elements");
            s();
            r();
            int size = elements.size();
            p(this.f22544r + this.f22545s, elements, size);
            return size > 0;
        }

        @Override // p089i8.AbstractC1433g
        public Object b(int i10) {
            s();
            r();
            AbstractC1429c.f22259q.b(i10, this.f22545s);
            return w(this.f22544r + i10);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            s();
            r();
            x(this.f22544r, this.f22545s);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            r();
            if (obj != this) {
                return (obj instanceof List) && t((List) obj);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            r();
            AbstractC1429c.f22259q.b(i10, this.f22545s);
            return this.f22543q[this.f22544r + i10];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            r();
            return p099j8.c.i(this.f22543q, this.f22544r, this.f22545s);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            r();
            for (int i10 = 0; i10 < this.f22545s; i10++) {
                if (n.d(this.f22543q[this.f22544r + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            r();
            return this.f22545s == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            r();
            for (int i10 = this.f22545s - 1; i10 >= 0; i10--) {
                if (n.d(this.f22543q[this.f22544r + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            s();
            r();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            n.h(elements, "elements");
            s();
            r();
            return y(this.f22544r, this.f22545s, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            n.h(elements, "elements");
            s();
            r();
            return y(this.f22544r, this.f22545s, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            s();
            r();
            AbstractC1429c.f22259q.b(i10, this.f22545s);
            Object[] objArr = this.f22543q;
            int i11 = this.f22544r;
            Object obj2 = objArr[i11 + i10];
            objArr[i11 + i10] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            AbstractC1429c.f22259q.d(i10, i11, this.f22545s);
            return new a(this.f22543q, this.f22544r + i10, i11 - i10, this, this.f22547u);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            n.h(array, "array");
            r();
            int length = array.length;
            int i10 = this.f22545s;
            if (length >= i10) {
                Object[] objArr = this.f22543q;
                int i11 = this.f22544r;
                AbstractC1439m.h(objArr, array, 0, i11, i10 + i11);
                return AbstractC1444s.g(this.f22545s, array);
            }
            Object[] objArr2 = this.f22543q;
            int i12 = this.f22544r;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i12, i10 + i12, array.getClass());
            n.g(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            r();
            return p099j8.c.j(this.f22543q, this.f22544r, this.f22545s, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            r();
            AbstractC1429c.f22259q.c(i10, this.f22545s);
            return new C0563a(this, i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, Object obj) {
            s();
            r();
            AbstractC1429c.f22259q.c(i10, this.f22545s);
            q(this.f22544r + i10, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection elements) {
            n.h(elements, "elements");
            s();
            r();
            AbstractC1429c.f22259q.c(i10, this.f22545s);
            int size = elements.size();
            p(this.f22544r + i10, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            r();
            Object[] objArr = this.f22543q;
            int i10 = this.f22544r;
            return AbstractC1439m.n(objArr, i10, this.f22545s + i10);
        }
    }

    /* JADX INFO: renamed from: j8.b$b, reason: collision with other inner class name */
    private static final class C0564b {
        public /* synthetic */ C0564b(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0564b() {
        }
    }

    private static final class c implements ListIterator, p229w8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final b f22552q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f22553r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f22554s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f22555t;

        public c(b list, int i10) {
            n.h(list, "list");
            this.f22552q = list;
            this.f22553r = i10;
            this.f22554s = -1;
            this.f22555t = ((AbstractList) list).modCount;
        }

        private final void a() {
            if (((AbstractList) this.f22552q).modCount != this.f22555t) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            a();
            b bVar = this.f22552q;
            int i10 = this.f22553r;
            this.f22553r = i10 + 1;
            bVar.add(i10, obj);
            this.f22554s = -1;
            this.f22555t = ((AbstractList) this.f22552q).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f22553r < this.f22552q.f22541r;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f22553r > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            a();
            if (this.f22553r >= this.f22552q.f22541r) {
                throw new NoSuchElementException();
            }
            int i10 = this.f22553r;
            this.f22553r = i10 + 1;
            this.f22554s = i10;
            return this.f22552q.f22540q[this.f22554s];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f22553r;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            a();
            int i10 = this.f22553r;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f22553r = i11;
            this.f22554s = i11;
            return this.f22552q.f22540q[this.f22554s];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f22553r - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i10 = this.f22554s;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f22552q.remove(i10);
            this.f22553r = this.f22554s;
            this.f22554s = -1;
            this.f22555t = ((AbstractList) this.f22552q).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            a();
            int i10 = this.f22554s;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f22552q.set(i10, obj);
        }
    }

    static {
        b bVar = new b(0);
        bVar.f22542s = true;
        f22539u = bVar;
    }

    public b(int i10) {
        this.f22540q = p099j8.c.d(i10);
    }

    private final void A(int i10, int i11) {
        z(i11);
        Object[] objArr = this.f22540q;
        AbstractC1439m.h(objArr, objArr, i10 + i11, i10, this.f22541r);
        this.f22541r += i11;
    }

    private final void B() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(int i10) {
        B();
        Object[] objArr = this.f22540q;
        Object obj = objArr[i10];
        AbstractC1439m.h(objArr, objArr, i10, i10 + 1, this.f22541r);
        p099j8.c.f(this.f22540q, this.f22541r - 1);
        this.f22541r--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int i10, int i11) {
        if (i11 > 0) {
            B();
        }
        Object[] objArr = this.f22540q;
        AbstractC1439m.h(objArr, objArr, i10, i10 + i11, this.f22541r);
        Object[] objArr2 = this.f22540q;
        int i12 = this.f22541r;
        p099j8.c.g(objArr2, i12 - i11, i12);
        this.f22541r -= i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int E(int i10, int i11, Collection collection, boolean z9) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f22540q[i14]) == z9) {
                Object[] objArr = this.f22540q;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f22540q;
        AbstractC1439m.h(objArr2, objArr2, i10 + i13, i11 + i10, this.f22541r);
        Object[] objArr3 = this.f22540q;
        int i16 = this.f22541r;
        p099j8.c.g(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            B();
        }
        this.f22541r -= i15;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(int i10, Collection collection, int i11) {
        B();
        A(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f22540q[i10 + i12] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(int i10, Object obj) {
        B();
        A(i10, 1);
        this.f22540q[i10] = obj;
    }

    private final void w() {
        if (this.f22542s) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean x(List list) {
        return p099j8.c.h(this.f22540q, 0, this.f22541r, list);
    }

    private final void y(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f22540q;
        if (i10 > objArr.length) {
            this.f22540q = p099j8.c.e(this.f22540q, AbstractC1429c.f22259q.e(objArr.length, i10));
        }
    }

    private final void z(int i10) {
        y(this.f22541r + i10);
    }

    @Override // p089i8.AbstractC1433g
    public int a() {
        return this.f22541r;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        w();
        u(this.f22541r, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        n.h(elements, "elements");
        w();
        int size = elements.size();
        t(this.f22541r, elements, size);
        return size > 0;
    }

    @Override // p089i8.AbstractC1433g
    public Object b(int i10) {
        w();
        AbstractC1429c.f22259q.b(i10, this.f22541r);
        return C(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        w();
        D(0, this.f22541r);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof List) && x((List) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC1429c.f22259q.b(i10, this.f22541r);
        return this.f22540q[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return p099j8.c.i(this.f22540q, 0, this.f22541r);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f22541r; i10++) {
            if (n.d(this.f22540q[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f22541r == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f22541r - 1; i10 >= 0; i10--) {
            if (n.d(this.f22540q[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        w();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        n.h(elements, "elements");
        w();
        return E(0, this.f22541r, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        n.h(elements, "elements");
        w();
        return E(0, this.f22541r, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        w();
        AbstractC1429c.f22259q.b(i10, this.f22541r);
        Object[] objArr = this.f22540q;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i10, int i11) {
        AbstractC1429c.f22259q.d(i10, i11, this.f22541r);
        return new a(this.f22540q, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        n.h(array, "array");
        int length = array.length;
        int i10 = this.f22541r;
        if (length >= i10) {
            AbstractC1439m.h(this.f22540q, array, 0, 0, i10);
            return AbstractC1444s.g(this.f22541r, array);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f22540q, 0, i10, array.getClass());
        n.g(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return p099j8.c.j(this.f22540q, 0, this.f22541r, this);
    }

    public final List v() {
        w();
        this.f22542s = true;
        return this.f22541r > 0 ? this : f22539u;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        AbstractC1429c.f22259q.c(i10, this.f22541r);
        return new c(this, i10);
    }

    public /* synthetic */ b(int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        w();
        AbstractC1429c.f22259q.c(i10, this.f22541r);
        u(i10, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        n.h(elements, "elements");
        w();
        AbstractC1429c.f22259q.c(i10, this.f22541r);
        int size = elements.size();
        t(i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC1439m.n(this.f22540q, 0, this.f22541r);
    }
}

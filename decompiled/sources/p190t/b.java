package p190t;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC1456g;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class b implements RandomAccess {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f27838t = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Object[] f27839q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f27840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f27841s;

    private static final class a implements List, p229w8.c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final b f27842q;

        public a(b bVar) {
            this.f27842q = bVar;
        }

        public int a() {
            return this.f27842q.p();
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.f27842q.b(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            return this.f27842q.e(i10, collection);
        }

        public Object b(int i10) {
            p190t.c.c(this, i10);
            return this.f27842q.w(i10);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f27842q.j();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f27842q.k(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.f27842q.m(collection);
        }

        @Override // java.util.List
        public Object get(int i10) {
            p190t.c.c(this, i10);
            return this.f27842q.o()[i10];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f27842q.q(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f27842q.r();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f27842q.t(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return b(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            return this.f27842q.v(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            return this.f27842q.y(collection);
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            p190t.c.c(this, i10);
            return this.f27842q.z(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            p190t.c.d(this, i10, i11);
            return new C0674b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC1456g.a(this);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f27842q.a(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            return this.f27842q.h(collection);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f27842q.u(obj);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC1456g.b(this, objArr);
        }
    }

    /* JADX INFO: renamed from: t.b$b, reason: collision with other inner class name */
    private static final class C0674b implements List, p229w8.c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final List f27843q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f27844r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f27845s;

        public C0674b(List list, int i10, int i11) {
            this.f27843q = list;
            this.f27844r = i10;
            this.f27845s = i11;
        }

        public int a() {
            return this.f27845s - this.f27844r;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            List list = this.f27843q;
            int i10 = this.f27845s;
            this.f27845s = i10 + 1;
            list.add(i10, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            this.f27843q.addAll(i10 + this.f27844r, collection);
            this.f27845s += collection.size();
            return collection.size() > 0;
        }

        public Object b(int i10) {
            p190t.c.c(this, i10);
            Object objRemove = this.f27843q.remove(i10 + this.f27844r);
            this.f27845s--;
            return objRemove;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f27845s - 1;
            int i11 = this.f27844r;
            if (i11 <= i10) {
                while (true) {
                    this.f27843q.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f27845s = this.f27844r;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f27845s;
            for (int i11 = this.f27844r; i11 < i10; i11++) {
                if (n.d(this.f27843q.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            p190t.c.c(this, i10);
            return this.f27843q.get(i10 + this.f27844r);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f27845s;
            for (int i11 = this.f27844r; i11 < i10; i11++) {
                if (n.d(this.f27843q.get(i11), obj)) {
                    return i11 - this.f27844r;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f27845s == this.f27844r;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f27845s - 1;
            int i11 = this.f27844r;
            if (i11 > i10) {
                return -1;
            }
            while (!n.d(this.f27843q.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f27844r;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return b(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            int i10 = this.f27845s;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f27845s;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            int i10 = this.f27845s;
            int i11 = i10 - 1;
            int i12 = this.f27844r;
            if (i12 <= i11) {
                while (true) {
                    if (!collection.contains(this.f27843q.get(i11))) {
                        this.f27843q.remove(i11);
                        this.f27845s--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f27845s;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            p190t.c.c(this, i10);
            return this.f27843q.set(i10 + this.f27844r, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            p190t.c.d(this, i10, i11);
            return new C0674b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC1456g.a(this);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f27843q.add(i10 + this.f27844r, obj);
            this.f27845s++;
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f27845s;
            for (int i11 = this.f27844r; i11 < i10; i11++) {
                if (n.d(this.f27843q.get(i11), obj)) {
                    this.f27843q.remove(i11);
                    this.f27845s--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC1456g.b(this, objArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            this.f27843q.addAll(this.f27845s, collection);
            this.f27845s += collection.size();
            return collection.size() > 0;
        }
    }

    private static final class c implements ListIterator, p229w8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final List f27846q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f27847r;

        public c(List list, int i10) {
            this.f27846q = list;
            this.f27847r = i10;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f27846q.add(this.f27847r, obj);
            this.f27847r++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f27847r < this.f27846q.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f27847r > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.f27846q;
            int i10 = this.f27847r;
            this.f27847r = i10 + 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f27847r;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i10 = this.f27847r - 1;
            this.f27847r = i10;
            return this.f27846q.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f27847r - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f27847r - 1;
            this.f27847r = i10;
            this.f27846q.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f27846q.set(this.f27847r, obj);
        }
    }

    public b(Object[] objArr, int i10) {
        this.f27839q = objArr;
        this.f27841s = i10;
    }

    public final void A(int i10) {
        this.f27841s = i10;
    }

    public final void B(Comparator comparator) {
        AbstractC1439m.z(this.f27839q, comparator, 0, this.f27841s);
    }

    public final void a(int i10, Object obj) {
        n(this.f27841s + 1);
        Object[] objArr = this.f27839q;
        int i11 = this.f27841s;
        if (i10 != i11) {
            AbstractC1439m.h(objArr, objArr, i10 + 1, i10, i11);
        }
        objArr[i10] = obj;
        this.f27841s++;
    }

    public final boolean b(Object obj) {
        n(this.f27841s + 1);
        Object[] objArr = this.f27839q;
        int i10 = this.f27841s;
        objArr[i10] = obj;
        this.f27841s = i10 + 1;
        return true;
    }

    public final boolean e(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        n(this.f27841s + collection.size());
        Object[] objArr = this.f27839q;
        if (i10 != this.f27841s) {
            AbstractC1439m.h(objArr, objArr, collection.size() + i10, i10, this.f27841s);
        }
        for (Object obj : collection) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC1444s.t();
            }
            objArr[i11 + i10] = obj;
            i11 = i12;
        }
        this.f27841s += collection.size();
        return true;
    }

    public final boolean f(int i10, List list) {
        if (list.isEmpty()) {
            return false;
        }
        n(this.f27841s + list.size());
        Object[] objArr = this.f27839q;
        if (i10 != this.f27841s) {
            AbstractC1439m.h(objArr, objArr, list.size() + i10, i10, this.f27841s);
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = list.get(i11);
        }
        this.f27841s += list.size();
        return true;
    }

    public final boolean g(int i10, b bVar) {
        if (bVar.r()) {
            return false;
        }
        n(this.f27841s + bVar.f27841s);
        Object[] objArr = this.f27839q;
        int i11 = this.f27841s;
        if (i10 != i11) {
            AbstractC1439m.h(objArr, objArr, bVar.f27841s + i10, i10, i11);
        }
        AbstractC1439m.h(bVar.f27839q, objArr, i10, 0, bVar.f27841s);
        this.f27841s += bVar.f27841s;
        return true;
    }

    public final boolean h(Collection collection) {
        return e(this.f27841s, collection);
    }

    public final List i() {
        List list = this.f27840r;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.f27840r = aVar;
        return aVar;
    }

    public final void j() {
        Object[] objArr = this.f27839q;
        int iP = p();
        while (true) {
            iP--;
            if (-1 >= iP) {
                this.f27841s = 0;
                return;
            }
            objArr[iP] = null;
        }
    }

    public final boolean k(Object obj) {
        int iP = p() - 1;
        if (iP >= 0) {
            for (int i10 = 0; !n.d(o()[i10], obj); i10++) {
                if (i10 != iP) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean m(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!k(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void n(int i10) {
        Object[] objArr = this.f27839q;
        if (objArr.length < i10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i10, objArr.length * 2));
            n.g(objArrCopyOf, "copyOf(this, newSize)");
            this.f27839q = objArrCopyOf;
        }
    }

    public final Object[] o() {
        return this.f27839q;
    }

    public final int p() {
        return this.f27841s;
    }

    public final int q(Object obj) {
        int i10 = this.f27841s;
        if (i10 <= 0) {
            return -1;
        }
        Object[] objArr = this.f27839q;
        int i11 = 0;
        while (!n.d(obj, objArr[i11])) {
            i11++;
            if (i11 >= i10) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean r() {
        return this.f27841s == 0;
    }

    public final boolean s() {
        return this.f27841s != 0;
    }

    public final int t(Object obj) {
        int i10 = this.f27841s;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f27839q;
        while (!n.d(obj, objArr[i11])) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean u(Object obj) {
        int iQ = q(obj);
        if (iQ < 0) {
            return false;
        }
        w(iQ);
        return true;
    }

    public final boolean v(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = this.f27841s;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            u(it.next());
        }
        return i10 != this.f27841s;
    }

    public final Object w(int i10) {
        Object[] objArr = this.f27839q;
        Object obj = objArr[i10];
        if (i10 != p() - 1) {
            AbstractC1439m.h(objArr, objArr, i10, i10 + 1, this.f27841s);
        }
        int i11 = this.f27841s - 1;
        this.f27841s = i11;
        objArr[i11] = null;
        return obj;
    }

    public final void x(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f27841s;
            if (i11 < i12) {
                Object[] objArr = this.f27839q;
                AbstractC1439m.h(objArr, objArr, i10, i11, i12);
            }
            int i13 = this.f27841s - (i11 - i10);
            int iP = p() - 1;
            if (i13 <= iP) {
                int i14 = i13;
                while (true) {
                    this.f27839q[i14] = null;
                    if (i14 == iP) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f27841s = i13;
        }
    }

    public final boolean y(Collection collection) {
        int i10 = this.f27841s;
        for (int iP = p() - 1; -1 < iP; iP--) {
            if (!collection.contains(o()[iP])) {
                w(iP);
            }
        }
        return i10 != this.f27841s;
    }

    public final Object z(int i10, Object obj) {
        Object[] objArr = this.f27839q;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }
}

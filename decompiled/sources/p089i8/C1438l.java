package p089i8;

import B8.h;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: i8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1438l extends AbstractC1433g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f22271t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Object[] f22272u = new Object[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f22273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Object[] f22274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f22275s;

    /* JADX INFO: renamed from: i8.l$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public C1438l(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f22272u;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i10);
            }
            objArr = new Object[i10];
        }
        this.f22274r = objArr;
    }

    private final void f(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f22274r.length;
        while (i10 < length && it.hasNext()) {
            this.f22274r[i10] = it.next();
            i10++;
        }
        int i11 = this.f22273q;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f22274r[i12] = it.next();
        }
        this.f22275s = size() + collection.size();
    }

    private final void g(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f22274r;
        AbstractC1442p.h(objArr2, objArr, 0, this.f22273q, objArr2.length);
        Object[] objArr3 = this.f22274r;
        int length = objArr3.length;
        int i11 = this.f22273q;
        AbstractC1442p.h(objArr3, objArr, length - i11, 0, i11);
        this.f22273q = 0;
        this.f22274r = objArr;
    }

    private final int m(int i10) {
        return i10 == 0 ? AbstractC1443q.H(this.f22274r) : i10 - 1;
    }

    private final void n(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f22274r;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f22272u) {
            this.f22274r = new Object[h.f(i10, 10)];
        } else {
            g(AbstractC1429c.f22259q.e(objArr.length, i10));
        }
    }

    private final int o(int i10) {
        if (i10 == AbstractC1443q.H(this.f22274r)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int p(int i10) {
        return i10 < 0 ? i10 + this.f22274r.length : i10;
    }

    private final void q(int i10, int i11) {
        if (i10 < i11) {
            AbstractC1442p.q(this.f22274r, null, i10, i11);
            return;
        }
        Object[] objArr = this.f22274r;
        AbstractC1442p.q(objArr, null, i10, objArr.length);
        AbstractC1442p.q(this.f22274r, null, 0, i11);
    }

    private final int r(int i10) {
        Object[] objArr = this.f22274r;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    private final void s() {
        ((AbstractList) this).modCount++;
    }

    private final void u(int i10, int i11) {
        int iR = r(this.f22273q + (i10 - 1));
        int iR2 = r(this.f22273q + (i11 - 1));
        while (i10 > 0) {
            int i12 = iR + 1;
            int iMin = Math.min(i10, Math.min(i12, iR2 + 1));
            Object[] objArr = this.f22274r;
            int i13 = iR2 - iMin;
            int i14 = iR - iMin;
            AbstractC1442p.h(objArr, objArr, i13 + 1, i14 + 1, i12);
            iR = p(i14);
            iR2 = p(i13);
            i10 -= iMin;
        }
    }

    private final void v(int i10, int i11) {
        int iR = r(this.f22273q + i11);
        int iR2 = r(this.f22273q + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f22274r;
            i11 = Math.min(size, Math.min(objArr.length - iR, objArr.length - iR2));
            Object[] objArr2 = this.f22274r;
            int i12 = iR + i11;
            AbstractC1442p.h(objArr2, objArr2, iR2, iR, i12);
            iR = r(i12);
            iR2 = r(iR2 + i11);
        }
    }

    @Override // p089i8.AbstractC1433g
    public int a() {
        return this.f22275s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        n.h(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        s();
        n(size() + elements.size());
        f(r(this.f22273q + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        s();
        n(size() + 1);
        int iM = m(this.f22273q);
        this.f22273q = iM;
        this.f22274r[iM] = obj;
        this.f22275s = size() + 1;
    }

    public final void addLast(Object obj) {
        s();
        n(size() + 1);
        this.f22274r[r(this.f22273q + size())] = obj;
        this.f22275s = size() + 1;
    }

    @Override // p089i8.AbstractC1433g
    public Object b(int i10) {
        AbstractC1429c.f22259q.b(i10, size());
        if (i10 == AbstractC1446u.m(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        s();
        int iR = r(this.f22273q + i10);
        Object obj = this.f22274r[iR];
        if (i10 < (size() >> 1)) {
            int i11 = this.f22273q;
            if (iR >= i11) {
                Object[] objArr = this.f22274r;
                AbstractC1442p.h(objArr, objArr, i11 + 1, i11, iR);
            } else {
                Object[] objArr2 = this.f22274r;
                AbstractC1442p.h(objArr2, objArr2, 1, 0, iR);
                Object[] objArr3 = this.f22274r;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f22273q;
                AbstractC1442p.h(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f22274r;
            int i13 = this.f22273q;
            objArr4[i13] = null;
            this.f22273q = o(i13);
        } else {
            int iR2 = r(this.f22273q + AbstractC1446u.m(this));
            if (iR <= iR2) {
                Object[] objArr5 = this.f22274r;
                AbstractC1442p.h(objArr5, objArr5, iR, iR + 1, iR2 + 1);
            } else {
                Object[] objArr6 = this.f22274r;
                AbstractC1442p.h(objArr6, objArr6, iR, iR + 1, objArr6.length);
                Object[] objArr7 = this.f22274r;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC1442p.h(objArr7, objArr7, 0, 1, iR2 + 1);
            }
            this.f22274r[iR2] = null;
        }
        this.f22275s = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            s();
            q(this.f22273q, r(this.f22273q + size()));
        }
        this.f22273q = 0;
        this.f22275s = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC1429c.f22259q.b(i10, size());
        return this.f22274r[r(this.f22273q + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iR = r(this.f22273q + size());
        int length = this.f22273q;
        if (length < iR) {
            while (length < iR) {
                if (n.d(obj, this.f22274r[length])) {
                    i10 = this.f22273q;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iR) {
            return -1;
        }
        int length2 = this.f22274r.length;
        while (length < length2) {
            if (n.d(obj, this.f22274r[length])) {
                i10 = this.f22273q;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iR; i11++) {
            if (n.d(obj, this.f22274r[i11])) {
                length = i11 + this.f22274r.length;
                i10 = this.f22273q;
            }
        }
        return -1;
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iH;
        int i10;
        int iR = r(this.f22273q + size());
        int i11 = this.f22273q;
        if (i11 < iR) {
            iH = iR - 1;
            if (i11 <= iH) {
                while (!n.d(obj, this.f22274r[iH])) {
                    if (iH != i11) {
                        iH--;
                    }
                }
                i10 = this.f22273q;
                return iH - i10;
            }
            return -1;
        }
        if (i11 > iR) {
            for (int i12 = iR - 1; -1 < i12; i12--) {
                if (n.d(obj, this.f22274r[i12])) {
                    iH = i12 + this.f22274r.length;
                    i10 = this.f22273q;
                    return iH - i10;
                }
            }
            iH = AbstractC1443q.H(this.f22274r);
            int i13 = this.f22273q;
            if (i13 <= iH) {
                while (!n.d(obj, this.f22274r[iH])) {
                    if (iH != i13) {
                        iH--;
                    }
                }
                i10 = this.f22273q;
                return iH - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int iR;
        n.h(elements, "elements");
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.f22274r.length != 0) {
            int iR2 = r(this.f22273q + size());
            int i10 = this.f22273q;
            if (i10 < iR2) {
                iR = i10;
                while (i10 < iR2) {
                    Object obj = this.f22274r[i10];
                    if (elements.contains(obj)) {
                        z9 = true;
                    } else {
                        this.f22274r[iR] = obj;
                        iR++;
                    }
                    i10++;
                }
                AbstractC1442p.q(this.f22274r, null, iR, iR2);
            } else {
                int length = this.f22274r.length;
                boolean z10 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f22274r;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.f22274r[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iR = r(i11);
                for (int i12 = 0; i12 < iR2; i12++) {
                    Object[] objArr2 = this.f22274r;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.f22274r[iR] = obj3;
                        iR = o(iR);
                    }
                }
                z9 = z10;
            }
            if (z9) {
                s();
                this.f22275s = p(iR - this.f22273q);
            }
        }
        return z9;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        s();
        Object[] objArr = this.f22274r;
        int i10 = this.f22273q;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f22273q = o(i10);
        this.f22275s = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        s();
        int iR = r(this.f22273q + AbstractC1446u.m(this));
        Object[] objArr = this.f22274r;
        Object obj = objArr[iR];
        objArr[iR] = null;
        this.f22275s = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        AbstractC1429c.f22259q.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            remove(i10);
            return;
        }
        s();
        if (i10 < size() - i11) {
            u(i10, i11);
            int iR = r(this.f22273q + i12);
            q(this.f22273q, iR);
            this.f22273q = iR;
        } else {
            v(i10, i11);
            int iR2 = r(this.f22273q + size());
            q(p(iR2 - i12), iR2);
        }
        this.f22275s = size() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int iR;
        n.h(elements, "elements");
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.f22274r.length != 0) {
            int iR2 = r(this.f22273q + size());
            int i10 = this.f22273q;
            if (i10 < iR2) {
                iR = i10;
                while (i10 < iR2) {
                    Object obj = this.f22274r[i10];
                    if (elements.contains(obj)) {
                        this.f22274r[iR] = obj;
                        iR++;
                    } else {
                        z9 = true;
                    }
                    i10++;
                }
                AbstractC1442p.q(this.f22274r, null, iR, iR2);
            } else {
                int length = this.f22274r.length;
                boolean z10 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f22274r;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f22274r[i11] = obj2;
                        i11++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                iR = r(i11);
                for (int i12 = 0; i12 < iR2; i12++) {
                    Object[] objArr2 = this.f22274r;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f22274r[iR] = obj3;
                        iR = o(iR);
                    } else {
                        z10 = true;
                    }
                }
                z9 = z10;
            }
            if (z9) {
                s();
                this.f22275s = p(iR - this.f22273q);
            }
        }
        return z9;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        AbstractC1429c.f22259q.b(i10, size());
        int iR = r(this.f22273q + i10);
        Object[] objArr = this.f22274r;
        Object obj2 = objArr[iR];
        objArr[iR] = obj;
        return obj2;
    }

    public final Object t() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        n.h(array, "array");
        if (array.length < size()) {
            array = AbstractC1440n.a(array, size());
        }
        Object[] objArr = array;
        int iR = r(this.f22273q + size());
        int i10 = this.f22273q;
        if (i10 < iR) {
            AbstractC1442p.l(this.f22274r, objArr, 0, i10, iR, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f22274r;
            AbstractC1442p.h(objArr2, objArr, 0, this.f22273q, objArr2.length);
            Object[] objArr3 = this.f22274r;
            AbstractC1442p.h(objArr3, objArr, objArr3.length - this.f22273q, 0, iR);
        }
        return AbstractC1445t.g(size(), objArr);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        AbstractC1429c.f22259q.c(i10, size());
        if (i10 == size()) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        s();
        n(size() + 1);
        int iR = r(this.f22273q + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iM = m(iR);
            int iM2 = m(this.f22273q);
            int i11 = this.f22273q;
            if (iM >= i11) {
                Object[] objArr = this.f22274r;
                objArr[iM2] = objArr[i11];
                AbstractC1442p.h(objArr, objArr, i11, i11 + 1, iM + 1);
            } else {
                Object[] objArr2 = this.f22274r;
                AbstractC1442p.h(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f22274r;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC1442p.h(objArr3, objArr3, 0, 1, iM + 1);
            }
            this.f22274r[iM] = obj;
            this.f22273q = iM2;
        } else {
            int iR2 = r(this.f22273q + size());
            if (iR < iR2) {
                Object[] objArr4 = this.f22274r;
                AbstractC1442p.h(objArr4, objArr4, iR + 1, iR, iR2);
            } else {
                Object[] objArr5 = this.f22274r;
                AbstractC1442p.h(objArr5, objArr5, 1, 0, iR2);
                Object[] objArr6 = this.f22274r;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC1442p.h(objArr6, objArr6, iR + 1, iR, objArr6.length - 1);
            }
            this.f22274r[iR] = obj;
        }
        this.f22275s = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        n.h(elements, "elements");
        AbstractC1429c.f22259q.c(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        s();
        n(size() + elements.size());
        int iR = r(this.f22273q + size());
        int iR2 = r(this.f22273q + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f22273q;
            int length = i11 - size;
            if (iR2 < i11) {
                Object[] objArr = this.f22274r;
                AbstractC1442p.h(objArr, objArr, length, i11, objArr.length);
                if (size >= iR2) {
                    Object[] objArr2 = this.f22274r;
                    AbstractC1442p.h(objArr2, objArr2, objArr2.length - size, 0, iR2);
                } else {
                    Object[] objArr3 = this.f22274r;
                    AbstractC1442p.h(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f22274r;
                    AbstractC1442p.h(objArr4, objArr4, 0, size, iR2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f22274r;
                AbstractC1442p.h(objArr5, objArr5, length, i11, iR2);
            } else {
                Object[] objArr6 = this.f22274r;
                length += objArr6.length;
                int i12 = iR2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    AbstractC1442p.h(objArr6, objArr6, length, i11, iR2);
                } else {
                    AbstractC1442p.h(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f22274r;
                    AbstractC1442p.h(objArr7, objArr7, 0, this.f22273q + length2, iR2);
                }
            }
            this.f22273q = length;
            f(p(iR2 - size), elements);
        } else {
            int i13 = iR2 + size;
            if (iR2 < iR) {
                int i14 = size + iR;
                Object[] objArr8 = this.f22274r;
                if (i14 <= objArr8.length) {
                    AbstractC1442p.h(objArr8, objArr8, i13, iR2, iR);
                } else if (i13 >= objArr8.length) {
                    AbstractC1442p.h(objArr8, objArr8, i13 - objArr8.length, iR2, iR);
                } else {
                    int length3 = iR - (i14 - objArr8.length);
                    AbstractC1442p.h(objArr8, objArr8, 0, length3, iR);
                    Object[] objArr9 = this.f22274r;
                    AbstractC1442p.h(objArr9, objArr9, i13, iR2, length3);
                }
            } else {
                Object[] objArr10 = this.f22274r;
                AbstractC1442p.h(objArr10, objArr10, size, 0, iR);
                Object[] objArr11 = this.f22274r;
                if (i13 >= objArr11.length) {
                    AbstractC1442p.h(objArr11, objArr11, i13 - objArr11.length, iR2, objArr11.length);
                } else {
                    AbstractC1442p.h(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f22274r;
                    AbstractC1442p.h(objArr12, objArr12, i13, iR2, objArr12.length - size);
                }
            }
            f(iR2, elements);
        }
        return true;
    }

    public C1438l() {
        this.f22274r = f22272u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}

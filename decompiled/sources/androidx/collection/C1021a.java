package androidx.collection;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: androidx.collection.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1021a extends P implements Map {
    androidx.collection.a.a mEntrySet;
    androidx.collection.a.c mKeySet;
    androidx.collection.a.e mValues;

    /* JADX INFO: renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    final class C0367a extends AbstractSet {
        C0367a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C1021a.this.new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C1021a.this.size();
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$b */
    final class b extends AbstractC1027g {
        b() {
            super(C1021a.this.size());
        }

        @Override // androidx.collection.AbstractC1027g
        protected Object a(int i10) {
            return C1021a.this.keyAt(i10);
        }

        @Override // androidx.collection.AbstractC1027g
        protected void c(int i10) {
            C1021a.this.removeAt(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$d */
    final class d implements Iterator, Map.Entry {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f11303q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f11304r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f11305s;

        d() {
            this.f11303q = C1021a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f11304r++;
            this.f11305s = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f11305s) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return p150p.a.c(entry.getKey(), C1021a.this.keyAt(this.f11304r)) && p150p.a.c(entry.getValue(), C1021a.this.valueAt(this.f11304r));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f11305s) {
                return C1021a.this.keyAt(this.f11304r);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f11305s) {
                return C1021a.this.valueAt(this.f11304r);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11304r < this.f11303q;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f11305s) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objKeyAt = C1021a.this.keyAt(this.f11304r);
            Object objValueAt = C1021a.this.valueAt(this.f11304r);
            return (objKeyAt == null ? 0 : objKeyAt.hashCode()) ^ (objValueAt != null ? objValueAt.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f11305s) {
                throw new IllegalStateException();
            }
            C1021a.this.removeAt(this.f11304r);
            this.f11304r--;
            this.f11303q--;
            this.f11305s = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f11305s) {
                return C1021a.this.setValueAt(this.f11304r, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$f */
    final class f extends AbstractC1027g {
        f() {
            super(C1021a.this.size());
        }

        @Override // androidx.collection.AbstractC1027g
        protected Object a(int i10) {
            return C1021a.this.valueAt(i10);
        }

        @Override // androidx.collection.AbstractC1027g
        protected void c(int i10) {
            C1021a.this.removeAt(i10);
        }
    }

    public C1021a() {
    }

    static <T> boolean equalsSetHelper(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.collection.P, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // androidx.collection.P, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        androidx.collection.a.a aVar = this.mEntrySet;
        if (aVar != null) {
            return aVar;
        }
        C0367a c0367a = new C0367a();
        this.mEntrySet = c0367a;
        return c0367a;
    }

    @Override // androidx.collection.P, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public Set<Object> keySet() {
        androidx.collection.a.c cVar = this.mKeySet;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.mKeySet = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        ensureCapacity(size() + map.size());
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.collection.P, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        int size = size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    public boolean retainAll(Collection<?> collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(keyAt(size2))) {
                removeAt(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        androidx.collection.a.e eVar = this.mValues;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.mValues = eVar2;
        return eVar2;
    }

    public C1021a(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: androidx.collection.a$c */
    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C1021a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C1021a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return C1021a.this.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C1021a.equalsSetHelper(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = C1021a.this.size() - 1; size >= 0; size--) {
                Object objKeyAt = C1021a.this.keyAt(size);
                iHashCode += objKeyAt == null ? 0 : objKeyAt.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C1021a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C1021a.this.new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iIndexOfKey = C1021a.this.indexOfKey(obj);
            if (iIndexOfKey < 0) {
                return false;
            }
            C1021a.this.removeAt(iIndexOfKey);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return C1021a.this.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return C1021a.this.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C1021a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = C1021a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C1021a.this.keyAt(i10);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C1021a.this.keyAt(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$e */
    final class e implements Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C1021a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C1021a.this.__restricted$indexOfValue(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C1021a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C1021a.this.new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int i__restricted$indexOfValue = C1021a.this.__restricted$indexOfValue(obj);
            if (i__restricted$indexOfValue < 0) {
                return false;
            }
            C1021a.this.removeAt(i__restricted$indexOfValue);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = C1021a.this.size();
            int i10 = 0;
            boolean z9 = false;
            while (i10 < size) {
                if (collection.contains(C1021a.this.valueAt(i10))) {
                    C1021a.this.removeAt(i10);
                    i10--;
                    size--;
                    z9 = true;
                }
                i10++;
            }
            return z9;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = C1021a.this.size();
            int i10 = 0;
            boolean z9 = false;
            while (i10 < size) {
                if (!collection.contains(C1021a.this.valueAt(i10))) {
                    C1021a.this.removeAt(i10);
                    i10--;
                    size--;
                    z9 = true;
                }
                i10++;
            }
            return z9;
        }

        @Override // java.util.Collection
        public int size() {
            return C1021a.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = C1021a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C1021a.this.valueAt(i10);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C1021a.this.valueAt(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public C1021a(P p9) {
        super(p9);
    }
}

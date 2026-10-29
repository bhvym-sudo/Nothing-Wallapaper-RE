package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
abstract class i0 extends AbstractMap {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f12501q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map f12502r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f12503s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile f f12504t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Map f12505u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile c f12506v;

    class a extends i0 {
        a() {
            super(null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.t((Comparable) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public void r() {
            if (!q()) {
                if (m() > 0) {
                    androidx.appcompat.app.o.a(l(0).getKey());
                    throw null;
                }
                Iterator it = o().iterator();
                if (it.hasNext()) {
                    androidx.appcompat.app.o.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.r();
        }
    }

    private class c extends f {
        private c() {
            super(i0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(i0.this, null);
        }

        /* synthetic */ c(i0 i0Var, a aVar) {
            this();
        }
    }

    private class d implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Comparable f12511q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Object f12512r;

        d(i0 i0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean e(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e(this.f12511q, entry.getKey()) && e(this.f12512r, entry.getValue());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f12511q;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f12512r;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f12511q;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f12512r;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            i0.this.h();
            Object obj2 = this.f12512r;
            this.f12512r = obj;
            return obj2;
        }

        public String toString() {
            return this.f12511q + "=" + this.f12512r;
        }

        d(Comparable comparable, Object obj) {
            this.f12511q = comparable;
            this.f12512r = obj;
        }
    }

    private class f extends AbstractSet {
        private f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            i0.this.t((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new e(i0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            i0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i0.this.size();
        }

        /* synthetic */ f(i0 i0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ i0(a aVar) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    private int g(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f12501q.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((d) this.f12501q.get(i12)).getKey());
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((d) this.f12501q.get(i13)).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((d) this.f12501q.get(i12)).getKey());
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f12503s) {
            throw new UnsupportedOperationException();
        }
    }

    private void k() {
        h();
        if (!this.f12501q.isEmpty() || (this.f12501q instanceof ArrayList)) {
            return;
        }
        this.f12501q = new ArrayList(16);
    }

    private SortedMap p() {
        h();
        if (this.f12502r.isEmpty() && !(this.f12502r instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f12502r = treeMap;
            this.f12505u = treeMap.descendingMap();
        }
        return (SortedMap) this.f12502r;
    }

    static i0 s() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object u(int i10) {
        h();
        Object value = ((d) this.f12501q.remove(i10)).getValue();
        if (!this.f12502r.isEmpty()) {
            Iterator it = p().entrySet().iterator();
            this.f12501q.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f12501q.isEmpty()) {
            this.f12501q.clear();
        }
        if (this.f12502r.isEmpty()) {
            return;
        }
        this.f12502r.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f12502r.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f12504t == null) {
            this.f12504t = new f(this, null);
        }
        return this.f12504t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        int size = size();
        if (size != i0Var.size()) {
            return false;
        }
        int iM = m();
        if (iM != i0Var.m()) {
            return entrySet().equals(i0Var.entrySet());
        }
        for (int i10 = 0; i10 < iM; i10++) {
            if (!l(i10).equals(i0Var.l(i10))) {
                return false;
            }
        }
        if (iM != size) {
            return this.f12502r.equals(i0Var.f12502r);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? ((d) this.f12501q.get(iG)).getValue() : this.f12502r.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM = m();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iM; i10++) {
            iHashCode += ((d) this.f12501q.get(i10)).hashCode();
        }
        return n() > 0 ? iHashCode + this.f12502r.hashCode() : iHashCode;
    }

    Set i() {
        if (this.f12506v == null) {
            this.f12506v = new c(this, null);
        }
        return this.f12506v;
    }

    public Map.Entry l(int i10) {
        return (Map.Entry) this.f12501q.get(i10);
    }

    public int m() {
        return this.f12501q.size();
    }

    public int n() {
        return this.f12502r.size();
    }

    public Iterable o() {
        return this.f12502r.isEmpty() ? Collections.EMPTY_SET : this.f12502r.entrySet();
    }

    public boolean q() {
        return this.f12503s;
    }

    public void r() {
        if (this.f12503s) {
            return;
        }
        this.f12502r = this.f12502r.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f12502r);
        this.f12505u = this.f12505u.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f12505u);
        this.f12503s = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return u(iG);
        }
        if (this.f12502r.isEmpty()) {
            return null;
        }
        return this.f12502r.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f12501q.size() + this.f12502r.size();
    }

    public Object t(Comparable comparable, Object obj) {
        h();
        int iG = g(comparable);
        if (iG >= 0) {
            return ((d) this.f12501q.get(iG)).setValue(obj);
        }
        k();
        int i10 = -(iG + 1);
        if (i10 >= 16) {
            return p().put(comparable, obj);
        }
        if (this.f12501q.size() == 16) {
            d dVar = (d) this.f12501q.remove(15);
            p().put(dVar.getKey(), dVar.getValue());
        }
        this.f12501q.add(i10, new d(comparable, obj));
        return null;
    }

    private class b implements Iterator {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f12507q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Iterator f12508r;

        private b() {
            this.f12507q = i0.this.f12501q.size();
        }

        private Iterator a() {
            if (this.f12508r == null) {
                this.f12508r = i0.this.f12505u.entrySet().iterator();
            }
            return this.f12508r;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = i0.this.f12501q;
            int i10 = this.f12507q - 1;
            this.f12507q = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f12507q;
            return (i10 > 0 && i10 <= i0.this.f12501q.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(i0 i0Var, a aVar) {
            this();
        }
    }

    private class e implements Iterator {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f12514q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f12515r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Iterator f12516s;

        private e() {
            this.f12514q = -1;
        }

        private Iterator a() {
            if (this.f12516s == null) {
                this.f12516s = i0.this.f12502r.entrySet().iterator();
            }
            return this.f12516s;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f12515r = true;
            int i10 = this.f12514q + 1;
            this.f12514q = i10;
            return i10 < i0.this.f12501q.size() ? (Map.Entry) i0.this.f12501q.get(this.f12514q) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12514q + 1 < i0.this.f12501q.size() || (!i0.this.f12502r.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f12515r) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f12515r = false;
            i0.this.h();
            if (this.f12514q >= i0.this.f12501q.size()) {
                a().remove();
                return;
            }
            i0 i0Var = i0.this;
            int i10 = this.f12514q;
            this.f12514q = i10 - 1;
            i0Var.u(i10);
        }

        /* synthetic */ e(i0 i0Var, a aVar) {
            this();
        }
    }

    private i0() {
        this.f12501q = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f12502r = map;
        this.f12505u = map;
    }
}

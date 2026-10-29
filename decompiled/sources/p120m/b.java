package p120m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b implements Iterable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    c f23075q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private c f23076r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final WeakHashMap f23077s = new WeakHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f23078t = 0;

    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        c c(c cVar) {
            return cVar.f23082t;
        }

        @Override // m.b.e
        c d(c cVar) {
            return cVar.f23081s;
        }
    }

    /* JADX INFO: renamed from: m.b$b, reason: collision with other inner class name */
    private static class C0592b extends e {
        C0592b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        c c(c cVar) {
            return cVar.f23081s;
        }

        @Override // m.b.e
        c d(c cVar) {
            return cVar.f23082t;
        }
    }

    static class c implements Map.Entry {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final Object f23079q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final Object f23080r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        c f23081s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        c f23082t;

        c(Object obj, Object obj2) {
            this.f23079q = obj;
            this.f23080r = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f23079q.equals(cVar.f23079q) && this.f23080r.equals(cVar.f23080r);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f23079q;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f23080r;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f23080r.hashCode() ^ this.f23079q.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f23079q + "=" + this.f23080r;
        }
    }

    public class d extends f implements Iterator {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private c f23083q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f23084r = true;

        d() {
        }

        @Override // m.b.f
        void a(c cVar) {
            c cVar2 = this.f23083q;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f23082t;
                this.f23083q = cVar3;
                this.f23084r = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f23084r) {
                this.f23084r = false;
                this.f23083q = b.this.f23075q;
            } else {
                c cVar = this.f23083q;
                this.f23083q = cVar != null ? cVar.f23081s : null;
            }
            return this.f23083q;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f23084r) {
                return b.this.f23075q != null;
            }
            c cVar = this.f23083q;
            return (cVar == null || cVar.f23081s == null) ? false : true;
        }
    }

    private static abstract class e extends f implements Iterator {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        c f23086q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        c f23087r;

        e(c cVar, c cVar2) {
            this.f23086q = cVar2;
            this.f23087r = cVar;
        }

        private c f() {
            c cVar = this.f23087r;
            c cVar2 = this.f23086q;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // m.b.f
        public void a(c cVar) {
            if (this.f23086q == cVar && cVar == this.f23087r) {
                this.f23087r = null;
                this.f23086q = null;
            }
            c cVar2 = this.f23086q;
            if (cVar2 == cVar) {
                this.f23086q = c(cVar2);
            }
            if (this.f23087r == cVar) {
                this.f23087r = f();
            }
        }

        abstract c c(c cVar);

        abstract c d(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f23087r;
            this.f23087r = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23087r != null;
        }
    }

    public static abstract class f {
        abstract void a(c cVar);
    }

    public Map.Entry a() {
        return this.f23075q;
    }

    protected c b(Object obj) {
        c cVar = this.f23075q;
        while (cVar != null && !cVar.f23079q.equals(obj)) {
            cVar = cVar.f23081s;
        }
        return cVar;
    }

    public Iterator descendingIterator() {
        C0592b c0592b = new C0592b(this.f23076r, this.f23075q);
        this.f23077s.put(c0592b, Boolean.FALSE);
        return c0592b;
    }

    public d e() {
        d dVar = new d();
        this.f23077s.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Map.Entry f() {
        return this.f23076r;
    }

    c g(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f23078t++;
        c cVar2 = this.f23076r;
        if (cVar2 == null) {
            this.f23075q = cVar;
            this.f23076r = cVar;
            return cVar;
        }
        cVar2.f23081s = cVar;
        cVar.f23082t = cVar2;
        this.f23076r = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f23075q, this.f23076r);
        this.f23077s.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Object j(Object obj, Object obj2) {
        c cVarB = b(obj);
        if (cVarB != null) {
            return cVarB.f23080r;
        }
        g(obj, obj2);
        return null;
    }

    public Object m(Object obj) {
        c cVarB = b(obj);
        if (cVarB == null) {
            return null;
        }
        this.f23078t--;
        if (!this.f23077s.isEmpty()) {
            Iterator it = this.f23077s.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(cVarB);
            }
        }
        c cVar = cVarB.f23082t;
        if (cVar != null) {
            cVar.f23081s = cVarB.f23081s;
        } else {
            this.f23075q = cVarB.f23081s;
        }
        c cVar2 = cVarB.f23081s;
        if (cVar2 != null) {
            cVar2.f23082t = cVar;
        } else {
            this.f23076r = cVar;
        }
        cVarB.f23081s = null;
        cVarB.f23082t = null;
        return cVarB.f23080r;
    }

    public int size() {
        return this.f23078t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

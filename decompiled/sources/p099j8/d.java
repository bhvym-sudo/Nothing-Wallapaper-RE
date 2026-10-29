package p099j8;

import B8.h;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1429c;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Map, Serializable, p229w8.d {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final a f22556D = new a(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final d f22557E;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private g f22558A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private p099j8.e f22559B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f22560C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Object[] f22561q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Object[] f22562r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int[] f22563s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int[] f22564t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f22565u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f22566v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f22567w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f22568x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f22569y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p099j8.f f22570z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i10) {
            return Integer.highestOneBit(h.f(i10, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final d e() {
            return d.f22557E;
        }

        private a() {
        }
    }

    public static final class b extends C0565d implements Iterator, p229w8.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d map) {
            super(map);
            n.h(map, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public c next() {
            a();
            if (c() >= f().f22566v) {
                throw new NoSuchElementException();
            }
            int iC = c();
            h(iC + 1);
            i(iC);
            c cVar = new c(f(), d());
            g();
            return cVar;
        }

        public final void l(StringBuilder sb) {
            n.h(sb, "sb");
            if (c() >= f().f22566v) {
                throw new NoSuchElementException();
            }
            int iC = c();
            h(iC + 1);
            i(iC);
            Object obj = f().f22561q[d()];
            if (obj == f()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = f().f22562r;
            n.e(objArr);
            Object obj2 = objArr[d()];
            if (obj2 == f()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            g();
        }

        public final int m() {
            if (c() >= f().f22566v) {
                throw new NoSuchElementException();
            }
            int iC = c();
            h(iC + 1);
            i(iC);
            Object obj = f().f22561q[d()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = f().f22562r;
            n.e(objArr);
            Object obj2 = objArr[d()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            g();
            return iHashCode2;
        }
    }

    public static final class c implements Map.Entry, p229w8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final d f22571q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f22572r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f22573s;

        public c(d map, int i10) {
            n.h(map, "map");
            this.f22571q = map;
            this.f22572r = i10;
            this.f22573s = map.f22568x;
        }

        private final void a() {
            if (this.f22571q.f22568x != this.f22573s) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return n.d(entry.getKey(), getKey()) && n.d(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            a();
            return this.f22571q.f22561q[this.f22572r];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            a();
            Object[] objArr = this.f22571q.f22562r;
            n.e(objArr);
            return objArr[this.f22572r];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            this.f22571q.n();
            Object[] objArrL = this.f22571q.l();
            int i10 = this.f22572r;
            Object obj2 = objArrL[i10];
            objArrL[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: j8.d$d, reason: collision with other inner class name */
    public static class C0565d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final d f22574q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f22575r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f22576s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f22577t;

        public C0565d(d map) {
            n.h(map, "map");
            this.f22574q = map;
            this.f22576s = -1;
            this.f22577t = map.f22568x;
            g();
        }

        public final void a() {
            if (this.f22574q.f22568x != this.f22577t) {
                throw new ConcurrentModificationException();
            }
        }

        public final int c() {
            return this.f22575r;
        }

        public final int d() {
            return this.f22576s;
        }

        public final d f() {
            return this.f22574q;
        }

        public final void g() {
            while (this.f22575r < this.f22574q.f22566v) {
                int[] iArr = this.f22574q.f22563s;
                int i10 = this.f22575r;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f22575r = i10 + 1;
                }
            }
        }

        public final void h(int i10) {
            this.f22575r = i10;
        }

        public final boolean hasNext() {
            return this.f22575r < this.f22574q.f22566v;
        }

        public final void i(int i10) {
            this.f22576s = i10;
        }

        public final void remove() {
            a();
            if (this.f22576s == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f22574q.n();
            this.f22574q.L(this.f22576s);
            this.f22576s = -1;
            this.f22577t = this.f22574q.f22568x;
        }
    }

    public static final class e extends C0565d implements Iterator, p229w8.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d map) {
            super(map);
            n.h(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (c() >= f().f22566v) {
                throw new NoSuchElementException();
            }
            int iC = c();
            h(iC + 1);
            i(iC);
            Object obj = f().f22561q[d()];
            g();
            return obj;
        }
    }

    public static final class f extends C0565d implements Iterator, p229w8.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d map) {
            super(map);
            n.h(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (c() >= f().f22566v) {
                throw new NoSuchElementException();
            }
            int iC = c();
            h(iC + 1);
            i(iC);
            Object[] objArr = f().f22562r;
            n.e(objArr);
            Object obj = objArr[d()];
            g();
            return obj;
        }
    }

    static {
        d dVar = new d(0);
        dVar.f22560C = true;
        f22557E = dVar;
    }

    private d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f22561q = objArr;
        this.f22562r = objArr2;
        this.f22563s = iArr;
        this.f22564t = iArr2;
        this.f22565u = i10;
        this.f22566v = i11;
        this.f22567w = f22556D.d(z());
    }

    private final int D(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f22567w;
    }

    private final boolean F(Collection collection) {
        boolean z9 = false;
        if (collection.isEmpty()) {
            return false;
        }
        t(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (G((Map.Entry) it.next())) {
                z9 = true;
            }
        }
        return z9;
    }

    private final boolean G(Map.Entry entry) {
        int iK = k(entry.getKey());
        Object[] objArrL = l();
        if (iK >= 0) {
            objArrL[iK] = entry.getValue();
            return true;
        }
        int i10 = (-iK) - 1;
        if (n.d(entry.getValue(), objArrL[i10])) {
            return false;
        }
        objArrL[i10] = entry.getValue();
        return true;
    }

    private final boolean H(int i10) {
        int iD = D(this.f22561q[i10]);
        int i11 = this.f22565u;
        while (true) {
            int[] iArr = this.f22564t;
            if (iArr[iD] == 0) {
                iArr[iD] = i10 + 1;
                this.f22563s[i10] = iD;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iD = iD == 0 ? z() - 1 : iD - 1;
        }
    }

    private final void I() {
        this.f22568x++;
    }

    private final void J(int i10) {
        I();
        int i11 = 0;
        if (this.f22566v > size()) {
            o(false);
        }
        this.f22564t = new int[i10];
        this.f22567w = f22556D.d(i10);
        while (i11 < this.f22566v) {
            int i12 = i11 + 1;
            if (!H(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(int i10) {
        p099j8.c.f(this.f22561q, i10);
        Object[] objArr = this.f22562r;
        if (objArr != null) {
            p099j8.c.f(objArr, i10);
        }
        M(this.f22563s[i10]);
        this.f22563s[i10] = -1;
        this.f22569y = size() - 1;
        I();
    }

    private final void M(int i10) {
        int i11 = h.i(this.f22565u * 2, z() / 2);
        int i12 = 0;
        int i13 = i10;
        do {
            i10 = i10 == 0 ? z() - 1 : i10 - 1;
            i12++;
            if (i12 > this.f22565u) {
                this.f22564t[i13] = 0;
                return;
            }
            int[] iArr = this.f22564t;
            int i14 = iArr[i10];
            if (i14 == 0) {
                iArr[i13] = 0;
                return;
            }
            if (i14 < 0) {
                iArr[i13] = -1;
            } else {
                int i15 = i14 - 1;
                if (((D(this.f22561q[i15]) - i10) & (z() - 1)) >= i12) {
                    this.f22564t[i13] = i14;
                    this.f22563s[i15] = i13;
                }
                i11--;
            }
            i13 = i10;
            i12 = 0;
            i11--;
        } while (i11 >= 0);
        this.f22564t[i13] = -1;
    }

    private final boolean P(int i10) {
        int iX = x();
        int i11 = this.f22566v;
        int i12 = iX - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= x() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] l() {
        Object[] objArr = this.f22562r;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrD = p099j8.c.d(x());
        this.f22562r = objArrD;
        return objArrD;
    }

    private final void o(boolean z9) {
        int i10;
        Object[] objArr = this.f22562r;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f22566v;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f22563s;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f22561q;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z9) {
                    iArr[i12] = i13;
                    this.f22564t[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        p099j8.c.g(this.f22561q, i12, i10);
        if (objArr != null) {
            p099j8.c.g(objArr, i12, this.f22566v);
        }
        this.f22566v = i12;
    }

    private final boolean r(Map map) {
        return size() == map.size() && p(map.entrySet());
    }

    private final void s(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > x()) {
            int iE = AbstractC1429c.f22259q.e(x(), i10);
            this.f22561q = p099j8.c.e(this.f22561q, iE);
            Object[] objArr = this.f22562r;
            this.f22562r = objArr != null ? p099j8.c.e(objArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f22563s, iE);
            n.g(iArrCopyOf, "copyOf(...)");
            this.f22563s = iArrCopyOf;
            int iC = f22556D.c(iE);
            if (iC > z()) {
                J(iC);
            }
        }
    }

    private final void t(int i10) {
        if (P(i10)) {
            o(true);
        } else {
            s(this.f22566v + i10);
        }
    }

    private final int v(Object obj) {
        int iD = D(obj);
        int i10 = this.f22565u;
        while (true) {
            int i11 = this.f22564t[iD];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (n.d(this.f22561q[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iD = iD == 0 ? z() - 1 : iD - 1;
        }
    }

    private final int w(Object obj) {
        int i10 = this.f22566v;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f22563s[i10] >= 0) {
                Object[] objArr = this.f22562r;
                n.e(objArr);
                if (n.d(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    private final int z() {
        return this.f22564t.length;
    }

    public Set A() {
        p099j8.f fVar = this.f22570z;
        if (fVar != null) {
            return fVar;
        }
        p099j8.f fVar2 = new p099j8.f(this);
        this.f22570z = fVar2;
        return fVar2;
    }

    public int B() {
        return this.f22569y;
    }

    public Collection C() {
        g gVar = this.f22558A;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f22558A = gVar2;
        return gVar2;
    }

    public final e E() {
        return new e(this);
    }

    public final boolean K(Map.Entry entry) {
        n.h(entry, "entry");
        n();
        int iV = v(entry.getKey());
        if (iV < 0) {
            return false;
        }
        Object[] objArr = this.f22562r;
        n.e(objArr);
        if (!n.d(objArr[iV], entry.getValue())) {
            return false;
        }
        L(iV);
        return true;
    }

    public final boolean N(Object obj) {
        n();
        int iV = v(obj);
        if (iV < 0) {
            return false;
        }
        L(iV);
        return true;
    }

    public final boolean O(Object obj) {
        n();
        int iW = w(obj);
        if (iW < 0) {
            return false;
        }
        L(iW);
        return true;
    }

    public final f Q() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        n();
        int i10 = this.f22566v - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f22563s;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f22564t[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        p099j8.c.g(this.f22561q, 0, this.f22566v);
        Object[] objArr = this.f22562r;
        if (objArr != null) {
            p099j8.c.g(objArr, 0, this.f22566v);
        }
        this.f22569y = 0;
        this.f22566v = 0;
        I();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return v(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return w(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return y();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && r((Map) obj);
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iV = v(obj);
        if (iV < 0) {
            return null;
        }
        Object[] objArr = this.f22562r;
        n.e(objArr);
        return objArr[iV];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarU = u();
        int iM = 0;
        while (bVarU.hasNext()) {
            iM += bVarU.m();
        }
        return iM;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int k(Object obj) {
        n();
        while (true) {
            int iD = D(obj);
            int i10 = h.i(this.f22565u * 2, z() / 2);
            int i11 = 0;
            while (true) {
                int i12 = this.f22564t[iD];
                if (i12 <= 0) {
                    if (this.f22566v >= x()) {
                        t(1);
                        break;
                    }
                    int i13 = this.f22566v;
                    int i14 = i13 + 1;
                    this.f22566v = i14;
                    this.f22561q[i13] = obj;
                    this.f22563s[i13] = iD;
                    this.f22564t[iD] = i14;
                    this.f22569y = size() + 1;
                    I();
                    if (i11 > this.f22565u) {
                        this.f22565u = i11;
                    }
                    return i13;
                }
                if (n.d(this.f22561q[i12 - 1], obj)) {
                    return -i12;
                }
                i11++;
                if (i11 > i10) {
                    J(z() * 2);
                    break;
                }
                iD = iD == 0 ? z() - 1 : iD - 1;
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return A();
    }

    public final Map m() {
        n();
        this.f22560C = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f22557E;
        n.f(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void n() {
        if (this.f22560C) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean p(Collection m9) {
        n.h(m9, "m");
        for (Object obj : m9) {
            if (obj != null) {
                try {
                    if (!q((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        n();
        int iK = k(obj);
        Object[] objArrL = l();
        if (iK >= 0) {
            objArrL[iK] = obj2;
            return null;
        }
        int i10 = (-iK) - 1;
        Object obj3 = objArrL[i10];
        objArrL[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        n.h(from, "from");
        n();
        F(from.entrySet());
    }

    public final boolean q(Map.Entry entry) {
        n.h(entry, "entry");
        int iV = v(entry.getKey());
        if (iV < 0) {
            return false;
        }
        Object[] objArr = this.f22562r;
        n.e(objArr);
        return n.d(objArr[iV], entry.getValue());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        n();
        int iV = v(obj);
        if (iV < 0) {
            return null;
        }
        Object[] objArr = this.f22562r;
        n.e(objArr);
        Object obj2 = objArr[iV];
        L(iV);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return B();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b bVarU = u();
        int i10 = 0;
        while (bVarU.hasNext()) {
            if (i10 > 0) {
                sb.append(", ");
            }
            bVarU.l(sb);
            i10++;
        }
        sb.append("}");
        String string = sb.toString();
        n.g(string, "toString(...)");
        return string;
    }

    public final b u() {
        return new b(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return C();
    }

    public final int x() {
        return this.f22561q.length;
    }

    public Set y() {
        p099j8.e eVar = this.f22559B;
        if (eVar != null) {
            return eVar;
        }
        p099j8.e eVar2 = new p099j8.e(this);
        this.f22559B = eVar2;
        return eVar2;
    }

    public d() {
        this(8);
    }

    public d(int i10) {
        this(p099j8.c.d(i10), null, new int[i10], new int[f22556D.c(i10)], 2, 0);
    }
}

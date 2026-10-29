package p017b6;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class c extends AbstractMap implements ConcurrentMap {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final l f14923v = l.SOFT;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final n[] f14924q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float f14925r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final l f14926s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f14927t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Set f14928u;

    class a extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f14929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f14930d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q[] qVarArr, boolean z9, Object obj) {
            super(qVarArr);
            this.f14929c = z9;
            this.f14930d = obj;
        }

        @Override // b6.c.p
        protected Object b(j jVar, g gVar, f fVar) {
            if (gVar == null) {
                fVar.a(this.f14930d);
                return null;
            }
            Object value = gVar.getValue();
            if (this.f14929c) {
                gVar.setValue(this.f14930d);
            }
            return value;
        }
    }

    class b extends p {
        b(q... qVarArr) {
            super(qVarArr);
        }

        @Override // b6.c.p
        protected Object a(j jVar, g gVar) {
            if (gVar == null) {
                return null;
            }
            jVar.a();
            return gVar.f14942r;
        }
    }

    /* JADX INFO: renamed from: b6.c$c, reason: collision with other inner class name */
    class C0431c extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f14933c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0431c(q[] qVarArr, Object obj) {
            super(qVarArr);
            this.f14933c = obj;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // b6.c.p
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean a(j jVar, g gVar) {
            if (gVar == null || !p017b6.h.e(gVar.getValue(), this.f14933c)) {
                return Boolean.FALSE;
            }
            jVar.a();
            return Boolean.TRUE;
        }
    }

    class d extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f14935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f14936d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(q[] qVarArr, Object obj, Object obj2) {
            super(qVarArr);
            this.f14935c = obj;
            this.f14936d = obj2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // b6.c.p
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean a(j jVar, g gVar) {
            if (gVar == null || !p017b6.h.e(gVar.getValue(), this.f14935c)) {
                return Boolean.FALSE;
            }
            gVar.setValue(this.f14936d);
            return Boolean.TRUE;
        }
    }

    class e extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f14938c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(q[] qVarArr, Object obj) {
            super(qVarArr);
            this.f14938c = obj;
        }

        @Override // b6.c.p
        protected Object a(j jVar, g gVar) {
            if (gVar == null) {
                return null;
            }
            Object value = gVar.getValue();
            gVar.setValue(this.f14938c);
            return value;
        }
    }

    private abstract class f {
        public abstract void a(Object obj);

        private f() {
        }
    }

    protected static final class g implements Map.Entry {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Object f14941q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private volatile Object f14942r;

        public g(Object obj, Object obj2) {
            this.f14941q = obj;
            this.f14942r = obj2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return p017b6.h.e(getKey(), entry.getKey()) && p017b6.h.e(getValue(), entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f14941q;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f14942r;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return p017b6.h.f(this.f14942r) ^ p017b6.h.f(this.f14941q);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f14942r;
            this.f14942r = obj;
            return obj2;
        }

        public String toString() {
            return this.f14941q + "=" + this.f14942r;
        }
    }

    private class h implements Iterator {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f14943q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f14944r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private j[] f14945s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private j f14946t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private g f14947u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private g f14948v;

        public h() {
            d();
        }

        private void a() {
            while (this.f14947u == null) {
                c();
                j jVar = this.f14946t;
                if (jVar == null) {
                    return;
                } else {
                    this.f14947u = jVar.get();
                }
            }
        }

        private void c() {
            j[] jVarArr;
            j jVar = this.f14946t;
            if (jVar != null) {
                this.f14946t = jVar.e();
            }
            while (this.f14946t == null && (jVarArr = this.f14945s) != null) {
                int i10 = this.f14944r;
                if (i10 >= jVarArr.length) {
                    d();
                    this.f14944r = 0;
                } else {
                    this.f14946t = jVarArr[i10];
                    this.f14944r = i10 + 1;
                }
            }
        }

        private void d() {
            this.f14946t = null;
            this.f14945s = null;
            if (this.f14943q < c.this.f14924q.length) {
                this.f14945s = c.this.f14924q[this.f14943q].f14961s;
                this.f14943q++;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public g next() {
            a();
            g gVar = this.f14947u;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f14948v = gVar;
            this.f14947u = null;
            return gVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f14947u != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            p017b6.a.c(this.f14948v != null);
            c.this.remove(this.f14948v.getKey());
        }
    }

    private class i extends AbstractSet {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj == null || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            j jVarI = c.this.i(entry.getKey(), m.NEVER);
            g gVar = jVarI != null ? jVarI.get() : null;
            if (gVar != null) {
                return p017b6.h.e(entry.getValue(), gVar.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return c.this.new h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c.this.remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c.this.size();
        }

        private i() {
        }
    }

    protected interface j {
        void a();

        int b();

        j e();

        g get();
    }

    protected class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReferenceQueue f14951a = new ReferenceQueue();

        protected k() {
        }

        public j a(g gVar, int i10, j jVar) {
            return c.this.f14926s == l.WEAK ? new r(gVar, i10, jVar, this.f14951a) : new o(gVar, i10, jVar, this.f14951a);
        }

        public j b() {
            return (j) this.f14951a.poll();
        }
    }

    public enum l {
        SOFT,
        WEAK
    }

    protected enum m {
        WHEN_NECESSARY,
        NEVER
    }

    protected final class n extends ReentrantLock {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final k f14959q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f14960r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private volatile j[] f14961s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private volatile int f14962t = 0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f14963u;

        class a extends f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f14965b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f14966c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ j f14967d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f14968e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, int i10, j jVar, int i11) {
                super();
                this.f14965b = obj;
                this.f14966c = i10;
                this.f14967d = jVar;
                this.f14968e = i11;
            }

            @Override // b6.c.f
            public void a(Object obj) {
                n.this.f14961s[this.f14968e] = n.this.f14959q.a(new g(this.f14965b, obj), this.f14966c, this.f14967d);
                n.this.f14962t++;
            }
        }

        public n(int i10) {
            this.f14959q = c.this.d();
            int iC = 1 << c.c(i10, BasicMeasure.EXACTLY);
            this.f14960r = iC;
            m(f(iC));
        }

        private j[] f(int i10) {
            return (j[]) Array.newInstance((Class<?>) j.class, i10);
        }

        private j h(j jVar, Object obj, int i10) {
            g gVar;
            Object key;
            while (jVar != null) {
                if (jVar.b() == i10 && (gVar = jVar.get()) != null && ((key = gVar.getKey()) == obj || key.equals(obj))) {
                    return jVar;
                }
                jVar = jVar.e();
            }
            return null;
        }

        private int j(int i10, j[] jVarArr) {
            return (jVarArr.length - 1) & i10;
        }

        private void m(j[] jVarArr) {
            this.f14961s = jVarArr;
            this.f14963u = (int) (jVarArr.length * c.this.h());
        }

        public void e() {
            if (this.f14962t == 0) {
                return;
            }
            lock();
            try {
                m(f(this.f14960r));
                this.f14962t = 0;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code duplicated, block: B:31:0x006b  */
        /* JADX WARN: Code duplicated, block: B:39:? A[SYNTHETIC] */
        public Object g(int i10, Object obj, p pVar) throws Throwable {
            n nVar;
            Throwable th;
            boolean zC = pVar.c(q.RESIZE);
            if (pVar.c(q.RESTRUCTURE_BEFORE)) {
                l(zC);
            }
            g gVar = null;
            if (pVar.c(q.SKIP_IF_EMPTY) && this.f14962t == 0) {
                return pVar.b(null, null, null);
            }
            lock();
            try {
                int iJ = j(i10, this.f14961s);
                j jVar = this.f14961s[iJ];
                j jVarH = h(jVar, obj, i10);
                if (jVarH != null) {
                    try {
                        gVar = jVarH.get();
                    } catch (Throwable th2) {
                        th = th2;
                        nVar = this;
                        nVar.unlock();
                        if (pVar.c(q.RESTRUCTURE_AFTER)) {
                            throw th;
                        }
                        nVar.l(zC);
                        throw th;
                    }
                }
                nVar = this;
                try {
                    Object objB = pVar.b(jVarH, gVar, nVar.new a(obj, i10, jVar, iJ));
                    nVar.unlock();
                    if (pVar.c(q.RESTRUCTURE_AFTER)) {
                        nVar.l(zC);
                    }
                    return objB;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    nVar.unlock();
                    if (pVar.c(q.RESTRUCTURE_AFTER)) {
                        throw th;
                    }
                    nVar.l(zC);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                nVar = this;
            }
        }

        public final int i() {
            return this.f14962t;
        }

        public j k(Object obj, int i10, m mVar) {
            if (mVar == m.WHEN_NECESSARY) {
                l(false);
            }
            if (this.f14962t == 0) {
                return null;
            }
            j[] jVarArr = this.f14961s;
            return h(jVarArr[j(i10, jVarArr)], obj, i10);
        }

        protected final void l(boolean z9) {
            boolean z10 = true;
            boolean z11 = this.f14962t > 0 && this.f14962t >= this.f14963u;
            j jVarB = this.f14959q.b();
            if (jVarB != null || (z11 && z9)) {
                lock();
                try {
                    int i10 = this.f14962t;
                    Set hashSet = Collections.EMPTY_SET;
                    if (jVarB != null) {
                        hashSet = new HashSet();
                        while (jVarB != null) {
                            hashSet.add(jVarB);
                            jVarB = this.f14959q.b();
                        }
                    }
                    int size = i10 - hashSet.size();
                    boolean z12 = size > 0 && size >= this.f14963u;
                    int length = this.f14961s.length;
                    if (z9 && z12 && length < 1073741824) {
                        length <<= 1;
                    } else {
                        z10 = false;
                    }
                    j[] jVarArrF = z10 ? f(length) : this.f14961s;
                    for (int i11 = 0; i11 < this.f14961s.length; i11++) {
                        if (!z10) {
                            jVarArrF[i11] = null;
                        }
                        for (j jVarE = this.f14961s[i11]; jVarE != null; jVarE = jVarE.e()) {
                            if (!hashSet.contains(jVarE) && jVarE.get() != null) {
                                int iJ = j(jVarE.b(), jVarArrF);
                                jVarArrF[iJ] = this.f14959q.a(jVarE.get(), jVarE.b(), jVarArrF[iJ]);
                            }
                        }
                    }
                    if (z10) {
                        m(jVarArrF);
                    }
                    this.f14962t = Math.max(size, 0);
                } finally {
                    unlock();
                }
            }
        }
    }

    private static final class o extends SoftReference implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f14970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j f14971b;

        public o(g gVar, int i10, j jVar, ReferenceQueue referenceQueue) {
            super(gVar, referenceQueue);
            this.f14970a = i10;
            this.f14971b = jVar;
        }

        @Override // b6.c.j
        public void a() {
            enqueue();
            clear();
        }

        @Override // b6.c.j
        public int b() {
            return this.f14970a;
        }

        @Override // b6.c.j
        public j e() {
            return this.f14971b;
        }

        @Override // java.lang.ref.SoftReference, java.lang.ref.Reference, b6.c.j
        public /* bridge */ /* synthetic */ g get() {
            return (g) super.get();
        }
    }

    private abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumSet f14972a;

        public p(q... qVarArr) {
            this.f14972a = qVarArr.length == 0 ? EnumSet.noneOf(q.class) : EnumSet.of(qVarArr[0], qVarArr);
        }

        protected Object a(j jVar, g gVar) {
            return null;
        }

        protected Object b(j jVar, g gVar, f fVar) {
            return a(jVar, gVar);
        }

        public boolean c(q qVar) {
            return this.f14972a.contains(qVar);
        }
    }

    private enum q {
        RESTRUCTURE_BEFORE,
        RESTRUCTURE_AFTER,
        SKIP_IF_EMPTY,
        RESIZE
    }

    private static final class r extends WeakReference implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f14979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j f14980b;

        public r(g gVar, int i10, j jVar, ReferenceQueue referenceQueue) {
            super(gVar, referenceQueue);
            this.f14979a = i10;
            this.f14980b = jVar;
        }

        @Override // b6.c.j
        public void a() {
            enqueue();
            clear();
        }

        @Override // b6.c.j
        public int b() {
            return this.f14979a;
        }

        @Override // b6.c.j
        public j e() {
            return this.f14980b;
        }

        @Override // java.lang.ref.Reference, b6.c.j
        public /* bridge */ /* synthetic */ g get() {
            return (g) super.get();
        }
    }

    public c(int i10) {
        this(i10, 0.75f, 16, f14923v);
    }

    protected static int c(int i10, int i11) {
        int i12 = 0;
        int i13 = 1;
        while (i13 < i10 && i13 < i11) {
            i13 <<= 1;
            i12++;
        }
        return i12;
    }

    private Object f(Object obj, p pVar) {
        int iG = g(obj);
        return k(iG).g(iG, obj, pVar);
    }

    private n k(int i10) {
        n[] nVarArr = this.f14924q;
        return nVarArr[(i10 >>> (32 - this.f14927t)) & (nVarArr.length - 1)];
    }

    private Object l(Object obj, Object obj2, boolean z9) {
        return f(obj, new a(new q[]{q.RESTRUCTURE_BEFORE, q.RESIZE}, z9, obj2));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (n nVar : this.f14924q) {
            nVar.e();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        j jVarI = i(obj, m.WHEN_NECESSARY);
        g gVar = jVarI != null ? jVarI.get() : null;
        return gVar != null && p017b6.h.e(gVar.getKey(), obj);
    }

    protected k d() {
        return new k();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f14928u == null) {
            this.f14928u = new i();
        }
        return this.f14928u;
    }

    protected int g(Object obj) {
        int iHashCode = obj == null ? 0 : obj.hashCode();
        int i10 = iHashCode + ((iHashCode << 15) ^ (-12931));
        int i11 = i10 ^ (i10 >>> 10);
        int i12 = i11 + (i11 << 3);
        int i13 = i12 ^ (i12 >>> 6);
        int i14 = i13 + (i13 << 2) + (i13 << 14);
        return i14 ^ (i14 >>> 16);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        j jVarI = i(obj, m.WHEN_NECESSARY);
        g gVar = jVarI != null ? jVarI.get() : null;
        if (gVar != null) {
            return gVar.getValue();
        }
        return null;
    }

    protected final float h() {
        return this.f14925r;
    }

    protected final j i(Object obj, m mVar) {
        int iG = g(obj);
        return k(iG).k(obj, iG, mVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return l(obj, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object putIfAbsent(Object obj, Object obj2) {
        return l(obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return f(obj, new b(q.RESTRUCTURE_AFTER, q.SKIP_IF_EMPTY));
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(Object obj, Object obj2, Object obj3) {
        return ((Boolean) f(obj, new d(new q[]{q.RESTRUCTURE_BEFORE, q.SKIP_IF_EMPTY}, obj2, obj3))).booleanValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        int i10 = 0;
        for (n nVar : this.f14924q) {
            i10 += nVar.i();
        }
        return i10;
    }

    public c(int i10, float f10, int i11, l lVar) {
        int i12 = 0;
        p017b6.a.a(i10 >= 0, "Initial capacity must not be negative");
        p017b6.a.a(f10 > 0.0f, "Load factor must be positive");
        p017b6.a.a(i11 > 0, "Concurrency level must be positive");
        p017b6.a.b(lVar, "Reference type must not be null");
        this.f14925r = f10;
        int iC = c(i11, ArrayPool.STANDARD_BUFFER_SIZE_BYTES);
        this.f14927t = iC;
        int i13 = 1 << iC;
        this.f14926s = lVar;
        int i14 = (int) ((((long) (i10 + i13)) - 1) / ((long) i13));
        this.f14924q = (n[]) Array.newInstance((Class<?>) n.class, i13);
        while (true) {
            n[] nVarArr = this.f14924q;
            if (i12 >= nVarArr.length) {
                return;
            }
            nVarArr[i12] = new n(i14);
            i12++;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        return ((Boolean) f(obj, new C0431c(new q[]{q.RESTRUCTURE_AFTER, q.SKIP_IF_EMPTY}, obj2))).booleanValue();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object replace(Object obj, Object obj2) {
        return f(obj, new e(new q[]{q.RESTRUCTURE_BEFORE, q.SKIP_IF_EMPTY}, obj2));
    }
}

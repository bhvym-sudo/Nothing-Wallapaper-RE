package p071h0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC1456g;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Collection, p229w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f21568s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final e f21569t = new e(AbstractC1444s.l());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f21570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f21571r;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final e a() {
            return e.f21569t;
        }

        private a() {
        }
    }

    public e(List list) {
        this.f21570q = list;
        this.f21571r = list.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(d dVar) {
        return this.f21570q.contains(dVar);
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof d) {
            return b((d) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f21570q.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && n.d(this.f21570q, ((e) obj).f21570q);
    }

    public final List f() {
        return this.f21570q;
    }

    public int g() {
        return this.f21571r;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f21570q.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f21570q.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f21570q.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC1456g.a(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f21570q + ')';
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC1456g.b(this, objArr);
    }
}

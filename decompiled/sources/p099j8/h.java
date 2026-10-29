package p099j8;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1435i;
import p229w8.e;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends AbstractC1435i implements Set, Serializable, e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final a f22581r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final h f22582s = new h(d.f22556D.e());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final d f22583q;

    private static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public h(d backing) {
        n.h(backing, "backing");
        this.f22583q = backing;
    }

    @Override // p089i8.AbstractC1435i
    public int a() {
        return this.f22583q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f22583q.k(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        n.h(elements, "elements");
        this.f22583q.n();
        return super.addAll(elements);
    }

    public final Set b() {
        this.f22583q.m();
        return size() > 0 ? this : f22582s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f22583q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f22583q.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f22583q.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f22583q.E();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f22583q.N(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        n.h(elements, "elements");
        this.f22583q.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        n.h(elements, "elements");
        this.f22583q.n();
        return super.retainAll(elements);
    }

    public h() {
        this(new d());
    }
}

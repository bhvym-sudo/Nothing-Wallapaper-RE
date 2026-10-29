package p175r4;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
abstract class T8 extends AbstractCollection {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Object f26249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Collection f26250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final T8 f26251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Collection f26252t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final /* synthetic */ G9 f26253u;

    T8(G9 g10, Object obj, Collection collection, T8 t9) {
        this.f26253u = g10;
        this.f26249q = obj;
        this.f26250r = collection;
        this.f26251s = t9;
        this.f26252t = t9 == null ? null : t9.f26250r;
    }

    final void a() {
        T8 t9 = this.f26251s;
        if (t9 != null) {
            t9.a();
            return;
        }
        G9 g10 = this.f26253u;
        g10.f25963s.put(this.f26249q, this.f26250r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.f26250r.isEmpty();
        boolean zAdd = this.f26250r.add(obj);
        if (zAdd) {
            this.f26253u.f25964t++;
            if (zIsEmpty) {
                a();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f26250r.addAll(collection);
        if (zAddAll) {
            int size2 = this.f26250r.size();
            this.f26253u.f25964t += size2 - size;
            if (size == 0) {
                a();
                return true;
            }
        }
        return zAddAll;
    }

    final void b() {
        T8 t9 = this.f26251s;
        if (t9 != null) {
            t9.b();
            T8 t10 = this.f26251s;
            if (t10.f26250r != this.f26252t) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f26250r.isEmpty()) {
            G9 g10 = this.f26253u;
            Collection collection = (Collection) g10.f25963s.get(this.f26249q);
            if (collection != null) {
                this.f26250r = collection;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f26250r.clear();
        this.f26253u.f25964t -= size;
        e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.f26250r.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        b();
        return this.f26250r.containsAll(collection);
    }

    final void e() {
        T8 t9 = this.f26251s;
        if (t9 != null) {
            t9.e();
        } else if (this.f26250r.isEmpty()) {
            G9 g10 = this.f26253u;
            g10.f25963s.remove(this.f26249q);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f26250r.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.f26250r.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new C1917s8(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.f26250r.remove(obj);
        if (zRemove) {
            this.f26253u.f25964t--;
            e();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f26250r.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f26250r.size();
            this.f26253u.f25964t += size2 - size;
            e();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f26250r.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f26250r.size();
            this.f26253u.f25964t += size2 - size;
            e();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.f26250r.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.f26250r.toString();
    }
}

package p175r4;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: r4.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1876o6 extends H {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final transient Map f26891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ G9 f26892t;

    C1876o6(G9 g10, Map map) {
        this.f26892t = g10;
        this.f26891s = map;
    }

    @Override // p175r4.H
    protected final Set a() {
        return new C1855m5(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        G9 g10 = this.f26892t;
        if (this.f26891s == g10.f25963s) {
            g10.o();
        } else {
            A.a(new N5(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return I.b(this.f26891s, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f26891s.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) I.a(this.f26891s, obj);
        if (collection == null) {
            return null;
        }
        return this.f26892t.h(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f26891s.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f26892t.d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f26891s.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionG = this.f26892t.g();
        collectionG.addAll(collection);
        this.f26892t.f25964t -= collection.size();
        collection.clear();
        return collectionG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f26891s.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f26891s.toString();
    }
}

package p175r4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: r4.q7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1897q7 extends F {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ G9 f27299r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1897q7(G9 g10, Map map) {
        super(map);
        this.f27299r = g10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        A.a(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f25915q.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f25915q.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f25915q.keySet().hashCode();
    }

    @Override // p175r4.F, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new P6(this, this.f25915q.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f25915q.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f27299r.f25964t -= size;
        return size > 0;
    }
}

package p210v;

import java.util.Iterator;
import java.util.Set;
import p089i8.AbstractC1435i;
import p229w8.e;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC1435i implements Set, e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f f28066q;

    public j(f fVar) {
        this.f28066q = fVar;
    }

    @Override // p089i8.AbstractC1435i
    public int a() {
        return this.f28066q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f28066q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f28066q.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new k(this.f28066q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f28066q.containsKey(obj)) {
            return false;
        }
        this.f28066q.remove(obj);
        return true;
    }
}

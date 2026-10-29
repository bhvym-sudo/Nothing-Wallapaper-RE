package p210v;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f f28064q;

    public h(f fVar) {
        this.f28064q = fVar;
    }

    @Override // p089i8.AbstractC1435i
    public int a() {
        return this.f28064q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f28064q.clear();
    }

    @Override // p210v.a
    public boolean f(Map.Entry entry) {
        Object obj = this.f28064q.get(entry.getKey());
        if (obj != null) {
            return n.d(obj, entry.getValue());
        }
        return entry.getValue() == null && this.f28064q.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new i(this.f28064q);
    }

    @Override // p210v.a
    public boolean m(Map.Entry entry) {
        return this.f28064q.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }
}

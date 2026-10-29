package p099j8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final d f22578q;

    public e(d backing) {
        n.h(backing, "backing");
        this.f22578q = backing;
    }

    @Override // p089i8.AbstractC1435i
    public int a() {
        return this.f22578q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        n.h(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f22578q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        n.h(elements, "elements");
        return this.f22578q.p(elements);
    }

    @Override // p099j8.a
    public boolean f(Map.Entry element) {
        n.h(element, "element");
        return this.f22578q.q(element);
    }

    @Override // p099j8.a
    public boolean g(Map.Entry element) {
        n.h(element, "element");
        return this.f22578q.K(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f22578q.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f22578q.u();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry element) {
        n.h(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        n.h(elements, "elements");
        this.f22578q.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        n.h(elements, "elements");
        this.f22578q.n();
        return super.retainAll(elements);
    }
}

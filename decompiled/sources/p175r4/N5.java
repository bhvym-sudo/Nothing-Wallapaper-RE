package p175r4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class N5 implements Iterator {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Iterator f26097q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Collection f26098r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final /* synthetic */ C1876o6 f26099s;

    N5(C1876o6 c1876o6) {
        this.f26099s = c1876o6;
        this.f26097q = c1876o6.f26891s.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26097q.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f26097q.next();
        this.f26098r = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new C1908s(key, this.f26099s.f26892t.h(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC1811i3.d(this.f26098r != null, "no calls to next() since the last call to remove()");
        this.f26097q.remove();
        this.f26099s.f26892t.f25964t -= this.f26098r.size();
        this.f26098r.clear();
        this.f26098r = null;
    }
}

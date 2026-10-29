package p175r4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class P6 implements Iterator {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Map.Entry f26148q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Iterator f26149r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final /* synthetic */ C1897q7 f26150s;

    P6(C1897q7 c1897q7, Iterator it) {
        this.f26150s = c1897q7;
        this.f26149r = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26149r.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f26149r.next();
        this.f26148q = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC1811i3.d(this.f26148q != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f26148q.getValue();
        this.f26149r.remove();
        this.f26150s.f27299r.f25964t -= collection.size();
        collection.clear();
        this.f26148q = null;
    }
}

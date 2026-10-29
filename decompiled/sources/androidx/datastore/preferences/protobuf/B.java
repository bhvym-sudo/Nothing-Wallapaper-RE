package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class B implements Iterator {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Iterator f12396q;

    public B(Iterator it) {
        this.f12396q = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f12396q.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f12396q.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f12396q.remove();
    }
}

package p220w;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p229w8.a;

/* JADX INFO: loaded from: classes.dex */
public class c implements Iterator, a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Object f28546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Map f28547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f28548s;

    public c(Object obj, Map map) {
        this.f28546q = obj;
        this.f28547r = map;
    }

    private final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f28548s < this.f28547r.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        a();
        Object obj = this.f28546q;
        this.f28548s++;
        Object obj2 = this.f28547r.get(obj);
        if (obj2 != null) {
            this.f28546q = ((a) obj2).c();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

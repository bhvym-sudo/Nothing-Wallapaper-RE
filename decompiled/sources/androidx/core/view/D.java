package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class D implements Iterator, p229w8.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p219v8.l f12180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f12181r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Iterator f12182s;

    public D(Iterator it, p219v8.l lVar) {
        this.f12180q = lVar;
        this.f12182s = it;
    }

    private final void a(Object obj) {
        Iterator it = (Iterator) this.f12180q.f(obj);
        if (it != null && it.hasNext()) {
            this.f12181r.add(this.f12182s);
            this.f12182s = it;
        } else {
            while (!this.f12182s.hasNext() && !this.f12181r.isEmpty()) {
                this.f12182s = (Iterator) AbstractC1444s.c0(this.f12181r);
                AbstractC1444s.F(this.f12181r);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f12182s.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.f12182s.next();
        a(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

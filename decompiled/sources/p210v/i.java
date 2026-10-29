package p210v;

import java.util.Iterator;
import java.util.Map;
import p229w8.a;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator, a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final g f28065q;

    public i(f fVar) {
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new y(this);
        }
        this.f28065q = new g(fVar, uVarArr);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return (Map.Entry) this.f28065q.next();
    }

    public final void c(Object obj, Object obj2) {
        this.f28065q.m(obj, obj2);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f28065q.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f28065q.remove();
    }
}

package D8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
final class i extends j implements Iterator, p129m8.e, p229w8.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Object f1161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Iterator f1162s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private p129m8.e f1163t;

    private final Throwable g() {
        int i10 = this.f1160q;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f1160q);
    }

    private final Object h() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // D8.j
    public Object c(Object obj, p129m8.e eVar) {
        this.f1161r = obj;
        this.f1160q = 3;
        this.f1163t = eVar;
        Object objE = p139n8.b.e();
        if (objE == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objE == p139n8.b.e() ? objE : A.f21846a;
    }

    @Override // D8.j
    public Object f(Iterator it, p129m8.e eVar) {
        if (!it.hasNext()) {
            return A.f21846a;
        }
        this.f1162s = it;
        this.f1160q = 2;
        this.f1163t = eVar;
        Object objE = p139n8.b.e();
        if (objE == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objE == p139n8.b.e() ? objE : A.f21846a;
    }

    @Override // p129m8.e
    public p129m8.i getContext() {
        return p129m8.j.f23252q;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f1160q;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw g();
                }
                Iterator it = this.f1162s;
                kotlin.jvm.internal.n.e(it);
                if (it.hasNext()) {
                    this.f1160q = 2;
                    return true;
                }
                this.f1162s = null;
            }
            this.f1160q = 5;
            p129m8.e eVar = this.f1163t;
            kotlin.jvm.internal.n.e(eVar);
            this.f1163t = null;
            h8.q.a aVar = p079h8.q.f21862r;
            eVar.resumeWith(p079h8.q.b(A.f21846a));
        }
    }

    public final void l(p129m8.e eVar) {
        this.f1163t = eVar;
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i10 = this.f1160q;
        if (i10 == 0 || i10 == 1) {
            return h();
        }
        if (i10 == 2) {
            this.f1160q = 1;
            Iterator it = this.f1162s;
            kotlin.jvm.internal.n.e(it);
            return it.next();
        }
        if (i10 != 3) {
            throw g();
        }
        this.f1160q = 0;
        Object obj = this.f1161r;
        this.f1161r = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p129m8.e
    public void resumeWith(Object obj) {
        p079h8.r.b(obj);
        this.f1160q = 4;
    }
}

package p210v;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p229w8.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Iterator, a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final u[] f28051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f28052r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f28053s = true;

    public e(t tVar, u[] uVarArr) {
        this.f28051q = uVarArr;
        uVarArr[0].l(tVar.p(), tVar.m() * 2);
        this.f28052r = 0;
        d();
    }

    private final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void d() {
        if (this.f28051q[this.f28052r].g()) {
            return;
        }
        for (int i10 = this.f28052r; -1 < i10; i10--) {
            int iG = g(i10);
            if (iG == -1 && this.f28051q[i10].h()) {
                this.f28051q[i10].k();
                iG = g(i10);
            }
            if (iG != -1) {
                this.f28052r = iG;
                return;
            }
            if (i10 > 0) {
                this.f28051q[i10 - 1].k();
            }
            this.f28051q[i10].l(t.f28071e.a().p(), 0);
        }
        this.f28053s = false;
    }

    private final int g(int i10) {
        if (this.f28051q[i10].g()) {
            return i10;
        }
        if (!this.f28051q[i10].h()) {
            return -1;
        }
        t tVarC = this.f28051q[i10].c();
        if (i10 == 6) {
            this.f28051q[i10 + 1].l(tVarC.p(), tVarC.p().length);
        } else {
            this.f28051q[i10 + 1].l(tVarC.p(), tVarC.m() * 2);
        }
        return g(i10 + 1);
    }

    protected final Object c() {
        a();
        return this.f28051q[this.f28052r].a();
    }

    protected final u[] f() {
        return this.f28051q;
    }

    protected final void h(int i10) {
        this.f28052r = i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f28053s;
    }

    @Override // java.util.Iterator
    public Object next() {
        a();
        Object next = this.f28051q[this.f28052r].next();
        d();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

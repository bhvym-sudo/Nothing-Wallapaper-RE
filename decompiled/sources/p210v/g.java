package p210v;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.n;
import p229w8.a;

/* JADX INFO: loaded from: classes.dex */
public class g extends e implements Iterator, a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final f f28060t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Object f28061u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f28062v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f28063w;

    public g(f fVar, u[] uVarArr) {
        super(fVar.h(), uVarArr);
        this.f28060t = fVar;
        this.f28063w = fVar.g();
    }

    private final void i() {
        if (this.f28060t.g() != this.f28063w) {
            throw new ConcurrentModificationException();
        }
    }

    private final void k() {
        if (!this.f28062v) {
            throw new IllegalStateException();
        }
    }

    private final void l(int i10, t tVar, Object obj, int i11) {
        int i12 = i11 * 5;
        if (i12 > 30) {
            f()[i11].m(tVar.p(), tVar.p().length, 0);
            while (!n.d(f()[i11].a(), obj)) {
                f()[i11].i();
            }
            h(i11);
            return;
        }
        int iF = 1 << x.f(i10, i12);
        if (tVar.q(iF)) {
            f()[i11].m(tVar.p(), tVar.m() * 2, tVar.n(iF));
            h(i11);
        } else {
            int iO = tVar.O(iF);
            t tVarN = tVar.N(iO);
            f()[i11].m(tVar.p(), tVar.m() * 2, iO);
            l(i10, tVarN, obj, i11 + 1);
        }
    }

    public final void m(Object obj, Object obj2) {
        if (this.f28060t.containsKey(obj)) {
            if (hasNext()) {
                Object objC = c();
                this.f28060t.put(obj, obj2);
                l(objC != null ? objC.hashCode() : 0, this.f28060t.h(), objC, 0);
            } else {
                this.f28060t.put(obj, obj2);
            }
            this.f28063w = this.f28060t.g();
        }
    }

    @Override // p210v.e, java.util.Iterator
    public Object next() {
        i();
        this.f28061u = c();
        this.f28062v = true;
        return super.next();
    }

    @Override // p210v.e, java.util.Iterator
    public void remove() {
        k();
        if (hasNext()) {
            Object objC = c();
            I.c(this.f28060t).remove(this.f28061u);
            l(objC != null ? objC.hashCode() : 0, this.f28060t.h(), objC, 0);
        } else {
            I.c(this.f28060t).remove(this.f28061u);
        }
        this.f28061u = null;
        this.f28062v = false;
        this.f28063w = this.f28060t.g();
    }
}

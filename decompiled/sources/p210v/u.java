package p210v;

import java.util.Iterator;
import kotlin.jvm.internal.n;
import p229w8.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class u implements Iterator, a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Object[] f28080q = t.f28071e.a().p();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f28081r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f28082s;

    public final Object a() {
        p230x.a.a(g());
        return this.f28080q[this.f28082s];
    }

    public final t c() {
        p230x.a.a(h());
        Object obj = this.f28080q[this.f28082s];
        n.f(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    protected final Object[] d() {
        return this.f28080q;
    }

    protected final int f() {
        return this.f28082s;
    }

    public final boolean g() {
        return this.f28082s < this.f28081r;
    }

    public final boolean h() {
        p230x.a.a(this.f28082s >= this.f28081r);
        return this.f28082s < this.f28080q.length;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return g();
    }

    public final void i() {
        p230x.a.a(g());
        this.f28082s += 2;
    }

    public final void k() {
        p230x.a.a(h());
        this.f28082s++;
    }

    public final void l(Object[] objArr, int i10) {
        m(objArr, i10, 0);
    }

    public final void m(Object[] objArr, int i10, int i11) {
        this.f28080q = objArr;
        this.f28081r = i10;
        this.f28082s = i11;
    }

    protected final void n(int i10) {
        this.f28082s = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

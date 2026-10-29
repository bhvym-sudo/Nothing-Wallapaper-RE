package p089i8;

import java.util.Iterator;
import kotlin.jvm.internal.n;
import p229w8.a;

/* JADX INFO: loaded from: classes2.dex */
public final class J implements Iterable, a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p219v8.a f22255q;

    public J(p219v8.a iteratorFactory) {
        n.h(iteratorFactory, "iteratorFactory");
        this.f22255q = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new K((Iterator) this.f22255q.invoke());
    }
}

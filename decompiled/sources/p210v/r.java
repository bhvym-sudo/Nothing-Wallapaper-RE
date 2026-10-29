package p210v;

import java.util.Iterator;
import p089i8.AbstractC1428b;
import p200u.b;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC1428b implements b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final d f28070q;

    public r(d dVar) {
        this.f28070q = dVar;
    }

    @Override // p089i8.AbstractC1428b
    public int b() {
        return this.f28070q.size();
    }

    @Override // p089i8.AbstractC1428b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f28070q.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new s(this.f28070q.o());
    }
}

package p210v;

import java.util.Iterator;
import p089i8.AbstractC1436j;
import p200u.c;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC1436j implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final d f28069r;

    public p(d dVar) {
        this.f28069r = dVar;
    }

    @Override // p089i8.AbstractC1428b
    public int b() {
        return this.f28069r.size();
    }

    @Override // p089i8.AbstractC1428b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f28069r.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new q(this.f28069r.o());
    }
}

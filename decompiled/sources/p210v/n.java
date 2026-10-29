package p210v;

import java.util.Iterator;
import java.util.Map;
import p089i8.AbstractC1436j;
import p200u.c;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC1436j implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final d f28068r;

    public n(d dVar) {
        this.f28068r = dVar;
    }

    @Override // p089i8.AbstractC1428b
    public int b() {
        return this.f28068r.size();
    }

    @Override // p089i8.AbstractC1428b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return g((Map.Entry) obj);
        }
        return false;
    }

    public boolean g(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object obj = this.f28068r.get(entry.getKey());
        if (obj != null) {
            return kotlin.jvm.internal.n.d(obj, entry.getValue());
        }
        return entry.getValue() == null && this.f28068r.containsKey(entry.getKey());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new o(this.f28068r.o());
    }
}

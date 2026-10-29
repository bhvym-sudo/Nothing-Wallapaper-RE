package p175r4;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: r4.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1855m5 extends E {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ C1876o6 f26838q;

    C1855m5(C1876o6 c1876o6) {
        this.f26838q = c1876o6;
    }

    @Override // p175r4.E
    final Map a() {
        return this.f26838q;
    }

    @Override // p175r4.E, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f26838q.f26891s.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new N5(this.f26838q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        C1876o6 c1876o6 = this.f26838q;
        G9.n(c1876o6.f26892t, entry.getKey());
        return true;
    }
}

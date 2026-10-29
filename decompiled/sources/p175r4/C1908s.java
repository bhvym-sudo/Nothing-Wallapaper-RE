package p175r4;

import java.io.Serializable;

/* JADX INFO: renamed from: r4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1908s extends H9 implements Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Object f27332q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Object f27333r;

    C1908s(Object obj, Object obj2) {
        this.f27332q = obj;
        this.f27333r = obj2;
    }

    @Override // p175r4.H9, java.util.Map.Entry
    public final Object getKey() {
        return this.f27332q;
    }

    @Override // p175r4.H9, java.util.Map.Entry
    public final Object getValue() {
        return this.f27333r;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}

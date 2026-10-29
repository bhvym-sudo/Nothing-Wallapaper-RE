package p175r4;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes.dex */
final class N extends AbstractC1948w {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ O f26082t;

    N(O o9) {
        this.f26082t = o9;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        AbstractC1811i3.a(i10, this.f26082t.f26102u, "index");
        O o9 = this.f26082t;
        int i11 = i10 + i10;
        Object obj = o9.f26101t[i11];
        obj.getClass();
        Object obj2 = o9.f26101t[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26082t.f26102u;
    }
}

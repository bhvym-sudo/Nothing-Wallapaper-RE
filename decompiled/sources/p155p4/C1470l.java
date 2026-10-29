package p155p4;

import java.util.List;

/* JADX INFO: renamed from: p4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1470l extends AbstractC1471m {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final transient int f23732t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final transient int f23733u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final /* synthetic */ AbstractC1471m f23734v;

    C1470l(AbstractC1471m abstractC1471m, int i10, int i11) {
        this.f23734v = abstractC1471m;
        this.f23732t = i10;
        this.f23733u = i11;
    }

    @Override // p155p4.AbstractC1468j
    final int b() {
        return this.f23734v.e() + this.f23732t + this.f23733u;
    }

    @Override // p155p4.AbstractC1468j
    final int e() {
        return this.f23734v.e() + this.f23732t;
    }

    @Override // p155p4.AbstractC1468j
    final Object[] f() {
        return this.f23734v.f();
    }

    @Override // p155p4.AbstractC1471m
    /* JADX INFO: renamed from: g */
    public final AbstractC1471m subList(int i10, int i11) {
        AbstractC1461c.c(i10, i11, this.f23733u);
        int i12 = this.f23732t;
        return this.f23734v.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC1461c.a(i10, this.f23733u, "index");
        return this.f23734v.get(i10 + this.f23732t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23733u;
    }

    @Override // p155p4.AbstractC1471m, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}

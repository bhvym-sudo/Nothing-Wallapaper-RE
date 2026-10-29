package p165q4;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class M5 extends N5 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final transient int f24297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final transient int f24298t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final /* synthetic */ N5 f24299u;

    M5(N5 n9, int i10, int i11) {
        this.f24299u = n9;
        this.f24297s = i10;
        this.f24298t = i11;
    }

    @Override // p165q4.M4
    final int b() {
        return this.f24299u.e() + this.f24297s + this.f24298t;
    }

    @Override // p165q4.M4
    final int e() {
        return this.f24299u.e() + this.f24297s;
    }

    @Override // p165q4.M4
    final Object[] f() {
        return this.f24299u.f();
    }

    @Override // p165q4.N5
    /* JADX INFO: renamed from: g */
    public final N5 subList(int i10, int i11) {
        G1.c(i10, i11, this.f24298t);
        N5 n9 = this.f24299u;
        int i12 = this.f24297s;
        return n9.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f24298t, "index");
        return this.f24299u.get(i10 + this.f24297s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24298t;
    }

    @Override // p165q4.N5, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}

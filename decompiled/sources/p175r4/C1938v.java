package p175r4;

import java.util.List;

/* JADX INFO: renamed from: r4.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1938v extends AbstractC1948w {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final transient int f27413t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final transient int f27414u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final /* synthetic */ AbstractC1948w f27415v;

    C1938v(AbstractC1948w abstractC1948w, int i10, int i11) {
        this.f27415v = abstractC1948w;
        this.f27413t = i10;
        this.f27414u = i11;
    }

    @Override // p175r4.r
    final int b() {
        return this.f27415v.e() + this.f27413t + this.f27414u;
    }

    @Override // p175r4.r
    final int e() {
        return this.f27415v.e() + this.f27413t;
    }

    @Override // p175r4.r
    final Object[] f() {
        return this.f27415v.f();
    }

    @Override // p175r4.AbstractC1948w
    /* JADX INFO: renamed from: g */
    public final AbstractC1948w subList(int i10, int i11) {
        AbstractC1811i3.c(i10, i11, this.f27414u);
        int i12 = this.f27413t;
        return this.f27415v.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC1811i3.a(i10, this.f27414u, "index");
        return this.f27415v.get(i10 + this.f27413t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27414u;
    }

    @Override // p175r4.AbstractC1948w, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}

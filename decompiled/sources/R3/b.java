package R3;

import M3.m;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class b implements U3.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f7077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f7078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M3.h f7079c;

    private b(c cVar, m mVar, M3.h hVar) {
        this.f7077a = cVar;
        this.f7078b = mVar;
        this.f7079c = hVar;
    }

    public static U3.b.a b(c cVar, m mVar, M3.h hVar) {
        return new b(cVar, mVar, hVar);
    }

    @Override // U3.b.a
    public Object a() {
        return c.b(this.f7077a, this.f7078b, this.f7079c);
    }
}

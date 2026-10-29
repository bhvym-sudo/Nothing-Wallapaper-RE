package M3;

/* JADX INFO: loaded from: classes.dex */
public final class t implements O3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p069g8.a f4986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p069g8.a f4987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p069g8.a f4988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p069g8.a f4989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p069g8.a f4990e;

    public t(p069g8.a aVar, p069g8.a aVar2, p069g8.a aVar3, p069g8.a aVar4, p069g8.a aVar5) {
        this.f4986a = aVar;
        this.f4987b = aVar2;
        this.f4988c = aVar3;
        this.f4989d = aVar4;
        this.f4990e = aVar5;
    }

    public static t a(p069g8.a aVar, p069g8.a aVar2, p069g8.a aVar3, p069g8.a aVar4, p069g8.a aVar5) {
        return new t(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static r c(V3.a aVar, V3.a aVar2, R3.e eVar, S3.j jVar, S3.n nVar) {
        return new r(aVar, aVar2, eVar, jVar, nVar);
    }

    @Override // p069g8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((V3.a) this.f4986a.get(), (V3.a) this.f4987b.get(), (R3.e) this.f4988c.get(), (S3.j) this.f4989d.get(), (S3.n) this.f4990e.get());
    }
}

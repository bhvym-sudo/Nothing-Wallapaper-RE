package T3;

/* JADX INFO: loaded from: classes.dex */
public final class C implements O3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p069g8.a f7623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p069g8.a f7624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p069g8.a f7625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p069g8.a f7626d;

    public C(p069g8.a aVar, p069g8.a aVar2, p069g8.a aVar3, p069g8.a aVar4) {
        this.f7623a = aVar;
        this.f7624b = aVar2;
        this.f7625c = aVar3;
        this.f7626d = aVar4;
    }

    public static C a(p069g8.a aVar, p069g8.a aVar2, p069g8.a aVar3, p069g8.a aVar4) {
        return new C(aVar, aVar2, aVar3, aVar4);
    }

    public static B c(V3.a aVar, V3.a aVar2, Object obj, Object obj2) {
        return new B(aVar, aVar2, (AbstractC0950d) obj, (H) obj2);
    }

    @Override // p069g8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public B get() {
        return c((V3.a) this.f7623a.get(), (V3.a) this.f7624b.get(), this.f7625c.get(), this.f7626d.get());
    }
}

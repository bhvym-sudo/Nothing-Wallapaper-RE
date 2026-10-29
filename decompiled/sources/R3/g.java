package R3;

/* JADX INFO: loaded from: classes.dex */
public final class g implements O3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p069g8.a f7091a;

    public g(p069g8.a aVar) {
        this.f7091a = aVar;
    }

    public static S3.d a(V3.a aVar) {
        return (S3.d) O3.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(p069g8.a aVar) {
        return new g(aVar);
    }

    @Override // p069g8.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public S3.d get() {
        return a((V3.a) this.f7091a.get());
    }
}

package S3;

import T3.InterfaceC0949c;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o implements O3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p069g8.a f7278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p069g8.a f7279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p069g8.a f7280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p069g8.a f7281d;

    public o(p069g8.a aVar, p069g8.a aVar2, p069g8.a aVar3, p069g8.a aVar4) {
        this.f7278a = aVar;
        this.f7279b = aVar2;
        this.f7280c = aVar3;
        this.f7281d = aVar4;
    }

    public static o a(p069g8.a aVar, p069g8.a aVar2, p069g8.a aVar3, p069g8.a aVar4) {
        return new o(aVar, aVar2, aVar3, aVar4);
    }

    public static n c(Executor executor, InterfaceC0949c interfaceC0949c, p pVar, U3.b bVar) {
        return new n(executor, interfaceC0949c, pVar, bVar);
    }

    @Override // p069g8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c((Executor) this.f7278a.get(), (InterfaceC0949c) this.f7279b.get(), (p) this.f7280c.get(), (U3.b) this.f7281d.get());
    }
}

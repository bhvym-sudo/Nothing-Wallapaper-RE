package R3;

import S3.p;
import T3.InterfaceC0949c;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d implements O3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p069g8.a f7086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p069g8.a f7087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p069g8.a f7088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p069g8.a f7089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p069g8.a f7090e;

    public d(p069g8.a aVar, p069g8.a aVar2, p069g8.a aVar3, p069g8.a aVar4, p069g8.a aVar5) {
        this.f7086a = aVar;
        this.f7087b = aVar2;
        this.f7088c = aVar3;
        this.f7089d = aVar4;
        this.f7090e = aVar5;
    }

    public static d a(p069g8.a aVar, p069g8.a aVar2, p069g8.a aVar3, p069g8.a aVar4, p069g8.a aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, N3.e eVar, p pVar, InterfaceC0949c interfaceC0949c, U3.b bVar) {
        return new c(executor, eVar, pVar, interfaceC0949c, bVar);
    }

    @Override // p069g8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Executor) this.f7086a.get(), (N3.e) this.f7087b.get(), (p) this.f7088c.get(), (InterfaceC0949c) this.f7089d.get(), (U3.b) this.f7090e.get());
    }
}

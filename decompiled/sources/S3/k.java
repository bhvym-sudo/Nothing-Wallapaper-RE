package S3;

import T3.InterfaceC0949c;
import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k implements O3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p069g8.a f7265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p069g8.a f7266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p069g8.a f7267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p069g8.a f7268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p069g8.a f7269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p069g8.a f7270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p069g8.a f7271g;

    public k(p069g8.a aVar, p069g8.a aVar2, p069g8.a aVar3, p069g8.a aVar4, p069g8.a aVar5, p069g8.a aVar6, p069g8.a aVar7) {
        this.f7265a = aVar;
        this.f7266b = aVar2;
        this.f7267c = aVar3;
        this.f7268d = aVar4;
        this.f7269e = aVar5;
        this.f7270f = aVar6;
        this.f7271g = aVar7;
    }

    public static k a(p069g8.a aVar, p069g8.a aVar2, p069g8.a aVar3, p069g8.a aVar4, p069g8.a aVar5, p069g8.a aVar6, p069g8.a aVar7) {
        return new k(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static j c(Context context, N3.e eVar, InterfaceC0949c interfaceC0949c, p pVar, Executor executor, U3.b bVar, V3.a aVar) {
        return new j(context, eVar, interfaceC0949c, pVar, executor, bVar, aVar);
    }

    @Override // p069g8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c((Context) this.f7265a.get(), (N3.e) this.f7266b.get(), (InterfaceC0949c) this.f7267c.get(), (p) this.f7268d.get(), (Executor) this.f7269e.get(), (U3.b) this.f7270f.get(), (V3.a) this.f7271g.get());
    }
}

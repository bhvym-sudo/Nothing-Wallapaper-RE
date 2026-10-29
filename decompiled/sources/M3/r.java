package M3;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class r implements q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile s f4981e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V3.a f4982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V3.a f4983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final R3.e f4984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S3.j f4985d;

    r(V3.a aVar, V3.a aVar2, R3.e eVar, S3.j jVar, S3.n nVar) {
        this.f4982a = aVar;
        this.f4983b = aVar2;
        this.f4984c = eVar;
        this.f4985d = jVar;
        nVar.a();
    }

    private h b(l lVar) {
        return h.a().i(this.f4982a.a()).k(this.f4983b.a()).j(lVar.g()).h(new g(lVar.b(), lVar.d())).g(lVar.c().a()).d();
    }

    public static r c() {
        s sVar = f4981e;
        if (sVar != null) {
            return sVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(e eVar) {
        return eVar instanceof f ? Collections.unmodifiableSet(((f) eVar).a()) : Collections.singleton(K3.b.b("proto"));
    }

    public static void f(Context context) {
        if (f4981e == null) {
            synchronized (r.class) {
                try {
                    if (f4981e == null) {
                        f4981e = d.f().a(context).build();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // M3.q
    public void a(l lVar, K3.h hVar) {
        this.f4984c.a(lVar.f().e(lVar.c().c()), b(lVar), hVar);
    }

    public S3.j e() {
        return this.f4985d;
    }

    public K3.g g(e eVar) {
        return new n(d(eVar), m.a().b(eVar.getName()).c(eVar.getExtras()).a(), this);
    }
}

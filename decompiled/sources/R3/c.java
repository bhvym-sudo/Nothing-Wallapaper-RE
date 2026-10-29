package R3;

import M3.m;
import M3.r;
import S3.p;
import T3.InterfaceC0949c;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f7080f = Logger.getLogger(r.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f7081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f7082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N3.e f7083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0949c f7084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final U3.b f7085e;

    public c(Executor executor, N3.e eVar, p pVar, InterfaceC0949c interfaceC0949c, U3.b bVar) {
        this.f7082b = executor;
        this.f7083c = eVar;
        this.f7081a = pVar;
        this.f7084d = interfaceC0949c;
        this.f7085e = bVar;
    }

    static /* synthetic */ Object b(c cVar, m mVar, M3.h hVar) {
        cVar.f7084d.n0(mVar, hVar);
        cVar.f7081a.b(mVar, 1);
        return null;
    }

    static /* synthetic */ void c(c cVar, m mVar, K3.h hVar, M3.h hVar2) {
        try {
            N3.m mVar2 = cVar.f7083c.get(mVar.b());
            if (mVar2 == null) {
                String str = String.format("Transport backend '%s' is not registered", mVar.b());
                f7080f.warning(str);
                hVar.a(new IllegalArgumentException(str));
            } else {
                cVar.f7085e.a(b.b(cVar, mVar, mVar2.a(hVar2)));
                hVar.a(null);
            }
        } catch (Exception e10) {
            f7080f.warning("Error scheduling event " + e10.getMessage());
            hVar.a(e10);
        }
    }

    @Override // R3.e
    public void a(m mVar, M3.h hVar, K3.h hVar2) {
        this.f7082b.execute(a.a(this, mVar, hVar2, hVar));
    }
}

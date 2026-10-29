package S3;

import T3.InterfaceC0949c;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f7274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0949c f7275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f7276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U3.b f7277d;

    n(Executor executor, InterfaceC0949c interfaceC0949c, p pVar, U3.b bVar) {
        this.f7274a = executor;
        this.f7275b = interfaceC0949c;
        this.f7276c = pVar;
        this.f7277d = bVar;
    }

    static /* synthetic */ Object b(n nVar) {
        Iterator it = nVar.f7275b.H().iterator();
        while (it.hasNext()) {
            nVar.f7276c.b((M3.m) it.next(), 1);
        }
        return null;
    }

    public void a() {
        this.f7274a.execute(l.a(this));
    }
}

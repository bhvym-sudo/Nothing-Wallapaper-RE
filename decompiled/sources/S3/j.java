package S3;

import T3.AbstractC0955i;
import T3.InterfaceC0949c;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N3.e f7259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0949c f7260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f7261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f7262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final U3.b f7263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V3.a f7264g;

    public j(Context context, N3.e eVar, InterfaceC0949c interfaceC0949c, p pVar, Executor executor, U3.b bVar, V3.a aVar) {
        this.f7258a = context;
        this.f7259b = eVar;
        this.f7260c = interfaceC0949c;
        this.f7261d = pVar;
        this.f7262e = executor;
        this.f7263f = bVar;
        this.f7264g = aVar;
    }

    static /* synthetic */ Object c(j jVar, N3.g gVar, Iterable iterable, M3.m mVar, int i10) {
        if (gVar.c() == N3.g.a.TRANSIENT_ERROR) {
            jVar.f7260c.V0(iterable);
            jVar.f7261d.b(mVar, i10 + 1);
            return null;
        }
        jVar.f7260c.i(iterable);
        if (gVar.c() == N3.g.a.OK) {
            jVar.f7260c.c0(mVar, jVar.f7264g.a() + gVar.b());
        }
        if (!jVar.f7260c.i0(mVar)) {
            return null;
        }
        jVar.f7261d.a(mVar, 1, true);
        return null;
    }

    static /* synthetic */ Object d(j jVar, M3.m mVar, int i10) {
        jVar.f7261d.b(mVar, i10 + 1);
        return null;
    }

    static /* synthetic */ void e(j jVar, M3.m mVar, int i10, Runnable runnable) {
        try {
            U3.b bVar = jVar.f7263f;
            InterfaceC0949c interfaceC0949c = jVar.f7260c;
            interfaceC0949c.getClass();
            bVar.a(h.b(interfaceC0949c));
            if (jVar.a()) {
                jVar.f(mVar, i10);
            } else {
                jVar.f7263f.a(i.b(jVar, mVar, i10));
            }
        } catch (U3.a unused) {
            jVar.f7261d.b(mVar, i10 + 1);
        } finally {
            runnable.run();
        }
    }

    boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f7258a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    void f(M3.m mVar, int i10) {
        N3.g gVarB;
        N3.m mVar2 = this.f7259b.get(mVar.b());
        Iterable iterable = (Iterable) this.f7263f.a(f.b(this, mVar));
        if (iterable.iterator().hasNext()) {
            if (mVar2 == null) {
                P3.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", mVar);
                gVarB = N3.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC0955i) it.next()).b());
                }
                gVarB = mVar2.b(N3.f.a().b(arrayList).c(mVar.c()).a());
            }
            this.f7263f.a(g.b(this, gVarB, iterable, mVar, i10));
        }
    }

    public void g(M3.m mVar, int i10, Runnable runnable) {
        this.f7262e.execute(e.a(this, mVar, i10, runnable));
    }
}

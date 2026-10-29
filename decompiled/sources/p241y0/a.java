package p241y0;

import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.c f30099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f30100b;

    /* JADX INFO: renamed from: y0.a$a, reason: collision with other inner class name */
    class RunnableC0741a implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ g.c f30101q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Typeface f30102r;

        RunnableC0741a(g.c cVar, Typeface typeface) {
            this.f30101q = cVar;
            this.f30102r = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30101q.b(this.f30102r);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ g.c f30104q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f30105r;

        b(g.c cVar, int i10) {
            this.f30104q = cVar;
            this.f30105r = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f30104q.a(this.f30105r);
        }
    }

    a(g.c cVar, Executor executor) {
        this.f30099a = cVar;
        this.f30100b = executor;
    }

    private void a(int i10) {
        this.f30100b.execute(new b(this.f30099a, i10));
    }

    private void c(Typeface typeface) {
        this.f30100b.execute(new RunnableC0741a(this.f30099a, typeface));
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f30133a);
        } else {
            a(eVar.f30134b);
        }
    }
}

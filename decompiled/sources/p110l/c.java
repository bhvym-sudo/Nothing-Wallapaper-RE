package p110l;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile c f22805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f22806d = new Executor() { // from class: l.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().c(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f22807e = new Executor() { // from class: l.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f22808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f22809b;

    private c() {
        d dVar = new d();
        this.f22809b = dVar;
        this.f22808a = dVar;
    }

    public static Executor f() {
        return f22807e;
    }

    public static c g() {
        if (f22805c != null) {
            return f22805c;
        }
        synchronized (c.class) {
            try {
                if (f22805c == null) {
                    f22805c = new c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f22805c;
    }

    @Override // p110l.e
    public void a(Runnable runnable) {
        this.f22808a.a(runnable);
    }

    @Override // p110l.e
    public boolean b() {
        return this.f22808a.b();
    }

    @Override // p110l.e
    public void c(Runnable runnable) {
        this.f22808a.c(runnable);
    }
}

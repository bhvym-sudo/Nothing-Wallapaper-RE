package K8;

import F8.InterfaceC0807d0;
import F8.InterfaceC0822l;
import F8.S;
import F8.V;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: K8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0918k extends F8.I implements V {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4169y = AtomicIntegerFieldUpdater.newUpdater(C0918k.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final /* synthetic */ V f4170s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final F8.I f4171t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f4172u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f4173v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final C0923p f4174w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Object f4175x;

    /* JADX INFO: renamed from: K8.k$a */
    private final class a implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Runnable f4176q;

        public a(Runnable runnable) {
            this.f4176q = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f4176q.run();
                } catch (Throwable th) {
                    F8.K.a(p129m8.j.f23252q, th);
                }
                Runnable runnableO1 = C0918k.this.o1();
                if (runnableO1 == null) {
                    return;
                }
                this.f4176q = runnableO1;
                i10++;
                if (i10 >= 16 && AbstractC0916i.d(C0918k.this.f4171t, C0918k.this)) {
                    AbstractC0916i.c(C0918k.this.f4171t, C0918k.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0918k(F8.I i10, int i11, String str) {
        V v9 = i10 instanceof V ? (V) i10 : null;
        this.f4170s = v9 == null ? S.a() : v9;
        this.f4171t = i10;
        this.f4172u = i11;
        this.f4173v = str;
        this.f4174w = new C0923p(false);
        this.f4175x = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable o1() {
        while (true) {
            Runnable runnable = (Runnable) this.f4174w.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f4175x) {
                f4169y.decrementAndGet(this);
                if (this.f4174w.c() == 0) {
                    return null;
                }
                f4169y.incrementAndGet(this);
            }
        }
    }

    private final boolean p1() {
        synchronized (this.f4175x) {
            if (f4169y.get(this) >= this.f4172u) {
                return false;
            }
            f4169y.incrementAndGet(this);
            return true;
        }
    }

    @Override // F8.V
    public void T0(long j9, InterfaceC0822l interfaceC0822l) {
        this.f4170s.T0(j9, interfaceC0822l);
    }

    @Override // F8.V
    public InterfaceC0807d0 W0(long j9, Runnable runnable, p129m8.i iVar) {
        return this.f4170s.W0(j9, runnable, iVar);
    }

    @Override // F8.I
    public void g1(p129m8.i iVar, Runnable runnable) {
        Runnable runnableO1;
        this.f4174w.a(runnable);
        if (f4169y.get(this) >= this.f4172u || !p1() || (runnableO1 = o1()) == null) {
            return;
        }
        AbstractC0916i.c(this.f4171t, this, new a(runnableO1));
    }

    @Override // F8.I
    public void h1(p129m8.i iVar, Runnable runnable) {
        Runnable runnableO1;
        this.f4174w.a(runnable);
        if (f4169y.get(this) >= this.f4172u || !p1() || (runnableO1 = o1()) == null) {
            return;
        }
        this.f4171t.h1(this, new a(runnableO1));
    }

    @Override // F8.I
    public F8.I j1(int i10, String str) {
        AbstractC0919l.a(i10);
        return i10 >= this.f4172u ? AbstractC0919l.b(this, str) : super.j1(i10, str);
    }

    @Override // F8.I
    public String toString() {
        String str = this.f4173v;
        if (str != null) {
            return str;
        }
        return this.f4171t + ".limitedParallelism(" + this.f4172u + ')';
    }
}

package androidx.compose.ui.platform;

import F8.AbstractC0812g;
import F8.C0803b0;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.C1438l;
import p170r.InterfaceC1669a0;

/* JADX INFO: loaded from: classes.dex */
public final class D extends F8.I {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final c f11685C = new c(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f11686D = 8;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final p079h8.h f11687E = p079h8.i.b(a.f11699r);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final ThreadLocal f11688F = new b();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final d f11689A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final InterfaceC1669a0 f11690B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Choreographer f11691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Handler f11692t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f11693u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C1438l f11694v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f11695w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List f11696x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f11697y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f11698z;

    static final class a extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f11699r = new a();

        /* JADX INFO: renamed from: androidx.compose.ui.platform.D$a$a, reason: collision with other inner class name */
        static final class C0374a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f11700q;

            C0374a(p129m8.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new C0374a(eVar);
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((C0374a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f11700q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                return Choreographer.getInstance();
            }
        }

        a() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p129m8.i invoke() {
            D d10 = new D(E.b() ? Choreographer.getInstance() : (Choreographer) AbstractC0812g.e(C0803b0.c(), new C0374a(null)), p231x0.g.a(Looper.getMainLooper()), null);
            return d10.z(d10.u1());
        }
    }

    public static final class b extends ThreadLocal {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p129m8.i initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            D d10 = new D(choreographer, p231x0.g.a(looperMyLooper), null);
            return d10.z(d10.u1());
        }
    }

    public static final class c {
        public /* synthetic */ c(AbstractC1457h abstractC1457h) {
            this();
        }

        public final p129m8.i a() {
            if (E.b()) {
                return b();
            }
            p129m8.i iVar = (p129m8.i) D.f11688F.get();
            if (iVar != null) {
                return iVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final p129m8.i b() {
            return (p129m8.i) D.f11687E.getValue();
        }

        private c() {
        }
    }

    public static final class d implements Choreographer.FrameCallback, Runnable {
        d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j9) {
            D.this.f11692t.removeCallbacks(this);
            D.this.x1();
            D.this.w1(j9);
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.x1();
            Object obj = D.this.f11693u;
            D d10 = D.this;
            synchronized (obj) {
                try {
                    if (d10.f11695w.isEmpty()) {
                        d10.t1().removeFrameCallback(this);
                        d10.f11698z = false;
                    }
                    p079h8.A a10 = p079h8.A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ D(Choreographer choreographer, Handler handler, AbstractC1457h abstractC1457h) {
        this(choreographer, handler);
    }

    private final Runnable v1() {
        Runnable runnable;
        synchronized (this.f11693u) {
            runnable = (Runnable) this.f11694v.t();
        }
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w1(long j9) {
        synchronized (this.f11693u) {
            if (this.f11698z) {
                this.f11698z = false;
                List list = this.f11695w;
                this.f11695w = this.f11696x;
                this.f11696x = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) list.get(i10)).doFrame(j9);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1() {
        boolean z9;
        do {
            Runnable runnableV1 = v1();
            while (runnableV1 != null) {
                runnableV1.run();
                runnableV1 = v1();
            }
            synchronized (this.f11693u) {
                if (this.f11694v.isEmpty()) {
                    z9 = false;
                    this.f11697y = false;
                } else {
                    z9 = true;
                }
            }
        } while (z9);
    }

    @Override // F8.I
    public void g1(p129m8.i iVar, Runnable runnable) {
        synchronized (this.f11693u) {
            try {
                this.f11694v.addLast(runnable);
                if (!this.f11697y) {
                    this.f11697y = true;
                    this.f11692t.post(this.f11689A);
                    if (!this.f11698z) {
                        this.f11698z = true;
                        this.f11691s.postFrameCallback(this.f11689A);
                    }
                }
                p079h8.A a10 = p079h8.A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Choreographer t1() {
        return this.f11691s;
    }

    public final InterfaceC1669a0 u1() {
        return this.f11690B;
    }

    public final void y1(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f11693u) {
            try {
                this.f11695w.add(frameCallback);
                if (!this.f11698z) {
                    this.f11698z = true;
                    this.f11691s.postFrameCallback(this.f11689A);
                }
                p079h8.A a10 = p079h8.A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z1(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f11693u) {
            this.f11695w.remove(frameCallback);
        }
    }

    private D(Choreographer choreographer, Handler handler) {
        this.f11691s = choreographer;
        this.f11692t = handler;
        this.f11693u = new Object();
        this.f11694v = new C1438l();
        this.f11695w = new ArrayList();
        this.f11696x = new ArrayList();
        this.f11689A = new d();
        this.f11690B = new F(choreographer, this);
    }
}

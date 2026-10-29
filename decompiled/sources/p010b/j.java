package p010b;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.core.view.C1082n;
import androidx.core.view.InterfaceC1081m;
import androidx.core.view.InterfaceC1084p;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.C1165z;
import androidx.lifecycle.InterfaceC1155o;
import androidx.lifecycle.InterfaceC1160u;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.O;
import androidx.lifecycle.U;
import androidx.lifecycle.X;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.o;
import p079h8.A;
import p161q0.m;
import p161q0.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends p161q0.f implements InterfaceC1163x, f0, InterfaceC1155o, p082i1.f, w, p030d.f, p171r0.b, p171r0.c, m, n, InterfaceC1081m, t {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final c f14466L = new c(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final p030d.e f14467A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final CopyOnWriteArrayList f14468B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final CopyOnWriteArrayList f14469C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final CopyOnWriteArrayList f14470D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final CopyOnWriteArrayList f14471E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final CopyOnWriteArrayList f14472F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final CopyOnWriteArrayList f14473G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f14474H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f14475I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final p079h8.h f14476J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final p079h8.h f14477K;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final p020c.a f14478s = new p020c.a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C1082n f14479t = new C1082n(new Runnable() { // from class: b.d
        @Override // java.lang.Runnable
        public final void run() {
            j.h0(this.f14459q);
        }
    });

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p082i1.e f14480u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private e0 f14481v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final e f14482w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final p079h8.h f14483x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f14484y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final AtomicInteger f14485z;

    public static final class a implements InterfaceC1160u {
        a() {
        }

        @Override // androidx.lifecycle.InterfaceC1160u
        public void onStateChanged(InterfaceC1163x source, AbstractC1157q.a event) {
            kotlin.jvm.internal.n.h(source, "source");
            kotlin.jvm.internal.n.h(event, "event");
            j.this.d0();
            j.this.getLifecycle().d(this);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f14487a = new b();

        private b() {
        }

        public final OnBackInvokedDispatcher a(Activity activity) {
            kotlin.jvm.internal.n.h(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            kotlin.jvm.internal.n.g(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    private static final class c {
        public /* synthetic */ c(AbstractC1457h abstractC1457h) {
            this();
        }

        private c() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f14488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e0 f14489b;

        public final e0 a() {
            return this.f14489b;
        }

        public final void b(Object obj) {
            this.f14488a = obj;
        }

        public final void c(e0 e0Var) {
            this.f14489b = e0Var;
        }
    }

    private interface e extends Executor {
        void g();

        void w0(View view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final long f14490q = SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Runnable f14491r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f14492s;

        public f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(f fVar) {
            Runnable runnable = fVar.f14491r;
            if (runnable != null) {
                kotlin.jvm.internal.n.e(runnable);
                runnable.run();
                fVar.f14491r = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            kotlin.jvm.internal.n.h(runnable, "runnable");
            this.f14491r = runnable;
            View decorView = j.this.getWindow().getDecorView();
            kotlin.jvm.internal.n.g(decorView, "window.decorView");
            if (!this.f14492s) {
                decorView.postOnAnimation(new Runnable() { // from class: b.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.f.b(this.f14499q);
                    }
                });
            } else if (kotlin.jvm.internal.n.d(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // b.j.e
        public void g() {
            j.this.getWindow().getDecorView().removeCallbacks(this);
            j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f14491r;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f14490q) {
                    this.f14492s = false;
                    j.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f14491r = null;
            if (j.this.e0().c()) {
                this.f14492s = false;
                j.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // b.j.e
        public void w0(View view) {
            kotlin.jvm.internal.n.h(view, "view");
            if (this.f14492s) {
                return;
            }
            this.f14492s = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public static final class g extends p030d.e {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(g gVar, int i10, p040e.a.C0528a c0528a) {
            gVar.f(i10, c0528a.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(g gVar, int i10, IntentSender.SendIntentException sendIntentException) {
            gVar.e(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // p030d.e
        public void i(final int i10, p040e.a contract, Object obj, p161q0.c cVar) {
            Bundle bundleExtra;
            final int i11;
            kotlin.jvm.internal.n.h(contract, "contract");
            j jVar = j.this;
            final p040e.a.C0528a c0528aB = contract.b(jVar, obj);
            if (c0528aB != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.g.s(this.f14500q, i10, c0528aB);
                    }
                });
                return;
            }
            Intent intentA = contract.a(jVar, obj);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                kotlin.jvm.internal.n.e(extras);
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(jVar.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if (kotlin.jvm.internal.n.d("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                p161q0.a.j(jVar, stringArrayExtra, i10);
                return;
            }
            if (!kotlin.jvm.internal.n.d("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
                p161q0.a.l(jVar, intentA, i10, bundle);
                return;
            }
            p030d.g gVar = (p030d.g) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                kotlin.jvm.internal.n.e(gVar);
                i11 = i10;
                try {
                    p161q0.a.m(jVar, gVar.d(), i11, gVar.a(), gVar.b(), gVar.c(), 0, bundle);
                } catch (IntentSender.SendIntentException e10) {
                    e = e10;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            j.g.t(this.f14503q, i11, sendIntentException);
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                i11 = i10;
            }
        }
    }

    static final class h extends o implements p219v8.a {
        h() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            Application application = j.this.getApplication();
            j jVar = j.this;
            return new X(application, jVar, jVar.getIntent() != null ? j.this.getIntent().getExtras() : null);
        }
    }

    static final class i extends o implements p219v8.a {

        static final class a extends o implements p219v8.a {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ j f14497r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar) {
                super(0);
                this.f14497r = jVar;
            }

            public final void a() {
                this.f14497r.reportFullyDrawn();
            }

            @Override // p219v8.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return A.f21846a;
            }
        }

        i() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke() {
            return new s(j.this.f14482w, new a(j.this));
        }
    }

    /* JADX INFO: renamed from: b.j$j, reason: collision with other inner class name */
    static final class C0422j extends o implements p219v8.a {
        C0422j() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(j jVar) {
            try {
                j.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!kotlin.jvm.internal.n.d(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            } catch (NullPointerException e11) {
                if (!kotlin.jvm.internal.n.d(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e11;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(j jVar, v vVar) {
            jVar.Y(vVar);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final v invoke() {
            final j jVar = j.this;
            final v vVar = new v(new Runnable() { // from class: b.n
                @Override // java.lang.Runnable
                public final void run() {
                    j.C0422j.g(jVar);
                }
            });
            final j jVar2 = j.this;
            if (kotlin.jvm.internal.n.d(Looper.myLooper(), Looper.getMainLooper())) {
                jVar2.Y(vVar);
                return vVar;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b.o
                @Override // java.lang.Runnable
                public final void run() {
                    j.C0422j.h(jVar2, vVar);
                }
            });
            return vVar;
        }
    }

    public j() {
        p082i1.e eVarA = p082i1.e.f21903d.a(this);
        this.f14480u = eVarA;
        this.f14482w = c0();
        this.f14483x = p079h8.i.b(new i());
        this.f14485z = new AtomicInteger();
        this.f14467A = new g();
        this.f14468B = new CopyOnWriteArrayList();
        this.f14469C = new CopyOnWriteArrayList();
        this.f14470D = new CopyOnWriteArrayList();
        this.f14471E = new CopyOnWriteArrayList();
        this.f14472F = new CopyOnWriteArrayList();
        this.f14473G = new CopyOnWriteArrayList();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new InterfaceC1160u() { // from class: b.e
            @Override // androidx.lifecycle.InterfaceC1160u
            public final void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
                j.Q(this.f14460q, interfaceC1163x, aVar);
            }
        });
        getLifecycle().a(new InterfaceC1160u() { // from class: b.f
            @Override // androidx.lifecycle.InterfaceC1160u
            public final void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
                j.R(this.f14461q, interfaceC1163x, aVar);
            }
        });
        getLifecycle().a(new a());
        eVarA.c();
        U.c(this);
        getSavedStateRegistry().h("android:support:activity-result", new i1.d.c() { // from class: b.g
            @Override // i1.d.c
            public final Bundle saveState() {
                return j.S(this.f14462a);
            }
        });
        a0(new p020c.b() { // from class: b.h
            @Override // p020c.b
            public final void a(Context context) {
                j.T(this.f14463a, context);
            }
        });
        this.f14476J = p079h8.i.b(new h());
        this.f14477K = p079h8.i.b(new C0422j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(j jVar, InterfaceC1163x interfaceC1163x, AbstractC1157q.a event) {
        Window window;
        View viewPeekDecorView;
        kotlin.jvm.internal.n.h(interfaceC1163x, "<anonymous parameter 0>");
        kotlin.jvm.internal.n.h(event, "event");
        if (event != AbstractC1157q.a.ON_STOP || (window = jVar.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(j jVar, InterfaceC1163x interfaceC1163x, AbstractC1157q.a event) {
        kotlin.jvm.internal.n.h(interfaceC1163x, "<anonymous parameter 0>");
        kotlin.jvm.internal.n.h(event, "event");
        if (event == AbstractC1157q.a.ON_DESTROY) {
            jVar.f14478s.b();
            if (!jVar.isChangingConfigurations()) {
                jVar.getViewModelStore().a();
            }
            jVar.f14482w.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle S(j jVar) {
        Bundle bundle = new Bundle();
        jVar.f14467A.k(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(j jVar, Context it) {
        kotlin.jvm.internal.n.h(it, "it");
        Bundle bundleB = jVar.getSavedStateRegistry().b("android:support:activity-result");
        if (bundleB != null) {
            jVar.f14467A.j(bundleB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(final v vVar) {
        getLifecycle().a(new InterfaceC1160u() { // from class: b.i
            @Override // androidx.lifecycle.InterfaceC1160u
            public final void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
                j.Z(vVar, this, interfaceC1163x, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(v vVar, j jVar, InterfaceC1163x interfaceC1163x, AbstractC1157q.a event) {
        kotlin.jvm.internal.n.h(interfaceC1163x, "<anonymous parameter 0>");
        kotlin.jvm.internal.n.h(event, "event");
        if (event == AbstractC1157q.a.ON_CREATE) {
            vVar.o(b.f14487a.a(jVar));
        }
    }

    private final e c0() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0() {
        if (this.f14481v == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.f14481v = dVar.a();
            }
            if (this.f14481v == null) {
                this.f14481v = new e0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(j jVar) {
        jVar.g0();
    }

    @Override // p161q0.n
    public final void C(B0.a listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f14472F.remove(listener);
    }

    @Override // androidx.core.view.InterfaceC1081m
    public void D(InterfaceC1084p provider) {
        kotlin.jvm.internal.n.h(provider, "provider");
        this.f14479t.a(provider);
    }

    public final void a0(p020c.b listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f14478s.a(listener);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f0();
        e eVar = this.f14482w;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.n.g(decorView, "window.decorView");
        eVar.w0(decorView);
        super.addContentView(view, layoutParams);
    }

    public final void b0(B0.a listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f14470D.add(listener);
    }

    public s e0() {
        return (s) this.f14483x.getValue();
    }

    @Override // p010b.w
    public final v f() {
        return (v) this.f14477K.getValue();
    }

    public void f0() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.n.g(decorView, "window.decorView");
        g0.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.n.g(decorView2, "window.decorView");
        h0.a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.n.g(decorView3, "window.decorView");
        p082i1.g.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.n.g(decorView4, "window.decorView");
        z.a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.n.g(decorView5, "window.decorView");
        y.a(decorView5, this);
    }

    @Override // androidx.core.view.InterfaceC1081m
    public void g(InterfaceC1084p provider) {
        kotlin.jvm.internal.n.h(provider, "provider");
        this.f14479t.f(provider);
    }

    public void g0() {
        invalidateOptionsMenu();
    }

    @Override // androidx.lifecycle.InterfaceC1155o
    public Z0.a getDefaultViewModelCreationExtras() {
        Z0.b bVar = new Z0.b(null, 1, null);
        if (getApplication() != null) {
            Z0.a.b bVar2 = d0.a.f13396h;
            Application application = getApplication();
            kotlin.jvm.internal.n.g(application, "application");
            bVar.c(bVar2, application);
        }
        bVar.c(U.f13345a, this);
        bVar.c(U.f13346b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            bVar.c(U.f13347c, extras);
        }
        return bVar;
    }

    @Override // androidx.lifecycle.InterfaceC1155o
    public d0.c getDefaultViewModelProviderFactory() {
        return (d0.c) this.f14476J.getValue();
    }

    @Override // p161q0.f, androidx.lifecycle.InterfaceC1163x
    public AbstractC1157q getLifecycle() {
        return super.getLifecycle();
    }

    @Override // p082i1.f
    public final p082i1.d getSavedStateRegistry() {
        return this.f14480u.b();
    }

    @Override // androidx.lifecycle.f0
    public e0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        d0();
        e0 e0Var = this.f14481v;
        kotlin.jvm.internal.n.e(e0Var);
        return e0Var;
    }

    @Override // p161q0.m
    public final void i(B0.a listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f14471E.remove(listener);
    }

    public Object i0() {
        return null;
    }

    @Override // p171r0.b
    public final void l(B0.a listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f14468B.remove(listener);
    }

    @Override // p161q0.m
    public final void m(B0.a listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f14471E.add(listener);
    }

    @Override // p030d.f
    public final p030d.e n() {
        return this.f14467A;
    }

    @Override // p171r0.b
    public final void o(B0.a listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f14468B.add(listener);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f14467A.e(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        f().l();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.n.h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.f14468B.iterator();
        while (it.hasNext()) {
            ((B0.a) it.next()).accept(newConfig);
        }
    }

    @Override // p161q0.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f14480u.d(bundle);
        this.f14478s.c(this);
        super.onCreate(bundle);
        O.f13331r.b(this);
        int i10 = this.f14484y;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        kotlin.jvm.internal.n.h(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.f14479t.b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem item) {
        kotlin.jvm.internal.n.h(item, "item");
        if (super.onMenuItemSelected(i10, item)) {
            return true;
        }
        if (i10 == 0) {
            return this.f14479t.d(item);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z9) {
        if (this.f14474H) {
            return;
        }
        Iterator it = this.f14471E.iterator();
        while (it.hasNext()) {
            ((B0.a) it.next()).accept(new p161q0.g(z9));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        kotlin.jvm.internal.n.h(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f14470D.iterator();
        while (it.hasNext()) {
            ((B0.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        kotlin.jvm.internal.n.h(menu, "menu");
        this.f14479t.c(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z9) {
        if (this.f14475I) {
            return;
        }
        Iterator it = this.f14472F.iterator();
        while (it.hasNext()) {
            ((B0.a) it.next()).accept(new p161q0.o(z9));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        kotlin.jvm.internal.n.h(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.f14479t.e(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.n.h(permissions, "permissions");
        kotlin.jvm.internal.n.h(grantResults, "grantResults");
        if (this.f14467A.e(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objI0 = i0();
        e0 e0VarA = this.f14481v;
        if (e0VarA == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            e0VarA = dVar.a();
        }
        if (e0VarA == null && objI0 == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.b(objI0);
        dVar2.c(e0VarA);
        return dVar2;
    }

    @Override // p161q0.f, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.n.h(outState, "outState");
        if (getLifecycle() instanceof C1165z) {
            AbstractC1157q lifecycle = getLifecycle();
            kotlin.jvm.internal.n.f(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C1165z) lifecycle).n(AbstractC1157q.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.f14480u.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.f14469C.iterator();
        while (it.hasNext()) {
            ((B0.a) it.next()).accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f14473G.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // p171r0.c
    public final void r(B0.a listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f14469C.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (p182s1.a.c()) {
                p182s1.a.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            e0().b();
        } finally {
            p182s1.a.b();
        }
    }

    @Override // p171r0.c
    public final void s(B0.a listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f14469C.add(listener);
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        f0();
        e eVar = this.f14482w;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.n.g(decorView, "window.decorView");
        eVar.w0(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10) {
        kotlin.jvm.internal.n.h(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.n.h(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13);
    }

    @Override // p161q0.n
    public final void v(B0.a listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f14472F.add(listener);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        kotlin.jvm.internal.n.h(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.n.h(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z9, Configuration newConfig) {
        kotlin.jvm.internal.n.h(newConfig, "newConfig");
        this.f14474H = true;
        try {
            super.onMultiWindowModeChanged(z9, newConfig);
            this.f14474H = false;
            Iterator it = this.f14471E.iterator();
            while (it.hasNext()) {
                ((B0.a) it.next()).accept(new p161q0.g(z9, newConfig));
            }
        } catch (Throwable th) {
            this.f14474H = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z9, Configuration newConfig) {
        kotlin.jvm.internal.n.h(newConfig, "newConfig");
        this.f14475I = true;
        try {
            super.onPictureInPictureModeChanged(z9, newConfig);
            this.f14475I = false;
            Iterator it = this.f14472F.iterator();
            while (it.hasNext()) {
                ((B0.a) it.next()).accept(new p161q0.o(z9, newConfig));
            }
        } catch (Throwable th) {
            this.f14475I = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        f0();
        e eVar = this.f14482w;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.n.g(decorView, "window.decorView");
        eVar.w0(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f0();
        e eVar = this.f14482w;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.n.g(decorView, "window.decorView");
        eVar.w0(decorView);
        super.setContentView(view, layoutParams);
    }
}

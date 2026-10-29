package p010b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1160u;
import androidx.lifecycle.InterfaceC1163x;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p079h8.A;
import p089i8.C1438l;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f14525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B0.a f14526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1438l f14527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u f14528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OnBackInvokedCallback f14529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OnBackInvokedDispatcher f14530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f14531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f14532h;

    static final class a extends o implements l {
        a() {
            super(1);
        }

        public final void a(p010b.b backEvent) {
            n.h(backEvent, "backEvent");
            v.this.n(backEvent);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((p010b.b) obj);
            return A.f21846a;
        }
    }

    static final class b extends o implements l {
        b() {
            super(1);
        }

        public final void a(p010b.b backEvent) {
            n.h(backEvent, "backEvent");
            v.this.m(backEvent);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((p010b.b) obj);
            return A.f21846a;
        }
    }

    static final class c extends o implements p219v8.a {
        c() {
            super(0);
        }

        public final void a() {
            v.this.l();
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return A.f21846a;
        }
    }

    static final class d extends o implements p219v8.a {
        d() {
            super(0);
        }

        public final void a() {
            v.this.k();
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return A.f21846a;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f14537a = new e();

        private e() {
        }

        public final void a(Object dispatcher, int i10, Object callback) {
            n.h(dispatcher, "dispatcher");
            n.h(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        public final void b(Object dispatcher, Object callback) {
            n.h(dispatcher, "dispatcher");
            n.h(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f14538a = new f();

        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ l f14539q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ l f14540r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p219v8.a f14541s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ p219v8.a f14542t;

            a(l lVar, l lVar2, p219v8.a aVar, p219v8.a aVar2) {
                this.f14539q = lVar;
                this.f14540r = lVar2;
                this.f14541s = aVar;
                this.f14542t = aVar2;
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackCancelled() {
                this.f14542t.invoke();
            }

            @Override // android.window.OnBackInvokedCallback
            public void onBackInvoked() {
                this.f14541s.invoke();
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackProgressed(BackEvent backEvent) {
                n.h(backEvent, "backEvent");
                this.f14540r.f(new p010b.b(backEvent));
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackStarted(BackEvent backEvent) {
                n.h(backEvent, "backEvent");
                this.f14539q.f(new p010b.b(backEvent));
            }
        }

        private f() {
        }

        public final OnBackInvokedCallback a(l onBackStarted, l onBackProgressed, p219v8.a onBackInvoked, p219v8.a onBackCancelled) {
            n.h(onBackStarted, "onBackStarted");
            n.h(onBackProgressed, "onBackProgressed");
            n.h(onBackInvoked, "onBackInvoked");
            n.h(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    private final class g implements InterfaceC1160u, p010b.c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final AbstractC1157q f14543q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final u f14544r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private p010b.c f14545s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ v f14546t;

        public g(v vVar, AbstractC1157q lifecycle, u onBackPressedCallback) {
            n.h(lifecycle, "lifecycle");
            n.h(onBackPressedCallback, "onBackPressedCallback");
            this.f14546t = vVar;
            this.f14543q = lifecycle;
            this.f14544r = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // p010b.c
        public void cancel() {
            this.f14543q.d(this);
            this.f14544r.i(this);
            p010b.c cVar = this.f14545s;
            if (cVar != null) {
                cVar.cancel();
            }
            this.f14545s = null;
        }

        @Override // androidx.lifecycle.InterfaceC1160u
        public void onStateChanged(InterfaceC1163x source, AbstractC1157q.a event) {
            n.h(source, "source");
            n.h(event, "event");
            if (event == AbstractC1157q.a.ON_START) {
                this.f14545s = this.f14546t.j(this.f14544r);
                return;
            }
            if (event != AbstractC1157q.a.ON_STOP) {
                if (event == AbstractC1157q.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                p010b.c cVar = this.f14545s;
                if (cVar != null) {
                    cVar.cancel();
                }
            }
        }
    }

    private final class h implements p010b.c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final u f14547q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ v f14548r;

        public h(v vVar, u onBackPressedCallback) {
            n.h(onBackPressedCallback, "onBackPressedCallback");
            this.f14548r = vVar;
            this.f14547q = onBackPressedCallback;
        }

        @Override // p010b.c
        public void cancel() {
            this.f14548r.f14527c.remove(this.f14547q);
            if (n.d(this.f14548r.f14528d, this.f14547q)) {
                this.f14547q.c();
                this.f14548r.f14528d = null;
            }
            this.f14547q.i(this);
            p219v8.a aVarB = this.f14547q.b();
            if (aVarB != null) {
                aVarB.invoke();
            }
            this.f14547q.k(null);
        }
    }

    /* synthetic */ class i extends kotlin.jvm.internal.l implements p219v8.a {
        i(Object obj) {
            super(0, obj, v.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m13invoke();
            return A.f21846a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m13invoke() {
            ((v) this.receiver).q();
        }
    }

    /* synthetic */ class j extends kotlin.jvm.internal.l implements p219v8.a {
        j(Object obj) {
            super(0, obj, v.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m14invoke();
            return A.f21846a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m14invoke() {
            ((v) this.receiver).q();
        }
    }

    public v(Runnable runnable, B0.a aVar) {
        this.f14525a = runnable;
        this.f14526b = aVar;
        this.f14527c = new C1438l();
        this.f14529e = f.f14538a.a(new a(), new b(), new c(), new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        Object objPrevious;
        u uVar = this.f14528d;
        if (uVar == null) {
            C1438l c1438l = this.f14527c;
            ListIterator<E> listIterator = c1438l.listIterator(c1438l.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((u) objPrevious).g());
            uVar = (u) objPrevious;
        }
        this.f14528d = null;
        if (uVar != null) {
            uVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(p010b.b bVar) {
        Object objPrevious;
        u uVar = this.f14528d;
        if (uVar == null) {
            C1438l c1438l = this.f14527c;
            ListIterator<E> listIterator = c1438l.listIterator(c1438l.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((u) objPrevious).g());
            uVar = (u) objPrevious;
        }
        if (uVar != null) {
            uVar.e(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(p010b.b bVar) {
        Object objPrevious;
        C1438l c1438l = this.f14527c;
        ListIterator<E> listIterator = c1438l.listIterator(c1438l.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((u) objPrevious).g());
        u uVar = (u) objPrevious;
        if (this.f14528d != null) {
            k();
        }
        this.f14528d = uVar;
        if (uVar != null) {
            uVar.f(bVar);
        }
    }

    private final void p(boolean z9) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f14530f;
        OnBackInvokedCallback onBackInvokedCallback = this.f14529e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z9 && !this.f14531g) {
            e.f14537a.a(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f14531g = true;
        } else {
            if (z9 || !this.f14531g) {
                return;
            }
            e.f14537a.b(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f14531g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        boolean z9 = this.f14532h;
        C1438l c1438l = this.f14527c;
        boolean z10 = false;
        if (c1438l == null || !c1438l.isEmpty()) {
            Iterator<E> it = c1438l.iterator();
            while (it.hasNext()) {
                if (((u) it.next()).g()) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f14532h = z10;
        if (z10 != z9) {
            B0.a aVar = this.f14526b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z10));
            }
            p(z10);
        }
    }

    public final void h(InterfaceC1163x owner, u onBackPressedCallback) {
        n.h(owner, "owner");
        n.h(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1157q lifecycle = owner.getLifecycle();
        if (lifecycle.b() == AbstractC1157q.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.a(new g(this, lifecycle, onBackPressedCallback));
        q();
        onBackPressedCallback.k(new i(this));
    }

    public final void i(u onBackPressedCallback) {
        n.h(onBackPressedCallback, "onBackPressedCallback");
        j(onBackPressedCallback);
    }

    public final p010b.c j(u onBackPressedCallback) {
        n.h(onBackPressedCallback, "onBackPressedCallback");
        this.f14527c.add(onBackPressedCallback);
        h hVar = new h(this, onBackPressedCallback);
        onBackPressedCallback.a(hVar);
        q();
        onBackPressedCallback.k(new j(this));
        return hVar;
    }

    public final void l() {
        Object objPrevious;
        u uVar = this.f14528d;
        if (uVar == null) {
            C1438l c1438l = this.f14527c;
            ListIterator<E> listIterator = c1438l.listIterator(c1438l.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((u) objPrevious).g());
            uVar = (u) objPrevious;
        }
        this.f14528d = null;
        if (uVar != null) {
            uVar.d();
            return;
        }
        Runnable runnable = this.f14525a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void o(OnBackInvokedDispatcher invoker) {
        n.h(invoker, "invoker");
        this.f14530f = invoker;
        p(this.f14532h);
    }

    public v(Runnable runnable) {
        this(runnable, null);
    }
}

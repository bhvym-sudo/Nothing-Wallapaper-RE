package p214v3;

import F8.AbstractC0816i;
import F8.InterfaceC0807d0;
import F8.InterfaceC0846x0;
import F8.L;
import H3.C;
import H3.F;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import N7.f;
import android.app.Activity;
import android.app.WallpaperColors;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteCallback;
import android.service.wallpaper.IWallpaperEngine;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1148h;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import androidx.recyclerview.widget.RecyclerView;
import com.android.launcher3.w;
import com.nothing.wallpaper.R;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.n;
import p064g3.k;
import p064g3.x;
import p074h3.InterfaceC1364d;
import p079h8.A;
import p079h8.o;
import p079h8.r;
import p084i3.M0;
import p167q6.g;
import p187s6.h;
import p187s6.i;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f28194a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Bitmap f28195b;

    public interface a {
        void a();

        SurfaceView b();

        void c(int i10, Bundle bundle);
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f28196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0846x0 f28197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SurfaceView f28198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SurfaceView f28199d;

        b(E e10, InterfaceC0846x0 interfaceC0846x0, SurfaceView surfaceView, SurfaceView surfaceView2) {
            this.f28196a = e10;
            this.f28197b = interfaceC0846x0;
            this.f28198c = surfaceView;
            this.f28199d = surfaceView2;
        }

        @Override // v3.l.a
        public void a() {
            InterfaceC0846x0.a.a(this.f28197b, null, 1, null);
            l.f28194a.x(this.f28198c);
        }

        @Override // v3.l.a
        public SurfaceView b() {
            return this.f28199d;
        }

        @Override // v3.l.a
        public void c(int i10, Bundle args) {
            n.h(args, "args");
            M0 m9 = (M0) this.f28196a.f22779q;
            if (m9 != null) {
                m9.h(i10, args);
            }
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        final /* synthetic */ boolean f28200A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        final /* synthetic */ p234x3.d f28201B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ boolean f28202C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ Activity f28203D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ E f28204E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f28205F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p219v8.a f28206G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f28207H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ boolean f28208I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ boolean f28209J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ boolean f28210K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ boolean f28211L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ p219v8.a f28212M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ SurfaceView f28213N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ p219v8.l f28214O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        final /* synthetic */ E f28215P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        final /* synthetic */ E f28216Q;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f28217q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f28218r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f28219s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ SurfaceView f28220t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ E f28221u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ SurfaceView f28222v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ E f28223w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ CardView f28224x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ Runnable f28225y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ E f28226z;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: A, reason: collision with root package name */
            final /* synthetic */ boolean f28227A;

            /* JADX INFO: renamed from: B, reason: collision with root package name */
            final /* synthetic */ p234x3.d f28228B;

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ boolean f28229C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ Activity f28230D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ E f28231E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ boolean f28232F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ p219v8.a f28233G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ AtomicBoolean f28234H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ boolean f28235I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ boolean f28236J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ boolean f28237K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            final /* synthetic */ boolean f28238L;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f28239q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f28240r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ InterfaceC1163x f28241s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ SurfaceView f28242t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ E f28243u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ SurfaceView f28244v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ E f28245w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ CardView f28246x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ Runnable f28247y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ E f28248z;

            /* JADX INFO: renamed from: v3.l$c$a$a, reason: collision with other inner class name */
            static final class C0700a extends kotlin.coroutines.jvm.internal.l implements p {

                /* JADX INFO: renamed from: A, reason: collision with root package name */
                final /* synthetic */ InterfaceC1163x f28249A;

                /* JADX INFO: renamed from: B, reason: collision with root package name */
                final /* synthetic */ b f28250B;

                /* JADX INFO: renamed from: C, reason: collision with root package name */
                final /* synthetic */ E f28251C;

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ boolean f28252D;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                final /* synthetic */ p219v8.a f28253E;

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                final /* synthetic */ AtomicBoolean f28254F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                final /* synthetic */ boolean f28255G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                final /* synthetic */ boolean f28256H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                final /* synthetic */ boolean f28257I;

                /* JADX INFO: renamed from: J, reason: collision with root package name */
                final /* synthetic */ boolean f28258J;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f28259q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ boolean f28260r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ E f28261s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ SurfaceView f28262t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ p234x3.d f28263u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                final /* synthetic */ boolean f28264v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                final /* synthetic */ E f28265w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                final /* synthetic */ CardView f28266x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                final /* synthetic */ SurfaceView f28267y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                final /* synthetic */ Activity f28268z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0700a(boolean z9, E e10, SurfaceView surfaceView, p234x3.d dVar, boolean z10, E e11, CardView cardView, SurfaceView surfaceView2, Activity activity, InterfaceC1163x interfaceC1163x, b bVar, E e12, boolean z11, p219v8.a aVar, AtomicBoolean atomicBoolean, boolean z12, boolean z13, boolean z14, boolean z15, p129m8.e eVar) {
                    super(2, eVar);
                    this.f28260r = z9;
                    this.f28261s = e10;
                    this.f28262t = surfaceView;
                    this.f28263u = dVar;
                    this.f28264v = z10;
                    this.f28265w = e11;
                    this.f28266x = cardView;
                    this.f28267y = surfaceView2;
                    this.f28268z = activity;
                    this.f28249A = interfaceC1163x;
                    this.f28250B = bVar;
                    this.f28251C = e12;
                    this.f28252D = z11;
                    this.f28253E = aVar;
                    this.f28254F = atomicBoolean;
                    this.f28255G = z12;
                    this.f28256H = z13;
                    this.f28257I = z14;
                    this.f28258J = z15;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void u(Activity activity, E e10, E e11, boolean z9, p219v8.a aVar, AtomicBoolean atomicBoolean, boolean z10, boolean z11, boolean z12, boolean z13) {
                    if (l.p(z10, e10)) {
                        return;
                    }
                    l.f28194a.w(activity, (x) e10.f22779q, l.q(z11, z12, e10), (F) e11.f22779q, z9, l.o(z13, e10), aVar, atomicBoolean);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0700a(this.f28260r, this.f28261s, this.f28262t, this.f28263u, this.f28264v, this.f28265w, this.f28266x, this.f28267y, this.f28268z, this.f28249A, this.f28250B, this.f28251C, this.f28252D, this.f28253E, this.f28254F, this.f28255G, this.f28256H, this.f28257I, this.f28258J, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0700a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    p139n8.b.e();
                    if (this.f28259q != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    if (!this.f28260r) {
                        this.f28261s.f22779q = new M0(this.f28262t, this.f28263u.h(), this.f28263u.f());
                        this.f28262t.getHolder().addCallback((SurfaceHolder.Callback) this.f28261s.f22779q);
                    }
                    if (!this.f28264v) {
                        this.f28262t.setZOrderMediaOverlay(true);
                    }
                    E e10 = this.f28265w;
                    Context context = this.f28266x.getContext();
                    CardView cardView = this.f28266x;
                    SurfaceView surfaceView = this.f28267y;
                    CompletableFuture completableFutureCompletedFuture = CompletableFuture.completedFuture(new x.a(null, kotlin.coroutines.jvm.internal.b.c(G6.e.f(this.f28268z))));
                    final Activity activity = this.f28268z;
                    final E e11 = this.f28251C;
                    final E e12 = this.f28265w;
                    final boolean z9 = this.f28252D;
                    final p219v8.a aVar = this.f28253E;
                    final AtomicBoolean atomicBoolean = this.f28254F;
                    final boolean z10 = this.f28255G;
                    final boolean z11 = this.f28256H;
                    final boolean z12 = this.f28257I;
                    final boolean z13 = this.f28258J;
                    e10.f22779q = new F(context, cardView, surfaceView, completableFutureCompletedFuture, new F.a() { // from class: v3.n
                        @Override // H3.F.a
                        public final void a() {
                            l.c.a.C0700a.u(activity, e11, e12, z9, aVar, atomicBoolean, z10, z11, z12, z13);
                        }
                    });
                    this.f28267y.getHolder().addCallback((SurfaceHolder.Callback) this.f28265w.f22779q);
                    if (!this.f28264v) {
                        this.f28267y.setZOrderMediaOverlay(true);
                    }
                    this.f28249A.getLifecycle().a(this.f28250B);
                    return A.f21846a;
                }
            }

            public static final class b implements InterfaceC1148h {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ CardView f28269q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Runnable f28270r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ E f28271s;

                b(CardView cardView, Runnable runnable, E e10) {
                    this.f28269q = cardView;
                    this.f28270r = runnable;
                    this.f28271s = e10;
                }

                @Override // androidx.lifecycle.InterfaceC1148h
                public void j(InterfaceC1163x owner) {
                    n.h(owner, "owner");
                    super.j(owner);
                    i iVar = (i) this.f28271s.f22779q;
                    if (iVar != null) {
                        iVar.c(false);
                    }
                }

                @Override // androidx.lifecycle.InterfaceC1148h
                public void onStop(InterfaceC1163x owner) {
                    n.h(owner, "owner");
                    super.onStop(owner);
                    l.m(this.f28269q, this.f28270r);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC1163x interfaceC1163x, SurfaceView surfaceView, E e10, SurfaceView surfaceView2, E e11, CardView cardView, Runnable runnable, E e12, boolean z9, p234x3.d dVar, boolean z10, Activity activity, E e13, boolean z11, p219v8.a aVar, AtomicBoolean atomicBoolean, boolean z12, boolean z13, boolean z14, boolean z15, p129m8.e eVar) {
                super(2, eVar);
                this.f28241s = interfaceC1163x;
                this.f28242t = surfaceView;
                this.f28243u = e10;
                this.f28244v = surfaceView2;
                this.f28245w = e11;
                this.f28246x = cardView;
                this.f28247y = runnable;
                this.f28248z = e12;
                this.f28227A = z9;
                this.f28228B = dVar;
                this.f28229C = z10;
                this.f28230D = activity;
                this.f28231E = e13;
                this.f28232F = z11;
                this.f28233G = aVar;
                this.f28234H = atomicBoolean;
                this.f28235I = z12;
                this.f28236J = z13;
                this.f28237K = z14;
                this.f28238L = z15;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void u(E e10) {
                F f10 = (F) e10.f22779q;
                if (f10 != null) {
                    f10.b();
                }
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f28241s, this.f28242t, this.f28243u, this.f28244v, this.f28245w, this.f28246x, this.f28247y, this.f28248z, this.f28227A, this.f28228B, this.f28229C, this.f28230D, this.f28231E, this.f28232F, this.f28233G, this.f28234H, this.f28235I, this.f28236J, this.f28237K, this.f28238L, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b bVar;
                Object objE = p139n8.b.e();
                int i10 = this.f28240r;
                if (i10 == 0) {
                    r.b(obj);
                    b bVar2 = new b(this.f28246x, this.f28247y, this.f28248z);
                    InterfaceC1163x interfaceC1163x = this.f28241s;
                    AbstractC1157q.b bVar3 = AbstractC1157q.b.CREATED;
                    C0700a c0700a = new C0700a(this.f28227A, this.f28243u, this.f28242t, this.f28228B, this.f28229C, this.f28245w, this.f28246x, this.f28244v, this.f28230D, interfaceC1163x, bVar2, this.f28231E, this.f28232F, this.f28233G, this.f28234H, this.f28235I, this.f28236J, this.f28237K, this.f28238L, null);
                    this.f28239q = bVar2;
                    this.f28240r = 1;
                    if (N.b(interfaceC1163x, bVar3, c0700a, this) == objE) {
                        return objE;
                    }
                    bVar = bVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b) this.f28239q;
                    r.b(obj);
                }
                this.f28241s.getLifecycle().d(bVar);
                this.f28242t.getHolder().removeCallback((SurfaceHolder.Callback) this.f28243u.f22779q);
                M0 m9 = (M0) this.f28243u.f22779q;
                if (m9 != null) {
                    m9.b();
                }
                this.f28244v.getHolder().removeCallback((SurfaceHolder.Callback) this.f28245w.f22779q);
                F f10 = (F) this.f28245w.f22779q;
                ImageView imageViewC = f10 != null ? f10.c() : null;
                if (imageViewC == null || !imageViewC.isAttachedToWindow()) {
                    F f11 = (F) this.f28245w.f22779q;
                    if (f11 != null) {
                        f11.b();
                    }
                } else {
                    final E e10 = this.f28245w;
                    kotlin.coroutines.jvm.internal.b.a(imageViewC.post(new Runnable() { // from class: v3.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            l.c.a.u(e10);
                        }
                    }));
                }
                return A.f21846a;
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f28272q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC1163x f28273r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p234x3.d f28274s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ p219v8.a f28275t;

            static final class a extends kotlin.coroutines.jvm.internal.l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f28276q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p234x3.d f28277r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ p219v8.a f28278s;

                /* JADX INFO: renamed from: v3.l$c$b$a$a, reason: collision with other inner class name */
                static final class C0701a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ p234x3.d f28279q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ kotlin.jvm.internal.A f28280r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ p219v8.a f28281s;

                    /* JADX INFO: renamed from: v3.l$c$b$a$a$a, reason: collision with other inner class name */
                    static final class C0702a extends kotlin.coroutines.jvm.internal.d {

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        Object f28282q;

                        /* JADX INFO: renamed from: r, reason: collision with root package name */
                        boolean f28283r;

                        /* JADX INFO: renamed from: s, reason: collision with root package name */
                        /* synthetic */ Object f28284s;

                        /* JADX INFO: renamed from: u, reason: collision with root package name */
                        int f28286u;

                        C0702a(p129m8.e eVar) {
                            super(eVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.f28284s = obj;
                            this.f28286u |= Integer.MIN_VALUE;
                            return C0701a.this.a(false, this);
                        }
                    }

                    C0701a(p234x3.d dVar, kotlin.jvm.internal.A a10, p219v8.a aVar) {
                        this.f28279q = dVar;
                        this.f28280r = a10;
                        this.f28281s = aVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    public final Object a(boolean z9, p129m8.e eVar) {
                        C0702a c0702a;
                        if (eVar instanceof C0702a) {
                            c0702a = (C0702a) eVar;
                            int i10 = c0702a.f28286u;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                c0702a.f28286u = i10 - Integer.MIN_VALUE;
                            } else {
                                c0702a = new C0702a(eVar);
                            }
                        } else {
                            c0702a = new C0702a(eVar);
                        }
                        Object obj = c0702a.f28284s;
                        Object objE = p139n8.b.e();
                        int i11 = c0702a.f28286u;
                        if (i11 == 0) {
                            r.b(obj);
                            p234x3.d dVar = this.f28279q;
                            c0702a.f28282q = this;
                            c0702a.f28283r = z9;
                            c0702a.f28286u = 1;
                            if (dVar.j(z9, c0702a) == objE) {
                                return objE;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            z9 = c0702a.f28283r;
                            this = (C0701a) c0702a.f28282q;
                            r.b(obj);
                        }
                        kotlin.jvm.internal.A a10 = this.f28280r;
                        if (a10.f22775q) {
                            a10.f22775q = false;
                        } else if (z9) {
                            this.f28281s.invoke();
                        }
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Boolean) obj).booleanValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(p234x3.d dVar, p219v8.a aVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f28277r = dVar;
                    this.f28278s = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new a(this.f28277r, this.f28278s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f28276q;
                    if (i10 == 0) {
                        r.b(obj);
                        kotlin.jvm.internal.A a10 = new kotlin.jvm.internal.A();
                        a10.f22775q = true;
                        InterfaceC0880f interfaceC0880fN = this.f28277r.n();
                        C0701a c0701a = new C0701a(this.f28277r, a10, this.f28278s);
                        this.f28276q = 1;
                        if (interfaceC0880fN.a(c0701a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC1163x interfaceC1163x, p234x3.d dVar, p219v8.a aVar, p129m8.e eVar) {
                super(2, eVar);
                this.f28273r = interfaceC1163x;
                this.f28274s = dVar;
                this.f28275t = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new b(this.f28273r, this.f28274s, this.f28275t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f28272q;
                if (i10 == 0) {
                    r.b(obj);
                    InterfaceC1163x interfaceC1163x = this.f28273r;
                    AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                    a aVar = new a(this.f28274s, this.f28275t, null);
                    this.f28272q = 1;
                    if (N.b(interfaceC1163x, bVar, aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return A.f21846a;
            }
        }

        /* JADX INFO: renamed from: v3.l$c$c, reason: collision with other inner class name */
        static final class C0703c extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f28287q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC1163x f28288r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p234x3.d f28289s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ boolean f28290t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ SurfaceView f28291u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ E f28292v;

            /* JADX INFO: renamed from: v3.l$c$c$a */
            static final class a extends kotlin.coroutines.jvm.internal.l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f28293q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p234x3.d f28294r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ boolean f28295s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ SurfaceView f28296t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ E f28297u;

                /* JADX INFO: renamed from: v3.l$c$c$a$a, reason: collision with other inner class name */
                static final class C0704a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ boolean f28298q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ SurfaceView f28299r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ E f28300s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ p234x3.d f28301t;

                    C0704a(boolean z9, SurfaceView surfaceView, E e10, p234x3.d dVar) {
                        this.f28298q = z9;
                        this.f28299r = surfaceView;
                        this.f28300s = e10;
                        this.f28301t = dVar;
                    }

                    public final Object a(boolean z9, p129m8.e eVar) {
                        l.u(this.f28298q, this.f28299r, this.f28300s, this.f28301t);
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Boolean) obj).booleanValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(p234x3.d dVar, boolean z9, SurfaceView surfaceView, E e10, p129m8.e eVar) {
                    super(2, eVar);
                    this.f28294r = dVar;
                    this.f28295s = z9;
                    this.f28296t = surfaceView;
                    this.f28297u = e10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new a(this.f28294r, this.f28295s, this.f28296t, this.f28297u, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f28293q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fQ = this.f28294r.q();
                        if (interfaceC0880fQ != null) {
                            C0704a c0704a = new C0704a(this.f28295s, this.f28296t, this.f28297u, this.f28294r);
                            this.f28293q = 1;
                            if (interfaceC0880fQ.a(c0704a, this) == objE) {
                                return objE;
                            }
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0703c(InterfaceC1163x interfaceC1163x, p234x3.d dVar, boolean z9, SurfaceView surfaceView, E e10, p129m8.e eVar) {
                super(2, eVar);
                this.f28288r = interfaceC1163x;
                this.f28289s = dVar;
                this.f28290t = z9;
                this.f28291u = surfaceView;
                this.f28292v = e10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new C0703c(this.f28288r, this.f28289s, this.f28290t, this.f28291u, this.f28292v, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((C0703c) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f28287q;
                if (i10 == 0) {
                    r.b(obj);
                    InterfaceC1163x interfaceC1163x = this.f28288r;
                    AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                    a aVar = new a(this.f28289s, this.f28290t, this.f28291u, this.f28292v, null);
                    this.f28287q = 1;
                    if (N.b(interfaceC1163x, bVar, aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return A.f21846a;
            }
        }

        static final class d extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f28302q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC1163x f28303r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p234x3.d f28304s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ boolean f28305t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ SurfaceView f28306u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ E f28307v;

            static final class a extends kotlin.coroutines.jvm.internal.l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f28308q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p234x3.d f28309r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ boolean f28310s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ SurfaceView f28311t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ E f28312u;

                /* JADX INFO: renamed from: v3.l$c$d$a$a, reason: collision with other inner class name */
                static final class C0705a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ p234x3.d f28313q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ boolean f28314r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ SurfaceView f28315s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ E f28316t;

                    C0705a(p234x3.d dVar, boolean z9, SurfaceView surfaceView, E e10) {
                        this.f28313q = dVar;
                        this.f28314r = z9;
                        this.f28315s = surfaceView;
                        this.f28316t = e10;
                    }

                    public final Object a(boolean z9, p129m8.e eVar) {
                        com.nothing.wallpaper.common.log.c.k("ScreenPreviewBinder", "received launcher update event");
                        l.u(this.f28314r, this.f28315s, this.f28316t, this.f28313q);
                        p234x3.d dVar = this.f28313q;
                        p093j2.a aVar = dVar instanceof p093j2.a ? (p093j2.a) dVar : null;
                        if (aVar != null) {
                            aVar.r();
                        }
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Boolean) obj).booleanValue(), eVar);
                    }
                }

                public static final class b implements InterfaceC0880f {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ InterfaceC0880f f28317q;

                    /* JADX INFO: renamed from: v3.l$c$d$a$b$a, reason: collision with other inner class name */
                    public static final class C0706a implements InterfaceC0881g {

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        final /* synthetic */ InterfaceC0881g f28318q;

                        /* JADX INFO: renamed from: v3.l$c$d$a$b$a$a, reason: collision with other inner class name */
                        public static final class C0707a extends kotlin.coroutines.jvm.internal.d {

                            /* JADX INFO: renamed from: q, reason: collision with root package name */
                            /* synthetic */ Object f28319q;

                            /* JADX INFO: renamed from: r, reason: collision with root package name */
                            int f28320r;

                            public C0707a(p129m8.e eVar) {
                                super(eVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final Object invokeSuspend(Object obj) {
                                this.f28319q = obj;
                                this.f28320r |= Integer.MIN_VALUE;
                                return C0706a.this.b(null, this);
                            }
                        }

                        public C0706a(InterfaceC0881g interfaceC0881g) {
                            this.f28318q = interfaceC0881g;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // I8.InterfaceC0881g
                        public final Object b(Object obj, p129m8.e eVar) {
                            C0707a c0707a;
                            if (eVar instanceof C0707a) {
                                c0707a = (C0707a) eVar;
                                int i10 = c0707a.f28320r;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    c0707a.f28320r = i10 - Integer.MIN_VALUE;
                                } else {
                                    c0707a = new C0707a(eVar);
                                }
                            } else {
                                c0707a = new C0707a(eVar);
                            }
                            Object obj2 = c0707a.f28319q;
                            Object objE = p139n8.b.e();
                            int i11 = c0707a.f28320r;
                            if (i11 == 0) {
                                r.b(obj2);
                                InterfaceC0881g interfaceC0881g = this.f28318q;
                                if (((Boolean) obj).booleanValue()) {
                                    c0707a.f28320r = 1;
                                    if (interfaceC0881g.b(obj, c0707a) == objE) {
                                        return objE;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                r.b(obj2);
                            }
                            return A.f21846a;
                        }
                    }

                    public b(InterfaceC0880f interfaceC0880f) {
                        this.f28317q = interfaceC0880f;
                    }

                    @Override // I8.InterfaceC0880f
                    public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
                        Object objA = this.f28317q.a(new C0706a(interfaceC0881g), eVar);
                        return objA == p139n8.b.e() ? objA : A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(p234x3.d dVar, boolean z9, SurfaceView surfaceView, E e10, p129m8.e eVar) {
                    super(2, eVar);
                    this.f28309r = dVar;
                    this.f28310s = z9;
                    this.f28311t = surfaceView;
                    this.f28312u = e10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new a(this.f28309r, this.f28310s, this.f28311t, this.f28312u, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f28308q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fK = this.f28309r.k();
                        if (interfaceC0880fK != null) {
                            b bVar = new b(interfaceC0880fK);
                            C0705a c0705a = new C0705a(this.f28309r, this.f28310s, this.f28311t, this.f28312u);
                            this.f28308q = 1;
                            if (bVar.a(c0705a, this) == objE) {
                                return objE;
                            }
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(InterfaceC1163x interfaceC1163x, p234x3.d dVar, boolean z9, SurfaceView surfaceView, E e10, p129m8.e eVar) {
                super(2, eVar);
                this.f28303r = interfaceC1163x;
                this.f28304s = dVar;
                this.f28305t = z9;
                this.f28306u = surfaceView;
                this.f28307v = e10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new d(this.f28303r, this.f28304s, this.f28305t, this.f28306u, this.f28307v, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f28302q;
                if (i10 == 0) {
                    r.b(obj);
                    InterfaceC1163x interfaceC1163x = this.f28303r;
                    AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                    a aVar = new a(this.f28304s, this.f28305t, this.f28306u, this.f28307v, null);
                    this.f28302q = 1;
                    if (N.b(interfaceC1163x, bVar, aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return A.f21846a;
            }
        }

        static final class e extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: A, reason: collision with root package name */
            final /* synthetic */ boolean f28322A;

            /* JADX INFO: renamed from: B, reason: collision with root package name */
            final /* synthetic */ boolean f28323B;

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ boolean f28324C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ E f28325D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ CardView f28326E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ SurfaceView f28327F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ SurfaceView f28328G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ p219v8.l f28329H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ E f28330I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ E f28331J;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f28332q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC1163x f28333r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ E f28334s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ p234x3.d f28335t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ Activity f28336u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ E f28337v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ boolean f28338w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ p219v8.a f28339x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ AtomicBoolean f28340y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ boolean f28341z;

            static final class a extends kotlin.coroutines.jvm.internal.l implements p {

                /* JADX INFO: renamed from: A, reason: collision with root package name */
                final /* synthetic */ boolean f28342A;

                /* JADX INFO: renamed from: B, reason: collision with root package name */
                final /* synthetic */ boolean f28343B;

                /* JADX INFO: renamed from: C, reason: collision with root package name */
                final /* synthetic */ boolean f28344C;

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ E f28345D;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                final /* synthetic */ CardView f28346E;

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                final /* synthetic */ SurfaceView f28347F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                final /* synthetic */ SurfaceView f28348G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                final /* synthetic */ p219v8.l f28349H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                final /* synthetic */ E f28350I;

                /* JADX INFO: renamed from: J, reason: collision with root package name */
                final /* synthetic */ E f28351J;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f28352q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ InterfaceC1163x f28353r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ E f28354s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ p234x3.d f28355t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ Activity f28356u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                final /* synthetic */ E f28357v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                final /* synthetic */ boolean f28358w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                final /* synthetic */ p219v8.a f28359x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                final /* synthetic */ AtomicBoolean f28360y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                final /* synthetic */ boolean f28361z;

                /* JADX INFO: renamed from: v3.l$c$e$a$a, reason: collision with other inner class name */
                static final class C0708a extends kotlin.coroutines.jvm.internal.l implements p {

                    /* JADX INFO: renamed from: A, reason: collision with root package name */
                    final /* synthetic */ boolean f28362A;

                    /* JADX INFO: renamed from: B, reason: collision with root package name */
                    final /* synthetic */ boolean f28363B;

                    /* JADX INFO: renamed from: C, reason: collision with root package name */
                    final /* synthetic */ boolean f28364C;

                    /* JADX INFO: renamed from: D, reason: collision with root package name */
                    final /* synthetic */ E f28365D;

                    /* JADX INFO: renamed from: E, reason: collision with root package name */
                    final /* synthetic */ CardView f28366E;

                    /* JADX INFO: renamed from: F, reason: collision with root package name */
                    final /* synthetic */ SurfaceView f28367F;

                    /* JADX INFO: renamed from: G, reason: collision with root package name */
                    final /* synthetic */ SurfaceView f28368G;

                    /* JADX INFO: renamed from: H, reason: collision with root package name */
                    final /* synthetic */ InterfaceC1163x f28369H;

                    /* JADX INFO: renamed from: I, reason: collision with root package name */
                    final /* synthetic */ p219v8.l f28370I;

                    /* JADX INFO: renamed from: J, reason: collision with root package name */
                    final /* synthetic */ E f28371J;

                    /* JADX INFO: renamed from: K, reason: collision with root package name */
                    final /* synthetic */ E f28372K;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    Object f28373q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    int f28374r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ E f28375s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ p234x3.d f28376t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    final /* synthetic */ Activity f28377u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    final /* synthetic */ E f28378v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    final /* synthetic */ boolean f28379w;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    final /* synthetic */ p219v8.a f28380x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    final /* synthetic */ AtomicBoolean f28381y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    final /* synthetic */ boolean f28382z;

                    /* JADX INFO: renamed from: v3.l$c$e$a$a$a, reason: collision with other inner class name */
                    public static final class ViewOnAttachStateChangeListenerC0709a implements View.OnAttachStateChangeListener {

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        final /* synthetic */ i f28383q;

                        /* JADX INFO: renamed from: r, reason: collision with root package name */
                        final /* synthetic */ CardView f28384r;

                        ViewOnAttachStateChangeListenerC0709a(i iVar, CardView cardView) {
                            this.f28383q = iVar;
                            this.f28384r = cardView;
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View v9) {
                            n.h(v9, "v");
                            this.f28383q.b();
                            this.f28383q.c(true);
                            this.f28384r.removeOnAttachStateChangeListener(this);
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View v9) {
                            n.h(v9, "v");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0708a(E e10, p234x3.d dVar, Activity activity, E e11, boolean z9, p219v8.a aVar, AtomicBoolean atomicBoolean, boolean z10, boolean z11, boolean z12, boolean z13, E e12, CardView cardView, SurfaceView surfaceView, SurfaceView surfaceView2, InterfaceC1163x interfaceC1163x, p219v8.l lVar, E e13, E e14, p129m8.e eVar) {
                        super(2, eVar);
                        this.f28375s = e10;
                        this.f28376t = dVar;
                        this.f28377u = activity;
                        this.f28378v = e11;
                        this.f28379w = z9;
                        this.f28380x = aVar;
                        this.f28381y = atomicBoolean;
                        this.f28382z = z10;
                        this.f28362A = z11;
                        this.f28363B = z12;
                        this.f28364C = z13;
                        this.f28365D = e12;
                        this.f28366E = cardView;
                        this.f28367F = surfaceView;
                        this.f28368G = surfaceView2;
                        this.f28369H = interfaceC1163x;
                        this.f28370I = lVar;
                        this.f28371J = e13;
                        this.f28372K = e14;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void u(CardView cardView, ViewOnAttachStateChangeListenerC0709a viewOnAttachStateChangeListenerC0709a) {
                        cardView.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0709a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        return new C0708a(this.f28375s, this.f28376t, this.f28377u, this.f28378v, this.f28379w, this.f28380x, this.f28381y, this.f28382z, this.f28362A, this.f28363B, this.f28364C, this.f28365D, this.f28366E, this.f28367F, this.f28368G, this.f28369H, this.f28370I, this.f28371J, this.f28372K, eVar);
                    }

                    @Override // p219v8.p
                    public final Object invoke(L l9, p129m8.e eVar) {
                        return ((C0708a) create(l9, eVar)).invokeSuspend(A.f21846a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objJ;
                        E e10;
                        Object objE = p139n8.b.e();
                        int i10 = this.f28374r;
                        if (i10 == 0) {
                            r.b(obj);
                            E e11 = this.f28375s;
                            p234x3.d dVar = this.f28376t;
                            this.f28373q = e11;
                            this.f28374r = 1;
                            objJ = dVar.j(false, this);
                            if (objJ == objE) {
                                return objE;
                            }
                            e10 = e11;
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e10 = (E) this.f28373q;
                            r.b(obj);
                            objJ = obj;
                        }
                        e10.f22779q = objJ;
                        if (!l.p(this.f28382z, this.f28375s)) {
                            l lVar = l.f28194a;
                            Activity activity = this.f28377u;
                            E e12 = this.f28375s;
                            lVar.w(activity, (x) e12.f22779q, l.q(this.f28362A, this.f28363B, e12), (F) this.f28378v.f22779q, this.f28379w, l.o(this.f28364C, this.f28375s), this.f28380x, this.f28381y);
                        }
                        if (!l.q(this.f28362A, this.f28363B, this.f28375s)) {
                            E e13 = this.f28375s;
                            Object obj2 = e13.f22779q;
                            k kVar = obj2 instanceof k ? (k) obj2 : null;
                            if (kVar != null) {
                                E e14 = this.f28365D;
                                final CardView cardView = this.f28366E;
                                p234x3.d dVar2 = this.f28376t;
                                SurfaceView surfaceView = this.f28367F;
                                SurfaceView surfaceView2 = this.f28368G;
                                InterfaceC1163x interfaceC1163x = this.f28369H;
                                p219v8.l lVar2 = this.f28370I;
                                p219v8.a aVar = this.f28380x;
                                E e15 = this.f28371J;
                                boolean z9 = this.f28364C;
                                E e16 = this.f28372K;
                                i iVar = (i) e14.f22779q;
                                if (iVar == null) {
                                    o oVarV = l.f28194a.v(kVar, cardView, dVar2, surfaceView, surfaceView2, interfaceC1163x.getLifecycle(), l.o(z9, e13) ? lVar2 : null, aVar);
                                    InterfaceC0807d0 interfaceC0807d0 = (InterfaceC0807d0) e16.f22779q;
                                    if (interfaceC0807d0 != null) {
                                        interfaceC0807d0.dispose();
                                    }
                                    e16.f22779q = oVarV.c();
                                    e14.f22779q = oVarV.d();
                                    iVar = (h) oVarV.d();
                                }
                                if (cardView.isAttachedToWindow()) {
                                    iVar.b();
                                    iVar.c(true);
                                } else {
                                    final ViewOnAttachStateChangeListenerC0709a viewOnAttachStateChangeListenerC0709a = new ViewOnAttachStateChangeListenerC0709a(iVar, cardView);
                                    cardView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0709a);
                                    e15.f22779q = new InterfaceC0807d0() { // from class: v3.o
                                        @Override // F8.InterfaceC0807d0
                                        public final void dispose() {
                                            l.c.e.a.C0708a.u(cardView, viewOnAttachStateChangeListenerC0709a);
                                        }
                                    };
                                }
                            }
                        }
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(InterfaceC1163x interfaceC1163x, E e10, p234x3.d dVar, Activity activity, E e11, boolean z9, p219v8.a aVar, AtomicBoolean atomicBoolean, boolean z10, boolean z11, boolean z12, boolean z13, E e12, CardView cardView, SurfaceView surfaceView, SurfaceView surfaceView2, p219v8.l lVar, E e13, E e14, p129m8.e eVar) {
                    super(2, eVar);
                    this.f28353r = interfaceC1163x;
                    this.f28354s = e10;
                    this.f28355t = dVar;
                    this.f28356u = activity;
                    this.f28357v = e11;
                    this.f28358w = z9;
                    this.f28359x = aVar;
                    this.f28360y = atomicBoolean;
                    this.f28361z = z10;
                    this.f28342A = z11;
                    this.f28343B = z12;
                    this.f28344C = z13;
                    this.f28345D = e12;
                    this.f28346E = cardView;
                    this.f28347F = surfaceView;
                    this.f28348G = surfaceView2;
                    this.f28349H = lVar;
                    this.f28350I = e13;
                    this.f28351J = e14;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new a(this.f28353r, this.f28354s, this.f28355t, this.f28356u, this.f28357v, this.f28358w, this.f28359x, this.f28360y, this.f28361z, this.f28342A, this.f28343B, this.f28344C, this.f28345D, this.f28346E, this.f28347F, this.f28348G, this.f28349H, this.f28350I, this.f28351J, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    p139n8.b.e();
                    if (this.f28352q != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    AbstractC0816i.d(AbstractC1164y.a(this.f28353r), null, null, new C0708a(this.f28354s, this.f28355t, this.f28356u, this.f28357v, this.f28358w, this.f28359x, this.f28360y, this.f28361z, this.f28342A, this.f28343B, this.f28344C, this.f28345D, this.f28346E, this.f28347F, this.f28348G, this.f28353r, this.f28349H, this.f28350I, this.f28351J, null), 3, null);
                    return A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(InterfaceC1163x interfaceC1163x, E e10, p234x3.d dVar, Activity activity, E e11, boolean z9, p219v8.a aVar, AtomicBoolean atomicBoolean, boolean z10, boolean z11, boolean z12, boolean z13, E e12, CardView cardView, SurfaceView surfaceView, SurfaceView surfaceView2, p219v8.l lVar, E e13, E e14, p129m8.e eVar) {
                super(2, eVar);
                this.f28333r = interfaceC1163x;
                this.f28334s = e10;
                this.f28335t = dVar;
                this.f28336u = activity;
                this.f28337v = e11;
                this.f28338w = z9;
                this.f28339x = aVar;
                this.f28340y = atomicBoolean;
                this.f28341z = z10;
                this.f28322A = z11;
                this.f28323B = z12;
                this.f28324C = z13;
                this.f28325D = e12;
                this.f28326E = cardView;
                this.f28327F = surfaceView;
                this.f28328G = surfaceView2;
                this.f28329H = lVar;
                this.f28330I = e13;
                this.f28331J = e14;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new e(this.f28333r, this.f28334s, this.f28335t, this.f28336u, this.f28337v, this.f28338w, this.f28339x, this.f28340y, this.f28341z, this.f28322A, this.f28323B, this.f28324C, this.f28325D, this.f28326E, this.f28327F, this.f28328G, this.f28329H, this.f28330I, this.f28331J, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((e) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f28332q;
                if (i10 == 0) {
                    r.b(obj);
                    InterfaceC1163x interfaceC1163x = this.f28333r;
                    AbstractC1157q.b bVar = AbstractC1157q.b.RESUMED;
                    a aVar = new a(interfaceC1163x, this.f28334s, this.f28335t, this.f28336u, this.f28337v, this.f28338w, this.f28339x, this.f28340y, this.f28341z, this.f28322A, this.f28323B, this.f28324C, this.f28325D, this.f28326E, this.f28327F, this.f28328G, this.f28329H, this.f28330I, this.f28331J, null);
                    this.f28332q = 1;
                    if (N.b(interfaceC1163x, bVar, aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1163x interfaceC1163x, SurfaceView surfaceView, E e10, SurfaceView surfaceView2, E e11, CardView cardView, Runnable runnable, E e12, boolean z9, p234x3.d dVar, boolean z10, Activity activity, E e13, boolean z11, p219v8.a aVar, AtomicBoolean atomicBoolean, boolean z12, boolean z13, boolean z14, boolean z15, p219v8.a aVar2, SurfaceView surfaceView3, p219v8.l lVar, E e14, E e15, p129m8.e eVar) {
            super(2, eVar);
            this.f28219s = interfaceC1163x;
            this.f28220t = surfaceView;
            this.f28221u = e10;
            this.f28222v = surfaceView2;
            this.f28223w = e11;
            this.f28224x = cardView;
            this.f28225y = runnable;
            this.f28226z = e12;
            this.f28200A = z9;
            this.f28201B = dVar;
            this.f28202C = z10;
            this.f28203D = activity;
            this.f28204E = e13;
            this.f28205F = z11;
            this.f28206G = aVar;
            this.f28207H = atomicBoolean;
            this.f28208I = z12;
            this.f28209J = z13;
            this.f28210K = z14;
            this.f28211L = z15;
            this.f28212M = aVar2;
            this.f28213N = surfaceView3;
            this.f28214O = lVar;
            this.f28215P = e14;
            this.f28216Q = e15;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            c cVar = new c(this.f28219s, this.f28220t, this.f28221u, this.f28222v, this.f28223w, this.f28224x, this.f28225y, this.f28226z, this.f28200A, this.f28201B, this.f28202C, this.f28203D, this.f28204E, this.f28205F, this.f28206G, this.f28207H, this.f28208I, this.f28209J, this.f28210K, this.f28211L, this.f28212M, this.f28213N, this.f28214O, this.f28215P, this.f28216Q, eVar);
            cVar.f28218r = obj;
            return cVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f28217q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            L l9 = (L) this.f28218r;
            AbstractC0816i.d(l9, null, null, new a(this.f28219s, this.f28220t, this.f28221u, this.f28222v, this.f28223w, this.f28224x, this.f28225y, this.f28226z, this.f28200A, this.f28201B, this.f28202C, this.f28203D, this.f28204E, this.f28205F, this.f28206G, this.f28207H, this.f28208I, this.f28209J, this.f28210K, this.f28211L, null), 3, null);
            AbstractC0816i.d(l9, null, null, new b(this.f28219s, this.f28201B, this.f28212M, null), 3, null);
            AbstractC0816i.d(l9, null, null, new C0703c(this.f28219s, this.f28201B, this.f28200A, this.f28220t, this.f28221u, null), 3, null);
            AbstractC0816i.d(l9, null, null, new d(this.f28219s, this.f28201B, this.f28200A, this.f28220t, this.f28221u, null), 3, null);
            AbstractC0816i.d(l9, null, null, new e(this.f28219s, this.f28204E, this.f28201B, this.f28203D, this.f28223w, this.f28205F, this.f28206G, this.f28207H, this.f28208I, this.f28209J, this.f28210K, this.f28211L, this.f28226z, this.f28224x, this.f28222v, this.f28213N, this.f28214O, this.f28215P, this.f28216Q, null), 3, null);
            return A.f21846a;
        }
    }

    public static final class d implements C.c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p234x3.d f28385q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f28386r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ k f28387s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ RemoteCallback f28388t;

        d(p234x3.d dVar, p219v8.a aVar, k kVar, RemoteCallback remoteCallback) {
            this.f28385q = dVar;
            this.f28386r = aVar;
            this.f28387s = kVar;
            this.f28388t = remoteCallback;
        }

        @Override // H3.C.c
        public void e(IWallpaperEngine iWallpaperEngine) {
            if (G6.e.i(this.f28387s)) {
                g.a(iWallpaperEngine, this.f28385q.i().ordinal(), false, true, this.f28388t);
            }
        }

        @Override // H3.C.c
        public void m() {
            this.f28386r.invoke();
        }

        @Override // H3.C.c
        public void onWallpaperColorsChanged(WallpaperColors wallpaperColors, int i10) {
            this.f28385q.l(wallpaperColors);
        }
    }

    public static final class e implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p219v8.a f28389a;

        e(p219v8.a aVar) {
            this.f28389a = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (view != null) {
                view.removeOnLayoutChangeListener(this);
            }
            this.f28389a.invoke();
        }
    }

    private l() {
    }

    public static final a l(Activity activity, CardView previewView, p234x3.d viewModel, InterfaceC1163x lifecycleOwner, boolean z9, boolean z10, final boolean z11, boolean z12, boolean z13, p219v8.a onWallpaperPreviewDirty, SurfaceView surfaceView, boolean z14) {
        n.h(activity, "activity");
        n.h(previewView, "previewView");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(onWallpaperPreviewDirty, "onWallpaperPreviewDirty");
        View viewRequireViewById = previewView.requireViewById(R.id.workspace_surface);
        n.g(viewRequireViewById, "requireViewById(...)");
        final SurfaceView surfaceView2 = (SurfaceView) viewRequireViewById;
        View viewRequireViewById2 = previewView.requireViewById(R.id.wallpaper_surface);
        n.g(viewRequireViewById2, "requireViewById(...)");
        final SurfaceView surfaceView3 = (SurfaceView) viewRequireViewById2;
        final View viewFindViewById = z14 ? previewView.findViewById(R.id.preview_dimming_scrim) : null;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Object parent = previewView.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.setContentDescription(activity.getResources().getString(viewModel.g()));
        }
        if (view != null) {
            view.setImportantForAccessibility(1);
        }
        previewView.setImportantForAccessibility(4);
        p219v8.a aVar = new p219v8.a() { // from class: v3.i
            @Override // p219v8.a
            public final Object invoke() {
                return l.r(surfaceView3, surfaceView2, z11, viewFindViewById);
            }
        };
        surfaceView3.setZOrderOnTop(false);
        if (z13) {
            View viewRequireViewById3 = previewView.requireViewById(R.id.wallpaper_dimming_scrim);
            n.g(viewRequireViewById3, "requireViewById(...)");
            viewRequireViewById3.setVisibility(0);
            surfaceView2.setZOrderOnTop(true);
        }
        previewView.setRadius(previewView.getResources().getDimension(R.dimen.wallpaper_picker_entry_card_corner_radius));
        H6.b.a(surfaceView2, previewView.getRadius());
        H6.b.a(surfaceView3, previewView.getRadius());
        E e10 = new E();
        final E e11 = new E();
        final E e12 = new E();
        final E e13 = new E();
        boolean z15 = viewModel.i() == InterfaceC1364d.a.LOCK_SCREEN;
        final boolean zD = n.d(previewView.getTag(R.id.preview_location), previewView.getContext().getString(R.string.preview_location_main));
        p219v8.l lVar = new p219v8.l() { // from class: v3.j
            @Override // p219v8.l
            public final Object f(Object obj) {
                return l.s(e11, zD, e13, (Bitmap) obj);
            }
        };
        final E e14 = new E();
        final E e15 = new E();
        return new b(e10, AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new c(lifecycleOwner, surfaceView2, e10, surfaceView3, e11, previewView, new Runnable() { // from class: v3.k
            @Override // java.lang.Runnable
            public final void run() {
                l.t(e14, e15, e12);
            }
        }, e12, z11, viewModel, z13, activity, e13, z12, aVar, atomicBoolean, z10, z9, z15, zD, onWallpaperPreviewDirty, surfaceView, lVar, e14, e15, null), 3, null), surfaceView2, surfaceView3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(CardView cardView, Runnable runnable) {
        cardView.removeCallbacks(runnable);
        runnable.run();
    }

    public static /* synthetic */ a n(Activity activity, CardView cardView, p234x3.d dVar, InterfaceC1163x interfaceC1163x, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, p219v8.a aVar, SurfaceView surfaceView, boolean z14, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z9 = false;
        }
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        if ((i10 & 64) != 0) {
            z11 = false;
        }
        if ((i10 & 256) != 0) {
            z13 = false;
        }
        if ((i10 & Optimizer.OPTIMIZATION_GROUPING) != 0) {
            surfaceView = null;
        }
        if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
            z14 = false;
        }
        return l(activity, cardView, dVar, interfaceC1163x, z9, z10, z11, z12, z13, aVar, surfaceView, z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(boolean z9, E e10) {
        x xVar;
        return z9 && (xVar = (x) e10.f22779q) != null && G6.e.i(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(boolean z9, E e10) {
        x xVar;
        return z9 && (xVar = (x) e10.f22779q) != null && G6.e.m(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(boolean z9, boolean z10, E e10) {
        x xVar;
        return z9 || (z10 && (xVar = (x) e10.f22779q) != null && G6.e.i(xVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A r(SurfaceView surfaceView, SurfaceView surfaceView2, boolean z9, View view) {
        surfaceView.setBackgroundColor(0);
        surfaceView2.setVisibility(z9 ? 8 : 0);
        if (view != null) {
            view.setVisibility(0);
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A s(E e10, boolean z9, E e11, Bitmap it) {
        ImageView imageViewC;
        n.h(it, "it");
        if (o(z9, e11)) {
            com.nothing.wallpaper.common.log.c.k("ScreenPreviewBinder", "received blur frame.");
            f28195b = it;
            F f10 = (F) e10.f22779q;
            if (f10 != null && (imageViewC = f10.c()) != null) {
                imageViewC.setImageBitmap(it);
            }
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(E e10, E e11, E e12) {
        InterfaceC0807d0 interfaceC0807d0 = (InterfaceC0807d0) e10.f22779q;
        if (interfaceC0807d0 != null) {
            interfaceC0807d0.dispose();
        }
        InterfaceC0807d0 interfaceC0807d1 = (InterfaceC0807d0) e11.f22779q;
        if (interfaceC0807d1 != null) {
            interfaceC0807d1.dispose();
        }
        e11.f22779q = null;
        i iVar = (i) e12.f22779q;
        if (iVar != null) {
            iVar.a();
        }
        e12.f22779q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(boolean z9, SurfaceView surfaceView, E e10, p234x3.d dVar) {
        if (z9) {
            return;
        }
        surfaceView.getHolder().removeCallback((SurfaceHolder.Callback) e10.f22779q);
        M0 m9 = (M0) e10.f22779q;
        if (m9 != null) {
            m9.b();
        }
        f28194a.x(surfaceView);
        e10.f22779q = new M0(surfaceView, dVar.h(), dVar.f());
        surfaceView.getHolder().addCallback((SurfaceHolder.Callback) e10.f22779q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o v(k kVar, CardView cardView, p234x3.d dVar, SurfaceView surfaceView, SurfaceView surfaceView2, AbstractC1157q abstractC1157q, p219v8.l lVar, p219v8.a aVar) {
        h hVar;
        o oVarG = (!G6.e.i(kVar) || lVar == null) ? null : f.g(abstractC1157q, lVar);
        RemoteCallback remoteCallback = oVarG != null ? (RemoteCallback) oVarG.d() : null;
        InterfaceC0807d0 interfaceC0807d0 = oVarG != null ? (InterfaceC0807d0) oVarG.c() : null;
        d dVar2 = new d(dVar, aVar, kVar, remoteCallback);
        Bundle bundleF = dVar.f();
        boolean z9 = bundleF != null ? bundleF.getBoolean("key_enable_cache", true) : true;
        if (w.f15765i) {
            hVar = new h(kVar, surfaceView, surfaceView2, dVar2, dVar.i().e(), C.d.PREVIEW_CURRENT, z9, kVar.A());
            hVar.A(lVar == null);
        } else {
            hVar = new h(kVar, surfaceView, surfaceView2, dVar2, dVar.i().e(), C.d.PREVIEW_CURRENT, z9, null, Optimizer.OPTIMIZATION_GRAPH_WRAP, null);
            hVar.A(lVar == null);
        }
        return new o(interfaceC0807d0, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(Activity activity, x xVar, boolean z9, F f10, boolean z10, boolean z11, p219v8.a aVar, AtomicBoolean atomicBoolean) {
        if (xVar == null || f10 == null) {
            return;
        }
        ImageView imageViewC = f10.c();
        com.android.wallpaper.asset.a aVarO = xVar.o(activity);
        n.g(aVarO, "getThumbAsset(...)");
        if (imageViewC == null || imageViewC.getDrawable() != null) {
            return;
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            if (z11) {
                Bitmap bitmap = f28195b;
                if (bitmap != null) {
                    com.nothing.wallpaper.common.log.c.k("ScreenPreviewBinder", "set home screen thumbnail with blur cache.");
                    imageViewC.setImageBitmap(bitmap);
                    return;
                }
                return;
            }
            new com.android.wallpaper.asset.d(activity, aVarO).r(activity, imageViewC, G6.e.f(activity), !(aVarO instanceof com.android.wallpaper.asset.h) || z10);
            if (z9 || !(xVar instanceof k)) {
                imageViewC.addOnLayoutChangeListener(new e(aVar));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(View view) {
        int iIndexOfChild;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null || (iIndexOfChild = viewGroup.indexOfChild(view)) < 0) {
            return;
        }
        viewGroup.removeView(view);
        viewGroup.addView(view, iIndexOfChild);
    }
}

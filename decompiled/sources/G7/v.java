package G7;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.H0;
import F8.InterfaceC0807d0;
import F8.InterfaceC0846x0;
import F8.L;
import H3.C;
import H3.F;
import android.app.Activity;
import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1148h;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.nothing.wallpaper.R;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.E;
import p074h3.I;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f2149a = new v();

    public interface a {
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0846x0 f2150a;

        b(InterfaceC0846x0 interfaceC0846x0) {
            this.f2150a = interfaceC0846x0;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        final /* synthetic */ E f2151A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        final /* synthetic */ p219v8.p f2152B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ ImageView f2153C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f2154D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f2155E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p219v8.a f2156F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ com.android.wallpaper.asset.a.f f2157G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ WallpaperManager f2158H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p064g3.v f2159I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p219v8.l f2160J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p219v8.a f2161K;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2162q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f2163r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f2164s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ SurfaceView f2165t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ E f2166u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ E f2167v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ E f2168w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ boolean f2169x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ Activity f2170y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ CardView f2171z;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f2172q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f2173r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ InterfaceC1163x f2174s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ SurfaceView f2175t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ E f2176u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ E f2177v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ E f2178w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ boolean f2179x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ Activity f2180y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ CardView f2181z;

            /* JADX INFO: renamed from: G7.v$c$a$a, reason: collision with other inner class name */
            static final class C0092a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f2182q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ E f2183r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ SurfaceView f2184s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ InterfaceC1163x f2185t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ b f2186u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                final /* synthetic */ boolean f2187v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                final /* synthetic */ Activity f2188w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                final /* synthetic */ CardView f2189x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0092a(E e10, SurfaceView surfaceView, InterfaceC1163x interfaceC1163x, b bVar, boolean z9, Activity activity, CardView cardView, p129m8.e eVar) {
                    super(2, eVar);
                    this.f2183r = e10;
                    this.f2184s = surfaceView;
                    this.f2185t = interfaceC1163x;
                    this.f2186u = bVar;
                    this.f2187v = z9;
                    this.f2188w = activity;
                    this.f2189x = cardView;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0092a(this.f2183r, this.f2184s, this.f2185t, this.f2186u, this.f2187v, this.f2188w, this.f2189x, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0092a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    p139n8.b.e();
                    if (this.f2182q != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                    this.f2183r.f22779q = v.l(this.f2187v, this.f2188w, this.f2189x, this.f2184s);
                    this.f2184s.getHolder().addCallback((SurfaceHolder.Callback) this.f2183r.f22779q);
                    this.f2184s.setZOrderMediaOverlay(true);
                    this.f2185t.getLifecycle().a(this.f2186u);
                    return A.f21846a;
                }
            }

            public static final class b implements InterfaceC1148h {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ E f2190q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ E f2191r;

                b(E e10, E e11) {
                    this.f2190q = e10;
                    this.f2191r = e11;
                }

                @Override // androidx.lifecycle.InterfaceC1148h
                public void j(InterfaceC1163x owner) {
                    kotlin.jvm.internal.n.h(owner, "owner");
                    super.j(owner);
                    p187s6.i iVar = (p187s6.i) this.f2191r.f22779q;
                    if (iVar != null) {
                        iVar.c(false);
                    }
                }

                @Override // androidx.lifecycle.InterfaceC1148h
                public void onStop(InterfaceC1163x owner) {
                    kotlin.jvm.internal.n.h(owner, "owner");
                    super.onStop(owner);
                    v.k(this.f2190q, this.f2191r);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC1163x interfaceC1163x, SurfaceView surfaceView, E e10, E e11, E e12, boolean z9, Activity activity, CardView cardView, p129m8.e eVar) {
                super(2, eVar);
                this.f2174s = interfaceC1163x;
                this.f2175t = surfaceView;
                this.f2176u = e10;
                this.f2177v = e11;
                this.f2178w = e12;
                this.f2179x = z9;
                this.f2180y = activity;
                this.f2181z = cardView;
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
                return new a(this.f2174s, this.f2175t, this.f2176u, this.f2177v, this.f2178w, this.f2179x, this.f2180y, this.f2181z, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                b bVar;
                Object objE = p139n8.b.e();
                int i10 = this.f2173r;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    b bVar2 = new b(this.f2177v, this.f2178w);
                    InterfaceC1163x interfaceC1163x = this.f2174s;
                    AbstractC1157q.b bVar3 = AbstractC1157q.b.CREATED;
                    C0092a c0092a = new C0092a(this.f2176u, this.f2175t, interfaceC1163x, bVar2, this.f2179x, this.f2180y, this.f2181z, null);
                    this.f2172q = bVar2;
                    this.f2173r = 1;
                    if (N.b(interfaceC1163x, bVar3, c0092a, this) == objE) {
                        return objE;
                    }
                    bVar = bVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b) this.f2172q;
                    p079h8.r.b(obj);
                }
                this.f2174s.getLifecycle().d(bVar);
                this.f2175t.getHolder().removeCallback((SurfaceHolder.Callback) this.f2176u.f22779q);
                F f10 = (F) this.f2176u.f22779q;
                ImageView imageViewC = f10 != null ? f10.c() : null;
                if (imageViewC == null || !imageViewC.isAttachedToWindow()) {
                    F f11 = (F) this.f2176u.f22779q;
                    if (f11 != null) {
                        f11.b();
                    }
                } else {
                    final E e10 = this.f2176u;
                    kotlin.coroutines.jvm.internal.b.a(imageViewC.post(new Runnable() { // from class: G7.w
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.c.a.u(e10);
                        }
                    }));
                }
                return A.f21846a;
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: A, reason: collision with root package name */
            final /* synthetic */ com.android.wallpaper.asset.a.f f2192A;

            /* JADX INFO: renamed from: B, reason: collision with root package name */
            final /* synthetic */ WallpaperManager f2193B;

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ p064g3.v f2194C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ SurfaceView f2195D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ E f2196E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ p219v8.l f2197F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ p219v8.a f2198G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ CardView f2199H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ E f2200I;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f2201q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC1163x f2202r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ E f2203s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ p219v8.p f2204t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ ImageView f2205u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Activity f2206v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ boolean f2207w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ AtomicBoolean f2208x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ boolean f2209y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ p219v8.a f2210z;

            static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: A, reason: collision with root package name */
                final /* synthetic */ com.android.wallpaper.asset.a.f f2211A;

                /* JADX INFO: renamed from: B, reason: collision with root package name */
                final /* synthetic */ WallpaperManager f2212B;

                /* JADX INFO: renamed from: C, reason: collision with root package name */
                final /* synthetic */ p064g3.v f2213C;

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ SurfaceView f2214D;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                final /* synthetic */ E f2215E;

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                final /* synthetic */ p219v8.l f2216F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                final /* synthetic */ p219v8.a f2217G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                final /* synthetic */ CardView f2218H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                final /* synthetic */ E f2219I;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f2220q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ InterfaceC1163x f2221r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ E f2222s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ p219v8.p f2223t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ ImageView f2224u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                final /* synthetic */ Activity f2225v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                final /* synthetic */ boolean f2226w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                final /* synthetic */ AtomicBoolean f2227x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                final /* synthetic */ boolean f2228y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                final /* synthetic */ p219v8.a f2229z;

                /* JADX INFO: renamed from: G7.v$c$b$a$a, reason: collision with other inner class name */
                static final class C0093a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                    /* JADX INFO: renamed from: A, reason: collision with root package name */
                    final /* synthetic */ com.android.wallpaper.asset.a.f f2230A;

                    /* JADX INFO: renamed from: B, reason: collision with root package name */
                    final /* synthetic */ InterfaceC1163x f2231B;

                    /* JADX INFO: renamed from: C, reason: collision with root package name */
                    final /* synthetic */ WallpaperManager f2232C;

                    /* JADX INFO: renamed from: D, reason: collision with root package name */
                    final /* synthetic */ p064g3.v f2233D;

                    /* JADX INFO: renamed from: E, reason: collision with root package name */
                    final /* synthetic */ SurfaceView f2234E;

                    /* JADX INFO: renamed from: F, reason: collision with root package name */
                    final /* synthetic */ E f2235F;

                    /* JADX INFO: renamed from: G, reason: collision with root package name */
                    final /* synthetic */ p219v8.l f2236G;

                    /* JADX INFO: renamed from: H, reason: collision with root package name */
                    final /* synthetic */ p219v8.a f2237H;

                    /* JADX INFO: renamed from: I, reason: collision with root package name */
                    final /* synthetic */ CardView f2238I;

                    /* JADX INFO: renamed from: J, reason: collision with root package name */
                    final /* synthetic */ E f2239J;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    Object f2240q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    int f2241r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ E f2242s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ p219v8.p f2243t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    final /* synthetic */ ImageView f2244u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    final /* synthetic */ Activity f2245v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    final /* synthetic */ boolean f2246w;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    final /* synthetic */ AtomicBoolean f2247x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    final /* synthetic */ boolean f2248y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    final /* synthetic */ p219v8.a f2249z;

                    /* JADX INFO: renamed from: G7.v$c$b$a$a$a, reason: collision with other inner class name */
                    public static final class ViewOnAttachStateChangeListenerC0094a implements View.OnAttachStateChangeListener {

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        final /* synthetic */ p187s6.i f2250q;

                        /* JADX INFO: renamed from: r, reason: collision with root package name */
                        final /* synthetic */ CardView f2251r;

                        ViewOnAttachStateChangeListenerC0094a(p187s6.i iVar, CardView cardView) {
                            this.f2250q = iVar;
                            this.f2251r = cardView;
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View v9) {
                            kotlin.jvm.internal.n.h(v9, "v");
                            this.f2250q.b();
                            this.f2250q.c(true);
                            this.f2251r.removeOnAttachStateChangeListener(this);
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View v9) {
                            kotlin.jvm.internal.n.h(v9, "v");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0093a(E e10, p219v8.p pVar, ImageView imageView, Activity activity, boolean z9, AtomicBoolean atomicBoolean, boolean z10, p219v8.a aVar, com.android.wallpaper.asset.a.f fVar, InterfaceC1163x interfaceC1163x, WallpaperManager wallpaperManager, p064g3.v vVar, SurfaceView surfaceView, E e11, p219v8.l lVar, p219v8.a aVar2, CardView cardView, E e12, p129m8.e eVar) {
                        super(2, eVar);
                        this.f2242s = e10;
                        this.f2243t = pVar;
                        this.f2244u = imageView;
                        this.f2245v = activity;
                        this.f2246w = z9;
                        this.f2247x = atomicBoolean;
                        this.f2248y = z10;
                        this.f2249z = aVar;
                        this.f2230A = fVar;
                        this.f2231B = interfaceC1163x;
                        this.f2232C = wallpaperManager;
                        this.f2233D = vVar;
                        this.f2234E = surfaceView;
                        this.f2235F = e11;
                        this.f2236G = lVar;
                        this.f2237H = aVar2;
                        this.f2238I = cardView;
                        this.f2239J = e12;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void u(CardView cardView, ViewOnAttachStateChangeListenerC0094a viewOnAttachStateChangeListenerC0094a) {
                        cardView.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0094a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        return new C0093a(this.f2242s, this.f2243t, this.f2244u, this.f2245v, this.f2246w, this.f2247x, this.f2248y, this.f2249z, this.f2230A, this.f2231B, this.f2232C, this.f2233D, this.f2234E, this.f2235F, this.f2236G, this.f2237H, this.f2238I, this.f2239J, eVar);
                    }

                    @Override // p219v8.p
                    public final Object invoke(L l9, p129m8.e eVar) {
                        return ((C0093a) create(l9, eVar)).invokeSuspend(A.f21846a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        E e10;
                        Object objE = p139n8.b.e();
                        int i10 = this.f2241r;
                        if (i10 == 0) {
                            p079h8.r.b(obj);
                            E e11 = this.f2242s;
                            p219v8.p pVar = this.f2243t;
                            Boolean boolA = kotlin.coroutines.jvm.internal.b.a(false);
                            this.f2240q = e11;
                            this.f2241r = 1;
                            Object objInvoke = pVar.invoke(boolA, this);
                            if (objInvoke == objE) {
                                return objE;
                            }
                            e10 = e11;
                            obj = objInvoke;
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e10 = (E) this.f2240q;
                            p079h8.r.b(obj);
                        }
                        e10.f22779q = obj;
                        v.p(this.f2231B, this.f2232C, this.f2233D);
                        if (v.q()) {
                            this.f2244u.setVisibility(0);
                            v.f2149a.s(this.f2245v, (p064g3.x) this.f2242s.f22779q, this.f2244u, this.f2246w, this.f2247x, this.f2248y, this.f2249z, this.f2230A);
                        }
                        if (!v.m(this.f2242s)) {
                            Object obj2 = this.f2242s.f22779q;
                            p064g3.k kVar = obj2 instanceof p064g3.k ? (p064g3.k) obj2 : null;
                            if (kVar != null) {
                                SurfaceView surfaceView = this.f2234E;
                                E e12 = this.f2235F;
                                p219v8.l lVar = this.f2236G;
                                p219v8.a aVar = this.f2237H;
                                final CardView cardView = this.f2238I;
                                E e13 = this.f2239J;
                                surfaceView.setVisibility(0);
                                p187s6.i iVarR = (p187s6.i) e12.f22779q;
                                if (iVarR == null) {
                                    iVarR = v.f2149a.r(kVar, lVar, surfaceView, aVar);
                                    e12.f22779q = iVarR;
                                }
                                if (cardView.isAttachedToWindow()) {
                                    iVarR.b();
                                    iVarR.c(true);
                                } else {
                                    final ViewOnAttachStateChangeListenerC0094a viewOnAttachStateChangeListenerC0094a = new ViewOnAttachStateChangeListenerC0094a(iVarR, cardView);
                                    cardView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0094a);
                                    e13.f22779q = new InterfaceC0807d0() { // from class: G7.x
                                        @Override // F8.InterfaceC0807d0
                                        public final void dispose() {
                                            v.c.b.a.C0093a.u(cardView, viewOnAttachStateChangeListenerC0094a);
                                        }
                                    };
                                }
                            }
                        }
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(InterfaceC1163x interfaceC1163x, E e10, p219v8.p pVar, ImageView imageView, Activity activity, boolean z9, AtomicBoolean atomicBoolean, boolean z10, p219v8.a aVar, com.android.wallpaper.asset.a.f fVar, WallpaperManager wallpaperManager, p064g3.v vVar, SurfaceView surfaceView, E e11, p219v8.l lVar, p219v8.a aVar2, CardView cardView, E e12, p129m8.e eVar) {
                    super(2, eVar);
                    this.f2221r = interfaceC1163x;
                    this.f2222s = e10;
                    this.f2223t = pVar;
                    this.f2224u = imageView;
                    this.f2225v = activity;
                    this.f2226w = z9;
                    this.f2227x = atomicBoolean;
                    this.f2228y = z10;
                    this.f2229z = aVar;
                    this.f2211A = fVar;
                    this.f2212B = wallpaperManager;
                    this.f2213C = vVar;
                    this.f2214D = surfaceView;
                    this.f2215E = e11;
                    this.f2216F = lVar;
                    this.f2217G = aVar2;
                    this.f2218H = cardView;
                    this.f2219I = e12;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new a(this.f2221r, this.f2222s, this.f2223t, this.f2224u, this.f2225v, this.f2226w, this.f2227x, this.f2228y, this.f2229z, this.f2211A, this.f2212B, this.f2213C, this.f2214D, this.f2215E, this.f2216F, this.f2217G, this.f2218H, this.f2219I, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    p139n8.b.e();
                    if (this.f2220q != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                    AbstractC0816i.d(AbstractC1164y.a(this.f2221r), null, null, new C0093a(this.f2222s, this.f2223t, this.f2224u, this.f2225v, this.f2226w, this.f2227x, this.f2228y, this.f2229z, this.f2211A, this.f2221r, this.f2212B, this.f2213C, this.f2214D, this.f2215E, this.f2216F, this.f2217G, this.f2218H, this.f2219I, null), 3, null);
                    return A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC1163x interfaceC1163x, E e10, p219v8.p pVar, ImageView imageView, Activity activity, boolean z9, AtomicBoolean atomicBoolean, boolean z10, p219v8.a aVar, com.android.wallpaper.asset.a.f fVar, WallpaperManager wallpaperManager, p064g3.v vVar, SurfaceView surfaceView, E e11, p219v8.l lVar, p219v8.a aVar2, CardView cardView, E e12, p129m8.e eVar) {
                super(2, eVar);
                this.f2202r = interfaceC1163x;
                this.f2203s = e10;
                this.f2204t = pVar;
                this.f2205u = imageView;
                this.f2206v = activity;
                this.f2207w = z9;
                this.f2208x = atomicBoolean;
                this.f2209y = z10;
                this.f2210z = aVar;
                this.f2192A = fVar;
                this.f2193B = wallpaperManager;
                this.f2194C = vVar;
                this.f2195D = surfaceView;
                this.f2196E = e11;
                this.f2197F = lVar;
                this.f2198G = aVar2;
                this.f2199H = cardView;
                this.f2200I = e12;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new b(this.f2202r, this.f2203s, this.f2204t, this.f2205u, this.f2206v, this.f2207w, this.f2208x, this.f2209y, this.f2210z, this.f2192A, this.f2193B, this.f2194C, this.f2195D, this.f2196E, this.f2197F, this.f2198G, this.f2199H, this.f2200I, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f2201q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    InterfaceC1163x interfaceC1163x = this.f2202r;
                    AbstractC1157q.b bVar = AbstractC1157q.b.RESUMED;
                    a aVar = new a(interfaceC1163x, this.f2203s, this.f2204t, this.f2205u, this.f2206v, this.f2207w, this.f2208x, this.f2209y, this.f2210z, this.f2192A, this.f2193B, this.f2194C, this.f2195D, this.f2196E, this.f2197F, this.f2198G, this.f2199H, this.f2200I, null);
                    this.f2201q = 1;
                    if (N.b(interfaceC1163x, bVar, aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                }
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1163x interfaceC1163x, SurfaceView surfaceView, E e10, E e11, E e12, boolean z9, Activity activity, CardView cardView, E e13, p219v8.p pVar, ImageView imageView, boolean z10, AtomicBoolean atomicBoolean, p219v8.a aVar, com.android.wallpaper.asset.a.f fVar, WallpaperManager wallpaperManager, p064g3.v vVar, p219v8.l lVar, p219v8.a aVar2, p129m8.e eVar) {
            super(2, eVar);
            this.f2164s = interfaceC1163x;
            this.f2165t = surfaceView;
            this.f2166u = e10;
            this.f2167v = e11;
            this.f2168w = e12;
            this.f2169x = z9;
            this.f2170y = activity;
            this.f2171z = cardView;
            this.f2151A = e13;
            this.f2152B = pVar;
            this.f2153C = imageView;
            this.f2154D = z10;
            this.f2155E = atomicBoolean;
            this.f2156F = aVar;
            this.f2157G = fVar;
            this.f2158H = wallpaperManager;
            this.f2159I = vVar;
            this.f2160J = lVar;
            this.f2161K = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            c cVar = new c(this.f2164s, this.f2165t, this.f2166u, this.f2167v, this.f2168w, this.f2169x, this.f2170y, this.f2171z, this.f2151A, this.f2152B, this.f2153C, this.f2154D, this.f2155E, this.f2156F, this.f2157G, this.f2158H, this.f2159I, this.f2160J, this.f2161K, eVar);
            cVar.f2163r = obj;
            return cVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f2162q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            L l9 = (L) this.f2163r;
            AbstractC0816i.d(l9, null, null, new a(this.f2164s, this.f2165t, this.f2166u, this.f2167v, this.f2168w, this.f2169x, this.f2170y, this.f2171z, null), 3, null);
            AbstractC0816i.d(l9, null, null, new b(this.f2164s, this.f2151A, this.f2152B, this.f2153C, this.f2170y, this.f2154D, this.f2155E, this.f2169x, this.f2156F, this.f2157G, this.f2158H, this.f2159I, this.f2165t, this.f2168w, this.f2160J, this.f2161K, this.f2171z, this.f2167v, null), 3, null);
            return A.f21846a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2252q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ WallpaperManager f2253r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p064g3.v f2254s;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f2255q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ p064g3.v f2256r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ WallpaperColors f2257s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p064g3.v vVar, WallpaperColors wallpaperColors, p129m8.e eVar) {
                super(2, eVar);
                this.f2256r = vVar;
                this.f2257s = wallpaperColors;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f2256r, this.f2257s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f2255q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                this.f2256r.j(this.f2257s);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(WallpaperManager wallpaperManager, p064g3.v vVar, p129m8.e eVar) {
            super(2, eVar);
            this.f2253r = wallpaperManager;
            this.f2254s = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new d(this.f2253r, this.f2254s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f2252q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                WallpaperColors wallpaperColors = this.f2253r.getWallpaperColors(2);
                H0 h0C = C0803b0.c();
                a aVar = new a(this.f2254s, wallpaperColors, null);
                this.f2252q = 1;
                if (AbstractC0812g.g(h0C, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return A.f21846a;
        }
    }

    public static final class e implements C.c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p219v8.l f2258q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f2259r;

        e(p219v8.l lVar, p219v8.a aVar) {
            this.f2258q = lVar;
            this.f2259r = aVar;
        }

        @Override // H3.C.c
        public void m() {
            this.f2259r.invoke();
        }

        @Override // H3.C.c
        public void onWallpaperColorsChanged(WallpaperColors wallpaperColors, int i10) {
            this.f2258q.f(wallpaperColors);
        }
    }

    public static final class f implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f2260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.android.wallpaper.asset.a f2261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f2262c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f2263d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f2264e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.android.wallpaper.asset.a.f f2265f;

        public f(Activity activity, com.android.wallpaper.asset.a aVar, ImageView imageView, boolean z9, boolean z10, com.android.wallpaper.asset.a.f fVar) {
            this.f2260a = activity;
            this.f2261b = aVar;
            this.f2262c = imageView;
            this.f2263d = z9;
            this.f2264e = z10;
            this.f2265f = fVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            com.android.wallpaper.asset.d dVar = new com.android.wallpaper.asset.d(this.f2260a, this.f2261b);
            Activity activity = this.f2260a;
            dVar.s(activity, this.f2262c, G6.e.f(activity), !(this.f2261b instanceof com.android.wallpaper.asset.h) || this.f2263d, this.f2264e, this.f2265f);
        }
    }

    public static final class g implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p219v8.a f2266a;

        g(p219v8.a aVar) {
            this.f2266a = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (view != null) {
                view.removeOnLayoutChangeListener(this);
            }
            this.f2266a.invoke();
        }
    }

    private v() {
    }

    public static final a j(Activity activity, CardView previewView, final p064g3.v colorViewModel, p219v8.p wallpaperInfoProvider, InterfaceC1163x lifecycleOwner, boolean z9, boolean z10, final p219v8.a onWallpaperShown, com.android.wallpaper.asset.a.f loadCallback) {
        kotlin.jvm.internal.n.h(activity, "activity");
        kotlin.jvm.internal.n.h(previewView, "previewView");
        kotlin.jvm.internal.n.h(colorViewModel, "colorViewModel");
        kotlin.jvm.internal.n.h(wallpaperInfoProvider, "wallpaperInfoProvider");
        kotlin.jvm.internal.n.h(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.n.h(onWallpaperShown, "onWallpaperShown");
        kotlin.jvm.internal.n.h(loadCallback, "loadCallback");
        View viewRequireViewById = previewView.requireViewById(R.id.wallpaper_surface);
        kotlin.jvm.internal.n.g(viewRequireViewById, "requireViewById(...)");
        final SurfaceView surfaceView = (SurfaceView) viewRequireViewById;
        View viewRequireViewById2 = previewView.requireViewById(R.id.blur_wallpaper_image);
        kotlin.jvm.internal.n.g(viewRequireViewById2, "requireViewById(...)");
        final ImageView imageView = (ImageView) viewRequireViewById2;
        View viewRequireViewById3 = activity.requireViewById(R.id.fingerprint_view);
        kotlin.jvm.internal.n.g(viewRequireViewById3, "requireViewById(...)");
        ((ImageView) viewRequireViewById3).getDrawable().setTint(p171r0.a.b(activity, F2.F.f1542t.a(activity).Y() ? android.R.color.system_neutral1_0 : android.R.color.system_neutral1_900));
        E e10 = new E();
        E e11 = new E();
        E e12 = new E();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        E e13 = new E();
        p219v8.a aVar = new p219v8.a() { // from class: G7.t
            @Override // p219v8.a
            public final Object invoke() {
                return v.n(surfaceView, imageView, onWallpaperShown);
            }
        };
        p219v8.l lVar = new p219v8.l() { // from class: G7.u
            @Override // p219v8.l
            public final Object f(Object obj) {
                return v.o(colorViewModel, (WallpaperColors) obj);
            }
        };
        surfaceView.setZOrderOnTop(false);
        return new b(AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new c(lifecycleOwner, surfaceView, e10, e13, e12, z10, activity, previewView, e11, wallpaperInfoProvider, imageView, z9, atomicBoolean, onWallpaperShown, loadCallback, WallpaperManager.getInstance(activity), colorViewModel, lVar, aVar, null), 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(E e10, E e11) {
        InterfaceC0807d0 interfaceC0807d0 = (InterfaceC0807d0) e10.f22779q;
        if (interfaceC0807d0 != null) {
            interfaceC0807d0.dispose();
        }
        p187s6.i iVar = (p187s6.i) e11.f22779q;
        if (iVar != null) {
            iVar.a();
        }
        e11.f22779q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F l(boolean z9, Activity activity, CardView cardView, SurfaceView surfaceView) {
        return new F(cardView.getContext(), cardView, surfaceView, z9 ? CompletableFuture.completedFuture(new g3.x.a(null, Integer.valueOf(G6.e.f(activity)))) : CompletableFuture.completedFuture(new g3.x.a(null, Integer.valueOf(activity.getColor(R.color.lock_screen_preview_window_color)))), (F.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(E e10) {
        p064g3.x xVar = (p064g3.x) e10.f22779q;
        return xVar != null && G6.e.i(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A n(SurfaceView surfaceView, ImageView imageView, p219v8.a aVar) {
        surfaceView.setBackgroundColor(0);
        imageView.setVisibility(4);
        aVar.invoke();
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A o(p064g3.v vVar, WallpaperColors wallpaperColors) {
        vVar.j(wallpaperColors);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(InterfaceC1163x interfaceC1163x, WallpaperManager wallpaperManager, p064g3.v vVar) {
        AbstractC0816i.d(AbstractC1164y.a(interfaceC1163x), C0803b0.b(), null, new d(wallpaperManager, vVar, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q() {
        return !I.a().C().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p187s6.h r(p064g3.k kVar, p219v8.l lVar, SurfaceView surfaceView, p219v8.a aVar) {
        e eVar = new e(lVar, aVar);
        if (com.android.launcher3.w.f15765i) {
            p187s6.h hVar = new p187s6.h(kVar, surfaceView, null, eVar, 2, C.d.PREVIEW_CURRENT, false, kVar.A(), 64, null);
            hVar.A(true);
            return hVar;
        }
        p187s6.h hVar2 = new p187s6.h(kVar, surfaceView, null, eVar, 2, C.d.PREVIEW_CURRENT, false, null, 192, null);
        hVar2.A(true);
        return hVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Activity activity, p064g3.x xVar, ImageView imageView, boolean z9, AtomicBoolean atomicBoolean, boolean z10, p219v8.a aVar, com.android.wallpaper.asset.a.f fVar) {
        if (xVar == null) {
            return;
        }
        com.android.wallpaper.asset.a aVarO = xVar.o(activity);
        kotlin.jvm.internal.n.g(aVarO, "getThumbAsset(...)");
        if (imageView.getDrawable() == null && atomicBoolean.compareAndSet(false, true)) {
            if (!imageView.isLaidOut() || imageView.isLayoutRequested()) {
                imageView.addOnLayoutChangeListener(new f(activity, aVarO, imageView, z9, z10, fVar));
            } else {
                boolean z11 = false;
                com.android.wallpaper.asset.d dVar = new com.android.wallpaper.asset.d(activity, aVarO);
                int iF = G6.e.f(activity);
                if (!(aVarO instanceof com.android.wallpaper.asset.h) || z9) {
                    z11 = true;
                }
                dVar.s(activity, imageView, iF, z11, z10, fVar);
            }
            imageView.addOnLayoutChangeListener(new g(aVar));
        }
    }
}

package Z1;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.C0826n;
import F8.H0;
import F8.InterfaceC0822l;
import F8.L;
import H3.k;
import H3.q;
import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.d0;
import com.android.customization.picker.mode.DarkModeSectionView;
import com.nothing.wallpaper.R;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.n;
import p064g3.s;
import p064g3.v;
import p064g3.x;
import p074h3.H;
import p074h3.I;
import p074h3.InterfaceC1363c;
import p074h3.InterfaceC1364d;
import p079h8.A;
import p079h8.r;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.android.wallpaper.picker.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f9393w = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Y1.c.a f9394v;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final e a() {
            return new e();
        }

        private a() {
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9395q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ WallpaperManager f9396r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC1364d.a f9397s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ v f9398t;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f9399q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC1364d.a f9400r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ v f9401s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ WallpaperColors f9402t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC1364d.a aVar, v vVar, WallpaperColors wallpaperColors, p129m8.e eVar) {
                super(2, eVar);
                this.f9400r = aVar;
                this.f9401s = vVar;
                this.f9402t = wallpaperColors;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f9400r, this.f9401s, this.f9402t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f9399q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                if (this.f9400r == InterfaceC1364d.a.LOCK_SCREEN) {
                    this.f9401s.j(this.f9402t);
                } else {
                    this.f9401s.i(this.f9402t);
                }
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(WallpaperManager wallpaperManager, InterfaceC1364d.a aVar, v vVar, p129m8.e eVar) {
            super(2, eVar);
            this.f9396r = wallpaperManager;
            this.f9397s = aVar;
            this.f9398t = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new b(this.f9396r, this.f9397s, this.f9398t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f9395q;
            if (i10 == 0) {
                r.b(obj);
                WallpaperColors wallpaperColors = this.f9396r.getWallpaperColors(this.f9397s == InterfaceC1364d.a.LOCK_SCREEN ? 2 : 1);
                H0 h0C = C0803b0.c();
                a aVar = new a(this.f9397s, this.f9398t, wallpaperColors, null);
                this.f9395q = 1;
                if (AbstractC0812g.g(h0C, aVar, this) == objE) {
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

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f9403q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f9404r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f9405s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f9406t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f9407u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ boolean f9408v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ InterfaceC1363c f9409w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ e f9410x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ v f9411y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ WallpaperManager f9412z;

        static final class a implements InterfaceC1363c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f9413a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC0822l f9414b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ v f9415c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ WallpaperManager f9416d;

            /* JADX INFO: renamed from: Z1.e$c$a$a, reason: collision with other inner class name */
            static final class C0346a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f9417q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ v f9418r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ e f9419s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ WallpaperManager f9420t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0346a(v vVar, e eVar, WallpaperManager wallpaperManager, p129m8.e eVar2) {
                    super(2, eVar2);
                    this.f9418r = vVar;
                    this.f9419s = eVar;
                    this.f9420t = wallpaperManager;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0346a(this.f9418r, this.f9419s, this.f9420t, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0346a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f9417q;
                    if (i10 == 0) {
                        r.b(obj);
                        if (this.f9418r.e().getValue() instanceof s.b) {
                            e eVar = this.f9419s;
                            WallpaperManager wallpaperManager = this.f9420t;
                            n.e(wallpaperManager);
                            v vVar = this.f9418r;
                            InterfaceC1364d.a aVar = InterfaceC1364d.a.HOME_SCREEN;
                            this.f9417q = 1;
                            if (eVar.A0(wallpaperManager, vVar, aVar, this) == objE) {
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

            a(e eVar, InterfaceC0822l interfaceC0822l, v vVar, WallpaperManager wallpaperManager) {
                this.f9413a = eVar;
                this.f9414b = interfaceC0822l;
                this.f9415c = vVar;
                this.f9416d = wallpaperManager;
            }

            @Override // p074h3.InterfaceC1363c.a
            public final void a(x xVar, x xVar2, int i10) {
                AbstractC0816i.d(AbstractC1164y.a(this.f9413a), null, null, new C0346a(this.f9415c, this.f9413a, this.f9416d, null), 3, null);
                InterfaceC0822l interfaceC0822l = this.f9414b;
                if (xVar == null) {
                    xVar = xVar2;
                }
                interfaceC0822l.k(xVar, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1363c interfaceC1363c, e eVar, v vVar, WallpaperManager wallpaperManager, p129m8.e eVar2) {
            super(2, eVar2);
            this.f9409w = interfaceC1363c;
            this.f9410x = eVar;
            this.f9411y = vVar;
            this.f9412z = wallpaperManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            c cVar = new c(this.f9409w, this.f9410x, this.f9411y, this.f9412z, eVar);
            cVar.f9408v = ((Boolean) obj).booleanValue();
            return cVar;
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return s(((Boolean) obj).booleanValue(), (p129m8.e) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f9407u;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            boolean z9 = this.f9408v;
            InterfaceC1363c interfaceC1363c = this.f9409w;
            e eVar = this.f9410x;
            v vVar = this.f9411y;
            WallpaperManager wallpaperManager = this.f9412z;
            this.f9403q = interfaceC1363c;
            this.f9404r = eVar;
            this.f9405s = vVar;
            this.f9406t = wallpaperManager;
            this.f9408v = z9;
            this.f9407u = 1;
            C0826n c0826n = new C0826n(p139n8.b.c(this), 1);
            c0826n.G();
            interfaceC1363c.a(eVar.getContext(), z9, new a(eVar, c0826n, vVar, wallpaperManager));
            Object objA = c0826n.A();
            if (objA == p139n8.b.e()) {
                h.c(this);
            }
            return objA == objE ? objE : objA;
        }

        public final Object s(boolean z9, p129m8.e eVar) {
            return ((c) create(Boolean.valueOf(z9), eVar)).invokeSuspend(A.f21846a);
        }
    }

    static final class d extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f9421q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f9422r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f9423s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f9424t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f9425u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ boolean f9426v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ InterfaceC1363c f9427w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ e f9428x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ v f9429y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ WallpaperManager f9430z;

        static final class a implements InterfaceC1363c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f9431a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC0822l f9432b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ v f9433c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ WallpaperManager f9434d;

            /* JADX INFO: renamed from: Z1.e$d$a$a, reason: collision with other inner class name */
            static final class C0347a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f9435q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ v f9436r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ e f9437s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ WallpaperManager f9438t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0347a(v vVar, e eVar, WallpaperManager wallpaperManager, p129m8.e eVar2) {
                    super(2, eVar2);
                    this.f9436r = vVar;
                    this.f9437s = eVar;
                    this.f9438t = wallpaperManager;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0347a(this.f9436r, this.f9437s, this.f9438t, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0347a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f9435q;
                    if (i10 == 0) {
                        r.b(obj);
                        if (this.f9436r.f().getValue() instanceof s.b) {
                            e eVar = this.f9437s;
                            WallpaperManager wallpaperManager = this.f9438t;
                            n.e(wallpaperManager);
                            v vVar = this.f9436r;
                            InterfaceC1364d.a aVar = InterfaceC1364d.a.LOCK_SCREEN;
                            this.f9435q = 1;
                            if (eVar.A0(wallpaperManager, vVar, aVar, this) == objE) {
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

            a(e eVar, InterfaceC0822l interfaceC0822l, v vVar, WallpaperManager wallpaperManager) {
                this.f9431a = eVar;
                this.f9432b = interfaceC0822l;
                this.f9433c = vVar;
                this.f9434d = wallpaperManager;
            }

            @Override // p074h3.InterfaceC1363c.a
            public final void a(x xVar, x xVar2, int i10) {
                AbstractC0816i.d(AbstractC1164y.a(this.f9431a), null, null, new C0347a(this.f9433c, this.f9431a, this.f9434d, null), 3, null);
                InterfaceC0822l interfaceC0822l = this.f9432b;
                if (xVar2 != null) {
                    xVar = xVar2;
                }
                interfaceC0822l.k(xVar, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC1363c interfaceC1363c, e eVar, v vVar, WallpaperManager wallpaperManager, p129m8.e eVar2) {
            super(2, eVar2);
            this.f9427w = interfaceC1363c;
            this.f9428x = eVar;
            this.f9429y = vVar;
            this.f9430z = wallpaperManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            d dVar = new d(this.f9427w, this.f9428x, this.f9429y, this.f9430z, eVar);
            dVar.f9426v = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return s(((Boolean) obj).booleanValue(), (p129m8.e) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f9425u;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            boolean z9 = this.f9426v;
            InterfaceC1363c interfaceC1363c = this.f9427w;
            e eVar = this.f9428x;
            v vVar = this.f9429y;
            WallpaperManager wallpaperManager = this.f9430z;
            this.f9421q = interfaceC1363c;
            this.f9422r = eVar;
            this.f9423s = vVar;
            this.f9424t = wallpaperManager;
            this.f9426v = z9;
            this.f9425u = 1;
            C0826n c0826n = new C0826n(p139n8.b.c(this), 1);
            c0826n.G();
            interfaceC1363c.a(eVar.getContext(), z9, new a(eVar, c0826n, vVar, wallpaperManager));
            Object objA = c0826n.A();
            if (objA == p139n8.b.e()) {
                h.c(this);
            }
            return objA == objE ? objE : objA;
        }

        public final Object s(boolean z9, p129m8.e eVar) {
            return ((d) create(Boolean.valueOf(z9), eVar)).invokeSuspend(A.f21846a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A B0(v vVar, WallpaperColors wallpaperColors) {
        vVar.j(wallpaperColors);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A C0(e eVar) {
        AbstractActivityC1136v activity = eVar.getActivity();
        if (activity != null) {
            activity.recreate();
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A D0(v vVar, WallpaperColors wallpaperColors) {
        vVar.i(wallpaperColors);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A E0(e eVar) {
        AbstractActivityC1136v activity = eVar.getActivity();
        if (activity != null) {
            activity.recreate();
        }
        return A.f21846a;
    }

    public final Object A0(WallpaperManager wallpaperManager, v vVar, InterfaceC1364d.a aVar, p129m8.e eVar) {
        Object objG = AbstractC0812g.g(C0803b0.b(), new b(wallpaperManager, aVar, vVar, null), eVar);
        return objG == p139n8.b.e() ? objG : A.f21846a;
    }

    protected final void F0(Y1.c.a aVar) {
        this.f9394v = aVar;
    }

    @Override // com.android.wallpaper.picker.a
    public CharSequence i0() {
        String string = requireContext().getString(R.string.color_picker_title);
        n.g(string, "getString(...)");
        return string;
    }

    @Override // com.android.wallpaper.picker.a
    protected int j0() {
        return android.R.color.transparent;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        n.h(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_color_picker, viewGroup, false);
        q0(viewInflate);
        H hA = I.a();
        n.f(hA, "null cannot be cast to non-null type com.android.customization.module.ThemePickerInjector");
        K1.p pVar = (K1.p) hA;
        View viewRequireViewById = viewInflate.requireViewById(R.id.lock_preview);
        n.g(viewRequireViewById, "requireViewById(...)");
        CardView cardView = (CardView) viewRequireViewById;
        View viewRequireViewById2 = viewInflate.requireViewById(R.id.home_preview);
        n.g(viewRequireViewById2, "requireViewById(...)");
        CardView cardView2 = (CardView) viewRequireViewById2;
        Context contextRequireContext = requireContext();
        n.g(contextRequireContext, "requireContext(...)");
        InterfaceC1363c interfaceC1363cK = pVar.k(contextRequireContext);
        Context contextRequireContext2 = requireContext();
        n.g(contextRequireContext2, "requireContext(...)");
        k kVarE = pVar.e(contextRequireContext2);
        final v vVarI = pVar.i();
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(requireContext());
        n.e(viewInflate);
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
        Context contextRequireContext3 = requireContext();
        n.g(contextRequireContext3, "requireContext(...)");
        Y1.c.a aVarE = Y1.c.e(viewInflate, (p013b2.c) new d0(abstractActivityC1136vRequireActivity, pVar.i0(contextRequireContext3, vVarI)).a(F.b(p013b2.c.class)), this);
        this.f9394v = aVarE;
        if (bundle != null && aVarE != null) {
            aVarE.a(bundle);
        }
        AbstractActivityC1136v abstractActivityC1136vRequireActivity2 = requireActivity();
        n.g(abstractActivityC1136vRequireActivity2, "requireActivity(...)");
        Context contextRequireContext4 = requireContext();
        n.g(contextRequireContext4, "requireContext(...)");
        q qVar = new q(contextRequireContext4, null, requireContext().getString(R.string.lock_screen_preview_provider_authority), 2, null);
        d dVar = new d(interfaceC1363cK, this, vVarI, wallpaperManager, null);
        p219v8.l lVar = new p219v8.l() { // from class: Z1.a
            @Override // p219v8.l
            public final Object f(Object obj) {
                return e.B0(vVarI, (WallpaperColors) obj);
            }
        };
        Context contextRequireContext5 = requireContext();
        n.g(contextRequireContext5, "requireContext(...)");
        p234x3.d dVar2 = new p234x3.d(qVar, null, dVar, lVar, pVar.p(contextRequireContext5), InterfaceC1364d.a.LOCK_SCREEN, 2, null);
        AbstractActivityC1136v abstractActivityC1136vRequireActivity3 = requireActivity();
        n.g(abstractActivityC1136vRequireActivity3, "requireActivity(...)");
        SurfaceView surfaceViewB = (wallpaperManager.getWallpaperInfo(1) == null || wallpaperManager.getWallpaperId(2) >= 0) ? null : p214v3.l.n(abstractActivityC1136vRequireActivity2, cardView, dVar2, this, false, false, false, kVarE.o(abstractActivityC1136vRequireActivity3), false, new p219v8.a() { // from class: Z1.b
            @Override // p219v8.a
            public final Object invoke() {
                return e.C0(this.f9390q);
            }
        }, null, false, 3440, null).b();
        AbstractActivityC1136v abstractActivityC1136vRequireActivity4 = requireActivity();
        n.g(abstractActivityC1136vRequireActivity4, "requireActivity(...)");
        Context contextRequireContext6 = requireContext();
        n.g(contextRequireContext6, "requireContext(...)");
        String string = requireContext().getString(R.string.grid_control_metadata_name);
        n.g(string, "getString(...)");
        q qVar2 = new q(contextRequireContext6, string);
        c cVar = new c(interfaceC1363cK, this, vVarI, wallpaperManager, null);
        p219v8.l lVar2 = new p219v8.l() { // from class: Z1.c
            @Override // p219v8.l
            public final Object f(Object obj) {
                return e.D0(vVarI, (WallpaperColors) obj);
            }
        };
        Context contextRequireContext7 = requireContext();
        n.g(contextRequireContext7, "requireContext(...)");
        p234x3.d dVar3 = new p234x3.d(qVar2, null, cVar, lVar2, pVar.p(contextRequireContext7), InterfaceC1364d.a.HOME_SCREEN, 2, null);
        AbstractActivityC1136v abstractActivityC1136vRequireActivity5 = requireActivity();
        n.g(abstractActivityC1136vRequireActivity5, "requireActivity(...)");
        p214v3.l.n(abstractActivityC1136vRequireActivity4, cardView2, dVar3, this, false, false, false, kVarE.o(abstractActivityC1136vRequireActivity5), false, new p219v8.a() { // from class: Z1.d
            @Override // p219v8.a
            public final Object invoke() {
                return e.E0(this.f9392q);
            }
        }, surfaceViewB, false, 2416, null);
        View viewRequireViewById3 = viewInflate.requireViewById(R.id.dark_mode_toggle_container);
        n.g(viewRequireViewById3, "requireViewById(...)");
        Context context = getContext();
        AbstractC1157q lifecycle = getLifecycle();
        Context contextRequireContext8 = requireContext();
        n.g(contextRequireContext8, "requireContext(...)");
        DarkModeSectionView darkModeSectionViewF = new F1.e(context, lifecycle, pVar.j0(contextRequireContext8)).f(requireContext());
        darkModeSectionViewF.setBackground(null);
        ((FrameLayout) viewRequireViewById3).addView(darkModeSectionViewF);
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onSaveInstanceState(Bundle savedInstanceState) {
        n.h(savedInstanceState, "savedInstanceState");
        super.onSaveInstanceState(savedInstanceState);
        Y1.c.a aVar = this.f9394v;
        if (aVar != null) {
            aVar.b(savedInstanceState);
        }
    }

    protected final Y1.c.a z0() {
        return this.f9394v;
    }
}

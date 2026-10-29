package R1;

import F8.C0826n;
import F8.InterfaceC0822l;
import H3.k;
import H3.q;
import Q1.j;
import T1.f;
import android.app.WallpaperColors;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.d0;
import androidx.transition.m;
import com.nothing.wallpaper.R;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.n;
import p064g3.v;
import p064g3.x;
import p074h3.H;
import p074h3.I;
import p074h3.InterfaceC1363c;
import p074h3.InterfaceC1364d;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class d extends com.android.wallpaper.picker.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f6967v = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements m.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CardView f6968a;

        public b(CardView cardView) {
            this.f6968a = cardView;
        }

        @Override // androidx.transition.m.h
        public void a(m transition) {
            n.h(transition, "transition");
            this.f6968a.setVisibility(8);
        }

        @Override // androidx.transition.m.h
        public void c(m transition) {
            n.h(transition, "transition");
        }

        @Override // androidx.transition.m.h
        public void f(m transition) {
            n.h(transition, "transition");
        }

        @Override // androidx.transition.m.h
        public void i(m transition) {
            n.h(transition, "transition");
        }

        @Override // androidx.transition.m.h
        public void k(m transition) {
            n.h(transition, "transition");
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f6969q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f6970r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f6971s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ boolean f6972t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ K1.p f6973u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Context f6974v;

        static final class a implements InterfaceC1363c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC0822l f6975a;

            a(InterfaceC0822l interfaceC0822l) {
                this.f6975a = interfaceC0822l;
            }

            @Override // p074h3.InterfaceC1363c.a
            public final void a(x xVar, x xVar2, int i10) {
                InterfaceC0822l interfaceC0822l = this.f6975a;
                if (xVar2 != null) {
                    xVar = xVar2;
                }
                interfaceC0822l.k(xVar, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(K1.p pVar, Context context, e eVar) {
            super(2, eVar);
            this.f6973u = pVar;
            this.f6974v = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            c cVar = new c(this.f6973u, this.f6974v, eVar);
            cVar.f6972t = ((Boolean) obj).booleanValue();
            return cVar;
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return s(((Boolean) obj).booleanValue(), (e) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f6971s;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            boolean z9 = this.f6972t;
            K1.p pVar = this.f6973u;
            Context context = this.f6974v;
            this.f6969q = pVar;
            this.f6970r = context;
            this.f6972t = z9;
            this.f6971s = 1;
            C0826n c0826n = new C0826n(p139n8.b.c(this), 1);
            c0826n.G();
            pVar.k(context).a(context, z9, new a(c0826n));
            Object objA = c0826n.A();
            if (objA == p139n8.b.e()) {
                h.c(this);
            }
            return objA == objE ? objE : objA;
        }

        public final Object s(boolean z9, e eVar) {
            return ((c) create(Boolean.valueOf(z9), eVar)).invokeSuspend(A.f21846a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A A0(AbstractActivityC1136v abstractActivityC1136v) {
        abstractActivityC1136v.recreate();
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle y0() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hide_clock", true);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A z0(v vVar, WallpaperColors wallpaperColors) {
        vVar.j(wallpaperColors);
        return A.f21846a;
    }

    @Override // com.android.wallpaper.picker.a
    public CharSequence i0() {
        String string = requireContext().getString(R.string.clock_color_and_size_title);
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
        View viewInflate = inflater.inflate(R.layout.fragment_clock_settings, viewGroup, false);
        q0(viewInflate);
        Context contextRequireContext = requireContext();
        n.g(contextRequireContext, "requireContext(...)");
        final AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
        H hA = I.a();
        n.f(hA, "null cannot be cast to non-null type com.android.customization.module.ThemePickerInjector");
        K1.p pVar = (K1.p) hA;
        View viewRequireViewById = viewInflate.requireViewById(R.id.lock_preview);
        n.g(viewRequireViewById, "requireViewById(...)");
        CardView cardView = (CardView) viewRequireViewById;
        final v vVarI = pVar.i();
        k kVarE = pVar.e(contextRequireContext);
        q qVar = new q(contextRequireContext, null, getResources().getString(R.string.lock_screen_preview_provider_authority), 2, null);
        Context contextRequireContext2 = requireContext();
        n.g(contextRequireContext2, "requireContext(...)");
        p214v3.l.n(abstractActivityC1136vRequireActivity, cardView, new p234x3.d(qVar, new p219v8.a() { // from class: R1.a
            @Override // p219v8.a
            public final Object invoke() {
                return d.y0();
            }
        }, new c(pVar, contextRequireContext, null), new p219v8.l() { // from class: R1.b
            @Override // p219v8.l
            public final Object f(Object obj) {
                return d.z0(vVarI, (WallpaperColors) obj);
            }
        }, pVar.p(contextRequireContext2), InterfaceC1364d.a.LOCK_SCREEN), this, false, false, false, kVarE.o(abstractActivityC1136vRequireActivity), false, new p219v8.a() { // from class: R1.c
            @Override // p219v8.a
            public final Object invoke() {
                return d.A0(abstractActivityC1136vRequireActivity);
            }
        }, null, false, 3440, null);
        j jVar = j.f6659a;
        n.e(viewInflate);
        f fVar = (f) new d0(this, pVar.b0(contextRequireContext, pVar.i(), pVar.d0(abstractActivityC1136vRequireActivity))).a(F.b(f.class));
        S1.a aVarD0 = pVar.d0(abstractActivityC1136vRequireActivity);
        InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
        n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        jVar.c(viewInflate, fVar, aVarD0, viewLifecycleOwner);
        Object returnTransition = getReturnTransition();
        m mVar = returnTransition instanceof m ? (m) returnTransition : null;
        if (mVar != null) {
            mVar.e(new b(cardView));
        }
        return viewInflate;
    }
}

package D1;

import F8.C0803b0;
import F8.C0826n;
import F8.InterfaceC0822l;
import H3.q;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.d0;
import com.nothing.wallpaper.R;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.n;
import p064g3.x;
import p074h3.H;
import p074h3.I;
import p074h3.InterfaceC1363c;
import p074h3.InterfaceC1364d;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;
import p234x3.d;

/* JADX INFO: loaded from: classes.dex */
public final class c extends com.android.wallpaper.picker.a {

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f707q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f708r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f709s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ InterfaceC1363c f710t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ c f711u;

        /* JADX INFO: renamed from: D1.c$a$a, reason: collision with other inner class name */
        static final class C0034a implements InterfaceC1363c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC0822l f712a;

            C0034a(InterfaceC0822l interfaceC0822l) {
                this.f712a = interfaceC0822l;
            }

            @Override // p074h3.InterfaceC1363c.a
            public final void a(x xVar, x xVar2, int i10) {
                InterfaceC0822l interfaceC0822l = this.f712a;
                if (xVar == null) {
                    xVar = xVar2;
                }
                interfaceC0822l.k(xVar, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1363c interfaceC1363c, c cVar, e eVar) {
            super(2, eVar);
            this.f710t = interfaceC1363c;
            this.f711u = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f710t, this.f711u, eVar);
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return s(((Boolean) obj).booleanValue(), (e) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f709s;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            InterfaceC1363c interfaceC1363c = this.f710t;
            c cVar = this.f711u;
            this.f707q = interfaceC1363c;
            this.f708r = cVar;
            this.f709s = 1;
            C0826n c0826n = new C0826n(p139n8.b.c(this), 1);
            c0826n.G();
            interfaceC1363c.a(cVar.getContext(), true, new C0034a(c0826n));
            Object objA = c0826n.A();
            if (objA == p139n8.b.e()) {
                h.c(this);
            }
            return objA == objE ? objE : objA;
        }

        public final Object s(boolean z9, e eVar) {
            return ((a) create(Boolean.valueOf(z9), eVar)).invokeSuspend(A.f21846a);
        }
    }

    private final v3.l.a x0(View view, InterfaceC1363c interfaceC1363c, p194t3.a aVar) {
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
        View viewRequireViewById = view.requireViewById(R.id.preview);
        n.g(viewRequireViewById, "requireViewById(...)");
        CardView cardView = (CardView) viewRequireViewById;
        Context contextRequireContext = requireContext();
        n.g(contextRequireContext, "requireContext(...)");
        String string = requireContext().getString(R.string.grid_control_metadata_name);
        n.g(string, "getString(...)");
        d dVar = new d(new q(contextRequireContext, string), null, new a(interfaceC1363c, this, null), null, aVar, InterfaceC1364d.a.HOME_SCREEN, 10, null);
        InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
        n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return p214v3.l.n(abstractActivityC1136vRequireActivity, cardView, dVar, viewLifecycleOwner, false, false, false, false, false, new p219v8.a() { // from class: D1.b
            @Override // p219v8.a
            public final Object invoke() {
                return c.y0(this.f706q);
            }
        }, null, false, 3440, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A y0(c cVar) {
        AbstractActivityC1136v activity = cVar.getActivity();
        if (activity != null) {
            activity.recreate();
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A z0(E e10, c cVar, View view, InterfaceC1363c interfaceC1363c, K1.p pVar) {
        ((v3.l.a) e10.f22779q).a();
        n.e(view);
        Context contextRequireContext = cVar.requireContext();
        n.g(contextRequireContext, "requireContext(...)");
        e10.f22779q = cVar.x0(view, interfaceC1363c, pVar.p(contextRequireContext));
        return A.f21846a;
    }

    @Override // com.android.wallpaper.picker.a
    public CharSequence i0() {
        String string = getString(R.string.grid_title);
        n.g(string, "getString(...)");
        return string;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        n.h(inflater, "inflater");
        final View viewInflate = inflater.inflate(R.layout.fragment_grid, viewGroup, false);
        q0(viewInflate);
        H hA = I.a();
        n.f(hA, "null cannot be cast to non-null type com.android.customization.module.ThemePickerInjector");
        final K1.p pVar = (K1.p) hA;
        Context contextRequireContext = requireContext();
        n.g(contextRequireContext, "requireContext(...)");
        final InterfaceC1363c interfaceC1363cK = pVar.k(contextRequireContext);
        final E e10 = new E();
        n.e(viewInflate);
        Context contextRequireContext2 = requireContext();
        n.g(contextRequireContext2, "requireContext(...)");
        e10.f22779q = x0(viewInflate, interfaceC1363cK, pVar.p(contextRequireContext2));
        Context contextRequireContext3 = requireContext();
        n.g(contextRequireContext3, "requireContext(...)");
        C1.c.f571a.b(viewInflate, (E1.b) new d0(this, pVar.m0(contextRequireContext3)).b(E1.b.class), this, C0803b0.b(), new p219v8.a() { // from class: D1.a
            @Override // p219v8.a
            public final Object invoke() {
                return c.z0(e10, this, viewInflate, interfaceC1363cK, pVar);
            }
        });
        return viewInflate;
    }
}

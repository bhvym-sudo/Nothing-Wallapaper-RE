package p188s7;

import F8.AbstractC0816i;
import F8.C0826n;
import F8.InterfaceC0822l;
import F8.L;
import I8.AbstractC0882h;
import I8.E;
import I8.G;
import I8.O;
import I8.z;
import android.app.Application;
import android.graphics.Bitmap;
import androidx.lifecycle.AbstractC1142b;
import androidx.lifecycle.Q;
import androidx.lifecycle.b0;
import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.x;
import p074h3.H;
import p074h3.I;
import p074h3.InterfaceC1363c;
import p079h8.A;
import p079h8.o;
import p079h8.r;
import p079h8.v;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends AbstractC1142b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f27819m = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Application f27820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q f27821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final K6.c f27822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC1363c f27823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final O f27824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z f27825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final E f27826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f27827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f27828k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Bitmap f27829l;

    /* JADX INFO: renamed from: s7.a$a, reason: collision with other inner class name */
    static final class C0673a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f27830q;

        C0673a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return a.this.new C0673a(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((C0673a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f27830q;
            if (i10 == 0) {
                r.b(obj);
                p158p7.b bVar = (p158p7.b) a.this.f27821d.d("effect_actions");
                if (bVar != null) {
                    z zVar = a.this.f27825h;
                    this.f27830q = 1;
                    if (zVar.b(bVar, this) == objE) {
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

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    static final class c implements InterfaceC1363c.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0822l f27833b;

        c(InterfaceC0822l interfaceC0822l) {
            this.f27833b = interfaceC0822l;
        }

        @Override // p074h3.InterfaceC1363c.a
        public final void a(x xVar, x xVar2, int i10) {
            a aVar = a.this;
            x xVar3 = xVar2 == null ? xVar : xVar2;
            n.e(xVar3);
            aVar.f27828k = !G6.e.s(xVar3);
            InterfaceC0822l interfaceC0822l = this.f27833b;
            if (xVar2 == null) {
                xVar2 = xVar;
            }
            interfaceC0822l.k(v.a(xVar2, xVar), null);
        }
    }

    static final class d extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f27834q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ x f27835r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ a f27836s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(x xVar, a aVar, e eVar) {
            super(2, eVar);
            this.f27835r = xVar;
            this.f27836s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new d(this.f27835r, this.f27836s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f27834q;
            if (i10 == 0) {
                r.b(obj);
                p158p7.b bVarA = p158p7.b.f23774s.a(this.f27835r, this.f27836s.f27820c);
                a aVar = this.f27836s;
                aVar.f27821d.i("effect_actions", bVarA);
                z zVar = aVar.f27825h;
                this.f27834q = 1;
                if (zVar.b(bVarA, this) == objE) {
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
    public a(Application application, Q savedStateHandle) {
        super(application);
        n.h(application, "application");
        n.h(savedStateHandle, "savedStateHandle");
        this.f27820c = application;
        this.f27821d = savedStateHandle;
        H hA = I.a();
        n.f(hA, "null cannot be cast to non-null type com.nothing.wallpaper.module.NTPickerInjector");
        K6.c cVar = (K6.c) hA;
        this.f27822e = cVar;
        this.f27823f = cVar.k(application);
        this.f27824g = savedStateHandle.e("ui_state", p158p7.c.C0632c.f23785t);
        z zVarB = G.b(1, 0, null, 6, null);
        this.f27825h = zVarB;
        this.f27826i = AbstractC0882h.a(zVarB);
        Boolean bool = (Boolean) savedStateHandle.d("select_live");
        this.f27827j = bool != null ? bool.booleanValue() : false;
        AbstractC0816i.d(b0.a(this), null, null, new C0673a(null), 3, null);
    }

    private final void v(x xVar) {
        AbstractC0816i.d(b0.a(this), null, null, new d(xVar, this, null), 3, null);
    }

    public final void k() {
        this.f27821d.i("ui_state", ((p158p7.c) this.f27824g.getValue()).a());
    }

    public final void l() {
        this.f27821d.i("ui_state", ((p158p7.c) this.f27824g.getValue()).b());
    }

    public final Bitmap m() {
        return this.f27829l;
    }

    public final Object n(boolean z9, e eVar) {
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        this.f27823f.a(this.f27820c, z9, new c(c0826n));
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            h.c(eVar);
        }
        return objA;
    }

    public final o o() {
        ArrayList arrayList = new ArrayList();
        if (t()) {
            arrayList.add(p108k7.a.Glass);
        }
        if (s()) {
            arrayList.add(p108k7.a.Blur);
        }
        return v.a(arrayList, Integer.valueOf(((p158p7.c) this.f27824g.getValue()).j()));
    }

    public final E p() {
        return this.f27826i;
    }

    public final O q() {
        return this.f27824g;
    }

    public final void r(x wallpaper, p158p7.a from, Set effects) {
        n.h(wallpaper, "wallpaper");
        n.h(from, "from");
        n.h(effects, "effects");
        if (this.f27821d.c("select_live")) {
            w();
            return;
        }
        boolean zContains = effects.contains(p108k7.a.Blur);
        boolean zContains2 = effects.contains(p108k7.a.Glass);
        boolean z9 = true;
        boolean z10 = !G6.e.s(wallpaper);
        this.f27827j = z10;
        this.f27821d.i("select_live", Boolean.valueOf(z10));
        v(wallpaper);
        boolean z11 = this.f27827j && !p024c3.a.b();
        Q q9 = this.f27821d;
        p7.c.a aVar = p158p7.c.f23777s;
        p7.a.c.C0629a c0629a = p7.a.c.f23771b;
        boolean z12 = n.d(from, c0629a.b()) || n.d(from, p158p7.a.C0628a.f23769b) || z11;
        if (!n.d(from, c0629a.a()) && !n.d(from, p158p7.a.C0628a.f23769b) && !z11) {
            z9 = false;
        }
        q9.i("ui_state", aVar.a(zContains, zContains2, z12, z9));
    }

    public final boolean s() {
        return ((p158p7.c) this.f27824g.getValue()).f();
    }

    public final boolean t() {
        return ((p158p7.c) this.f27824g.getValue()).g();
    }

    public final boolean u() {
        Object value = this.f27824g.getValue();
        p7.c.b bVar = value instanceof p7.c.b ? (p7.c.b) value : null;
        if (bVar != null) {
            return bVar.m();
        }
        return true;
    }

    public final void w() {
        p158p7.c cVar = (p158p7.c) this.f27824g.getValue();
        if (cVar instanceof p7.c.b) {
            this.f27821d.i("ui_state", p7.c.b.l((p7.c.b) cVar, true, 0, false, false, 14, null));
        }
    }

    public final void x(boolean z9) {
        o oVarA;
        p158p7.c cVar = (p158p7.c) this.f27824g.getValue();
        boolean zE = false;
        if (z9) {
            boolean zE2 = cVar.e();
            boolean z10 = !zE2;
            if (!p024c3.a.b() && this.f27827j && !zE2) {
                zE = true;
            } else if (p024c3.a.b() || !this.f27828k || !zE2) {
                zE = cVar.d();
            }
            oVarA = v.a(Boolean.valueOf(zE), Boolean.valueOf(z10));
        } else {
            boolean zD = cVar.d();
            boolean z11 = !zD;
            if (p024c3.a.b() || !this.f27827j || !zD) {
                zE = (p024c3.a.b() || !this.f27828k || zD) ? cVar.e() : true;
            }
            oVarA = v.a(Boolean.valueOf(z11), Boolean.valueOf(zE));
        }
        this.f27821d.i("ui_state", cVar.c(((Boolean) oVarA.a()).booleanValue(), ((Boolean) oVarA.b()).booleanValue()));
    }

    public final void y(Bitmap bitmap) {
        this.f27829l = bitmap;
    }
}

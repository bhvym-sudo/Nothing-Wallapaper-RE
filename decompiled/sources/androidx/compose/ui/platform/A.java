package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import p170r.AbstractC1696o;
import p170r.AbstractC1708u0;
import p170r.AbstractC1709v;
import p170r.AbstractC1716y0;
import p170r.C1710v0;
import p170r.I0;
import p170r.InterfaceC1683h0;
import p170r.InterfaceC1690l;
import p170r.V0;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1708u0 f11480a = AbstractC1709v.d(null, a.f11486r, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1708u0 f11481b = AbstractC1709v.e(b.f11487r);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC1708u0 f11482c = AbstractC1709v.e(c.f11488r);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC1708u0 f11483d = AbstractC1709v.e(d.f11489r);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC1708u0 f11484e = AbstractC1709v.e(e.f11490r);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AbstractC1708u0 f11485f = AbstractC1709v.e(f.f11491r);

    static final class a extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f11486r = new a();

        a() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            A.f("LocalConfiguration");
            throw new p079h8.f();
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f11487r = new b();

        b() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            A.f("LocalContext");
            throw new p079h8.f();
        }
    }

    static final class c extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final c f11488r = new c();

        c() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z.a invoke() {
            A.f("LocalImageVectorCache");
            throw new p079h8.f();
        }
    }

    static final class d extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final d f11489r = new d();

        d() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z.b invoke() {
            A.f("LocalResourceIdCache");
            throw new p079h8.f();
        }
    }

    static final class e extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final e f11490r = new e();

        e() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p082i1.f invoke() {
            A.f("LocalSavedStateRegistryOwner");
            throw new p079h8.f();
        }
    }

    static final class f extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final f f11491r = new f();

        f() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            A.f("LocalView");
            throw new p079h8.f();
        }
    }

    static final class g extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1683h0 f11492r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC1683h0 interfaceC1683h0) {
            super(1);
            this.f11492r = interfaceC1683h0;
        }

        public final void a(Configuration configuration) {
            A.c(this.f11492r, new Configuration(configuration));
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((Configuration) obj);
            return p079h8.A.f21846a;
        }
    }

    static final class h extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ P f11493r;

        public static final class a implements p170r.H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ P f11494a;

            public a(P p9) {
                this.f11494a = p9;
            }

            @Override // p170r.H
            public void dispose() {
                this.f11494a.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(P p9) {
            super(1);
            this.f11493r = p9;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p170r.H f(p170r.I i10) {
            return new a(this.f11493r);
        }
    }

    static final class i extends kotlin.jvm.internal.o implements p219v8.p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f11495r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ G f11496s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p219v8.p f11497t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(AndroidComposeView androidComposeView, G g10, p219v8.p pVar) {
            super(2);
            this.f11495r = androidComposeView;
            this.f11496s = g10;
            this.f11497t = pVar;
        }

        public final void a(InterfaceC1690l interfaceC1690l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1690l.h()) {
                interfaceC1690l.m();
                return;
            }
            if (AbstractC1696o.G()) {
                AbstractC1696o.O(1471621628, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:131)");
            }
            M.a(this.f11495r, this.f11496s, this.f11497t, interfaceC1690l, 0);
            if (AbstractC1696o.G()) {
                AbstractC1696o.N();
            }
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC1690l) obj, ((Number) obj2).intValue());
            return p079h8.A.f21846a;
        }
    }

    static final class j extends kotlin.jvm.internal.o implements p219v8.p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f11498r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p219v8.p f11499s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f11500t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(AndroidComposeView androidComposeView, p219v8.p pVar, int i10) {
            super(2);
            this.f11498r = androidComposeView;
            this.f11499s = pVar;
            this.f11500t = i10;
        }

        public final void a(InterfaceC1690l interfaceC1690l, int i10) {
            A.a(this.f11498r, this.f11499s, interfaceC1690l, AbstractC1716y0.a(this.f11500t | 1));
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC1690l) obj, ((Number) obj2).intValue());
            return p079h8.A.f21846a;
        }
    }

    static final class k extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Context f11501r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ l f11502s;

        public static final class a implements p170r.H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f11503a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f11504b;

            public a(Context context, l lVar) {
                this.f11503a = context;
                this.f11504b = lVar;
            }

            @Override // p170r.H
            public void dispose() {
                this.f11503a.getApplicationContext().unregisterComponentCallbacks(this.f11504b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, l lVar) {
            super(1);
            this.f11501r = context;
            this.f11502s = lVar;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p170r.H f(p170r.I i10) {
            this.f11501r.getApplicationContext().registerComponentCallbacks(this.f11502s);
            return new a(this.f11501r, this.f11502s);
        }
    }

    public static final class l implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Configuration f11505q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Z.a f11506r;

        l(Configuration configuration, Z.a aVar) {
            this.f11505q = configuration;
            this.f11506r = aVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f11506r.b(this.f11505q.updateFrom(configuration));
            this.f11505q.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f11506r.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            this.f11506r.a();
        }
    }

    static final class m extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Context f11507r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ n f11508s;

        public static final class a implements p170r.H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f11509a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f11510b;

            public a(Context context, n nVar) {
                this.f11509a = context;
                this.f11510b = nVar;
            }

            @Override // p170r.H
            public void dispose() {
                this.f11509a.getApplicationContext().unregisterComponentCallbacks(this.f11510b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Context context, n nVar) {
            super(1);
            this.f11507r = context;
            this.f11508s = nVar;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p170r.H f(p170r.I i10) {
            this.f11507r.getApplicationContext().registerComponentCallbacks(this.f11508s);
            return new a(this.f11507r, this.f11508s);
        }
    }

    public static final class n implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Z.b f11511q;

        n(Z.b bVar) {
            this.f11511q = bVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f11511q.a();
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f11511q.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            this.f11511q.a();
        }
    }

    public static final void a(AndroidComposeView androidComposeView, p219v8.p pVar, InterfaceC1690l interfaceC1690l, int i10) {
        int i11;
        InterfaceC1690l interfaceC1690lG = interfaceC1690l.g(1396852028);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1690lG.f(androidComposeView) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1690lG.f(pVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC1690lG.h()) {
            interfaceC1690lG.m();
        } else {
            if (AbstractC1696o.G()) {
                AbstractC1696o.O(1396852028, i11, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:91)");
            }
            Context context = androidComposeView.getContext();
            Object objD = interfaceC1690lG.d();
            InterfaceC1690l.a aVar = InterfaceC1690l.f25468a;
            if (objD == aVar.a()) {
                objD = V0.b(new Configuration(context.getResources().getConfiguration()), null, 2, null);
                interfaceC1690lG.q(objD);
            }
            InterfaceC1683h0 interfaceC1683h0 = (InterfaceC1683h0) objD;
            Object objD2 = interfaceC1690lG.d();
            if (objD2 == aVar.a()) {
                objD2 = new g(interfaceC1683h0);
                interfaceC1690lG.q(objD2);
            }
            androidComposeView.setConfigurationChangeObserver((p219v8.l) objD2);
            Object objD3 = interfaceC1690lG.d();
            if (objD3 == aVar.a()) {
                objD3 = new G(context);
                interfaceC1690lG.q(objD3);
            }
            G g10 = (G) objD3;
            AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objD4 = interfaceC1690lG.d();
            if (objD4 == aVar.a()) {
                objD4 = S.b(androidComposeView, viewTreeOwners.b());
                interfaceC1690lG.q(objD4);
            }
            P p9 = (P) objD4;
            p079h8.A a10 = p079h8.A.f21846a;
            boolean zF = interfaceC1690lG.f(p9);
            Object objD5 = interfaceC1690lG.d();
            if (zF || objD5 == aVar.a()) {
                objD5 = new h(p9);
                interfaceC1690lG.q(objD5);
            }
            p170r.L.a(a10, (p219v8.l) objD5, interfaceC1690lG, 6);
            AbstractC1709v.b(new C1710v0[]{f11480a.d(b(interfaceC1683h0)), f11481b.d(context), X0.a.a().d(viewTreeOwners.a()), f11484e.d(viewTreeOwners.b()), p250z.d.b().d(p9), f11485f.d(androidComposeView.getView()), f11482c.d(g(context, b(interfaceC1683h0), interfaceC1690lG, 0)), f11483d.d(h(context, interfaceC1690lG, 0)), M.c().d(Boolean.valueOf(((Boolean) interfaceC1690lG.l(M.d())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release()))}, p240y.c.d(1471621628, true, new i(androidComposeView, g10, pVar), interfaceC1690lG, 54), interfaceC1690lG, C1710v0.f25588i | 48);
            if (AbstractC1696o.G()) {
                AbstractC1696o.N();
            }
        }
        I0 i0K = interfaceC1690lG.k();
        if (i0K != null) {
            i0K.a(new j(androidComposeView, pVar, i10));
        }
    }

    private static final Configuration b(InterfaceC1683h0 interfaceC1683h0) {
        return (Configuration) interfaceC1683h0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC1683h0 interfaceC1683h0, Configuration configuration) {
        interfaceC1683h0.setValue(configuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void f(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    private static final Z.a g(Context context, Configuration configuration, InterfaceC1690l interfaceC1690l, int i10) {
        if (AbstractC1696o.G()) {
            AbstractC1696o.O(-485908294, i10, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:172)");
        }
        Object objD = interfaceC1690l.d();
        InterfaceC1690l.a aVar = InterfaceC1690l.f25468a;
        if (objD == aVar.a()) {
            objD = new Z.a();
            interfaceC1690l.q(objD);
        }
        Z.a aVar2 = (Z.a) objD;
        Object objD2 = interfaceC1690l.d();
        Object obj = objD2;
        if (objD2 == aVar.a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            interfaceC1690l.q(configuration2);
            obj = configuration2;
        }
        Configuration configuration3 = (Configuration) obj;
        Object objD3 = interfaceC1690l.d();
        if (objD3 == aVar.a()) {
            objD3 = new l(configuration3, aVar2);
            interfaceC1690l.q(objD3);
        }
        l lVar = (l) objD3;
        boolean zF = interfaceC1690l.f(context);
        Object objD4 = interfaceC1690l.d();
        if (zF || objD4 == aVar.a()) {
            objD4 = new k(context, lVar);
            interfaceC1690l.q(objD4);
        }
        p170r.L.a(aVar2, (p219v8.l) objD4, interfaceC1690l, 0);
        if (AbstractC1696o.G()) {
            AbstractC1696o.N();
        }
        return aVar2;
    }

    private static final Z.b h(Context context, InterfaceC1690l interfaceC1690l, int i10) {
        if (AbstractC1696o.G()) {
            AbstractC1696o.O(-1348507246, i10, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:141)");
        }
        Object objD = interfaceC1690l.d();
        InterfaceC1690l.a aVar = InterfaceC1690l.f25468a;
        if (objD == aVar.a()) {
            objD = new Z.b();
            interfaceC1690l.q(objD);
        }
        Z.b bVar = (Z.b) objD;
        Object objD2 = interfaceC1690l.d();
        if (objD2 == aVar.a()) {
            objD2 = new n(bVar);
            interfaceC1690l.q(objD2);
        }
        n nVar = (n) objD2;
        boolean zF = interfaceC1690l.f(context);
        Object objD3 = interfaceC1690l.d();
        if (zF || objD3 == aVar.a()) {
            objD3 = new m(context, nVar);
            interfaceC1690l.q(objD3);
        }
        p170r.L.a(bVar, (p219v8.l) objD3, interfaceC1690l, 0);
        if (AbstractC1696o.G()) {
            AbstractC1696o.N();
        }
        return bVar;
    }
}

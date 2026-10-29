package p248y7;

import C2.b;
import D8.k;
import F2.InterfaceC0799f;
import F2.t;
import F5.m;
import R7.d;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import com.android.launcher3.CellLayout;
import com.android.launcher3.Workspace;
import com.android.launcher3.views.f;
import com.nothing.cardhost.g;
import com.nothing.launcher.card.j;
import com.nothing.launcher.card.u;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.n;
import p030d.a;
import p030d.c;
import p074h3.H;
import p074h3.I;
import p079h8.A;
import p079h8.h;
import p079h8.i;
import p079h8.o;
import p079h8.v;
import p089i8.AbstractC1444s;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class S extends AbstractComponentCallbacksC1132q implements f {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f30389B = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final c f30390A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final K6.c f30391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final h f30392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final h f30393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final h f30394t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final h f30395u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final h f30396v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final h f30397w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private t f30398x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Map f30399y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final c f30400z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b extends l implements p {
        b(Object obj) {
            super(2, obj, S.class, "reconfigure", "reconfigure(ILcom/nothing/cardservice/CardWidgetMetaInfo;)V", 0);
        }

        public final void g(int i10, m p9) {
            n.h(p9, "p1");
            ((S) this.receiver).X0(i10, p9);
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            g(((Number) obj).intValue(), (m) obj2);
            return A.f21846a;
        }
    }

    public S() {
        H hA = I.a();
        n.f(hA, "null cannot be cast to non-null type com.nothing.wallpaper.module.NTPickerInjector");
        this.f30391q = (K6.c) hA;
        this.f30392r = i.b(new p219v8.a() { // from class: y7.D
            @Override // p219v8.a
            public final Object invoke() {
                return S.W0(this.f30374q);
            }
        });
        this.f30393s = i.b(new p219v8.a() { // from class: y7.I
            @Override // p219v8.a
            public final Object invoke() {
                return S.U0(this.f30383q);
            }
        });
        this.f30394t = i.b(new p219v8.a() { // from class: y7.J
            @Override // p219v8.a
            public final Object invoke() {
                return S.i1(this.f30384q);
            }
        });
        this.f30395u = i.b(new p219v8.a() { // from class: y7.K
            @Override // p219v8.a
            public final Object invoke() {
                return S.S0(this.f30385q);
            }
        });
        this.f30396v = i.b(new p219v8.a() { // from class: y7.L
            @Override // p219v8.a
            public final Object invoke() {
                return S.z0(this.f30386q);
            }
        });
        this.f30397w = i.b(new p219v8.a() { // from class: y7.M
            @Override // p219v8.a
            public final Object invoke() {
                return Boolean.valueOf(S.h1());
            }
        });
        this.f30399y = new LinkedHashMap();
        c cVarRegisterForActivityResult = registerForActivityResult(new p040e.c(), new p030d.b() { // from class: y7.N
            @Override // p030d.b
            public final void a(Object obj) {
                S.Y0((a) obj);
            }
        });
        n.g(cVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f30400z = cVarRegisterForActivityResult;
        c cVarRegisterForActivityResult2 = registerForActivityResult(new p040e.c(), new p030d.b() { // from class: y7.O
            @Override // p030d.b
            public final void a(Object obj) {
                S.g1(this.f30387a, (a) obj);
            }
        });
        n.g(cVarRegisterForActivityResult2, "registerForActivityResult(...)");
        this.f30390A = cVarRegisterForActivityResult2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    /* JADX WARN: Code duplicated, block: B:14:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x006e  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    private final void B0(int i10, final int i11, final t tVar) {
        final g gVarC;
        Runnable runnable;
        int i12;
        Runnable runnable2;
        g gVar;
        int i13;
        CellLayout cellLayoutF = M().f(tVar.f594r);
        if (i10 != -1) {
            gVarC = null;
            if (i10 != 0) {
                i13 = 0;
                runnable2 = null;
                gVar = null;
            } else {
                F0(i11);
                runnable = new Runnable() { // from class: y7.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        S.C0(this.f30376q);
                    }
                };
                i12 = 4;
            }
            if (J().getAnimatedView() != null) {
                if (runnable2 != null) {
                    runnable2.run();
                }
            } else {
                Workspace workspaceM = M();
                View animatedView = J().getAnimatedView();
                n.f(animatedView, "null cannot be cast to non-null type com.android.launcher3.dragndrop.DragView<*>");
                workspaceM.v(tVar, cellLayoutF, (p253z2.h) animatedView, runnable2, i13, gVar, true);
            }
        }
        gVarC = com.nothing.cardhost.f.C(L0(), O0(), i11, tVar.l().a(O0()), false, null, 24, null);
        runnable = new Runnable() { // from class: y7.G
            @Override // java.lang.Runnable
            public final void run() {
                S.D0(this.f30377q, i11, tVar, gVarC);
            }
        };
        i12 = 3;
        runnable2 = runnable;
        gVar = gVarC;
        i13 = i12;
        if (J().getAnimatedView() != null) {
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            Workspace workspaceM2 = M();
            View animatedView2 = J().getAnimatedView();
            n.f(animatedView2, "null cannot be cast to non-null type com.android.launcher3.dragndrop.DragView<*>");
            workspaceM2.v(tVar, cellLayoutF, (p253z2.h) animatedView2, runnable2, i13, gVar, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(S s9) {
        s9.M().f(0).invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(S s9, int i10, t tVar, g gVar) {
        s9.A0(i10, tVar, gVar, null);
    }

    private final void H0(com.nothing.launcher.card.t tVar) {
        com.nothing.wallpaper.common.log.c.d("WidgetPickerFragment", "deleteWidgetItem itemInfo:" + tVar.m());
        if (tVar.p()) {
            if (!P0()) {
                F0(tVar.m());
            } else if (y0(tVar.m())) {
                com.nothing.wallpaper.common.log.c.d("WidgetPickerFragment", "deleteWidgetItem deleteWidget: " + tVar.m());
                F0(tVar.m());
            }
        }
        G0(tVar.m());
    }

    private final F5.l J0() {
        return (F5.l) this.f30396v.getValue();
    }

    private final com.nothing.launcher.card.p L0() {
        return (com.nothing.launcher.card.p) this.f30395u.getValue();
    }

    private final D7.c M0() {
        return (D7.c) this.f30393s.getValue();
    }

    private final boolean P0() {
        return ((Boolean) this.f30397w.getValue()).booleanValue();
    }

    private final u Q0() {
        return (u) this.f30394t.getValue();
    }

    private final View R0(j jVar, com.nothing.launcher.card.t tVar) {
        g gVarC = com.nothing.cardhost.f.C(L0(), O0(), tVar.m(), jVar, false, null, 24, null);
        V0(gVarC, tVar);
        return gVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.nothing.launcher.card.p S0(final S s9) {
        return new com.nothing.launcher.card.p(s9.Q0(), new b(s9), new p219v8.l() { // from class: y7.P
            @Override // p219v8.l
            public final Object f(Object obj) {
                return S.T0(this.f30388q, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A T0(S s9, int i10) {
        s9.a1(i10);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D7.c U0(S s9) {
        return new D7.c(s9.O0());
    }

    private final void V0(g gVar, com.nothing.launcher.card.t tVar) {
        gVar.setTag(tVar);
        tVar.q(O0(), gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u W0(S s9) {
        Context contextRequireContext = s9.requireContext();
        n.g(contextRequireContext, "requireContext(...)");
        return new u(contextRequireContext, s9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X0(int i10, m mVar) {
        L0().z0(this.f30400z, i10, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y0(p030d.a it) {
        n.h(it, "it");
    }

    private final void Z0() {
        M().B();
        L0().A();
    }

    private final void a1(final int i10) {
        M().R(new InterfaceC0799f() { // from class: y7.H
            @Override // F2.InterfaceC0799f
            public final boolean a(b bVar, View view) {
                return S.b1(i10, this, bVar, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b1(int i10, S s9, C2.b bVar, View view) {
        if (!(bVar instanceof com.nothing.launcher.card.t)) {
            return false;
        }
        com.nothing.launcher.card.t tVar = (com.nothing.launcher.card.t) bVar;
        if (tVar.m() != i10) {
            return false;
        }
        n.e(view);
        s9.c1(view, tVar, true);
        return true;
    }

    public static /* synthetic */ void d1(S s9, View view, com.nothing.launcher.card.t tVar, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeItem");
        }
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        s9.c1(view, tVar, z9);
    }

    private final void e1(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.f30398x = (t) bundle.getParcelable("widget.request_args", t.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g1(S s9, p030d.a result) {
        n.h(result, "result");
        t tVar = s9.f30398x;
        if (tVar == null) {
            return;
        }
        s9.f30398x = null;
        s9.B0(result.b(), tVar.m(), tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h1() {
        return I.a().C().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u i1(S s9) {
        Context contextRequireContext = s9.requireContext();
        n.g(contextRequireContext, "requireContext(...)");
        return new u(contextRequireContext);
    }

    private final void s0(com.nothing.launcher.card.m mVar) {
        com.nothing.launcher.card.p pVarL0 = L0();
        com.nothing.launcher.card.a aVarP = mVar.p();
        g gVar = mVar.f18138I;
        if (gVar != null) {
            J().removeView(gVar);
            t0(gVar.getAppWidgetId(), mVar, gVar, aVarP);
            mVar.f18138I = null;
        } else {
            int iW = pVarL0.w();
            if (pVarL0.y(iW, mVar.n(), mVar.m())) {
                t0(iW, mVar, null, aVarP);
            } else {
                com.nothing.wallpaper.common.log.c.o("WidgetPickerFragment", "bindAppWidgetId error");
                pVarL0.D(iW);
            }
        }
    }

    private final void t0(int i10, C2.b bVar, g gVar, com.nothing.launcher.card.a aVar) {
        if (!aVar.b()) {
            Context contextRequireContext = requireContext();
            n.g(contextRequireContext, "requireContext(...)");
            A0(i10, bVar, gVar, aVar.a(contextRequireContext));
        } else {
            this.f30398x = t.k(i10, aVar, bVar);
            com.nothing.launcher.card.p pVarL0 = L0();
            c cVar = this.f30390A;
            Context contextRequireContext2 = requireContext();
            n.g(contextRequireContext2, "requireContext(...)");
            pVarL0.z0(cVar, i10, aVar.a(contextRequireContext2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o w0(View view) {
        Object tag = view.getTag();
        n.f(tag, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo");
        return v.a(view, (com.nothing.launcher.card.t) tag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x0(List list, o oVar) {
        n.h(oVar, "<destruct>");
        com.nothing.launcher.card.t tVar = (com.nothing.launcher.card.t) oVar.b();
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((com.nothing.launcher.card.t) ((o) it.next()).d()).m() == tVar.m()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F5.l z0(S s9) {
        F5.l.a aVar = F5.l.f1669g;
        Context contextRequireContext = s9.requireContext();
        n.g(contextRequireContext, "requireContext(...)");
        return aVar.a(contextRequireContext);
    }

    protected void A0(int i10, C2.b itemInfo, g gVar, j jVar) {
        int i11;
        n.h(itemInfo, "itemInfo");
        if (jVar == null) {
            m mVarL = J0().l(i10);
            jVar = mVarL != null ? j.f18121Z.a(O0(), mVarL) : null;
        }
        j jVar2 = jVar;
        if (jVar2 == null) {
            com.nothing.wallpaper.common.log.c.f("WidgetPickerFragment", "completeAddCardWidget cardWidgetInfo is null");
            return;
        }
        if (gVar == null) {
            i11 = i10;
            gVar = com.nothing.cardhost.f.C(L0(), O0(), i11, jVar2, false, null, 24, null);
        } else {
            i11 = i10;
        }
        com.nothing.launcher.card.t tVar = new com.nothing.launcher.card.t(i11, jVar2.v0());
        itemInfo.f593q = i11;
        tVar.a(itemInfo);
        gVar.setVisibility(0);
        V0(gVar, tVar);
        M().h(gVar, tVar);
        J().announceForAccessibility(getString(R.string.item_added_to_workspace));
        gVar.requestLayout();
        u0(v.a(jVar2, tVar));
        d.f7114r.l("widget_add", tVar, tVar.f592D);
    }

    @Override // com.android.launcher3.views.f
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public com.android.launcher3.dragndrop.a[] x() {
        return new com.android.launcher3.dragndrop.a[]{p()};
    }

    public final void F0(int i10) {
        com.nothing.wallpaper.common.log.c.k("WidgetPickerFragment", "deleteAppWidgetId widgetId:" + i10);
        L0().D(i10);
    }

    public abstract void G0(int i10);

    public final List I0() {
        List<View> allChildren = M().getAllChildren();
        n.g(allChildren, "getAllChildren(...)");
        List<View> list = allChildren;
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object tag = ((View) it.next()).getTag();
            n.f(tag, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo");
            arrayList.add((com.nothing.launcher.card.t) tag);
        }
        return arrayList;
    }

    @Override // com.android.launcher3.views.f
    public com.android.launcher3.f K() {
        K6.c cVar = this.f30391q;
        Context contextRequireContext = requireContext();
        n.g(contextRequireContext, "requireContext(...)");
        return cVar.J0(contextRequireContext);
    }

    public final Map K0() {
        return this.f30399y;
    }

    protected final K6.c N0() {
        return this.f30391q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final u O0() {
        return (u) this.f30392r.getValue();
    }

    @Override // com.android.launcher3.views.f
    public com.nothing.launcher.card.p R() {
        return L0();
    }

    @Override // com.android.launcher3.views.f
    public void U(com.android.launcher3.m info, int[] cell, int i10, int i11) {
        n.h(info, "info");
        n.h(cell, "cell");
        if (info instanceof com.nothing.launcher.card.m) {
            info.f594r = 0;
            info.f595s = cell[0];
            info.f596t = cell[1];
            info.f597u = i10;
            info.f598v = i11;
            s0((com.nothing.launcher.card.m) info);
        }
    }

    protected final void c1(View v9, com.nothing.launcher.card.t info, boolean z9) {
        n.h(v9, "v");
        n.h(info, "info");
        M().Y(v9);
        if (z9) {
            H0(info);
            if (P0()) {
                this.f30399y.put(Integer.valueOf(info.m()), 2);
            } else {
                d.f7114r.l("widget_remove", info, 2);
            }
        }
    }

    protected final void f1(t tVar) {
        this.f30398x = tVar;
    }

    @Override // com.android.launcher3.views.f
    public void o(C2.b itemInfo) {
        n.h(itemInfo, "itemInfo");
        if (itemInfo instanceof com.nothing.launcher.card.t) {
            com.nothing.launcher.card.t tVar = (com.nothing.launcher.card.t) itemInfo;
            H0(tVar);
            if (P0()) {
                this.f30399y.put(Integer.valueOf(tVar.m()), 3);
            } else {
                d.f7114r.l("widget_remove", tVar, 3);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.nothing.launcher.card.p pVarL0 = L0();
        Context contextRequireContext = requireContext();
        n.g(contextRequireContext, "requireContext(...)");
        pVarL0.z(contextRequireContext);
        e1(bundle);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroy() {
        super.onDestroy();
        L0().r0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        p().A(M());
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        n.g(layoutInflaterOnGetLayoutInflater, "onGetLayoutInflater(...)");
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(O0());
        n.g(layoutInflaterCloneInContext, "cloneInContext(...)");
        return layoutInflaterCloneInContext;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onPause() {
        super.onPause();
        p().j();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onResume() {
        super.onResume();
        com.nothing.cardhost.f.X(L0(), false, 0L, 0, 7, null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onSaveInstanceState(Bundle outState) {
        n.h(outState, "outState");
        t tVar = this.f30398x;
        if (tVar != null) {
            outState.putParcelable("widget.request_args", tVar);
        }
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onStop() {
        super.onStop();
        L0().Y();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onViewCreated(View view, Bundle bundle) {
        n.h(view, "view");
        super.onViewCreated(view, bundle);
        J().setup(p());
        M().setup(p());
        p().d(M());
    }

    @Override // com.android.launcher3.views.f
    public com.android.launcher3.dragndrop.a p() {
        return M0();
    }

    public abstract void u0(o oVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:50:0x0161  */
    public final void v0(final List infoList) {
        Object next;
        o oVarA;
        Object tag;
        boolean zO;
        n.h(infoList, "infoList");
        if (infoList.isEmpty()) {
            Z0();
        } else {
            List<View> allChildren = M().getAllChildren();
            if (allChildren.isEmpty()) {
                Iterator it = infoList.iterator();
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    j jVar = (j) oVar.a();
                    com.nothing.launcher.card.t tVar = (com.nothing.launcher.card.t) oVar.b();
                    View viewR0 = R0(jVar, tVar);
                    viewR0.setVisibility(tVar.n() ? 8 : 0);
                    M().e(viewR0, tVar);
                }
            } else {
                n.e(allChildren);
                List<View> list = allChildren;
                for (o oVar2 : k.p(k.x(AbstractC1444s.K(list), new p219v8.l() { // from class: y7.Q
                    @Override // p219v8.l
                    public final Object f(Object obj) {
                        return S.w0((View) obj);
                    }
                }), new p219v8.l() { // from class: y7.E
                    @Override // p219v8.l
                    public final Object f(Object obj) {
                        return Boolean.valueOf(S.x0(infoList, (o) obj));
                    }
                })) {
                    View view = (View) oVar2.a();
                    com.nothing.launcher.card.t tVar2 = (com.nothing.launcher.card.t) oVar2.b();
                    n.e(view);
                    d1(this, view, tVar2, false, 4, null);
                }
                ArrayList<o> arrayList = new ArrayList();
                for (Object obj : infoList) {
                    com.nothing.launcher.card.t tVar3 = (com.nothing.launcher.card.t) ((o) obj).b();
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        do {
                            if (it2.hasNext()) {
                                View view2 = (View) it2.next();
                                Object tag2 = view2.getTag();
                                n.f(tag2, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo");
                                zO = ((com.nothing.launcher.card.t) tag2).o(tVar3);
                                if (zO) {
                                    view2.setTag(tVar3);
                                }
                            }
                        } while (!zO);
                    }
                    arrayList.add(obj);
                }
                ArrayList<o> arrayList2 = new ArrayList(AbstractC1444s.u(arrayList, 10));
                for (o oVar3 : arrayList) {
                    j jVar2 = (j) oVar3.a();
                    com.nothing.launcher.card.t tVar4 = (com.nothing.launcher.card.t) oVar3.b();
                    Iterator<T> it3 = list.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it3.next();
                            tag = ((View) next).getTag();
                            n.f(tag, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo");
                        }
                    } while (((com.nothing.launcher.card.t) tag).m() != tVar4.m());
                    View view3 = (View) next;
                    if (view3 != null) {
                        Object tag3 = view3.getTag();
                        n.f(tag3, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo");
                        d1(this, view3, (com.nothing.launcher.card.t) tag3, false, 4, null);
                        view3.setTag(tVar4);
                        oVarA = v.a(view3, tVar4);
                        if (oVarA == null) {
                            oVarA = v.a(R0(jVar2, tVar4), tVar4);
                        }
                    } else {
                        oVarA = v.a(R0(jVar2, tVar4), tVar4);
                    }
                    arrayList2.add(oVarA);
                }
                for (o oVar4 : arrayList2) {
                    M().e((View) oVar4.a(), (com.nothing.launcher.card.t) oVar4.b());
                }
            }
        }
        M().k0();
    }

    public abstract boolean y0(int i10);
}

package H7;

import D8.k;
import F2.F;
import F2.w;
import F5.m;
import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.android.launcher3.Workspace;
import com.android.launcher3.dragndrop.DragLayer;
import com.android.launcher3.l;
import com.android.launcher3.views.f;
import com.nothing.cardhost.g;
import com.nothing.launcher.card.j;
import com.nothing.launcher.card.p;
import com.nothing.launcher.card.t;
import com.nothing.launcher.card.u;
import com.nothing.wallpaper.picker.lockscreen.ui.graphics.LockScreenPreviewLayout;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClockHostView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import p044e3.I;
import p074h3.H;
import p079h8.h;
import p079h8.i;
import p079h8.o;
import p079h8.v;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends ContextWrapper implements f, l {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final K6.c f2553q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final I f2554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final h f2555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final a f2556t;

    public static final class a extends com.nothing.cardhost.f {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context, 1, null, 4, null);
            n.h(context, "context");
        }

        @Override // com.nothing.cardhost.f
        public g U(Context context, int i10, m mVar, boolean z9) {
            n.h(context, "context");
            return new b(context);
        }
    }

    public static final class b extends com.nothing.launcher.card.l {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(context);
            n.h(context, "context");
        }
    }

    public static final class c implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f2558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2560d;

        public c(ViewGroup viewGroup, d dVar, int i10, int i11) {
            this.f2557a = viewGroup;
            this.f2558b = dVar;
            this.f2559c = i10;
            this.f2560d = i11;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            float f10;
            int i18;
            view.removeOnLayoutChangeListener(this);
            int measuredHeight = this.f2557a.getMeasuredHeight();
            int measuredWidth = this.f2557a.getMeasuredWidth();
            View viewO = this.f2558b.f2554r.o();
            d dVar = this.f2558b;
            n.e(viewO);
            dVar.q(viewO, this.f2559c, this.f2560d);
            if (measuredHeight > 0) {
                f10 = measuredHeight;
                i18 = this.f2560d;
            } else {
                f10 = measuredWidth;
                i18 = this.f2559c;
            }
            float f11 = f10 / i18;
            viewO.setScaleX(f11);
            viewO.setScaleY(f11);
            viewO.setPivotX(H6.a.d(this.f2558b) ? viewO.getMeasuredWidth() : 0.0f);
            viewO.setPivotY(0.0f);
            this.f2557a.removeAllViews();
            this.f2557a.addView(viewO, viewO.getMeasuredWidth(), viewO.getMeasuredHeight());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(final Context context, ViewGroup previewContainer) {
        super(context);
        n.h(context, "context");
        n.h(previewContainer, "previewContainer");
        H hA = p074h3.I.a();
        n.f(hA, "null cannot be cast to non-null type com.nothing.wallpaper.module.NTPickerInjector");
        this.f2553q = (K6.c) hA;
        I iC = I.C(LayoutInflater.from(this), null, false);
        n.g(iC, "inflate(...)");
        this.f2554r = iC;
        this.f2555s = i.b(new p219v8.a() { // from class: H7.a
            @Override // p219v8.a
            public final Object invoke() {
                return d.v(context);
            }
        });
        a aVar = new a(m());
        aVar.z(context);
        this.f2556t = aVar;
        int i10 = K().f15571h;
        int i11 = K().f15572i;
        View rootView = previewContainer.getRootView();
        n.g(rootView, "getRootView(...)");
        if (!rootView.isLaidOut() || rootView.isLayoutRequested()) {
            rootView.addOnLayoutChangeListener(new c(previewContainer, this, i10, i11));
        } else {
            int measuredHeight = previewContainer.getMeasuredHeight();
            int measuredWidth = previewContainer.getMeasuredWidth();
            View viewO = this.f2554r.o();
            n.e(viewO);
            q(viewO, i10, i11);
            float f10 = measuredHeight > 0 ? measuredHeight / i11 : measuredWidth / i10;
            viewO.setScaleX(f10);
            viewO.setScaleY(f10);
            viewO.setPivotX(H6.a.d(this) ? viewO.getMeasuredWidth() : 0.0f);
            viewO.setPivotY(0.0f);
            previewContainer.removeAllViews();
            previewContainer.addView(viewO, viewO.getMeasuredWidth(), viewO.getMeasuredHeight());
        }
        ClockHostView clockHostView = iC.f19855v;
        n.g(clockHostView, "clockHostView");
        ViewGroup.LayoutParams layoutParams = clockHostView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = K().j();
        clockHostView.setLayoutParams(marginLayoutParams);
        iC.f19859z.f(0).getAnimBackground().setAlpha(0);
        iC.f19857x.getDrawable().setTint(p171r0.a.b(context, F.f1542t.a(context).Y() ? R.color.system_neutral1_0 : R.color.system_neutral1_900));
        K().d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(List list, o oVar) {
        n.h(oVar, "<destruct>");
        t tVar = (t) oVar.b();
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((t) ((o) it.next()).d()).m() == tVar.m()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o l(View view) {
        Object tag = view.getTag();
        n.f(tag, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo");
        return v.a(view, (t) tag);
    }

    private final u m() {
        return (u) this.f2555s.getValue();
    }

    private final View n(j jVar, t tVar) {
        g gVarC = com.nothing.cardhost.f.C(this.f2556t, this, tVar.m(), jVar, false, null, 24, null);
        r(gVarC, tVar);
        return gVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i11, BasicMeasure.EXACTLY));
        view.layout(0, 0, i10, i11);
    }

    private final void r(g gVar, t tVar) {
        gVar.setTag(tVar);
        tVar.q(this, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u v(Context context) {
        return new u(context);
    }

    @Override // com.android.launcher3.views.f
    public DragLayer J() {
        LockScreenPreviewLayout dragLayer = this.f2554r.f19856w;
        n.g(dragLayer, "dragLayer");
        return dragLayer;
    }

    @Override // com.android.launcher3.views.f
    public com.android.launcher3.f K() {
        return this.f2553q.J0(this);
    }

    @Override // com.android.launcher3.views.f
    public Workspace M() {
        Workspace workspace = this.f2554r.f19859z;
        n.g(workspace, "workspace");
        return workspace;
    }

    @Override // com.android.launcher3.views.f
    public p R() {
        return null;
    }

    @Override // com.android.launcher3.l
    public void b(boolean z9) {
        M().V(Boolean.FALSE);
        this.f2554r.f19855v.b(false);
    }

    public void destroy() {
        super.destroy();
        K().r(this);
        this.f2556t.r0();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x013c  */
    public final void g(final List infoList) {
        Object next;
        o oVarA;
        Object tag;
        boolean zO;
        n.h(infoList, "infoList");
        if (infoList.isEmpty()) {
            M().B();
            return;
        }
        List<View> allChildren = M().getAllChildren();
        if (allChildren.isEmpty()) {
            Iterator it = infoList.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                j jVar = (j) oVar.a();
                t tVar = (t) oVar.b();
                M().e(n(jVar, tVar), tVar);
            }
            return;
        }
        n.e(allChildren);
        List<View> list = allChildren;
        Iterator it2 = k.p(k.x(AbstractC1444s.K(list), new p219v8.l() { // from class: H7.b
            @Override // p219v8.l
            public final Object f(Object obj) {
                return d.l((View) obj);
            }
        }), new p219v8.l() { // from class: H7.c
            @Override // p219v8.l
            public final Object f(Object obj) {
                return Boolean.valueOf(d.j(infoList, (o) obj));
            }
        }).iterator();
        while (it2.hasNext()) {
            M().Y((View) ((o) it2.next()).a());
        }
        ArrayList<o> arrayList = new ArrayList();
        for (Object obj : infoList) {
            t tVar2 = (t) ((o) obj).b();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it3 = list.iterator();
                do {
                    if (it3.hasNext()) {
                        View view = (View) it3.next();
                        Object tag2 = view.getTag();
                        n.f(tag2, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo");
                        zO = ((t) tag2).o(tVar2);
                        if (zO) {
                            view.setTag(tVar2);
                        }
                    }
                } while (!zO);
            }
            arrayList.add(obj);
        }
        ArrayList<o> arrayList2 = new ArrayList(AbstractC1444s.u(arrayList, 10));
        for (o oVar2 : arrayList) {
            j jVar2 = (j) oVar2.a();
            t tVar3 = (t) oVar2.b();
            Iterator<T> it4 = list.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it4.next();
                    tag = ((View) next).getTag();
                    n.f(tag, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo");
                }
            } while (((t) tag).m() != tVar3.m());
            View view2 = (View) next;
            if (view2 != null) {
                M().Y(view2);
                view2.setTag(tVar3);
                oVarA = v.a(view2, tVar3);
                if (oVarA == null) {
                    oVarA = v.a(n(jVar2, tVar3), tVar3);
                }
            } else {
                oVarA = v.a(n(jVar2, tVar3), tVar3);
            }
            arrayList2.add(oVarA);
        }
        for (o oVar3 : arrayList2) {
            M().e((View) oVar3.a(), (t) oVar3.b());
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String name) {
        n.h(name, "name");
        return n.d("layout_inflater", name) ? LayoutInflater.from(getBaseContext()).cloneInContext(this) : super.getSystemService(name);
    }

    public final void t(List shortcuts) {
        n.h(shortcuts, "shortcuts");
        this.f2554r.f19858y.setShortcuts(shortcuts);
    }

    public final void u(S1.a clockViewFactory, String clockId) {
        n.h(clockViewFactory, "clockViewFactory");
        n.h(clockId, "clockId");
        this.f2554r.f19855v.v(clockViewFactory, clockId);
    }

    @Override // com.android.launcher3.views.f
    public w[] x() {
        return new w[0];
    }
}

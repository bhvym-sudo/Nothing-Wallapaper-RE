package androidx.transition;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.fragment.app.V;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.transition.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1170e extends V {

    /* JADX INFO: renamed from: androidx.transition.e$a */
    class a extends m.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f14112a;

        a(Rect rect) {
            this.f14112a = rect;
        }

        @Override // androidx.transition.m.e
        public Rect a(m mVar) {
            return this.f14112a;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$b */
    class b implements m.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f14115b;

        b(View view, ArrayList arrayList) {
            this.f14114a = view;
            this.f14115b = arrayList;
        }

        @Override // androidx.transition.m.h
        public void a(m mVar) {
            mVar.h0(this);
            mVar.e(this);
        }

        @Override // androidx.transition.m.h
        public void c(m mVar) {
        }

        @Override // androidx.transition.m.h
        public void f(m mVar) {
            mVar.h0(this);
            this.f14114a.setVisibility(8);
            int size = this.f14115b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f14115b.get(i10)).setVisibility(0);
            }
        }

        @Override // androidx.transition.m.h
        public void i(m mVar) {
        }

        @Override // androidx.transition.m.h
        public void k(m mVar) {
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$c */
    class c extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f14117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f14118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f14119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f14120d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f14121e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f14122f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f14117a = obj;
            this.f14118b = arrayList;
            this.f14119c = obj2;
            this.f14120d = arrayList2;
            this.f14121e = obj3;
            this.f14122f = arrayList3;
        }

        @Override // androidx.transition.t, androidx.transition.m.h
        public void a(m mVar) {
            Object obj = this.f14117a;
            if (obj != null) {
                C1170e.this.E(obj, this.f14118b, null);
            }
            Object obj2 = this.f14119c;
            if (obj2 != null) {
                C1170e.this.E(obj2, this.f14120d, null);
            }
            Object obj3 = this.f14121e;
            if (obj3 != null) {
                C1170e.this.E(obj3, this.f14122f, null);
            }
        }

        @Override // androidx.transition.t, androidx.transition.m.h
        public void f(m mVar) {
            mVar.h0(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$d */
    class d implements m.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f14124a;

        d(Runnable runnable) {
            this.f14124a = runnable;
        }

        @Override // androidx.transition.m.h
        public void a(m mVar) {
        }

        @Override // androidx.transition.m.h
        public void c(m mVar) {
        }

        @Override // androidx.transition.m.h
        public void f(m mVar) {
            this.f14124a.run();
        }

        @Override // androidx.transition.m.h
        public void i(m mVar) {
        }

        @Override // androidx.transition.m.h
        public void k(m mVar) {
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$e, reason: collision with other inner class name */
    class C0417e extends m.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f14126a;

        C0417e(Rect rect) {
            this.f14126a = rect;
        }

        @Override // androidx.transition.m.e
        public Rect a(m mVar) {
            Rect rect = this.f14126a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f14126a;
        }
    }

    public static /* synthetic */ void C(Runnable runnable, m mVar, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            mVar.cancel();
            runnable2.run();
        }
    }

    private static boolean D(m mVar) {
        return (V.l(mVar.L()) && V.l(mVar.M()) && V.l(mVar.N())) ? false : true;
    }

    @Override // androidx.fragment.app.V
    public void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        x xVar = (x) obj;
        if (xVar != null) {
            xVar.O().clear();
            xVar.O().addAll(arrayList2);
            E(xVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.V
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        x xVar = new x();
        xVar.x0((m) obj);
        return xVar;
    }

    public void E(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        m mVar = (m) obj;
        int i10 = 0;
        if (mVar instanceof x) {
            x xVar = (x) mVar;
            int iA0 = xVar.A0();
            while (i10 < iA0) {
                E(xVar.z0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (D(mVar)) {
            return;
        }
        List listO = mVar.O();
        if (listO.size() == arrayList.size() && listO.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                mVar.i((View) arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                mVar.i0((View) arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.V
    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).i(view);
        }
    }

    @Override // androidx.fragment.app.V
    public void b(Object obj, ArrayList arrayList) {
        m mVar = (m) obj;
        if (mVar == null) {
            return;
        }
        int i10 = 0;
        if (mVar instanceof x) {
            x xVar = (x) mVar;
            int iA0 = xVar.A0();
            while (i10 < iA0) {
                b(xVar.z0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (D(mVar) || !V.l(mVar.O())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            mVar.i((View) arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.V
    public void c(Object obj) {
        ((w) obj).g();
    }

    @Override // androidx.fragment.app.V
    public void d(Object obj, Runnable runnable) {
        ((w) obj).h(runnable);
    }

    @Override // androidx.fragment.app.V
    public void e(ViewGroup viewGroup, Object obj) {
        u.a(viewGroup, (m) obj);
    }

    @Override // androidx.fragment.app.V
    public boolean g(Object obj) {
        return obj instanceof m;
    }

    @Override // androidx.fragment.app.V
    public Object h(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.V
    public Object j(ViewGroup viewGroup, Object obj) {
        return u.b(viewGroup, (m) obj);
    }

    @Override // androidx.fragment.app.V
    public boolean m() {
        return true;
    }

    @Override // androidx.fragment.app.V
    public boolean n(Object obj) {
        boolean zT = ((m) obj).T();
        if (!zT) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zT;
    }

    @Override // androidx.fragment.app.V
    public Object o(Object obj, Object obj2, Object obj3) {
        m mVarG0 = (m) obj;
        m mVar = (m) obj2;
        m mVar2 = (m) obj3;
        if (mVarG0 != null && mVar != null) {
            mVarG0 = new x().x0(mVarG0).x0(mVar).G0(1);
        } else if (mVarG0 == null) {
            mVarG0 = mVar != null ? mVar : null;
        }
        if (mVar2 == null) {
            return mVarG0;
        }
        x xVar = new x();
        if (mVarG0 != null) {
            xVar.x0(mVarG0);
        }
        xVar.x0(mVar2);
        return xVar;
    }

    @Override // androidx.fragment.app.V
    public Object p(Object obj, Object obj2, Object obj3) {
        x xVar = new x();
        if (obj != null) {
            xVar.x0((m) obj);
        }
        if (obj2 != null) {
            xVar.x0((m) obj2);
        }
        if (obj3 != null) {
            xVar.x0((m) obj3);
        }
        return xVar;
    }

    @Override // androidx.fragment.app.V
    public void r(Object obj, View view, ArrayList arrayList) {
        ((m) obj).e(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.V
    public void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((m) obj).e(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.V
    public void t(Object obj, float f10) {
        w wVar = (w) obj;
        if (wVar.isReady()) {
            long jL = (long) (f10 * wVar.l());
            if (jL == 0) {
                jL = 1;
            }
            if (jL == wVar.l()) {
                jL = wVar.l() - 1;
            }
            wVar.d(jL);
        }
    }

    @Override // androidx.fragment.app.V
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).o0(new C0417e(rect));
        }
    }

    @Override // androidx.fragment.app.V
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((m) obj).o0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.V
    public void w(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, Object obj, p231x0.e eVar, Runnable runnable) {
        x(abstractComponentCallbacksC1132q, obj, eVar, null, runnable);
    }

    @Override // androidx.fragment.app.V
    public void x(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, Object obj, p231x0.e eVar, final Runnable runnable, final Runnable runnable2) {
        final m mVar = (m) obj;
        eVar.b(new x0.e.a() { // from class: androidx.transition.d
            @Override // x0.e.a
            public final void onCancel() {
                C1170e.C(runnable, mVar, runnable2);
            }
        });
        mVar.e(new d(runnable2));
    }

    @Override // androidx.fragment.app.V
    public void z(Object obj, View view, ArrayList arrayList) {
        x xVar = (x) obj;
        List listO = xVar.O();
        listO.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            V.f(listO, (View) arrayList.get(i10));
        }
        listO.add(view);
        arrayList.add(view);
        b(xVar, arrayList);
    }
}

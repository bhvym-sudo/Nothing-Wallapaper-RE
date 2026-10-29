package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.C1021a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static m f14213a = new C1166a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal f14214b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static ArrayList f14215c = new ArrayList();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        m f14216q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        ViewGroup f14217r;

        /* JADX INFO: renamed from: androidx.transition.u$a$a, reason: collision with other inner class name */
        class C0418a extends t {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1021a f14218a;

            C0418a(C1021a c1021a) {
                this.f14218a = c1021a;
            }

            @Override // androidx.transition.t, androidx.transition.m.h
            public void f(m mVar) {
                ((ArrayList) this.f14218a.get(a.this.f14217r)).remove(mVar);
                mVar.h0(this);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f14216q = mVar;
            this.f14217r = viewGroup;
        }

        private void a() {
            this.f14217r.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f14217r.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!u.f14215c.remove(this.f14217r)) {
                return true;
            }
            C1021a c1021aC = u.c();
            ArrayList arrayList = (ArrayList) c1021aC.get(this.f14217r);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c1021aC.put(this.f14217r, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f14216q);
            this.f14216q.e(new C0418a(c1021aC));
            this.f14216q.q(this.f14217r, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).j0(this.f14217r);
                }
            }
            this.f14216q.f0(this.f14217r);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            u.f14215c.remove(this.f14217r);
            ArrayList arrayList = (ArrayList) u.c().get(this.f14217r);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).j0(this.f14217r);
                }
            }
            this.f14216q.r(true);
        }
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (f14215c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f14215c.add(viewGroup);
        if (mVar == null) {
            mVar = f14213a;
        }
        m mVarClone = mVar.clone();
        e(viewGroup, mVarClone);
        AbstractC1175j.b(viewGroup, null);
        d(viewGroup, mVarClone);
    }

    public static w b(ViewGroup viewGroup, m mVar) {
        if (f14215c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return null;
        }
        if (!mVar.T()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f14215c.add(viewGroup);
        m mVarClone = mVar.clone();
        x xVar = new x();
        xVar.x0(mVarClone);
        e(viewGroup, xVar);
        AbstractC1175j.b(viewGroup, null);
        d(viewGroup, xVar);
        viewGroup.invalidate();
        return xVar.w();
    }

    static C1021a c() {
        C1021a c1021a;
        WeakReference weakReference = (WeakReference) f14214b.get();
        if (weakReference != null && (c1021a = (C1021a) weakReference.get()) != null) {
            return c1021a;
        }
        C1021a c1021a2 = new C1021a();
        f14214b.set(new WeakReference(c1021a2));
        return c1021a2;
    }

    private static void d(ViewGroup viewGroup, m mVar) {
        if (mVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(mVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void e(ViewGroup viewGroup, m mVar) {
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m) it.next()).e0(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.q(viewGroup, true);
        }
        AbstractC1175j.a(viewGroup);
    }
}

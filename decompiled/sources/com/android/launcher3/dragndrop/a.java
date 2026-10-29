package com.android.launcher3.dragndrop;

import F2.w;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.android.launcher3.g;
import com.android.launcher3.h;
import com.android.launcher3.views.f;
import java.util.ArrayList;
import java.util.Iterator;
import p223w2.q;
import p253z2.e;
import p253z2.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements com.android.launcher3.dragndrop.b.a, w {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected h f15508B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f15509C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected boolean f15511E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final f f15513q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected e f15517u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected h.a f15521y;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f15514r = new Rect();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int[] f15515s = new int[2];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected com.android.launcher3.dragndrop.b f15516t = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final Point f15518v = new Point();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected final Point f15519w = new Point();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final Point f15520x = new Point();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ArrayList f15522z = new ArrayList();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final ArrayList f15507A = new ArrayList();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected int f15510D = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f15512F = 500;

    /* JADX INFO: renamed from: com.android.launcher3.dragndrop.a$a, reason: collision with other inner class name */
    class RunnableC0442a implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ View f15523q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Runnable f15524r;

        RunnableC0442a(a aVar, View view, Runnable runnable) {
            this.f15523q = view;
            this.f15524r = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view = this.f15523q;
            if (view != null) {
                view.setVisibility(0);
            }
            Runnable runnable = this.f15524r;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public interface b {
        void n(h.a aVar, e eVar);

        void t();
    }

    public a(f fVar) {
        this.f15513q = fVar;
    }

    private h l(int i10, int i11) {
        if (this.f15511E) {
            return this.f15508B;
        }
        h hVarS = s(i10, i11);
        if (hVarS != null) {
            h hVar = this.f15508B;
            if (hVar != hVarS) {
                if (hVar != null) {
                    hVar.w(this.f15521y);
                }
                hVarS.s(this.f15521y);
            }
            hVarS.l(this.f15521y);
        } else {
            h hVar2 = this.f15508B;
            if (hVar2 != null) {
                hVar2.w(this.f15521y);
            }
        }
        this.f15508B = hVarS;
        return hVarS;
    }

    private void m(View view, boolean z9) {
        if (!z9) {
            r();
            this.f15521y.f15603k = false;
        }
        h.a aVar = this.f15521y;
        aVar.f15601i.k(view, aVar, z9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h s(int i10, int i11) {
        int[] iArr = this.f15515s;
        iArr[0] = i10;
        iArr[1] = i11;
        Rect rect = this.f15514r;
        ArrayList arrayList = this.f15522z;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h hVar = (h) arrayList.get(size);
            if (hVar.i()) {
                hVar.c(rect);
                if (rect.contains(i10, i11)) {
                    this.f15513q.J().p((View) hVar, this.f15515s);
                    h.a aVar = this.f15521y;
                    int[] iArr2 = this.f15515s;
                    aVar.f15593a = iArr2[0];
                    aVar.f15594b = iArr2[1];
                    return hVar;
                }
            }
        }
        h hVarU = u(this.f15515s);
        h.a aVar2 = this.f15521y;
        int[] iArr3 = this.f15515s;
        aVar2.f15593a = iArr3[0];
        aVar2.f15594b = iArr3[1];
        return hVarU;
    }

    public void A(b bVar) {
        this.f15507A.remove(bVar);
    }

    public void B(h hVar) {
        this.f15522z.remove(hVar);
    }

    protected abstract p253z2.h C(Drawable drawable, View view, j jVar, int i10, int i11, g gVar, C2.b bVar, Rect rect, float f10, float f11, e eVar);

    public p253z2.h D(Drawable drawable, j jVar, int i10, int i11, g gVar, C2.b bVar, Rect rect, float f10, float f11, e eVar) {
        return C(drawable, null, jVar, i10, i11, gVar, bVar, rect, f10, f11, eVar);
    }

    public p253z2.h E(View view, j jVar, int i10, int i11, g gVar, C2.b bVar, Rect rect, float f10, float f11, e eVar) {
        return C(null, view, jVar, i10, i11, gVar, bVar, rect, f10, f11, eVar);
    }

    @Override // com.android.launcher3.dragndrop.b.a
    public void a(float f10, float f11) {
        if (!q()) {
            o(s((int) f10, (int) f11), null);
        }
        p();
    }

    @Override // com.android.launcher3.dragndrop.b.a
    public void b() {
        j();
    }

    @Override // com.android.launcher3.dragndrop.b.a
    public void c(float f10, float f11) {
        Point pointT = t(f10, f11);
        x(pointT.x, pointT.y);
    }

    public void d(b bVar) {
        this.f15507A.add(bVar);
    }

    public void e(h hVar) {
        this.f15522z.add(hVar);
    }

    public void f(Runnable runnable, View view, int i10) {
        RunnableC0442a runnableC0442a = new RunnableC0442a(this, view, runnable);
        p253z2.h hVar = this.f15521y.f15598f;
        Point point = this.f15518v;
        hVar.f(point.x, point.y, runnableC0442a, i10);
    }

    protected void g() {
        if (this.f15511E) {
            this.f15517u.getClass();
        }
        this.f15511E = false;
        this.f15517u = null;
        Iterator it = new ArrayList(this.f15507A).iterator();
        while (it.hasNext()) {
            ((b) it.next()).t();
        }
    }

    @Override // F2.w
    public boolean h(MotionEvent motionEvent) {
        com.android.launcher3.dragndrop.b bVar = this.f15516t;
        return bVar != null && bVar.c(motionEvent);
    }

    protected void i() {
        this.f15517u.getClass();
        this.f15511E = false;
        if (this.f15517u.f30657d != 0.0f) {
            this.f15521y.f15598f.animate().scaleX(this.f15517u.f30657d).scaleY(this.f15517u.f30657d).setInterpolator(q.f28617t).setDuration(500L).start();
        }
        this.f15521y.f15598f.o();
        Iterator it = new ArrayList(this.f15507A).iterator();
        while (it.hasNext()) {
            ((b) it.next()).n(this.f15521y, this.f15517u);
        }
    }

    public void j() {
        if (y()) {
            h hVar = this.f15508B;
            if (hVar != null) {
                hVar.w(this.f15521y);
            }
            h.a aVar = this.f15521y;
            aVar.f15603k = false;
            aVar.f15602j = true;
            aVar.f15597e = true;
            if (!this.f15511E) {
                m(null, false);
            }
        }
        p();
    }

    @Override // F2.w
    public boolean k(MotionEvent motionEvent) {
        e eVar = this.f15517u;
        if (eVar != null && eVar.f30654a) {
            return false;
        }
        Point pointT = t(v(motionEvent), w(motionEvent));
        this.f15519w.set(pointT.x, pointT.y);
        if (motionEvent.getAction() == 0) {
            this.f15518v.set(pointT.x, pointT.y);
        }
        this.f15509C = motionEvent.getClassification();
        com.android.launcher3.dragndrop.b bVar = this.f15516t;
        return bVar != null && bVar.b(motionEvent);
    }

    public boolean n(KeyEvent keyEvent) {
        return this.f15516t != null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    protected void o(h hVar, Runnable runnable) {
        h hVar2 = this.f15508B;
        if (hVar != hVar2) {
            if (hVar2 != null) {
                hVar2.w(this.f15521y);
            }
            this.f15508B = hVar;
            if (hVar != 0) {
                hVar.s(this.f15521y);
            }
        }
        h.a aVar = this.f15521y;
        boolean z9 = true;
        aVar.f15597e = true;
        if (this.f15511E) {
            if (hVar != 0) {
                hVar.w(aVar);
                return;
            }
            return;
        }
        if (hVar != 0) {
            hVar.g(aVar);
            hVar.w(this.f15521y);
            if (!hVar.u(this.f15521y)) {
                z9 = false;
            } else if (runnable != null) {
                runnable.run();
            } else {
                hVar.z(this.f15521y, this.f15517u);
            }
        } else {
            z9 = false;
        }
        m(hVar instanceof View ? (View) hVar : null, z9);
    }

    protected void p() {
        boolean z9;
        if (y()) {
            this.f15516t = null;
            h.a aVar = this.f15521y;
            p253z2.h hVar = aVar.f15598f;
            if (hVar != null) {
                z9 = aVar.f15603k;
                if (!z9) {
                    hVar.p();
                } else if (this.f15511E) {
                    f(null, null, -1);
                }
                this.f15521y.f15598f.clearAnimation();
                this.f15521y.f15598f = null;
            } else {
                z9 = false;
            }
            if (z9) {
                return;
            }
            g();
        }
    }

    protected boolean q() {
        return false;
    }

    protected abstract void r();

    protected Point t(float f10, float f11) {
        this.f15513q.J().getLocalVisibleRect(this.f15514r);
        Point point = this.f15520x;
        Rect rect = this.f15514r;
        point.x = (int) Math.max(rect.left, Math.min(f10, rect.right - 1));
        Point point2 = this.f15520x;
        Rect rect2 = this.f15514r;
        point2.y = (int) Math.max(rect2.top, Math.min(f11, rect2.bottom - 1));
        return this.f15520x;
    }

    protected abstract h u(int[] iArr);

    protected float v(MotionEvent motionEvent) {
        return motionEvent.getX();
    }

    protected float w(MotionEvent motionEvent) {
        return motionEvent.getY();
    }

    protected void x(int i10, int i11) {
        this.f15521y.f15598f.n(i10, i11);
        double d10 = this.f15510D;
        Point point = this.f15519w;
        this.f15510D = (int) (d10 + Math.hypot(point.x - i10, point.y - i11));
        this.f15519w.set(i10, i11);
        if (this.f15511E) {
            this.f15517u.getClass();
        }
        l(i10, i11);
    }

    public boolean y() {
        if (this.f15516t != null) {
            return true;
        }
        e eVar = this.f15517u;
        return eVar != null && eVar.f30654a;
    }

    void z(p253z2.h hVar) {
        hVar.p();
        if (this.f15521y.f15603k) {
            g();
        }
    }
}

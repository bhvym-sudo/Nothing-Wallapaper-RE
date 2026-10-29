package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.collection.C1021a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Animator[] f14146c0 = new Animator[0];

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int[] f14147d0 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final AbstractC1172g f14148e0 = new a();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static ThreadLocal f14149f0 = new ThreadLocal();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private ArrayList f14159J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private ArrayList f14160K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private h[] f14161L;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    v f14171V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private e f14172W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private C1021a f14173X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    long f14175Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    g f14176a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    long f14177b0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f14178q = getClass().getName();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f14179r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    long f14180s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TimeInterpolator f14181t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    ArrayList f14182u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ArrayList f14183v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ArrayList f14184w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ArrayList f14185x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ArrayList f14186y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ArrayList f14187z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ArrayList f14150A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private ArrayList f14151B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private ArrayList f14152C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private ArrayList f14153D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private ArrayList f14154E = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private A f14155F = new A();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private A f14156G = new A();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    x f14157H = null;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int[] f14158I = f14147d0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    boolean f14162M = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    ArrayList f14163N = new ArrayList();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Animator[] f14164O = f14146c0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    int f14165P = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f14166Q = false;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    boolean f14167R = false;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private m f14168S = null;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private ArrayList f14169T = null;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    ArrayList f14170U = new ArrayList();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private AbstractC1172g f14174Y = f14148e0;

    class a extends AbstractC1172g {
        a() {
        }

        @Override // androidx.transition.AbstractC1172g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1021a f14188a;

        b(C1021a c1021a) {
            this.f14188a = c1021a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f14188a.remove(animator);
            m.this.f14163N.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m.this.f14163N.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m.this.x();
            animator.removeListener(this);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f14191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f14192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        z f14193c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        WindowId f14194d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        m f14195e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Animator f14196f;

        d(View view, String str, m mVar, WindowId windowId, z zVar, Animator animator) {
            this.f14191a = view;
            this.f14192b = str;
            this.f14193c = zVar;
            this.f14194d = windowId;
            this.f14195e = mVar;
            this.f14196f = animator;
        }
    }

    public static abstract class e {
        public abstract Rect a(m mVar);
    }

    private static class f {
        static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        static void b(Animator animator, long j9) {
            ((AnimatorSet) animator).setCurrentPlayTime(j9);
        }
    }

    class g extends t implements w, P0.b.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f14200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f14201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private P0.e f14202f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Runnable f14205i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f14197a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList f14198b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList f14199c = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private B0.a[] f14203g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final C f14204h = new C();

        g() {
        }

        public static /* synthetic */ void m(g gVar, P0.b bVar, boolean z9, float f10, float f11) {
            if (z9) {
                gVar.getClass();
                return;
            }
            if (f10 >= 1.0f) {
                m.this.d0(i.f14208b, false);
                return;
            }
            long jL = gVar.l();
            m mVarZ0 = ((x) m.this).z0(0);
            m mVar = mVarZ0.f14168S;
            mVarZ0.f14168S = null;
            m.this.m0(-1L, gVar.f14197a);
            m.this.m0(jL, -1L);
            gVar.f14197a = jL;
            Runnable runnable = gVar.f14205i;
            if (runnable != null) {
                runnable.run();
            }
            m.this.f14170U.clear();
            if (mVar != null) {
                mVar.d0(i.f14208b, true);
            }
        }

        private void n() {
            ArrayList arrayList = this.f14199c;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f14199c.size();
            if (this.f14203g == null) {
                this.f14203g = new B0.a[size];
            }
            B0.a[] aVarArr = (B0.a[]) this.f14199c.toArray(this.f14203g);
            this.f14203g = null;
            for (int i10 = 0; i10 < size; i10++) {
                aVarArr[i10].accept(this);
                aVarArr[i10] = null;
            }
            this.f14203g = aVarArr;
        }

        private void o() {
            if (this.f14202f != null) {
                return;
            }
            this.f14204h.a(AnimationUtils.currentAnimationTimeMillis(), this.f14197a);
            this.f14202f = new P0.e(new P0.d());
            P0.f fVar = new P0.f();
            fVar.d(1.0f);
            fVar.f(200.0f);
            this.f14202f.u(fVar);
            this.f14202f.l(this.f14197a);
            this.f14202f.b(this);
            this.f14202f.m(this.f14204h.b());
            this.f14202f.h(l() + 1);
            this.f14202f.i(-1.0f);
            this.f14202f.j(4.0f);
            this.f14202f.a(new P0.b.q() { // from class: androidx.transition.n
                @Override // P0.b.q
                public final void a(P0.b bVar, boolean z9, float f10, float f11) {
                    m.g.m(this.f14212a, bVar, z9, f10, f11);
                }
            });
        }

        @Override // P0.b.r
        public void b(P0.b bVar, float f10, float f11) {
            long jMax = Math.max(-1L, Math.min(l() + 1, Math.round(f10)));
            m.this.m0(jMax, this.f14197a);
            this.f14197a = jMax;
            n();
        }

        @Override // androidx.transition.w
        public void d(long j9) {
            if (this.f14202f != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j9 == this.f14197a || !isReady()) {
                return;
            }
            if (!this.f14201e) {
                if (j9 != 0 || this.f14197a <= 0) {
                    long jL = l();
                    if (j9 == jL && this.f14197a < jL) {
                        j9 = 1 + jL;
                    }
                } else {
                    j9 = -1;
                }
                long j10 = this.f14197a;
                if (j9 != j10) {
                    m.this.m0(j9, j10);
                    this.f14197a = j9;
                }
            }
            n();
            this.f14204h.a(AnimationUtils.currentAnimationTimeMillis(), j9);
        }

        @Override // androidx.transition.w
        public void g() {
            o();
            this.f14202f.r(l() + 1);
        }

        @Override // androidx.transition.w
        public void h(Runnable runnable) {
            this.f14205i = runnable;
            o();
            this.f14202f.r(0.0f);
        }

        @Override // androidx.transition.t, androidx.transition.m.h
        public void i(m mVar) {
            this.f14201e = true;
        }

        @Override // androidx.transition.w
        public boolean isReady() {
            return this.f14200d;
        }

        @Override // androidx.transition.w
        public long l() {
            return m.this.P();
        }

        void p() {
            long j9 = l() == 0 ? 1L : 0L;
            m.this.m0(j9, this.f14197a);
            this.f14197a = j9;
        }

        public void q() {
            this.f14200d = true;
            ArrayList arrayList = this.f14198b;
            if (arrayList != null) {
                this.f14198b = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((B0.a) arrayList.get(i10)).accept(this);
                }
            }
            n();
        }
    }

    public interface h {
        void a(m mVar);

        void c(m mVar);

        default void e(m mVar, boolean z9) {
            f(mVar);
        }

        void f(m mVar);

        void i(m mVar);

        default void j(m mVar, boolean z9) {
            a(mVar);
        }

        void k(m mVar);
    }

    interface i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f14207a = new i() { // from class: androidx.transition.o
            @Override // androidx.transition.m.i
            public final void a(m.h hVar, m mVar, boolean z9) {
                hVar.j(mVar, z9);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f14208b = new i() { // from class: androidx.transition.p
            @Override // androidx.transition.m.i
            public final void a(m.h hVar, m mVar, boolean z9) {
                hVar.e(mVar, z9);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f14209c = new i() { // from class: androidx.transition.q
            @Override // androidx.transition.m.i
            public final void a(m.h hVar, m mVar, boolean z9) {
                hVar.i(mVar);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f14210d = new i() { // from class: androidx.transition.r
            @Override // androidx.transition.m.i
            public final void a(m.h hVar, m mVar, boolean z9) {
                hVar.c(mVar);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final i f14211e = new i() { // from class: androidx.transition.s
            @Override // androidx.transition.m.i
            public final void a(m.h hVar, m mVar, boolean z9) {
                hVar.k(mVar);
            }
        };

        void a(h hVar, m mVar, boolean z9);
    }

    private static C1021a J() {
        C1021a c1021a = (C1021a) f14149f0.get();
        if (c1021a != null) {
            return c1021a;
        }
        C1021a c1021a2 = new C1021a();
        f14149f0.set(c1021a2);
        return c1021a2;
    }

    private static boolean W(z zVar, z zVar2, String str) {
        Object obj = zVar.f14230a.get(str);
        Object obj2 = zVar2.f14230a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void X(C1021a c1021a, C1021a c1021a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) sparseArray.valueAt(i10);
            if (view2 != null && V(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && V(view)) {
                z zVar = (z) c1021a.get(view2);
                z zVar2 = (z) c1021a2.get(view);
                if (zVar != null && zVar2 != null) {
                    this.f14159J.add(zVar);
                    this.f14160K.add(zVar2);
                    c1021a.remove(view2);
                    c1021a2.remove(view);
                }
            }
        }
    }

    private void Y(C1021a c1021a, C1021a c1021a2) {
        z zVar;
        for (int size = c1021a.size() - 1; size >= 0; size--) {
            View view = (View) c1021a.keyAt(size);
            if (view != null && V(view) && (zVar = (z) c1021a2.remove(view)) != null && V(zVar.f14231b)) {
                this.f14159J.add((z) c1021a.removeAt(size));
                this.f14160K.add(zVar);
            }
        }
    }

    private void Z(C1021a c1021a, C1021a c1021a2, androidx.collection.r rVar, androidx.collection.r rVar2) {
        View view;
        int iO = rVar.o();
        for (int i10 = 0; i10 < iO; i10++) {
            View view2 = (View) rVar.p(i10);
            if (view2 != null && V(view2) && (view = (View) rVar2.h(rVar.k(i10))) != null && V(view)) {
                z zVar = (z) c1021a.get(view2);
                z zVar2 = (z) c1021a2.get(view);
                if (zVar != null && zVar2 != null) {
                    this.f14159J.add(zVar);
                    this.f14160K.add(zVar2);
                    c1021a.remove(view2);
                    c1021a2.remove(view);
                }
            }
        }
    }

    private void a0(C1021a c1021a, C1021a c1021a2, C1021a c1021a3, C1021a c1021a4) {
        View view;
        int size = c1021a3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) c1021a3.valueAt(i10);
            if (view2 != null && V(view2) && (view = (View) c1021a4.get(c1021a3.keyAt(i10))) != null && V(view)) {
                z zVar = (z) c1021a.get(view2);
                z zVar2 = (z) c1021a2.get(view);
                if (zVar != null && zVar2 != null) {
                    this.f14159J.add(zVar);
                    this.f14160K.add(zVar2);
                    c1021a.remove(view2);
                    c1021a2.remove(view);
                }
            }
        }
    }

    private void b0(A a10, A a11) {
        C1021a c1021a = new C1021a(a10.f14036a);
        C1021a c1021a2 = new C1021a(a11.f14036a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f14158I;
            if (i10 >= iArr.length) {
                j(c1021a, c1021a2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                Y(c1021a, c1021a2);
            } else if (i11 == 2) {
                a0(c1021a, c1021a2, a10.f14039d, a11.f14039d);
            } else if (i11 == 3) {
                X(c1021a, c1021a2, a10.f14037b, a11.f14037b);
            } else if (i11 == 4) {
                Z(c1021a, c1021a2, a10.f14038c, a11.f14038c);
            }
            i10++;
        }
    }

    private void c0(m mVar, i iVar, boolean z9) {
        m mVar2 = this.f14168S;
        if (mVar2 != null) {
            mVar2.c0(mVar, iVar, z9);
        }
        ArrayList arrayList = this.f14169T;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f14169T.size();
        h[] hVarArr = this.f14161L;
        if (hVarArr == null) {
            hVarArr = new h[size];
        }
        this.f14161L = null;
        h[] hVarArr2 = (h[]) this.f14169T.toArray(hVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            iVar.a(hVarArr2[i10], mVar, z9);
            hVarArr2[i10] = null;
        }
        this.f14161L = hVarArr2;
    }

    private void j(C1021a c1021a, C1021a c1021a2) {
        for (int i10 = 0; i10 < c1021a.size(); i10++) {
            z zVar = (z) c1021a.valueAt(i10);
            if (V(zVar.f14231b)) {
                this.f14159J.add(zVar);
                this.f14160K.add(null);
            }
        }
        for (int i11 = 0; i11 < c1021a2.size(); i11++) {
            z zVar2 = (z) c1021a2.valueAt(i11);
            if (V(zVar2.f14231b)) {
                this.f14160K.add(zVar2);
                this.f14159J.add(null);
            }
        }
    }

    private static void k(A a10, View view, z zVar) {
        a10.f14036a.put(view, zVar);
        int id = view.getId();
        if (id >= 0) {
            if (a10.f14037b.indexOfKey(id) >= 0) {
                a10.f14037b.put(id, null);
            } else {
                a10.f14037b.put(id, view);
            }
        }
        String strC = androidx.core.view.H.C(view);
        if (strC != null) {
            if (a10.f14039d.containsKey(strC)) {
                a10.f14039d.put(strC, null);
            } else {
                a10.f14039d.put(strC, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (a10.f14038c.i(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    a10.f14038c.l(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) a10.f14038c.h(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    a10.f14038c.l(itemIdAtPosition, null);
                }
            }
        }
    }

    private void k0(Animator animator, C1021a c1021a) {
        if (animator != null) {
            animator.addListener(new b(c1021a));
            l(animator);
        }
    }

    private void n(View view, boolean z9) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f14186y;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f14187z;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f14150A;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((Class) this.f14150A.get(i10)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    z zVar = new z(view);
                    if (z9) {
                        p(zVar);
                    } else {
                        m(zVar);
                    }
                    zVar.f14232c.add(this);
                    o(zVar);
                    if (z9) {
                        k(this.f14155F, view, zVar);
                    } else {
                        k(this.f14156G, view, zVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f14152C;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f14153D;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f14154E;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (((Class) this.f14154E.get(i11)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                n(viewGroup.getChildAt(i12), z9);
                            }
                        }
                    }
                }
            }
        }
    }

    public Rect A() {
        e eVar = this.f14172W;
        if (eVar == null) {
            return null;
        }
        return eVar.a(this);
    }

    public e C() {
        return this.f14172W;
    }

    public TimeInterpolator D() {
        return this.f14181t;
    }

    z E(View view, boolean z9) {
        x xVar = this.f14157H;
        if (xVar != null) {
            return xVar.E(view, z9);
        }
        ArrayList arrayList = z9 ? this.f14159J : this.f14160K;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            z zVar = (z) arrayList.get(i10);
            if (zVar == null) {
                return null;
            }
            if (zVar.f14231b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (z) (z9 ? this.f14160K : this.f14159J).get(i10);
        }
        return null;
    }

    public String F() {
        return this.f14178q;
    }

    public AbstractC1172g G() {
        return this.f14174Y;
    }

    public v H() {
        return this.f14171V;
    }

    public final m I() {
        x xVar = this.f14157H;
        return xVar != null ? xVar.I() : this;
    }

    public long K() {
        return this.f14179r;
    }

    public List L() {
        return this.f14182u;
    }

    public List M() {
        return this.f14184w;
    }

    public List N() {
        return this.f14185x;
    }

    public List O() {
        return this.f14183v;
    }

    final long P() {
        return this.f14175Z;
    }

    public String[] Q() {
        return null;
    }

    public z R(View view, boolean z9) {
        x xVar = this.f14157H;
        if (xVar != null) {
            return xVar.R(view, z9);
        }
        return (z) (z9 ? this.f14155F : this.f14156G).f14036a.get(view);
    }

    boolean S() {
        return !this.f14163N.isEmpty();
    }

    public boolean T() {
        return false;
    }

    public boolean U(z zVar, z zVar2) {
        if (zVar != null && zVar2 != null) {
            String[] strArrQ = Q();
            if (strArrQ != null) {
                for (String str : strArrQ) {
                    if (W(zVar, zVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = zVar.f14230a.keySet().iterator();
                while (it.hasNext()) {
                    if (W(zVar, zVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean V(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f14186y;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f14187z;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f14150A;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f14150A.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f14151B != null && androidx.core.view.H.C(view) != null && this.f14151B.contains(androidx.core.view.H.C(view))) {
            return false;
        }
        if ((this.f14182u.size() == 0 && this.f14183v.size() == 0 && (((arrayList = this.f14185x) == null || arrayList.isEmpty()) && ((arrayList2 = this.f14184w) == null || arrayList2.isEmpty()))) || this.f14182u.contains(Integer.valueOf(id)) || this.f14183v.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f14184w;
        if (arrayList6 != null && arrayList6.contains(androidx.core.view.H.C(view))) {
            return true;
        }
        if (this.f14185x != null) {
            for (int i11 = 0; i11 < this.f14185x.size(); i11++) {
                if (((Class) this.f14185x.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected void cancel() {
        int size = this.f14163N.size();
        Animator[] animatorArr = (Animator[]) this.f14163N.toArray(this.f14164O);
        this.f14164O = f14146c0;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f14164O = animatorArr;
        d0(i.f14209c, false);
    }

    void d0(i iVar, boolean z9) {
        c0(this, iVar, z9);
    }

    public m e(h hVar) {
        if (this.f14169T == null) {
            this.f14169T = new ArrayList();
        }
        this.f14169T.add(hVar);
        return this;
    }

    public void e0(View view) {
        if (this.f14167R) {
            return;
        }
        int size = this.f14163N.size();
        Animator[] animatorArr = (Animator[]) this.f14163N.toArray(this.f14164O);
        this.f14164O = f14146c0;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f14164O = animatorArr;
        d0(i.f14210d, false);
        this.f14166Q = true;
    }

    void f0(ViewGroup viewGroup) {
        d dVar;
        this.f14159J = new ArrayList();
        this.f14160K = new ArrayList();
        b0(this.f14155F, this.f14156G);
        C1021a c1021aJ = J();
        int size = c1021aJ.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = (Animator) c1021aJ.keyAt(i10);
            if (animator != null && (dVar = (d) c1021aJ.get(animator)) != null && dVar.f14191a != null && windowId.equals(dVar.f14194d)) {
                z zVar = dVar.f14193c;
                View view = dVar.f14191a;
                z zVarR = R(view, true);
                z zVarE = E(view, true);
                if (zVarR == null && zVarE == null) {
                    zVarE = (z) this.f14156G.f14036a.get(view);
                }
                if ((zVarR != null || zVarE != null) && dVar.f14195e.U(zVar, zVarE)) {
                    m mVar = dVar.f14195e;
                    if (mVar.I().f14176a0 != null) {
                        animator.cancel();
                        mVar.f14163N.remove(animator);
                        c1021aJ.remove(animator);
                        if (mVar.f14163N.size() == 0) {
                            mVar.d0(i.f14209c, false);
                            if (!mVar.f14167R) {
                                mVar.f14167R = true;
                                mVar.d0(i.f14208b, false);
                            }
                        }
                    } else if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        c1021aJ.remove(animator);
                    }
                }
            }
        }
        v(viewGroup, this.f14155F, this.f14156G, this.f14159J, this.f14160K);
        if (this.f14176a0 == null) {
            l0();
            return;
        }
        g0();
        this.f14176a0.p();
        this.f14176a0.q();
    }

    void g0() {
        C1021a c1021aJ = J();
        this.f14175Z = 0L;
        for (int i10 = 0; i10 < this.f14170U.size(); i10++) {
            Animator animator = (Animator) this.f14170U.get(i10);
            d dVar = (d) c1021aJ.get(animator);
            if (animator != null && dVar != null) {
                if (y() >= 0) {
                    dVar.f14196f.setDuration(y());
                }
                if (K() >= 0) {
                    dVar.f14196f.setStartDelay(K() + dVar.f14196f.getStartDelay());
                }
                if (D() != null) {
                    dVar.f14196f.setInterpolator(D());
                }
                this.f14163N.add(animator);
                this.f14175Z = Math.max(this.f14175Z, f.a(animator));
            }
        }
        this.f14170U.clear();
    }

    public m h(int i10) {
        if (i10 != 0) {
            this.f14182u.add(Integer.valueOf(i10));
        }
        return this;
    }

    public m h0(h hVar) {
        m mVar;
        ArrayList arrayList = this.f14169T;
        if (arrayList != null) {
            if (!arrayList.remove(hVar) && (mVar = this.f14168S) != null) {
                mVar.h0(hVar);
            }
            if (this.f14169T.size() == 0) {
                this.f14169T = null;
            }
        }
        return this;
    }

    public m i(View view) {
        this.f14183v.add(view);
        return this;
    }

    public m i0(View view) {
        this.f14183v.remove(view);
        return this;
    }

    public void j0(View view) {
        if (this.f14166Q) {
            if (!this.f14167R) {
                int size = this.f14163N.size();
                Animator[] animatorArr = (Animator[]) this.f14163N.toArray(this.f14164O);
                this.f14164O = f14146c0;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f14164O = animatorArr;
                d0(i.f14211e, false);
            }
            this.f14166Q = false;
        }
    }

    protected void l(Animator animator) {
        if (animator == null) {
            x();
            return;
        }
        if (y() >= 0) {
            animator.setDuration(y());
        }
        if (K() >= 0) {
            animator.setStartDelay(K() + animator.getStartDelay());
        }
        if (D() != null) {
            animator.setInterpolator(D());
        }
        animator.addListener(new c());
        animator.start();
    }

    protected void l0() {
        t0();
        C1021a c1021aJ = J();
        for (Animator animator : this.f14170U) {
            if (c1021aJ.containsKey(animator)) {
                t0();
                k0(animator, c1021aJ);
            }
        }
        this.f14170U.clear();
        x();
    }

    public abstract void m(z zVar);

    void m0(long j9, long j10) {
        long jP = P();
        int i10 = 0;
        boolean z9 = j9 < j10;
        if ((j10 < 0 && j9 >= 0) || (j10 > jP && j9 <= jP)) {
            this.f14167R = false;
            d0(i.f14207a, z9);
        }
        int size = this.f14163N.size();
        Animator[] animatorArr = (Animator[]) this.f14163N.toArray(this.f14164O);
        this.f14164O = f14146c0;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            f.b(animator, Math.min(Math.max(0L, j9), f.a(animator)));
            i10++;
            jP = jP;
        }
        long j11 = jP;
        this.f14164O = animatorArr;
        if ((j9 <= j11 || j10 > j11) && (j9 >= 0 || j10 < 0)) {
            return;
        }
        if (j9 > j11) {
            this.f14167R = true;
        }
        d0(i.f14208b, z9);
    }

    public m n0(long j9) {
        this.f14180s = j9;
        return this;
    }

    void o(z zVar) {
        String[] strArrB;
        if (this.f14171V == null || zVar.f14230a.isEmpty() || (strArrB = this.f14171V.b()) == null) {
            return;
        }
        for (String str : strArrB) {
            if (!zVar.f14230a.containsKey(str)) {
                this.f14171V.a(zVar);
                return;
            }
        }
    }

    public void o0(e eVar) {
        this.f14172W = eVar;
    }

    public abstract void p(z zVar);

    public m p0(TimeInterpolator timeInterpolator) {
        this.f14181t = timeInterpolator;
        return this;
    }

    void q(ViewGroup viewGroup, boolean z9) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C1021a c1021a;
        r(z9);
        if ((this.f14182u.size() > 0 || this.f14183v.size() > 0) && (((arrayList = this.f14184w) == null || arrayList.isEmpty()) && ((arrayList2 = this.f14185x) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f14182u.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f14182u.get(i10)).intValue());
                if (viewFindViewById != null) {
                    z zVar = new z(viewFindViewById);
                    if (z9) {
                        p(zVar);
                    } else {
                        m(zVar);
                    }
                    zVar.f14232c.add(this);
                    o(zVar);
                    if (z9) {
                        k(this.f14155F, viewFindViewById, zVar);
                    } else {
                        k(this.f14156G, viewFindViewById, zVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f14183v.size(); i11++) {
                View view = (View) this.f14183v.get(i11);
                z zVar2 = new z(view);
                if (z9) {
                    p(zVar2);
                } else {
                    m(zVar2);
                }
                zVar2.f14232c.add(this);
                o(zVar2);
                if (z9) {
                    k(this.f14155F, view, zVar2);
                } else {
                    k(this.f14156G, view, zVar2);
                }
            }
        } else {
            n(viewGroup, z9);
        }
        if (z9 || (c1021a = this.f14173X) == null) {
            return;
        }
        int size = c1021a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add((View) this.f14155F.f14039d.remove((String) this.f14173X.keyAt(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f14155F.f14039d.put((String) this.f14173X.valueAt(i13), view2);
            }
        }
    }

    public void q0(AbstractC1172g abstractC1172g) {
        if (abstractC1172g == null) {
            this.f14174Y = f14148e0;
        } else {
            this.f14174Y = abstractC1172g;
        }
    }

    void r(boolean z9) {
        if (z9) {
            this.f14155F.f14036a.clear();
            this.f14155F.f14037b.clear();
            this.f14155F.f14038c.c();
        } else {
            this.f14156G.f14036a.clear();
            this.f14156G.f14037b.clear();
            this.f14156G.f14038c.c();
        }
    }

    public void r0(v vVar) {
        this.f14171V = vVar;
    }

    @Override // 
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f14170U = new ArrayList();
            mVar.f14155F = new A();
            mVar.f14156G = new A();
            mVar.f14159J = null;
            mVar.f14160K = null;
            mVar.f14176a0 = null;
            mVar.f14168S = this;
            mVar.f14169T = null;
            return mVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public m s0(long j9) {
        this.f14179r = j9;
        return this;
    }

    public Animator t(ViewGroup viewGroup, z zVar, z zVar2) {
        return null;
    }

    protected void t0() {
        if (this.f14165P == 0) {
            d0(i.f14207a, false);
            this.f14167R = false;
        }
        this.f14165P++;
    }

    public String toString() {
        return u0("");
    }

    String u0(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f14180s != -1) {
            sb.append("dur(");
            sb.append(this.f14180s);
            sb.append(") ");
        }
        if (this.f14179r != -1) {
            sb.append("dly(");
            sb.append(this.f14179r);
            sb.append(") ");
        }
        if (this.f14181t != null) {
            sb.append("interp(");
            sb.append(this.f14181t);
            sb.append(") ");
        }
        if (this.f14182u.size() > 0 || this.f14183v.size() > 0) {
            sb.append("tgts(");
            if (this.f14182u.size() > 0) {
                for (int i10 = 0; i10 < this.f14182u.size(); i10++) {
                    if (i10 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f14182u.get(i10));
                }
            }
            if (this.f14183v.size() > 0) {
                for (int i11 = 0; i11 < this.f14183v.size(); i11++) {
                    if (i11 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f14183v.get(i11));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    void v(ViewGroup viewGroup, A a10, A a11, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorT;
        Animator animator;
        int i10;
        boolean z9;
        int i11;
        View view;
        z zVar;
        Object obj;
        View view2;
        Animator animator2;
        C1021a c1021aJ = J();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z10 = I().f14176a0 != null;
        long jMin = Long.MAX_VALUE;
        int i12 = 0;
        while (i12 < size) {
            z zVar2 = (z) arrayList.get(i12);
            z zVar3 = (z) arrayList2.get(i12);
            if (zVar2 != null && !zVar2.f14232c.contains(this)) {
                zVar2 = null;
            }
            if (zVar3 != null && !zVar3.f14232c.contains(this)) {
                zVar3 = null;
            }
            if (!(zVar2 == null && zVar3 == null) && ((zVar2 == null || zVar3 == null || U(zVar2, zVar3)) && (animatorT = t(viewGroup, zVar2, zVar3)) != null)) {
                if (zVar3 != null) {
                    View view3 = zVar3.f14231b;
                    String[] strArrQ = Q();
                    if (strArrQ != null && strArrQ.length > 0) {
                        zVar = new z(view3);
                        i10 = size;
                        z9 = z10;
                        z zVar4 = (z) a11.f14036a.get(view3);
                        i11 = i12;
                        if (zVar4 != null) {
                            int i13 = 0;
                            while (i13 < strArrQ.length) {
                                Map map = zVar.f14230a;
                                int i14 = i13;
                                String str = strArrQ[i14];
                                map.put(str, zVar4.f14230a.get(str));
                                i13 = i14 + 1;
                                strArrQ = strArrQ;
                            }
                        }
                        int size2 = c1021aJ.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                view2 = view3;
                                animator2 = animatorT;
                                break;
                            }
                            d dVar = (d) c1021aJ.get((Animator) c1021aJ.keyAt(i15));
                            if (dVar.f14193c != null && dVar.f14191a == view3) {
                                view2 = view3;
                                if (dVar.f14192b.equals(F()) && dVar.f14193c.equals(zVar)) {
                                    animator2 = null;
                                    break;
                                }
                            } else {
                                view2 = view3;
                            }
                            i15++;
                            view3 = view2;
                        }
                    } else {
                        view2 = view3;
                        i10 = size;
                        z9 = z10;
                        i11 = i12;
                        animator2 = animatorT;
                        zVar = null;
                    }
                    animator = animator2;
                    view = view2;
                } else {
                    animator = animatorT;
                    i10 = size;
                    z9 = z10;
                    i11 = i12;
                    view = zVar2.f14231b;
                    zVar = null;
                }
                if (animator != null) {
                    v vVar = this.f14171V;
                    if (vVar != null) {
                        long jC = vVar.c(viewGroup, this, zVar2, zVar3);
                        sparseIntArray.put(this.f14170U.size(), (int) jC);
                        jMin = Math.min(jC, jMin);
                    }
                    long j9 = jMin;
                    View view4 = view;
                    z zVar5 = zVar;
                    Animator animator3 = animator;
                    d dVar2 = new d(view4, F(), this, viewGroup.getWindowId(), zVar5, animator3);
                    if (z9) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator3);
                        obj = animatorSet;
                    } else {
                        obj = animator3;
                    }
                    c1021aJ.put(obj, dVar2);
                    this.f14170U.add(obj);
                    jMin = j9;
                }
            } else {
                i10 = size;
                z9 = z10;
                i11 = i12;
            }
            i12 = i11 + 1;
            size = i10;
            z10 = z9;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                d dVar3 = (d) c1021aJ.get((Animator) this.f14170U.get(sparseIntArray.keyAt(i16)));
                dVar3.f14196f.setStartDelay((((long) sparseIntArray.valueAt(i16)) - jMin) + dVar3.f14196f.getStartDelay());
            }
        }
    }

    w w() {
        g gVar = new g();
        this.f14176a0 = gVar;
        e(gVar);
        return this.f14176a0;
    }

    protected void x() {
        int i10 = this.f14165P - 1;
        this.f14165P = i10;
        if (i10 == 0) {
            d0(i.f14208b, false);
            for (int i11 = 0; i11 < this.f14155F.f14038c.o(); i11++) {
                View view = (View) this.f14155F.f14038c.p(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f14156G.f14038c.o(); i12++) {
                View view2 = (View) this.f14156G.f14038c.p(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f14167R = true;
        }
    }

    public long y() {
        return this.f14180s;
    }
}

package androidx.compose.ui.platform;

import W.AbstractC0967i;
import W.C0975q;
import android.R;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.AbstractC1029i;
import androidx.collection.AbstractC1030j;
import androidx.collection.AbstractC1031k;
import androidx.collection.AbstractC1032l;
import androidx.collection.AbstractC1034n;
import androidx.collection.C1022b;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.core.view.C1069a;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1163x;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class r extends C1069a {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final d f11926b0 = new d(null);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f11927c0 = 8;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final AbstractC1029i f11928d0 = AbstractC1030j.a(C.g.f474a, C.g.f475b, C.g.f486m, C.g.f497x, C.g.f463A, C.g.f464B, C.g.f465C, C.g.f466D, C.g.f467E, C.g.f468F, C.g.f476c, C.g.f477d, C.g.f478e, C.g.f479f, C.g.f480g, C.g.f481h, C.g.f482i, C.g.f483j, C.g.f484k, C.g.f485l, C.g.f487n, C.g.f488o, C.g.f489p, C.g.f490q, C.g.f491r, C.g.f492s, C.g.f493t, C.g.f494u, C.g.f495v, C.g.f496w, C.g.f498y, C.g.f499z);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private e f11929A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f11930B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private C0.d f11931C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f11932D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final androidx.collection.x f11933E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final androidx.collection.x f11934F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private androidx.collection.Q f11935G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private androidx.collection.Q f11936H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f11937I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Integer f11938J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final C1022b f11939K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final H8.g f11940L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f11941M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private g f11942N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private AbstractC1031k f11943O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private androidx.collection.y f11944P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private androidx.collection.v f11945Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private androidx.collection.v f11946R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final String f11947S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final String f11948T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final p081i0.g f11949U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private androidx.collection.x f11950V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private h0 f11951W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f11952X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final Runnable f11953Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final List f11954Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final p219v8.l f11955a0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AndroidComposeView f11956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f11957r = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p219v8.l f11958s = new m();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AccessibilityManager f11959t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f11960u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f11961v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f11962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f11963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List f11964y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Handler f11965z;

    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager = r.this.f11959t;
            r rVar = r.this;
            accessibilityManager.addAccessibilityStateChangeListener(rVar.f11962w);
            accessibilityManager.addTouchExplorationStateChangeListener(rVar.f11963x);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.f11965z.removeCallbacks(r.this.f11953Y);
            AccessibilityManager accessibilityManager = r.this.f11959t;
            r rVar = r.this;
            accessibilityManager.removeAccessibilityStateChangeListener(rVar.f11962w);
            accessibilityManager.removeTouchExplorationStateChangeListener(rVar.f11963x);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f11967a = new b();

        private b() {
        }

        public static final void a(C0.d dVar, p011b0.j jVar) {
            p011b0.a aVar;
            if (!AbstractC1063u.h(jVar) || (aVar = (p011b0.a) p011b0.h.a(jVar.w(), p011b0.f.f14572a.u())) == null) {
                return;
            }
            dVar.b(new C0.d.a(R.id.accessibilityActionSetProgress, aVar.b()));
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f11968a = new c();

        private c() {
        }

        public static final void a(C0.d dVar, p011b0.j jVar) {
            if (AbstractC1063u.h(jVar)) {
                p011b0.g gVarW = jVar.w();
                p011b0.f fVar = p011b0.f.f14572a;
                p011b0.a aVar = (p011b0.a) p011b0.h.a(gVarW, fVar.p());
                if (aVar != null) {
                    dVar.b(new C0.d.a(R.id.accessibilityActionPageUp, aVar.b()));
                }
                p011b0.a aVar2 = (p011b0.a) p011b0.h.a(jVar.w(), fVar.m());
                if (aVar2 != null) {
                    dVar.b(new C0.d.a(R.id.accessibilityActionPageDown, aVar2.b()));
                }
                p011b0.a aVar3 = (p011b0.a) p011b0.h.a(jVar.w(), fVar.n());
                if (aVar3 != null) {
                    dVar.b(new C0.d.a(R.id.accessibilityActionPageLeft, aVar3.b()));
                }
                p011b0.a aVar4 = (p011b0.a) p011b0.h.a(jVar.w(), fVar.o());
                if (aVar4 != null) {
                    dVar.b(new C0.d.a(R.id.accessibilityActionPageRight, aVar4.b()));
                }
            }
        }
    }

    public static final class d {
        public /* synthetic */ d(AbstractC1457h abstractC1457h) {
            this();
        }

        private d() {
        }
    }

    private final class e extends C0.e {
        public e() {
        }

        @Override // C0.e
        public void a(int i10, C0.d dVar, String str, Bundle bundle) {
            r.this.x(i10, dVar, str, bundle);
        }

        @Override // C0.e
        public C0.d b(int i10) {
            C0.d dVarF = r.this.F(i10);
            r rVar = r.this;
            if (rVar.f11932D && i10 == rVar.f11930B) {
                rVar.f11931C = dVarF;
            }
            return dVarF;
        }

        @Override // C0.e
        public C0.d d(int i10) {
            return b(r.this.f11930B);
        }

        @Override // C0.e
        public boolean f(int i10, int i11, Bundle bundle) {
            return r.this.e0(i10, i11, bundle);
        }
    }

    private static final class f implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f11970a = new f();

        private f() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(p011b0.j jVar, p011b0.j jVar2) {
            H.i iVarJ = jVar.j();
            H.i iVarJ2 = jVar2.j();
            int iCompare = Float.compare(iVarJ.f(), iVarJ2.f());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Float.compare(iVarJ.i(), iVarJ2.i());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Float.compare(iVarJ.c(), iVarJ2.c());
            return iCompare3 != 0 ? iCompare3 : Float.compare(iVarJ.g(), iVarJ2.g());
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p011b0.j f11971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f11973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f11974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f11975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f11976f;

        public g(p011b0.j jVar, int i10, int i11, int i12, int i13, long j9) {
            this.f11971a = jVar;
            this.f11972b = i10;
            this.f11973c = i11;
            this.f11974d = i12;
            this.f11975e = i13;
            this.f11976f = j9;
        }

        public final int a() {
            return this.f11972b;
        }

        public final int b() {
            return this.f11974d;
        }

        public final int c() {
            return this.f11973c;
        }

        public final p011b0.j d() {
            return this.f11971a;
        }

        public final int e() {
            return this.f11975e;
        }

        public final long f() {
            return this.f11976f;
        }
    }

    private static final class h implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f11977a = new h();

        private h() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(p011b0.j jVar, p011b0.j jVar2) {
            H.i iVarJ = jVar.j();
            H.i iVarJ2 = jVar2.j();
            int iCompare = Float.compare(iVarJ2.g(), iVarJ.g());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Float.compare(iVarJ.i(), iVarJ2.i());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Float.compare(iVarJ.c(), iVarJ2.c());
            return iCompare3 != 0 ? iCompare3 : Float.compare(iVarJ2.f(), iVarJ.f());
        }
    }

    private static final class i implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f11978a = new i();

        private i() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(p079h8.o oVar, p079h8.o oVar2) {
            int iCompare = Float.compare(((H.i) oVar.c()).i(), ((H.i) oVar2.c()).i());
            return iCompare != 0 ? iCompare : Float.compare(((H.i) oVar.c()).c(), ((H.i) oVar2.c()).c());
        }
    }

    public /* synthetic */ class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11979a;

        static {
            int[] iArr = new int[p021c0.a.values().length];
            try {
                iArr[p021c0.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p021c0.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p021c0.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11979a = iArr;
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f11980q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f11981r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f11982s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f11983t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f11985v;

        k(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11983t = obj;
            this.f11985v |= Integer.MIN_VALUE;
            return r.this.z(this);
        }
    }

    static final class l extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final l f11986r = new l();

        l() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class m extends kotlin.jvm.internal.o implements p219v8.l {
        m() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean f(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(r.this.U().getParent().requestSendAccessibilityEvent(r.this.U(), accessibilityEvent));
        }
    }

    static final class n extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ g0 f11988r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ r f11989s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(g0 g0Var, r rVar) {
            super(0);
            this.f11988r = g0Var;
            this.f11989s = rVar;
        }

        public final void a() {
            p011b0.j jVarB;
            W.B bQ;
            this.f11988r.a();
            this.f11988r.e();
            this.f11988r.b();
            this.f11988r.c();
            if (0.0f == 0.0f && 0.0f == 0.0f) {
                return;
            }
            int iL0 = this.f11989s.l0(this.f11988r.d());
            i0 i0Var = (i0) this.f11989s.N().c(this.f11989s.f11930B);
            if (i0Var != null) {
                r rVar = this.f11989s;
                try {
                    C0.d dVar = rVar.f11931C;
                    if (dVar != null) {
                        dVar.d0(rVar.y(i0Var));
                        p079h8.A a10 = p079h8.A.f21846a;
                    }
                } catch (IllegalStateException unused) {
                    p079h8.A a11 = p079h8.A.f21846a;
                }
            }
            this.f11989s.U().invalidate();
            i0 i0Var2 = (i0) this.f11989s.N().c(iL0);
            if (i0Var2 == null || (jVarB = i0Var2.b()) == null || (bQ = jVarB.q()) == null) {
                return;
            }
            this.f11989s.b0(bQ);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    static final class o extends kotlin.jvm.internal.o implements p219v8.l {
        o() {
            super(1);
        }

        public final void a(g0 g0Var) {
            r.this.j0(g0Var);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((g0) obj);
            return p079h8.A.f21846a;
        }
    }

    static final class p extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final p f11991r = new p();

        p() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean f(W.B b10) {
            p011b0.g gVarY = b10.y();
            boolean z9 = false;
            if (gVarY != null && gVarY.q()) {
                z9 = true;
            }
            return Boolean.valueOf(z9);
        }
    }

    static final class q extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final q f11992r = new q();

        q() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean f(W.B b10) {
            return Boolean.valueOf(b10.V().q(W.W.a(8)));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.r$r, reason: collision with other inner class name */
    static final class C0377r extends kotlin.jvm.internal.o implements p219v8.p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final C0377r f11993r = new C0377r();

        /* JADX INFO: renamed from: androidx.compose.ui.platform.r$r$a */
        static final class a extends kotlin.jvm.internal.o implements p219v8.a {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final a f11994r = new a();

            a() {
                super(0);
            }

            @Override // p219v8.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.r$r$b */
        static final class b extends kotlin.jvm.internal.o implements p219v8.a {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final b f11995r = new b();

            b() {
                super(0);
            }

            @Override // p219v8.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        C0377r() {
            super(2);
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(p011b0.j jVar, p011b0.j jVar2) {
            p011b0.g gVarW = jVar.w();
            p011b0.m mVar = p011b0.m.f14629a;
            return Integer.valueOf(Float.compare(((Number) gVarW.n(mVar.E(), a.f11994r)).floatValue(), ((Number) jVar2.w().n(mVar.E(), b.f11995r)).floatValue()));
        }
    }

    public r(AndroidComposeView androidComposeView) {
        this.f11956q = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.n.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f11959t = accessibilityManager;
        this.f11961v = 100L;
        this.f11962w = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.o
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z9) {
                r.J(this.f11923a, z9);
            }
        };
        this.f11963x = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.p
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z9) {
                r.H0(this.f11924a, z9);
            }
        };
        this.f11964y = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f11965z = new Handler(Looper.getMainLooper());
        this.f11929A = new e();
        this.f11930B = Integer.MIN_VALUE;
        this.f11933E = new androidx.collection.x(0, 1, null);
        this.f11934F = new androidx.collection.x(0, 1, null);
        this.f11935G = new androidx.collection.Q(0, 1, null);
        this.f11936H = new androidx.collection.Q(0, 1, null);
        this.f11937I = -1;
        this.f11939K = new C1022b(0, 1, null);
        this.f11940L = H8.j.b(1, null, null, 6, null);
        this.f11941M = true;
        this.f11943O = AbstractC1032l.a();
        this.f11944P = new androidx.collection.y(0, 1, null);
        this.f11945Q = new androidx.collection.v(0, 1, null);
        this.f11946R = new androidx.collection.v(0, 1, null);
        this.f11947S = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f11948T = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f11949U = new p081i0.g();
        this.f11950V = AbstractC1032l.b();
        this.f11951W = new h0(androidComposeView.getSemanticsOwner().a(), AbstractC1032l.a());
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.f11953Y = new Runnable() { // from class: androidx.compose.ui.platform.q
            @Override // java.lang.Runnable
            public final void run() {
                r.k0(this.f11925q);
            }
        };
        this.f11954Z = new ArrayList();
        this.f11955a0 = new o();
    }

    private final void A0(p011b0.j jVar, C0.d dVar) {
        p031d0.a aVarQ = Q(jVar);
        dVar.M0(aVarQ != null ? G0(aVarQ) : null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0089 A[LOOP:0: B:15:0x0037->B:28:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008c A[EDGE_INSN: B:34:0x008c->B:29:0x008c BREAK  A[LOOP:0: B:15:0x0037->B:28:0x0089], SYNTHETIC] */
    private final boolean B(AbstractC1031k abstractC1031k, boolean z9, int i10, long j9) {
        p011b0.q qVarK;
        if (H.g.i(j9, H.g.f2287b.b()) || !H.g.n(j9)) {
            return false;
        }
        if (z9) {
            qVarK = p011b0.m.f14629a.F();
        } else {
            if (z9) {
                throw new p079h8.m();
            }
            qVarK = p011b0.m.f14629a.k();
        }
        Object[] objArr = abstractC1031k.f11332c;
        long[] jArr = abstractC1031k.f11330a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            i0 i0Var = (i0) objArr[(i11 << 3) + i13];
                            if (I.J.e(i0Var.a()).b(j9)) {
                                androidx.appcompat.app.o.a(p011b0.h.a(i0Var.b().w(), qVarK));
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return false;
    }

    private final void B0() {
        this.f11945Q.i();
        this.f11946R.i();
        i0 i0Var = (i0) N().c(-1);
        p011b0.j jVarB = i0Var != null ? i0Var.b() : null;
        kotlin.jvm.internal.n.e(jVarB);
        List listF0 = F0(AbstractC1063u.k(jVarB), AbstractC1444s.p(jVarB));
        int iM = AbstractC1444s.m(listF0);
        int i10 = 1;
        if (1 > iM) {
            return;
        }
        while (true) {
            int iO = ((p011b0.j) listF0.get(i10 - 1)).o();
            int iO2 = ((p011b0.j) listF0.get(i10)).o();
            this.f11945Q.q(iO, iO2);
            this.f11946R.q(iO2, iO);
            if (i10 == iM) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final void C() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (Y()) {
                m0(this.f11956q.getSemanticsOwner().a(), this.f11951W);
            }
            p079h8.A a10 = p079h8.A.f21846a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                s0(N());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    L0();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    private final List C0(boolean z9, ArrayList arrayList, androidx.collection.x xVar) {
        ArrayList arrayList2 = new ArrayList();
        int iM = AbstractC1444s.m(arrayList);
        int size = 0;
        if (iM >= 0) {
            int i10 = 0;
            while (true) {
                p011b0.j jVar = (p011b0.j) arrayList.get(i10);
                if (i10 == 0 || !E0(arrayList2, jVar)) {
                    arrayList2.add(new p079h8.o(jVar.j(), AbstractC1444s.p(jVar)));
                }
                if (i10 == iM) {
                    break;
                }
                i10++;
            }
        }
        AbstractC1444s.y(arrayList2, i.f11978a);
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            p079h8.o oVar = (p079h8.o) arrayList2.get(i11);
            AbstractC1444s.y((List) oVar.d(), new C1062t(new C1061s(z9 ? h.f11977a : f.f11970a, W.B.f8257Y.a())));
            arrayList3.addAll((Collection) oVar.d());
        }
        final C0377r c0377r = C0377r.f11993r;
        AbstractC1444s.y(arrayList3, new Comparator() { // from class: androidx.compose.ui.platform.n
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return r.D0(c0377r, obj, obj2);
            }
        });
        while (size <= AbstractC1444s.m(arrayList3)) {
            List list = (List) xVar.c(((p011b0.j) arrayList3.get(size)).o());
            if (list != null) {
                if (Z((p011b0.j) arrayList3.get(size))) {
                    size++;
                } else {
                    arrayList3.remove(size);
                }
                arrayList3.addAll(size, list);
                size += list.size();
            } else {
                size++;
            }
        }
        return arrayList3;
    }

    private final boolean D(int i10) {
        if (!W(i10)) {
            return false;
        }
        this.f11930B = Integer.MIN_VALUE;
        this.f11931C = null;
        this.f11956q.invalidate();
        p0(this, i10, ArrayPool.STANDARD_BUFFER_SIZE_BYTES, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int D0(p219v8.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private final AccessibilityEvent E(int i10, int i11) {
        i0 i0Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        accessibilityEventObtain.setPackageName(this.f11956q.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.f11956q, i10);
        if (Y() && (i0Var = (i0) N().c(i10)) != null) {
            accessibilityEventObtain.setPassword(i0Var.b().w().b(p011b0.m.f14629a.t()));
        }
        return accessibilityEventObtain;
    }

    private static final boolean E0(ArrayList arrayList, p011b0.j jVar) {
        float fI = jVar.j().i();
        float fC = jVar.j().c();
        boolean z9 = fI >= fC;
        int iM = AbstractC1444s.m(arrayList);
        if (iM >= 0) {
            int i10 = 0;
            while (true) {
                H.i iVar = (H.i) ((p079h8.o) arrayList.get(i10)).c();
                boolean z10 = iVar.i() >= iVar.c();
                if (!z9 && !z10 && Math.max(fI, iVar.i()) < Math.min(fC, iVar.c())) {
                    arrayList.set(i10, new p079h8.o(iVar.k(0.0f, fI, Float.POSITIVE_INFINITY, fC), ((p079h8.o) arrayList.get(i10)).d()));
                    ((List) ((p079h8.o) arrayList.get(i10)).d()).add(jVar);
                    return true;
                }
                if (i10 != iM) {
                    i10++;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final C0.d F(int i10) {
        InterfaceC1163x interfaceC1163xA;
        AbstractC1157q lifecycle;
        AndroidComposeView.b viewTreeOwners = this.f11956q.getViewTreeOwners();
        if (((viewTreeOwners == null || (interfaceC1163xA = viewTreeOwners.a()) == null || (lifecycle = interfaceC1163xA.getLifecycle()) == null) ? null : lifecycle.b()) == AbstractC1157q.b.DESTROYED) {
            return null;
        }
        C0.d dVarU = C0.d.U();
        i0 i0Var = (i0) N().c(i10);
        if (i0Var == null) {
            return null;
        }
        p011b0.j jVarB = i0Var.b();
        if (i10 == -1) {
            ViewParent parentForAccessibility = this.f11956q.getParentForAccessibility();
            dVarU.B0(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            p011b0.j jVarR = jVarB.r();
            Integer numValueOf = jVarR != null ? Integer.valueOf(jVarR.o()) : null;
            if (numValueOf == null) {
                T.a.c("semanticsNode " + i10 + " has null parent");
                throw new p079h8.f();
            }
            int iIntValue = numValueOf.intValue();
            dVarU.C0(this.f11956q, iIntValue != this.f11956q.getSemanticsOwner().a().o() ? iIntValue : -1);
        }
        dVarU.K0(this.f11956q, i10);
        dVarU.d0(y(i0Var));
        g0(i10, dVarU, jVarB);
        return dVarU;
    }

    private final List F0(boolean z9, List list) {
        androidx.collection.x xVarB = AbstractC1032l.b();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            K((p011b0.j) list.get(i10), arrayList, xVarB);
        }
        return C0(z9, arrayList, xVarB);
    }

    private final String G(p011b0.j jVar) {
        p011b0.g gVarN = jVar.a().n();
        p011b0.m mVar = p011b0.m.f14629a;
        Collection collection = (Collection) p011b0.h.a(gVarN, mVar.d());
        if (collection != null && !collection.isEmpty()) {
            return null;
        }
        Collection collection2 = (Collection) p011b0.h.a(gVarN, mVar.A());
        if (collection2 != null && !collection2.isEmpty()) {
            return null;
        }
        CharSequence charSequence = (CharSequence) p011b0.h.a(gVarN, mVar.g());
        if (charSequence == null || charSequence.length() == 0) {
            return this.f11956q.getContext().getResources().getString(C.h.f504e);
        }
        return null;
    }

    private final SpannableString G0(p031d0.a aVar) {
        return (SpannableString) J0(p081i0.a.b(aVar, this.f11956q.getDensity(), this.f11956q.getFontFamilyResolver(), this.f11949U), 100000);
    }

    private final AccessibilityEvent H(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventE = E(i10, 8192);
        if (num != null) {
            accessibilityEventE.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventE.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventE.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventE.getText().add(charSequence);
        }
        return accessibilityEventE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(r rVar, boolean z9) {
        rVar.f11964y = rVar.f11959t.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean I0(p011b0.j jVar, int i10, boolean z9, boolean z10) {
        int iM;
        int i11;
        int iO = jVar.o();
        Integer num = this.f11938J;
        if (num == null || iO != num.intValue()) {
            this.f11937I = -1;
            this.f11938J = Integer.valueOf(jVar.o());
        }
        String strR = R(jVar);
        boolean z11 = false;
        if (strR != null && strR.length() != 0) {
            InterfaceC1045d interfaceC1045dS = S(jVar, i10);
            if (interfaceC1045dS == null) {
                return false;
            }
            int iL = L(jVar);
            if (iL == -1) {
                iL = z9 ? 0 : strR.length();
            }
            int[] iArrA = z9 ? interfaceC1045dS.a(iL) : interfaceC1045dS.b(iL);
            if (iArrA == null) {
                return false;
            }
            int i12 = iArrA[0];
            z11 = true;
            int i13 = iArrA[1];
            if (z10 && X(jVar)) {
                iM = M(jVar);
                if (iM == -1) {
                    iM = z9 ? i12 : i13;
                }
                i11 = z9 ? i13 : i12;
            } else {
                iM = z9 ? i13 : i12;
                i11 = iM;
            }
            this.f11942N = new g(jVar, z9 ? 256 : Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING, i10, i12, i13, SystemClock.uptimeMillis());
            v0(jVar, iM, i11, true);
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(r rVar, boolean z9) {
        rVar.f11964y = z9 ? rVar.f11959t.getEnabledAccessibilityServiceList(-1) : AbstractC1444s.l();
    }

    private final CharSequence J0(CharSequence charSequence, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= i10) {
            return charSequence;
        }
        int i11 = i10 - 1;
        if (Character.isHighSurrogate(charSequence.charAt(i11)) && Character.isLowSurrogate(charSequence.charAt(i10))) {
            i10 = i11;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i10);
        kotlin.jvm.internal.n.f(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return charSequenceSubSequence;
    }

    private final void K(p011b0.j jVar, ArrayList arrayList, androidx.collection.x xVar) {
        boolean zK = AbstractC1063u.k(jVar);
        boolean zBooleanValue = ((Boolean) jVar.w().n(p011b0.m.f14629a.p(), l.f11986r)).booleanValue();
        if ((zBooleanValue || Z(jVar)) && N().b(jVar.o())) {
            arrayList.add(jVar);
        }
        if (zBooleanValue) {
            xVar.s(jVar.o(), F0(zK, AbstractC1444s.u0(jVar.k())));
            return;
        }
        List listK = jVar.k();
        int size = listK.size();
        for (int i10 = 0; i10 < size; i10++) {
            K((p011b0.j) listK.get(i10), arrayList, xVar);
        }
    }

    private final void K0(int i10) {
        int i11 = this.f11957r;
        if (i11 == i10) {
            return;
        }
        this.f11957r = i10;
        p0(this, i10, Optimizer.OPTIMIZATION_GRAPH_WRAP, null, null, 12, null);
        p0(this, i11, 256, null, null, 12, null);
    }

    private final int L(p011b0.j jVar) {
        p011b0.g gVarW = jVar.w();
        p011b0.m mVar = p011b0.m.f14629a;
        return (gVarW.b(mVar.d()) || !jVar.w().b(mVar.B())) ? this.f11937I : p031d0.n.g(((p031d0.n) jVar.w().m(mVar.B())).m());
    }

    /* JADX WARN: Code duplicated, block: B:53:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0150 A[LOOP:2: B:39:0x00da->B:54:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0159 A[EDGE_INSN: B:64:0x0159->B:55:0x0159 BREAK  A[LOOP:2: B:39:0x00da->B:54:0x0150], SYNTHETIC] */
    private final void L0() {
        long j9;
        long j10;
        long j11;
        long j12;
        p011b0.g gVarB;
        androidx.collection.y yVar = new androidx.collection.y(0, 1, null);
        androidx.collection.y yVar2 = this.f11944P;
        int[] iArr = yVar2.f11337b;
        long[] jArr = yVar2.f11336a;
        int length = jArr.length - 2;
        long j13 = 128;
        long j14 = 255;
        char c10 = 7;
        long j15 = -9187201950435737472L;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j16 = jArr[i10];
                int[] iArr2 = iArr;
                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j16 & j14) < j13) {
                            j11 = j13;
                            int i13 = iArr2[(i10 << 3) + i12];
                            i0 i0Var = (i0) N().c(i13);
                            p011b0.j jVarB = i0Var != null ? i0Var.b() : null;
                            if (jVarB != null) {
                                j12 = j14;
                                if (!jVarB.w().b(p011b0.m.f14629a.s())) {
                                }
                            } else {
                                j12 = j14;
                            }
                            yVar.f(i13);
                            h0 h0Var = (h0) this.f11950V.c(i13);
                            q0(i13, 32, (h0Var == null || (gVarB = h0Var.b()) == null) ? null : (String) p011b0.h.a(gVarB, p011b0.m.f14629a.s()));
                        } else {
                            j11 = j13;
                            j12 = j14;
                        }
                        j16 >>= 8;
                        i12++;
                        j13 = j11;
                        j14 = j12;
                    }
                    j9 = j13;
                    j10 = j14;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    j9 = j13;
                    j10 = j14;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                iArr = iArr2;
                j13 = j9;
                j14 = j10;
            }
        } else {
            j9 = 128;
            j10 = 255;
        }
        this.f11944P.r(yVar);
        this.f11950V.i();
        AbstractC1031k abstractC1031kN = N();
        int[] iArr3 = abstractC1031kN.f11331b;
        Object[] objArr = abstractC1031kN.f11332c;
        long[] jArr2 = abstractC1031kN.f11330a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                long j17 = jArr2[i14];
                if ((((~j17) << c10) & j17 & j15) != j15) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j17 & j10) < j9) {
                            int i17 = (i14 << 3) + i16;
                            int i18 = iArr3[i17];
                            i0 i0Var2 = (i0) objArr[i17];
                            p011b0.g gVarW = i0Var2.b().w();
                            p011b0.m mVar = p011b0.m.f14629a;
                            if (gVarW.b(mVar.s()) && this.f11944P.f(i18)) {
                                q0(i18, 16, (String) i0Var2.b().w().m(mVar.s()));
                            }
                            this.f11950V.s(i18, new h0(i0Var2.b(), N()));
                        }
                        j17 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                    if (i14 != length2) {
                        break;
                    }
                    i14++;
                    c10 = 7;
                    j15 = -9187201950435737472L;
                } else if (i14 != length2) {
                    break;
                    break;
                } else {
                    i14++;
                    c10 = 7;
                    j15 = -9187201950435737472L;
                }
            }
        }
        this.f11951W = new h0(this.f11956q.getSemanticsOwner().a(), N());
    }

    private final int M(p011b0.j jVar) {
        p011b0.g gVarW = jVar.w();
        p011b0.m mVar = p011b0.m.f14629a;
        return (gVarW.b(mVar.d()) || !jVar.w().b(mVar.B())) ? this.f11937I : p031d0.n.j(((p031d0.n) jVar.w().m(mVar.B())).m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC1031k N() {
        if (this.f11941M) {
            this.f11941M = false;
            this.f11943O = j0.b(this.f11956q.getSemanticsOwner());
            if (Y()) {
                B0();
            }
        }
        return this.f11943O;
    }

    private final boolean O(p011b0.j jVar) {
        p011b0.g gVarW = jVar.w();
        p011b0.m mVar = p011b0.m.f14629a;
        p021c0.a aVar = (p021c0.a) p011b0.h.a(gVarW, mVar.D());
        p011b0.d dVar = (p011b0.d) p011b0.h.a(jVar.w(), mVar.v());
        boolean z9 = aVar != null;
        if (((Boolean) p011b0.h.a(jVar.w(), mVar.x())) != null) {
            if (!(dVar != null ? p011b0.d.k(dVar.n(), p011b0.d.f14558b.g()) : false)) {
                return true;
            }
        }
        return z9;
    }

    private final String P(p011b0.j jVar) {
        p011b0.g gVarW = jVar.w();
        p011b0.m mVar = p011b0.m.f14629a;
        Object objA = p011b0.h.a(gVarW, mVar.y());
        p021c0.a aVar = (p021c0.a) p011b0.h.a(jVar.w(), mVar.D());
        p011b0.d dVar = (p011b0.d) p011b0.h.a(jVar.w(), mVar.v());
        int iM = 0;
        if (aVar != null) {
            int i10 = j.f11979a[aVar.ordinal()];
            if (i10 == 1) {
                if ((dVar == null ? false : p011b0.d.k(dVar.n(), p011b0.d.f14558b.f())) && objA == null) {
                    objA = this.f11956q.getContext().getResources().getString(C.h.f506g);
                }
            } else if (i10 == 2) {
                if ((dVar == null ? false : p011b0.d.k(dVar.n(), p011b0.d.f14558b.f())) && objA == null) {
                    objA = this.f11956q.getContext().getResources().getString(C.h.f505f);
                }
            } else if (i10 == 3 && objA == null) {
                objA = this.f11956q.getContext().getResources().getString(C.h.f501b);
            }
        }
        Boolean bool = (Boolean) p011b0.h.a(jVar.w(), mVar.x());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(dVar == null ? false : p011b0.d.k(dVar.n(), p011b0.d.f14558b.g())) && objA == null) {
                objA = zBooleanValue ? this.f11956q.getContext().getResources().getString(C.h.f503d) : this.f11956q.getContext().getResources().getString(C.h.f502c);
            }
        }
        p011b0.c cVar = (p011b0.c) p011b0.h.a(jVar.w(), mVar.u());
        if (cVar != null) {
            if (cVar != p011b0.c.f14553d.a()) {
                if (objA == null) {
                    B8.b bVarC = cVar.c();
                    float fB = ((((Number) bVarC.f()).floatValue() - ((Number) bVarC.a()).floatValue()) > 0.0f ? 1 : ((((Number) bVarC.f()).floatValue() - ((Number) bVarC.a()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (cVar.b() - ((Number) bVarC.a()).floatValue()) / (((Number) bVarC.f()).floatValue() - ((Number) bVarC.a()).floatValue());
                    if (fB < 0.0f) {
                        fB = 0.0f;
                    }
                    if (fB > 1.0f) {
                        fB = 1.0f;
                    }
                    if (!(fB == 0.0f)) {
                        iM = (fB == 1.0f ? 1 : 0) != 0 ? 100 : B8.h.m(Math.round(fB * 100), 1, 99);
                    }
                    objA = this.f11956q.getContext().getResources().getString(C.h.f509j, Integer.valueOf(iM));
                }
            } else if (objA == null) {
                objA = this.f11956q.getContext().getResources().getString(C.h.f500a);
            }
        }
        if (jVar.w().b(mVar.g())) {
            objA = G(jVar);
        }
        return (String) objA;
    }

    private final p031d0.a Q(p011b0.j jVar) {
        p031d0.a aVarT = T(jVar.w());
        List list = (List) p011b0.h.a(jVar.w(), p011b0.m.f14629a.A());
        return aVarT == null ? list != null ? (p031d0.a) AbstractC1444s.U(list) : null : aVarT;
    }

    private final String R(p011b0.j jVar) {
        p031d0.a aVar;
        if (jVar == null) {
            return null;
        }
        p011b0.g gVarW = jVar.w();
        p011b0.m mVar = p011b0.m.f14629a;
        if (gVarW.b(mVar.d())) {
            return p131n0.a.d((List) jVar.w().m(mVar.d()), ",", null, null, 0, null, null, 62, null);
        }
        if (jVar.w().b(mVar.g())) {
            p031d0.a aVarT = T(jVar.w());
            if (aVarT != null) {
                return aVarT.h();
            }
            return null;
        }
        List list = (List) p011b0.h.a(jVar.w(), mVar.A());
        if (list == null || (aVar = (p031d0.a) AbstractC1444s.U(list)) == null) {
            return null;
        }
        return aVar.h();
    }

    private final InterfaceC1045d S(p011b0.j jVar, int i10) {
        String strR;
        if (jVar == null || (strR = R(jVar)) == null || strR.length() == 0) {
            return null;
        }
        if (i10 == 1) {
            C1041b c1041bA = C1041b.f11849d.a(this.f11956q.getContext().getResources().getConfiguration().locale);
            c1041bA.e(strR);
            return c1041bA;
        }
        if (i10 == 2) {
            C1047e c1047eA = C1047e.f11878d.a(this.f11956q.getContext().getResources().getConfiguration().locale);
            c1047eA.e(strR);
            return c1047eA;
        }
        if (i10 != 4) {
            if (i10 == 8) {
                C1043c c1043cA = C1043c.f11854c.a();
                c1043cA.e(strR);
                return c1043cA;
            }
            if (i10 != 16) {
                return null;
            }
        }
        if (!jVar.w().b(p011b0.f.f14572a.i())) {
            return null;
        }
        j0.e(jVar.w());
        return null;
    }

    private final p031d0.a T(p011b0.g gVar) {
        return (p031d0.a) p011b0.h.a(gVar, p011b0.m.f14629a.g());
    }

    private final boolean W(int i10) {
        return this.f11930B == i10;
    }

    private final boolean X(p011b0.j jVar) {
        p011b0.g gVarW = jVar.w();
        p011b0.m mVar = p011b0.m.f14629a;
        return !gVarW.b(mVar.d()) && jVar.w().b(mVar.g());
    }

    private final boolean Z(p011b0.j jVar) {
        List list = (List) p011b0.h.a(jVar.w(), p011b0.m.f14629a.d());
        return j0.g(jVar) && (jVar.w().q() || (jVar.A() && ((list != null ? (String) AbstractC1444s.U(list) : null) != null || Q(jVar) != null || P(jVar) != null || O(jVar))));
    }

    private final boolean a0() {
        if (this.f11960u) {
            return true;
        }
        return this.f11959t.isEnabled() && this.f11959t.isTouchExplorationEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(W.B b10) {
        if (this.f11939K.add(b10)) {
            this.f11940L.p(p079h8.A.f21846a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x018a -> B:95:0x018b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:95:0x018b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final boolean e0(int r12, int r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 1498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.e0(int, int, android.os.Bundle):boolean");
    }

    private static final float f0(float f10, float f11) {
        if (Math.signum(f10) == Math.signum(f11)) {
            return Math.abs(f10) < Math.abs(f11) ? f10 : f11;
        }
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0304  */
    private final void g0(int i10, C0.d dVar, p011b0.j jVar) {
        View viewH;
        boolean z9;
        boolean zBooleanValue;
        boolean z10 = true;
        dVar.g0("android.view.View");
        p011b0.g gVarW = jVar.w();
        p011b0.m mVar = p011b0.m.f14629a;
        if (gVarW.b(mVar.g())) {
            dVar.g0("android.widget.EditText");
        }
        if (jVar.w().b(mVar.A())) {
            dVar.g0("android.widget.TextView");
        }
        p011b0.d dVar2 = (p011b0.d) p011b0.h.a(jVar.w(), mVar.v());
        if (dVar2 != null) {
            dVar2.n();
            if (jVar.x() || jVar.t().isEmpty()) {
                b0.d.a aVar = p011b0.d.f14558b;
                if (p011b0.d.k(dVar2.n(), aVar.g())) {
                    dVar.F0(this.f11956q.getContext().getResources().getString(C.h.f508i));
                } else if (p011b0.d.k(dVar2.n(), aVar.f())) {
                    dVar.F0(this.f11956q.getContext().getResources().getString(C.h.f507h));
                } else {
                    String strI = j0.i(dVar2.n());
                    if (!p011b0.d.k(dVar2.n(), aVar.d()) || jVar.A() || jVar.w().q()) {
                        dVar.g0(strI);
                    }
                }
            }
            p079h8.A a10 = p079h8.A.f21846a;
        }
        dVar.z0(this.f11956q.getContext().getPackageName());
        dVar.u0(j0.f(jVar));
        List listT = jVar.t();
        int size = listT.size();
        for (int i11 = 0; i11 < size; i11++) {
            p011b0.j jVar2 = (p011b0.j) listT.get(i11);
            if (N().a(jVar2.o())) {
                AndroidViewHolder androidViewHolder = this.f11956q.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(jVar2.q());
                if (jVar2.o() != -1) {
                    if (androidViewHolder != null) {
                        dVar.c(androidViewHolder);
                    } else {
                        dVar.d(this.f11956q, jVar2.o());
                    }
                }
            }
        }
        if (i10 == this.f11930B) {
            dVar.a0(true);
            dVar.b(C0.d.a.f546l);
        } else {
            dVar.a0(false);
            dVar.b(C0.d.a.f545k);
        }
        A0(jVar, dVar);
        w0(jVar, dVar);
        z0(jVar, dVar);
        x0(jVar, dVar);
        p011b0.g gVarW2 = jVar.w();
        p011b0.m mVar2 = p011b0.m.f14629a;
        p021c0.a aVar2 = (p021c0.a) p011b0.h.a(gVarW2, mVar2.D());
        if (aVar2 != null) {
            if (aVar2 == p021c0.a.On) {
                dVar.f0(true);
            } else if (aVar2 == p021c0.a.Off) {
                dVar.f0(false);
            }
            p079h8.A a11 = p079h8.A.f21846a;
        }
        Boolean bool = (Boolean) p011b0.h.a(jVar.w(), mVar2.x());
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            if (dVar2 == null ? false : p011b0.d.k(dVar2.n(), p011b0.d.f14558b.g())) {
                dVar.I0(zBooleanValue2);
            } else {
                dVar.f0(zBooleanValue2);
            }
            p079h8.A a12 = p079h8.A.f21846a;
        }
        if (!jVar.w().q() || jVar.t().isEmpty()) {
            List list = (List) p011b0.h.a(jVar.w(), mVar2.d());
            dVar.k0(list != null ? (String) AbstractC1444s.U(list) : null);
        }
        String str = (String) p011b0.h.a(jVar.w(), mVar2.z());
        if (str != null) {
            p011b0.j jVarR = jVar;
            while (true) {
                if (jVarR == null) {
                    zBooleanValue = false;
                    break;
                }
                p011b0.g gVarW3 = jVarR.w();
                p011b0.n nVar = p011b0.n.f14666a;
                if (gVarW3.b(nVar.a())) {
                    zBooleanValue = ((Boolean) jVarR.w().m(nVar.a())).booleanValue();
                    break;
                }
                jVarR = jVarR.r();
            }
            if (zBooleanValue) {
                dVar.R0(str);
            }
        }
        p011b0.g gVarW4 = jVar.w();
        p011b0.m mVar3 = p011b0.m.f14629a;
        if (((p079h8.A) p011b0.h.a(gVarW4, mVar3.j())) != null) {
            dVar.s0(true);
            p079h8.A a13 = p079h8.A.f21846a;
        }
        dVar.D0(jVar.w().b(mVar3.t()));
        dVar.n0(jVar.w().b(mVar3.n()));
        Integer num = (Integer) p011b0.h.a(jVar.w(), mVar3.r());
        dVar.x0(num != null ? num.intValue() : -1);
        dVar.o0(AbstractC1063u.h(jVar));
        dVar.q0(jVar.w().b(mVar3.i()));
        if (dVar.J()) {
            dVar.r0(((Boolean) jVar.w().m(mVar3.i())).booleanValue());
            if (dVar.K()) {
                dVar.a(2);
            } else {
                dVar.a(1);
            }
        }
        dVar.S0(j0.g(jVar));
        androidx.appcompat.app.o.a(p011b0.h.a(jVar.w(), mVar3.q()));
        dVar.h0(false);
        p011b0.g gVarW5 = jVar.w();
        p011b0.f fVar = p011b0.f.f14572a;
        p011b0.a aVar3 = (p011b0.a) p011b0.h.a(gVarW5, fVar.j());
        if (aVar3 != null) {
            boolean zD = kotlin.jvm.internal.n.d(p011b0.h.a(jVar.w(), mVar3.x()), Boolean.TRUE);
            b0.d.a aVar4 = p011b0.d.f14558b;
            if (dVar2 == null ? false : p011b0.d.k(dVar2.n(), aVar4.g())) {
                z9 = true;
            } else if (dVar2 == null ? false : p011b0.d.k(dVar2.n(), aVar4.e())) {
                z9 = true;
            } else {
                z9 = false;
            }
            dVar.h0(!z9 || (z9 && !zD));
            if (AbstractC1063u.h(jVar) && dVar.G()) {
                dVar.b(new C0.d.a(16, aVar3.b()));
            }
            p079h8.A a14 = p079h8.A.f21846a;
        }
        dVar.w0(false);
        p011b0.a aVar5 = (p011b0.a) p011b0.h.a(jVar.w(), fVar.l());
        if (aVar5 != null) {
            dVar.w0(true);
            if (AbstractC1063u.h(jVar)) {
                dVar.b(new C0.d.a(32, aVar5.b()));
            }
            p079h8.A a15 = p079h8.A.f21846a;
        }
        p011b0.a aVar6 = (p011b0.a) p011b0.h.a(jVar.w(), fVar.c());
        if (aVar6 != null) {
            dVar.b(new C0.d.a(16384, aVar6.b()));
            p079h8.A a16 = p079h8.A.f21846a;
        }
        if (AbstractC1063u.h(jVar)) {
            p011b0.a aVar7 = (p011b0.a) p011b0.h.a(jVar.w(), fVar.w());
            if (aVar7 != null) {
                dVar.b(new C0.d.a(2097152, aVar7.b()));
                p079h8.A a17 = p079h8.A.f21846a;
            }
            p011b0.a aVar8 = (p011b0.a) p011b0.h.a(jVar.w(), fVar.k());
            if (aVar8 != null) {
                dVar.b(new C0.d.a(R.id.accessibilityActionImeEnter, aVar8.b()));
                p079h8.A a18 = p079h8.A.f21846a;
            }
            p011b0.a aVar9 = (p011b0.a) p011b0.h.a(jVar.w(), fVar.e());
            if (aVar9 != null) {
                dVar.b(new C0.d.a(ArrayPool.STANDARD_BUFFER_SIZE_BYTES, aVar9.b()));
                p079h8.A a19 = p079h8.A.f21846a;
            }
            p011b0.a aVar10 = (p011b0.a) p011b0.h.a(jVar.w(), fVar.q());
            if (aVar10 != null) {
                if (dVar.K() && this.f11956q.getClipboardManager().a()) {
                    dVar.b(new C0.d.a(32768, aVar10.b()));
                }
                p079h8.A a20 = p079h8.A.f21846a;
            }
        }
        String strR = R(jVar);
        if (!(strR == null || strR.length() == 0)) {
            dVar.N0(M(jVar), L(jVar));
            p011b0.a aVar11 = (p011b0.a) p011b0.h.a(jVar.w(), fVar.v());
            dVar.b(new C0.d.a(131072, aVar11 != null ? aVar11.b() : null));
            dVar.a(256);
            dVar.a(Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING);
            dVar.y0(11);
            List list2 = (List) p011b0.h.a(jVar.w(), mVar3.d());
            if ((list2 == null || list2.isEmpty()) && jVar.w().b(fVar.i()) && !AbstractC1063u.i(jVar)) {
                dVar.y0(dVar.v() | 20);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("androidx.compose.ui.semantics.id");
        CharSequence charSequenceY = dVar.y();
        if (!(charSequenceY == null || charSequenceY.length() == 0) && jVar.w().b(fVar.i())) {
            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
        }
        if (jVar.w().b(mVar3.z())) {
            arrayList.add("androidx.compose.ui.semantics.testTag");
        }
        dVar.b0(arrayList);
        p011b0.c cVar = (p011b0.c) p011b0.h.a(jVar.w(), mVar3.u());
        if (cVar != null) {
            if (jVar.w().b(fVar.u())) {
                dVar.g0("android.widget.SeekBar");
            } else {
                dVar.g0("android.widget.ProgressBar");
            }
            if (cVar != p011b0.c.f14553d.a()) {
                dVar.E0(C0.d.g.a(1, ((Number) cVar.c().a()).floatValue(), ((Number) cVar.c().f()).floatValue(), cVar.b()));
            }
            if (jVar.w().b(fVar.u()) && AbstractC1063u.h(jVar)) {
                if (cVar.b() < B8.h.e(((Number) cVar.c().f()).floatValue(), ((Number) cVar.c().a()).floatValue())) {
                    dVar.b(C0.d.a.f551q);
                }
                if (cVar.b() > B8.h.h(((Number) cVar.c().a()).floatValue(), ((Number) cVar.c().f()).floatValue())) {
                    dVar.b(C0.d.a.f552r);
                }
            }
        }
        b.a(dVar, jVar);
        X.a.b(jVar, dVar);
        X.a.c(jVar, dVar);
        androidx.appcompat.app.o.a(p011b0.h.a(jVar.w(), mVar3.k()));
        androidx.appcompat.app.o.a(p011b0.h.a(jVar.w(), mVar3.F()));
        c.a(dVar, jVar);
        dVar.A0((CharSequence) p011b0.h.a(jVar.w(), mVar3.s()));
        if (AbstractC1063u.h(jVar)) {
            p011b0.a aVar12 = (p011b0.a) p011b0.h.a(jVar.w(), fVar.g());
            if (aVar12 != null) {
                dVar.b(new C0.d.a(262144, aVar12.b()));
                p079h8.A a21 = p079h8.A.f21846a;
            }
            p011b0.a aVar13 = (p011b0.a) p011b0.h.a(jVar.w(), fVar.b());
            if (aVar13 != null) {
                dVar.b(new C0.d.a(524288, aVar13.b()));
                p079h8.A a22 = p079h8.A.f21846a;
            }
            p011b0.a aVar14 = (p011b0.a) p011b0.h.a(jVar.w(), fVar.f());
            if (aVar14 != null) {
                dVar.b(new C0.d.a(1048576, aVar14.b()));
                p079h8.A a23 = p079h8.A.f21846a;
            }
            if (jVar.w().b(fVar.d())) {
                List list3 = (List) jVar.w().m(fVar.d());
                int size2 = list3.size();
                AbstractC1029i abstractC1029i = f11928d0;
                if (size2 >= abstractC1029i.b()) {
                    throw new IllegalStateException("Can't have more than " + abstractC1029i.b() + " custom actions for one widget");
                }
                androidx.collection.Q q9 = new androidx.collection.Q(0, 1, null);
                androidx.collection.C cB = androidx.collection.I.b();
                if (this.f11936H.h(i10)) {
                    androidx.collection.C c10 = (androidx.collection.C) this.f11936H.i(i10);
                    androidx.collection.w wVar = new androidx.collection.w(0, 1, null);
                    int[] iArr = abstractC1029i.f11327a;
                    int i12 = abstractC1029i.f11328b;
                    int i13 = 0;
                    while (i13 < i12) {
                        wVar.e(iArr[i13]);
                        i13++;
                        z10 = z10;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (list3.size() > 0) {
                        androidx.appcompat.app.o.a(list3.get(0));
                        kotlin.jvm.internal.n.e(c10);
                        throw null;
                    }
                    if (arrayList2.size() > 0) {
                        androidx.appcompat.app.o.a(arrayList2.get(0));
                        wVar.a(0);
                        throw null;
                    }
                } else if (list3.size() > 0) {
                    androidx.appcompat.app.o.a(list3.get(0));
                    abstractC1029i.a(0);
                    throw null;
                }
                this.f11935G.m(i10, q9);
                this.f11936H.m(i10, cB);
            }
        }
        dVar.G0(Z(jVar));
        int iE = this.f11945Q.e(i10, -1);
        if (iE != -1) {
            View viewH2 = j0.h(this.f11956q.getAndroidViewsHandler$ui_release(), iE);
            if (viewH2 != null) {
                dVar.P0(viewH2);
            } else {
                dVar.Q0(this.f11956q, iE);
            }
            x(i10, dVar, this.f11947S, null);
        }
        int iE2 = this.f11946R.e(i10, -1);
        if (iE2 == -1 || (viewH = j0.h(this.f11956q.getAndroidViewsHandler$ui_release(), iE2)) == null) {
            return;
        }
        dVar.O0(viewH);
        x(i10, dVar, this.f11948T, null);
    }

    private final boolean h0(int i10, List list) {
        boolean z9;
        g0 g0VarA = j0.a(list, i10);
        if (g0VarA != null) {
            z9 = false;
        } else {
            g0 g0Var = new g0(i10, this.f11954Z, null, null, null, null);
            z9 = true;
            g0VarA = g0Var;
        }
        this.f11954Z.add(g0VarA);
        return z9;
    }

    private final boolean i0(int i10) {
        if (!a0() || W(i10)) {
            return false;
        }
        int i11 = this.f11930B;
        if (i11 != Integer.MIN_VALUE) {
            p0(this, i11, ArrayPool.STANDARD_BUFFER_SIZE_BYTES, null, null, 12, null);
        }
        this.f11930B = i10;
        this.f11956q.invalidate();
        p0(this, i10, 32768, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(g0 g0Var) {
        if (g0Var.g()) {
            this.f11956q.getSnapshotObserver().i(g0Var, this.f11955a0, new n(g0Var, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(r rVar) {
        Trace.beginSection("measureAndLayout");
        try {
            W.d0.r(rVar.f11956q, false, 1, null);
            p079h8.A a10 = p079h8.A.f21846a;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                rVar.C();
                Trace.endSection();
                rVar.f11952X = false;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int l0(int i10) {
        if (i10 == this.f11956q.getSemanticsOwner().a().o()) {
            return -1;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0094 A[LOOP:1: B:15:0x0054->B:28:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0097 A[EDGE_INSN: B:42:0x0097->B:29:0x0097 BREAK  A[LOOP:1: B:15:0x0054->B:28:0x0094], SYNTHETIC] */
    private final void m0(p011b0.j jVar, h0 h0Var) {
        androidx.collection.y yVarB = AbstractC1034n.b();
        List listT = jVar.t();
        int size = listT.size();
        for (int i10 = 0; i10 < size; i10++) {
            p011b0.j jVar2 = (p011b0.j) listT.get(i10);
            if (N().a(jVar2.o())) {
                if (!h0Var.a().a(jVar2.o())) {
                    b0(jVar.q());
                    return;
                }
                yVarB.f(jVar2.o());
            }
        }
        androidx.collection.y yVarA = h0Var.a();
        int[] iArr = yVarA.f11337b;
        long[] jArr = yVarA.f11336a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j9 = jArr[i11];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j9) < 128 && !yVarB.a(iArr[(i11 << 3) + i13])) {
                            b0(jVar.q());
                            return;
                        }
                        j9 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        List listT2 = jVar.t();
        int size2 = listT2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            p011b0.j jVar3 = (p011b0.j) listT2.get(i14);
            if (N().a(jVar3.o())) {
                Object objC = this.f11950V.c(jVar3.o());
                kotlin.jvm.internal.n.e(objC);
                m0(jVar3, (h0) objC);
            }
        }
    }

    private final boolean n0(AccessibilityEvent accessibilityEvent) {
        if (!Y()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f11932D = true;
        }
        try {
            return ((Boolean) this.f11958s.f(accessibilityEvent)).booleanValue();
        } finally {
            this.f11932D = false;
        }
    }

    private final boolean o0(int i10, int i11, Integer num, List list) {
        if (i10 == Integer.MIN_VALUE || !Y()) {
            return false;
        }
        AccessibilityEvent accessibilityEventE = E(i10, i11);
        if (num != null) {
            accessibilityEventE.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventE.setContentDescription(p131n0.a.d(list, ",", null, null, 0, null, null, 62, null));
        }
        Trace.beginSection("sendEvent");
        try {
            return n0(accessibilityEventE);
        } finally {
            Trace.endSection();
        }
    }

    static /* synthetic */ boolean p0(r rVar, int i10, int i11, Integer num, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            list = null;
        }
        return rVar.o0(i10, i11, num, list);
    }

    private final void q0(int i10, int i11, String str) {
        AccessibilityEvent accessibilityEventE = E(l0(i10), 32);
        accessibilityEventE.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventE.getText().add(str);
        }
        n0(accessibilityEventE);
    }

    private final void r0(int i10) {
        g gVar = this.f11942N;
        if (gVar != null) {
            if (i10 != gVar.d().o()) {
                return;
            }
            if (SystemClock.uptimeMillis() - gVar.f() <= 1000) {
                AccessibilityEvent accessibilityEventE = E(l0(gVar.d().o()), 131072);
                accessibilityEventE.setFromIndex(gVar.b());
                accessibilityEventE.setToIndex(gVar.e());
                accessibilityEventE.setAction(gVar.a());
                accessibilityEventE.setMovementGranularity(gVar.c());
                accessibilityEventE.getText().add(R(gVar.d()));
                n0(accessibilityEventE);
            }
        }
        this.f11942N = null;
    }

    /* JADX WARN: Code duplicated, block: B:175:0x05a0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
    /*  JADX ERROR: NullPointerException in pass: ProcessVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getUseList()" because "ssaVar" is null
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    private final void s0(androidx.collection.AbstractC1031k r39) {
        /*
            Method dump skipped, instruction units count: 1563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.s0(androidx.collection.k):void");
    }

    private final void t0(W.B b10, androidx.collection.y yVar) {
        p011b0.g gVarY;
        W.B bJ;
        if (b10.t0() && !this.f11956q.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(b10)) {
            if (!b10.V().q(W.W.a(8))) {
                b10 = AbstractC1063u.j(b10, q.f11992r);
            }
            if (b10 == null || (gVarY = b10.y()) == null) {
                return;
            }
            if (!gVarY.q() && (bJ = AbstractC1063u.j(b10, p.f11991r)) != null) {
                b10 = bJ;
            }
            int iA0 = b10.a0();
            if (yVar.f(iA0)) {
                p0(this, l0(iA0), RecyclerView.ItemAnimator.FLAG_MOVED, 1, null, 8, null);
            }
        }
    }

    private final void u0(W.B b10) {
        if (b10.t0() && !this.f11956q.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(b10)) {
            int iA0 = b10.a0();
            androidx.appcompat.app.o.a(this.f11933E.c(iA0));
            androidx.appcompat.app.o.a(this.f11934F.c(iA0));
        }
    }

    private final boolean v0(p011b0.j jVar, int i10, int i11, boolean z9) {
        String strR;
        p011b0.g gVarW = jVar.w();
        p011b0.f fVar = p011b0.f.f14572a;
        if (gVarW.b(fVar.v()) && AbstractC1063u.h(jVar)) {
            p219v8.q qVar = (p219v8.q) ((p011b0.a) jVar.w().m(fVar.v())).a();
            if (qVar != null) {
                return ((Boolean) qVar.e(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z9))).booleanValue();
            }
            return false;
        }
        if ((i10 == i11 && i11 == this.f11937I) || (strR = R(jVar)) == null) {
            return false;
        }
        if (i10 < 0 || i10 != i11 || i11 > strR.length()) {
            i10 = -1;
        }
        this.f11937I = i10;
        boolean z10 = strR.length() > 0;
        n0(H(l0(jVar.o()), z10 ? Integer.valueOf(this.f11937I) : null, z10 ? Integer.valueOf(this.f11937I) : null, z10 ? Integer.valueOf(strR.length()) : null, strR));
        r0(jVar.o());
        return true;
    }

    private final void w0(p011b0.j jVar, C0.d dVar) {
        p011b0.g gVarW = jVar.w();
        p011b0.m mVar = p011b0.m.f14629a;
        if (gVarW.b(mVar.h())) {
            dVar.l0(true);
            dVar.p0((CharSequence) p011b0.h.a(jVar.w(), mVar.h()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(int i10, C0.d dVar, String str, Bundle bundle) {
        p011b0.j jVarB;
        i0 i0Var = (i0) N().c(i10);
        if (i0Var == null || (jVarB = i0Var.b()) == null) {
            return;
        }
        String strR = R(jVarB);
        if (kotlin.jvm.internal.n.d(str, this.f11947S)) {
            int iE = this.f11945Q.e(i10, -1);
            if (iE != -1) {
                dVar.t().putInt(str, iE);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.n.d(str, this.f11948T)) {
            int iE2 = this.f11946R.e(i10, -1);
            if (iE2 != -1) {
                dVar.t().putInt(str, iE2);
                return;
            }
            return;
        }
        if (jVarB.w().b(p011b0.f.f14572a.i()) && bundle != null && kotlin.jvm.internal.n.d(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            if (bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1) > 0 && i11 >= 0) {
                if (i11 < (strR != null ? strR.length() : SubsamplingScaleImageView.TILE_SIZE_AUTO)) {
                    j0.e(jVarB.w());
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        p011b0.g gVarW = jVarB.w();
        p011b0.m mVar = p011b0.m.f14629a;
        if (!gVarW.b(mVar.z()) || bundle == null || !kotlin.jvm.internal.n.d(str, "androidx.compose.ui.semantics.testTag")) {
            if (kotlin.jvm.internal.n.d(str, "androidx.compose.ui.semantics.id")) {
                dVar.t().putInt(str, jVarB.o());
            }
        } else {
            String str2 = (String) p011b0.h.a(jVarB.w(), mVar.z());
            if (str2 != null) {
                dVar.t().putCharSequence(str, str2);
            }
        }
    }

    private final void x0(p011b0.j jVar, C0.d dVar) {
        dVar.e0(O(jVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect y(i0 i0Var) {
        Rect rectA = i0Var.a();
        long jL0 = this.f11956q.l0(H.h.a(rectA.left, rectA.top));
        long jL1 = this.f11956q.l0(H.h.a(rectA.right, rectA.bottom));
        return new Rect((int) Math.floor(H.g.k(jL0)), (int) Math.floor(H.g.l(jL0)), (int) Math.ceil(H.g.k(jL1)), (int) Math.ceil(H.g.l(jL1)));
    }

    private final void z0(p011b0.j jVar, C0.d dVar) {
        dVar.L0(P(jVar));
    }

    public final boolean A(boolean z9, int i10, long j9) {
        if (kotlin.jvm.internal.n.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return B(N(), z9, i10, j9);
        }
        return false;
    }

    public final boolean I(MotionEvent motionEvent) {
        if (!a0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iV = V(motionEvent.getX(), motionEvent.getY());
            boolean zDispatchGenericMotionEvent = this.f11956q.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            K0(iV);
            if (iV == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.f11957r == Integer.MIN_VALUE) {
            return this.f11956q.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        K0(Integer.MIN_VALUE);
        return true;
    }

    public final AndroidComposeView U() {
        return this.f11956q;
    }

    public final int V(float f10, float f11) {
        int iL0;
        W.d0.r(this.f11956q, false, 1, null);
        C0975q c0975q = new C0975q();
        W.B.j0(this.f11956q.getRoot(), H.h.a(f10, f11), c0975q, false, false, 12, null);
        int iM = AbstractC1444s.m(c0975q);
        while (true) {
            iL0 = Integer.MIN_VALUE;
            if (-1 >= iM) {
                break;
            }
            W.B bH = AbstractC0967i.h(c0975q.get(iM));
            if (this.f11956q.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(bH) != null) {
                return Integer.MIN_VALUE;
            }
            if (bH.V().q(W.W.a(8))) {
                iL0 = l0(bH.a0());
                if (j0.f(p011b0.k.a(bH, false))) {
                    break;
                }
            }
            iM--;
        }
        return iL0;
    }

    public final boolean Y() {
        if (this.f11960u) {
            return true;
        }
        return this.f11959t.isEnabled() && !this.f11964y.isEmpty();
    }

    public final void c0(W.B b10) {
        this.f11941M = true;
        if (Y()) {
            b0(b10);
        }
    }

    public final void d0() {
        this.f11941M = true;
        if (!Y() || this.f11952X) {
            return;
        }
        this.f11952X = true;
        this.f11965z.post(this.f11953Y);
    }

    @Override // androidx.core.view.C1069a
    public C0.e getAccessibilityNodeProvider(View view) {
        return this.f11929A;
    }

    public final void y0(long j9) {
        this.f11961v = j9;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:24:0x0069, B:28:0x007c, B:30:0x0084, B:32:0x008d, B:34:0x0096, B:37:0x00ab, B:39:0x00b2, B:40:0x00bb, B:23:0x005d), top: B:48:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008d A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:24:0x0069, B:28:0x007c, B:30:0x0084, B:32:0x008d, B:34:0x0096, B:37:0x00ab, B:39:0x00b2, B:40:0x00bb, B:23:0x005d), top: B:48:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096 A[Catch: all -> 0x00a7, LOOP:0: B:33:0x0094->B:34:0x0096, LOOP_END, TryCatch #0 {all -> 0x00a7, blocks: (B:24:0x0069, B:28:0x007c, B:30:0x0084, B:32:0x008d, B:34:0x0096, B:37:0x00ab, B:39:0x00b2, B:40:0x00bb, B:23:0x005d), top: B:48:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b2 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:24:0x0069, B:28:0x007c, B:30:0x0084, B:32:0x008d, B:34:0x0096, B:37:0x00ab, B:39:0x00b2, B:40:0x00bb, B:23:0x005d), top: B:48:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object z(p129m8.e r11) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.z(m8.e):java.lang.Object");
    }
}

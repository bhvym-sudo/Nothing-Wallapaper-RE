package androidx.compose.ui.platform;

import I.AbstractC0861e;
import I.C0870n;
import W.AbstractC0967i;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1148h;
import androidx.lifecycle.InterfaceC1163x;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.InterfaceC1386a;
import p170r.InterfaceC1683h0;
import p170r.S0;
import p170r.V0;
import p170r.b1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements W.d0, u0, Q.B, InterfaceC1148h {

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static final a f11528U0 = new a(null);

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static final int f11529V0 = 8;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private static Class f11530W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private static Method f11531X0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final x0 f11532A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private final p051f0.f f11533A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final C.c f11534B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private final InterfaceC1683h0 f11535B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final C.c f11536C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private int f11537C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final C0870n f11538D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private final InterfaceC1683h0 f11539D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final W.B f11540E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private final M.a f11541E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final W.l0 f11542F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private final N.c f11543F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p011b0.l f11544G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private final V.e f11545G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final androidx.compose.ui.platform.r f11546H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private final m0 f11547H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private E.b f11548I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private MotionEvent f11549I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final C1050g f11550J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private long f11551J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final I.y f11552K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private final v0 f11553K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final D.g f11554L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private final p190t.b f11555L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final List f11556M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private final s f11557M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private List f11558N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private final Runnable f11559N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f11560O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private boolean f11561O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f11562P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private final p219v8.a f11563P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final Q.f f11564Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private final I f11565Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final Q.x f11566R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private boolean f11567R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private p219v8.l f11568S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private final p001a0.f f11569S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final D.a f11570T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private final Q.q f11571T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f11572U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final C1051h f11573V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final W.f0 f11574W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f11575a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private AndroidViewsHandler f11576b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private DrawChildContainer f11577c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private p111l0.b f11578d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f11579e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final W.L f11580f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final q0 f11581g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private long f11582h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final int[] f11583i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final float[] f11584j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final float[] f11585k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final float[] f11586l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private long f11587m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f11588n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private long f11589o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f11590p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f11591q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final InterfaceC1683h0 f11592q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f11593r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final b1 f11594r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final W.D f11595s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private p219v8.l f11596s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC1683h0 f11597t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f11598t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p011b0.b f11599u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f11600u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final EmptySemanticsElement f11601v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final ViewTreeObserver.OnTouchModeChangeListener f11602v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final G.g f11603w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private final p061g0.B f11604w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final DragAndDropModifierOnDragListener f11605x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final p061g0.A f11606x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private p129m8.i f11607y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private final AtomicReference f11608y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final F.b f11609z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final l0 f11610z0;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b() {
            try {
                if (AndroidComposeView.f11530W0 == null) {
                    AndroidComposeView.f11530W0 = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.f11530W0;
                    AndroidComposeView.f11531X0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.f11531X0;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC1163x f11611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p082i1.f f11612b;

        public b(InterfaceC1163x interfaceC1163x, p082i1.f fVar) {
            this.f11611a = interfaceC1163x;
            this.f11612b = fVar;
        }

        public final InterfaceC1163x a() {
            return this.f11611a;
        }

        public final p082i1.f b() {
            return this.f11612b;
        }
    }

    static final class c extends kotlin.jvm.internal.o implements p219v8.l {
        c() {
            super(1);
        }

        public final Boolean a(int i10) {
            boolean zRequestFocusFromTouch;
            N.a.C0187a c0187a = N.a.f5176b;
            if (N.a.f(i10, c0187a.b())) {
                zRequestFocusFromTouch = AndroidComposeView.this.isInTouchMode();
            } else if (N.a.f(i10, c0187a.a())) {
                zRequestFocusFromTouch = AndroidComposeView.this.isInTouchMode() ? AndroidComposeView.this.requestFocusFromTouch() : true;
            } else {
                zRequestFocusFromTouch = false;
            }
            return Boolean.valueOf(zRequestFocusFromTouch);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            return a(((N.a) obj).i());
        }
    }

    static final class d extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final d f11614r = new d();

        d() {
            super(1);
        }

        public final void a(Configuration configuration) {
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((Configuration) obj);
            return p079h8.A.f21846a;
        }
    }

    /* synthetic */ class e extends kotlin.jvm.internal.l implements p219v8.a {
        e(Object obj) {
            super(0, obj, AbstractC1068z.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.coreshims.b invoke() {
            return AbstractC1068z.f((View) this.receiver);
        }
    }

    static final class f extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ KeyEvent f11616s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(KeyEvent keyEvent) {
            super(0);
            this.f11616s = keyEvent;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(this.f11616s));
        }
    }

    /* synthetic */ class g extends kotlin.jvm.internal.l implements p219v8.q {
        g(Object obj) {
            super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
        }

        @Override // p219v8.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            androidx.appcompat.app.o.a(obj);
            androidx.appcompat.app.o.a(obj2);
            throw null;
        }
    }

    /* synthetic */ class h extends kotlin.jvm.internal.l implements p219v8.l {
        h(Object obj) {
            super(1, obj, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            g((p219v8.a) obj);
            return p079h8.A.f21846a;
        }

        public final void g(p219v8.a aVar) {
            ((AndroidComposeView) this.receiver).x0(aVar);
        }
    }

    /* synthetic */ class i extends kotlin.jvm.internal.l implements p219v8.p {
        i(Object obj) {
            super(2, obj, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.ui.focus.b bVar, H.i iVar) {
            return Boolean.valueOf(((AndroidComposeView) this.receiver).r0(bVar, iVar));
        }
    }

    /* synthetic */ class j extends kotlin.jvm.internal.l implements p219v8.l {
        j(Object obj) {
            super(1, obj, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            return g(((androidx.compose.ui.focus.b) obj).o());
        }

        public final Boolean g(int i10) {
            return Boolean.valueOf(((AndroidComposeView) this.receiver).q0(i10));
        }
    }

    /* synthetic */ class k extends kotlin.jvm.internal.l implements p219v8.a {
        k(Object obj) {
            super(0, obj, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m5invoke();
            return p079h8.A.f21846a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m5invoke() {
            ((AndroidComposeView) this.receiver).n0();
        }
    }

    /* synthetic */ class l extends kotlin.jvm.internal.l implements p219v8.a {
        l(Object obj) {
            super(0, obj, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final H.i invoke() {
            return ((AndroidComposeView) this.receiver).o0();
        }
    }

    static final class n extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final n f11617r = new n();

        n() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean f(androidx.compose.ui.focus.k kVar) {
            return Boolean.TRUE;
        }
    }

    static final class o extends kotlin.jvm.internal.o implements p219v8.l {

        static final class a extends kotlin.jvm.internal.o implements p219v8.l {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.b f11619r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.focus.b bVar) {
                super(1);
                this.f11619r = bVar;
            }

            @Override // p219v8.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean f(androidx.compose.ui.focus.k kVar) {
                Boolean boolK = androidx.compose.ui.focus.l.k(kVar, this.f11619r.o());
                return Boolean.valueOf(boolK != null ? boolK.booleanValue() : true);
            }
        }

        static final class b extends kotlin.jvm.internal.o implements p219v8.l {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.b f11620r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.focus.b bVar) {
                super(1);
                this.f11620r = bVar;
            }

            @Override // p219v8.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean f(androidx.compose.ui.focus.k kVar) {
                Boolean boolK = androidx.compose.ui.focus.l.k(kVar, this.f11620r.o());
                return Boolean.valueOf(boolK != null ? boolK.booleanValue() : true);
            }
        }

        o() {
            super(1);
        }

        public final Boolean a(KeyEvent keyEvent) {
            androidx.compose.ui.focus.b bVarY = AndroidComposeView.this.Y(keyEvent);
            if (bVarY == null || !O.c.e(O.d.b(keyEvent), O.c.f5730a.a())) {
                return Boolean.FALSE;
            }
            H.i iVarO0 = AndroidComposeView.this.o0();
            Boolean boolM = AndroidComposeView.this.getFocusOwner().m(bVarY.o(), iVarO0, new b(bVarY));
            if (boolM != null ? boolM.booleanValue() : true) {
                return Boolean.TRUE;
            }
            if (!androidx.compose.ui.focus.e.a(bVarY.o())) {
                return Boolean.FALSE;
            }
            Integer numC = androidx.compose.ui.focus.d.c(bVarY.o());
            if (numC == null) {
                throw new IllegalStateException("Invalid focus direction");
            }
            int iIntValue = numC.intValue();
            Rect rectA = iVarO0 != null ? I.J.a(iVarO0) : null;
            if (rectA == null) {
                throw new IllegalStateException("Invalid rect");
            }
            View viewX = AndroidComposeView.this.X(iIntValue);
            if (kotlin.jvm.internal.n.d(viewX, AndroidComposeView.this)) {
                viewX = null;
            }
            if ((viewX == null || !androidx.compose.ui.focus.d.b(viewX, Integer.valueOf(iIntValue), rectA)) && AndroidComposeView.this.getFocusOwner().e(false, true, false, bVarY.o())) {
                Boolean boolM2 = AndroidComposeView.this.getFocusOwner().m(bVarY.o(), null, new a(bVarY));
                return Boolean.valueOf(boolM2 != null ? boolM2.booleanValue() : true);
            }
            return Boolean.TRUE;
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            return a(((O.b) obj).f());
        }
    }

    public static final class p implements Q.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Q.p f11621a = Q.p.f6540a.a();

        p() {
        }
    }

    static final class q extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f11623r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(int i10) {
            super(1);
            this.f11623r = i10;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean f(androidx.compose.ui.focus.k kVar) {
            Boolean boolK = androidx.compose.ui.focus.l.k(kVar, this.f11623r);
            return Boolean.valueOf(boolK != null ? boolK.booleanValue() : false);
        }
    }

    static final class r extends kotlin.jvm.internal.o implements p219v8.a {
        r() {
            super(0);
        }

        public final void a() {
            MotionEvent motionEvent = AndroidComposeView.this.f11549I0;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    AndroidComposeView.this.f11551J0 = SystemClock.uptimeMillis();
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.post(androidComposeView.f11557M0);
                }
            }
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    public static final class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.f11549I0;
            if (motionEvent != null) {
                boolean z9 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z9) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i10 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i10 = 2;
                }
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                androidComposeView.E0(motionEvent, i10, androidComposeView.f11551J0, false);
            }
        }
    }

    static final class t extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final t f11626r = new t();

        t() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean f(S.b bVar) {
            return Boolean.FALSE;
        }
    }

    static final class u extends kotlin.jvm.internal.o implements p219v8.l {
        u() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(p219v8.a aVar) {
            aVar.invoke();
        }

        public final void b(final p219v8.a aVar) {
            Handler handler = AndroidComposeView.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar.invoke();
                return;
            }
            Handler handler2 = AndroidComposeView.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeView.u.d(aVar);
                    }
                });
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            b((p219v8.a) obj);
            return p079h8.A.f21846a;
        }
    }

    static final class v extends kotlin.jvm.internal.o implements p219v8.a {
        v() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return AndroidComposeView.this.get_viewTreeOwners();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidComposeView(Context context, p129m8.i iVar) {
        super(context);
        H.g.a aVar = H.g.f2287b;
        this.f11591q = aVar.b();
        this.f11593r = true;
        Object[] objArr = 0;
        this.f11595s = new W.D(null, 1, 0 == true ? 1 : 0);
        this.f11597t = S0.c(p111l0.a.a(context), S0.f());
        p011b0.b bVar = new p011b0.b();
        this.f11599u = bVar;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(bVar);
        this.f11601v = emptySemanticsElement;
        this.f11603w = new FocusOwnerImpl(new h(this), new i(this), new j(this), new k(this), new l(this), new kotlin.jvm.internal.q(this) { // from class: androidx.compose.ui.platform.AndroidComposeView.m
            @Override // C8.h
            public Object get() {
                return ((AndroidComposeView) this.receiver).getLayoutDirection();
            }
        });
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new g(this));
        this.f11605x = dragAndDropModifierOnDragListener;
        this.f11607y = iVar;
        this.f11609z = dragAndDropModifierOnDragListener;
        this.f11532A = new x0();
        C.c.a aVar2 = C.c.f445a;
        C.c cVarA = androidx.compose.ui.input.key.a.a(aVar2, new o());
        this.f11534B = cVarA;
        C.c cVarA2 = androidx.compose.ui.input.rotary.a.a(aVar2, t.f11626r);
        this.f11536C = cVarA2;
        this.f11538D = new C0870n();
        W.B b10 = new W.B(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        b10.f1(U.v.f7776b);
        b10.c1(getDensity());
        b10.g1(aVar2.c(emptySemanticsElement).c(cVarA2).c(cVarA).c(getFocusOwner().b()).c(dragAndDropModifierOnDragListener.d()));
        this.f11540E = b10;
        this.f11542F = this;
        this.f11544G = new p011b0.l(getRoot(), bVar);
        androidx.compose.ui.platform.r rVar = new androidx.compose.ui.platform.r(this);
        this.f11546H = rVar;
        this.f11548I = new E.b(this, new e(this));
        this.f11550J = new C1050g(context);
        this.f11552K = AbstractC0861e.a(this);
        this.f11554L = new D.g();
        this.f11556M = new ArrayList();
        this.f11564Q = new Q.f();
        this.f11566R = new Q.x(getRoot());
        this.f11568S = d.f11614r;
        this.f11570T = Q() ? new D.a(this, getAutofillTree()) : null;
        this.f11573V = new C1051h(context);
        this.f11574W = new W.f0(new u());
        this.f11580f0 = new W.L(getRoot());
        this.f11581g0 = new H(ViewConfiguration.get(context));
        this.f11582h0 = p111l0.n.a(SubsamplingScaleImageView.TILE_SIZE_AUTO, SubsamplingScaleImageView.TILE_SIZE_AUTO);
        this.f11583i0 = new int[]{0, 0};
        this.f11584j0 = I.C.c(null, 1, null);
        this.f11585k0 = I.C.c(null, 1, null);
        this.f11586l0 = I.C.c(null, 1, null);
        this.f11587m0 = -1L;
        this.f11589o0 = aVar.a();
        this.f11590p0 = true;
        this.f11592q0 = V0.b(null, null, 2, null);
        this.f11594r0 = S0.b(new v());
        this.f11598t0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.a0(this.f11911q);
            }
        };
        this.f11600u0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.j
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.B0(this.f11914a);
            }
        };
        this.f11602v0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.k
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z9) {
                AndroidComposeView.G0(this.f11916q, z9);
            }
        };
        p061g0.B b11 = new p061g0.B(getView(), this);
        this.f11604w0 = b11;
        this.f11606x0 = new p061g0.A((p061g0.t) AbstractC1068z.g().f(b11));
        this.f11608y0 = C.i.a();
        this.f11610z0 = new N(getTextInputService());
        this.f11533A0 = new B(context);
        this.f11535B0 = S0.c(p051f0.j.a(context), S0.f());
        this.f11537C0 = Z(context.getResources().getConfiguration());
        p111l0.s sVarE = androidx.compose.ui.focus.d.e(context.getResources().getConfiguration().getLayoutDirection());
        this.f11539D0 = V0.b(sVarE == null ? p111l0.s.Ltr : sVarE, null, 2, null);
        this.f11541E0 = new M.b(this);
        this.f11543F0 = new N.c(isInTouchMode() ? N.a.f5176b.b() : N.a.f5176b.a(), new c(), objArr == true ? 1 : 0);
        this.f11545G0 = new V.e(this);
        this.f11547H0 = new C(this);
        this.f11553K0 = new v0();
        this.f11555L0 = new p190t.b(new p219v8.a[16], 0);
        this.f11557M0 = new s();
        this.f11559N0 = new Runnable() { // from class: androidx.compose.ui.platform.l
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.C0(this.f11917q);
            }
        };
        this.f11563P0 = new r();
        this.f11565Q0 = new J();
        addOnAttachStateChangeListener(this.f11548I);
        setWillNotDraw(false);
        setFocusable(true);
        C1067y.f12013a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        androidx.core.view.H.g0(this, rVar);
        p219v8.l lVarA = u0.f12002i.a();
        if (lVarA != null) {
            lVarA.f(this);
        }
        setOnDragListener(dragAndDropModifierOnDragListener);
        getRoot().k(this);
        C1064v.f12005a.a(this);
        this.f11569S0 = new p001a0.f();
        this.f11571T0 = new p();
    }

    static /* synthetic */ void A0(AndroidComposeView androidComposeView, W.B b10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            b10 = null;
        }
        androidComposeView.z0(b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(AndroidComposeView androidComposeView) {
        androidComposeView.H0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(AndroidComposeView androidComposeView) {
        androidComposeView.f11561O0 = false;
        MotionEvent motionEvent = androidComposeView.f11549I0;
        kotlin.jvm.internal.n.e(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        androidComposeView.D0(motionEvent);
    }

    private final int D0(MotionEvent motionEvent) {
        Object obj;
        if (this.f11567R0) {
            this.f11567R0 = false;
            this.f11532A.a(Q.z.b(motionEvent.getMetaState()));
        }
        Q.v vVarC = this.f11564Q.c(motionEvent, this);
        if (vVarC == null) {
            this.f11566R.c();
            return Q.y.a(false, false);
        }
        List listB = vVarC.b();
        int size = listB.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i10 = size - 1;
            obj = listB.get(size);
            if (((Q.w) obj).b()) {
                break;
            }
            if (i10 < 0) {
                obj = null;
                break;
            }
            size = i10;
        }
        Q.w wVar = (Q.w) obj;
        if (wVar != null) {
            this.f11591q = wVar.f();
        }
        int iB = this.f11566R.b(vVarC, this, j0(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 0 || actionMasked == 5) && !Q.C.c(iB)) {
            this.f11564Q.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return iB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(MotionEvent motionEvent, int i10, long j9, boolean z9) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            long jL0 = l0(H.h.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = H.g.k(jL0);
            pointerCoords.y = H.g.l(jL0);
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j9 : motionEvent.getDownTime(), j9, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z9 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        Q.v vVarC = this.f11564Q.c(motionEventObtain, this);
        kotlin.jvm.internal.n.e(vVarC);
        this.f11566R.b(vVarC, this, true);
        motionEventObtain.recycle();
    }

    static /* synthetic */ void F0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i10, long j9, boolean z9, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z9 = true;
        }
        androidComposeView.E0(motionEvent, i10, j9, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(AndroidComposeView androidComposeView, boolean z9) {
        androidComposeView.f11543F0.a(z9 ? N.a.f5176b.b() : N.a.f5176b.a());
    }

    private final void H0() {
        getLocationOnScreen(this.f11583i0);
        long j9 = this.f11582h0;
        int iD = p111l0.m.d(j9);
        int iE = p111l0.m.e(j9);
        int[] iArr = this.f11583i0;
        boolean z9 = false;
        int i10 = iArr[0];
        if (iD != i10 || iE != iArr[1]) {
            this.f11582h0 = p111l0.n.a(i10, iArr[1]);
            if (iD != Integer.MAX_VALUE && iE != Integer.MAX_VALUE) {
                getRoot().G().I().z0();
                z9 = true;
            }
        }
        this.f11580f0.c(z9);
    }

    private final boolean Q() {
        return true;
    }

    private final boolean T(W.B b10) {
        if (this.f11579e0) {
            return true;
        }
        W.B bY = b10.Y();
        return (bY == null || bY.B()) ? false : true;
    }

    private final void U(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).p();
            } else if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt);
            }
        }
    }

    private final long V(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return s0(0, size);
        }
        if (mode == 0) {
            return s0(0, SubsamplingScaleImageView.TILE_SIZE_AUTO);
        }
        if (mode == 1073741824) {
            return s0(size, size);
        }
        throw new IllegalStateException();
    }

    private final void W() {
        if (this.f11562P) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.f11562P = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View X(int i10) {
        View viewFindNextFocus = this;
        while (viewFindNextFocus != null) {
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            kotlin.jvm.internal.n.f(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, i10);
            if (viewFindNextFocus != null && !AbstractC1068z.d(this, viewFindNextFocus)) {
                return viewFindNextFocus;
            }
        }
        return null;
    }

    private final int Z(Configuration configuration) {
        return configuration.fontWeightAdjustment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(AndroidComposeView androidComposeView) {
        androidComposeView.H0();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    private final int b0(MotionEvent motionEvent) {
        AndroidComposeView androidComposeView;
        int i10;
        removeCallbacks(this.f11557M0);
        try {
            u0(motionEvent);
            boolean z9 = true;
            this.f11588n0 = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f11549I0;
                boolean z10 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null) {
                    try {
                        if (d0(motionEvent, motionEvent2)) {
                            if (i0(motionEvent2)) {
                                this.f11566R.c();
                            } else if (motionEvent2.getActionMasked() != 10 && z10) {
                                F0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                boolean z11 = motionEvent.getToolType(0) == 3;
                if (z10 || !z11 || actionMasked == 3 || actionMasked == 9 || !j0(motionEvent)) {
                    androidComposeView = this;
                    i10 = 9;
                } else {
                    i10 = 9;
                    androidComposeView = this;
                    F0(androidComposeView, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != 0) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = androidComposeView.f11549I0;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = androidComposeView.f11549I0;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == i10 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            androidComposeView.f11564Q.e(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = androidComposeView.f11549I0;
                        float x9 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = androidComposeView.f11549I0;
                        boolean z12 = (x9 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = androidComposeView.f11549I0;
                        if ((motionEvent7 != null ? motionEvent7.getEventTime() : -1L) == motionEvent.getEventTime()) {
                            z9 = false;
                        }
                        if (z12 || z9) {
                            if (pointerId >= 0) {
                                androidComposeView.f11564Q.e(pointerId);
                            }
                            androidComposeView.f11566R.a();
                        }
                    }
                }
                androidComposeView.f11549I0 = MotionEvent.obtainNoHistory(motionEvent);
                int iD0 = D0(motionEvent);
                Trace.endSection();
                androidComposeView.f11588n0 = false;
                return iD0;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.f11588n0 = false;
            throw th3;
        }
    }

    private final boolean c0(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -motionEvent.getAxisValue(26);
        return getFocusOwner().o(new S.b(androidx.core.view.I.d(viewConfiguration, getContext()) * f10, f10 * androidx.core.view.I.a(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()));
    }

    private final boolean d0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final void f0(W.B b10) {
        b10.n0();
        p190t.b bVarF0 = b10.f0();
        int iP = bVarF0.p();
        if (iP > 0) {
            Object[] objArrO = bVarF0.o();
            int i10 = 0;
            do {
                f0((W.B) objArrO[i10]);
                i10++;
            } while (i10 < iP);
        }
    }

    private final void g0(W.B b10) {
        int i10 = 0;
        W.L.E(this.f11580f0, b10, false, 2, null);
        p190t.b bVarF0 = b10.f0();
        int iP = bVarF0.p();
        if (iP > 0) {
            Object[] objArrO = bVarF0.o();
            do {
                g0((W.B) objArrO[i10]);
                i10++;
            } while (i10 < iP);
        }
    }

    @InterfaceC1386a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b get_viewTreeOwners() {
        return (b) this.f11592q0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    private final boolean h0(MotionEvent motionEvent) {
        boolean z9;
        float x9 = motionEvent.getX();
        if (Float.isInfinite(x9) || Float.isNaN(x9)) {
            z9 = true;
        } else {
            float y9 = motionEvent.getY();
            if (Float.isInfinite(y9) || Float.isNaN(y9)) {
                z9 = true;
            } else {
                float rawX = motionEvent.getRawX();
                if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
                    z9 = true;
                } else {
                    float rawY = motionEvent.getRawY();
                    if (Float.isInfinite(rawY) || Float.isNaN(rawY)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
            }
        }
        if (!z9) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 1; i10 < pointerCount; i10++) {
                float x10 = motionEvent.getX(i10);
                if (Float.isInfinite(x10) || Float.isNaN(x10)) {
                    z9 = true;
                } else {
                    float y10 = motionEvent.getY(i10);
                    if (Float.isInfinite(y10) || Float.isNaN(y10) || !C1042b0.f11853a.a(motionEvent, i10)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
                if (z9) {
                    break;
                }
            }
        }
        return z9;
    }

    private final boolean i0(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean j0(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        return 0.0f <= x9 && x9 <= ((float) getWidth()) && 0.0f <= y9 && y9 <= ((float) getHeight());
    }

    private final boolean k0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f11549I0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0() {
        if (isFocused() || hasFocus()) {
            super.clearFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H.i o0() {
        if (isFocused()) {
            return getFocusOwner().j();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return androidx.compose.ui.focus.d.a(viewFindFocus);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q0(int i10) {
        androidx.compose.ui.focus.b.a aVar = androidx.compose.ui.focus.b.f11397b;
        if (androidx.compose.ui.focus.b.l(i10, aVar.b()) || androidx.compose.ui.focus.b.l(i10, aVar.c())) {
            return false;
        }
        Integer numC = androidx.compose.ui.focus.d.c(i10);
        if (numC == null) {
            throw new IllegalStateException("Invalid focus direction");
        }
        int iIntValue = numC.intValue();
        H.i iVarO0 = o0();
        Rect rectA = iVarO0 != null ? I.J.a(iVarO0) : null;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rectA == null ? focusFinder.findNextFocus(this, findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(this, rectA, iIntValue);
        if (viewFindNextFocus != null) {
            return androidx.compose.ui.focus.d.b(viewFindNextFocus, Integer.valueOf(iIntValue), rectA);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r0(androidx.compose.ui.focus.b bVar, H.i iVar) {
        Integer numC;
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((bVar == null || (numC = androidx.compose.ui.focus.d.c(bVar.o())) == null) ? 130 : numC.intValue(), iVar != null ? I.J.a(iVar) : null);
    }

    private final long s0(int i10, int i11) {
        return p079h8.x.d(p079h8.x.d(p079h8.x.d(i10) << 32) | p079h8.x.d(i11));
    }

    private void setDensity(p111l0.d dVar) {
        this.f11597t.setValue(dVar);
    }

    private void setFontFamilyResolver(f0.g.a aVar) {
        this.f11535B0.setValue(aVar);
    }

    private void setLayoutDirection(p111l0.s sVar) {
        this.f11539D0.setValue(sVar);
    }

    private final void set_viewTreeOwners(b bVar) {
        this.f11592q0.setValue(bVar);
    }

    private final void t0() {
        if (this.f11588n0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f11587m0) {
            this.f11587m0 = jCurrentAnimationTimeMillis;
            v0();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.f11583i0);
            int[] iArr = this.f11583i0;
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.f11583i0;
            this.f11589o0 = H.h.a(f10 - iArr2[0], f11 - iArr2[1]);
        }
    }

    private final void u0(MotionEvent motionEvent) {
        this.f11587m0 = AnimationUtils.currentAnimationTimeMillis();
        v0();
        long jF = I.C.f(this.f11585k0, H.h.a(motionEvent.getX(), motionEvent.getY()));
        this.f11589o0 = H.h.a(motionEvent.getRawX() - H.g.k(jF), motionEvent.getRawY() - H.g.l(jF));
    }

    private final void v0() {
        this.f11565Q0.a(this, this.f11585k0);
        X.a(this.f11585k0, this.f11586l0);
    }

    private final void z0(W.B b10) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (b10 != null) {
            while (b10 != null && b10.R() == W.B.g.InMeasureBlock && T(b10)) {
                b10 = b10.Y();
            }
            if (b10 == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final Object R(p129m8.e eVar) {
        Object objZ = this.f11546H.z(eVar);
        return objZ == p139n8.b.e() ? objZ : p079h8.A.f21846a;
    }

    public final Object S(p129m8.e eVar) throws Throwable {
        Object objC = this.f11548I.c(eVar);
        return objC == p139n8.b.e() ? objC : p079h8.A.f21846a;
    }

    public androidx.compose.ui.focus.b Y(KeyEvent keyEvent) {
        long jA = O.d.a(keyEvent);
        O.a.C0190a c0190a = O.a.f5573a;
        if (O.a.n(jA, c0190a.l())) {
            return androidx.compose.ui.focus.b.i(O.d.c(keyEvent) ? androidx.compose.ui.focus.b.f11397b.f() : androidx.compose.ui.focus.b.f11397b.e());
        }
        if (O.a.n(jA, c0190a.e())) {
            return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.f11397b.g());
        }
        if (O.a.n(jA, c0190a.d())) {
            return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.f11397b.d());
        }
        if (O.a.n(jA, c0190a.f()) ? true : O.a.n(jA, c0190a.k())) {
            return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.f11397b.h());
        }
        if (O.a.n(jA, c0190a.c()) ? true : O.a.n(jA, c0190a.j())) {
            return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.f11397b.a());
        }
        if (O.a.n(jA, c0190a.b()) ? true : O.a.n(jA, c0190a.g()) ? true : O.a.n(jA, c0190a.i())) {
            return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.f11397b.b());
        }
        if (O.a.n(jA, c0190a.a()) ? true : O.a.n(jA, c0190a.h())) {
            return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.f11397b.c());
        }
        return null;
    }

    @Override // W.d0
    public void a(boolean z9) {
        p219v8.a aVar;
        if (this.f11580f0.l() || this.f11580f0.m()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z9) {
                try {
                    aVar = this.f11563P0;
                } finally {
                    Trace.endSection();
                }
            } else {
                aVar = null;
            }
            if (this.f11580f0.q(aVar)) {
                requestLayout();
            }
            W.L.d(this.f11580f0, false, 1, null);
            W();
            p079h8.A a10 = p079h8.A.f21846a;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public void autofill(SparseArray sparseArray) {
        D.a aVar;
        if (!Q() || (aVar = this.f11570T) == null) {
            return;
        }
        D.b.a(aVar, sparseArray);
    }

    @Override // androidx.lifecycle.InterfaceC1148h
    public void b(InterfaceC1163x interfaceC1163x) {
        setShowLayoutBounds(f11528U0.b());
    }

    @Override // W.d0
    public long c(long j9) {
        t0();
        return I.C.f(this.f11585k0, j9);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f11546H.A(false, i10, this.f11591q);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f11546H.A(true, i10, this.f11591q);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            f0(getRoot());
        }
        W.d0.r(this, false, 1, null);
        A.k.f25e.n();
        this.f11560O = true;
        C0870n c0870n = this.f11538D;
        Canvas canvasO = c0870n.a().o();
        c0870n.a().p(canvas);
        getRoot().r(c0870n.a(), null);
        c0870n.a().p(canvasO);
        if (!this.f11556M.isEmpty()) {
            int size = this.f11556M.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((W.c0) this.f11556M.get(i10)).i();
            }
        }
        if (ViewLayer.f11813F.b()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.f11556M.clear();
        this.f11560O = false;
        List list = this.f11558N;
        if (list != null) {
            kotlin.jvm.internal.n.e(list);
            this.f11556M.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.f11561O0) {
            removeCallbacks(this.f11559N0);
            if (motionEvent.getActionMasked() == 8) {
                this.f11561O0 = false;
            } else {
                this.f11559N0.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (h0(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return motionEvent.isFromSource(4194304) ? c0(motionEvent) : Q.C.c(b0(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f11561O0) {
            removeCallbacks(this.f11559N0);
            this.f11559N0.run();
        }
        if (h0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.f11546H.I(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && j0(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f11549I0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f11549I0 = MotionEvent.obtainNoHistory(motionEvent);
                this.f11561O0 = true;
                postDelayed(this.f11559N0, 8L);
                return false;
            }
        } else if (!k0(motionEvent)) {
            return false;
        }
        return Q.C.c(b0(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().k(O.b.b(keyEvent), new f(keyEvent));
        }
        this.f11532A.a(Q.z.b(keyEvent.getMetaState()));
        return G.g.h(getFocusOwner(), O.b.b(keyEvent), null, 2, null) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().l(O.b.b(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        super.dispatchProvideStructure(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f11561O0) {
            removeCallbacks(this.f11559N0);
            MotionEvent motionEvent2 = this.f11549I0;
            kotlin.jvm.internal.n.e(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || d0(motionEvent, motionEvent2)) {
                this.f11559N0.run();
            } else {
                this.f11561O0 = false;
            }
        }
        if (h0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !k0(motionEvent)) {
            return false;
        }
        int iB0 = b0(motionEvent);
        if (Q.C.b(iB0)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return Q.C.c(iB0);
    }

    @Override // W.d0
    public void e(W.B b10, boolean z9, boolean z10, boolean z11) {
        if (z9) {
            if (this.f11580f0.A(b10, z10) && z11) {
                z0(b10);
                return;
            }
            return;
        }
        if (this.f11580f0.D(b10, z10) && z11) {
            z0(b10);
        }
    }

    public void e0() {
        f0(getRoot());
    }

    public final View findViewByAccessibilityIdTraversal(int i10) throws IllegalAccessException, InvocationTargetException {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i10));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        if (view != null) {
            H.i iVarA = androidx.compose.ui.focus.d.a(view);
            androidx.compose.ui.focus.b bVarD = androidx.compose.ui.focus.d.d(i10);
            if (kotlin.jvm.internal.n.d(getFocusOwner().m(bVarD != null ? bVarD.o() : androidx.compose.ui.focus.b.f11397b.a(), iVarA, n.f11617r), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i10);
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this.f11576b0 == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this.f11576b0 = androidViewsHandler;
            addView(androidViewsHandler);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this.f11576b0;
        kotlin.jvm.internal.n.e(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // W.d0
    public D.c getAutofill() {
        return this.f11570T;
    }

    @Override // W.d0
    public D.g getAutofillTree() {
        return this.f11554L;
    }

    public final p219v8.l getConfigurationChangeObserver() {
        return this.f11568S;
    }

    public final E.b getContentCaptureManager$ui_release() {
        return this.f11548I;
    }

    public p129m8.i getCoroutineContext() {
        return this.f11607y;
    }

    @Override // W.d0
    public p111l0.d getDensity() {
        return (p111l0.d) this.f11597t.getValue();
    }

    @Override // W.d0
    public F.b getDragAndDropManager() {
        return this.f11609z;
    }

    @Override // W.d0
    public G.g getFocusOwner() {
        return this.f11603w;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        p079h8.A a10;
        H.i iVarO0 = o0();
        if (iVarO0 != null) {
            rect.left = Math.round(iVarO0.f());
            rect.top = Math.round(iVarO0.i());
            rect.right = Math.round(iVarO0.g());
            rect.bottom = Math.round(iVarO0.c());
            a10 = p079h8.A.f21846a;
        } else {
            a10 = null;
        }
        if (a10 == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // W.d0
    public f0.g.a getFontFamilyResolver() {
        return (f0.g.a) this.f11535B0.getValue();
    }

    @Override // W.d0
    public p051f0.f getFontLoader() {
        return this.f11533A0;
    }

    @Override // W.d0
    public I.y getGraphicsContext() {
        return this.f11552K;
    }

    @Override // W.d0
    public M.a getHapticFeedBack() {
        return this.f11541E0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f11580f0.l();
    }

    @Override // W.d0
    public N.b getInputModeManager() {
        return this.f11543F0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f11587m0;
    }

    @Override // android.view.View, android.view.ViewParent, W.d0
    public p111l0.s getLayoutDirection() {
        return (p111l0.s) this.f11539D0.getValue();
    }

    public long getMeasureIteration() {
        return this.f11580f0.p();
    }

    public V.e getModifierLocalManager() {
        return this.f11545G0;
    }

    @Override // W.d0
    public U.t.a getPlacementScope() {
        return U.u.b(this);
    }

    @Override // W.d0
    public Q.q getPointerIconService() {
        return this.f11571T0;
    }

    @Override // W.d0
    public W.B getRoot() {
        return this.f11540E;
    }

    public W.l0 getRootForTest() {
        return this.f11542F;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        p001a0.f fVar = this.f11569S0;
        if (fVar != null) {
            return fVar.c();
        }
        return false;
    }

    public p011b0.l getSemanticsOwner() {
        return this.f11544G;
    }

    @Override // W.d0
    public W.D getSharedDrawScope() {
        return this.f11595s;
    }

    @Override // W.d0
    public boolean getShowLayoutBounds() {
        return this.f11575a0;
    }

    @Override // W.d0
    public W.f0 getSnapshotObserver() {
        return this.f11574W;
    }

    @Override // W.d0
    public l0 getSoftwareKeyboardController() {
        return this.f11610z0;
    }

    @Override // W.d0
    public p061g0.A getTextInputService() {
        return this.f11606x0;
    }

    @Override // W.d0
    public m0 getTextToolbar() {
        return this.f11547H0;
    }

    public View getView() {
        return this;
    }

    @Override // W.d0
    public q0 getViewConfiguration() {
        return this.f11581g0;
    }

    public final b getViewTreeOwners() {
        return (b) this.f11594r0.getValue();
    }

    @Override // W.d0
    public w0 getWindowInfo() {
        return this.f11532A;
    }

    @Override // W.d0
    public void h(W.B b10) {
        this.f11580f0.t(b10);
        y0();
    }

    @Override // W.d0
    public void i(W.B b10) {
        this.f11546H.c0(b10);
        this.f11548I.t(b10);
    }

    @Override // W.d0
    public void k(W.B b10, boolean z9, boolean z10) {
        if (z9) {
            if (this.f11580f0.z(b10, z10)) {
                A0(this, null, 1, null);
            }
        } else if (this.f11580f0.C(b10, z10)) {
            A0(this, null, 1, null);
        }
    }

    public long l0(long j9) {
        t0();
        long jF = I.C.f(this.f11585k0, j9);
        return H.h.a(H.g.k(jF) + H.g.k(this.f11589o0), H.g.l(jF) + H.g.l(this.f11589o0));
    }

    @Override // W.d0
    public void m(W.B b10) {
        this.f11580f0.B(b10);
        A0(this, null, 1, null);
    }

    public final void m0(W.c0 c0Var, boolean z9) {
        if (!z9) {
            if (this.f11560O) {
                return;
            }
            this.f11556M.remove(c0Var);
            List list = this.f11558N;
            if (list != null) {
                list.remove(c0Var);
                return;
            }
            return;
        }
        if (!this.f11560O) {
            this.f11556M.add(c0Var);
            return;
        }
        List arrayList = this.f11558N;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f11558N = arrayList;
        }
        arrayList.add(c0Var);
    }

    @Override // Q.B
    public void n(float[] fArr) {
        t0();
        I.C.n(fArr, this.f11585k0);
        AbstractC1068z.i(fArr, H.g.k(this.f11589o0), H.g.l(this.f11589o0), this.f11584j0);
    }

    @Override // W.d0
    public void o(W.B b10, boolean z9) {
        this.f11580f0.h(b10, z9);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        InterfaceC1163x interfaceC1163xA;
        AbstractC1157q lifecycle;
        InterfaceC1163x interfaceC1163xA2;
        D.a aVar;
        super.onAttachedToWindow();
        this.f11532A.b(hasWindowFocus());
        g0(getRoot());
        f0(getRoot());
        getSnapshotObserver().k();
        if (Q() && (aVar = this.f11570T) != null) {
            D.f.f693a.a(aVar);
        }
        InterfaceC1163x interfaceC1163xA3 = androidx.lifecycle.g0.a(this);
        p082i1.f fVarA = p082i1.g.a(this);
        b viewTreeOwners = getViewTreeOwners();
        AbstractC1157q lifecycle2 = null;
        if (viewTreeOwners == null || (interfaceC1163xA3 != null && fVarA != null && (interfaceC1163xA3 != viewTreeOwners.a() || fVarA != viewTreeOwners.a()))) {
            if (interfaceC1163xA3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (fVarA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (interfaceC1163xA = viewTreeOwners.a()) != null && (lifecycle = interfaceC1163xA.getLifecycle()) != null) {
                lifecycle.d(this);
            }
            interfaceC1163xA3.getLifecycle().a(this);
            b bVar = new b(interfaceC1163xA3, fVarA);
            set_viewTreeOwners(bVar);
            p219v8.l lVar = this.f11596s0;
            if (lVar != null) {
                lVar.f(bVar);
            }
            this.f11596s0 = null;
        }
        this.f11543F0.a(isInTouchMode() ? N.a.f5176b.b() : N.a.f5176b.a());
        b viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (interfaceC1163xA2 = viewTreeOwners2.a()) != null) {
            lifecycle2 = interfaceC1163xA2.getLifecycle();
        }
        if (lifecycle2 == null) {
            T.a.c("No lifecycle owner exists");
            throw new p079h8.f();
        }
        lifecycle2.a(this);
        lifecycle2.a(this.f11548I);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f11598t0);
        getViewTreeObserver().addOnScrollChangedListener(this.f11600u0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f11602v0);
        C1066x.f12009a.b(this);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        androidx.appcompat.app.o.a(C.i.c(this.f11608y0));
        return this.f11604w0.i();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(p111l0.a.a(getContext()));
        if (Z(configuration) != this.f11537C0) {
            this.f11537C0 = Z(configuration);
            setFontFamilyResolver(p051f0.j.a(getContext()));
        }
        this.f11568S.f(configuration);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        androidx.appcompat.app.o.a(C.i.c(this.f11608y0));
        return this.f11604w0.f(editorInfo);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        this.f11548I.r(jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        D.a aVar;
        InterfaceC1163x interfaceC1163xA;
        super.onDetachedFromWindow();
        getSnapshotObserver().l();
        b viewTreeOwners = getViewTreeOwners();
        AbstractC1157q lifecycle = (viewTreeOwners == null || (interfaceC1163xA = viewTreeOwners.a()) == null) ? null : interfaceC1163xA.getLifecycle();
        if (lifecycle == null) {
            T.a.c("No lifecycle owner exists");
            throw new p079h8.f();
        }
        lifecycle.d(this.f11548I);
        lifecycle.d(this);
        if (Q() && (aVar = this.f11570T) != null) {
            D.f.f693a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f11598t0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f11600u0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f11602v0);
        C1066x.f12009a.a(this);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z9, int i10, Rect rect) {
        super.onFocusChanged(z9, i10, rect);
        if (z9 || hasFocus()) {
            return;
        }
        getFocusOwner().n();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) throws Throwable {
        this.f11580f0.q(this.f11563P0);
        this.f11578d0 = null;
        H0();
        if (this.f11576b0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                g0(getRoot());
            }
            long jV = V(i10);
            int iD = (int) p079h8.x.d(jV >>> 32);
            int iD2 = (int) p079h8.x.d(jV & 4294967295L);
            long jV2 = V(i11);
            long jA = p111l0.b.f22815b.a(iD, iD2, (int) p079h8.x.d(jV2 >>> 32), (int) p079h8.x.d(4294967295L & jV2));
            p111l0.b bVar = this.f11578d0;
            boolean zD = false;
            if (bVar == null) {
                this.f11578d0 = p111l0.b.a(jA);
                this.f11579e0 = false;
            } else {
                if (bVar != null) {
                    zD = p111l0.b.d(bVar.m(), jA);
                }
                if (!zD) {
                    this.f11579e0 = true;
                }
            }
            this.f11580f0.F(jA);
            this.f11580f0.r();
            setMeasuredDimension(getRoot().c0(), getRoot().C());
            if (this.f11576b0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().c0(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(getRoot().C(), BasicMeasure.EXACTLY));
            }
            p079h8.A a10 = p079h8.A.f21846a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        D.a aVar;
        if (!Q() || viewStructure == null || (aVar = this.f11570T) == null) {
            return;
        }
        D.b.b(aVar, viewStructure);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        if (this.f11593r) {
            p111l0.s sVarE = androidx.compose.ui.focus.d.e(i10);
            if (sVarE == null) {
                sVarE = p111l0.s.Ltr;
            }
            setLayoutDirection(sVarE);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        p001a0.f fVar = this.f11569S0;
        if (fVar != null) {
            fVar.d(this, getSemanticsOwner(), getCoroutineContext(), consumer);
        }
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        E.b bVar = this.f11548I;
        bVar.w(bVar, longSparseArray);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
        boolean zB;
        this.f11532A.b(z9);
        this.f11567R0 = true;
        super.onWindowFocusChanged(z9);
        if (!z9 || getShowLayoutBounds() == (zB = f11528U0.b())) {
            return;
        }
        setShowLayoutBounds(zB);
        e0();
    }

    @Override // W.d0
    public void p() {
        if (this.f11572U) {
            getSnapshotObserver().b();
            this.f11572U = false;
        }
        AndroidViewsHandler androidViewsHandler = this.f11576b0;
        if (androidViewsHandler != null) {
            U(androidViewsHandler);
        }
        while (this.f11555L0.s()) {
            int iP = this.f11555L0.p();
            for (int i10 = 0; i10 < iP; i10++) {
                p219v8.a aVar = (p219v8.a) this.f11555L0.o()[i10];
                this.f11555L0.z(i10, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.f11555L0.x(0, iP);
        }
    }

    @Override // W.d0
    public void q() {
        this.f11546H.d0();
        this.f11548I.u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().f().d()) {
            return super.requestFocus(i10, rect);
        }
        androidx.compose.ui.focus.b bVarD = androidx.compose.ui.focus.d.d(i10);
        int iO = bVarD != null ? bVarD.o() : androidx.compose.ui.focus.b.f11397b.b();
        Boolean boolM = getFocusOwner().m(iO, rect != null ? I.J.e(rect) : null, new q(iO));
        if (boolM != null) {
            return boolM.booleanValue();
        }
        return false;
    }

    @Override // W.d0
    public void s(W.B b10) {
    }

    public void setAccessibilityEventBatchIntervalMillis(long j9) {
        this.f11546H.y0(j9);
    }

    public final void setConfigurationChangeObserver(p219v8.l lVar) {
        this.f11568S = lVar;
    }

    public final void setContentCaptureManager$ui_release(E.b bVar) {
        this.f11548I = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCoroutineContext(p129m8.i iVar) {
        this.f11607y = iVar;
        C.c.AbstractC0022c abstractC0022cK = getRoot().V().k();
        int iA = W.W.a(16);
        if (!abstractC0022cK.z().Q()) {
            T.a.b("visitSubtree called on an unattached node");
        }
        C.c.AbstractC0022c abstractC0022cI = abstractC0022cK.z().I();
        W.B bH = AbstractC0967i.h(abstractC0022cK);
        W.Q q9 = new W.Q();
        while (bH != null) {
            if (abstractC0022cI == null) {
                abstractC0022cI = bH.V().k();
            }
            if ((abstractC0022cI.H() & iA) != 0) {
                while (abstractC0022cI != null) {
                    if ((abstractC0022cI.L() & iA) != 0) {
                        for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cI; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
                            if (abstractC0022cF instanceof W.j0) {
                            } else {
                                abstractC0022cF.L();
                            }
                        }
                    }
                    abstractC0022cI = abstractC0022cI.I();
                }
            }
            q9.c(bH.f0());
            bH = q9.a() ? (W.B) q9.b() : null;
            abstractC0022cI = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j9) {
        this.f11587m0 = j9;
    }

    public final void setOnViewTreeOwnersAvailable(p219v8.l lVar) {
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.f(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f11596s0 = lVar;
    }

    @Override // W.d0
    public void setShowLayoutBounds(boolean z9) {
        this.f11575a0 = z9;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // Q.B
    public long t(long j9) {
        t0();
        return I.C.f(this.f11586l0, H.h.a(H.g.k(j9) - H.g.k(this.f11589o0), H.g.l(j9) - H.g.l(this.f11589o0)));
    }

    @Override // W.d0
    public W.c0 u(p219v8.p pVar, p219v8.a aVar, L.c cVar) {
        if (cVar != null) {
            return new U(cVar, null, this, pVar, aVar);
        }
        W.c0 c0Var = (W.c0) this.f11553K0.b();
        if (c0Var != null) {
            c0Var.b(pVar, aVar);
            return c0Var;
        }
        if (isHardwareAccelerated()) {
            return new U(getGraphicsContext().b(), getGraphicsContext(), this, pVar, aVar);
        }
        if (isHardwareAccelerated() && this.f11590p0) {
            try {
                return new f0(this, pVar, aVar);
            } catch (Throwable unused) {
                this.f11590p0 = false;
            }
        }
        if (this.f11577c0 == null) {
            ViewLayer.c cVar2 = ViewLayer.f11813F;
            if (!cVar2.a()) {
                cVar2.d(new View(getContext()));
            }
            DrawChildContainer drawChildContainer = cVar2.b() ? new DrawChildContainer(getContext()) : new ViewLayerContainer(getContext());
            this.f11577c0 = drawChildContainer;
            addView(drawChildContainer);
        }
        DrawChildContainer drawChildContainer2 = this.f11577c0;
        kotlin.jvm.internal.n.e(drawChildContainer2);
        return new ViewLayer(this, drawChildContainer2, pVar, aVar);
    }

    public final boolean w0(W.c0 c0Var) {
        if (this.f11577c0 != null) {
            ViewLayer.f11813F.b();
        }
        this.f11553K0.c(c0Var);
        return true;
    }

    public void x0(p219v8.a aVar) {
        if (this.f11555L0.k(aVar)) {
            return;
        }
        this.f11555L0.b(aVar);
    }

    public final void y0() {
        this.f11572U = true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        kotlin.jvm.internal.n.e(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i10, layoutParams);
    }

    @Override // W.d0
    public C1050g getAccessibilityManager() {
        return this.f11550J;
    }

    @Override // W.d0
    public C1051h getClipboardManager() {
        return this.f11573V;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i10;
        layoutParamsGenerateDefaultLayoutParams.height = i11;
        p079h8.A a10 = p079h8.A.f21846a;
        addView(view, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i10, layoutParams, true);
    }
}

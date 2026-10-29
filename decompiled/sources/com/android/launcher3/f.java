package com.android.launcher3;

import F8.AbstractC0816i;
import F8.L;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.nothing.cardwidget.mediaplayer.utils.DisplayConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final b f15531g0 = new b(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f15532A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final int f15533B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f15534C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f15535D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Rect f15536E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f15537F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Rect f15538G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f15539H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f15540I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Rect f15541J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Point f15542K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f15543L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f15544M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f15545N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final float f15546O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f15547P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f15548Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final int f15549R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final float f15550S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final float f15551T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final float f15552U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final int f15553V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final int f15554W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final int f15555X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f15556Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final int f15557Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15558a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final float f15559a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U5.a f15560b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f15561b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L f15562c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Rect f15563c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f15564d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Rect f15565d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Resources f15566e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f15567e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final WindowMetrics f15568f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f15569f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f15570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Insets f15573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p079h8.h f15574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f15575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f15576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f15577n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f15578o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f15579p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f15580q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f15581r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f15582s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f15583t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f15584u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15585v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Point f15586w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15587x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f15588y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f15589z;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f15590q;

        /* JADX INFO: renamed from: com.android.launcher3.f$a$a, reason: collision with other inner class name */
        static final class C0444a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ f f15592q;

            C0444a(f fVar) {
                this.f15592q = fVar;
            }

            public final Object a(boolean z9, p129m8.e eVar) {
                this.f15592q.q(z9);
                return p079h8.A.f21846a;
            }

            @Override // I8.InterfaceC0881g
            public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                return a(((Boolean) obj).booleanValue(), eVar);
            }
        }

        a(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return f.this.new a(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f15590q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0880f interfaceC0880fX = f.this.f15560b.x();
                C0444a c0444a = new C0444a(f.this);
                this.f15590q = 1;
                if (interfaceC0880fX.a(c0444a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return p079h8.A.f21846a;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a(int i10, int i11, int i12) {
            return (i10 - ((i12 - 1) * i11)) / i12;
        }

        public final int b(int i10, int i11, int i12) {
            return (i10 - ((i12 - 1) * i11)) / i12;
        }

        private b() {
        }
    }

    public f(Context context, int i10, U5.a repository, L scope) {
        Insets NONE;
        WindowInsets windowInsets;
        Rect bounds;
        Rect bounds2;
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(repository, "repository");
        kotlin.jvm.internal.n.h(scope, "scope");
        this.f15558a = i10;
        this.f15560b = repository;
        this.f15562c = scope;
        this.f15564d = new ArrayList();
        Resources resources = context.getResources();
        this.f15566e = resources;
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        WindowMetrics maximumWindowMetrics = windowManager != null ? windowManager.getMaximumWindowMetrics() : null;
        this.f15568f = maximumWindowMetrics;
        float f10 = TypedValues.CycleType.TYPE_EASING / context.getResources().getDisplayMetrics().densityDpi;
        this.f15570g = f10;
        int iWidth = (maximumWindowMetrics == null || (bounds2 = maximumWindowMetrics.getBounds()) == null) ? 1080 : bounds2.width();
        this.f15571h = iWidth;
        int iHeight = (maximumWindowMetrics == null || (bounds = maximumWindowMetrics.getBounds()) == null) ? 2400 : bounds.height();
        this.f15572i = iHeight;
        if (maximumWindowMetrics == null || (windowInsets = maximumWindowMetrics.getWindowInsets()) == null || (NONE = windowInsets.getInsets(WindowInsets.Type.systemBars())) == null) {
            NONE = Insets.NONE;
            kotlin.jvm.internal.n.g(NONE, "NONE");
        }
        this.f15573j = NONE;
        this.f15574k = p079h8.i.b(new p219v8.a() { // from class: com.android.launcher3.e
            @Override // p219v8.a
            public final Object invoke() {
                return Boolean.valueOf(f.p());
            }
        });
        int dimensionPixelSize = (int) (p087i6.e.m() ? context.getResources().getDimensionPixelSize(o.f15641h) * f10 * 0.6f : context.getResources().getDimensionPixelSize(o.f15641h) * f10);
        this.f15575l = dimensionPixelSize;
        int dimensionPixelSize2 = (int) (context.getResources().getDimensionPixelSize(o.f15642i) * f10);
        this.f15576m = dimensionPixelSize2;
        int i11 = dimensionPixelSize2 + dimensionPixelSize;
        this.f15577n = i11;
        this.f15578o = (int) (i11 * 0.8f);
        this.f15579p = p239x8.a.b(iHeight * 0.1826087f);
        this.f15580q = p239x8.a.b(iHeight * 0.12173913f);
        this.f15581r = p239x8.a.b(iHeight * 0.20108695f);
        this.f15582s = p239x8.a.b(iHeight * 0.07826087f);
        this.f15583t = 4;
        this.f15584u = 2;
        this.f15585v = 4;
        this.f15586w = new Point();
        this.f15587x = DisplayConfig.Common.STANDARD_MUSIC_DEFAULT_ICON_WIDTH;
        int dimensionPixelSize3 = (int) (context.getResources().getDimensionPixelSize(o.f15644k) * f10);
        this.f15588y = dimensionPixelSize3;
        int dimensionPixelSize4 = (int) (context.getResources().getDimensionPixelSize(o.f15643j) * f10);
        this.f15589z = dimensionPixelSize4;
        int dimensionPixelSize5 = (int) ((o() ? context.getResources().getDimensionPixelSize(o.f15646m) : context.getResources().getDimensionPixelSize(o.f15645l)) * f10);
        this.f15532A = dimensionPixelSize5;
        int i12 = ((i10 + i11) - dimensionPixelSize) + dimensionPixelSize5;
        this.f15533B = i12;
        int i13 = i10 + dimensionPixelSize3 + dimensionPixelSize4;
        this.f15534C = i13;
        this.f15535D = i12;
        Rect rect = new Rect();
        rect.top = i13;
        int i14 = o.f15649p;
        rect.left = resources.getDimensionPixelSize(i14);
        rect.right = resources.getDimensionPixelSize(i14);
        this.f15536E = rect;
        Rect rect2 = new Rect();
        int dimensionPixelSize6 = resources.getDimensionPixelSize(o.f15648o);
        rect2.set(dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6);
        this.f15538G = rect2;
        int i15 = iWidth - k().x;
        this.f15539H = i15;
        this.f15540I = i15;
        Rect rect3 = new Rect(0, 0, i15, this.f15540I);
        this.f15541J = rect3;
        this.f15542K = new Point();
        this.f15543L = i13;
        this.f15544M = rect3.height() + this.f15543L + 240;
        this.f15545N = resources.getInteger(r.f15689a);
        float f11 = iHeight * 0.052173913f;
        this.f15546O = f11;
        this.f15547P = iHeight - iWidth;
        this.f15548Q = iWidth;
        this.f15549R = iWidth - w.b(80.0f);
        float f12 = iHeight * 0.35869566f;
        this.f15550S = f12;
        this.f15551T = iWidth / (iHeight - f11);
        this.f15552U = iWidth / (iHeight - f12);
        int iB = p239x8.a.b(iWidth * 0.45410627f);
        this.f15553V = iB;
        this.f15554W = p239x8.a.b(iB * 1.106383f);
        int iB2 = p239x8.a.b(iB * 0.88297874f);
        this.f15555X = iB2;
        this.f15556Y = p239x8.a.b(iB * 0.38297874f);
        this.f15557Z = (iB - iB2) / 2;
        this.f15559a0 = iB2 * 0.28915662f;
        this.f15561b0 = iB;
        Rect rect4 = new Rect();
        int i16 = (iWidth - iB) / 2;
        rect4.left = i16;
        rect4.right = i16;
        this.f15563c0 = rect4;
        Rect rect5 = new Rect();
        int i17 = (iWidth - (iB * 2)) / 2;
        rect5.left = i17;
        rect5.right = i17;
        rect5.bottom = NONE.bottom;
        this.f15565d0 = rect5;
        this.f15567e0 = true;
        this.f15569f0 = (i12 + (i15 / 4)) - (i13 + (i15 / 2));
        s();
        AbstractC0816i.d(scope, null, null, new a(null), 3, null);
    }

    public static final int e(int i10, int i11, int i12) {
        return f15531g0.a(i10, i11, i12);
    }

    public static final int f(int i10, int i11, int i12) {
        return f15531g0.b(i10, i11, i12);
    }

    private final Point k() {
        Rect rect = this.f15536E;
        return new Point(rect.left + rect.right, rect.top + rect.bottom);
    }

    private final boolean o() {
        return ((Boolean) this.f15574k.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p() {
        return p087i6.e.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(boolean z9) {
        if (this.f15567e0 == z9) {
            return;
        }
        this.f15567e0 = z9;
        if (!o()) {
            this.f15537F = z9 ? 0.0f : this.f15533B - this.f15535D;
        }
        Rect rect = this.f15541J;
        int i10 = z9 ? 0 : (this.f15540I / 4) + this.f15569f0;
        rect.top = i10;
        int i11 = this.f15540I;
        if (!z9) {
            i11 /= 2;
        }
        rect.bottom = i10 + i11;
        this.f15543L = z9 ? this.f15534C : this.f15533B;
        this.f15544M = rect.height() + this.f15543L + 240;
        Iterator it = this.f15564d.iterator();
        while (it.hasNext()) {
            ((l) it.next()).b(z9);
        }
    }

    private final void s() {
        Point point = this.f15542K;
        b bVar = f15531g0;
        point.x = bVar.b(this.f15539H, this.f15586w.x, this.f15585v);
        this.f15542K.y = bVar.a(this.f15540I, this.f15586w.y, this.f15583t);
    }

    public final void d(l listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f15564d.add(listener);
    }

    public final float g() {
        return this.f15552U;
    }

    public final int h() {
        return this.f15575l;
    }

    public final int i() {
        return this.f15582s;
    }

    public final int j() {
        return this.f15558a;
    }

    public final Rect l(int i10, int i11) {
        return new Rect(0, 0, i10 == 1 ? this.f15556Y : this.f15555X, i11 == 1 ? this.f15556Y : this.f15555X);
    }

    public final int m() {
        return this.f15533B;
    }

    public final int n() {
        return this.f15535D;
    }

    public final void r(l listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f15564d.remove(listener);
    }
}

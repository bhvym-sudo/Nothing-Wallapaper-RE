package com.nothing.wallpaper.picker.edit.preview.widget;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.L;
import G6.h;
import H3.q;
import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.WallpaperColors;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.H;
import androidx.core.view.y;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.nothing.wallpaper.picker.edit.preview.widget.WallpaperScreenContainer;
import java.io.IOException;
import java.util.concurrent.Future;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.x;
import p079h8.A;
import p079h8.r;
import p084i3.M0;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class WallpaperScreenContainer extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f18551A = new a(null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final Interpolator f18552B = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private WallpaperScreen f18553q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WallpaperScreen f18554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private SurfaceView f18555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private M0 f18556t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View f18557u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f18558v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f18559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final PointF f18560x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private WallpaperColors f18561y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private WallpaperColors f18562z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final Interpolator a() {
            return WallpaperScreenContainer.f18552B;
        }

        private a() {
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f18563q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f18564r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f18565s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f18567u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ q f18568v;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f18569q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ WallpaperScreenContainer f18570r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ q f18571s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ SurfaceView f18572t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(WallpaperScreenContainer wallpaperScreenContainer, q qVar, SurfaceView surfaceView, p129m8.e eVar) {
                super(2, eVar);
                this.f18570r = wallpaperScreenContainer;
                this.f18571s = qVar;
                this.f18572t = surfaceView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f18570r, this.f18571s, this.f18572t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f18569q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                WallpaperScreenContainer wallpaperScreenContainer = this.f18570r;
                wallpaperScreenContainer.f18556t = new M0(wallpaperScreenContainer.f18555s, this.f18571s, false);
                M0 m9 = this.f18570r.f18556t;
                if (m9 != null) {
                    m9.i(null);
                }
                this.f18572t.getHolder().addCallback(this.f18570r.f18556t);
                this.f18572t.setZOrderMediaOverlay(true);
                WallpaperScreen wallpaperScreen = this.f18570r.f18553q;
                if (wallpaperScreen != null) {
                    wallpaperScreen.c();
                }
                WallpaperScreen wallpaperScreen2 = this.f18570r.f18554r;
                if (wallpaperScreen2 != null) {
                    wallpaperScreen2.c();
                }
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1163x interfaceC1163x, q qVar, p129m8.e eVar) {
            super(2, eVar);
            this.f18567u = interfaceC1163x;
            this.f18568v = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return WallpaperScreenContainer.this.new b(this.f18567u, this.f18568v, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            SurfaceView surfaceView;
            WallpaperScreenContainer wallpaperScreenContainer;
            Object objE = p139n8.b.e();
            int i10 = this.f18565s;
            if (i10 == 0) {
                r.b(obj);
                SurfaceView surfaceView2 = WallpaperScreenContainer.this.f18555s;
                if (surfaceView2 != null) {
                    InterfaceC1163x interfaceC1163x = this.f18567u;
                    WallpaperScreenContainer wallpaperScreenContainer2 = WallpaperScreenContainer.this;
                    q qVar = this.f18568v;
                    AbstractC1157q.b bVar = AbstractC1157q.b.CREATED;
                    a aVar = new a(wallpaperScreenContainer2, qVar, surfaceView2, null);
                    this.f18563q = wallpaperScreenContainer2;
                    this.f18564r = surfaceView2;
                    this.f18565s = 1;
                    if (N.b(interfaceC1163x, bVar, aVar, this) == objE) {
                        return objE;
                    }
                    surfaceView = surfaceView2;
                    wallpaperScreenContainer = wallpaperScreenContainer2;
                }
                return A.f21846a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            surfaceView = (SurfaceView) this.f18564r;
            wallpaperScreenContainer = (WallpaperScreenContainer) this.f18563q;
            r.b(obj);
            surfaceView.getHolder().removeCallback(wallpaperScreenContainer.f18556t);
            M0 m9 = wallpaperScreenContainer.f18556t;
            if (m9 != null) {
                m9.b();
            }
            WallpaperScreen wallpaperScreen = wallpaperScreenContainer.f18553q;
            if (wallpaperScreen != null) {
                wallpaperScreen.e();
            }
            WallpaperScreen wallpaperScreen2 = wallpaperScreenContainer.f18554r;
            if (wallpaperScreen2 != null) {
                wallpaperScreen2.e();
            }
            return A.f21846a;
        }
    }

    public static final class c implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p219v8.a f18573a;

        public c(p219v8.a aVar) {
            this.f18573a = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            this.f18573a.invoke();
        }
    }

    public static final class d implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ View f18574q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ WallpaperScreenContainer f18575r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ View f18576s;

        public d(View view, WallpaperScreenContainer wallpaperScreenContainer, View view2) {
            this.f18574q = view;
            this.f18575r = wallpaperScreenContainer;
            this.f18576s = view2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PointF pointF = this.f18575r.f18560x;
            n.e(this.f18576s);
            pointF.set(H6.d.b(this.f18576s, this.f18575r));
        }
    }

    static final class e extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18577q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Future f18579s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Future future, p129m8.e eVar) {
            super(2, eVar);
            this.f18579s = future;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return WallpaperScreenContainer.this.new e(this.f18579s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((e) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            x.a aVar;
            p139n8.b.e();
            if (this.f18577q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            WallpaperScreenContainer wallpaperScreenContainer = WallpaperScreenContainer.this;
            Future future = this.f18579s;
            wallpaperScreenContainer.f18562z = (future == null || (aVar = (x.a) future.get()) == null) ? null : aVar.b();
            M0 m9 = WallpaperScreenContainer.this.f18556t;
            if (m9 != null) {
                m9.i(WallpaperScreenContainer.this.f18562z);
            }
            return A.f21846a;
        }
    }

    public static final class f implements View.OnLayoutChangeListener {
        public f() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            WallpaperScreenContainer.this.x();
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f18581q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f18582r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f18583s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f18584t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f18585u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f18586v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f18588x;

        g(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18586v = obj;
            this.f18588x |= Integer.MIN_VALUE;
            return WallpaperScreenContainer.this.L(null, null, null, null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WallpaperScreenContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    private final Object A(x xVar, p129m8.e eVar) {
        Object objG = AbstractC0812g.g(C0803b0.b(), new e(xVar != null ? xVar.b(getContext()) : null, null), eVar);
        return objG == p139n8.b.e() ? objG : A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A C(Bitmap bitmap, ImageView.ScaleType scaleType, ImageView it) {
        n.h(it, "it");
        it.setImageBitmap(bitmap);
        it.setScaleType(scaleType);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A E(p177r6.g gVar, WallpaperScreen wallpaperScreen, WallpaperScreenContainer wallpaperScreenContainer, ImageView it) {
        n.h(it, "it");
        SurfaceControl surfaceControl = wallpaperScreen.getSurfaceControl();
        Rect surfaceFrame = wallpaperScreen.getHolder().getSurfaceFrame();
        n.g(surfaceFrame, "getSurfaceFrame(...)");
        gVar.n0(surfaceControl, surfaceFrame);
        wallpaperScreenContainer.y();
        return A.f21846a;
    }

    private final void F(boolean z9) throws IOException {
        WallpaperScreen wallpaperScreen = this.f18554r;
        if (wallpaperScreen != null) {
            wallpaperScreen.setAlpha((z9 && this.f18559w) ? 1.0f : 0.0f);
        }
    }

    static /* synthetic */ void G(WallpaperScreenContainer wallpaperScreenContainer, boolean z9, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z9 = wallpaperScreenContainer.isSelected();
        }
        wallpaperScreenContainer.F(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A I(p177r6.g gVar, WallpaperScreen wallpaperScreen, WallpaperScreenContainer wallpaperScreenContainer, ImageView it) {
        n.h(it, "it");
        SurfaceControl surfaceControl = wallpaperScreen.getSurfaceControl();
        Rect surfaceFrame = wallpaperScreen.getHolder().getSurfaceFrame();
        n.g(surfaceFrame, "getSurfaceFrame(...)");
        gVar.n0(surfaceControl, surfaceFrame);
        wallpaperScreenContainer.x();
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A K(Bitmap bitmap, WallpaperScreenContainer wallpaperScreenContainer, ImageView it) {
        n.h(it, "it");
        it.setImageBitmap(bitmap);
        if (!it.isLaidOut() || it.isLayoutRequested()) {
            it.addOnLayoutChangeListener(wallpaperScreenContainer.new f());
        } else {
            wallpaperScreenContainer.x();
        }
        return A.f21846a;
    }

    public static /* synthetic */ Object M(WallpaperScreenContainer wallpaperScreenContainer, Activity activity, x xVar, Bitmap bitmap, ImageView.ScaleType scaleType, p129m8.e eVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bitmap = null;
        }
        Bitmap bitmap2 = bitmap;
        if ((i10 & 8) != 0) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        return wallpaperScreenContainer.L(activity, xVar, bitmap2, scaleType, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A N(Bitmap bitmap, ImageView.ScaleType scaleType, final WallpaperScreenContainer wallpaperScreenContainer, x xVar, Activity activity, ImageView it) {
        n.h(it, "it");
        if (bitmap != null) {
            it.setImageBitmap(bitmap);
            it.setScaleType(scaleType);
            wallpaperScreenContainer.y();
        } else {
            wallpaperScreenContainer.w(xVar, activity, it, new p219v8.a() { // from class: t7.j
                @Override // p219v8.a
                public final Object invoke() {
                    return WallpaperScreenContainer.O(this.f27960q);
                }
            });
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A O(WallpaperScreenContainer wallpaperScreenContainer) {
        wallpaperScreenContainer.y();
        return A.f21846a;
    }

    private final void s(boolean z9) {
        WallpaperColors wallpaperColors;
        M0 m9;
        WallpaperColors wallpaperColors2 = this.f18561y;
        if (wallpaperColors2 == null || (wallpaperColors = this.f18562z) == null) {
            return;
        }
        if (!h.e(wallpaperColors, wallpaperColors2)) {
            wallpaperColors = null;
        }
        if (wallpaperColors == null || (m9 = this.f18556t) == null) {
            return;
        }
        if (!z9) {
            wallpaperColors2 = wallpaperColors;
        }
        h.j(m9, wallpaperColors2);
    }

    static /* synthetic */ void t(WallpaperScreenContainer wallpaperScreenContainer, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = wallpaperScreenContainer.isSelected();
        }
        wallpaperScreenContainer.s(z9);
    }

    private final void u(final boolean z9) {
        View view = this.f18557u;
        if (view != null) {
            view.animate().alpha(z9 ? 0.0f : 1.0f).setDuration(400L).setInterpolator(f18552B).start();
        }
        View view2 = this.f18558v;
        if (view2 != null) {
            view2.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? this.f18560x.x : 1.0f).scaleY(z9 ? this.f18560x.y : 1.0f).setDuration(400L).setInterpolator(f18552B).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t7.d
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) throws IOException {
                    WallpaperScreenContainer.v(this.f27943a, z9, valueAnimator);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(WallpaperScreenContainer wallpaperScreenContainer, boolean z9, ValueAnimator it) throws IOException {
        WallpaperScreen wallpaperScreen;
        n.h(it, "it");
        Object animatedValue = it.getAnimatedValue();
        n.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        if (!wallpaperScreenContainer.f18559w || (wallpaperScreen = wallpaperScreenContainer.f18554r) == null) {
            return;
        }
        if (!z9) {
            fFloatValue = 1 - fFloatValue;
        }
        wallpaperScreen.setAlpha(fFloatValue);
    }

    private final void w(x xVar, Activity activity, ImageView imageView, p219v8.a aVar) {
        com.android.wallpaper.asset.a aVarO;
        if (xVar == null || !G6.e.s(xVar) || (aVarO = xVar.o(getContext().getApplicationContext())) == null) {
            return;
        }
        aVarO.r(activity, imageView, H3.r.a(getContext(), R.attr.colorSecondary), true);
        if (!imageView.isLaidOut() || imageView.isLayoutRequested()) {
            imageView.addOnLayoutChangeListener(new c(aVar));
        } else {
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        WallpaperScreen wallpaperScreen = this.f18554r;
        if (wallpaperScreen != null) {
            wallpaperScreen.setBackgroundColor(0);
        }
        SurfaceView surfaceView = this.f18555s;
        if (surfaceView != null) {
            surfaceView.setVisibility(0);
        }
    }

    private final void y() {
        WallpaperScreen wallpaperScreen = this.f18553q;
        if (wallpaperScreen != null) {
            wallpaperScreen.setBackgroundColor(0);
        }
        SurfaceView surfaceView = this.f18555s;
        if (surfaceView != null) {
            surfaceView.setVisibility(0);
        }
    }

    public final void B(final Bitmap bitmap, final ImageView.ScaleType scaleType) {
        n.h(bitmap, "bitmap");
        n.h(scaleType, "scaleType");
        WallpaperScreen wallpaperScreen = this.f18553q;
        if (wallpaperScreen != null) {
            wallpaperScreen.h(new p219v8.l() { // from class: t7.h
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return WallpaperScreenContainer.C(bitmap, scaleType, (ImageView) obj);
                }
            });
        }
    }

    public final void D(final p177r6.g connection, boolean z9) throws IOException {
        n.h(connection, "connection");
        final WallpaperScreen wallpaperScreen = this.f18553q;
        if (wallpaperScreen != null) {
            wallpaperScreen.h(new p219v8.l() { // from class: t7.g
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return WallpaperScreenContainer.E(connection, wallpaperScreen, this, (ImageView) obj);
                }
            });
        }
        this.f18559w = !z9;
        G(this, false, 1, null);
    }

    public final void H(final p177r6.g connection) throws IOException {
        n.h(connection, "connection");
        this.f18559w = true;
        G(this, false, 1, null);
        final WallpaperScreen wallpaperScreen = this.f18554r;
        if (wallpaperScreen != null) {
            wallpaperScreen.h(new p219v8.l() { // from class: t7.e
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return WallpaperScreenContainer.I(connection, wallpaperScreen, this, (ImageView) obj);
                }
            });
        }
    }

    public final void J(final Bitmap bitmap) throws IOException {
        n.h(bitmap, "bitmap");
        this.f18559w = true;
        G(this, false, 1, null);
        WallpaperScreen wallpaperScreen = this.f18554r;
        if (wallpaperScreen != null) {
            wallpaperScreen.h(new p219v8.l() { // from class: t7.f
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return WallpaperScreenContainer.K(bitmap, this, (ImageView) obj);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L(Activity activity, x xVar, Bitmap bitmap, ImageView.ScaleType scaleType, p129m8.e eVar) {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i10 = gVar.f18588x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f18588x = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f18586v;
        Object objE = p139n8.b.e();
        int i11 = gVar.f18588x;
        if (i11 == 0) {
            r.b(obj);
            gVar.f18581q = this;
            gVar.f18582r = activity;
            gVar.f18583s = xVar;
            gVar.f18584t = bitmap;
            gVar.f18585u = scaleType;
            gVar.f18588x = 1;
            if (A(xVar, gVar) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scaleType = (ImageView.ScaleType) gVar.f18585u;
            bitmap = (Bitmap) gVar.f18584t;
            xVar = (x) gVar.f18583s;
            activity = (Activity) gVar.f18582r;
            this = (WallpaperScreenContainer) gVar.f18581q;
            r.b(obj);
        }
        final WallpaperScreenContainer wallpaperScreenContainer = this;
        final Activity activity2 = activity;
        final x xVar2 = xVar;
        final Bitmap bitmap2 = bitmap;
        final ImageView.ScaleType scaleType2 = scaleType;
        WallpaperScreen wallpaperScreen = wallpaperScreenContainer.f18553q;
        if (wallpaperScreen != null) {
            wallpaperScreen.h(new p219v8.l() { // from class: t7.i
                @Override // p219v8.l
                public final Object f(Object obj2) {
                    return WallpaperScreenContainer.N(bitmap2, scaleType2, wallpaperScreenContainer, xVar2, activity2, (ImageView) obj2);
                }
            });
        }
        return A.f21846a;
    }

    @Override // android.view.View
    protected void onFinishInflate() throws IOException {
        super.onFinishInflate();
        this.f18553q = (WallpaperScreen) findViewById(com.nothing.wallpaper.R.id.wallpaper_surface);
        this.f18554r = (WallpaperScreen) findViewById(com.nothing.wallpaper.R.id.wallpaper_surface_selected);
        this.f18555s = (SurfaceView) findViewById(com.nothing.wallpaper.R.id.workspace_surface);
        this.f18557u = findViewById(com.nothing.wallpaper.R.id.wallpaper_dimming_scrim);
        View viewRequireViewById = requireViewById(com.nothing.wallpaper.R.id.selected_view);
        y.a(this, new d(this, this, viewRequireViewById));
        this.f18558v = viewRequireViewById;
        G(this, false, 1, null);
    }

    public final void r(InterfaceC1163x lifecycleOwner, q previewUtils) {
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(previewUtils, "previewUtils");
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new b(lifecycleOwner, previewUtils, null), 3, null);
    }

    @Override // android.view.View
    public void setSelected(boolean z9) throws IOException {
        if (z9 != isSelected()) {
            if (H.M(this)) {
                u(z9);
            } else {
                View view = this.f18557u;
                if (view != null) {
                    view.setAlpha(z9 ? 0.0f : 1.0f);
                }
                View view2 = this.f18558v;
                if (view2 != null) {
                    view2.setAlpha(z9 ? 1.0f : 0.0f);
                }
                F(z9);
            }
            t(this, false, 1, null);
        }
        super.setSelected(z9);
    }

    public final void z(WallpaperColors color) {
        n.h(color, "color");
        this.f18561y = color;
        t(this, false, 1, null);
    }

    public /* synthetic */ WallpaperScreenContainer(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WallpaperScreenContainer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        this.f18560x = new PointF();
    }
}

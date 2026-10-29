package p084i3;

import H3.D;
import H3.k;
import H3.n;
import H3.r;
import H3.s;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.WallpaperColors;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceControlViewHost;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.AbstractActivityC1136v;
import com.android.wallpaper.asset.h;
import com.android.wallpaper.picker.TouchForwardingLayout;
import com.android.wallpaper.widget.BottomActionBar;
import com.bumptech.glide.Glide;
import com.bumptech.glide.MemoryCategory;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.material.tabs.TabLayout;
import com.nothing.wallpaper.R;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import p064g3.x;
import p074h3.H;
import p074h3.I;
import p074h3.InterfaceC1362b;
import p074h3.InterfaceC1364d;
import p074h3.J;
import p074h3.W;

/* JADX INFO: renamed from: i3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1422v extends n0 {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Executor f22097l0 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected f f22098O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected Point f22102S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    protected Point f22103T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    protected Point f22104U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    protected ImageView f22105V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    protected TouchForwardingLayout f22106W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    protected ConstraintLayout f22107X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    protected SurfaceView f22108Y;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected WallpaperColors f22110a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected W f22111b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected SurfaceView f22112c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    protected M0 f22113d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    protected SurfaceView f22114e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    protected M0 f22115f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    protected SubsamplingScaleImageView f22116g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    protected com.android.wallpaper.asset.a f22117h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    protected Future f22118i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    protected k f22119j0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    protected final AtomicInteger f22099P = new AtomicInteger(0);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final AtomicInteger f22100Q = new AtomicInteger(0);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    protected final H f22101R = I.a();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    protected boolean f22109Z = false;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    protected boolean f22120k0 = false;

    /* JADX INFO: renamed from: i3.v$a */
    class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f22121a;

        a(View view) {
            this.f22121a = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            C1422v c1422v = C1422v.this;
            c1422v.c1((CardView) c1422v.f22112c0.getParent());
            float radius = ((CardView) C1422v.this.f22108Y.getParent()).getRadius();
            H6.b.a(C1422v.this.f22112c0, radius);
            H6.b.a(C1422v.this.f22114e0, radius);
            H6.b.a(C1422v.this.f22108Y, radius);
            this.f22121a.removeOnLayoutChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: i3.v$b */
    class b implements BottomActionBar.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f22123a;

        b(View view) {
            this.f22123a = view;
        }

        @Override // com.android.wallpaper.widget.BottomActionBar.c
        public void a() {
            C1422v.this.f22107X.setImportantForAccessibility(4);
            this.f22123a.setImportantForAccessibility(4);
        }

        @Override // com.android.wallpaper.widget.BottomActionBar.c
        public void b() {
            C1422v.this.f22107X.setImportantForAccessibility(1);
            this.f22123a.setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: i3.v$c */
    class c extends SubsamplingScaleImageView.DefaultOnStateChangedListener {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            if (C1422v.this.f22099P.decrementAndGet() == 0) {
                C1422v.this.K1(false);
            }
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.DefaultOnStateChangedListener, com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onCenterChanged(PointF pointF, int i10) {
            super.onCenterChanged(pointF, i10);
            C1422v.this.f22066z.w(false);
            C1422v.this.f22099P.incrementAndGet();
            C1422v.this.f22116g0.postDelayed(new Runnable() { // from class: i3.w
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22134q.b();
                }
            }, 100L);
        }
    }

    /* JADX INFO: renamed from: i3.v$d */
    class d implements InterfaceC1362b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f22126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f22127b;

        d(boolean z9, Context context) {
            this.f22126a = z9;
            this.f22127b = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(WallpaperColors wallpaperColors) {
            C1422v.this.J1(wallpaperColors);
            if (C1422v.this.f22116g0.getAlpha() == 0.0f) {
                C1422v.this.x1();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Bitmap bitmap, boolean z9, Context context) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            boolean z10 = false;
            if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                new BitmapFactory.Options().inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            }
            if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                z10 = true;
            }
            final WallpaperColors wallpaperColorsFromBitmap = WallpaperColors.fromBitmap(bitmap);
            if (z10) {
                bitmap.recycle();
            }
            if (C1422v.this.f22100Q.decrementAndGet() == 0) {
                Handler.getMain().post(new Runnable() { // from class: i3.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22149q.e(wallpaperColorsFromBitmap);
                    }
                });
            }
            if (z9) {
                C1422v c1422v = C1422v.this;
                c1422v.f22111b0.j0(c1422v.f22062v.n(context), wallpaperColorsFromBitmap);
            }
        }

        @Override // p074h3.InterfaceC1362b.a
        public void a(Throwable th) {
            Log.w("ImagePreviewFragment", "Recalculate colors, crop and scale bitmap failed.", th);
        }

        @Override // p074h3.InterfaceC1362b.a
        public void b(final Bitmap bitmap) {
            C1422v.this.f22100Q.incrementAndGet();
            Executor executor = C1422v.f22097l0;
            final boolean z9 = this.f22126a;
            final Context context = this.f22127b;
            executor.execute(new Runnable() { // from class: i3.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22143q.f(bitmap, z9, context);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i3.v$e */
    class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ImageView imageView = C1422v.this.f22105V;
            if (imageView != null) {
                imageView.setImageBitmap(null);
            }
        }
    }

    /* JADX INFO: renamed from: i3.v$f */
    protected class f implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        protected Surface f22130q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        protected SurfaceControlViewHost f22131r;

        protected f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Point point) {
            if (C1422v.this.getActivity() == null) {
                return;
            }
            if (point == null) {
                C1422v.this.h1();
                return;
            }
            BottomActionBar bottomActionBar = C1422v.this.f22066z;
            if (bottomActionBar != null) {
                bottomActionBar.x();
            }
            C1422v c1422v = C1422v.this;
            c1422v.f22104U = point;
            c1422v.z1();
        }

        public void b() {
            SurfaceControlViewHost surfaceControlViewHost = this.f22131r;
            if (surfaceControlViewHost != null) {
                surfaceControlViewHost.release();
                this.f22131r = null;
            }
            C1422v.this.f22109Z = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            int i10;
            Context context = C1422v.this.getContext();
            AbstractActivityC1136v activity = C1422v.this.getActivity();
            if (context == null || activity == null || this.f22130q == surfaceHolder.getSurface()) {
                return;
            }
            this.f22130q = surfaceHolder.getSurface();
            SubsamplingScaleImageView subsamplingScaleImageView = C1422v.this.f22116g0;
            if (subsamplingScaleImageView != null) {
                subsamplingScaleImageView.recycle();
            }
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.fullscreen_wallpaper_preview, (ViewGroup) null);
            C1422v.this.f22116g0 = (SubsamplingScaleImageView) viewInflate.findViewById(R.id.full_res_image);
            C1422v.this.f22105V = (ImageView) viewInflate.findViewById(R.id.low_res_image);
            C1422v.this.f22105V.setRenderEffect(RenderEffect.createBlurEffect(150.0f, 150.0f, Shader.TileMode.CLAMP));
            C1422v.this.y1().j(C1422v.this.getActivity(), new com.android.wallpaper.asset.a.e() { // from class: i3.z
                @Override // com.android.wallpaper.asset.a.e
                public final void a(Point point) {
                    this.f22153a.c(point);
                }
            });
            float fN = D.n(context);
            int width = C1422v.this.f22108Y.getWidth();
            int height = C1422v.this.f22108Y.getHeight();
            C1422v c1422v = C1422v.this;
            if (c1422v.f22119j0.n(c1422v.requireActivity())) {
                i10 = width;
            } else {
                C1422v c1422v2 = C1422v.this;
                i10 = (int) (c1422v2.f22102S.x * (width / c1422v2.f22103T.x));
            }
            int i11 = (int) (i10 * fN);
            int i12 = (int) (height * fN);
            int i13 = (width - i11) / 2;
            int i14 = (height - i12) / 2;
            if (D.o(context)) {
                i13 *= -1;
            }
            ViewGroup.LayoutParams layoutParams = C1422v.this.f22108Y.getLayoutParams();
            layoutParams.width = i11;
            layoutParams.height = i12;
            C1422v.this.f22108Y.setX(i13);
            C1422v.this.f22108Y.setY(i14);
            C1422v.this.f22108Y.setLayoutParams(layoutParams);
            C1422v.this.f22108Y.requestLayout();
            C1422v.this.f22108Y.setEnableSurfaceClipping(true);
            C1422v.this.f22108Y.setClipBounds(new Rect(Math.abs(i13), Math.abs(i14), Math.abs(i13) + width, Math.abs(i14) + height));
            int iA = r.a(activity, android.R.attr.colorBackground);
            if (C1422v.this.f22118i0.isDone()) {
                try {
                    int iIntValue = ((x.a) C1422v.this.f22118i0.get()).a().intValue();
                    C1422v.this.L1();
                    if (iIntValue != 0) {
                        iA = iIntValue;
                    }
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
            C1422v.this.f22108Y.setResizeBackgroundColor(iA);
            C1422v.this.f22108Y.setBackgroundColor(iA);
            C1422v.this.f22105V.setBackgroundColor(iA);
            com.android.wallpaper.asset.a aVarY1 = C1422v.this.y1();
            C1422v c1422v3 = C1422v.this;
            aVarY1.q(activity, c1422v3.f22105V, iA, c1422v3.f22063w);
            viewInflate.measure(View.MeasureSpec.makeMeasureSpec(i11, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i12, BasicMeasure.EXACTLY));
            viewInflate.layout(0, 0, i11, i12);
            C1422v c1422v4 = C1422v.this;
            c1422v4.f22106W.setTargetView(c1422v4.f22116g0);
            b();
            SurfaceControlViewHost surfaceControlViewHost = new SurfaceControlViewHost(context, context.getDisplay(), C1422v.this.f22108Y.getHostToken());
            this.f22131r = surfaceControlViewHost;
            surfaceControlViewHost.setView(viewInflate, viewInflate.getWidth(), viewInflate.getHeight());
            C1422v.this.f22108Y.setChildSurfacePackage(this.f22131r.getSurfacePackage());
            C1422v c1422v5 = C1422v.this;
            c1422v5.f22109Z = true;
            c1422v5.l1(((Integer) c1422v5.f22057I.orElse(0)).intValue() == 0);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B1() {
        J1(this.f22111b0.Y(this.f22062v.n(getContext())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C1() {
        K1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D1(boolean z9, Bitmap bitmap) {
        if (getActivity() == null || this.f22116g0 == null) {
            return;
        }
        if (bitmap == null) {
            h1();
            return;
        }
        this.f22108Y.setBackgroundColor(0);
        SubsamplingScaleImageView subsamplingScaleImageView = this.f22116g0;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setImage(ImageSource.bitmap(bitmap));
            if (z9) {
                x1();
            } else {
                this.f22116g0.setAlpha(0.0f);
            }
            P1(y1() instanceof h);
            this.f22116g0.setOnStateChangedListener(new c());
            if (z9 && this.f22120k0) {
                return;
            }
            Handler.getMain().post(new Runnable() { // from class: i3.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22095q.C1();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean E1(View view, MotionEvent motionEvent) {
        BottomActionBar bottomActionBar = this.f22066z;
        if (bottomActionBar == null || bottomActionBar.G()) {
            return false;
        }
        this.f22066z.s();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F1(boolean z9) {
        if (z9) {
            return;
        }
        this.f22066z.z(BottomActionBar.d.EDIT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G1(View view) {
        Z0(null, this.f22062v);
    }

    private void H1(WallpaperColors wallpaperColors) {
        G6.h.j(this.f22113d0, wallpaperColors);
    }

    private void I1(WallpaperColors wallpaperColors) {
        G6.h.j(this.f22115f0, wallpaperColors);
    }

    private void M1() {
        this.f22108Y.getHolder().addCallback(this.f22098O);
    }

    private void N1() {
        this.f22114e0.setZOrderMediaOverlay(true);
        this.f22114e0.getHolder().addCallback(this.f22115f0);
    }

    private void O1() {
        this.f22112c0.setZOrderMediaOverlay(true);
        this.f22112c0.getHolder().addCallback(this.f22113d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void z1() {
        SubsamplingScaleImageView subsamplingScaleImageView;
        try {
            if (this.f22104U != null && (subsamplingScaleImageView = this.f22116g0) != null && !subsamplingScaleImageView.isImageLoaded()) {
                final boolean zA1 = A1(this.f22062v.n(getContext()));
                if (zA1) {
                    Handler.getMain().post(new Runnable() { // from class: i3.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f22088q.B1();
                        }
                    });
                }
                this.f22116g0.setMinimumScaleType(3);
                this.f22116g0.setPanLimit(1);
                Point point = new Point(this.f22104U);
                y1().f(point.x, point.y, new com.android.wallpaper.asset.a.d() { // from class: i3.s
                    @Override // com.android.wallpaper.asset.a.d
                    public final void a(Bitmap bitmap) {
                        this.f22089a.D1(zA1, bitmap);
                    }
                });
                this.f22116g0.setOnTouchListener(new View.OnTouchListener() { // from class: i3.t
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return this.f22093q.E1(view, motionEvent);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    protected boolean A1(String str) {
        return (str == null || this.f22111b0.Y(str) == null) ? false : true;
    }

    @Override // p084i3.n0, i3.L.b
    public void I() {
        AbstractActivityC1136v activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    protected void J1(WallpaperColors wallpaperColors) {
        this.f22066z.w(true);
        this.f22110a0 = wallpaperColors;
        this.f22050B.n((wallpaperColors == null || (1 & wallpaperColors.getColorHints()) == 0) ? n.c.LIGHT : n.c.DARK);
        com.nothing.wallpaper.common.log.c.d("ImagePreviewFragment", "onWallpaperColorsChanged :" + wallpaperColors);
        H1(this.f22110a0);
        I1(this.f22110a0);
    }

    protected void K1(boolean z9) {
        Context context = getContext();
        if (context == null) {
            Log.e("ImagePreviewFragment", "Got null context, skip recalculating colors");
            return;
        }
        InterfaceC1362b interfaceC1362bT = this.f22101R.t();
        if (this.f22104U == null) {
            return;
        }
        interfaceC1362bT.a(y1(), this.f22116g0.getScale(), v1(context, true), false, new d(z9, context));
    }

    protected void L1() {
        WallpaperColors wallpaperColorsC = G6.h.c(this.f22118i0);
        if (wallpaperColorsC != null) {
            this.f22120k0 = true;
            H1(wallpaperColorsC);
            I1(wallpaperColorsC);
        }
    }

    @Override // p084i3.n0
    protected int M0() {
        return R.layout.fragment_image_preview;
    }

    protected void P1(boolean z9) {
        Point point = new Point(this.f22108Y.getMeasuredWidth(), this.f22108Y.getMeasuredHeight());
        Rect rectJ = D.j(this.f22104U, point);
        if (z9 && this.f22119j0.n(requireActivity())) {
            if (D.o(requireContext())) {
                rectJ.offsetTo(this.f22104U.x - rectJ.width(), rectJ.top);
            } else {
                rectJ.offsetTo(0, rectJ.top);
            }
        }
        PointF pointF = new PointF(rectJ.centerX(), rectJ.centerY());
        float fI = D.i(new Point(rectJ.width(), rectJ.height()), point);
        this.f22116g0.setMaxScale(Math.max(8.0f, fI));
        this.f22116g0.setMinScale(fI);
        this.f22116g0.setScaleAndCenter(fI, pointF);
    }

    protected void Q1() {
        BottomActionBar bottomActionBar = this.f22066z;
        n0.e eVar = new n0.e(getContext());
        BottomActionBar.d dVar = BottomActionBar.d.INFORMATION;
        bottomActionBar.r(eVar, dVar);
        AbstractActivityC1136v activity = getActivity();
        J j9 = new J();
        if (activity == null || !(activity.isInMultiWindowMode() || j9.b(getContext()))) {
            this.f22066z.S(dVar, BottomActionBar.d.EDIT, BottomActionBar.d.APPLY);
        } else {
            this.f22066z.S(dVar, BottomActionBar.d.APPLY);
        }
        this.f22066z.P(BottomActionBar.d.APPLY, new View.OnClickListener() { // from class: i3.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22083q.G1(view);
            }
        });
    }

    @Override // p084i3.n0
    protected void a1(int i10) {
        Rect rectV1 = v1(getContext(), !this.f22119j0.l());
        float scale = this.f22116g0.getScale();
        Point point = this.f22102S;
        float fM = D.m(scale, rectV1, point.x, point.y);
        this.f22064x.u(getActivity(), this.f22062v, y1(), i10, this.f22116g0.getScale() * fM, new Rect((int) Math.floor(rectV1.left * fM), (int) Math.floor(rectV1.top * fM), (int) Math.floor(rectV1.right * fM), (int) Math.floor(rectV1.bottom * fM)), this.f22110a0, p064g3.n.f(this.f22056H));
    }

    @Override // p084i3.n0, com.android.wallpaper.picker.a, p084i3.C1395d
    protected void e0(BottomActionBar bottomActionBar) {
        super.e0(bottomActionBar);
        Q1();
        this.f22066z.setAccessibilityCallback(new b(getView().findViewById(R.id.separated_tabs_container)));
        this.f22066z.Q();
        this.f22066z.u();
        if (this.f22104U != null) {
            this.f22066z.x();
        }
    }

    @Override // p084i3.n0
    protected void l1(boolean z9) {
        int i10 = 8;
        this.f22112c0.setVisibility((z9 && this.f22109Z) ? 0 : 8);
        SurfaceView surfaceView = this.f22114e0;
        if (!z9 && this.f22109Z) {
            i10 = 0;
        }
        surfaceView.setVisibility(i10);
        this.f22050B.o(z9);
    }

    @Override // p084i3.n0, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context contextRequireContext = requireContext();
        this.f22117h0 = this.f22062v.d(contextRequireContext.getApplicationContext());
        this.f22118i0 = this.f22062v.b(contextRequireContext);
        this.f22111b0 = this.f22101R.f(contextRequireContext);
    }

    @Override // p084i3.n0, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        this.f22119j0 = this.f22101R.e(abstractActivityC1136vRequireActivity);
        s sVarA = s.a();
        this.f22103T = sVarA.e(abstractActivityC1136vRequireActivity.getWindowManager().getDefaultDisplay());
        this.f22102S = sVarA.e(this.f22119j0.i());
        ConstraintLayout constraintLayout = (ConstraintLayout) viewOnCreateView.findViewById(R.id.container);
        this.f22107X = constraintLayout;
        TouchForwardingLayout touchForwardingLayout = (TouchForwardingLayout) constraintLayout.findViewById(R.id.touch_forwarding_layout);
        this.f22106W = touchForwardingLayout;
        touchForwardingLayout.setForwardingEnabled(true);
        k1(viewOnCreateView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.f22107X);
        constraintSet.setDimensionRatio(this.f22106W.getId(), String.format(Locale.US, "%d:%d", Integer.valueOf(this.f22103T.x), Integer.valueOf(this.f22103T.y)));
        constraintSet.applyTo(this.f22107X);
        SurfaceView surfaceView = (SurfaceView) this.f22107X.findViewById(R.id.workspace_surface);
        this.f22112c0 = surfaceView;
        InterfaceC1364d.a aVar = InterfaceC1364d.a.HOME_SCREEN;
        Boolean bool = Boolean.FALSE;
        this.f22113d0 = I0(surfaceView, aVar, bool);
        SurfaceView surfaceView2 = (SurfaceView) this.f22107X.findViewById(R.id.lock_surface);
        this.f22114e0 = surfaceView2;
        this.f22115f0 = I0(surfaceView2, InterfaceC1364d.a.LOCK_SCREEN, bool);
        this.f22098O = w1();
        this.f22108Y = (SurfaceView) this.f22107X.findViewById(R.id.wallpaper_surface);
        this.f22112c0.setResizeBackgroundColor(r.a(getContext(), android.R.attr.colorBackground));
        this.f22050B.m(new n.b() { // from class: i3.q
            @Override // H3.n.b
            public final void a(boolean z9) {
                this.f22086a.F1(z9);
            }
        });
        e1((TabLayout) viewOnCreateView.findViewById(R.id.separated_tabs));
        viewOnCreateView.addOnLayoutChangeListener(new a(viewOnCreateView));
        M1();
        O1();
        N1();
        L1();
        Glide.get(abstractActivityC1136vRequireActivity).setMemoryCategory(MemoryCategory.LOW);
        return viewOnCreateView;
    }

    @Override // p084i3.n0, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroy() {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f22116g0;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.recycle();
        }
        this.f22115f0.b();
        this.f22098O.b();
        this.f22113d0.b();
        super.onDestroy();
    }

    @Override // p084i3.C1395d, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    protected Rect v1(Context context, boolean z9) {
        float scale = this.f22116g0.getScale();
        Context applicationContext = context.getApplicationContext();
        Rect rect = new Rect();
        this.f22116g0.visibleFileRect(rect);
        int measuredWidth = this.f22108Y.getMeasuredWidth();
        int measuredHeight = this.f22108Y.getMeasuredHeight();
        return D.f(applicationContext, new Point(measuredWidth, measuredHeight), D.h(applicationContext.getResources(), Math.max(measuredWidth, measuredHeight), Math.min(measuredWidth, measuredHeight), measuredWidth, measuredHeight), this.f22104U, rect, scale, z9);
    }

    protected f w1() {
        return new f();
    }

    protected void x1() {
        if (getActivity() == null || !isAdded()) {
            return;
        }
        long integer = getResources().getInteger(android.R.integer.config_shortAnimTime);
        this.f22116g0.setAlpha(0.0f);
        this.f22116g0.animate().alpha(1.0f).setInterpolator(n0.f22048N).setDuration(integer).setListener(new e());
    }

    protected com.android.wallpaper.asset.a y1() {
        return this.f22117h0;
    }
}

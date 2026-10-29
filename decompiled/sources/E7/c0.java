package E7;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.fragment.app.AbstractActivityC1136v;
import com.davemorrissey.labs.subscaleview.ImageViewState;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.nothing.wallpaper.effects.data.model.ViewScope;
import com.nothing.wallpaper.picker.edit.crop.view.EditSubsamplingScaleImageView;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f1403i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractActivityC1136v f1404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z f1405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p079h8.h f1406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p079h8.h f1407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EditSubsamplingScaleImageView f1408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EditSubsamplingScaleImageView f1409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f1410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PointF f1411h;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends SubsamplingScaleImageView.DefaultOnStateChangedListener {
        b() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.DefaultOnStateChangedListener, com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onCenterChanged(PointF newCenter, int i10) {
            kotlin.jvm.internal.n.h(newCenter, "newCenter");
            super.onCenterChanged(newCenter, i10);
            c0.this.r();
            p148o7.g gVarF = c0.this.f();
            if (gVarF != null) {
                gVarF.j0(newCenter, null, "onCenterChanged");
            }
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.DefaultOnStateChangedListener, com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onScaleChanged(float f10, int i10) {
            super.onScaleChanged(f10, i10);
            c0.this.r();
            p148o7.g gVarF = c0.this.f();
            if (gVarF != null) {
                gVarF.j0(null, Float.valueOf(f10), "onScaleChanged");
            }
        }
    }

    public c0(AbstractActivityC1136v activity, Z wallpaperHelper) {
        kotlin.jvm.internal.n.h(activity, "activity");
        kotlin.jvm.internal.n.h(wallpaperHelper, "wallpaperHelper");
        this.f1404a = activity;
        this.f1405b = wallpaperHelper;
        this.f1406c = p079h8.i.b(new p219v8.a() { // from class: E7.a0
            @Override // p219v8.a
            public final Object invoke() {
                return c0.e(this.f1392q);
            }
        });
        this.f1407d = p079h8.i.b(new p219v8.a() { // from class: E7.b0
            @Override // p219v8.a
            public final Object invoke() {
                return c0.m(this.f1393q);
            }
        });
        this.f1408e = wallpaperHelper.E();
        this.f1409f = wallpaperHelper.C();
        this.f1411h = new PointF(0.0f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H3.k e(c0 c0Var) {
        return p074h3.I.a().e(c0Var.f1404a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p148o7.g f() {
        return this.f1405b.v();
    }

    private final H3.k i() {
        return (H3.k) this.f1406c.getValue();
    }

    private final Point j() {
        return (Point) this.f1407d.getValue();
    }

    private final boolean k() {
        p064g3.x xVarF = this.f1405b.F();
        return xVarF != null && xVarF.s() && G6.e.i(xVarF);
    }

    private final void l(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        view.setTranslationX(i12);
        view.setTranslationY(i13);
        view.setLayoutParams(layoutParams);
        view.requestLayout();
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i11, BasicMeasure.EXACTLY));
        view.layout(0, 0, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point m(c0 c0Var) {
        return H3.s.a().e(c0Var.i().i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        ImageViewState state;
        if (this.f1405b.G() && (state = this.f1408e.getState()) != null) {
            this.f1409f.setScaleAndCenter(state.getScale(), state.getCenter());
        }
    }

    public final PointF g() {
        return this.f1411h;
    }

    public final float h() {
        return this.f1410g;
    }

    public final void n() {
        int i10;
        float fN = k() ? 1.0f : H3.D.n(this.f1404a);
        int i11 = j().x;
        int i12 = j().y;
        if (i().n(this.f1404a)) {
            i10 = i11;
        } else {
            i10 = (int) (j().x * (i11 / j().x));
        }
        int iCeil = (int) Math.ceil(i10 * fN);
        int iCeil2 = (int) Math.ceil(i12 * fN);
        int i13 = (i11 - iCeil) / 2;
        int i14 = (i12 - iCeil2) / 2;
        if (H3.D.o(this.f1404a)) {
            i13 *= -1;
        }
        int i15 = i13;
        com.nothing.wallpaper.common.log.c.k("WallpaperScaleHelper", "setAndGetSurfaceSize origWidth:" + i11 + " origHeight:" + i12 + " scale:" + fN);
        com.nothing.wallpaper.common.log.c.k("WallpaperScaleHelper", "setAndGetSurfaceSize     Width:" + iCeil + "     Height:" + iCeil2 + " left:" + i15 + " top:" + i14);
        l(this.f1408e, iCeil, iCeil2, i15, i14);
        l(this.f1409f, iCeil, iCeil2, i15, i14);
        p148o7.g gVarF = f();
        if (gVarF != null) {
            gVarF.n0(new Point(iCeil, iCeil2), fN);
        }
    }

    public final void o() {
        this.f1408e.setOnStateChangedListener(new b());
    }

    public final void p() {
        ViewScope viewScopeW;
        ViewScope viewScopeW2;
        this.f1409f.setMaxScale(this.f1408e.getMaxScale());
        this.f1409f.setMinScale(this.f1408e.getMinScale());
        p148o7.g gVarF = f();
        float scale = (gVarF == null || (viewScopeW2 = gVarF.W()) == null) ? 1.0f : viewScopeW2.getScale();
        p148o7.g gVarF2 = f();
        PointF center = (gVarF2 == null || (viewScopeW = gVarF2.W()) == null) ? null : viewScopeW.getCenter();
        if (center != null) {
            this.f1409f.setScaleAndCenter(scale, center);
            com.nothing.wallpaper.common.log.c.d("WallpaperScaleHelper", "setScaleAndCenter, depth scale=" + scale + " center=" + center);
            return;
        }
        this.f1409f.setScaleAndCenter(this.f1410g, this.f1411h);
        com.nothing.wallpaper.common.log.c.d("WallpaperScaleHelper", "setScaleAndCenter, depth default scale=" + this.f1410g + " center=" + this.f1411h);
    }

    public final void q(boolean z9) {
        ViewScope viewScopeW;
        ViewScope viewScopeW2;
        Point pointZ = this.f1405b.z();
        if (pointZ == null) {
            com.nothing.wallpaper.common.log.c.f("WallpaperScaleHelper", "setWallpaperZoomAndScroll but rawWallpaperSize is null.");
            return;
        }
        Point point = new Point(this.f1408e.getMeasuredWidth(), this.f1408e.getMeasuredHeight());
        Rect rectJ = H3.D.j(pointZ, point);
        com.nothing.wallpaper.common.log.c.d("WallpaperScaleHelper", "setWallpaperZoomAndScroll crop:" + point + " rawWallpaperSize:" + pointZ + " visibleRawWallpaperRect:" + rectJ);
        if (z9 && i().n(this.f1404a)) {
            if (H3.D.o(this.f1404a)) {
                rectJ.offsetTo(pointZ.x - rectJ.width(), rectJ.top);
            } else {
                rectJ.offsetTo(0, rectJ.top);
            }
        }
        this.f1411h = new PointF(rectJ.centerX(), rectJ.centerY());
        float fI = H3.D.i(new Point(rectJ.width(), rectJ.height()), point);
        this.f1410g = fI;
        this.f1408e.setMaxScale(B8.h.e(8.0f, fI));
        this.f1408e.setMinScale(this.f1410g);
        com.nothing.wallpaper.common.log.c.d("WallpaperScaleHelper", "setWallpaperZoomAndScroll, maxScale=" + this.f1408e.getMaxScale() + ",minScale=" + this.f1410g);
        p148o7.g gVarF = f();
        float scale = (gVarF == null || (viewScopeW2 = gVarF.W()) == null) ? 1.0f : viewScopeW2.getScale();
        p148o7.g gVarF2 = f();
        PointF center = (gVarF2 == null || (viewScopeW = gVarF2.W()) == null) ? null : viewScopeW.getCenter();
        if (center != null) {
            this.f1408e.setScaleAndCenter(scale, center);
            com.nothing.wallpaper.common.log.c.d("WallpaperScaleHelper", "setScaleAndCenter, scale=" + scale + " center=" + center);
            return;
        }
        this.f1408e.setScaleAndCenter(this.f1410g, this.f1411h);
        p148o7.g gVarF3 = f();
        if (gVarF3 != null) {
            gVarF3.j0(this.f1411h, Float.valueOf(this.f1410g), "init");
        }
        com.nothing.wallpaper.common.log.c.d("WallpaperScaleHelper", "setScaleAndCenter, default scale=" + this.f1410g + " center=" + this.f1411h);
    }
}

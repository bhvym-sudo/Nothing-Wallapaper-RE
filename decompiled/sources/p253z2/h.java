package p253z2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.o;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.android.launcher3.j;
import com.android.launcher3.views.f;
import com.android.launcher3.views.g;
import com.android.launcher3.w;
import java.util.Objects;
import p223w2.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final float f30663A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected final float f30664B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected final int[] f30665C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f30666D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Rect f30667E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected final Context f30668F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final g f30669G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f30670H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final ValueAnimator f30671I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    final ValueAnimator f30672J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f30673K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f30674L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Runnable f30675M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Runnable f30676N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f30677O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f30678P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f30679Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f30680R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Drawable f30681S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Drawable f30682T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Path f30683U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Drawable f30684V;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f30685q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ViewGroup.LayoutParams f30686r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ViewGroup f30687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f30688t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f30689u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f30690v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f30691w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final int f30692x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected final int f30693y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final float f30694z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (h.this.f30675M != null) {
                h.this.f30675M.run();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.f30673K = true;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (h.this.f30676N != null) {
                h.this.f30676N.run();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.f30674L = true;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final P0.c f30697a = new a("value");

        class a extends P0.c {
            a(String str) {
                super(str);
            }

            @Override // P0.c
            public /* bridge */ /* synthetic */ float a(Object obj) {
                o.a(obj);
                return c(null);
            }

            @Override // P0.c
            public /* bridge */ /* synthetic */ void b(Object obj, float f10) {
                o.a(obj);
                d(null, f10);
            }

            public float c(c cVar) {
                return c.a(cVar);
            }

            public void d(c cVar, float f10) {
                c.c(cVar, f10);
                c.b(cVar).invalidate();
            }
        }

        static /* bridge */ /* synthetic */ float a(c cVar) {
            throw null;
        }

        static /* bridge */ /* synthetic */ View b(c cVar) {
            throw null;
        }

        static /* bridge */ /* synthetic */ void c(c cVar, float f10) {
            throw null;
        }
    }

    public h(Context context, Drawable drawable, int i10, int i11, float f10, float f11, float f12) {
        this(context, k(context, drawable), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), i10, i11, f10, f11, f12);
    }

    private void g() {
        setTranslationX((this.f30677O - this.f30692x) + this.f30679Q);
        setTranslationY((this.f30678P - this.f30693y) + this.f30680R);
    }

    private static ImageView k(Context context, Drawable drawable) {
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(float f10, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        setScaleX(w.i(fFloatValue, f10, this.f30663A));
        setScaleY(w.i(fFloatValue, f10, this.f30663A));
        if (isAttachedToWindow()) {
            return;
        }
        valueAnimator.cancel();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f30670H = true;
        if (this.f30683U != null) {
            int iSave = canvas.save();
            canvas.clipPath(this.f30683U);
            this.f30681S.draw(canvas);
            canvas.translate(c.a(null), c.a(null));
            this.f30682T.draw(canvas);
            canvas.restoreToCount(iSave);
            this.f30684V.draw(canvas);
        }
    }

    public abstract void f(int i10, int i11, Runnable runnable, int i12);

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    public int getBlurSizeOutline() {
        return this.f30691w;
    }

    public View getContentView() {
        return this.f30685q;
    }

    public ViewGroup getContentViewParent() {
        return this.f30687s;
    }

    public Rect getDragRegion() {
        return this.f30667E;
    }

    public int getDragRegionHeight() {
        return this.f30667E.height();
    }

    public int getDragRegionWidth() {
        return this.f30667E.width();
    }

    public float getEndScale() {
        return this.f30663A;
    }

    public boolean getHasDragOffset() {
        return this.f30666D;
    }

    public float getInitialScale() {
        return this.f30694z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ ViewOverlay getOverlay() {
        return super.getOverlay();
    }

    public void h() {
        ValueAnimator valueAnimator = this.f30671I;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f30671I.cancel();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void i(Drawable drawable, int i10) {
        if (this.f30685q.getParent() == null) {
            return;
        }
        ImageView imageViewK = k(getContext(), drawable);
        imageViewK.setScaleType(ImageView.ScaleType.FIT_XY);
        imageViewK.measure(View.MeasureSpec.makeMeasureSpec(this.f30689u, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(this.f30690v, BasicMeasure.EXACTLY));
        imageViewK.layout(0, 0, this.f30689u, this.f30690v);
        addViewInLayout(imageViewK, 0, new FrameLayout.LayoutParams(this.f30689u, this.f30690v));
        AnimatorSet animatorSet = new AnimatorSet();
        FloatProperty floatProperty = j.f15626i;
        animatorSet.play(ObjectAnimator.ofFloat(imageViewK, floatProperty, 0.0f, 1.0f));
        animatorSet.play(ObjectAnimator.ofFloat(this.f30685q, floatProperty, 0.0f));
        animatorSet.play(ObjectAnimator.ofFloat(this.f30685q, j.f15619b, (this.f30689u * 1.0f) / drawable.getIntrinsicWidth()));
        animatorSet.setDuration(i10).setInterpolator(q.f28605h);
        animatorSet.start();
    }

    public void j(boolean z9) {
        if (this.f30685q == null || this.f30687s == null || this.f30688t < 0) {
            return;
        }
        Picture picture = new Picture();
        this.f30685q.draw(picture.beginRecording(this.f30689u, this.f30690v));
        picture.endRecording();
        View view = new View(this.f30668F);
        view.setBackground(new PictureDrawable(picture));
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f30689u, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(this.f30690v, BasicMeasure.EXACTLY));
        view.layout(this.f30685q.getLeft(), this.f30685q.getTop(), this.f30685q.getRight(), this.f30685q.getBottom());
        setClipToOutline(this.f30685q.getClipToOutline());
        setOutlineProvider(this.f30685q.getOutlineProvider());
        addViewInLayout(view, indexOfChild(this.f30685q), this.f30685q.getLayoutParams(), true);
        removeViewInLayout(this.f30685q);
        this.f30685q.setVisibility(4);
        this.f30685q.setLayoutParams(this.f30686r);
        if (z9) {
            this.f30687s.addView(this.f30685q, this.f30688t);
        }
        this.f30687s = null;
        this.f30688t = -1;
    }

    public boolean l() {
        return this.f30670H;
    }

    public void n(int i10, int i11) {
        if (i10 > 0 && i11 > 0 && this.f30677O > 0 && this.f30678P > 0 && this.f30683U != null) {
            throw null;
        }
        this.f30677O = i10;
        this.f30678P = i11;
        g();
    }

    public void o() {
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f30689u, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(this.f30690v, BasicMeasure.EXACTLY));
    }

    public void p() {
        if (getParent() != null) {
            this.f30669G.removeView(this);
        }
    }

    public void q(int i10, int i11) {
        this.f30669G.addView(this);
        g.c cVar = new g.c(this.f30689u, this.f30690v);
        cVar.f15756c = true;
        setLayoutParams(cVar);
        if (this.f30685q != null) {
            if (getHasDragOffset()) {
                this.f30685q.setVisibility(4);
            } else {
                this.f30685q.setVisibility(0);
            }
        }
        n(i10, i11);
        final ValueAnimator valueAnimator = this.f30671I;
        Objects.requireNonNull(valueAnimator);
        post(new Runnable() { // from class: z2.f
            @Override // java.lang.Runnable
            public final void run() {
                valueAnimator.start();
            }
        });
    }

    public void setDragRegion(Rect rect) {
        this.f30667E = rect;
    }

    public void setHasDragOffset(boolean z9) {
        this.f30666D = z9;
    }

    public void setOnScaleAnimEndCallback(Runnable runnable) {
        this.f30675M = runnable;
    }

    public void setOnShiftAnimEndCallback(Runnable runnable) {
        this.f30676N = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(Context context, View view, int i10, int i11, int i12, int i13, final float f10, float f11, float f12) {
        super(context);
        this.f30688t = -1;
        this.f30665C = new int[2];
        this.f30667E = null;
        this.f30670H = false;
        this.f30668F = context;
        this.f30669G = ((f) context).J();
        this.f30685q = view;
        this.f30689u = i10;
        this.f30690v = i11;
        this.f30686r = view.getLayoutParams();
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            this.f30687s = viewGroup;
            this.f30688t = viewGroup.indexOfChild(view);
            this.f30687s.removeView(view);
        }
        addView(view, new FrameLayout.LayoutParams(i10, i11));
        if (view.getScaleX() != 1.0f || view.getScaleY() != 1.0f) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        float f13 = i10;
        this.f30663A = (f12 + f13) / f13;
        setScaleX(f10);
        setScaleY(f10);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f30671I = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: z2.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f30661a.m(f10, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f30672J = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new b());
        setDragRegion(new Rect(0, 0, i10, i11));
        this.f30692x = i12;
        this.f30693y = i13;
        this.f30694z = f10;
        this.f30664B = f11;
        measure(View.MeasureSpec.makeMeasureSpec(i10, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i11, BasicMeasure.EXACTLY));
        this.f30691w = getResources().getDimensionPixelSize(com.android.launcher3.o.f15635b);
        setElevation(getResources().getDimension(com.android.launcher3.o.f15639f));
        setWillNotDraw(false);
    }
}

package com.nothing.wallpaper.picker.lockscreen.ui.view;

import E7.InterfaceC0769a;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.launcher3.AbstractC1219a;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class WidgetSettingsToast extends AbstractC1219a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.android.launcher3.views.f f19066r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.android.launcher3.f f19067s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f19068t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Paint f19069u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final float f19070v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Drawable f19071w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f19072x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private InterfaceC0769a f19073y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f19065z = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final Interpolator f19064A = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final void a(LockScreenFragment fragment, String text, boolean z9, boolean z10) {
            kotlin.jvm.internal.n.h(fragment, "fragment");
            kotlin.jvm.internal.n.h(text, "text");
            View viewInflate = fragment.getLayoutInflater().inflate(R.layout.widget_settings_toast, (ViewGroup) fragment.J(), false);
            kotlin.jvm.internal.n.f(viewInflate, "null cannot be cast to non-null type com.nothing.wallpaper.picker.lockscreen.ui.view.WidgetSettingsToast");
            WidgetSettingsToast widgetSettingsToast = (WidgetSettingsToast) viewInflate;
            fragment.J().addView(widgetSettingsToast);
            widgetSettingsToast.f19072x = z9;
            widgetSettingsToast.f19073y = fragment;
            widgetSettingsToast.setText(text);
            widgetSettingsToast.requestLayout();
            widgetSettingsToast.W(z10);
        }

        private a() {
        }
    }

    public static final class b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f19075b;

        public b(boolean z9) {
            this.f19075b = z9;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            float height;
            view.removeOnLayoutChangeListener(this);
            WidgetSettingsToast widgetSettingsToast = WidgetSettingsToast.this;
            if (widgetSettingsToast.f19072x) {
                WidgetSettingsToast widgetSettingsToast2 = WidgetSettingsToast.this;
                Context context = widgetSettingsToast2.getContext();
                kotlin.jvm.internal.n.g(context, "getContext(...)");
                height = widgetSettingsToast2.V(context, this.f19075b);
            } else {
                height = (WidgetSettingsToast.this.f19067s.f15543L - (this.f19075b ? WidgetSettingsToast.this.f19067s.f15577n - WidgetSettingsToast.this.f19067s.f15578o : 0)) - WidgetSettingsToast.this.getHeight();
            }
            widgetSettingsToast.setTranslationY(height);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WidgetSettingsToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final void T() {
        animate().alpha(0.0f).withEndAction(new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.i0
            @Override // java.lang.Runnable
            public final void run() {
                WidgetSettingsToast.U(this.f19111q);
            }
        }).setDuration(400L).setInterpolator(f19064A).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(WidgetSettingsToast widgetSettingsToast) {
        widgetSettingsToast.f19066r.J().removeView(widgetSettingsToast);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int V(Context context, boolean z9) {
        if (!p087i6.e.j()) {
            return this.f19067s.j() + this.f19067s.f15576m;
        }
        com.android.launcher3.f fVar = this.f19067s;
        return (this.f19067s.j() + (z9 ? fVar.f15578o : fVar.f15577n)) - this.f19067s.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(boolean z9) {
        float height;
        TextView textView = this.f19068t;
        if (textView == null) {
            kotlin.jvm.internal.n.r("tipTextView");
            textView = null;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = (this.f19072x ? 80 : 48) | 1;
        textView.setLayoutParams(layoutParams2);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new b(z9));
        } else {
            if (this.f19072x) {
                Context context = getContext();
                kotlin.jvm.internal.n.g(context, "getContext(...)");
                height = V(context, z9);
            } else {
                height = (this.f19067s.f15543L - (z9 ? this.f19067s.f15577n - this.f19067s.f15578o : 0)) - getHeight();
            }
            setTranslationY(height);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<WidgetSettingsToast, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setInterpolator(f19064A);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setText(String str) {
        TextView textView = this.f19068t;
        if (textView == null) {
            kotlin.jvm.internal.n.r("tipTextView");
            textView = null;
        }
        textView.setText(str);
    }

    @Override // com.android.launcher3.AbstractC1219a
    protected void I(boolean z9) {
        T();
        InterfaceC0769a interfaceC0769a = this.f19073y;
        if (interfaceC0769a == null) {
            kotlin.jvm.internal.n.r("bottomSheetCallback");
            interfaceC0769a = null;
        }
        interfaceC0769a.getLockScreenViewModel().B();
    }

    @Override // com.android.launcher3.AbstractC1219a
    protected boolean J(int i10) {
        return (i10 & 4) != 0;
    }

    @Override // F2.w
    public boolean h(MotionEvent ev) {
        kotlin.jvm.internal.n.h(ev, "ev");
        if (ev.getAction() == 1) {
            D(true);
        }
        return true;
    }

    @Override // F2.w
    public boolean k(MotionEvent ev) {
        kotlin.jvm.internal.n.h(ev, "ev");
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15492q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15492q = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        kotlin.jvm.internal.n.h(canvas, "canvas");
        super.onDraw(canvas);
        Drawable drawable = this.f19071w;
        if (drawable != null) {
            int width = (getWidth() / 2) - (drawable.getIntrinsicWidth() / 2);
            Rect rect = new Rect(width, 0, drawable.getIntrinsicWidth() + width, drawable.getIntrinsicHeight());
            if (!this.f19072x) {
                rect.offset(0, getHeight() - drawable.getIntrinsicHeight());
            }
            drawable.setBounds(rect);
            canvas.save();
            if (this.f19072x) {
                canvas.rotate(180.0f, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
            }
            drawable.draw(canvas);
            canvas.restore();
        }
        TextView textView = this.f19068t;
        TextView textView2 = null;
        if (textView == null) {
            kotlin.jvm.internal.n.r("tipTextView");
            textView = null;
        }
        int left = textView.getLeft();
        TextView textView3 = this.f19068t;
        if (textView3 == null) {
            kotlin.jvm.internal.n.r("tipTextView");
            textView3 = null;
        }
        int top = textView3.getTop();
        TextView textView4 = this.f19068t;
        if (textView4 == null) {
            kotlin.jvm.internal.n.r("tipTextView");
            textView4 = null;
        }
        int right = textView4.getRight();
        TextView textView5 = this.f19068t;
        if (textView5 == null) {
            kotlin.jvm.internal.n.r("tipTextView");
        } else {
            textView2 = textView5;
        }
        RectF rectF = new RectF(new Rect(left, top, right, textView2.getBottom()));
        rectF.offset(getPaddingLeft(), 0.0f);
        float f10 = this.f19070v;
        canvas.drawRoundRect(rectF, f10, f10, this.f19069u);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f19068t = (TextView) requireViewById(R.id.settings_tips);
    }

    public /* synthetic */ WidgetSettingsToast(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetSettingsToast(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        com.android.launcher3.views.f fVar = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(context);
        this.f19066r = fVar;
        this.f19067s = fVar.K();
        Paint paint = new Paint();
        paint.setColor(p171r0.a.b(context, R.color.material_color_on_primary));
        this.f19069u = paint;
        this.f19070v = getResources().getDimension(R.dimen.widget_settings_toast_radius);
        this.f19071w = p171r0.a.d(context, R.drawable.widget_setings_toast_bg);
        setWillNotDraw(false);
    }
}

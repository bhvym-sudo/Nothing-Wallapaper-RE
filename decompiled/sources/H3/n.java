package H3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.cardview.widget.CardView;
import com.android.wallpaper.picker.TouchForwardingLayout;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f2488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TouchForwardingLayout f2489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SurfaceView f2490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SurfaceView f2491d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f2496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f2497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f2498k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2499l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2501n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f2502o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2503p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2504q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f2505r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f2508u;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2492e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2493f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2494g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2495h = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f2506s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    c f2507t = c.DEFAULT;

    class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2509a;

        a(boolean z9) {
            this.f2509a = z9;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (n.this.f2505r != null) {
                n.this.f2505r.a(this.f2509a);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public interface b {
        void a(boolean z9);
    }

    public enum c {
        DEFAULT,
        DARK,
        LIGHT
    }

    public n(View view) {
        this.f2488a = view;
        this.f2489b = (TouchForwardingLayout) view.findViewById(R.id.touch_forwarding_layout);
        this.f2490c = (SurfaceView) view.findViewById(R.id.workspace_surface);
        this.f2491d = (SurfaceView) view.findViewById(R.id.lock_surface);
        this.f2508u = r.a(view.getContext(), android.R.attr.textColorPrimary);
    }

    public static /* synthetic */ void a(TextView textView, ImageButton imageButton, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (textView != null) {
            textView.setTextColor(iIntValue);
        }
        if (imageButton != null) {
            imageButton.setColorFilter(iIntValue);
        }
    }

    private void d(boolean z9) {
        int iA;
        c cVar;
        final TextView textView = (TextView) this.f2488a.findViewById(R.id.custom_toolbar_title);
        if (!z9 || (cVar = this.f2507t) == c.DEFAULT) {
            iA = r.a(this.f2488a.getContext(), android.R.attr.textColorPrimary);
        } else {
            iA = cVar == c.DARK ? this.f2488a.getContext().getColor(android.R.color.black) : this.f2488a.getContext().getColor(android.R.color.white);
        }
        if (iA == this.f2508u) {
            return;
        }
        final ImageButton imageButton = (ImageButton) ((Toolbar) this.f2488a.findViewById(R.id.toolbar)).getNavigationView();
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.f2508u, iA);
        valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: H3.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                n.a(textView, imageButton, valueAnimator);
            }
        });
        valueAnimatorOfArgb.start();
        this.f2508u = iA;
    }

    private int g() {
        return this.f2504q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(ValueAnimator valueAnimator) {
        ((CardView) this.f2490c.getParent()).setRadius(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void q(int i10, float f10, float f11, boolean z9) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, z9 ? -2 : -1);
        layoutParams.setMargins(0, Math.round(f10), 0, Math.round(f11));
        if (z9) {
            layoutParams.gravity = 80;
        }
        this.f2488a.findViewById(i10).setLayoutParams(layoutParams);
    }

    public void e() {
        this.f2488a.findViewById(R.id.bottom_actionbar).setTranslationY(this.f2492e ? this.f2501n : 0.0f);
    }

    public void f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, h(), 0, 0);
        this.f2488a.findViewById(R.id.section_header_container).setLayoutParams(layoutParams);
    }

    public int h() {
        return this.f2503p;
    }

    public boolean i() {
        Rect clipBounds = (this.f2506s ? this.f2490c : this.f2491d).getClipBounds();
        return clipBounds == null || clipBounds.width() == this.f2499l;
    }

    public boolean j() {
        return this.f2492e;
    }

    public void l(View view) {
        if (this.f2492e) {
            return;
        }
        if (this.f2493f) {
            view.findViewById(R.id.container).setPadding(0, 0, 0, 0);
            q(R.id.screen_preview_layout, 0.0f, 0.0f, false);
        } else {
            q(R.id.screen_preview_layout, h() + this.f2488a.findViewById(R.id.preview_header).getPaddingBottom(), g() + this.f2488a.getResources().getDimension(R.dimen.bottom_actions_height) + this.f2488a.getResources().getDimension(R.dimen.separated_tabs_height), false);
        }
        q(R.id.bottom_action_bar_container, 0.0f, g(), false);
        q(R.id.separated_tabs_container, 0.0f, g() + this.f2488a.getResources().getDimension(R.dimen.bottom_actions_height), true);
        f();
    }

    public void m(b bVar) {
        this.f2505r = bVar;
    }

    public void n(c cVar) {
        this.f2507t = cVar;
        d(this.f2492e);
    }

    public void o(boolean z9) {
        this.f2506s = z9;
    }

    public void p(boolean z9) {
        this.f2493f = z9;
    }

    public void r(WindowInsets windowInsets) {
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
        this.f2503p = insetsIgnoringVisibility.top;
        this.f2504q = insetsIgnoringVisibility.bottom;
    }

    public void s(boolean z9) {
        Rect rect = new Rect(0, 0, this.f2499l, this.f2500m);
        int i10 = this.f2499l;
        int i11 = this.f2500m;
        Rect rect2 = new Rect(i10 - 1, i11 - 1, i10, i11);
        if (z9) {
            if (this.f2506s) {
                this.f2490c.setClipBounds(rect);
            } else {
                this.f2491d.setClipBounds(rect);
            }
        } else if (this.f2506s) {
            this.f2490c.setClipBounds(rect2);
        } else {
            this.f2491d.setClipBounds(rect2);
        }
        this.f2495h = z9;
    }

    public void t(boolean z9) {
        if (z9 == this.f2492e) {
            return;
        }
        if (!this.f2494g) {
            int[] iArr = new int[2];
            this.f2489b.getLocationInWindow(iArr);
            Point pointE = s.a().e(this.f2488a.getDisplay());
            int i10 = pointE.x;
            int i11 = pointE.y;
            this.f2496i = (float) ((((double) i11) / 2.0d) - (((double) iArr[1]) + (((double) this.f2489b.getHeight()) / 2.0d)));
            this.f2497j = Math.max(i10 / this.f2489b.getWidth(), i11 / this.f2489b.getHeight());
            this.f2498k = ((CardView) this.f2490c.getParent()).getRadius();
            this.f2490c.setEnableSurfaceClipping(true);
            this.f2491d.setEnableSurfaceClipping(true);
            this.f2499l = this.f2490c.getWidth();
            this.f2500m = this.f2490c.getHeight();
            if (this.f2499l == 0) {
                this.f2499l = this.f2491d.getWidth();
                this.f2500m = this.f2491d.getHeight();
            }
            this.f2501n = g() + this.f2488a.getResources().getDimension(R.dimen.bottom_actions_height) + this.f2488a.getResources().getDimension(R.dimen.separated_tabs_height);
            this.f2502o = -(g() + this.f2488a.getResources().getDimension(R.dimen.fullscreen_preview_button_margin_bottom) + this.f2488a.getResources().getDimension(R.dimen.separated_tabs_height));
            this.f2494g = true;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z9 ? this.f2498k : 0.0f, z9 ? 0.0f : this.f2498k);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: H3.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f2485a.k(valueAnimator);
            }
        });
        if (!z9) {
            s(true);
        }
        float f10 = z9 ? this.f2497j : 1.0f;
        float f11 = z9 ? this.f2496i : 0.0f;
        float f12 = z9 ? this.f2501n : 0.0f;
        float f13 = z9 ? this.f2502o : 0.0f;
        View viewFindViewById = this.f2488a.findViewById(R.id.screen_preview_layout);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(viewFindViewById, "scaleX", f10), ObjectAnimator.ofFloat(viewFindViewById, "scaleY", f10), ObjectAnimator.ofFloat(viewFindViewById, "translationY", f11), ObjectAnimator.ofFloat(this.f2488a.findViewById(R.id.bottom_actionbar), "translationY", f12), ObjectAnimator.ofFloat(this.f2488a.findViewById(R.id.separated_tabs_container), "translationY", f12), ObjectAnimator.ofFloat(this.f2488a.findViewById(R.id.fullscreen_buttons_container), "translationY", f13), valueAnimatorOfFloat);
        animatorSet.addListener(new a(z9));
        animatorSet.start();
        d(z9);
        this.f2495h = true;
        if (z9) {
            ((Button) this.f2488a.findViewById(R.id.hide_ui_preview_button)).setText(i() ? R.string.hide_ui_preview_text : R.string.show_ui_preview_text);
        }
        this.f2492e = z9;
    }
}

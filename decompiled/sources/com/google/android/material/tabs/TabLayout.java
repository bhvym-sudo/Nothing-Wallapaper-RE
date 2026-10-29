package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.O;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.AbstractC1080l;
import androidx.core.view.H;
import androidx.core.view.z;
import androidx.core.widget.l;
import androidx.viewpager.widget.ViewPager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.material.internal.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p225w4.j;
import p225w4.k;

/* JADX INFO: loaded from: classes.dex */
@ViewPager.e
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final int f17254o0 = j.f28914k;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final B0.f f17255p0 = new B0.h(16);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f17256A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    ColorStateList f17257B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    ColorStateList f17258C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    ColorStateList f17259D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    Drawable f17260E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f17261F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    PorterDuff.Mode f17262G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    float f17263H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    float f17264I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    float f17265J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    final int f17266K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    int f17267L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final int f17268M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final int f17269N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f17270O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f17271P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    int f17272Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    int f17273R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f17274S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    int f17275T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    boolean f17276U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    boolean f17277V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    int f17278W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    int f17279a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    boolean f17280b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private com.google.android.material.tabs.c f17281c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final TimeInterpolator f17282d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private c f17283e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final ArrayList f17284f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private c f17285g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private ValueAnimator f17286h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    ViewPager f17287i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private g f17288j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private b f17289k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f17290l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f17291m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final B0.f f17292n0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f17293q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayList f17294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private f f17295s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final e f17296t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f17297u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f17298v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f17299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f17300x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f17301y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f17302z;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class b implements ViewPager.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f17304a;

        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f17287i0 == viewPager) {
                tabLayout.N(aVar2, this.f17304a);
            }
        }

        void b(boolean z9) {
            this.f17304a = z9;
        }
    }

    public interface c {
        void a(f fVar);

        void b(f fVar);

        void c(f fVar);
    }

    public interface d extends c {
    }

    class e extends LinearLayout {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        ValueAnimator f17306q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f17307r;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f17309a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f17310b;

            a(View view, View view2) {
                this.f17309a = view;
                this.f17310b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                e.this.j(this.f17309a, this.f17310b, valueAnimator.getAnimatedFraction());
            }
        }

        e(Context context) {
            super(context);
            this.f17307r = -1;
            setWillNotDraw(false);
        }

        private void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f17293q == -1) {
                tabLayout.f17293q = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.f17293q);
        }

        private void f(int i10) {
            if (TabLayout.this.f17291m0 == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i10);
                com.google.android.material.tabs.c cVar = TabLayout.this.f17281c0;
                TabLayout tabLayout = TabLayout.this;
                cVar.c(tabLayout, childAt, tabLayout.f17260E);
                TabLayout.this.f17293q = i10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(View view, View view2, float f10) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f17260E;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f17260E.getBounds().bottom);
            } else {
                com.google.android.material.tabs.c cVar = TabLayout.this.f17281c0;
                TabLayout tabLayout = TabLayout.this;
                cVar.d(tabLayout, view, view2, f10, tabLayout.f17260E);
            }
            H.X(this);
        }

        private void k(boolean z9, int i10, int i11) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f17293q == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.f17293q = i10;
            a aVar = new a(childAt, childAt2);
            if (!z9) {
                this.f17306q.removeAllUpdateListeners();
                this.f17306q.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f17306q = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.f17282d0);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        void c(int i10, int i11) {
            ValueAnimator valueAnimator = this.f17306q;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f17293q != i10) {
                this.f17306q.cancel();
            }
            k(true, i10, i11);
        }

        boolean d() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.f17260E.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f17260E.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.f17274S;
            if (i10 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i10 != 1) {
                height = 0;
                if (i10 != 2) {
                    iHeight = i10 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.f17260E.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f17260E.getBounds();
                TabLayout.this.f17260E.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.f17260E.draw(canvas);
            }
            super.draw(canvas);
        }

        void h(int i10, float f10) {
            TabLayout.this.f17293q = Math.round(i10 + f10);
            ValueAnimator valueAnimator = this.f17306q;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f17306q.cancel();
            }
            j(getChildAt(i10), getChildAt(i10 + 1), f10);
        }

        void i(int i10) {
            Rect bounds = TabLayout.this.f17260E.getBounds();
            TabLayout.this.f17260E.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
            super.onLayout(z9, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f17306q;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                k(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z9 = true;
            if (tabLayout.f17272Q == 1 || tabLayout.f17275T == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) n.c(getContext(), 16)) * 2)) {
                    boolean z10 = false;
                    for (int i13 = 0; i13 < childCount; i13++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z10 = true;
                        }
                    }
                    z9 = z10;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f17272Q = 0;
                    tabLayout2.V(false);
                }
                if (z9) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f17312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Drawable f17313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f17314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f17315d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f17317f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TabLayout f17319h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public h f17320i;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f17316e = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f17318g = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f17321j = -1;

        public View e() {
            return this.f17317f;
        }

        public Drawable f() {
            return this.f17313b;
        }

        public int g() {
            return this.f17316e;
        }

        public int h() {
            return this.f17318g;
        }

        public CharSequence i() {
            return this.f17314c;
        }

        public boolean j() {
            TabLayout tabLayout = this.f17319h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f17316e;
        }

        void k() {
            this.f17319h = null;
            this.f17320i = null;
            this.f17312a = null;
            this.f17313b = null;
            this.f17321j = -1;
            this.f17314c = null;
            this.f17315d = null;
            this.f17316e = -1;
            this.f17317f = null;
        }

        public void l() {
            TabLayout tabLayout = this.f17319h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.L(this);
        }

        void m(int i10) {
            this.f17316e = i10;
        }

        public f n(int i10) {
            TabLayout tabLayout = this.f17319h;
            if (tabLayout != null) {
                return o(tabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public f o(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f17315d) && !TextUtils.isEmpty(charSequence)) {
                this.f17320i.setContentDescription(charSequence);
            }
            this.f17314c = charSequence;
            p();
            return this;
        }

        void p() {
            h hVar = this.f17320i;
            if (hVar != null) {
                hVar.r();
            }
        }
    }

    public static class g implements ViewPager.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f17322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f17324c;

        public g(TabLayout tabLayout) {
            this.f17322a = new WeakReference(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i10, float f10, int i11) {
            TabLayout tabLayout = (TabLayout) this.f17322a.get();
            if (tabLayout != null) {
                int i12 = this.f17324c;
                boolean z9 = true;
                if (i12 == 2 && this.f17323b != 1) {
                    z9 = false;
                }
                if (i12 == 2 && this.f17323b == 0) {
                    z9 = false;
                }
                tabLayout.Q(i10, f10, z9, z9, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i10) {
            this.f17323b = this.f17324c;
            this.f17324c = i10;
            TabLayout tabLayout = (TabLayout) this.f17322a.get();
            if (tabLayout != null) {
                tabLayout.W(this.f17324c);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i10) {
            TabLayout tabLayout = (TabLayout) this.f17322a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f17324c;
            tabLayout.M(tabLayout.B(i10), i11 == 0 || (i11 == 2 && this.f17323b == 0));
        }

        void d() {
            this.f17324c = 0;
            this.f17323b = 0;
        }
    }

    public final class h extends LinearLayout {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private f f17326q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private TextView f17327r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ImageView f17328s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private View f17329t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private p245y4.a f17330u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private View f17331v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private TextView f17332w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private ImageView f17333x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Drawable f17334y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f17335z;

        class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f17336a;

            a(View view) {
                this.f17336a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f17336a.getVisibility() == 0) {
                    h.this.q(this.f17336a);
                }
            }
        }

        public h(Context context) {
            super(context);
            this.f17335z = 2;
            s(context);
            H.v0(this, TabLayout.this.f17297u, TabLayout.this.f17298v, TabLayout.this.f17299w, TabLayout.this.f17300x);
            setGravity(17);
            setOrientation(!TabLayout.this.f17276U ? 1 : 0);
            setClickable(true);
            H.w0(this, z.b(getContext(), 1002));
        }

        private void d(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float e(Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        private void f(boolean z9) {
            setClipChildren(z9);
            setClipToPadding(z9);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z9);
                viewGroup.setClipToPadding(z9);
            }
        }

        private FrameLayout g() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        private p245y4.a getBadge() {
            return this.f17330u;
        }

        private p245y4.a getOrCreateBadge() {
            if (this.f17330u == null) {
                this.f17330u = p245y4.a.d(getContext());
            }
            p();
            p245y4.a aVar = this.f17330u;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(Canvas canvas) {
            Drawable drawable = this.f17334y;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f17334y.draw(canvas);
            }
        }

        private FrameLayout i(View view) {
            if ((view == this.f17328s || view == this.f17327r) && p245y4.c.f30289a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        private boolean j() {
            return this.f17330u != null;
        }

        private void k() {
            ViewGroup viewGroup;
            if (p245y4.c.f30289a) {
                FrameLayout frameLayoutG = g();
                addView(frameLayoutG, 0);
                viewGroup = frameLayoutG;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(p225w4.g.f28853d, viewGroup, false);
            this.f17328s = imageView;
            viewGroup.addView(imageView, 0);
        }

        private void l() {
            ViewGroup viewGroup;
            if (p245y4.c.f30289a) {
                FrameLayout frameLayoutG = g();
                addView(frameLayoutG);
                viewGroup = frameLayoutG;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(p225w4.g.f28854e, viewGroup, false);
            this.f17327r = textView;
            viewGroup.addView(textView);
        }

        private void n(View view) {
            if (j() && view != null) {
                f(false);
                p245y4.c.a(this.f17330u, view, i(view));
                this.f17329t = view;
            }
        }

        private void o() {
            if (j()) {
                f(true);
                View view = this.f17329t;
                if (view != null) {
                    p245y4.c.b(this.f17330u, view);
                    this.f17329t = null;
                }
            }
        }

        private void p() {
            f fVar;
            f fVar2;
            if (j()) {
                if (this.f17331v != null) {
                    o();
                    return;
                }
                if (this.f17328s != null && (fVar2 = this.f17326q) != null && fVar2.f() != null) {
                    View view = this.f17329t;
                    ImageView imageView = this.f17328s;
                    if (view == imageView) {
                        q(imageView);
                        return;
                    } else {
                        o();
                        n(this.f17328s);
                        return;
                    }
                }
                if (this.f17327r == null || (fVar = this.f17326q) == null || fVar.h() != 1) {
                    o();
                    return;
                }
                View view2 = this.f17329t;
                TextView textView = this.f17327r;
                if (view2 == textView) {
                    q(textView);
                } else {
                    o();
                    n(this.f17327r);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(View view) {
            if (j() && view == this.f17329t) {
                p245y4.c.c(this.f17330u, view, i(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(Context context) {
            GradientDrawable gradientDrawable;
            int i10 = TabLayout.this.f17266K;
            if (i10 != 0) {
                Drawable drawableB = p060g.a.b(context, i10);
                this.f17334y = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.f17334y.setState(getDrawableState());
                }
            } else {
                this.f17334y = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (TabLayout.this.f17259D != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListA = L4.b.a(TabLayout.this.f17259D);
                boolean z9 = TabLayout.this.f17280b0;
                if (z9) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z9 ? null : gradientDrawable3);
            }
            H.k0(this, rippleDrawable);
            TabLayout.this.invalidate();
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0060  */
        private void v(TextView textView, ImageView imageView, boolean z9) {
            boolean z10;
            f fVar = this.f17326q;
            Drawable drawableMutate = (fVar == null || fVar.f() == null) ? null : p201u0.a.r(this.f17326q.f()).mutate();
            if (drawableMutate != null) {
                p201u0.a.o(drawableMutate, TabLayout.this.f17258C);
                PorterDuff.Mode mode = TabLayout.this.f17262G;
                if (mode != null) {
                    p201u0.a.p(drawableMutate, mode);
                }
            }
            f fVar2 = this.f17326q;
            CharSequence charSequenceI = fVar2 != null ? fVar2.i() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceI);
            if (textView != null) {
                if (!zIsEmpty) {
                    z10 = this.f17326q.f17318g == 1;
                }
                textView.setText(!zIsEmpty ? charSequenceI : null);
                textView.setVisibility(z10 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z10 = false;
            }
            if (z9 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iC = (z10 && imageView.getVisibility() == 0) ? (int) n.c(getContext(), 8) : 0;
                if (TabLayout.this.f17276U) {
                    if (iC != AbstractC1080l.a(marginLayoutParams)) {
                        AbstractC1080l.c(marginLayoutParams, iC);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iC != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iC;
                    AbstractC1080l.c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            f fVar3 = this.f17326q;
            CharSequence charSequence = fVar3 != null ? fVar3.f17315d : null;
            if (zIsEmpty) {
                charSequenceI = charSequence;
            }
            O.a(this, charSequenceI);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f17334y;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f17334y.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int getContentHeight() {
            View[] viewArr = {this.f17327r, this.f17328s, this.f17331v};
            int iMax = 0;
            int iMin = 0;
            boolean z9 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z9 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z9 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z9 = true;
                }
            }
            return iMax - iMin;
        }

        int getContentWidth() {
            View[] viewArr = {this.f17327r, this.f17328s, this.f17331v};
            int iMax = 0;
            int iMin = 0;
            boolean z9 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z9 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z9 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z9 = true;
                }
            }
            return iMax - iMin;
        }

        public f getTab() {
            return this.f17326q;
        }

        void m() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            C0.d dVarU0 = C0.d.U0(accessibilityNodeInfo);
            p245y4.a aVar = this.f17330u;
            if (aVar != null && aVar.isVisible()) {
                dVarU0.k0(this.f17330u.h());
            }
            dVarU0.j0(C0.d.f.a(0, 1, this.f17326q.g(), 1, false, isSelected()));
            if (isSelected()) {
                dVarU0.h0(false);
                dVarU0.Z(C0.d.a.f543i);
            }
            dVarU0.F0(getResources().getString(p225w4.i.f28885h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f17267L, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f17327r != null) {
                float f10 = TabLayout.this.f17263H;
                int i12 = this.f17335z;
                ImageView imageView = this.f17328s;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f17327r;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.f17265J;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f17327r.getTextSize();
                int lineCount = this.f17327r.getLineCount();
                int iD = l.d(this.f17327r);
                if (f10 != textSize || (iD >= 0 && i12 != iD)) {
                    if (TabLayout.this.f17275T != 1 || f10 <= textSize || lineCount != 1 || ((layout = this.f17327r.getLayout()) != null && e(layout, 0, f10) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f17327r.setTextSize(0, f10);
                        this.f17327r.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f17326q == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f17326q.l();
            return true;
        }

        final void r() {
            u();
            f fVar = this.f17326q;
            setSelected(fVar != null && fVar.j());
        }

        @Override // android.view.View
        public void setSelected(boolean z9) {
            isSelected();
            super.setSelected(z9);
            TextView textView = this.f17327r;
            if (textView != null) {
                textView.setSelected(z9);
            }
            ImageView imageView = this.f17328s;
            if (imageView != null) {
                imageView.setSelected(z9);
            }
            View view = this.f17331v;
            if (view != null) {
                view.setSelected(z9);
            }
        }

        void setTab(f fVar) {
            if (fVar != this.f17326q) {
                this.f17326q = fVar;
                r();
            }
        }

        final void t() {
            setOrientation(!TabLayout.this.f17276U ? 1 : 0);
            TextView textView = this.f17332w;
            if (textView == null && this.f17333x == null) {
                v(this.f17327r, this.f17328s, true);
            } else {
                v(textView, this.f17333x, false);
            }
        }

        final void u() {
            ViewParent parent;
            f fVar = this.f17326q;
            View viewE = fVar != null ? fVar.e() : null;
            if (viewE != null) {
                ViewParent parent2 = viewE.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(viewE);
                    }
                    View view = this.f17331v;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f17331v);
                    }
                    addView(viewE);
                }
                this.f17331v = viewE;
                TextView textView = this.f17327r;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f17328s;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f17328s.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewE.findViewById(R.id.text1);
                this.f17332w = textView2;
                if (textView2 != null) {
                    this.f17335z = l.d(textView2);
                }
                this.f17333x = (ImageView) viewE.findViewById(R.id.icon);
            } else {
                View view2 = this.f17331v;
                if (view2 != null) {
                    removeView(view2);
                    this.f17331v = null;
                }
                this.f17332w = null;
                this.f17333x = null;
            }
            if (this.f17331v == null) {
                if (this.f17328s == null) {
                    k();
                }
                if (this.f17327r == null) {
                    l();
                    this.f17335z = l.d(this.f17327r);
                }
                l.o(this.f17327r, TabLayout.this.f17301y);
                if (!isSelected() || TabLayout.this.f17256A == -1) {
                    l.o(this.f17327r, TabLayout.this.f17302z);
                } else {
                    l.o(this.f17327r, TabLayout.this.f17256A);
                }
                ColorStateList colorStateList = TabLayout.this.f17257B;
                if (colorStateList != null) {
                    this.f17327r.setTextColor(colorStateList);
                }
                v(this.f17327r, this.f17328s, true);
                p();
                d(this.f17328s);
                d(this.f17327r);
            } else {
                TextView textView3 = this.f17332w;
                if (textView3 != null || this.f17333x != null) {
                    v(textView3, this.f17333x, false);
                }
            }
            if (fVar == null || TextUtils.isEmpty(fVar.f17315d)) {
                return;
            }
            setContentDescription(fVar.f17315d);
        }
    }

    public static class i implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewPager f17338a;

        public i(ViewPager viewPager) {
            this.f17338a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(f fVar) {
            this.f17338a.setCurrentItem(fVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(f fVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p225w4.a.f28691Z);
    }

    private void A() {
        if (this.f17286h0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f17286h0 = valueAnimator;
            valueAnimator.setInterpolator(this.f17282d0);
            this.f17286h0.setDuration(this.f17273R);
            this.f17286h0.addUpdateListener(new a());
        }
    }

    private boolean C() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void K(int i10) {
        h hVar = (h) this.f17296t.getChildAt(i10);
        this.f17296t.removeViewAt(i10);
        if (hVar != null) {
            hVar.m();
            this.f17292n0.release(hVar);
        }
        requestLayout();
    }

    private void S(ViewPager viewPager, boolean z9, boolean z10) {
        ViewPager viewPager2 = this.f17287i0;
        if (viewPager2 != null) {
            g gVar = this.f17288j0;
            if (gVar != null) {
                viewPager2.D(gVar);
            }
            b bVar = this.f17289k0;
            if (bVar != null) {
                this.f17287i0.C(bVar);
            }
        }
        c cVar = this.f17285g0;
        if (cVar != null) {
            I(cVar);
            this.f17285g0 = null;
        }
        if (viewPager != null) {
            this.f17287i0 = viewPager;
            if (this.f17288j0 == null) {
                this.f17288j0 = new g(this);
            }
            this.f17288j0.d();
            viewPager.b(this.f17288j0);
            i iVar = new i(viewPager);
            this.f17285g0 = iVar;
            g(iVar);
            viewPager.getAdapter();
            if (this.f17289k0 == null) {
                this.f17289k0 = new b();
            }
            this.f17289k0.b(z9);
            viewPager.a(this.f17289k0);
            O(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f17287i0 = null;
            N(null, false);
        }
        this.f17290l0 = z10;
    }

    private void T() {
        int size = this.f17294r.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f17294r.get(i10)).p();
        }
    }

    private void U(LinearLayout.LayoutParams layoutParams) {
        if (this.f17275T == 1 && this.f17272Q == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private int getDefaultHeight() {
        int size = this.f17294r.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = (f) this.f17294r.get(i10);
            if (fVar != null && fVar.f() != null && !TextUtils.isEmpty(fVar.i())) {
                return !this.f17276U ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f17268M;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f17275T;
        if (i11 == 0 || i11 == 2) {
            return this.f17270O;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f17296t.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void l(f fVar) {
        h hVar = fVar.f17320i;
        hVar.setSelected(false);
        hVar.setActivated(false);
        this.f17296t.addView(hVar, fVar.g(), u());
    }

    private void m(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void n(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() == null || !H.M(this) || this.f17296t.d()) {
            O(i10, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iQ = q(i10, 0.0f);
        if (scrollX != iQ) {
            A();
            this.f17286h0.setIntValues(scrollX, iQ);
            this.f17286h0.start();
        }
        this.f17296t.c(i10, this.f17273R);
    }

    private void o(int i10) {
        if (i10 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i10 == 1) {
            this.f17296t.setGravity(1);
            return;
        } else if (i10 != 2) {
            return;
        }
        this.f17296t.setGravity(8388611);
    }

    private void p() {
        int i10 = this.f17275T;
        H.v0(this.f17296t, (i10 == 0 || i10 == 2) ? Math.max(0, this.f17271P - this.f17297u) : 0, 0, 0, 0);
        int i11 = this.f17275T;
        if (i11 == 0) {
            o(this.f17272Q);
        } else if (i11 == 1 || i11 == 2) {
            if (this.f17272Q == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f17296t.setGravity(1);
        }
        V(true);
    }

    private int q(int i10, float f10) {
        View childAt;
        int i11 = this.f17275T;
        if ((i11 != 0 && i11 != 2) || (childAt = this.f17296t.getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < this.f17296t.getChildCount() ? this.f17296t.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        return H.v(this) == 0 ? left + i13 : left - i13;
    }

    private void s(f fVar, int i10) {
        fVar.m(i10);
        this.f17294r.add(i10, fVar);
        int size = this.f17294r.size();
        int i11 = -1;
        for (int i12 = i10 + 1; i12 < size; i12++) {
            if (((f) this.f17294r.get(i12)).g() == this.f17293q) {
                i11 = i12;
            }
            ((f) this.f17294r.get(i12)).m(i12);
        }
        this.f17293q = i11;
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f17296t.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f17296t.getChildAt(i11);
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof h) {
                        ((h) childAt).u();
                    }
                }
                i11++;
            }
        }
    }

    private static ColorStateList t(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private LinearLayout.LayoutParams u() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        U(layoutParams);
        return layoutParams;
    }

    private h w(f fVar) {
        B0.f fVar2 = this.f17292n0;
        h hVar = fVar2 != null ? (h) fVar2.acquire() : null;
        if (hVar == null) {
            hVar = new h(getContext());
        }
        hVar.setTab(fVar);
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f17315d)) {
            hVar.setContentDescription(fVar.f17314c);
            return hVar;
        }
        hVar.setContentDescription(fVar.f17315d);
        return hVar;
    }

    private void x(f fVar) {
        for (int size = this.f17284f0.size() - 1; size >= 0; size--) {
            ((c) this.f17284f0.get(size)).a(fVar);
        }
    }

    private void y(f fVar) {
        for (int size = this.f17284f0.size() - 1; size >= 0; size--) {
            ((c) this.f17284f0.get(size)).b(fVar);
        }
    }

    private void z(f fVar) {
        for (int size = this.f17284f0.size() - 1; size >= 0; size--) {
            ((c) this.f17284f0.get(size)).c(fVar);
        }
    }

    public f B(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return (f) this.f17294r.get(i10);
    }

    public boolean D() {
        return this.f17277V;
    }

    public f E() {
        f fVarV = v();
        fVarV.f17319h = this;
        fVarV.f17320i = w(fVarV);
        if (fVarV.f17321j != -1) {
            fVarV.f17320i.setId(fVarV.f17321j);
        }
        return fVarV;
    }

    void F() {
        H();
    }

    protected boolean G(f fVar) {
        return f17255p0.release(fVar);
    }

    public void H() {
        for (int childCount = this.f17296t.getChildCount() - 1; childCount >= 0; childCount--) {
            K(childCount);
        }
        Iterator it = this.f17294r.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            it.remove();
            fVar.k();
            G(fVar);
        }
        this.f17295s = null;
    }

    public void I(c cVar) {
        this.f17284f0.remove(cVar);
    }

    public void J(d dVar) {
        I(dVar);
    }

    public void L(f fVar) {
        M(fVar, true);
    }

    public void M(f fVar, boolean z9) {
        f fVar2 = this.f17295s;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                x(fVar);
                n(fVar.g());
                return;
            }
            return;
        }
        int iG = fVar != null ? fVar.g() : -1;
        if (z9) {
            if ((fVar2 == null || fVar2.g() == -1) && iG != -1) {
                O(iG, 0.0f, true);
            } else {
                n(iG);
            }
            if (iG != -1) {
                setSelectedTabView(iG);
            }
        }
        this.f17295s = fVar;
        if (fVar2 != null && fVar2.f17319h != null) {
            z(fVar2);
        }
        if (fVar != null) {
            y(fVar);
        }
    }

    void N(androidx.viewpager.widget.a aVar, boolean z9) {
        F();
    }

    public void O(int i10, float f10, boolean z9) {
        P(i10, f10, z9, true);
    }

    public void P(int i10, float f10, boolean z9, boolean z10) {
        Q(i10, f10, z9, z10, true);
    }

    void Q(int i10, float f10, boolean z9, boolean z10, boolean z11) {
        int iRound = Math.round(i10 + f10);
        if (iRound < 0 || iRound >= this.f17296t.getChildCount()) {
            return;
        }
        if (z10) {
            this.f17296t.h(i10, f10);
        }
        ValueAnimator valueAnimator = this.f17286h0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f17286h0.cancel();
        }
        int iQ = q(i10, f10);
        int scrollX = getScrollX();
        boolean z12 = (i10 < getSelectedTabPosition() && iQ >= scrollX) || (i10 > getSelectedTabPosition() && iQ <= scrollX) || i10 == getSelectedTabPosition();
        if (H.v(this) == 1) {
            z12 = (i10 < getSelectedTabPosition() && iQ <= scrollX) || (i10 > getSelectedTabPosition() && iQ >= scrollX) || i10 == getSelectedTabPosition();
        }
        if (z12 || this.f17291m0 == 1 || z11) {
            if (i10 < 0) {
                iQ = 0;
            }
            scrollTo(iQ, 0);
        }
        if (z9) {
            setSelectedTabView(iRound);
        }
    }

    public void R(ViewPager viewPager, boolean z9) {
        S(viewPager, z9, false);
    }

    void V(boolean z9) {
        for (int i10 = 0; i10 < this.f17296t.getChildCount(); i10++) {
            View childAt = this.f17296t.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            U((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z9) {
                childAt.requestLayout();
            }
        }
    }

    void W(int i10) {
        this.f17291m0 = i10;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m(view);
    }

    public void g(c cVar) {
        if (this.f17284f0.contains(cVar)) {
            return;
        }
        this.f17284f0.add(cVar);
    }

    public int getSelectedTabPosition() {
        f fVar = this.f17295s;
        if (fVar != null) {
            return fVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f17294r.size();
    }

    public int getTabGravity() {
        return this.f17272Q;
    }

    public ColorStateList getTabIconTint() {
        return this.f17258C;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f17279a0;
    }

    public int getTabIndicatorGravity() {
        return this.f17274S;
    }

    int getTabMaxWidth() {
        return this.f17267L;
    }

    public int getTabMode() {
        return this.f17275T;
    }

    public ColorStateList getTabRippleColor() {
        return this.f17259D;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f17260E;
    }

    public ColorStateList getTabTextColors() {
        return this.f17257B;
    }

    public void h(d dVar) {
        g(dVar);
    }

    public void i(f fVar) {
        k(fVar, this.f17294r.isEmpty());
    }

    public void j(f fVar, int i10, boolean z9) {
        if (fVar.f17319h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        s(fVar, i10);
        l(fVar);
        if (z9) {
            fVar.l();
        }
    }

    public void k(f fVar, boolean z9) {
        j(fVar, this.f17294r.size(), z9);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        N4.i.e(this);
        if (this.f17287i0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                S((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f17290l0) {
            setupWithViewPager(null);
            this.f17290l0 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f17296t.getChildCount(); i10++) {
            View childAt = this.f17296t.getChildAt(i10);
            if (childAt instanceof h) {
                ((h) childAt).h(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0.d.U0(accessibilityNodeInfo).i0(C0.d.e.a(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return C() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int iRound = Math.round(n.c(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), BasicMeasure.EXACTLY);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i11) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int iC = this.f17269N;
            if (iC <= 0) {
                iC = (int) (size - n.c(getContext(), 56));
            }
            this.f17267L = iC;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i12 = this.f17275T;
            if (i12 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i12 != 1) {
                if (i12 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), BasicMeasure.EXACTLY), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || C()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void r() {
        this.f17284f0.clear();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        N4.i.d(this, f10);
    }

    public void setInlineLabel(boolean z9) {
        if (this.f17276U != z9) {
            this.f17276U = z9;
            for (int i10 = 0; i10 < this.f17296t.getChildCount(); i10++) {
                View childAt = this.f17296t.getChildAt(i10);
                if (childAt instanceof h) {
                    ((h) childAt).t();
                }
            }
            p();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A();
        this.f17286h0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = p201u0.a.r(drawable).mutate();
        this.f17260E = drawableMutate;
        com.google.android.material.drawable.a.k(drawableMutate, this.f17261F);
        int intrinsicHeight = this.f17278W;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f17260E.getIntrinsicHeight();
        }
        this.f17296t.i(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f17261F = i10;
        com.google.android.material.drawable.a.k(this.f17260E, i10);
        V(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f17274S != i10) {
            this.f17274S = i10;
            H.X(this.f17296t);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f17278W = i10;
        this.f17296t.i(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f17272Q != i10) {
            this.f17272Q = i10;
            p();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f17258C != colorStateList) {
            this.f17258C = colorStateList;
            T();
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(p060g.a.a(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.f17279a0 = i10;
        if (i10 == 0) {
            this.f17281c0 = new com.google.android.material.tabs.c();
            return;
        }
        if (i10 == 1) {
            this.f17281c0 = new com.google.android.material.tabs.a();
        } else {
            if (i10 == 2) {
                this.f17281c0 = new com.google.android.material.tabs.b();
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z9) {
        this.f17277V = z9;
        this.f17296t.g();
        H.X(this.f17296t);
    }

    public void setTabMode(int i10) {
        if (i10 != this.f17275T) {
            this.f17275T = i10;
            p();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f17259D != colorStateList) {
            this.f17259D = colorStateList;
            for (int i10 = 0; i10 < this.f17296t.getChildCount(); i10++) {
                View childAt = this.f17296t.getChildAt(i10);
                if (childAt instanceof h) {
                    ((h) childAt).s(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(p060g.a.a(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f17257B != colorStateList) {
            this.f17257B = colorStateList;
            T();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        N(aVar, false);
    }

    public void setUnboundedRipple(boolean z9) {
        if (this.f17280b0 != z9) {
            this.f17280b0 = z9;
            for (int i10 = 0; i10 < this.f17296t.getChildCount(); i10++) {
                View childAt = this.f17296t.getChildAt(i10);
                if (childAt instanceof h) {
                    ((h) childAt).s(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        R(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    protected f v() {
        f fVar = (f) f17255p0.acquire();
        return fVar == null ? new f() : fVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f17254o0;
        super(Q4.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f17293q = -1;
        this.f17294r = new ArrayList();
        this.f17256A = -1;
        this.f17261F = 0;
        this.f17267L = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.f17278W = -1;
        this.f17284f0 = new ArrayList();
        this.f17292n0 = new B0.g(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context2);
        this.f17296t = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = k.f29258i6;
        int i12 = k.f29006H6;
        TypedArray typedArrayI = com.google.android.material.internal.k.i(context2, attributeSet, iArr, i10, i11, i12);
        ColorStateList colorStateListF = com.google.android.material.drawable.a.f(getBackground());
        if (colorStateListF != null) {
            N4.h hVar = new N4.h();
            hVar.V(colorStateListF);
            hVar.K(context2);
            hVar.U(H.r(this));
            H.k0(this, hVar);
        }
        setSelectedTabIndicator(K4.c.d(context2, typedArrayI, k.f29318o6));
        setSelectedTabIndicatorColor(typedArrayI.getColor(k.f29348r6, 0));
        eVar.i(typedArrayI.getDimensionPixelSize(k.f29378u6, -1));
        setSelectedTabIndicatorGravity(typedArrayI.getInt(k.f29368t6, 0));
        setTabIndicatorAnimationMode(typedArrayI.getInt(k.f29338q6, 0));
        setTabIndicatorFullWidth(typedArrayI.getBoolean(k.f29358s6, true));
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(k.f29428z6, 0);
        this.f17300x = dimensionPixelSize;
        this.f17299w = dimensionPixelSize;
        this.f17298v = dimensionPixelSize;
        this.f17297u = dimensionPixelSize;
        this.f17297u = typedArrayI.getDimensionPixelSize(k.f28956C6, dimensionPixelSize);
        this.f17298v = typedArrayI.getDimensionPixelSize(k.f28966D6, this.f17298v);
        this.f17299w = typedArrayI.getDimensionPixelSize(k.f28946B6, this.f17299w);
        this.f17300x = typedArrayI.getDimensionPixelSize(k.f28936A6, this.f17300x);
        if (com.google.android.material.internal.k.g(context2)) {
            this.f17301y = p225w4.a.f28697c0;
        } else {
            this.f17301y = p225w4.a.f28693a0;
        }
        int resourceId = typedArrayI.getResourceId(i12, j.f28907d);
        this.f17302z = resourceId;
        int[] iArr2 = p050f.j.f20498B2;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr2);
        try {
            int i13 = p050f.j.f20502C2;
            this.f17263H = typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, 0);
            int i14 = p050f.j.f20514F2;
            this.f17257B = K4.c.a(context2, typedArrayObtainStyledAttributes, i14);
            typedArrayObtainStyledAttributes.recycle();
            int i15 = k.f28986F6;
            if (typedArrayI.hasValue(i15)) {
                this.f17256A = typedArrayI.getResourceId(i15, resourceId);
            }
            int i16 = this.f17256A;
            if (i16 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i16, iArr2);
                try {
                    this.f17264I = typedArrayObtainStyledAttributes2.getDimensionPixelSize(i13, (int) this.f17263H);
                    ColorStateList colorStateListA = K4.c.a(context2, typedArrayObtainStyledAttributes2, i14);
                    if (colorStateListA != null) {
                        this.f17257B = t(this.f17257B.getDefaultColor(), colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            int i17 = k.f29016I6;
            if (typedArrayI.hasValue(i17)) {
                this.f17257B = K4.c.a(context2, typedArrayI, i17);
            }
            int i18 = k.f28996G6;
            if (typedArrayI.hasValue(i18)) {
                this.f17257B = t(this.f17257B.getDefaultColor(), typedArrayI.getColor(i18, 0));
            }
            this.f17258C = K4.c.a(context2, typedArrayI, k.f29298m6);
            this.f17262G = n.h(typedArrayI.getInt(k.f29308n6, -1), null);
            this.f17259D = K4.c.a(context2, typedArrayI, k.f28976E6);
            this.f17273R = typedArrayI.getInt(k.f29328p6, 300);
            this.f17282d0 = I4.f.g(context2, p225w4.a.f28676K, p235x4.a.f29940b);
            this.f17268M = typedArrayI.getDimensionPixelSize(k.f29408x6, -1);
            this.f17269N = typedArrayI.getDimensionPixelSize(k.f29398w6, -1);
            this.f17266K = typedArrayI.getResourceId(k.f29268j6, 0);
            this.f17271P = typedArrayI.getDimensionPixelSize(k.f29278k6, 0);
            this.f17275T = typedArrayI.getInt(k.f29418y6, 1);
            this.f17272Q = typedArrayI.getInt(k.f29288l6, 0);
            this.f17276U = typedArrayI.getBoolean(k.f29388v6, false);
            this.f17280b0 = typedArrayI.getBoolean(k.f29025J6, false);
            typedArrayI.recycle();
            Resources resources = getResources();
            this.f17265J = resources.getDimensionPixelSize(p225w4.c.f28768g);
            this.f17270O = resources.getDimensionPixelSize(p225w4.c.f28766f);
            p();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        m(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f17283e0;
        if (cVar2 != null) {
            I(cVar2);
        }
        this.f17283e0 = cVar;
        if (cVar != null) {
            g(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        m(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(p060g.a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}

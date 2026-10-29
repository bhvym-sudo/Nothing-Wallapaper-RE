package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f10569q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f10570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f10571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f10572t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Drawable f10573u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    Drawable f10574v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Drawable f10575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f10576x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f10577y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f10578z;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1005b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p050f.j.f20595a);
        this.f10573u = typedArrayObtainStyledAttributes.getDrawable(p050f.j.f20600b);
        this.f10574v = typedArrayObtainStyledAttributes.getDrawable(p050f.j.f20610d);
        this.f10578z = typedArrayObtainStyledAttributes.getDimensionPixelSize(p050f.j.f20640j, -1);
        boolean z9 = true;
        if (getId() == p050f.f.f20454y) {
            this.f10576x = true;
            this.f10575w = typedArrayObtainStyledAttributes.getDrawable(p050f.j.f20605c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f10576x ? this.f10573u != null || this.f10574v != null : this.f10575w != null) {
            z9 = false;
        }
        setWillNotDraw(z9);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f10573u;
        if (drawable != null && drawable.isStateful()) {
            this.f10573u.setState(getDrawableState());
        }
        Drawable drawable2 = this.f10574v;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f10574v.setState(getDrawableState());
        }
        Drawable drawable3 = this.f10575w;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f10575w.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f10570r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f10573u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f10574v;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f10575w;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f10571s = findViewById(p050f.f.f20430a);
        this.f10572t = findViewById(p050f.f.f20435f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f10569q || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z9, i10, i11, i12, i13);
        View view = this.f10570r;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f10576x) {
            Drawable drawable2 = this.f10575w;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = z11;
            }
        } else {
            if (this.f10573u != null) {
                if (this.f10571s.getVisibility() == 0) {
                    this.f10573u.setBounds(this.f10571s.getLeft(), this.f10571s.getTop(), this.f10571s.getRight(), this.f10571s.getBottom());
                } else {
                    View view2 = this.f10572t;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f10573u.setBounds(0, 0, 0, 0);
                    } else {
                        this.f10573u.setBounds(this.f10572t.getLeft(), this.f10572t.getTop(), this.f10572t.getRight(), this.f10572t.getBottom());
                    }
                }
                z11 = true;
            }
            this.f10577y = z12;
            if (!z12 || (drawable = this.f10574v) == null) {
                z10 = z11;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iA;
        int i12;
        if (this.f10571s == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f10578z) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f10571s == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f10570r;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.f10571s)) {
            iA = !b(this.f10572t) ? a(this.f10572t) : 0;
        } else {
            iA = a(this.f10571s);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f10570r), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : SubsamplingScaleImageView.TILE_SIZE_AUTO));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f10573u;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f10573u);
        }
        this.f10573u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f10571s;
            if (view != null) {
                this.f10573u.setBounds(view.getLeft(), this.f10571s.getTop(), this.f10571s.getRight(), this.f10571s.getBottom());
            }
        }
        boolean z9 = false;
        if (!this.f10576x ? !(this.f10573u != null || this.f10574v != null) : this.f10575w == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f10575w;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f10575w);
        }
        this.f10575w = drawable;
        boolean z9 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f10576x && (drawable2 = this.f10575w) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f10576x ? !(this.f10573u != null || this.f10574v != null) : this.f10575w == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f10574v;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f10574v);
        }
        this.f10574v = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f10577y && (drawable2 = this.f10574v) != null) {
                drawable2.setBounds(this.f10570r.getLeft(), this.f10570r.getTop(), this.f10570r.getRight(), this.f10570r.getBottom());
            }
        }
        boolean z9 = false;
        if (!this.f10576x ? !(this.f10573u != null || this.f10574v != null) : this.f10575w == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f10570r;
        if (view != null) {
            removeView(view);
        }
        this.f10570r = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z9) {
        this.f10569q = z9;
        setDescendantFocusability(z9 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z9 = i10 == 0;
        Drawable drawable = this.f10573u;
        if (drawable != null) {
            drawable.setVisible(z9, false);
        }
        Drawable drawable2 = this.f10574v;
        if (drawable2 != null) {
            drawable2.setVisible(z9, false);
        }
        Drawable drawable3 = this.f10575w;
        if (drawable3 != null) {
            drawable3.setVisible(z9, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f10573u && !this.f10576x) {
            return true;
        }
        if (drawable == this.f10574v && this.f10577y) {
            return true;
        }
        return (drawable == this.f10575w && this.f10576x) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}

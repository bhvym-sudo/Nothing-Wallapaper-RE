package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.H;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes.dex */
abstract class c extends e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Runnable f16449t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    OverScroller f16450u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f16451v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f16452w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f16453x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f16454y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private VelocityTracker f16455z;

    private class a implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final CoordinatorLayout f16456q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final View f16457r;

        a(CoordinatorLayout coordinatorLayout, View view) {
            this.f16456q = coordinatorLayout;
            this.f16457r = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f16457r == null || (overScroller = c.this.f16450u) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                c.this.R(this.f16456q, this.f16457r);
                return;
            }
            c cVar = c.this;
            cVar.T(this.f16456q, this.f16457r, cVar.f16450u.getCurrY());
            H.Y(this.f16457r, this);
        }
    }

    public c() {
        this.f16452w = -1;
        this.f16454y = -1;
    }

    private void M() {
        if (this.f16455z == null) {
            this.f16455z = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z9;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.f16455z;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f16455z.computeCurrentVelocity(1000);
                N(coordinatorLayout, view, -P(view), 0, this.f16455z.getYVelocity(this.f16452w));
                z9 = true;
            }
            this.f16451v = false;
            this.f16452w = -1;
            velocityTracker = this.f16455z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f16455z = null;
            }
            velocityTracker2 = this.f16455z;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.f16451v) {
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f16452w);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y9 = (int) motionEvent.getY(iFindPointerIndex);
            int i10 = this.f16453x - y9;
            this.f16453x = y9;
            S(coordinatorLayout, view, i10, O(view), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f16452w = motionEvent.getPointerId(i11);
                this.f16453x = (int) (motionEvent.getY(i11) + 0.5f);
            }
        }
        z9 = false;
        velocityTracker2 = this.f16455z;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f16451v || z9;
        z9 = false;
        this.f16451v = false;
        this.f16452w = -1;
        velocityTracker = this.f16455z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16455z = null;
        }
        velocityTracker2 = this.f16455z;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f16451v) {
        }
    }

    abstract boolean L(View view);

    final boolean N(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        Runnable runnable = this.f16449t;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f16449t = null;
        }
        if (this.f16450u == null) {
            this.f16450u = new OverScroller(view.getContext());
        }
        this.f16450u.fling(0, I(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f16450u.computeScrollOffset()) {
            R(coordinatorLayout, view);
            return false;
        }
        a aVar = new a(coordinatorLayout, view);
        this.f16449t = aVar;
        H.Y(view, aVar);
        return true;
    }

    abstract int O(View view);

    abstract int P(View view);

    abstract int Q();

    abstract void R(CoordinatorLayout coordinatorLayout, View view);

    final int S(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return U(coordinatorLayout, view, Q() - i10, i11, i12);
    }

    int T(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return U(coordinatorLayout, view, i10, Integer.MIN_VALUE, SubsamplingScaleImageView.TILE_SIZE_AUTO);
    }

    abstract int U(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f16454y < 0) {
            this.f16454y = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f16451v) {
            int i10 = this.f16452w;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y9 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y9 - this.f16453x) > this.f16454y) {
                this.f16453x = y9;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f16452w = -1;
            int x9 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            boolean z9 = L(view) && coordinatorLayout.v(view, x9, y10);
            this.f16451v = z9;
            if (z9) {
                this.f16453x = y10;
                this.f16452w = motionEvent.getPointerId(0);
                M();
                OverScroller overScroller = this.f16450u;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f16450u.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f16455z;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16452w = -1;
        this.f16454y = -1;
    }
}

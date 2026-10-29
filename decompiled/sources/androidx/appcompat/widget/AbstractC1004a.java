package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1004a extends ViewGroup {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final C0363a f11026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final Context f11027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected ActionMenuView f11028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected C1006c f11029t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f11030u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected androidx.core.view.O f11031v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f11032w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f11033x;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0363a implements androidx.core.view.P {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f11034a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11035b;

        protected C0363a() {
        }

        @Override // androidx.core.view.P
        public void a(View view) {
            this.f11034a = true;
        }

        @Override // androidx.core.view.P
        public void b(View view) {
            if (this.f11034a) {
                return;
            }
            AbstractC1004a abstractC1004a = AbstractC1004a.this;
            abstractC1004a.f11031v = null;
            AbstractC1004a.super.setVisibility(this.f11035b);
        }

        @Override // androidx.core.view.P
        public void c(View view) {
            AbstractC1004a.super.setVisibility(0);
            this.f11034a = false;
        }

        public C0363a d(androidx.core.view.O o9, int i10) {
            AbstractC1004a.this.f11031v = o9;
            this.f11035b = i10;
            return this;
        }
    }

    AbstractC1004a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11026q = new C0363a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(p050f.a.f20335a, typedValue, true) || typedValue.resourceId == 0) {
            this.f11027r = context;
        } else {
            this.f11027r = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i10, int i11, boolean z9) {
        return z9 ? i10 - i11 : i10 + i11;
    }

    protected int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    protected int e(View view, int i10, int i11, int i12, boolean z9) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z9) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z9 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.O f(int i10, long j9) {
        androidx.core.view.O o9 = this.f11031v;
        if (o9 != null) {
            o9.c();
        }
        if (i10 != 0) {
            androidx.core.view.O oB = androidx.core.view.H.d(this).b(0.0f);
            oB.e(j9);
            oB.g(this.f11026q.d(oB, i10));
            return oB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        androidx.core.view.O oB2 = androidx.core.view.H.d(this).b(1.0f);
        oB2.e(j9);
        oB2.g(this.f11026q.d(oB2, i10));
        return oB2;
    }

    public int getAnimatedVisibility() {
        return this.f11031v != null ? this.f11026q.f11035b : getVisibility();
    }

    public int getContentHeight() {
        return this.f11030u;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, p050f.j.f20595a, p050f.a.f20337c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(p050f.j.f20640j, 0));
        typedArrayObtainStyledAttributes.recycle();
        C1006c c1006c = this.f11029t;
        if (c1006c != null) {
            c1006c.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f11033x = false;
        }
        if (!this.f11033x) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f11033x = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f11033x = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f11032w = false;
        }
        if (!this.f11032w) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f11032w = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f11032w = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.O o9 = this.f11031v;
            if (o9 != null) {
                o9.c();
            }
            super.setVisibility(i10);
        }
    }
}

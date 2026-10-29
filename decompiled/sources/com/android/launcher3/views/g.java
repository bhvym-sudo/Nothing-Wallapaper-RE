package com.android.launcher3.views;

import F2.q;
import F2.w;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.android.launcher3.AbstractC1219a;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Property f15743A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Property f15744z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final float[] f15745q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final float[] f15746r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final Rect f15747s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final RectF f15748t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f15749u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final f f15750v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final q f15751w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected w[] f15752x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected w f15753y;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(c cVar) {
            return Integer.valueOf(cVar.f15754a);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c cVar, Integer num) {
            cVar.f15754a = num.intValue();
        }
    }

    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(c cVar) {
            return Integer.valueOf(cVar.f15755b);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c cVar, Integer num) {
            cVar.f15755b = num.intValue();
        }
    }

    public interface d {
    }

    static {
        Class cls = Integer.TYPE;
        f15744z = new a(cls, "x");
        f15743A = new b(cls, "y");
    }

    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        this.f15745q = new float[2];
        this.f15746r = new float[4];
        this.f15747s = new Rect();
        this.f15748t = new RectF();
        this.f15749u = 0;
        this.f15750v = (f) f.y(context);
        this.f15751w = new q(this, i10);
    }

    private w b(MotionEvent motionEvent) {
        AbstractC1219a abstractC1219aF = AbstractC1219a.F(this.f15750v);
        if (abstractC1219aF != null && ((o(motionEvent) || abstractC1219aF.C()) && abstractC1219aF.k(motionEvent))) {
            return abstractC1219aF;
        }
        for (w wVar : this.f15752x) {
            if (wVar.k(motionEvent)) {
                return wVar;
            }
        }
        return null;
    }

    private boolean m(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        return x9 >= this.f15748t.left && x9 < ((float) getWidth()) - this.f15748t.right && y9 >= ((float) getHeight()) - this.f15748t.bottom && y9 < ((float) getHeight());
    }

    protected boolean a(MotionEvent motionEvent) {
        this.f15753y = null;
        w wVarB = b(motionEvent);
        this.f15753y = wVarB;
        return wVarB != null || m(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        Insets mandatorySystemGestureInsets = windowInsets.getMandatorySystemGestureInsets();
        int i10 = mandatorySystemGestureInsets.bottom;
        Insets insets = windowInsets.getInsets(WindowInsets.Type.ime());
        this.f15748t.set(Math.max(mandatorySystemGestureInsets.left, insets.left), Math.max(mandatorySystemGestureInsets.top, insets.top), Math.max(mandatorySystemGestureInsets.right, insets.right), Math.max(i10, insets.bottom));
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f15750v.h()) {
            return true;
        }
        if (!this.f15750v.O()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            if ((this.f15749u & 8) != 0) {
                int action2 = motionEvent.getAction();
                motionEvent.setAction(3);
                super.dispatchTouchEvent(motionEvent);
                motionEvent.setAction(action2);
            }
            this.f15749u |= 9;
            if (o(motionEvent)) {
                this.f15749u &= -3;
            } else {
                this.f15749u |= 2;
            }
        } else if (action == 1 || action == 3) {
            this.f15749u &= -12;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public float f(View view, float[] fArr) {
        return g(view, fArr, false);
    }

    public float g(View view, float[] fArr, boolean z9) {
        return com.android.launcher3.w.c(view, this, fArr, z9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ ViewOverlay getOverlay() {
        return super.getOverlay();
    }

    public float h(View view, int[] iArr) {
        float[] fArr = this.f15745q;
        fArr[0] = iArr[0];
        fArr[1] = iArr[1];
        float f10 = f(view, fArr);
        com.android.launcher3.w.k(this.f15745q, iArr);
        return f10;
    }

    public float i(View view, Rect rect) {
        float[] fArr = this.f15746r;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = view.getWidth();
        this.f15746r[3] = view.getHeight();
        float f10 = f(view, this.f15746r);
        float[] fArr2 = this.f15746r;
        rect.left = Math.round(Math.min(fArr2[0], fArr2[2]));
        float[] fArr3 = this.f15746r;
        rect.top = Math.round(Math.min(fArr3[1], fArr3[3]));
        float[] fArr4 = this.f15746r;
        rect.right = Math.round(Math.max(fArr4[0], fArr4[2]));
        float[] fArr5 = this.f15746r;
        rect.bottom = Math.round(Math.max(fArr5[1], fArr5[3]));
        return f10;
    }

    public float j(View view, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        return h(view, iArr);
    }

    protected int[] k(View view) {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - i10;
        iArr[1] = iArr[1] - i11;
        return iArr;
    }

    public void l(View view, Rect rect) {
        int[] iArrK = k(view);
        int i10 = iArrK[0];
        rect.set(i10, iArrK[1], view.getMeasuredWidth() + i10, iArrK[1] + view.getMeasuredHeight());
    }

    public boolean n(View view, MotionEvent motionEvent) {
        i(view, this.f15747s);
        return this.f15747s.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    protected boolean o(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        if (x9 < this.f15748t.left) {
            return false;
        }
        float width = getWidth();
        RectF rectF = this.f15748t;
        return x9 < width - rectF.right && y9 >= rectF.top && y9 < ((float) getHeight()) - this.f15748t.bottom;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1 && action != 3 && action == 0) {
            this.f15750v.s();
        }
        return a(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (layoutParams instanceof c) {
                c cVar = (c) layoutParams;
                if (cVar.f15756c) {
                    int i15 = cVar.f15754a;
                    int i16 = cVar.f15755b;
                    childAt.layout(i15, i16, ((FrameLayout.LayoutParams) cVar).width + i15, ((FrameLayout.LayoutParams) cVar).height + i16);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
        }
        return (this.f15753y == null || motionEvent.getAction() == 4) ? a(motionEvent) : this.f15753y.h(motionEvent);
    }

    public void p(View view, int[] iArr) {
        float[] fArr = this.f15745q;
        fArr[0] = iArr[0];
        fArr[1] = iArr[1];
        com.android.launcher3.w.h(view, this, fArr);
        com.android.launcher3.w.k(this.f15745q, iArr);
    }

    public void setTouchCompleteListener(d dVar) {
    }

    public static class c extends FrameLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15756c;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f15756c = false;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f15756c = false;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f15756c = false;
        }
    }
}

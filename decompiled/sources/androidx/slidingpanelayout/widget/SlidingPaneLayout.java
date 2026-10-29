package androidx.slidingpanelayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.o;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.H;
import androidx.core.view.V;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static boolean f14004K = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f14005A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private float f14006B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private float f14007C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final List f14008D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final I0.c f14009E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    boolean f14010F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f14011G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Rect f14012H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final ArrayList f14013I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f14014J;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f14015q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f14016r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Drawable f14017s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Drawable f14018t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f14019u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    View f14020v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    float f14021w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f14022x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f14023y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f14024z;

    public interface b {
    }

    static class c extends H0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f14029q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f14030r;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // H0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f14029q ? 1 : 0);
            parcel.writeInt(this.f14030r);
        }

        c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14029q = parcel.readInt() != 0;
            this.f14030r = parcel.readInt();
        }
    }

    private static class d extends FrameLayout {
        d(View view) {
            super(view.getContext());
            addView(view);
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    private boolean c(int i10) {
        if (!this.f14019u) {
            this.f14010F = false;
        }
        if (!this.f14011G && !n(1.0f, i10)) {
            return false;
        }
        this.f14010F = false;
        return true;
    }

    private static int d(View view) {
        return view instanceof d ? H.x(((d) view).getChildAt(0)) : H.x(view);
    }

    private p191t0.b getSystemGestureInsets() {
        V vA;
        if (!f14004K || (vA = H.A(this)) == null) {
            return null;
        }
        return vA.h();
    }

    private static int i(View view, int i10, int i11) {
        a aVar = (a) view.getLayoutParams();
        return (((ViewGroup.MarginLayoutParams) aVar).width != 0 || aVar.f14026a <= 0.0f) ? View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), BasicMeasure.EXACTLY) : ViewGroup.getChildMeasureSpec(i10, i11, ((ViewGroup.MarginLayoutParams) aVar).height);
    }

    private boolean k(int i10) {
        if (!this.f14019u) {
            this.f14010F = true;
        }
        if (!this.f14011G && !n(0.0f, i10)) {
            return false;
        }
        this.f14010F = true;
        return true;
    }

    private void l(float f10) {
        boolean zF = f();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.f14020v) {
                float f11 = 1.0f - this.f14022x;
                int i11 = this.f14005A;
                this.f14022x = f10;
                int i12 = ((int) (f11 * i11)) - ((int) ((1.0f - f10) * i11));
                if (zF) {
                    i12 = -i12;
                }
                childAt.offsetLeftAndRight(i12);
            }
        }
    }

    private ArrayList o() {
        return null;
    }

    private static boolean q(View view) {
        return view.isOpaque();
    }

    private void setFoldingFeatureObserver(p132n1.a aVar) {
        throw null;
    }

    public void a(b bVar) {
        this.f14008D.add(bVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new d(view), i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    public boolean b() {
        return c(0);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof a) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f14009E.n(true)) {
            if (this.f14019u) {
                H.X(this);
            } else {
                this.f14009E.a();
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int right;
        super.draw(canvas);
        Drawable drawable = f() ? this.f14018t : this.f14017s;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (f()) {
            right = childAt.getRight();
            i10 = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i11 = left - intrinsicWidth;
            i10 = left;
            right = i11;
        }
        drawable.setBounds(right, top, i10, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j9) {
        if (f() ^ g()) {
            this.f14009E.M(1);
            p191t0.b systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                I0.c cVar = this.f14009E;
                cVar.L(Math.max(cVar.w(), systemGestureInsets.f27862a));
            }
        } else {
            this.f14009E.M(2);
            p191t0.b systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                I0.c cVar2 = this.f14009E;
                cVar2.L(Math.max(cVar2.w(), systemGestureInsets2.f27864c));
            }
        }
        a aVar = (a) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f14019u && !aVar.f14027b && this.f14020v != null) {
            canvas.getClipBounds(this.f14012H);
            if (f()) {
                Rect rect = this.f14012H;
                rect.left = Math.max(rect.left, this.f14020v.getRight());
            } else {
                Rect rect2 = this.f14012H;
                rect2.right = Math.min(rect2.right, this.f14020v.getLeft());
            }
            canvas.clipRect(this.f14012H);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j9);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    boolean e(View view) {
        if (view == null) {
            return false;
        }
        return this.f14019u && ((a) view.getLayoutParams()).f14028c && this.f14021w > 0.0f;
    }

    boolean f() {
        return H.v(this) == 1;
    }

    public boolean g() {
        return !this.f14019u || this.f14021w == 0.0f;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.f14016r;
    }

    public final int getLockMode() {
        return this.f14014J;
    }

    public int getParallaxDistance() {
        return this.f14005A;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.f14015q;
    }

    public boolean h() {
        return this.f14019u;
    }

    public boolean j() {
        return k(0);
    }

    void m() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    boolean n(float f10, int i10) {
        int paddingLeft;
        if (!this.f14019u) {
            return false;
        }
        boolean zF = f();
        a aVar = (a) this.f14020v.getLayoutParams();
        if (zF) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin) + (f10 * this.f14023y)) + this.f14020v.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + (f10 * this.f14023y));
        }
        I0.c cVar = this.f14009E;
        View view = this.f14020v;
        if (!cVar.P(view, paddingLeft, view.getTop())) {
            return false;
        }
        m();
        H.X(this);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14011G = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14011G = true;
        if (this.f14013I.size() <= 0) {
            this.f14013I.clear();
        } else {
            o.a(this.f14013I.get(0));
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f14019u && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f14010F = this.f14009E.E(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f14019u || (this.f14024z && actionMasked != 0)) {
            this.f14009E.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.f14009E.b();
            return false;
        }
        if (actionMasked == 0) {
            this.f14024z = false;
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY();
            this.f14006B = x9;
            this.f14007C = y9;
            if (this.f14009E.E(this.f14020v, (int) x9, (int) y9) && e(this.f14020v)) {
                z9 = true;
            }
            return !this.f14009E.O(motionEvent) || z9;
        }
        if (actionMasked == 2) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float fAbs = Math.abs(x10 - this.f14006B);
            float fAbs2 = Math.abs(y10 - this.f14007C);
            if (fAbs > this.f14009E.z() && fAbs2 > fAbs) {
                this.f14009E.b();
                this.f14024z = true;
                return false;
            }
        }
        z9 = false;
        if (this.f14009E.O(motionEvent)) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean zF = f();
        int i19 = i12 - i10;
        int paddingRight = zF ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zF ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f14011G) {
            this.f14021w = (this.f14019u && this.f14010F) ? 0.0f : 1.0f;
        }
        int i20 = paddingRight;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (aVar.f14027b) {
                    int i22 = i19 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i22) - i20) - (((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin);
                    this.f14023y = iMin;
                    int i23 = zF ? ((ViewGroup.MarginLayoutParams) aVar).rightMargin : ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                    i14 = 0;
                    aVar.f14028c = ((i20 + i23) + iMin) + (measuredWidth / 2) > i22;
                    int i24 = (int) (iMin * this.f14021w);
                    i20 += i23 + i24;
                    this.f14021w = i24 / iMin;
                    i15 = 0;
                } else {
                    i14 = 0;
                    i15 = (!this.f14019u || (i16 = this.f14005A) == 0) ? 0 : (int) ((1.0f - this.f14021w) * i16);
                    i20 = paddingRight;
                }
                if (zF) {
                    i18 = (i19 - i20) + i15;
                    i17 = i18 - measuredWidth;
                } else {
                    i17 = i20 - i15;
                    i18 = i17 + measuredWidth;
                }
                childAt.layout(i17, paddingTop, i18, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth() + Math.abs(i14);
            }
        }
        if (this.f14011G) {
            if (this.f14019u && this.f14005A != 0) {
                l(this.f14021w);
            }
            p(this.f14020v);
        }
        this.f14011G = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int paddingTop;
        int iMin;
        int i12;
        int iMax;
        int iMakeMeasureSpec;
        int i13;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int iMax2 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f14020v = null;
        int i14 = 0;
        boolean z9 = false;
        int i15 = iMax2;
        float f10 = 0.0f;
        while (true) {
            i12 = 8;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            a aVar = (a) childAt.getLayoutParams();
            int i16 = iMax2;
            if (childAt.getVisibility() == 8) {
                aVar.f14028c = false;
            } else {
                float f11 = aVar.f14026a;
                if (f11 > 0.0f) {
                    f10 += f11;
                    if (((ViewGroup.MarginLayoutParams) aVar).width == 0) {
                    }
                    i14 = i13 + 1;
                    iMax2 = i16;
                }
                int iMax3 = Math.max(i16 - (((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin), 0);
                int i17 = ((ViewGroup.MarginLayoutParams) aVar).width;
                i13 = i14;
                childAt.measure(i17 == -2 ? View.MeasureSpec.makeMeasureSpec(iMax3, mode == 0 ? mode : Integer.MIN_VALUE) : i17 == -1 ? View.MeasureSpec.makeMeasureSpec(iMax3, mode) : View.MeasureSpec.makeMeasureSpec(i17, BasicMeasure.EXACTLY), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) aVar).height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > iMin) {
                    if (mode2 == Integer.MIN_VALUE) {
                        iMin = Math.min(measuredHeight, paddingTop);
                    } else if (mode2 == 0) {
                        iMin = measuredHeight;
                    }
                }
                i15 -= measuredWidth;
                if (i13 != 0) {
                    boolean z10 = i15 < 0;
                    aVar.f14027b = z10;
                    z9 |= z10;
                    if (z10) {
                        this.f14020v = childAt;
                    }
                }
                i14 = i13 + 1;
                iMax2 = i16;
            }
            i13 = i14;
            i14 = i13 + 1;
            iMax2 = i16;
        }
        int i18 = iMax2;
        if (z9 || f10 > 0.0f) {
            int i19 = 0;
            while (i19 < childCount) {
                View childAt2 = getChildAt(i19);
                if (childAt2.getVisibility() != i12) {
                    a aVar2 = (a) childAt2.getLayoutParams();
                    int measuredWidth2 = (((ViewGroup.MarginLayoutParams) aVar2).width != 0 || aVar2.f14026a <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z9) {
                        iMax = i18 - (((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, BasicMeasure.EXACTLY);
                    } else if (aVar2.f14026a > 0.0f) {
                        iMax = measuredWidth2 + ((int) ((aVar2.f14026a * Math.max(0, i15)) / f10));
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, BasicMeasure.EXACTLY);
                    } else {
                        iMax = measuredWidth2;
                        iMakeMeasureSpec = 0;
                    }
                    int i20 = i(childAt2, i11, getPaddingTop() + getPaddingBottom());
                    if (measuredWidth2 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, i20);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight2;
                            }
                        }
                    }
                }
                i19++;
                i12 = 8;
            }
        }
        ArrayList arrayListO = o();
        if (arrayListO != null && !z9) {
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt3 = getChildAt(i21);
                if (childAt3.getVisibility() != 8) {
                    Rect rect = (Rect) arrayListO.get(i21);
                    a aVar3 = (a) childAt3.getLayoutParams();
                    int i22 = ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin;
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), BasicMeasure.EXACTLY);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), iMakeMeasureSpec2);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1 || (d(childAt3) != 0 && rect.width() < d(childAt3))) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(i18 - i22, BasicMeasure.EXACTLY), iMakeMeasureSpec2);
                        if (i21 != 0) {
                            aVar3.f14027b = true;
                            this.f14020v = childAt3;
                            z9 = true;
                        }
                    } else {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), BasicMeasure.EXACTLY), iMakeMeasureSpec2);
                    }
                }
            }
        }
        setMeasuredDimension(size, iMin + getPaddingTop() + getPaddingBottom());
        this.f14019u = z9;
        if (this.f14009E.A() == 0 || z9) {
            return;
        }
        this.f14009E.a();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        if (cVar.f14029q) {
            j();
        } else {
            b();
        }
        this.f14010F = cVar.f14029q;
        setLockMode(cVar.f14030r);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f14029q = h() ? g() : this.f14010F;
        cVar.f14030r = this.f14014J;
        return cVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            this.f14011G = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f14019u) {
            return super.onTouchEvent(motionEvent);
        }
        this.f14009E.F(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY();
            this.f14006B = x9;
            this.f14007C = y9;
            return true;
        }
        if (actionMasked == 1 && e(this.f14020v)) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float f10 = x10 - this.f14006B;
            float f11 = y10 - this.f14007C;
            int iZ = this.f14009E.z();
            if ((f10 * f10) + (f11 * f11) < iZ * iZ && this.f14009E.E(this.f14020v, (int) x10, (int) y10)) {
                c(0);
            }
        }
        return true;
    }

    void p(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View view2 = view;
        boolean zF = f();
        int width = zF ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zF ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !q(view2)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view2.getLeft();
            right = view2.getRight();
            top = view2.getTop();
            bottom = view2.getBottom();
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt == view2) {
                return;
            }
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zF ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zF ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i10++;
            view2 = view;
            zF = zF;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view.getParent() instanceof d) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f14019u) {
            return;
        }
        this.f14010F = view == this.f14020v;
    }

    @Deprecated
    public void setCoveredFadeColor(int i10) {
        this.f14016r = i10;
    }

    public final void setLockMode(int i10) {
        this.f14014J = i10;
    }

    @Deprecated
    public void setPanelSlideListener(b bVar) {
        if (bVar != null) {
            a(bVar);
        }
    }

    public void setParallaxDistance(int i10) {
        this.f14005A = i10;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f14017s = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f14018t = drawable;
    }

    @Deprecated
    public void setShadowResource(int i10) {
        setShadowDrawableLeft(getResources().getDrawable(i10));
    }

    public void setShadowResourceLeft(int i10) {
        setShadowDrawableLeft(p171r0.a.d(getContext(), i10));
    }

    public void setShadowResourceRight(int i10) {
        setShadowDrawableRight(p171r0.a.d(getContext(), i10));
    }

    @Deprecated
    public void setSliderFadeColor(int i10) {
        this.f14015q = i10;
    }

    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int[] f14025d = {R.attr.layout_weight};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f14026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f14027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f14028c;

        public a() {
            super(-1, -1);
            this.f14026a = 0.0f;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14026a = 0.0f;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f14026a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14026a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f14025d);
            this.f14026a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }
}

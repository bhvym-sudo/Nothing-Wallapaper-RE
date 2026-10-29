package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.AbstractC1077i;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Drawable f10806A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f10807B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f10808C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f10809D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f10810E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f10811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f10813s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f10814t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f10815u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f10816v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f10817w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10818x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int[] f10819y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int[] f10820z;

    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void k(int i10, int i11) {
        LinearLayoutCompat linearLayoutCompat;
        int i12;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), BasicMeasure.EXACTLY);
        int i13 = 0;
        while (i13 < i10) {
            View viewS = this.s(i13);
            if (viewS.getVisibility() != 8) {
                a aVar = (a) viewS.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i14 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = viewS.getMeasuredWidth();
                    linearLayoutCompat = this;
                    i12 = i11;
                    linearLayoutCompat.measureChildWithMargins(viewS, i12, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i14;
                } else {
                    linearLayoutCompat = this;
                    i12 = i11;
                }
            } else {
                linearLayoutCompat = this;
                i12 = i11;
            }
            i13++;
            this = linearLayoutCompat;
            i11 = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void l(int i10, int i11) {
        LinearLayoutCompat linearLayoutCompat;
        int i12;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), BasicMeasure.EXACTLY);
        int i13 = 0;
        while (i13 < i10) {
            View viewS = this.s(i13);
            if (viewS.getVisibility() != 8) {
                a aVar = (a) viewS.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i14 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = viewS.getMeasuredHeight();
                    linearLayoutCompat = this;
                    i12 = i11;
                    linearLayoutCompat.measureChildWithMargins(viewS, iMakeMeasureSpec, 0, i12, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i14;
                } else {
                    linearLayoutCompat = this;
                    i12 = i11;
                }
            } else {
                linearLayoutCompat = this;
                i12 = i11;
            }
            i13++;
            this = linearLayoutCompat;
            i11 = i12;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void g(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = Q.b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View viewS = s(i11);
            if (viewS != null && viewS.getVisibility() != 8 && t(i11)) {
                a aVar = (a) viewS.getLayoutParams();
                j(canvas, zB ? viewS.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewS.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f10807B);
            }
        }
        if (t(virtualChildCount)) {
            View viewS2 = s(virtualChildCount - 1);
            if (viewS2 != null) {
                a aVar2 = (a) viewS2.getLayoutParams();
                if (zB) {
                    left = viewS2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i10 = this.f10807B;
                    right = left - i10;
                } else {
                    right = viewS2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f10807B;
                right = left - i10;
            }
            j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f10812r < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f10812r;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f10812r == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f10813s;
        if (this.f10814t == 1 && (i10 = this.f10815u & 112) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f10816v) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f10816v;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f10812r;
    }

    public Drawable getDividerDrawable() {
        return this.f10806A;
    }

    public int getDividerPadding() {
        return this.f10810E;
    }

    public int getDividerWidth() {
        return this.f10807B;
    }

    public int getGravity() {
        return this.f10815u;
    }

    public int getOrientation() {
        return this.f10814t;
    }

    public int getShowDividers() {
        return this.f10809D;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f10817w;
    }

    void h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View viewS = s(i10);
            if (viewS != null && viewS.getVisibility() != 8 && t(i10)) {
                i(canvas, (viewS.getTop() - ((LinearLayout.LayoutParams) ((a) viewS.getLayoutParams())).topMargin) - this.f10808C);
            }
        }
        if (t(virtualChildCount)) {
            View viewS2 = s(virtualChildCount - 1);
            i(canvas, viewS2 == null ? (getHeight() - getPaddingBottom()) - this.f10808C : viewS2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewS2.getLayoutParams())).bottomMargin);
        }
    }

    void i(Canvas canvas, int i10) {
        this.f10806A.setBounds(getPaddingLeft() + this.f10810E, i10, (getWidth() - getPaddingRight()) - this.f10810E, this.f10808C + i10);
        this.f10806A.draw(canvas);
    }

    void j(Canvas canvas, int i10) {
        this.f10806A.setBounds(i10, getPaddingTop() + this.f10810E, this.f10807B + i10, (getHeight() - getPaddingBottom()) - this.f10810E);
        this.f10806A.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f10814t;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f10806A == null) {
            return;
        }
        if (this.f10814t == 1) {
            h(canvas);
        } else {
            g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        if (this.f10814t == 1) {
            v(i10, i11, i12, i13);
        } else {
            u(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f10814t == 1) {
            z(i10, i11);
        } else {
            x(i10, i11);
        }
    }

    int p(View view, int i10) {
        return 0;
    }

    int q(View view) {
        return 0;
    }

    int r(View view) {
        return 0;
    }

    View s(int i10) {
        return getChildAt(i10);
    }

    public void setBaselineAligned(boolean z9) {
        this.f10811q = z9;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f10812r = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f10806A) {
            return;
        }
        this.f10806A = drawable;
        if (drawable != null) {
            this.f10807B = drawable.getIntrinsicWidth();
            this.f10808C = drawable.getIntrinsicHeight();
        } else {
            this.f10807B = 0;
            this.f10808C = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f10810E = i10;
    }

    public void setGravity(int i10) {
        if (this.f10815u != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f10815u = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f10815u;
        if ((8388615 & i12) != i11) {
            this.f10815u = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z9) {
        this.f10818x = z9;
    }

    public void setOrientation(int i10) {
        if (this.f10814t != i10) {
            this.f10814t = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f10809D) {
            requestLayout();
        }
        this.f10809D = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f10815u;
        if ((i12 & 112) != i11) {
            this.f10815u = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f10817w = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected boolean t(int i10) {
        if (i10 == 0) {
            return (this.f10809D & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f10809D & 4) != 0;
        }
        if ((this.f10809D & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x0103  */
    void u(int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int i14;
        int i15;
        char c10;
        char c11;
        int i16;
        int iP;
        int i17;
        int baseline;
        int i18;
        int i19;
        int i20;
        int measuredHeight;
        int i21;
        boolean zB = Q.b(this);
        int paddingTop = getPaddingTop();
        int i22 = i13 - i11;
        int paddingBottom = i22 - getPaddingBottom();
        int paddingBottom2 = (i22 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i23 = this.f10815u;
        int i24 = i23 & 112;
        boolean z9 = this.f10811q;
        int[] iArr = this.f10819y;
        int[] iArr2 = this.f10820z;
        int iB = AbstractC1077i.b(8388615 & i23, getLayoutDirection());
        char c12 = 2;
        char c13 = 1;
        if (iB != 1) {
            paddingLeft = iB != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f10816v;
        } else {
            paddingLeft = getPaddingLeft() + (((i12 - i10) - this.f10816v) / 2);
        }
        if (zB) {
            i14 = virtualChildCount - 1;
            i15 = -1;
        } else {
            i14 = 0;
            i15 = 1;
        }
        int i25 = 0;
        while (i25 < virtualChildCount) {
            int i26 = i14 + (i15 * i25);
            int i27 = i25;
            View viewS = s(i26);
            if (viewS == null) {
                paddingLeft += y(i26);
                iP = i27;
                i16 = paddingTop;
                c10 = c12;
                c11 = c13;
            } else {
                c10 = c12;
                c11 = c13;
                if (viewS.getVisibility() != 8) {
                    int measuredWidth = viewS.getMeasuredWidth();
                    int measuredHeight2 = viewS.getMeasuredHeight();
                    a aVar = (a) viewS.getLayoutParams();
                    int i28 = paddingLeft;
                    if (z9) {
                        i17 = measuredHeight2;
                        baseline = ((LinearLayout.LayoutParams) aVar).height != -1 ? viewS.getBaseline() : -1;
                        i18 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i18 < 0) {
                            i18 = i24;
                        }
                        i19 = i18 & 112;
                        i16 = paddingTop;
                        if (i19 != 16) {
                            if (i19 != 48) {
                                i20 = i16 + ((LinearLayout.LayoutParams) aVar).topMargin;
                                if (baseline != -1) {
                                    i20 += iArr[c11] - baseline;
                                }
                            } else if (i19 != 80) {
                                i20 = i16;
                            } else {
                                i20 = (paddingBottom - i17) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[c10] - (viewS.getMeasuredHeight() - baseline);
                                }
                            }
                            if (t(i26)) {
                                i21 = i28 + this.f10807B;
                            } else {
                                i21 = i28;
                            }
                            int i29 = ((LinearLayout.LayoutParams) aVar).leftMargin + i21;
                            A(viewS, q(viewS) + i29, i20, measuredWidth, i17);
                            int iR = i29 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + r(viewS);
                            iP = p(viewS, i26) + i27;
                            paddingLeft = iR;
                        } else {
                            i20 = i16 + ((paddingBottom2 - i17) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        }
                        i20 -= measuredHeight;
                        if (t(i26)) {
                            i21 = i28 + this.f10807B;
                        } else {
                            i21 = i28;
                        }
                        int i210 = ((LinearLayout.LayoutParams) aVar).leftMargin + i21;
                        A(viewS, q(viewS) + i210, i20, measuredWidth, i17);
                        int iR2 = i210 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + r(viewS);
                        iP = p(viewS, i26) + i27;
                        paddingLeft = iR2;
                    } else {
                        i17 = measuredHeight2;
                    }
                    i18 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i18 < 0) {
                        i18 = i24;
                    }
                    i19 = i18 & 112;
                    i16 = paddingTop;
                    if (i19 != 16) {
                        if (i19 != 48) {
                            i20 = i16 + ((LinearLayout.LayoutParams) aVar).topMargin;
                            if (baseline != -1) {
                                i20 += iArr[c11] - baseline;
                            }
                        } else if (i19 != 80) {
                            i20 = i16;
                        } else {
                            i20 = (paddingBottom - i17) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[c10] - (viewS.getMeasuredHeight() - baseline);
                            }
                        }
                        if (t(i26)) {
                            i21 = i28 + this.f10807B;
                        } else {
                            i21 = i28;
                        }
                        int i211 = ((LinearLayout.LayoutParams) aVar).leftMargin + i21;
                        A(viewS, q(viewS) + i211, i20, measuredWidth, i17);
                        int iR3 = i211 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + r(viewS);
                        iP = p(viewS, i26) + i27;
                        paddingLeft = iR3;
                    } else {
                        i20 = i16 + ((paddingBottom2 - i17) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    }
                    i20 -= measuredHeight;
                    if (t(i26)) {
                        i21 = i28 + this.f10807B;
                    } else {
                        i21 = i28;
                    }
                    int i212 = ((LinearLayout.LayoutParams) aVar).leftMargin + i21;
                    A(viewS, q(viewS) + i212, i20, measuredWidth, i17);
                    int iR4 = i212 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + r(viewS);
                    iP = p(viewS, i26) + i27;
                    paddingLeft = iR4;
                } else {
                    i16 = paddingTop;
                    iP = i27;
                }
            }
            i25 = iP + 1;
            c12 = c10;
            c13 = c11;
            paddingTop = i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    void v(int i10, int i11, int i12, int i13) {
        int paddingTop;
        int i14;
        int i15;
        int i16;
        LinearLayoutCompat linearLayoutCompat;
        int paddingLeft = getPaddingLeft();
        int i17 = i12 - i10;
        int paddingRight = i17 - getPaddingRight();
        int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i18 = this.f10815u;
        int i19 = i18 & 112;
        int i20 = i18 & 8388615;
        if (i19 != 16) {
            paddingTop = i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f10816v;
        } else {
            paddingTop = getPaddingTop() + (((i13 - i11) - this.f10816v) / 2);
        }
        int iP = 0;
        while (iP < virtualChildCount) {
            View viewS = this.s(iP);
            if (viewS == null) {
                paddingTop += this.y(iP);
            } else {
                if (viewS.getVisibility() != 8) {
                    int measuredWidth = viewS.getMeasuredWidth();
                    int measuredHeight = viewS.getMeasuredHeight();
                    a aVar = (a) viewS.getLayoutParams();
                    int i21 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i21 < 0) {
                        i21 = i20;
                    }
                    int iB = AbstractC1077i.b(i21, this.getLayoutDirection()) & 7;
                    if (iB != 1) {
                        if (iB != 5) {
                            i16 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        } else {
                            i14 = paddingRight - measuredWidth;
                            i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                        }
                        int i22 = i16;
                        if (this.t(iP)) {
                            paddingTop += this.f10808C;
                        }
                        int i23 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        linearLayoutCompat = this;
                        linearLayoutCompat.A(viewS, i22, i23 + this.q(viewS), measuredWidth, measuredHeight);
                        paddingTop = i23 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + linearLayoutCompat.r(viewS);
                        iP += linearLayoutCompat.p(viewS, iP);
                    } else {
                        i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    i16 = i14 - i15;
                    int i24 = i16;
                    if (this.t(iP)) {
                        paddingTop += this.f10808C;
                    }
                    int i25 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    linearLayoutCompat = this;
                    linearLayoutCompat.A(viewS, i24, i25 + this.q(viewS), measuredWidth, measuredHeight);
                    paddingTop = i25 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + linearLayoutCompat.r(viewS);
                    iP += linearLayoutCompat.p(viewS, iP);
                }
                iP++;
                this = linearLayoutCompat;
            }
            linearLayoutCompat = this;
            iP++;
            this = linearLayoutCompat;
        }
    }

    void w(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Code duplicated, block: B:200:0x045e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0182  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01df  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e8  */
    void x(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iMax;
        int i17;
        int iMax2;
        int i18;
        int baseline;
        int i19;
        int i20;
        byte b10;
        int i21;
        int i22;
        int[] iArr;
        int i23;
        boolean z9;
        int[] iArr2;
        View view;
        int i24;
        boolean z10;
        int i25;
        int measuredHeight;
        int baseline2;
        this.f10816v = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (this.f10819y == null || this.f10820z == null) {
            this.f10819y = new int[4];
            this.f10820z = new int[4];
        }
        int[] iArr3 = this.f10819y;
        int[] iArr4 = this.f10820z;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z11 = this.f10811q;
        boolean z12 = this.f10818x;
        int i26 = BasicMeasure.EXACTLY;
        boolean z13 = mode == 1073741824;
        boolean z14 = z12;
        int iP = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        boolean z15 = false;
        int iCombineMeasuredStates = 0;
        boolean z16 = false;
        boolean z17 = true;
        float f10 = 0.0f;
        int iMax5 = 0;
        int iMax6 = 0;
        while (true) {
            i12 = iMax3;
            if (iP >= virtualChildCount) {
                break;
            }
            boolean z18 = z11;
            View viewS = s(iP);
            if (viewS == null) {
                this.f10816v += y(iP);
            } else {
                if (viewS.getVisibility() == 8) {
                    iP += p(viewS, iP);
                } else {
                    if (t(iP)) {
                        this.f10816v += this.f10807B;
                    }
                    a aVar = (a) viewS.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) aVar).weight;
                    float f12 = f10 + f11;
                    if (mode == i26 && ((LinearLayout.LayoutParams) aVar).width == 0 && f11 > 0.0f) {
                        if (z13) {
                            this.f10816v += ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin;
                        } else {
                            int i27 = this.f10816v;
                            this.f10816v = Math.max(i27, ((LinearLayout.LayoutParams) aVar).leftMargin + i27 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        }
                        if (z18) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            viewS.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                            i22 = mode;
                            iArr = iArr3;
                            iArr2 = iArr4;
                            i23 = i12;
                            z9 = z14;
                            view = viewS;
                        } else {
                            i22 = mode;
                            iArr = iArr3;
                            iArr2 = iArr4;
                            z15 = true;
                            i23 = i12;
                            i24 = BasicMeasure.EXACTLY;
                            z9 = z14;
                            view = viewS;
                        }
                        if (mode2 == i24 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                            z10 = true;
                            z16 = true;
                        } else {
                            z10 = false;
                        }
                        i25 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i25;
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        if (!z18 && (baseline2 = view.getBaseline()) != -1) {
                            int i28 = ((LinearLayout.LayoutParams) aVar).gravity;
                            if (i28 < 0) {
                                i28 = this.f10815u;
                            }
                            int i29 = (((i28 & 112) >> 4) & (-2)) >> 1;
                            iArr[i29] = Math.max(iArr[i29], baseline2);
                            iArr2[i29] = Math.max(iArr2[i29], measuredHeight - baseline2);
                        }
                        iMax3 = Math.max(i23, measuredHeight);
                        if (z17 || ((LinearLayout.LayoutParams) aVar).height != -1) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                            if (z10) {
                                measuredHeight = i25;
                            }
                            iMax6 = Math.max(iMax6, measuredHeight);
                        } else {
                            if (z10 != 0) {
                                measuredHeight = i25;
                            }
                            iMax5 = Math.max(iMax5, measuredHeight);
                        }
                        iP += p(view, iP);
                        f10 = f12;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar).width != 0 || f11 <= 0.0f) {
                            b10 = -2;
                            i21 = Integer.MIN_VALUE;
                        } else {
                            b10 = -2;
                            ((LinearLayout.LayoutParams) aVar).width = -2;
                            i21 = 0;
                        }
                        i22 = mode;
                        iArr = iArr3;
                        i23 = i12;
                        int i30 = i21;
                        z9 = z14;
                        iArr2 = iArr4;
                        w(viewS, iP, i10, f12 == 0.0f ? this.f10816v : 0, i11, 0);
                        view = viewS;
                        if (i30 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar).width = i30;
                        }
                        int measuredWidth = view.getMeasuredWidth();
                        if (z13) {
                            this.f10816v += ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + r(view);
                        } else {
                            int i31 = this.f10816v;
                            this.f10816v = Math.max(i31, i31 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + r(view));
                        }
                        if (z9) {
                            iMax4 = Math.max(measuredWidth, iMax4);
                        }
                    }
                    i24 = BasicMeasure.EXACTLY;
                    if (mode2 == i24) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    i25 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i25;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (!z18) {
                    }
                    iMax3 = Math.max(i23, measuredHeight);
                    if (z17) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                        if (z10) {
                            measuredHeight = i25;
                        }
                        iMax6 = Math.max(iMax6, measuredHeight);
                    } else {
                        if (z10 != 0) {
                            measuredHeight = i25;
                        }
                        iMax5 = Math.max(iMax5, measuredHeight);
                    }
                    iP += p(view, iP);
                    f10 = f12;
                }
                iP++;
                z14 = z9;
                iArr4 = iArr2;
                z11 = z18;
                iArr3 = iArr;
                mode = i22;
                i26 = BasicMeasure.EXACTLY;
            }
            i22 = mode;
            iArr = iArr3;
            iArr2 = iArr4;
            iMax3 = i12;
            z9 = z14;
            iP++;
            z14 = z9;
            iArr4 = iArr2;
            z11 = z18;
            iArr3 = iArr;
            mode = i22;
            i26 = BasicMeasure.EXACTLY;
        }
        boolean z19 = z11;
        int i32 = mode;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        int i33 = iCombineMeasuredStates;
        boolean z20 = z14;
        if (this.f10816v > 0 && t(virtualChildCount)) {
            this.f10816v += this.f10807B;
        }
        int i34 = iArr5[1];
        int iMax7 = (i34 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i12 : Math.max(i12, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i34, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
        if (z20) {
            i14 = i32;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                this.f10816v = 0;
                int iP2 = 0;
                while (iP2 < virtualChildCount) {
                    View viewS2 = s(iP2);
                    if (viewS2 == null) {
                        this.f10816v += y(iP2);
                    } else {
                        if (viewS2.getVisibility() == 8) {
                            iP2 += p(viewS2, iP2);
                        } else {
                            a aVar2 = (a) viewS2.getLayoutParams();
                            if (z13) {
                                this.f10816v += ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax4 + ((LinearLayout.LayoutParams) aVar2).rightMargin + r(viewS2);
                            } else {
                                iMax7 = iMax7;
                                int i35 = this.f10816v;
                                this.f10816v = Math.max(i35, i35 + iMax4 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + r(viewS2));
                            }
                        }
                        iP2++;
                        iMax7 = iMax7;
                        f10 = f10;
                    }
                    iP2++;
                    iMax7 = iMax7;
                    f10 = f10;
                }
            }
            i13 = iMax7;
        } else {
            i13 = iMax7;
            i14 = i32;
        }
        float f13 = f10;
        int paddingLeft = this.f10816v + getPaddingLeft() + getPaddingRight();
        this.f10816v = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, 0);
        int i36 = (16777215 & iResolveSizeAndState) - this.f10816v;
        if (z15 || (i36 != 0 && f13 > 0.0f)) {
            float f14 = this.f10817w;
            if (f14 > 0.0f) {
                f13 = f14;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            this.f10816v = 0;
            int iCombineMeasuredStates2 = i33;
            int iMax8 = -1;
            int i37 = 0;
            while (i37 < virtualChildCount) {
                View viewS3 = s(i37);
                if (viewS3 == null || viewS3.getVisibility() == 8) {
                    iResolveSizeAndState = iResolveSizeAndState;
                } else {
                    a aVar3 = (a) viewS3.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f15 > 0.0f) {
                        int i38 = (int) ((i36 * f15) / f13);
                        f13 -= f15;
                        i36 -= i38;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i20 = BasicMeasure.EXACTLY;
                            if (i14 == 1073741824) {
                                if (i38 <= 0) {
                                    i38 = 0;
                                }
                                viewS3.measure(View.MeasureSpec.makeMeasureSpec(i38, BasicMeasure.EXACTLY), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewS3.getMeasuredState() & (-16777216));
                        } else {
                            i20 = BasicMeasure.EXACTLY;
                        }
                        int measuredWidth2 = viewS3.getMeasuredWidth() + i38;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewS3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i20), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewS3.getMeasuredState() & (-16777216));
                    }
                    if (z13) {
                        this.f10816v += viewS3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + r(viewS3);
                    } else {
                        int i39 = this.f10816v;
                        this.f10816v = Math.max(i39, viewS3.getMeasuredWidth() + i39 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + r(viewS3));
                    }
                    boolean z21 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i40 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = viewS3.getMeasuredHeight() + i40;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z21) {
                        i40 = measuredHeight2;
                    }
                    int iMax9 = Math.max(iMax5, i40);
                    if (z17) {
                        i18 = -1;
                        boolean z22 = ((LinearLayout.LayoutParams) aVar3).height == -1;
                        if (z19 && (baseline = viewS3.getBaseline()) != i18) {
                            i19 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i19 < 0) {
                                i19 = this.f10815u;
                            }
                            int i41 = (((i19 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i41] = Math.max(iArr5[i41], baseline);
                            iArr6[i41] = Math.max(iArr6[i41], measuredHeight2 - baseline);
                        }
                        iMax5 = iMax9;
                        z17 = z22;
                    } else {
                        i18 = -1;
                    }
                    if (z19) {
                        i19 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i19 < 0) {
                            i19 = this.f10815u;
                        }
                        int i42 = (((i19 & 112) >> 4) & (-2)) >> 1;
                        iArr5[i42] = Math.max(iArr5[i42], baseline);
                        iArr6[i42] = Math.max(iArr6[i42], measuredHeight2 - baseline);
                    }
                    iMax5 = iMax9;
                    z17 = z22;
                }
                i37++;
                iResolveSizeAndState = iResolveSizeAndState;
            }
            i15 = iResolveSizeAndState;
            i16 = -16777216;
            this.f10816v += getPaddingLeft() + getPaddingRight();
            int i43 = iArr5[1];
            iMax = (i43 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i43, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
            i17 = iCombineMeasuredStates2;
            iMax2 = iMax5;
        } else {
            iMax2 = Math.max(iMax5, iMax6);
            if (z20 && i14 != 1073741824) {
                for (int i44 = 0; i44 < virtualChildCount; i44++) {
                    View viewS4 = s(i44);
                    if (viewS4 != null && viewS4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewS4.getLayoutParams())).weight > 0.0f) {
                        viewS4.measure(View.MeasureSpec.makeMeasureSpec(iMax4, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(viewS4.getMeasuredHeight(), BasicMeasure.EXACTLY));
                    }
                }
            }
            i15 = iResolveSizeAndState;
            i17 = i33;
            iMax = i13;
            i16 = -16777216;
        }
        if (!z17 && mode2 != 1073741824) {
            iMax = iMax2;
        }
        setMeasuredDimension(i15 | (i17 & i16), View.resolveSizeAndState(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i17 << 16));
        if (z16) {
            k(virtualChildCount, i10);
        }
    }

    int y(int i10) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x015b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0165  */
    void z(int i10, int i11) {
        int i12;
        int iMax;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z9;
        int iMax2;
        View view;
        int iMax3;
        boolean z10;
        int iMax4;
        int i22;
        this.f10816v = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i23 = this.f10812r;
        boolean z11 = this.f10818x;
        int iP = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int iMax5 = 0;
        boolean z12 = false;
        boolean z13 = false;
        float f10 = 0.0f;
        boolean z14 = true;
        while (true) {
            int i28 = 8;
            if (iP >= virtualChildCount) {
                float f11 = f10;
                int i29 = i24;
                int i30 = virtualChildCount;
                int i31 = mode2;
                boolean z15 = z11;
                int i32 = i25;
                int iMax6 = i26;
                int iCombineMeasuredStates = i27;
                if (this.f10816v > 0) {
                    i12 = i30;
                    if (t(i12)) {
                        this.f10816v += this.f10808C;
                    }
                } else {
                    i12 = i30;
                }
                int i33 = i31;
                if (z15 && (i33 == Integer.MIN_VALUE || i33 == 0)) {
                    this.f10816v = 0;
                    int iP2 = 0;
                    while (iP2 < i12) {
                        View viewS = s(iP2);
                        if (viewS == null) {
                            this.f10816v += y(iP2);
                        } else if (viewS.getVisibility() == i28) {
                            iP2 += p(viewS, iP2);
                        } else {
                            a aVar = (a) viewS.getLayoutParams();
                            int i34 = this.f10816v;
                            this.f10816v = Math.max(i34, i34 + i32 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + r(viewS));
                        }
                        iP2++;
                        i28 = 8;
                    }
                }
                int paddingTop = this.f10816v + getPaddingTop() + getPaddingBottom();
                this.f10816v = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, 0);
                int i35 = (16777215 & iResolveSizeAndState) - this.f10816v;
                if (z12 || (i35 != 0 && f11 > 0.0f)) {
                    float f12 = this.f10817w;
                    if (f12 <= 0.0f) {
                        f12 = f11;
                    }
                    this.f10816v = 0;
                    float f13 = f12;
                    int i36 = i35;
                    int i37 = 0;
                    while (i37 < i12) {
                        View viewS2 = s(i37);
                        if (viewS2.getVisibility() == 8) {
                            i33 = i33;
                            i37 = i37;
                        } else {
                            a aVar2 = (a) viewS2.getLayoutParams();
                            float f14 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f14 > 0.0f) {
                                int i38 = (int) ((i36 * f14) / f13);
                                f13 -= f14;
                                i36 -= i38;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i14 = BasicMeasure.EXACTLY;
                                    if (i33 == 1073741824) {
                                        viewS2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i38 > 0 ? i38 : 0, BasicMeasure.EXACTLY));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewS2.getMeasuredState() & (-256));
                                } else {
                                    i14 = BasicMeasure.EXACTLY;
                                }
                                int measuredHeight = viewS2.getMeasuredHeight() + i38;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewS2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i14));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewS2.getMeasuredState() & (-256));
                            } else {
                                i33 = i33;
                            }
                            int i39 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = viewS2.getMeasuredWidth() + i39;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            if (mode != 1073741824) {
                                i13 = -1;
                                if (((LinearLayout.LayoutParams) aVar2).width == -1) {
                                    measuredWidth = i39;
                                }
                            } else {
                                i13 = -1;
                            }
                            int iMax7 = Math.max(iMax5, measuredWidth);
                            boolean z16 = z14 && ((LinearLayout.LayoutParams) aVar2).width == i13;
                            int i40 = this.f10816v;
                            this.f10816v = Math.max(i40, i40 + viewS2.getMeasuredHeight() + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + r(viewS2));
                            iMax5 = iMax7;
                            z14 = z16;
                        }
                        i37++;
                        i33 = i33;
                    }
                    this.f10816v += getPaddingTop() + getPaddingBottom();
                    iMax = iMax5;
                } else {
                    iMax = Math.max(iMax5, i29);
                    if (z15 && i33 != 1073741824) {
                        for (int i41 = 0; i41 < i12; i41++) {
                            View viewS3 = s(i41);
                            if (viewS3 != null && viewS3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewS3.getLayoutParams())).weight > 0.0f) {
                                viewS3.measure(View.MeasureSpec.makeMeasureSpec(viewS3.getMeasuredWidth(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i32, BasicMeasure.EXACTLY));
                            }
                        }
                    }
                }
                if (!z14 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax6 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates), iResolveSizeAndState);
                if (z13) {
                    l(i12, i11);
                    return;
                }
                return;
            }
            float f15 = f10;
            View viewS4 = s(iP);
            if (viewS4 == null) {
                this.f10816v += y(iP);
            } else {
                if (viewS4.getVisibility() == 8) {
                    iP += p(viewS4, iP);
                } else {
                    if (t(iP)) {
                        this.f10816v += this.f10808C;
                    }
                    a aVar3 = (a) viewS4.getLayoutParams();
                    float f16 = ((LinearLayout.LayoutParams) aVar3).weight;
                    float f17 = f15 + f16;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f16 > 0.0f) {
                        int i42 = this.f10816v;
                        this.f10816v = Math.max(i42, ((LinearLayout.LayoutParams) aVar3).topMargin + i42 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax2 = i24;
                        iMax3 = i25;
                        i18 = virtualChildCount;
                        i19 = mode2;
                        z12 = true;
                        view = viewS4;
                        i21 = i26;
                        i20 = i27;
                        z9 = z11;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar3).height != 0 || f16 <= 0.0f) {
                            i15 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) aVar3).height = -2;
                            i15 = 0;
                        }
                        if (f17 == 0.0f) {
                            int i43 = i27;
                            i17 = this.f10816v;
                            i16 = i43;
                        } else {
                            i16 = i27;
                            i17 = 0;
                        }
                        int i44 = i25;
                        i18 = virtualChildCount;
                        i19 = mode2;
                        i20 = i16;
                        i21 = i26;
                        z9 = z11;
                        iMax2 = i24;
                        w(viewS4, iP, i10, 0, i11, i17);
                        view = viewS4;
                        if (i15 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar3).height = i15;
                        }
                        int measuredHeight2 = view.getMeasuredHeight();
                        int i45 = this.f10816v;
                        this.f10816v = Math.max(i45, i45 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + r(view));
                        iMax3 = z9 ? Math.max(measuredHeight2, i44) : i44;
                    }
                    if (i23 >= 0 && i23 == iP + 1) {
                        this.f10813s = this.f10816v;
                    }
                    if (iP < i23 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                        z10 = false;
                    } else {
                        z10 = true;
                        z13 = true;
                    }
                    int i46 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i46;
                    iMax4 = Math.max(i21, measuredWidth2);
                    int i47 = iMax3;
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i20, view.getMeasuredState());
                    if (z14) {
                        i22 = iCombineMeasuredStates2;
                        z14 = ((LinearLayout.LayoutParams) aVar3).width == -1;
                        if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                            if (!z10) {
                                i46 = measuredWidth2;
                            }
                            iMax2 = Math.max(iMax2, i46);
                        } else {
                            if (!z10) {
                                i46 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i46);
                        }
                        iP += p(view, iP);
                        f10 = f17;
                        i25 = i47;
                        i27 = i22;
                    } else {
                        i22 = iCombineMeasuredStates2;
                    }
                    if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        if (!z10) {
                            i46 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i46);
                    } else {
                        if (!z10) {
                            i46 = measuredWidth2;
                        }
                        iMax5 = Math.max(iMax5, i46);
                    }
                    iP += p(view, iP);
                    f10 = f17;
                    i25 = i47;
                    i27 = i22;
                }
                iP++;
                i26 = iMax4;
                i24 = iMax2;
                z11 = z9;
                mode2 = i19;
                virtualChildCount = i18;
            }
            iMax2 = i24;
            i18 = virtualChildCount;
            i19 = mode2;
            z9 = z11;
            f10 = f15;
            iMax4 = i26;
            iP++;
            i26 = iMax4;
            i24 = iMax2;
            z11 = z9;
            mode2 = i19;
            virtualChildCount = i18;
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10811q = true;
        this.f10812r = -1;
        this.f10813s = 0;
        this.f10815u = 8388659;
        int[] iArr = p050f.j.f20597a1;
        J jV = J.v(context, attributeSet, iArr, i10, 0);
        androidx.core.view.H.e0(this, context, iArr, attributeSet, jV.r(), i10, 0);
        int iK = jV.k(p050f.j.f20607c1, -1);
        if (iK >= 0) {
            setOrientation(iK);
        }
        int iK2 = jV.k(p050f.j.f20602b1, -1);
        if (iK2 >= 0) {
            setGravity(iK2);
        }
        boolean zA = jV.a(p050f.j.f20612d1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f10817w = jV.i(p050f.j.f20622f1, -1.0f);
        this.f10812r = jV.k(p050f.j.f20617e1, -1);
        this.f10818x = jV.a(p050f.j.f20637i1, false);
        setDividerDrawable(jV.g(p050f.j.f20627g1));
        this.f10809D = jV.k(p050f.j.f20642j1, 0);
        this.f10810E = jV.f(p050f.j.f20632h1, 0);
        jV.x();
    }
}

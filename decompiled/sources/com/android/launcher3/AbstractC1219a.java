package com.android.launcher3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.LinearLayout;
import android.window.OnBackAnimationCallback;
import androidx.recyclerview.widget.RecyclerView;
import com.android.launcher3.dragndrop.DragLayer;

/* JADX INFO: renamed from: com.android.launcher3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1219a extends LinearLayout implements F2.w, OnBackAnimationCallback {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f15492q;

    public AbstractC1219a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public static AbstractC1219a E(com.android.launcher3.views.f fVar, int i10) {
        return H(fVar, i10, true);
    }

    public static AbstractC1219a F(com.android.launcher3.views.f fVar) {
        return G(fVar, 15);
    }

    public static AbstractC1219a G(com.android.launcher3.views.f fVar, int i10) {
        return E(fVar, i10);
    }

    private static AbstractC1219a H(com.android.launcher3.views.f fVar, int i10, boolean z9) {
        DragLayer dragLayerJ = fVar.J();
        if (dragLayerJ == null) {
            return null;
        }
        for (int childCount = dragLayerJ.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = dragLayerJ.getChildAt(childCount);
            if (childAt instanceof AbstractC1219a) {
                AbstractC1219a abstractC1219a = (AbstractC1219a) childAt;
                if (abstractC1219a.J(i10) && (!z9 || abstractC1219a.K())) {
                    return abstractC1219a;
                }
            }
        }
        return null;
    }

    protected void A() {
        Pair<View, String> accessibilityTarget = getAccessibilityTarget();
        if (accessibilityTarget == null || !p243y2.a.b(getContext())) {
            return;
        }
        p243y2.a.d((View) accessibilityTarget.first, 32, (String) accessibilityTarget.second);
        if (this.f15492q) {
            getAccessibilityInitialFocusView().performAccessibilityAction(64, null);
        }
        ((com.android.launcher3.views.f) com.android.launcher3.views.f.y(getContext())).J().sendAccessibilityEvent(RecyclerView.ItemAnimator.FLAG_MOVED);
    }

    public boolean B() {
        return true;
    }

    public boolean C() {
        return false;
    }

    public final void D(boolean z9) {
        I(z9 & ValueAnimator.areAnimatorsEnabled());
        this.f15492q = false;
    }

    protected abstract void I(boolean z9);

    protected abstract boolean J(int i10);

    public final boolean K() {
        return this.f15492q;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    protected View getAccessibilityInitialFocusView() {
        return this;
    }

    protected Pair<View, String> getAccessibilityTarget() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ ViewOverlay getOverlay() {
        return super.getOverlay();
    }

    @Override // android.window.OnBackInvokedCallback
    public void onBackInvoked() {
        D(true);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.generateLayoutParams(layoutParams);
    }
}

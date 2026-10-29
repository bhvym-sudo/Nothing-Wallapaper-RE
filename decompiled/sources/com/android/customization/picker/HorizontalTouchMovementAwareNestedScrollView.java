package com.android.customization.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.widget.NestedScrollView;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class HorizontalTouchMovementAwareNestedScrollView extends NestedScrollView {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private float f15322W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f15323a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f15324b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalTouchMovementAwareNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.h(context, "context");
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        n.h(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.f15322W = event.getX();
            this.f15323a0 = event.getY();
            this.f15324b0 = false;
        } else if (action == 2) {
            float fAbs = Math.abs(event.getX() - this.f15322W);
            float fAbs2 = Math.abs(event.getY() - this.f15323a0);
            if (!this.f15324b0 && fAbs > fAbs2 && fAbs > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                this.f15324b0 = true;
            }
        }
        if (this.f15324b0) {
            return false;
        }
        return super.onInterceptTouchEvent(event);
    }
}

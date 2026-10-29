package com.nothing.wallpaper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class InterceptCoordinatorLayout extends CoordinatorLayout {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f19143P;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InterceptCoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        n.h(ev, "ev");
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(ev);
        if (this.f19143P) {
            return false;
        }
        return zOnInterceptTouchEvent;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        this.f19143P = z9;
    }

    public /* synthetic */ InterceptCoordinatorLayout(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterceptCoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
    }
}

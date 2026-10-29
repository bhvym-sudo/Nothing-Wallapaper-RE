package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class AccessibilityCellLayout extends View {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.android.launcher3.views.f f18754q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.android.launcher3.f f18755r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final p079h8.h f18756s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessibilityCellLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final float b(N1.a aVar) {
        com.android.launcher3.f fVar = this.f18755r;
        float f10 = fVar.f15543L;
        int iM = fVar.f15567e0 ? 0 : fVar.m() - this.f18755r.n();
        if (aVar == N1.a.SMALL && !this.f18755r.f15567e0) {
            iM += getFixedGap();
        }
        return f10 - iM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(AccessibilityCellLayout accessibilityCellLayout) {
        com.android.launcher3.f fVar = accessibilityCellLayout.f18755r;
        return fVar.f15577n - fVar.f15578o;
    }

    public static /* synthetic */ void e(AccessibilityCellLayout accessibilityCellLayout, N1.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        accessibilityCellLayout.d(aVar);
    }

    private final int getFixedGap() {
        return ((Number) this.f18756s.getValue()).intValue();
    }

    public final void d(N1.a aVar) {
        requestLayout();
        setTranslationY(b(aVar));
    }

    public final void f(boolean z9) {
        setImportantForAccessibility(z9 ? 2 : 1);
        setClickable(!z9);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        Rect rect = this.f18755r.f15541J;
        setMeasuredDimension(rect.width(), rect.height());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f18754q.Q()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public /* synthetic */ AccessibilityCellLayout(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityCellLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        com.android.launcher3.views.f fVar = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(context);
        this.f18754q = fVar;
        this.f18755r = fVar.K();
        this.f18756s = p079h8.i.b(new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.a
            @Override // p219v8.a
            public final Object invoke() {
                return Integer.valueOf(AccessibilityCellLayout.c(this.f19079q));
            }
        });
        e(this, null, 1, null);
    }
}

package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class ClockEditContentView extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.android.launcher3.views.f f18765q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.android.launcher3.f f18766r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f18767s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f18768t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p219v8.l f18769u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private O1.b f18770v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClockEditContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final void b() {
        removeAllViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ClockEditContentView clockEditContentView, O1.b bVar) {
        p219v8.l lVar = clockEditContentView.f18769u;
        if (lVar != null) {
            lVar.f(bVar.e());
        }
    }

    public final void c(final O1.b bVar, View clockView) {
        kotlin.jvm.internal.n.h(clockView, "clockView");
        if (bVar == null) {
            return;
        }
        this.f18770v = bVar;
        this.f18767s = 0.0f;
        removeAllViews();
        ViewParent parent = clockView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(clockView);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        layoutParams.topMargin = this.f18768t + this.f18766r.h();
        addView(clockView, layoutParams);
        postDelayed(new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.c
            @Override // java.lang.Runnable
            public final void run() {
                ClockEditContentView.d(this.f19084q, bVar);
            }
        }, 50L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.n.h(canvas, "canvas");
        canvas.save();
        canvas.translate(0.0f, this.f18767s);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final p219v8.l getOnClockChangedListener() {
        return this.f18769u;
    }

    public final int getTopMarginDate() {
        return this.f18768t;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (getChildAt(0) != null) {
            O1.b bVar = this.f18770v;
            if (kotlin.jvm.internal.n.d(bVar != null ? bVar.e() : null, "OLD_QUICKLOOK")) {
                this.f18767s = -this.f18768t;
            }
        }
    }

    public final void setOnClockChangedListener(p219v8.l lVar) {
        this.f18769u = lVar;
    }

    public final void setTopMarginDate(int i10) {
        this.f18768t = i10;
    }

    public /* synthetic */ ClockEditContentView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockEditContentView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        com.android.launcher3.views.f fVar = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(context);
        this.f18765q = fVar;
        this.f18766r = fVar.K();
        setWillNotDraw(false);
    }
}

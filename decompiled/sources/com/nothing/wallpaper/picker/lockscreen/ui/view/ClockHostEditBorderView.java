package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class ClockHostEditBorderView extends View {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.android.launcher3.views.f f18771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.android.launcher3.f f18772r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Drawable f18773s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Integer f18774t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p079h8.h f18775u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClockHostEditBorderView(Context cxt, AttributeSet attributeSet) {
        this(cxt, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(cxt, "cxt");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point b(ClockHostEditBorderView clockHostEditBorderView) {
        int width = (clockHostEditBorderView.getWidth() - clockHostEditBorderView.f18772r.f15539H) / 2;
        return new Point(width, clockHostEditBorderView.getRight() - width);
    }

    private final Point getBgBorderHorizontalOffset() {
        return (Point) this.f18775u.getValue();
    }

    public final void c(float f10) {
        Drawable drawable = this.f18773s;
        if (drawable != null) {
            drawable.setAlpha((int) (255 * f10));
        }
        invalidate();
    }

    public final void d(int i10) {
        this.f18774t = Integer.valueOf(i10);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        kotlin.jvm.internal.n.h(canvas, "canvas");
        Drawable drawable = this.f18773s;
        if ((drawable != null ? drawable.getAlpha() : 0) > 0) {
            Integer num = this.f18774t;
            int iIntValue = num != null ? num.intValue() : 0;
            Drawable drawable2 = this.f18773s;
            if (drawable2 != null) {
                drawable2.setBounds(getBgBorderHorizontalOffset().x, 0, getBgBorderHorizontalOffset().y, iIntValue);
            }
            Drawable drawable3 = this.f18773s;
            if (drawable3 != null) {
                drawable3.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable who) {
        kotlin.jvm.internal.n.h(who, "who");
        return super.verifyDrawable(who) || who == this.f18773s;
    }

    public /* synthetic */ ClockHostEditBorderView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockHostEditBorderView(Context cxt, AttributeSet attributeSet, int i10) {
        super(cxt, attributeSet, i10);
        kotlin.jvm.internal.n.h(cxt, "cxt");
        com.android.launcher3.views.f fVar = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(getContext());
        this.f18771q = fVar;
        this.f18772r = fVar.K();
        this.f18775u = p079h8.i.b(new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.d
            @Override // p219v8.a
            public final Object invoke() {
                return ClockHostEditBorderView.b(this.f19097q);
            }
        });
        F2.h hVar = F2.h.f1567a;
        Context context = getContext();
        kotlin.jvm.internal.n.g(context, "getContext(...)");
        Drawable drawableH = hVar.h(context);
        this.f18773s = drawableH;
        if (drawableH != null) {
            drawableH.setCallback(this);
        }
    }
}

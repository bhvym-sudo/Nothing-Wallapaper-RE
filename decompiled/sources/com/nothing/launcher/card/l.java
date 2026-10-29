package com.nothing.launcher.card;

import android.content.Context;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l extends com.nothing.cardhost.g implements p253z2.j, com.android.launcher3.u {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f18132i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private float f18133j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final p079h8.h f18134k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final com.android.launcher3.views.f f18135l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context, null, false, 6, null);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18132i0 = 1.0f;
        this.f18133j0 = 1.0f;
        this.f18134k0 = p079h8.i.b(new p219v8.a() { // from class: com.nothing.launcher.card.k
            @Override // p219v8.a
            public final Object invoke() {
                return l.r0(this.f18131q);
            }
        });
        this.f18135l0 = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(context);
    }

    private final F2.o getMultiTranslateDelegate() {
        return (F2.o) this.f18134k0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F2.o r0(l lVar) {
        return new F2.o(lVar);
    }

    private final void s0() {
        super.setScaleX(this.f18132i0 * this.f18133j0);
        super.setScaleY(this.f18132i0 * this.f18133j0);
    }

    @Override // p253z2.j
    public void d(Rect rect) {
        int measuredWidth = (int) (getMeasuredWidth() * this.f18132i0);
        int measuredHeight = (int) (getMeasuredHeight() * this.f18132i0);
        if (rect != null) {
            rect.set(0, 0, measuredWidth, measuredHeight);
        }
    }

    protected final com.android.launcher3.views.f getActivityContext() {
        return this.f18135l0;
    }

    @Override // com.android.launcher3.u
    public float getReorderBounceScale() {
        return this.f18133j0;
    }

    public final float getScaleToFit() {
        return this.f18132i0;
    }

    @Override // com.android.launcher3.u
    public F2.o getTranslateDelegate() {
        return getMultiTranslateDelegate();
    }

    @Override // p253z2.j
    public int getViewType() {
        return 1;
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        Rect rect = this.f18135l0.K().f15538G;
        super.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.android.launcher3.u
    public void setReorderBounceScale(float f10) {
        this.f18133j0 = f10;
        s0();
    }

    public final void setScaleToFit(float f10) {
        this.f18132i0 = f10;
        s0();
    }
}

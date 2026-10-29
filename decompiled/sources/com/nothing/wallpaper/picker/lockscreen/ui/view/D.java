package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.android.launcher3.Workspace;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class D extends c0 implements com.android.launcher3.h, com.android.launcher3.dragndrop.a.b {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final a f18898g0 = new a(null);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Interpolator f18899h0 = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    protected DeleteDropView f18900d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f18901e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private AnimatorSet f18902f0;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final void q0(final boolean z9, View view) {
        final View curPageView = getCurPageView();
        if (curPageView == null) {
            return;
        }
        AnimatorSet animatorSet = this.f18902f0;
        if (animatorSet != null) {
            if (!animatorSet.isRunning()) {
                animatorSet = null;
            }
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        }
        curPageView.setVisibility(0);
        float scaleX = curPageView.getScaleX();
        float f10 = z9 ? 0.95f : 1.0f;
        float alpha = curPageView.getAlpha();
        float f11 = z9 ? 0.0f : 1.0f;
        getWidgetDeleteView().setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ObjectAnimator.ofFloat(curPageView, (Property<View, Float>) View.ALPHA, alpha, f11));
        if (curPageView instanceof WidgetPickerGroupPage) {
            animatorSet2.play(ObjectAnimator.ofFloat(((WidgetPickerGroupPage) curPageView).getContent(), com.android.launcher3.j.f15619b, f10));
        } else {
            animatorSet2.play(ObjectAnimator.ofFloat(curPageView, com.android.launcher3.j.f15619b, scaleX, f10));
        }
        if (view instanceof com.nothing.launcher.card.s) {
            FloatProperty floatProperty = com.nothing.launcher.card.s.f18152r0;
            animatorSet2.play(ObjectAnimator.ofFloat(view, floatProperty, ((Float) floatProperty.get(view)).floatValue(), z9 ? 1.0f : 0.0f));
        }
        animatorSet2.addListener(p223w2.f.c(new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.B
            @Override // java.lang.Runnable
            public final void run() {
                D.r0(curPageView, this, z9);
            }
        }));
        animatorSet2.setDuration(400L);
        animatorSet2.setInterpolator(f18899h0);
        animatorSet2.start();
        this.f18902f0 = animatorSet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(View view, D d10, boolean z9) {
        p223w2.a.a(view);
        d10.getWidgetDeleteView().setVisibility(z9 ? 0 : 8);
    }

    private final boolean s0(C2.b bVar) {
        return bVar.f593q != -1;
    }

    private final void t0(com.android.launcher3.h.a aVar) {
        C2.b bVar = aVar.f15599g;
        kotlin.jvm.internal.n.e(bVar);
        if (s0(bVar)) {
            ((p248y7.u) this.f15733r).o(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(D d10, com.android.launcher3.h.a aVar) {
        d10.t0(aVar);
    }

    @Override // com.android.launcher3.h
    public void c(Rect outRect) {
        kotlin.jvm.internal.n.h(outRect, "outRect");
        Rect rect = new Rect();
        getHitRect(outRect);
        outRect.top += ((p248y7.u) this.f15733r).K().f15547P;
        ((p248y7.u) this.f15733r).J().i(getWidgetDeleteView(), rect);
    }

    @Override // com.android.launcher3.h
    public void g(com.android.launcher3.h.a dragObject) {
        kotlin.jvm.internal.n.h(dragObject, "dragObject");
        this.f18901e0 = dragObject.f15601i instanceof Workspace;
    }

    protected final DeleteDropView getWidgetDeleteView() {
        DeleteDropView deleteDropView = this.f18900d0;
        if (deleteDropView != null) {
            return deleteDropView;
        }
        kotlin.jvm.internal.n.r("widgetDeleteView");
        return null;
    }

    @Override // com.android.launcher3.h
    public boolean i() {
        return true;
    }

    @Override // com.android.launcher3.h
    public void l(com.android.launcher3.h.a dragObject) {
        kotlin.jvm.internal.n.h(dragObject, "dragObject");
    }

    @Override // com.android.launcher3.dragndrop.a.b
    public void n(com.android.launcher3.h.a dragObject, p253z2.e eVar) {
        kotlin.jvm.internal.n.h(dragObject, "dragObject");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((p248y7.u) this.f15733r).p().d(this);
        ((p248y7.u) this.f15733r).p().e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((p248y7.u) this.f15733r).p().B(this);
        ((p248y7.u) this.f15733r).p().A(this);
    }

    @Override // com.android.launcher3.h
    public void s(com.android.launcher3.h.a dragObject) {
        kotlin.jvm.internal.n.h(dragObject, "dragObject");
        if (dragObject.f15601i instanceof Workspace) {
            q0(true, dragObject.f15598f.getContentView());
        }
    }

    protected final void setWidgetDeleteView(DeleteDropView deleteDropView) {
        kotlin.jvm.internal.n.h(deleteDropView, "<set-?>");
        this.f18900d0 = deleteDropView;
    }

    @Override // com.android.launcher3.dragndrop.a.b
    public void t() {
        if (this.f18901e0) {
            q0(false, null);
            this.f18901e0 = false;
        }
    }

    @Override // com.android.launcher3.h
    public boolean u(com.android.launcher3.h.a dragObject) {
        kotlin.jvm.internal.n.h(dragObject, "dragObject");
        return true;
    }

    @Override // com.android.launcher3.h
    public void w(com.android.launcher3.h.a dragObject) {
        kotlin.jvm.internal.n.h(dragObject, "dragObject");
        if (this.f18901e0 || !(dragObject.f15601i instanceof Workspace)) {
            return;
        }
        q0(false, dragObject.f15598f.getContentView());
    }

    @Override // com.android.launcher3.h
    public void z(final com.android.launcher3.h.a dragObject, p253z2.e options) {
        kotlin.jvm.internal.n.h(dragObject, "dragObject");
        kotlin.jvm.internal.n.h(options, "options");
        if (options.f30659f) {
            return;
        }
        p253z2.h hVar = dragObject.f15598f;
        Rect rectB = getWidgetDeleteView().b(dragObject);
        hVar.j(true);
        ((p248y7.u) this.f15733r).J().t(hVar, rectB, 0.0f, 0.5f, 0.5f, 300, p212v1.d.f28095L, new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.C
            @Override // java.lang.Runnable
            public final void run() {
                D.u0(this.f18760q, dragObject);
            }
        }, 0, null);
    }
}

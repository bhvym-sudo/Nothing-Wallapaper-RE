package com.nothing.launcher.card;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends A2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m f18140e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(View view) {
        super(view);
        kotlin.jvm.internal.n.h(view, "view");
        Object tag = view.getTag();
        kotlin.jvm.internal.n.f(tag, "null cannot be cast to non-null type com.nothing.launcher.card.PendingAddCardInfo");
        this.f18140e = (m) tag;
    }

    public final void c(Drawable preview, Rect previewBounds, Point screenPos, com.android.launcher3.g source, p253z2.e options) {
        kotlin.jvm.internal.n.h(preview, "preview");
        kotlin.jvm.internal.n.h(previewBounds, "previewBounds");
        kotlin.jvm.internal.n.h(screenPos, "screenPos");
        kotlin.jvm.internal.n.h(source, "source");
        kotlin.jvm.internal.n.h(options, "options");
        com.android.launcher3.views.f fVar = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(this.f157b.getContext());
        p253z2.j jVarC = p253z2.j.c(1);
        int i10 = screenPos.x + previewBounds.left;
        int i11 = screenPos.y + previewBounds.top;
        fVar.p().d(new T5.a(fVar));
        com.android.launcher3.dragndrop.a aVarP = fVar.p();
        View mView = this.f157b;
        kotlin.jvm.internal.n.g(mView, "mView");
        aVarP.d(new h(fVar, mView));
        fVar.p().D(preview, jVarC, i10, i11, source, this.f18140e, null, 1.0f, 1.0f, options);
    }
}

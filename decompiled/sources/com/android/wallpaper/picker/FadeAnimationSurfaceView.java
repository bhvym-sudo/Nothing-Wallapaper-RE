package com.android.wallpaper.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class FadeAnimationSurfaceView extends SurfaceView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FadeAnimationSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        n.h(context, "context");
        n.h(attrs, "attrs");
    }

    @Override // android.view.SurfaceView, android.view.View
    protected boolean onSetAlpha(int i10) {
        requestUpdateSurfacePositionAndScale();
        return super.onSetAlpha(i10);
    }

    protected void onSetSurfacePositionAndScale(SurfaceControl.Transaction transaction, SurfaceControl surface, int i10, int i11, float f10, float f11) {
        n.h(transaction, "transaction");
        n.h(surface, "surface");
        super.onSetSurfacePositionAndScale(transaction, surface, i10, i11, f10, f11);
        transaction.setAlpha(surface, getAlpha());
    }
}

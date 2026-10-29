package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f17649r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final RectF f17650s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final RectF f17651t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int[] f17652u;

    public FabTransformationBehavior() {
        this.f17649r = new Rect();
        this.f17650s = new RectF();
        this.f17651t = new RectF();
        this.f17652u = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        if (fVar.f12138h == 0) {
            fVar.f12138h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17649r = new Rect();
        this.f17650s = new RectF();
        this.f17651t = new RectF();
        this.f17652u = new int[2];
    }
}

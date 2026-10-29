package com.google.android.material.transformation;

import G4.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.o;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.H;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f17648q;

    public ExpandableBehavior() {
        this.f17648q = 0;
    }

    protected a I(CoordinatorLayout coordinatorLayout, View view) {
        List listL = coordinatorLayout.l(view);
        int size = listL.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) listL.get(i10);
            if (i(coordinatorLayout, view, view2)) {
                o.a(view2);
                return null;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean i(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        o.a(view2);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (H.M(view)) {
            return false;
        }
        I(coordinatorLayout, view);
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17648q = 0;
    }
}

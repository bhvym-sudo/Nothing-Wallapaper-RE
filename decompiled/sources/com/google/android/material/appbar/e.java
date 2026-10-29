package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
abstract class e extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private f f16463q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f16464r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f16465s;

    public e() {
        this.f16464r = 0;
        this.f16465s = 0;
    }

    public int I() {
        f fVar = this.f16463q;
        if (fVar != null) {
            return fVar.c();
        }
        return 0;
    }

    protected void J(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.C(view, i10);
    }

    public boolean K(int i10) {
        f fVar = this.f16463q;
        if (fVar != null) {
            return fVar.f(i10);
        }
        this.f16464r = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        J(coordinatorLayout, view, i10);
        if (this.f16463q == null) {
            this.f16463q = new f(view);
        }
        this.f16463q.d();
        this.f16463q.a();
        int i11 = this.f16464r;
        if (i11 != 0) {
            this.f16463q.f(i11);
            this.f16464r = 0;
        }
        int i12 = this.f16465s;
        if (i12 == 0) {
            return true;
        }
        this.f16463q.e(i12);
        this.f16465s = 0;
        return true;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16464r = 0;
        this.f16465s = 0;
    }
}

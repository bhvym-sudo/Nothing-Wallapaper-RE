package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.o;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.H;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;
import p225w4.a;
import p225w4.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final int f16505n0 = j.f28919p;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final int f16506o0 = a.f28668C;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f16507p0 = a.f28676K;

    static /* synthetic */ void U(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ View V(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void X(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.f) view.getLayoutParams()).f12134d = 17;
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final Rect f16508C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private WeakReference f16509D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f16510E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private final View.OnLayoutChangeListener f16511F;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                o.a(Behavior.this.f16509D.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f16511F = new a();
            this.f16508C = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            o.a(view);
            return T(coordinatorLayout, null, view2, view3, i10, i11);
        }

        public boolean S(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f16509D = new WeakReference(bottomAppBar);
            View viewV = BottomAppBar.V(bottomAppBar);
            if (viewV != null && !H.M(viewV)) {
                BottomAppBar.X(bottomAppBar, viewV);
                this.f16510E = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewV.getLayoutParams())).bottomMargin;
                viewV.addOnLayoutChangeListener(this.f16511F);
                BottomAppBar.U(bottomAppBar);
            }
            coordinatorLayout.C(bottomAppBar, i10);
            return super.p(coordinatorLayout, bottomAppBar, i10);
        }

        public boolean T(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
            o.a(view);
            return S(coordinatorLayout, null, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16511F = new a();
            this.f16508C = new Rect();
        }
    }
}

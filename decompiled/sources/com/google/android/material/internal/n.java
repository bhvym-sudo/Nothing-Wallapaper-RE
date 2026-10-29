package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.H;
import androidx.core.view.InterfaceC1090w;
import androidx.core.view.V;
import androidx.core.view.W;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    class a implements InterfaceC1090w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f17125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f17126b;

        a(c cVar, d dVar) {
            this.f17125a = cVar;
            this.f17126b = dVar;
        }

        @Override // androidx.core.view.InterfaceC1090w
        public V onApplyWindowInsets(View view, V v9) {
            return this.f17125a.a(view, v9, new d(this.f17126b));
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            H.d0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        V a(View view, V v9, d dVar);
    }

    public static void b(View view, c cVar) {
        H.u0(view, new a(cVar, new d(H.z(view), view.getPaddingTop(), H.y(view), view.getPaddingBottom())));
        i(view);
    }

    public static float c(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        ColorStateList colorStateListF = com.google.android.material.drawable.a.f(view.getBackground());
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager e(View view) {
        return (InputMethodManager) p171r0.a.e(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float fR = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fR += H.r((View) parent);
        }
        return fR;
    }

    public static boolean g(View view) {
        return H.v(view) == 1;
    }

    public static PorterDuff.Mode h(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void i(View view) {
        if (H.L(view)) {
            H.d0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void j(final View view, final boolean z9) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.m
            @Override // java.lang.Runnable
            public final void run() {
                n.k(view, z9);
            }
        });
    }

    public static void k(View view, boolean z9) {
        W wE;
        if (!z9 || (wE = H.E(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            wE.f(V.k.a());
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17130d;

        public d(int i10, int i11, int i12, int i13) {
            this.f17127a = i10;
            this.f17128b = i11;
            this.f17129c = i12;
            this.f17130d = i13;
        }

        public d(d dVar) {
            this.f17127a = dVar.f17127a;
            this.f17128b = dVar.f17128b;
            this.f17129c = dVar.f17129c;
            this.f17130d = dVar.f17130d;
        }
    }
}

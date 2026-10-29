package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1008e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f11067a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private H f11070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private H f11071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private H f11072f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11069c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1011h f11068b = C1011h.b();

    C1008e(View view) {
        this.f11067a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f11072f == null) {
            this.f11072f = new H();
        }
        H h10 = this.f11072f;
        h10.a();
        ColorStateList colorStateListO = androidx.core.view.H.o(this.f11067a);
        if (colorStateListO != null) {
            h10.f10799d = true;
            h10.f10796a = colorStateListO;
        }
        PorterDuff.Mode modeP = androidx.core.view.H.p(this.f11067a);
        if (modeP != null) {
            h10.f10798c = true;
            h10.f10797b = modeP;
        }
        if (!h10.f10799d && !h10.f10798c) {
            return false;
        }
        C1011h.i(drawable, h10, this.f11067a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f11070d != null;
    }

    void b() {
        Drawable background = this.f11067a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            H h10 = this.f11071e;
            if (h10 != null) {
                C1011h.i(background, h10, this.f11067a.getDrawableState());
                return;
            }
            H h11 = this.f11070d;
            if (h11 != null) {
                C1011h.i(background, h11, this.f11067a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        H h10 = this.f11071e;
        if (h10 != null) {
            return h10.f10796a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        H h10 = this.f11071e;
        if (h10 != null) {
            return h10.f10797b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i10) {
        Context context = this.f11067a.getContext();
        int[] iArr = p050f.j.f20694t3;
        J jV = J.v(context, attributeSet, iArr, i10, 0);
        View view = this.f11067a;
        androidx.core.view.H.e0(view, view.getContext(), iArr, attributeSet, jV.r(), i10, 0);
        try {
            int i11 = p050f.j.f20699u3;
            if (jV.s(i11)) {
                this.f11069c = jV.n(i11, -1);
                ColorStateList colorStateListF = this.f11068b.f(this.f11067a.getContext(), this.f11069c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i12 = p050f.j.f20704v3;
            if (jV.s(i12)) {
                androidx.core.view.H.l0(this.f11067a, jV.c(i12));
            }
            int i13 = p050f.j.f20709w3;
            if (jV.s(i13)) {
                androidx.core.view.H.m0(this.f11067a, v.d(jV.k(i13, -1), null));
            }
        } finally {
            jV.x();
        }
    }

    void f(Drawable drawable) {
        this.f11069c = -1;
        h(null);
        b();
    }

    void g(int i10) {
        this.f11069c = i10;
        C1011h c1011h = this.f11068b;
        h(c1011h != null ? c1011h.f(this.f11067a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f11070d == null) {
                this.f11070d = new H();
            }
            H h10 = this.f11070d;
            h10.f10796a = colorStateList;
            h10.f10799d = true;
        } else {
            this.f11070d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f11071e == null) {
            this.f11071e = new H();
        }
        H h10 = this.f11071e;
        h10.f10796a = colorStateList;
        h10.f10799d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f11071e == null) {
            this.f11071e = new H();
        }
        H h10 = this.f11071e;
        h10.f10797b = mode;
        h10.f10798c = true;
        b();
    }
}

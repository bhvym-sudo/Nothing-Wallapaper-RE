package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: androidx.appcompat.widget.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1015l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f11098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H f11099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private H f11100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private H f11101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11102e = 0;

    public C1015l(ImageView imageView) {
        this.f11098a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f11101d == null) {
            this.f11101d = new H();
        }
        H h10 = this.f11101d;
        h10.a();
        ColorStateList colorStateListA = androidx.core.widget.i.a(this.f11098a);
        if (colorStateListA != null) {
            h10.f10799d = true;
            h10.f10796a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.i.b(this.f11098a);
        if (modeB != null) {
            h10.f10798c = true;
            h10.f10797b = modeB;
        }
        if (!h10.f10799d && !h10.f10798c) {
            return false;
        }
        C1011h.i(drawable, h10, this.f11098a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f11099b != null;
    }

    void b() {
        if (this.f11098a.getDrawable() != null) {
            this.f11098a.getDrawable().setLevel(this.f11102e);
        }
    }

    void c() {
        Drawable drawable = this.f11098a.getDrawable();
        if (drawable != null) {
            v.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            H h10 = this.f11100c;
            if (h10 != null) {
                C1011h.i(drawable, h10, this.f11098a.getDrawableState());
                return;
            }
            H h11 = this.f11099b;
            if (h11 != null) {
                C1011h.i(drawable, h11, this.f11098a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        H h10 = this.f11100c;
        if (h10 != null) {
            return h10.f10796a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        H h10 = this.f11100c;
        if (h10 != null) {
            return h10.f10797b;
        }
        return null;
    }

    boolean f() {
        return !(this.f11098a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iN;
        Context context = this.f11098a.getContext();
        int[] iArr = p050f.j.f20551P;
        J jV = J.v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f11098a;
        androidx.core.view.H.e0(imageView, imageView.getContext(), iArr, attributeSet, jV.r(), i10, 0);
        try {
            Drawable drawable = this.f11098a.getDrawable();
            if (drawable == null && (iN = jV.n(p050f.j.f20555Q, -1)) != -1 && (drawable = p060g.a.b(this.f11098a.getContext(), iN)) != null) {
                this.f11098a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                v.b(drawable);
            }
            int i11 = p050f.j.f20559R;
            if (jV.s(i11)) {
                androidx.core.widget.i.c(this.f11098a, jV.c(i11));
            }
            int i12 = p050f.j.f20563S;
            if (jV.s(i12)) {
                androidx.core.widget.i.d(this.f11098a, v.d(jV.k(i12, -1), null));
            }
        } finally {
            jV.x();
        }
    }

    void h(Drawable drawable) {
        this.f11102e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = p060g.a.b(this.f11098a.getContext(), i10);
            if (drawableB != null) {
                v.b(drawableB);
            }
            this.f11098a.setImageDrawable(drawableB);
        } else {
            this.f11098a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f11100c == null) {
            this.f11100c = new H();
        }
        H h10 = this.f11100c;
        h10.f10796a = colorStateList;
        h10.f10799d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f11100c == null) {
            this.f11100c = new H();
        }
        H h10 = this.f11100c;
        h10.f10797b = mode;
        h10.f10798c = true;
        c();
    }
}

package I;

import android.graphics.BlendMode;

/* JADX INFO: renamed from: I.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0857a {
    public static final BlendMode a(int i10) {
        AbstractC0867k.a aVar = AbstractC0867k.f2708a;
        if (AbstractC0867k.E(i10, aVar.a())) {
            return BlendMode.CLEAR;
        }
        if (AbstractC0867k.E(i10, aVar.x())) {
            return BlendMode.SRC;
        }
        if (AbstractC0867k.E(i10, aVar.g())) {
            return BlendMode.DST;
        }
        if (AbstractC0867k.E(i10, aVar.B())) {
            return BlendMode.SRC_OVER;
        }
        if (AbstractC0867k.E(i10, aVar.k())) {
            return BlendMode.DST_OVER;
        }
        if (AbstractC0867k.E(i10, aVar.z())) {
            return BlendMode.SRC_IN;
        }
        if (AbstractC0867k.E(i10, aVar.i())) {
            return BlendMode.DST_IN;
        }
        if (AbstractC0867k.E(i10, aVar.A())) {
            return BlendMode.SRC_OUT;
        }
        if (AbstractC0867k.E(i10, aVar.j())) {
            return BlendMode.DST_OUT;
        }
        if (AbstractC0867k.E(i10, aVar.y())) {
            return BlendMode.SRC_ATOP;
        }
        if (AbstractC0867k.E(i10, aVar.h())) {
            return BlendMode.DST_ATOP;
        }
        if (AbstractC0867k.E(i10, aVar.C())) {
            return BlendMode.XOR;
        }
        if (AbstractC0867k.E(i10, aVar.t())) {
            return BlendMode.PLUS;
        }
        if (AbstractC0867k.E(i10, aVar.q())) {
            return BlendMode.MODULATE;
        }
        if (AbstractC0867k.E(i10, aVar.v())) {
            return BlendMode.SCREEN;
        }
        if (AbstractC0867k.E(i10, aVar.s())) {
            return BlendMode.OVERLAY;
        }
        if (AbstractC0867k.E(i10, aVar.e())) {
            return BlendMode.DARKEN;
        }
        if (AbstractC0867k.E(i10, aVar.o())) {
            return BlendMode.LIGHTEN;
        }
        if (AbstractC0867k.E(i10, aVar.d())) {
            return BlendMode.COLOR_DODGE;
        }
        if (AbstractC0867k.E(i10, aVar.c())) {
            return BlendMode.COLOR_BURN;
        }
        if (AbstractC0867k.E(i10, aVar.m())) {
            return BlendMode.HARD_LIGHT;
        }
        if (AbstractC0867k.E(i10, aVar.w())) {
            return BlendMode.SOFT_LIGHT;
        }
        if (AbstractC0867k.E(i10, aVar.f())) {
            return BlendMode.DIFFERENCE;
        }
        if (AbstractC0867k.E(i10, aVar.l())) {
            return BlendMode.EXCLUSION;
        }
        if (AbstractC0867k.E(i10, aVar.r())) {
            return BlendMode.MULTIPLY;
        }
        if (AbstractC0867k.E(i10, aVar.n())) {
            return BlendMode.HUE;
        }
        if (AbstractC0867k.E(i10, aVar.u())) {
            return BlendMode.SATURATION;
        }
        if (AbstractC0867k.E(i10, aVar.b())) {
            return BlendMode.COLOR;
        }
        return AbstractC0867k.E(i10, aVar.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }
}

package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
abstract class h extends N4.h {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    b f17461P;

    private static class c extends h {
        c(b bVar) {
            super(bVar);
        }

        @Override // N4.h
        protected void r(Canvas canvas) {
            if (this.f17461P.f17462w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f17461P.f17462w);
            super.r(canvas);
            canvas.restore();
        }
    }

    static h h0(N4.l lVar) {
        if (lVar == null) {
            lVar = new N4.l();
        }
        return i0(new b(lVar, new RectF()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h i0(b bVar) {
        return new c(bVar);
    }

    boolean j0() {
        return !this.f17461P.f17462w.isEmpty();
    }

    void k0() {
        l0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void l0(float f10, float f11, float f12, float f13) {
        if (f10 == this.f17461P.f17462w.left && f11 == this.f17461P.f17462w.top && f12 == this.f17461P.f17462w.right && f13 == this.f17461P.f17462w.bottom) {
            return;
        }
        this.f17461P.f17462w.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    void m0(RectF rectF) {
        l0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // N4.h, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f17461P = new b(this.f17461P);
        return this;
    }

    private static final class b extends N4.h.c {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final RectF f17462w;

        @Override // N4.h.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVarI0 = h.i0(this);
            hVarI0.invalidateSelf();
            return hVarI0;
        }

        private b(N4.l lVar, RectF rectF) {
            super(lVar, null);
            this.f17462w = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f17462w = bVar.f17462w;
        }
    }

    private h(b bVar) {
        super(bVar);
        this.f17461P = bVar;
    }
}

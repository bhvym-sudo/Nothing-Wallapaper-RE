package com.google.android.material.carousel;

import N4.l;
import N4.o;
import N4.p;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.material.carousel.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends FrameLayout implements h, o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f16744q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final RectF f16745r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private l f16746s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final p f16747t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Boolean f16748u;

    public i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ N4.d a(N4.d dVar) {
        return dVar instanceof N4.a ? N4.c.b((N4.a) dVar) : dVar;
    }

    private void c() {
        this.f16747t.f(this, this.f16745r);
    }

    private void d() {
        if (this.f16744q != -1.0f) {
            float fB = p235x4.a.b(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.f16744q);
            setMaskRectF(new RectF(fB, 0.0f, getWidth() - fB, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.f16747t.e(canvas, new p255z4.a.InterfaceC0765a() { // from class: A4.d
            @Override // p255z4.a.InterfaceC0765a
            public final void a(Canvas canvas2) {
                super/*android.view.View*/.dispatchDraw(canvas2);
            }
        });
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        RectF rectF = this.f16745r;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public RectF getMaskRectF() {
        return this.f16745r;
    }

    @Deprecated
    public float getMaskXPercentage() {
        return this.f16744q;
    }

    public l getShapeAppearanceModel() {
        return this.f16746s;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f16748u;
        if (bool != null) {
            this.f16747t.h(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f16748u = Boolean.valueOf(this.f16747t.c());
        this.f16747t.h(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f16744q != -1.0f) {
            d();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f16745r.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.f16745r.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setForceCompatClipping(boolean z9) {
        this.f16747t.h(this, z9);
    }

    @Override // com.google.android.material.carousel.h
    public void setMaskRectF(RectF rectF) {
        this.f16745r.set(rectF);
        c();
    }

    @Deprecated
    public void setMaskXPercentage(float f10) {
        float fA = p221w0.a.a(f10, 0.0f, 1.0f);
        if (this.f16744q != fA) {
            this.f16744q = fA;
            d();
        }
    }

    public void setOnMaskChangedListener(A4.e eVar) {
    }

    @Override // N4.o
    public void setShapeAppearanceModel(l lVar) {
        l lVarY = lVar.y(new l.c() { // from class: A4.c
            @Override // N4.l.c
            public final N4.d a(N4.d dVar) {
                return i.a(dVar);
            }
        });
        this.f16746s = lVarY;
        this.f16747t.g(this, lVarY);
    }

    public i(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16744q = -1.0f;
        this.f16745r = new RectF();
        this.f16747t = p.a(this);
        this.f16748u = null;
        setShapeAppearanceModel(l.f(context, attributeSet, i10, 0, 0).m());
    }
}

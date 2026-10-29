package com.nothing.cardwidget.pedometer;

/* JADX INFO: loaded from: classes2.dex */
public final class Rectangle extends Shape {
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public Rectangle(float f10, float f11, float f12, float f13, float f14, float f15, int i10) {
        super(f14, f15, i10);
        this.left = f10;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }
}

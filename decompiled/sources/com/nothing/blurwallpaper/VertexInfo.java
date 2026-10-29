package com.nothing.blurwallpaper;

/* JADX INFO: loaded from: classes.dex */
public final class VertexInfo {
    private int bitmapHeight;
    private int bitmapWidth;
    private int pixelColor;
    private int population;
    private int swatchColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f17711x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f17712y;

    public VertexInfo(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f17711x = i10;
        this.f17712y = i11;
        this.bitmapWidth = i12;
        this.bitmapHeight = i13;
        this.pixelColor = i14;
        this.swatchColor = i15;
        this.population = i16;
    }

    public static /* synthetic */ VertexInfo copy$default(VertexInfo vertexInfo, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i10 = vertexInfo.f17711x;
        }
        if ((i17 & 2) != 0) {
            i11 = vertexInfo.f17712y;
        }
        if ((i17 & 4) != 0) {
            i12 = vertexInfo.bitmapWidth;
        }
        if ((i17 & 8) != 0) {
            i13 = vertexInfo.bitmapHeight;
        }
        if ((i17 & 16) != 0) {
            i14 = vertexInfo.pixelColor;
        }
        if ((i17 & 32) != 0) {
            i15 = vertexInfo.swatchColor;
        }
        if ((i17 & 64) != 0) {
            i16 = vertexInfo.population;
        }
        int i18 = i15;
        int i19 = i16;
        int i20 = i14;
        int i21 = i12;
        return vertexInfo.copy(i10, i11, i21, i13, i20, i18, i19);
    }

    public final int component1() {
        return this.f17711x;
    }

    public final int component2() {
        return this.f17712y;
    }

    public final int component3() {
        return this.bitmapWidth;
    }

    public final int component4() {
        return this.bitmapHeight;
    }

    public final int component5() {
        return this.pixelColor;
    }

    public final int component6() {
        return this.swatchColor;
    }

    public final int component7() {
        return this.population;
    }

    public final VertexInfo copy(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new VertexInfo(i10, i11, i12, i13, i14, i15, i16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VertexInfo)) {
            return false;
        }
        VertexInfo vertexInfo = (VertexInfo) obj;
        return this.f17711x == vertexInfo.f17711x && this.f17712y == vertexInfo.f17712y && this.bitmapWidth == vertexInfo.bitmapWidth && this.bitmapHeight == vertexInfo.bitmapHeight && this.pixelColor == vertexInfo.pixelColor && this.swatchColor == vertexInfo.swatchColor && this.population == vertexInfo.population;
    }

    public final int getBitmapHeight() {
        return this.bitmapHeight;
    }

    public final int getBitmapWidth() {
        return this.bitmapWidth;
    }

    public final int getPixelColor() {
        return this.pixelColor;
    }

    public final int getPopulation() {
        return this.population;
    }

    public final int getSwatchColor() {
        return this.swatchColor;
    }

    public final int getX() {
        return this.f17711x;
    }

    public final int getY() {
        return this.f17712y;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f17711x) * 31) + Integer.hashCode(this.f17712y)) * 31) + Integer.hashCode(this.bitmapWidth)) * 31) + Integer.hashCode(this.bitmapHeight)) * 31) + Integer.hashCode(this.pixelColor)) * 31) + Integer.hashCode(this.swatchColor)) * 31) + Integer.hashCode(this.population);
    }

    public final void setBitmapHeight(int i10) {
        this.bitmapHeight = i10;
    }

    public final void setBitmapWidth(int i10) {
        this.bitmapWidth = i10;
    }

    public final void setPixelColor(int i10) {
        this.pixelColor = i10;
    }

    public final void setPopulation(int i10) {
        this.population = i10;
    }

    public final void setSwatchColor(int i10) {
        this.swatchColor = i10;
    }

    public final void setX(int i10) {
        this.f17711x = i10;
    }

    public final void setY(int i10) {
        this.f17712y = i10;
    }

    public String toString() {
        return "VertexInfo(x=" + this.f17711x + ", y=" + this.f17712y + ", bitmapWidth=" + this.bitmapWidth + ", bitmapHeight=" + this.bitmapHeight + ", pixelColor=" + this.pixelColor + ", swatchColor=" + this.swatchColor + ", population=" + this.population + ")";
    }
}

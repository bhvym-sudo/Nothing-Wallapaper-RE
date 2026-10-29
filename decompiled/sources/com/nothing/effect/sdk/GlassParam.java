package com.nothing.effect.sdk;

import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class GlassParam {
    public static final a Companion = new a(null);
    public static final float MAX_SIZE = 32.0f;
    public static final float MAX_X_FACTOR = 1.0f;
    public static final float MIN_SIZE = 1.0f;
    public static final float MIN_X_FACTOR = 0.0f;
    private final int size;
    private final float xFactorA;
    private final float xFactorB;
    private final float xFactorC;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public GlassParam() {
        this(0, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ GlassParam copy$default(GlassParam glassParam, int i10, float f10, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = glassParam.size;
        }
        if ((i11 & 2) != 0) {
            f10 = glassParam.xFactorA;
        }
        if ((i11 & 4) != 0) {
            f11 = glassParam.xFactorB;
        }
        if ((i11 & 8) != 0) {
            f12 = glassParam.xFactorC;
        }
        return glassParam.copy(i10, f10, f11, f12);
    }

    public final int component1() {
        return this.size;
    }

    public final float component2() {
        return this.xFactorA;
    }

    public final float component3() {
        return this.xFactorB;
    }

    public final float component4() {
        return this.xFactorC;
    }

    public final GlassParam copy(int i10, float f10, float f11, float f12) {
        return new GlassParam(i10, f10, f11, f12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlassParam)) {
            return false;
        }
        GlassParam glassParam = (GlassParam) obj;
        return this.size == glassParam.size && Float.compare(this.xFactorA, glassParam.xFactorA) == 0 && Float.compare(this.xFactorB, glassParam.xFactorB) == 0 && Float.compare(this.xFactorC, glassParam.xFactorC) == 0;
    }

    public final int getSize() {
        return this.size;
    }

    public final float getXFactorA() {
        return this.xFactorA;
    }

    public final float getXFactorB() {
        return this.xFactorB;
    }

    public final float getXFactorC() {
        return this.xFactorC;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.size) * 31) + Float.hashCode(this.xFactorA)) * 31) + Float.hashCode(this.xFactorB)) * 31) + Float.hashCode(this.xFactorC);
    }

    public String toString() {
        return "GlassParam(size=" + this.size + ", xFactorA=" + this.xFactorA + ", xFactorB=" + this.xFactorB + ", xFactorC=" + this.xFactorC + ")";
    }

    public GlassParam(int i10, float f10, float f11, float f12) {
        this.size = i10;
        this.xFactorA = f10;
        this.xFactorB = f11;
        this.xFactorC = f12;
    }

    public /* synthetic */ GlassParam(int i10, float f10, float f11, float f12, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 32 : i10, (i11 & 2) != 0 ? 0.313f : f10, (i11 & 4) != 0 ? 0.202f : f11, (i11 & 8) != 0 ? 0.03f : f12);
    }
}

package com.nothing.effect.sdk;

import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class GrayParam {
    public static final a Companion = new a(null);
    public static final float MAX_SIZE = 100.0f;
    public static final float MAX_X_FACTOR = 1.0f;
    public static final float MIN_SIZE = 0.0f;
    public static final float MIN_X_FACTOR = 0.0f;
    private final float brightness;
    private final float factory;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GrayParam() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    public static /* synthetic */ GrayParam copy$default(GrayParam grayParam, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = grayParam.factory;
        }
        if ((i10 & 2) != 0) {
            f11 = grayParam.brightness;
        }
        return grayParam.copy(f10, f11);
    }

    public final float component1() {
        return this.factory;
    }

    public final float component2() {
        return this.brightness;
    }

    public final GrayParam copy(float f10, float f11) {
        return new GrayParam(f10, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GrayParam)) {
            return false;
        }
        GrayParam grayParam = (GrayParam) obj;
        return Float.compare(this.factory, grayParam.factory) == 0 && Float.compare(this.brightness, grayParam.brightness) == 0;
    }

    public final float getBrightness() {
        return this.brightness;
    }

    public final float getFactory() {
        return this.factory;
    }

    public int hashCode() {
        return (Float.hashCode(this.factory) * 31) + Float.hashCode(this.brightness);
    }

    public String toString() {
        return "GrayParam(factory=" + this.factory + ", brightness=" + this.brightness + ")";
    }

    public GrayParam(float f10, float f11) {
        this.factory = f10;
        this.brightness = f11;
    }

    public /* synthetic */ GrayParam(float f10, float f11, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 0.5f : f11);
    }
}

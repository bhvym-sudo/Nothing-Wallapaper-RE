package com.airbnb.lottie.model.content;

import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;

/* JADX INFO: loaded from: classes.dex */
public class GradientColor {
    private final int[] colors;
    private final float[] positions;

    public GradientColor(float[] fArr, int[] iArr) {
        this.positions = fArr;
        this.colors = iArr;
    }

    public int[] getColors() {
        return this.colors;
    }

    public float[] getPositions() {
        return this.positions;
    }

    public int getSize() {
        return this.colors.length;
    }

    public void lerp(GradientColor gradientColor, GradientColor gradientColor2, float f10) {
        if (gradientColor.colors.length == gradientColor2.colors.length) {
            for (int i10 = 0; i10 < gradientColor.colors.length; i10++) {
                this.positions[i10] = MiscUtils.lerp(gradientColor.positions[i10], gradientColor2.positions[i10], f10);
                this.colors[i10] = GammaEvaluator.evaluate(f10, gradientColor.colors[i10], gradientColor2.colors[i10]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + gradientColor.colors.length + " vs " + gradientColor2.colors.length + ")");
    }
}

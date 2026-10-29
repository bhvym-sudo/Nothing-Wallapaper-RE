package com.airbnb.lottie.animation.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.RoundedCorners;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RoundedCornersContent implements ShapeModifierContent, BaseKeyframeAnimation.AnimationListener {
    private static final float ROUNDED_CORNER_MAGIC_NUMBER = 0.5519f;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<Float, Float> roundedCorners;
    private ShapeData shapeData;

    public RoundedCornersContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, RoundedCorners roundedCorners) {
        this.lottieDrawable = lottieDrawable;
        this.name = roundedCorners.getName();
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation = roundedCorners.getCornerRadius().createAnimation();
        this.roundedCorners = baseKeyframeAnimationCreateAnimation;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
    }

    private static int floorDiv(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    private static int floorMod(int i10, int i11) {
        return i10 - (floorDiv(i10, i11) * i11);
    }

    private ShapeData getShapeData(ShapeData shapeData) {
        List<CubicCurveData> curves = shapeData.getCurves();
        boolean zIsClosed = shapeData.isClosed();
        int size = curves.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            CubicCurveData cubicCurveData = curves.get(size);
            CubicCurveData cubicCurveData2 = curves.get(floorMod(size - 1, curves.size()));
            PointF vertex = (size != 0 || zIsClosed) ? cubicCurveData2.getVertex() : shapeData.getInitialPoint();
            i10 = (((size != 0 || zIsClosed) ? cubicCurveData2.getControlPoint2() : vertex).equals(vertex) && cubicCurveData.getControlPoint1().equals(vertex) && !(!shapeData.isClosed() && size == 0 && size == curves.size() - 1)) ? i10 + 2 : i10 + 1;
            size--;
        }
        ShapeData shapeData2 = this.shapeData;
        if (shapeData2 == null || shapeData2.getCurves().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new CubicCurveData());
            }
            this.shapeData = new ShapeData(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.shapeData.setClosed(zIsClosed);
        return this.shapeData;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.name;
    }

    public BaseKeyframeAnimation<Float, Float> getRoundedCorners() {
        return this.roundedCorners;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009f  */
    @Override // com.airbnb.lottie.animation.content.ShapeModifierContent
    public ShapeData modifyShape(ShapeData shapeData) {
        boolean z9;
        int i10;
        List<CubicCurveData> curves = shapeData.getCurves();
        if (curves.size() > 2) {
            float fFloatValue = this.roundedCorners.getValue().floatValue();
            if (fFloatValue != 0.0f) {
                ShapeData shapeData2 = getShapeData(shapeData);
                shapeData2.setInitialPoint(shapeData.getInitialPoint().x, shapeData.getInitialPoint().y);
                List<CubicCurveData> curves2 = shapeData2.getCurves();
                boolean zIsClosed = shapeData.isClosed();
                int i11 = 0;
                int i12 = 0;
                while (i11 < curves.size()) {
                    CubicCurveData cubicCurveData = curves.get(i11);
                    CubicCurveData cubicCurveData2 = curves.get(floorMod(i11 - 1, curves.size()));
                    CubicCurveData cubicCurveData3 = curves.get(floorMod(i11 - 2, curves.size()));
                    PointF vertex = (i11 != 0 || zIsClosed) ? cubicCurveData2.getVertex() : shapeData.getInitialPoint();
                    PointF controlPoint2 = (i11 != 0 || zIsClosed) ? cubicCurveData2.getControlPoint2() : vertex;
                    PointF controlPoint1 = cubicCurveData.getControlPoint1();
                    PointF vertex2 = cubicCurveData3.getVertex();
                    PointF vertex3 = cubicCurveData.getVertex();
                    if (!shapeData.isClosed() && i11 == 0) {
                        z9 = i11 == curves.size() + (-1);
                    }
                    if (controlPoint2.equals(vertex) && controlPoint1.equals(vertex) && !z9) {
                        float f10 = vertex.x;
                        float f11 = f10 - vertex2.x;
                        float f12 = vertex.y;
                        float f13 = f12 - vertex2.y;
                        float f14 = vertex3.x - f10;
                        float f15 = vertex3.y - f12;
                        i10 = i11;
                        float fHypot = (float) Math.hypot(f11, f13);
                        float fHypot2 = (float) Math.hypot(f14, f15);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f16 = vertex.x;
                        float f17 = ((vertex2.x - f16) * fMin) + f16;
                        float f18 = vertex.y;
                        float f19 = ((vertex2.y - f18) * fMin) + f18;
                        float f20 = ((vertex3.x - f16) * fMin2) + f16;
                        float f21 = ((vertex3.y - f18) * fMin2) + f18;
                        float f22 = f17 - ((f17 - f16) * ROUNDED_CORNER_MAGIC_NUMBER);
                        float f23 = f19 - ((f19 - f18) * ROUNDED_CORNER_MAGIC_NUMBER);
                        float f24 = f20 - ((f20 - f16) * ROUNDED_CORNER_MAGIC_NUMBER);
                        float f25 = f21 - ((f21 - f18) * ROUNDED_CORNER_MAGIC_NUMBER);
                        CubicCurveData cubicCurveData4 = curves2.get(floorMod(i12 - 1, curves2.size()));
                        CubicCurveData cubicCurveData5 = curves2.get(i12);
                        cubicCurveData4.setControlPoint2(f17, f19);
                        cubicCurveData4.setVertex(f17, f19);
                        if (i10 == 0) {
                            shapeData2.setInitialPoint(f17, f19);
                        }
                        cubicCurveData5.setControlPoint1(f22, f23);
                        CubicCurveData cubicCurveData6 = curves2.get(i12 + 1);
                        cubicCurveData5.setControlPoint2(f24, f25);
                        cubicCurveData5.setVertex(f20, f21);
                        cubicCurveData6.setControlPoint1(f20, f21);
                        i12 += 2;
                    } else {
                        i10 = i11;
                        CubicCurveData cubicCurveData7 = curves2.get(floorMod(i12 - 1, curves2.size()));
                        CubicCurveData cubicCurveData8 = curves2.get(i12);
                        cubicCurveData7.setControlPoint2(cubicCurveData2.getVertex().x, cubicCurveData2.getVertex().y);
                        cubicCurveData7.setVertex(cubicCurveData2.getVertex().x, cubicCurveData2.getVertex().y);
                        cubicCurveData8.setControlPoint1(cubicCurveData.getVertex().x, cubicCurveData.getVertex().y);
                        i12++;
                    }
                    i11 = i10 + 1;
                }
                return shapeData2;
            }
        }
        return shapeData;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }
}

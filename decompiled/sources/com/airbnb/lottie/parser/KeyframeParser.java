package com.airbnb.lottie.parser;

import D0.a;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.Q;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class KeyframeParser {
    private static final float MAX_CP_VALUE = 100.0f;
    private static Q pathInterpolatorCache;
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    static JsonReader.Options NAMES = JsonReader.Options.of("t", "s", "e", "o", "i", "h", TypedValues.TransitionType.S_TO, "ti");
    static JsonReader.Options INTERPOLATOR_NAMES = JsonReader.Options.of("x", "y");

    KeyframeParser() {
    }

    private static WeakReference<Interpolator> getInterpolator(int i10) {
        WeakReference<Interpolator> weakReference;
        synchronized (KeyframeParser.class) {
            weakReference = (WeakReference) pathInterpolatorCache().i(i10);
        }
        return weakReference;
    }

    private static Interpolator interpolatorFor(PointF pointF, PointF pointF2) {
        Interpolator interpolatorA;
        pointF.x = MiscUtils.clamp(pointF.x, -1.0f, 1.0f);
        pointF.y = MiscUtils.clamp(pointF.y, -100.0f, 100.0f);
        pointF2.x = MiscUtils.clamp(pointF2.x, -1.0f, 1.0f);
        float fClamp = MiscUtils.clamp(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fClamp;
        int iHashFor = Utils.hashFor(pointF.x, pointF.y, pointF2.x, fClamp);
        WeakReference<Interpolator> interpolator = getInterpolator(iHashFor);
        Interpolator interpolator2 = interpolator != null ? interpolator.get() : null;
        if (interpolator != null && interpolator2 != null) {
            return interpolator2;
        }
        try {
            interpolatorA = a.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            interpolatorA = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            putInterpolator(iHashFor, new WeakReference(interpolatorA));
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return interpolatorA;
    }

    static <T> Keyframe<T> parse(JsonReader jsonReader, LottieComposition lottieComposition, float f10, ValueParser<T> valueParser, boolean z9, boolean z10) {
        if (z9 && z10) {
            return parseMultiDimensionalKeyframe(lottieComposition, jsonReader, f10, valueParser);
        }
        return z9 ? parseKeyframe(lottieComposition, jsonReader, f10, valueParser) : parseStaticValue(jsonReader, f10, valueParser);
    }

    private static <T> Keyframe<T> parseKeyframe(LottieComposition lottieComposition, JsonReader jsonReader, float f10, ValueParser<T> valueParser) {
        Interpolator interpolatorInterpolatorFor;
        T t9;
        jsonReader.beginObject();
        PointF pointFJsonToPoint = null;
        T t10 = null;
        T t11 = null;
        PointF pointFJsonToPoint2 = null;
        PointF pointFJsonToPoint3 = null;
        float fNextDouble = 0.0f;
        boolean z9 = false;
        PointF pointFJsonToPoint4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    t11 = valueParser.parse(jsonReader, f10);
                    break;
                case 2:
                    t10 = valueParser.parse(jsonReader, f10);
                    break;
                case 3:
                    pointFJsonToPoint = JsonUtils.jsonToPoint(jsonReader, 1.0f);
                    break;
                case 4:
                    pointFJsonToPoint4 = JsonUtils.jsonToPoint(jsonReader, 1.0f);
                    break;
                case 5:
                    z9 = jsonReader.nextInt() == 1;
                    break;
                case 6:
                    pointFJsonToPoint2 = JsonUtils.jsonToPoint(jsonReader, f10);
                    break;
                case 7:
                    pointFJsonToPoint3 = JsonUtils.jsonToPoint(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z9) {
            interpolatorInterpolatorFor = LINEAR_INTERPOLATOR;
            t9 = t11;
        } else {
            interpolatorInterpolatorFor = (pointFJsonToPoint == null || pointFJsonToPoint4 == null) ? LINEAR_INTERPOLATOR : interpolatorFor(pointFJsonToPoint, pointFJsonToPoint4);
            t9 = t10;
        }
        Keyframe<T> keyframe = new Keyframe<>(lottieComposition, t11, t9, interpolatorInterpolatorFor, fNextDouble, null);
        keyframe.pathCp1 = pointFJsonToPoint2;
        keyframe.pathCp2 = pointFJsonToPoint3;
        return keyframe;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01e2  */
    private static <T> Keyframe<T> parseMultiDimensionalKeyframe(LottieComposition lottieComposition, JsonReader jsonReader, float f10, ValueParser<T> valueParser) {
        Interpolator interpolatorInterpolatorFor;
        Interpolator interpolatorInterpolatorFor2;
        Interpolator interpolatorInterpolatorFor3;
        T t9;
        Interpolator interpolator;
        PointF pointF;
        Keyframe<T> keyframe;
        PointF pointF2;
        boolean z9;
        float f11;
        jsonReader.beginObject();
        boolean z10 = false;
        PointF pointFJsonToPoint = null;
        PointF pointFJsonToPoint2 = null;
        PointF pointF3 = null;
        T t10 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointFJsonToPoint3 = null;
        PointF pointFJsonToPoint4 = null;
        float fNextDouble = 0.0f;
        T t11 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    t10 = valueParser.parse(jsonReader, f10);
                    break;
                case 2:
                    t11 = valueParser.parse(jsonReader, f10);
                    break;
                case 3:
                    boolean z11 = z10;
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int iSelectName = jsonReader.selectName(INTERPOLATOR_NAMES);
                            if (iSelectName == 0) {
                                pointF2 = pointF5;
                                JsonReader.Token tokenPeek = jsonReader.peek();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (tokenPeek == token) {
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble2 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = jsonReader.peek() == token ? (float) jsonReader.nextDouble() : fNextDouble2;
                                    jsonReader.endArray();
                                }
                            } else if (iSelectName != 1) {
                                jsonReader.skipValue();
                            } else {
                                JsonReader.Token tokenPeek2 = jsonReader.peek();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (tokenPeek2 == token2) {
                                    pointF2 = pointF5;
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    pointF2 = pointF5;
                                    jsonReader.beginArray();
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = jsonReader.peek() == token2 ? (float) jsonReader.nextDouble() : fNextDouble3;
                                    jsonReader.endArray();
                                }
                            }
                            pointF5 = pointF2;
                        }
                        pointF3 = new PointF(fNextDouble2, fNextDouble3);
                        pointF4 = new PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                    } else {
                        pointFJsonToPoint = JsonUtils.jsonToPoint(jsonReader, f10);
                    }
                    z10 = z11;
                    break;
                case 4:
                    if (jsonReader.peek() != JsonReader.Token.BEGIN_OBJECT) {
                        pointFJsonToPoint2 = JsonUtils.jsonToPoint(jsonReader, f10);
                    } else {
                        jsonReader.beginObject();
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        float fNextDouble6 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int iSelectName2 = jsonReader.selectName(INTERPOLATOR_NAMES);
                            if (iSelectName2 != 0) {
                                z9 = z10;
                                if (iSelectName2 != 1) {
                                    jsonReader.skipValue();
                                } else {
                                    JsonReader.Token tokenPeek3 = jsonReader.peek();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (tokenPeek3 == token3) {
                                        fNextDouble7 = (float) jsonReader.nextDouble();
                                        f13 = fNextDouble7;
                                    } else {
                                        jsonReader.beginArray();
                                        PointF pointF7 = pointFJsonToPoint3;
                                        float fNextDouble8 = (float) jsonReader.nextDouble();
                                        fNextDouble7 = jsonReader.peek() == token3 ? (float) jsonReader.nextDouble() : fNextDouble8;
                                        jsonReader.endArray();
                                        pointFJsonToPoint3 = pointF7;
                                        f13 = fNextDouble8;
                                    }
                                }
                            } else {
                                z9 = z10;
                                PointF pointF8 = pointFJsonToPoint3;
                                JsonReader.Token tokenPeek4 = jsonReader.peek();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (tokenPeek4 == token4) {
                                    pointFJsonToPoint3 = pointF8;
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    f12 = fNextDouble6;
                                } else {
                                    pointFJsonToPoint3 = pointF8;
                                    jsonReader.beginArray();
                                    float fNextDouble9 = (float) jsonReader.nextDouble();
                                    if (jsonReader.peek() == token4) {
                                        f11 = fNextDouble9;
                                        fNextDouble6 = (float) jsonReader.nextDouble();
                                    } else {
                                        f11 = fNextDouble9;
                                        fNextDouble6 = f11;
                                    }
                                    jsonReader.endArray();
                                    f12 = f11;
                                }
                            }
                            z10 = z9;
                        }
                        PointF pointF9 = new PointF(f12, f13);
                        PointF pointF10 = new PointF(fNextDouble6, fNextDouble7);
                        jsonReader.endObject();
                        pointF6 = pointF10;
                        pointF5 = pointF9;
                    }
                    break;
                case 5:
                    z10 = jsonReader.nextInt() == 1;
                    break;
                case 6:
                    pointFJsonToPoint3 = JsonUtils.jsonToPoint(jsonReader, f10);
                    break;
                case 7:
                    pointFJsonToPoint4 = JsonUtils.jsonToPoint(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        boolean z12 = z10;
        PointF pointF11 = pointF5;
        jsonReader.endObject();
        if (z12) {
            interpolator = LINEAR_INTERPOLATOR;
            t9 = t10;
        } else {
            if (pointFJsonToPoint == null || pointFJsonToPoint2 == null) {
                if (pointF3 == null || pointF4 == null || pointF11 == null || pointF6 == null) {
                    interpolatorInterpolatorFor = LINEAR_INTERPOLATOR;
                } else {
                    interpolatorInterpolatorFor2 = interpolatorFor(pointF3, pointF11);
                    interpolatorInterpolatorFor3 = interpolatorFor(pointF4, pointF6);
                    t9 = t11;
                    interpolator = null;
                }
                if (interpolatorInterpolatorFor2 != null || interpolatorInterpolatorFor3 == null) {
                    pointF = pointFJsonToPoint4;
                    keyframe = new Keyframe<>(lottieComposition, t10, t9, interpolator, fNextDouble, null);
                } else {
                    pointF = pointFJsonToPoint4;
                    keyframe = new Keyframe<>(lottieComposition, t10, t9, interpolatorInterpolatorFor2, interpolatorInterpolatorFor3, fNextDouble, null);
                }
                keyframe.pathCp1 = pointFJsonToPoint3;
                keyframe.pathCp2 = pointF;
                return keyframe;
            }
            interpolatorInterpolatorFor = interpolatorFor(pointFJsonToPoint, pointFJsonToPoint2);
            interpolator = interpolatorInterpolatorFor;
            t9 = t11;
        }
        interpolatorInterpolatorFor2 = null;
        interpolatorInterpolatorFor3 = null;
        if (interpolatorInterpolatorFor2 != null) {
            pointF = pointFJsonToPoint4;
            keyframe = new Keyframe<>(lottieComposition, t10, t9, interpolator, fNextDouble, null);
        } else {
            pointF = pointFJsonToPoint4;
            keyframe = new Keyframe<>(lottieComposition, t10, t9, interpolator, fNextDouble, null);
        }
        keyframe.pathCp1 = pointFJsonToPoint3;
        keyframe.pathCp2 = pointF;
        return keyframe;
    }

    private static <T> Keyframe<T> parseStaticValue(JsonReader jsonReader, float f10, ValueParser<T> valueParser) {
        return new Keyframe<>(valueParser.parse(jsonReader, f10));
    }

    private static Q pathInterpolatorCache() {
        if (pathInterpolatorCache == null) {
            pathInterpolatorCache = new Q();
        }
        return pathInterpolatorCache;
    }

    private static void putInterpolator(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (KeyframeParser.class) {
            pathInterpolatorCache.m(i10, weakReference);
        }
    }
}

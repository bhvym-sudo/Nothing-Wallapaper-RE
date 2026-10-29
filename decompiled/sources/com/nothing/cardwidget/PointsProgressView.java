package com.nothing.cardwidget;

import B8.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.v;
import p089i8.AbstractC1444s;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
public final class PointsProgressView extends View {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_CIRCLE_DIAMETER = 7;
    private static final int DEFAULT_COLUMN_COUNT = 20;
    private static final int DEFAULT_MAX_PROGRESS = 100;
    private static final String DEFAULT_PROGRESS_COLOR = "#191C1E";
    private static final int DEFAULT_RAW_COUNT = 3;
    private static final String DEFAULT_TRACK_COLOR = "#C5C7C9";
    private static final String TAG = "PointsProgressView";
    private Integer circleCountSize;
    private ArrayList<CircleData> circleDataList;
    private int columnCount;
    private int maxProgress;
    private ArrayMap<Integer, Paint> paintMap;
    private int progress;
    private Integer progressColor;
    private Paint progressPaint;
    private int[] progressPercentageColor;
    private int rawCount;
    private Integer trackColor;
    private Paint trackPaint;

    public static final class CircleData {
        private final Paint paint;
        private final float radius;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final float f18013x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final float f18014y;

        public CircleData(float f10, float f11, float f12, Paint paint) {
            n.h(paint, "paint");
            this.f18013x = f10;
            this.f18014y = f11;
            this.radius = f12;
            this.paint = paint;
        }

        public static /* synthetic */ CircleData copy$default(CircleData circleData, float f10, float f11, float f12, Paint paint, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = circleData.f18013x;
            }
            if ((i10 & 2) != 0) {
                f11 = circleData.f18014y;
            }
            if ((i10 & 4) != 0) {
                f12 = circleData.radius;
            }
            if ((i10 & 8) != 0) {
                paint = circleData.paint;
            }
            return circleData.copy(f10, f11, f12, paint);
        }

        public final float component1() {
            return this.f18013x;
        }

        public final float component2() {
            return this.f18014y;
        }

        public final float component3() {
            return this.radius;
        }

        public final Paint component4() {
            return this.paint;
        }

        public final CircleData copy(float f10, float f11, float f12, Paint paint) {
            n.h(paint, "paint");
            return new CircleData(f10, f11, f12, paint);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CircleData)) {
                return false;
            }
            CircleData circleData = (CircleData) obj;
            return Float.compare(this.f18013x, circleData.f18013x) == 0 && Float.compare(this.f18014y, circleData.f18014y) == 0 && Float.compare(this.radius, circleData.radius) == 0 && n.d(this.paint, circleData.paint);
        }

        public final Paint getPaint() {
            return this.paint;
        }

        public final float getRadius() {
            return this.radius;
        }

        public final float getX() {
            return this.f18013x;
        }

        public final float getY() {
            return this.f18014y;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f18013x) * 31) + Float.hashCode(this.f18014y)) * 31) + Float.hashCode(this.radius)) * 31) + this.paint.hashCode();
        }

        public String toString() {
            return "CircleData(x=" + this.f18013x + ", y=" + this.f18014y + ", radius=" + this.radius + ", paint=" + this.paint + ")";
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PointsProgressView(Context context) {
        this(context, null, 0, 6, null);
        n.h(context, "context");
    }

    private final int dp2px(int i10) {
        return (int) ((i10 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    private final void initPaintMap() {
        if (this.progressPercentageColor == null) {
            ArrayMap<Integer, Paint> arrayMap = new ArrayMap<>(1);
            this.paintMap = arrayMap;
            arrayMap.put(0, obtainProgressPaint());
            return;
        }
        ArrayMap<Integer, Paint> arrayMap2 = new ArrayMap<>();
        this.paintMap = arrayMap2;
        arrayMap2.put(0, obtainProgressPaint());
        int[] iArr = this.progressPercentageColor;
        if (iArr != null) {
            int length = iArr.length / 2;
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                int i12 = iArr[i11];
                int i13 = iArr[i11 + 1];
                arrayMap2.put(Integer.valueOf(i12), new Paint());
                Paint paint = arrayMap2.get(Integer.valueOf(i12));
                if (paint != null) {
                    paint.setColor(i13);
                }
            }
        }
    }

    private final int obtainColor(int i10) {
        return getContext().getColor(i10);
    }

    private final float obtainCurrentPercentage() {
        int i10 = this.progress;
        int i11 = this.maxProgress;
        if (i10 >= i11) {
            return 1.0f;
        }
        return (i10 * 1.0f) / i11;
    }

    private final Paint obtainPaintByPercentage(float f10, float f11) {
        if (f10 > f11) {
            return obtainTrackPaintPaint();
        }
        if (this.paintMap == null) {
            initPaintMap();
        }
        ArrayMap<Integer, Paint> arrayMap = this.paintMap;
        if (arrayMap != null) {
            Set<Integer> setKeySet = arrayMap.keySet();
            n.g(setKeySet, "<get-keys>(...)");
            Object obj = null;
            boolean z9 = false;
            for (Object obj2 : AbstractC1444s.I(setKeySet)) {
                if (f10 > ((Integer) obj2).intValue() / 100.0f) {
                    z9 = true;
                    obj = obj2;
                }
            }
            if (!z9) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            Paint paint = arrayMap.get((Integer) obj);
            if (paint != null) {
                return paint;
            }
        }
        return obtainProgressPaint();
    }

    private final Paint obtainProgressPaint() {
        if (this.progressPaint == null) {
            Paint paint = new Paint();
            this.progressPaint = paint;
            paint.setColor(obtainProgressPaintColor());
        }
        Paint paint2 = this.progressPaint;
        n.e(paint2);
        return paint2;
    }

    private final int obtainProgressPaintColor() {
        Integer num = this.progressColor;
        return num != null ? num.intValue() : Color.parseColor(DEFAULT_PROGRESS_COLOR);
    }

    private final float obtainProgressPercentageByColumn(int i10) {
        return (i10 * 1.0f) / this.columnCount;
    }

    private final int obtainTrackPaintColor() {
        Integer num = this.trackColor;
        return num != null ? num.intValue() : Color.parseColor(DEFAULT_TRACK_COLOR);
    }

    private final Paint obtainTrackPaintPaint() {
        if (this.trackPaint == null) {
            Paint paint = new Paint();
            this.trackPaint = paint;
            paint.setColor(obtainTrackPaintColor());
        }
        Paint paint2 = this.trackPaint;
        n.e(paint2);
        return paint2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        n.h(canvas, "canvas");
        super.onDraw(canvas);
        ArrayList<CircleData> arrayList = this.circleDataList;
        if (arrayList != null) {
            for (CircleData circleData : arrayList) {
                canvas.drawCircle(circleData.getX(), circleData.getY(), circleData.getRadius(), circleData.getPaint());
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (mode == 1073741824) {
                size2 = (int) (((size * 1.0f) / this.columnCount) * this.rawCount);
            } else if (mode2 == 1073741824) {
                size = (int) (((size2 * 1.0f) / this.rawCount) * this.columnCount);
            } else if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                size = dp2px(this.columnCount * 7);
                size2 = dp2px(this.rawCount * 7);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float height = getHeight() / (this.rawCount * 1.0f);
        float width = getWidth() / (this.columnCount * 1.0f);
        float fH = h.h(width, height);
        float f10 = fH / 2.0f;
        ArrayList<CircleData> arrayList = new ArrayList<>(this.rawCount * this.columnCount);
        this.circleDataList = arrayList;
        n.e(arrayList);
        this.circleCountSize = Integer.valueOf(arrayList.size());
        float fObtainCurrentPercentage = obtainCurrentPercentage();
        int i14 = this.rawCount;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = this.columnCount;
            int i17 = 0;
            while (i17 < i16) {
                float f11 = (i17 * fH) + f10;
                float f12 = (i15 * fH) + f10;
                i17++;
                Paint paintObtainPaintByPercentage = obtainPaintByPercentage(obtainProgressPercentageByColumn(i17), fObtainCurrentPercentage);
                ArrayList<CircleData> arrayList2 = this.circleDataList;
                if (arrayList2 != null) {
                    arrayList2.add(new CircleData(f11, f12, f10, paintObtainPaintByPercentage));
                }
            }
        }
        int width2 = getWidth();
        int height2 = getHeight();
        ArrayList<CircleData> arrayList3 = this.circleDataList;
        Log.d(TAG, "width:" + width2 + ", height:" + height2 + ", pointDimaeter:" + fH + ", pointWidth:" + width + ", pointHeight:" + height + ", pointRadius:" + f10 + ", circleDataList.size:" + (arrayList3 != null ? Integer.valueOf(arrayList3.size()) : null) + ", currentPercentage:" + fObtainCurrentPercentage);
    }

    public final void setColumnCount(int i10) {
        this.columnCount = i10;
    }

    public final void setMaxProgress(int i10) {
        this.maxProgress = i10;
    }

    public final void setPercentageColor(int i10, int i11) {
        this.progressPercentageColor = new int[]{i10, i11};
    }

    public final void setPercentageColors(int... percentageColors) {
        n.h(percentageColors, "percentageColors");
        int length = percentageColors.length / 2;
        if (length <= 0) {
            return;
        }
        int[] iArr = new int[length * 2];
        this.progressPercentageColor = iArr;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            iArr[i11] = percentageColors[i11];
            int i12 = i11 + 1;
            iArr[i12] = percentageColors[i12];
        }
    }

    public final void setProgress(int i10) {
        this.progress = i10;
    }

    public final void setProgressColor(int i10) {
        this.progressColor = Integer.valueOf(i10);
    }

    public final void setRawCount(int i10) {
        this.rawCount = i10;
    }

    public final void setTrackColor(int i10) {
        this.trackColor = Integer.valueOf(i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PointsProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    public /* synthetic */ PointsProgressView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointsProgressView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        this.maxProgress = 100;
        this.circleCountSize = 0;
        J5.a.C0120a c0120a = J5.a.f3535a;
        for (Map.Entry entry : c0120a.k(attributeSet, N.i(v.a(Integer.valueOf(c0120a.c(context, "rawCount")), Integer.valueOf(R.attr.rawCount)), v.a(Integer.valueOf(c0120a.c(context, "columnCount")), Integer.valueOf(R.attr.columnCount)), v.a(Integer.valueOf(c0120a.c(context, "progress")), Integer.valueOf(R.attr.progress)), v.a(Integer.valueOf(c0120a.c(context, "maxProgress")), Integer.valueOf(R.attr.maxProgress)), v.a(Integer.valueOf(c0120a.c(context, "trackColor")), Integer.valueOf(R.attr.trackColor)), v.a(Integer.valueOf(c0120a.c(context, "progressColor")), Integer.valueOf(R.attr.progressColor)))).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            if (iIntValue == R.attr.rawCount) {
                this.rawCount = attributeSet != null ? Integer.valueOf(J5.a.f3535a.i(context, attributeSet, ((Number) entry.getValue()).intValue(), 3)).intValue() : 3;
            } else if (iIntValue == R.attr.columnCount) {
                this.columnCount = attributeSet != null ? Integer.valueOf(J5.a.f3535a.i(context, attributeSet, ((Number) entry.getValue()).intValue(), 20)).intValue() : 20;
            } else if (iIntValue == R.attr.progress) {
                this.progress = attributeSet != null ? Integer.valueOf(J5.a.f3535a.i(context, attributeSet, ((Number) entry.getValue()).intValue(), 0)).intValue() : 0;
            } else if (iIntValue == R.attr.maxProgress) {
                this.maxProgress = attributeSet != null ? Integer.valueOf(J5.a.f3535a.i(context, attributeSet, ((Number) entry.getValue()).intValue(), 100)).intValue() : 100;
            } else if (iIntValue == R.attr.trackColor) {
                this.trackColor = attributeSet != null ? Integer.valueOf(J5.a.f3535a.e(context, attributeSet, ((Number) entry.getValue()).intValue())) : null;
            } else if (iIntValue == R.attr.progressColor) {
                this.progressColor = attributeSet != null ? Integer.valueOf(J5.a.f3535a.e(context, attributeSet, ((Number) entry.getValue()).intValue())) : null;
            }
        }
    }
}

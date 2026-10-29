package com.nothing.cardwidget.pedometer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class PedometerCalendarView extends View {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_MONTH_STEPS_LIST = "month_steps_list";
    private static final int RECTANGLES_LIMIT = 5;
    public static final int SHAPE_CIRCLE = 3;
    public static final int SHAPE_DOT = 1;
    public static final int SHAPE_RECTANGLE = 4;
    public static final int SHAPE_RING = 2;
    private static final String TAG = "PedometerCalendarView";
    private final float WEEKLY_BOTTOM_MARGIN;
    private final int X_INITIAL_MARGIN;
    private final float X_MARGIN;
    private final float circleRadius;
    private int currentDayColor;
    private int currentDayShape;
    private final float dotRadius;
    private List<Shape> dotShapes;
    private float fixRadio;
    private int goalNotReachedColor;
    private int goalNotReachedShape;
    private int goalReachedColor;
    private int goalReachedShape;
    private List<PedometerStepsInfo> lastItemInfos;
    private final List<Shape> rectangles;
    private final Paint shapePaint;
    private int weeklyDesColor;
    private TextPaint weeklyDesPaint;
    private final float weeklyDesTextSize;
    private String[] weeklySimpleHead;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PedometerCalendarView(Context context) {
        this(context, null, 0, 6, null);
        n.h(context, "context");
    }

    private final void addRectangleShape(int i10, Shape shape) {
        if (i10 >= 1) {
            int i11 = i10 - 1;
            Shape shape2 = this.dotShapes.get(i11);
            Shape shape3 = this.dotShapes.get(i10);
            boolean z9 = ((shape2 instanceof CircleShape) && shape2.getColor() == this.goalReachedColor) && ((shape3 instanceof CircleShape) && shape3.getColor() == this.goalReachedColor);
            Context context = getContext();
            n.g(context, "getContext(...)");
            boolean z10 = !UtilsKt.isRtl(context) ? shape2.getPivotX() >= shape3.getPivotX() : shape2.getPivotX() <= shape3.getPivotX();
            boolean z11 = getMonthOneDayWeek(i11) != 5;
            if (z9 && z10 && z11) {
                this.rectangles.add(new Rectangle(shape2.getPivotX(), shape2.getPivotY() - (this.circleRadius * this.fixRadio), shape3.getPivotX(), shape2.getPivotY() + (this.circleRadius * this.fixRadio), shape.getPivotX(), shape.getPivotY(), this.goalReachedColor));
            }
        }
    }

    private final void addStepShape(int i10, Shape shape, int i11, int i12) {
        Shape ringShape;
        List<Shape> list = this.dotShapes;
        if (i11 != 2) {
            ringShape = i11 != 3 ? new Dot(shape.getPivotX(), shape.getPivotY(), i12) : new CircleShape(shape.getPivotX(), shape.getPivotY(), i12);
        } else {
            ringShape = new RingShape(shape.getPivotX(), shape.getPivotY(), i12);
        }
        list.set(i10, ringShape);
    }

    private final void drawStepShape(Canvas canvas) {
        Canvas canvas2;
        for (Shape shape : this.dotShapes) {
            this.shapePaint.setColor(shape.getColor());
            this.shapePaint.setStyle(Paint.Style.FILL);
            if (shape instanceof Dot) {
                canvas.drawCircle(shape.getPivotX(), shape.getPivotY(), this.dotRadius * this.fixRadio, this.shapePaint);
            } else {
                if (shape instanceof CircleShape) {
                    canvas.drawCircle(shape.getPivotX(), shape.getPivotY(), this.circleRadius * this.fixRadio, this.shapePaint);
                } else if (shape instanceof Rectangle) {
                    Rectangle rectangle = (Rectangle) shape;
                    canvas2 = canvas;
                    canvas2.drawRect(rectangle.getLeft(), rectangle.getTop(), rectangle.getRight(), rectangle.getBottom(), this.shapePaint);
                } else {
                    canvas2 = canvas;
                    if (shape instanceof RingShape) {
                        this.shapePaint.setStyle(Paint.Style.STROKE);
                        canvas2.drawCircle(shape.getPivotX(), shape.getPivotY(), this.circleRadius * this.fixRadio, this.shapePaint);
                    }
                }
                canvas = canvas2;
            }
            canvas2 = canvas;
            canvas = canvas2;
        }
    }

    private final void drawWeeklyStr(Canvas canvas) {
        this.weeklyDesPaint.setColor(this.goalReachedColor);
        for (int i10 = 0; i10 < 7; i10++) {
            canvas.drawText(this.weeklySimpleHead[i10], (((this.X_MARGIN * i10) + this.X_INITIAL_MARGIN) * this.fixRadio) - (this.weeklyDesPaint.measureText(this.weeklySimpleHead[i10]) / 2), getHeight() - (this.WEEKLY_BOTTOM_MARGIN * this.fixRadio), this.weeklyDesPaint);
        }
    }

    private final int findFirstDayIndex(List<PedometerStepsInfo> list) {
        List<PedometerStepsInfo> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return -1;
        }
        Date date = new Date(list.get(0).getDate());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(5) - 1;
    }

    private final int getMonthOneDayWeek(int i10) {
        Calendar calendar = Calendar.getInstance();
        n.g(calendar, "getInstance(...)");
        calendar.set(5, i10);
        int i11 = calendar.get(7) - 2;
        if (i11 < 0) {
            return 6;
        }
        return i11;
    }

    private final void initMonthShape() {
        float f10;
        int i10;
        this.dotShapes.clear();
        int iLengthOfMonth = LocalDate.now().lengthOfMonth();
        int monthOneDayWeek = getMonthOneDayWeek(1);
        boolean z9 = monthOneDayWeek == 0;
        int i11 = iLengthOfMonth + monthOneDayWeek;
        int i12 = 0;
        while (monthOneDayWeek < i11) {
            int i13 = monthOneDayWeek >= 7 ? monthOneDayWeek % 7 : monthOneDayWeek;
            if (z9) {
                z9 = false;
            } else if (i13 == 0) {
                i12++;
            }
            Context context = getContext();
            n.g(context, "getContext(...)");
            if (UtilsKt.isRtl(context)) {
                f10 = (-this.X_MARGIN) * i13;
                i10 = 150;
            } else {
                f10 = this.X_MARGIN * i13;
                i10 = this.X_INITIAL_MARGIN;
            }
            float f11 = (f10 + i10) * this.fixRadio;
            float f12 = this.X_MARGIN;
            this.dotShapes.add(new Dot(f11, ((i12 * f12) + f12) * this.fixRadio, this.goalNotReachedColor));
            monthOneDayWeek++;
        }
    }

    private final void maybeUpdateShapes(List<PedometerStepsInfo> list) {
        try {
            List<PedometerStepsInfo> list2 = this.lastItemInfos;
            boolean z9 = true;
            boolean z10 = list2 == null || list2.isEmpty();
            List<PedometerStepsInfo> list3 = this.lastItemInfos;
            if (list3 != null && list3.size() == list.size() && n.d(this.lastItemInfos, list)) {
                z9 = false;
            }
            if (z10 || z9) {
                this.lastItemInfos = list;
                initMonthShape();
                updateStepsMonthShape();
                invalidate();
            }
        } catch (Exception unused) {
            Log.e(TAG, "PedometerCalendarView onDataChanged parse json failure~");
        }
    }

    private final void setWeeklyStr(String[] strArr) {
        if (strArr == null || strArr.length == 0 || strArr.length < 7) {
            Log.e(TAG, "setWeeklyStr si error, weeklyStr is " + strArr);
            return;
        }
        int length = strArr.length;
        int i10 = 0;
        String str = "";
        int i11 = 0;
        while (i10 < length) {
            String str2 = strArr[i10];
            int i12 = i11 + 1;
            if (str2 != null) {
                if (str2.length() > str.length()) {
                    str = str2;
                }
                this.weeklySimpleHead[i11] = str2;
            }
            i10++;
            i11 = i12;
        }
        Context context = getContext();
        n.g(context, "getContext(...)");
        if (UtilsKt.isRtl(context)) {
            AbstractC1439m.R(this.weeklySimpleHead);
        }
    }

    private final void updateStepsMonthShape() {
        if (findFirstDayIndex(this.lastItemInfos) == -1 || this.dotShapes.isEmpty()) {
            return;
        }
        this.rectangles.clear();
        List<PedometerStepsInfo> list = this.lastItemInfos;
        if (list != null) {
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC1444s.t();
                }
                PedometerStepsInfo pedometerStepsInfo = (PedometerStepsInfo) obj;
                if (i10 < this.dotShapes.size() && i10 >= 0) {
                    Shape shape = this.dotShapes.get(i10);
                    boolean z9 = pedometerStepsInfo.getSteps() >= pedometerStepsInfo.getTarget();
                    List<PedometerStepsInfo> list2 = this.lastItemInfos;
                    n.e(list2);
                    int size = list2.size() - 1;
                    if (i10 == size) {
                        addStepShape(size, shape, this.currentDayShape, this.currentDayColor);
                    } else if (z9) {
                        addStepShape(i10, shape, this.goalReachedShape, this.goalReachedColor);
                        addRectangleShape(i10, shape);
                    } else {
                        addStepShape(i10, shape, this.goalNotReachedShape, this.goalNotReachedColor);
                    }
                }
                i10 = i11;
            }
        }
        this.dotShapes.addAll(this.rectangles);
    }

    public final int getCurrentDayColor() {
        return this.currentDayColor;
    }

    public final int getCurrentDayShape() {
        return this.currentDayShape;
    }

    public final int getGoalNotReachedColor() {
        return this.goalNotReachedColor;
    }

    public final int getGoalNotReachedShape() {
        return this.goalNotReachedShape;
    }

    public final int getGoalReachedColor() {
        return this.goalReachedColor;
    }

    public final int getGoalReachedShape() {
        return this.goalReachedShape;
    }

    public final int getWeeklyDesColor() {
        return this.weeklyDesColor;
    }

    public final void onDataChanged(List<PedometerStepsInfo> monthStepsList) {
        n.h(monthStepsList, "monthStepsList");
        maybeUpdateShapes(monthStepsList);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        n.h(canvas, "canvas");
        super.onDraw(canvas);
        drawStepShape(canvas);
        drawWeeklyStr(canvas);
    }

    public final void setCurrentDayColor(int i10) {
        this.currentDayColor = i10;
    }

    public final void setCurrentDayShape(int i10) {
        this.currentDayShape = i10;
    }

    public final void setFixRatio(float f10) {
        this.fixRadio = f10;
        this.weeklyDesPaint.setTextSize(this.weeklyDesTextSize * f10);
    }

    public final void setGoalNotReachedColor(int i10) {
        this.goalNotReachedColor = i10;
    }

    public final void setGoalNotReachedShape(int i10) {
        this.goalNotReachedShape = i10;
    }

    public final void setGoalReachedColor(int i10) {
        this.goalReachedColor = i10;
    }

    public final void setGoalReachedShape(int i10) {
        this.goalReachedShape = i10;
    }

    public final void setWeeklyDesColor(int i10) {
        this.weeklyDesColor = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PedometerCalendarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    public /* synthetic */ PedometerCalendarView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PedometerCalendarView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        this.circleRadius = 3.0f;
        this.dotRadius = 1.0f;
        this.goalNotReachedColor = -1;
        this.goalReachedColor = -1;
        this.currentDayColor = -1;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.shapePaint = paint;
        this.weeklyDesColor = -1;
        this.weeklyDesTextSize = 11.0f;
        this.weeklySimpleHead = new String[]{"M", "T", "W", "T", "F", "S", "S"};
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(TypedValue.applyDimension(2, 11.0f, context.getResources().getDisplayMetrics()));
        this.weeklyDesPaint = textPaint;
        this.goalNotReachedShape = 3;
        this.goalReachedShape = 3;
        this.currentDayShape = 3;
        this.rectangles = new ArrayList();
        this.dotShapes = new ArrayList();
        this.X_INITIAL_MARGIN = 20;
        this.X_MARGIN = 22.0f;
        this.WEEKLY_BOTTOM_MARGIN = 16.0f;
        setWeeklyStr(UtilsKt.getShortWeekdays());
    }
}

package com.nothing.cardwidget.pedometer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class PedometerWalkingBgView extends View {
    public static final Companion Companion = new Companion(null);
    private static final int DESIGN_CIRCLE_WIDTH = 4;
    private static final int DESIGN_DIVIDER_WIDTH = 4;
    private static final int DESIGN_LEFT_GAP = 8;
    private static final int DESIGN_RADIUS = 2;
    private static final int DESIGN_TOTAL_DOTS_COUNTER = 20;
    private static final float DESIGN_TOTAL_WIDTH = 172.0f;
    private static final int INT_12 = 12;
    private static final int INT_8 = 8;
    private boolean hasInit;
    private int humanWidth;
    private boolean isRtl;
    private int leftCircleColor;
    private int progress;
    private int rightDotColor;
    private final Paint shapePaint;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PedometerWalkingBgView(Context context) {
        this(context, null, 0, 6, null);
        n.h(context, "context");
    }

    public final void init(int i10, int i11, int i12) {
        this.hasInit = true;
        this.humanWidth = i10;
        this.leftCircleColor = i11;
        this.rightDotColor = i12;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        n.h(canvas, "canvas");
        super.onDraw(canvas);
        if (this.hasInit) {
            float width = getWidth() / 172.0f;
            float height = getHeight() / 2.0f;
            float f10 = 8;
            float width2 = (this.humanWidth / 2) + (f10 * width);
            if (this.isRtl) {
                width2 = getWidth() - width2;
            }
            float f11 = 2;
            float width3 = (((getWidth() - (width2 * f11)) * this.progress) / 100.0f) + width2;
            int i10 = this.humanWidth;
            float f12 = width3 - (i10 / 2);
            float f13 = (width3 + (i10 / 2)) / width;
            int iFloor = (int) Math.floor(((f12 / width) - 12) / f10);
            int iCeil = (int) Math.ceil((f13 - f10) / f10);
            boolean z9 = this.isRtl;
            int i11 = z9 ? this.rightDotColor : this.leftCircleColor;
            int i12 = z9 ? this.leftCircleColor : this.rightDotColor;
            float f14 = z9 ? height / f11 : height;
            float f15 = z9 ? height : height / f11;
            this.shapePaint.setColor(i11);
            if (iFloor >= 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    canvas.drawCircle(((8 * i14) + 2) * width, height, f14, this.shapePaint);
                    if (i13 == iFloor) {
                        break;
                    } else {
                        i13 = i14;
                    }
                }
            }
            this.shapePaint.setColor(i12);
            while (iCeil < 20) {
                iCeil++;
                canvas.drawCircle(((8 * iCeil) + 2) * width, height, f15, this.shapePaint);
            }
        }
    }

    public final void refreshRtl(boolean z9) {
        this.isRtl = z9;
    }

    public final void setProgress(int i10) {
        this.progress = i10;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PedometerWalkingBgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    public /* synthetic */ PedometerWalkingBgView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PedometerWalkingBgView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.shapePaint = paint;
    }
}

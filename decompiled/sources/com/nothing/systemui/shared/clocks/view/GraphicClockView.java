package com.nothing.systemui.shared.clocks.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class GraphicClockView extends D {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final String f18215L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final Paint f18216M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final Paint f18217N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Paint f18218O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final Paint f18219P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private Bitmap f18220Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Bitmap f18221R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f18222S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f18223T;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphicClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final void K(Canvas canvas, float f10, int i10, Xfermode xfermode) {
        Paint paint = this.f18216M;
        paint.setColor(i10);
        paint.setXfermode(xfermode);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f11 = f10 / 2.0f;
        canvas.drawOval(new RectF(width - f11, height - f11, width + f11, height + f11), this.f18216M);
    }

    static /* synthetic */ void L(GraphicClockView graphicClockView, Canvas canvas, float f10, int i10, Xfermode xfermode, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            xfermode = null;
        }
        graphicClockView.K(canvas, f10, i10, xfermode);
    }

    private final void M(Canvas canvas, float f10, float f11, p079h8.o oVar, int i10) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        Paint paint = this.f18218O;
        paint.setStrokeWidth(f11);
        paint.setColor(i10);
        double d10 = ((((double) f10) * 3.141592653589793d) / ((double) 30.0f)) - 1.5707963267948966d;
        double d11 = width;
        double d12 = height;
        canvas.drawLine((float) (d11 - ((Math.cos(d10) * d12) * ((Number) oVar.c()).doubleValue())), (float) (d12 - ((Math.sin(d10) * d12) * ((Number) oVar.c()).doubleValue())), (float) (d11 + (Math.cos(d10) * d12 * ((Number) oVar.d()).doubleValue())), (float) (d12 + (Math.sin(d10) * d12 * ((Number) oVar.d()).doubleValue())), this.f18218O);
    }

    private final void N(Canvas canvas, String str) {
        int length = str.length();
        int i10 = length - 2;
        String strSubstring = str.substring(i10, length);
        kotlin.jvm.internal.n.g(strSubstring, "substring(...)");
        int i11 = Integer.parseInt(strSubstring);
        int i12 = length - 4;
        String strSubstring2 = str.substring(i12, i10);
        kotlin.jvm.internal.n.g(strSubstring2, "substring(...)");
        int i13 = Integer.parseInt(strSubstring2);
        String strSubstring3 = str.substring(0, i12);
        kotlin.jvm.internal.n.g(strSubstring3, "substring(...)");
        int i14 = Integer.parseInt(strSubstring3);
        boolean z9 = k() || m();
        float dimension = getResources().getDimension(I2.b.f2839d) * getScaleRatio();
        int i15 = (!kotlin.jvm.internal.n.d(l(), Boolean.FALSE) || z9) ? -1 : -16777216;
        int iB = p171r0.a.b(getContext(), I2.a.f2823a);
        float f10 = i13;
        M(canvas, (i14 + (f10 / 60.0f)) * 5.0f, dimension * 2, new p079h8.o(Float.valueOf(0.21686748f), Float.valueOf(0.42168674f)), i15);
        float f11 = i11;
        M(canvas, f10 + (f11 / 60.0f), dimension, new p079h8.o(Float.valueOf(0.21686748f), Float.valueOf(0.8072289f)), i15);
        if (z9) {
            return;
        }
        M(canvas, f11, dimension / 2.0f, new p079h8.o(Float.valueOf(0.19277108f), Float.valueOf(0.8072289f)), iB);
    }

    private final void O(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmap2 = this.f18220Q;
        if (bitmap2 == null || (bitmap = this.f18221R) == null) {
            return;
        }
        this.f18219P.setColorFilter(new PorterDuffColorFilter((!kotlin.jvm.internal.n.d(l(), Boolean.FALSE) || k() || m()) ? -1 : -16777216, PorterDuff.Mode.SRC_IN));
        float width = (getWidth() - (bitmap2.getWidth() * getScaleRatio())) / 2.0f;
        float height = (getHeight() - (bitmap2.getHeight() * getScaleRatio())) / 2.0f;
        if (!k() && !m()) {
            Matrix matrix = new Matrix();
            matrix.postScale(getScaleRatio(), getScaleRatio());
            matrix.postTranslate(width, height);
            p079h8.A a10 = p079h8.A.f21846a;
            canvas.drawBitmap(bitmap, matrix, this.f18219P);
        }
        Matrix matrix2 = new Matrix();
        matrix2.postScale(getScaleRatio(), getScaleRatio());
        matrix2.postTranslate(width, height);
        p079h8.A a11 = p079h8.A.f21846a;
        canvas.drawBitmap(bitmap2, matrix2, this.f18219P);
    }

    private final void P() {
        if (this.f18222S) {
            return;
        }
        this.f18222S = true;
        Log.d(getTag(), "initResource");
        Trace.beginSection(getTag() + "#initResource");
        Drawable drawableD = p171r0.a.d(getContext(), I2.c.f2897b);
        this.f18220Q = drawableD != null ? p201u0.b.b(drawableD, 0, 0, null, 7, null) : null;
        Drawable drawableD2 = p171r0.a.d(getContext(), I2.c.f2899c);
        this.f18221R = drawableD2 != null ? p201u0.b.b(drawableD2, 0, 0, null, 7, null) : null;
        Trace.endSection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Q(K2.b d10) {
        kotlin.jvm.internal.n.h(d10, "$this$d");
        return "refreshTime() - before invalidate new time: " + d10.o();
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void F() {
        if (getFormat() == null) {
            return;
        }
        if (!this.f18223T) {
            long jCurrentTimeMillis = System.currentTimeMillis() - getCalendar().getTimeInMillis();
            if (0 <= jCurrentTimeMillis && jCurrentTimeMillis < 901) {
                Log.d(getTag(), "intercept refreshTime interval 0-900ms");
                return;
            }
        }
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        String str = new SimpleDateFormat(getFormat(), Locale.ENGLISH).format(getCalendar().getTime());
        if (kotlin.jvm.internal.n.d(getTimeStr(), str)) {
            return;
        }
        kotlin.jvm.internal.n.e(str);
        if (str.length() > 0) {
            K2.e logger = getLogger();
            p219v8.l lVar = new p219v8.l() { // from class: com.nothing.systemui.shared.clocks.view.a
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return GraphicClockView.Q((K2.b) obj);
                }
            };
            K2.b bVarA = logger.e().a(logger.f(), K2.a.DEBUG, lVar, null);
            bVarA.k(str);
            logger.e().b(bVarA);
            setTimeStr(str);
            setContentDescription(getTalkBackContent());
            invalidate();
            K2.e.c(getLogger(), "refreshTime() - after invalidate", null, 2, null);
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.View
    public String getTag() {
        return this.f18215L;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void h(Canvas canvas) {
        kotlin.jvm.internal.n.h(canvas, "canvas");
        P();
        String timeStr = getTimeStr();
        if (timeStr.length() != 0 && TextUtils.isDigitsOnly(timeStr)) {
            float dimension = getResources().getDimension(I2.b.f2854s) * getScaleRatio();
            int i10 = (!kotlin.jvm.internal.n.d(l(), Boolean.FALSE) || k() || m()) ? -1 : -16777216;
            O(canvas);
            L(this, canvas, (3 * dimension) / 2, i10, null, 8, null);
            N(canvas, timeStr);
            if (k() || m()) {
                K(canvas, dimension, 0, new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            } else {
                L(this, canvas, dimension, p171r0.a.b(getContext(), I2.a.f2823a), null, 8, null);
            }
            this.f18223T = false;
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18223T = true;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18223T = false;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void z() {
        this.f18220Q = null;
        this.f18221R = null;
        Drawable drawableD = p171r0.a.d(getContext(), I2.c.f2897b);
        this.f18220Q = drawableD != null ? p201u0.b.b(drawableD, 0, 0, null, 7, null) : null;
        Drawable drawableD2 = p171r0.a.d(getContext(), I2.c.f2899c);
        this.f18221R = drawableD2 != null ? p201u0.b.b(drawableD2, 0, 0, null, 7, null) : null;
    }

    public /* synthetic */ GraphicClockView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicClockView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18215L = "GraphicClockView";
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        this.f18216M = paint;
        Paint paint2 = new Paint();
        paint2.setColor(0);
        paint2.setStyle(style);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setAntiAlias(true);
        this.f18217N = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setAntiAlias(true);
        this.f18218O = paint3;
        Paint paint4 = new Paint();
        paint4.setStyle(style);
        paint4.setAntiAlias(true);
        this.f18219P = paint4;
        this.f18223T = true;
    }
}

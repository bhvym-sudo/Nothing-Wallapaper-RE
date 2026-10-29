package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f12813b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f12812a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f12814c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short f12815d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f12816e = 1.0f;

    i(o oVar) {
        B0.i.f(oVar, "rasterizer cannot be null");
        this.f12813b = oVar;
    }

    public final o a() {
        return this.f12813b;
    }

    final int b() {
        return this.f12814c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f12812a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f12812a;
        this.f12816e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f12813b.e();
        this.f12815d = (short) (this.f12813b.e() * this.f12816e);
        short sI = (short) (this.f12813b.i() * this.f12816e);
        this.f12814c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f12812a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}

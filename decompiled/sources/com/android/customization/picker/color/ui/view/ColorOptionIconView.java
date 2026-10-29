package com.android.customization.picker.color.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class ColorOptionIconView extends View {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f15364y = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Paint f15365q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final RectF f15366r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f15367s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f15368t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f15369u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f15370v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f15371w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f15372x;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a(int i10) {
            return i10 % 2 == 0 ? i10 : i10 - 1;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorOptionIconView(Context context, AttributeSet attrs) {
        super(context, attrs);
        n.h(context, "context");
        n.h(attrs, "attrs");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.f15365q = paint;
        this.f15366r = new RectF();
        this.f15367s = -16777216;
        this.f15368t = -16777216;
        this.f15369u = -16777216;
        this.f15370v = -16777216;
    }

    public final void a(int i10, int i11, int i12, int i13) {
        this.f15367s = i10;
        this.f15368t = i11;
        this.f15369u = i12;
        this.f15370v = i13;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        n.h(canvas, "canvas");
        super.onDraw(canvas);
        a aVar = f15364y;
        this.f15371w = aVar.a(this.f15371w);
        int iA = aVar.a(this.f15372x);
        this.f15372x = iA;
        this.f15366r.set(0.0f, 0.0f, this.f15371w, iA);
        this.f15365q.setColor(this.f15370v);
        canvas.drawArc(this.f15366r, 0.0f, 90.0f, true, this.f15365q);
        this.f15365q.setColor(this.f15369u);
        canvas.drawArc(this.f15366r, 90.0f, 90.0f, true, this.f15365q);
        this.f15365q.setColor(this.f15367s);
        canvas.drawArc(this.f15366r, 180.0f, 90.0f, true, this.f15365q);
        this.f15365q.setColor(this.f15368t);
        canvas.drawArc(this.f15366r, 270.0f, 90.0f, true, this.f15365q);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f15371w = i10;
        this.f15372x = i11;
        super.onSizeChanged(i10, i11, i12, i13);
    }
}

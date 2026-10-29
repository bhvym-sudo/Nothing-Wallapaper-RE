package com.nothing.widget.ui.list;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class NtListLeadingIconView extends AppCompatImageView {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Path f19265q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NtListLeadingIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        n.h(canvas, "canvas");
        canvas.clipPath(this.f19265q);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f19265q.rewind();
        float f10 = 2;
        float f11 = i10 / f10;
        this.f19265q.addCircle(f11, i11 / f10, f11, Path.Direction.CW);
    }

    public /* synthetic */ NtListLeadingIconView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NtListLeadingIconView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        this.f19265q = new Path();
    }
}

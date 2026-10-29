package D7;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.launcher3.dragndrop.DragLayer;
import p248y7.u;
import p253z2.h;

/* JADX INFO: loaded from: classes2.dex */
public class d extends h {
    public d(u uVar, Drawable drawable, int i10, int i11, float f10, float f11, float f12) {
        super(uVar, drawable, i10, i11, f10, f11, f12);
    }

    @Override // p253z2.h
    public void f(int i10, int i11, Runnable runnable, int i12) {
        int[] iArr = this.f30665C;
        iArr[0] = i10 - this.f30692x;
        iArr[1] = i11 - this.f30693y;
        DragLayer dragLayerJ = ((u) this.f30668F).J();
        int[] iArr2 = this.f30665C;
        float f10 = this.f30664B;
        dragLayerJ.w(this, iArr2, 1.0f, f10, f10, 0, runnable, i12);
    }

    public d(u uVar, View view, int i10, int i11, int i12, int i13, float f10, float f11, float f12) {
        super(uVar, view, i10, i11, i12, i13, f10, f11, f12);
    }
}

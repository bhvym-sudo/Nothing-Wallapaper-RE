package androidx.compose.ui.platform;

import I.AbstractC0862f;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
final class J implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f11722a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f11723b = new int[2];

    @Override // androidx.compose.ui.platform.I
    public void a(View view, float[] fArr) {
        this.f11722a.reset();
        view.transformMatrixToGlobal(this.f11722a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f11723b);
        int[] iArr = this.f11723b;
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f11723b;
        this.f11722a.postTranslate(iArr2[0] - i10, iArr2[1] - i11);
        AbstractC0862f.b(fArr, this.f11722a);
    }
}

package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: androidx.compose.ui.platform.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1068z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p219v8.l f12014a = a.f12015r;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.z$a */
    static final class a extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f12015r = new a();

        a() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p061g0.t f(p061g0.t tVar) {
            return tVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(View view, View view2) {
        if (kotlin.jvm.internal.n.d(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    private static final float e(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12] * fArr2[i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 3] * fArr2[12 + i11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.platform.coreshims.b f(View view) {
        androidx.compose.ui.platform.coreshims.c.c(view, 1);
        return androidx.compose.ui.platform.coreshims.c.b(view);
    }

    public static final p219v8.l g() {
        return f12014a;
    }

    private static final void h(float[] fArr, float[] fArr2) {
        float fE = e(fArr2, 0, fArr, 0);
        float fE2 = e(fArr2, 0, fArr, 1);
        float fE3 = e(fArr2, 0, fArr, 2);
        float fE4 = e(fArr2, 0, fArr, 3);
        float fE5 = e(fArr2, 1, fArr, 0);
        float fE6 = e(fArr2, 1, fArr, 1);
        float fE7 = e(fArr2, 1, fArr, 2);
        float fE8 = e(fArr2, 1, fArr, 3);
        float fE9 = e(fArr2, 2, fArr, 0);
        float fE10 = e(fArr2, 2, fArr, 1);
        float fE11 = e(fArr2, 2, fArr, 2);
        float fE12 = e(fArr2, 2, fArr, 3);
        float fE13 = e(fArr2, 3, fArr, 0);
        float fE14 = e(fArr2, 3, fArr, 1);
        float fE15 = e(fArr2, 3, fArr, 2);
        float fE16 = e(fArr2, 3, fArr, 3);
        fArr[0] = fE;
        fArr[1] = fE2;
        fArr[2] = fE3;
        fArr[3] = fE4;
        fArr[4] = fE5;
        fArr[5] = fE6;
        fArr[6] = fE7;
        fArr[7] = fE8;
        fArr[8] = fE9;
        fArr[9] = fE10;
        fArr[10] = fE11;
        fArr[11] = fE12;
        fArr[12] = fE13;
        fArr[13] = fE14;
        fArr[14] = fE15;
        fArr[15] = fE16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(float[] fArr, float f10, float f11, float[] fArr2) {
        I.C.h(fArr2);
        I.C.q(fArr2, f10, f11, 0.0f, 4, null);
        h(fArr, fArr2);
    }
}

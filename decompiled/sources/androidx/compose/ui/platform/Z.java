package androidx.compose.ui.platform;

import I.AbstractC0862f;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p219v8.p f11838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Matrix f11839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Matrix f11840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f11841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f11842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11843f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f11844g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11845h = true;

    public Z(p219v8.p pVar) {
        this.f11838a = pVar;
    }

    public final float[] a(Object obj) {
        float[] fArrC = this.f11842e;
        if (fArrC == null) {
            fArrC = I.C.c(null, 1, null);
            this.f11842e = fArrC;
        }
        if (this.f11844g) {
            this.f11845h = X.a(b(obj), fArrC);
            this.f11844g = false;
        }
        if (this.f11845h) {
            return fArrC;
        }
        return null;
    }

    public final float[] b(Object obj) {
        float[] fArrC = this.f11841d;
        if (fArrC == null) {
            fArrC = I.C.c(null, 1, null);
            this.f11841d = fArrC;
        }
        if (!this.f11843f) {
            return fArrC;
        }
        Matrix matrix = this.f11839b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f11839b = matrix;
        }
        this.f11838a.invoke(obj, matrix);
        Matrix matrix2 = this.f11840c;
        if (matrix2 == null || !kotlin.jvm.internal.n.d(matrix, matrix2)) {
            AbstractC0862f.b(fArrC, matrix);
            this.f11839b = matrix2;
            this.f11840c = matrix;
        }
        this.f11843f = false;
        return fArrC;
    }

    public final void c() {
        this.f11843f = true;
        this.f11844g = true;
    }
}

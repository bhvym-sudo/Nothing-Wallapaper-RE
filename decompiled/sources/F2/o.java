package F2;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f1587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f1588b;

    public o(View view) {
        this(view, 6, 6);
    }

    public m.c a(int i10) {
        return this.f1587a.h(i10);
    }

    public m.c b(int i10) {
        return this.f1588b.h(i10);
    }

    public void c(int i10, float f10, float f11) {
        a(i10).c(f10);
        b(i10).c(f11);
    }

    public o(View view, int i10, int i11) {
        this.f1587a = new m(view, com.android.launcher3.j.f15624g, i10, new m.b() { // from class: F2.n
            @Override // F2.m.b
            public final float a(float f10, float f11) {
                return Float.sum(f10, f11);
            }
        });
        this.f1588b = new m(view, com.android.launcher3.j.f15625h, i11, new m.b() { // from class: F2.n
            @Override // F2.m.b
            public final float a(float f10, float f11) {
                return Float.sum(f10, f11);
            }
        });
    }
}

package F2;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class q extends m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final m.b f1589j = new m.b() { // from class: F2.p
        @Override // F2.m.b
        public final float a(float f10, float f11) {
            return q.i(f10, f11);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f1591i;

    public q(View view, int i10) {
        this(view, i10, 4);
    }

    public static /* synthetic */ float i(float f10, float f11) {
        return f10 * f11;
    }

    @Override // F2.m
    protected void g(float f10) {
        super.g(f10);
        if (this.f1590h) {
            p223w2.a.b((View) this.f1580d, this.f1591i);
        }
    }

    public q(View view, int i10, int i11) {
        super(view, com.android.launcher3.j.f15626i, i10, f1589j, 1.0f);
        this.f1591i = i11;
    }
}

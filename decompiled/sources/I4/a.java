package I4;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f3039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final View f3040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f3041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f3042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f3043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p010b.b f3044f;

    public a(View view) {
        this.f3040b = view;
        Context context = view.getContext();
        this.f3039a = f.g(context, p225w4.a.f28678M, D0.a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f3041c = f.f(context, p225w4.a.f28670E, 300);
        this.f3042d = f.f(context, p225w4.a.f28673H, 150);
        this.f3043e = f.f(context, p225w4.a.f28672G, 100);
    }

    public float a(float f10) {
        return this.f3039a.getInterpolation(f10);
    }

    protected p010b.b b() {
        if (this.f3044f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        p010b.b bVar = this.f3044f;
        this.f3044f = null;
        return bVar;
    }

    public p010b.b c() {
        p010b.b bVar = this.f3044f;
        this.f3044f = null;
        return bVar;
    }

    protected void d(p010b.b bVar) {
        this.f3044f = bVar;
    }

    protected p010b.b e(p010b.b bVar) {
        if (this.f3044f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        p010b.b bVar2 = this.f3044f;
        this.f3044f = bVar;
        return bVar2;
    }
}

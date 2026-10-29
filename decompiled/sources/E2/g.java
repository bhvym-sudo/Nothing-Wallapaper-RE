package E2;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.android.launcher3.w;

/* JADX INFO: loaded from: classes.dex */
public class g extends E2.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f1272v = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f1273w = new b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c f1274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final d f1275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1276t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f1277u;

    class a extends c {
        a() {
        }

        @Override // E2.g.c
        float a(PointF pointF) {
            return pointF.y;
        }

        @Override // E2.g.c
        float b(PointF pointF) {
            return pointF.x;
        }

        @Override // E2.g.c
        boolean c(float f10) {
            return f10 > 0.0f;
        }

        @Override // E2.g.c
        boolean d(float f10) {
            return f10 < 0.0f;
        }

        public String toString() {
            return "VERTICAL";
        }
    }

    class b extends c {
        b() {
        }

        @Override // E2.g.c
        float a(PointF pointF) {
            return pointF.x;
        }

        @Override // E2.g.c
        float b(PointF pointF) {
            return pointF.y;
        }

        @Override // E2.g.c
        boolean c(float f10) {
            return f10 < 0.0f;
        }

        @Override // E2.g.c
        boolean d(float f10) {
            return f10 > 0.0f;
        }

        public String toString() {
            return "HORIZONTAL";
        }
    }

    public static abstract class c {
        abstract float a(PointF pointF);

        abstract float b(PointF pointF);

        abstract boolean c(float f10);

        abstract boolean d(float f10);
    }

    public interface d {
        default boolean e(float f10, float f11, MotionEvent motionEvent) {
            return r(f10, motionEvent);
        }

        void f(float f10);

        void m(boolean z9, float f10);

        boolean o(float f10);

        default boolean r(float f10, MotionEvent motionEvent) {
            return o(f10);
        }
    }

    public g(Context context, d dVar, c cVar) {
        super(context, ViewConfiguration.get(context), w.g(context.getResources()));
        this.f1277u = 1.0f;
        this.f1275s = dVar;
        this.f1274r = cVar;
    }

    private boolean t(float f10) {
        return (this.f1276t & 2) > 0 && this.f1274r.c(f10);
    }

    private boolean u(float f10) {
        return (this.f1276t & 1) > 0 && this.f1274r.d(f10);
    }

    @Override // E2.b
    protected void m(PointF pointF) {
        this.f1275s.f(this.f1274r.a(pointF));
    }

    @Override // E2.b
    protected void o(boolean z9) {
        this.f1275s.m(!z9, this.f1274r.a(this.f1261l));
    }

    @Override // E2.b
    protected void q(PointF pointF, MotionEvent motionEvent) {
        this.f1275s.e(this.f1274r.a(pointF), this.f1274r.b(pointF), motionEvent);
    }

    @Override // E2.b
    protected boolean s(PointF pointF) {
        if (Math.abs(this.f1274r.a(pointF)) < Math.max(this.f1254e * this.f1277u, Math.abs(this.f1274r.b(pointF)))) {
            return false;
        }
        float fA = this.f1274r.a(pointF);
        return t(fA) || u(fA);
    }

    public void v(int i10, boolean z9) {
        this.f1276t = i10;
        this.f1264o = z9;
    }
}

package E2;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.android.launcher3.o;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final PointF f1249q = new PointF();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f1250a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final boolean f1253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final float f1254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final float f1255f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private VelocityTracker f1258i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1263n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected boolean f1264o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected Context f1265p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f1251b = new PointF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointF f1252c = new PointF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Queue f1256g = new LinkedList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1257h = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PointF f1259j = new PointF();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PointF f1260k = new PointF();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected PointF f1261l = new PointF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    a f1262m = a.IDLE;

    /* JADX INFO: Access modifiers changed from: private */
    enum a {
        IDLE,
        DRAGGING,
        SETTLING
    }

    protected b(Context context, ViewConfiguration viewConfiguration, boolean z9) {
        this.f1254e = viewConfiguration.getScaledTouchSlop();
        this.f1255f = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1253d = z9;
        this.f1265p = context;
        this.f1250a = context.getResources().getDimensionPixelSize(o.f15634a);
    }

    public static long b(float f10, float f11) {
        return (long) Math.max(100.0f, (1200.0f / Math.max(2.0f, Math.abs(f10 * 0.5f))) * Math.max(0.2f, f11));
    }

    private void f() {
        if (this.f1262m == a.SETTLING && this.f1264o) {
            this.f1261l.set(0.0f, 0.0f);
            return;
        }
        PointF pointF = this.f1261l;
        PointF pointF2 = this.f1260k;
        pointF.x = pointF2.x > 0.0f ? this.f1254e : -this.f1254e;
        float f10 = pointF2.y;
        float f11 = this.f1254e;
        if (f10 <= 0.0f) {
            f11 = -f11;
        }
        pointF.y = f11;
    }

    private void l() {
        this.f1258i.computeCurrentVelocity(1000, this.f1255f);
        PointF pointF = new PointF(this.f1258i.getXVelocity() / 1000.0f, this.f1258i.getYVelocity() / 1000.0f);
        if (this.f1253d) {
            pointF.x = -pointF.x;
        }
        m(pointF);
    }

    private void n(boolean z9) {
        o(z9);
    }

    private void p(MotionEvent motionEvent) {
        PointF pointF = this.f1260k;
        PointF pointF2 = this.f1259j;
        if (pointF != pointF2) {
            pointF2.set(pointF);
            PointF pointF3 = f1249q;
            PointF pointF4 = this.f1260k;
            float f10 = pointF4.x;
            PointF pointF5 = this.f1261l;
            pointF3.set(f10 - pointF5.x, pointF4.y - pointF5.y);
            q(pointF3, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void j(final a aVar) {
        if (this.f1263n) {
            this.f1256g.add(new Runnable() { // from class: E2.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1247q.j(aVar);
                }
            });
            return;
        }
        this.f1263n = true;
        if (aVar == a.DRAGGING) {
            f();
            a aVar2 = this.f1262m;
            if (aVar2 == a.IDLE) {
                n(false);
            } else if (aVar2 == a.SETTLING) {
                n(true);
            }
        }
        if (aVar == a.SETTLING) {
            l();
        }
        this.f1262m = aVar;
        this.f1263n = false;
        if (this.f1256g.isEmpty()) {
            return;
        }
        ((Runnable) this.f1256g.remove()).run();
    }

    public boolean c(MotionEvent motionEvent) {
        int iFindPointerIndex = motionEvent.findPointerIndex(this.f1257h);
        if (iFindPointerIndex == -1) {
            return false;
        }
        this.f1260k.set(motionEvent.getX(iFindPointerIndex) - this.f1251b.x, motionEvent.getY(iFindPointerIndex) - this.f1251b.y);
        if (this.f1253d) {
            PointF pointF = this.f1260k;
            pointF.x = -pointF.x;
        }
        return s(this.f1260k);
    }

    public void d() {
        j(a.IDLE);
    }

    public boolean e() {
        return Math.abs(this.f1260k.x) >= Math.max(this.f1254e, Math.abs(this.f1260k.y));
    }

    public boolean g() {
        a aVar = this.f1262m;
        return aVar == a.DRAGGING || aVar == a.SETTLING;
    }

    public boolean h(float f10) {
        return Math.abs(f10) > this.f1250a;
    }

    public boolean i() {
        return this.f1262m == a.IDLE;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    public boolean k(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f1258i) != null) {
            velocityTracker.clear();
        }
        if (this.f1258i == null) {
            this.f1258i = VelocityTracker.obtain();
        }
        this.f1258i.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f1257h = motionEvent.getPointerId(0);
            this.f1251b.set(motionEvent.getX(), motionEvent.getY());
            this.f1252c.set(this.f1251b);
            this.f1259j.set(0.0f, 0.0f);
            this.f1260k.set(0.0f, 0.0f);
            if (this.f1262m == a.SETTLING && this.f1264o) {
                j(a.DRAGGING);
            }
        } else if (actionMasked == 1) {
            if (this.f1262m == a.DRAGGING) {
                j(a.SETTLING);
            }
            this.f1258i.recycle();
            this.f1258i = null;
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f1257h);
            if (iFindPointerIndex != -1) {
                this.f1260k.set(motionEvent.getX(iFindPointerIndex) - this.f1251b.x, motionEvent.getY(iFindPointerIndex) - this.f1251b.y);
                if (this.f1253d) {
                    PointF pointF = this.f1260k;
                    pointF.x = -pointF.x;
                }
                a aVar = this.f1262m;
                a aVar2 = a.DRAGGING;
                if (aVar != aVar2 && s(this.f1260k)) {
                    j(aVar2);
                }
                if (this.f1262m == aVar2) {
                    p(motionEvent);
                }
                this.f1252c.set(motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex));
            }
        } else if (actionMasked == 3) {
            if (this.f1262m == a.DRAGGING) {
                j(a.SETTLING);
            }
            this.f1258i.recycle();
            this.f1258i = null;
        } else if (actionMasked == 6) {
            int actionIndex = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(actionIndex) == this.f1257h) {
                int i10 = actionIndex == 0 ? 1 : 0;
                this.f1251b.set(motionEvent.getX(i10) - (this.f1252c.x - this.f1251b.x), motionEvent.getY(i10) - (this.f1252c.y - this.f1251b.y));
                this.f1252c.set(motionEvent.getX(i10), motionEvent.getY(i10));
                this.f1257h = motionEvent.getPointerId(i10);
            }
        }
        return true;
    }

    protected abstract void m(PointF pointF);

    protected abstract void o(boolean z9);

    protected abstract void q(PointF pointF, MotionEvent motionEvent);

    protected abstract boolean s(PointF pointF);
}

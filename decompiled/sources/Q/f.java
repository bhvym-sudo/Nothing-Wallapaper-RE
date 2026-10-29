package Q;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f6506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseLongArray f6507b = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f6508c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f6509d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6510e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f6511f = -1;

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.f6507b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f6507b;
                long j9 = this.f6506a;
                this.f6506a = 1 + j9;
                sparseLongArray.put(pointerId, j9);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f6507b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f6507b;
            long j10 = this.f6506a;
            this.f6506a = 1 + j10;
            sparseLongArray2.put(pointerId2, j10);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f6508c.put(pointerId2, true);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f6510e && source == this.f6511f) {
            return;
        }
        this.f6510e = toolType;
        this.f6511f = source;
        this.f6508c.clear();
        this.f6507b.clear();
    }

    private final w d(B b10, MotionEvent motionEvent, int i10, boolean z9) {
        long jA;
        long jT;
        int iE;
        long jF = f(motionEvent.getPointerId(i10));
        float pressure = motionEvent.getPressure(i10);
        long jG = H.g.g(H.h.a(motionEvent.getX(i10), motionEvent.getY(i10)), 0.0f, 0.0f, 3, null);
        if (i10 == 0) {
            jA = H.h.a(motionEvent.getRawX(), motionEvent.getRawY());
            jT = b10.t(jA);
        } else {
            jA = g.f6512a.a(motionEvent, i10);
            jT = b10.t(jA);
        }
        long j9 = jA;
        long j10 = jT;
        int toolType = motionEvent.getToolType(i10);
        if (toolType == 0) {
            iE = A.f6488a.e();
        } else if (toolType == 1) {
            iE = A.f6488a.d();
        } else if (toolType == 2) {
            iE = A.f6488a.c();
        } else if (toolType != 3) {
            iE = toolType != 4 ? A.f6488a.e() : A.f6488a.a();
        } else {
            iE = A.f6488a.b();
        }
        int i11 = iE;
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        for (int i12 = 0; i12 < historySize; i12++) {
            float historicalX = motionEvent.getHistoricalX(i10, i12);
            float historicalY = motionEvent.getHistoricalY(i10, i12);
            if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && !Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                long jA2 = H.h.a(historicalX, historicalY);
                arrayList.add(new C0944c(motionEvent.getHistoricalEventTime(i12), jA2, jA2, null));
            }
        }
        return new w(jF, motionEvent.getEventTime(), j9, j10, z9, pressure, i11, this.f6508c.get(motionEvent.getPointerId(i10), false), arrayList, motionEvent.getActionMasked() == 8 ? H.h.a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f) : H.g.f2287b.c(), jG, null);
    }

    private final long f(int i10) {
        long jValueAt;
        int iIndexOfKey = this.f6507b.indexOfKey(i10);
        if (iIndexOfKey >= 0) {
            jValueAt = this.f6507b.valueAt(iIndexOfKey);
        } else {
            long j9 = this.f6506a;
            this.f6506a = 1 + j9;
            this.f6507b.put(i10, j9);
            jValueAt = j9;
        }
        return s.a(jValueAt);
    }

    private final boolean g(MotionEvent motionEvent, int i10) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (motionEvent.getPointerId(i11) == i10) {
                return true;
            }
        }
        return false;
    }

    private final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f6508c.get(pointerId, false)) {
                this.f6507b.delete(pointerId);
                this.f6508c.delete(pointerId);
            }
        }
        if (this.f6507b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f6507b.size() - 1; -1 < size; size--) {
                int iKeyAt = this.f6507b.keyAt(size);
                if (!g(motionEvent, iKeyAt)) {
                    this.f6507b.removeAt(size);
                    this.f6508c.delete(iKeyAt);
                }
            }
        }
    }

    public final v c(MotionEvent motionEvent, B b10) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.f6507b.clear();
            this.f6508c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z9 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z10 = actionMasked == 8;
        if (z9) {
            this.f6508c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        this.f6509d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        while (i10 < pointerCount) {
            this.f6509d.add(d(b10, motionEvent, i10, (z9 || i10 == actionIndex || (z10 && motionEvent.getButtonState() == 0)) ? false : true));
            i10++;
        }
        h(motionEvent);
        return new v(motionEvent.getEventTime(), this.f6509d, motionEvent);
    }

    public final void e(int i10) {
        this.f6508c.delete(i10);
        this.f6507b.delete(i10);
    }
}

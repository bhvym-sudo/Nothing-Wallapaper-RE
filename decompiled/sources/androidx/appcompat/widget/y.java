package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class y implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float f11171q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f11172r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f11173s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final View f11174t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Runnable f11175u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Runnable f11176v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f11177w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f11178x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int[] f11179y = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = y.this.f11174t.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.e();
        }
    }

    public y(View view) {
        this.f11174t = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f11171q = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f11172r = tapTimeout;
        this.f11173s = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f11176v;
        if (runnable != null) {
            this.f11174t.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f11175u;
        if (runnable2 != null) {
            this.f11174t.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        w wVar;
        View view = this.f11174t;
        p100k.e eVarB = b();
        if (eVarB != null && eVarB.a() && (wVar = (w) eVarB.j()) != null && wVar.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, motionEventObtainNoHistory);
            j(wVar, motionEventObtainNoHistory);
            boolean zE = wVar.e(motionEventObtainNoHistory, this.f11178x);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z9 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zE && z9) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    private boolean g(MotionEvent motionEvent) {
        View view = this.f11174t;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f11178x = motionEvent.getPointerId(0);
            if (this.f11175u == null) {
                this.f11175u = new a();
            }
            view.postDelayed(this.f11175u, this.f11172r);
            if (this.f11176v == null) {
                this.f11176v = new b();
            }
            view.postDelayed(this.f11176v, this.f11173s);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f11178x);
            if (iFindPointerIndex >= 0 && !h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f11171q)) {
                a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            a();
        }
        return false;
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f11179y;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f11179y;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract p100k.e b();

    protected abstract boolean c();

    protected boolean d() {
        p100k.e eVarB = b();
        if (eVarB == null || !eVarB.a()) {
            return true;
        }
        eVarB.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f11174t;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f11177w = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z9;
        boolean z10 = this.f11177w;
        if (z10) {
            z9 = f(motionEvent) || !d();
        } else {
            z9 = g(motionEvent) && c();
            if (z9) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f11174t.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f11177w = z9;
        return z9 || z10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f11177w = false;
        this.f11178x = -1;
        Runnable runnable = this.f11175u;
        if (runnable != null) {
            this.f11174t.removeCallbacks(runnable);
        }
    }
}

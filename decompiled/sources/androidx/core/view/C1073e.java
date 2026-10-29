package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: renamed from: androidx.core.view.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1073e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1074f f12251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f12252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f12253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VelocityTracker f12254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f12255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f12256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f12257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f12258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f12259j;

    /* JADX INFO: renamed from: androidx.core.view.e$a */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* JADX INFO: renamed from: androidx.core.view.e$b */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public C1073e(Context context, InterfaceC1074f interfaceC1074f) {
        this(context, interfaceC1074f, new b() { // from class: androidx.core.view.c
            @Override // androidx.core.view.C1073e.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                C1073e.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: androidx.core.view.d
            @Override // androidx.core.view.C1073e.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return C1073e.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = I.c(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = I.b(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f12257h == source && this.f12258i == deviceId && this.f12256g == i10) {
            return false;
        }
        this.f12252c.a(this.f12250a, this.f12259j, motionEvent, i10);
        this.f12257h = source;
        this.f12258i = deviceId;
        this.f12256g = i10;
        return true;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f12254e == null) {
            this.f12254e = VelocityTracker.obtain();
        }
        return this.f12253d.a(this.f12254e, motionEvent, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        E.a(velocityTracker, motionEvent);
        E.b(velocityTracker, 1000);
        return E.d(velocityTracker, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f12259j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f12254e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f12254e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.f12251b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f12255f) && fSignum != 0.0f)) {
            this.f12251b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f12259j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i11 = iArr[1];
        float fMax = Math.max(-i11, Math.min(fE, i11));
        this.f12255f = this.f12251b.a(fMax) ? fMax : 0.0f;
    }

    C1073e(Context context, InterfaceC1074f interfaceC1074f, b bVar, a aVar) {
        this.f12256g = -1;
        this.f12257h = -1;
        this.f12258i = -1;
        this.f12259j = new int[]{SubsamplingScaleImageView.TILE_SIZE_AUTO, 0};
        this.f12250a = context;
        this.f12251b = interfaceC1074f;
        this.f12252c = bVar;
        this.f12253d = aVar;
    }
}

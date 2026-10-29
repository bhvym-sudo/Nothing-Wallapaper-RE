package L5;

import android.app.AlarmManager;
import android.os.Handler;
import android.os.SystemClock;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements AlarmManager.OnAlarmListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0163a f4798v = new C0163a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AlarmManager f4799q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AlarmManager.OnAlarmListener f4800r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f4801s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Handler f4802t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f4803u;

    /* JADX INFO: renamed from: L5.a$a, reason: collision with other inner class name */
    public static final class C0163a {
        public /* synthetic */ C0163a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0163a() {
        }
    }

    public a(AlarmManager mAlarmManager, AlarmManager.OnAlarmListener mListener, String mTag, Handler handler) {
        n.h(mAlarmManager, "mAlarmManager");
        n.h(mListener, "mListener");
        n.h(mTag, "mTag");
        this.f4799q = mAlarmManager;
        this.f4800r = mListener;
        this.f4801s = mTag;
        this.f4802t = handler;
    }

    public final void a() {
        if (this.f4803u) {
            this.f4799q.cancel(this);
            this.f4803u = false;
        }
    }

    public final boolean b() {
        return this.f4803u;
    }

    public final boolean c(long j9, int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalArgumentException("Illegal mode: " + i10);
                }
                if (this.f4803u) {
                    a();
                }
            } else if (this.f4803u) {
                return false;
            }
        } else if (this.f4803u) {
            throw new IllegalStateException((this.f4801s + " timeout is already scheduled").toString());
        }
        this.f4799q.setExact(2, SystemClock.elapsedRealtime() + j9, this.f4801s, this, this.f4802t);
        this.f4803u = true;
        return true;
    }

    @Override // android.app.AlarmManager.OnAlarmListener
    public void onAlarm() {
        if (this.f4803u) {
            this.f4803u = false;
            this.f4800r.onAlarm();
        }
    }
}

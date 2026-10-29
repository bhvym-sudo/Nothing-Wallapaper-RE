package p231x0;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f29678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f29679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29680d;

    public interface a {
        void onCancel();
    }

    private void c() {
        while (this.f29680d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f29677a) {
                    return;
                }
                this.f29677a = true;
                this.f29680d = true;
                a aVar = this.f29678b;
                Object obj = this.f29679c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f29680d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f29680d = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.f29678b == aVar) {
                    return;
                }
                this.f29678b = aVar;
                if (this.f29677a && aVar != null) {
                    aVar.onCancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package p025c4;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f15079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f15080b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC1189c f15081c;

    public T(AbstractC1189c abstractC1189c, Object obj) {
        this.f15081c = abstractC1189c;
        this.f15079a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f15079a;
                if (this.f15080b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f15080b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f15079a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f15081c.f15102H) {
            this.f15081c.f15102H.remove(this);
        }
    }
}

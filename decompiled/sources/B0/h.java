package B0;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public class h extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f332c;

    public h(int i10) {
        super(i10);
        this.f332c = new Object();
    }

    @Override // B0.g, B0.f
    public Object acquire() {
        Object objAcquire;
        synchronized (this.f332c) {
            objAcquire = super.acquire();
        }
        return objAcquire;
    }

    @Override // B0.g, B0.f
    public boolean release(Object instance) {
        boolean zRelease;
        n.h(instance, "instance");
        synchronized (this.f332c) {
            zRelease = super.release(instance);
        }
        return zRelease;
    }
}

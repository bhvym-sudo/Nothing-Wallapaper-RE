package Z3;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
abstract class t extends r {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final WeakReference f9472s = new WeakReference(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WeakReference f9473r;

    t(byte[] bArr) {
        super(bArr);
        this.f9473r = f9472s;
    }

    protected abstract byte[] X();

    @Override // Z3.r
    final byte[] e() {
        byte[] bArrX;
        synchronized (this) {
            try {
                bArrX = (byte[]) this.f9473r.get();
                if (bArrX == null) {
                    bArrX = X();
                    this.f9473r = new WeakReference(bArrX);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrX;
    }
}

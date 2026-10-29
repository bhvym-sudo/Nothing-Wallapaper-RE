package O8;

import K8.D;
import K8.G;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f5953a = G.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final D f5954b = new D("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final D f5955c = new D("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final D f5956d = new D("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final D f5957e = new D("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f5958f = G.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final k h(long j9, k kVar) {
        return new k(j9, kVar, 0);
    }
}

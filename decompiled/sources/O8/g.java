package O8;

import K8.D;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D f5941a = new D("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final D f5942b = new D("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z9) {
        return new f(z9);
    }

    public static /* synthetic */ a b(boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        return a(z9);
    }
}

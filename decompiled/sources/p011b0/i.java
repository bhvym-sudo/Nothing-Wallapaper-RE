package p011b0;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AtomicInteger f14602a = new AtomicInteger(0);

    public static final int a() {
        return f14602a.addAndGet(1);
    }
}

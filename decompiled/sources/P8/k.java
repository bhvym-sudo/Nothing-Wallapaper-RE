package P8;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U8.g f6316a;

    public k(U8.g delegate) {
        kotlin.jvm.internal.n.h(delegate, "delegate");
        this.f6316a = delegate;
    }

    public final U8.g a() {
        return this.f6316a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i10, long j9, TimeUnit timeUnit) {
        this(new U8.g(T8.e.f7738i, i10, j9, timeUnit));
        kotlin.jvm.internal.n.h(timeUnit, "timeUnit");
    }

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}

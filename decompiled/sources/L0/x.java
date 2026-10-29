package L0;

/* JADX INFO: loaded from: classes.dex */
public final class x extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f4521b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Throwable readException, int i10) {
        super(i10, null);
        kotlin.jvm.internal.n.h(readException, "readException");
        this.f4521b = readException;
    }

    public final Throwable b() {
        return this.f4521b;
    }
}

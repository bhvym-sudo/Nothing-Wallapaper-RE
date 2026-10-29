package kotlin.coroutines.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements p129m8.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f22767q = new c();

    private c() {
    }

    @Override // p129m8.e
    public p129m8.i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // p129m8.e
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}

package K8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f4141a = new p000a.a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4143c;

    static {
        Object objB;
        Object objB2;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            objB = p079h8.q.b(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        if (p079h8.q.d(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f4142b = (String) objB;
        try {
            objB2 = p079h8.q.b(C.class.getCanonicalName());
        } catch (Throwable th2) {
            h8.q.a aVar3 = p079h8.q.f21862r;
            objB2 = p079h8.q.b(p079h8.r.a(th2));
        }
        if (p079h8.q.d(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f4143c = (String) objB2;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}

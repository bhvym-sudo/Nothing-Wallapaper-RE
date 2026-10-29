package K8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B {
    public static Object a(Object obj) {
        return obj;
    }

    public static final A b(Object obj) {
        if (obj == AbstractC0908a.f4156a) {
            throw new IllegalStateException("Does not contain segment");
        }
        kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (A) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC0908a.f4156a;
    }
}

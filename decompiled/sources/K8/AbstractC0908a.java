package K8;

/* JADX INFO: renamed from: K8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0908a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D f4156a = new D("CLOSED");

    public static final AbstractC0909b b(AbstractC0909b abstractC0909b) {
        while (true) {
            Object objG = abstractC0909b.g();
            if (objG == f4156a) {
                return abstractC0909b;
            }
            AbstractC0909b abstractC0909b2 = (AbstractC0909b) objG;
            if (abstractC0909b2 != null) {
                abstractC0909b = abstractC0909b2;
            } else if (abstractC0909b.m()) {
                return abstractC0909b;
            }
        }
    }

    public static final Object c(A a10, long j9, p219v8.p pVar) {
        while (true) {
            if (a10.f4140s >= j9 && !a10.k()) {
                return B.a(a10);
            }
            Object objG = a10.g();
            if (objG == f4156a) {
                return B.a(f4156a);
            }
            A a11 = (A) ((AbstractC0909b) objG);
            if (a11 == null) {
                a11 = (A) pVar.invoke(Long.valueOf(a10.f4140s + 1), a10);
                if (a10.o(a11)) {
                    if (a10.k()) {
                        a10.n();
                    }
                }
            }
            a10 = a11;
        }
    }
}

package F8;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: F8.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0846x0 extends m8.i.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f1901e = b.f1902q;

    /* JADX INFO: renamed from: F8.x0$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC0846x0 interfaceC0846x0, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC0846x0.f(cancellationException);
        }

        public static Object b(InterfaceC0846x0 interfaceC0846x0, Object obj, p219v8.p pVar) {
            return m8.i.b.a.a(interfaceC0846x0, obj, pVar);
        }

        public static m8.i.b c(InterfaceC0846x0 interfaceC0846x0, m8.i.c cVar) {
            return m8.i.b.a.b(interfaceC0846x0, cVar);
        }

        public static p129m8.i d(InterfaceC0846x0 interfaceC0846x0, m8.i.c cVar) {
            return m8.i.b.a.c(interfaceC0846x0, cVar);
        }

        public static p129m8.i e(InterfaceC0846x0 interfaceC0846x0, p129m8.i iVar) {
            return m8.i.b.a.d(interfaceC0846x0, iVar);
        }
    }

    /* JADX INFO: renamed from: F8.x0$b */
    public static final class b implements m8.i.c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final /* synthetic */ b f1902q = new b();

        private b() {
        }
    }

    D8.h B();

    InterfaceC0835s G(InterfaceC0839u interfaceC0839u);

    InterfaceC0807d0 I(boolean z9, boolean z10, p219v8.l lVar);

    CancellationException K();

    boolean O0();

    Object Q(p129m8.e eVar);

    boolean a();

    InterfaceC0807d0 c1(p219v8.l lVar);

    void f(CancellationException cancellationException);

    boolean isCancelled();

    boolean start();
}

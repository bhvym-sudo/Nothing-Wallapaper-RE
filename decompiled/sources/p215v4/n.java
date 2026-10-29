package p215v4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static Object a(k kVar) throws InterruptedException {
        AbstractC1202p.g();
        AbstractC1202p.j(kVar, "Task must not be null");
        if (kVar.k()) {
            return e(kVar);
        }
        q qVar = new q(null);
        f(kVar, qVar);
        qVar.c();
        return e(kVar);
    }

    public static k b() {
        I i10 = new I();
        i10.p();
        return i10;
    }

    public static k c(Exception exc) {
        I i10 = new I();
        i10.n(exc);
        return i10;
    }

    public static k d(Object obj) {
        I i10 = new I();
        i10.o(obj);
        return i10;
    }

    private static Object e(k kVar) throws ExecutionException {
        if (kVar.l()) {
            return kVar.i();
        }
        if (kVar.j()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(kVar.h());
    }

    private static void f(k kVar, r rVar) {
        Executor executor = m.f28508b;
        kVar.f(executor, rVar);
        kVar.d(executor, rVar);
        kVar.a(executor, rVar);
    }
}

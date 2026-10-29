package p036d5;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: d5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1302a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReferenceQueue f19571a = new ReferenceQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f19572b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: d5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0521a {
        void a();
    }

    private C1302a() {
    }

    public static C1302a a() {
        C1302a c1302a = new C1302a();
        c1302a.b(c1302a, new Runnable() { // from class: d5.o
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = c1302a.f19571a;
        final Set set = c1302a.f19572b;
        Thread thread = new Thread(new Runnable() { // from class: d5.p
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((r) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c1302a;
    }

    public InterfaceC0521a b(Object obj, Runnable runnable) {
        r rVar = new r(obj, this.f19571a, this.f19572b, runnable, null);
        this.f19572b.add(rVar);
        return rVar;
    }
}

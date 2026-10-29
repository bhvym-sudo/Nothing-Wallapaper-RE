package p036d5;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class r extends PhantomReference implements C1302a.InterfaceC0521a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f19625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f19626b;

    /* synthetic */ r(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, q qVar) {
        super(obj, referenceQueue);
        this.f19625a = set;
        this.f19626b = runnable;
    }

    @Override // p036d5.C1302a.InterfaceC0521a
    public final void a() {
        if (this.f19625a.remove(this)) {
            clear();
            this.f19626b.run();
        }
    }
}

package F8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public class A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1786b = AtomicIntegerFieldUpdater.newUpdater(A.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f1787a;

    public A(Throwable th, boolean z9) {
        this.f1787a = th;
        this._handled$volatile = z9 ? 1 : 0;
    }

    public final boolean a() {
        return f1786b.get(this) == 1;
    }

    public final boolean c() {
        return f1786b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return P.a(this) + '[' + this.f1787a + ']';
    }

    public /* synthetic */ A(Throwable th, boolean z9, int i10, AbstractC1457h abstractC1457h) {
        this(th, (i10 & 2) != 0 ? false : z9);
    }
}

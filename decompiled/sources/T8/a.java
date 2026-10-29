package T8;

import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f7727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f7728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f7729d;

    public a(String name, boolean z9) {
        n.h(name, "name");
        this.f7726a = name;
        this.f7727b = z9;
        this.f7729d = -1L;
    }

    public final boolean a() {
        return this.f7727b;
    }

    public final String b() {
        return this.f7726a;
    }

    public final long c() {
        return this.f7729d;
    }

    public final d d() {
        return this.f7728c;
    }

    public final void e(d queue) {
        n.h(queue, "queue");
        d dVar = this.f7728c;
        if (dVar == queue) {
            return;
        }
        if (dVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f7728c = queue;
    }

    public abstract long f();

    public final void g(long j9) {
        this.f7729d = j9;
    }

    public String toString() {
        return this.f7726a;
    }

    public /* synthetic */ a(String str, boolean z9, int i10, AbstractC1457h abstractC1457h) {
        this(str, (i10 & 2) != 0 ? true : z9);
    }
}

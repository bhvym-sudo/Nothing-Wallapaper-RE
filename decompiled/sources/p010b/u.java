package p010b;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.n;
import p219v8.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f14522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f14523b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f14524c;

    public u(boolean z9) {
        this.f14522a = z9;
    }

    public final void a(c cancellable) {
        n.h(cancellable, "cancellable");
        this.f14523b.add(cancellable);
    }

    public final a b() {
        return this.f14524c;
    }

    public void c() {
    }

    public abstract void d();

    public void e(b backEvent) {
        n.h(backEvent, "backEvent");
    }

    public void f(b backEvent) {
        n.h(backEvent, "backEvent");
    }

    public final boolean g() {
        return this.f14522a;
    }

    public final void h() {
        Iterator it = this.f14523b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).cancel();
        }
    }

    public final void i(c cancellable) {
        n.h(cancellable, "cancellable");
        this.f14523b.remove(cancellable);
    }

    public final void j(boolean z9) {
        this.f14522a = z9;
        a aVar = this.f14524c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void k(a aVar) {
        this.f14524c = aVar;
    }
}

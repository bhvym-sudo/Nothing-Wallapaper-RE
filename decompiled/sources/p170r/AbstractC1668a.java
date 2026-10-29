package p170r;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: r.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1668a implements InterfaceC1678f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f25426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f25427b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f25428c;

    public AbstractC1668a(Object obj) {
        this.f25426a = obj;
        this.f25428c = obj;
    }

    @Override // p170r.InterfaceC1678f
    public void c(Object obj) {
        this.f25427b.add(i());
        l(obj);
    }

    @Override // p170r.InterfaceC1678f
    public final void clear() {
        this.f25427b.clear();
        l(this.f25426a);
        k();
    }

    @Override // p170r.InterfaceC1678f
    public void f() {
        if (this.f25427b.isEmpty()) {
            AbstractC1701q0.b("empty stack");
        }
        List list = this.f25427b;
        l(list.remove(list.size() - 1));
    }

    public Object i() {
        return this.f25428c;
    }

    public final Object j() {
        return this.f25426a;
    }

    protected abstract void k();

    protected void l(Object obj) {
        this.f25428c = obj;
    }
}

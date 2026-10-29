package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class F extends H {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p120m.b f13283l = new p120m.b();

    @Override // androidx.lifecycle.C
    protected void j() {
        Iterator it = this.f13283l.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.o.a(((Map.Entry) it.next()).getValue());
            throw null;
        }
    }

    @Override // androidx.lifecycle.C
    protected void k() {
        Iterator it = this.f13283l.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.o.a(((Map.Entry) it.next()).getValue());
            throw null;
        }
    }
}

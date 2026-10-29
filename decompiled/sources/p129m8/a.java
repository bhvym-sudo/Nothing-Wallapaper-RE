package p129m8;

import kotlin.jvm.internal.n;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements i.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i.c f23245q;

    public a(i.c key) {
        n.h(key, "key");
        this.f23245q = key;
    }

    @Override // p129m8.i
    public Object U0(Object obj, p pVar) {
        return i.b.a.a(this, obj, pVar);
    }

    @Override // m8.i.b, p129m8.i
    public i.b b(i.c cVar) {
        return i.b.a.b(this, cVar);
    }

    @Override // m8.i.b
    public i.c getKey() {
        return this.f23245q;
    }

    @Override // p129m8.i
    public i t0(i.c cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // p129m8.i
    public i z(i iVar) {
        return i.b.a.d(this, iVar);
    }
}

package K8;

import F8.InterfaceC0807d0;
import F8.InterfaceC0822l;
import F8.S;
import F8.V;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends F8.I implements V {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final /* synthetic */ V f4194s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final F8.I f4195t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f4196u;

    /* JADX WARN: Multi-variable type inference failed */
    public v(F8.I i10, String str) {
        V v9 = i10 instanceof V ? (V) i10 : null;
        this.f4194s = v9 == null ? S.a() : v9;
        this.f4195t = i10;
        this.f4196u = str;
    }

    @Override // F8.V
    public void T0(long j9, InterfaceC0822l interfaceC0822l) {
        this.f4194s.T0(j9, interfaceC0822l);
    }

    @Override // F8.V
    public InterfaceC0807d0 W0(long j9, Runnable runnable, p129m8.i iVar) {
        return this.f4194s.W0(j9, runnable, iVar);
    }

    @Override // F8.I
    public void g1(p129m8.i iVar, Runnable runnable) {
        this.f4195t.g1(iVar, runnable);
    }

    @Override // F8.I
    public void h1(p129m8.i iVar, Runnable runnable) {
        this.f4195t.h1(iVar, runnable);
    }

    @Override // F8.I
    public boolean i1(p129m8.i iVar) {
        return this.f4195t.i1(iVar);
    }

    @Override // F8.I
    public String toString() {
        return this.f4196u;
    }
}

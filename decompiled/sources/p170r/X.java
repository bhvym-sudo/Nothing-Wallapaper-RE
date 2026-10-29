package p170r;

import F8.AbstractC0816i;
import F8.B0;
import F8.InterfaceC0846x0;
import F8.L;
import F8.M;
import p129m8.i;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class X implements F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f25410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f25411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0846x0 f25412c;

    public X(i iVar, p pVar) {
        this.f25410a = pVar;
        this.f25411b = M.a(iVar);
    }

    @Override // p170r.F0
    public void a() {
        InterfaceC0846x0 interfaceC0846x0 = this.f25412c;
        if (interfaceC0846x0 != null) {
            interfaceC0846x0.f(new Z());
        }
        this.f25412c = null;
    }

    @Override // p170r.F0
    public void b() {
        InterfaceC0846x0 interfaceC0846x0 = this.f25412c;
        if (interfaceC0846x0 != null) {
            interfaceC0846x0.f(new Z());
        }
        this.f25412c = null;
    }

    @Override // p170r.F0
    public void c() {
        InterfaceC0846x0 interfaceC0846x0 = this.f25412c;
        if (interfaceC0846x0 != null) {
            B0.e(interfaceC0846x0, "Old job was still running!", null, 2, null);
        }
        this.f25412c = AbstractC0816i.d(this.f25411b, null, null, this.f25410a, 3, null);
    }
}

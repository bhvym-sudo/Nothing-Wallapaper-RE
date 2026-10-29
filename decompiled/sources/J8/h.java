package J8;

import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends g {
    public /* synthetic */ h(InterfaceC0880f interfaceC0880f, p129m8.i iVar, int i10, H8.a aVar, int i11, AbstractC1457h abstractC1457h) {
        this(interfaceC0880f, (i11 & 2) != 0 ? p129m8.j.f23252q : iVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? H8.a.SUSPEND : aVar);
    }

    @Override // J8.e
    protected e k(p129m8.i iVar, int i10, H8.a aVar) {
        return new h(this.f3899t, iVar, i10, aVar);
    }

    @Override // J8.e
    public InterfaceC0880f m() {
        return this.f3899t;
    }

    @Override // J8.g
    protected Object t(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
        Object objA = this.f3899t.a(interfaceC0881g, eVar);
        return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
    }

    public h(InterfaceC0880f interfaceC0880f, p129m8.i iVar, int i10, H8.a aVar) {
        super(interfaceC0880f, iVar, i10, aVar);
    }
}

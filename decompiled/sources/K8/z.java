package K8;

import F8.AbstractC0800a;

/* JADX INFO: loaded from: classes2.dex */
public class z extends AbstractC0800a implements kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p129m8.e f4198t;

    public z(p129m8.i iVar, p129m8.e eVar) {
        super(iVar, true, true);
        this.f4198t = eVar;
    }

    @Override // F8.AbstractC0800a
    protected void S0(Object obj) {
        p129m8.e eVar = this.f4198t;
        eVar.resumeWith(F8.C.a(obj, eVar));
    }

    public void Y0() {
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        p129m8.e eVar = this.f4198t;
        if (eVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) eVar;
        }
        return null;
    }

    @Override // F8.D0
    protected final boolean j0() {
        return true;
    }

    @Override // F8.D0
    protected void y(Object obj) {
        AbstractC0916i.b(p139n8.b.c(this.f4198t), F8.C.a(obj, this.f4198t));
    }
}

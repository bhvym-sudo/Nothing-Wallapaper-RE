package kotlin.coroutines.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends a {
    public j(p129m8.e eVar) {
        super(eVar);
        if (eVar != null && eVar.getContext() != p129m8.j.f23252q) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p129m8.e
    public p129m8.i getContext() {
        return p129m8.j.f23252q;
    }
}

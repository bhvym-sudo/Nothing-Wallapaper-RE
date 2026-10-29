package J8;

/* JADX INFO: loaded from: classes2.dex */
final class A implements p129m8.e, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p129m8.e f3875q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p129m8.i f3876r;

    public A(p129m8.e eVar, p129m8.i iVar) {
        this.f3875q = eVar;
        this.f3876r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        p129m8.e eVar = this.f3875q;
        if (eVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) eVar;
        }
        return null;
    }

    @Override // p129m8.e
    public p129m8.i getContext() {
        return this.f3876r;
    }

    @Override // p129m8.e
    public void resumeWith(Object obj) {
        this.f3875q.resumeWith(obj);
    }
}

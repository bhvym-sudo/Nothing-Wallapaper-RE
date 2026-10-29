package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x extends z implements C8.j {
    public x(Class cls, String str, String str2, int i10) {
        super(AbstractC1453d.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // C8.j
    public C8.j.a c() {
        ((C8.j) getReflected()).c();
        return null;
    }

    @Override // kotlin.jvm.internal.AbstractC1453d
    protected C8.b computeReflected() {
        return F.g(this);
    }

    @Override // p219v8.p
    public Object invoke(Object obj, Object obj2) {
        return p(obj, obj2);
    }
}

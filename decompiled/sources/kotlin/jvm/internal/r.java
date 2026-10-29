package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r extends t implements C8.g {
    public r(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // C8.i
    public C8.i.a c() {
        ((C8.g) getReflected()).c();
        return null;
    }

    @Override // kotlin.jvm.internal.AbstractC1453d
    protected C8.b computeReflected() {
        return F.e(this);
    }

    @Override // p219v8.l
    public Object f(Object obj) {
        return get(obj);
    }
}

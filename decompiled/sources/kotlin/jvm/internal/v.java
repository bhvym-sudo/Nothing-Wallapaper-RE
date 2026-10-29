package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v extends z implements C8.h {
    public v(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC1453d
    protected C8.b computeReflected() {
        return F.f(this);
    }

    @Override // p219v8.a
    public Object invoke() {
        return get();
    }
}

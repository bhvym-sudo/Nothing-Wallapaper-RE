package p170r;

/* JADX INFO: renamed from: r.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1679f0 extends b1, InterfaceC1683h0 {
    void d(float f10);

    float e();

    default void g(float f10) {
        d(f10);
    }

    @Override // p170r.InterfaceC1683h0
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        g(((Number) obj).floatValue());
    }

    @Override // p170r.b1
    default Float getValue() {
        return Float.valueOf(e());
    }
}

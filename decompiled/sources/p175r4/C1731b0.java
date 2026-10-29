package p175r4;

/* JADX INFO: renamed from: r4.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1731b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC1775f0 f26434b = EnumC1775f0.DEFAULT;

    public final C1731b0 a(int i10) {
        this.f26433a = i10;
        return this;
    }

    public final InterfaceC1786g0 b() {
        return new C1720a0(this.f26433a, this.f26434b);
    }
}

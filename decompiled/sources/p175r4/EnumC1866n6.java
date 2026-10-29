package p175r4;

/* JADX INFO: renamed from: r4.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1866n6 implements InterfaceC1764e0 {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f26868q;

    EnumC1866n6(int i10) {
        this.f26868q = i10;
    }

    @Override // p175r4.InterfaceC1764e0
    public final int zza() {
        return this.f26868q;
    }
}

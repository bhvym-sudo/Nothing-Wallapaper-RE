package p165q4;

/* JADX INFO: renamed from: q4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1519f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC1540i f24523b = EnumC1540i.DEFAULT;

    public final C1519f a(int i10) {
        this.f24522a = i10;
        return this;
    }

    public final InterfaceC1547j b() {
        return new C1512e(this.f24522a, this.f24523b);
    }
}

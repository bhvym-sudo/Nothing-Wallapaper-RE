package p175r4;

/* JADX INFO: renamed from: r4.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1737b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f26449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EnumC1886p6 f26450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f26451c;

    public final C1737b6 a(Long l9) {
        this.f26449a = Long.valueOf(l9.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1737b6 b(EnumC1886p6 enumC1886p6) {
        this.f26450b = enumC1886p6;
        return this;
    }

    public final C1737b6 c(Boolean bool) {
        this.f26451c = bool;
        return this;
    }

    public final C1759d6 d() {
        return new C1759d6(this, null);
    }
}

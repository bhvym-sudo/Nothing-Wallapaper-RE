package p175r4;

/* JADX INFO: loaded from: classes.dex */
public final class V7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EnumC1886p6 f26306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f26307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1907r8 f26308c;

    public final V7 b(Long l9) {
        this.f26307b = Long.valueOf(l9.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final V7 c(EnumC1886p6 enumC1886p6) {
        this.f26306a = enumC1886p6;
        return this;
    }

    public final V7 d(C1907r8 c1907r8) {
        this.f26308c = c1907r8;
        return this;
    }

    public final X7 e() {
        return new X7(this, null);
    }
}

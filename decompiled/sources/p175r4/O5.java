package p175r4;

/* JADX INFO: loaded from: classes.dex */
public final class O5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f26121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f26122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f26123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f26124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f26125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Long f26126f;

    public final O5 a(Long l9) {
        this.f26123c = Long.valueOf(l9.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final O5 b(Long l9) {
        this.f26124d = Long.valueOf(l9.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final O5 c(Long l9) {
        this.f26121a = Long.valueOf(l9.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final O5 d(Long l9) {
        this.f26125e = Long.valueOf(l9.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final O5 e(Long l9) {
        this.f26122b = Long.valueOf(l9.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final O5 f(Long l9) {
        this.f26126f = Long.valueOf(l9.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final Q5 g() {
        return new Q5(this, null);
    }
}

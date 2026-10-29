package p155p4;

/* JADX INFO: loaded from: classes.dex */
final class E extends I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f23696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f23699d;

    E() {
    }

    @Override // p155p4.I
    public final I a(boolean z9) {
        this.f23697b = true;
        this.f23699d = (byte) (1 | this.f23699d);
        return this;
    }

    @Override // p155p4.I
    public final I b(int i10) {
        this.f23698c = 1;
        this.f23699d = (byte) (this.f23699d | 2);
        return this;
    }

    @Override // p155p4.I
    public final J c() {
        String str;
        if (this.f23699d == 3 && (str = this.f23696a) != null) {
            return new G(str, this.f23697b, this.f23698c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f23696a == null) {
            sb.append(" libraryName");
        }
        if ((this.f23699d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f23699d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final I d(String str) {
        this.f23696a = "common";
        return this;
    }
}

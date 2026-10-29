package p175r4;

/* JADX INFO: loaded from: classes.dex */
final class Q8 extends W8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f26186d;

    Q8() {
    }

    @Override // p175r4.W8
    public final W8 a(boolean z9) {
        this.f26184b = true;
        this.f26186d = (byte) (1 | this.f26186d);
        return this;
    }

    @Override // p175r4.W8
    public final W8 b(int i10) {
        this.f26185c = 1;
        this.f26186d = (byte) (this.f26186d | 2);
        return this;
    }

    @Override // p175r4.W8
    public final X8 c() {
        String str;
        if (this.f26186d == 3 && (str = this.f26183a) != null) {
            return new S8(str, this.f26184b, this.f26185c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f26183a == null) {
            sb.append(" libraryName");
        }
        if ((this.f26186d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f26186d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final W8 d(String str) {
        this.f26183a = "subject-segmentation";
        return this;
    }
}

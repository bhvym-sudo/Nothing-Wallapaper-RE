package p165q4;

/* JADX INFO: renamed from: q4.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1567l5 extends AbstractC1608r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f24649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f24652d;

    C1567l5() {
    }

    @Override // p165q4.AbstractC1608r5
    public final AbstractC1608r5 a(boolean z9) {
        this.f24650b = true;
        this.f24652d = (byte) (1 | this.f24652d);
        return this;
    }

    @Override // p165q4.AbstractC1608r5
    public final AbstractC1608r5 b(int i10) {
        this.f24651c = 1;
        this.f24652d = (byte) (this.f24652d | 2);
        return this;
    }

    @Override // p165q4.AbstractC1608r5
    public final AbstractC1615s5 c() {
        String str;
        if (this.f24652d == 3 && (str = this.f24649a) != null) {
            return new C1588o5(str, this.f24650b, this.f24651c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f24649a == null) {
            sb.append(" libraryName");
        }
        if ((this.f24652d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f24652d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final AbstractC1608r5 d(String str) {
        this.f24649a = "vision-common";
        return this;
    }
}

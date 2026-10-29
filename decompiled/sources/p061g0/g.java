package p061g0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20937b;

    public g(int i10, int i11) {
        this.f20936a = i10;
        this.f20937b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f20936a == gVar.f20936a && this.f20937b == gVar.f20937b;
    }

    public int hashCode() {
        return (this.f20936a * 31) + this.f20937b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f20936a + ", lengthAfterCursor=" + this.f20937b + ')';
    }
}

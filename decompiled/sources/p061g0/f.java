package p061g0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20935b;

    public f(int i10, int i11) {
        this.f20934a = i10;
        this.f20935b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f20934a == fVar.f20934a && this.f20935b == fVar.f20935b;
    }

    public int hashCode() {
        return (this.f20934a * 31) + this.f20935b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f20934a + ", lengthAfterCursor=" + this.f20935b + ')';
    }
}

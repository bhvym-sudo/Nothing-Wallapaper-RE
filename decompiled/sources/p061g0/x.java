package p061g0;

/* JADX INFO: loaded from: classes.dex */
public final class x implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20991b;

    public x(int i10, int i11) {
        this.f20990a = i10;
        this.f20991b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f20990a == xVar.f20990a && this.f20991b == xVar.f20991b;
    }

    public int hashCode() {
        return (this.f20990a * 31) + this.f20991b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f20990a + ", end=" + this.f20991b + ')';
    }
}

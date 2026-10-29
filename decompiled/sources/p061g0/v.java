package p061g0;

/* JADX INFO: loaded from: classes.dex */
public final class v implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20987b;

    public v(int i10, int i11) {
        this.f20986a = i10;
        this.f20987b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f20986a == vVar.f20986a && this.f20987b == vVar.f20987b;
    }

    public int hashCode() {
        return (this.f20986a * 31) + this.f20987b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f20986a + ", end=" + this.f20987b + ')';
    }
}

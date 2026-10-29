package Q;

/* JADX INFO: renamed from: Q.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0942a implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6494b;

    public C0942a(int i10) {
        this.f6494b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.n.d(C0942a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f6494b == ((C0942a) obj).f6494b;
    }

    public int hashCode() {
        return this.f6494b;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f6494b + ')';
    }
}

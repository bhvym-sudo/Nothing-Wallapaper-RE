package Q;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6587a;

    private /* synthetic */ z(int i10) {
        this.f6587a = i10;
    }

    public static final /* synthetic */ z a(int i10) {
        return new z(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof z) && i10 == ((z) obj).f();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return "PointerKeyboardModifiers(packedValue=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f6587a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f6587a;
    }

    public int hashCode() {
        return d(this.f6587a);
    }

    public String toString() {
        return e(this.f6587a);
    }
}

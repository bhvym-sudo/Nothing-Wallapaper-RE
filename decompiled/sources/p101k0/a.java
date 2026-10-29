package p101k0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0567a f22618b = new C0567a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f22619c = b(0.5f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f22620d = b(-0.5f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f22621e = b(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f22622a;

    /* JADX INFO: renamed from: k0.a$a, reason: collision with other inner class name */
    public static final class C0567a {
        public /* synthetic */ C0567a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0567a() {
        }
    }

    private /* synthetic */ a(float f10) {
        this.f22622a = f10;
    }

    public static final /* synthetic */ a a(float f10) {
        return new a(f10);
    }

    public static float b(float f10) {
        return f10;
    }

    public static boolean c(float f10, Object obj) {
        return (obj instanceof a) && Float.compare(f10, ((a) obj).f()) == 0;
    }

    public static int d(float f10) {
        return Float.hashCode(f10);
    }

    public static String e(float f10) {
        return "BaselineShift(multiplier=" + f10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f22622a, obj);
    }

    public final /* synthetic */ float f() {
        return this.f22622a;
    }

    public int hashCode() {
        return d(this.f22622a);
    }

    public String toString() {
        return e(this.f22622a);
    }
}

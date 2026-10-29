package p179r8;

import p259z8.c;

/* JADX INFO: loaded from: classes2.dex */
public class a extends p169q8.a {

    /* JADX INFO: renamed from: r8.a$a, reason: collision with other inner class name */
    private static final class C0664a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0664a f27573a = new C0664a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f27574b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f27574b = num2;
        }

        private C0664a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0664a.f27574b;
        return num == null || num.intValue() >= i10;
    }

    @Override // p159p8.a
    public c b() {
        return c(34) ? new A8.a() : super.b();
    }
}

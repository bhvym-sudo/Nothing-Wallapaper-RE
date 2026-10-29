package p169q8;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends p159p8.a {

    /* JADX INFO: renamed from: q8.a$a, reason: collision with other inner class name */
    private static final class C0646a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0646a f25192a = new C0646a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f25193b;

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
            f25193b = num2;
        }

        private C0646a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0646a.f25193b;
        return num == null || num.intValue() >= i10;
    }

    @Override // p159p8.a
    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        n.h(cause, "cause");
        n.h(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}

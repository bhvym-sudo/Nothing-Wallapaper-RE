package L;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4262a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f4263b;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final boolean a() {
            return f.f4263b;
        }

        private a() {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        n.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f4263b = n.d(lowerCase, "robolectric");
    }
}

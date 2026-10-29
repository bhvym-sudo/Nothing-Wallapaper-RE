package O5;

import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0192a f5888a = new C0192a(null);

    /* JADX INFO: renamed from: O5.a$a, reason: collision with other inner class name */
    public static final class C0192a {
        public /* synthetic */ C0192a(AbstractC1457h abstractC1457h) {
            this();
        }

        private final int b(String str, String str2) {
            return Resources.getSystem().getIdentifier(str2, str, "android");
        }

        public final int a(String name) {
            n.h(name, "name");
            return b("drawable", name);
        }

        public final int c(String name) {
            n.h(name, "name");
            return b(TypedValues.Custom.S_STRING, name);
        }

        private C0192a() {
        }
    }
}

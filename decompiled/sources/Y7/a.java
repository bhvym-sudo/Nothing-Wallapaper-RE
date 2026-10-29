package Y7;

import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0342a f9377a = new C0342a(null);

    /* JADX INFO: renamed from: Y7.a$a, reason: collision with other inner class name */
    public static final class C0342a {
        public /* synthetic */ C0342a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a(float f10) {
            return (int) TypedValue.applyDimension(1, f10, Resources.getSystem().getDisplayMetrics());
        }

        private C0342a() {
        }
    }
}

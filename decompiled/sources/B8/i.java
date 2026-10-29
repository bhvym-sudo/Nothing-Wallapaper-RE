package B8;

import kotlin.jvm.internal.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i {
    public static final void a(boolean z9, Number step) {
        n.h(step, "step");
        if (z9) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    public static b b(float f10, float f11) {
        return new a(f10, f11);
    }

    public static c c(Comparable comparable, Comparable that) {
        n.h(comparable, "<this>");
        n.h(that, "that");
        return new d(comparable, that);
    }
}

package p089i8;

import java.util.Set;
import kotlin.jvm.internal.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class W extends V {
    public static Set d() {
        return H.f22252q;
    }

    public static final Set e(Set set) {
        n.h(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : V.c(set.iterator().next());
        }
        return d();
    }

    public static Set f(Object... elements) {
        n.h(elements, "elements");
        return AbstractC1443q.a0(elements);
    }
}

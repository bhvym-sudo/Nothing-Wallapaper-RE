package p089i8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y extends AbstractC1449x {
    public static void x(List list) {
        n.h(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void y(List list, Comparator comparator) {
        n.h(list, "<this>");
        n.h(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

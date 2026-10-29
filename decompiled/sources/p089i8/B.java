package p089i8;

import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class B extends A {
    public static SortedSet I(Iterable iterable) {
        n.h(iterable, "<this>");
        return (SortedSet) D.p0(iterable, new TreeSet());
    }
}

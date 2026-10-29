package p109k8;

import java.util.Comparator;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
final class f implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f22765a = new f();

    private f() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a10, Comparable b10) {
        n.h(a10, "a");
        n.h(b10, "b");
        return a10.compareTo(b10);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return g.f22766a;
    }
}

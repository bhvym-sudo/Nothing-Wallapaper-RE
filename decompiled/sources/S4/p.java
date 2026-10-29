package S4;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class p extends q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f7333q;

    public p(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f7333q = list;
    }
}

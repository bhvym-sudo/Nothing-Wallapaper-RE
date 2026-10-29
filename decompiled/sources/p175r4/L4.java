package p175r4;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class L4 extends G9 implements C {
    protected L4(Map map) {
        super(map);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection, java.util.List] */
    @Override // p175r4.C
    public final List c(Object obj) {
        return super.j(obj);
    }

    @Override // p175r4.G9
    final Collection h(Object obj, Collection collection) {
        return k(obj, (List) collection, null);
    }
}

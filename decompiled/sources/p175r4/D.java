package p175r4;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class D extends V {
    D(Iterator it) {
        super(it);
    }

    @Override // p175r4.V
    final /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }
}

package C6;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final e a(String id) {
        n.h(id, "id");
        e.b bVar = e.b.f642c;
        if (n.d(id, bVar.a())) {
            return bVar;
        }
        e.a aVar = e.a.f641c;
        if (n.d(id, aVar.a())) {
            return aVar;
        }
        throw new IllegalArgumentException("invalid effect id " + id);
    }
}

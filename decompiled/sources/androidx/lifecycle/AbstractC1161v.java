package androidx.lifecycle;

import F8.C0803b0;
import F8.T0;

/* JADX INFO: renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1161v {
    public static final r a(AbstractC1157q abstractC1157q) {
        C1158s c1158s;
        kotlin.jvm.internal.n.h(abstractC1157q, "<this>");
        do {
            C1158s c1158s2 = (C1158s) abstractC1157q.c().get();
            if (c1158s2 != null) {
                return c1158s2;
            }
            c1158s = new C1158s(abstractC1157q, T0.b(null, 1, null).z(C0803b0.c().l1()));
        } while (!abstractC1157q.c().compareAndSet(null, c1158s));
        c1158s.c();
        return c1158s;
    }
}

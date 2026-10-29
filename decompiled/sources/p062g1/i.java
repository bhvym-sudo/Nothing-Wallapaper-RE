package p062g1;

import kotlin.jvm.internal.n;
import p142o1.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q database) {
        super(database);
        n.h(database, "database");
    }

    protected abstract void i(k kVar, Object obj);

    public final void j(Object obj) {
        k kVarB = b();
        try {
            i(kVarB, obj);
            kVarB.a1();
        } finally {
            h(kVarB);
        }
    }
}

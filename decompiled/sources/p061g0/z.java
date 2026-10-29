package p061g0;

import p031d0.a;
import p031d0.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static final a a(y yVar) {
        return yVar.a().l(yVar.c());
    }

    public static final a b(y yVar, int i10) {
        return yVar.a().subSequence(n.h(yVar.c()), Math.min(n.h(yVar.c()) + i10, yVar.d().length()));
    }

    public static final a c(y yVar, int i10) {
        return yVar.a().subSequence(Math.max(0, n.i(yVar.c()) - i10), n.i(yVar.c()));
    }
}

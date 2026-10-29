package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.F;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l extends d implements kotlin.jvm.internal.j {
    private final int arity;

    public l(int i10, p129m8.e eVar) {
        super(eVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.j
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strH = F.h(this);
        n.g(strH, "renderLambdaToString(...)");
        return strH;
    }
}

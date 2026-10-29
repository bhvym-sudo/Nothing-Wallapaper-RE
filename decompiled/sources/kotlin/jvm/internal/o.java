package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o implements j, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f22801q;

    public o(int i10) {
        this.f22801q = i10;
    }

    @Override // kotlin.jvm.internal.j
    public int getArity() {
        return this.f22801q;
    }

    public String toString() {
        String strI = F.i(this);
        n.g(strI, "renderLambdaToString(...)");
        return strI;
    }
}

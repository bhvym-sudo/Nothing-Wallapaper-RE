package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.F;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends j implements kotlin.jvm.internal.j {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f22774q;

    public k(int i10, p129m8.e eVar) {
        super(eVar);
        this.f22774q = i10;
    }

    @Override // kotlin.jvm.internal.j
    public int getArity() {
        return this.f22774q;
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

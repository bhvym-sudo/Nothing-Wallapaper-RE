package p011b0;

import p079h8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.o implements p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o f14670r = new o();

    public o() {
        super(2);
    }

    @Override // p219v8.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a invoke(a aVar, a aVar2) {
        String strB;
        e eVarA;
        if (aVar == null || (strB = aVar.b()) == null) {
            strB = aVar2.b();
        }
        if (aVar == null || (eVarA = aVar.a()) == null) {
            eVarA = aVar2.a();
        }
        return new a(strB, eVarA);
    }
}

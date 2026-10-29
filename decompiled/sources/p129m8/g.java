package p129m8;

import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.q;
import p139n8.b;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static final void a(p pVar, Object obj, e completion) {
        n.h(pVar, "<this>");
        n.h(completion, "completion");
        e eVarC = b.c(b.a(pVar, obj, completion));
        q.a aVar = q.f21862r;
        eVarC.resumeWith(q.b(A.f21846a));
    }
}

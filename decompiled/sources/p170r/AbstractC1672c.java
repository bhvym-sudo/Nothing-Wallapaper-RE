package p170r;

import kotlin.jvm.internal.I;
import kotlin.jvm.internal.n;
import p219v8.p;

/* JADX INFO: renamed from: r.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1672c {
    public static final long a() {
        return Thread.currentThread().getId();
    }

    public static final String b() {
        return Thread.currentThread().getName();
    }

    public static final int c(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void d(InterfaceC1690l interfaceC1690l, p pVar) {
        n.f(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((p) I.d(pVar, 2)).invoke(interfaceC1690l, 1);
    }
}

package p079h8;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {
    public static final Object a(Throwable exception) {
        n.h(exception, "exception");
        return new q.b(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof q.b) {
            throw ((q.b) obj).f21864q;
        }
    }
}

package p150p;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void a(String message) {
        n.h(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void b(String message) {
        n.h(message, "message");
        throw new IllegalStateException(message);
    }
}

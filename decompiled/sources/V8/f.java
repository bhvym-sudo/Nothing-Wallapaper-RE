package V8;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f8237a = new f();

    private f() {
    }

    public static final boolean a(String method) {
        n.h(method, "method");
        return (n.d(method, "GET") || n.d(method, "HEAD")) ? false : true;
    }

    public static final boolean d(String method) {
        n.h(method, "method");
        return n.d(method, "POST") || n.d(method, "PUT") || n.d(method, "PATCH") || n.d(method, "PROPPATCH") || n.d(method, "REPORT");
    }

    public final boolean b(String method) {
        n.h(method, "method");
        return !n.d(method, "PROPFIND");
    }

    public final boolean c(String method) {
        n.h(method, "method");
        return n.d(method, "PROPFIND");
    }
}

package P8;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f6349a = new o();

    private o() {
    }

    public static final String a(String username, String password, Charset charset) {
        kotlin.jvm.internal.n.h(username, "username");
        kotlin.jvm.internal.n.h(password, "password");
        kotlin.jvm.internal.n.h(charset, "charset");
        return "Basic " + e9.h.f20267t.b(username + ':' + password, charset).d();
    }
}

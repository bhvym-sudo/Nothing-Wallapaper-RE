package K2;

import kotlin.jvm.internal.n;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f4080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4081b;

    public e(f buffer, String tag) {
        n.h(buffer, "buffer");
        n.h(tag, "tag");
        this.f4080a = buffer;
        this.f4081b = tag;
    }

    public static /* synthetic */ void c(e eVar, String str, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
        }
        if ((i10 & 2) != 0) {
            th = null;
        }
        eVar.b(str, th);
    }

    public static /* synthetic */ void h(e eVar, String str, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
        }
        if ((i10 & 2) != 0) {
            th = null;
        }
        eVar.g(str, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(b log) {
        n.h(log, "$this$log");
        String strO = log.o();
        n.e(strO);
        return strO;
    }

    public static /* synthetic */ void l(e eVar, String str, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: v");
        }
        if ((i10 & 2) != 0) {
            th = null;
        }
        eVar.k(str, th);
    }

    public final void b(String message, Throwable th) {
        n.h(message, "message");
        i(a.DEBUG, message, th);
    }

    public final void d(String message, Throwable th) {
        n.h(message, "message");
        i(a.ERROR, message, th);
    }

    public final f e() {
        return this.f4080a;
    }

    public final String f() {
        return this.f4081b;
    }

    public final void g(String message, Throwable th) {
        n.h(message, "message");
        i(a.INFO, message, th);
    }

    public final void i(a level, String message, Throwable th) {
        n.h(level, "level");
        n.h(message, "message");
        b bVarA = e().a(f(), level, new l() { // from class: K2.d
            @Override // p219v8.l
            public final Object f(Object obj) {
                return e.j((b) obj);
            }
        }, th);
        bVarA.k(message);
        e().b(bVarA);
    }

    public final void k(String message, Throwable th) {
        n.h(message, "message");
        i(a.VERBOSE, message, th);
    }
}

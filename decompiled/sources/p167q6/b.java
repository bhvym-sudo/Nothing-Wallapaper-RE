package p167q6;

import com.nothing.wallpaper.common.log.FileLog;
import com.nothing.wallpaper.common.log.c;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.n;
import p219v8.a;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f25096b;

    public b(String tag) {
        n.h(tag, "tag");
        this.f25095a = tag;
    }

    public final void a(String msg) {
        n.h(msg, "msg");
        if (this.f25096b) {
            c.d(this.f25095a, "Thread_" + Thread.currentThread().getName() + "_" + Thread.currentThread().getId() + ":" + msg);
        }
    }

    public final void b(a lazyMsg) {
        n.h(lazyMsg, "lazyMsg");
        if (this.f25096b) {
            c.d(this.f25095a, "Thread_" + Thread.currentThread().getName() + "_" + Thread.currentThread().getId() + ":" + lazyMsg.invoke());
        }
    }

    public final void c(String msg) {
        n.h(msg, "msg");
        FileLog.d(this.f25095a, "Thread_" + Thread.currentThread().getName() + "_" + Thread.currentThread().getId() + ":" + msg);
    }

    public final void d(String msg) {
        n.h(msg, "msg");
        c.d(this.f25095a, "Thread_" + Thread.currentThread().getName() + "_" + Thread.currentThread().getId() + ":" + msg);
    }

    public final void e(String msg) {
        n.h(msg, "msg");
        c.f(this.f25095a, msg);
    }

    public final void f(String msg) {
        n.h(msg, "msg");
        c.k(this.f25095a, msg);
    }

    public final void g(String msg) {
        n.h(msg, "msg");
        FileLog.i(this.f25095a, "Thread_" + Thread.currentThread().getName() + "_" + Thread.currentThread().getId() + ":" + msg);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Object caller) {
        n.h(caller, "caller");
        String strB = F.b(caller.getClass()).b();
        this(strB == null ? "EMPTY" : strB);
    }
}

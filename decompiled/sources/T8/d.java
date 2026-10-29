package T8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.n;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f7731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f7734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f7735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7736f;

    public d(e taskRunner, String name) {
        n.h(taskRunner, "taskRunner");
        n.h(name, "name");
        this.f7731a = taskRunner;
        this.f7732b = name;
        this.f7735e = new ArrayList();
    }

    public static /* synthetic */ void j(d dVar, a aVar, long j9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j9 = 0;
        }
        dVar.i(aVar, j9);
    }

    public final void a() {
        if (Q8.d.f6932h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f7731a) {
            try {
                if (b()) {
                    this.f7731a.h(this);
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        a aVar = this.f7734d;
        if (aVar != null) {
            n.e(aVar);
            if (aVar.a()) {
                this.f7736f = true;
            }
        }
        boolean z9 = false;
        for (int size = this.f7735e.size() - 1; -1 < size; size--) {
            if (((a) this.f7735e.get(size)).a()) {
                a aVar2 = (a) this.f7735e.get(size);
                if (e.f7737h.a().isLoggable(Level.FINE)) {
                    b.c(aVar2, this, "canceled");
                }
                this.f7735e.remove(size);
                z9 = true;
            }
        }
        return z9;
    }

    public final a c() {
        return this.f7734d;
    }

    public final boolean d() {
        return this.f7736f;
    }

    public final List e() {
        return this.f7735e;
    }

    public final String f() {
        return this.f7732b;
    }

    public final boolean g() {
        return this.f7733c;
    }

    public final e h() {
        return this.f7731a;
    }

    public final void i(a task, long j9) {
        n.h(task, "task");
        synchronized (this.f7731a) {
            if (!this.f7733c) {
                if (k(task, j9, false)) {
                    this.f7731a.h(this);
                }
                A a10 = A.f21846a;
            } else if (task.a()) {
                if (e.f7737h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.f7737h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(a task, long j9, boolean z9) {
        String str;
        n.h(task, "task");
        task.e(this);
        long jC = this.f7731a.g().c();
        long j10 = jC + j9;
        int iIndexOf = this.f7735e.indexOf(task);
        if (iIndexOf != -1) {
            if (task.c() <= j10) {
                if (e.f7737h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "already scheduled");
                }
                return false;
            }
            this.f7735e.remove(iIndexOf);
        }
        task.g(j10);
        if (e.f7737h.a().isLoggable(Level.FINE)) {
            if (z9) {
                str = "run again after " + b.b(j10 - jC);
            } else {
                str = "scheduled after " + b.b(j10 - jC);
            }
            b.c(task, this, str);
        }
        Iterator it = this.f7735e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((a) it.next()).c() - jC > j9) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f7735e.size();
        }
        this.f7735e.add(size, task);
        return size == 0;
    }

    public final void l(a aVar) {
        this.f7734d = aVar;
    }

    public final void m(boolean z9) {
        this.f7736f = z9;
    }

    public final void n() {
        if (Q8.d.f6932h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f7731a) {
            try {
                this.f7733c = true;
                if (b()) {
                    this.f7731a.h(this);
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.f7732b;
    }
}

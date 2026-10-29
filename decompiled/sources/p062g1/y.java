package p062g1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.n;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Executor {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Executor f21146q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayDeque f21147r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f21148s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f21149t;

    public y(Executor executor) {
        n.h(executor, "executor");
        this.f21146q = executor;
        this.f21147r = new ArrayDeque();
        this.f21149t = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable command, y this$0) {
        n.h(command, "$command");
        n.h(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.c();
        }
    }

    public final void c() {
        synchronized (this.f21149t) {
            try {
                Object objPoll = this.f21147r.poll();
                Runnable runnable = (Runnable) objPoll;
                this.f21148s = runnable;
                if (objPoll != null) {
                    this.f21146q.execute(runnable);
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        n.h(command, "command");
        synchronized (this.f21149t) {
            try {
                this.f21147r.offer(new Runnable() { // from class: g1.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.b(command, this);
                    }
                });
                if (this.f21148s == null) {
                    c();
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

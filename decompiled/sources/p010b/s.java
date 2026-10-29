package p010b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.n;
import p079h8.A;
import p219v8.a;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f14514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f14515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f14516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f14519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f14520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f14521h;

    public s(Executor executor, a reportFullyDrawn) {
        n.h(executor, "executor");
        n.h(reportFullyDrawn, "reportFullyDrawn");
        this.f14514a = executor;
        this.f14515b = reportFullyDrawn;
        this.f14516c = new Object();
        this.f14520g = new ArrayList();
        this.f14521h = new Runnable() { // from class: b.r
            @Override // java.lang.Runnable
            public final void run() {
                s.d(this.f14513q);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(s sVar) {
        synchronized (sVar.f14516c) {
            try {
                sVar.f14518e = false;
                if (sVar.f14517d == 0 && !sVar.f14519f) {
                    sVar.f14515b.invoke();
                    sVar.b();
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f14516c) {
            try {
                this.f14519f = true;
                Iterator it = this.f14520g.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).invoke();
                }
                this.f14520g.clear();
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z9;
        synchronized (this.f14516c) {
            z9 = this.f14519f;
        }
        return z9;
    }
}

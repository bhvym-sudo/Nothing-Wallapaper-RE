package p082i1;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1157q;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f21903d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f21904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f21905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21906c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final e a(f owner) {
            n.h(owner, "owner");
            return new e(owner, null);
        }

        private a() {
        }
    }

    public /* synthetic */ e(f fVar, AbstractC1457h abstractC1457h) {
        this(fVar);
    }

    public static final e a(f fVar) {
        return f21903d.a(fVar);
    }

    public final d b() {
        return this.f21905b;
    }

    public final void c() {
        AbstractC1157q lifecycle = this.f21904a.getLifecycle();
        if (lifecycle.b() != AbstractC1157q.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new b(this.f21904a));
        this.f21905b.e(lifecycle);
        this.f21906c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f21906c) {
            c();
        }
        AbstractC1157q lifecycle = this.f21904a.getLifecycle();
        if (!lifecycle.b().e(AbstractC1157q.b.STARTED)) {
            this.f21905b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle outBundle) {
        n.h(outBundle, "outBundle");
        this.f21905b.g(outBundle);
    }

    private e(f fVar) {
        this.f21904a = fVar;
        this.f21905b = new d();
    }
}

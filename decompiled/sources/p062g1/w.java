package p062g1;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p079h8.h;
import p079h8.i;
import p142o1.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f21140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f21141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f21142c;

    static final class a extends o implements p219v8.a {
        a() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return w.this.d();
        }
    }

    public w(q database) {
        n.h(database, "database");
        this.f21140a = database;
        this.f21141b = new AtomicBoolean(false);
        this.f21142c = i.b(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k d() {
        return this.f21140a.f(e());
    }

    private final k f() {
        return (k) this.f21142c.getValue();
    }

    private final k g(boolean z9) {
        return z9 ? f() : d();
    }

    public k b() {
        c();
        return g(this.f21141b.compareAndSet(false, true));
    }

    protected void c() {
        this.f21140a.c();
    }

    protected abstract String e();

    public void h(k statement) {
        n.h(statement, "statement");
        if (statement == f()) {
            this.f21141b.set(false);
        }
    }
}

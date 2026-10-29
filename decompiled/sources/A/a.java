package A;

import java.util.List;
import p079h8.A;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class a extends A.c {

    /* JADX INFO: renamed from: A.a$a, reason: collision with other inner class name */
    static final class C0000a extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ List f0r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0000a(List list) {
            super(1);
            this.f0r = list;
        }

        public final void a(Object obj) {
            List list = this.f0r;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((p219v8.l) list.get(i10)).f(obj);
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a(obj);
            return A.f21846a;
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.l f1r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p219v8.l f2s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p219v8.l lVar, p219v8.l lVar2) {
            super(1);
            this.f1r = lVar;
            this.f2s = lVar2;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A.c f(n nVar) {
            int i10;
            synchronized (p.I()) {
                i10 = p.f54e;
                p.f54e = i10 + 1;
            }
            return new A.c(i10, nVar, this.f1r, this.f2s);
        }
    }

    static final class c extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.l f3r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p219v8.l lVar) {
            super(1);
            this.f3r = lVar;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h f(n nVar) {
            int i10;
            synchronized (p.I()) {
                i10 = p.f54e;
                p.f54e = i10 + 1;
            }
            return new h(i10, nVar, this.f3r);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i10, n nVar) {
        p219v8.l c0000a;
        synchronized (p.I()) {
            List list = p.f58i;
            c0000a = (p219v8.l) AbstractC1444s.k0(list);
            c0000a = c0000a == null ? new C0000a(list) : c0000a;
        }
        super(i10, nVar, null, c0000a);
    }

    @Override // A.c
    public l C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // A.c
    public A.c Q(p219v8.l lVar, p219v8.l lVar2) {
        return (A.c) p.b0(new b(lVar, lVar2));
    }

    @Override // A.c, A.k
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Void m(k kVar) {
        r.a();
        throw new p079h8.f();
    }

    @Override // A.c, A.k
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public Void n(k kVar) {
        r.a();
        throw new p079h8.f();
    }

    @Override // A.c, A.k
    public void d() {
        synchronized (p.I()) {
            q();
            A a10 = A.f21846a;
        }
    }

    @Override // A.c, A.k
    public void o() {
        p.B();
    }

    @Override // A.c, A.k
    public k x(p219v8.l lVar) {
        return p.b0(new c(lVar));
    }
}

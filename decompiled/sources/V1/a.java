package V1;

import I8.A;
import I8.InterfaceC0880f;
import I8.Q;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.n;
import p079h8.r;
import p129m8.e;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U1.a f8096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p069g8.a f8097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A f8098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0880f f8099d;

    /* JADX INFO: renamed from: V1.a$a, reason: collision with other inner class name */
    static final class C0295a extends d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f8100q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f8101r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f8102s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f8104u;

        C0295a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8102s = obj;
            this.f8104u |= Integer.MIN_VALUE;
            return a.this.e(null, this);
        }
    }

    public a(U1.a repository, p069g8.a snapshotRestorer) {
        n.h(repository, "repository");
        n.h(snapshotRestorer, "snapshotRestorer");
        this.f8096a = repository;
        this.f8097b = snapshotRestorer;
        this.f8098c = Q.a(null);
        this.f8099d = repository.b();
    }

    public final A a() {
        return this.f8098c;
    }

    public final InterfaceC0880f b() {
        return this.f8099d;
    }

    public final W1.a c() {
        return this.f8096a.c();
    }

    public final void d() {
        this.f8096a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(W1.a aVar, e eVar) {
        C0295a c0295a;
        if (eVar instanceof C0295a) {
            c0295a = (C0295a) eVar;
            int i10 = c0295a.f8104u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0295a.f8104u = i10 - Integer.MIN_VALUE;
            } else {
                c0295a = new C0295a(eVar);
            }
        } else {
            c0295a = new C0295a(eVar);
        }
        Object obj = c0295a.f8102s;
        Object objE = p139n8.b.e();
        int i11 = c0295a.f8104u;
        try {
            if (i11 == 0) {
                r.b(obj);
                this.f8098c.setValue(aVar);
                U1.a aVar2 = this.f8096a;
                c0295a.f8100q = this;
                c0295a.f8101r = aVar;
                c0295a.f8104u = 1;
                if (aVar2.d(aVar, c0295a) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (W1.a) c0295a.f8101r;
                this = (a) c0295a.f8100q;
                r.b(obj);
            }
            ((b) this.f8097b.get()).d(aVar);
        } catch (Exception unused) {
            this.f8098c.setValue(null);
        }
        return p079h8.A.f21846a;
    }
}

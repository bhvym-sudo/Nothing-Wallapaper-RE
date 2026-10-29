package D3;

import F8.AbstractC0816i;
import F8.L;
import I8.InterfaceC0880f;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3.a f716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0880f f718d;

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f719q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ D3.a f720r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ E3.a f721s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D3.a aVar, E3.a aVar2, e eVar) {
            super(2, eVar);
            this.f720r = aVar;
            this.f721s = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f720r, this.f721s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f719q;
            if (i10 == 0) {
                r.b(obj);
                D3.a aVar = this.f720r;
                E3.a aVar2 = this.f721s;
                this.f719q = 1;
                if (aVar.a(aVar2, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return A.f21846a;
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f722q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ D3.a f723r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ c f724s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f725t;

        public static final class a implements D3.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f726a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f727b;

            a(c cVar, int i10) {
                this.f726a = cVar;
                this.f727b = i10;
            }

            @Override // D3.b
            public void a(E3.a snapshot) {
                n.h(snapshot, "snapshot");
                this.f726a.f716b.e(this.f727b, !n.d(this.f726a.f716b.c(this.f727b), snapshot));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(D3.a aVar, c cVar, int i10, e eVar) {
            super(2, eVar);
            this.f723r = aVar;
            this.f724s = cVar;
            this.f725t = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new b(this.f723r, this.f724s, this.f725t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f722q;
            if (i10 == 0) {
                r.b(obj);
                D3.a aVar = this.f723r;
                a aVar2 = new a(this.f724s, this.f725t);
                this.f722q = 1;
                obj = aVar.b(aVar2, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            this.f724s.f716b.f(this.f725t, (E3.a) obj);
            return A.f21846a;
        }
    }

    public c(L scope, C3.a repository, Map restorerByOwnerId) {
        n.h(scope, "scope");
        n.h(repository, "repository");
        n.h(restorerByOwnerId, "restorerByOwnerId");
        this.f715a = scope;
        this.f716b = repository;
        this.f717c = restorerByOwnerId;
        this.f718d = repository.d();
    }

    public final InterfaceC0880f b() {
        return this.f718d;
    }

    public final void c() {
        Iterator it = this.f716b.b().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            D3.a aVar = (D3.a) this.f717c.get(Integer.valueOf(iIntValue));
            E3.a aVarC = this.f716b.c(iIntValue);
            if (aVar != null && aVarC != null) {
                AbstractC0816i.d(this.f715a, null, null, new a(aVar, aVarC, null), 3, null);
            }
        }
        this.f716b.a();
    }

    public final void d() {
        this.f716b.a();
        for (Map.Entry entry : this.f717c.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            AbstractC0816i.d(this.f715a, null, null, new b((D3.a) entry.getValue(), this, iIntValue, null), 3, null);
        }
    }
}

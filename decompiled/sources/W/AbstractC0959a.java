package W;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: W.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0959a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0960b f8538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC0960b f8545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f8546i;

    /* JADX INFO: renamed from: W.a$a, reason: collision with other inner class name */
    static final class C0302a extends kotlin.jvm.internal.o implements p219v8.l {
        C0302a() {
            super(1);
        }

        public final void a(InterfaceC0960b interfaceC0960b) {
            if (interfaceC0960b.c()) {
                if (interfaceC0960b.a().g()) {
                    interfaceC0960b.H();
                }
                Map map = interfaceC0960b.a().f8546i;
                AbstractC0959a abstractC0959a = AbstractC0959a.this;
                for (Map.Entry entry : map.entrySet()) {
                    abstractC0959a.c((U.a) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC0960b.h());
                }
                U uQ1 = interfaceC0960b.h().q1();
                kotlin.jvm.internal.n.e(uQ1);
                while (!kotlin.jvm.internal.n.d(uQ1, AbstractC0959a.this.f().h())) {
                    Set<U.a> setKeySet = AbstractC0959a.this.e(uQ1).keySet();
                    AbstractC0959a abstractC0959a2 = AbstractC0959a.this;
                    for (U.a aVar : setKeySet) {
                        abstractC0959a2.c(aVar, abstractC0959a2.i(uQ1, aVar), uQ1);
                    }
                    uQ1 = uQ1.q1();
                    kotlin.jvm.internal.n.e(uQ1);
                }
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((InterfaceC0960b) obj);
            return p079h8.A.f21846a;
        }
    }

    public /* synthetic */ AbstractC0959a(InterfaceC0960b interfaceC0960b, AbstractC1457h abstractC1457h) {
        this(interfaceC0960b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(U.a aVar, int i10, U u9) {
        float f10 = i10;
        long jA = H.h.a(f10, f10);
        while (true) {
            jA = d(u9, jA);
            u9 = u9.q1();
            kotlin.jvm.internal.n.e(u9);
            if (kotlin.jvm.internal.n.d(u9, this.f8538a.h())) {
                break;
            } else if (e(u9).containsKey(aVar)) {
                float fI = i(u9, aVar);
                jA = H.h.a(fI, fI);
            }
        }
        int iRound = Math.round(aVar instanceof U.g ? H.g.l(jA) : H.g.k(jA));
        Map map = this.f8546i;
        if (map.containsKey(aVar)) {
            iRound = U.b.a(aVar, ((Number) p089i8.N.h(this.f8546i, aVar)).intValue(), iRound);
        }
        map.put(aVar, Integer.valueOf(iRound));
    }

    protected abstract long d(U u9, long j9);

    protected abstract Map e(U u9);

    public final InterfaceC0960b f() {
        return this.f8538a;
    }

    public final boolean g() {
        return this.f8539b;
    }

    public final Map h() {
        return this.f8546i;
    }

    protected abstract int i(U u9, U.a aVar);

    public final boolean j() {
        return this.f8540c || this.f8542e || this.f8543f || this.f8544g;
    }

    public final boolean k() {
        o();
        return this.f8545h != null;
    }

    public final boolean l() {
        return this.f8541d;
    }

    public final void m() {
        this.f8539b = true;
        InterfaceC0960b interfaceC0960bS = this.f8538a.s();
        if (interfaceC0960bS == null) {
            return;
        }
        if (this.f8540c) {
            interfaceC0960bS.P();
        } else if (this.f8542e || this.f8541d) {
            interfaceC0960bS.requestLayout();
        }
        if (this.f8543f) {
            this.f8538a.P();
        }
        if (this.f8544g) {
            this.f8538a.requestLayout();
        }
        interfaceC0960bS.a().m();
    }

    public final void n() {
        this.f8546i.clear();
        this.f8538a.i(new C0302a());
        this.f8546i.putAll(e(this.f8538a.h()));
        this.f8539b = false;
    }

    public final void o() {
        InterfaceC0960b interfaceC0960b;
        AbstractC0959a abstractC0959aA;
        AbstractC0959a abstractC0959aA2;
        if (j()) {
            interfaceC0960b = this.f8538a;
        } else {
            InterfaceC0960b interfaceC0960bS = this.f8538a.s();
            if (interfaceC0960bS == null) {
                return;
            }
            interfaceC0960b = interfaceC0960bS.a().f8545h;
            if (interfaceC0960b == null || !interfaceC0960b.a().j()) {
                InterfaceC0960b interfaceC0960b2 = this.f8545h;
                if (interfaceC0960b2 == null || interfaceC0960b2.a().j()) {
                    return;
                }
                InterfaceC0960b interfaceC0960bS2 = interfaceC0960b2.s();
                if (interfaceC0960bS2 != null && (abstractC0959aA2 = interfaceC0960bS2.a()) != null) {
                    abstractC0959aA2.o();
                }
                InterfaceC0960b interfaceC0960bS3 = interfaceC0960b2.s();
                interfaceC0960b = (interfaceC0960bS3 == null || (abstractC0959aA = interfaceC0960bS3.a()) == null) ? null : abstractC0959aA.f8545h;
            }
        }
        this.f8545h = interfaceC0960b;
    }

    public final void p() {
        this.f8539b = true;
        this.f8540c = false;
        this.f8542e = false;
        this.f8541d = false;
        this.f8543f = false;
        this.f8544g = false;
        this.f8545h = null;
    }

    public final void q(boolean z9) {
        this.f8542e = z9;
    }

    public final void r(boolean z9) {
        this.f8544g = z9;
    }

    public final void s(boolean z9) {
        this.f8543f = z9;
    }

    public final void t(boolean z9) {
        this.f8541d = z9;
    }

    public final void u(boolean z9) {
        this.f8540c = z9;
    }

    private AbstractC0959a(InterfaceC0960b interfaceC0960b) {
        this.f8538a = interfaceC0960b;
        this.f8539b = true;
        this.f8546i = new HashMap();
    }
}

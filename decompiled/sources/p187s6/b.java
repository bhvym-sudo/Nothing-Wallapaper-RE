package p187s6;

import B8.h;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.m;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f27759d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p167q6.b f27760e = new p167q6.b("Movement");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f27761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p187s6.a f27762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s6.a.e f27763c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public b(p187s6.a aVar, s6.a.e state, boolean z9) {
        n.h(state, "state");
        this.f27761a = z9;
        this.f27762b = aVar;
        this.f27763c = state;
    }

    public final boolean c(p187s6.a test) {
        n.h(test, "test");
        p187s6.a aVar = this.f27762b;
        s6.a.b bVar = s6.a.b.f27749r;
        if (n.d(test, bVar)) {
            return (aVar != null && h.c(bVar, p187s6.a.C0670a.f27748r).b(aVar)) || this.f27763c.f();
        }
        p187s6.a.C0670a c0670a = p187s6.a.C0670a.f27748r;
        if (n.d(test, c0670a)) {
            return (aVar != null && n.d(aVar, c0670a)) || (this.f27763c instanceof s6.a.e.b);
        }
        s6.a.d dVar = s6.a.d.f27751r;
        if (!n.d(test, dVar)) {
            s6.a.c cVar = s6.a.c.f27750r;
            if (n.d(test, cVar)) {
                return (aVar != null && n.d(aVar, cVar)) || n.d(this.f27763c, s6.a.e.C0671a.f27754s);
            }
            throw new m();
        }
        if (aVar == null || aVar.compareTo(dVar) < 0) {
            s6.a.e eVar = this.f27763c;
            if (!(eVar instanceof s6.a.e.C0672e) && !(eVar instanceof s6.a.e.C0671a)) {
                return false;
            }
        }
        return true;
    }

    public final s6.a.e d() {
        return this.f27763c;
    }

    public final boolean e() {
        return this.f27761a;
    }

    public final boolean f() {
        p187s6.a aVar = this.f27762b;
        if (aVar == null) {
            f27760e.e("call moveState but event is null.");
            return false;
        }
        s6.a.e eVar = this.f27763c;
        s6.a.e eVarG = eVar.g();
        if (eVarG == null) {
            eVarG = aVar.e();
        }
        this.f27763c = eVarG;
        if (!eVarG.e()) {
            this.f27762b = null;
        }
        f27760e.a(this + " move state from " + eVar + " to " + this.f27763c + ".");
        return true;
    }

    public final void g(s6.a.e state) {
        n.h(state, "state");
        this.f27762b = null;
        this.f27763c = state;
    }

    public final void h(boolean z9) {
        this.f27761a = z9;
    }

    public final boolean i(s6.a.e state) {
        n.h(state, "state");
        if (!this.f27763c.h(state)) {
            return false;
        }
        g(state);
        return true;
    }

    public String toString() {
        return "Movement@" + hashCode() + "(visible=" + this.f27761a + ", event=" + this.f27762b + ", state=" + this.f27763c + ")";
    }

    public /* synthetic */ b(p187s6.a aVar, s6.a.e eVar, boolean z9, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? s6.a.e.c.f27756s : eVar, (i10 & 4) != 0 ? false : z9);
    }
}

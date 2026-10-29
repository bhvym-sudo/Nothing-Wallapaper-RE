package p011b0;

import H.g;
import H.i;
import U.k;
import W.AbstractC0967i;
import W.B;
import W.InterfaceC0966h;
import W.U;
import W.W;
import W.m0;
import W.n0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import p079h8.A;
import p089i8.AbstractC1444s;
import p111l0.q;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C.c.AbstractC0022c f14603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f14604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B f14605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f14606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j f14608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f14609g;

    static final class a extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p011b0.d f14610r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p011b0.d dVar) {
            super(1);
            this.f14610r = dVar;
        }

        public final void a(r rVar) {
            p.d(rVar, this.f14610r.n());
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((r) obj);
            return A.f21846a;
        }
    }

    static final class b extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f14611r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f14611r = str;
        }

        public final void a(r rVar) {
            p.c(rVar, this.f14611r);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((r) obj);
            return A.f21846a;
        }
    }

    public static final class c extends C.c.AbstractC0022c implements m0 {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ l f14612D;

        c(l lVar) {
            this.f14612D = lVar;
        }

        @Override // W.m0
        public void o(r rVar) {
            this.f14612D.f(rVar);
        }
    }

    static final class d extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final d f14613r = new d();

        d() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean f(B b10) {
            g gVarY = b10.y();
            boolean z9 = false;
            if (gVarY != null && gVarY.q()) {
                z9 = true;
            }
            return Boolean.valueOf(z9);
        }
    }

    static final class e extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final e f14614r = new e();

        e() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean f(B b10) {
            g gVarY = b10.y();
            boolean z9 = false;
            if (gVarY != null && gVarY.q()) {
                z9 = true;
            }
            return Boolean.valueOf(z9);
        }
    }

    static final class f extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final f f14615r = new f();

        f() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean f(B b10) {
            return Boolean.valueOf(b10.V().q(W.a(8)));
        }
    }

    public j(C.c.AbstractC0022c abstractC0022c, boolean z9, B b10, g gVar) {
        this.f14603a = abstractC0022c;
        this.f14604b = z9;
        this.f14605c = b10;
        this.f14606d = gVar;
        this.f14609g = b10.a0();
    }

    private final void B(g gVar) {
        if (this.f14606d.p()) {
            return;
        }
        List listD = D(this, false, false, 3, null);
        int size = listD.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) listD.get(i10);
            if (!jVar.y()) {
                gVar.r(jVar.f14606d);
                jVar.B(gVar);
            }
        }
    }

    public static /* synthetic */ List D(j jVar, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return jVar.C(z9, z10);
    }

    private final void b(List list) {
        p011b0.d dVarH = k.h(this);
        if (dVarH != null && this.f14606d.q() && !list.isEmpty()) {
            list.add(c(dVarH, new a(dVarH)));
        }
        g gVar = this.f14606d;
        m mVar = m.f14629a;
        if (gVar.b(mVar.d()) && !list.isEmpty() && this.f14606d.q()) {
            List list2 = (List) h.a(this.f14606d, mVar.d());
            String str = list2 != null ? (String) AbstractC1444s.U(list2) : null;
            if (str != null) {
                list.add(0, c(null, new b(str)));
            }
        }
    }

    private final j c(p011b0.d dVar, l lVar) {
        g gVar = new g();
        gVar.t(false);
        gVar.s(false);
        lVar.f(gVar);
        j jVar = new j(new c(lVar), false, new B(true, dVar != null ? k.i(this) : k.e(this)), gVar);
        jVar.f14607e = true;
        jVar.f14608f = this;
        return jVar;
    }

    private final void d(B b10, List list, boolean z9) {
        p190t.b bVarE0 = b10.e0();
        int iP = bVarE0.p();
        if (iP > 0) {
            Object[] objArrO = bVarE0.o();
            int i10 = 0;
            do {
                B b11 = (B) objArrO[i10];
                if (b11.t0() && (z9 || !b11.u0())) {
                    if (b11.V().q(W.a(8))) {
                        list.add(k.a(b11, this.f14604b));
                    } else {
                        d(b11, list, z9);
                    }
                }
                i10++;
            } while (i10 < iP);
        }
    }

    private final List f(List list) {
        List listD = D(this, false, false, 3, null);
        int size = listD.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = (j) listD.get(i10);
            if (jVar.y()) {
                list.add(jVar);
            } else if (!jVar.f14606d.p()) {
                jVar.f(list);
            }
        }
        return list;
    }

    static /* synthetic */ List g(j jVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return jVar.f(list);
    }

    public static /* synthetic */ List m(j jVar, boolean z9, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = !jVar.f14604b;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return jVar.l(z9, z10, z11);
    }

    private final boolean y() {
        return this.f14604b && this.f14606d.q();
    }

    public final boolean A() {
        return !this.f14607e && t().isEmpty() && k.f(this.f14605c, d.f14613r) == null;
    }

    public final List C(boolean z9, boolean z10) {
        if (this.f14607e) {
            return AbstractC1444s.l();
        }
        ArrayList arrayList = new ArrayList();
        d(this.f14605c, arrayList, z10);
        if (z9) {
            b(arrayList);
        }
        return arrayList;
    }

    public final j a() {
        return new j(this.f14603a, true, this.f14605c, this.f14606d);
    }

    public final U e() {
        if (this.f14607e) {
            j jVarR = r();
            if (jVarR != null) {
                return jVarR.e();
            }
            return null;
        }
        InterfaceC0966h interfaceC0966hG = k.g(this.f14605c);
        if (interfaceC0966hG == null) {
            interfaceC0966hG = this.f14603a;
        }
        return AbstractC0967i.g(interfaceC0966hG, W.a(8));
    }

    public final i h() {
        U.i iVarM0;
        j jVarR = r();
        if (jVarR == null) {
            return i.f2292e.a();
        }
        U uE = e();
        if (uE != null) {
            if (!uE.t()) {
                uE = null;
            }
            if (uE != null && (iVarM0 = uE.m0()) != null) {
                return U.i.z(AbstractC0967i.g(jVarR.f14603a, W.a(8)), iVarM0, false, 2, null);
            }
        }
        return i.f2292e.a();
    }

    public final i i() {
        i iVarB;
        U uE = e();
        if (uE != null) {
            if (!uE.t()) {
                uE = null;
            }
            if (uE != null && (iVarB = U.j.b(uE)) != null) {
                return iVarB;
            }
        }
        return i.f2292e.a();
    }

    public final i j() {
        i iVarC;
        U uE = e();
        if (uE != null) {
            if (!uE.t()) {
                uE = null;
            }
            if (uE != null && (iVarC = U.j.c(uE)) != null) {
                return iVarC;
            }
        }
        return i.f2292e.a();
    }

    public final List k() {
        return m(this, false, false, false, 7, null);
    }

    public final List l(boolean z9, boolean z10, boolean z11) {
        if (z9 || !this.f14606d.p()) {
            return y() ? g(this, null, 1, null) : C(z10, z11);
        }
        return AbstractC1444s.l();
    }

    public final g n() {
        if (!y()) {
            return this.f14606d;
        }
        g gVarG = this.f14606d.g();
        B(gVarG);
        return gVarG;
    }

    public final int o() {
        return this.f14609g;
    }

    public final k p() {
        return this.f14605c;
    }

    public final B q() {
        return this.f14605c;
    }

    public final j r() {
        j jVar = this.f14608f;
        if (jVar != null) {
            return jVar;
        }
        B bF = this.f14604b ? k.f(this.f14605c, e.f14614r) : null;
        if (bF == null) {
            bF = k.f(this.f14605c, f.f14615r);
        }
        if (bF == null) {
            return null;
        }
        return k.a(bF, this.f14604b);
    }

    public final long s() {
        U uE = e();
        if (uE != null) {
            if (!uE.t()) {
                uE = null;
            }
            if (uE != null) {
                return U.j.e(uE);
            }
        }
        return g.f2287b.c();
    }

    public final List t() {
        return m(this, false, true, false, 4, null);
    }

    public final long u() {
        U uE = e();
        return uE != null ? uE.v() : q.f22837a.a();
    }

    public final i v() {
        InterfaceC0966h interfaceC0966hG;
        if (!this.f14606d.q() || (interfaceC0966hG = k.g(this.f14605c)) == null) {
            interfaceC0966hG = this.f14603a;
        }
        return n0.c(interfaceC0966hG.z(), n0.a(this.f14606d));
    }

    public final g w() {
        return this.f14606d;
    }

    public final boolean x() {
        return this.f14607e;
    }

    public final boolean z() {
        U uE = e();
        if (uE != null) {
            return uE.B1();
        }
        return false;
    }
}

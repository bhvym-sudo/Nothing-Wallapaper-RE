package Q;

import W.AbstractC0967i;
import W.W;
import W.j0;
import W.k0;
import androidx.collection.D;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C.c.AbstractC0022c f6513c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private U.i f6516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k f6517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6518h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final R.a f6514d = new R.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.collection.r f6515e = new androidx.collection.r(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f6519i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f6520j = true;

    public h(C.c.AbstractC0022c abstractC0022c) {
        this.f6513c = abstractC0022c;
    }

    private final void j() {
        this.f6515e.c();
        this.f6516f = null;
    }

    private final boolean m(k kVar, k kVar2) {
        if (kVar == null || kVar.b().size() != kVar2.b().size()) {
            return true;
        }
        int size = kVar2.b().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!H.g.i(((t) kVar.b().get(i10)).f(), ((t) kVar2.b().get(i10)).f())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x0215  */
    /* JADX WARN: Code duplicated, block: B:86:0x0223  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Q.i
    public boolean a(androidx.collection.r rVar, U.i iVar, e eVar, boolean z9) {
        Object obj;
        boolean z10;
        int iD;
        n.a aVar;
        boolean z11;
        boolean zA = super.a(rVar, iVar, eVar, z9);
        boolean z12 = true;
        if (!this.f6513c.Q()) {
            return true;
        }
        C.c.AbstractC0022c abstractC0022c = this.f6513c;
        W.a(16);
        for (C.c.AbstractC0022c abstractC0022cF = abstractC0022c; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
            if (abstractC0022cF instanceof j0) {
                this.f6516f = k0.a((j0) abstractC0022cF);
            } else {
                abstractC0022cF.L();
            }
        }
        int i10 = 0;
        for (int iO = rVar.o(); i10 < iO; iO = iO) {
            long jK = rVar.k(i10);
            t tVar = (t) rVar.p(i10);
            if (this.f6514d.d(jK)) {
                long jH = tVar.h();
                boolean z13 = z12;
                long jF = tVar.f();
                if (H.g.n(jH) && H.g.n(jF)) {
                    z11 = z13;
                    ArrayList arrayList = new ArrayList(tVar.d().size());
                    List listD = tVar.d();
                    int size = listD.size();
                    int i11 = 0;
                    while (i11 < size) {
                        C0944c c0944c = (C0944c) listD.get(i11);
                        int i12 = size;
                        int i13 = i11;
                        long jB = c0944c.b();
                        if (H.g.n(jB)) {
                            long jC = c0944c.c();
                            U.i iVar2 = this.f6516f;
                            kotlin.jvm.internal.n.e(iVar2);
                            arrayList.add(new C0944c(jC, iVar2.C(iVar, jB), c0944c.a(), null));
                        }
                        i11 = i13 + 1;
                        size = i12;
                        listD = listD;
                    }
                    androidx.collection.r rVar2 = this.f6515e;
                    U.i iVar3 = this.f6516f;
                    kotlin.jvm.internal.n.e(iVar3);
                    long jC2 = iVar3.C(iVar, jH);
                    U.i iVar4 = this.f6516f;
                    kotlin.jvm.internal.n.e(iVar4);
                    rVar2.l(jK, t.b(tVar, 0L, 0L, iVar4.C(iVar, jF), false, 0L, jC2, false, 0, arrayList, 0L, 731, null));
                } else {
                    z11 = z13;
                }
            } else {
                z11 = z12;
            }
            i10++;
            z12 = z11;
            zA = zA;
        }
        boolean z14 = zA;
        boolean z15 = z12;
        if (this.f6515e.j()) {
            this.f6514d.c();
            g().j();
            return z15;
        }
        int iF = this.f6514d.f();
        while (true) {
            iF--;
            if (-1 >= iF) {
                break;
            }
            if (!rVar.e(this.f6514d.e(iF))) {
                this.f6514d.j(iF);
            }
        }
        ArrayList arrayList2 = new ArrayList(this.f6515e.o());
        int iO2 = this.f6515e.o();
        for (int i14 = 0; i14 < iO2; i14++) {
            arrayList2.add(this.f6515e.p(i14));
        }
        k kVar = new k(arrayList2, eVar);
        List listB = kVar.b();
        int size2 = listB.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                obj = null;
                break;
            }
            Object obj2 = listB.get(i15);
            if (eVar.a(((t) obj2).e())) {
                obj = obj2;
                break;
            }
            i15++;
        }
        t tVar2 = (t) obj;
        if (tVar2 != null) {
            if (z9) {
                z10 = false;
                if (!this.f6519i && (tVar2.g() || tVar2.i())) {
                    U.i iVar5 = this.f6516f;
                    kotlin.jvm.internal.n.e(iVar5);
                    this.f6519i = !l.c(tVar2, iVar5.v());
                }
            } else {
                z10 = false;
                this.f6519i = false;
            }
            if (this.f6519i != this.f6518h) {
                int iD2 = kVar.d();
                n.a aVar2 = n.f6532a;
                if (n.i(iD2, aVar2.c()) || n.i(kVar.d(), aVar2.a()) || n.i(kVar.d(), aVar2.b())) {
                    kVar.e(this.f6519i ? aVar2.a() : aVar2.b());
                } else {
                    iD = kVar.d();
                    aVar = n.f6532a;
                    if (!n.i(iD, aVar.a()) && this.f6518h && !this.f6520j) {
                        kVar.e(aVar.c());
                    } else if (n.i(kVar.d(), aVar.b()) && this.f6519i && tVar2.g()) {
                        kVar.e(aVar.c());
                    }
                }
            } else {
                iD = kVar.d();
                aVar = n.f6532a;
                if (!n.i(iD, aVar.a())) {
                    if (n.i(kVar.d(), aVar.b())) {
                        kVar.e(aVar.c());
                    }
                } else if (n.i(kVar.d(), aVar.b())) {
                    kVar.e(aVar.c());
                }
            }
        } else {
            z10 = false;
        }
        boolean z16 = (z14 || !n.i(kVar.d(), n.f6532a.c()) || m(this.f6517g, kVar)) ? z15 : z10;
        this.f6517g = kVar;
        return z16;
    }

    @Override // Q.i
    public void b(e eVar) {
        super.b(eVar);
        k kVar = this.f6517g;
        if (kVar == null) {
            return;
        }
        this.f6518h = this.f6519i;
        List listB = kVar.b();
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = (t) listB.get(i10);
            boolean zG = tVar.g();
            boolean zA = eVar.a(tVar.e());
            boolean z9 = this.f6519i;
            if ((!zG && !zA) || (!zG && !z9)) {
                this.f6514d.i(tVar.e());
            }
        }
        this.f6519i = false;
        this.f6520j = n.i(kVar.d(), n.f6532a.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Q.i
    public void d() {
        p190t.b bVarG = g();
        int iP = bVarG.p();
        if (iP > 0) {
            Object[] objArrO = bVarG.o();
            int i10 = 0;
            do {
                ((h) objArrO[i10]).d();
                i10++;
            } while (i10 < iP);
        }
        C.c.AbstractC0022c abstractC0022c = this.f6513c;
        W.a(16);
        for (C.c.AbstractC0022c abstractC0022cF = abstractC0022c; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
            if (abstractC0022cF instanceof j0) {
                ((j0) abstractC0022cF).m();
            } else {
                abstractC0022cF.L();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Q.i
    public boolean e(e eVar) {
        C.c.AbstractC0022c abstractC0022cF;
        p190t.b bVarG;
        int iP;
        boolean z9 = false;
        int i10 = 0;
        z9 = false;
        if (!this.f6515e.j() && this.f6513c.Q()) {
            k kVar = this.f6517g;
            kotlin.jvm.internal.n.e(kVar);
            U.i iVar = this.f6516f;
            kotlin.jvm.internal.n.e(iVar);
            long jV = iVar.v();
            C.c.AbstractC0022c abstractC0022c = this.f6513c;
            W.a(16);
            for (abstractC0022cF = abstractC0022c; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
                if (abstractC0022cF instanceof j0) {
                    ((j0) abstractC0022cF).f(kVar, m.Final, jV);
                } else {
                    abstractC0022cF.L();
                }
            }
            if (this.f6513c.Q() && (iP = (bVarG = g()).p()) > 0) {
                Object[] objArrO = bVarG.o();
                do {
                    ((h) objArrO[i10]).e(eVar);
                    i10++;
                } while (i10 < iP);
            }
            z9 = true;
        }
        b(eVar);
        j();
        return z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [C.c$c] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r2v1, types: [C.c$c] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // Q.i
    public boolean f(androidx.collection.r rVar, U.i iVar, e eVar, boolean z9) {
        ?? F9;
        p190t.b bVarG;
        int iP;
        int i10 = 0;
        if (this.f6515e.j() || !this.f6513c.Q()) {
            return false;
        }
        k kVar = this.f6517g;
        kotlin.jvm.internal.n.e(kVar);
        U.i iVar2 = this.f6516f;
        kotlin.jvm.internal.n.e(iVar2);
        long jV = iVar2.v();
        C.c.AbstractC0022c abstractC0022c = this.f6513c;
        W.a(16);
        for (?? F10 = abstractC0022c; F10 != 0; F10 = AbstractC0967i.f(null)) {
            if (F10 instanceof j0) {
                ((j0) F10).f(kVar, m.Initial, jV);
            } else {
                F10.L();
            }
        }
        if (this.f6513c.Q() && (iP = (bVarG = g()).p()) > 0) {
            Object[] objArrO = bVarG.o();
            do {
                h hVar = (h) objArrO[i10];
                androidx.collection.r rVar2 = this.f6515e;
                U.i iVar3 = this.f6516f;
                kotlin.jvm.internal.n.e(iVar3);
                hVar.f(rVar2, iVar3, eVar, z9);
                i10++;
            } while (i10 < iP);
        }
        if (this.f6513c.Q()) {
            C.c.AbstractC0022c abstractC0022c2 = this.f6513c;
            W.a(16);
            for (F9 = abstractC0022c2; F9 != 0; F9 = AbstractC0967i.f(null)) {
                if (F9 instanceof j0) {
                    ((j0) F9).f(kVar, m.Main, jV);
                } else {
                    F9.L();
                }
            }
        }
        return true;
    }

    @Override // Q.i
    public void i(long j9, D d10) {
        if (this.f6514d.d(j9) && !d10.a(this)) {
            this.f6514d.h(j9);
            this.f6515e.m(j9);
        }
        p190t.b bVarG = g();
        int iP = bVarG.p();
        if (iP > 0) {
            Object[] objArrO = bVarG.o();
            int i10 = 0;
            do {
                ((h) objArrO[i10]).i(j9, d10);
                i10++;
            } while (i10 < iP);
        }
    }

    public final C.c.AbstractC0022c k() {
        return this.f6513c;
    }

    public final R.a l() {
        return this.f6514d;
    }

    public final void n() {
        this.f6519i = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.f6513c + ", children=" + g() + ", pointerIds=" + this.f6514d + ')';
    }
}

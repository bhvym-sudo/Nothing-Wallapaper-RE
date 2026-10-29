package p180s;

import java.util.List;
import kotlin.jvm.internal.n;
import p170r.AbstractC1675d0;
import p170r.AbstractC1700q;
import p170r.AbstractC1701q0;
import p170r.C1674d;
import p170r.C1677e0;
import p170r.E0;
import p170r.F0;
import p170r.InterfaceC1678f;
import p170r.InterfaceC1698p;
import p170r.L0;
import p170r.O0;
import p219v8.l;
import p240y.d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f27575a = new g();

    public final void A(Object obj, C1674d c1674d, int i10) {
        g gVar = this.f27575a;
        d.y yVar = d.y.f27618c;
        gVar.y(yVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.r.a(0), obj);
        g.c.d(gVarA, d.r.a(1), c1674d);
        g.c.c(gVarA, d.o.a(0), i10);
        if (gVar.f27628g == gVar.n(yVar.b()) && gVar.f27629h == gVar.n(yVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = yVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f27628g) != 0) {
                if (i11 > 0) {
                    sb.append(", ");
                }
                sb.append(yVar.e(d.o.a(i12)));
                i11++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = yVar.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f27629h) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(yVar.f(d.r.a(i14)));
                i13++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + yVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void B(Object obj) {
        g gVar = this.f27575a;
        d.z zVar = d.z.f27619c;
        gVar.y(zVar);
        g.c.d(g.c.a(gVar), d.r.a(0), obj);
        if (gVar.f27628g == gVar.n(zVar.b()) && gVar.f27629h == gVar.n(zVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = zVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f27628g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(zVar.e(d.o.a(i11)));
                i10++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = zVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f27629h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(zVar.f(d.r.a(i13)));
                i12++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + zVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void C(Object obj, int i10) {
        g gVar = this.f27575a;
        d.A a10 = d.A.f27594c;
        gVar.y(a10);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.r.a(0), obj);
        g.c.c(gVarA, d.o.a(0), i10);
        if (gVar.f27628g == gVar.n(a10.b()) && gVar.f27629h == gVar.n(a10.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = a10.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f27628g) != 0) {
                if (i11 > 0) {
                    sb.append(", ");
                }
                sb.append(a10.e(d.o.a(i12)));
                i11++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = a10.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f27629h) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(a10.f(d.r.a(i14)));
                i13++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + a10 + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void D(int i10) {
        g gVar = this.f27575a;
        d.B b10 = d.B.f27595c;
        gVar.y(b10);
        g.c.c(g.c.a(gVar), d.o.a(0), i10);
        if (gVar.f27628g == gVar.n(b10.b()) && gVar.f27629h == gVar.n(b10.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = b10.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f27628g) != 0) {
                if (i11 > 0) {
                    sb.append(", ");
                }
                sb.append(b10.e(d.o.a(i12)));
                i11++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = b10.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f27629h) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(b10.f(d.r.a(i14)));
                i13++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + b10 + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void a() {
        this.f27575a.m();
    }

    public final void b(InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
        this.f27575a.r(interfaceC1678f, o9, e10);
    }

    public final boolean c() {
        return this.f27575a.t();
    }

    public final boolean d() {
        return this.f27575a.u();
    }

    public final void e(int i10) {
        g gVar = this.f27575a;
        d.C1988a c1988a = d.C1988a.f27596c;
        gVar.y(c1988a);
        g.c.c(g.c.a(gVar), d.o.a(0), i10);
        if (gVar.f27628g == gVar.n(c1988a.b()) && gVar.f27629h == gVar.n(c1988a.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = c1988a.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f27628g) != 0) {
                if (i11 > 0) {
                    sb.append(", ");
                }
                sb.append(c1988a.e(d.o.a(i12)));
                i11++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = c1988a.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f27629h) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c1988a.f(d.r.a(i14)));
                i13++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + c1988a + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void f(C1674d c1674d, Object obj) {
        g gVar = this.f27575a;
        d.C1989b c1989b = d.C1989b.f27597c;
        gVar.y(c1989b);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.r.a(0), c1674d);
        g.c.d(gVarA, d.r.a(1), obj);
        if (gVar.f27628g == gVar.n(c1989b.b()) && gVar.f27629h == gVar.n(c1989b.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = c1989b.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f27628g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(c1989b.e(d.o.a(i11)));
                i10++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = c1989b.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f27629h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c1989b.f(d.r.a(i13)));
                i12++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + c1989b + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void g(List list, d dVar) {
        if (list.isEmpty()) {
            return;
        }
        g gVar = this.f27575a;
        d.C0665d c0665d = d.C0665d.f27599c;
        gVar.y(c0665d);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.r.a(1), list);
        g.c.d(gVarA, d.r.a(0), dVar);
        if (gVar.f27628g == gVar.n(c0665d.b()) && gVar.f27629h == gVar.n(c0665d.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = c0665d.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f27628g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(c0665d.e(d.o.a(i11)));
                i10++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = c0665d.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f27629h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c0665d.f(d.r.a(i13)));
                i12++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + c0665d + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void h(AbstractC1675d0 abstractC1675d0, AbstractC1700q abstractC1700q, C1677e0 c1677e0, C1677e0 c1677e1) {
        g gVar = this.f27575a;
        d.e eVar = d.e.f27600c;
        gVar.y(eVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.r.a(0), abstractC1675d0);
        g.c.d(gVarA, d.r.a(1), abstractC1700q);
        g.c.d(gVarA, d.r.a(3), c1677e1);
        g.c.d(gVarA, d.r.a(2), c1677e0);
        if (gVar.f27628g == gVar.n(eVar.b()) && gVar.f27629h == gVar.n(eVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = eVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f27628g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(eVar.e(d.o.a(i11)));
                i10++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = eVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f27629h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(eVar.f(d.r.a(i13)));
                i12++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + eVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void i(d dVar, C1674d c1674d) {
        g gVar = this.f27575a;
        d.f fVar = d.f.f27601c;
        gVar.y(fVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.r.a(0), dVar);
        g.c.d(gVarA, d.r.a(1), c1674d);
        if (gVar.f27628g == gVar.n(fVar.b()) && gVar.f27629h == gVar.n(fVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = fVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f27628g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(fVar.e(d.o.a(i11)));
                i10++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = fVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f27629h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(fVar.f(d.r.a(i13)));
                i12++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + fVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void j(Object[] objArr) {
        if (objArr.length == 0) {
            return;
        }
        g gVar = this.f27575a;
        d.g gVar2 = d.g.f27602c;
        gVar.y(gVar2);
        g.c.d(g.c.a(gVar), d.r.a(0), objArr);
        if (gVar.f27628g == gVar.n(gVar2.b()) && gVar.f27629h == gVar.n(gVar2.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = gVar2.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f27628g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(gVar2.e(d.o.a(i11)));
                i10++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = gVar2.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f27629h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(gVar2.f(d.r.a(i13)));
                i12++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + gVar2 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void k(l lVar, InterfaceC1698p interfaceC1698p) {
        g gVar = this.f27575a;
        d.h hVar = d.h.f27603c;
        gVar.y(hVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.r.a(0), lVar);
        g.c.d(gVarA, d.r.a(1), interfaceC1698p);
        if (gVar.f27628g == gVar.n(hVar.b()) && gVar.f27629h == gVar.n(hVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = hVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f27628g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(hVar.e(d.o.a(i11)));
                i10++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = hVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f27629h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(hVar.f(d.r.a(i13)));
                i12++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + hVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void l() {
        this.f27575a.x(d.i.f27604c);
    }

    public final void m() {
        this.f27575a.x(d.j.f27605c);
    }

    public final void n(C1674d c1674d) {
        g gVar = this.f27575a;
        d.k kVar = d.k.f27606c;
        gVar.y(kVar);
        g.c.d(g.c.a(gVar), d.r.a(0), c1674d);
        if (gVar.f27628g == gVar.n(kVar.b()) && gVar.f27629h == gVar.n(kVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = kVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f27628g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(kVar.e(d.o.a(i11)));
                i10++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = kVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f27629h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(kVar.f(d.r.a(i13)));
                i12++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + kVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void o() {
        this.f27575a.x(d.l.f27607c);
    }

    public final void p(a aVar, d dVar) {
        if (aVar.d()) {
            g gVar = this.f27575a;
            d.c cVar = d.c.f27598c;
            gVar.y(cVar);
            g gVarA = g.c.a(gVar);
            g.c.d(gVarA, d.r.a(0), aVar);
            g.c.d(gVarA, d.r.a(1), dVar);
            if (gVar.f27628g == gVar.n(cVar.b()) && gVar.f27629h == gVar.n(cVar.d())) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int iB = cVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < iB; i11++) {
                if (((1 << i11) & gVar.f27628g) != 0) {
                    if (i10 > 0) {
                        sb.append(", ");
                    }
                    sb.append(cVar.e(d.o.a(i11)));
                    i10++;
                }
            }
            String string = sb.toString();
            n.g(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder();
            int iD = cVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < iD; i13++) {
                if (((1 << i13) & gVar.f27629h) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(cVar.f(d.r.a(i13)));
                    i12++;
                }
            }
            String string2 = sb2.toString();
            n.g(string2, "StringBuilder().apply(builderAction).toString()");
            AbstractC1701q0.b("Error while pushing " + cVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
        }
    }

    public final void q(C1674d c1674d, L0 l9) {
        g gVar = this.f27575a;
        d.m mVar = d.m.f27608c;
        gVar.y(mVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.r.a(0), c1674d);
        g.c.d(gVarA, d.r.a(1), l9);
        if (gVar.f27628g == gVar.n(mVar.b()) && gVar.f27629h == gVar.n(mVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = mVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f27628g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(mVar.e(d.o.a(i11)));
                i10++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = mVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f27629h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(mVar.f(d.r.a(i13)));
                i12++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + mVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void r(C1674d c1674d, L0 l9, c cVar) {
        g gVar = this.f27575a;
        d.n nVar = d.n.f27609c;
        gVar.y(nVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.r.a(0), c1674d);
        g.c.d(gVarA, d.r.a(1), l9);
        g.c.d(gVarA, d.r.a(2), cVar);
        if (gVar.f27628g == gVar.n(nVar.b()) && gVar.f27629h == gVar.n(nVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = nVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f27628g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(nVar.e(d.o.a(i11)));
                i10++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = nVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f27629h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(nVar.f(d.r.a(i13)));
                i12++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + nVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void s(int i10) {
        g gVar = this.f27575a;
        d.p pVar = d.p.f27610c;
        gVar.y(pVar);
        g.c.c(g.c.a(gVar), d.o.a(0), i10);
        if (gVar.f27628g == gVar.n(pVar.b()) && gVar.f27629h == gVar.n(pVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = pVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f27628g) != 0) {
                if (i11 > 0) {
                    sb.append(", ");
                }
                sb.append(pVar.e(d.o.a(i12)));
                i11++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = pVar.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f27629h) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(pVar.f(d.r.a(i14)));
                i13++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + pVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void t(int i10, int i11, int i12) {
        g gVar = this.f27575a;
        d.q qVar = d.q.f27611c;
        gVar.y(qVar);
        g gVarA = g.c.a(gVar);
        g.c.c(gVarA, d.o.a(1), i10);
        g.c.c(gVarA, d.o.a(0), i11);
        g.c.c(gVarA, d.o.a(2), i12);
        if (gVar.f27628g == gVar.n(qVar.b()) && gVar.f27629h == gVar.n(qVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = qVar.b();
        int i13 = 0;
        for (int i14 = 0; i14 < iB; i14++) {
            if (((1 << i14) & gVar.f27628g) != 0) {
                if (i13 > 0) {
                    sb.append(", ");
                }
                sb.append(qVar.e(d.o.a(i14)));
                i13++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = qVar.d();
        int i15 = 0;
        for (int i16 = 0; i16 < iD; i16++) {
            if (((1 << i16) & gVar.f27629h) != 0) {
                if (i13 > 0) {
                    sb2.append(", ");
                }
                sb2.append(qVar.f(d.r.a(i16)));
                i15++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + qVar + ". Not all arguments were provided. Missing " + i13 + " int arguments (" + string + ") and " + i15 + " object arguments (" + string2 + ").");
    }

    public final void u(F0 f10) {
        g gVar = this.f27575a;
        d.s sVar = d.s.f27612c;
        gVar.y(sVar);
        g.c.d(g.c.a(gVar), d.r.a(0), f10);
        if (gVar.f27628g == gVar.n(sVar.b()) && gVar.f27629h == gVar.n(sVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = sVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f27628g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(sVar.e(d.o.a(i11)));
                i10++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = sVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f27629h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(sVar.f(d.r.a(i13)));
                i12++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + sVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void v() {
        this.f27575a.x(d.t.f27613c);
    }

    public final void w(int i10, int i11) {
        g gVar = this.f27575a;
        d.u uVar = d.u.f27614c;
        gVar.y(uVar);
        g gVarA = g.c.a(gVar);
        g.c.c(gVarA, d.o.a(0), i10);
        g.c.c(gVarA, d.o.a(1), i11);
        if (gVar.f27628g == gVar.n(uVar.b()) && gVar.f27629h == gVar.n(uVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = uVar.b();
        int i12 = 0;
        for (int i13 = 0; i13 < iB; i13++) {
            if (((1 << i13) & gVar.f27628g) != 0) {
                if (i12 > 0) {
                    sb.append(", ");
                }
                sb.append(uVar.e(d.o.a(i13)));
                i12++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = uVar.d();
        int i14 = 0;
        for (int i15 = 0; i15 < iD; i15++) {
            if (((1 << i15) & gVar.f27629h) != 0) {
                if (i12 > 0) {
                    sb2.append(", ");
                }
                sb2.append(uVar.f(d.r.a(i15)));
                i14++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + uVar + ". Not all arguments were provided. Missing " + i12 + " int arguments (" + string + ") and " + i14 + " object arguments (" + string2 + ").");
    }

    public final void x() {
        this.f27575a.x(d.v.f27615c);
    }

    public final void y() {
        this.f27575a.x(d.w.f27616c);
    }

    public final void z(int i10) {
        g gVar = this.f27575a;
        d.x xVar = d.x.f27617c;
        gVar.y(xVar);
        g.c.c(g.c.a(gVar), d.o.a(0), i10);
        if (gVar.f27628g == gVar.n(xVar.b()) && gVar.f27629h == gVar.n(xVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = xVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f27628g) != 0) {
                if (i11 > 0) {
                    sb.append(", ");
                }
                sb.append(xVar.e(d.o.a(i12)));
                i11++;
            }
        }
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = xVar.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f27629h) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(xVar.f(d.r.a(i14)));
                i13++;
            }
        }
        String string2 = sb2.toString();
        n.g(string2, "StringBuilder().apply(builderAction).toString()");
        AbstractC1701q0.b("Error while pushing " + xVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }
}

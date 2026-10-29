package S8;

import E8.i;
import P8.A;
import P8.AbstractC0937c;
import P8.B;
import P8.D;
import P8.E;
import P8.InterfaceC0939e;
import P8.r;
import P8.u;
import P8.w;
import Q8.d;
import U8.e;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0262a f7379a = new C0262a(null);

    /* JADX INFO: renamed from: S8.a$a, reason: collision with other inner class name */
    public static final class C0262a {
        public /* synthetic */ C0262a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final u c(u uVar, u uVar2) {
            u.a aVar = new u.a();
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strB = uVar.b(i10);
                String strM = uVar.m(i10);
                if ((!i.B("Warning", strB, true) || !i.M(strM, "1", false, 2, null)) && (d(strB) || !e(strB) || uVar2.a(strB) == null)) {
                    aVar.d(strB, strM);
                }
            }
            int size2 = uVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strB2 = uVar2.b(i11);
                if (!d(strB2) && e(strB2)) {
                    aVar.d(strB2, uVar2.m(i11));
                }
            }
            return aVar.f();
        }

        private final boolean d(String str) {
            return i.B("Content-Length", str, true) || i.B("Content-Encoding", str, true) || i.B("Content-Type", str, true);
        }

        private final boolean e(String str) {
            return (i.B("Connection", str, true) || i.B("Keep-Alive", str, true) || i.B("Proxy-Authenticate", str, true) || i.B("Proxy-Authorization", str, true) || i.B("TE", str, true) || i.B("Trailers", str, true) || i.B("Transfer-Encoding", str, true) || i.B("Upgrade", str, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final D f(D d10) {
            return (d10 != null ? d10.a() : null) != null ? d10.U().b(null).c() : d10;
        }

        private C0262a() {
        }
    }

    public a(AbstractC0937c abstractC0937c) {
    }

    @Override // P8.w
    public D a(w.a chain) {
        r rVarP;
        n.h(chain, "chain");
        InterfaceC0939e interfaceC0939eCall = chain.call();
        b bVarB = new b.C0263b(System.currentTimeMillis(), chain.b(), null).b();
        B b10 = bVarB.b();
        D dA = bVarB.a();
        e eVar = interfaceC0939eCall instanceof e ? (e) interfaceC0939eCall : null;
        if (eVar == null || (rVarP = eVar.p()) == null) {
            rVarP = r.f6361b;
        }
        if (b10 == null && dA == null) {
            D dC = new D.a().r(chain.b()).p(A.HTTP_1_1).g(TypedValues.PositionType.TYPE_PERCENT_HEIGHT).m("Unsatisfiable Request (only-if-cached)").b(d.f6927c).s(-1L).q(System.currentTimeMillis()).c();
            rVarP.z(interfaceC0939eCall, dC);
            return dC;
        }
        if (b10 == null) {
            n.e(dA);
            D dC2 = dA.U().d(f7379a.f(dA)).c();
            rVarP.b(interfaceC0939eCall, dC2);
            return dC2;
        }
        if (dA != null) {
            rVarP.a(interfaceC0939eCall, dA);
        }
        D dA2 = chain.a(b10);
        if (dA != null) {
            if (dA2 != null && dA2.j() == 304) {
                D.a aVarU = dA.U();
                C0262a c0262a = f7379a;
                aVarU.k(c0262a.c(dA.I(), dA2.I())).s(dA2.w0()).q(dA2.q0()).d(c0262a.f(dA)).n(c0262a.f(dA2)).c();
                E eA = dA2.a();
                n.e(eA);
                eA.close();
                n.e(null);
                throw null;
            }
            E eA2 = dA.a();
            if (eA2 != null) {
                d.m(eA2);
            }
        }
        n.e(dA2);
        D.a aVarU2 = dA2.U();
        C0262a c0262a2 = f7379a;
        return aVarU2.d(c0262a2.f(dA)).n(c0262a2.f(dA2)).c();
    }
}

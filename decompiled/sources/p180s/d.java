package p180s;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.F;
import p170r.AbstractC1696o;
import p170r.AbstractC1700q;
import p170r.C1674d;
import p170r.C1677e0;
import p170r.C1687j0;
import p170r.C1714x0;
import p170r.E0;
import p170r.F0;
import p170r.G0;
import p170r.InterfaceC1678f;
import p170r.InterfaceC1698p;
import p170r.L0;
import p170r.O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27593b;

    public static final class A extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final A f27594c = new A();

        /* JADX WARN: Illegal instructions before constructor call */
        private A() {
            int i10 = 1;
            super(i10, i10, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            Object objA = eVar.a(r.a(0));
            int iB = eVar.b(o.a(0));
            if (objA instanceof G0) {
                e10.a(((G0) objA).b());
            }
            Object objP0 = o9.P0(iB, objA);
            if (objP0 instanceof G0) {
                e10.b(((G0) objP0).b(), o9.c0() - o9.X0(o9.Z(), iB), -1, -1);
            } else if (objP0 instanceof C1714x0) {
                ((C1714x0) objP0).w();
            }
        }

        @Override // p180s.d
        public String e(int i10) {
            return o.b(i10, o.a(0)) ? "groupSlotIndex" : super.e(i10);
        }

        @Override // p180s.d
        public String f(int i10) {
            return r.b(i10, r.a(0)) ? "value" : super.f(i10);
        }
    }

    public static final class B extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final B f27595c = new B();

        private B() {
            super(1, 0, 2, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            int iB = eVar.b(o.a(0));
            for (int i10 = 0; i10 < iB; i10++) {
                interfaceC1678f.f();
            }
        }

        @Override // p180s.d
        public String e(int i10) {
            return o.b(i10, o.a(0)) ? "count" : super.e(i10);
        }
    }

    /* JADX INFO: renamed from: s.d$a, reason: case insensitive filesystem */
    public static final class C1988a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1988a f27596c = new C1988a();

        private C1988a() {
            super(1, 0, 2, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            o9.C(eVar.b(o.a(0)));
        }

        @Override // p180s.d
        public String e(int i10) {
            return o.b(i10, o.a(0)) ? "distance" : super.e(i10);
        }
    }

    /* JADX INFO: renamed from: s.d$b, reason: case insensitive filesystem */
    public static final class C1989b extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1989b f27597c = new C1989b();

        private C1989b() {
            super(0, 2, 1, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            C1674d c1674d = (C1674d) eVar.a(r.a(0));
            Object objA = eVar.a(r.a(1));
            if (objA instanceof G0) {
                e10.a(((G0) objA).b());
            }
            o9.F(c1674d, objA);
        }

        @Override // p180s.d
        public String f(int i10) {
            if (r.b(i10, r.a(0))) {
                return "anchor";
            }
            return r.b(i10, r.a(1)) ? "value" : super.f(i10);
        }
    }

    public static final class c extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f27598c = new c();

        private c() {
            super(0, 2, 1, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            p240y.d dVar = (p240y.d) eVar.a(r.a(1));
            int iA = dVar != null ? dVar.a() : 0;
            a aVar = (a) eVar.a(r.a(0));
            if (iA > 0) {
                interfaceC1678f = new C1687j0(interfaceC1678f, iA);
            }
            aVar.b(interfaceC1678f, o9, e10);
        }

        @Override // p180s.d
        public String f(int i10) {
            if (r.b(i10, r.a(0))) {
                return "changes";
            }
            return r.b(i10, r.a(1)) ? "effectiveNodeIndex" : super.f(i10);
        }
    }

    /* JADX INFO: renamed from: s.d$d, reason: collision with other inner class name */
    public static final class C0665d extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0665d f27599c = new C0665d();

        private C0665d() {
            super(0, 2, 1, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            int iA = ((p240y.d) eVar.a(r.a(0))).a();
            List list = (List) eVar.a(r.a(1));
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                kotlin.jvm.internal.n.f(interfaceC1678f, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i11 = iA + i10;
                interfaceC1678f.b(i11, obj);
                interfaceC1678f.g(i11, obj);
            }
        }

        @Override // p180s.d
        public String f(int i10) {
            if (r.b(i10, r.a(0))) {
                return "effectiveNodeIndex";
            }
            return r.b(i10, r.a(1)) ? "nodes" : super.f(i10);
        }
    }

    public static final class e extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f27600c = new e();

        private e() {
            super(0, 4, 1, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            C1677e0 c1677e0 = (C1677e0) eVar.a(r.a(2));
            AbstractC1700q abstractC1700q = (AbstractC1700q) eVar.a(r.a(1));
            abstractC1700q.l(c1677e0);
            AbstractC1696o.s("Could not resolve state for movable content");
            throw new p079h8.f();
        }

        @Override // p180s.d
        public String f(int i10) {
            if (r.b(i10, r.a(0))) {
                return "resolvedState";
            }
            if (r.b(i10, r.a(1))) {
                return "resolvedCompositionContext";
            }
            if (r.b(i10, r.a(2))) {
                return TypedValues.TransitionType.S_FROM;
            }
            return r.b(i10, r.a(3)) ? TypedValues.TransitionType.S_TO : super.f(i10);
        }
    }

    public static final class f extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f27601c = new f();

        private f() {
            super(0, 2, 1, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            p240y.d dVar = (p240y.d) eVar.a(r.a(0));
            C1674d c1674d = (C1674d) eVar.a(r.a(1));
            kotlin.jvm.internal.n.f(interfaceC1678f, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            dVar.b(p180s.f.d(o9, c1674d, interfaceC1678f));
        }

        @Override // p180s.d
        public String f(int i10) {
            if (r.b(i10, r.a(0))) {
                return "effectiveNodeIndexOut";
            }
            return r.b(i10, r.a(1)) ? "anchor" : super.f(i10);
        }
    }

    public static final class g extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f27602c = new g();

        /* JADX WARN: Illegal instructions before constructor call */
        private g() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            kotlin.jvm.internal.n.f(interfaceC1678f, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) eVar.a(r.a(0))) {
                interfaceC1678f.c(obj);
            }
        }

        @Override // p180s.d
        public String f(int i10) {
            return r.b(i10, r.a(0)) ? "nodes" : super.f(i10);
        }
    }

    public static final class h extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f27603c = new h();

        private h() {
            super(0, 2, 1, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            ((p219v8.l) eVar.a(r.a(0))).f((InterfaceC1698p) eVar.a(r.a(1)));
        }

        @Override // p180s.d
        public String f(int i10) {
            if (r.b(i10, r.a(0))) {
                return "anchor";
            }
            return r.b(i10, r.a(1)) ? "composition" : super.f(i10);
        }
    }

    public static final class i extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f27604c = new i();

        /* JADX WARN: Illegal instructions before constructor call */
        private i() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            o9.S();
        }
    }

    public static final class j extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f27605c = new j();

        /* JADX WARN: Illegal instructions before constructor call */
        private j() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            kotlin.jvm.internal.n.f(interfaceC1678f, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            p180s.f.e(o9, interfaceC1678f, 0);
            o9.S();
        }
    }

    public static final class k extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f27606c = new k();

        /* JADX WARN: Illegal instructions before constructor call */
        private k() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            o9.V((C1674d) eVar.a(r.a(0)));
        }

        @Override // p180s.d
        public String f(int i10) {
            return r.b(i10, r.a(0)) ? "anchor" : super.f(i10);
        }
    }

    public static final class l extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f27607c = new l();

        /* JADX WARN: Illegal instructions before constructor call */
        private l() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            o9.U(0);
        }
    }

    public static final class m extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f27608c = new m();

        private m() {
            super(0, 2, 1, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            L0 l9 = (L0) eVar.a(r.a(1));
            C1674d c1674d = (C1674d) eVar.a(r.a(0));
            o9.H();
            o9.t0(l9, c1674d.d(l9), false);
            o9.T();
        }

        @Override // p180s.d
        public String f(int i10) {
            if (r.b(i10, r.a(0))) {
                return "anchor";
            }
            return r.b(i10, r.a(1)) ? TypedValues.TransitionType.S_FROM : super.f(i10);
        }
    }

    public static final class n extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f27609c = new n();

        private n() {
            super(0, 3, 1, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            L0 l9 = (L0) eVar.a(r.a(1));
            C1674d c1674d = (C1674d) eVar.a(r.a(0));
            p180s.c cVar = (p180s.c) eVar.a(r.a(2));
            O0 o0Z = l9.z();
            try {
                cVar.c(interfaceC1678f, o0Z, e10);
                p079h8.A a10 = p079h8.A.f21846a;
                o0Z.K(true);
                o9.H();
                o9.t0(l9, c1674d.d(l9), false);
                o9.T();
            } catch (Throwable th) {
                o0Z.K(false);
                throw th;
            }
        }

        @Override // p180s.d
        public String f(int i10) {
            if (r.b(i10, r.a(0))) {
                return "anchor";
            }
            if (r.b(i10, r.a(1))) {
                return TypedValues.TransitionType.S_FROM;
            }
            return r.b(i10, r.a(2)) ? "fixups" : super.f(i10);
        }
    }

    public static final class o {
        public static int a(int i10) {
            return i10;
        }

        public static final boolean b(int i10, int i11) {
            return i10 == i11;
        }
    }

    public static final class p extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f27610c = new p();

        private p() {
            super(1, 0, 2, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            o9.u0(eVar.b(o.a(0)));
        }

        @Override // p180s.d
        public String e(int i10) {
            return o.b(i10, o.a(0)) ? TypedValues.CycleType.S_WAVE_OFFSET : super.e(i10);
        }
    }

    public static final class q extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f27611c = new q();

        private q() {
            super(3, 0, 2, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            interfaceC1678f.e(eVar.b(o.a(0)), eVar.b(o.a(1)), eVar.b(o.a(2)));
        }

        @Override // p180s.d
        public String e(int i10) {
            if (o.b(i10, o.a(0))) {
                return TypedValues.TransitionType.S_FROM;
            }
            if (o.b(i10, o.a(1))) {
                return TypedValues.TransitionType.S_TO;
            }
            return o.b(i10, o.a(2)) ? "count" : super.e(i10);
        }
    }

    public static final class r {
        public static int a(int i10) {
            return i10;
        }

        public static final boolean b(int i10, int i11) {
            return i10 == i11;
        }
    }

    public static final class s extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f27612c = new s();

        /* JADX WARN: Illegal instructions before constructor call */
        private s() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            e10.a((F0) eVar.a(r.a(0)));
        }

        @Override // p180s.d
        public String f(int i10) {
            return r.b(i10, r.a(0)) ? "value" : super.f(i10);
        }
    }

    public static final class t extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f27613c = new t();

        /* JADX WARN: Illegal instructions before constructor call */
        private t() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            AbstractC1696o.J(o9, e10);
        }
    }

    public static final class u extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f27614c = new u();

        /* JADX WARN: Illegal instructions before constructor call */
        private u() {
            int i10 = 2;
            super(i10, 0, i10, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            interfaceC1678f.a(eVar.b(o.a(0)), eVar.b(o.a(1)));
        }

        @Override // p180s.d
        public String e(int i10) {
            if (o.b(i10, o.a(0))) {
                return "removeIndex";
            }
            return o.b(i10, o.a(1)) ? "count" : super.e(i10);
        }
    }

    public static final class v extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f27615c = new v();

        /* JADX WARN: Illegal instructions before constructor call */
        private v() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            o9.L0();
        }
    }

    public static final class w extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f27616c = new w();

        /* JADX WARN: Illegal instructions before constructor call */
        private w() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            o9.T0();
        }
    }

    public static final class x extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f27617c = new x();

        private x() {
            super(1, 0, 2, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            int iB = eVar.b(o.a(0));
            int iC0 = o9.c0();
            int iA0 = o9.a0();
            int iA1 = o9.a1(iA0);
            int iZ0 = o9.Z0(iA0);
            for (int iMax = Math.max(iA1, iZ0 - iB); iMax < iZ0; iMax++) {
                Object obj = o9.f25355c[o9.Q(iMax)];
                if (obj instanceof G0) {
                    e10.b(((G0) obj).b(), iC0 - iMax, -1, -1);
                } else if (obj instanceof C1714x0) {
                    ((C1714x0) obj).w();
                }
            }
            o9.h1(iB);
        }

        @Override // p180s.d
        public String e(int i10) {
            return o.b(i10, o.a(0)) ? "count" : super.e(i10);
        }
    }

    public static final class y extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f27618c = new y();

        private y() {
            super(1, 2, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            int iE;
            int iC0;
            Object objA = eVar.a(r.a(0));
            C1674d c1674d = (C1674d) eVar.a(r.a(1));
            int iB = eVar.b(o.a(0));
            if (objA instanceof G0) {
                e10.a(((G0) objA).b());
            }
            int iE2 = o9.E(c1674d);
            Object objO0 = o9.O0(iE2, iB, objA);
            if (!(objO0 instanceof G0)) {
                if (objO0 instanceof C1714x0) {
                    ((C1714x0) objO0).w();
                    return;
                }
                return;
            }
            int iC1 = o9.c0() - o9.X0(iE2, iB);
            G0 g10 = (G0) objO0;
            C1674d c1674dA = g10.a();
            if (c1674dA == null || !c1674dA.b()) {
                iE = -1;
                iC0 = -1;
            } else {
                iE = o9.E(c1674dA);
                iC0 = o9.c0() - o9.Y0(iE);
            }
            e10.b(g10.b(), iC1, iE, iC0);
        }

        @Override // p180s.d
        public String e(int i10) {
            return o.b(i10, o.a(0)) ? "groupSlotIndex" : super.e(i10);
        }

        @Override // p180s.d
        public String f(int i10) {
            if (r.b(i10, r.a(0))) {
                return "value";
            }
            return r.b(i10, r.a(1)) ? "anchor" : super.f(i10);
        }
    }

    public static final class z extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f27619c = new z();

        /* JADX WARN: Illegal instructions before constructor call */
        private z() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // p180s.d
        public void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10) {
            o9.l1(eVar.a(r.a(0)));
        }

        @Override // p180s.d
        public String f(int i10) {
            return r.b(i10, r.a(0)) ? "data" : super.f(i10);
        }
    }

    public /* synthetic */ d(int i10, int i11, AbstractC1457h abstractC1457h) {
        this(i10, i11);
    }

    public abstract void a(p180s.e eVar, InterfaceC1678f interfaceC1678f, O0 o9, E0 e10);

    public final int b() {
        return this.f27592a;
    }

    public final String c() {
        String strB = F.b(getClass()).b();
        return strB == null ? "" : strB;
    }

    public final int d() {
        return this.f27593b;
    }

    public String e(int i10) {
        return "IntParameter(" + i10 + ')';
    }

    public String f(int i10) {
        return "ObjectParameter(" + i10 + ')';
    }

    public String toString() {
        return c();
    }

    private d(int i10, int i11) {
        this.f27592a = i10;
        this.f27593b = i11;
    }

    public /* synthetic */ d(int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, null);
    }
}

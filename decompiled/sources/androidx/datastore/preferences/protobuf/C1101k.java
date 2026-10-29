package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1101k implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1100j f12528a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12529a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f12529a = iArr;
            try {
                iArr[r0.b.f12594z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12529a[r0.b.f12593y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12529a[r0.b.f12591w.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12529a[r0.b.f12582G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12529a[r0.b.f12584I.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12529a[r0.b.f12580E.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12529a[r0.b.f12592x.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12529a[r0.b.f12589u.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12529a[r0.b.f12583H.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12529a[r0.b.f12585J.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12529a[r0.b.f12590v.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12529a[r0.b.f12576A.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C1101k(AbstractC1100j abstractC1100j) {
        AbstractC1100j abstractC1100j2 = (AbstractC1100j) AbstractC1114y.b(abstractC1100j, "output");
        this.f12528a = abstractC1100j2;
        abstractC1100j2.f12521a = this;
    }

    public static C1101k P(AbstractC1100j abstractC1100j) {
        C1101k c1101k = abstractC1100j.f12521a;
        return c1101k != null ? c1101k : new C1101k(abstractC1100j);
    }

    private void Q(int i10, AbstractC1095e abstractC1095e, boolean z9) {
        if (!z9) {
            throw null;
        }
        this.f12528a.M0(i10, 2);
        throw null;
    }

    private void R(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f12528a.a0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f12528a.M0(i10, 2);
        int iD = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iD += AbstractC1100j.d(((Boolean) list.get(i12)).booleanValue());
        }
        this.f12528a.O0(iD);
        while (i11 < list.size()) {
            this.f12528a.b0(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    private void S(int i10, boolean z9, Object obj, I.a aVar) {
        this.f12528a.M0(i10, 2);
        this.f12528a.O0(I.b(aVar, Boolean.valueOf(z9), obj));
        I.e(this.f12528a, aVar, Boolean.valueOf(z9), obj);
    }

    private void T(int i10, I.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Integer) it.next()).intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            Object obj = map.get(Integer.valueOf(i13));
            this.f12528a.M0(i10, 2);
            this.f12528a.O0(I.b(aVar, Integer.valueOf(i13), obj));
            I.e(this.f12528a, aVar, Integer.valueOf(i13), obj);
        }
    }

    private void U(int i10, I.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Long) it.next()).longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j9 = jArr[i12];
            Object obj = map.get(Long.valueOf(j9));
            this.f12528a.M0(i10, 2);
            this.f12528a.O0(I.b(aVar, Long.valueOf(j9), obj));
            I.e(this.f12528a, aVar, Long.valueOf(j9), obj);
        }
    }

    private void V(int i10, I.a aVar, Map map) {
        switch (a.f12529a[aVar.f12406a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    S(i10, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    S(i10, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                T(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                U(i10, aVar, map);
                return;
            case 12:
                W(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f12406a);
        }
    }

    private void W(int i10, I.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = (String) it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            Object obj = map.get(str);
            this.f12528a.M0(i10, 2);
            this.f12528a.O0(I.b(aVar, str, obj));
            I.e(this.f12528a, aVar, str, obj);
        }
    }

    private void X(int i10, AbstractC1102l abstractC1102l, boolean z9) {
        if (!z9) {
            throw null;
        }
        this.f12528a.M0(i10, 2);
        throw null;
    }

    private void Y(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f12528a.g0(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f12528a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1100j.i(((Double) list.get(i13)).doubleValue());
        }
        this.f12528a.O0(i12);
        while (i11 < list.size()) {
            this.f12528a.h0(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    private void Z(int i10, AbstractC1113x abstractC1113x, boolean z9) {
        if (!z9) {
            throw null;
        }
        this.f12528a.M0(i10, 2);
        throw null;
    }

    private void a0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f12528a.i0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f12528a.M0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK += AbstractC1100j.k(((Integer) list.get(i12)).intValue());
        }
        this.f12528a.O0(iK);
        while (i11 < list.size()) {
            this.f12528a.j0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void b0(int i10, AbstractC1113x abstractC1113x, boolean z9) {
        if (!z9) {
            throw null;
        }
        this.f12528a.M0(i10, 2);
        throw null;
    }

    private void c0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f12528a.k0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f12528a.M0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += AbstractC1100j.m(((Integer) list.get(i12)).intValue());
        }
        this.f12528a.O0(iM);
        while (i11 < list.size()) {
            this.f12528a.l0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void d0(int i10, G g10, boolean z9) {
        if (!z9) {
            throw null;
        }
        this.f12528a.M0(i10, 2);
        throw null;
    }

    private void e0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f12528a.m0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f12528a.M0(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += AbstractC1100j.o(((Long) list.get(i12)).longValue());
        }
        this.f12528a.O0(iO);
        while (i11 < list.size()) {
            this.f12528a.n0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void f0(int i10, AbstractC1110u abstractC1110u, boolean z9) {
        if (!z9) {
            throw null;
        }
        this.f12528a.M0(i10, 2);
        throw null;
    }

    private void g0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f12528a.o0(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f12528a.M0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += AbstractC1100j.q(((Float) list.get(i12)).floatValue());
        }
        this.f12528a.O0(iQ);
        while (i11 < list.size()) {
            this.f12528a.p0(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    private void h0(int i10, AbstractC1113x abstractC1113x, boolean z9) {
        if (!z9) {
            throw null;
        }
        this.f12528a.M0(i10, 2);
        throw null;
    }

    private void i0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f12528a.u0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f12528a.M0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += AbstractC1100j.v(((Integer) list.get(i12)).intValue());
        }
        this.f12528a.O0(iV);
        while (i11 < list.size()) {
            this.f12528a.v0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void j0(int i10, G g10, boolean z9) {
        if (!z9) {
            throw null;
        }
        this.f12528a.M0(i10, 2);
        throw null;
    }

    private void k0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f12528a.w0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f12528a.M0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += AbstractC1100j.x(((Long) list.get(i12)).longValue());
        }
        this.f12528a.O0(iX);
        while (i11 < list.size()) {
            this.f12528a.x0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void l0(int i10, Object obj) {
        if (obj instanceof String) {
            this.f12528a.K0(i10, (String) obj);
        } else {
            this.f12528a.e0(i10, (AbstractC1097g) obj);
        }
    }

    private void m0(int i10, AbstractC1113x abstractC1113x, boolean z9) {
        if (!z9) {
            throw null;
        }
        this.f12528a.M0(i10, 2);
        throw null;
    }

    private void n0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f12528a.C0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f12528a.M0(i10, 2);
        int iF = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iF += AbstractC1100j.F(((Integer) list.get(i12)).intValue());
        }
        this.f12528a.O0(iF);
        while (i11 < list.size()) {
            this.f12528a.D0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void o0(int i10, G g10, boolean z9) {
        if (!z9) {
            throw null;
        }
        this.f12528a.M0(i10, 2);
        throw null;
    }

    private void p0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f12528a.E0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f12528a.M0(i10, 2);
        int iH = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iH += AbstractC1100j.H(((Long) list.get(i12)).longValue());
        }
        this.f12528a.O0(iH);
        while (i11 < list.size()) {
            this.f12528a.F0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void q0(int i10, AbstractC1113x abstractC1113x, boolean z9) {
        if (!z9) {
            throw null;
        }
        this.f12528a.M0(i10, 2);
        throw null;
    }

    private void s0(int i10, G g10, boolean z9) {
        if (!z9) {
            throw null;
        }
        this.f12528a.M0(i10, 2);
        throw null;
    }

    private void t0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f12528a.I0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f12528a.M0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += AbstractC1100j.L(((Long) list.get(i12)).longValue());
        }
        this.f12528a.O0(iL);
        while (i11 < list.size()) {
            this.f12528a.J0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void u0(int i10, AbstractC1113x abstractC1113x, boolean z9) {
        if (!z9) {
            throw null;
        }
        this.f12528a.M0(i10, 2);
        throw null;
    }

    private void w0(int i10, G g10, boolean z9) {
        if (!z9) {
            throw null;
        }
        this.f12528a.M0(i10, 2);
        throw null;
    }

    private void x0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f12528a.P0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f12528a.M0(i10, 2);
        int iS = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iS += AbstractC1100j.S(((Long) list.get(i12)).longValue());
        }
        this.f12528a.O0(iS);
        while (i11 < list.size()) {
            this.f12528a.Q0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void A(int i10, List list, boolean z9) {
        if (!(list instanceof AbstractC1095e)) {
            R(i10, list, z9);
        } else {
            androidx.appcompat.app.o.a(list);
            Q(i10, null, z9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void B(int i10, List list, boolean z9) {
        if (!(list instanceof AbstractC1113x)) {
            v0(i10, list, z9);
        } else {
            androidx.appcompat.app.o.a(list);
            u0(i10, null, z9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void C(int i10, List list, boolean z9) {
        if (!(list instanceof G)) {
            t0(i10, list, z9);
        } else {
            androidx.appcompat.app.o.a(list);
            s0(i10, null, z9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void D(int i10, long j9) {
        this.f12528a.I0(i10, j9);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void E(int i10, float f10) {
        this.f12528a.o0(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void F(int i10) {
        this.f12528a.M0(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void G(int i10, List list, boolean z9) {
        if (!(list instanceof AbstractC1113x)) {
            r0(i10, list, z9);
        } else {
            androidx.appcompat.app.o.a(list);
            q0(i10, null, z9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void H(int i10, int i11) {
        this.f12528a.i0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void I(int i10, List list, boolean z9) {
        if (!(list instanceof G)) {
            k0(i10, list, z9);
        } else {
            androidx.appcompat.app.o.a(list);
            j0(i10, null, z9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void J(int i10, List list, boolean z9) {
        if (!(list instanceof AbstractC1113x)) {
            a0(i10, list, z9);
        } else {
            androidx.appcompat.app.o.a(list);
            Z(i10, null, z9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void K(int i10, List list, boolean z9) {
        if (!(list instanceof AbstractC1102l)) {
            Y(i10, list, z9);
        } else {
            androidx.appcompat.app.o.a(list);
            X(i10, null, z9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void L(int i10, I.a aVar, Map map) {
        if (this.f12528a.X()) {
            V(i10, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f12528a.M0(i10, 2);
            this.f12528a.O0(I.b(aVar, entry.getKey(), entry.getValue()));
            I.e(this.f12528a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void M(int i10, int i11) {
        this.f12528a.G0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void N(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f12528a.e0(i10, (AbstractC1097g) list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void O(int i10, Object obj, f0 f0Var) {
        this.f12528a.r0(i10, (P) obj, f0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void a(int i10, List list, boolean z9) {
        if (!(list instanceof AbstractC1110u)) {
            g0(i10, list, z9);
        } else {
            androidx.appcompat.app.o.a(list);
            f0(i10, null, z9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void b(int i10, int i11) {
        this.f12528a.N0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void c(int i10, Object obj) {
        if (obj instanceof AbstractC1097g) {
            this.f12528a.B0(i10, (AbstractC1097g) obj);
        } else {
            this.f12528a.A0(i10, (P) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void d(int i10, int i11) {
        this.f12528a.k0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void e(int i10, double d10) {
        this.f12528a.g0(i10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void f(int i10, List list, boolean z9) {
        if (!(list instanceof G)) {
            p0(i10, list, z9);
        } else {
            androidx.appcompat.app.o.a(list);
            o0(i10, null, z9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void g(int i10, List list, boolean z9) {
        if (!(list instanceof G)) {
            x0(i10, list, z9);
        } else {
            androidx.appcompat.app.o.a(list);
            w0(i10, null, z9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void h(int i10, long j9) {
        this.f12528a.m0(i10, j9);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public s0.a i() {
        return s0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void j(int i10, List list, f0 f0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            z(i10, list.get(i11), f0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void k(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof C)) {
            while (i11 < list.size()) {
                this.f12528a.K0(i10, (String) list.get(i11));
                i11++;
            }
        } else {
            C c10 = (C) list;
            while (i11 < list.size()) {
                l0(i10, c10.k(i11));
                i11++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void l(int i10, List list, f0 f0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            O(i10, list.get(i11), f0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void m(int i10, String str) {
        this.f12528a.K0(i10, str);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void n(int i10, long j9) {
        this.f12528a.P0(i10, j9);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void o(int i10, List list, boolean z9) {
        if (!(list instanceof AbstractC1113x)) {
            i0(i10, list, z9);
        } else {
            androidx.appcompat.app.o.a(list);
            h0(i10, null, z9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void p(int i10, long j9) {
        this.f12528a.w0(i10, j9);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void q(int i10, boolean z9) {
        this.f12528a.a0(i10, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void r(int i10, int i11) {
        this.f12528a.C0(i10, i11);
    }

    public void r0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f12528a.G0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f12528a.M0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += AbstractC1100j.J(((Integer) list.get(i12)).intValue());
        }
        this.f12528a.O0(iJ);
        while (i11 < list.size()) {
            this.f12528a.H0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void s(int i10) {
        this.f12528a.M0(i10, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void t(int i10, int i11) {
        this.f12528a.u0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void u(int i10, List list, boolean z9) {
        if (!(list instanceof G)) {
            e0(i10, list, z9);
        } else {
            androidx.appcompat.app.o.a(list);
            d0(i10, null, z9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void v(int i10, List list, boolean z9) {
        if (!(list instanceof AbstractC1113x)) {
            n0(i10, list, z9);
        } else {
            androidx.appcompat.app.o.a(list);
            m0(i10, null, z9);
        }
    }

    public void v0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f12528a.N0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f12528a.M0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += AbstractC1100j.Q(((Integer) list.get(i12)).intValue());
        }
        this.f12528a.O0(iQ);
        while (i11 < list.size()) {
            this.f12528a.O0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void w(int i10, AbstractC1097g abstractC1097g) {
        this.f12528a.e0(i10, abstractC1097g);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void x(int i10, long j9) {
        this.f12528a.E0(i10, j9);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void y(int i10, List list, boolean z9) {
        if (!(list instanceof AbstractC1113x)) {
            c0(i10, list, z9);
        } else {
            androidx.appcompat.app.o.a(list);
            b0(i10, null, z9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void z(int i10, Object obj, f0 f0Var) {
        this.f12528a.y0(i10, (P) obj, f0Var);
    }
}

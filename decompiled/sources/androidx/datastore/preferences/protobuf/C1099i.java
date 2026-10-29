package androidx.datastore.preferences.protobuf;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1099i implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1098h f12496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12499d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12500a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f12500a = iArr;
            try {
                iArr[r0.b.f12594z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12500a[r0.b.f12579D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12500a[r0.b.f12587s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12500a[r0.b.f12581F.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12500a[r0.b.f12593y.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12500a[r0.b.f12592x.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12500a[r0.b.f12588t.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12500a[r0.b.f12591w.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12500a[r0.b.f12589u.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12500a[r0.b.f12578C.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12500a[r0.b.f12582G.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12500a[r0.b.f12583H.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12500a[r0.b.f12584I.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12500a[r0.b.f12585J.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12500a[r0.b.f12576A.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12500a[r0.b.f12580E.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f12500a[r0.b.f12590v.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C1099i(AbstractC1098h abstractC1098h) {
        AbstractC1098h abstractC1098h2 = (AbstractC1098h) AbstractC1114y.b(abstractC1098h, "input");
        this.f12496a = abstractC1098h2;
        abstractC1098h2.f12474d = this;
    }

    public static C1099i N(AbstractC1098h abstractC1098h) {
        C1099i c1099i = abstractC1098h.f12474d;
        return c1099i != null ? c1099i : new C1099i(abstractC1098h);
    }

    private void O(Object obj, f0 f0Var, C1105o c1105o) {
        int i10 = this.f12498c;
        this.f12498c = r0.c(r0.a(this.f12497b), 4);
        try {
            f0Var.b(obj, this, c1105o);
            if (this.f12497b != this.f12498c) {
                throw C1115z.h();
            }
            this.f12498c = i10;
        } catch (Throwable th) {
            this.f12498c = i10;
            throw th;
        }
    }

    private void P(Object obj, f0 f0Var, C1105o c1105o) throws C1115z {
        int iD = this.f12496a.D();
        AbstractC1098h abstractC1098h = this.f12496a;
        if (abstractC1098h.f12471a >= abstractC1098h.f12472b) {
            throw C1115z.i();
        }
        int iM = abstractC1098h.m(iD);
        this.f12496a.f12471a++;
        f0Var.b(obj, this, c1105o);
        this.f12496a.a(0);
        AbstractC1098h abstractC1098h2 = this.f12496a;
        abstractC1098h2.f12471a--;
        abstractC1098h2.l(iM);
    }

    private Object Q(r0.b bVar, Class cls, C1105o c1105o) {
        switch (a.f12500a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(h());
            case 2:
                return B();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(r());
            case 5:
                return Integer.valueOf(g());
            case 6:
                return Long.valueOf(c());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(D());
            case 9:
                return Long.valueOf(K());
            case 10:
                return T(cls, c1105o);
            case 11:
                return Integer.valueOf(G());
            case 12:
                return Long.valueOf(i());
            case 13:
                return Integer.valueOf(u());
            case 14:
                return Long.valueOf(v());
            case 15:
                return L();
            case 16:
                return Integer.valueOf(k());
            case 17:
                return Long.valueOf(b());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private Object R(f0 f0Var, C1105o c1105o) {
        Object objH = f0Var.h();
        O(objH, f0Var, c1105o);
        f0Var.c(objH);
        return objH;
    }

    private Object S(f0 f0Var, C1105o c1105o) throws C1115z {
        Object objH = f0Var.h();
        P(objH, f0Var, c1105o);
        f0Var.c(objH);
        return objH;
    }

    private void V(int i10) throws C1115z {
        if (this.f12496a.e() != i10) {
            throw C1115z.m();
        }
    }

    private void W(int i10) throws C1115z.a {
        if (r0.b(this.f12497b) != i10) {
            throw C1115z.e();
        }
    }

    private void X(int i10) throws C1115z {
        if ((i10 & 3) != 0) {
            throw C1115z.h();
        }
    }

    private void Y(int i10) throws C1115z {
        if ((i10 & 7) != 0) {
            throw C1115z.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void A(List list) throws C1115z.a {
        U(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public AbstractC1097g B() throws C1115z.a {
        W(2);
        return this.f12496a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void C(List list) throws C1115z {
        int iC;
        if (list instanceof AbstractC1110u) {
            androidx.appcompat.app.o.a(list);
            int iB = r0.b(this.f12497b);
            if (iB != 2) {
                if (iB != 5) {
                    throw C1115z.e();
                }
                this.f12496a.t();
                throw null;
            }
            X(this.f12496a.D());
            this.f12496a.e();
            this.f12496a.t();
            throw null;
        }
        int iB2 = r0.b(this.f12497b);
        if (iB2 == 2) {
            int iD = this.f12496a.D();
            X(iD);
            int iE = this.f12496a.e() + iD;
            do {
                list.add(Float.valueOf(this.f12496a.t()));
            } while (this.f12496a.e() < iE);
            return;
        }
        if (iB2 != 5) {
            throw C1115z.e();
        }
        do {
            list.add(Float.valueOf(this.f12496a.t()));
            if (this.f12496a.f()) {
                return;
            } else {
                iC = this.f12496a.C();
            }
        } while (iC == this.f12497b);
        this.f12499d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int D() throws C1115z.a {
        W(0);
        return this.f12496a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void E(List list, f0 f0Var, C1105o c1105o) throws C1115z.a {
        int iC;
        if (r0.b(this.f12497b) != 3) {
            throw C1115z.e();
        }
        int i10 = this.f12497b;
        do {
            list.add(R(f0Var, c1105o));
            if (this.f12496a.f() || this.f12499d != 0) {
                return;
            } else {
                iC = this.f12496a.C();
            }
        } while (iC == i10);
        this.f12499d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean F() {
        int i10;
        if (this.f12496a.f() || (i10 = this.f12497b) == this.f12498c) {
            return false;
        }
        return this.f12496a.F(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int G() throws C1115z.a {
        W(5);
        return this.f12496a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void H(List list) throws C1115z.a {
        int iC;
        if (r0.b(this.f12497b) != 2) {
            throw C1115z.e();
        }
        do {
            list.add(B());
            if (this.f12496a.f()) {
                return;
            } else {
                iC = this.f12496a.C();
            }
        } while (iC == this.f12497b);
        this.f12499d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void I(List list) throws C1115z {
        int iC;
        if (list instanceof AbstractC1102l) {
            androidx.appcompat.app.o.a(list);
            int iB = r0.b(this.f12497b);
            if (iB == 1) {
                this.f12496a.p();
                throw null;
            }
            if (iB != 2) {
                throw C1115z.e();
            }
            Y(this.f12496a.D());
            this.f12496a.e();
            this.f12496a.p();
            throw null;
        }
        int iB2 = r0.b(this.f12497b);
        if (iB2 == 1) {
            do {
                list.add(Double.valueOf(this.f12496a.p()));
                if (this.f12496a.f()) {
                    return;
                } else {
                    iC = this.f12496a.C();
                }
            } while (iC == this.f12497b);
            this.f12499d = iC;
            return;
        }
        if (iB2 != 2) {
            throw C1115z.e();
        }
        int iD = this.f12496a.D();
        Y(iD);
        int iE = this.f12496a.e() + iD;
        do {
            list.add(Double.valueOf(this.f12496a.p()));
        } while (this.f12496a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void J(List list, f0 f0Var, C1105o c1105o) throws C1115z.a {
        int iC;
        if (r0.b(this.f12497b) != 2) {
            throw C1115z.e();
        }
        int i10 = this.f12497b;
        do {
            list.add(S(f0Var, c1105o));
            if (this.f12496a.f() || this.f12499d != 0) {
                return;
            } else {
                iC = this.f12496a.C();
            }
        } while (iC == i10);
        this.f12499d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long K() throws C1115z.a {
        W(0);
        return this.f12496a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public String L() throws C1115z.a {
        W(2);
        return this.f12496a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void M(List list) throws C1115z {
        int iC;
        if (list instanceof G) {
            androidx.appcompat.app.o.a(list);
            int iB = r0.b(this.f12497b);
            if (iB == 1) {
                this.f12496a.s();
                throw null;
            }
            if (iB != 2) {
                throw C1115z.e();
            }
            Y(this.f12496a.D());
            this.f12496a.e();
            this.f12496a.s();
            throw null;
        }
        int iB2 = r0.b(this.f12497b);
        if (iB2 == 1) {
            do {
                list.add(Long.valueOf(this.f12496a.s()));
                if (this.f12496a.f()) {
                    return;
                } else {
                    iC = this.f12496a.C();
                }
            } while (iC == this.f12497b);
            this.f12499d = iC;
            return;
        }
        if (iB2 != 2) {
            throw C1115z.e();
        }
        int iD = this.f12496a.D();
        Y(iD);
        int iE = this.f12496a.e() + iD;
        do {
            list.add(Long.valueOf(this.f12496a.s()));
        } while (this.f12496a.e() < iE);
    }

    public Object T(Class cls, C1105o c1105o) throws C1115z.a {
        W(2);
        return S(b0.a().c(cls), c1105o);
    }

    public void U(List list, boolean z9) throws C1115z.a {
        int iC;
        int iC2;
        if (r0.b(this.f12497b) != 2) {
            throw C1115z.e();
        }
        if (!(list instanceof C) || z9) {
            do {
                list.add(z9 ? L() : x());
                if (this.f12496a.f()) {
                    return;
                } else {
                    iC = this.f12496a.C();
                }
            } while (iC == this.f12497b);
            this.f12499d = iC;
            return;
        }
        C c10 = (C) list;
        do {
            c10.h(B());
            if (this.f12496a.f()) {
                return;
            } else {
                iC2 = this.f12496a.C();
            }
        } while (iC2 == this.f12497b);
        this.f12499d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void a(List list) throws C1115z {
        int iC;
        if (list instanceof AbstractC1113x) {
            androidx.appcompat.app.o.a(list);
            int iB = r0.b(this.f12497b);
            if (iB == 0) {
                this.f12496a.y();
                throw null;
            }
            if (iB != 2) {
                throw C1115z.e();
            }
            this.f12496a.D();
            this.f12496a.e();
            this.f12496a.y();
            throw null;
        }
        int iB2 = r0.b(this.f12497b);
        if (iB2 == 0) {
            do {
                list.add(Integer.valueOf(this.f12496a.y()));
                if (this.f12496a.f()) {
                    return;
                } else {
                    iC = this.f12496a.C();
                }
            } while (iC == this.f12497b);
            this.f12499d = iC;
            return;
        }
        if (iB2 != 2) {
            throw C1115z.e();
        }
        int iE = this.f12496a.e() + this.f12496a.D();
        do {
            list.add(Integer.valueOf(this.f12496a.y()));
        } while (this.f12496a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long b() throws C1115z.a {
        W(0);
        return this.f12496a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long c() throws C1115z.a {
        W(1);
        return this.f12496a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void d(List list) throws C1115z {
        int iC;
        if (list instanceof AbstractC1113x) {
            androidx.appcompat.app.o.a(list);
            int iB = r0.b(this.f12497b);
            if (iB != 2) {
                if (iB != 5) {
                    throw C1115z.e();
                }
                this.f12496a.w();
                throw null;
            }
            X(this.f12496a.D());
            this.f12496a.e();
            this.f12496a.w();
            throw null;
        }
        int iB2 = r0.b(this.f12497b);
        if (iB2 == 2) {
            int iD = this.f12496a.D();
            X(iD);
            int iE = this.f12496a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f12496a.w()));
            } while (this.f12496a.e() < iE);
            return;
        }
        if (iB2 != 5) {
            throw C1115z.e();
        }
        do {
            list.add(Integer.valueOf(this.f12496a.w()));
            if (this.f12496a.f()) {
                return;
            } else {
                iC = this.f12496a.C();
            }
        } while (iC == this.f12497b);
        this.f12499d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void e(List list) throws C1115z {
        int iC;
        if (list instanceof G) {
            androidx.appcompat.app.o.a(list);
            int iB = r0.b(this.f12497b);
            if (iB == 0) {
                this.f12496a.z();
                throw null;
            }
            if (iB != 2) {
                throw C1115z.e();
            }
            this.f12496a.D();
            this.f12496a.e();
            this.f12496a.z();
            throw null;
        }
        int iB2 = r0.b(this.f12497b);
        if (iB2 == 0) {
            do {
                list.add(Long.valueOf(this.f12496a.z()));
                if (this.f12496a.f()) {
                    return;
                } else {
                    iC = this.f12496a.C();
                }
            } while (iC == this.f12497b);
            this.f12499d = iC;
            return;
        }
        if (iB2 != 2) {
            throw C1115z.e();
        }
        int iE = this.f12496a.e() + this.f12496a.D();
        do {
            list.add(Long.valueOf(this.f12496a.z()));
        } while (this.f12496a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void f(List list) throws C1115z {
        int iC;
        if (list instanceof AbstractC1113x) {
            androidx.appcompat.app.o.a(list);
            int iB = r0.b(this.f12497b);
            if (iB == 0) {
                this.f12496a.D();
                throw null;
            }
            if (iB != 2) {
                throw C1115z.e();
            }
            this.f12496a.D();
            this.f12496a.e();
            this.f12496a.D();
            throw null;
        }
        int iB2 = r0.b(this.f12497b);
        if (iB2 == 0) {
            do {
                list.add(Integer.valueOf(this.f12496a.D()));
                if (this.f12496a.f()) {
                    return;
                } else {
                    iC = this.f12496a.C();
                }
            } while (iC == this.f12497b);
            this.f12499d = iC;
            return;
        }
        if (iB2 != 2) {
            throw C1115z.e();
        }
        int iE = this.f12496a.e() + this.f12496a.D();
        do {
            list.add(Integer.valueOf(this.f12496a.D()));
        } while (this.f12496a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int g() throws C1115z.a {
        W(5);
        return this.f12496a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int getTag() {
        return this.f12497b;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean h() throws C1115z.a {
        W(0);
        return this.f12496a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long i() throws C1115z.a {
        W(1);
        return this.f12496a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void j(List list) throws C1115z {
        int iC;
        if (list instanceof G) {
            androidx.appcompat.app.o.a(list);
            int iB = r0.b(this.f12497b);
            if (iB == 0) {
                this.f12496a.E();
                throw null;
            }
            if (iB != 2) {
                throw C1115z.e();
            }
            this.f12496a.D();
            this.f12496a.e();
            this.f12496a.E();
            throw null;
        }
        int iB2 = r0.b(this.f12497b);
        if (iB2 == 0) {
            do {
                list.add(Long.valueOf(this.f12496a.E()));
                if (this.f12496a.f()) {
                    return;
                } else {
                    iC = this.f12496a.C();
                }
            } while (iC == this.f12497b);
            this.f12499d = iC;
            return;
        }
        if (iB2 != 2) {
            throw C1115z.e();
        }
        int iE = this.f12496a.e() + this.f12496a.D();
        do {
            list.add(Long.valueOf(this.f12496a.E()));
        } while (this.f12496a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int k() throws C1115z.a {
        W(0);
        return this.f12496a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void l(List list) throws C1115z {
        int iC;
        if (list instanceof G) {
            androidx.appcompat.app.o.a(list);
            int iB = r0.b(this.f12497b);
            if (iB == 0) {
                this.f12496a.v();
                throw null;
            }
            if (iB != 2) {
                throw C1115z.e();
            }
            this.f12496a.D();
            this.f12496a.e();
            this.f12496a.v();
            throw null;
        }
        int iB2 = r0.b(this.f12497b);
        if (iB2 == 0) {
            do {
                list.add(Long.valueOf(this.f12496a.v()));
                if (this.f12496a.f()) {
                    return;
                } else {
                    iC = this.f12496a.C();
                }
            } while (iC == this.f12497b);
            this.f12499d = iC;
            return;
        }
        if (iB2 != 2) {
            throw C1115z.e();
        }
        int iE = this.f12496a.e() + this.f12496a.D();
        do {
            list.add(Long.valueOf(this.f12496a.v()));
        } while (this.f12496a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void m(List list) throws C1115z {
        int iC;
        if (list instanceof G) {
            androidx.appcompat.app.o.a(list);
            int iB = r0.b(this.f12497b);
            if (iB == 1) {
                this.f12496a.x();
                throw null;
            }
            if (iB != 2) {
                throw C1115z.e();
            }
            Y(this.f12496a.D());
            this.f12496a.e();
            this.f12496a.x();
            throw null;
        }
        int iB2 = r0.b(this.f12497b);
        if (iB2 == 1) {
            do {
                list.add(Long.valueOf(this.f12496a.x()));
                if (this.f12496a.f()) {
                    return;
                } else {
                    iC = this.f12496a.C();
                }
            } while (iC == this.f12497b);
            this.f12499d = iC;
            return;
        }
        if (iB2 != 2) {
            throw C1115z.e();
        }
        int iD = this.f12496a.D();
        Y(iD);
        int iE = this.f12496a.e() + iD;
        do {
            list.add(Long.valueOf(this.f12496a.x()));
        } while (this.f12496a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void n(Object obj, f0 f0Var, C1105o c1105o) throws C1115z {
        W(2);
        P(obj, f0Var, c1105o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void o(List list) throws C1115z {
        int iC;
        if (list instanceof AbstractC1113x) {
            androidx.appcompat.app.o.a(list);
            int iB = r0.b(this.f12497b);
            if (iB == 0) {
                this.f12496a.u();
                throw null;
            }
            if (iB != 2) {
                throw C1115z.e();
            }
            this.f12496a.D();
            this.f12496a.e();
            this.f12496a.u();
            throw null;
        }
        int iB2 = r0.b(this.f12497b);
        if (iB2 == 0) {
            do {
                list.add(Integer.valueOf(this.f12496a.u()));
                if (this.f12496a.f()) {
                    return;
                } else {
                    iC = this.f12496a.C();
                }
            } while (iC == this.f12497b);
            this.f12499d = iC;
            return;
        }
        if (iB2 != 2) {
            throw C1115z.e();
        }
        int iE = this.f12496a.e() + this.f12496a.D();
        do {
            list.add(Integer.valueOf(this.f12496a.u()));
        } while (this.f12496a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void p(List list) throws C1115z {
        int iC;
        if (list instanceof AbstractC1113x) {
            androidx.appcompat.app.o.a(list);
            int iB = r0.b(this.f12497b);
            if (iB == 0) {
                this.f12496a.q();
                throw null;
            }
            if (iB != 2) {
                throw C1115z.e();
            }
            this.f12496a.D();
            this.f12496a.e();
            this.f12496a.q();
            throw null;
        }
        int iB2 = r0.b(this.f12497b);
        if (iB2 == 0) {
            do {
                list.add(Integer.valueOf(this.f12496a.q()));
                if (this.f12496a.f()) {
                    return;
                } else {
                    iC = this.f12496a.C();
                }
            } while (iC == this.f12497b);
            this.f12499d = iC;
            return;
        }
        if (iB2 != 2) {
            throw C1115z.e();
        }
        int iE = this.f12496a.e() + this.f12496a.D();
        do {
            list.add(Integer.valueOf(this.f12496a.q()));
        } while (this.f12496a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void q(Map map, I.a aVar, C1105o c1105o) throws C1115z.a {
        W(2);
        int iM = this.f12496a.m(this.f12496a.D());
        Object objQ = aVar.f12407b;
        Object objQ2 = aVar.f12409d;
        while (true) {
            try {
                int iY = y();
                if (iY == Integer.MAX_VALUE || this.f12496a.f()) {
                    break;
                }
                if (iY == 1) {
                    objQ = Q(aVar.f12406a, null, null);
                } else if (iY != 2) {
                    try {
                        if (!F()) {
                            throw new C1115z("Unable to parse map entry.");
                        }
                    } catch (C1115z.a unused) {
                        if (!F()) {
                            throw new C1115z("Unable to parse map entry.");
                        }
                    }
                } else {
                    objQ2 = Q(aVar.f12408c, aVar.f12409d.getClass(), c1105o);
                }
            } catch (Throwable th) {
                this.f12496a.l(iM);
                throw th;
            }
        }
        map.put(objQ, objQ2);
        this.f12496a.l(iM);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int r() throws C1115z.a {
        W(0);
        return this.f12496a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public double readDouble() throws C1115z.a {
        W(1);
        return this.f12496a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public float readFloat() throws C1115z.a {
        W(5);
        return this.f12496a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void s(Object obj, f0 f0Var, C1105o c1105o) throws C1115z.a {
        W(3);
        O(obj, f0Var, c1105o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void t(List list) throws C1115z {
        int iC;
        if (list instanceof AbstractC1113x) {
            androidx.appcompat.app.o.a(list);
            int iB = r0.b(this.f12497b);
            if (iB != 2) {
                if (iB != 5) {
                    throw C1115z.e();
                }
                this.f12496a.r();
                throw null;
            }
            X(this.f12496a.D());
            this.f12496a.e();
            this.f12496a.r();
            throw null;
        }
        int iB2 = r0.b(this.f12497b);
        if (iB2 == 2) {
            int iD = this.f12496a.D();
            X(iD);
            int iE = this.f12496a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f12496a.r()));
            } while (this.f12496a.e() < iE);
            return;
        }
        if (iB2 != 5) {
            throw C1115z.e();
        }
        do {
            list.add(Integer.valueOf(this.f12496a.r()));
            if (this.f12496a.f()) {
                return;
            } else {
                iC = this.f12496a.C();
            }
        } while (iC == this.f12497b);
        this.f12499d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int u() throws C1115z.a {
        W(0);
        return this.f12496a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long v() throws C1115z.a {
        W(0);
        return this.f12496a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void w(List list) throws C1115z {
        int iC;
        if (list instanceof AbstractC1095e) {
            androidx.appcompat.app.o.a(list);
            int iB = r0.b(this.f12497b);
            if (iB == 0) {
                this.f12496a.n();
                throw null;
            }
            if (iB != 2) {
                throw C1115z.e();
            }
            this.f12496a.D();
            this.f12496a.e();
            this.f12496a.n();
            throw null;
        }
        int iB2 = r0.b(this.f12497b);
        if (iB2 == 0) {
            do {
                list.add(Boolean.valueOf(this.f12496a.n()));
                if (this.f12496a.f()) {
                    return;
                } else {
                    iC = this.f12496a.C();
                }
            } while (iC == this.f12497b);
            this.f12499d = iC;
            return;
        }
        if (iB2 != 2) {
            throw C1115z.e();
        }
        int iE = this.f12496a.e() + this.f12496a.D();
        do {
            list.add(Boolean.valueOf(this.f12496a.n()));
        } while (this.f12496a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public String x() throws C1115z.a {
        W(2);
        return this.f12496a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int y() {
        int i10 = this.f12499d;
        if (i10 != 0) {
            this.f12497b = i10;
            this.f12499d = 0;
        } else {
            this.f12497b = this.f12496a.C();
        }
        int i11 = this.f12497b;
        return (i11 == 0 || i11 == this.f12498c) ? SubsamplingScaleImageView.TILE_SIZE_AUTO : r0.a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void z(List list) throws C1115z.a {
        U(list, false);
    }
}

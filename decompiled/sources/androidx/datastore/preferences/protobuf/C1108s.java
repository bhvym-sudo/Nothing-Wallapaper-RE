package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1108s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C1108s f12608d = new C1108s(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f12609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12611c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f12613b;

        static {
            int[] iArr = new int[r0.b.values().length];
            f12613b = iArr;
            try {
                iArr[r0.b.f12587s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12613b[r0.b.f12588t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12613b[r0.b.f12589u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12613b[r0.b.f12590v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12613b[r0.b.f12591w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12613b[r0.b.f12592x.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12613b[r0.b.f12593y.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12613b[r0.b.f12594z.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12613b[r0.b.f12577B.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12613b[r0.b.f12578C.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12613b[r0.b.f12576A.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12613b[r0.b.f12579D.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12613b[r0.b.f12580E.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12613b[r0.b.f12582G.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12613b[r0.b.f12583H.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12613b[r0.b.f12584I.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f12613b[r0.b.f12585J.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f12613b[r0.b.f12581F.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r0.c.values().length];
            f12612a = iArr2;
            try {
                iArr2[r0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f12612a[r0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f12612a[r0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f12612a[r0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f12612a[r0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f12612a[r0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f12612a[r0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f12612a[r0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f12612a[r0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$b */
    public interface b extends Comparable {
        boolean a();

        r0.b b();

        int c();

        boolean j();
    }

    private C1108s() {
        this.f12609a = i0.s();
    }

    static int b(r0.b bVar, int i10, Object obj) {
        int iO = AbstractC1100j.O(i10);
        if (bVar == r0.b.f12577B) {
            iO *= 2;
        }
        return iO + c(bVar, obj);
    }

    static int c(r0.b bVar, Object obj) {
        switch (a.f12613b[bVar.ordinal()]) {
            case 1:
                return AbstractC1100j.i(((Double) obj).doubleValue());
            case 2:
                return AbstractC1100j.q(((Float) obj).floatValue());
            case 3:
                return AbstractC1100j.x(((Long) obj).longValue());
            case 4:
                return AbstractC1100j.S(((Long) obj).longValue());
            case 5:
                return AbstractC1100j.v(((Integer) obj).intValue());
            case 6:
                return AbstractC1100j.o(((Long) obj).longValue());
            case 7:
                return AbstractC1100j.m(((Integer) obj).intValue());
            case 8:
                return AbstractC1100j.d(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC1100j.s((P) obj);
            case 10:
                return AbstractC1100j.A((P) obj);
            case 11:
                return obj instanceof AbstractC1097g ? AbstractC1100j.g((AbstractC1097g) obj) : AbstractC1100j.N((String) obj);
            case 12:
                return obj instanceof AbstractC1097g ? AbstractC1100j.g((AbstractC1097g) obj) : AbstractC1100j.e((byte[]) obj);
            case 13:
                return AbstractC1100j.Q(((Integer) obj).intValue());
            case 14:
                return AbstractC1100j.F(((Integer) obj).intValue());
            case 15:
                return AbstractC1100j.H(((Long) obj).longValue());
            case 16:
                return AbstractC1100j.J(((Integer) obj).intValue());
            case 17:
                return AbstractC1100j.L(((Long) obj).longValue());
            case 18:
                return AbstractC1100j.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        r0.b bVarB = bVar.b();
        int iC = bVar.c();
        if (!bVar.a()) {
            return b(bVarB, iC, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!bVar.j()) {
            int iB = 0;
            while (i10 < size) {
                iB += b(bVarB, iC, list.get(i10));
                i10++;
            }
            return iB;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iC2 = 0;
        while (i10 < size) {
            iC2 += c(bVarB, list.get(i10));
            i10++;
        }
        return AbstractC1100j.O(iC) + iC2 + AbstractC1100j.Q(iC2);
    }

    private int g(Map.Entry entry) {
        androidx.appcompat.app.o.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    static int i(r0.b bVar, boolean z9) {
        if (z9) {
            return 2;
        }
        return bVar.e();
    }

    private static boolean l(Map.Entry entry) {
        androidx.appcompat.app.o.a(entry.getKey());
        throw null;
    }

    private static boolean m(r0.b bVar, Object obj) {
        AbstractC1114y.a(obj);
        switch (a.f12612a[bVar.d().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC1097g) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case 9:
                return obj instanceof P;
            default:
                return false;
        }
    }

    private void q(Map.Entry entry) {
        androidx.appcompat.app.o.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static C1108s r() {
        return new C1108s();
    }

    private void t(b bVar, Object obj) {
        if (!m(bVar.b(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.c()), bVar.b().d(), obj.getClass().getName()));
        }
    }

    static void u(AbstractC1100j abstractC1100j, r0.b bVar, int i10, Object obj) {
        if (bVar == r0.b.f12577B) {
            abstractC1100j.q0(i10, (P) obj);
        } else {
            abstractC1100j.M0(i10, i(bVar, false));
            v(abstractC1100j, bVar, obj);
        }
    }

    static void v(AbstractC1100j abstractC1100j, r0.b bVar, Object obj) {
        switch (a.f12613b[bVar.ordinal()]) {
            case 1:
                abstractC1100j.h0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC1100j.p0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC1100j.x0(((Long) obj).longValue());
                break;
            case 4:
                abstractC1100j.Q0(((Long) obj).longValue());
                break;
            case 5:
                abstractC1100j.v0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC1100j.n0(((Long) obj).longValue());
                break;
            case 7:
                abstractC1100j.l0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC1100j.b0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC1100j.s0((P) obj);
                break;
            case 10:
                abstractC1100j.z0((P) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC1097g)) {
                    abstractC1100j.L0((String) obj);
                } else {
                    abstractC1100j.f0((AbstractC1097g) obj);
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC1097g)) {
                    abstractC1100j.c0((byte[]) obj);
                } else {
                    abstractC1100j.f0((AbstractC1097g) obj);
                }
                break;
            case 13:
                abstractC1100j.O0(((Integer) obj).intValue());
                break;
            case 14:
                abstractC1100j.D0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC1100j.F0(((Long) obj).longValue());
                break;
            case 16:
                abstractC1100j.H0(((Integer) obj).intValue());
                break;
            case 17:
                abstractC1100j.J0(((Long) obj).longValue());
                break;
            case 18:
                abstractC1100j.j0(((Integer) obj).intValue());
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1108s clone() {
        C1108s c1108sR = r();
        int iM = this.f12609a.m();
        for (int i10 = 0; i10 < iM; i10++) {
            Map.Entry entryL = this.f12609a.l(i10);
            androidx.appcompat.app.o.a(entryL.getKey());
            c1108sR.s(null, entryL.getValue());
        }
        for (Map.Entry entry : this.f12609a.o()) {
            androidx.appcompat.app.o.a(entry.getKey());
            c1108sR.s(null, entry.getValue());
        }
        c1108sR.f12611c = this.f12611c;
        return c1108sR;
    }

    Iterator e() {
        if (j()) {
            return Collections.emptyIterator();
        }
        return this.f12611c ? new B(this.f12609a.i().iterator()) : this.f12609a.i().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1108s) {
            return this.f12609a.equals(((C1108s) obj).f12609a);
        }
        return false;
    }

    public int f() {
        int iM = this.f12609a.m();
        int iG = 0;
        for (int i10 = 0; i10 < iM; i10++) {
            iG += g(this.f12609a.l(i10));
        }
        Iterator it = this.f12609a.o().iterator();
        while (it.hasNext()) {
            iG += g((Map.Entry) it.next());
        }
        return iG;
    }

    public int h() {
        int iM = this.f12609a.m();
        int iD = 0;
        for (int i10 = 0; i10 < iM; i10++) {
            Map.Entry entryL = this.f12609a.l(i10);
            androidx.appcompat.app.o.a(entryL.getKey());
            iD += d(null, entryL.getValue());
        }
        for (Map.Entry entry : this.f12609a.o()) {
            androidx.appcompat.app.o.a(entry.getKey());
            iD += d(null, entry.getValue());
        }
        return iD;
    }

    public int hashCode() {
        return this.f12609a.hashCode();
    }

    boolean j() {
        return this.f12609a.isEmpty();
    }

    public boolean k() {
        int iM = this.f12609a.m();
        for (int i10 = 0; i10 < iM; i10++) {
            if (!l(this.f12609a.l(i10))) {
                return false;
            }
        }
        Iterator it = this.f12609a.o().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        if (j()) {
            return Collections.emptyIterator();
        }
        return this.f12611c ? new B(this.f12609a.entrySet().iterator()) : this.f12609a.entrySet().iterator();
    }

    public void o() {
        if (this.f12610b) {
            return;
        }
        int iM = this.f12609a.m();
        for (int i10 = 0; i10 < iM; i10++) {
            Map.Entry entryL = this.f12609a.l(i10);
            if (entryL.getValue() instanceof AbstractC1112w) {
                ((AbstractC1112w) entryL.getValue()).D();
            }
        }
        this.f12609a.r();
        this.f12610b = true;
    }

    public void p(C1108s c1108s) {
        int iM = c1108s.f12609a.m();
        for (int i10 = 0; i10 < iM; i10++) {
            q(c1108s.f12609a.l(i10));
        }
        Iterator it = c1108s.f12609a.o().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public void s(b bVar, Object obj) {
        if (!bVar.a()) {
            t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f12609a.t(bVar, obj);
    }

    private C1108s(boolean z9) {
        this(i0.s());
        o();
    }

    private C1108s(i0 i0Var) {
        this.f12609a = i0Var;
        o();
    }
}

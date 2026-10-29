package J2;

import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class a implements K2.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0119a f3512r = new C0119a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private K2.a f3513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f3515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l f3516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f3517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f3518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f3519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f3520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f3521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f3522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f3523k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f3524l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private double f3525m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f3526n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f3527o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f3528p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f3529q;

    /* JADX INFO: renamed from: J2.a$a, reason: collision with other inner class name */
    public static final class C0119a {
        public /* synthetic */ C0119a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final a a() {
            return new a(K2.a.DEBUG, "UnknownTag", 0L, c.f3530a, null, null, null, null, 0, 0, 0L, 0L, 0.0d, false, false, false, false);
        }

        private C0119a() {
        }
    }

    public a(K2.a level, String tag, long j9, l messagePrinter, Throwable th, String str, String str2, String str3, int i10, int i11, long j10, long j11, double d10, boolean z9, boolean z10, boolean z11, boolean z12) {
        n.h(level, "level");
        n.h(tag, "tag");
        n.h(messagePrinter, "messagePrinter");
        this.f3513a = level;
        this.f3514b = tag;
        this.f3515c = j9;
        this.f3516d = messagePrinter;
        this.f3517e = th;
        this.f3518f = str;
        this.f3519g = str2;
        this.f3520h = str3;
        this.f3521i = i10;
        this.f3522j = i11;
        this.f3523k = j10;
        this.f3524l = j11;
        this.f3525m = d10;
        this.f3526n = z9;
        this.f3527o = z10;
        this.f3528p = z11;
        this.f3529q = z12;
    }

    public void A(long j9) {
        this.f3515c = j9;
    }

    @Override // K2.b
    public void a(int i10) {
        this.f3522j = i10;
    }

    @Override // K2.b
    public Throwable b() {
        return this.f3517e;
    }

    @Override // K2.b
    public boolean c() {
        return this.f3526n;
    }

    @Override // K2.b
    public l d() {
        return this.f3516d;
    }

    @Override // K2.b
    public String e() {
        return this.f3520h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3513a == aVar.f3513a && n.d(this.f3514b, aVar.f3514b) && this.f3515c == aVar.f3515c && n.d(this.f3516d, aVar.f3516d) && n.d(this.f3517e, aVar.f3517e) && n.d(this.f3518f, aVar.f3518f) && n.d(this.f3519g, aVar.f3519g) && n.d(this.f3520h, aVar.f3520h) && this.f3521i == aVar.f3521i && this.f3522j == aVar.f3522j && this.f3523k == aVar.f3523k && this.f3524l == aVar.f3524l && Double.compare(this.f3525m, aVar.f3525m) == 0 && this.f3526n == aVar.f3526n && this.f3527o == aVar.f3527o && this.f3528p == aVar.f3528p && this.f3529q == aVar.f3529q;
    }

    @Override // K2.b
    public void f(int i10) {
        this.f3521i = i10;
    }

    @Override // K2.b
    public void g(boolean z9) {
        this.f3526n = z9;
    }

    @Override // K2.b
    public String getTag() {
        return this.f3514b;
    }

    @Override // K2.b
    public K2.a h() {
        return this.f3513a;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f3513a.hashCode() * 31) + this.f3514b.hashCode()) * 31) + Long.hashCode(this.f3515c)) * 31) + this.f3516d.hashCode()) * 31;
        Throwable th = this.f3517e;
        int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
        String str = this.f3518f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3519g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3520h;
        return ((((((((((((((((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.f3521i)) * 31) + Integer.hashCode(this.f3522j)) * 31) + Long.hashCode(this.f3523k)) * 31) + Long.hashCode(this.f3524l)) * 31) + Double.hashCode(this.f3525m)) * 31) + Boolean.hashCode(this.f3526n)) * 31) + Boolean.hashCode(this.f3527o)) * 31) + Boolean.hashCode(this.f3528p)) * 31) + Boolean.hashCode(this.f3529q);
    }

    @Override // K2.b
    public void i(String str) {
        this.f3519g = str;
    }

    @Override // K2.b
    public int j() {
        return this.f3521i;
    }

    @Override // K2.b
    public void k(String str) {
        this.f3518f = str;
    }

    @Override // K2.b
    public int l() {
        return this.f3522j;
    }

    @Override // K2.b
    public void m(String str) {
        this.f3520h = str;
    }

    @Override // K2.b
    public String n() {
        return this.f3519g;
    }

    @Override // K2.b
    public String o() {
        return this.f3518f;
    }

    public final void p(String tag, K2.a level, long j9, l renderer, Throwable th) {
        n.h(tag, "tag");
        n.h(level, "level");
        n.h(renderer, "renderer");
        v(level);
        z(tag);
        A(j9);
        y(renderer);
        u(th);
        k(null);
        i(null);
        m(null);
        f(0);
        a(0);
        w(0L);
        x(0L);
        t(0.0d);
        g(false);
        q(false);
        r(false);
        s(false);
    }

    public void q(boolean z9) {
        this.f3527o = z9;
    }

    public void r(boolean z9) {
        this.f3528p = z9;
    }

    public void s(boolean z9) {
        this.f3529q = z9;
    }

    public void t(double d10) {
        this.f3525m = d10;
    }

    public String toString() {
        return "LogMessageImpl(level=" + this.f3513a + ", tag=" + this.f3514b + ", timestamp=" + this.f3515c + ", messagePrinter=" + this.f3516d + ", exception=" + this.f3517e + ", str1=" + this.f3518f + ", str2=" + this.f3519g + ", str3=" + this.f3520h + ", int1=" + this.f3521i + ", int2=" + this.f3522j + ", long1=" + this.f3523k + ", long2=" + this.f3524l + ", double1=" + this.f3525m + ", bool1=" + this.f3526n + ", bool2=" + this.f3527o + ", bool3=" + this.f3528p + ", bool4=" + this.f3529q + ")";
    }

    public void u(Throwable th) {
        this.f3517e = th;
    }

    public void v(K2.a aVar) {
        n.h(aVar, "<set-?>");
        this.f3513a = aVar;
    }

    public void w(long j9) {
        this.f3523k = j9;
    }

    public void x(long j9) {
        this.f3524l = j9;
    }

    public void y(l lVar) {
        n.h(lVar, "<set-?>");
        this.f3516d = lVar;
    }

    public void z(String str) {
        n.h(str, "<set-?>");
        this.f3514b = str;
    }
}

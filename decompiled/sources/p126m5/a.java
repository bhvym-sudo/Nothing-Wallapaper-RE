package p126m5;

import java.util.HashMap;
import java.util.Map;
import p116l5.b;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map f23226a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    b f23227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f23228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    double f23229d;

    /* JADX INFO: renamed from: m5.a$a, reason: collision with other inner class name */
    private static final class C0593a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f23230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f23231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f23232c = new HashMap();

        public C0593a(double d10, double d11) {
            this.f23230a = d10;
            this.f23231b = d11;
        }

        private double b(int i10) {
            if (this.f23232c.get(Integer.valueOf(i10)) == null) {
                this.f23232c.put(Integer.valueOf(i10), Double.valueOf(b.a(this.f23230a, 200.0d, i10).c()));
            }
            return ((Double) this.f23232c.get(Integer.valueOf(i10))).doubleValue();
        }

        public b a() {
            int i10 = 100;
            int i11 = 0;
            while (i11 < i10) {
                int i12 = (i11 + i10) / 2;
                int i13 = i12 + 1;
                boolean z9 = b(i12) < b(i13);
                if (b(i12) >= this.f23231b - 0.01d) {
                    if (Math.abs(i11 - 50) < Math.abs(i10 - 50)) {
                        i10 = i12;
                    } else {
                        if (i11 == i12) {
                            return b.a(this.f23230a, this.f23231b, i11);
                        }
                        i11 = i12;
                    }
                } else if (z9) {
                    i11 = i13;
                } else {
                    i10 = i12;
                }
            }
            return b.a(this.f23230a, this.f23231b, i11);
        }
    }

    private a(double d10, double d11, b bVar) {
        this.f23228c = d10;
        this.f23229d = d11;
        this.f23227b = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar.d(), bVar.c(), bVar);
    }

    public static a b(double d10, double d11) {
        return new a(d10, d11, new C0593a(d10, d11).a());
    }

    public int c(int i10) {
        Integer numValueOf = (Integer) this.f23226a.get(Integer.valueOf(i10));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(b.a(this.f23228c, this.f23229d, i10).g());
            this.f23226a.put(Integer.valueOf(i10), numValueOf);
        }
        return numValueOf.intValue();
    }
}

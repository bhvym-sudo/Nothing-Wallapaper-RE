package p116l5;

import p156p5.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f22944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f22945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f22946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22947d;

    private b(int i10) {
        f(i10);
    }

    public static b a(double d10, double d11, double d12) {
        return new b(c.q(d10, d11, d12));
    }

    public static b b(int i10) {
        return new b(i10);
    }

    private void f(int i10) {
        this.f22947d = i10;
        a aVarA = a.a(i10);
        this.f22944a = aVarA.e();
        this.f22945b = aVarA.d();
        this.f22946c = a.k(i10);
    }

    public double c() {
        return this.f22945b;
    }

    public double d() {
        return this.f22944a;
    }

    public double e() {
        return this.f22946c;
    }

    public int g() {
        return this.f22947d;
    }
}

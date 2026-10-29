package p013b2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f14695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f14696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f14697h;

    public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f14690a = i10;
        this.f14691b = i11;
        this.f14692c = i12;
        this.f14693d = i13;
        this.f14694e = i14;
        this.f14695f = i15;
        this.f14696g = i16;
        this.f14697h = i17;
    }

    public final int a() {
        return this.f14694e;
    }

    public final int b() {
        return this.f14695f;
    }

    public final int c() {
        return this.f14696g;
    }

    public final int d() {
        return this.f14697h;
    }

    public final int e() {
        return this.f14690a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f14690a == aVar.f14690a && this.f14691b == aVar.f14691b && this.f14692c == aVar.f14692c && this.f14693d == aVar.f14693d && this.f14694e == aVar.f14694e && this.f14695f == aVar.f14695f && this.f14696g == aVar.f14696g && this.f14697h == aVar.f14697h;
    }

    public final int f() {
        return this.f14691b;
    }

    public final int g() {
        return this.f14692c;
    }

    public final int h() {
        return this.f14693d;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f14690a) * 31) + Integer.hashCode(this.f14691b)) * 31) + Integer.hashCode(this.f14692c)) * 31) + Integer.hashCode(this.f14693d)) * 31) + Integer.hashCode(this.f14694e)) * 31) + Integer.hashCode(this.f14695f)) * 31) + Integer.hashCode(this.f14696g)) * 31) + Integer.hashCode(this.f14697h);
    }

    public String toString() {
        return "ColorOptionIconViewModel(lightThemeColor0=" + this.f14690a + ", lightThemeColor1=" + this.f14691b + ", lightThemeColor2=" + this.f14692c + ", lightThemeColor3=" + this.f14693d + ", darkThemeColor0=" + this.f14694e + ", darkThemeColor1=" + this.f14695f + ", darkThemeColor2=" + this.f14696g + ", darkThemeColor3=" + this.f14697h + ")";
    }
}

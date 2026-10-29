package S4;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f7330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7332c;

    private o(Class cls, int i10, int i11) {
        this.f7330a = (Class) A.c(cls, "Null dependency anInterface.");
        this.f7331b = i10;
        this.f7332c = i11;
    }

    private static String a(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static o g(Class cls) {
        return new o(cls, 1, 0);
    }

    public static o h(Class cls) {
        return new o(cls, 1, 1);
    }

    public static o i(Class cls) {
        return new o(cls, 2, 0);
    }

    public Class b() {
        return this.f7330a;
    }

    public boolean c() {
        return this.f7332c == 2;
    }

    public boolean d() {
        return this.f7332c == 0;
    }

    public boolean e() {
        return this.f7331b == 1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f7330a == oVar.f7330a && this.f7331b == oVar.f7331b && this.f7332c == oVar.f7332c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f7331b == 2;
    }

    public int hashCode() {
        return this.f7332c ^ ((((this.f7330a.hashCode() ^ 1000003) * 1000003) ^ this.f7331b) * 1000003);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f7330a);
        sb.append(", type=");
        int i10 = this.f7331b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(a(this.f7332c));
        sb.append("}");
        return sb.toString();
    }
}

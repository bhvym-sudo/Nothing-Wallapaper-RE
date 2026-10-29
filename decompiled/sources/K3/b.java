package K3;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4085a;

    private b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f4085a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f4085a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f4085a.equals(((b) obj).f4085a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4085a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f4085a + "\"}";
    }
}

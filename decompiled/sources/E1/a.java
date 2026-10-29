package E1;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1221c;

    public a(int i10, int i11, String path) {
        n.h(path, "path");
        this.f1219a = i10;
        this.f1220b = i11;
        this.f1221c = path;
    }

    public final int a() {
        return this.f1219a;
    }

    public final String b() {
        return this.f1221c;
    }

    public final int c() {
        return this.f1220b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1219a == aVar.f1219a && this.f1220b == aVar.f1220b && n.d(this.f1221c, aVar.f1221c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f1219a) * 31) + Integer.hashCode(this.f1220b)) * 31) + this.f1221c.hashCode();
    }

    public String toString() {
        return "GridIconViewModel(columns=" + this.f1219a + ", rows=" + this.f1220b + ", path=" + this.f1221c + ")";
    }
}

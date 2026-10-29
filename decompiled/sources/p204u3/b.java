package p204u3;

import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f27977c;

    public b(String wallpaperId, int i10, long j9) {
        n.h(wallpaperId, "wallpaperId");
        this.f27975a = wallpaperId;
        this.f27976b = i10;
        this.f27977c = j9;
    }

    public final long a() {
        return this.f27977c;
    }

    public final int b() {
        return this.f27976b;
    }

    public final String c() {
        return this.f27975a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.d(this.f27975a, bVar.f27975a) && this.f27976b == bVar.f27976b && this.f27977c == bVar.f27977c;
    }

    public int hashCode() {
        return (((this.f27975a.hashCode() * 31) + Integer.hashCode(this.f27976b)) * 31) + Long.hashCode(this.f27977c);
    }

    public String toString() {
        return "WallpaperModel(wallpaperId=" + this.f27975a + ", placeholderColor=" + this.f27976b + ", lastUpdated=" + this.f27977c + ")";
    }

    public /* synthetic */ b(String str, int i10, long j9, int i11, AbstractC1457h abstractC1457h) {
        this(str, i10, (i11 & 4) != 0 ? -1L : j9);
    }
}

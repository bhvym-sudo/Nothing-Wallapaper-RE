package p191t0;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f27861e = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27865d;

    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private b(int i10, int i11, int i12, int i13) {
        this.f27862a = i10;
        this.f27863b = i11;
        this.f27864c = i12;
        this.f27865d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f27862a, bVar2.f27862a), Math.max(bVar.f27863b, bVar2.f27863b), Math.max(bVar.f27864c, bVar2.f27864c), Math.max(bVar.f27865d, bVar2.f27865d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f27861e : new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets d() {
        return a.a(this.f27862a, this.f27863b, this.f27864c, this.f27865d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f27865d == bVar.f27865d && this.f27862a == bVar.f27862a && this.f27864c == bVar.f27864c && this.f27863b == bVar.f27863b;
    }

    public int hashCode() {
        return (((((this.f27862a * 31) + this.f27863b) * 31) + this.f27864c) * 31) + this.f27865d;
    }

    public String toString() {
        return "Insets{left=" + this.f27862a + ", top=" + this.f27863b + ", right=" + this.f27864c + ", bottom=" + this.f27865d + '}';
    }
}

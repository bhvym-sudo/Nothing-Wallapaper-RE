package F7;

import E7.EnumC0774f;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0774f f1747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f1750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1751e;

    public f(EnumC0774f menuType, int i10, String title, boolean z9, boolean z10) {
        kotlin.jvm.internal.n.h(menuType, "menuType");
        kotlin.jvm.internal.n.h(title, "title");
        this.f1747a = menuType;
        this.f1748b = i10;
        this.f1749c = title;
        this.f1750d = z9;
        this.f1751e = z10;
    }

    public final boolean a() {
        return this.f1751e;
    }

    public final EnumC0774f b() {
        return this.f1747a;
    }

    public final int c() {
        return this.f1748b;
    }

    public final boolean d() {
        return this.f1750d;
    }

    public final String e() {
        return this.f1749c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f1747a == fVar.f1747a && this.f1748b == fVar.f1748b && kotlin.jvm.internal.n.d(this.f1749c, fVar.f1749c) && this.f1750d == fVar.f1750d && this.f1751e == fVar.f1751e;
    }

    public int hashCode() {
        return (((((((this.f1747a.hashCode() * 31) + Integer.hashCode(this.f1748b)) * 31) + this.f1749c.hashCode()) * 31) + Boolean.hashCode(this.f1750d)) * 31) + Boolean.hashCode(this.f1751e);
    }

    public String toString() {
        return "EffectMenuModel(menuType=" + this.f1747a + ", resIconId=" + this.f1748b + ", title=" + this.f1749c + ", selected=" + this.f1750d + ", enable=" + this.f1751e + ")";
    }
}

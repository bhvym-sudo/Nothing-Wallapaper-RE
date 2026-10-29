package p013b2;

import kotlin.jvm.internal.n;
import p219v8.a;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f14803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f14804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14805d;

    public e(String name, boolean z9, a aVar, int i10) {
        n.h(name, "name");
        this.f14802a = name;
        this.f14803b = z9;
        this.f14804c = aVar;
        this.f14805d = i10;
    }

    public final String a() {
        return this.f14802a;
    }

    public final a b() {
        return this.f14804c;
    }

    public final int c() {
        return this.f14805d;
    }

    public final boolean d() {
        return this.f14803b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return n.d(this.f14802a, eVar.f14802a) && this.f14803b == eVar.f14803b && n.d(this.f14804c, eVar.f14804c) && this.f14805d == eVar.f14805d;
    }

    public int hashCode() {
        int iHashCode = ((this.f14802a.hashCode() * 31) + Boolean.hashCode(this.f14803b)) * 31;
        a aVar = this.f14804c;
        return ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + Integer.hashCode(this.f14805d);
    }

    public String toString() {
        return "ColorTypeTabViewModel(name=" + this.f14802a + ", isSelected=" + this.f14803b + ", onClick=" + this.f14804c + ", optionsSize=" + this.f14805d + ")";
    }
}

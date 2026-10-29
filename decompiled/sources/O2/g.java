package O2;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f5781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f5782e;

    public g(String id, String name, String description, boolean z9, boolean z10) {
        kotlin.jvm.internal.n.h(id, "id");
        kotlin.jvm.internal.n.h(name, "name");
        kotlin.jvm.internal.n.h(description, "description");
        this.f5778a = id;
        this.f5779b = name;
        this.f5780c = description;
        this.f5781d = z9;
        this.f5782e = z10;
    }

    public final String a() {
        return this.f5780c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.n.d(this.f5778a, gVar.f5778a) && kotlin.jvm.internal.n.d(this.f5779b, gVar.f5779b) && kotlin.jvm.internal.n.d(this.f5780c, gVar.f5780c) && this.f5781d == gVar.f5781d && this.f5782e == gVar.f5782e;
    }

    public int hashCode() {
        return (((((((this.f5778a.hashCode() * 31) + this.f5779b.hashCode()) * 31) + this.f5780c.hashCode()) * 31) + Boolean.hashCode(this.f5781d)) * 31) + Boolean.hashCode(this.f5782e);
    }

    public String toString() {
        return "ClockConfig(id=" + this.f5778a + ", name=" + this.f5779b + ", description=" + this.f5780c + ", useAlternateSmartspaceAODTransition=" + this.f5781d + ", useCustomClockScene=" + this.f5782e + ")";
    }

    public /* synthetic */ g(String str, String str2, String str3, boolean z9, boolean z10, int i10, AbstractC1457h abstractC1457h) {
        this(str, str2, str3, (i10 & 8) != 0 ? false : z9, (i10 & 16) != 0 ? false : z10);
    }
}

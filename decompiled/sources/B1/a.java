package B1;

import I8.O;
import kotlin.jvm.internal.n;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O f336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f337e;

    public a(String name, int i10, int i11, O isSelected, l onSelected) {
        n.h(name, "name");
        n.h(isSelected, "isSelected");
        n.h(onSelected, "onSelected");
        this.f333a = name;
        this.f334b = i10;
        this.f335c = i11;
        this.f336d = isSelected;
        this.f337e = onSelected;
    }

    public final int a() {
        return this.f334b;
    }

    public final String b() {
        return this.f333a;
    }

    public final l c() {
        return this.f337e;
    }

    public final int d() {
        return this.f335c;
    }

    public final O e() {
        return this.f336d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.d(this.f333a, aVar.f333a) && this.f334b == aVar.f334b && this.f335c == aVar.f335c && n.d(this.f336d, aVar.f336d) && n.d(this.f337e, aVar.f337e);
    }

    public int hashCode() {
        return (((((((this.f333a.hashCode() * 31) + Integer.hashCode(this.f334b)) * 31) + Integer.hashCode(this.f335c)) * 31) + this.f336d.hashCode()) * 31) + this.f337e.hashCode();
    }

    public String toString() {
        return "GridOptionItemModel(name=" + this.f333a + ", cols=" + this.f334b + ", rows=" + this.f335c + ", isSelected=" + this.f336d + ", onSelected=" + this.f337e + ")";
    }
}

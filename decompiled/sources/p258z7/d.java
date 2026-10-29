package p258z7;

import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f30800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f30801c;

    public d(String title, c selectInfo, List list) {
        n.h(title, "title");
        n.h(selectInfo, "selectInfo");
        n.h(list, "list");
        this.f30799a = title;
        this.f30800b = selectInfo;
        this.f30801c = list;
    }

    public final List a() {
        return this.f30801c;
    }

    public final c b() {
        return this.f30800b;
    }

    public final String c() {
        return this.f30799a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return n.d(this.f30799a, dVar.f30799a) && n.d(this.f30800b, dVar.f30800b) && n.d(this.f30801c, dVar.f30801c);
    }

    public int hashCode() {
        return (((this.f30799a.hashCode() * 31) + this.f30800b.hashCode()) * 31) + this.f30801c.hashCode();
    }

    public String toString() {
        return "WidgetPreviewInfo(title=" + this.f30799a + ", selectInfo=" + this.f30800b + ", list=" + this.f30801c + ")";
    }
}

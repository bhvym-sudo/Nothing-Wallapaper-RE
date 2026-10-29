package p227w6;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f29663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f29664b;

    public d(c request, b image) {
        n.h(request, "request");
        n.h(image, "image");
        this.f29663a = request;
        this.f29664b = image;
    }

    public static /* synthetic */ d b(d dVar, c cVar, b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = dVar.f29663a;
        }
        if ((i10 & 2) != 0) {
            bVar = dVar.f29664b;
        }
        return dVar.a(cVar, bVar);
    }

    public final d a(c request, b image) {
        n.h(request, "request");
        n.h(image, "image");
        return new d(request, image);
    }

    public final b c() {
        return this.f29664b;
    }

    public final c d() {
        return this.f29663a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return n.d(this.f29663a, dVar.f29663a) && n.d(this.f29664b, dVar.f29664b);
    }

    public int hashCode() {
        return (this.f29663a.hashCode() * 31) + this.f29664b.hashCode();
    }

    public String toString() {
        return "Result(request=" + this.f29663a + ", image=" + this.f29664b + ")";
    }
}

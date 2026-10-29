package C6;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p227w6.c f644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f647d;

    public f(p227w6.c request, i bitmap, b requestFrom) {
        n.h(request, "request");
        n.h(bitmap, "bitmap");
        n.h(requestFrom, "requestFrom");
        this.f644a = request;
        this.f645b = bitmap;
        this.f646c = requestFrom;
        E6.a.C0050a c0050aB = request.b();
        n.e(c0050aB);
        this.f647d = c0050aB.b();
    }

    public final i a() {
        return this.f645b;
    }

    public final e b() {
        return this.f647d;
    }

    public final p227w6.c c() {
        return this.f644a;
    }

    public final b d() {
        return this.f646c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return n.d(this.f644a, fVar.f644a) && n.d(this.f645b, fVar.f645b) && n.d(this.f646c, fVar.f646c);
    }

    public int hashCode() {
        return (((this.f644a.hashCode() * 31) + this.f645b.hashCode()) * 31) + this.f646c.hashCode();
    }

    public String toString() {
        return "EffectCroppedBitmap(request=" + this.f644a + ", bitmap=" + this.f645b + ", requestFrom=" + this.f646c + ")";
    }
}

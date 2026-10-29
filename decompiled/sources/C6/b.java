package C6;

import com.nothing.wallpaper.effects.data.model.ViewScope;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewScope f628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f631d;

    public b(ViewScope viewScope, a type, d rect, i bitmap) {
        n.h(viewScope, "viewScope");
        n.h(type, "type");
        n.h(rect, "rect");
        n.h(bitmap, "bitmap");
        this.f628a = viewScope;
        this.f629b = type;
        this.f630c = rect;
        this.f631d = bitmap;
    }

    public final i a() {
        return this.f631d;
    }

    public final d b() {
        return this.f630c;
    }

    public final a c() {
        return this.f629b;
    }

    public final ViewScope d() {
        return this.f628a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.d(this.f628a, bVar.f628a) && this.f629b == bVar.f629b && n.d(this.f630c, bVar.f630c) && n.d(this.f631d, bVar.f631d);
    }

    public int hashCode() {
        return (((((this.f628a.hashCode() * 31) + this.f629b.hashCode()) * 31) + this.f630c.hashCode()) * 31) + this.f631d.hashCode();
    }

    public String toString() {
        return "CroppedBitmap(viewScope=" + this.f628a + ", type=" + this.f629b + ", rect=" + this.f630c + ", bitmap=" + this.f631d + "}])";
    }
}

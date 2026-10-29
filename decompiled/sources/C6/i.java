package C6;

import android.graphics.Bitmap;
import android.graphics.Point;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f653h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Point f654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Point f660g;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final i a(Bitmap bitmap) {
            n.h(bitmap, "bitmap");
            return new i(new Point(bitmap.getWidth(), bitmap.getHeight()), bitmap);
        }

        private a() {
        }
    }

    public i(Point end, Bitmap bitmap) {
        n.h(end, "end");
        n.h(bitmap, "bitmap");
        this.f654a = end;
        this.f655b = bitmap;
        boolean z9 = false;
        this.f656c = end.x == bitmap.getWidth() && end.y == bitmap.getHeight();
        if (end.x <= bitmap.getWidth() && end.y <= bitmap.getHeight() && end.x > 0 && end.y > 0) {
            z9 = true;
        }
        this.f657d = z9;
        this.f658e = end.x;
        this.f659f = end.y;
        this.f660g = p097j6.b.a(bitmap);
    }

    public final synchronized Bitmap a() {
        Bitmap bitmapCreateBitmap;
        try {
            if (!this.f657d || (this.f654a.x >= this.f655b.getWidth() && this.f654a.y >= this.f655b.getHeight())) {
                bitmapCreateBitmap = this.f655b;
            } else {
                Bitmap bitmap = this.f655b;
                Point point = this.f654a;
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, point.x, point.y);
                n.e(bitmapCreateBitmap);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapCreateBitmap;
    }

    public final Bitmap b() {
        return this.f655b;
    }

    public final Point c() {
        return this.f654a;
    }

    public final int d() {
        return this.f659f;
    }

    public final int e() {
        return this.f658e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return n.d(this.f654a, iVar.f654a) && n.d(this.f655b, iVar.f655b);
    }

    public final boolean f() {
        return this.f656c;
    }

    public final boolean g() {
        return this.f657d;
    }

    public int hashCode() {
        return (this.f654a.hashCode() * 31) + this.f655b.hashCode();
    }

    public String toString() {
        return "RegionBitmap(end=" + this.f654a + ", bitmap=" + p097j6.b.c(this.f655b) + ")";
    }
}

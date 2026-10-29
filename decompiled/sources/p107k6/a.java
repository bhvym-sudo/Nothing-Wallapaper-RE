package p107k6;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.Size;
import com.nothing.wallpaper.common.log.c;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p097j6.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0578a f22740p = new C0578a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Size f22741m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f22742n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final WeakHashMap f22743o;

    /* JADX INFO: renamed from: k6.a$a, reason: collision with other inner class name */
    public static final class C0578a {
        public /* synthetic */ C0578a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0578a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Size maxSize, int i10, String location) {
        super(location, i10);
        n.h(maxSize, "maxSize");
        n.h(location, "location");
        this.f22741m = maxSize;
        this.f22742n = "LargeSizeBitmapPool-" + location;
        this.f22743o = new WeakHashMap();
        c.d("LargeSizeBitmapPool", h() + " create a LargeSizeBitmapPool.");
    }

    @Override // p107k6.c, p107k6.e
    protected String h() {
        return this.f22742n;
    }

    @Override // p107k6.c
    public Bitmap p(int i10, int i11, Bitmap.Config config) {
        n.h(config, "config");
        int width = this.f22741m.getWidth();
        int height = this.f22741m.getHeight();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        Bitmap bitmapP = super.p(width, height, config2);
        b.b(bitmapP, i10, i11, config2);
        return bitmapP;
    }

    @Override // p107k6.c
    public void t(Bitmap bitmap) {
        n.h(bitmap, "bitmap");
        super.t(bitmap);
        synchronized (this.f22743o) {
            this.f22743o.put(bitmap, new Point(bitmap.getWidth(), bitmap.getHeight()));
            A a10 = A.f21846a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p107k6.c, p107k6.e
    /* JADX INFO: renamed from: w */
    public void l(Bitmap item) {
        n.h(item, "item");
        super.l(item);
        synchronized (this.f22743o) {
            try {
                Point point = (Point) this.f22743o.get(item);
                if (point == null) {
                    c.o("LargeSizeBitmapPool", h() + " recycle " + b.c(item) + " but didn't find it's original size.");
                    return;
                }
                if (item.getWidth() != point.x || item.getHeight() != point.y) {
                    c.d("LargeSizeBitmapPool", h() + " reconfigure " + b.c(item) + " to original size " + point + ".");
                    item.reconfigure(point.x, point.y, Bitmap.Config.ARGB_8888);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

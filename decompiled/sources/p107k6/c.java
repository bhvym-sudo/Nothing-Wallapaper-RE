package p107k6;

import android.graphics.Bitmap;
import com.nothing.cardwidget.battery.BatteryConfig;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p097j6.b;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public class c extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f22747l = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f22749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f22750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f22751k;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public c(String location, int i10) {
        n.h(location, "location");
        this.f22748h = location;
        this.f22749i = "SimpleBitmapPool-" + location;
        this.f22750j = BatteryConfig.DURATION_TASK_AWAITING;
        this.f22751k = i10;
    }

    public static /* synthetic */ Bitmap q(c cVar, int i10, int i11, Bitmap.Config config, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i12 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return cVar.p(i10, i11, config);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(int i10, int i11, Bitmap.Config config, Bitmap cache) {
        n.h(cache, "cache");
        return i10 == cache.getWidth() && i11 == cache.getHeight() && config == cache.getConfig();
    }

    @Override // p107k6.e
    public long f() {
        return this.f22750j;
    }

    @Override // p107k6.e
    public int g() {
        return this.f22751k;
    }

    @Override // p107k6.e
    protected String h() {
        return this.f22749i;
    }

    public Bitmap p(final int i10, final int i11, final Bitmap.Config config) {
        n.h(config, "config");
        Bitmap bitmap = (Bitmap) e(new l() { // from class: k6.b
            @Override // p219v8.l
            public final Object f(Object obj) {
                return Boolean.valueOf(c.r(i10, i11, config, (Bitmap) obj));
            }
        });
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, config);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        t(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p107k6.e
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean i(Bitmap item) {
        n.h(item, "item");
        return (item.isRecycled() || item.getConfig() == Bitmap.Config.HARDWARE || !item.isMutable()) ? false : true;
    }

    public void t(Bitmap bitmap) {
        n.h(bitmap, "bitmap");
        com.nothing.wallpaper.common.log.c.d("SimpleBitmapPool", h() + " onBitmapCreated " + b.c(bitmap));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p107k6.e
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void j(Bitmap t9) {
        n.h(t9, "t");
        super.j(t9);
        t9.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p107k6.e
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void k(Bitmap t9) {
        n.h(t9, "t");
        super.k(t9);
        t9.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p107k6.e
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void l(Bitmap item) {
        n.h(item, "item");
        super.l(item);
        item.eraseColor(0);
        com.nothing.wallpaper.common.log.c.d("SimpleBitmapPool", h() + " onRecycledLocked " + b.c(item));
    }
}

package p227w6;

import android.graphics.Bitmap;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.android.wallpaper.asset.a f29658a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.android.wallpaper.asset.a asset) {
            super(null);
            n.h(asset, "asset");
            this.f29658a = asset;
        }

        public final com.android.wallpaper.asset.a a() {
            return this.f29658a;
        }
    }

    /* JADX INFO: renamed from: w6.b$b, reason: collision with other inner class name */
    public static final class C0726b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f29659a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0726b(Bitmap bitmap) {
            super(null);
            n.h(bitmap, "bitmap");
            this.f29659a = bitmap;
        }

        public final Bitmap a() {
            return this.f29659a;
        }
    }

    public /* synthetic */ b(AbstractC1457h abstractC1457h) {
        this();
    }

    private b() {
    }
}

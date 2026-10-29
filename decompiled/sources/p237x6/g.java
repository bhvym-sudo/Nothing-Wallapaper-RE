package p237x6;

import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.net.Uri;
import com.android.wallpaper.asset.o;
import com.nothing.wallpaper.common.log.c;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p189s8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f30035k = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f30036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final WeakReference f30037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ExifInterface f30038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f30039j;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public g(String key, r cache) {
        n.h(key, "key");
        n.h(cache, "cache");
        this.f30036g = key;
        this.f30037h = new WeakReference(cache);
        this.f30039j = -1;
    }

    private final void R() {
        if (this.f30038i == null) {
            try {
                InputStream inputStreamO = O();
                try {
                    if (inputStreamO != null) {
                        this.f30038i = new ExifInterface(inputStreamO);
                    } else {
                        c.f("EffectAsset", "Stream is null when create exif for " + this.f30036g);
                    }
                    A a10 = A.f21846a;
                    b.a(inputStreamO, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        b.a(inputStreamO, th);
                        throw th2;
                    }
                }
            } catch (IOException e10) {
                c.g("EffectAsset", "Couldn't read stream when create exif for " + this.f30036g, e10);
            }
        }
    }

    private final int T() {
        R();
        ExifInterface exifInterface = this.f30038i;
        if (exifInterface != null) {
            return exifInterface.getAttributeInt("Orientation", 1);
        }
        c.f("EffectAsset", "Unable to read EXIF rotation for EffectAsset[" + this.f30036g + "]");
        return 1;
    }

    @Override // com.android.wallpaper.asset.o
    public int G() {
        int i10 = this.f30039j;
        if (i10 != -1) {
            return i10;
        }
        int iT = T();
        this.f30039j = iT;
        return iT;
    }

    @Override // com.android.wallpaper.asset.o
    public InputStream O() {
        r rVar = (r) this.f30037h.get();
        InputStream inputStreamW = rVar != null ? rVar.W(this.f30036g) : null;
        if (inputStreamW == null) {
            c.f("EffectAsset", "cache is been recycled, return null InputStream.");
        }
        return inputStreamW;
    }

    public final Uri S() {
        r rVar = (r) this.f30037h.get();
        if (rVar != null) {
            return rVar.Q0(this.f30036g);
        }
        return null;
    }

    @Override // com.android.wallpaper.asset.a
    protected void h(com.android.wallpaper.asset.a.d dVar, Bitmap bitmap) {
        if (dVar != null) {
            dVar.a(bitmap);
        }
    }
}

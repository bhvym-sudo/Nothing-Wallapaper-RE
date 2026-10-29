package p227w6;

import C6.e;
import C6.i;
import E6.b;
import G6.f;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.o;
import p107k6.c;
import p237x6.k;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0725a f29653e = new C0725a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f29654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f29655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f29656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile p107k6.a f29657d;

    /* JADX INFO: renamed from: w6.a$a, reason: collision with other inner class name */
    public static final class C0725a {
        public /* synthetic */ C0725a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0725a() {
        }
    }

    public a(List effectFactories, k effectAssetManager) {
        n.h(effectFactories, "effectFactories");
        n.h(effectAssetManager, "effectAssetManager");
        this.f29654a = effectFactories;
        this.f29655b = effectAssetManager;
        this.f29656c = new LinkedHashMap();
    }

    private final E6.a a(c cVar) {
        if (cVar.b() == null) {
            throw new IllegalArgumentException("can't build Effecter without Effect ID");
        }
        e eVarB = cVar.b().b();
        E6.a aVar = (E6.a) this.f29656c.get(eVarB);
        if (aVar != null) {
            return aVar;
        }
        Iterator it = this.f29654a.iterator();
        while (it.hasNext()) {
            E6.a aVarA = ((b) it.next()).a(eVarB);
            if (aVarA != null) {
                this.f29656c.put(eVarB, aVarA);
                return aVarA;
            }
        }
        throw new IllegalArgumentException("can't build Effecter for " + eVarB);
    }

    public final void b() {
        p107k6.a aVar = this.f29657d;
        if (aVar != null) {
            aVar.d();
        }
    }

    public final void c(c request, i originalBitmap, i effectBitmap) {
        n.h(request, "request");
        n.h(originalBitmap, "originalBitmap");
        n.h(effectBitmap, "effectBitmap");
        if (this.f29657d == null) {
            synchronized (this) {
                try {
                    if (this.f29657d == null) {
                        Point pointD = request.c().d();
                        if (pointD == null) {
                            throw new IllegalArgumentException("EffectApply need viewSize to init BitmapPool, but viewSize is null.");
                        }
                        this.f29657d = new p107k6.a(f.e(pointD), 2, "EffectApply");
                    }
                    A a10 = A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        p107k6.a aVar = this.f29657d;
        if (aVar == null) {
            return;
        }
        E6.a aVarA = a(request);
        if (request.b() == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        o oVarA = G6.b.a(originalBitmap, aVar);
        Bitmap bitmap = (Bitmap) oVarA.a();
        boolean zBooleanValue = ((Boolean) oVarA.b()).booleanValue();
        Bitmap bitmapQ = c.q(aVar, originalBitmap.e(), originalBitmap.d(), null, 4, null);
        try {
            aVarA.a(bitmap, bitmapQ, request.b());
            G6.b.b(bitmapQ, new Rect(0, 0, bitmapQ.getWidth(), bitmapQ.getHeight()), 1.0f, effectBitmap);
            if (zBooleanValue) {
                aVar.m(bitmap);
            }
            aVar.m(bitmapQ);
            com.nothing.wallpaper.common.log.c.d("EffectApply", "finish request " + request.a() + " and build the result success.");
        } catch (Throwable th2) {
            if (zBooleanValue) {
                aVar.m(bitmap);
            }
            aVar.m(bitmapQ);
            throw th2;
        }
    }
}

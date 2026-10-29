package p217v6;

import C6.e;
import C6.i;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.N;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f28531c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Point f28532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f28533b;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public b(Point previewSize) {
        n.h(previewSize, "previewSize");
        this.f28532a = previewSize;
        this.f28533b = new LinkedHashMap();
    }

    public final synchronized Map a(Map source) {
        LinkedHashMap linkedHashMap;
        try {
            n.h(source, "source");
            linkedHashMap = new LinkedHashMap(N.d(source.size()));
            for (Object obj : source.entrySet()) {
                Object key = ((Map.Entry) obj).getKey();
                Map.Entry entry = (Map.Entry) obj;
                Map map = this.f28533b;
                String strA = ((e) entry.getKey()).a();
                Object objCreateBitmap = map.get(strA);
                if (objCreateBitmap == null) {
                    Point point = this.f28532a;
                    objCreateBitmap = Bitmap.createBitmap(point.x, point.y, Bitmap.Config.ARGB_8888);
                    n.g(objCreateBitmap, "createBitmap(...)");
                    map.put(strA, objCreateBitmap);
                }
                i iVar = (i) entry.getValue();
                Bitmap bitmapB = iVar.b();
                Rect rect = new Rect(0, 0, iVar.c().x, iVar.c().y);
                Point point2 = this.f28532a;
                linkedHashMap.put(key, G6.b.f(bitmapB, rect, point2.x, point2.y, (Bitmap) objCreateBitmap));
            }
        } catch (Throwable th) {
            throw th;
        }
        return linkedHashMap;
    }
}

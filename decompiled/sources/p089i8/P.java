package p089i8;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.n;
import p079h8.o;
import p099j8.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class P extends O {
    public static Map b(Map builder) {
        n.h(builder, "builder");
        return ((d) builder).m();
    }

    public static Map c() {
        return new d();
    }

    public static int d(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        return i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    public static Map e(o pair) {
        n.h(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.c(), pair.d());
        n.g(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map f(Map map) {
        n.h(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        n.g(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}

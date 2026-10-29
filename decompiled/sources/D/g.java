package D;

import androidx.appcompat.app.o;
import java.util.LinkedHashMap;
import java.util.Map;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f694a = new LinkedHashMap();

    public final Map a() {
        return this.f694a;
    }

    public final A b(int i10, String str) {
        o.a(this.f694a.get(Integer.valueOf(i10)));
        return null;
    }
}

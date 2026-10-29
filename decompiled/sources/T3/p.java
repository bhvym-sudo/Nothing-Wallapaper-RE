package T3;

import android.database.Cursor;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class p implements B.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7669a;

    private p(Map map) {
        this.f7669a = map;
    }

    public static B.b a(Map map) {
        return new p(map);
    }

    @Override // T3.B.b
    public Object apply(Object obj) {
        return B.O0(this.f7669a, (Cursor) obj);
    }
}

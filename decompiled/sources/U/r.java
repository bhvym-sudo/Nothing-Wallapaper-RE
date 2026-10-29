package U;

import java.util.Map;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
public interface r extends h {
    static /* synthetic */ q j(r rVar, int i10, int i11, Map map, p219v8.l lVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = N.g();
        }
        return rVar.w(i10, i11, map, lVar);
    }

    q o(int i10, int i11, Map map, p219v8.l lVar, p219v8.l lVar2);

    default q w(int i10, int i11, Map map, p219v8.l lVar) {
        return o(i10, i11, map, null, lVar);
    }
}

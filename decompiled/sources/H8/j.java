package H8;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static final g a(int i10, a aVar, p219v8.l lVar) {
        if (i10 == -2) {
            return aVar == a.SUSPEND ? new e(g.f2619f.a(), lVar) : new q(1, aVar, lVar);
        }
        if (i10 == -1) {
            if (aVar == a.SUSPEND) {
                return new q(1, a.DROP_OLDEST, lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == 0) {
            return aVar == a.SUSPEND ? new e(0, lVar) : new q(1, aVar, lVar);
        }
        if (i10 != Integer.MAX_VALUE) {
            return aVar == a.SUSPEND ? new e(i10, lVar) : new q(i10, aVar, lVar);
        }
        return new e(SubsamplingScaleImageView.TILE_SIZE_AUTO, lVar);
    }

    public static /* synthetic */ g b(int i10, a aVar, p219v8.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return a(i10, aVar, lVar);
    }
}

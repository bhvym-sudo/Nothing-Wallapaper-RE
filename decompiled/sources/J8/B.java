package J8;

import I8.F;
import I8.O;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes2.dex */
final class B extends F implements O {
    public B(int i10) {
        super(1, SubsamplingScaleImageView.TILE_SIZE_AUTO, H8.a.DROP_OLDEST);
        h(Integer.valueOf(i10));
    }

    @Override // I8.O
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) O()).intValue());
        }
        return numValueOf;
    }

    public final boolean c0(int i10) {
        boolean zH;
        synchronized (this) {
            zH = h(Integer.valueOf(((Number) O()).intValue() + i10));
        }
        return zH;
    }
}

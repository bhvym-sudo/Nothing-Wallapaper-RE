package I8;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K8.D f3162a = new K8.D("NO_VALUE");

    public static final z a(int i10, int i11, H8.a aVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        }
        if (i10 > 0 || i11 > 0 || aVar == H8.a.SUSPEND) {
            int i12 = i11 + i10;
            if (i12 < 0) {
                i12 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            }
            return new F(i10, i12, aVar);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
    }

    public static /* synthetic */ z b(int i10, int i11, H8.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            aVar = H8.a.SUSPEND;
        }
        return a(i10, i11, aVar);
    }

    public static final InterfaceC0880f e(E e10, p129m8.i iVar, int i10, H8.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == H8.a.SUSPEND) ? e10 : new J8.h(e10, iVar, i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j9) {
        return objArr[((int) j9) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Object[] objArr, long j9, Object obj) {
        objArr[((int) j9) & (objArr.length - 1)] = obj;
    }
}

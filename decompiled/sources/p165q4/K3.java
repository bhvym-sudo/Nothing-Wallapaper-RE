package p165q4;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
abstract class K3 extends AbstractC1566l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f24260a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f24261b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f24262c;

    K3(int i10) {
    }

    private final void b(int i10) {
        Object[] objArr = this.f24260a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f24262c) {
                this.f24260a = (Object[]) objArr.clone();
                this.f24262c = false;
                return;
            }
            return;
        }
        int i11 = length + (length >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        if (i11 < 0) {
            i11 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        }
        this.f24260a = Arrays.copyOf(objArr, i11);
        this.f24262c = false;
    }

    public final K3 a(Object obj) {
        obj.getClass();
        b(this.f24261b + 1);
        Object[] objArr = this.f24260a;
        int i10 = this.f24261b;
        this.f24261b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}

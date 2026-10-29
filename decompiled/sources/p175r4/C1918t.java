package p175r4;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.Arrays;

/* JADX INFO: renamed from: r4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1918t extends AbstractC1879p {
    public C1918t() {
        super(4);
    }

    public final C1918t a(Object obj) {
        obj.getClass();
        int i10 = this.f26894b;
        int i11 = i10 + 1;
        Object[] objArr = this.f26893a;
        int length = objArr.length;
        if (length < i11) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i10);
                i12 = iHighestOneBit + iHighestOneBit;
            }
            if (i12 < 0) {
                i12 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            }
            this.f26893a = Arrays.copyOf(objArr, i12);
            this.f26895c = false;
        } else if (this.f26895c) {
            this.f26893a = (Object[]) objArr.clone();
            this.f26895c = false;
        }
        Object[] objArr2 = this.f26893a;
        int i13 = this.f26894b;
        this.f26894b = i13 + 1;
        objArr2[i13] = obj;
        return this;
    }

    public final AbstractC1948w b() {
        this.f26895c = true;
        return AbstractC1948w.j(this.f26893a, this.f26894b);
    }
}

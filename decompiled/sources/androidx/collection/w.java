package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC1029i {
    public /* synthetic */ w(int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final boolean e(int i10) {
        g(this.f11328b + 1);
        int[] iArr = this.f11327a;
        int i11 = this.f11328b;
        iArr[i11] = i10;
        this.f11328b = i11 + 1;
        return true;
    }

    public final boolean f(int i10, int[] elements) {
        int i11;
        kotlin.jvm.internal.n.h(elements, "elements");
        if (i10 < 0 || i10 > (i11 = this.f11328b)) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f11328b);
        }
        if (elements.length == 0) {
            return false;
        }
        g(i11 + elements.length);
        int[] iArr = this.f11327a;
        int i12 = this.f11328b;
        if (i10 != i12) {
            AbstractC1439m.f(iArr, iArr, elements.length + i10, i10, i12);
        }
        AbstractC1439m.k(elements, iArr, i10, 0, 0, 12, null);
        this.f11328b += elements.length;
        return true;
    }

    public final void g(int i10) {
        int[] iArr = this.f11327a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            kotlin.jvm.internal.n.g(iArrCopyOf, "copyOf(this, newSize)");
            this.f11327a = iArrCopyOf;
        }
    }

    public final void h(int[] elements) {
        kotlin.jvm.internal.n.h(elements, "elements");
        f(this.f11328b, elements);
    }

    public final int i(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f11328b)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index ");
            sb.append(i10);
            sb.append(" must be in 0..");
            sb.append(this.f11328b - 1);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int[] iArr = this.f11327a;
        int i12 = iArr[i10];
        if (i10 != i11 - 1) {
            AbstractC1439m.f(iArr, iArr, i10, i10 + 1, i11);
        }
        this.f11328b--;
        return i12;
    }

    public final int j(int i10, int i11) {
        if (i10 >= 0 && i10 < this.f11328b) {
            int[] iArr = this.f11327a;
            int i12 = iArr[i10];
            iArr[i10] = i11;
            return i12;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set index ");
        sb.append(i10);
        sb.append(" must be between 0 .. ");
        sb.append(this.f11328b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public w(int i10) {
        super(i10, null);
    }
}

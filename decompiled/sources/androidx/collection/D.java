package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class D extends J {
    public /* synthetic */ D(int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final boolean e(Object obj) {
        f(this.f11277b + 1);
        Object[] objArr = this.f11276a;
        int i10 = this.f11277b;
        objArr[i10] = obj;
        this.f11277b = i10 + 1;
        return true;
    }

    public final void f(int i10) {
        Object[] objArr = this.f11276a;
        if (objArr.length < i10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i10, (objArr.length * 3) / 2));
            kotlin.jvm.internal.n.g(objArrCopyOf, "copyOf(this, newSize)");
            this.f11276a = objArrCopyOf;
        }
    }

    public D(int i10) {
        super(i10, null);
    }
}

package R;

import Q.s;
import java.util.Arrays;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f6935b = new long[2];

    public final boolean a(long j9) {
        if (d(j9)) {
            return false;
        }
        k(this.f6934a, j9);
        return true;
    }

    public final boolean b(long j9) {
        return a(j9);
    }

    public final void c() {
        this.f6934a = 0;
    }

    public final boolean d(long j9) {
        int i10 = this.f6934a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f6935b[i11] == j9) {
                return true;
            }
        }
        return false;
    }

    public final long e(int i10) {
        return s.a(this.f6935b[i10]);
    }

    public final int f() {
        return this.f6934a;
    }

    public final boolean g() {
        return this.f6934a == 0;
    }

    public final boolean h(long j9) {
        int i10 = this.f6934a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (j9 == e(i11)) {
                j(i11);
                return true;
            }
        }
        return false;
    }

    public final boolean i(long j9) {
        return h(j9);
    }

    public final boolean j(int i10) {
        int i11 = this.f6934a;
        if (i10 >= i11) {
            return false;
        }
        int i12 = i11 - 1;
        while (i10 < i12) {
            long[] jArr = this.f6935b;
            int i13 = i10 + 1;
            jArr[i10] = jArr[i13];
            i10 = i13;
        }
        this.f6934a--;
        return true;
    }

    public final void k(int i10, long j9) {
        long[] jArr = this.f6935b;
        if (i10 >= jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10 + 1, jArr.length * 2));
            n.g(jArrCopyOf, "copyOf(this, newSize)");
            this.f6935b = jArrCopyOf;
        }
        this.f6935b[i10] = j9;
        if (i10 >= this.f6934a) {
            this.f6934a = i10 + 1;
        }
    }
}

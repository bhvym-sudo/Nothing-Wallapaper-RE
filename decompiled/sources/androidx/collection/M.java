package androidx.collection;

import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f11286a = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final E f11287b = new E(0);

    public static final void a(long[] metadata, int i10) {
        kotlin.jvm.internal.n.h(metadata, "metadata");
        int i11 = (i10 + 7) >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            long j9 = metadata[i12] & (-9187201950435737472L);
            metadata[i12] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
        }
        int iG = AbstractC1439m.G(metadata);
        int i13 = iG - 1;
        metadata[i13] = (metadata[i13] & 72057594037927935L) | (-72057594037927936L);
        metadata[iG] = metadata[0];
    }

    public static final int b(long[] metadata, int i10, int i11) {
        kotlin.jvm.internal.n.h(metadata, "metadata");
        while (i10 < i11) {
            if (((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 128) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int c(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return i10 - (i10 / 8);
    }

    public static final E d() {
        return new E(0, 1, null);
    }

    public static final int e(int i10) {
        if (i10 == 0) {
            return 6;
        }
        return (i10 * 2) + 1;
    }

    public static final int f(int i10) {
        if (i10 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i10);
        }
        return 0;
    }

    public static final int g(int i10) {
        if (i10 == 7) {
            return 8;
        }
        return i10 + ((i10 - 1) / 7);
    }
}

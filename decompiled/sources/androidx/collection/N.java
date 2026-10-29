package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1456g;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f11288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f11289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11291d;

    public class a implements Set, p229w8.a {
        public a() {
        }

        public int a() {
            return N.this.f11291d;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return N.this.a(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection elements) {
            kotlin.jvm.internal.n.h(elements, "elements");
            N n9 = N.this;
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                if (!n9.a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return N.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC1456g.a(this);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] array) {
            kotlin.jvm.internal.n.h(array, "array");
            return AbstractC1456g.b(this, array);
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.l {
        b() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence f(Object obj) {
            return obj == N.this ? "(this)" : String.valueOf(obj);
        }
    }

    public /* synthetic */ N(AbstractC1457h abstractC1457h) {
        this();
    }

    public static /* synthetic */ String g(N n9, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, p219v8.l lVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        p219v8.l lVar2 = lVar;
        return n9.f(charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public final boolean a(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f11290c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f11288a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j9 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.n.d(this.f11289b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int b() {
        return this.f11290c;
    }

    public final int c() {
        return this.f11291d;
    }

    public final boolean d() {
        return this.f11291d == 0;
    }

    public final boolean e() {
        return this.f11291d != 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n9 = (N) obj;
        if (n9.c() != c()) {
            return false;
        }
        Object[] objArr = this.f11289b;
        long[] jArr = this.f11288a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128 && !n9.a(objArr[(i10 << 3) + i12])) {
                            return false;
                        }
                        j9 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return true;
    }

    public final String f(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, p219v8.l lVar) {
        kotlin.jvm.internal.n.h(separator, "separator");
        kotlin.jvm.internal.n.h(prefix, "prefix");
        kotlin.jvm.internal.n.h(postfix, "postfix");
        kotlin.jvm.internal.n.h(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = this.f11289b;
        long[] jArr = this.f11288a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j9 = jArr[i11];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j9 & 255) < 128) {
                        Object obj = objArr[(i11 << 3) + i15];
                        if (i12 == i10) {
                            sb.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb.append(separator);
                        }
                        if (lVar == null) {
                            sb.append(obj);
                        } else {
                            sb.append((CharSequence) lVar.f(obj));
                        }
                        i12++;
                    }
                    j9 >>= i13;
                    i15++;
                    i13 = i13;
                }
                if (i14 == i13) {
                }
                sb.append(postfix);
                break;
            }
            if (i11 == length) {
                sb.append(postfix);
                break;
            }
            i11++;
        }
        String string = sb.toString();
        kotlin.jvm.internal.n.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public int hashCode() {
        Object[] objArr = this.f11289b;
        long[] jArr = this.f11288a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        Object obj = objArr[(i10 << 3) + i12];
                        iHashCode += obj != null ? obj.hashCode() : 0;
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public String toString() {
        return g(this, null, "[", "]", 0, null, new b(), 25, null);
    }

    private N() {
        this.f11288a = M.f11286a;
        this.f11289b = p150p.a.f23565c;
    }
}

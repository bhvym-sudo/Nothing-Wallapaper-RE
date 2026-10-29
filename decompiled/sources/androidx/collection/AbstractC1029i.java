package androidx.collection;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: androidx.collection.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1029i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f11327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11328b;

    public /* synthetic */ AbstractC1029i(int i10, AbstractC1457h abstractC1457h) {
        this(i10);
    }

    public static /* synthetic */ String d(AbstractC1029i abstractC1029i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return abstractC1029i.c(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final int a(int i10) {
        if (i10 >= 0 && i10 < this.f11328b) {
            return this.f11327a[i10];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i10);
        sb.append(" must be in 0..");
        sb.append(this.f11328b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int b() {
        return this.f11328b;
    }

    public final String c(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        kotlin.jvm.internal.n.h(separator, "separator");
        kotlin.jvm.internal.n.h(prefix, "prefix");
        kotlin.jvm.internal.n.h(postfix, "postfix");
        kotlin.jvm.internal.n.h(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.f11327a;
        int i11 = this.f11328b;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i12 == i10) {
                sb.append(truncated);
                String string = sb.toString();
                kotlin.jvm.internal.n.g(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i12 != 0) {
                sb.append(separator);
            }
            sb.append(i13);
        }
        sb.append(postfix);
        String string2 = sb.toString();
        kotlin.jvm.internal.n.g(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC1029i) {
            AbstractC1029i abstractC1029i = (AbstractC1029i) obj;
            int i10 = abstractC1029i.f11328b;
            int i11 = this.f11328b;
            if (i10 == i11) {
                int[] iArr = this.f11327a;
                int[] iArr2 = abstractC1029i.f11327a;
                B8.g gVarQ = B8.h.q(0, i11);
                int iG = gVarQ.g();
                int iM = gVarQ.m();
                if (iG > iM) {
                    return true;
                }
                while (iArr[iG] == iArr2[iG]) {
                    if (iG == iM) {
                        return true;
                    }
                    iG++;
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f11327a;
        int i10 = this.f11328b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Integer.hashCode(iArr[i11]) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return d(this, null, "[", "]", 0, null, 25, null);
    }

    private AbstractC1029i(int i10) {
        this.f11327a = i10 == 0 ? AbstractC1034n.a() : new int[i10];
    }
}

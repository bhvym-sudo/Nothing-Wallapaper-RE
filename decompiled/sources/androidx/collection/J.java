package androidx.collection;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f11276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11277b;

    static final class a extends kotlin.jvm.internal.o implements p219v8.l {
        a() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence f(Object obj) {
            return obj == J.this ? "(this)" : String.valueOf(obj);
        }
    }

    public /* synthetic */ J(int i10, AbstractC1457h abstractC1457h) {
        this(i10);
    }

    public static /* synthetic */ String d(J j9, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, p219v8.l lVar, int i11, Object obj) {
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
        return j9.c(charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public final boolean a(Object obj) {
        return b(obj) >= 0;
    }

    public final int b(Object obj) {
        int i10 = 0;
        if (obj == null) {
            Object[] objArr = this.f11276a;
            int i11 = this.f11277b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f11276a;
        int i12 = this.f11277b;
        while (i10 < i12) {
            if (obj.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final String c(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, p219v8.l lVar) {
        kotlin.jvm.internal.n.h(separator, "separator");
        kotlin.jvm.internal.n.h(prefix, "prefix");
        kotlin.jvm.internal.n.h(postfix, "postfix");
        kotlin.jvm.internal.n.h(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = this.f11276a;
        int i11 = this.f11277b;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i12];
            if (i12 == i10) {
                sb.append(truncated);
                String string = sb.toString();
                kotlin.jvm.internal.n.g(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i12 != 0) {
                sb.append(separator);
            }
            if (lVar == null) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) lVar.f(obj));
            }
        }
        sb.append(postfix);
        String string2 = sb.toString();
        kotlin.jvm.internal.n.g(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof J) {
            J j9 = (J) obj;
            int i10 = j9.f11277b;
            int i11 = this.f11277b;
            if (i10 == i11) {
                Object[] objArr = this.f11276a;
                Object[] objArr2 = j9.f11276a;
                B8.g gVarQ = B8.h.q(0, i11);
                int iG = gVarQ.g();
                int iM = gVarQ.m();
                if (iG > iM) {
                    return true;
                }
                while (kotlin.jvm.internal.n.d(objArr[iG], objArr2[iG])) {
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
        Object[] objArr = this.f11276a;
        int i10 = this.f11277b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return d(this, null, "[", "]", 0, null, new a(), 25, null);
    }

    private J(int i10) {
        this.f11276a = i10 == 0 ? K.f11279a : new Object[i10];
    }
}

package p041e0;

import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f19770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f19771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19772c;

    public c(int i10) {
        if (i10 == 0) {
            this.f19770a = a.f19758a;
            this.f19771b = a.f19759b;
        } else {
            this.f19770a = new int[i10];
            this.f19771b = new Object[i10 << 1];
        }
        this.f19772c = 0;
    }

    public final boolean a(Object obj) {
        return d(obj) >= 0;
    }

    public final Object b(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f19771b[(iD << 1) + 1];
        }
        return null;
    }

    protected final int c(Object obj, int i10) {
        int i11 = this.f19772c;
        if (i11 == 0) {
            return -1;
        }
        int iA = a.a(this.f19770a, i11, i10);
        if (iA < 0 || n.d(obj, this.f19771b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f19770a[i12] == i10) {
            if (n.d(obj, this.f19771b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f19770a[i13] == i10; i13--) {
            if (n.d(obj, this.f19771b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    protected final int e() {
        int i10 = this.f19772c;
        if (i10 == 0) {
            return -1;
        }
        int iA = a.a(this.f19770a, i10, 0);
        if (iA < 0 || this.f19771b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f19770a[i11] == 0) {
            if (this.f19771b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f19770a[i12] == 0; i12--) {
            if (this.f19771b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i10 = this.f19772c;
                if (i10 != cVar.f19772c) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objG = g(i11);
                    Object objH = h(i11);
                    Object objB = cVar.b(objG);
                    if (objH == null) {
                        if (objB != null || !cVar.a(objG)) {
                            return false;
                        }
                    } else if (!n.d(objH, objB)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f19772c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f19772c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objG2 = g(i13);
                Object objH2 = h(i13);
                Object obj2 = ((Map) obj).get(objG2);
                if (objH2 == null) {
                    if (obj2 != null || !((Map) obj).containsKey(objG2)) {
                        return false;
                    }
                } else if (!n.d(objH2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final boolean f() {
        return this.f19772c <= 0;
    }

    public final Object g(int i10) {
        return this.f19771b[i10 << 1];
    }

    public final Object h(int i10) {
        return this.f19771b[(i10 << 1) + 1];
    }

    public int hashCode() {
        int[] iArr = this.f19770a;
        Object[] objArr = this.f19771b;
        int i10 = this.f19772c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public String toString() {
        if (f()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f19772c * 28);
        sb.append('{');
        int i10 = this.f19772c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object objG = g(i11);
            if (objG != this) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objH = h(i11);
            if (objH != this) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ c(int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}

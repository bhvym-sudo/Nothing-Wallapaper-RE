package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f11299a = new Object();

    public static final Object c(Q q9, int i10) {
        Object obj;
        kotlin.jvm.internal.n.h(q9, "<this>");
        int iA = p150p.a.a(q9.f11296r, q9.f11298t, i10);
        if (iA < 0 || (obj = q9.f11297s[iA]) == f11299a) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Q q9) {
        int i10 = q9.f11298t;
        int[] iArr = q9.f11296r;
        Object[] objArr = q9.f11297s;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f11299a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        q9.f11295q = false;
        q9.f11298t = i11;
    }
}

package p155p4;

import java.util.Arrays;

/* JADX INFO: renamed from: p4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1473o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f23740a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f23741b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    C1472n f23742c;

    public final C1473o a(Object obj, Object obj2) {
        int i10 = this.f23741b + 1;
        Object[] objArr = this.f23740a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f23740a = Arrays.copyOf(objArr, AbstractC1467i.a(length, i11));
        }
        AbstractC1464f.a(obj, obj2);
        Object[] objArr2 = this.f23740a;
        int i12 = this.f23741b;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.f23741b = i12 + 1;
        return this;
    }

    public final AbstractC1474p b() {
        C1472n c1472n = this.f23742c;
        if (c1472n != null) {
            throw c1472n.a();
        }
        C1481x c1481xH = C1481x.h(this.f23741b, this.f23740a, this);
        C1472n c1472n2 = this.f23742c;
        if (c1472n2 == null) {
            return c1481xH;
        }
        throw c1472n2.a();
    }
}

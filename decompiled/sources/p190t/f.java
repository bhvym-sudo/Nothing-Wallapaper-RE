package p190t;

import androidx.collection.E;
import androidx.collection.F;
import androidx.collection.M;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f27859a = M.d();

    public final void a(Object obj, Object obj2) {
        E e10 = this.f27859a;
        int iK = e10.k(obj);
        boolean z9 = iK < 0;
        Object obj3 = z9 ? null : e10.f11283c[iK];
        if (obj3 != null) {
            if (obj3 instanceof F) {
                n.f(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((F) obj3).h(obj2);
            } else if (obj3 != obj2) {
                F f10 = new F(0, 1, null);
                n.f(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                f10.h(obj3);
                f10.h(obj2);
                obj2 = f10;
            }
            obj2 = obj3;
        }
        if (!z9) {
            e10.f11283c[iK] = obj2;
            return;
        }
        int i10 = ~iK;
        e10.f11282b[i10] = obj;
        e10.f11283c[i10] = obj2;
    }

    public final void b() {
        this.f27859a.h();
    }

    public final boolean c(Object obj) {
        return this.f27859a.a(obj);
    }

    public final E d() {
        return this.f27859a;
    }

    public final int e() {
        return this.f27859a.d();
    }

    public final boolean f(Object obj, Object obj2) {
        Object objB = this.f27859a.b(obj);
        if (objB == null) {
            return false;
        }
        if (!(objB instanceof F)) {
            if (!n.d(objB, obj2)) {
                return false;
            }
            this.f27859a.o(obj);
            return true;
        }
        F f10 = (F) objB;
        boolean zX = f10.x(obj2);
        if (zX && f10.d()) {
            this.f27859a.o(obj);
        }
        return zX;
    }

    public final void g(Object obj) {
        boolean zD;
        E e10 = this.f27859a;
        long[] jArr = e10.f11281a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = e10.f11282b[i13];
                        Object obj3 = e10.f11283c[i13];
                        if (obj3 instanceof F) {
                            n.f(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            F f10 = (F) obj3;
                            f10.x(obj);
                            zD = f10.d();
                        } else {
                            zD = obj3 == obj;
                        }
                        if (zD) {
                            e10.p(i13);
                        }
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void h(Object obj, Object obj2) {
        this.f27859a.r(obj, obj2);
    }
}

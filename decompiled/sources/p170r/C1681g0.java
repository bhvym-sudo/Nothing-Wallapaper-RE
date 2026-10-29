package p170r;

import androidx.collection.E;
import java.util.List;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: renamed from: r.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1681g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f25446a;

    private /* synthetic */ C1681g0(E e10) {
        this.f25446a = e10;
    }

    public static final /* synthetic */ C1681g0 a(E e10) {
        return new C1681g0(e10);
    }

    public static E b(E e10) {
        return e10;
    }

    public static boolean c(E e10, Object obj) {
        return (obj instanceof C1681g0) && n.d(e10, ((C1681g0) obj).h());
    }

    public static int d(E e10) {
        return e10.hashCode();
    }

    public static final Object e(E e10, Object obj) {
        Object objB = e10.b(obj);
        if (objB == null) {
            return null;
        }
        if (I.j(objB)) {
            List listB = I.b(objB);
            Object objRemove = listB.remove(0);
            if (listB.isEmpty()) {
                e10.o(obj);
            }
            objB = objRemove;
        } else {
            e10.o(obj);
        }
        n.f(objB, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
        return objB;
    }

    public static final void f(E e10, Object obj, Object obj2) {
        int iK = e10.k(obj);
        boolean z9 = iK < 0;
        Object obj3 = z9 ? null : e10.f11283c[iK];
        if (obj3 != null) {
            if (I.j(obj3)) {
                n.f(obj3, "null cannot be cast to non-null type kotlin.collections.MutableList<V of androidx.compose.runtime.MutableScatterMultiMap.put_impl$lambda$0>");
                List listB = I.b(obj3);
                listB.add(obj2);
                obj2 = listB;
            } else {
                obj2 = AbstractC1444s.p(obj3, obj2);
            }
        }
        if (!z9) {
            e10.f11283c[iK] = obj2;
            return;
        }
        int i10 = ~iK;
        e10.f11282b[i10] = obj;
        e10.f11283c[i10] = obj2;
    }

    public static String g(E e10) {
        return "MutableScatterMultiMap(map=" + e10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f25446a, obj);
    }

    public final /* synthetic */ E h() {
        return this.f25446a;
    }

    public int hashCode() {
        return d(this.f25446a);
    }

    public String toString() {
        return g(this.f25446a);
    }
}

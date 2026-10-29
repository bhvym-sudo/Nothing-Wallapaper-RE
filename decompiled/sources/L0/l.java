package L0;

import I8.InterfaceC0880f;
import I8.Q;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I8.A f4475a;

    public l() {
        H h10 = H.f4296b;
        kotlin.jvm.internal.n.f(h10, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f4475a = Q.a(h10);
    }

    public final D a() {
        return (D) this.f4475a.getValue();
    }

    public final InterfaceC0880f b() {
        return this.f4475a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public final D c(D newState) {
        Object value;
        D d10;
        kotlin.jvm.internal.n.h(newState, "newState");
        I8.A a10 = this.f4475a;
        do {
            value = a10.getValue();
            d10 = (D) value;
            if (d10 instanceof x ? true : kotlin.jvm.internal.n.d(d10, H.f4296b)) {
                d10 = newState;
            } else if (d10 instanceof C0929f) {
                if (newState.a() > d10.a()) {
                    d10 = newState;
                }
            } else if (!(d10 instanceof r)) {
                throw new p079h8.m();
            }
        } while (!a10.d(value, d10));
        return d10;
    }
}

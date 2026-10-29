package B0;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f331b;

    public g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f330a = new Object[i10];
    }

    private final boolean a(Object obj) {
        int i10 = this.f331b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f330a[i11] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // B0.f
    public Object acquire() {
        int i10 = this.f331b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f330a[i11];
        n.f(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f330a[i11] = null;
        this.f331b--;
        return obj;
    }

    @Override // B0.f
    public boolean release(Object instance) {
        n.h(instance, "instance");
        if (a(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.f331b;
        Object[] objArr = this.f330a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.f331b = i10 + 1;
        return true;
    }
}

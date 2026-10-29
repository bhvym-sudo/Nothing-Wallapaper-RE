package K8;

import F8.U0;

/* JADX INFO: loaded from: classes2.dex */
final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p129m8.i f4152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f4153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U0[] f4154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4155d;

    public O(p129m8.i iVar, int i10) {
        this.f4152a = iVar;
        this.f4153b = new Object[i10];
        this.f4154c = new U0[i10];
    }

    public final void a(U0 u9, Object obj) {
        Object[] objArr = this.f4153b;
        int i10 = this.f4155d;
        objArr[i10] = obj;
        U0[] u0Arr = this.f4154c;
        this.f4155d = i10 + 1;
        kotlin.jvm.internal.n.f(u9, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        u0Arr[i10] = u9;
    }

    public final void b(p129m8.i iVar) {
        int length = this.f4154c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            U0 u9 = this.f4154c[length];
            kotlin.jvm.internal.n.e(u9);
            u9.X0(iVar, this.f4153b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}

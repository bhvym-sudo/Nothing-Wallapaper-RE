package p218v7;

import I8.A;
import I8.AbstractC0882h;
import I8.O;
import I8.Q;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f28536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O f28537b;

    public b() {
        A a10 = Q.a(Boolean.FALSE);
        this.f28536a = a10;
        this.f28537b = AbstractC0882h.b(a10);
    }

    public final O a() {
        return this.f28537b;
    }

    public final void b(boolean z9) {
        this.f28536a.setValue(Boolean.valueOf(z9));
    }
}

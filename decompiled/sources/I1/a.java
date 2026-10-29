package I1;

import I8.A;
import I8.AbstractC0882h;
import I8.O;
import I8.Q;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f2821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O f2822b;

    public a() {
        A a10 = Q.a(Boolean.FALSE);
        this.f2821a = a10;
        this.f2822b = AbstractC0882h.b(a10);
    }

    public final O a() {
        return this.f2822b;
    }

    public final void b(boolean z9) {
        this.f2821a.setValue(Boolean.valueOf(z9));
    }
}

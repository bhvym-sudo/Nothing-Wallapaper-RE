package J1;

import I8.O;
import androidx.lifecycle.AbstractC1153m;
import androidx.lifecycle.C;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I1.a f3504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O f3505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C f3506c;

    public a(I1.a repository) {
        n.h(repository, "repository");
        this.f3504a = repository;
        this.f3505b = repository.a();
    }

    public final O a() {
        return this.f3505b;
    }

    public final C b() {
        C c10 = this.f3506c;
        if (c10 != null) {
            return c10;
        }
        C c11 = AbstractC1153m.c(this.f3505b, null, 0L, 3, null);
        this.f3506c = c11;
        return c11;
    }

    public final void c(boolean z9) {
        this.f3504a.b(z9);
    }
}

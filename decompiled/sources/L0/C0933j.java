package L0;

import F8.L;
import java.util.List;
import p089i8.AbstractC1444s;

/* JADX INFO: renamed from: L0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0933j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0933j f4324a = new C0933j();

    private C0933j() {
    }

    public final InterfaceC0932i a(E storage, M0.b bVar, List migrations, L scope) {
        kotlin.jvm.internal.n.h(storage, "storage");
        kotlin.jvm.internal.n.h(migrations, "migrations");
        kotlin.jvm.internal.n.h(scope, "scope");
        return new C0934k(storage, AbstractC1444s.e(AbstractC0931h.f4307a.b(migrations)), new M0.a(), scope);
    }
}

package N0;

import F8.C0803b0;
import F8.L;
import F8.M;
import F8.T0;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p089i8.AbstractC1444s;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: N0.a$a, reason: collision with other inner class name */
    public static final class C0188a extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final C0188a f5182r = new C0188a();

        C0188a() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List f(Context it) {
            n.h(it, "it");
            return AbstractC1444s.l();
        }
    }

    public static final p249y8.a a(String name, M0.b bVar, l produceMigrations, L scope) {
        n.h(name, "name");
        n.h(produceMigrations, "produceMigrations");
        n.h(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ p249y8.a b(String str, M0.b bVar, l lVar, L l9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar = C0188a.f5182r;
        }
        if ((i10 & 8) != 0) {
            l9 = M.a(C0803b0.b().z(T0.b(null, 1, null)));
        }
        return a(str, bVar, lVar, l9);
    }
}

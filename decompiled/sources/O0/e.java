package O0;

import F8.L;
import L0.C0933j;
import L0.E;
import L0.InterfaceC0932i;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f5742a = new e();

    static final class a extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f5743r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p219v8.a aVar) {
            super(0);
            this.f5743r = aVar;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) this.f5743r.invoke();
            if (n.d(p189s8.c.a(file), "preferences_pb")) {
                File absoluteFile = file.getAbsoluteFile();
                n.g(absoluteFile, "file.absoluteFile");
                return absoluteFile;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    private e() {
    }

    public final InterfaceC0932i a(E storage, M0.b bVar, List migrations, L scope) {
        n.h(storage, "storage");
        n.h(migrations, "migrations");
        n.h(scope, "scope");
        return new d(C0933j.f4324a.a(storage, bVar, migrations, scope));
    }

    public final InterfaceC0932i b(M0.b bVar, List migrations, L scope, p219v8.a produceFile) {
        n.h(migrations, "migrations");
        n.h(scope, "scope");
        n.h(produceFile, "produceFile");
        return new d(a(new L0.o(h.f5745a, null, new a(produceFile), 2, null), bVar, migrations, scope));
    }
}

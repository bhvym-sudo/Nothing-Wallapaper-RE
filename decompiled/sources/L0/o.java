package L0;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class o implements E {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f4484d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f4485e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f4486f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f4487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v8.l f4488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p219v8.a f4489c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f4490r = new a();

        a() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t f(File it) {
            kotlin.jvm.internal.n.h(it, "it");
            return v.a(it);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final Set a() {
            return o.f4485e;
        }

        public final Object b() {
            return o.f4486f;
        }

        private b() {
        }
    }

    static final class c extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ File f4491r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file) {
            super(0);
            this.f4491r = file;
        }

        public final void a() {
            b bVar = o.f4484d;
            Object objB = bVar.b();
            File file = this.f4491r;
            synchronized (objB) {
                bVar.a().remove(file.getAbsolutePath());
                p079h8.A a10 = p079h8.A.f21846a;
            }
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    public o(A serializer, p219v8.l coordinatorProducer, p219v8.a produceFile) {
        kotlin.jvm.internal.n.h(serializer, "serializer");
        kotlin.jvm.internal.n.h(coordinatorProducer, "coordinatorProducer");
        kotlin.jvm.internal.n.h(produceFile, "produceFile");
        this.f4487a = serializer;
        this.f4488b = coordinatorProducer;
        this.f4489c = produceFile;
    }

    @Override // L0.E
    public F a() throws IOException {
        File file = ((File) this.f4489c.invoke()).getCanonicalFile();
        synchronized (f4486f) {
            String path = file.getAbsolutePath();
            Set set = f4485e;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            kotlin.jvm.internal.n.g(path, "path");
            set.add(path);
        }
        kotlin.jvm.internal.n.g(file, "file");
        return new p(file, this.f4487a, (t) this.f4488b.f(file), new c(file));
    }

    public /* synthetic */ o(A a10, p219v8.l lVar, p219v8.a aVar, int i10, AbstractC1457h abstractC1457h) {
        this(a10, (i10 & 2) != 0 ? a.f4490r : lVar, aVar);
    }
}

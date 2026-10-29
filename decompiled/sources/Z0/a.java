package Z0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f9383a = new LinkedHashMap();

    /* JADX INFO: renamed from: Z0.a$a, reason: collision with other inner class name */
    public static final class C0345a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0345a f9384b = new C0345a();

        private C0345a() {
        }

        @Override // Z0.a
        public Object a(b key) {
            n.h(key, "key");
            return null;
        }
    }

    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.f9383a;
    }
}

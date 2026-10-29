package O0;

import java.util.Map;
import kotlin.jvm.internal.n;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f5744a;

        public a(String name) {
            n.h(name, "name");
            this.f5744a = name;
        }

        public final String a() {
            return this.f5744a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return n.d(this.f5744a, ((a) obj).f5744a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5744a.hashCode();
        }

        public String toString() {
            return this.f5744a;
        }
    }

    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final c c() {
        return new c(N.r(a()), false);
    }

    public final f d() {
        return new c(N.r(a()), true);
    }
}

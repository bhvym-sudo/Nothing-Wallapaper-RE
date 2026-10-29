package W8;

import P8.u;
import e9.g;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0312a f8897c = new C0312a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f8898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f8899b;

    /* JADX INFO: renamed from: W8.a$a, reason: collision with other inner class name */
    public static final class C0312a {
        public /* synthetic */ C0312a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0312a() {
        }
    }

    public a(g source) {
        n.h(source, "source");
        this.f8898a = source;
        this.f8899b = 262144L;
    }

    public final u a() {
        u.a aVar = new u.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.f();
            }
            aVar.c(strB);
        }
    }

    public final String b() {
        String strO = this.f8898a.O(this.f8899b);
        this.f8899b -= (long) strO.length();
        return strO;
    }
}

package p158p7;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23768a;

    /* JADX INFO: renamed from: p7.a$a, reason: collision with other inner class name */
    public static final class C0628a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0628a f23769b = new C0628a();

        private C0628a() {
            super("New", null);
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f23770b = new b();

        private b() {
            super("NewLock", null);
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0629a f23771b = new C0629a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final c f23772c = new c("Lock");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final c f23773d = new c("Home");

        /* JADX INFO: renamed from: p7.a$c$a, reason: collision with other inner class name */
        public static final class C0629a {
            public /* synthetic */ C0629a(AbstractC1457h abstractC1457h) {
                this();
            }

            public final c a() {
                return c.f23773d;
            }

            public final c b() {
                return c.f23772c;
            }

            private C0629a() {
            }
        }

        private c(String str) {
            super(str, null);
        }
    }

    public /* synthetic */ a(String str, AbstractC1457h abstractC1457h) {
        this(str);
    }

    public String toString() {
        return this.f23768a;
    }

    private a(String str) {
        this.f23768a = str;
    }
}

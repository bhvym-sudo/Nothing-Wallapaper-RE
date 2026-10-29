package W;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements e0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f8548r = new b(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f8549s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final p219v8.l f8550t = a.f8552r;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Y f8551q;

    static final class a extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f8552r = new a();

        a() {
            super(1);
        }

        public final void a(a0 a0Var) {
            if (a0Var.g()) {
                a0Var.b().A();
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((a0) obj);
            return p079h8.A.f21846a;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final p219v8.l a() {
            return a0.f8550t;
        }

        private b() {
        }
    }

    public a0(Y y9) {
        this.f8551q = y9;
    }

    public final Y b() {
        return this.f8551q;
    }

    @Override // W.e0
    public boolean g() {
        return this.f8551q.z().Q();
    }
}

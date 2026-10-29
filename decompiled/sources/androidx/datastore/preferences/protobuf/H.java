package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class H implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final O f12399b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f12400a;

    class a implements O {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public N a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public boolean b(Class cls) {
            return false;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12401a;

        static {
            int[] iArr = new int[a0.values().length];
            f12401a = iArr;
            try {
                iArr[a0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class c implements O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private O[] f12402a;

        c(O... oArr) {
            this.f12402a = oArr;
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public N a(Class cls) {
            for (O o9 : this.f12402a) {
                if (o9.b(cls)) {
                    return o9.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public boolean b(Class cls) {
            for (O o9 : this.f12402a) {
                if (o9.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public H() {
        this(c());
    }

    private static boolean b(N n9) {
        return b.f12401a[n9.c().ordinal()] != 1;
    }

    private static O c() {
        return new c(C1111v.c(), d());
    }

    private static O d() {
        if (b0.f12446d) {
            return f12399b;
        }
        try {
            return (O) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f12399b;
        }
    }

    private static f0 e(Class cls, N n9) {
        if (f(cls)) {
            return T.N(cls, n9, X.b(), F.b(), h0.K(), b(n9) ? r.b() : null, M.b());
        }
        V vA = X.a();
        AbstractC1106p abstractC1106pA = null;
        D dA = F.a();
        m0 m0VarJ = h0.J();
        if (b(n9)) {
            abstractC1106pA = r.a();
        }
        return T.N(cls, n9, vA, dA, m0VarJ, abstractC1106pA, M.a());
    }

    private static boolean f(Class cls) {
        return b0.f12446d || AbstractC1112w.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public f0 a(Class cls) {
        h0.G(cls);
        N nA = this.f12400a.a(cls);
        if (nA.a()) {
            return f(cls) ? U.l(h0.K(), r.b(), nA.b()) : U.l(h0.J(), r.a(), nA.b());
        }
        return e(cls, nA);
    }

    private H(O o9) {
        this.f12400a = (O) AbstractC1114y.b(o9, "messageInfoFactory");
    }
}

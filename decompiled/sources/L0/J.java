package L0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class J implements m8.i.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f4298s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f4299t = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final J f4300q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C0934k f4301r;

    public static final class a {

        /* JADX INFO: renamed from: L0.J$a$a, reason: collision with other inner class name */
        public static final class C0145a implements m8.i.c {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final C0145a f4302q = new C0145a();

            private C0145a() {
            }
        }

        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public J(J j9, C0934k instance) {
        kotlin.jvm.internal.n.h(instance, "instance");
        this.f4300q = j9;
        this.f4301r = instance;
    }

    @Override // p129m8.i
    public Object U0(Object obj, p219v8.p pVar) {
        return m8.i.b.a.a(this, obj, pVar);
    }

    @Override // m8.i.b, p129m8.i
    public m8.i.b b(m8.i.c cVar) {
        return m8.i.b.a.b(this, cVar);
    }

    public final void c(InterfaceC0932i candidate) {
        kotlin.jvm.internal.n.h(candidate, "candidate");
        if (this.f4301r == candidate) {
            throw new IllegalStateException(f4299t.toString());
        }
        J j9 = this.f4300q;
        if (j9 != null) {
            j9.c(candidate);
        }
    }

    @Override // m8.i.b
    public m8.i.c getKey() {
        return a.C0145a.f4302q;
    }

    @Override // p129m8.i
    public p129m8.i t0(m8.i.c cVar) {
        return m8.i.b.a.c(this, cVar);
    }

    @Override // p129m8.i
    public p129m8.i z(p129m8.i iVar) {
        return m8.i.b.a.d(this, iVar);
    }
}

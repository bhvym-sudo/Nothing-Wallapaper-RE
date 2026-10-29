package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
class o0 extends m0 {
    o0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.m0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public n0 g(Object obj) {
        return ((AbstractC1112w) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.m0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(n0 n0Var) {
        return n0Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.m0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(n0 n0Var) {
        return n0Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.m0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public n0 k(n0 n0Var, n0 n0Var2) {
        if (n0.c().equals(n0Var2)) {
            return n0Var;
        }
        return n0.c().equals(n0Var) ? n0.j(n0Var, n0Var2) : n0Var.i(n0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.m0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public n0 n() {
        return n0.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.m0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, n0 n0Var) {
        p(obj, n0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.m0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, n0 n0Var) {
        ((AbstractC1112w) obj).unknownFields = n0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.m0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public n0 r(n0 n0Var) {
        n0Var.h();
        return n0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.m0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(n0 n0Var, s0 s0Var) {
        n0Var.p(s0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.m0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(n0 n0Var, s0 s0Var) {
        n0Var.r(s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    void j(Object obj) {
        g(obj).h();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    boolean q(e0 e0Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.m0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(n0 n0Var, int i10, int i11) {
        n0Var.n(r0.c(i10, 5), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.m0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(n0 n0Var, int i10, long j9) {
        n0Var.n(r0.c(i10, 1), Long.valueOf(j9));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.m0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(n0 n0Var, int i10, n0 n0Var2) {
        n0Var.n(r0.c(i10, 3), n0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.m0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(n0 n0Var, int i10, AbstractC1097g abstractC1097g) {
        n0Var.n(r0.c(i10, 2), abstractC1097g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.m0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(n0 n0Var, int i10, long j9) {
        n0Var.n(r0.c(i10, 0), Long.valueOf(j9));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.m0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public n0 f(Object obj) {
        n0 n0VarG = g(obj);
        if (n0VarG != n0.c()) {
            return n0VarG;
        }
        n0 n0VarK = n0.k();
        p(obj, n0VarK);
        return n0VarK;
    }
}

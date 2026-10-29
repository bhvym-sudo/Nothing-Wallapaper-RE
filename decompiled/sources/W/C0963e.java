package W;

/* JADX INFO: renamed from: W.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0963e implements androidx.compose.ui.focus.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0963e f8572a = new C0963e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f8573b;

    private C0963e() {
    }

    public final boolean b() {
        return f8573b != null;
    }

    public final void c() {
        f8573b = null;
    }

    @Override // androidx.compose.ui.focus.f
    public boolean i() {
        Boolean bool = f8573b;
        if (bool != null) {
            return bool.booleanValue();
        }
        T.a.c("canFocus is read before it is written");
        throw new p079h8.f();
    }

    @Override // androidx.compose.ui.focus.f
    public void o(boolean z9) {
        f8573b = Boolean.valueOf(z9);
    }
}

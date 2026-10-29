package W;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p111l0.d f8315a = p111l0.f.b(1.0f, 0.0f, 2, null);

    public static final d0 b(B b10) {
        d0 d0VarX = b10.X();
        if (d0VarX != null) {
            return d0VarX;
        }
        T.a.c("LayoutNode should be attached to an owner");
        throw new p079h8.f();
    }
}

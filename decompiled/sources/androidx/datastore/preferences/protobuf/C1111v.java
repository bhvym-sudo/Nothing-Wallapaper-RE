package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1111v implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1111v f12684a = new C1111v();

    private C1111v() {
    }

    public static C1111v c() {
        return f12684a;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public N a(Class cls) {
        if (!AbstractC1112w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (N) AbstractC1112w.t(cls.asSubclass(AbstractC1112w.class)).i();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public boolean b(Class cls) {
        return AbstractC1112w.class.isAssignableFrom(cls);
    }
}

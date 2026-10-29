package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b0 f12445c = new b0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f12446d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f12448b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f12447a = new H();

    private b0() {
    }

    public static b0 a() {
        return f12445c;
    }

    public f0 b(Class cls, f0 f0Var) {
        AbstractC1114y.b(cls, "messageType");
        AbstractC1114y.b(f0Var, "schema");
        return (f0) this.f12448b.putIfAbsent(cls, f0Var);
    }

    public f0 c(Class cls) {
        f0 f0VarB;
        AbstractC1114y.b(cls, "messageType");
        f0 f0VarA = (f0) this.f12448b.get(cls);
        return (f0VarA != null || (f0VarB = b(cls, (f0VarA = this.f12447a.a(cls)))) == null) ? f0VarA : f0VarB;
    }

    public f0 d(Object obj) {
        return c(obj.getClass());
    }
}

package p175r4;

import U4.d;
import V4.b;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: r4.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1830k0 implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d f26764d = new d() { // from class: r4.j0
        @Override // U4.d
        public final void a(Object obj, Object obj2) {
            int i10 = C1830k0.f26765e;
            throw new U4.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f26765e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f26766a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f26767b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f26768c = f26764d;

    @Override // V4.b
    public final /* bridge */ /* synthetic */ b a(Class cls, d dVar) {
        this.f26766a.put(cls, dVar);
        this.f26767b.remove(cls);
        return this;
    }

    public final C1840l0 b() {
        return new C1840l0(new HashMap(this.f26766a), new HashMap(this.f26767b), this.f26768c);
    }
}

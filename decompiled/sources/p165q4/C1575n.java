package p165q4;

import U4.d;
import V4.b;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: q4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1575n implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d f24665d = new d() { // from class: q4.m
        @Override // U4.d
        public final void a(Object obj, Object obj2) {
            int i10 = C1575n.f24666e;
            throw new U4.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f24666e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f24667a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f24668b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f24669c = f24665d;

    @Override // V4.b
    public final /* bridge */ /* synthetic */ b a(Class cls, d dVar) {
        this.f24667a.put(cls, dVar);
        this.f24668b.remove(cls);
        return this;
    }

    public final C1582o b() {
        return new C1582o(new HashMap(this.f24667a), new HashMap(this.f24668b), this.f24669c);
    }
}

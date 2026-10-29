package p129m8;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public interface f extends i.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f23250l = b.f23251q;

    public static final class a {
        public static i.b a(f fVar, i.c key) {
            i.b bVarB;
            n.h(key, "key");
            if (!(key instanceof p129m8.b)) {
                if (f.f23250l != key) {
                    return null;
                }
                n.f(fVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return fVar;
            }
            p129m8.b bVar = (p129m8.b) key;
            if (!bVar.a(fVar.getKey()) || (bVarB = bVar.b(fVar)) == null) {
                return null;
            }
            return bVarB;
        }

        public static i b(f fVar, i.c key) {
            n.h(key, "key");
            if (!(key instanceof p129m8.b)) {
                return f.f23250l == key ? j.f23252q : fVar;
            }
            p129m8.b bVar = (p129m8.b) key;
            return (!bVar.a(fVar.getKey()) || bVar.b(fVar) == null) ? fVar : j.f23252q;
        }
    }

    public static final class b implements i.c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final /* synthetic */ b f23251q = new b();

        private b() {
        }
    }

    e U(e eVar);

    void Y(e eVar);
}

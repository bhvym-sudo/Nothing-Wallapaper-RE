package C;

import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public interface f extends m8.i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f461a = b.f462q;

    public static final class a {
        public static Object a(f fVar, Object obj, p pVar) {
            return m8.i.b.a.a(fVar, obj, pVar);
        }

        public static m8.i.b b(f fVar, m8.i.c cVar) {
            return m8.i.b.a.b(fVar, cVar);
        }

        public static p129m8.i c(f fVar, m8.i.c cVar) {
            return m8.i.b.a.c(fVar, cVar);
        }

        public static p129m8.i d(f fVar, p129m8.i iVar) {
            return m8.i.b.a.d(fVar, iVar);
        }
    }

    public static final class b implements m8.i.c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final /* synthetic */ b f462q = new b();

        private b() {
        }
    }

    @Override // m8.i.b
    default m8.i.c getKey() {
        return f461a;
    }
}

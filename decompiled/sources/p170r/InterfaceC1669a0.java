package p170r;

import p129m8.e;
import p129m8.i;
import p219v8.l;
import p219v8.p;

/* JADX INFO: renamed from: r.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1669a0 extends i.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f25429n = b.f25430q;

    /* JADX INFO: renamed from: r.a0$a */
    public static final class a {
        public static Object a(InterfaceC1669a0 interfaceC1669a0, Object obj, p pVar) {
            return i.b.a.a(interfaceC1669a0, obj, pVar);
        }

        public static i.b b(InterfaceC1669a0 interfaceC1669a0, i.c cVar) {
            return i.b.a.b(interfaceC1669a0, cVar);
        }

        public static i c(InterfaceC1669a0 interfaceC1669a0, i.c cVar) {
            return i.b.a.c(interfaceC1669a0, cVar);
        }

        public static i d(InterfaceC1669a0 interfaceC1669a0, i iVar) {
            return i.b.a.d(interfaceC1669a0, iVar);
        }
    }

    /* JADX INFO: renamed from: r.a0$b */
    public static final class b implements i.c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final /* synthetic */ b f25430q = new b();

        private b() {
        }
    }

    @Override // m8.i.b
    default i.c getKey() {
        return f25429n;
    }

    Object u(l lVar, e eVar);
}

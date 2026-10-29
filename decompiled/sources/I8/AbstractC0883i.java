package I8;

/* JADX INFO: renamed from: I8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC0883i {

    /* JADX INFO: renamed from: I8.i$a */
    public static final class a implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Object f3228q;

        public a(Object obj) {
            this.f3228q = obj;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objB = interfaceC0881g.b(this.f3228q, eVar);
            return objB == p139n8.b.e() ? objB : p079h8.A.f21846a;
        }
    }

    public static final InterfaceC0880f a(p219v8.p pVar) {
        return new C0876b(pVar, null, 0, null, 14, null);
    }

    public static final InterfaceC0880f b() {
        return C0879e.f3227q;
    }

    public static final InterfaceC0880f c(p219v8.p pVar) {
        return new D(pVar);
    }

    public static final InterfaceC0880f d(Object obj) {
        return new a(obj);
    }
}

package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C {
    public static final Object a(Object obj, p129m8.e eVar) {
        if (!(obj instanceof A)) {
            return p079h8.q.b(obj);
        }
        h8.q.a aVar = p079h8.q.f21862r;
        return p079h8.q.b(p079h8.r.a(((A) obj).f1787a));
    }

    public static final Object b(Object obj) {
        Throwable thD = p079h8.q.d(obj);
        return thD == null ? obj : new A(thD, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC0822l interfaceC0822l) {
        Throwable thD = p079h8.q.d(obj);
        return thD == null ? obj : new A(thD, false, 2, null);
    }
}

package I8;

/* JADX INFO: renamed from: I8.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC0891q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p219v8.l f3258a = new p219v8.l() { // from class: I8.o
        @Override // p219v8.l
        public final Object f(Object obj) {
            return AbstractC0891q.d(obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v8.p f3259b = new p219v8.p() { // from class: I8.p
        @Override // p219v8.p
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC0891q.c(obj, obj2));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Object obj, Object obj2) {
        return kotlin.jvm.internal.n.d(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }

    public static final InterfaceC0880f e(InterfaceC0880f interfaceC0880f) {
        return interfaceC0880f instanceof O ? interfaceC0880f : g(interfaceC0880f, f3258a, f3259b);
    }

    public static final InterfaceC0880f f(InterfaceC0880f interfaceC0880f, p219v8.l lVar) {
        return g(interfaceC0880f, lVar, f3259b);
    }

    private static final InterfaceC0880f g(InterfaceC0880f interfaceC0880f, p219v8.l lVar, p219v8.p pVar) {
        if (interfaceC0880f instanceof C0878d) {
            C0878d c0878d = (C0878d) interfaceC0880f;
            if (c0878d.f3219r == lVar && c0878d.f3220s == pVar) {
                return interfaceC0880f;
            }
        }
        return new C0878d(interfaceC0880f, lVar, pVar);
    }
}

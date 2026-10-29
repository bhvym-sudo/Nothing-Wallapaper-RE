package p250z;

import kotlin.jvm.internal.o;
import p219v8.l;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e f30569a = a(a.f30570r, b.f30571r);

    static final class a extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f30570r = new a();

        a() {
            super(2);
        }

        public final Object a(g gVar, Object obj) {
            return obj;
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            androidx.appcompat.app.o.a(obj);
            return a(null, obj2);
        }
    }

    static final class b extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f30571r = new b();

        b() {
            super(1);
        }

        @Override // p219v8.l
        public final Object f(Object obj) {
            return obj;
        }
    }

    public static final class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f30572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f30573b;

        c(p pVar, l lVar) {
            this.f30572a = pVar;
            this.f30573b = lVar;
        }

        @Override // p250z.e
        public Object a(g gVar, Object obj) {
            return this.f30572a.invoke(gVar, obj);
        }

        @Override // p250z.e
        public Object b(Object obj) {
            return this.f30573b.f(obj);
        }
    }

    public static final e a(p pVar, l lVar) {
        return new c(pVar, lVar);
    }
}

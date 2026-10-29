package g9;

import P8.E;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: g9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1359b extends h.a {

    /* JADX INFO: renamed from: g9.b$a */
    static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f21367a = new a();

        a() {
        }

        @Override // g9.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E a(E e10) {
            try {
                return C.a(e10);
            } finally {
                e10.close();
            }
        }
    }

    /* JADX INFO: renamed from: g9.b$b, reason: collision with other inner class name */
    static final class C0542b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0542b f21368a = new C0542b();

        C0542b() {
        }

        @Override // g9.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public P8.C a(P8.C c10) {
            return c10;
        }
    }

    /* JADX INFO: renamed from: g9.b$c */
    static final class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f21369a = new c();

        c() {
        }

        @Override // g9.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E a(E e10) {
            return e10;
        }
    }

    /* JADX INFO: renamed from: g9.b$d */
    static final class d implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f21370a = new d();

        d() {
        }

        @Override // g9.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    /* JADX INFO: renamed from: g9.b$e */
    static final class e implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f21371a = new e();

        e() {
        }

        @Override // g9.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p079h8.A a(E e10) {
            e10.close();
            return p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: g9.b$f */
    static final class f implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f21372a = new f();

        f() {
        }

        @Override // g9.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(E e10) {
            e10.close();
            return null;
        }
    }

    C1359b() {
    }

    @Override // g9.h.a
    public h c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        if (P8.C.class.isAssignableFrom(C.h(type))) {
            return C0542b.f21368a;
        }
        return null;
    }

    @Override // g9.h.a
    public h d(Type type, Annotation[] annotationArr, y yVar) {
        if (type == E.class) {
            return C.l(annotationArr, i9.w.class) ? c.f21369a : a.f21367a;
        }
        if (type == Void.class) {
            return f.f21372a;
        }
        if (C.m(type)) {
            return e.f21371a;
        }
        return null;
    }
}

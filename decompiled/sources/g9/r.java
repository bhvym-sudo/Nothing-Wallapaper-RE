package g9;

import P8.E;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends h.a {

    static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f21438a;

        a(h hVar) {
            this.f21438a = hVar;
        }

        @Override // g9.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional a(E e10) {
            return Optional.ofNullable(this.f21438a.a(e10));
        }
    }

    r() {
    }

    @Override // g9.h.a
    public h d(Type type, Annotation[] annotationArr, y yVar) {
        if (h.a.b(type) != Optional.class) {
            return null;
        }
        return new a(yVar.h(h.a.a(0, (ParameterizedType) type), annotationArr));
    }
}

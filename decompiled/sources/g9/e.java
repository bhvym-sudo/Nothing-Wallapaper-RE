package g9;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public interface e {

    public static abstract class a {
        protected static Type b(int i10, ParameterizedType parameterizedType) {
            return C.g(i10, parameterizedType);
        }

        protected static Class c(Type type) {
            return C.h(type);
        }

        public abstract e a(Type type, Annotation[] annotationArr, y yVar);
    }

    Type a();

    Object b(d dVar);
}

package g9;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public interface h {

    public static abstract class a {
        protected static Type a(int i10, ParameterizedType parameterizedType) {
            return C.g(i10, parameterizedType);
        }

        protected static Class b(Type type) {
            return C.h(type);
        }

        public h c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
            return null;
        }

        public abstract h d(Type type, Annotation[] annotationArr, y yVar);

        public h e(Type type, Annotation[] annotationArr, y yVar) {
            return null;
        }
    }

    Object a(Object obj);
}

package g9;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: loaded from: classes2.dex */
class u {

    static final class a extends u {
        a() {
        }

        @Override // g9.u
        Object b(Method method, Class cls, Object obj, Object[] objArr) {
            return l.a(method, cls, obj, objArr);
        }

        @Override // g9.u
        boolean c(Method method) {
            return method.isDefault();
        }
    }

    static class b extends u {
        b() {
        }

        @Override // g9.u
        String a(Method method, int i10) {
            Parameter parameter = method.getParameters()[i10];
            if (!parameter.isNamePresent()) {
                return super.a(method, i10);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // g9.u
        Object b(Method method, Class cls, Object obj, Object[] objArr) {
            return l.a(method, cls, obj, objArr);
        }

        @Override // g9.u
        boolean c(Method method) {
            return method.isDefault();
        }
    }

    u() {
    }

    String a(Method method, int i10) {
        return "parameter #" + (i10 + 1);
    }

    Object b(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    boolean c(Method method) {
        return false;
    }
}

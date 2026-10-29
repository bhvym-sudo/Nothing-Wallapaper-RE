package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f13359a = AbstractC1444s.n(Application.class, Q.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f13360b = AbstractC1444s.e(Q.class);

    public static final Constructor c(Class modelClass, List signature) {
        kotlin.jvm.internal.n.h(modelClass, "modelClass");
        kotlin.jvm.internal.n.h(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        kotlin.jvm.internal.n.g(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.n.g(parameterTypes, "constructor.parameterTypes");
            List listY = AbstractC1439m.Y(parameterTypes);
            if (kotlin.jvm.internal.n.d(signature, listY)) {
                kotlin.jvm.internal.n.f(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == listY.size() && listY.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final a0 d(Class modelClass, Constructor constructor, Object... params) {
        kotlin.jvm.internal.n.h(modelClass, "modelClass");
        kotlin.jvm.internal.n.h(constructor, "constructor");
        kotlin.jvm.internal.n.h(params, "params");
        try {
            return (a0) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e12.getCause());
        }
    }
}

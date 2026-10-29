package p002a1;

import androidx.lifecycle.a0;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f9596a = new d();

    private d() {
    }

    public final a0 a(Class modelClass) throws InvocationTargetException {
        n.h(modelClass, "modelClass");
        try {
            Object objNewInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            n.g(objNewInstance, "{\n            modelClass…).newInstance()\n        }");
            return (a0) objNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
        }
    }
}

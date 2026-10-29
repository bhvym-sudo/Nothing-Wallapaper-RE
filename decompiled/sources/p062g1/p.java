package p062g1;

import E8.i;
import android.content.Context;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f21064a = new p();

    private p() {
    }

    public static final q.a a(Context context, Class klass, String str) {
        n.h(context, "context");
        n.h(klass, "klass");
        if (str == null || i.f0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new q.a(context, klass, str);
    }

    public static final Object b(Class klass, String suffix) {
        String str;
        n.h(klass, "klass");
        n.h(suffix, "suffix");
        Package r9 = klass.getPackage();
        n.e(r9);
        String fullPackage = r9.getName();
        String canonicalName = klass.getCanonicalName();
        n.e(canonicalName);
        n.g(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            n.g(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = i.H(canonicalName, '.', '_', false, 4, null) + suffix;
        try {
            if (fullPackage.length() == 0) {
                str = str2;
            } else {
                str = fullPackage + '.' + str2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            n.f(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName());
        }
    }
}

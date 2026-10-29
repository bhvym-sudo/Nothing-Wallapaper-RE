package p079h8;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.n;
import p159p8.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static void a(Throwable th, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        n.h(th, "<this>");
        n.h(exception, "exception");
        if (th != exception) {
            b.f23791a.a(th, exception);
        }
    }
}

package Z0;

import androidx.lifecycle.a0;
import androidx.lifecycle.d0;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final a0 a(d0.c factory, C8.c modelClass, a extras) {
        n.h(factory, "factory");
        n.h(modelClass, "modelClass");
        n.h(extras, "extras");
        try {
            try {
                return factory.b(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return factory.a(p209u8.a.a(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return factory.c(p209u8.a.a(modelClass), extras);
        }
    }
}

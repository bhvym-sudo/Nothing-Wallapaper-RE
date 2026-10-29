package p089i8;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.n;
import p099j8.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class V {
    public static Set a(Set builder) {
        n.h(builder, "builder");
        return ((h) builder).b();
    }

    public static Set b() {
        return new h();
    }

    public static Set c(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        n.g(setSingleton, "singleton(...)");
        return setSingleton;
    }
}

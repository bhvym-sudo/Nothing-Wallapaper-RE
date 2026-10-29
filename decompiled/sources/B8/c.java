package B8;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public interface c {

    public static final class a {
        public static boolean a(c cVar, Comparable value) {
            n.h(value, "value");
            return value.compareTo(cVar.a()) >= 0 && value.compareTo(cVar.f()) <= 0;
        }

        public static boolean b(c cVar) {
            return cVar.a().compareTo(cVar.f()) > 0;
        }
    }

    Comparable a();

    boolean b(Comparable comparable);

    Comparable f();
}

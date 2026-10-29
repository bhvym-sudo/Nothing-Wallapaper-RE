package M2;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    public static class a {
        public static String a(Class cls) {
            N2.c cVar = (N2.c) cls.getDeclaredAnnotation(N2.c.class);
            if (cVar == null) {
                throw new RuntimeException(cls + " doesn't provide an interface");
            }
            if (!TextUtils.isEmpty(cVar.action())) {
                return cVar.action();
            }
            throw new RuntimeException(cls + " doesn't provide an action");
        }
    }

    void a(c cVar, Class cls, boolean z9);
}

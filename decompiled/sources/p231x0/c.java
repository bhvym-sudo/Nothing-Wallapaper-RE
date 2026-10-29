package p231x0;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    static class a {
        static Object a(Bundle bundle, String str, Class cls) {
            return bundle.getParcelable(str, cls);
        }
    }

    public static Object a(Bundle bundle, String str, Class cls) {
        return a.a(bundle, str, cls);
    }
}
